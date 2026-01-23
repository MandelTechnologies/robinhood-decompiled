package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$ComposeContent$1$1$4$1$1", m3645f = "FuturesOnboardingArbitrationAgreementFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$ComposeContent$1$1$4$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesOnboardingArbitrationAgreementFragment9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiAgreementWithContent $agreement;
    int label;
    final /* synthetic */ FuturesOnboardingArbitrationAgreementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOnboardingArbitrationAgreementFragment9(FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment, UiAgreementWithContent uiAgreementWithContent, Continuation<? super FuturesOnboardingArbitrationAgreementFragment9> continuation) {
        super(2, continuation);
        this.this$0 = futuresOnboardingArbitrationAgreementFragment;
        this.$agreement = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesOnboardingArbitrationAgreementFragment9(this.this$0, this.$agreement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesOnboardingArbitrationAgreementFragment9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesOnboardingArbitrationAgreementDuxo duxo = this.this$0.getDuxo();
            UiAgreementWithContent uiAgreementWithContent = this.$agreement;
            this.label = 1;
            obj = duxo.onAgreeClicked(uiAgreementWithContent, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.getCallbacks().onUserArbitrationDismissed(true);
        }
        return Unit.INSTANCE;
    }
}
