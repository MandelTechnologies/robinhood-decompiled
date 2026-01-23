package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState3;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.margin.margin_call.proto.p496v1.GetNbboSummaryModelRequestDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetNbboSummaryModelResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataService;

/* compiled from: MarginCallMarketOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$refreshNbboSummary$1$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$refreshNbboSummary$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginCallMarketOrderDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarginCallMarketOrderDataState2.Loaded $loadedState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginCallMarketOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginCallMarketOrderDuxo3(MarginCallMarketOrderDuxo marginCallMarketOrderDuxo, MarginCallMarketOrderDataState2.Loaded loaded, Continuation<? super MarginCallMarketOrderDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = marginCallMarketOrderDuxo;
        this.$loadedState = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginCallMarketOrderDuxo3 marginCallMarketOrderDuxo3 = new MarginCallMarketOrderDuxo3(this.this$0, this.$loadedState, continuation);
        marginCallMarketOrderDuxo3.L$0 = obj;
        return marginCallMarketOrderDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginCallMarketOrderDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MarginCallMarketOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$refreshNbboSummary$1$1$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$refreshNbboSummary$1$1$1 */
    static final class C167831 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167831(Continuation<? super C167831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167831 c167831 = new C167831(continuation);
            c167831.L$0 = obj;
            return c167831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
            return ((C167831) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MarginCallMarketOrderDataState.copy$default((MarginCallMarketOrderDataState) this.L$0, null, MarginCallMarketOrderDataState3.Loading.INSTANCE, null, null, null, 29, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C167831(null));
                MarginCallMarketOrderDuxo marginCallMarketOrderDuxo = this.this$0;
                MarginCallMarketOrderDataState2.Loaded loaded = this.$loadedState;
                Result.Companion companion = Result.INSTANCE;
                MaintenanceCallDataService maintenanceCallDataService = marginCallMarketOrderDuxo.maintenanceCallDataService;
                GetNbboSummaryModelRequestDto getNbboSummaryModelRequestDto = new GetNbboSummaryModelRequestDto(loaded.getData().getTrades());
                this.label = 1;
                obj = maintenanceCallDataService.GetNbboSummaryModel(getNbboSummaryModelRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((GetNbboSummaryModelResponseDto) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        MarginCallMarketOrderDuxo marginCallMarketOrderDuxo2 = this.this$0;
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            marginCallMarketOrderDuxo2.applyMutation(new MarginCallMarketOrderDuxo4((GetNbboSummaryModelResponseDto) objM28550constructorimpl, null));
        }
        MarginCallMarketOrderDuxo marginCallMarketOrderDuxo3 = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            Logger.INSTANCE.mo1681e("Failed to refresh NBBO summary: " + thM28553exceptionOrNullimpl, new Object[0]);
            marginCallMarketOrderDuxo3.applyMutation(new MarginCallMarketOrderDuxo5(thM28553exceptionOrNullimpl, null));
        }
        return Unit.INSTANCE;
    }
}
