package com.robinhood.librobinhood.data.store.fee.monetizationModel;

import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TraderCryptoOrderMonetizationModelProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider;", "", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;)V", "get", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "get$lib_store_crypto_externalDebug", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderCryptoOrderMonetizationModelProvider {
    private final CryptoAccountPreferencesStore cryptoAccountPreferencesStore;
    private final CryptoAccountStore cryptoAccountStore;

    /* compiled from: TraderCryptoOrderMonetizationModelProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonetizationModel.values().length];
            try {
                iArr[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TraderCryptoOrderMonetizationModelProvider(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, CryptoAccountStore cryptoAccountStore) {
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoAccountStore = cryptoAccountStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get$lib_store_crypto_externalDebug(UiCurrencyPair uiCurrencyPair, Continuation<? super CryptoOrderMonetizationModel> continuation) {
        TraderCryptoOrderMonetizationModelProvider2 traderCryptoOrderMonetizationModelProvider2;
        if (continuation instanceof TraderCryptoOrderMonetizationModelProvider2) {
            traderCryptoOrderMonetizationModelProvider2 = (TraderCryptoOrderMonetizationModelProvider2) continuation;
            int i = traderCryptoOrderMonetizationModelProvider2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traderCryptoOrderMonetizationModelProvider2.label = i - Integer.MIN_VALUE;
            } else {
                traderCryptoOrderMonetizationModelProvider2 = new TraderCryptoOrderMonetizationModelProvider2(this, continuation);
            }
        }
        Object objFirstOrNull = traderCryptoOrderMonetizationModelProvider2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = traderCryptoOrderMonetizationModelProvider2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<CryptoAccount> flowStreamAccount = this.cryptoAccountStore.streamAccount();
            traderCryptoOrderMonetizationModelProvider2.L$0 = uiCurrencyPair;
            traderCryptoOrderMonetizationModelProvider2.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamAccount, traderCryptoOrderMonetizationModelProvider2);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            uiCurrencyPair = (UiCurrencyPair) traderCryptoOrderMonetizationModelProvider2.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiCurrencyPair = (UiCurrencyPair) traderCryptoOrderMonetizationModelProvider2.L$0;
                ResultKt.throwOnFailure(objFirstOrNull);
                CryptoAccountPreferences cryptoAccountPreferences = (CryptoAccountPreferences) objFirstOrNull;
                if (cryptoAccountPreferences.isIneligibleForMonetization()) {
                    return new CryptoOrderMonetizationModel.Rebate(CryptoOrderMonetizationModel.Rebate.Reason.Restricted.INSTANCE);
                }
                MonetizationModel monetizationModel = cryptoAccountPreferences.getMonetizationModel();
                if (!uiCurrencyPair.isFeeSupported()) {
                    return new CryptoOrderMonetizationModel.Rebate(new CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair(monetizationModel == MonetizationModel.FEE, uiCurrencyPair.getAssetCurrency().getCode(), uiCurrencyPair.isRebateMarketMakersSupported()));
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[monetizationModel.ordinal()];
                if (i3 == 1) {
                    return CryptoOrderMonetizationModel.Fee.INSTANCE;
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return new CryptoOrderMonetizationModel.Rebate(CryptoOrderMonetizationModel.Rebate.Reason.UserPreference.INSTANCE);
            }
            uiCurrencyPair = (UiCurrencyPair) traderCryptoOrderMonetizationModelProvider2.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            ((Result) objFirstOrNull).getValue();
            Flow<CryptoAccountPreferences> flowStreamAccountPreferences = this.cryptoAccountPreferencesStore.streamAccountPreferences();
            traderCryptoOrderMonetizationModelProvider2.L$0 = uiCurrencyPair;
            traderCryptoOrderMonetizationModelProvider2.label = 3;
            objFirstOrNull = FlowKt.first(flowStreamAccountPreferences, traderCryptoOrderMonetizationModelProvider2);
        }
        if (objFirstOrNull == null) {
            return new CryptoOrderMonetizationModel.Rebate(CryptoOrderMonetizationModel.Rebate.Reason.NoCryptoAccount.INSTANCE);
        }
        CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.cryptoAccountPreferencesStore;
        traderCryptoOrderMonetizationModelProvider2.L$0 = uiCurrencyPair;
        traderCryptoOrderMonetizationModelProvider2.label = 2;
        if (cryptoAccountPreferencesStore.m22601refreshAccountPreferencesIoAF18A(traderCryptoOrderMonetizationModelProvider2) != coroutine_suspended) {
            Flow<CryptoAccountPreferences> flowStreamAccountPreferences2 = this.cryptoAccountPreferencesStore.streamAccountPreferences();
            traderCryptoOrderMonetizationModelProvider2.L$0 = uiCurrencyPair;
            traderCryptoOrderMonetizationModelProvider2.label = 3;
            objFirstOrNull = FlowKt.first(flowStreamAccountPreferences2, traderCryptoOrderMonetizationModelProvider2);
        }
        return coroutine_suspended;
    }
}
