package net.emv;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;

public class LocalDateTypeAdapter extends XmlAdapter<String, LocalDate> {
    @Override
    public LocalDate unmarshal(String s) {
        // TODO check for null and other
        return LocalDate.parse(s);
    }

    @Override
    public String marshal(LocalDate localDate) {
        // TODO check for null and other
        return localDate.toString();
    }
}
