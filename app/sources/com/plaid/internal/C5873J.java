package com.plaid.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import com.plaid.internal.AbstractC6056c7;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.J */
/* loaded from: classes16.dex */
public final class C5873J extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C5882K f1385a;

    /* renamed from: b */
    public final /* synthetic */ String f1386b;

    /* renamed from: c */
    public final /* synthetic */ SafeContinuationJvm f1387c;

    /* renamed from: d */
    public final /* synthetic */ ConnectivityManager f1388d;

    public C5873J(C5882K c5882k, String str, SafeContinuationJvm safeContinuationJvm, ConnectivityManager connectivityManager) {
        this.f1385a = c5882k;
        this.f1386b = str;
        this.f1387c = safeContinuationJvm;
        this.f1388d = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        try {
            try {
                this.f1387c.resumeWith(Result.m28550constructorimpl(this.f1385a.f1415b.m1214a(this.f1386b, network)));
            } catch (AbstractC6056c7.c e) {
                SafeContinuationJvm safeContinuationJvm = this.f1387c;
                Result.Companion companion = Result.INSTANCE;
                safeContinuationJvm.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(e)));
            }
        } finally {
            this.f1388d.unregisterNetworkCallback(this);
        }
    }
}
