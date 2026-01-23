package com.robinhood.android.account.p060ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.charts.model.Pie;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AccountOverviewPortfolioCard.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001|BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0005HÆ\u0003J\t\u0010q\u001a\u00020\u0007HÆ\u0003J\t\u0010r\u001a\u00020\u0007HÆ\u0003J\t\u0010s\u001a\u00020\u0007HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010u\u001a\u00020\u0007HÆ\u0003JQ\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010w\u001a\u00020\u00072\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020>HÖ\u0001J\t\u0010{\u001a\u00020FHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010(\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u000e\u00101\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0014\u00107\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010,R\u000e\u00109\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0013\u0010=\u001a\u00020>8G¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010A\u001a\u00020>8G¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0013\u0010C\u001a\u00020>8G¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0011\u0010E\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001c\u0010N\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010*\u001a\u0004\bQ\u0010RR\u001c\u0010S\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010*\u001a\u0004\bU\u0010RR\u001c\u0010V\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010*\u001a\u0004\bX\u0010RR\u001c\u0010Y\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010*\u001a\u0004\b[\u0010RR\u001c\u0010\\\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010*\u001a\u0004\b^\u0010RR\u001c\u0010_\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010*\u001a\u0004\ba\u0010RR\u001c\u0010b\u001a\u00020O8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010*\u001a\u0004\bd\u0010RR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020f0J8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020f0J8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020f0J8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010hR\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020f0J8G¢\u0006\u0006\u001a\u0004\bn\u0010h¨\u0006}"}, m3636d2 = {"Lcom/robinhood/android/account/ui/PortfolioSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "accountMarketValuesLive", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "isInMcwRegionGate", "", "isOptionsSupported", "isManagedAccount", "mcwCashExplainerDisclosure", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "showDepositFundsButton", "<init>", "(Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;Lcom/robinhood/models/crypto/db/UnifiedBalances;ZZZLcom/robinhood/staticcontent/model/disclosure/Disclosure;Z)V", "getAccountMarketValuesLive", "()Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "()Z", "getMcwCashExplainerDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getShowDepositFundsButton", "showPortfolioPieChart", "getShowPortfolioPieChart", "stockMarketValue", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "optionsMarketValue", "cryptoMarketValue", "futuresMarketValue", "eventContractsMarketValue", "futuresCash", "eventContractsCash", "brokerageCash", "futuresEquity", "eventContractsEquity", "stockAndOptions", "currency", "Ljava/util/Currency;", "marginUsed", "getMarginUsed$feature_account_overview_externalRelease$annotations", "()V", "getMarginUsed$feature_account_overview_externalRelease", "()Ljava/math/BigDecimal;", AnalyticsStrings.BUTTON_GROUP_TITLE_CASH, "getCash", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "getEquity", "marketValue", "portfolioValue", "isLevered", "cumulativeValue", "weightedStockAndOptions", "getWeightedStockAndOptions$feature_account_overview_externalRelease", "weightedEquity", "getWeightedEquity$feature_account_overview_externalRelease", "weightedMarketValue", "weightedPortfolioValue", "weightedCumulativeValue", "getWeightedCumulativeValue$feature_account_overview_externalRelease", "mainSectionLabelRes", "", "getMainSectionLabelRes", "()I", "summaryTextRes", "getSummaryTextRes", "portfolioDescriptionTextRes", "getPortfolioDescriptionTextRes", "totalValueText", "", "getTotalValueText", "()Ljava/lang/String;", "rows", "", "Lcom/robinhood/android/account/ui/PortfolioSectionState$Row;", "getRows", "()Ljava/util/List;", "brokerageSlice", "", "getBrokerageSlice$feature_account_overview_externalRelease$annotations", "getBrokerageSlice$feature_account_overview_externalRelease", "()F", "cryptoSlice", "getCryptoSlice$feature_account_overview_externalRelease$annotations", "getCryptoSlice$feature_account_overview_externalRelease", "eventContractSlice", "getEventContractSlice$feature_account_overview_externalRelease$annotations", "getEventContractSlice$feature_account_overview_externalRelease", "futuresOutrightSlice", "getFuturesOutrightSlice$feature_account_overview_externalRelease$annotations", "getFuturesOutrightSlice$feature_account_overview_externalRelease", "cashOrMarginSlice", "getCashOrMarginSlice$feature_account_overview_externalRelease$annotations", "getCashOrMarginSlice$feature_account_overview_externalRelease", "marginUsedSlice", "getMarginUsedSlice$feature_account_overview_externalRelease$annotations", "getMarginUsedSlice$feature_account_overview_externalRelease", "cashSlice", "getCashSlice$feature_account_overview_externalRelease$annotations", "getCashSlice$feature_account_overview_externalRelease", "commonSlices", "Lcom/robinhood/android/charts/model/Pie$Slice;", "getCommonSlices", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "mcwSlices", "getMcwSlices", "usdOnlySlices", "getUsdOnlySlices", "slices", "getSlices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "Row", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class PortfolioSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final AccountMarketValuesLive accountMarketValuesLive;
    private final BigDecimal brokerageCash;
    private final float brokerageSlice;
    private final float cashOrMarginSlice;
    private final float cashSlice;
    private final BigDecimal cryptoMarketValue;
    private final float cryptoSlice;
    private final BigDecimal cumulativeValue;
    private final Currency currency;
    private final float eventContractSlice;
    private final BigDecimal eventContractsCash;
    private final BigDecimal eventContractsEquity;
    private final BigDecimal eventContractsMarketValue;
    private final BigDecimal futuresCash;
    private final BigDecimal futuresEquity;
    private final BigDecimal futuresMarketValue;
    private final float futuresOutrightSlice;
    private final boolean isInMcwRegionGate;
    private final boolean isLevered;
    private final boolean isManagedAccount;
    private final boolean isOptionsSupported;
    private final int mainSectionLabelRes;
    private final BigDecimal marginUsed;
    private final float marginUsedSlice;
    private final BigDecimal marketValue;
    private final Disclosure mcwCashExplainerDisclosure;
    private final BigDecimal optionsMarketValue;
    private final int portfolioDescriptionTextRes;
    private final BigDecimal portfolioValue;
    private final boolean showDepositFundsButton;
    private final boolean showPortfolioPieChart;
    private final BigDecimal stockAndOptions;
    private final BigDecimal stockMarketValue;
    private final int summaryTextRes;
    private final String totalValueText;
    private final UnifiedBalances unifiedBalances;
    private final BigDecimal weightedCumulativeValue;
    private final BigDecimal weightedMarketValue;
    private final BigDecimal weightedPortfolioValue;
    private final BigDecimal weightedStockAndOptions;

    public static /* synthetic */ PortfolioSectionState copy$default(PortfolioSectionState portfolioSectionState, AccountMarketValuesLive accountMarketValuesLive, UnifiedBalances unifiedBalances, boolean z, boolean z2, boolean z3, Disclosure disclosure, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            accountMarketValuesLive = portfolioSectionState.accountMarketValuesLive;
        }
        if ((i & 2) != 0) {
            unifiedBalances = portfolioSectionState.unifiedBalances;
        }
        if ((i & 4) != 0) {
            z = portfolioSectionState.isInMcwRegionGate;
        }
        if ((i & 8) != 0) {
            z2 = portfolioSectionState.isOptionsSupported;
        }
        if ((i & 16) != 0) {
            z3 = portfolioSectionState.isManagedAccount;
        }
        if ((i & 32) != 0) {
            disclosure = portfolioSectionState.mcwCashExplainerDisclosure;
        }
        if ((i & 64) != 0) {
            z4 = portfolioSectionState.showDepositFundsButton;
        }
        Disclosure disclosure2 = disclosure;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z;
        return portfolioSectionState.copy(accountMarketValuesLive, unifiedBalances, z7, z2, z6, disclosure2, z5);
    }

    /* renamed from: getBrokerageSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1704x187903b3() {
    }

    /* renamed from: getCashOrMarginSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1705x8b4feb9d() {
    }

    /* renamed from: getCashSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1706x5220fe4c() {
    }

    /* renamed from: getCryptoSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1707x917e60da() {
    }

    /* renamed from: getEventContractSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1708x43063279() {
    }

    /* renamed from: getFuturesOutrightSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1709x81d23a6b() {
    }

    /* renamed from: getMarginUsed$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1710x79df234() {
    }

    /* renamed from: getMarginUsedSlice$feature_account_overview_externalRelease$annotations */
    public static /* synthetic */ void m1711x52847324() {
    }

    /* renamed from: component1, reason: from getter */
    public final AccountMarketValuesLive getAccountMarketValuesLive() {
        return this.accountMarketValuesLive;
    }

    /* renamed from: component2, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsOptionsSupported() {
        return this.isOptionsSupported;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsManagedAccount() {
        return this.isManagedAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final Disclosure getMcwCashExplainerDisclosure() {
        return this.mcwCashExplainerDisclosure;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowDepositFundsButton() {
        return this.showDepositFundsButton;
    }

    public final PortfolioSectionState copy(AccountMarketValuesLive accountMarketValuesLive, UnifiedBalances unifiedBalances, boolean isInMcwRegionGate, boolean isOptionsSupported, boolean isManagedAccount, Disclosure mcwCashExplainerDisclosure, boolean showDepositFundsButton) {
        Intrinsics.checkNotNullParameter(accountMarketValuesLive, "accountMarketValuesLive");
        Intrinsics.checkNotNullParameter(unifiedBalances, "unifiedBalances");
        return new PortfolioSectionState(accountMarketValuesLive, unifiedBalances, isInMcwRegionGate, isOptionsSupported, isManagedAccount, mcwCashExplainerDisclosure, showDepositFundsButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioSectionState)) {
            return false;
        }
        PortfolioSectionState portfolioSectionState = (PortfolioSectionState) other;
        return Intrinsics.areEqual(this.accountMarketValuesLive, portfolioSectionState.accountMarketValuesLive) && Intrinsics.areEqual(this.unifiedBalances, portfolioSectionState.unifiedBalances) && this.isInMcwRegionGate == portfolioSectionState.isInMcwRegionGate && this.isOptionsSupported == portfolioSectionState.isOptionsSupported && this.isManagedAccount == portfolioSectionState.isManagedAccount && Intrinsics.areEqual(this.mcwCashExplainerDisclosure, portfolioSectionState.mcwCashExplainerDisclosure) && this.showDepositFundsButton == portfolioSectionState.showDepositFundsButton;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.accountMarketValuesLive.hashCode() * 31) + this.unifiedBalances.hashCode()) * 31) + Boolean.hashCode(this.isInMcwRegionGate)) * 31) + Boolean.hashCode(this.isOptionsSupported)) * 31) + Boolean.hashCode(this.isManagedAccount)) * 31;
        Disclosure disclosure = this.mcwCashExplainerDisclosure;
        return ((iHashCode + (disclosure == null ? 0 : disclosure.hashCode())) * 31) + Boolean.hashCode(this.showDepositFundsButton);
    }

    public String toString() {
        return "PortfolioSectionState(accountMarketValuesLive=" + this.accountMarketValuesLive + ", unifiedBalances=" + this.unifiedBalances + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ", isOptionsSupported=" + this.isOptionsSupported + ", isManagedAccount=" + this.isManagedAccount + ", mcwCashExplainerDisclosure=" + this.mcwCashExplainerDisclosure + ", showDepositFundsButton=" + this.showDepositFundsButton + ")";
    }

    public /* synthetic */ PortfolioSectionState(AccountMarketValuesLive accountMarketValuesLive, UnifiedBalances unifiedBalances, boolean z, boolean z2, boolean z3, Disclosure disclosure, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountMarketValuesLive, unifiedBalances, z, z2, z3, (i & 32) != 0 ? null : disclosure, (i & 64) != 0 ? false : z4);
    }

    public final AccountMarketValuesLive getAccountMarketValuesLive() {
        return this.accountMarketValuesLive;
    }

    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final boolean isInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    public final boolean isOptionsSupported() {
        return this.isOptionsSupported;
    }

    public final boolean isManagedAccount() {
        return this.isManagedAccount;
    }

    public final Disclosure getMcwCashExplainerDisclosure() {
        return this.mcwCashExplainerDisclosure;
    }

    public final boolean getShowDepositFundsButton() {
        return this.showDepositFundsButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioSectionState(AccountMarketValuesLive accountMarketValuesLive, UnifiedBalances unifiedBalances, boolean z, boolean z2, boolean z3, Disclosure disclosure, boolean z4) {
        BigDecimal bigDecimalAdd;
        super(CardOrder.CardIdentifier.PORTFOLIO_VALUE, null);
        Intrinsics.checkNotNullParameter(accountMarketValuesLive, "accountMarketValuesLive");
        Intrinsics.checkNotNullParameter(unifiedBalances, "unifiedBalances");
        this.accountMarketValuesLive = accountMarketValuesLive;
        this.unifiedBalances = unifiedBalances;
        this.isInMcwRegionGate = z;
        this.isOptionsSupported = z2;
        this.isManagedAccount = z3;
        this.mcwCashExplainerDisclosure = disclosure;
        this.showDepositFundsButton = z4;
        this.showPortfolioPieChart = !z3;
        BigDecimal stockMarketValue = accountMarketValuesLive.getEquityMarketValue();
        stockMarketValue = stockMarketValue == null ? BigDecimal.ZERO : stockMarketValue;
        this.stockMarketValue = stockMarketValue;
        BigDecimal optionsMarketValue = accountMarketValuesLive.getOptionMarketValue();
        optionsMarketValue = optionsMarketValue == null ? BigDecimal.ZERO : optionsMarketValue;
        this.optionsMarketValue = optionsMarketValue;
        BigDecimal cryptoMarketValue = accountMarketValuesLive.getForexMarketValue();
        cryptoMarketValue = cryptoMarketValue == null ? BigDecimal.ZERO : cryptoMarketValue;
        this.cryptoMarketValue = cryptoMarketValue;
        BigDecimal futuresMarketValue = accountMarketValuesLive.getFuturesMarketValue();
        futuresMarketValue = futuresMarketValue == null ? BigDecimal.ZERO : futuresMarketValue;
        this.futuresMarketValue = futuresMarketValue;
        BigDecimal eventContractsMarketValue = accountMarketValuesLive.getEventContractsMarketValue();
        eventContractsMarketValue = eventContractsMarketValue == null ? BigDecimal.ZERO : eventContractsMarketValue;
        this.eventContractsMarketValue = eventContractsMarketValue;
        BigDecimal futuresCash = accountMarketValuesLive.getFuturesCash();
        futuresCash = futuresCash == null ? BigDecimal.ZERO : futuresCash;
        this.futuresCash = futuresCash;
        BigDecimal eventContractsCash = accountMarketValuesLive.getEventContractsCash();
        eventContractsCash = eventContractsCash == null ? BigDecimal.ZERO : eventContractsCash;
        this.eventContractsCash = eventContractsCash;
        BigDecimal brokerageCash = accountMarketValuesLive.getBrokerageCash();
        brokerageCash = brokerageCash == null ? BigDecimal.ZERO : brokerageCash;
        this.brokerageCash = brokerageCash;
        Intrinsics.checkNotNullExpressionValue(futuresMarketValue, "futuresMarketValue");
        Intrinsics.checkNotNullExpressionValue(futuresCash, "futuresCash");
        BigDecimal bigDecimalAdd2 = futuresMarketValue.add(futuresCash);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
        this.futuresEquity = bigDecimalAdd2;
        Intrinsics.checkNotNullExpressionValue(eventContractsMarketValue, "eventContractsMarketValue");
        Intrinsics.checkNotNullExpressionValue(eventContractsCash, "eventContractsCash");
        BigDecimal bigDecimalAdd3 = eventContractsMarketValue.add(eventContractsCash);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
        this.eventContractsEquity = bigDecimalAdd3;
        Intrinsics.checkNotNullExpressionValue(stockMarketValue, "stockMarketValue");
        Intrinsics.checkNotNullExpressionValue(optionsMarketValue, "optionsMarketValue");
        BigDecimal bigDecimalAdd4 = stockMarketValue.add(optionsMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd4, "add(...)");
        this.stockAndOptions = bigDecimalAdd4;
        Currency javaCurrency = DisplayCurrencyExtensions.toJavaCurrency(accountMarketValuesLive.getDisplayCurrency());
        this.currency = javaCurrency;
        BigDecimal marginUsed = accountMarketValuesLive.getMarginUsed();
        BigDecimal marginUsed2 = marginUsed == null ? BigDecimal.ZERO : marginUsed;
        this.marginUsed = marginUsed2;
        BigDecimal bigDecimal = stockMarketValue;
        Intrinsics.checkNotNullExpressionValue(cryptoMarketValue, "cryptoMarketValue");
        BigDecimal bigDecimal2 = brokerageCash;
        BigDecimal bigDecimalAdd5 = bigDecimalAdd4.add(cryptoMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd5, "add(...)");
        Intrinsics.checkNotNullExpressionValue(futuresMarketValue, "futuresMarketValue");
        BigDecimal bigDecimalAdd6 = bigDecimalAdd5.add(futuresMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd6, "add(...)");
        Intrinsics.checkNotNullExpressionValue(eventContractsMarketValue, "eventContractsMarketValue");
        BigDecimal bigDecimalAdd7 = bigDecimalAdd6.add(eventContractsMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd7, "add(...)");
        BigDecimal cash = getCash();
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        BigDecimal bigDecimalMax = cash.max(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMax, "max(...)");
        BigDecimal bigDecimalAdd8 = bigDecimalAdd7.add(bigDecimalMax);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd8, "add(...)");
        this.marketValue = bigDecimalAdd8;
        Intrinsics.checkNotNullExpressionValue(cryptoMarketValue, "cryptoMarketValue");
        BigDecimal bigDecimalAdd9 = bigDecimalAdd4.add(cryptoMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd9, "add(...)");
        Intrinsics.checkNotNullExpressionValue(futuresMarketValue, "futuresMarketValue");
        BigDecimal bigDecimalAdd10 = bigDecimalAdd9.add(futuresMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd10, "add(...)");
        Intrinsics.checkNotNullExpressionValue(eventContractsMarketValue, "eventContractsMarketValue");
        BigDecimal bigDecimalAdd11 = bigDecimalAdd10.add(eventContractsMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd11, "add(...)");
        BigDecimal bigDecimalAdd12 = bigDecimalAdd11.add(getCash());
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd12, "add(...)");
        this.portfolioValue = bigDecimalAdd12;
        boolean z5 = marginUsed2.compareTo(bigDecimal3) > 0;
        this.isLevered = z5;
        bigDecimalAdd8 = z5 ? bigDecimalAdd8 : bigDecimalAdd12;
        this.cumulativeValue = bigDecimalAdd8;
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        boolean z6 = z5;
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        Intrinsics.checkNotNullExpressionValue(optionsMarketValue, "optionsMarketValue");
        BigDecimal bigDecimalAdd13 = bigDecimalAbs.add(optionsMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd13, "add(...)");
        this.weightedStockAndOptions = bigDecimalAdd13;
        if (z) {
            BigDecimal bigDecimalAbs2 = getWeightedEquity$feature_account_overview_externalRelease().abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
            Intrinsics.checkNotNullExpressionValue(cryptoMarketValue, "cryptoMarketValue");
            BigDecimal bigDecimalAdd14 = bigDecimalAbs2.add(cryptoMarketValue);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd14, "add(...)");
            Intrinsics.checkNotNullExpressionValue(futuresMarketValue, "futuresMarketValue");
            BigDecimal bigDecimalAdd15 = bigDecimalAdd14.add(futuresMarketValue);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd15, "add(...)");
            Intrinsics.checkNotNullExpressionValue(eventContractsMarketValue, "eventContractsMarketValue");
            BigDecimal bigDecimalAdd16 = bigDecimalAdd15.add(eventContractsMarketValue);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd16, "add(...)");
            BigDecimal bigDecimalAdd17 = bigDecimalAdd16.add(getCash());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd17, "add(...)");
            Intrinsics.checkNotNullExpressionValue(marginUsed2, "marginUsed");
            bigDecimalAdd = bigDecimalAdd17.add(marginUsed2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        } else {
            Intrinsics.checkNotNullExpressionValue(cryptoMarketValue, "cryptoMarketValue");
            BigDecimal bigDecimalAdd18 = bigDecimalAdd13.add(cryptoMarketValue);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd18, "add(...)");
            Intrinsics.checkNotNullExpressionValue(futuresMarketValue, "futuresMarketValue");
            BigDecimal bigDecimalAdd19 = bigDecimalAdd18.add(futuresMarketValue);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd19, "add(...)");
            Intrinsics.checkNotNullExpressionValue(eventContractsMarketValue, "eventContractsMarketValue");
            BigDecimal bigDecimalAdd20 = bigDecimalAdd19.add(eventContractsMarketValue);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd20, "add(...)");
            BigDecimal bigDecimalMax2 = getCash().max(bigDecimal3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMax2, "max(...)");
            bigDecimalAdd = bigDecimalAdd20.add(bigDecimalMax2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        this.weightedMarketValue = bigDecimalAdd;
        Intrinsics.checkNotNullExpressionValue(cryptoMarketValue, "cryptoMarketValue");
        BigDecimal bigDecimalAdd21 = bigDecimalAdd13.add(cryptoMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd21, "add(...)");
        Intrinsics.checkNotNullExpressionValue(futuresMarketValue, "futuresMarketValue");
        BigDecimal bigDecimalAdd22 = bigDecimalAdd21.add(futuresMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd22, "add(...)");
        Intrinsics.checkNotNullExpressionValue(eventContractsMarketValue, "eventContractsMarketValue");
        BigDecimal bigDecimalAdd23 = bigDecimalAdd22.add(eventContractsMarketValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd23, "add(...)");
        BigDecimal bigDecimalAdd24 = bigDecimalAdd23.add(getCash());
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd24, "add(...)");
        this.weightedPortfolioValue = bigDecimalAdd24;
        bigDecimalAdd = z6 ? bigDecimalAdd : bigDecimalAdd24;
        this.weightedCumulativeValue = bigDecimalAdd;
        this.mainSectionLabelRes = z6 ? C8159R.string.account_overview_market_value_section_label : C8159R.string.account_overview_portfolio_section_label;
        this.summaryTextRes = z6 ? C8159R.string.account_overview_market_value_section_summary : C8159R.string.account_overview_portfolio_section_summary;
        this.portfolioDescriptionTextRes = z6 ? C8159R.string.account_overview_market_value_label : C8159R.string.account_overview_portfolio_label;
        this.totalValueText = Money.format$default(Money3.toMoney(bigDecimalAdd8, javaCurrency), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.brokerageSlice = BigDecimals7.safeDivide(z6 ? getWeightedEquity$feature_account_overview_externalRelease().abs() : bigDecimalAdd13.abs(), bigDecimalAdd).floatValue();
        this.cryptoSlice = BigDecimals7.safeDivide(cryptoMarketValue, bigDecimalAdd).floatValue();
        this.eventContractSlice = BigDecimals7.safeDivide(bigDecimalAdd3, bigDecimalAdd).floatValue();
        this.futuresOutrightSlice = BigDecimals7.safeDivide(bigDecimalAdd2, bigDecimalAdd).floatValue();
        this.cashOrMarginSlice = BigDecimals7.safeDivide(bigDecimal2.abs(), bigDecimalAdd).floatValue();
        this.marginUsedSlice = BigDecimals7.safeDivide(marginUsed2, bigDecimalAdd).floatValue();
        this.cashSlice = BigDecimals7.safeDivide(getCash(), bigDecimalAdd).floatValue();
    }

    /* compiled from: AccountOverviewPortfolioCard.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/account/ui/PortfolioSectionState$Row;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "", "showInfoIcon", "", "onClickInfoIcon", "Lkotlin/Function1;", "Lcom/robinhood/android/account/ui/PortfolioSectionCallbacks;", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "()Ljava/lang/String;", "getShowInfoIcon", "()Z", "getOnClickInfoIcon", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = StringResource.$stable;
        private final StringResource label;
        private final Function1<AccountOverviewPortfolioCard3, Unit> onClickInfoIcon;
        private final boolean showInfoIcon;
        private final String value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Row copy$default(Row row, StringResource stringResource, String str, boolean z, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = row.label;
            }
            if ((i & 2) != 0) {
                str = row.value;
            }
            if ((i & 4) != 0) {
                z = row.showInfoIcon;
            }
            if ((i & 8) != 0) {
                function1 = row.onClickInfoIcon;
            }
            return row.copy(stringResource, str, z, function1);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowInfoIcon() {
            return this.showInfoIcon;
        }

        public final Function1<AccountOverviewPortfolioCard3, Unit> component4() {
            return this.onClickInfoIcon;
        }

        public final Row copy(StringResource label, String value, boolean showInfoIcon, Function1<? super AccountOverviewPortfolioCard3, Unit> onClickInfoIcon) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Row(label, value, showInfoIcon, onClickInfoIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.value, row.value) && this.showInfoIcon == row.showInfoIcon && Intrinsics.areEqual(this.onClickInfoIcon, row.onClickInfoIcon);
        }

        public int hashCode() {
            int iHashCode = ((((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.showInfoIcon)) * 31;
            Function1<AccountOverviewPortfolioCard3, Unit> function1 = this.onClickInfoIcon;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        public String toString() {
            return "Row(label=" + this.label + ", value=" + this.value + ", showInfoIcon=" + this.showInfoIcon + ", onClickInfoIcon=" + this.onClickInfoIcon + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Row(StringResource label, String value, boolean z, Function1<? super AccountOverviewPortfolioCard3, Unit> function1) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
            this.showInfoIcon = z;
            this.onClickInfoIcon = function1;
        }

        public /* synthetic */ Row(StringResource stringResource, String str, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function1);
        }

        public final StringResource getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public final boolean getShowInfoIcon() {
            return this.showInfoIcon;
        }

        public final Function1<AccountOverviewPortfolioCard3, Unit> getOnClickInfoIcon() {
            return this.onClickInfoIcon;
        }
    }

    public final boolean getShowPortfolioPieChart() {
        return this.showPortfolioPieChart;
    }

    /* renamed from: getMarginUsed$feature_account_overview_externalRelease, reason: from getter */
    public final BigDecimal getMarginUsed() {
        return this.marginUsed;
    }

    private final BigDecimal getCash() {
        BigDecimal cash = this.accountMarketValuesLive.getCash();
        if (cash == null) {
            cash = BigDecimal.ZERO;
        }
        if (this.isInMcwRegionGate) {
            Intrinsics.checkNotNull(cash);
            BigDecimal marginUsed = this.marginUsed;
            Intrinsics.checkNotNullExpressionValue(marginUsed, "marginUsed");
            BigDecimal bigDecimalAdd = cash.add(marginUsed);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            return bigDecimalAdd;
        }
        Intrinsics.checkNotNull(cash);
        return cash;
    }

    private final BigDecimal getEquity() {
        if (this.isInMcwRegionGate) {
            BigDecimal bigDecimal = this.stockAndOptions;
            BigDecimal marginUsed = this.marginUsed;
            Intrinsics.checkNotNullExpressionValue(marginUsed, "marginUsed");
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(marginUsed);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return bigDecimalSubtract;
        }
        BigDecimal bigDecimal2 = this.stockAndOptions;
        BigDecimal brokerageCash = this.brokerageCash;
        Intrinsics.checkNotNullExpressionValue(brokerageCash, "brokerageCash");
        BigDecimal bigDecimalAdd = bigDecimal2.add(brokerageCash);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    /* renamed from: getWeightedStockAndOptions$feature_account_overview_externalRelease, reason: from getter */
    public final BigDecimal getWeightedStockAndOptions() {
        return this.weightedStockAndOptions;
    }

    public final BigDecimal getWeightedEquity$feature_account_overview_externalRelease() {
        if (this.isInMcwRegionGate) {
            BigDecimal bigDecimal = this.weightedStockAndOptions;
            BigDecimal marginUsed = this.marginUsed;
            Intrinsics.checkNotNullExpressionValue(marginUsed, "marginUsed");
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(marginUsed);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return bigDecimalSubtract;
        }
        BigDecimal bigDecimal2 = this.weightedStockAndOptions;
        BigDecimal brokerageCash = this.brokerageCash;
        Intrinsics.checkNotNullExpressionValue(brokerageCash, "brokerageCash");
        BigDecimal bigDecimalAdd = bigDecimal2.add(brokerageCash);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    /* renamed from: getWeightedCumulativeValue$feature_account_overview_externalRelease, reason: from getter */
    public final BigDecimal getWeightedCumulativeValue() {
        return this.weightedCumulativeValue;
    }

    public final int getMainSectionLabelRes() {
        return this.mainSectionLabelRes;
    }

    public final int getSummaryTextRes() {
        return this.summaryTextRes;
    }

    public final int getPortfolioDescriptionTextRes() {
        return this.portfolioDescriptionTextRes;
    }

    public final String getTotalValueText() {
        return this.totalValueText;
    }

    public final List<Row> getRows() {
        int i;
        String str;
        StringResource stringResourceInvoke;
        String str2;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isLevered) {
            i = C8159R.string.account_overview_equity;
        } else {
            i = this.isOptionsSupported ? C8159R.string.account_overview_stock_and_options : C8159R.string.account_overview_stock;
        }
        StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
        if (this.isLevered) {
            str = Money.format$default(Money3.toMoney(getEquity(), this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        } else {
            str = Money.format$default(Money3.toMoney(this.stockAndOptions, this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        Row row = new Row(stringResourceInvoke2, str, false, null, 12, null);
        StringResource stringResourceInvoke3 = companion.invoke(C8159R.string.account_overview_crypto_equity, new Object[0]);
        BigDecimal cryptoMarketValue = this.cryptoMarketValue;
        Intrinsics.checkNotNullExpressionValue(cryptoMarketValue, "cryptoMarketValue");
        Row row2 = BigDecimals7.isPositive(this.cryptoMarketValue) ? new Row(stringResourceInvoke3, Money.format$default(Money3.toMoney(cryptoMarketValue, this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), false, null, 12, null) : null;
        Row row3 = new Row(companion.invoke(C8159R.string.account_overview_futures_equity, new Object[0]), Money.format$default(Money3.toMoney(this.futuresEquity, this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), false, null, 12, null);
        if (BigDecimals7.isZero(this.futuresEquity)) {
            row3 = null;
        }
        Row row4 = !BigDecimals7.isZero(this.eventContractsEquity) ? new Row(companion.invoke(C8159R.string.account_overview_event_contract_equity, new Object[0]), Money.format$default(Money3.toMoney(this.eventContractsEquity, this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), false, null, 12, null) : null;
        if (!this.isLevered) {
            stringResourceInvoke = companion.invoke(C8159R.string.account_overview_cash_label, new Object[0]);
        } else if (this.unifiedBalances.getBrokerageBalances().getAccount().isInstant()) {
            stringResourceInvoke = companion.invoke(C8159R.string.account_overview_levered_amount_label_cash_account, new Object[0]);
        } else {
            stringResourceInvoke = companion.invoke(C8159R.string.account_overview_levered_amount_label, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        if (this.isLevered) {
            BigDecimal marginUsed = this.marginUsed;
            Intrinsics.checkNotNullExpressionValue(marginUsed, "marginUsed");
            str2 = Money.format$default(Money3.toMoney(marginUsed, this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        } else {
            BigDecimal bigDecimalAbs = this.brokerageCash.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            str2 = Money.format$default(Money3.toMoney(bigDecimalAbs, this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        Row row5 = (this.isLevered || !this.isInMcwRegionGate) ? new Row(stringResource, str2, false, null, 12, null) : null;
        Row row6 = new Row(companion.invoke(C8159R.string.account_overview_cash_label, new Object[0]), Money.format$default(Money3.toMoney(getCash(), this.currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), true, new Function1() { // from class: com.robinhood.android.account.ui.PortfolioSectionState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioSectionState._get_rows_$lambda$4(this.f$0, (AccountOverviewPortfolioCard3) obj);
            }
        });
        if (!this.isInMcwRegionGate || !BigDecimals7.isPositive(getCash())) {
            row6 = null;
        }
        return CollectionsKt.listOfNotNull((Object[]) new Row[]{row, row2, row3, row4, row5, row6});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_rows_$lambda$4(PortfolioSectionState portfolioSectionState, AccountOverviewPortfolioCard3 callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        callbacks.onPortfolioCashInfoIconClicked(portfolioSectionState.mcwCashExplainerDisclosure);
        return Unit.INSTANCE;
    }

    /* renamed from: getBrokerageSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getBrokerageSlice() {
        return this.brokerageSlice;
    }

    /* renamed from: getCryptoSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getCryptoSlice() {
        return this.cryptoSlice;
    }

    /* renamed from: getEventContractSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getEventContractSlice() {
        return this.eventContractSlice;
    }

    /* renamed from: getFuturesOutrightSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getFuturesOutrightSlice() {
        return this.futuresOutrightSlice;
    }

    /* renamed from: getCashOrMarginSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getCashOrMarginSlice() {
        return this.cashOrMarginSlice;
    }

    /* renamed from: getMarginUsedSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getMarginUsedSlice() {
        return this.marginUsedSlice;
    }

    /* renamed from: getCashSlice$feature_account_overview_externalRelease, reason: from getter */
    public final float getCashSlice() {
        return this.cashSlice;
    }

    @JvmName
    private final List<Pie.Slice> getCommonSlices(Composer composer, int i) {
        composer.startReplaceGroup(-1311065968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1311065968, i, -1, "com.robinhood.android.account.ui.PortfolioSectionState.<get-commonSlices> (AccountOverviewPortfolioCard.kt:260)");
        }
        float f = this.brokerageSlice;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Pie.Slice slice = new Pie.Slice(f, bentoTheme.getColors(composer, i2).getPrime(), null, 4, null);
        Pie.Slice slice2 = new Pie.Slice(this.cryptoSlice, bentoTheme.getColors(composer, i2).getUv(), null, 4, null);
        float fAbs = Math.abs(this.eventContractSlice);
        long prime = bentoTheme.getColors(composer, i2).getPrime();
        composer.startReplaceGroup(-1508962933);
        Color colorM6701boximpl = this.eventContractSlice < 0.0f ? Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU()) : null;
        composer.endReplaceGroup();
        List<Pie.Slice> listListOf = CollectionsKt.listOf((Object[]) new Pie.Slice[]{slice, slice2, new Pie.Slice(fAbs, prime, colorM6701boximpl, null), new Pie.Slice(Math.abs(this.futuresOutrightSlice), bentoTheme.getColors(composer, i2).getPrime(), this.futuresOutrightSlice < 0.0f ? Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU()) : null, null)});
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listListOf;
    }

    @JvmName
    private final List<Pie.Slice> getMcwSlices(Composer composer, int i) {
        long biome;
        composer.startReplaceGroup(-948380682);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-948380682, i, -1, "com.robinhood.android.account.ui.PortfolioSectionState.<get-mcwSlices> (AccountOverviewPortfolioCard.kt:283)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.addSpread(getCommonSlices(composer, i & 14).toArray(new Pie.Slice[0]));
        float f = this.marginUsedSlice;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        spreadBuilder.add(new Pie.Slice(f, bentoTheme.getColors(composer, i2).getJet(), null, 4, null));
        float f2 = this.cashSlice;
        if (this.isLevered) {
            composer.startReplaceGroup(-913723827);
            biome = bentoTheme.getColors(composer, i2).getHydro();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-913655379);
            biome = bentoTheme.getColors(composer, i2).getBiome();
            composer.endReplaceGroup();
        }
        spreadBuilder.add(new Pie.Slice(f2, biome, null, 4, null));
        List listListOf = CollectionsKt.listOf(spreadBuilder.toArray(new Pie.Slice[spreadBuilder.size()]));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (!(((Pie.Slice) obj).getValue() == 0.0f)) {
                arrayList.add(obj);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return arrayList;
    }

    @JvmName
    private final List<Pie.Slice> getUsdOnlySlices(Composer composer, int i) {
        composer.startReplaceGroup(-735376874);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-735376874, i, -1, "com.robinhood.android.account.ui.PortfolioSectionState.<get-usdOnlySlices> (AccountOverviewPortfolioCard.kt:301)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(getCommonSlices(composer, i & 14).toArray(new Pie.Slice[0]));
        spreadBuilder.add(new Pie.Slice(this.cashOrMarginSlice, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getBiome(), null, 4, null));
        List listListOf = CollectionsKt.listOf(spreadBuilder.toArray(new Pie.Slice[spreadBuilder.size()]));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (!(((Pie.Slice) obj).getValue() == 0.0f)) {
                arrayList.add(obj);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return arrayList;
    }

    @JvmName
    public final List<Pie.Slice> getSlices(Composer composer, int i) {
        List<Pie.Slice> usdOnlySlices;
        composer.startReplaceGroup(1652299002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1652299002, i, -1, "com.robinhood.android.account.ui.PortfolioSectionState.<get-slices> (AccountOverviewPortfolioCard.kt:311)");
        }
        if (this.isInMcwRegionGate) {
            composer.startReplaceGroup(-1278556957);
            usdOnlySlices = getMcwSlices(composer, i & 14);
        } else {
            composer.startReplaceGroup(-1278556473);
            usdOnlySlices = getUsdOnlySlices(composer, i & 14);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return usdOnlySlices;
    }
}
