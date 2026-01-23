package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.perpetuals.store.cachedService.PerpetualsButtonsCachedService;
import contracts.perpetuals.proto.p433v1.GetButtonsRequestDto;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerpetualsButtonsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "it", "Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore$endpoint$1", m3645f = "PerpetualsButtonsStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore$endpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualsButtonsStore2 extends ContinuationImpl7 implements Function2<GetButtonsRequestDto, Continuation<? super GetButtonsResponseDto>, Object> {
    final /* synthetic */ PerpetualsButtonsCachedService $service;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualsButtonsStore2(PerpetualsButtonsCachedService perpetualsButtonsCachedService, Continuation<? super PerpetualsButtonsStore2> continuation) {
        super(2, continuation);
        this.$service = perpetualsButtonsCachedService;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualsButtonsStore2 perpetualsButtonsStore2 = new PerpetualsButtonsStore2(this.$service, continuation);
        perpetualsButtonsStore2.L$0 = obj;
        return perpetualsButtonsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetButtonsRequestDto getButtonsRequestDto, Continuation<? super GetButtonsResponseDto> continuation) {
        return ((PerpetualsButtonsStore2) create(getButtonsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetButtonsRequestDto getButtonsRequestDto = (GetButtonsRequestDto) this.L$0;
        PerpetualsButtonsCachedService perpetualsButtonsCachedService = this.$service;
        this.label = 1;
        Object buttons = perpetualsButtonsCachedService.getButtons(getButtonsRequestDto, this);
        return buttons == coroutine_suspended ? coroutine_suspended : buttons;
    }
}
