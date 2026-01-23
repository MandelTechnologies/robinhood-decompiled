package com.robinhood.android.optionsexercise.assignment;

import android.view.View;
import com.robinhood.android.optionsexercise.databinding.FragmentEarlyAssignmentComparisonBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyAssignmentComparisonFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentComparisonFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class EarlyAssignmentComparisonFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEarlyAssignmentComparisonBinding> {
    public static final EarlyAssignmentComparisonFragment2 INSTANCE = new EarlyAssignmentComparisonFragment2();

    EarlyAssignmentComparisonFragment2() {
        super(1, FragmentEarlyAssignmentComparisonBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentComparisonBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEarlyAssignmentComparisonBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEarlyAssignmentComparisonBinding.bind(p0);
    }
}
