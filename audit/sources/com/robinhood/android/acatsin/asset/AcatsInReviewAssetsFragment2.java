package com.robinhood.android.acatsin.asset;

import android.view.View;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInAssetsReviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInReviewAssetsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInReviewAssetsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInAssetsReviewBinding> {
    public static final AcatsInReviewAssetsFragment2 INSTANCE = new AcatsInReviewAssetsFragment2();

    AcatsInReviewAssetsFragment2() {
        super(1, FragmentAcatsInAssetsReviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAssetsReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInAssetsReviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInAssetsReviewBinding.bind(p0);
    }
}
