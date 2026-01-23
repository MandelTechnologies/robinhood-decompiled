package com.robinhood.android.psp;

import android.view.View;
import com.robinhood.android.psp.databinding.MergeProgramDetailDisclosureViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramDetailDisclosureView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.ProgramDetailDisclosureView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ProgramDetailDisclosureView2 extends FunctionReferenceImpl implements Function1<View, MergeProgramDetailDisclosureViewBinding> {
    public static final ProgramDetailDisclosureView2 INSTANCE = new ProgramDetailDisclosureView2();

    ProgramDetailDisclosureView2() {
        super(1, MergeProgramDetailDisclosureViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/psp/databinding/MergeProgramDetailDisclosureViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeProgramDetailDisclosureViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeProgramDetailDisclosureViewBinding.bind(p0);
    }
}
