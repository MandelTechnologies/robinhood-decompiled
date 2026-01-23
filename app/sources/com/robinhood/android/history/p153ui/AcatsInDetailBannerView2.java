package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.MergeAcatsDetailBannerViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDetailBannerView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.AcatsInDetailBannerView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class AcatsInDetailBannerView2 extends FunctionReferenceImpl implements Function1<View, MergeAcatsDetailBannerViewBinding> {
    public static final AcatsInDetailBannerView2 INSTANCE = new AcatsInDetailBannerView2();

    AcatsInDetailBannerView2() {
        super(1, MergeAcatsDetailBannerViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/MergeAcatsDetailBannerViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeAcatsDetailBannerViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeAcatsDetailBannerViewBinding.bind(p0);
    }
}
