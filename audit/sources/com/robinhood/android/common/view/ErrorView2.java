package com.robinhood.android.common.view;

import android.view.View;
import com.robinhood.android.common.databinding.MergeErrorViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.view.ErrorView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class ErrorView2 extends FunctionReferenceImpl implements Function1<View, MergeErrorViewBinding> {
    public static final ErrorView2 INSTANCE = new ErrorView2();

    ErrorView2() {
        super(1, MergeErrorViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/databinding/MergeErrorViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeErrorViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeErrorViewBinding.bind(p0);
    }
}
