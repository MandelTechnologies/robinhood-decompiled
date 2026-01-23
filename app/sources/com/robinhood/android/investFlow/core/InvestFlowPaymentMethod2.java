package com.robinhood.android.investFlow.core;

import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowPaymentMethod.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, m3636d2 = {"createInvestFlowPaymentMethod", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.core.InvestFlowPaymentMethodKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowPaymentMethod2 {

    /* compiled from: InvestFlowPaymentMethod.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.core.InvestFlowPaymentMethodKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InvestFlowPaymentMethod createInvestFlowPaymentMethod(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        int i = WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.ordinal()];
        if (i == 1) {
            if (achRelationship == null) {
                throw new IllegalStateException("Need a non-null achRelationship for ACH sourceOfFunds");
            }
            return new InvestFlowPaymentMethod.Ach(achRelationship);
        }
        if (i == 2) {
            return InvestFlowPaymentMethod.BuyingPower.INSTANCE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Direct deposit not supported in invest flow");
    }
}
