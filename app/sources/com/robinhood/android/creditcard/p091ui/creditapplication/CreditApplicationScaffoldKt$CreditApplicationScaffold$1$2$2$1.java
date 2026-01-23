package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditApplicationScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1", m3645f = "CreditApplicationScaffold.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Screen $screen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1(Screen screen, Continuation<? super CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1> continuation) {
        super(2, continuation);
        this.$screen = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1(this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        loggingUtils.setCcScreen(this.$screen);
        return Unit.INSTANCE;
    }
}
