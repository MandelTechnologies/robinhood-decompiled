package com.robinhood.android.safetylabels.p247ui;

import android.view.View;
import com.robinhood.android.safetylabels.databinding.FragmentSafetyLabelsLessonBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafetyLabelsLessonFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SafetyLabelsLessonFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSafetyLabelsLessonBinding> {
    public static final SafetyLabelsLessonFragment2 INSTANCE = new SafetyLabelsLessonFragment2();

    SafetyLabelsLessonFragment2() {
        super(1, FragmentSafetyLabelsLessonBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/safetylabels/databinding/FragmentSafetyLabelsLessonBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSafetyLabelsLessonBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSafetyLabelsLessonBinding.bind(p0);
    }
}
