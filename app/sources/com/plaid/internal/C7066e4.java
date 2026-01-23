package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.provider.Settings;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.plaid.internal.e4 */
/* loaded from: classes16.dex */
public final class C7066e4 {

    /* renamed from: a */
    public final Context f2744a;

    /* renamed from: b */
    public final C7237w0 f2745b;

    /* renamed from: com.plaid.internal.e4$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2746a;

        static {
            int[] iArr = new int[EnumC6053c4.values().length];
            f2746a = iArr;
            try {
                iArr[EnumC6053c4.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2746a[EnumC6053c4.WIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.plaid.internal.e4$b */
    public static class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final C7237w0 f2747a;

        /* renamed from: b */
        public final CountDownLatch f2748b;

        /* renamed from: c */
        public volatile C6023Z3 f2749c;

        /* renamed from: d */
        public volatile RunnableC7056d4 f2750d;

        /* renamed from: e */
        public final ConnectivityManager f2751e;

        public b(ConnectivityManager connectivityManager) {
            EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
            this.f2747a = new C7237w0("network-callback");
            this.f2748b = new CountDownLatch(1);
            this.f2751e = connectivityManager;
        }

        /* renamed from: a */
        public final void m1497a(Network network, NetworkCapabilities networkCapabilities) {
            if (this.f2750d == null) {
                this.f2747a.m1635a(EnumC5943Q3.ERROR, "network callback already unregistered", new Object[0]);
                return;
            }
            try {
                C6014Y3 c6014y3 = new C6014Y3(networkCapabilities);
                EnumC7264z enumC7264z = c6014y3.f1848c == EnumC7264z.YES ? c6014y3.f1849d : EnumC7264z.NO;
                if (this.f2749c != null && this.f2749c.f1864a.equals(network)) {
                    this.f2747a.m1635a(EnumC5943Q3.INFO, "update validated network %s %s", network, c6014y3);
                    this.f2749c.f1866c = enumC7264z;
                } else {
                    if (this.f2749c != null || enumC7264z == EnumC7264z.NO) {
                        this.f2747a.m1635a(EnumC5943Q3.INFO, "update network %s %s", network, c6014y3);
                        return;
                    }
                    this.f2747a.m1635a(EnumC5943Q3.INFO, "found validated network %s %s", network, c6014y3);
                    this.f2749c = new C6023Z3(network, this.f2750d);
                    this.f2749c.f1866c = enumC7264z;
                    this.f2748b.countDown();
                }
            } catch (RuntimeException e) {
                this.f2747a.m1636a(e, "fatal network callback error");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            NetworkCapabilities networkCapabilities = this.f2751e.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                this.f2747a.m1635a(EnumC5943Q3.INFO, "available network %s", network);
                m1497a(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            m1497a(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            if (this.f2749c == null || !this.f2749c.f1864a.equals(network)) {
                return;
            }
            this.f2747a.m1635a(EnumC5943Q3.INFO, "lost network %s", network);
            C6023Z3 c6023z3 = this.f2749c;
            if (c6023z3.f1867d) {
                return;
            }
            c6023z3.f1867d = true;
            c6023z3.f1865b.run();
        }
    }

    public C7066e4(Context context) {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        this.f2745b = new C7237w0("network-utils");
        this.f2744a = context;
    }

    /* renamed from: a */
    public final boolean m1496a() {
        EnumC5943Q3 enumC5943Q3 = EnumC5943Q3.DEBUG;
        this.f2745b.m1635a(enumC5943Q3, "isAirplaneMode: Checking if device is in airplane mode.", new Object[0]);
        boolean z = Settings.Global.getInt(this.f2744a.getContentResolver(), "airplane_mode_on", 0) != 0;
        C7237w0 c7237w0 = this.f2745b;
        StringBuilder sb = new StringBuilder("isAirplaneMode: Airplane mode ");
        sb.append(z ? CountryCode.COUNTRY_CODE_IS : "IS NOT");
        sb.append(" active.");
        c7237w0.m1635a(enumC5943Q3, sb.toString(), new Object[0]);
        return z;
    }

    /* renamed from: a */
    public final C6023Z3 m1495a(EnumC6053c4 enumC6053c4) throws InterruptedException {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2744a.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addCapability(12);
            int i2 = a.f2746a[enumC6053c4.ordinal()];
            if (i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 3;
            }
            NetworkRequest networkRequestBuild = builderAddCapability.addTransportType(i).build();
            b bVar = new b(connectivityManager);
            this.f2745b.m1635a(EnumC5943Q3.DEBUG, "Network %s requested, waiting (%d)ms for result (%s)", enumC6053c4, 10000, Thread.currentThread());
            bVar.f2750d = new RunnableC7056d4(connectivityManager, bVar);
            connectivityManager.requestNetwork(networkRequestBuild, bVar);
            try {
                bVar.f2748b.await(10000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (bVar.f2749c == null) {
                RunnableC7056d4 runnableC7056d4 = bVar.f2750d;
                runnableC7056d4.f2729a.unregisterNetworkCallback(runnableC7056d4.f2730b);
            }
            return bVar.f2749c;
        }
        this.f2745b.m1635a(EnumC5943Q3.ERROR, "ConnectivityManager is null!", new Object[0]);
        throw new IllegalStateException("ConnectivityManager not available!");
    }
}
