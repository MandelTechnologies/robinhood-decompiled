package com.plaid.internal;

import android.net.ConnectivityManager;
import com.plaid.internal.C7066e4;

/* renamed from: com.plaid.internal.d4 */
/* loaded from: classes16.dex */
public final class RunnableC7056d4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConnectivityManager f2729a;

    /* renamed from: b */
    public final /* synthetic */ C7066e4.b f2730b;

    public RunnableC7056d4(ConnectivityManager connectivityManager, C7066e4.b bVar) {
        this.f2729a = connectivityManager;
        this.f2730b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2729a.unregisterNetworkCallback(this.f2730b);
    }
}
