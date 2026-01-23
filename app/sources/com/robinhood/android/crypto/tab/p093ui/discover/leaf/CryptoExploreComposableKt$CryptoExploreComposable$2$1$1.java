package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoExploreComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CryptoExploreComposableKt$CryptoExploreComposable$2$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoExploreComposableKt$CryptoExploreComposable$2$1$1(Object obj) {
        super(0, obj, CryptoExploreDuxo.class, "onFakeSearchTapped", "onFakeSearchTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoExploreDuxo) this.receiver).onFakeSearchTapped();
    }
}
