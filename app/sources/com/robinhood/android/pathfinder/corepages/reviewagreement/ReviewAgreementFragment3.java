package com.robinhood.android.pathfinder.corepages.reviewagreement;

import android.view.View;
import com.robinhood.shared.pathfinder.corepages.databinding.ReviewAgreementFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ReviewAgreementFragment3 extends FunctionReferenceImpl implements Function1<View, ReviewAgreementFragmentBinding> {
    public static final ReviewAgreementFragment3 INSTANCE = new ReviewAgreementFragment3();

    ReviewAgreementFragment3() {
        super(1, ReviewAgreementFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/pathfinder/corepages/databinding/ReviewAgreementFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReviewAgreementFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ReviewAgreementFragmentBinding.bind(p0);
    }
}
