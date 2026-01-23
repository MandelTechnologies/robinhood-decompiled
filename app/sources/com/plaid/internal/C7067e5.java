package com.plaid.internal;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.e5 */
/* loaded from: classes16.dex */
public final class C7067e5 extends Lambda implements Function0<SharedPreferences> {

    /* renamed from: a */
    public final /* synthetic */ C7077f5 f2752a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7067e5(C7077f5 c7077f5) {
        super(0);
        this.f2752a = c7077f5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return this.f2752a.f2769a.getApplicationContext().getSharedPreferences("plaid_environment_values", 0);
    }
}
