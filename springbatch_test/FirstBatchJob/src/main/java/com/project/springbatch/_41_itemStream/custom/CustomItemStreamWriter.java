package com.project.springbatch._41_itemStream.custom;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamWriter;

import java.util.List;

public class CustomItemStreamWriter implements ItemStreamWriter<String> {

    @Override
    public void write(List<? extends String> items) throws Exception {
        items.forEach(System.out::println);
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        System.out.println("CustomItemStreamWriter.open");
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        System.out.println("CustomItemStreamWriter.update");
    }

    @Override
    public void close() throws ItemStreamException {
        System.out.println("CustomItemStreamWriter.close");
    }
}
