package com.robinhood.android.feature.lib.sweep.interest.dialog;

import android.view.View;
import com.robinhood.android.feature.lib.sweep.interest.databinding.SweepPausedInfoDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepPausedInfoDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepPausedInfoDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class SweepPausedInfoDialogFragment2 extends FunctionReferenceImpl implements Function1<View, SweepPausedInfoDialogBinding> {
    public static final SweepPausedInfoDialogFragment2 INSTANCE = new SweepPausedInfoDialogFragment2();

    SweepPausedInfoDialogFragment2() {
        super(1, SweepPausedInfoDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepPausedInfoDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SweepPausedInfoDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return SweepPausedInfoDialogBinding.bind(p0);
    }
}
