package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.d3 */
/* loaded from: classes16.dex */
public final class C7055d3 implements Factory<C5995W2> {

    /* renamed from: a */
    public final C7133l3 f2723a;

    /* renamed from: b */
    public final Provider<C7195r3> f2724b;

    /* renamed from: c */
    public final Provider<InterfaceC5833E4> f2725c;

    /* renamed from: d */
    public final C5796A3 f2726d;

    /* renamed from: e */
    public final Provider<C5973T7> f2727e;

    /* renamed from: f */
    public final Provider<InterfaceC7070e8> f2728f;

    public C7055d3(C6042b3 c6042b3, C7133l3 c7133l3, Provider provider, Provider provider2, C5796A3 c5796a3, Provider provider3, Provider provider4) {
        this.f2723a = c7133l3;
        this.f2724b = provider;
        this.f2725c = provider2;
        this.f2726d = c5796a3;
        this.f2727e = provider3;
        this.f2728f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC5929O7 api = (InterfaceC5929O7) this.f2723a.get();
        C7195r3 linkWorkflowAnalytics = this.f2724b.get();
        InterfaceC5833E4 paneStore = this.f2725c.get();
        C7268z3 localErrorFactory = (C7268z3) this.f2726d.get();
        C5973T7 requestFactory = this.f2727e.get();
        InterfaceC7070e8 writeOAuthRedirectUri = this.f2728f.get();
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        Intrinsics.checkNotNullParameter(localErrorFactory, "localErrorFactory");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        return (C5995W2) Preconditions.checkNotNullFromProvides(new C5995W2(api, paneStore, linkWorkflowAnalytics, localErrorFactory, requestFactory, writeOAuthRedirectUri));
    }
}
