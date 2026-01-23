package com.robinhood.android.matcha.p177ui.review.multiuser;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$ComposeContent$6$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaReviewMultiuserTransactionFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    MatchaReviewMultiuserTransactionFragment4(Object obj) {
        super(0, obj, MatchaReviewMultiuserTransactionDuxo.class, "onMemoClick", "onMemoClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MatchaReviewMultiuserTransactionDuxo) this.receiver).onMemoClick();
    }
}
