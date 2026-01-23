package com.robinhood.android.optionsrolling.p209ui;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.options.rolling.OptionRollingContentful;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.android.optionsrolling.p209ui.view.RollingContractCardView;
import com.robinhood.android.optionsrolling.p209ui.view.RollingSubheaderView;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.temporal.ChronoUnit;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionRollingStrategyViewState.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001uB\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\\\u001a\u00020\t2\u0006\u0010]\u001a\u00020^J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010g\u001a\u00020\tHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010n\u001a\u00020\u000bHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÂ\u0003J\u0091\u0001\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001J\u0013\u0010q\u001a\u00020\u000b2\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010s\u001a\u00020`HÖ\u0001J\t\u0010t\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0010\u00101\u001a\u0004\u0018\u00010,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u00107R\u0013\u00108\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010>\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0013\u0010D\u001a\u0004\u0018\u00010E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u0004\u0018\u00010I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010L\u001a\u0004\u0018\u00010I¢\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u000e\u0010N\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030Q\u0018\u00010P¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010T\u001a\u0004\u0018\u00010U¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\u0004\u0018\u00010`8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010c\u001a\u0004\ba\u0010b¨\u0006v"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyViewState;", "", "account", "Lcom/robinhood/models/db/Account;", "existingPositionQuote", "Lcom/robinhood/models/db/OptionQuote;", "existingPositionStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "existingStrategyCode", "", "hasMultipleAccounts", "", "availableQuantity", "Ljava/math/BigDecimal;", "pendingClosingQuantity", "selectedOptionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "selectedOptionInstrumentQuote", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "inOptionsOrderFormDefaultExperiment", "isUk", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionQuote;Lcom/robinhood/models/ui/UiOptionStrategyInfo;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionQuote;Lcom/robinhood/models/ui/UiOptionChain;ZZ)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getExistingPositionQuote", "()Lcom/robinhood/models/db/OptionQuote;", "getExistingPositionStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getExistingStrategyCode", "()Ljava/lang/String;", "getHasMultipleAccounts", "()Z", "getAvailableQuantity", "()Ljava/math/BigDecimal;", "getPendingClosingQuantity", "getSelectedOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getSelectedOptionInstrumentQuote", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getInOptionsOrderFormDefaultExperiment", "existingOpeningPositionType", "Lcom/robinhood/models/db/OptionPositionType;", "getExistingOpeningPositionType", "()Lcom/robinhood/models/db/OptionPositionType;", "existingOptionInstrument", "getExistingOptionInstrument", "existingClosingPositionType", "existingPositionCardData", "Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$RollingContractCardData;", "getExistingPositionCardData", "()Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$RollingContractCardData;", "isCashAccount", "Ljava/lang/Boolean;", "selectedPositionCardData", "getSelectedPositionCardData", "selectedPositionStatsData", "Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData;", "getSelectedPositionStatsData", "()Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData;", "contractSelectorIntentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "getContractSelectorIntentKey", "()Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "initialContractSelectorIntentKey", "getInitialContractSelectorIntentKey", "optionOrderFormIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "getOptionOrderFormIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "existingContractStatsKey", "Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "getExistingContractStatsKey", "()Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "selectedContractStatsKey", "getSelectedContractStatsKey", "showSwitchToMarginOldFlow", "instantCashSwitchToMarginInputParams", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "getInstantCashSwitchToMarginInputParams", "()Ljava/util/Map;", "rollingBlockingState", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyViewState$RollingBlockingState;", "getRollingBlockingState", "()Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyViewState$RollingBlockingState;", "riskDisclosureContentful", "Lcom/robinhood/android/common/options/rolling/OptionRollingContentful;", "getRiskDisclosureContentful", "()Lcom/robinhood/android/common/options/rolling/OptionRollingContentful;", "getToolbarTitle", "res", "Landroid/content/res/Resources;", "riskDisclosureMenuItemStringRes", "", "getRiskDisclosureMenuItemStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "RollingBlockingState", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionRollingStrategyViewState {
    public static final int $stable = 8;
    private final Account account;
    private final BigDecimal availableQuantity;
    private final OptionChainIntentKey contractSelectorIntentKey;
    private final OptionPositionType existingClosingPositionType;
    private final OptionStatisticsFragmentKey existingContractStatsKey;
    private final OptionPositionType existingOpeningPositionType;
    private final OptionInstrument existingOptionInstrument;
    private final RollingContractCardView.RollingContractCardData existingPositionCardData;
    private final OptionQuote existingPositionQuote;
    private final UiOptionStrategyInfo existingPositionStrategyInfo;
    private final String existingStrategyCode;
    private final boolean hasMultipleAccounts;
    private final boolean inOptionsOrderFormDefaultExperiment;
    private final OptionChainIntentKey initialContractSelectorIntentKey;
    private final Map<String, JsonPrimitive<?>> instantCashSwitchToMarginInputParams;
    private final Boolean isCashAccount;
    private final boolean isUk;
    private final OptionOrderIntentKey.FromOptionOrderBundle optionOrderFormIntentKey;
    private final BigDecimal pendingClosingQuantity;
    private final Integer riskDisclosureMenuItemStringRes;
    private final RollingBlockingState rollingBlockingState;
    private final OptionStatisticsFragmentKey selectedContractStatsKey;
    private final OptionInstrument selectedOptionInstrument;
    private final OptionQuote selectedOptionInstrumentQuote;
    private final RollingContractCardView.RollingContractCardData selectedPositionCardData;
    private final RollingSubheaderView.RollingSubheaderData selectedPositionStatsData;
    private final boolean showSwitchToMarginOldFlow;
    private final UiOptionChain uiOptionChain;

    /* compiled from: OptionRollingStrategyViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionPositionType.values().length];
            try {
                iArr[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component12, reason: from getter */
    private final boolean getIsUk() {
        return this.isUk;
    }

    public static /* synthetic */ OptionRollingStrategyViewState copy$default(OptionRollingStrategyViewState optionRollingStrategyViewState, Account account, OptionQuote optionQuote, UiOptionStrategyInfo uiOptionStrategyInfo, String str, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, OptionInstrument optionInstrument, OptionQuote optionQuote2, UiOptionChain uiOptionChain, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            account = optionRollingStrategyViewState.account;
        }
        if ((i & 2) != 0) {
            optionQuote = optionRollingStrategyViewState.existingPositionQuote;
        }
        if ((i & 4) != 0) {
            uiOptionStrategyInfo = optionRollingStrategyViewState.existingPositionStrategyInfo;
        }
        if ((i & 8) != 0) {
            str = optionRollingStrategyViewState.existingStrategyCode;
        }
        if ((i & 16) != 0) {
            z = optionRollingStrategyViewState.hasMultipleAccounts;
        }
        if ((i & 32) != 0) {
            bigDecimal = optionRollingStrategyViewState.availableQuantity;
        }
        if ((i & 64) != 0) {
            bigDecimal2 = optionRollingStrategyViewState.pendingClosingQuantity;
        }
        if ((i & 128) != 0) {
            optionInstrument = optionRollingStrategyViewState.selectedOptionInstrument;
        }
        if ((i & 256) != 0) {
            optionQuote2 = optionRollingStrategyViewState.selectedOptionInstrumentQuote;
        }
        if ((i & 512) != 0) {
            uiOptionChain = optionRollingStrategyViewState.uiOptionChain;
        }
        if ((i & 1024) != 0) {
            z2 = optionRollingStrategyViewState.inOptionsOrderFormDefaultExperiment;
        }
        if ((i & 2048) != 0) {
            z3 = optionRollingStrategyViewState.isUk;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        OptionQuote optionQuote3 = optionQuote2;
        UiOptionChain uiOptionChain2 = uiOptionChain;
        BigDecimal bigDecimal3 = bigDecimal2;
        OptionInstrument optionInstrument2 = optionInstrument;
        boolean z6 = z;
        BigDecimal bigDecimal4 = bigDecimal;
        return optionRollingStrategyViewState.copy(account, optionQuote, uiOptionStrategyInfo, str, z6, bigDecimal4, bigDecimal3, optionInstrument2, optionQuote3, uiOptionChain2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getInOptionsOrderFormDefaultExperiment() {
        return this.inOptionsOrderFormDefaultExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionQuote getExistingPositionQuote() {
        return this.existingPositionQuote;
    }

    /* renamed from: component3, reason: from getter */
    public final UiOptionStrategyInfo getExistingPositionStrategyInfo() {
        return this.existingPositionStrategyInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExistingStrategyCode() {
        return this.existingStrategyCode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasMultipleAccounts() {
        return this.hasMultipleAccounts;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getAvailableQuantity() {
        return this.availableQuantity;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getPendingClosingQuantity() {
        return this.pendingClosingQuantity;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionInstrument getSelectedOptionInstrument() {
        return this.selectedOptionInstrument;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionQuote getSelectedOptionInstrumentQuote() {
        return this.selectedOptionInstrumentQuote;
    }

    public final OptionRollingStrategyViewState copy(Account account, OptionQuote existingPositionQuote, UiOptionStrategyInfo existingPositionStrategyInfo, String existingStrategyCode, boolean hasMultipleAccounts, BigDecimal availableQuantity, BigDecimal pendingClosingQuantity, OptionInstrument selectedOptionInstrument, OptionQuote selectedOptionInstrumentQuote, UiOptionChain uiOptionChain, boolean inOptionsOrderFormDefaultExperiment, boolean isUk) {
        Intrinsics.checkNotNullParameter(existingStrategyCode, "existingStrategyCode");
        return new OptionRollingStrategyViewState(account, existingPositionQuote, existingPositionStrategyInfo, existingStrategyCode, hasMultipleAccounts, availableQuantity, pendingClosingQuantity, selectedOptionInstrument, selectedOptionInstrumentQuote, uiOptionChain, inOptionsOrderFormDefaultExperiment, isUk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionRollingStrategyViewState)) {
            return false;
        }
        OptionRollingStrategyViewState optionRollingStrategyViewState = (OptionRollingStrategyViewState) other;
        return Intrinsics.areEqual(this.account, optionRollingStrategyViewState.account) && Intrinsics.areEqual(this.existingPositionQuote, optionRollingStrategyViewState.existingPositionQuote) && Intrinsics.areEqual(this.existingPositionStrategyInfo, optionRollingStrategyViewState.existingPositionStrategyInfo) && Intrinsics.areEqual(this.existingStrategyCode, optionRollingStrategyViewState.existingStrategyCode) && this.hasMultipleAccounts == optionRollingStrategyViewState.hasMultipleAccounts && Intrinsics.areEqual(this.availableQuantity, optionRollingStrategyViewState.availableQuantity) && Intrinsics.areEqual(this.pendingClosingQuantity, optionRollingStrategyViewState.pendingClosingQuantity) && Intrinsics.areEqual(this.selectedOptionInstrument, optionRollingStrategyViewState.selectedOptionInstrument) && Intrinsics.areEqual(this.selectedOptionInstrumentQuote, optionRollingStrategyViewState.selectedOptionInstrumentQuote) && Intrinsics.areEqual(this.uiOptionChain, optionRollingStrategyViewState.uiOptionChain) && this.inOptionsOrderFormDefaultExperiment == optionRollingStrategyViewState.inOptionsOrderFormDefaultExperiment && this.isUk == optionRollingStrategyViewState.isUk;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        OptionQuote optionQuote = this.existingPositionQuote;
        int iHashCode2 = (iHashCode + (optionQuote == null ? 0 : optionQuote.hashCode())) * 31;
        UiOptionStrategyInfo uiOptionStrategyInfo = this.existingPositionStrategyInfo;
        int iHashCode3 = (((((iHashCode2 + (uiOptionStrategyInfo == null ? 0 : uiOptionStrategyInfo.hashCode())) * 31) + this.existingStrategyCode.hashCode()) * 31) + Boolean.hashCode(this.hasMultipleAccounts)) * 31;
        BigDecimal bigDecimal = this.availableQuantity;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.pendingClosingQuantity;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        OptionInstrument optionInstrument = this.selectedOptionInstrument;
        int iHashCode6 = (iHashCode5 + (optionInstrument == null ? 0 : optionInstrument.hashCode())) * 31;
        OptionQuote optionQuote2 = this.selectedOptionInstrumentQuote;
        int iHashCode7 = (iHashCode6 + (optionQuote2 == null ? 0 : optionQuote2.hashCode())) * 31;
        UiOptionChain uiOptionChain = this.uiOptionChain;
        return ((((iHashCode7 + (uiOptionChain != null ? uiOptionChain.hashCode() : 0)) * 31) + Boolean.hashCode(this.inOptionsOrderFormDefaultExperiment)) * 31) + Boolean.hashCode(this.isUk);
    }

    public String toString() {
        return "OptionRollingStrategyViewState(account=" + this.account + ", existingPositionQuote=" + this.existingPositionQuote + ", existingPositionStrategyInfo=" + this.existingPositionStrategyInfo + ", existingStrategyCode=" + this.existingStrategyCode + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ", availableQuantity=" + this.availableQuantity + ", pendingClosingQuantity=" + this.pendingClosingQuantity + ", selectedOptionInstrument=" + this.selectedOptionInstrument + ", selectedOptionInstrumentQuote=" + this.selectedOptionInstrumentQuote + ", uiOptionChain=" + this.uiOptionChain + ", inOptionsOrderFormDefaultExperiment=" + this.inOptionsOrderFormDefaultExperiment + ", isUk=" + this.isUk + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionRollingStrategyViewState(Account account, OptionQuote optionQuote, UiOptionStrategyInfo uiOptionStrategyInfo, String existingStrategyCode, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, OptionInstrument optionInstrument, OptionQuote optionQuote2, UiOptionChain uiOptionChain, boolean z2, boolean z3) {
        OptionPositionType optionPositionType;
        OptionPositionType optionPositionType2;
        OptionPositionType optionPositionType3;
        OptionInstrument optionInstrument2;
        boolean z4;
        RollingContractCardView.RollingContractCardData rollingContractCardData;
        BigDecimal bigDecimal3;
        UiOptionChain uiOptionChain2;
        OptionInstrument optionInstrument3;
        Boolean bool;
        RollingContractCardView.RollingContractCardData rollingContractCardData2;
        RollingSubheaderView.RollingSubheaderData rollingStats;
        OptionPositionType optionPositionType4;
        OptionChainIntentKey optionChainIntentKey;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        OptionInstrument optionInstrument4;
        UiOptionChain uiOptionChain3;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle;
        Map<String, JsonPrimitive<?>> switchAccountSassyInputParams;
        RollingBlockingState rollingBlockingState;
        OrderDirection direction;
        List<UiOptionStrategyLeg> legs;
        UiOptionStrategyLeg uiOptionStrategyLeg;
        OptionStrategyType strategy;
        Intrinsics.checkNotNullParameter(existingStrategyCode, "existingStrategyCode");
        this.account = account;
        this.existingPositionQuote = optionQuote;
        this.existingPositionStrategyInfo = uiOptionStrategyInfo;
        this.existingStrategyCode = existingStrategyCode;
        this.hasMultipleAccounts = z;
        this.availableQuantity = bigDecimal;
        this.pendingClosingQuantity = bigDecimal2;
        this.selectedOptionInstrument = optionInstrument;
        this.selectedOptionInstrumentQuote = optionQuote2;
        this.uiOptionChain = uiOptionChain;
        this.inOptionsOrderFormDefaultExperiment = z2;
        this.isUk = z3;
        OptionPositionType positionType = (uiOptionStrategyInfo == null || (strategy = uiOptionStrategyInfo.getStrategy()) == null) ? null : strategy.getPositionType();
        this.existingOpeningPositionType = positionType;
        OptionInstrument optionInstrument5 = (uiOptionStrategyInfo == null || (legs = uiOptionStrategyInfo.getLegs()) == null || (uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.firstOrNull((List) legs)) == null) ? null : uiOptionStrategyLeg.getOptionInstrument();
        this.existingOptionInstrument = optionInstrument5;
        int i = positionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
        if (i == -1) {
            optionPositionType = null;
        } else if (i == 1) {
            optionPositionType = OptionPositionType.SHORT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            optionPositionType = OptionPositionType.LONG;
        }
        this.existingClosingPositionType = optionPositionType;
        if (optionInstrument5 == null || optionPositionType == null || bigDecimal == null || uiOptionChain == null) {
            optionPositionType2 = positionType;
            optionPositionType3 = optionPositionType;
            optionInstrument2 = optionInstrument5;
            z4 = true;
            rollingContractCardData = null;
        } else {
            OptionPositionType optionPositionType5 = optionPositionType;
            optionPositionType2 = positionType;
            z4 = true;
            rollingContractCardData = new RollingContractCardView.RollingContractCardData(RollingContractCardView.CardType.CURRENT_POSITION, optionInstrument5, UiOptionStrategyDisplay.OptionOrderPositionEffect.CLOSE, optionPositionType5, bigDecimal, uiOptionChain);
            optionInstrument2 = optionInstrument5;
            optionPositionType3 = optionPositionType5;
        }
        this.existingPositionCardData = rollingContractCardData;
        Boolean boolValueOf = account != null ? Boolean.valueOf(!account.isMargin()) : null;
        this.isCashAccount = boolValueOf;
        if (optionInstrument == null || optionPositionType2 == null || bigDecimal == null || uiOptionChain == null) {
            bigDecimal3 = bigDecimal;
            uiOptionChain2 = uiOptionChain;
            optionInstrument3 = optionInstrument;
            bool = boolValueOf;
            rollingContractCardData2 = null;
        } else {
            bigDecimal3 = bigDecimal;
            bool = boolValueOf;
            rollingContractCardData2 = new RollingContractCardView.RollingContractCardData(RollingContractCardView.CardType.SELECTED_CONTRACT, optionInstrument, UiOptionStrategyDisplay.OptionOrderPositionEffect.OPEN, optionPositionType2, bigDecimal3, uiOptionChain);
            optionInstrument3 = optionInstrument;
            uiOptionChain2 = uiOptionChain;
        }
        this.selectedPositionCardData = rollingContractCardData2;
        if (rollingContractCardData2 == null || optionInstrument3 == null || optionInstrument2 == null || uiOptionStrategyInfo == null || optionPositionType2 == null || optionPositionType3 == null || optionQuote2 == null || optionQuote == null || bigDecimal3 == null) {
            rollingStats = RollingSubheaderView.RollingSubheaderData.SelectContract.INSTANCE;
        } else {
            BigDecimal bigDecimalSubtract = optionQuote2.getAdjustedMarkPrice().getUnsignedValue().subtract(optionQuote.getAdjustedMarkPrice().getUnsignedValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            if (BigDecimals7.isNegative(bigDecimalSubtract)) {
                direction = optionPositionType3.getDirection();
            } else {
                direction = optionPositionType2.getDirection();
            }
            BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            BigDecimal bigDecimalAbs2 = bigDecimalSubtract.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
            BigDecimal bigDecimalMultiply = bigDecimal3.multiply(bigDecimalAbs2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(uiOptionStrategyInfo.getOptionChain().getTradeValueMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            rollingStats = new RollingSubheaderView.RollingSubheaderData.RollingStats(direction, bigDecimalAbs, bigDecimalMultiply2, (int) optionInstrument2.getExpirationDate().until(optionInstrument3.getExpirationDate(), ChronoUnit.DAYS));
        }
        this.selectedPositionStatsData = rollingStats;
        if (uiOptionStrategyInfo == null || optionInstrument2 == null || optionPositionType2 == null || bigDecimal3 == null || uiOptionChain2 == null || account == null) {
            optionPositionType4 = optionPositionType2;
            optionChainIntentKey = null;
        } else {
            optionPositionType4 = optionPositionType2;
            optionChainIntentKey = new OptionChainIntentKey(uiOptionChain2.getFirstEquityUnderlyingId(), new OptionChainIdLaunchMode.SingleChainId(uiOptionStrategyInfo.getOptionChain().getId()), new OptionChainLaunchMode.RollingContractSelector(optionInstrument2, optionPositionType4, bigDecimal3, existingStrategyCode, uiOptionChain2.getOptionChain().getSettleOnOpen()), account.getAccountNumber());
        }
        this.contractSelectorIntentKey = optionChainIntentKey;
        this.initialContractSelectorIntentKey = (optionInstrument3 != null || optionChainIntentKey == null) ? null : optionChainIntentKey;
        if (optionInstrument2 == null || optionPositionType4 == null || optionInstrument3 == null || optionPositionType3 == null || uiOptionChain2 == null || bigDecimal == null || account == null) {
            bigDecimal4 = bigDecimal;
            bigDecimal5 = bigDecimal2;
            optionInstrument4 = optionInstrument3;
            uiOptionChain3 = uiOptionChain2;
            fromOptionOrderBundle = null;
        } else {
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(OptionBundles.toLegBundle(optionInstrument2, uiOptionChain2.getFirstEquityUnderlyingId(), optionPositionType3.getSide(), uiOptionChain2), OptionBundles.toLegBundle(optionInstrument3, uiOptionChain2.getFirstEquityUnderlyingId(), optionPositionType4.getSide(), uiOptionChain2));
            OptionChainBundle optionChainBundle = ((OptionLegBundle) CollectionsKt.first((List) immutableList3PersistentListOf)).getOptionConfigurationBundle().getOptionChainBundle();
            optionInstrument4 = optionInstrument3;
            uiOptionChain3 = uiOptionChain2;
            bigDecimal5 = bigDecimal2;
            bigDecimal4 = bigDecimal;
            fromOptionOrderBundle = new OptionOrderIntentKey.FromOptionOrderBundle(null, account.getAccountNumber(), new OptionOrderBundle(optionChainBundle, immutableList3PersistentListOf, bigDecimal, null, null, null, 56, null), null, null, null, null, false, false, true, OptionChainDisplayMode.DEFAULT, OptionOrderFormSource.STRATEGY_ROLL, null, null, 12793, null);
        }
        this.optionOrderFormIntentKey = fromOptionOrderBundle;
        this.existingContractStatsKey = (optionInstrument2 == null || optionPositionType3 == null || uiOptionChain3 == null) ? null : new OptionStatisticsFragmentKey(OptionBundles.toLegBundle(optionInstrument2, uiOptionChain3.getFirstEquityUnderlyingId(), optionPositionType3.getSide(), uiOptionChain3), null, OptionStatisticsTradableState.NotAvailable.INSTANCE, OptionStatisticsLaunchMode.ROLL, false, 18, null);
        this.selectedContractStatsKey = (optionInstrument4 == null || optionPositionType4 == null || uiOptionChain3 == null) ? null : new OptionStatisticsFragmentKey(OptionBundles.toLegBundle(optionInstrument4, uiOptionChain3.getFirstEquityUnderlyingId(), optionPositionType4.getSide(), uiOptionChain3), null, OptionStatisticsTradableState.NotAvailable.INSTANCE, OptionStatisticsLaunchMode.ROLL, false, 18, null);
        boolean z5 = (account == null || account.isMargin() || account.getBrokerageAccountType().isRetirement()) ? z4 : false;
        this.showSwitchToMarginOldFlow = z5;
        if (z5) {
            switchAccountSassyInputParams = null;
        } else {
            Intrinsics.checkNotNull(account);
            switchAccountSassyInputParams = InstantCashUtils.getSwitchAccountSassyInputParams(account, InstantCashConstants2.SOURCE_OPTIONS_ROLLING);
        }
        this.instantCashSwitchToMarginInputParams = switchAccountSassyInputParams;
        if (bigDecimal4 == null || bigDecimal5 == null || bool == null || account == null) {
            rollingBlockingState = null;
        } else if (bool.booleanValue() && account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
            if (z5) {
                rollingBlockingState = RollingBlockingState.CASH_ACCOUNT_BROKERAGE;
            } else {
                rollingBlockingState = RollingBlockingState.CASH_ACCOUNT_BROKERAGE_INSTANT_CASH;
            }
        } else if (!bool.booleanValue() || !account.getBrokerageAccountType().isRetirement()) {
            BigDecimal bigDecimal6 = BigDecimal.ZERO;
            if (BigDecimals7.lte(bigDecimal4, bigDecimal6) && BigDecimals7.lte(bigDecimal5, bigDecimal6)) {
                rollingBlockingState = RollingBlockingState.NO_POSITION;
            } else if (BigDecimals7.lte(bigDecimal4, bigDecimal6) && BigDecimals7.m2978gt(bigDecimal5, bigDecimal6)) {
                rollingBlockingState = RollingBlockingState.PENDING_POSITION;
            }
        } else if (z5) {
            rollingBlockingState = RollingBlockingState.CASH_ACCOUNT_IRA;
        } else {
            rollingBlockingState = RollingBlockingState.CASH_ACCOUNT_IRA_INSTANT_CASH;
        }
        this.rollingBlockingState = rollingBlockingState;
        this.riskDisclosureMenuItemStringRes = z ? null : Integer.valueOf(C24772R.string.options_rolling_menu_disclosure_text);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionRollingStrategyViewState(com.robinhood.models.p320db.Account r17, com.robinhood.models.p320db.OptionQuote r18, com.robinhood.models.p355ui.UiOptionStrategyInfo r19, java.lang.String r20, boolean r21, java.math.BigDecimal r22, java.math.BigDecimal r23, com.robinhood.models.p320db.OptionInstrument r24, com.robinhood.models.p320db.OptionQuote r25, com.robinhood.models.p355ui.UiOptionChain r26, boolean r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r17
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            r5 = r2
            goto L13
        L11:
            r5 = r18
        L13:
            r1 = r0 & 4
            if (r1 == 0) goto L19
            r6 = r2
            goto L1b
        L19:
            r6 = r19
        L1b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L22
            r8 = r3
            goto L24
        L22:
            r8 = r21
        L24:
            r1 = r0 & 32
            if (r1 == 0) goto L2a
            r9 = r2
            goto L2c
        L2a:
            r9 = r22
        L2c:
            r1 = r0 & 64
            if (r1 == 0) goto L32
            r10 = r2
            goto L34
        L32:
            r10 = r23
        L34:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3a
            r11 = r2
            goto L3c
        L3a:
            r11 = r24
        L3c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L42
            r12 = r2
            goto L44
        L42:
            r12 = r25
        L44:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r13 = r2
            goto L4c
        L4a:
            r13 = r26
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r14 = r3
            goto L54
        L52:
            r14 = r27
        L54:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5e
            r15 = r3
            r7 = r20
            r3 = r16
            goto L64
        L5e:
            r15 = r28
            r3 = r16
            r7 = r20
        L64:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyViewState.<init>(com.robinhood.models.db.Account, com.robinhood.models.db.OptionQuote, com.robinhood.models.ui.UiOptionStrategyInfo, java.lang.String, boolean, java.math.BigDecimal, java.math.BigDecimal, com.robinhood.models.db.OptionInstrument, com.robinhood.models.db.OptionQuote, com.robinhood.models.ui.UiOptionChain, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Account getAccount() {
        return this.account;
    }

    public final OptionQuote getExistingPositionQuote() {
        return this.existingPositionQuote;
    }

    public final UiOptionStrategyInfo getExistingPositionStrategyInfo() {
        return this.existingPositionStrategyInfo;
    }

    public final String getExistingStrategyCode() {
        return this.existingStrategyCode;
    }

    public final boolean getHasMultipleAccounts() {
        return this.hasMultipleAccounts;
    }

    public final BigDecimal getAvailableQuantity() {
        return this.availableQuantity;
    }

    public final BigDecimal getPendingClosingQuantity() {
        return this.pendingClosingQuantity;
    }

    public final OptionInstrument getSelectedOptionInstrument() {
        return this.selectedOptionInstrument;
    }

    public final OptionQuote getSelectedOptionInstrumentQuote() {
        return this.selectedOptionInstrumentQuote;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final boolean getInOptionsOrderFormDefaultExperiment() {
        return this.inOptionsOrderFormDefaultExperiment;
    }

    public final OptionPositionType getExistingOpeningPositionType() {
        return this.existingOpeningPositionType;
    }

    public final OptionInstrument getExistingOptionInstrument() {
        return this.existingOptionInstrument;
    }

    public final RollingContractCardView.RollingContractCardData getExistingPositionCardData() {
        return this.existingPositionCardData;
    }

    public final RollingContractCardView.RollingContractCardData getSelectedPositionCardData() {
        return this.selectedPositionCardData;
    }

    public final RollingSubheaderView.RollingSubheaderData getSelectedPositionStatsData() {
        return this.selectedPositionStatsData;
    }

    public final OptionChainIntentKey getContractSelectorIntentKey() {
        return this.contractSelectorIntentKey;
    }

    public final OptionChainIntentKey getInitialContractSelectorIntentKey() {
        return this.initialContractSelectorIntentKey;
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderFormIntentKey() {
        return this.optionOrderFormIntentKey;
    }

    public final OptionStatisticsFragmentKey getExistingContractStatsKey() {
        return this.existingContractStatsKey;
    }

    public final OptionStatisticsFragmentKey getSelectedContractStatsKey() {
        return this.selectedContractStatsKey;
    }

    public final Map<String, JsonPrimitive<?>> getInstantCashSwitchToMarginInputParams() {
        return this.instantCashSwitchToMarginInputParams;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionRollingStrategyViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyViewState$RollingBlockingState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "secondaryButtonTitle", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getSecondaryButtonTitle", "NO_POSITION", "PENDING_POSITION", "CASH_ACCOUNT_BROKERAGE", "CASH_ACCOUNT_IRA", "CASH_ACCOUNT_BROKERAGE_INSTANT_CASH", "CASH_ACCOUNT_IRA_INSTANT_CASH", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RollingBlockingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RollingBlockingState[] $VALUES;
        public static final RollingBlockingState CASH_ACCOUNT_BROKERAGE;
        public static final RollingBlockingState CASH_ACCOUNT_BROKERAGE_INSTANT_CASH;
        public static final RollingBlockingState CASH_ACCOUNT_IRA;
        public static final RollingBlockingState CASH_ACCOUNT_IRA_INSTANT_CASH;
        public static final RollingBlockingState NO_POSITION;
        public static final RollingBlockingState PENDING_POSITION;
        private final StringResource description;
        private final StringResource secondaryButtonTitle;
        private final StringResource title;

        private static final /* synthetic */ RollingBlockingState[] $values() {
            return new RollingBlockingState[]{NO_POSITION, PENDING_POSITION, CASH_ACCOUNT_BROKERAGE, CASH_ACCOUNT_IRA, CASH_ACCOUNT_BROKERAGE_INSTANT_CASH, CASH_ACCOUNT_IRA_INSTANT_CASH};
        }

        public static EnumEntries<RollingBlockingState> getEntries() {
            return $ENTRIES;
        }

        private RollingBlockingState(String str, int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3) {
            this.title = stringResource;
            this.description = stringResource2;
            this.secondaryButtonTitle = stringResource3;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getDescription() {
            return this.description;
        }

        public final StringResource getSecondaryButtonTitle() {
            return this.secondaryButtonTitle;
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            NO_POSITION = new RollingBlockingState("NO_POSITION", 0, companion.invoke(C24772R.string.options_rolling_no_positions_title, new Object[0]), companion.invoke(C24772R.string.options_rolling_no_positions_description, new Object[0]), companion.invoke(C24772R.string.options_rolling_secondary_button_title, new Object[0]));
            PENDING_POSITION = new RollingBlockingState("PENDING_POSITION", 1, companion.invoke(C24772R.string.options_rolling_positions_pending_title, new Object[0]), companion.invoke(C24772R.string.options_rolling_positions_pending_description, new Object[0]), companion.invoke(C24772R.string.options_rolling_secondary_button_title, new Object[0]));
            CASH_ACCOUNT_BROKERAGE = new RollingBlockingState("CASH_ACCOUNT_BROKERAGE", 2, companion.invoke(C24772R.string.options_rolling_cash_account_title, new Object[0]), companion.invoke(C24772R.string.options_rolling_cash_account_brokerage_description, new Object[0]), companion.invoke(C24772R.string.options_rolling_cash_account_brokerage_secondary_button_title, new Object[0]));
            CASH_ACCOUNT_IRA = new RollingBlockingState("CASH_ACCOUNT_IRA", 3, companion.invoke(C24772R.string.options_rolling_cash_account_title, new Object[0]), companion.invoke(C24772R.string.options_rolling_cash_account_ira_description, new Object[0]), companion.invoke(C24772R.string.options_rolling_cash_account_ira_secondary_button_title, new Object[0]));
            CASH_ACCOUNT_BROKERAGE_INSTANT_CASH = new RollingBlockingState("CASH_ACCOUNT_BROKERAGE_INSTANT_CASH", 4, companion.invoke(C24772R.string.options_rolling_cash_account_title, new Object[0]), companion.invoke(C24772R.string.options_rolling_cash_account_brokerage_description_instant_cash, new Object[0]), companion.invoke(C24772R.string.f4815x8efc201e, new Object[0]));
            CASH_ACCOUNT_IRA_INSTANT_CASH = new RollingBlockingState("CASH_ACCOUNT_IRA_INSTANT_CASH", 5, companion.invoke(C24772R.string.options_rolling_cash_account_title, new Object[0]), companion.invoke(C24772R.string.options_rolling_cash_account_ira_description_instant_cash, new Object[0]), companion.invoke(C24772R.string.f4816x212e9ab0, new Object[0]));
            RollingBlockingState[] rollingBlockingStateArr$values = $values();
            $VALUES = rollingBlockingStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rollingBlockingStateArr$values);
        }

        public static RollingBlockingState valueOf(String str) {
            return (RollingBlockingState) Enum.valueOf(RollingBlockingState.class, str);
        }

        public static RollingBlockingState[] values() {
            return (RollingBlockingState[]) $VALUES.clone();
        }
    }

    public final RollingBlockingState getRollingBlockingState() {
        return this.rollingBlockingState;
    }

    public final OptionRollingContentful getRiskDisclosureContentful() {
        if (this.isUk) {
            return OptionRollingContentful.UK_OPTION_ROLLING_RISK_DISCLOSURES;
        }
        return OptionRollingContentful.OPTION_ROLLING_RISK_DISCLOSURES;
    }

    public final String getToolbarTitle(Resources res) {
        Account account;
        Intrinsics.checkNotNullParameter(res, "res");
        if (this.hasMultipleAccounts && (account = this.account) != null) {
            return AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle().getText(res).toString();
        }
        return "";
    }

    public final Integer getRiskDisclosureMenuItemStringRes() {
        return this.riskDisclosureMenuItemStringRes;
    }
}
