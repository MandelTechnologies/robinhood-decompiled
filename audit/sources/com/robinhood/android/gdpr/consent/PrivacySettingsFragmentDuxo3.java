package com.robinhood.android.gdpr.consent;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo;
import com.robinhood.android.gdpr.consent.PrivacySettingsFragmentUiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PrivacySettingsFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$setConsent$1$1$1", m3645f = "PrivacySettingsFragmentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$setConsent$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class PrivacySettingsFragmentDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PrivacySettingsFragmentDuxo.AutoDismiss $autoDismiss;
    int label;
    final /* synthetic */ PrivacySettingsFragmentDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsFragmentDuxo3(PrivacySettingsFragmentDuxo.AutoDismiss autoDismiss, PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, Continuation<? super PrivacySettingsFragmentDuxo3> continuation) {
        super(2, continuation);
        this.$autoDismiss = autoDismiss;
        this.this$0 = privacySettingsFragmentDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrivacySettingsFragmentDuxo3(this.$autoDismiss, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrivacySettingsFragmentDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long delayMillis = ((PrivacySettingsFragmentDuxo.AutoDismiss.WithDelay) this.$autoDismiss).getDelayMillis();
            this.label = 1;
            if (DelayKt.delay(delayMillis, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.submit(PrivacySettingsFragmentUiEvent.Dismiss.INSTANCE);
        return Unit.INSTANCE;
    }
}
