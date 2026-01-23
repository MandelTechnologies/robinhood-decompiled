package com.robinhood.android.crypto.tab.p093ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoHomeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$5$2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$5$2(Object obj) {
        super(1, obj, CryptoHomeDuxo.class, "toggleTradableDiscoverList", "toggleTradableDiscoverList(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((CryptoHomeDuxo) this.receiver).toggleTradableDiscoverList(z);
    }
}
