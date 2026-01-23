package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.di.ChannelInfoStore", m3645f = "ChannelInfoStore.kt", m3646l = {25}, m3647m = "readChannelInfo")
/* renamed from: com.plaid.internal.B */
/* loaded from: classes16.dex */
public final class C5801B extends ContinuationImpl {

    /* renamed from: a */
    public C5810C f1258a;

    /* renamed from: b */
    public /* synthetic */ Object f1259b;

    /* renamed from: c */
    public final /* synthetic */ C5810C f1260c;

    /* renamed from: d */
    public int f1261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5801B(C5810C c5810c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1260c = c5810c;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1259b = obj;
        this.f1261d |= Integer.MIN_VALUE;
        return this.f1260c.mo1158b(this);
    }
}
