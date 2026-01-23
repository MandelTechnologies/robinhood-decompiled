package com.robinhood.android.cash.rhy.tab.p077v2;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyPendingScreenBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyPendingScreenFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyPendingScreenFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyPendingScreenFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentRhyPendingScreenBinding> {
    public static final RhyPendingScreenFragment3 INSTANCE = new RhyPendingScreenFragment3();

    RhyPendingScreenFragment3() {
        super(1, FragmentRhyPendingScreenBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyPendingScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyPendingScreenBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyPendingScreenBinding.bind(p0);
    }
}
