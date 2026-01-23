package com.robinhood.android.odyssey.lib.view;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.MergeSdBannerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdBanner.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdBanner$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdBanner2 extends FunctionReferenceImpl implements Function1<View, MergeSdBannerBinding> {
    public static final SdBanner2 INSTANCE = new SdBanner2();

    SdBanner2() {
        super(1, MergeSdBannerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/MergeSdBannerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSdBannerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSdBannerBinding.bind(p0);
    }
}
