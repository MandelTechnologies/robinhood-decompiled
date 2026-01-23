package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes17.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> clazz);

    MessageInfo messageInfoFor(Class<?> clazz);
}
