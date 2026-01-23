package com.robinhood.iac.statusbanner;

import android.view.View;
import com.robinhood.iac.statusbanner.databinding.MergeIacStatusBannerViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacStatusBannerView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.statusbanner.IacStatusBannerView$binding$2, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class IacStatusBannerView2 extends FunctionReferenceImpl implements Function1<View, MergeIacStatusBannerViewBinding> {
    public static final IacStatusBannerView2 INSTANCE = new IacStatusBannerView2();

    IacStatusBannerView2() {
        super(1, MergeIacStatusBannerViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/iac/statusbanner/databinding/MergeIacStatusBannerViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIacStatusBannerViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIacStatusBannerViewBinding.bind(p0);
    }
}
