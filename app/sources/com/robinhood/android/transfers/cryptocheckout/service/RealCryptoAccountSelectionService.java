package com.robinhood.android.transfers.cryptocheckout.service;

import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponseDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore;
import contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService;
import contracts.money_movement.crypto_account_selection.proto.p432v1.DidSelectAccountRequestDto;
import contracts.money_movement.crypto_account_selection.proto.p432v1.GetAccountsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: RealCryptoAccountSelectionService.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;", "billingAccountStore", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore;", "<init>", "(Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore;)V", "callbacks", "Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService$Callbacks;)V", "GetAccounts", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "DidSelectAccount", "", "request", "Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DidSelectAddAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Callbacks", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RealCryptoAccountSelectionService implements CryptoAccountSelectionManagedService {
    public static final int $stable = 8;
    private final CryptoBillingAccountStore billingAccountStore;
    private Callbacks callbacks;

    /* compiled from: RealCryptoAccountSelectionService.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService$Callbacks;", "", "onAccountSelected", "", "request", "Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;", "onAddAccountRequested", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountSelected(DidSelectAccountRequestDto request);

        void onAddAccountRequested();
    }

    public Object DidSelectAccount(Request<DidSelectAccountRequestDto> request, Continuation<? super Response<Unit>> continuation) {
        return CryptoAccountSelectionManagedService.DefaultImpls.DidSelectAccount(this, request, continuation);
    }

    public Object DidSelectAddAccount(Request<Unit> request, Continuation<? super Response<Unit>> continuation) {
        return CryptoAccountSelectionManagedService.DefaultImpls.DidSelectAddAccount(this, request, continuation);
    }

    public Flow<Response<GetAccountsResponseDto>> GetAccounts(Request<Unit> request) {
        return CryptoAccountSelectionManagedService.DefaultImpls.GetAccounts(this, request);
    }

    public RealCryptoAccountSelectionService(CryptoBillingAccountStore billingAccountStore) {
        Intrinsics.checkNotNullParameter(billingAccountStore, "billingAccountStore");
        this.billingAccountStore = billingAccountStore;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService
    public Flow<GetAccountsResponseDto> GetAccounts() {
        final Flow<FetchCryptoBillingAccountsResponseDto> accounts2 = this.billingAccountStore.getAccounts();
        return new Flow<GetAccountsResponseDto>() { // from class: com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService$GetAccounts$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService$GetAccounts$$inlined$map$1$2 */
            public static final class C302482<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService$GetAccounts$$inlined$map$1$2", m3645f = "RealCryptoAccountSelectionService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService$GetAccounts$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C302482.this.emit(null, this);
                    }
                }

                public C302482(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        GetAccountsResponseDto getAccountsResponseDto = RealCryptoAccountSelectionService2.toGetAccountsResponseDto((FetchCryptoBillingAccountsResponseDto) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getAccountsResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetAccountsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = accounts2.collect(new C302482(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService
    public Object DidSelectAccount(DidSelectAccountRequestDto didSelectAccountRequestDto, Continuation<? super Unit> continuation) {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onAccountSelected(didSelectAccountRequestDto);
        }
        return Unit.INSTANCE;
    }

    @Override // contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService
    public Object DidSelectAddAccount(Continuation<? super Unit> continuation) {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onAddAccountRequested();
        }
        return Unit.INSTANCE;
    }
}
