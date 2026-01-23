package com.robinhood.android.common.recurring.upsell;

import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellTimestampsPref;
import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellViewCountPref;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongSetPreference;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import com.robinhood.store.base.InvestmentScheduleStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoRecurringOrderUpsellManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "cryptoRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "recurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/LongSetPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/store/base/InvestmentScheduleStore;Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "getCryptoRecurringUpsell", "Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoRecurringOrderUpsellManager extends RecurringOrderUpsellManager {
    private static final int CRYPTO_RECURRING_ORDER_UPSELL_MAX_IMPRESSIONS = 10;
    private final AppType appType;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final LongSetPreference cryptoRecurringOrderUpsellTimestampsPref;
    private final IntPreference cryptoRecurringOrderUpsellViewCountPref;
    private final InvestmentScheduleStore investmentScheduleStore;
    private final InstrumentRecurringTradabilityStore recurringTradabilityStore;
    private final RegionGateProvider regionGateProvider;
    public static final int $stable = 8;

    /* compiled from: CryptoRecurringOrderUpsellManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.upsell.CryptoRecurringOrderUpsellManager", m3645f = "CryptoRecurringOrderUpsellManager.kt", m3646l = {40, 46, 57, 66}, m3647m = "getCryptoRecurringUpsell")
    /* renamed from: com.robinhood.android.common.recurring.upsell.CryptoRecurringOrderUpsellManager$getCryptoRecurringUpsell$1 */
    static final class C117901 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C117901(Continuation<? super C117901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoRecurringOrderUpsellManager.this.getCryptoRecurringUpsell(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoRecurringOrderUpsellManager(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, @RecurringOrderUpsellTimestampsPref LongSetPreference cryptoRecurringOrderUpsellTimestampsPref, @RecurringOrderUpsellViewCountPref IntPreference cryptoRecurringOrderUpsellViewCountPref, InvestmentScheduleStore investmentScheduleStore, InstrumentRecurringTradabilityStore recurringTradabilityStore, RegionGateProvider regionGateProvider) {
        super(cryptoRecurringOrderUpsellTimestampsPref, cryptoRecurringOrderUpsellViewCountPref, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellTimestampsPref, "cryptoRecurringOrderUpsellTimestampsPref");
        Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellViewCountPref, "cryptoRecurringOrderUpsellViewCountPref");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoRecurringOrderUpsellTimestampsPref = cryptoRecurringOrderUpsellTimestampsPref;
        this.cryptoRecurringOrderUpsellViewCountPref = cryptoRecurringOrderUpsellViewCountPref;
        this.investmentScheduleStore = investmentScheduleStore;
        this.recurringTradabilityStore = recurringTradabilityStore;
        this.regionGateProvider = regionGateProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[PHI: r10 r11
      0x00c0: PHI (r10v7 com.robinhood.models.crypto.db.CryptoOrder) = (r10v4 com.robinhood.models.crypto.db.CryptoOrder), (r10v22 com.robinhood.models.crypto.db.CryptoOrder) binds: [B:39:0x00bd, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r11v19 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:39:0x00bd, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoRecurringUpsell(UiCryptoOrder uiCryptoOrder, Continuation<? super RecurringOrderUpsellManager.RecurringUpsell> continuation) {
        C117901 c117901;
        CryptoOrder cryptoOrder;
        if (continuation instanceof C117901) {
            c117901 = (C117901) continuation;
            int i = c117901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117901.label = i - Integer.MIN_VALUE;
            } else {
                c117901 = new C117901(continuation);
            }
        }
        Object objFirst = c117901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c117901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            cryptoOrder = uiCryptoOrder.getCryptoOrder();
            Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null);
            c117901.L$0 = cryptoOrder;
            c117901.label = 1;
            objFirst = FlowKt.first(flowStreamRegionGateStateFlow$default, c117901);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            cryptoOrder = (CryptoOrder) c117901.L$0;
            ResultKt.throwOnFailure(objFirst);
        } else {
            if (i2 == 2) {
                cryptoOrder = (CryptoOrder) c117901.L$0;
                ResultKt.throwOnFailure(objFirst);
                if (!((Boolean) objFirst).booleanValue() && cryptoOrder.getMonetizationModel() == MonetizationModel.FEE) {
                    return RecurringOrderUpsellManager.RecurringUpsell.NONE;
                }
                Flow<InstrumentRecurringTradability> flowStreamRecurringInstrumentTradableByAssetType = this.recurringTradabilityStore.streamRecurringInstrumentTradableByAssetType(InstrumentRecurringTradabilityStore.AssetType.CRYPTO, cryptoOrder.getCurrencyPairId());
                c117901.L$0 = cryptoOrder;
                c117901.label = 3;
                objFirst = FlowKt.first(flowStreamRecurringInstrumentTradableByAssetType, c117901);
                if (objFirst != coroutine_suspended) {
                    if (((InstrumentRecurringTradability) objFirst).isRecurringTradable()) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cryptoOrder = (CryptoOrder) c117901.L$0;
                ResultKt.throwOnFailure(objFirst);
                List list = (List) objFirst;
                if (cryptoOrder.getSide() != OrderSide.BUY || cryptoOrder.getType() != CryptoOrderType.MARKET || !list.isEmpty()) {
                    return RecurringOrderUpsellManager.RecurringUpsell.NONE;
                }
                if (getUpsellViewCount$feature_lib_recurring_externalDebug() >= 10 || getHasSeenWithinWindow$feature_lib_recurring_externalDebug()) {
                    return RecurringOrderUpsellManager.RecurringUpsell.PASSIVE;
                }
                return RecurringOrderUpsellManager.RecurringUpsell.AGGRESSIVE;
            }
            cryptoOrder = (CryptoOrder) c117901.L$0;
            ResultKt.throwOnFailure(objFirst);
            if (((InstrumentRecurringTradability) objFirst).isRecurringTradable()) {
                return RecurringOrderUpsellManager.RecurringUpsell.NONE;
            }
            Flow<List<InvestmentSchedule>> flowStreamInvestmentSchedulesBySelectedAccount = this.investmentScheduleStore.streamInvestmentSchedulesBySelectedAccount(new CryptoAccountSwitcherLocation.Buy(cryptoOrder.getCurrencyPairId()));
            c117901.L$0 = cryptoOrder;
            c117901.label = 4;
            objFirst = FlowKt.first(flowStreamInvestmentSchedulesBySelectedAccount, c117901);
        }
        if (!((Boolean) objFirst).booleanValue()) {
            return RecurringOrderUpsellManager.RecurringUpsell.NONE;
        }
        if (this.appType == AppType.TRADER) {
            Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
            c117901.L$0 = cryptoOrder;
            c117901.label = 2;
            objFirst = FlowKt.first(flowStreamCryptoRecurringOrdersVTExperiment, c117901);
        } else {
            Flow<InstrumentRecurringTradability> flowStreamRecurringInstrumentTradableByAssetType2 = this.recurringTradabilityStore.streamRecurringInstrumentTradableByAssetType(InstrumentRecurringTradabilityStore.AssetType.CRYPTO, cryptoOrder.getCurrencyPairId());
            c117901.L$0 = cryptoOrder;
            c117901.label = 3;
            objFirst = FlowKt.first(flowStreamRecurringInstrumentTradableByAssetType2, c117901);
            if (objFirst != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
