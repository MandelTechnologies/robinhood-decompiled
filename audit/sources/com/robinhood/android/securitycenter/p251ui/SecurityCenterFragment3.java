package com.robinhood.android.securitycenter.p251ui;

import androidx.credentials.CreatePublicKeyCredentialResponse;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterDuxo7;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SecurityCenterFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterFragment$processEvent$1$1$1", m3645f = "SecurityCenterFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$processEvent$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SecurityCenterFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SecurityCenterDuxo7 $it;
    final /* synthetic */ String $webauthnOptions;
    int label;
    final /* synthetic */ SecurityCenterFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecurityCenterFragment3(SecurityCenterFragment securityCenterFragment, String str, SecurityCenterDuxo7 securityCenterDuxo7, Continuation<? super SecurityCenterFragment3> continuation) {
        super(2, continuation);
        this.this$0 = securityCenterFragment;
        this.$webauthnOptions = str;
        this.$it = securityCenterDuxo7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityCenterFragment3(this.this$0, this.$webauthnOptions, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityCenterFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SecurityCenterFragment securityCenterFragment = this.this$0;
            String str = this.$webauthnOptions;
            this.label = 1;
            obj = securityCenterFragment.createPasskey(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CreatePublicKeyCredentialResponse createPublicKeyCredentialResponse = (CreatePublicKeyCredentialResponse) obj;
        if (createPublicKeyCredentialResponse == null) {
            this.this$0.getDuxo().showPasskeyEnrollmentErrorDialog(true);
        } else {
            this.this$0.getDuxo().validatePasskeyChallenge(((SecurityCenterDuxo7.PasskeyChallengeReceived) this.$it).getChallenge().getId(), createPublicKeyCredentialResponse.getRegistrationResponseJson());
        }
        return Unit.INSTANCE;
    }
}
