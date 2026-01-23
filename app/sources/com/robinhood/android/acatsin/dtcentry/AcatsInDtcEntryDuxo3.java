package com.robinhood.android.acatsin.dtcentry;

import com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryEvent;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInDtcEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$validateDtcNumber$3$1", m3645f = "AcatsInDtcEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$validateDtcNumber$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInDtcEntryDuxo3 extends ContinuationImpl7 implements Function2<AcatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f3877$t;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInDtcEntryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDtcEntryDuxo3(Throwable th, AcatsInDtcEntryDuxo acatsInDtcEntryDuxo, Continuation<? super AcatsInDtcEntryDuxo3> continuation) {
        super(2, continuation);
        this.f3877$t = th;
        this.this$0 = acatsInDtcEntryDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInDtcEntryDuxo3 acatsInDtcEntryDuxo3 = new AcatsInDtcEntryDuxo3(this.f3877$t, this.this$0, continuation);
        acatsInDtcEntryDuxo3.L$0 = obj;
        return acatsInDtcEntryDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInDtcEntryDataState acatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState> continuation) {
        return ((AcatsInDtcEntryDuxo3) create(acatsInDtcEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInDtcEntryDataState acatsInDtcEntryDataState = (AcatsInDtcEntryDataState) this.L$0;
        if (Throwables.isHttpException(this.f3877$t)) {
            this.this$0.submit(new AcatsInDtcEntryEvent.ValidationResponseEvent(new UiAcatsValidationResponse(null), acatsInDtcEntryDataState.getDtcNumber()));
            return AcatsInDtcEntryDataState.copy$default(acatsInDtcEntryDataState, null, false, 1, null);
        }
        this.this$0.submit(new AcatsInDtcEntryEvent.NetworkErrorEvent(this.f3877$t));
        return AcatsInDtcEntryDataState.copy$default(acatsInDtcEntryDataState, null, false, 1, null);
    }
}
