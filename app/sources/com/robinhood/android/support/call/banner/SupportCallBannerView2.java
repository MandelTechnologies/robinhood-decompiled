package com.robinhood.android.support.call.banner;

import android.view.View;
import com.robinhood.shared.support.databinding.MergeSupportCallBannerViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallBannerView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.banner.SupportCallBannerView$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SupportCallBannerView2 extends FunctionReferenceImpl implements Function1<View, MergeSupportCallBannerViewBinding> {
    public static final SupportCallBannerView2 INSTANCE = new SupportCallBannerView2();

    SupportCallBannerView2() {
        super(1, MergeSupportCallBannerViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/MergeSupportCallBannerViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSupportCallBannerViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSupportCallBannerViewBinding.bind(p0);
    }
}
