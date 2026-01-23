package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserCreationActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"onboardingFlowPathType", "Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "getOnboardingFlowPathType", "(Lcom/robinhood/shared/user/contracts/auth/UserCreation;)Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationActivityKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UserCreationActivity2 {

    /* compiled from: UserCreationActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationActivityKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserCreationFlow.values().length];
            try {
                iArr[UserCreationFlow.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserCreationFlow.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingFlowPathType getOnboardingFlowPathType(UserCreation userCreation) {
        int i = WhenMappings.$EnumSwitchMapping$0[userCreation.getFlow().ordinal()];
        if (i == 1) {
            return new OnboardingFlowPathType.Brokerage(userCreation.getOnboardingQueryParams());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OnboardingFlowPathType.Rhce.INSTANCE;
    }
}
