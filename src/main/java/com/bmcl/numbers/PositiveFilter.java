package com.bmcl.numbers;

import org.bmcl.numbers.GenericListFilter;

public class PositiveFilter implements GenericListFilter {
    @Override
    public boolean accept(Integer number) {
        return number > 0;
    }
}