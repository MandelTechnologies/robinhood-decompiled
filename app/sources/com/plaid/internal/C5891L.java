package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.twilio.verify_sna.domain.twilioverifysna.ConcreteTwilioVerifySna", m3645f = "ConcreteTwilioVerifySna.kt", m3646l = {43}, m3647m = "processUrl")
/* renamed from: com.plaid.internal.L */
/* loaded from: classes16.dex */
public final class C5891L extends ContinuationImpl {

    /* renamed from: a */
    public C5903M f1437a;

    /* renamed from: b */
    public /* synthetic */ Object f1438b;

    /* renamed from: c */
    public final /* synthetic */ C5903M f1439c;

    /* renamed from: d */
    public int f1440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5891L(C5903M c5903m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1439c = c5903m;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1438b = obj;
        this.f1440d |= Integer.MIN_VALUE;
        return this.f1439c.mo1250a(null, this);
    }
}
