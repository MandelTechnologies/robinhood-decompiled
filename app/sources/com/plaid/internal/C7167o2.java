package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkController", m3645f = "LinkController.kt", m3646l = {65, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 70, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "resume")
/* renamed from: com.plaid.internal.o2 */
/* loaded from: classes16.dex */
public final class C7167o2 extends ContinuationImpl {

    /* renamed from: a */
    public C7194r2 f3058a;

    /* renamed from: b */
    public AbstractC7207s6 f3059b;

    /* renamed from: c */
    public AbstractC5894L2 f3060c;

    /* renamed from: d */
    public /* synthetic */ Object f3061d;

    /* renamed from: e */
    public final /* synthetic */ C7194r2 f3062e;

    /* renamed from: f */
    public int f3063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7167o2(C7194r2 c7194r2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3062e = c7194r2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3061d = obj;
        this.f3063f |= Integer.MIN_VALUE;
        return this.f3062e.mo1581a((AbstractC7207s6) null, this);
    }
}
