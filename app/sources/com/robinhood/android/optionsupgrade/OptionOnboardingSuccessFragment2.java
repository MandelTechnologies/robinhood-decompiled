package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.account.strings.DisplayName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.SuccessResponseMetadataDto;

/* compiled from: OptionOnboardingSuccessFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m3636d2 = {"getSplashSuccessTitleText", "", "resources", "Landroid/content/res/Resources;", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "accountTypeInCopy", "Loptions_product/service/SuccessResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/SuccessAccountTypeInCopy;", "isL2Title", "", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingSuccessFragment2 {
    public static /* synthetic */ String getSplashSuccessTitleText$default(Resources resources, DisplayName displayName, SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopyDto, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return getSplashSuccessTitleText(resources, displayName, accountTypeInCopyDto, z);
    }

    public static final String getSplashSuccessTitleText(Resources resources, DisplayName displayName, SuccessResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
        if (displayName == null || accountTypeInCopy != SuccessResponseMetadataDto.AccountTypeInCopyDto.JOINT_TENANCY_WITH_ROS) {
            if (z) {
                String string2 = resources.getString(C25121R.string.options_upgrade_success_title_level_2);
                Intrinsics.checkNotNull(string2);
                return string2;
            }
            String string3 = resources.getString(C25121R.string.options_upgrade_success_title_level_3);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        CharSequence text = displayName.getWithAccount().getInSentence().getText(resources);
        if (z) {
            String string4 = resources.getString(C25121R.string.options_upgrade_success_title_account_name_level_2, text);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        String string5 = resources.getString(C25121R.string.options_upgrade_success_title_account_name_level_3, text);
        Intrinsics.checkNotNull(string5);
        return string5;
    }
}
