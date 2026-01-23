package com.robinhood.android.rhymigration.p245ui.review;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyReviewChangesBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReviewChangesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyReviewChangesFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyReviewChangesBinding> {
    public static final RhyReviewChangesFragment2 INSTANCE = new RhyReviewChangesFragment2();

    RhyReviewChangesFragment2() {
        super(1, FragmentRhyReviewChangesBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyReviewChangesBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyReviewChangesBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyReviewChangesBinding.bind(p0);
    }
}
