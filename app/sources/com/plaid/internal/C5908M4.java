package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", m3645f = "PlaidClientSideOnlyConfigurationStore.kt", m3646l = {22}, m3647m = "read")
/* renamed from: com.plaid.internal.M4 */
/* loaded from: classes16.dex */
public final class C5908M4 extends ContinuationImpl {

    /* renamed from: a */
    public C5935P4 f1546a;

    /* renamed from: b */
    public /* synthetic */ Object f1547b;

    /* renamed from: c */
    public final /* synthetic */ C5935P4 f1548c;

    /* renamed from: d */
    public int f1549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5908M4(C5935P4 c5935p4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1548c = c5935p4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1547b = obj;
        this.f1549d |= Integer.MIN_VALUE;
        return this.f1548c.m1294a(this);
    }
}
