package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.J1 */
/* loaded from: classes16.dex */
public final class C5875J1 implements Factory<InterfaceC7203s2> {

    /* renamed from: a */
    public final Provider<C5831E2> f1392a;

    /* renamed from: b */
    public final Provider<InterfaceC6004X2> f1393b;

    /* renamed from: c */
    public final Provider<C5995W2> f1394c;

    /* renamed from: d */
    public final Provider<InterfaceC7070e8> f1395d;

    /* renamed from: e */
    public final Provider<InterfaceC7110i8> f1396e;

    /* renamed from: f */
    public final Provider<InterfaceC7060d8> f1397f;

    /* renamed from: g */
    public final Provider<InterfaceC7100h8> f1398g;

    /* renamed from: h */
    public final Provider<InterfaceC7090g8> f1399h;

    /* renamed from: i */
    public final C5802B0 f1400i;

    public C5875J1(C5848G1 c5848g1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, C5802B0 c5802b0) {
        this.f1392a = provider;
        this.f1393b = provider2;
        this.f1394c = provider3;
        this.f1395d = provider4;
        this.f1396e = provider5;
        this.f1397f = provider6;
        this.f1398g = provider7;
        this.f1399h = provider8;
        this.f1400i = c5802b0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5831E2 navigator = this.f1392a.get();
        InterfaceC6004X2 linkStateStore = this.f1393b.get();
        C5995W2 reducer = this.f1394c.get();
        InterfaceC7070e8 writeOAuthRedirectUri = this.f1395d.get();
        InterfaceC7110i8 writeWebviewFallbackUri = this.f1396e.get();
        InterfaceC7060d8 writeChannelInfo = this.f1397f.get();
        InterfaceC7100h8 writeWebviewFallbackId = this.f1398g.get();
        InterfaceC7090g8 writeWebviewBackgroundTransparencyState = this.f1399h.get();
        C7265z0 destinationFactory = (C7265z0) this.f1400i.get();
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(linkStateStore, "linkStateStore");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        Intrinsics.checkNotNullParameter(writeChannelInfo, "writeChannelInfo");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackId, "writeWebviewFallbackId");
        Intrinsics.checkNotNullParameter(writeWebviewBackgroundTransparencyState, "writeWebviewBackgroundTransparencyState");
        Intrinsics.checkNotNullParameter(destinationFactory, "destinationFactory");
        return (InterfaceC7203s2) Preconditions.checkNotNullFromProvides(new C7194r2(navigator, linkStateStore, reducer, writeOAuthRedirectUri, writeWebviewFallbackUri, writeChannelInfo, writeWebviewFallbackId, writeWebviewBackgroundTransparencyState, destinationFactory));
    }
}
