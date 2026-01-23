package com.robinhood.store.event;

import com.robinhood.prediction_markets.proto.p361v1.combo.ComboService;
import com.robinhood.prediction_markets.proto.p361v1.combo.GetComboProposalsRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.combo.GetComboProposalsResponseDto;
import com.robinhood.store.event.ProposalResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/event/ProposalResult;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventComboStore$getProposal$1", m3645f = "EventComboStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventComboStore$getProposal$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ProposalResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventComboStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventComboStore$getProposal$1(EventComboStore eventComboStore, Continuation<? super EventComboStore$getProposal$1> continuation) {
        super(2, continuation);
        this.this$0 = eventComboStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventComboStore$getProposal$1 eventComboStore$getProposal$1 = new EventComboStore$getProposal$1(this.this$0, continuation);
        eventComboStore$getProposal$1.L$0 = obj;
        return eventComboStore$getProposal$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ProposalResult> continuation) {
        return ((EventComboStore$getProposal$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            ComboService comboService = this.this$0.comboService;
            GetComboProposalsRequestDto getComboProposalsRequestDto = new GetComboProposalsRequestDto(str);
            this.label = 1;
            obj = comboService.GetComboProposals(getComboProposalsRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ProposalData uiModel = EventComboStoreKt.toUiModel((GetComboProposalsResponseDto) obj);
        if (uiModel != null) {
            return ProposalResult.Success.m26454boximpl(ProposalResult.Success.m26455constructorimpl(uiModel));
        }
        return ProposalResult.Loading.INSTANCE;
    }
}
