package com.robinhood.android.recommendations.retirement.p223ui.congrats;

import android.view.View;
import com.robinhood.android.recommendations.retirement.databinding.FragmentRecsRetirementCongratsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementCongratsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.congrats.RecsRetirementCongratsFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecsRetirementCongratsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecsRetirementCongratsBinding> {
    public static final RecsRetirementCongratsFragment2 INSTANCE = new RecsRetirementCongratsFragment2();

    RecsRetirementCongratsFragment2() {
        super(1, FragmentRecsRetirementCongratsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/retirement/databinding/FragmentRecsRetirementCongratsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecsRetirementCongratsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecsRetirementCongratsBinding.bind(p0);
    }
}
