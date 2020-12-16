package io.pragra.learning.framwork.data;

import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.List;

public class HomeProvider {

    @DataProvider(name = "demoProvider")
    public Iterator<Object []> getRequestDemoData() {
        List<Object[]> requestDemo = ExcelReader.getDataFromSheet("RequestDemo", true);
        return requestDemo.listIterator();
    }

    @DataProvider
    public Iterator<Object []> funFactProvider() {
        List<Object[]> requestDemo = ExcelReader.getDataFromSheet("FunFacts", true);
        return requestDemo.listIterator();
    }
}
