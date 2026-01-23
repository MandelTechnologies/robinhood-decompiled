package com.robinhood.android.optionsexercise.assignment;

import android.view.View;
import com.robinhood.android.optionsexercise.databinding.FragmentEarlyAssignmentOptionPickerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyAssignmentOptionPickerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class EarlyAssignmentOptionPickerFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEarlyAssignmentOptionPickerBinding> {
    public static final EarlyAssignmentOptionPickerFragment2 INSTANCE = new EarlyAssignmentOptionPickerFragment2();

    EarlyAssignmentOptionPickerFragment2() {
        super(1, FragmentEarlyAssignmentOptionPickerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentOptionPickerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEarlyAssignmentOptionPickerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEarlyAssignmentOptionPickerBinding.bind(p0);
    }
}
