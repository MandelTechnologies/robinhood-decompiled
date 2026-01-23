package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.optionsupgrade.OptionOnboardingExperimentState;
import com.robinhood.android.optionsupgrade.SplashPageImprovement;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.SplashL2ResponseMetadataDto;

/* compiled from: OptionOnboardingSplashL2Fragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0007\"\u000e\u0010\u000f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"getSplashL2Creative", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "assetType", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType;", "isDay", "", "getSplashL2Title", "", "resources", "Landroid/content/res/Resources;", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "accountTypeInCopy", "Loptions_product/service/SplashL2ResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/SplashL2AccountTypeInCopy;", "OPTIONS_LEVEL_3_LEARN_MORE_URL", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2FragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashL2Fragment2 {
    public static final String OPTIONS_LEVEL_3_LEARN_MORE_URL = "https://cdn.robinhood.com/assets/robinhood/legal/Characteristics%20and%20Risks%20of%20Standardized%20Options.pdf";

    /* compiled from: OptionOnboardingSplashL2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2FragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOnboardingExperimentState.SplashL2.Redesign.RedesignL2AssetType.values().length];
            try {
                iArr[OptionOnboardingExperimentState.SplashL2.Redesign.RedesignL2AssetType.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOnboardingExperimentState.SplashL2.Redesign.RedesignL2AssetType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ SplashPageImprovement.Creative getSplashL2Creative$default(OptionOnboardingExperimentState.SplashL2.Redesign.RedesignL2AssetType redesignL2AssetType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return getSplashL2Creative(redesignL2AssetType, z);
    }

    public static final SplashPageImprovement.Creative getSplashL2Creative(OptionOnboardingExperimentState.SplashL2.Redesign.RedesignL2AssetType assetType, boolean z) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        int i = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new SplashPageImprovement.Creative.Drawable(C25121R.drawable.svg_ic_upgrade_splash_1);
        }
        if (z) {
            return new SplashPageImprovement.Creative.RemoteLottie(LottieUrl.OPTIONS_ONBOARDING_L2_NEON);
        }
        return new SplashPageImprovement.Creative.RemoteLottie(LottieUrl.OPTIONS_ONBOARDING_L2_NIGHT);
    }

    public static final String getSplashL2Title(Resources resources, DisplayName displayName, SplashL2ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
        if (displayName != null && accountTypeInCopy == SplashL2ResponseMetadataDto.AccountTypeInCopyDto.JOINT_TENANCY_WITH_ROS) {
            String string2 = resources.getString(C25121R.string.options_upgrade_splash_title_1_with_account_name, displayName.getWithAccount().getInSentence().getText(resources));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C25121R.string.options_upgrade_splash_title_1);
        Intrinsics.checkNotNull(string3);
        return string3;
    }
}
