package com.robinhood.android.futures.onboarding.p145ui.result;

import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesAccountResultFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultFragmentKt$AccountResultScreen$1$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesAccountResultFragment6 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesAccountResultFragment6(Object obj) {
        super(0, obj, FuturesAccountResultFragment.Callbacks.class, "onFlowCompletedWithRejectionOrReview", "onFlowCompletedWithRejectionOrReview()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesAccountResultFragment.Callbacks) this.receiver).onFlowCompletedWithRejectionOrReview();
    }
}
