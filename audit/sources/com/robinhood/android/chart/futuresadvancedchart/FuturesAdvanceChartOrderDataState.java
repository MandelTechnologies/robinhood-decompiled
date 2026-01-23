package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAdvanceChartOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003Jw\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\u0013\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;", "", "activeInstrumentId", "Ljava/util/UUID;", "activeRhsAccount", "Lcom/robinhood/models/db/Account;", "buyingPower", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;", "orderInstrument", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;", "instrumentTradeAmount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "instrumentPosition", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesChartPosition;", "autoSendOrders", "", "activeFuturesAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "activeRhsAccountFeatures", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesChartPosition;ZLcom/robinhood/android/models/futures/db/FuturesAccount;Ljava/util/Set;)V", "getActiveInstrumentId", "()Ljava/util/UUID;", "getActiveRhsAccount", "()Lcom/robinhood/models/db/Account;", "getBuyingPower", "()Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;", "getOrderInstrument", "()Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;", "getInstrumentTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "getInstrumentPosition", "()Lcom/robinhood/android/chart/futuresadvancedchart/FuturesChartPosition;", "getAutoSendOrders", "()Z", "getActiveFuturesAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getActiveRhsAccountFeatures", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FuturesAdvanceChartOrderDataState {
    private final FuturesAccount activeFuturesAccount;
    private final UUID activeInstrumentId;
    private final Account activeRhsAccount;
    private final Set<AccountFeature> activeRhsAccountFeatures;
    private final boolean autoSendOrders;
    private final FuturesInstrumentBuyingPower buyingPower;
    private final FuturesChartPosition instrumentPosition;
    private final InstrumentOrderState4 instrumentTradeAmount;
    private final FuturesInstrument orderInstrument;

    public FuturesAdvanceChartOrderDataState() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public static /* synthetic */ FuturesAdvanceChartOrderDataState copy$default(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, UUID uuid, Account account, FuturesInstrumentBuyingPower futuresOrderState4, FuturesInstrument futuresInstrument, InstrumentOrderState4 instrumentOrderState4, FuturesChartPosition futuresChartPosition, boolean z, FuturesAccount futuresAccount, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresAdvanceChartOrderDataState.activeInstrumentId;
        }
        if ((i & 2) != 0) {
            account = futuresAdvanceChartOrderDataState.activeRhsAccount;
        }
        if ((i & 4) != 0) {
            futuresOrderState4 = futuresAdvanceChartOrderDataState.buyingPower;
        }
        if ((i & 8) != 0) {
            futuresInstrument = futuresAdvanceChartOrderDataState.orderInstrument;
        }
        if ((i & 16) != 0) {
            instrumentOrderState4 = futuresAdvanceChartOrderDataState.instrumentTradeAmount;
        }
        if ((i & 32) != 0) {
            futuresChartPosition = futuresAdvanceChartOrderDataState.instrumentPosition;
        }
        if ((i & 64) != 0) {
            z = futuresAdvanceChartOrderDataState.autoSendOrders;
        }
        if ((i & 128) != 0) {
            futuresAccount = futuresAdvanceChartOrderDataState.activeFuturesAccount;
        }
        if ((i & 256) != 0) {
            set = futuresAdvanceChartOrderDataState.activeRhsAccountFeatures;
        }
        FuturesAccount futuresAccount2 = futuresAccount;
        Set set2 = set;
        FuturesChartPosition futuresChartPosition2 = futuresChartPosition;
        boolean z2 = z;
        InstrumentOrderState4 instrumentOrderState42 = instrumentOrderState4;
        FuturesInstrumentBuyingPower futuresOrderState42 = futuresOrderState4;
        return futuresAdvanceChartOrderDataState.copy(uuid, account, futuresOrderState42, futuresInstrument, instrumentOrderState42, futuresChartPosition2, z2, futuresAccount2, set2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getActiveRhsAccount() {
        return this.activeRhsAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesInstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component4, reason: from getter */
    public final FuturesInstrument getOrderInstrument() {
        return this.orderInstrument;
    }

    /* renamed from: component5, reason: from getter */
    public final InstrumentOrderState4 getInstrumentTradeAmount() {
        return this.instrumentTradeAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final FuturesChartPosition getInstrumentPosition() {
        return this.instrumentPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAutoSendOrders() {
        return this.autoSendOrders;
    }

    /* renamed from: component8, reason: from getter */
    public final FuturesAccount getActiveFuturesAccount() {
        return this.activeFuturesAccount;
    }

    public final Set<AccountFeature> component9() {
        return this.activeRhsAccountFeatures;
    }

    public final FuturesAdvanceChartOrderDataState copy(UUID activeInstrumentId, Account activeRhsAccount, FuturesInstrumentBuyingPower buyingPower, FuturesInstrument orderInstrument, InstrumentOrderState4 instrumentTradeAmount, FuturesChartPosition instrumentPosition, boolean autoSendOrders, FuturesAccount activeFuturesAccount, Set<? extends AccountFeature> activeRhsAccountFeatures) {
        Intrinsics.checkNotNullParameter(activeRhsAccountFeatures, "activeRhsAccountFeatures");
        return new FuturesAdvanceChartOrderDataState(activeInstrumentId, activeRhsAccount, buyingPower, orderInstrument, instrumentTradeAmount, instrumentPosition, autoSendOrders, activeFuturesAccount, activeRhsAccountFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAdvanceChartOrderDataState)) {
            return false;
        }
        FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState = (FuturesAdvanceChartOrderDataState) other;
        return Intrinsics.areEqual(this.activeInstrumentId, futuresAdvanceChartOrderDataState.activeInstrumentId) && Intrinsics.areEqual(this.activeRhsAccount, futuresAdvanceChartOrderDataState.activeRhsAccount) && Intrinsics.areEqual(this.buyingPower, futuresAdvanceChartOrderDataState.buyingPower) && Intrinsics.areEqual(this.orderInstrument, futuresAdvanceChartOrderDataState.orderInstrument) && Intrinsics.areEqual(this.instrumentTradeAmount, futuresAdvanceChartOrderDataState.instrumentTradeAmount) && Intrinsics.areEqual(this.instrumentPosition, futuresAdvanceChartOrderDataState.instrumentPosition) && this.autoSendOrders == futuresAdvanceChartOrderDataState.autoSendOrders && Intrinsics.areEqual(this.activeFuturesAccount, futuresAdvanceChartOrderDataState.activeFuturesAccount) && Intrinsics.areEqual(this.activeRhsAccountFeatures, futuresAdvanceChartOrderDataState.activeRhsAccountFeatures);
    }

    public int hashCode() {
        UUID uuid = this.activeInstrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Account account = this.activeRhsAccount;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        FuturesInstrumentBuyingPower futuresOrderState4 = this.buyingPower;
        int iHashCode3 = (iHashCode2 + (futuresOrderState4 == null ? 0 : futuresOrderState4.hashCode())) * 31;
        FuturesInstrument futuresInstrument = this.orderInstrument;
        int iHashCode4 = (iHashCode3 + (futuresInstrument == null ? 0 : futuresInstrument.hashCode())) * 31;
        InstrumentOrderState4 instrumentOrderState4 = this.instrumentTradeAmount;
        int iHashCode5 = (iHashCode4 + (instrumentOrderState4 == null ? 0 : instrumentOrderState4.hashCode())) * 31;
        FuturesChartPosition futuresChartPosition = this.instrumentPosition;
        int iHashCode6 = (((iHashCode5 + (futuresChartPosition == null ? 0 : futuresChartPosition.hashCode())) * 31) + Boolean.hashCode(this.autoSendOrders)) * 31;
        FuturesAccount futuresAccount = this.activeFuturesAccount;
        return ((iHashCode6 + (futuresAccount != null ? futuresAccount.hashCode() : 0)) * 31) + this.activeRhsAccountFeatures.hashCode();
    }

    public String toString() {
        return "FuturesAdvanceChartOrderDataState(activeInstrumentId=" + this.activeInstrumentId + ", activeRhsAccount=" + this.activeRhsAccount + ", buyingPower=" + this.buyingPower + ", orderInstrument=" + this.orderInstrument + ", instrumentTradeAmount=" + this.instrumentTradeAmount + ", instrumentPosition=" + this.instrumentPosition + ", autoSendOrders=" + this.autoSendOrders + ", activeFuturesAccount=" + this.activeFuturesAccount + ", activeRhsAccountFeatures=" + this.activeRhsAccountFeatures + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAdvanceChartOrderDataState(UUID uuid, Account account, FuturesInstrumentBuyingPower futuresOrderState4, FuturesInstrument futuresInstrument, InstrumentOrderState4 instrumentOrderState4, FuturesChartPosition futuresChartPosition, boolean z, FuturesAccount futuresAccount, Set<? extends AccountFeature> activeRhsAccountFeatures) {
        Intrinsics.checkNotNullParameter(activeRhsAccountFeatures, "activeRhsAccountFeatures");
        this.activeInstrumentId = uuid;
        this.activeRhsAccount = account;
        this.buyingPower = futuresOrderState4;
        this.orderInstrument = futuresInstrument;
        this.instrumentTradeAmount = instrumentOrderState4;
        this.instrumentPosition = futuresChartPosition;
        this.autoSendOrders = z;
        this.activeFuturesAccount = futuresAccount;
        this.activeRhsAccountFeatures = activeRhsAccountFeatures;
    }

    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
    }

    public final Account getActiveRhsAccount() {
        return this.activeRhsAccount;
    }

    public final FuturesInstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    public final FuturesInstrument getOrderInstrument() {
        return this.orderInstrument;
    }

    public /* synthetic */ FuturesAdvanceChartOrderDataState(UUID uuid, Account account, FuturesInstrumentBuyingPower futuresOrderState4, FuturesInstrument futuresInstrument, InstrumentOrderState4 instrumentOrderState4, FuturesChartPosition futuresChartPosition, boolean z, FuturesAccount futuresAccount, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        uuid = (i & 1) != 0 ? null : uuid;
        account = (i & 2) != 0 ? null : account;
        futuresOrderState4 = (i & 4) != 0 ? null : futuresOrderState4;
        futuresInstrument = (i & 8) != 0 ? null : futuresInstrument;
        if ((i & 16) != 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            instrumentOrderState4 = new Quantity(ZERO);
        }
        this(uuid, account, futuresOrderState4, futuresInstrument, instrumentOrderState4, (i & 32) != 0 ? null : futuresChartPosition, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : futuresAccount, (i & 256) != 0 ? SetsKt.emptySet() : set);
    }

    public final InstrumentOrderState4 getInstrumentTradeAmount() {
        return this.instrumentTradeAmount;
    }

    public final FuturesChartPosition getInstrumentPosition() {
        return this.instrumentPosition;
    }

    public final boolean getAutoSendOrders() {
        return this.autoSendOrders;
    }

    public final FuturesAccount getActiveFuturesAccount() {
        return this.activeFuturesAccount;
    }

    public final Set<AccountFeature> getActiveRhsAccountFeatures() {
        return this.activeRhsAccountFeatures;
    }
}
