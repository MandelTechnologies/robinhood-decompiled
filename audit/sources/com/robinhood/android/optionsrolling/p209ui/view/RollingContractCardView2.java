package com.robinhood.android.optionsrolling.p209ui.view;

import android.view.View;
import com.robinhood.android.optionsrolling.databinding.MergeRollingContractCardViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RollingContractCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsrolling.ui.view.RollingContractCardView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RollingContractCardView2 extends FunctionReferenceImpl implements Function1<View, MergeRollingContractCardViewBinding> {
    public static final RollingContractCardView2 INSTANCE = new RollingContractCardView2();

    RollingContractCardView2() {
        super(1, MergeRollingContractCardViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsrolling/databinding/MergeRollingContractCardViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRollingContractCardViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRollingContractCardViewBinding.bind(p0);
    }
}
