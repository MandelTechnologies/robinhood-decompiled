package com.robinhood.android.engagement.infolandingpage;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InfoLandingPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/infolandingpage/InfoLandingPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.infolandingpage.InfoLandingPageDuxo$onStart$1$3$1", m3645f = "InfoLandingPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.engagement.infolandingpage.InfoLandingPageDuxo$onStart$1$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class InfoLandingPageDuxo4 extends ContinuationImpl7 implements Function2<InfoLandingPageDataState, Continuation<? super InfoLandingPageDataState>, Object> {
    final /* synthetic */ Throwable $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoLandingPageDuxo4(Throwable th, Continuation<? super InfoLandingPageDuxo4> continuation) {
        super(2, continuation);
        this.$it = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfoLandingPageDuxo4 infoLandingPageDuxo4 = new InfoLandingPageDuxo4(this.$it, continuation);
        infoLandingPageDuxo4.L$0 = obj;
        return infoLandingPageDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InfoLandingPageDataState infoLandingPageDataState, Continuation<? super InfoLandingPageDataState> continuation) {
        return ((InfoLandingPageDuxo4) create(infoLandingPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InfoLandingPageDataState.copy$default((InfoLandingPageDataState) this.L$0, null, this.$it, 1, null);
    }
}
