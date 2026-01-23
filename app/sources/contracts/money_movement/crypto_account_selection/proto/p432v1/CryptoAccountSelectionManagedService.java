package contracts.money_movement.crypto_account_selection.proto.p432v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
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
import microgram.annotation.ManagedServices;

/* compiled from: CryptoAccountSelectionManagedService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "GetAccounts", "()Lkotlinx/coroutines/flow/Flow;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;", "request", "", "DidSelectAccount", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DidSelectAddAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService")
/* loaded from: classes18.dex */
public interface CryptoAccountSelectionManagedService {

    /* compiled from: CryptoAccountSelectionManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DefaultImpls", m3645f = "CryptoAccountSelectionManagedService.kt", m3646l = {40}, m3647m = "DidSelectAccount")
    /* renamed from: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DidSelectAccount$1 */
    static final class C441241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C441241(Continuation<? super C441241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DidSelectAccount(null, null, this);
        }
    }

    /* compiled from: CryptoAccountSelectionManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DefaultImpls", m3645f = "CryptoAccountSelectionManagedService.kt", m3646l = {50}, m3647m = "DidSelectAddAccount")
    /* renamed from: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DidSelectAddAccount$1 */
    static final class C441251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C441251(Continuation<? super C441251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.DidSelectAddAccount(null, null, this);
        }
    }

    Object DidSelectAccount(DidSelectAccountRequestDto didSelectAccountRequestDto, Continuation<? super Unit> continuation);

    Object DidSelectAddAccount(Continuation<? super Unit> continuation);

    Flow<GetAccountsResponseDto> GetAccounts();

    /* compiled from: CryptoAccountSelectionManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Flow<Response<GetAccountsResponseDto>> GetAccounts(CryptoAccountSelectionManagedService cryptoAccountSelectionManagedService, Request<Unit> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            final Flow<GetAccountsResponseDto> flowGetAccounts = cryptoAccountSelectionManagedService.GetAccounts();
            return new Flow<Response<? extends GetAccountsResponseDto>>() { // from class: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DefaultImpls$GetAccounts$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DefaultImpls$GetAccounts$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DefaultImpls$GetAccounts$$inlined$map$1$2", m3645f = "CryptoAccountSelectionManagedService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService$DefaultImpls$GetAccounts$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
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

                    public AnonymousClass2(FlowCollector flowCollector) {
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
                            Response response = new Response((GetAccountsResponseDto) obj, null, 2, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(response, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Response<? extends GetAccountsResponseDto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowGetAccounts.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DidSelectAccount(CryptoAccountSelectionManagedService cryptoAccountSelectionManagedService, Request<DidSelectAccountRequestDto> request, Continuation<? super Response<Unit>> continuation) {
            C441241 c441241;
            if (continuation instanceof C441241) {
                c441241 = (C441241) continuation;
                int i = c441241.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c441241.label = i - Integer.MIN_VALUE;
                } else {
                    c441241 = new C441241(continuation);
                }
            }
            Object obj = c441241.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c441241.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DidSelectAccountRequestDto data = request.getData();
                c441241.label = 1;
                if (cryptoAccountSelectionManagedService.DidSelectAccount(data, c441241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Response(Unit.INSTANCE, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object DidSelectAddAccount(CryptoAccountSelectionManagedService cryptoAccountSelectionManagedService, Request<Unit> request, Continuation<? super Response<Unit>> continuation) {
            C441251 c441251;
            if (continuation instanceof C441251) {
                c441251 = (C441251) continuation;
                int i = c441251.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c441251.label = i - Integer.MIN_VALUE;
                } else {
                    c441251 = new C441251(continuation);
                }
            }
            Object obj = c441251.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c441251.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                c441251.label = 1;
                if (cryptoAccountSelectionManagedService.DidSelectAddAccount(c441251) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Response(Unit.INSTANCE, null, 2, null);
        }
    }
}
