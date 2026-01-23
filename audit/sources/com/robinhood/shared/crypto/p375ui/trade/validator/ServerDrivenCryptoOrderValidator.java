package com.robinhood.shared.crypto.p375ui.trade.validator;

import com.robinhood.models.api.ApiCryptoOrderValidationAlert;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.validate.ApiCryptoValidateOrderRequest;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.serverdriven.experimental.api.AcknowledgedAlertId;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerDrivenCryptoOrderValidator.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "<init>", "(Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;)V", "acknowledgedAlertIds", "", "Lcom/robinhood/models/serverdriven/experimental/api/AcknowledgedAlertId;", "validate", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "currencyPairId", "Ljava/util/UUID;", "monetizationModel", "Lcom/robinhood/models/api/fee/MonetizationModel;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "quantity", "Ljava/math/BigDecimal;", "equityInstrumentPrice", "(Ljava/util/UUID;Lcom/robinhood/models/api/fee/MonetizationModel;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/api/CryptoOrderType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acknowledgeAlert", "", "alertId", "resetAcknowledgedAlerts", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ServerDrivenCryptoOrderValidator {
    public static final int $stable = 8;
    private final Set<AcknowledgedAlertId> acknowledgedAlertIds;
    private final CryptoBonfireApi cryptoBonfireApi;

    /* compiled from: ServerDrivenCryptoOrderValidator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.ui.trade.validator.ServerDrivenCryptoOrderValidator", m3645f = "ServerDrivenCryptoOrderValidator.kt", m3646l = {38}, m3647m = "validate")
    /* renamed from: com.robinhood.shared.crypto.ui.trade.validator.ServerDrivenCryptoOrderValidator$validate$1 */
    static final class C386481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C386481(Continuation<? super C386481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerDrivenCryptoOrderValidator.this.validate(null, null, null, null, null, null, this);
        }
    }

    public ServerDrivenCryptoOrderValidator(CryptoBonfireApi cryptoBonfireApi) {
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.acknowledgedAlertIds = new LinkedHashSet();
    }

    public static /* synthetic */ Object validate$default(ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, UUID uuid, MonetizationModel monetizationModel, OrderSide orderSide, CryptoOrderType cryptoOrderType, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            bigDecimal = null;
        }
        if ((i & 32) != 0) {
            bigDecimal2 = null;
        }
        return serverDrivenCryptoOrderValidator.validate(uuid, monetizationModel, orderSide, cryptoOrderType, bigDecimal, bigDecimal2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validate(UUID uuid, MonetizationModel monetizationModel, OrderSide orderSide, CryptoOrderType cryptoOrderType, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super AlertAction<? extends CryptoValidateOrderAction>> continuation) {
        C386481 c386481;
        if (continuation instanceof C386481) {
            c386481 = (C386481) continuation;
            int i = c386481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c386481.label = i - Integer.MIN_VALUE;
            } else {
                c386481 = new C386481(continuation);
            }
        }
        Object cryptoTradingValidationAlert = c386481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c386481.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(cryptoTradingValidationAlert);
                CryptoBonfireApi cryptoBonfireApi = this.cryptoBonfireApi;
                ApiCryptoValidateOrderRequest apiCryptoValidateOrderRequest = new ApiCryptoValidateOrderRequest(cryptoOrderType, orderSide, uuid, bigDecimal2, monetizationModel, bigDecimal, this.acknowledgedAlertIds);
                c386481.label = 1;
                cryptoTradingValidationAlert = cryptoBonfireApi.getCryptoTradingValidationAlert(apiCryptoValidateOrderRequest, c386481);
                if (cryptoTradingValidationAlert == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(cryptoTradingValidationAlert);
            }
            return ((ApiCryptoOrderValidationAlert) cryptoTradingValidationAlert).getMobile();
        } finally {
        }
    }

    public final void acknowledgeAlert(AcknowledgedAlertId alertId) {
        Intrinsics.checkNotNullParameter(alertId, "alertId");
        this.acknowledgedAlertIds.add(alertId);
    }

    public final void resetAcknowledgedAlerts() {
        this.acknowledgedAlertIds.clear();
    }
}
