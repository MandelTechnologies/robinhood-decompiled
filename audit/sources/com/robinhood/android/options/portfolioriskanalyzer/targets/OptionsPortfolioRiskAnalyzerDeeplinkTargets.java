package com.robinhood.android.options.portfolioriskanalyzer.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.options.p454v1.OptionPortfolioRiskAnalyzerAccountTypeDto;
import deeplinks.options.p454v1.OptionPortfolioRiskAnalyzerDeeplinkDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/targets/OptionsPortfolioRiskAnalyzerDeeplinkTargets;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerDeeplinkTargets extends DeeplinkTarget3<OptionPortfolioRiskAnalyzerDeeplinkDto> {
    public static final OptionsPortfolioRiskAnalyzerDeeplinkTargets INSTANCE = new OptionsPortfolioRiskAnalyzerDeeplinkTargets();
    public static final int $stable = 8;

    /* compiled from: OptionsPortfolioRiskAnalyzerDeeplinkTargets.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionPortfolioRiskAnalyzerAccountTypeDto.values().length];
            try {
                iArr[OptionPortfolioRiskAnalyzerAccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionPortfolioRiskAnalyzerAccountTypeDto.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionPortfolioRiskAnalyzerAccountTypeDto.IRA_ROTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionPortfolioRiskAnalyzerAccountTypeDto.IRA_TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionPortfolioRiskAnalyzerAccountTypeDto.JOINT_TENANCY_WITH_ROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OptionsPortfolioRiskAnalyzerDeeplinkTargets() {
        super(OptionPortfolioRiskAnalyzerDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(OptionsRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(OptionPortfolioRiskAnalyzerDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        try {
            String initial_underlying_id = data.getInitial_underlying_id();
            BrokerageAccountType brokerageAccountType = null;
            UUID uuidFromString = initial_underlying_id != null ? UUID.fromString(initial_underlying_id) : null;
            String account_number = data.getAccount_number();
            OptionPortfolioRiskAnalyzerAccountTypeDto account_type = data.getAccount_type();
            int i = account_type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[account_type.ordinal()];
            if (i != -1 && i != 1) {
                if (i == 2) {
                    brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
                } else if (i == 3) {
                    brokerageAccountType = BrokerageAccountType.IRA_ROTH;
                } else if (i == 4) {
                    brokerageAccountType = BrokerageAccountType.IRA_TRADITIONAL;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                }
            }
            if (account_number != null) {
                return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new OptionsPortfolioRiskAnalyzer.WithAccountNumber(account_number, uuidFromString), false, false, false, null, false, false, false, false, false, null, false, 8180, null)};
            }
            if (brokerageAccountType != null) {
                return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new OptionsPortfolioRiskAnalyzer.WithAccountType(brokerageAccountType, uuidFromString), false, false, false, null, false, false, false, false, false, null, false, 8180, null)};
            }
            return new Intent[0];
        } catch (Throwable unused) {
            return new Intent[0];
        }
    }
}
