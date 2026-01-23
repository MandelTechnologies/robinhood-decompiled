package com.robinhood.store.isa;

import bonfire.proto.idl.accounts.p028v1.IsUserEligibleForAccountRequestDto;
import bonfire.proto.idl.accounts.p028v1.IsUserEligibleForAccountResponseDto;
import bonfire.proto.idl.accounts.p028v1.RhukIsaService;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: IsaEligibilityStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaEligibilityStore;", "Lcom/robinhood/store/Store;", "isaService", "Lbonfire/proto/idl/accounts/v1/RhukIsaService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/accounts/v1/RhukIsaService;Lcom/robinhood/store/StoreBundle;)V", "isUserEligibleEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;", "getEligibility", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/AsyncResult;", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IsaEligibilityStore extends Store {
    private final PostEndpoint<IsUserEligibleForAccountRequestDto, IsUserEligibleForAccountResponseDto> isUserEligibleEndpoint;
    private final RhukIsaService isaService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaEligibilityStore(RhukIsaService isaService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(isaService, "isaService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.isaService = isaService;
        this.isUserEligibleEndpoint = PostEndpoint.INSTANCE.create(new IsaEligibilityStore2(this, null), new IsaEligibilityStore3(null));
    }

    /* compiled from: IsaEligibilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.isa.IsaEligibilityStore$getEligibility$1", m3645f = "IsaEligibilityStore.kt", m3646l = {35, 37, 42, 44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.isa.IsaEligibilityStore$getEligibility$1 */
    static final class C415291 extends ContinuationImpl7 implements Function2<FlowCollector<? super AsyncResult<? extends IsUserEligibleForAccountResponseDto>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C415291(Continuation<? super C415291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415291 c415291 = IsaEligibilityStore.this.new C415291(continuation);
            c415291.L$0 = obj;
            return c415291;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends IsUserEligibleForAccountResponseDto>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super AsyncResult<IsUserEligibleForAccountResponseDto>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super AsyncResult<IsUserEligibleForAccountResponseDto>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C415291) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(4:(1:(1:8)(2:9|10))(3:11|50|12)|13|44|45)(6:16|52|17|18|48|32))(1:22))(3:23|(1:25)|43)|54|26|27|46|28|(3:31|48|32)|43|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        
            if (r4.emit(r0, r11) != r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        
            r3 = r12;
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
        
            r8 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        
            if (r3.emit(r0, r11) == r1) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C415291 c415291;
            FlowCollector flowCollector2;
            Exception exc;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                AsyncResult.Loading loading = AsyncResult.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
            } else if (i == 2) {
                flowCollector3 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c415291 = this;
                    try {
                        AsyncResult.Success success = new AsyncResult.Success((IsUserEligibleForAccountResponseDto) obj);
                        c415291.L$0 = flowCollector3;
                        c415291.label = 3;
                    } catch (Exception e) {
                        exc = e;
                        flowCollector2 = flowCollector3;
                        AsyncResult.Failure failure = new AsyncResult.Failure(exc);
                        c415291.L$0 = null;
                        c415291.label = 4;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    c415291 = this;
                    flowCollector2 = flowCollector3;
                    AsyncResult.Failure failure2 = new AsyncResult.Failure(exc);
                    c415291.L$0 = null;
                    c415291.label = 4;
                }
            } else {
                if (i == 3) {
                    flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        exc = e3;
                        c415291 = this;
                        AsyncResult.Failure failure22 = new AsyncResult.Failure(exc);
                        c415291.L$0 = null;
                        c415291.label = 4;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            PostEndpoint postEndpoint = IsaEligibilityStore.this.isUserEligibleEndpoint;
            IsUserEligibleForAccountRequestDto isUserEligibleForAccountRequestDto = new IsUserEligibleForAccountRequestDto(BrokerageAccountTypeDto.ISA_STOCKS_AND_SHARES);
            this.L$0 = flowCollector;
            this.label = 2;
            c415291 = this;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, isUserEligibleForAccountRequestDto, null, c415291, 2, null);
            if (objPost$default != coroutine_suspended) {
                flowCollector3 = flowCollector;
                obj = objPost$default;
                AsyncResult.Success success2 = new AsyncResult.Success((IsUserEligibleForAccountResponseDto) obj);
                c415291.L$0 = flowCollector3;
                c415291.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final Flow<AsyncResult<IsUserEligibleForAccountResponseDto>> getEligibility() {
        return FlowKt.flowOn(FlowKt.flow(new C415291(null)), Dispatchers.getIO());
    }
}
