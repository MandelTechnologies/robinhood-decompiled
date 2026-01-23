package com.robinhood.android.safetylabels.p247ui;

import android.view.View;
import com.robinhood.android.safetylabels.databinding.MergeSafetyLabelSlidesViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafetyLabelsSlidesView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsSlidesView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SafetyLabelsSlidesView2 extends FunctionReferenceImpl implements Function1<View, MergeSafetyLabelSlidesViewBinding> {
    public static final SafetyLabelsSlidesView2 INSTANCE = new SafetyLabelsSlidesView2();

    SafetyLabelsSlidesView2() {
        super(1, MergeSafetyLabelSlidesViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/safetylabels/databinding/MergeSafetyLabelSlidesViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSafetyLabelSlidesViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSafetyLabelSlidesViewBinding.bind(p0);
    }
}
