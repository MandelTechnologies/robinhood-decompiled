package com.twilio.twilsock.client;

import com.twilio.twilsock.util.ConnectivityMonitor;
import com.twilio.twilsock.util.ConnectivityMonitorAndroid;
import com.twilio.util.CoroutineContextAndroid;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Supervisor3;

/* compiled from: TwilsockFactory.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a¾\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2p\b\u0002\u0010\u0010\u001aj\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011j\u0004\u0018\u0001`\u001b¨\u0006\u001c"}, m3636d2 = {"TwilsockFactory", "Lcom/twilio/twilsock/client/Twilsock;", "url", "", "useProxy", "", "authData", "Lcom/twilio/twilsock/client/AuthData;", "clientMetadata", "Lcom/twilio/twilsock/client/ClientMetadata;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "continuationTokenStorage", "Lcom/twilio/twilsock/client/ContinuationTokenStorage;", "connectivityMonitor", "Lcom/twilio/twilsock/util/ConnectivityMonitor;", "twilsockTransportFactory", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "Lkotlin/time/Duration;", "connectTimeout", "", "certificates", "Lcom/twilio/twilsock/client/TwilsockTransportListener;", "listener", "Lcom/twilio/twilsock/client/TwilsockTransport;", "Lcom/twilio/twilsock/client/TwilsockTransportFactory;", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.client.TwilsockFactoryKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockFactory {
    public static /* synthetic */ Twilsock TwilsockFactory$default(String str, boolean z, AuthData authData, ClientMetadata clientMetadata, CoroutineScope coroutineScope, ContinuationTokenStorage continuationTokenStorage, ConnectivityMonitor connectivityMonitor, Function4 function4, int i, Object obj) {
        Function4 function42;
        String str2;
        AuthData authData2;
        boolean z2 = (i & 2) != 0 ? false : z;
        ClientMetadata clientMetadata2 = (i & 8) != 0 ? new ClientMetadata((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null) : clientMetadata;
        CoroutineScope CoroutineScope = (i & 16) != 0 ? CoroutineScope2.CoroutineScope(CoroutineContextAndroid.newSingleThreadCoroutineContext("TwilsockCoroutineContext").plus(Supervisor3.SupervisorJob$default(null, 1, null))) : coroutineScope;
        ContinuationTokenStorage continuationTokenStorage2 = (i & 32) != 0 ? null : continuationTokenStorage;
        ConnectivityMonitor connectivityMonitor2 = (i & 64) != 0 ? null : connectivityMonitor;
        if ((i & 128) != 0) {
            function42 = null;
            authData2 = authData;
            str2 = str;
        } else {
            function42 = function4;
            str2 = str;
            authData2 = authData;
        }
        return TwilsockFactory(str2, z2, authData2, clientMetadata2, CoroutineScope, continuationTokenStorage2, connectivityMonitor2, function42);
    }

    public static final Twilsock TwilsockFactory(String url, boolean z, AuthData authData, ClientMetadata clientMetadata, CoroutineScope coroutineScope, ContinuationTokenStorage continuationTokenStorage, ConnectivityMonitor connectivityMonitor, Function4<? super CoroutineScope, ? super Duration, ? super List<String>, ? super TwilsockTransport7, TwilsockTransport> function4) {
        Function4<? super CoroutineScope, ? super Duration, ? super List<String>, ? super TwilsockTransport7, TwilsockTransport> function42;
        String str;
        boolean z2;
        AuthData authData2;
        ClientMetadata clientMetadata2;
        CoroutineScope coroutineScope2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(authData, "authData");
        Intrinsics.checkNotNullParameter(clientMetadata, "clientMetadata");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        ContinuationTokenStorage continuationTokenStorage2 = continuationTokenStorage == null ? new ContinuationTokenStorage2() : continuationTokenStorage;
        ConnectivityMonitor connectivityMonitorAndroid = connectivityMonitor == null ? new ConnectivityMonitorAndroid(coroutineScope) : connectivityMonitor;
        if (function4 == null) {
            function42 = C434641.INSTANCE;
            str = url;
            authData2 = authData;
            clientMetadata2 = clientMetadata;
            coroutineScope2 = coroutineScope;
            z2 = z;
        } else {
            function42 = function4;
            str = url;
            z2 = z;
            authData2 = authData;
            clientMetadata2 = clientMetadata;
            coroutineScope2 = coroutineScope;
        }
        return new TwilsockImpl(coroutineScope2, str, z2, authData2, clientMetadata2, continuationTokenStorage2, connectivityMonitorAndroid, function42);
    }

    /* compiled from: TwilsockFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockFactoryKt$TwilsockFactory$1 */
    /* synthetic */ class C434641 extends FunctionReferenceImpl implements Function4<CoroutineScope, Duration, List<? extends String>, TwilsockTransport7, TwilsockTransport> {
        public static final C434641 INSTANCE = new C434641();

        C434641() {
            super(4, TwilsockTransport6.class, "TwilsockTransportFactory", "TwilsockTransportFactory-dWUq8MI(Lkotlinx/coroutines/CoroutineScope;JLjava/util/List;Lcom/twilio/twilsock/client/TwilsockTransportListener;)Lcom/twilio/twilsock/client/TwilsockTransport;", 1);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ TwilsockTransport invoke(CoroutineScope coroutineScope, Duration duration, List<? extends String> list, TwilsockTransport7 twilsockTransport7) {
            return m27205invokedWUq8MI(coroutineScope, duration.getRawValue(), list, twilsockTransport7);
        }

        /* renamed from: invoke-dWUq8MI, reason: not valid java name */
        public final TwilsockTransport m27205invokedWUq8MI(CoroutineScope p0, long j, List<String> p2, TwilsockTransport7 p3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            return TwilsockTransport6.m27221TwilsockTransportFactorydWUq8MI(p0, j, p2, p3);
        }
    }
}
