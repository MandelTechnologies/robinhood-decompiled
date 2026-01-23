package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.MergeRhyHeroAssetViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyHeroAssetView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyHeroAssetView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyHeroAssetView2 extends FunctionReferenceImpl implements Function1<View, MergeRhyHeroAssetViewBinding> {
    public static final RhyHeroAssetView2 INSTANCE = new RhyHeroAssetView2();

    RhyHeroAssetView2() {
        super(1, MergeRhyHeroAssetViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyHeroAssetViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRhyHeroAssetViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRhyHeroAssetViewBinding.bind(p0);
    }
}
