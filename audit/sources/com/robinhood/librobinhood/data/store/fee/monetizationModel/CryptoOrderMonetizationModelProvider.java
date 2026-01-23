package com.robinhood.librobinhood.data.store.fee.monetizationModel;

import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.shared.app.type.AppType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoOrderMonetizationModelProvider.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "traderCryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider;", "rhcCryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/RhcCryptoOrderMonetizationModelProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/RhcCryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/app/type/AppType;)V", "get", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "currencyPairId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoOrderMonetizationModelProvider {
    private final AppType appType;
    private final CurrencyPairV2Store currencyPairStore;
    private final RhcCryptoOrderMonetizationModelProvider rhcCryptoOrderMonetizationModelProvider;
    private final TraderCryptoOrderMonetizationModelProvider traderCryptoOrderMonetizationModelProvider;

    /* compiled from: CryptoOrderMonetizationModelProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CryptoOrderMonetizationModelProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider", m3645f = "CryptoOrderMonetizationModelProvider.kt", m3646l = {26, 30}, m3647m = "get")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider$get$1 */
    static final class C348121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348121(Continuation<? super C348121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoOrderMonetizationModelProvider.this.get(null, this);
        }
    }

    public CryptoOrderMonetizationModelProvider(CurrencyPairV2Store currencyPairStore, TraderCryptoOrderMonetizationModelProvider traderCryptoOrderMonetizationModelProvider, RhcCryptoOrderMonetizationModelProvider rhcCryptoOrderMonetizationModelProvider, AppType appType) {
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(traderCryptoOrderMonetizationModelProvider, "traderCryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(rhcCryptoOrderMonetizationModelProvider, "rhcCryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.currencyPairStore = currencyPairStore;
        this.traderCryptoOrderMonetizationModelProvider = traderCryptoOrderMonetizationModelProvider;
        this.rhcCryptoOrderMonetizationModelProvider = rhcCryptoOrderMonetizationModelProvider;
        this.appType = appType;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(UUID uuid, Continuation<? super CryptoOrderMonetizationModel> continuation) {
        C348121 c348121;
        if (continuation instanceof C348121) {
            c348121 = (C348121) continuation;
            int i = c348121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348121.label = i - Integer.MIN_VALUE;
            } else {
                c348121 = new C348121(continuation);
            }
        }
        Object objFirst = c348121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = this.currencyPairStore.streamCurrencyPairFlow(uuid);
            c348121.label = 1;
            objFirst = FlowKt.first(flowStreamCurrencyPairFlow, c348121);
            if (objFirst != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            return objFirst;
        }
        ResultKt.throwOnFailure(objFirst);
        UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) objFirst;
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i3 == 1) {
            return this.rhcCryptoOrderMonetizationModelProvider.get$lib_store_crypto_externalDebug(uiCurrencyPair);
        }
        if (i3 == 2) {
            TraderCryptoOrderMonetizationModelProvider traderCryptoOrderMonetizationModelProvider = this.traderCryptoOrderMonetizationModelProvider;
            c348121.label = 2;
            Object obj = traderCryptoOrderMonetizationModelProvider.get$lib_store_crypto_externalDebug(uiCurrencyPair, c348121);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unsupported app type: " + this.appType).toString());
    }
}
