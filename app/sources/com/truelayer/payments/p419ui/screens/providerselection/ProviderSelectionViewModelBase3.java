package com.truelayer.payments.p419ui.screens.providerselection;

import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProviderSelectionViewModelBase.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$notifyChange$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$notifyChange$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ProviderSelectionViewModelBase3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProviderSelectionViewModelBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProviderSelectionViewModelBase3(ProviderSelectionViewModelBase providerSelectionViewModelBase, Continuation<? super ProviderSelectionViewModelBase3> continuation) {
        super(2, continuation);
        this.this$0 = providerSelectionViewModelBase;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProviderSelectionViewModelBase3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProviderSelectionViewModelBase3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaymentProvider currentProvider = this.this$0.getCurrentProvider();
        if (currentProvider != null) {
            final ProviderSelectionViewModelBase providerSelectionViewModelBase = this.this$0;
            if (currentProvider.getHasUserPriming() && (providerSelectionViewModelBase.getScreen().getValue() instanceof ProviderSelectionScreen.Priming)) {
                providerSelectionViewModelBase.showProviderPriming(currentProvider, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$notifyChange$1$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        providerSelectionViewModelBase.onUserPrimingConfirmation$payments_ui_release();
                    }
                });
            } else if (providerSelectionViewModelBase.getScreen().getValue() instanceof ProviderSelectionScreen.Confirmation) {
                providerSelectionViewModelBase.showConfirmation();
            }
        }
        return Unit.INSTANCE;
    }
}
