package com.robinhood.android.onboarding.p205ui.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.helm.HelmRolloutExperiment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.HelmIntentKey;
import com.robinhood.android.onboarding.contracts.PostSignUpIntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingFundAccountDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/targets/OnboardingFundAccountDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OnboardingFundAccountDeeplinkTarget extends DeeplinkTarget4 {
    public static final OnboardingFundAccountDeeplinkTarget INSTANCE = new OnboardingFundAccountDeeplinkTarget();
    public static final int $stable = 8;

    private OnboardingFundAccountDeeplinkTarget() {
        super(DeepLinkPath.ONBOARDING_FUND_ACCOUNT.getPath(), false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        ColorTheme colorThemeFromServerValue;
        IntentKey postSignUpIntentKey;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        ApiTransferAccount.TransferAccountType transferAccountTypeFromServerValue = ApiTransferAccount.TransferAccountType.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("transfer_account_type"));
        if (transferAccountTypeFromServerValue == null) {
            transferAccountTypeFromServerValue = ApiTransferAccount.TransferAccountType.RHS;
        }
        String queryParameter = deeplinkContext.getUri().getQueryParameter("theme");
        if (queryParameter == null || (colorThemeFromServerValue = ColorTheme.INSTANCE.fromServerValue(queryParameter)) == null) {
            colorThemeFromServerValue = ColorTheme.DEFAULT;
        }
        if (deeplinkContext.getExperimentState(HelmRolloutExperiment.INSTANCE)) {
            postSignUpIntentKey = new HelmIntentKey(transferAccountTypeFromServerValue, colorThemeFromServerValue);
        } else {
            postSignUpIntentKey = new PostSignUpIntentKey(transferAccountTypeFromServerValue, false, colorThemeFromServerValue);
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), postSignUpIntentKey, null, false, 12, null)};
    }
}
