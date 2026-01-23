package com.robinhood.android.acatsin.intro;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onResume$3$1", m3645f = "AcatsInIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInIntroDuxo3 extends ContinuationImpl7 implements Function2<AcatsInIntroDataState, Continuation<? super AcatsInIntroDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInIntroDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInIntroDuxo3(AcatsInIntroDuxo acatsInIntroDuxo, Continuation<? super AcatsInIntroDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = acatsInIntroDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInIntroDuxo3 acatsInIntroDuxo3 = new AcatsInIntroDuxo3(this.this$0, continuation);
        acatsInIntroDuxo3.L$0 = obj;
        return acatsInIntroDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInIntroDataState acatsInIntroDataState, Continuation<? super AcatsInIntroDataState> continuation) {
        return ((AcatsInIntroDuxo3) create(acatsInIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AcatsInIntroDataState acatsInIntroDataState = (AcatsInIntroDataState) this.L$0;
            int i = this.this$0.navEventCounter;
            this.this$0.navEventCounter = i + 1;
            return AcatsInIntroDataState.copy$default(acatsInIntroDataState, null, 0, null, new UiEvent(boxing.boxInt(i)), false, null, null, 119, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
