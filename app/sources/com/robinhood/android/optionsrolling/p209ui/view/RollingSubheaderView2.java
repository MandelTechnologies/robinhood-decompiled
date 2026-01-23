package com.robinhood.android.optionsrolling.p209ui.view;

import android.view.View;
import com.robinhood.android.optionsrolling.databinding.MergeRollingStatsViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RollingSubheaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsrolling.ui.view.RollingSubheaderView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RollingSubheaderView2 extends FunctionReferenceImpl implements Function1<View, MergeRollingStatsViewBinding> {
    public static final RollingSubheaderView2 INSTANCE = new RollingSubheaderView2();

    RollingSubheaderView2() {
        super(1, MergeRollingStatsViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsrolling/databinding/MergeRollingStatsViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRollingStatsViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRollingStatsViewBinding.bind(p0);
    }
}
