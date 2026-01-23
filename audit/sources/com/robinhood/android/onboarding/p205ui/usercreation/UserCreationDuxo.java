package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationViewState;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;)V", "launchEmailInput", "", "flow", "Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "regionCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UserCreationDuxo extends BaseDuxo5<UserCreationState2, UserCreationState> {
    public static final int $stable = BaseDuxo5.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCreationDuxo(DuxoBundle duxoBundle) {
        super(UserCreationState2.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    public final void launchEmailInput(UserCreationFlow flow, CountryCode regionCode) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        if (flow == UserCreationFlow.TRADER && Intrinsics.areEqual(regionCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            submit(new UserCreationState.ShowEmailInputWithRewardsTakeover(regionCode));
        } else {
            submit(new UserCreationState.ShowEmailInput(regionCode));
        }
    }
}
