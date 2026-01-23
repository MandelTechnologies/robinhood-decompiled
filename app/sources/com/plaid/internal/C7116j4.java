package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.di.OAuthRedirectUriStore", m3645f = "OAuthRedirectUriStore.kt", m3646l = {20, 24}, m3647m = "readOAuthRedirectUri")
/* renamed from: com.plaid.internal.j4 */
/* loaded from: classes16.dex */
public final class C7116j4 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2876a;

    /* renamed from: b */
    public /* synthetic */ Object f2877b;

    /* renamed from: c */
    public final /* synthetic */ C7125k4 f2878c;

    /* renamed from: d */
    public int f2879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7116j4(C7125k4 c7125k4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2878c = c7125k4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2877b = obj;
        this.f2879d |= Integer.MIN_VALUE;
        return this.f2878c.mo1546a(this);
    }
}
