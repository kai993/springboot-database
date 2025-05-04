package co.github.kai993.springboot_database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    /**
     * サンプルデータを取得するエンドポイント
     * @return サンプルメッセージを文字列として返します。
     */
    @GetMapping("/api/data")
    public String getData() {
        return "Hello, this is a sample endpoint!";
    }

    // Add more endpoints as needed
}
