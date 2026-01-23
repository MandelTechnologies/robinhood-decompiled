package com.truelayer.payments.p419ui.screens.formflows;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FormCoordinator.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$5$3$1$1", m3645f = "FormCoordinator.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$5$3$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FormCoordinator5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Map<String, String>, Unit> $onSubmit;
    final /* synthetic */ FormCoordinatorViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FormCoordinator5(FormCoordinatorViewModel formCoordinatorViewModel, Function1<? super Map<String, String>, Unit> function1, Continuation<? super FormCoordinator5> continuation) {
        super(2, continuation);
        this.$viewModel = formCoordinatorViewModel;
        this.$onSubmit = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormCoordinator5(this.$viewModel, this.$onSubmit, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormCoordinator5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FormCoordinatorViewModel formCoordinatorViewModel = this.$viewModel;
        formCoordinatorViewModel.next(formCoordinatorViewModel.getValues(), this.$onSubmit);
        return Unit.INSTANCE;
    }
}
