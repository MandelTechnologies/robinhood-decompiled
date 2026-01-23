package com.robinhood.android.gold.hub;

import com.robinhood.android.gold.hub.GoldHubViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/GoldHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.GoldHubDuxo$onStart$2$1", m3645f = "GoldHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.hub.GoldHubDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldHubDuxo3 extends ContinuationImpl7 implements Function2<GoldHubViewState, Continuation<? super GoldHubViewState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f4169$t;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldHubDuxo3(Throwable th, Continuation<? super GoldHubDuxo3> continuation) {
        super(2, continuation);
        this.f4169$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldHubDuxo3(this.f4169$t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldHubViewState goldHubViewState, Continuation<? super GoldHubViewState> continuation) {
        return ((GoldHubDuxo3) create(goldHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new GoldHubViewState.Error(this.f4169$t);
    }
}
