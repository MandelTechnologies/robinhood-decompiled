package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", m3645f = "HeadlessOAuthViewModel.kt", m3646l = {67}, m3647m = "doOnStart")
/* renamed from: com.plaid.internal.l1 */
/* loaded from: classes16.dex */
public final class C7131l1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f2913a;

    /* renamed from: b */
    public final /* synthetic */ C7122k1 f2914b;

    /* renamed from: c */
    public int f2915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7131l1(C7122k1 c7122k1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2914b = c7122k1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2913a = obj;
        this.f2915c |= Integer.MIN_VALUE;
        return this.f2914b.m1543a(this);
    }
}
