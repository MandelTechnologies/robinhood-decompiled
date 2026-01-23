package com.robinhood.android.internalassettransfers.review;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InternalAssetTransferReview.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewKt$InternalAssetTransferReview$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InternalAssetTransferReview6 extends FunctionReferenceImpl implements Function0<Unit> {
    InternalAssetTransferReview6(Object obj) {
        super(0, obj, InternalAssetTransferReview4.class, "onNavigationBackClick", "onNavigationBackClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InternalAssetTransferReview4) this.receiver).onNavigationBackClick();
    }
}
