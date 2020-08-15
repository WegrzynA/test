//package com.mstow.demo1.rsareports;
//
//import com.mstow.demo1.rsareports.result.*;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class ResponseBuilderTest {
//
//    @Autowired
//    ProductRepository productRepository;
//
//    @Autowired
//    PharmacyRepository pharmacyRepository;
//
//    @Autowired
//    NetworkRepository networkRepository;
//
//    @Autowired
//    ReportMonthRepository reportMonthRepository;
//
//    @Test
//    public void testBuildSimpleResponse() {
//        LocalDate date = LocalDate.of(2020, 5, 23);
//        Product product = productRepository.save(new Product().name("product"));
//        Network network = networkRepository.save(new Network().name("network"));
//        Pharmacy pharmacy = pharmacyRepository.save(new Pharmacy().name("pharmacy").network(network));
//        ReportMonth reportMonth = reportMonthRepository.save(new ReportMonth().pharmacy(pharmacy)
//                .product(product)
//                .date(date)
//                .buy(BigDecimal.ONE)
//                .buyv(BigDecimal.ONE)
//                .sell(BigDecimal.ONE)
//                .sellv(BigDecimal.ONE)
//                .stock(BigDecimal.ONE)
//                .stockv(BigDecimal.ONE));
//
//        List<NetworkKey> networkKeys = Arrays.asList(new NetworkKey().id(network.getId()).name(network.getName()));
//        MonthValue monthValue = new MonthValue().date(date).amount(BigDecimal.ONE).value(BigDecimal.ONE);
//        List<MonthValue> buy = Arrays.asList(monthValue);
//        List<MonthValue> sell = Arrays.asList(monthValue);
//        List<MonthValue> stock = Arrays.asList(monthValue);
//        List<NetworkValue> networkValues = Arrays.asList(new NetworkValue().buy(buy).sell(sell).stock(stock));
//        Total total = new Total().buyAmount(BigDecimal.ONE)
//                .buyValue(BigDecimal.ONE)
//                .sellAmount(BigDecimal.ONE)
//                .sellValue(BigDecimal.ONE)
//                .stockAmount(BigDecimal.ONE)
//                .stockValue(BigDecimal.ONE);
//        List<ProductRow> productRows = Arrays.asList(new ProductRow().networkValues(networkValues).total(total));
//        Response expectedResponse = new Response().networkKeys(networkKeys).productRows(productRows);
//
//        ResponseBuilder responseBuilder = new ResponseBuilder();
//        Response response = responseBuilder.build(Arrays.asList(reportMonth));
//
//        assertEquals(expectedResponse, response);
//    }
//}