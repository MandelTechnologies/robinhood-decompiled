package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SnackbarScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackbarScreenKt$SnackBarScreen$2$1$1", m3645f = "SnackbarScreen.kt", m3646l = {46}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackbarScreenKt$SnackBarScreen$2$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SnackbarScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDisappear;
    final /* synthetic */ Function1<Boolean, Unit> $setSnackBarState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnackbarScreen2(Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Continuation<? super SnackbarScreen2> continuation) {
        super(2, continuation);
        this.$setSnackBarState = function1;
        this.$onDisappear = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SnackbarScreen2(this.$setSnackBarState, this.$onDisappear, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SnackbarScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$setSnackBarState.invoke(boxing.boxBoolean(true));
            this.label = 1;
            if (DelayKt.delay(SnackbarScreen.SNACKBAR_DURATION_IN_MILLIONS_SEC, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$setSnackBarState.invoke(boxing.boxBoolean(false));
        this.$onDisappear.invoke();
        return Unit.INSTANCE;
    }
}
