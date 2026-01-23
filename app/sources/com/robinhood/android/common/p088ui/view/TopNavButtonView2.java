package com.robinhood.android.common.p088ui.view;

import android.view.View;
import com.robinhood.android.common.databinding.MergeTopNavButtonViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopNavButtonView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.view.TopNavButtonView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class TopNavButtonView2 extends FunctionReferenceImpl implements Function1<View, MergeTopNavButtonViewBinding> {
    public static final TopNavButtonView2 INSTANCE = new TopNavButtonView2();

    TopNavButtonView2() {
        super(1, MergeTopNavButtonViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/databinding/MergeTopNavButtonViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTopNavButtonViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTopNavButtonViewBinding.bind(p0);
    }
}
