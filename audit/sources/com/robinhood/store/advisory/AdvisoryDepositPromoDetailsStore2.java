package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetDepositPromoDetailsRequestDto;
import advisory.proto.p008v1.GetDepositPromoDetailsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryDepositPromoDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Ladvisory/proto/v1/GetDepositPromoDetailsResponseDto;", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryDepositPromoDetailsStore$endpoint$1", m3645f = "AdvisoryDepositPromoDetailsStore.kt", m3646l = {22}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoDetailsStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryDepositPromoDetailsStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends Boolean>, Continuation<? super GetDepositPromoDetailsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryDepositPromoDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryDepositPromoDetailsStore2(AdvisoryDepositPromoDetailsStore advisoryDepositPromoDetailsStore, Continuation<? super AdvisoryDepositPromoDetailsStore2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryDepositPromoDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryDepositPromoDetailsStore2 advisoryDepositPromoDetailsStore2 = new AdvisoryDepositPromoDetailsStore2(this.this$0, continuation);
        advisoryDepositPromoDetailsStore2.L$0 = obj;
        return advisoryDepositPromoDetailsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends Boolean> tuples2, Continuation<? super GetDepositPromoDetailsResponseDto> continuation) {
        return invoke2((Tuples2<String, Boolean>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, Boolean> tuples2, Continuation<? super GetDepositPromoDetailsResponseDto> continuation) {
        return ((AdvisoryDepositPromoDetailsStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        AdvisoryService advisoryService = this.this$0.advisoryService;
        GetDepositPromoDetailsRequestDto getDepositPromoDetailsRequestDto = new GetDepositPromoDetailsRequestDto(str, zBooleanValue);
        this.label = 1;
        Object objGetDepositPromoDetails = advisoryService.GetDepositPromoDetails(getDepositPromoDetailsRequestDto, this);
        return objGetDepositPromoDetails == coroutine_suspended ? coroutine_suspended : objGetDepositPromoDetails;
    }
}
