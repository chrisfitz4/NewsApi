package com.illicitintelligence.android.topnews.adapter

import com.illicitintelligence.android.topnews.util.parseDate
import org.junit.Assert.*
import org.junit.Test

class NewsRVAdapterTest{

    @Test
    fun testAdapterDateParseMethod(){
        assertEquals("1:2:3","1:2:3T321".parseDate())
        assertEquals("1:2:3","1:2:3".parseDate())
        assertEquals("","".parseDate())
        assertEquals("","".parseDate())
    }
}