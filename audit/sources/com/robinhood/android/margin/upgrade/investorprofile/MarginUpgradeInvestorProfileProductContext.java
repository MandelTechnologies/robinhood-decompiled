package com.robinhood.android.margin.upgrade.investorprofile;

import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeInvestorProfileProductContext.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"getInvestorProfileProductContext", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "feature-margin-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.investorprofile.MarginUpgradeInvestorProfileProductContextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeInvestorProfileProductContext {

    /* compiled from: MarginUpgradeInvestorProfileProductContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.investorprofile.MarginUpgradeInvestorProfileProductContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getInvestorProfileProductContext(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        int i = WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()];
        return (i == 1 || i != 2) ? QuestionnaireContexts.SUITABILITY : QuestionnaireContexts.JOINT_ACCOUNT_SECOND_TRADE;
    }
}
