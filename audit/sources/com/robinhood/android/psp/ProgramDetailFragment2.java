package com.robinhood.android.psp;

import android.view.View;
import com.robinhood.android.psp.databinding.FragmentProgramDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.ProgramDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ProgramDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentProgramDetailBinding> {
    public static final ProgramDetailFragment2 INSTANCE = new ProgramDetailFragment2();

    ProgramDetailFragment2() {
        super(1, FragmentProgramDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/psp/databinding/FragmentProgramDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentProgramDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentProgramDetailBinding.bind(p0);
    }
}
