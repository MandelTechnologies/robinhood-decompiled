package com.squareup.wire.internal;

import com.squareup.wire.GrpcResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.GzipSink;
import okio.GzipSource;
import okio.Sink;
import okio.Source;

/* compiled from: platform.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0080\b\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\"\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m3636d2 = {"toWireCall", "Lcom/squareup/wire/internal/Call;", "Lokhttp3/Call;", "asGzip", "Lokio/Sink;", "Lokio/Source;", "addSuppressed", "", "", "other", "AddSuppressedMethod", "Ljava/lang/reflect/Method;", "getAddSuppressedMethod", "()Ljava/lang/reflect/Method;", "AddSuppressedMethod$delegate", "Lkotlin/Lazy;", "wire-grpc-client"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.squareup.wire.internal.PlatformKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class platform2 {
    private static final Lazy AddSuppressedMethod$delegate = LazyKt.lazy(new Function0() { // from class: com.squareup.wire.internal.PlatformKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return platform2.AddSuppressedMethod_delegate$lambda$0();
        }
    });

    public static final platform toWireCall(final okhttp3.Call call) {
        Intrinsics.checkNotNullParameter(call, "<this>");
        return new platform() { // from class: com.squareup.wire.internal.PlatformKt.toWireCall.1
            @Override // com.squareup.wire.internal.platform
            public void cancel() {
                call.cancel();
            }

            @Override // com.squareup.wire.internal.platform
            public GrpcResponse execute() {
                return new GrpcResponse(call.execute());
            }
        };
    }

    public static final void addSuppressed(Throwable th, Throwable other) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Method addSuppressedMethod = getAddSuppressedMethod();
        if (addSuppressedMethod != null) {
            addSuppressedMethod.invoke(th, other);
        }
    }

    private static final Method getAddSuppressedMethod() {
        return (Method) AddSuppressedMethod$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method AddSuppressedMethod_delegate$lambda$0() {
        try {
            return Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Sink asGzip(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new GzipSink(sink);
    }

    public static final Source asGzip(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new GzipSource(source);
    }
}
