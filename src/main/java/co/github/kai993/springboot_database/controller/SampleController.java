package co.github.kai993.springboot_database.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.github.kai993.springboot_database.model.Tbl1Dto;
import co.github.kai993.springboot_database.service.Tbl1Service;

@RestController
@RequestMapping("/api/data")
public class SampleController {
    private final Tbl1Service service;

    public SampleController(Tbl1Service service) {
        this.service = service;
    }

    /**
     * サンプルデータを取得するエンドポイント
     * @return サンプルメッセージを文字列として返します。
     */
    @GetMapping
    public List<Tbl1Dto> getData() {
        return service.getAllData();
    }

    // Add more endpoints as needed
}
