package com.robinhood.android.transfers.pathfinder.p269ui.transferfunds;

import android.view.View;
import com.robinhood.android.transfers.pathfinder.databinding.FragmentPathfinderTransferFundsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderTransferFundsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class PathfinderTransferFundsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPathfinderTransferFundsBinding> {
    public static final PathfinderTransferFundsFragment2 INSTANCE = new PathfinderTransferFundsFragment2();

    PathfinderTransferFundsFragment2() {
        super(1, FragmentPathfinderTransferFundsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/pathfinder/databinding/FragmentPathfinderTransferFundsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPathfinderTransferFundsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPathfinderTransferFundsBinding.bind(p0);
    }
}
