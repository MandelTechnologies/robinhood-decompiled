package com.robinhood.shared.crypto.trading;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J0\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderSubmissionManager;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "billingCryptoOrderStore", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;)V", "getPollingObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", WebsocketGatewayConstants.DATA_KEY, "publishPollingObservable", "Lio/reactivex/ObservableSource;", "Lkotlin/Pair;", "", "upstream", "getShouldTriggerConfirmationInstantly", "request", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoOrderSubmissionManager extends CryptoOrderManager {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.shared.crypto.trading.CryptoOrderManager, com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public boolean getShouldTriggerConfirmationInstantly(CryptoOrderManager.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderSubmissionManager(@RootCoroutineScope CoroutineScope coroutineScope, AccountProvider accountProvider, CryptoOrderStore cryptoOrderStore, BillingCryptoOrderStore billingCryptoOrderStore) {
        super(coroutineScope, accountProvider, cryptoOrderStore, billingCryptoOrderStore);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(billingCryptoOrderStore, "billingCryptoOrderStore");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.shared.crypto.trading.CryptoOrderManager, com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public Observable<CryptoOrderManager.Response> getPollingObservable(CryptoOrderManager.Response data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Single<CryptoOrderManager.Response> singleFetchOrder = fetchOrder(getId(data));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<CryptoOrderManager.Response> observable = singleFetchOrder.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<R> observableCompose = observable.compose(new Poll(1L, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable<CryptoOrderManager.Response> observableOnErrorResumeNext = observableCompose.takeUntil((Predicate<? super R>) new Predicate() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderSubmissionManager.getPollingObservable.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CryptoOrderManager.Response p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return CryptoOrderSubmissionManager.this.isFinal(p0);
            }
        }).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager
    public ObservableSource<Tuples2<CryptoOrderManager.Response, Boolean>> publishPollingObservable(Observable<CryptoOrderManager.Response> upstream, CryptoOrderManager.Response data) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(data, "data");
        ObservableSource map = upstream.map(new Function() { // from class: com.robinhood.shared.crypto.trading.CryptoOrderSubmissionManager.publishPollingObservable.1
            @Override // io.reactivex.functions.Function
            public final Tuples2<CryptoOrderManager.Response, Boolean> apply(CryptoOrderManager.Response response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (!(response instanceof CryptoOrderManager.Response.Standard)) {
                    if (response instanceof CryptoOrderManager.Response.BillingOrderPending) {
                        throw new IllegalStateException("Billing not supported");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return Tuples4.m3642to(response, Boolean.valueOf(((CryptoOrderManager.Response.Standard) response).getOrder().getCryptoOrder().isFinal()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
