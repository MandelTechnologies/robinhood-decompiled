package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingUpsellTradeOnExpirationFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, m3636d2 = {"getOptionOnboardingUpsellTradeOnExpirationImageResId", "", ResourceTypes.STYLE, "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "getOptionOnboardingUpsellTradeOnExpirationTitle", "", "resources", "Landroid/content/res/Resources;", "account", "Lcom/robinhood/models/db/Account;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellTradeOnExpirationFragment3 {

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOnboardingStyles.values().length];
            try {
                iArr[OptionOnboardingStyles.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOnboardingStyles.RETIREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getOptionOnboardingUpsellTradeOnExpirationImageResId(OptionOnboardingStyles style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return C11303R.drawable.svg_trade_on_expiration_individual;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C11303R.drawable.svg_trade_on_expiration_retirement;
    }

    public static final String getOptionOnboardingUpsellTradeOnExpirationTitle(Resources resources, Account account) throws Resources.NotFoundException {
        CharSequence text;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        StringResource inSentence;
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = C11303R.string.trade_on_expiration_upsell_title_with_account_info;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withAccount = displayName.getWithAccount()) == null || (inSentence = withAccount.getInSentence()) == null || (text = inSentence.getText(resources)) == null) {
            text = "";
        }
        String string2 = resources.getString(i, text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
