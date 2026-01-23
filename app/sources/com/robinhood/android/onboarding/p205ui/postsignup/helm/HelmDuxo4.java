package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: HelmDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$handleEvent$1$3", m3645f = "HelmDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.helm.HelmDuxo$handleEvent$1$3, reason: use source file name */
/* loaded from: classes10.dex */
final class HelmDuxo4 extends ContinuationImpl7 implements Function2<HelmState, Continuation<? super HelmState>, Object> {
    final /* synthetic */ PostSignUpEvent $event;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelmDuxo4(PostSignUpEvent postSignUpEvent, Continuation<? super HelmDuxo4> continuation) {
        super(2, continuation);
        this.$event = postSignUpEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HelmDuxo4 helmDuxo4 = new HelmDuxo4(this.$event, continuation);
        helmDuxo4.L$0 = obj;
        return helmDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HelmState helmState, Continuation<? super HelmState> continuation) {
        return ((HelmDuxo4) create(helmState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return HelmState.copy$default((HelmState) this.L$0, false, ((PostSignUpEvent.FundingComplete) this.$event).getTransferAmount(), null, 5, null);
    }
}
