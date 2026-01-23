package com.robinhood.shared.crypto.trading;

import bff_money_movement.service.p019v1.BillingAccountDto;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderCallbacks;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderManager.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002()B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0006\u0010'\u001a\u00020#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "billingCryptoOrderStore", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;)V", "billingOrderCallbacks", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderCallbacks;", "getBillingOrderCallbacks", "()Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderCallbacks;", "setBillingOrderCallbacks", "(Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderCallbacks;)V", "getUuid", "Ljava/util/UUID;", "request", "getId", WebsocketGatewayConstants.DATA_KEY, "isFinal", "", Card.Icon.ORDER, "getSubmissionObservable", "Lio/reactivex/Single;", "getPollingObservable", "Lio/reactivex/Observable;", "fetchOrder", "orderId", "onUpdate", "", "passthrough", "", "getShouldTriggerConfirmationInstantly", "setBillingOrder3DSecureComplete", "Request", "Response", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public class CryptoOrderManager extends OrderSubmissionManager<Response, Request> {
    private final AccountProvider accountProvider;
    private final BillingCryptoOrderStore billingCryptoOrderStore;
    private BillingCryptoOrderCallbacks billingOrderCallbacks;
    private final CryptoOrderStore cryptoOrderStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderManager(@RootCoroutineScope CoroutineScope coroutineScope, AccountProvider accountProvider, CryptoOrderStore cryptoOrderStore, BillingCryptoOrderStore billingCryptoOrderStore) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(billingCryptoOrderStore, "billingCryptoOrderStore");
        this.accountProvider = accountProvider;
        this.cryptoOrderStore = cryptoOrderStore;
        this.billingCryptoOrderStore = billingCryptoOrderStore;
    }

    /* compiled from: CryptoOrderManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", "", Card.Icon.ORDER, "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "getOrder", "()Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "Standard", "Billing", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request$Billing;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request$Standard;", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Request {
        ApiCryptoOrderRequest getOrder();

        /* compiled from: CryptoOrderManager.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request$Standard;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", Card.Icon.ORDER, "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "<init>", "(Lcom/robinhood/models/api/ApiCryptoOrderRequest;)V", "getOrder", "()Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Standard implements Request {
            private final ApiCryptoOrderRequest order;

            public static /* synthetic */ Standard copy$default(Standard standard, ApiCryptoOrderRequest apiCryptoOrderRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiCryptoOrderRequest = standard.order;
                }
                return standard.copy(apiCryptoOrderRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCryptoOrderRequest getOrder() {
                return this.order;
            }

            public final Standard copy(ApiCryptoOrderRequest order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return new Standard(order);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Standard) && Intrinsics.areEqual(this.order, ((Standard) other).order);
            }

            public int hashCode() {
                return this.order.hashCode();
            }

            public String toString() {
                return "Standard(order=" + this.order + ")";
            }

            public Standard(ApiCryptoOrderRequest order) {
                Intrinsics.checkNotNullParameter(order, "order");
                this.order = order;
            }

            @Override // com.robinhood.shared.crypto.trading.CryptoOrderManager.Request
            public ApiCryptoOrderRequest getOrder() {
                return this.order;
            }
        }

        /* compiled from: CryptoOrderManager.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request$Billing;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", Card.Icon.ORDER, "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "billingAccount", "Lbff_money_movement/service/v1/BillingAccountDto;", "<init>", "(Lcom/robinhood/models/api/ApiCryptoOrderRequest;Lbff_money_movement/service/v1/BillingAccountDto;)V", "getOrder", "()Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "getBillingAccount", "()Lbff_money_movement/service/v1/BillingAccountDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Billing implements Request {
            private final BillingAccountDto billingAccount;
            private final ApiCryptoOrderRequest order;

            public static /* synthetic */ Billing copy$default(Billing billing2, ApiCryptoOrderRequest apiCryptoOrderRequest, BillingAccountDto billingAccountDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiCryptoOrderRequest = billing2.order;
                }
                if ((i & 2) != 0) {
                    billingAccountDto = billing2.billingAccount;
                }
                return billing2.copy(apiCryptoOrderRequest, billingAccountDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCryptoOrderRequest getOrder() {
                return this.order;
            }

            /* renamed from: component2, reason: from getter */
            public final BillingAccountDto getBillingAccount() {
                return this.billingAccount;
            }

            public final Billing copy(ApiCryptoOrderRequest order, BillingAccountDto billingAccount) {
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(billingAccount, "billingAccount");
                return new Billing(order, billingAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Billing)) {
                    return false;
                }
                Billing billing2 = (Billing) other;
                return Intrinsics.areEqual(this.order, billing2.order) && Intrinsics.areEqual(this.billingAccount, billing2.billingAccount);
            }

            public int hashCode() {
                return (this.order.hashCode() * 31) + this.billingAccount.hashCode();
            }

            public String toString() {
                return "Billing(order=" + this.order + ", billingAccount=" + this.billingAccount + ")";
            }

            public Billing(ApiCryptoOrderRequest order, BillingAccountDto billingAccount) {
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(billingAccount, "billingAccount");
                this.order = order;
                this.billingAccount = billingAccount;
            }

            @Override // com.robinhood.shared.crypto.trading.CryptoOrderManager.Request
            public ApiCryptoOrderRequest getOrder() {
                return this.order;
            }

            public final BillingAccountDto getBillingAccount() {
                return this.billingAccount;
            }
        }
    }

    /* compiled from: CryptoOrderManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", "", "Standard", "BillingOrderPending", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response$BillingOrderPending;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response$Standard;", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Response {

        /* compiled from: CryptoOrderManager.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response$Standard;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Standard implements Response {
            private final UiCryptoOrder order;

            public static /* synthetic */ Standard copy$default(Standard standard, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCryptoOrder = standard.order;
                }
                return standard.copy(uiCryptoOrder);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCryptoOrder getOrder() {
                return this.order;
            }

            public final Standard copy(UiCryptoOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return new Standard(order);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Standard) && Intrinsics.areEqual(this.order, ((Standard) other).order);
            }

            public int hashCode() {
                return this.order.hashCode();
            }

            public String toString() {
                return "Standard(order=" + this.order + ")";
            }

            public Standard(UiCryptoOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                this.order = order;
            }

            public final UiCryptoOrder getOrder() {
                return this.order;
            }
        }

        /* compiled from: CryptoOrderManager.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response$BillingOrderPending;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", "orderRequest", "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "<init>", "(Lcom/robinhood/models/api/ApiCryptoOrderRequest;)V", "getOrderRequest", "()Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BillingOrderPending implements Response {
            private final ApiCryptoOrderRequest orderRequest;

            public static /* synthetic */ BillingOrderPending copy$default(BillingOrderPending billingOrderPending, ApiCryptoOrderRequest apiCryptoOrderRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiCryptoOrderRequest = billingOrderPending.orderRequest;
                }
                return billingOrderPending.copy(apiCryptoOrderRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCryptoOrderRequest getOrderRequest() {
                return this.orderRequest;
            }

            public final BillingOrderPending copy(ApiCryptoOrderRequest orderRequest) {
                Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
                return new BillingOrderPending(orderRequest);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BillingOrderPending) && Intrinsics.areEqual(this.orderRequest, ((BillingOrderPending) other).orderRequest);
            }

            public int hashCode() {
                return this.orderRequest.hashCode();
            }

            public String toString() {
                return "BillingOrderPending(orderRequest=" + this.orderRequest + ")";
            }

            public BillingOrderPending(ApiCryptoOrderRequest orderRequest) {
                Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
                this.orderRequest = orderRequest;
            }

            public final ApiCryptoOrderRequest getOrderRequest() {
                return this.orderRequest;
            }
        }
    }

    public final BillingCryptoOrderCallbacks getBillingOrderCallbacks() {
        return this.billingOrderCallbacks;
    }

    public final void setBillingOrderCallbacks(BillingCryptoOrderCallbacks billingCryptoOrderCallbacks) {
        this.billingOrderCallbacks = billingCryptoOrderCallbacks;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getUuid(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getOrder().getRef_id();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public UUID getId(Response data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof Response.Standard) {
            return ((Response.Standard) data).getOrder().getId();
        }
        if (data instanceof Response.BillingOrderPending) {
            return ((Response.BillingOrderPending) data).getOrderRequest().getRef_id();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean isFinal(Response order) {
        Intrinsics.checkNotNullParameter(order, "order");
        if (order instanceof Response.Standard) {
            return ((Response.Standard) order).getOrder().getCryptoOrder().isFinal();
        }
        if (order instanceof Response.BillingOrderPending) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<Response> getSubmissionObservable(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof Request.Standard) {
            Single map = this.cryptoOrderStore.submitOrder(((Request.Standard) request).getOrder()).map(new Function() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderManager.getSubmissionObservable.1
                @Override // io.reactivex.functions.Function
                public final Response.Standard apply(UiCryptoOrder p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return new Response.Standard(p0);
                }
            });
            Intrinsics.checkNotNull(map);
            return map;
        }
        if (!(request instanceof Request.Billing)) {
            throw new NoWhenBranchMatchedException();
        }
        Request.Billing billing2 = (Request.Billing) request;
        Single<Response> singleTimeout = this.billingCryptoOrderStore.submitOrder(billing2.getOrder(), billing2.getBillingAccount(), new Function1() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderManager.getSubmissionObservable$lambda$0(this.f$0, (String) obj);
            }
        }).map(new Function() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderManager.getSubmissionObservable.3
            @Override // io.reactivex.functions.Function
            public final Response.Standard apply(UiCryptoOrder p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new Response.Standard(p0);
            }
        }).timeout(5L, TimeUnit.SECONDS, Single.just(new Response.BillingOrderPending(billing2.getOrder())));
        Intrinsics.checkNotNull(singleTimeout);
        return singleTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSubmissionObservable$lambda$0(CryptoOrderManager cryptoOrderManager, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BillingCryptoOrderCallbacks billingCryptoOrderCallbacks = cryptoOrderManager.billingOrderCallbacks;
        if (billingCryptoOrderCallbacks != null) {
            billingCryptoOrderCallbacks.on3DSecureRedirect(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Observable<Response> getPollingObservable(Response data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof Response.Standard) {
            return super.getPollingObservable((CryptoOrderManager) data);
        }
        if (!(data instanceof Response.BillingOrderPending)) {
            throw new NoWhenBranchMatchedException();
        }
        Observable map = this.billingCryptoOrderStore.pollOrder(new Function1() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderManager.getPollingObservable$lambda$1(this.f$0, (String) obj);
            }
        }).map(new Function() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderManager.getPollingObservable.2
            @Override // io.reactivex.functions.Function
            public final Response.Standard apply(UiCryptoOrder p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new Response.Standard(p0);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPollingObservable$lambda$1(CryptoOrderManager cryptoOrderManager, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BillingCryptoOrderCallbacks billingCryptoOrderCallbacks = cryptoOrderManager.billingOrderCallbacks;
        if (billingCryptoOrderCallbacks != null) {
            billingCryptoOrderCallbacks.on3DSecureRedirect(it);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Single<Response> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Single map = this.cryptoOrderStore.fetchOrder(orderId).map(new Function() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderManager.fetchOrder.1
            @Override // io.reactivex.functions.Function
            public final Response apply(UiCryptoOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Response.Standard(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public void onUpdate(Response data, Object passthrough) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.accountProvider.refresh(true);
    }

    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof Request.Standard) {
            return ((Request.Standard) request).getOrder().getType() != CryptoOrderType.MARKET;
        }
        if (request instanceof Request.Billing) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setBillingOrder3DSecureComplete() {
        this.billingCryptoOrderStore.set3DSecureComplete();
    }
}
