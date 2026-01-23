package com.robinhood.android.retirement.onboarding.agreements;

import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingAgreement;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.lib.Agreements3;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSignedAgreements;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementAgreementsDataState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u0005\u001a\u0010\u0010\u0006\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\t"}, m3636d2 = {"toSignedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "slipCheckboxStates", "", "Lcom/robinhood/android/retirement/onboarding/agreements/SlipCheckboxState;", "toLoggingContext", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext;", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementsDataStateKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementAgreementsDataState3 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RetirementSignUpFlowSignedAgreements toSignedAgreements(ApiRetirementSignUpFlow apiRetirementSignUpFlow, List<SlipCheckboxState> slipCheckboxStates) {
        ApiRetirementSignUpFlow.RetirementAgreementViewModel slip_custodian_agreement;
        ApiRetirementSignUpFlow.RetirementAgreementViewModel slip_lending_agreement;
        Intrinsics.checkNotNullParameter(apiRetirementSignUpFlow, "<this>");
        Intrinsics.checkNotNullParameter(slipCheckboxStates, "slipCheckboxStates");
        ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel slip_agreements = apiRetirementSignUpFlow.getSlip_agreements();
        ApiRetirementOnboardingAgreement agreement = null;
        if (slip_agreements != null) {
            List<SlipCheckboxState> list = slipCheckboxStates;
            if ((list instanceof Collection) && list.isEmpty()) {
                slip_agreements = null;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((SlipCheckboxState) it.next()).isChecked()) {
                        break;
                    }
                }
                slip_agreements = null;
            }
        }
        ApiRetirementOnboardingAgreement agreement2 = Agreements3.toAgreement(apiRetirementSignUpFlow.getAccount_agreement_view_model());
        ApiRetirementOnboardingAgreement agreement3 = (slip_agreements == null || (slip_lending_agreement = slip_agreements.getSlip_lending_agreement()) == null) ? null : Agreements3.toAgreement(slip_lending_agreement);
        if (slip_agreements != null && (slip_custodian_agreement = slip_agreements.getSlip_custodian_agreement()) != null) {
            agreement = Agreements3.toAgreement(slip_custodian_agreement);
        }
        return new RetirementSignUpFlowSignedAgreements(agreement2, slipCheckboxStates, agreement3, agreement);
    }

    public static final SlipOnboardingCheckboxContext.CheckboxState toLoggingContext(SlipCheckboxState slipCheckboxState) {
        Boolean boolValueOf = slipCheckboxState != null ? Boolean.valueOf(slipCheckboxState.isChecked()) : null;
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            return SlipOnboardingCheckboxContext.CheckboxState.CHECKED;
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return SlipOnboardingCheckboxContext.CheckboxState.UNCHECKED;
        }
        if (boolValueOf != null) {
            throw new NoWhenBranchMatchedException();
        }
        return SlipOnboardingCheckboxContext.CheckboxState.NONE;
    }

    public static final SlipOnboardingCheckboxContext toLoggingContext(List<SlipCheckboxState> list) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<SlipCheckboxState> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SlipCheckboxState) next).getAccountType() == BrokerageAccountType.INDIVIDUAL) {
                break;
            }
        }
        SlipOnboardingCheckboxContext.CheckboxState loggingContext = toLoggingContext((SlipCheckboxState) next);
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((SlipCheckboxState) next2).getAccountType() == BrokerageAccountType.IRA_ROTH) {
                break;
            }
        }
        SlipOnboardingCheckboxContext.CheckboxState loggingContext2 = toLoggingContext((SlipCheckboxState) next2);
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (((SlipCheckboxState) next3).getAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                break;
            }
        }
        SlipOnboardingCheckboxContext.CheckboxState loggingContext3 = toLoggingContext((SlipCheckboxState) next3);
        Iterator<T> it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next4 = it4.next();
            if (((SlipCheckboxState) next4).getAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                obj = next4;
                break;
            }
        }
        return new SlipOnboardingCheckboxContext(loggingContext, loggingContext2, loggingContext3, toLoggingContext((SlipCheckboxState) obj), null, 16, null);
    }
}
