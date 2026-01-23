package com.robinhood.android.retirement.lib.onboarding;

import android.content.Context;
import com.robinhood.android.maxonboarding.PostSignUpLastKnownContextManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.PostSignUpIntentKey;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.lib.RetirementFlowDeeplinkExitManager;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementPostSignupFlowLauncher.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"launchPostSignUpIfFromOnboardingUpsell", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "lib-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.onboarding.RetirementPostSignupFlowLauncherKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementPostSignupFlowLauncher {
    public static final void launchPostSignUpIfFromOnboardingUpsell(Navigator navigator, Context context) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        RetirementLastKnownEntryPointManager retirementLastKnownEntryPointManager = RetirementLastKnownEntryPointManager.INSTANCE;
        if (retirementLastKnownEntryPointManager.isFromRhfOnboarding() && !Intrinsics.areEqual(RetirementFlowDeeplinkExitManager.INSTANCE.getRetirementSignUpFlowExitedByDeeplink(), Boolean.TRUE)) {
            PostSignUpLastKnownContextManager postSignUpLastKnownContextManager = PostSignUpLastKnownContextManager.INSTANCE;
            ApiTransferAccount.TransferAccountType accountType = postSignUpLastKnownContextManager.getAccountType();
            if (accountType == null) {
                accountType = ApiTransferAccount.TransferAccountType.RHS;
            }
            postSignUpLastKnownContextManager.setAccountType(accountType);
            Navigator.DefaultImpls.startActivity$default(navigator, context, new PostSignUpIntentKey(accountType, true, retirementLastKnownEntryPointManager.getTheme()), null, false, null, null, 60, null);
            retirementLastKnownEntryPointManager.setFromRhfOnboarding(false);
        }
        RetirementFlowDeeplinkExitManager.INSTANCE.setRetirementSignUpFlowExitedByDeeplink(Boolean.FALSE);
    }
}
