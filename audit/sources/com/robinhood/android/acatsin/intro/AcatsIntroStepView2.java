package com.robinhood.android.acatsin.intro;

import android.view.View;
import com.robinhood.android.acatsin.databinding.MergeAcatsIntroStepViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsIntroStepView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.intro.AcatsIntroStepView$viewBinding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsIntroStepView2 extends FunctionReferenceImpl implements Function1<View, MergeAcatsIntroStepViewBinding> {
    public static final AcatsIntroStepView2 INSTANCE = new AcatsIntroStepView2();

    AcatsIntroStepView2() {
        super(1, MergeAcatsIntroStepViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/MergeAcatsIntroStepViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeAcatsIntroStepViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeAcatsIntroStepViewBinding.bind(p0);
    }
}
