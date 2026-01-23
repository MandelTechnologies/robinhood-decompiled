package com.plaid.internal;

import android.app.Application;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.P */
/* loaded from: classes16.dex */
public final class C5930P {
    /* renamed from: a */
    public static final String m1287a(Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        String str = String.format("intent://redirect/#Intent;scheme=plaid;package=%s;end;", Arrays.copyOf(new Object[]{application.getApplicationContext().getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
