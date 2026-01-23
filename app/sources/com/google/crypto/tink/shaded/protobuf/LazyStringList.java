package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes27.dex */
public interface LazyStringList extends List {
    void add(ByteString byteString);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
