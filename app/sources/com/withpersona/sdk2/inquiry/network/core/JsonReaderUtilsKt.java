package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonReader;

/* loaded from: classes18.dex */
public final class JsonReaderUtilsKt {
    public static final String nextStringOrNull(JsonReader jsonReader) {
        return jsonReader.peek() != JsonReader.Token.NULL ? jsonReader.nextString() : (String) jsonReader.nextNull();
    }
}
