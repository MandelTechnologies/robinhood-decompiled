package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.NummusService;
import nummus.p512v1.TaxlotabilityRequestDto;
import nummus.p512v1.TaxlotabilityResponseDto;
import nummus.p512v1.TaxlotabilityStateDto;
import retrofit2.Response;

/* compiled from: TaxlotabilityStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lnummus/v1/TaxlotabilityResponseDto;", "params", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore$Params;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TaxlotabilityStore$taxlotabilityEndpoint$1", m3645f = "TaxlotabilityStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TaxlotabilityStore$taxlotabilityEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TaxlotabilityStore2 extends ContinuationImpl7 implements Function2<TaxlotabilityStore.Params, Continuation<? super Response<TaxlotabilityResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TaxlotabilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxlotabilityStore2(TaxlotabilityStore taxlotabilityStore, Continuation<? super TaxlotabilityStore2> continuation) {
        super(2, continuation);
        this.this$0 = taxlotabilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaxlotabilityStore2 taxlotabilityStore2 = new TaxlotabilityStore2(this.this$0, continuation);
        taxlotabilityStore2.L$0 = obj;
        return taxlotabilityStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TaxlotabilityStore.Params params, Continuation<? super Response<TaxlotabilityResponseDto>> continuation) {
        return ((TaxlotabilityStore2) create(params, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.librobinhood.data.store.TaxlotabilityStore$Params] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.robinhood.librobinhood.data.store.TaxlotabilityStore$Params, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.robinhood.librobinhood.data.store.TaxlotabilityStore$Params] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        ?? r1;
        Response responseSuccess;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r12 = (TaxlotabilityStore.Params) this.L$0;
                TaxlotabilityStore taxlotabilityStore = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                NummusService nummusService = taxlotabilityStore.nummusService;
                String string2 = r12.getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                UUID cryptoAccountId = r12.getCryptoAccountId();
                TaxlotabilityRequestDto taxlotabilityRequestDto = new TaxlotabilityRequestDto(string2, cryptoAccountId != null ? cryptoAccountId.toString() : null);
                this.L$0 = r12;
                this.label = 1;
                obj = nummusService.Taxlotability(taxlotabilityRequestDto, this);
                i = r12;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r13 = (TaxlotabilityStore.Params) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r13;
            }
            objM28550constructorimpl = Result.m28550constructorimpl((TaxlotabilityResponseDto) obj);
            r1 = i;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            r1 = i;
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            responseSuccess = Response.success((TaxlotabilityResponseDto) objM28550constructorimpl);
        } else {
            String string3 = r1.getCurrencyPairId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            responseSuccess = Response.success(new TaxlotabilityResponseDto(string3, TaxlotabilityStateDto.STATE_UNSUPPORTED, null, null, 12, null));
        }
        Intrinsics.checkNotNullExpressionValue(responseSuccess, "fold(...)");
        return responseSuccess;
    }
}
