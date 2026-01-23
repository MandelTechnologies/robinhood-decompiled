package com.robinhood.shared.transfers.store.cryptocheckout;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.BillErrorDto;
import bff_money_movement.service.p019v1.BillingAccountDto;
import bff_money_movement.service.p019v1.BillingAccountTypeDto;
import bff_money_movement.service.p019v1.CreateBillRequestDto;
import bff_money_movement.service.p019v1.CreateBillResponseDto;
import bff_money_movement.service.p019v1.DCFMetaDataDto;
import bff_money_movement.service.p019v1.GetCryptoBillDetailsRequestDto;
import bff_money_movement.service.p019v1.GetCryptoBillDetailsResponseDto;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p408rx.Poll;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingCryptoOrderStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001dJ/\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180#2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001dJ\u0006\u0010$\u001a\u00020!J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010)\u001a\u00020\u0013H\u0002J9\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010)\u001a\u00020\u00132!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001dH\u0002J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010,\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "is3DSecureTriggered", "", "transferIdFor3DSecure", "Ljava/util/UUID;", "currentBillId", "", "currentBillingAccount", "Lbff_money_movement/service/v1/BillingAccountDto;", "submitOrder", "Lio/reactivex/Single;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", Card.Icon.ORDER, "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "billingAccount", "on3DSecureRedirect", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "url", "", "pollOrder", "Lio/reactivex/Observable;", "set3DSecureComplete", "createBill", "Lbff_money_movement/service/v1/CreateBillResponseDto;", "getBillDetail", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "billId", "pollBillDetailUntilTerminal", "getCryptoOrderFromBillDetailResponse", "response", "lib-store-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BillingCryptoOrderStore extends Store {
    private final AccountProvider accountProvider;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final CryptoOrderStore cryptoOrderStore;
    private String currentBillId;
    private BillingAccountDto currentBillingAccount;
    private boolean is3DSecureTriggered;
    private UUID transferIdFor3DSecure;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingCryptoOrderStore(AccountProvider accountProvider, BffMoneyMovementService bffMoneyMovementService, CryptoOrderStore cryptoOrderStore, TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.cryptoOrderStore = cryptoOrderStore;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Single submitOrder$default(BillingCryptoOrderStore billingCryptoOrderStore, ApiCryptoOrderRequest apiCryptoOrderRequest, BillingAccountDto billingAccountDto, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BillingCryptoOrderStore.submitOrder$lambda$0((String) obj2);
                }
            };
        }
        return billingCryptoOrderStore.submitOrder(apiCryptoOrderRequest, billingAccountDto, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitOrder$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Single<UiCryptoOrder> submitOrder(ApiCryptoOrderRequest order, final BillingAccountDto billingAccount, final Function1<? super String, Unit> on3DSecureRedirect) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(billingAccount, "billingAccount");
        Intrinsics.checkNotNullParameter(on3DSecureRedirect, "on3DSecureRedirect");
        Single<UiCryptoOrder> singleDoOnSubscribe = createBill(order, billingAccount).flatMap(new Function() { // from class: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore.submitOrder.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends GetCryptoBillDetailsResponseDto> apply(CreateBillResponseDto response) {
                Intrinsics.checkNotNullParameter(response, "response");
                BillingCryptoOrderStore.this.currentBillId = response.getBill_id();
                return BillingCryptoOrderStore.this.pollBillDetailUntilTerminal(response.getBill_id(), on3DSecureRedirect);
            }
        }).flatMap(new Function() { // from class: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore.submitOrder.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends UiCryptoOrder> apply(GetCryptoBillDetailsResponseDto response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return BillingCryptoOrderStore.this.getCryptoOrderFromBillDetailResponse(response);
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore.submitOrder.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                BillingCryptoOrderStore.this.is3DSecureTriggered = false;
                BillingCryptoOrderStore.this.transferIdFor3DSecure = null;
                BillingCryptoOrderStore.this.currentBillId = null;
                BillingCryptoOrderStore.this.currentBillingAccount = billingAccount;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        return singleDoOnSubscribe;
    }

    public final Observable<UiCryptoOrder> pollOrder(Function1<? super String, Unit> on3DSecureRedirect) {
        Intrinsics.checkNotNullParameter(on3DSecureRedirect, "on3DSecureRedirect");
        String str = this.currentBillId;
        if (str == null) {
            Observable<UiCryptoOrder> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        Observable<UiCryptoOrder> observable = pollBillDetailUntilTerminal(str, on3DSecureRedirect).flatMap(new Function() { // from class: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore.pollOrder.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends UiCryptoOrder> apply(GetCryptoBillDetailsResponseDto it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BillingCryptoOrderStore.this.getCryptoOrderFromBillDetailResponse(it);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    public final void set3DSecureComplete() {
        UUID uuid = this.transferIdFor3DSecure;
        if (uuid != null) {
            BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new BillingCryptoOrderStore3(this, uuid, null), 3, null);
            this.transferIdFor3DSecure = null;
        }
    }

    /* compiled from: BillingCryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lbff_money_movement/service/v1/CreateBillResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$createBill$1", m3645f = "BillingCryptoOrderStore.kt", m3646l = {104, 101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$createBill$1 */
    static final class C411031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CreateBillResponseDto>, Object> {
        final /* synthetic */ BillingAccountDto $billingAccount;
        final /* synthetic */ ApiCryptoOrderRequest $order;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C411031(ApiCryptoOrderRequest apiCryptoOrderRequest, BillingAccountDto billingAccountDto, Continuation<? super C411031> continuation) {
            super(2, continuation);
            this.$order = apiCryptoOrderRequest;
            this.$billingAccount = billingAccountDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BillingCryptoOrderStore.this.new C411031(this.$order, this.$billingAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CreateBillResponseDto> continuation) {
            return ((C411031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BffMoneyMovementService bffMoneyMovementService;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                bffMoneyMovementService = BillingCryptoOrderStore.this.bffMoneyMovementService;
                AccountProvider accountProvider = BillingCryptoOrderStore.this.accountProvider;
                this.L$0 = bffMoneyMovementService;
                this.label = 1;
                obj = accountProvider.getIndividualAccountNumberForced(this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            bffMoneyMovementService = (BffMoneyMovementService) this.L$0;
            ResultKt.throwOnFailure(obj);
            CreateBillRequestDto createBillRequest = BillingCryptoOrderExtensions.toCreateBillRequest(this.$order, (String) obj, this.$billingAccount);
            this.L$0 = null;
            this.label = 2;
            Object objCreateBill = bffMoneyMovementService.CreateBill(createBillRequest, this);
            return objCreateBill == coroutine_suspended ? coroutine_suspended : objCreateBill;
        }
    }

    private final Single<CreateBillResponseDto> createBill(ApiCryptoOrderRequest order, BillingAccountDto billingAccount) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C411031(order, billingAccount, null), 1, null);
    }

    /* compiled from: BillingCryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$getBillDetail$1", m3645f = "BillingCryptoOrderStore.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$getBillDetail$1 */
    static final class C411041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super GetCryptoBillDetailsResponseDto>, Object> {
        final /* synthetic */ String $billId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C411041(String str, Continuation<? super C411041> continuation) {
            super(2, continuation);
            this.$billId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BillingCryptoOrderStore.this.new C411041(this.$billId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetCryptoBillDetailsResponseDto> continuation) {
            return ((C411041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            BffMoneyMovementService bffMoneyMovementService = BillingCryptoOrderStore.this.bffMoneyMovementService;
            GetCryptoBillDetailsRequestDto getCryptoBillDetailsRequestDto = new GetCryptoBillDetailsRequestDto(this.$billId);
            this.label = 1;
            Object objGetCryptoBillDetails = bffMoneyMovementService.GetCryptoBillDetails(getCryptoBillDetailsRequestDto, this);
            return objGetCryptoBillDetails == coroutine_suspended ? coroutine_suspended : objGetCryptoBillDetails;
        }
    }

    private final Single<GetCryptoBillDetailsResponseDto> getBillDetail(String billId) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C411041(billId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<GetCryptoBillDetailsResponseDto> pollBillDetailUntilTerminal(String billId, final Function1<? super String, Unit> on3DSecureRedirect) {
        Single<GetCryptoBillDetailsResponseDto> billDetail = getBillDetail(billId);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<GetCryptoBillDetailsResponseDto> observable = billDetail.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<R> observableCompose = observable.compose(new Poll(1L, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Single<GetCryptoBillDetailsResponseDto> singleFirstOrError = observableCompose.filter(new Predicate() { // from class: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore.pollBillDetailUntilTerminal.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(GetCryptoBillDetailsResponseDto response) {
                UUID uuid;
                Intrinsics.checkNotNullParameter(response, "response");
                DCFMetaDataDto dcfInterruptMetaData = BillingCryptoOrderExtensions.getDcfInterruptMetaData(response);
                if (dcfInterruptMetaData != null && !BillingCryptoOrderStore.this.is3DSecureTriggered) {
                    BillingCryptoOrderStore billingCryptoOrderStore = BillingCryptoOrderStore.this;
                    try {
                        uuid = StringsKt.toUuid(dcfInterruptMetaData.getTransfer_id());
                    } catch (IllegalArgumentException unused) {
                        uuid = null;
                    }
                    billingCryptoOrderStore.transferIdFor3DSecure = uuid;
                    BillingCryptoOrderStore.this.is3DSecureTriggered = true;
                    on3DSecureRedirect.invoke(dcfInterruptMetaData.getThree_d_secure_redirect_url());
                }
                return BillingCryptoOrderExtensions.isTerminal(response);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<UiCryptoOrder> getCryptoOrderFromBillDetailResponse(GetCryptoBillDetailsResponseDto response) {
        BillingAccountTypeDto type2;
        GetCryptoBillDetailsResponseDto.ResultDto result = response.getResult();
        if (result == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (result instanceof GetCryptoBillDetailsResponseDto.ResultDto.Success) {
            return this.cryptoOrderStore.fetchOrder(StringsKt.toUuid(((GetCryptoBillDetailsResponseDto.ResultDto.Success) result).getValue().getOrder_id()));
        }
        if (!(result instanceof GetCryptoBillDetailsResponseDto.ResultDto.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        BillErrorDto value = ((GetCryptoBillDetailsResponseDto.ResultDto.Error) result).getValue();
        BillingAccountDto billingAccountDto = this.currentBillingAccount;
        if (billingAccountDto == null || (type2 = billingAccountDto.getType()) == null) {
            type2 = BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_UNSPECIFIED;
        }
        Single<UiCryptoOrder> singleError = Single.error(new BillingCryptoOrderFailure(value, type2));
        Intrinsics.checkNotNull(singleError);
        return singleError;
    }
}
