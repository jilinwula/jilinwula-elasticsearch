package com.jilinwula.elasticsearch;

import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.DicAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElasticsearchApplicationTests {

    @Test
    public void test() {
        RestClient restClient = RestClient.builder(
                new HttpHost("127.0.0.1", 9200, "http")
        ).build();
    }

    @Test
    void contextLoads() {
    }

}
