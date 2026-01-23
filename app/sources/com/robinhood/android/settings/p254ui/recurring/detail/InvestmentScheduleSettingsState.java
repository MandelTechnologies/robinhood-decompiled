package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.StringsKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.settings.p254ui.recurring.C28446R;
import com.robinhood.android.settings.p254ui.recurring.detail.DateRowState;
import com.robinhood.android.settings.p254ui.recurring.detail.InvestmentScheduleSettingsType;
import com.robinhood.android.settings.p254ui.recurring.detail.SourceOfFundsRowState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.ScheduleAlert;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p355ui.recurring.UiInvestmentSchedule;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.TradeSkippedReason;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleSettingsState.kt */
@Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 \u0090\u00012\u00020\u0001:\u0004\u008f\u0001\u0090\u0001B£\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010~\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016HÂ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018HÂ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001aHÂ\u0003J¦\u0001\u0010\u008a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\u0015\u0010\u008b\u0001\u001a\u00020\u00032\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008d\u0001\u001a\u00020qHÖ\u0001J\n\u0010\u008e\u0001\u001a\u00020<HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010\u001dR\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u001dR\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001dR\u0016\u0010?\u001a\u0004\u0018\u00010@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010\u001dR\u0014\u0010I\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u001dR\u0014\u0010K\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001dR\u0013\u0010M\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010Q\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0016\u0010W\u001a\u0004\u0018\u00010X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u001dR\u0013\u0010\\\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010`\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\be\u0010\u001dR\u0013\u0010f\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u001dR\u0016\u0010p\u001a\u0004\u0018\u00010q8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u001dR\u0013\u0010v\u001a\u0004\u0018\u00010w8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0013\u0010z\u001a\u0004\u0018\u00010{8F¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0091\u0001"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState;", "", "isFromInsights", "", "investmentSchedule", "Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "toggleEvent", "Lcom/robinhood/udf/UiEvent;", "", "toggleErrorEvent", "", "quote", "Lcom/robinhood/models/db/Quote;", "pastInvestmentEvents", "", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "scheduleAlert", "Lcom/robinhood/models/db/ScheduleAlert;", "selected", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "<init>", "(ZLcom/robinhood/models/ui/recurring/UiInvestmentSchedule;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/Quote;Ljava/util/List;Lcom/robinhood/models/db/ScheduleAlert;ZLcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;)V", "()Z", "getInvestmentSchedule", "()Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;", "getCryptoQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "getToggleEvent", "()Lcom/robinhood/udf/UiEvent;", "getToggleErrorEvent", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getPastInvestmentEvents", "()Ljava/util/List;", "getScheduleAlert", "()Lcom/robinhood/models/db/ScheduleAlert;", "getSelected", "isEnabled", "ctaState", "Lcom/robinhood/android/settings/ui/recurring/detail/CtaState;", "getCtaState", "()Lcom/robinhood/android/settings/ui/recurring/detail/CtaState;", "isCrypto", "isActive", "amountRowState", "Lcom/robinhood/android/settings/ui/recurring/detail/AmountRowState;", "getAmountRowState", "()Lcom/robinhood/android/settings/ui/recurring/detail/AmountRowState;", "frequencyRowState", "Lcom/robinhood/android/settings/ui/recurring/detail/FrequencyRowState;", "getFrequencyRowState", "()Lcom/robinhood/android/settings/ui/recurring/detail/FrequencyRowState;", "instrumentSymbol", "", "iraLimitReached", "getIraLimitReached", "pausedReason", "Lcom/robinhood/recurring/models/TradeSkippedReason;", "getPausedReason", "()Lcom/robinhood/recurring/models/TradeSkippedReason;", "priceChange", "Ljava/math/BigDecimal;", "getPriceChange", "()Ljava/math/BigDecimal;", "showPastInvestmentsCta", "getShowPastInvestmentsCta", "hasPastInvestments", "getHasPastInvestments", "shouldShowPastInvestments", "getShouldShowPastInvestments", "sypHeaderState", "Lcom/robinhood/android/settings/ui/recurring/detail/SypHeaderState;", "getSypHeaderState", "()Lcom/robinhood/android/settings/ui/recurring/detail/SypHeaderState;", "deleteButtonText", "Lcom/robinhood/utils/resource/StringResource;", "getDeleteButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "title", "getTitle", "endInvestmentState", "Lcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;", "getEndInvestmentState", "()Lcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;", "isEveryPaycheck", "infoBannerState", "Lcom/robinhood/android/settings/ui/recurring/detail/InfoBannerState;", "getInfoBannerState", "()Lcom/robinhood/android/settings/ui/recurring/detail/InfoBannerState;", "dateRowState", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState;", "getDateRowState", "()Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState;", "showRetirementRows", "getShowRetirementRows", "retirementTaxYearRowState", "Lcom/robinhood/android/settings/ui/recurring/detail/RetirementTaxYearRowState;", "getRetirementTaxYearRowState", "()Lcom/robinhood/android/settings/ui/recurring/detail/RetirementTaxYearRowState;", "investmentScheduleType", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState$InvestmentScheduleType;", "getInvestmentScheduleType", "()Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState$InvestmentScheduleType;", "hasEnoughBuyingPower", "getHasEnoughBuyingPower", "sourceOfFundsCta", "", "getSourceOfFundsCta", "()Ljava/lang/Integer;", "showSourceOfFundsRow", "getShowSourceOfFundsRow$feature_recurring_settings_externalDebug", "sourceOfFundsRowState", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState;", "getSourceOfFundsRowState", "()Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState;", "backupPaymentRowState", "Lcom/robinhood/android/settings/ui/recurring/detail/BackupPaymentRowState;", "getBackupPaymentRowState", "()Lcom/robinhood/android/settings/ui/recurring/detail/BackupPaymentRowState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "InvestmentScheduleType", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class InvestmentScheduleSettingsState {
    private static final String IRA_LIMIT_URL = "https://www.irs.gov/retirement-plans/plan-participant-employee/retirement-topics-ira-contribution-limits";
    private static final String LEARN_MORE_URL = "https://robinhood.com/us/en/support/articles/360001214203/mergers-stock-splits-and-more/";
    private final AchRelationship achRelationship;
    private final CryptoQuote cryptoQuote;
    private final DirectDepositRelationship directDepositRelationship;
    private final String instrumentSymbol;
    private final UiInvestmentSchedule investmentSchedule;
    private final boolean isFromInsights;
    private final List<UiInvestmentScheduleEvent> pastInvestmentEvents;
    private final Quote quote;
    private final ScheduleAlert scheduleAlert;
    private final boolean selected;
    private final UiEvent<Throwable> toggleErrorEvent;
    private final UiEvent<Unit> toggleEvent;
    private final UnifiedAccountV2 unifiedAccount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int retirementRowTrailingIconRes = C20690R.drawable.ic_rds_lock_24dp;

    /* compiled from: InvestmentScheduleSettingsState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[InvestmentScheduleType.values().length];
            try {
                iArr[InvestmentScheduleType.STOCKS_ETFS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestmentScheduleType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestmentScheduleType.BROKERAGE_CASH_TRANSFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestmentScheduleType.TRADITIONAL_IRA_CASH_TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvestmentScheduleType.ROTH_IRA_CASH_TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr2[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BrokerageAccountType.values().length];
            try {
                iArr3[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TradeSkippedReason.values().length];
            try {
                iArr4[TradeSkippedReason.TRANSFER_FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[TradeSkippedReason.TRANSFER_REVERSAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[TradeSkippedReason.INSUFFICIENT_BUYING_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public InvestmentScheduleSettingsState() {
        this(false, null, null, null, null, null, null, null, false, null, null, null, 4095, null);
    }

    /* renamed from: component10, reason: from getter */
    private final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component11, reason: from getter */
    private final DirectDepositRelationship getDirectDepositRelationship() {
        return this.directDepositRelationship;
    }

    /* renamed from: component12, reason: from getter */
    private final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public static /* synthetic */ InvestmentScheduleSettingsState copy$default(InvestmentScheduleSettingsState investmentScheduleSettingsState, boolean z, UiInvestmentSchedule uiInvestmentSchedule, CryptoQuote cryptoQuote, UiEvent uiEvent, UiEvent uiEvent2, Quote quote, List list, ScheduleAlert scheduleAlert, boolean z2, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, UnifiedAccountV2 unifiedAccountV2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investmentScheduleSettingsState.isFromInsights;
        }
        if ((i & 2) != 0) {
            uiInvestmentSchedule = investmentScheduleSettingsState.investmentSchedule;
        }
        if ((i & 4) != 0) {
            cryptoQuote = investmentScheduleSettingsState.cryptoQuote;
        }
        if ((i & 8) != 0) {
            uiEvent = investmentScheduleSettingsState.toggleEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = investmentScheduleSettingsState.toggleErrorEvent;
        }
        if ((i & 32) != 0) {
            quote = investmentScheduleSettingsState.quote;
        }
        if ((i & 64) != 0) {
            list = investmentScheduleSettingsState.pastInvestmentEvents;
        }
        if ((i & 128) != 0) {
            scheduleAlert = investmentScheduleSettingsState.scheduleAlert;
        }
        if ((i & 256) != 0) {
            z2 = investmentScheduleSettingsState.selected;
        }
        if ((i & 512) != 0) {
            achRelationship = investmentScheduleSettingsState.achRelationship;
        }
        if ((i & 1024) != 0) {
            directDepositRelationship = investmentScheduleSettingsState.directDepositRelationship;
        }
        if ((i & 2048) != 0) {
            unifiedAccountV2 = investmentScheduleSettingsState.unifiedAccount;
        }
        DirectDepositRelationship directDepositRelationship2 = directDepositRelationship;
        UnifiedAccountV2 unifiedAccountV22 = unifiedAccountV2;
        boolean z3 = z2;
        AchRelationship achRelationship2 = achRelationship;
        List list2 = list;
        ScheduleAlert scheduleAlert2 = scheduleAlert;
        UiEvent uiEvent3 = uiEvent2;
        Quote quote2 = quote;
        return investmentScheduleSettingsState.copy(z, uiInvestmentSchedule, cryptoQuote, uiEvent, uiEvent3, quote2, list2, scheduleAlert2, z3, achRelationship2, directDepositRelationship2, unifiedAccountV22);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFromInsights() {
        return this.isFromInsights;
    }

    /* renamed from: component2, reason: from getter */
    public final UiInvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    public final UiEvent<Unit> component4() {
        return this.toggleEvent;
    }

    public final UiEvent<Throwable> component5() {
        return this.toggleErrorEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    public final List<UiInvestmentScheduleEvent> component7() {
        return this.pastInvestmentEvents;
    }

    /* renamed from: component8, reason: from getter */
    public final ScheduleAlert getScheduleAlert() {
        return this.scheduleAlert;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final InvestmentScheduleSettingsState copy(boolean isFromInsights, UiInvestmentSchedule investmentSchedule, CryptoQuote cryptoQuote, UiEvent<Unit> toggleEvent, UiEvent<Throwable> toggleErrorEvent, Quote quote, List<UiInvestmentScheduleEvent> pastInvestmentEvents, ScheduleAlert scheduleAlert, boolean selected, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, UnifiedAccountV2 unifiedAccount) {
        Intrinsics.checkNotNullParameter(pastInvestmentEvents, "pastInvestmentEvents");
        return new InvestmentScheduleSettingsState(isFromInsights, investmentSchedule, cryptoQuote, toggleEvent, toggleErrorEvent, quote, pastInvestmentEvents, scheduleAlert, selected, achRelationship, directDepositRelationship, unifiedAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentScheduleSettingsState)) {
            return false;
        }
        InvestmentScheduleSettingsState investmentScheduleSettingsState = (InvestmentScheduleSettingsState) other;
        return this.isFromInsights == investmentScheduleSettingsState.isFromInsights && Intrinsics.areEqual(this.investmentSchedule, investmentScheduleSettingsState.investmentSchedule) && Intrinsics.areEqual(this.cryptoQuote, investmentScheduleSettingsState.cryptoQuote) && Intrinsics.areEqual(this.toggleEvent, investmentScheduleSettingsState.toggleEvent) && Intrinsics.areEqual(this.toggleErrorEvent, investmentScheduleSettingsState.toggleErrorEvent) && Intrinsics.areEqual(this.quote, investmentScheduleSettingsState.quote) && Intrinsics.areEqual(this.pastInvestmentEvents, investmentScheduleSettingsState.pastInvestmentEvents) && Intrinsics.areEqual(this.scheduleAlert, investmentScheduleSettingsState.scheduleAlert) && this.selected == investmentScheduleSettingsState.selected && Intrinsics.areEqual(this.achRelationship, investmentScheduleSettingsState.achRelationship) && Intrinsics.areEqual(this.directDepositRelationship, investmentScheduleSettingsState.directDepositRelationship) && Intrinsics.areEqual(this.unifiedAccount, investmentScheduleSettingsState.unifiedAccount);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFromInsights) * 31;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        int iHashCode2 = (iHashCode + (uiInvestmentSchedule == null ? 0 : uiInvestmentSchedule.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode3 = (iHashCode2 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.toggleEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.toggleErrorEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode6 = (((iHashCode5 + (quote == null ? 0 : quote.hashCode())) * 31) + this.pastInvestmentEvents.hashCode()) * 31;
        ScheduleAlert scheduleAlert = this.scheduleAlert;
        int iHashCode7 = (((iHashCode6 + (scheduleAlert == null ? 0 : scheduleAlert.hashCode())) * 31) + Boolean.hashCode(this.selected)) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode8 = (iHashCode7 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        DirectDepositRelationship directDepositRelationship = this.directDepositRelationship;
        int iHashCode9 = (iHashCode8 + (directDepositRelationship == null ? 0 : directDepositRelationship.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        return iHashCode9 + (unifiedAccountV2 != null ? unifiedAccountV2.hashCode() : 0);
    }

    public String toString() {
        return "InvestmentScheduleSettingsState(isFromInsights=" + this.isFromInsights + ", investmentSchedule=" + this.investmentSchedule + ", cryptoQuote=" + this.cryptoQuote + ", toggleEvent=" + this.toggleEvent + ", toggleErrorEvent=" + this.toggleErrorEvent + ", quote=" + this.quote + ", pastInvestmentEvents=" + this.pastInvestmentEvents + ", scheduleAlert=" + this.scheduleAlert + ", selected=" + this.selected + ", achRelationship=" + this.achRelationship + ", directDepositRelationship=" + this.directDepositRelationship + ", unifiedAccount=" + this.unifiedAccount + ")";
    }

    public InvestmentScheduleSettingsState(boolean z, UiInvestmentSchedule uiInvestmentSchedule, CryptoQuote cryptoQuote, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, Quote quote, List<UiInvestmentScheduleEvent> pastInvestmentEvents, ScheduleAlert scheduleAlert, boolean z2, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, UnifiedAccountV2 unifiedAccountV2) {
        InvestmentTarget investmentTarget;
        Intrinsics.checkNotNullParameter(pastInvestmentEvents, "pastInvestmentEvents");
        this.isFromInsights = z;
        this.investmentSchedule = uiInvestmentSchedule;
        this.cryptoQuote = cryptoQuote;
        this.toggleEvent = uiEvent;
        this.toggleErrorEvent = uiEvent2;
        this.quote = quote;
        this.pastInvestmentEvents = pastInvestmentEvents;
        this.scheduleAlert = scheduleAlert;
        this.selected = z2;
        this.achRelationship = achRelationship;
        this.directDepositRelationship = directDepositRelationship;
        this.unifiedAccount = unifiedAccountV2;
        this.instrumentSymbol = (uiInvestmentSchedule == null || (investmentTarget = uiInvestmentSchedule.getInvestmentTarget()) == null) ? null : investmentTarget.getInstrumentSymbol();
    }

    public final boolean isFromInsights() {
        return this.isFromInsights;
    }

    public final UiInvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    public final UiEvent<Unit> getToggleEvent() {
        return this.toggleEvent;
    }

    public final UiEvent<Throwable> getToggleErrorEvent() {
        return this.toggleErrorEvent;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public /* synthetic */ InvestmentScheduleSettingsState(boolean z, UiInvestmentSchedule uiInvestmentSchedule, CryptoQuote cryptoQuote, UiEvent uiEvent, UiEvent uiEvent2, Quote quote, List list, ScheduleAlert scheduleAlert, boolean z2, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, UnifiedAccountV2 unifiedAccountV2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiInvestmentSchedule, (i & 4) != 0 ? null : cryptoQuote, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : quote, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : scheduleAlert, (i & 256) == 0 ? z2 : false, (i & 512) != 0 ? null : achRelationship, (i & 1024) != 0 ? null : directDepositRelationship, (i & 2048) != 0 ? null : unifiedAccountV2);
    }

    public final List<UiInvestmentScheduleEvent> getPastInvestmentEvents() {
        return this.pastInvestmentEvents;
    }

    public final ScheduleAlert getScheduleAlert() {
        return this.scheduleAlert;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean isEnabled() {
        return this.investmentSchedule != null;
    }

    public final CtaState getCtaState() {
        InvestmentScheduleSettingsType syp;
        int i;
        int i2;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        ApiInvestmentSchedule.Frequency frequency = uiInvestmentSchedule != null ? uiInvestmentSchedule.getFrequency() : null;
        boolean z = false;
        if ((frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()]) == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$0[getInvestmentScheduleType().ordinal()];
            if (i3 == 1 || i3 == 2) {
                i = C28446R.string.settings_investment_schedule_delete_investment_text;
            } else if (i3 == 3) {
                i = C28446R.string.settings_investment_schedule_delete_transfer_text;
            } else {
                if (i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C28446R.string.settings_investment_schedule_delete_contribution_text;
            }
            StringResource stringResourceInvoke = companion.invoke(i, new Object[0]);
            if (isActive()) {
                i2 = C28446R.string.settings_investment_schedule_state_active;
            } else {
                i2 = C28446R.string.settings_investment_schedule_state_inactive;
            }
            syp = new InvestmentScheduleSettingsType.Syp(stringResourceInvoke, i2);
        } else {
            syp = InvestmentScheduleSettingsType.Default.INSTANCE;
        }
        EndInvestmentState endInvestmentState = getEndInvestmentState();
        boolean zIsActive = isActive();
        if (this.investmentSchedule != null && !getIraLimitReached()) {
            z = true;
        }
        return new CtaState(syp, zIsActive, z, endInvestmentState);
    }

    public final boolean isCrypto() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule != null) {
            return uiInvestmentSchedule.isCrypto();
        }
        return false;
    }

    public final boolean isActive() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        return (uiInvestmentSchedule != null ? uiInvestmentSchedule.getState() : null) == ApiInvestmentSchedule.State.ACTIVE;
    }

    public final AmountRowState getAmountRowState() {
        InvestmentScheduleAmount investmentScheduleAmount;
        String str;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule == null || (investmentScheduleAmount = uiInvestmentSchedule.getInvestmentScheduleAmount()) == null || (str = investmentScheduleAmount.format()) == null) {
            return null;
        }
        return new AmountRowState(str);
    }

    public final FrequencyRowState getFrequencyRowState() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule != null) {
            return new FrequencyRowState(StringsKt.labelResId(uiInvestmentSchedule.getFrequency(), uiInvestmentSchedule.isCrypto()), !isEveryPaycheck());
        }
        return null;
    }

    private final boolean getIraLimitReached() {
        return getPausedReason() == TradeSkippedReason.IRA_CONTRIBUTION_LIMIT_REACHED;
    }

    private final TradeSkippedReason getPausedReason() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule != null) {
            return uiInvestmentSchedule.getPausedReason();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BigDecimal getPriceChange() {
        Money lastTradePrice;
        BigDecimal decimalValue;
        Money originalEquityPrice;
        Money markPrice;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule != null && uiInvestmentSchedule.isCrypto()) {
            CryptoQuote cryptoQuote = this.cryptoQuote;
            if (cryptoQuote != null && (markPrice = cryptoQuote.getMarkPrice()) != null) {
                decimalValue = markPrice.getDecimalValue();
            }
        } else {
            Quote quote = this.quote;
            decimalValue = (quote == null || (lastTradePrice = quote.getLastTradePrice()) == null) ? null : lastTradePrice.getDecimalValue();
        }
        UiInvestmentSchedule uiInvestmentSchedule2 = this.investmentSchedule;
        BigDecimal decimalValue2 = (uiInvestmentSchedule2 == null || (originalEquityPrice = uiInvestmentSchedule2.getOriginalEquityPrice()) == null) ? null : originalEquityPrice.getDecimalValue();
        if (decimalValue == null || decimalValue2 == null) {
            return null;
        }
        BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(decimalValue, decimalValue2);
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = bigDecimalSafeDivide.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public final boolean getShowPastInvestmentsCta() {
        return getHasPastInvestments() && getShouldShowPastInvestments();
    }

    private final boolean getHasPastInvestments() {
        return (this.investmentSchedule == null || this.pastInvestmentEvents.isEmpty()) ? false : true;
    }

    private final boolean getShouldShowPastInvestments() {
        int i = WhenMappings.$EnumSwitchMapping$0[getInvestmentScheduleType().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final SypHeaderState getSypHeaderState() {
        Money money;
        int i;
        String instrumentSymbol;
        InvestmentTarget investmentTarget;
        if (!isEveryPaycheck()) {
            return null;
        }
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule == null || (money = uiInvestmentSchedule.getTotalInvested()) == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money = Money3.toMoney(ZERO, Currencies.USD);
        }
        String str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        BigDecimal priceChange = getPriceChange();
        String str2 = priceChange != null ? Formats.getPercentDeltaFormat().format(priceChange) : null;
        UiInvestmentSchedule uiInvestmentSchedule2 = this.investmentSchedule;
        LocalDate firstInvestmentDate = uiInvestmentSchedule2 != null ? uiInvestmentSchedule2.getFirstInvestmentDate() : null;
        boolean z = getPausedReason() != TradeSkippedReason.PAUSED_BY_USER;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (getPriceChange() == null) {
            i = C28446R.string.f4965x22d38845;
        } else {
            i = isCrypto() ? C28446R.string.f4964x2743dfa : C28446R.string.settings_investment_schedule_price_change_dialog_description;
        }
        UiInvestmentSchedule uiInvestmentSchedule3 = this.investmentSchedule;
        if (uiInvestmentSchedule3 == null || (investmentTarget = uiInvestmentSchedule3.getInvestmentTarget()) == null || (instrumentSymbol = investmentTarget.getInstrumentSymbol()) == null) {
            instrumentSymbol = "";
        }
        return new SypHeaderState(str, str2, firstInvestmentDate, companion.invoke(i, instrumentSymbol), z);
    }

    public final StringResource getDeleteButtonText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[getInvestmentScheduleType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = C28446R.string.settings_investment_schedule_delete_investment_text;
        } else if (i2 == 3) {
            i = C28446R.string.settings_investment_schedule_delete_transfer_text;
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C28446R.string.settings_investment_schedule_delete_contribution_text;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getTitle() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        if (this.isFromInsights) {
            int i = WhenMappings.$EnumSwitchMapping$0[getInvestmentScheduleType().ordinal()];
            if (i == 1 || i == 2) {
                String str = this.instrumentSymbol;
                return (str == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_insights_title, str)) == null) ? StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_insights_title_no_symbol, new Object[0]) : stringResourceInvoke2;
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_insights_title_brokerage_cash, new Object[0]);
            }
            if (i == 4) {
                return StringResource.INSTANCE.invoke(C28446R.string.f4960xe4595c7e, new Object[0]);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C28446R.string.f4959x71414a2e, new Object[0]);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[getInvestmentScheduleType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            String str2 = this.instrumentSymbol;
            return (str2 == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_title, str2)) == null) ? StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_title_no_symbol, new Object[0]) : stringResourceInvoke;
        }
        if (i2 == 3) {
            return StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_title_brokerage_cash, new Object[0]);
        }
        if (i2 == 4) {
            return StringResource.INSTANCE.invoke(C28446R.string.f4966xee18794a, new Object[0]);
        }
        if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_title_roth_ira_brokerage_cash, new Object[0]);
    }

    private final EndInvestmentState getEndInvestmentState() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        int i;
        int i2;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule == null) {
            return null;
        }
        InvestmentScheduleType investmentScheduleType = getInvestmentScheduleType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[investmentScheduleType.ordinal()];
        if (i3 == 1 || i3 == 2) {
            String str = this.instrumentSymbol;
            if (str == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_delete_alert_title, str)) == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C28446R.string.settings_investment_schedule_delete_alert_title_no_symbol, new Object[0]);
            }
        } else if (i3 == 3) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C28446R.string.settings_transfer_schedule_delete_alert_title, new Object[0]);
        } else {
            if (i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C28446R.string.settings_contribution_schedule_delete_alert_title, new Object[0]);
        }
        int i4 = iArr[getInvestmentScheduleType().ordinal()];
        if (i4 == 1 || i4 == 2) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i5 = C28446R.string.settings_investment_schedule_delete_alert_message;
            String str2 = this.instrumentSymbol;
            if (str2 == null) {
                str2 = "";
            }
            stringResourceInvoke2 = companion.invoke(i5, str2);
        } else if (i4 == 3) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C28446R.string.settings_transfer_schedule_delete_alert_message, new Object[0]);
        } else {
            if (i4 != 4 && i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C28446R.string.settings_contribution_schedule_delete_alert_message, new Object[0]);
        }
        int i6 = iArr[getInvestmentScheduleType().ordinal()];
        if (i6 == 1 || i6 == 2) {
            i = C28446R.string.settings_investment_schedule_delete_investment_text;
        } else if (i6 == 3) {
            i = C28446R.string.settings_investment_schedule_delete_transfer_text;
        } else {
            if (i6 != 4 && i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C28446R.string.settings_investment_schedule_delete_contribution_dialog_text;
        }
        int i7 = iArr[getInvestmentScheduleType().ordinal()];
        if (i7 == 1 || i7 == 2) {
            i2 = C11048R.string.general_label_cancel;
        } else if (i7 == 3) {
            i2 = C28446R.string.settings_investment_schedule_delete_transfer_dialog_cancel_text;
        } else {
            if (i7 != 4 && i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C28446R.string.f4958x2bf9942e;
        }
        return new EndInvestmentState(uiInvestmentSchedule, stringResourceInvoke, stringResourceInvoke2, i, i2);
    }

    private final boolean isEveryPaycheck() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        return (uiInvestmentSchedule != null ? uiInvestmentSchedule.getFrequency() : null) == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InfoBannerState getInfoBannerState() {
        RichText richText;
        RichText alert;
        if (getIraLimitReached()) {
            alert = new RichText("You cannot unpause this investment. It will automatically resume on January 1, " + (LocalDate.now().getYear() + 1) + ".", CollectionsKt.emptyList());
        } else {
            ScheduleAlert scheduleAlert = this.scheduleAlert;
            if (scheduleAlert == null) {
                richText = null;
                if (richText != null) {
                    return null;
                }
                return new InfoBannerState(richText, CollectionsKt.contains(CollectionsKt.listOf((Object[]) new TradeSkippedReason[]{TradeSkippedReason.INACTIVE_INSTRUMENT, TradeSkippedReason.IRA_CONTRIBUTION_LIMIT_REACHED}), getPausedReason()), getIraLimitReached() ? ServerToBentoAssetMapper2.INFO_FILLED_24 : null, !getIraLimitReached(), getIraLimitReached() ? IRA_LIMIT_URL : LEARN_MORE_URL);
            }
            alert = scheduleAlert.getAlert();
        }
        richText = alert;
        if (richText != null) {
        }
    }

    public final DateRowState getDateRowState() {
        LocalDate nextInvestmentDate;
        if (isEveryPaycheck()) {
            return null;
        }
        if (getPausedReason() == TradeSkippedReason.PAUSED_BY_USER) {
            return DateRowState.Paused.INSTANCE;
        }
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule == null || (nextInvestmentDate = uiInvestmentSchedule.getNextInvestmentDate()) == null) {
            return null;
        }
        return new DateRowState.Date(nextInvestmentDate, isCrypto());
    }

    public final boolean getShowRetirementRows() {
        BrokerageAccountType brokerageAccountType;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule == null || (brokerageAccountType = uiInvestmentSchedule.getBrokerageAccountType()) == null) {
            return false;
        }
        return brokerageAccountType.isRetirement();
    }

    public final RetirementTaxYearRowState getRetirementTaxYearRowState() {
        LocalDate nextInvestmentDate;
        String string2;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule != null && (nextInvestmentDate = uiInvestmentSchedule.getNextInvestmentDate()) != null && (string2 = Integer.valueOf(nextInvestmentDate.getYear()).toString()) != null) {
            RetirementTaxYearRowState retirementTaxYearRowState = new RetirementTaxYearRowState(string2);
            if (getShowRetirementRows()) {
                return retirementTaxYearRowState;
            }
        }
        return null;
    }

    private final InvestmentScheduleType getInvestmentScheduleType() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        BrokerageAccountType brokerageAccountType = uiInvestmentSchedule != null ? uiInvestmentSchedule.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[brokerageAccountType.ordinal()];
        if (i == 1) {
            return InvestmentScheduleType.ROTH_IRA_CASH_TRANSFER;
        }
        if (i == 2) {
            return InvestmentScheduleType.TRADITIONAL_IRA_CASH_TRANSFER;
        }
        UiInvestmentSchedule uiInvestmentSchedule2 = this.investmentSchedule;
        if (uiInvestmentSchedule2 != null && uiInvestmentSchedule2.isCrypto()) {
            return InvestmentScheduleType.CRYPTO;
        }
        UiInvestmentSchedule uiInvestmentSchedule3 = this.investmentSchedule;
        return (uiInvestmentSchedule3 == null || !uiInvestmentSchedule3.isBrokerageCashTransfer()) ? InvestmentScheduleType.STOCKS_ETFS : InvestmentScheduleType.BROKERAGE_CASH_TRANSFER;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestmentScheduleSettingsState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState$InvestmentScheduleType;", "", "<init>", "(Ljava/lang/String;I)V", "STOCKS_ETFS", "CRYPTO", "BROKERAGE_CASH_TRANSFER", "TRADITIONAL_IRA_CASH_TRANSFER", "ROTH_IRA_CASH_TRANSFER", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class InvestmentScheduleType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InvestmentScheduleType[] $VALUES;
        public static final InvestmentScheduleType STOCKS_ETFS = new InvestmentScheduleType("STOCKS_ETFS", 0);
        public static final InvestmentScheduleType CRYPTO = new InvestmentScheduleType("CRYPTO", 1);
        public static final InvestmentScheduleType BROKERAGE_CASH_TRANSFER = new InvestmentScheduleType("BROKERAGE_CASH_TRANSFER", 2);
        public static final InvestmentScheduleType TRADITIONAL_IRA_CASH_TRANSFER = new InvestmentScheduleType("TRADITIONAL_IRA_CASH_TRANSFER", 3);
        public static final InvestmentScheduleType ROTH_IRA_CASH_TRANSFER = new InvestmentScheduleType("ROTH_IRA_CASH_TRANSFER", 4);

        private static final /* synthetic */ InvestmentScheduleType[] $values() {
            return new InvestmentScheduleType[]{STOCKS_ETFS, CRYPTO, BROKERAGE_CASH_TRANSFER, TRADITIONAL_IRA_CASH_TRANSFER, ROTH_IRA_CASH_TRANSFER};
        }

        public static EnumEntries<InvestmentScheduleType> getEntries() {
            return $ENTRIES;
        }

        private InvestmentScheduleType(String str, int i) {
        }

        static {
            InvestmentScheduleType[] investmentScheduleTypeArr$values = $values();
            $VALUES = investmentScheduleTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(investmentScheduleTypeArr$values);
        }

        public static InvestmentScheduleType valueOf(String str) {
            return (InvestmentScheduleType) Enum.valueOf(InvestmentScheduleType.class, str);
        }

        public static InvestmentScheduleType[] values() {
            return (InvestmentScheduleType[]) $VALUES.clone();
        }
    }

    private final boolean getHasEnoughBuyingPower() {
        Money accountBuyingPower;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        BigDecimal decimalValue = null;
        InvestmentScheduleAmount investmentScheduleAmount = uiInvestmentSchedule != null ? uiInvestmentSchedule.getInvestmentScheduleAmount() : null;
        if (investmentScheduleAmount == null || (investmentScheduleAmount instanceof InvestmentScheduleAmount.Percentage)) {
            return true;
        }
        if (!(investmentScheduleAmount instanceof InvestmentScheduleAmount.Dollar)) {
            throw new NoWhenBranchMatchedException();
        }
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 != null && (accountBuyingPower = unifiedAccountV2.getAccountBuyingPower()) != null) {
            decimalValue = accountBuyingPower.getDecimalValue();
        }
        return BigDecimals7.gte(decimalValue, ((InvestmentScheduleAmount.Dollar) investmentScheduleAmount).getDollarAmount().getDecimalValue());
    }

    private final Integer getSourceOfFundsCta() {
        TradeSkippedReason pausedReason = getPausedReason();
        int i = pausedReason == null ? -1 : WhenMappings.$EnumSwitchMapping$3[pausedReason.ordinal()];
        if (i == 1 || i == 2) {
            return Integer.valueOf(C28446R.string.settings_investment_schedule_change_payment_method_cta);
        }
        if (i == 3 && !getHasEnoughBuyingPower()) {
            UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
            if ((uiInvestmentSchedule != null ? uiInvestmentSchedule.getSourceOfFunds() : null) == ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER) {
                return Integer.valueOf(C28446R.string.settings_investment_schedule_update_now_cta);
            }
        }
        return null;
    }

    public final boolean getShowSourceOfFundsRow$feature_recurring_settings_externalDebug() {
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        ApiInvestmentSchedule.Frequency frequency = uiInvestmentSchedule != null ? uiInvestmentSchedule.getFrequency() : null;
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4 || i == 5) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this.investmentSchedule.getDirectDepositRelationshipId() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SourceOfFundsRowState getSourceOfFundsRowState() {
        UiInvestmentSchedule uiInvestmentSchedule;
        StringResource stringResource;
        SourceOfFundsRowState.Destination insufficientBuyingPower;
        if (!getShowSourceOfFundsRow$feature_recurring_settings_externalDebug() || (uiInvestmentSchedule = this.investmentSchedule) == null) {
            return null;
        }
        Integer sourceOfFundsCta = getSourceOfFundsCta();
        boolean z = getPausedReason() == TradeSkippedReason.INSUFFICIENT_BUYING_POWER;
        if (sourceOfFundsCta != null) {
            stringResource = StringResource.INSTANCE.invoke(sourceOfFundsCta.intValue(), new Object[0]);
            if (stringResource == null) {
                stringResource = StringsKt.stringResource(uiInvestmentSchedule.getSourceOfFunds(), this.achRelationship, this.directDepositRelationship, this.investmentSchedule.isCrypto());
                if (stringResource == null) {
                    return null;
                }
            }
        }
        boolean z2 = sourceOfFundsCta != null;
        int i = WhenMappings.$EnumSwitchMapping$1[uiInvestmentSchedule.getFrequency().ordinal()];
        if (i == 1) {
            insufficientBuyingPower = SourceOfFundsRowState.Destination.PaycheckSourceOfFunds.INSTANCE;
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                insufficientBuyingPower = new SourceOfFundsRowState.Destination.InsufficientBuyingPower(uiInvestmentSchedule.getInvestmentScheduleAmount().getDollarAmount(), uiInvestmentSchedule.getFrequency());
            } else {
                insufficientBuyingPower = SourceOfFundsRowState.Destination.DefaultSourceOfFunds.INSTANCE;
            }
        }
        return new SourceOfFundsRowState(stringResource, z2, insufficientBuyingPower);
    }

    public final BackupPaymentRowState getBackupPaymentRowState() {
        int i;
        UiInvestmentSchedule uiInvestmentSchedule = this.investmentSchedule;
        if (uiInvestmentSchedule == null || uiInvestmentSchedule.getSourceOfFunds() != ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER) {
            return null;
        }
        if (uiInvestmentSchedule.isBackupAchEnabled() && this.achRelationship != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            String bankAccountNickname = this.achRelationship.getBankAccountNickname();
            if (bankAccountNickname == null) {
                bankAccountNickname = "";
            }
            return new BackupPaymentRowState(companion.invoke(bankAccountNickname), false);
        }
        ApiInvestmentSchedule.BackupPaymentRemovalReason backupPaymentRemovalReason = uiInvestmentSchedule.getBackupPaymentRemovalReason();
        boolean z = backupPaymentRemovalReason == null || backupPaymentRemovalReason == ApiInvestmentSchedule.BackupPaymentRemovalReason.BACKUP_REMOVAL_REASON_USER_INITIATED;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        if (z) {
            i = C28446R.string.settings_investment_schedule_add_backup_payment;
        } else {
            i = C28446R.string.settings_investment_schedule_edit_backup_payment;
        }
        return new BackupPaymentRowState(companion2.invoke(i, new Object[0]), true);
    }

    /* compiled from: InvestmentScheduleSettingsState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState$Companion;", "", "<init>", "()V", "LEARN_MORE_URL", "", "IRA_LIMIT_URL", "retirementRowTrailingIconRes", "", "getRetirementRowTrailingIconRes", "()I", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getRetirementRowTrailingIconRes() {
            return InvestmentScheduleSettingsState.retirementRowTrailingIconRes;
        }
    }
}
