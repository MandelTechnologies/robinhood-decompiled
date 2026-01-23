package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.plaid.internal.AbstractC6056c7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.K */
/* loaded from: classes16.dex */
public final class C5882K {

    /* renamed from: a */
    public final Context f1414a;

    /* renamed from: b */
    public final C5864I f1415b;

    public C5882K(Context context, C5864I networkRequestProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkRequestProvider, "networkRequestProvider");
        this.f1414a = context;
        this.f1415b = networkRequestProvider;
    }

    /* renamed from: a */
    public final Object m1229a(String str, C5891L c5891l) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        Object objInvoke;
        SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(c5891l));
        Object systemService = this.f1414a.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "c.getDeclaredMethod(\"getMobileDataEnabled\")");
            declaredMethod.setAccessible(true);
            objInvoke = declaredMethod.invoke(connectivityManager, null);
        } catch (Exception e) {
            e.printStackTrace();
            zBooleanValue = false;
        }
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        zBooleanValue = ((Boolean) objInvoke).booleanValue();
        if (zBooleanValue) {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new C5873J(this, str, safeContinuationJvm, connectivityManager));
        } else {
            Result.Companion companion = Result.INSTANCE;
            safeContinuationJvm.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(AbstractC6056c7.a.f1946a)));
        }
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(c5891l);
        }
        return orThrow;
    }
}
