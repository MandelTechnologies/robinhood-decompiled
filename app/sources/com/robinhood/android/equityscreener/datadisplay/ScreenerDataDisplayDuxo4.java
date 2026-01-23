package com.robinhood.android.equityscreener.datadisplay;

import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenerDataDisplayDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$onResume$3$1", m3645f = "ScreenerDataDisplayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerDataDisplayDuxo4 extends ContinuationImpl7 implements Function2<ScreenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState>, Object> {
    final /* synthetic */ ScanResultResponse $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenerDataDisplayDuxo4(ScanResultResponse scanResultResponse, Continuation<? super ScreenerDataDisplayDuxo4> continuation) {
        super(2, continuation);
        this.$it = scanResultResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenerDataDisplayDuxo4 screenerDataDisplayDuxo4 = new ScreenerDataDisplayDuxo4(this.$it, continuation);
        screenerDataDisplayDuxo4.L$0 = obj;
        return screenerDataDisplayDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScreenerDataDisplayDataState screenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState> continuation) {
        return ((ScreenerDataDisplayDuxo4) create(screenerDataDisplayDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ScreenerDataDisplayDataState.copy$default((ScreenerDataDisplayDataState) this.L$0, null, null, false, false, this.$it, 15, null);
    }
}
