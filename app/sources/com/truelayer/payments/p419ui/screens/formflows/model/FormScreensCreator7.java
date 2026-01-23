package com.truelayer.payments.p419ui.screens.formflows.model;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.network.Network;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FormScreensCreator.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$createSteps$error$1$inputs$1", m3645f = "FormScreensCreator.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$createSteps$error$1$inputs$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FormScreensCreator7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends AdditionalInput>>, Object> {
    int label;
    final /* synthetic */ FormScreensCreator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormScreensCreator7(FormScreensCreator formScreensCreator, Continuation<? super FormScreensCreator7> continuation) {
        super(2, continuation);
        this.this$0 = formScreensCreator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormScreensCreator7(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AdditionalInput>> continuation) {
        return ((FormScreensCreator7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Network network = this.this$0.api;
            PaymentContext paymentContextIntoDomain$payments_ui_release = this.this$0.paymentContext.intoDomain$payments_ui_release();
            this.label = 1;
            obj = network.getAdditionalInputs(paymentContextIntoDomain$payments_ui_release, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) Outcome4.okOrNull((Outcome) obj);
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
