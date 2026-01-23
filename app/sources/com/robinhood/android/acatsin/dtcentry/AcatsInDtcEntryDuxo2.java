package com.robinhood.android.acatsin.dtcentry;

import com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryEvent;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$validateDtcNumber$2$1", m3645f = "AcatsInDtcEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$validateDtcNumber$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInDtcEntryDuxo2 extends ContinuationImpl7 implements Function2<AcatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState>, Object> {
    final /* synthetic */ UiAcatsValidationResponse $response;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInDtcEntryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDtcEntryDuxo2(AcatsInDtcEntryDuxo acatsInDtcEntryDuxo, UiAcatsValidationResponse uiAcatsValidationResponse, Continuation<? super AcatsInDtcEntryDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = acatsInDtcEntryDuxo;
        this.$response = uiAcatsValidationResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInDtcEntryDuxo2 acatsInDtcEntryDuxo2 = new AcatsInDtcEntryDuxo2(this.this$0, this.$response, continuation);
        acatsInDtcEntryDuxo2.L$0 = obj;
        return acatsInDtcEntryDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInDtcEntryDataState acatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState> continuation) {
        return ((AcatsInDtcEntryDuxo2) create(acatsInDtcEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInDtcEntryDataState acatsInDtcEntryDataState = (AcatsInDtcEntryDataState) this.L$0;
        AcatsInDtcEntryDuxo acatsInDtcEntryDuxo = this.this$0;
        UiAcatsValidationResponse uiAcatsValidationResponse = this.$response;
        Intrinsics.checkNotNull(uiAcatsValidationResponse);
        acatsInDtcEntryDuxo.submit(new AcatsInDtcEntryEvent.ValidationResponseEvent(uiAcatsValidationResponse, acatsInDtcEntryDataState.getDtcNumber()));
        return AcatsInDtcEntryDataState.copy$default(acatsInDtcEntryDataState, null, false, 1, null);
    }
}
