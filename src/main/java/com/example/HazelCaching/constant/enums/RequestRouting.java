package com.example.HazelCaching.constant.enums;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access= AccessLevel.PRIVATE)
public final class RequestRouting {

    public static final String HOME="/";


    @NoArgsConstructor(access= AccessLevel.PRIVATE)
    public static final class Cache{
        public static final String ROUTE="/cache";

        public static final String SAVE=ROUTE+"/save";

        public static final String GET=ROUTE+"/get";

    }
}
