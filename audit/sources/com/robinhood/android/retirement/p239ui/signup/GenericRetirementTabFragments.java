package com.robinhood.android.retirement.p239ui.signup;

import android.content.Context;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementIneligibleBottomSheetKey;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment;
import com.robinhood.android.retirement.p239ui.signup.RetirementSignUpEvent;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericRetirementTabFragments.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"TAG_INELIGIBLE_BOTTOM_SHEET", "", "consumeSignUpEvent", "", "Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "event", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent;", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.signup.GenericRetirementTabFragmentsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GenericRetirementTabFragments {
    public static final String TAG_INELIGIBLE_BOTTOM_SHEET = "retirement-signup-ineligible";

    public static final void consumeSignUpEvent(GenericRetirementTabFragment genericRetirementTabFragment, RetirementSignUpEvent event) {
        Intrinsics.checkNotNullParameter(genericRetirementTabFragment, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof RetirementSignUpEvent.Eligible) {
            Navigator navigator = genericRetirementTabFragment.getNavigator();
            Context contextRequireContext = genericRetirementTabFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RetirementSignUpEvent.Eligible eligible = (RetirementSignUpEvent.Eligible) event;
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RetirementSignUp(eligible.getIntro(), null, false, eligible.getEntryPoint(), false, eligible.getManagementTypeSelection(), null, 86, null), null, false, null, null, 60, null);
            return;
        }
        if (event instanceof RetirementSignUpEvent.Error) {
            AbsErrorHandler.handleError$default(genericRetirementTabFragment.getActivityErrorHandler(), ((RetirementSignUpEvent.Error) event).getCause(), false, 2, null);
        } else {
            if (!(event instanceof RetirementSignUpEvent.Ineligible)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.createDialogFragment$default(genericRetirementTabFragment.getNavigator(), new RetirementIneligibleBottomSheetKey(((RetirementSignUpEvent.Ineligible) event).getBottomSheet(), genericRetirementTabFragment.getEventScreen(), false, 4, null), null, 2, null).show(genericRetirementTabFragment.getChildFragmentManager(), TAG_INELIGIBLE_BOTTOM_SHEET);
        }
    }
}
