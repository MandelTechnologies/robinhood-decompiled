package com.robinhood.android.crypto.p094ui.detail.recurring;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringEvent;
import com.robinhood.models.SortableHistoryItem;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoDetailRecurringDataState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\bHJ\u0016\u0010I\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\bJJ\u0010\u0010K\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0002\bLJ\u000e\u0010M\u001a\u00020\fHÀ\u0003¢\u0006\u0002\bNJ\u000e\u0010O\u001a\u00020\fHÀ\u0003¢\u0006\u0002\bPJ\u000e\u0010Q\u001a\u00020\fHÀ\u0003¢\u0006\u0002\bRJ\u000b\u0010S\u001a\u0004\u0018\u00010\u0010HÂ\u0003J\t\u0010T\u001a\u00020\u0012HÂ\u0003J\t\u0010U\u001a\u00020\u0014HÂ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0002\bWJ\u0089\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010Y\u001a\u00020\f2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u000208HÖ\u0001J\t\u0010\\\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\f8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\f8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u000e\u001a\u00020\f8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0011\u0010)\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0011\u0010+\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u0011\u0010-\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u001f\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0014\u0010=\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\"R\u0014\u0010?\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0011\u0010@\u001a\u0002088G¢\u0006\u0006\u001a\u0004\bA\u0010:R\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "recurringSchedules", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "recurringTradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "isRecurringInvestmentRegionGateEnabled", "", "isEuRecurringEnabled", "isUsRecurringVTExperimentEnabled", "monetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "accountNumber", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/UiCryptoHolding;Ljava/util/List;Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;ZZZLcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;Ljava/lang/String;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoHolding$feature_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "getRecurringSchedules$feature_crypto_externalDebug", "()Ljava/util/List;", "getRecurringTradability$feature_crypto_externalDebug", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "isRecurringInvestmentRegionGateEnabled$feature_crypto_externalDebug", "()Z", "isEuRecurringEnabled$feature_crypto_externalDebug", "isUsRecurringVTExperimentEnabled$feature_crypto_externalDebug", "getAccountNumber$feature_crypto_externalDebug", "()Ljava/lang/String;", "showRecurringHeaderView", "getShowRecurringHeaderView", "showRecurringHeaderInfoIcon", "getShowRecurringHeaderInfoIcon", "showRecurringNuxView", "getShowRecurringNuxView", "showRecurringListView", "getShowRecurringListView", "recurringScheduleHistoryItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getRecurringScheduleHistoryItems", "()Lkotlinx/collections/immutable/ImmutableList;", "showHistoryAllCta", "getShowHistoryAllCta", "ctaText", "", "getCtaText", "()I", "hasRecurringSchedule", "getHasRecurringSchedule", "hasHolding", "getHasHolding", "isRecurringEnabled", "title", "getTitle", "recurringEvent", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "getRecurringEvent", "()Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "component1", "component2", "component2$feature_crypto_externalDebug", "component3", "component3$feature_crypto_externalDebug", "component4", "component4$feature_crypto_externalDebug", "component5", "component5$feature_crypto_externalDebug", "component6", "component6$feature_crypto_externalDebug", "component7", "component7$feature_crypto_externalDebug", "component8", "component9", "component10", "component11", "component11$feature_crypto_externalDebug", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailRecurringDataState {
    public static final int MAX_NUM_ITEMS_SHOWN = 3;
    private final String accountNumber;
    private final AppType appType;
    private final UiCryptoHolding cryptoHolding;
    private final UiCurrencyPair currencyPair;
    private final InvestmentScheduleKeyResolver investmentScheduleKeyResolver;
    private final boolean isEuRecurringEnabled;
    private final boolean isRecurringInvestmentRegionGateEnabled;
    private final boolean isUsRecurringVTExperimentEnabled;
    private final CryptoOrderMonetizationModel monetizationModel;
    private final List<InvestmentSchedule> recurringSchedules;
    private final InstrumentRecurringTradability recurringTradability;
    public static final int $stable = 8;

    /* compiled from: CryptoDetailRecurringDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final InvestmentScheduleKeyResolver getInvestmentScheduleKeyResolver() {
        return this.investmentScheduleKeyResolver;
    }

    /* renamed from: component8, reason: from getter */
    private final CryptoOrderMonetizationModel getMonetizationModel() {
        return this.monetizationModel;
    }

    /* renamed from: component9, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ CryptoDetailRecurringDataState copy$default(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, UiCurrencyPair uiCurrencyPair, UiCryptoHolding uiCryptoHolding, List list, InstrumentRecurringTradability instrumentRecurringTradability, boolean z, boolean z2, boolean z3, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, AppType appType, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoDetailRecurringDataState.currencyPair;
        }
        if ((i & 2) != 0) {
            uiCryptoHolding = cryptoDetailRecurringDataState.cryptoHolding;
        }
        if ((i & 4) != 0) {
            list = cryptoDetailRecurringDataState.recurringSchedules;
        }
        if ((i & 8) != 0) {
            instrumentRecurringTradability = cryptoDetailRecurringDataState.recurringTradability;
        }
        if ((i & 16) != 0) {
            z = cryptoDetailRecurringDataState.isRecurringInvestmentRegionGateEnabled;
        }
        if ((i & 32) != 0) {
            z2 = cryptoDetailRecurringDataState.isEuRecurringEnabled;
        }
        if ((i & 64) != 0) {
            z3 = cryptoDetailRecurringDataState.isUsRecurringVTExperimentEnabled;
        }
        if ((i & 128) != 0) {
            cryptoOrderMonetizationModel = cryptoDetailRecurringDataState.monetizationModel;
        }
        if ((i & 256) != 0) {
            appType = cryptoDetailRecurringDataState.appType;
        }
        if ((i & 512) != 0) {
            investmentScheduleKeyResolver = cryptoDetailRecurringDataState.investmentScheduleKeyResolver;
        }
        if ((i & 1024) != 0) {
            str = cryptoDetailRecurringDataState.accountNumber;
        }
        InvestmentScheduleKeyResolver investmentScheduleKeyResolver2 = investmentScheduleKeyResolver;
        String str2 = str;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel2 = cryptoOrderMonetizationModel;
        AppType appType2 = appType;
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        List list2 = list;
        return cryptoDetailRecurringDataState.copy(uiCurrencyPair, uiCryptoHolding, list2, instrumentRecurringTradability, z6, z4, z5, cryptoOrderMonetizationModel2, appType2, investmentScheduleKeyResolver2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component11$feature_crypto_externalDebug, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2$feature_crypto_externalDebug, reason: from getter */
    public final UiCryptoHolding getCryptoHolding() {
        return this.cryptoHolding;
    }

    public final List<InvestmentSchedule> component3$feature_crypto_externalDebug() {
        return this.recurringSchedules;
    }

    /* renamed from: component4$feature_crypto_externalDebug, reason: from getter */
    public final InstrumentRecurringTradability getRecurringTradability() {
        return this.recurringTradability;
    }

    /* renamed from: component5$feature_crypto_externalDebug, reason: from getter */
    public final boolean getIsRecurringInvestmentRegionGateEnabled() {
        return this.isRecurringInvestmentRegionGateEnabled;
    }

    /* renamed from: component6$feature_crypto_externalDebug, reason: from getter */
    public final boolean getIsEuRecurringEnabled() {
        return this.isEuRecurringEnabled;
    }

    /* renamed from: component7$feature_crypto_externalDebug, reason: from getter */
    public final boolean getIsUsRecurringVTExperimentEnabled() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    public final CryptoDetailRecurringDataState copy(UiCurrencyPair currencyPair, UiCryptoHolding cryptoHolding, List<InvestmentSchedule> recurringSchedules, InstrumentRecurringTradability recurringTradability, boolean isRecurringInvestmentRegionGateEnabled, boolean isEuRecurringEnabled, boolean isUsRecurringVTExperimentEnabled, CryptoOrderMonetizationModel monetizationModel, AppType appType, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, String accountNumber) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        return new CryptoDetailRecurringDataState(currencyPair, cryptoHolding, recurringSchedules, recurringTradability, isRecurringInvestmentRegionGateEnabled, isEuRecurringEnabled, isUsRecurringVTExperimentEnabled, monetizationModel, appType, investmentScheduleKeyResolver, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailRecurringDataState)) {
            return false;
        }
        CryptoDetailRecurringDataState cryptoDetailRecurringDataState = (CryptoDetailRecurringDataState) other;
        return Intrinsics.areEqual(this.currencyPair, cryptoDetailRecurringDataState.currencyPair) && Intrinsics.areEqual(this.cryptoHolding, cryptoDetailRecurringDataState.cryptoHolding) && Intrinsics.areEqual(this.recurringSchedules, cryptoDetailRecurringDataState.recurringSchedules) && Intrinsics.areEqual(this.recurringTradability, cryptoDetailRecurringDataState.recurringTradability) && this.isRecurringInvestmentRegionGateEnabled == cryptoDetailRecurringDataState.isRecurringInvestmentRegionGateEnabled && this.isEuRecurringEnabled == cryptoDetailRecurringDataState.isEuRecurringEnabled && this.isUsRecurringVTExperimentEnabled == cryptoDetailRecurringDataState.isUsRecurringVTExperimentEnabled && Intrinsics.areEqual(this.monetizationModel, cryptoDetailRecurringDataState.monetizationModel) && this.appType == cryptoDetailRecurringDataState.appType && Intrinsics.areEqual(this.investmentScheduleKeyResolver, cryptoDetailRecurringDataState.investmentScheduleKeyResolver) && Intrinsics.areEqual(this.accountNumber, cryptoDetailRecurringDataState.accountNumber);
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
        UiCryptoHolding uiCryptoHolding = this.cryptoHolding;
        int iHashCode2 = (iHashCode + (uiCryptoHolding == null ? 0 : uiCryptoHolding.hashCode())) * 31;
        List<InvestmentSchedule> list = this.recurringSchedules;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        InstrumentRecurringTradability instrumentRecurringTradability = this.recurringTradability;
        int iHashCode4 = (((((((iHashCode3 + (instrumentRecurringTradability == null ? 0 : instrumentRecurringTradability.hashCode())) * 31) + Boolean.hashCode(this.isRecurringInvestmentRegionGateEnabled)) * 31) + Boolean.hashCode(this.isEuRecurringEnabled)) * 31) + Boolean.hashCode(this.isUsRecurringVTExperimentEnabled)) * 31;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.monetizationModel;
        int iHashCode5 = (((((iHashCode4 + (cryptoOrderMonetizationModel == null ? 0 : cryptoOrderMonetizationModel.hashCode())) * 31) + this.appType.hashCode()) * 31) + this.investmentScheduleKeyResolver.hashCode()) * 31;
        String str = this.accountNumber;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDetailRecurringDataState(currencyPair=" + this.currencyPair + ", cryptoHolding=" + this.cryptoHolding + ", recurringSchedules=" + this.recurringSchedules + ", recurringTradability=" + this.recurringTradability + ", isRecurringInvestmentRegionGateEnabled=" + this.isRecurringInvestmentRegionGateEnabled + ", isEuRecurringEnabled=" + this.isEuRecurringEnabled + ", isUsRecurringVTExperimentEnabled=" + this.isUsRecurringVTExperimentEnabled + ", monetizationModel=" + this.monetizationModel + ", appType=" + this.appType + ", investmentScheduleKeyResolver=" + this.investmentScheduleKeyResolver + ", accountNumber=" + this.accountNumber + ")";
    }

    public CryptoDetailRecurringDataState(UiCurrencyPair uiCurrencyPair, UiCryptoHolding uiCryptoHolding, List<InvestmentSchedule> list, InstrumentRecurringTradability instrumentRecurringTradability, boolean z, boolean z2, boolean z3, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, AppType appType, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, String str) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        this.currencyPair = uiCurrencyPair;
        this.cryptoHolding = uiCryptoHolding;
        this.recurringSchedules = list;
        this.recurringTradability = instrumentRecurringTradability;
        this.isRecurringInvestmentRegionGateEnabled = z;
        this.isEuRecurringEnabled = z2;
        this.isUsRecurringVTExperimentEnabled = z3;
        this.monetizationModel = cryptoOrderMonetizationModel;
        this.appType = appType;
        this.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
        this.accountNumber = str;
    }

    public /* synthetic */ CryptoDetailRecurringDataState(UiCurrencyPair uiCurrencyPair, UiCryptoHolding uiCryptoHolding, List list, InstrumentRecurringTradability instrumentRecurringTradability, boolean z, boolean z2, boolean z3, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, AppType appType, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : uiCryptoHolding, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : instrumentRecurringTradability, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : cryptoOrderMonetizationModel, appType, investmentScheduleKeyResolver, (i & 1024) != 0 ? null : str);
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final UiCryptoHolding getCryptoHolding$feature_crypto_externalDebug() {
        return this.cryptoHolding;
    }

    public final List<InvestmentSchedule> getRecurringSchedules$feature_crypto_externalDebug() {
        return this.recurringSchedules;
    }

    public final InstrumentRecurringTradability getRecurringTradability$feature_crypto_externalDebug() {
        return this.recurringTradability;
    }

    /* renamed from: isRecurringInvestmentRegionGateEnabled$feature_crypto_externalDebug */
    public final boolean m1911x65f9ca9b() {
        return this.isRecurringInvestmentRegionGateEnabled;
    }

    public final boolean isEuRecurringEnabled$feature_crypto_externalDebug() {
        return this.isEuRecurringEnabled;
    }

    public final boolean isUsRecurringVTExperimentEnabled$feature_crypto_externalDebug() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    public final String getAccountNumber$feature_crypto_externalDebug() {
        return this.accountNumber;
    }

    public final boolean getShowRecurringHeaderView() {
        if (isRecurringEnabled()) {
            return getShowRecurringNuxView() || getShowRecurringListView();
        }
        return false;
    }

    public final boolean getShowRecurringHeaderInfoIcon() {
        return this.appType == AppType.RHC && isRecurringEnabled();
    }

    public final boolean getShowRecurringNuxView() {
        InstrumentRecurringTradability instrumentRecurringTradability;
        return isRecurringEnabled() && getHasHolding() && !getHasRecurringSchedule() && (instrumentRecurringTradability = this.recurringTradability) != null && instrumentRecurringTradability.isRecurringTradable();
    }

    public final boolean getShowRecurringListView() {
        return isRecurringEnabled() && getHasRecurringSchedule();
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getRecurringScheduleHistoryItems() {
        List listSortedWith;
        List listTake;
        List<InvestmentSchedule> list = this.recurringSchedules;
        if (list == null) {
            return null;
        }
        final Comparator comparator = new Comparator() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDataState$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Boolean.valueOf(((InvestmentSchedule) t).isPaused()), Boolean.valueOf(((InvestmentSchedule) t2).isPaused()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDataState$special$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((InvestmentSchedule) t).getNextInvestmentDate(), ((InvestmentSchedule) t2).getNextInvestmentDate());
            }
        };
        List listSortedWith2 = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDataState$special$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((InvestmentSchedule) t).getFrequency(), ((InvestmentSchedule) t2).getFrequency());
            }
        });
        if (listSortedWith2 == null || (listSortedWith = CollectionsKt.sortedWith(listSortedWith2, new Comparator() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDataState$special$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((SortableHistoryItem) t2).getSortingTimestamp(), ((SortableHistoryItem) t).getSortingTimestamp());
            }
        })) == null || (listTake = CollectionsKt.take(listSortedWith, 3)) == null) {
            return null;
        }
        List list2 = listTake;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentSchedule) it.next()).toStatefulHistoryEvent());
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final boolean getShowHistoryAllCta() {
        List<InvestmentSchedule> list;
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            return getShowRecurringListView();
        }
        if (i == 3) {
            return getShowRecurringListView() && (list = this.recurringSchedules) != null && list.size() > 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getCtaText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            return C12757R.string.crypto_detail_recurring_cta;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C11048R.string.general_label_show_all;
    }

    private final boolean getHasRecurringSchedule() {
        List<InvestmentSchedule> list;
        return (!isRecurringEnabled() || (list = this.recurringSchedules) == null || list.isEmpty()) ? false : true;
    }

    private final boolean getHasHolding() {
        return UiCryptoHolding2.isHeld(this.cryptoHolding);
    }

    private final boolean isRecurringEnabled() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 2) {
            return this.isEuRecurringEnabled;
        }
        if (i != 3) {
            return false;
        }
        return this.isRecurringInvestmentRegionGateEnabled;
    }

    public final int getTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("NCW not supported");
        }
        if (i == 2) {
            return C12757R.string.crypto_detail_recurring_title;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.recurring_investment_header;
    }

    public final CryptoDetailRecurringEvent getRecurringEvent() {
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (cryptoOrderMonetizationModel = this.monetizationModel) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("NCW not supported");
        }
        if (i == 2) {
            return new CryptoDetailRecurringEvent.EnterRecurringFlow(this.investmentScheduleKeyResolver.getRecurringCreationKey(uiCurrencyPair, this.accountNumber));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if ((cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Fee) && !this.isUsRecurringVTExperimentEnabled) {
            return new CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert(uiCurrencyPair.getAssetCurrency().getCode());
        }
        return new CryptoDetailRecurringEvent.EnterRecurringFlow(this.investmentScheduleKeyResolver.getRecurringCreationKey(uiCurrencyPair, this.accountNumber));
    }
}
