package com.robinhood.android.psp;

import android.view.View;
import com.robinhood.android.psp.databinding.FragmentProgramEnrollmentCelebrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramEnrollmentCelebrationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ProgramEnrollmentCelebrationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentProgramEnrollmentCelebrationBinding> {
    public static final ProgramEnrollmentCelebrationFragment2 INSTANCE = new ProgramEnrollmentCelebrationFragment2();

    ProgramEnrollmentCelebrationFragment2() {
        super(1, FragmentProgramEnrollmentCelebrationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/psp/databinding/FragmentProgramEnrollmentCelebrationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentProgramEnrollmentCelebrationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentProgramEnrollmentCelebrationBinding.bind(p0);
    }
}
