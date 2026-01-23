package com.robinhood.android.settings.p254ui;

import android.view.View;
import com.robinhood.android.settings.p254ui.databinding.IncludeBannerViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.BannerItemView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class BannerItemView2 extends FunctionReferenceImpl implements Function1<View, IncludeBannerViewBinding> {
    public static final BannerItemView2 INSTANCE = new BannerItemView2();

    BannerItemView2() {
        super(1, IncludeBannerViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/ui/databinding/IncludeBannerViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeBannerViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeBannerViewBinding.bind(p0);
    }
}
