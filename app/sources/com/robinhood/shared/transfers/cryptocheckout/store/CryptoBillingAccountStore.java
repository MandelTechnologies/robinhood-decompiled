package com.robinhood.shared.transfers.cryptocheckout.store;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponseDto;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CryptoBillingAccountStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore;", "Lcom/robinhood/store/Store;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/store/StoreBundle;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Request;", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Response;", "pollAccountsQuery", "Lcom/robinhood/android/moria/db/Query;", "getAccounts", "Lkotlinx/coroutines/flow/Flow;", "Request", "Response", "lib-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoBillingAccountStore extends Store {
    public static final int $stable = 8;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final Endpoint<Request, Response> endpoint;
    private final Query<Request, FetchCryptoBillingAccountsResponseDto> pollAccountsQuery;
    private final StateFlow2<Map<String, FetchCryptoBillingAccountsResponseDto>> state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoBillingAccountStore(CryptoAccountProvider cryptoAccountProvider, BffMoneyMovementService bffMoneyMovementService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.state = StateFlow4.MutableStateFlow(null);
        Endpoint<Request, Response> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoBillingAccountStore2(this, null), getLogoutKillswitch(), new CryptoBillingAccountStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default;
        this.pollAccountsQuery = Store.create$default(this, Query.INSTANCE, "pollCryptoBillingAccounts", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoBillingAccountStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoBillingAccountStore.pollAccountsQuery$lambda$1(this.f$0, (CryptoBillingAccountStore.Request) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollAccountsQuery$lambda$1(CryptoBillingAccountStore cryptoBillingAccountStore, final Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final StateFlow2<Map<String, FetchCryptoBillingAccountsResponseDto>> stateFlow2 = cryptoBillingAccountStore.state;
        return new Flow<FetchCryptoBillingAccountsResponseDto>() { // from class: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$pollAccountsQuery$lambda$1$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$pollAccountsQuery$lambda$1$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CryptoBillingAccountStore.Request $request$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$pollAccountsQuery$lambda$1$$inlined$map$1$2", m3645f = "CryptoBillingAccountStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$pollAccountsQuery$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CryptoBillingAccountStore.Request request) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$request$inlined = request;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Map map = (Map) obj;
                        FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto = map != null ? (FetchCryptoBillingAccountsResponseDto) map.get(this.$request$inlined.getAccountNumber()) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(fetchCryptoBillingAccountsResponseDto, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FetchCryptoBillingAccountsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, request), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<FetchCryptoBillingAccountsResponseDto> getAccounts() {
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.cryptoAccountProvider.streamAccountNumber(CryptoAccountSwitcherLocation.PaymentSelection.INSTANCE))), new CryptoBillingAccountStore$getAccounts$$inlined$flatMapLatest$1(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoBillingAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Request;", "", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Request {
        private final String accountNumber;

        public static /* synthetic */ Request copy$default(Request request, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.accountNumber;
            }
            return request.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Request copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Request(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && Intrinsics.areEqual(this.accountNumber, ((Request) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Request(accountNumber=" + this.accountNumber + ")";
        }

        public Request(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoBillingAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Response;", "", "accountNumber", "", "fetchCryptoBillingAccountsResponseDto", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;)V", "getAccountNumber", "()Ljava/lang/String;", "getFetchCryptoBillingAccountsResponseDto", "()Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Response {
        private final String accountNumber;
        private final FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto;

        public static /* synthetic */ Response copy$default(Response response, String str, FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = response.accountNumber;
            }
            if ((i & 2) != 0) {
                fetchCryptoBillingAccountsResponseDto = response.fetchCryptoBillingAccountsResponseDto;
            }
            return response.copy(str, fetchCryptoBillingAccountsResponseDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final FetchCryptoBillingAccountsResponseDto getFetchCryptoBillingAccountsResponseDto() {
            return this.fetchCryptoBillingAccountsResponseDto;
        }

        public final Response copy(String accountNumber, FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(fetchCryptoBillingAccountsResponseDto, "fetchCryptoBillingAccountsResponseDto");
            return new Response(accountNumber, fetchCryptoBillingAccountsResponseDto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.accountNumber, response.accountNumber) && Intrinsics.areEqual(this.fetchCryptoBillingAccountsResponseDto, response.fetchCryptoBillingAccountsResponseDto);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.fetchCryptoBillingAccountsResponseDto.hashCode();
        }

        public String toString() {
            return "Response(accountNumber=" + this.accountNumber + ", fetchCryptoBillingAccountsResponseDto=" + this.fetchCryptoBillingAccountsResponseDto + ")";
        }

        public Response(String accountNumber, FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(fetchCryptoBillingAccountsResponseDto, "fetchCryptoBillingAccountsResponseDto");
            this.accountNumber = accountNumber;
            this.fetchCryptoBillingAccountsResponseDto = fetchCryptoBillingAccountsResponseDto;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final FetchCryptoBillingAccountsResponseDto getFetchCryptoBillingAccountsResponseDto() {
            return this.fetchCryptoBillingAccountsResponseDto;
        }
    }
}
