package com.plaid.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.DestinationFactory", m3645f = "DestinationFactory.kt", m3646l = {63}, m3647m = AnalyticsStrings.BUTTON_NEW_LIST_CREATE)
/* renamed from: com.plaid.internal.A0 */
/* loaded from: classes16.dex */
public final class C5793A0 extends ContinuationImpl {

    /* renamed from: a */
    public C7265z0 f1222a;

    /* renamed from: b */
    public AbstractC5894L2 f1223b;

    /* renamed from: c */
    public C6009X7 f1224c;

    /* renamed from: d */
    public /* synthetic */ Object f1225d;

    /* renamed from: e */
    public final /* synthetic */ C7265z0 f1226e;

    /* renamed from: f */
    public int f1227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5793A0(C7265z0 c7265z0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1226e = c7265z0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1225d = obj;
        this.f1227f |= Integer.MIN_VALUE;
        return this.f1226e.m1675a((AbstractC5894L2) null, this);
    }
}
