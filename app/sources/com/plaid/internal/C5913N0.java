package com.plaid.internal;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.views.EmbeddedUrlService", m3645f = "EmbeddedUrlService.kt", m3646l = {35}, m3647m = "fetchEmbeddedUrlFromWorkflowStart-gIAlu-s$link_sdk_release")
/* renamed from: com.plaid.internal.N0 */
/* loaded from: classes16.dex */
public final class C5913N0 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f1555a;

    /* renamed from: b */
    public final /* synthetic */ C5922O0 f1556b;

    /* renamed from: c */
    public int f1557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5913N0(C5922O0 c5922o0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1556b = c5922o0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1555a = obj;
        this.f1557c |= Integer.MIN_VALUE;
        Object objM1273a = this.f1556b.m1273a(null, this);
        return objM1273a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1273a : Result.m28549boximpl(objM1273a);
    }
}
