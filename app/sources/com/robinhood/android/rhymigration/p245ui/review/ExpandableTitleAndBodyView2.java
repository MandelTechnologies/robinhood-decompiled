package com.robinhood.android.rhymigration.p245ui.review;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.MergeExpandableTitleAndBodyViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandableTitleAndBodyView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.review.ExpandableTitleAndBodyView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ExpandableTitleAndBodyView2 extends FunctionReferenceImpl implements Function1<View, MergeExpandableTitleAndBodyViewBinding> {
    public static final ExpandableTitleAndBodyView2 INSTANCE = new ExpandableTitleAndBodyView2();

    ExpandableTitleAndBodyView2() {
        super(1, MergeExpandableTitleAndBodyViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/MergeExpandableTitleAndBodyViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeExpandableTitleAndBodyViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeExpandableTitleAndBodyViewBinding.bind(p0);
    }
}
