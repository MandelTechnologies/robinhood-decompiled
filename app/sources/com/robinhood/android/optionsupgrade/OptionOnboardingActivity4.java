package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreenWithSuvHandler$2$1", m3645f = "OptionOnboardingActivity.kt", m3646l = {642}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreenWithSuvHandler$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingActivity4 extends ContinuationImpl7 implements Function1<Continuation<? super Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress>>, Object> {
    final /* synthetic */ ScreenRequest $currentScreenRequest;
    int label;
    final /* synthetic */ OptionOnboardingActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingActivity4(OptionOnboardingActivity optionOnboardingActivity, ScreenRequest screenRequest, Continuation<? super OptionOnboardingActivity4> continuation) {
        super(1, continuation);
        this.this$0 = optionOnboardingActivity;
        this.$currentScreenRequest = screenRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OptionOnboardingActivity4(this.this$0, this.$currentScreenRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress>> continuation) {
        return ((OptionOnboardingActivity4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws ScreenError {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        OptionOnboardingDuxo duxo = this.this$0.getDuxo();
        ScreenRequest screenRequest = this.$currentScreenRequest;
        this.label = 1;
        Object objGoToNextScreen = duxo.goToNextScreen(screenRequest, this);
        return objGoToNextScreen == coroutine_suspended ? coroutine_suspended : objGoToNextScreen;
    }
}
