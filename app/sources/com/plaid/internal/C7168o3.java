package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkWorkflowAnalytics", m3645f = "LinkWorkflowAnalytics.kt", m3646l = {EnumC7081g.f2773x8d9721ad, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "sendAllAnalyticsEventsToServer")
/* renamed from: com.plaid.internal.o3 */
/* loaded from: classes16.dex */
public final class C7168o3 extends ContinuationImpl {

    /* renamed from: a */
    public C7195r3 f3064a;

    /* renamed from: b */
    public Iterator f3065b;

    /* renamed from: c */
    public Workflow$LinkWorkflowEventRequest f3066c;

    /* renamed from: d */
    public /* synthetic */ Object f3067d;

    /* renamed from: e */
    public final /* synthetic */ C7195r3 f3068e;

    /* renamed from: f */
    public int f3069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7168o3(C7195r3 c7195r3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3068e = c7195r3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3067d = obj;
        this.f3069f |= Integer.MIN_VALUE;
        return C7195r3.m1591a(this.f3068e, this);
    }
}
