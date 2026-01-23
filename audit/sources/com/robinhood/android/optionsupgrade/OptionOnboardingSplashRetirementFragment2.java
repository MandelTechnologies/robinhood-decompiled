package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingSplashRetirementFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"getSplashRetirementTitle", "", "resources", "Landroid/content/res/Resources;", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashRetirementFragment2 {
    public static final String getSplashRetirementTitle(Resources resources, DisplayName displayName) throws Resources.NotFoundException {
        CharSequence text;
        DisplayName.Variants withAccount;
        StringResource inSentence;
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = C25121R.string.option_upgrade_retirement_splash_title_with_account_type;
        if (displayName == null || (withAccount = displayName.getWithAccount()) == null || (inSentence = withAccount.getInSentence()) == null || (text = inSentence.getText(resources)) == null) {
            text = "";
        }
        String string2 = resources.getString(i, text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
