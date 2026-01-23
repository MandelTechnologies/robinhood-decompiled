package com.robinhood.android.jointaccounts.onboarding;

import com.airbnb.lottie.compose.LottieCompositionSpec;
import kotlin.Metadata;

/* compiled from: JointAccountOnboardingAsset.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"AssetsLocation", "", "SecondaryIntroAssetName", "assetUrl", "name", "SecondaryIntroLottie", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "getSecondaryIntroLottie", "()Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAssetKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountOnboardingAsset2 {
    private static final String AssetsLocation = "https://cdn.robinhood.com/app_assets/joint_accounts/";
    private static final String SecondaryIntroAssetName = "joint_account_secondary_intro_v6";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String assetUrl(String str) {
        return AssetsLocation + str + ".json";
    }

    public static final LottieCompositionSpec getSecondaryIntroLottie() {
        return LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(assetUrl(SecondaryIntroAssetName)));
    }
}
