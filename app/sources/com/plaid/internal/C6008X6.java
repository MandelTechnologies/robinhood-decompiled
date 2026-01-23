package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.sna.TwilioAuthController", m3645f = "TwilioAuthController.kt", m3646l = {23, 38}, m3647m = "asyncAuthentication")
/* renamed from: com.plaid.internal.X6 */
/* loaded from: classes16.dex */
public final class C6008X6 extends ContinuationImpl {

    /* renamed from: a */
    public C6026Z6 f1828a;

    /* renamed from: b */
    public C6036a7 f1829b;

    /* renamed from: c */
    public /* synthetic */ Object f1830c;

    /* renamed from: d */
    public final /* synthetic */ C6026Z6 f1831d;

    /* renamed from: e */
    public int f1832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6008X6(C6026Z6 c6026z6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1831d = c6026z6;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1830c = obj;
        this.f1832e |= Integer.MIN_VALUE;
        return this.f1831d.m1360a(null, this);
    }
}
