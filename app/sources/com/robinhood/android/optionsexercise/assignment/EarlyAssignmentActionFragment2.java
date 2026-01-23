package com.robinhood.android.optionsexercise.assignment;

import android.view.View;
import com.robinhood.android.optionsexercise.databinding.FragmentEarlyAssignmentActionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyAssignmentActionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class EarlyAssignmentActionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEarlyAssignmentActionBinding> {
    public static final EarlyAssignmentActionFragment2 INSTANCE = new EarlyAssignmentActionFragment2();

    EarlyAssignmentActionFragment2() {
        super(1, FragmentEarlyAssignmentActionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentActionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEarlyAssignmentActionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEarlyAssignmentActionBinding.bind(p0);
    }
}
