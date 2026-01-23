package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes27.dex */
public class MapEntryLite<K, V> {

    static class Metadata<K, V> {
    }

    Metadata<K, V> getMetadata() {
        return null;
    }

    static <K, V> void writeTo(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k, V v) throws IOException {
        throw null;
    }

    static <K, V> int computeSerializedSize(Metadata<K, V> metadata, K k, V v) {
        throw null;
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(null, k, v));
    }
}
