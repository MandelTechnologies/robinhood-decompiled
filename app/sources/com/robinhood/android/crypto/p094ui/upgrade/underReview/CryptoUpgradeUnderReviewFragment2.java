package com.robinhood.android.crypto.p094ui.upgrade.underReview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoUpgradeUnderReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.upgrade.underReview.CryptoUpgradeUnderReviewFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoUpgradeUnderReviewFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoUpgradeUnderReviewFragment2(Object obj) {
        super(0, obj, CryptoUpgradeUnderReviewFragment.class, "onDone", "onDone()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoUpgradeUnderReviewFragment) this.receiver).onDone();
    }
}
