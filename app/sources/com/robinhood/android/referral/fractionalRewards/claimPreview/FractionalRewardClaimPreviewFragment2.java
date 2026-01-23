package com.robinhood.android.referral.fractionalRewards.claimPreview;

import android.view.View;
import com.robinhood.android.referral.databinding.FragmentFractionalRewardClaimPreviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardClaimPreviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimPreviewFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class FractionalRewardClaimPreviewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentFractionalRewardClaimPreviewBinding> {
    public static final FractionalRewardClaimPreviewFragment2 INSTANCE = new FractionalRewardClaimPreviewFragment2();

    FractionalRewardClaimPreviewFragment2() {
        super(1, FragmentFractionalRewardClaimPreviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/referral/databinding/FragmentFractionalRewardClaimPreviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentFractionalRewardClaimPreviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentFractionalRewardClaimPreviewBinding.bind(p0);
    }
}
