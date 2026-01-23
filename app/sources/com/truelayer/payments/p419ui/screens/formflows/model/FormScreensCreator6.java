package com.truelayer.payments.p419ui.screens.formflows.model;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: FormScreensCreator.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Fail;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$createSteps$error$1", m3645f = "FormScreensCreator.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 131}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$createSteps$error$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FormScreensCreator6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Fail<? extends CoreError>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FormScreensCreator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormScreensCreator6(FormScreensCreator formScreensCreator, Continuation<? super FormScreensCreator6> continuation) {
        super(2, continuation);
        this.this$0 = formScreensCreator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FormScreensCreator6 formScreensCreator6 = new FormScreensCreator6(this.this$0, continuation);
        formScreensCreator6.L$0 = obj;
        return formScreensCreator6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Fail<? extends CoreError>> continuation) {
        return ((FormScreensCreator6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r12 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormScreensCreator formScreensCreator;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new FormScreensCreator7(this.this$0, null), 3, null);
            deferredAsync$default.start();
            formScreensCreator = this.this$0;
            this.L$0 = formScreensCreator;
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Outcome outcome = (Outcome) obj;
            FormScreensCreator formScreensCreator2 = this.this$0;
            boolean z = outcome instanceof Ok;
            if (z) {
                formScreensCreator2.legalText = (Legals) ((Ok) outcome).getValue();
            } else if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return null;
            }
            if (outcome instanceof Fail) {
                return new Fail((CoreError) ((Fail) outcome).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        formScreensCreator = (FormScreensCreator) this.L$0;
        ResultKt.throwOnFailure(obj);
        formScreensCreator.additionalInputs = (List) obj;
        TranslationProvider translationProvider = this.this$0.api.getTranslationProvider();
        PaymentContext paymentContextIntoDomain$payments_ui_release = this.this$0.paymentContext.intoDomain$payments_ui_release();
        String countryCode = this.this$0.selectedProvider.getCountryCode();
        boolean z2 = this.this$0.isSignupPlus;
        this.L$0 = null;
        this.label = 2;
        obj = translationProvider.updateLegalsSync(paymentContextIntoDomain$payments_ui_release, countryCode, z2, this);
    }
}
