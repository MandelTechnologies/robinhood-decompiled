package com.robinhood.android.gold.upgrade.unified.screen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldUnifiedSingleAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$GoldUnifiedSingleAgreementComposable$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldUnifiedSingleAgreementComposable4 extends FunctionReferenceImpl implements Function0<Unit> {
    GoldUnifiedSingleAgreementComposable4(Object obj) {
        super(0, obj, GoldUnifiedSingleAgreementDuxo.class, "onReviewed", "onReviewed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoldUnifiedSingleAgreementDuxo) this.receiver).onReviewed();
    }
}
