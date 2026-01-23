package com.robinhood.android.welcome;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: WelcomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/welcome/WelcomeState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$2$1$1", m3645f = "WelcomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.welcome.WelcomeDuxo$fetchAttribution$1$2$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class WelcomeDuxo2 extends ContinuationImpl7 implements Function2<WelcomeState, Continuation<? super WelcomeState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    WelcomeDuxo2(Continuation<? super WelcomeDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WelcomeDuxo2 welcomeDuxo2 = new WelcomeDuxo2(continuation);
        welcomeDuxo2.L$0 = obj;
        return welcomeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WelcomeState welcomeState, Continuation<? super WelcomeState> continuation) {
        return ((WelcomeDuxo2) create(welcomeState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return WelcomeState.copy$default((WelcomeState) this.L$0, false, boxing.boxInt(C31456R.string.welcome_max_subtitle_ec), 1, null);
    }
}
