package com.robinhood.android.equity.ordercheck;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.crypto.lib.C12914R;
import com.robinhood.android.equity.EquityOrderSourceLogging;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore;
import com.robinhood.librobinhood.data.store.EquityOrderChecksStore;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.ApiEquityOrderPostBody;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.annotation.AlertTypeDebugOverridePref;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;
import rosetta.order.AlertType;

/* compiled from: EquityOrderCheckValidator.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0002\b\u0017J7\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0002\b\u001cJ0\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001eH\u0086@¢\u0006\u0004\b&\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "", "equityOrderChecksStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderChecksStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "alertTypeDebugOverridePref", "Lcom/robinhood/prefs/EnumPreference;", "Lrosetta/order/AlertType;", "cryptoPendingAndCancelStore", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/EquityOrderChecksStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;)V", "logReview", "", "equityOrderPayload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderToReplaceId", "Ljava/util/UUID;", "logReview$lib_equity_validation_externalDebug", "logOrderCheck", "alertType", "", "accountType", "logOrderCheck$lib_equity_validation_externalDebug", "validateOrder", "Lkotlin/Result;", "Lcom/robinhood/models/db/EquityOrderChecksAlert;", "draft", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "validateOrder-BWLJW6A", "(Lcom/robinhood/models/db/DirectOrderRequestDraft;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPendingCryptoOrders", "Lcom/robinhood/utils/resource/StringResource;", "cancelPendingCryptoOrders-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityOrderCheckValidator {
    public static final int $stable = 8;
    private final EnumPreference<AlertType> alertTypeDebugOverridePref;
    private final CryptoPendingAndCancelStore cryptoPendingAndCancelStore;
    private final EquityOrderChecksStore equityOrderChecksStore;
    private final TraderEventLogger eventLogger;

    public EquityOrderCheckValidator(EquityOrderChecksStore equityOrderChecksStore, TraderEventLogger eventLogger, @AlertTypeDebugOverridePref EnumPreference<AlertType> alertTypeDebugOverridePref, CryptoPendingAndCancelStore cryptoPendingAndCancelStore) {
        Intrinsics.checkNotNullParameter(equityOrderChecksStore, "equityOrderChecksStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(alertTypeDebugOverridePref, "alertTypeDebugOverridePref");
        Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
        this.equityOrderChecksStore = equityOrderChecksStore;
        this.eventLogger = eventLogger;
        this.alertTypeDebugOverridePref = alertTypeDebugOverridePref;
        this.cryptoPendingAndCancelStore = cryptoPendingAndCancelStore;
    }

    public final void logReview$lib_equity_validation_externalDebug(EquityOrderPayload equityOrderPayload, BrokerageAccountType brokerageAccountType, EquityOrderFlowSource source, UUID orderToReplaceId) {
        Intrinsics.checkNotNullParameter(equityOrderPayload, "equityOrderPayload");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(source, "source");
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(this.eventLogger, OrderFormStep.REVIEW, equityOrderPayload, brokerageAccountType, EquityOrderSourceLogging.toMetaSource(source), null, null, orderToReplaceId, 48, null);
    }

    public final void logOrderCheck$lib_equity_validation_externalDebug(EquityOrderPayload equityOrderPayload, EquityOrderFlowSource source, String alertType, BrokerageAccountType accountType, UUID orderToReplaceId) {
        Intrinsics.checkNotNullParameter(equityOrderPayload, "equityOrderPayload");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(this.eventLogger, OrderFormStep.ORDER_CHECK, equityOrderPayload, accountType, EquityOrderSourceLogging.toMetaSource(source), alertType, null, orderToReplaceId, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: validateOrder-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13720validateOrderBWLJW6A(DirectOrderRequestDraft directOrderRequestDraft, BrokerageAccountType brokerageAccountType, EquityOrderFlowSource equityOrderFlowSource, Continuation<? super Result<? extends EquityOrderChecksAlert>> continuation) {
        EquityOrderCheckValidator3 equityOrderCheckValidator3;
        EquityOrderPayload orderPayload;
        Object objEquityOrderChecks;
        Throwable th;
        Object objM28550constructorimpl;
        EquityOrderChecksAlert equityOrderChecksAlert;
        if (continuation instanceof EquityOrderCheckValidator3) {
            equityOrderCheckValidator3 = (EquityOrderCheckValidator3) continuation;
            int i = equityOrderCheckValidator3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                equityOrderCheckValidator3.label = i - Integer.MIN_VALUE;
            } else {
                equityOrderCheckValidator3 = new EquityOrderCheckValidator3(this, continuation);
            }
        }
        Object obj = equityOrderCheckValidator3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = equityOrderCheckValidator3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            orderPayload = Logging5.toOrderPayload(directOrderRequestDraft);
            Order orderToReplace = directOrderRequestDraft.getOrderToReplace();
            logReview$lib_equity_validation_externalDebug(orderPayload, brokerageAccountType, equityOrderFlowSource, orderToReplace != null ? orderToReplace.getId() : null);
            try {
                Result.Companion companion = Result.INSTANCE;
                EquityOrderChecksStore equityOrderChecksStore = this.equityOrderChecksStore;
                ApiEquityOrderPostBody orderCheckBody = EquityOrderCheckValidator4.toOrderCheckBody(directOrderRequestDraft);
                Order orderToReplace2 = directOrderRequestDraft.getOrderToReplace();
                UUID id = orderToReplace2 != null ? orderToReplace2.getId() : null;
                AlertType alertType = (AlertType) this.alertTypeDebugOverridePref.getValue();
                equityOrderCheckValidator3.L$0 = directOrderRequestDraft;
                equityOrderCheckValidator3.L$1 = brokerageAccountType;
                equityOrderCheckValidator3.L$2 = equityOrderFlowSource;
                equityOrderCheckValidator3.L$3 = orderPayload;
                equityOrderCheckValidator3.label = 1;
                objEquityOrderChecks = equityOrderChecksStore.equityOrderChecks(orderCheckBody, id, alertType, equityOrderCheckValidator3);
                if (objEquityOrderChecks == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                EquityOrderFlowSource equityOrderFlowSource2 = equityOrderFlowSource;
                EquityOrderPayload equityOrderPayload = orderPayload;
                equityOrderChecksAlert = (EquityOrderChecksAlert) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
                if (equityOrderChecksAlert instanceof VisibleEquityOrderChecksAlert) {
                }
                return objM28550constructorimpl;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EquityOrderPayload equityOrderPayload2 = (EquityOrderPayload) equityOrderCheckValidator3.L$3;
            equityOrderFlowSource = (EquityOrderFlowSource) equityOrderCheckValidator3.L$2;
            brokerageAccountType = (BrokerageAccountType) equityOrderCheckValidator3.L$1;
            DirectOrderRequestDraft directOrderRequestDraft2 = (DirectOrderRequestDraft) equityOrderCheckValidator3.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objEquityOrderChecks = obj;
                orderPayload = equityOrderPayload2;
                directOrderRequestDraft = directOrderRequestDraft2;
            } catch (Throwable th3) {
                th = th3;
                orderPayload = equityOrderPayload2;
                directOrderRequestDraft = directOrderRequestDraft2;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                BrokerageAccountType brokerageAccountType22 = brokerageAccountType;
                EquityOrderFlowSource equityOrderFlowSource22 = equityOrderFlowSource;
                EquityOrderPayload equityOrderPayload3 = orderPayload;
                equityOrderChecksAlert = (EquityOrderChecksAlert) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
                if (equityOrderChecksAlert instanceof VisibleEquityOrderChecksAlert) {
                }
                return objM28550constructorimpl;
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((EquityOrderChecksAlert) ((Optional) objEquityOrderChecks).getOrNull());
        BrokerageAccountType brokerageAccountType222 = brokerageAccountType;
        EquityOrderFlowSource equityOrderFlowSource222 = equityOrderFlowSource;
        EquityOrderPayload equityOrderPayload32 = orderPayload;
        equityOrderChecksAlert = (EquityOrderChecksAlert) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
        if (equityOrderChecksAlert instanceof VisibleEquityOrderChecksAlert) {
            String alertType2 = ((VisibleEquityOrderChecksAlert) equityOrderChecksAlert).getAlertType();
            Order orderToReplace3 = directOrderRequestDraft.getOrderToReplace();
            logOrderCheck$lib_equity_validation_externalDebug(equityOrderPayload32, equityOrderFlowSource222, alertType2, brokerageAccountType222, orderToReplace3 != null ? orderToReplace3.getId() : null);
        }
        return objM28550constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: cancelPendingCryptoOrders-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13719cancelPendingCryptoOrdersIoAF18A(Continuation<? super Result<? extends StringResource>> continuation) {
        EquityOrderCheckValidator2 equityOrderCheckValidator2;
        if (continuation instanceof EquityOrderCheckValidator2) {
            equityOrderCheckValidator2 = (EquityOrderCheckValidator2) continuation;
            int i = equityOrderCheckValidator2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                equityOrderCheckValidator2.label = i - Integer.MIN_VALUE;
            } else {
                equityOrderCheckValidator2 = new EquityOrderCheckValidator2(this, continuation);
            }
        }
        Object objAwait = equityOrderCheckValidator2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = equityOrderCheckValidator2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Result.Companion companion = Result.INSTANCE;
                Single<ApiCryptoCancelAllPendingOrders> singleCancelAllBuySidePendingOrders = this.cryptoPendingAndCancelStore.cancelAllBuySidePendingOrders();
                equityOrderCheckValidator2.label = 1;
                objAwait = RxAwait3.await(singleCancelAllBuySidePendingOrders, equityOrderCheckValidator2);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrders = (ApiCryptoCancelAllPendingOrders) objAwait;
            return Result.m28550constructorimpl(apiCryptoCancelAllPendingOrders.getTotal_pending_order_count() != apiCryptoCancelAllPendingOrders.getCanceled_pending_order_count() ? StringResource.INSTANCE.invoke(C12914R.string.cancel_pending_crypto_orders_equity_error_description, boxing.boxInt(apiCryptoCancelAllPendingOrders.getCanceled_pending_order_count()), boxing.boxInt(apiCryptoCancelAllPendingOrders.getTotal_pending_order_count())) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }
}
