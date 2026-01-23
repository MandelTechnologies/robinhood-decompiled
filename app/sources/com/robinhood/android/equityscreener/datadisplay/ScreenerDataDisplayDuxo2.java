package com.robinhood.android.equityscreener.datadisplay;

import com.robinhood.equityscreener.models.LocalScreenerMetadata;
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
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$onResume$1$1", m3645f = "ScreenerDataDisplayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerDataDisplayDuxo2 extends ContinuationImpl7 implements Function2<ScreenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState>, Object> {
    final /* synthetic */ LocalScreenerMetadata $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenerDataDisplayDuxo2(LocalScreenerMetadata localScreenerMetadata, Continuation<? super ScreenerDataDisplayDuxo2> continuation) {
        super(2, continuation);
        this.$it = localScreenerMetadata;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenerDataDisplayDuxo2 screenerDataDisplayDuxo2 = new ScreenerDataDisplayDuxo2(this.$it, continuation);
        screenerDataDisplayDuxo2.L$0 = obj;
        return screenerDataDisplayDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScreenerDataDisplayDataState screenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState> continuation) {
        return ((ScreenerDataDisplayDuxo2) create(screenerDataDisplayDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ScreenerDataDisplayDataState.copy$default((ScreenerDataDisplayDataState) this.L$0, this.$it.getScreener(), null, false, false, null, 30, null);
    }
}
