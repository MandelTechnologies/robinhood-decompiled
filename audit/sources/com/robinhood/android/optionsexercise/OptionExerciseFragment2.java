package com.robinhood.android.optionsexercise;

import android.view.View;
import com.robinhood.android.optionsexercise.databinding.MergeOptionExerciseBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionExerciseFragment2 extends FunctionReferenceImpl implements Function1<View, MergeOptionExerciseBinding> {
    public static final OptionExerciseFragment2 INSTANCE = new OptionExerciseFragment2();

    OptionExerciseFragment2() {
        super(1, MergeOptionExerciseBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsexercise/databinding/MergeOptionExerciseBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionExerciseBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionExerciseBinding.bind(p0);
    }
}
