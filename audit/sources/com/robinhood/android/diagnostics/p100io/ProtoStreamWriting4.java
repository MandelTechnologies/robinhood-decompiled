package com.robinhood.android.diagnostics.p100io;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: ProtoStreamWriting.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0006\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b*\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¨\u0006\u000b"}, m3636d2 = {"protoStreamWriter", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "E", "", "Lokio/BufferedSink;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "messageStreamWriter", "Lcom/squareup/wire/Message;", "bytesAdapter", "Lokio/ByteString;", "lib-diagnostics_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.io.ProtoStreamWritingKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class ProtoStreamWriting4 {
    public static final <E> ProtoStreamWriting2<E> protoStreamWriter(BufferedSink bufferedSink, ProtoAdapter<? super E> adapter) {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new ProtoStreamWriting5(bufferedSink, adapter);
    }

    public static /* synthetic */ ProtoStreamWriting2 messageStreamWriter$default(BufferedSink bufferedSink, ProtoAdapter protoAdapter, int i, Object obj) {
        if ((i & 1) != 0) {
            protoAdapter = ProtoAdapter.BYTES;
        }
        return messageStreamWriter(bufferedSink, protoAdapter);
    }

    public static final <E extends Message<?, ?>> ProtoStreamWriting2<E> messageStreamWriter(BufferedSink bufferedSink, ProtoAdapter<ByteString> bytesAdapter) {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        return new ProtoStreamWriting(protoStreamWriter(bufferedSink, bytesAdapter), new Function1() { // from class: com.robinhood.android.diagnostics.io.ProtoStreamWritingKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProtoStreamWriting4.messageStreamWriter$lambda$0((Message) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter messageStreamWriter$lambda$0(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ProtoAdapter protoAdapterAdapter = message.adapter();
        Intrinsics.checkNotNull(protoAdapterAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<in E of com.robinhood.android.diagnostics.io.ProtoStreamWritingKt.messageStreamWriter>");
        return protoAdapterAdapter;
    }
}
