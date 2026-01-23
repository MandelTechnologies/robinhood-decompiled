package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.ChannelPolling", m3645f = "ChannelPolling.kt", m3646l = {49, 50}, m3647m = "pollOnChannel")
/* renamed from: com.plaid.internal.E */
/* loaded from: classes16.dex */
public final class C5828E extends ContinuationImpl {

    /* renamed from: a */
    public C5837F f1328a;

    /* renamed from: b */
    public C5792A f1329b;

    /* renamed from: c */
    public AbstractC5846G f1330c;

    /* renamed from: d */
    public String f1331d;

    /* renamed from: e */
    public boolean f1332e;

    /* renamed from: f */
    public /* synthetic */ Object f1333f;

    /* renamed from: g */
    public final /* synthetic */ C5837F f1334g;

    /* renamed from: h */
    public int f1335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5828E(C5837F c5837f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1334g = c5837f;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1333f = obj;
        this.f1335h |= Integer.MIN_VALUE;
        return C5837F.m1191a(this.f1334g, null, null, this);
    }
}
