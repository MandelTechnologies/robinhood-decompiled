package com.twilio.twilsock.client;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TwilsockTransport.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*Ê\u0001\u0010\u0000\"b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\r2b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m3636d2 = {"TwilsockTransportFactory", "Lcom/twilio/twilsock/client/TwilsockTransport;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "connectTimeout", "Lkotlin/time/Duration;", "certificates", "", "", "listener", "Lcom/twilio/twilsock/client/TwilsockTransportListener;", "TwilsockTransportFactory-dWUq8MI", "(Lkotlinx/coroutines/CoroutineScope;JLjava/util/List;Lcom/twilio/twilsock/client/TwilsockTransportListener;)Lcom/twilio/twilsock/client/TwilsockTransport;", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.client.TwilsockTransportKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockTransport6 {
    /* renamed from: TwilsockTransportFactory-dWUq8MI, reason: not valid java name */
    public static final TwilsockTransport m27221TwilsockTransportFactorydWUq8MI(CoroutineScope coroutineScope, long j, List<String> certificates, TwilsockTransport7 listener) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new TwilsockTransport(coroutineScope, j, certificates, listener, null);
    }
}
