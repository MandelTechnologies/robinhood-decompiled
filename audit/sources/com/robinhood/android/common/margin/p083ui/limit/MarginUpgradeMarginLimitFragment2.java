package com.robinhood.android.common.margin.p083ui.limit;

import android.view.View;
import com.robinhood.android.common.margin.databinding.FragmentMarginUpgradeMarginLimitBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeMarginLimitFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.limit.MarginUpgradeMarginLimitFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class MarginUpgradeMarginLimitFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMarginUpgradeMarginLimitBinding> {
    public static final MarginUpgradeMarginLimitFragment2 INSTANCE = new MarginUpgradeMarginLimitFragment2();

    MarginUpgradeMarginLimitFragment2() {
        super(1, FragmentMarginUpgradeMarginLimitBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/margin/databinding/FragmentMarginUpgradeMarginLimitBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMarginUpgradeMarginLimitBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMarginUpgradeMarginLimitBinding.bind(p0);
    }
}
