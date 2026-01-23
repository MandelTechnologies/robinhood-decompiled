package com.robinhood.android.feature.lib.sweep.interest.dialog;

import android.view.View;
import com.robinhood.android.feature.lib.sweep.interest.databinding.SweepDisableDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepDisableDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepDisableDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class SweepDisableDialogFragment2 extends FunctionReferenceImpl implements Function1<View, SweepDisableDialogBinding> {
    public static final SweepDisableDialogFragment2 INSTANCE = new SweepDisableDialogFragment2();

    SweepDisableDialogFragment2() {
        super(1, SweepDisableDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepDisableDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SweepDisableDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return SweepDisableDialogBinding.bind(p0);
    }
}
