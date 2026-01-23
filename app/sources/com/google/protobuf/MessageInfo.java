package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes17.dex */
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
