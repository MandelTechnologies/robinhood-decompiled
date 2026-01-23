package com.twilio.twilsock.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.twilio.twilsock.util.ConnectivityMonitorAndroid;
import com.twilio.twilsock.util.ConnectivityMonitorAndroid.ConnectionStatusCallback;
import com.twilio.util.ApplicationContextHolder;
import com.twilio.util.TwilioLogger3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConnectivityMonitorAndroid.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016R\u001f\u0010\u0005\u001a\u00060\u0006R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, m3636d2 = {"Lcom/twilio/twilsock/util/ConnectivityMonitorImpl;", "Lcom/twilio/twilsock/util/ConnectivityMonitor;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "connectionStatusCallback", "Lcom/twilio/twilsock/util/ConnectivityMonitorImpl$ConnectionStatusCallback;", "getConnectionStatusCallback", "()Lcom/twilio/twilsock/util/ConnectivityMonitorImpl$ConnectionStatusCallback;", "connectionStatusCallback$delegate", "Lkotlin/Lazy;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<set-?>", "", "isNetworkAvailable", "()Z", "setNetworkAvailable", "(Z)V", "isNetworkAvailable$delegate", "Lkotlin/properties/ReadWriteProperty;", "onChanged", "Lkotlin/Function0;", "", "getOnChanged", "()Lkotlin/jvm/functions/Function0;", "setOnChanged", "(Lkotlin/jvm/functions/Function0;)V", "initNetworkAvailable", "start", "stop", "ConnectionStatusCallback", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.util.ConnectivityMonitorImpl, reason: use source file name */
/* loaded from: classes12.dex */
public final class ConnectivityMonitorAndroid implements ConnectivityMonitor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConnectivityMonitorAndroid.class, "isNetworkAvailable", "isNetworkAvailable()Z", 0))};

    /* renamed from: connectionStatusCallback$delegate, reason: from kotlin metadata */
    private final Lazy connectionStatusCallback;
    private final ConnectivityManager connectivityManager;
    private final CoroutineScope coroutineScope;

    /* renamed from: isNetworkAvailable$delegate, reason: from kotlin metadata */
    private final Interfaces3 isNetworkAvailable;
    private Function0<Unit> onChanged;

    public ConnectivityMonitorAndroid(CoroutineScope coroutineScope) {
        ConnectivityManager connectivityManager;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        try {
            Object systemService = ApplicationContextHolder.getApplicationContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
        } catch (Throwable th) {
            TwilioLogger3.getLogger(this).m3202w("Cannot get ConnectivityManager, considering network as always available", th);
            connectivityManager = null;
        }
        this.connectivityManager = connectivityManager;
        Delegates delegates = Delegates.INSTANCE;
        final Boolean boolValueOf = Boolean.valueOf(initNetworkAvailable());
        this.isNetworkAvailable = new ObservableProperty<Boolean>(boolValueOf) { // from class: com.twilio.twilsock.util.ConnectivityMonitorImpl$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (oldValue.booleanValue() != newValue.booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new ConnectivityMonitorAndroid4(this, null), 3, null);
                }
            }
        };
        this.onChanged = new Function0<Unit>() { // from class: com.twilio.twilsock.util.ConnectivityMonitorImpl$onChanged$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.connectionStatusCallback = LazyKt.lazy(new Function0<ConnectionStatusCallback>() { // from class: com.twilio.twilsock.util.ConnectivityMonitorImpl$connectionStatusCallback$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ConnectivityMonitorAndroid.ConnectionStatusCallback invoke() {
                return this.this$0.new ConnectionStatusCallback();
            }
        });
    }

    @Override // com.twilio.twilsock.util.ConnectivityMonitor
    public boolean isNetworkAvailable() {
        return ((Boolean) this.isNetworkAvailable.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public void setNetworkAvailable(boolean z) {
        this.isNetworkAvailable.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // com.twilio.twilsock.util.ConnectivityMonitor
    public Function0<Unit> getOnChanged() {
        return this.onChanged;
    }

    @Override // com.twilio.twilsock.util.ConnectivityMonitor
    public void setOnChanged(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChanged = function0;
    }

    private final ConnectionStatusCallback getConnectionStatusCallback() {
        return (ConnectionStatusCallback) this.connectionStatusCallback.getValue();
    }

    @Override // com.twilio.twilsock.util.ConnectivityMonitor
    public void start() {
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), getConnectionStatusCallback());
            }
        } catch (Exception e) {
            TwilioLogger3.getLogger(this).m3202w("Cannot registerNetworkCallback (probably app doesn't have ACCESS_NETWORK_STATE permission? Considering network as always available)", e);
            setNetworkAvailable(true);
        }
    }

    @Override // com.twilio.twilsock.util.ConnectivityMonitor
    public void stop() {
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(getConnectionStatusCallback());
            }
        } catch (Exception e) {
            TwilioLogger3.getLogger(this).m3202w("Cannot unregisterNetworkCallback (probably app doesn't have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    private final boolean initNetworkAvailable() {
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return true;
            }
            NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(12);
            }
            return false;
        } catch (Exception e) {
            TwilioLogger3.getLogger(this).m3202w("Cannot read current network state (probably app doesn't have ACCESS_NETWORK_STATE permission? Considering network as available)", e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConnectivityMonitorAndroid.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/twilio/twilsock/util/ConnectivityMonitorImpl$ConnectionStatusCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "(Lcom/twilio/twilsock/util/ConnectivityMonitorImpl;)V", "activeNetworks", "", "Landroid/net/Network;", "onAvailable", "", "network", "onLost", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.twilio.twilsock.util.ConnectivityMonitorImpl$ConnectionStatusCallback */
    final class ConnectionStatusCallback extends ConnectivityManager.NetworkCallback {
        private final List<Network> activeNetworks = new ArrayList();

        public ConnectionStatusCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(final Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            CollectionsKt.removeAll((List) this.activeNetworks, (Function1) new Function1<Network, Boolean>() { // from class: com.twilio.twilsock.util.ConnectivityMonitorImpl$ConnectionStatusCallback$onLost$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Network activeNetwork) {
                    Intrinsics.checkNotNullParameter(activeNetwork, "activeNetwork");
                    return Boolean.valueOf(Intrinsics.areEqual(activeNetwork, network));
                }
            });
            ConnectivityMonitorAndroid.this.setNetworkAvailable(!this.activeNetworks.isEmpty());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            List<Network> list = this.activeNetworks;
            if ((list instanceof Collection) && list.isEmpty()) {
                this.activeNetworks.add(network);
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual((Network) it.next(), network)) {
                        break;
                    }
                }
                this.activeNetworks.add(network);
            }
            ConnectivityMonitorAndroid.this.setNetworkAvailable(!this.activeNetworks.isEmpty());
        }
    }
}
