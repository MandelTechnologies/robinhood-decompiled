package com.robinhood.android.gold.hub;

import com.robinhood.android.gold.contracts.GoldHubFragmentKey;
import com.robinhood.android.gold.hub.GoldHubViewState;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
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
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.GoldHubDuxo$onStart$1$2", m3645f = "GoldHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.hub.GoldHubDuxo$onStart$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldHubDuxo2 extends ContinuationImpl7 implements Function2<GoldHubViewState, Continuation<? super GoldHubViewState>, Object> {
    final /* synthetic */ ApiGoldHub $goldHub;
    final /* synthetic */ boolean $isGoldEventActive;
    int label;
    final /* synthetic */ GoldHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldHubDuxo2(ApiGoldHub apiGoldHub, GoldHubDuxo goldHubDuxo, boolean z, Continuation<? super GoldHubDuxo2> continuation) {
        super(2, continuation);
        this.$goldHub = apiGoldHub;
        this.this$0 = goldHubDuxo;
        this.$isGoldEventActive = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldHubDuxo2(this.$goldHub, this.this$0, this.$isGoldEventActive, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldHubViewState goldHubViewState, Continuation<? super GoldHubViewState> continuation) {
        return ((GoldHubDuxo2) create(goldHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new GoldHubViewState.Loaded(this.$goldHub, this.this$0.cardToShow, ((GoldHubFragmentKey) GoldHubDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getScrollTarget(), this.$isGoldEventActive);
    }
}
