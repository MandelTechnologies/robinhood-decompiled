package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.optionsupgrade.SplashPageImprovement;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.SplashL0ResponseMetadataDto;

/* compiled from: OptionOnboardingSplashL0Fragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0007\u001a\u001a\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"getSplashL0Title", "", "resources", "Landroid/content/res/Resources;", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "accountTypeInCopy", "Loptions_product/service/SplashL0ResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/SplashL0AccountTypeInCopy;", "getSplashL0Creative", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "isLottie", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0FragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashL0Fragment2 {

    /* compiled from: OptionOnboardingSplashL0Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0FragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getSplashL0Title(Resources resources, DisplayName displayName, SplashL0ResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
        if (displayName == null || accountTypeInCopy == SplashL0ResponseMetadataDto.AccountTypeInCopyDto.NONE) {
            String string2 = resources.getString(C25121R.string.option_upgrade_splash_page_one_title);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C25121R.string.option_upgrade_splash_page_one_title_with_multiple_account, displayName.getWithAccount().getInSentence().getText(resources));
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static /* synthetic */ SplashPageImprovement.Creative getSplashL0Creative$default(boolean z, DayNightOverlay dayNightOverlay, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            dayNightOverlay = DayNightOverlay.DAY;
        }
        return getSplashL0Creative(z, dayNightOverlay);
    }

    public static final SplashPageImprovement.Creative getSplashL0Creative(boolean z, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        if (z) {
            int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
            if (i == 1) {
                return new SplashPageImprovement.Creative.RemoteLottie(LottieUrl.OPTIONS_ONBOARDING_L0_DAY);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new SplashPageImprovement.Creative.RemoteLottie(LottieUrl.OPTIONS_ONBOARDING_L0_NIGHT);
        }
        return new SplashPageImprovement.Creative.Drawable(C25121R.drawable.svg_ic_options_chess);
    }
}
