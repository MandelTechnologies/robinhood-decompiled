package com.robinhood.shared.login.lib.p385ui;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.runtime.SnapshotState;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseLoginComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$7$1", m3645f = "BaseLoginComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginComposableKt$BaseLoginComposable$7$1, reason: use source file name */
/* loaded from: classes6.dex */
final class BaseLoginComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ CredentialManager $credentialManager;
    final /* synthetic */ String $defaultEmail;
    final /* synthetic */ BaseLoginDuxo $duxo;
    final /* synthetic */ SnapshotState<String> $email$delegate;
    final /* synthetic */ FocusRequester $emailFocusRequester;
    final /* synthetic */ SharedEventLogger $eventLogger;
    final /* synthetic */ SnapshotState<String> $password$delegate;
    final /* synthetic */ FocusRequester $passwordFocusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseLoginComposable3(CredentialManager credentialManager, FragmentActivity fragmentActivity, SharedEventLogger sharedEventLogger, BaseLoginDuxo baseLoginDuxo, String str, FocusRequester focusRequester, FocusRequester focusRequester2, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, Continuation<? super BaseLoginComposable3> continuation) {
        super(2, continuation);
        this.$credentialManager = credentialManager;
        this.$activity = fragmentActivity;
        this.$eventLogger = sharedEventLogger;
        this.$duxo = baseLoginDuxo;
        this.$defaultEmail = str;
        this.$emailFocusRequester = focusRequester;
        this.$passwordFocusRequester = focusRequester2;
        this.$email$delegate = snapshotState;
        this.$password$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseLoginComposable3(this.$credentialManager, this.$activity, this.$eventLogger, this.$duxo, this.$defaultEmail, this.$emailFocusRequester, this.$passwordFocusRequester, this.$email$delegate, this.$password$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseLoginComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Exception {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CredentialManager credentialManager = this.$credentialManager;
                FragmentActivity fragmentActivity = this.$activity;
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(CollectionsKt.listOf(new GetPasswordOption((Set) null, false, (Set) null, 7, (DefaultConstructorMarker) null)), null, false, null, false, 30, null);
                this.label = 1;
                obj = credentialManager.getCredential(fragmentActivity, getCredentialRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Credential credential = ((GetCredentialResponse) obj).getCredential();
            Intrinsics.checkNotNull(credential, "null cannot be cast to non-null type androidx.credentials.PasswordCredential");
            PasswordCredential passwordCredential = (PasswordCredential) credential;
            BaseLoginComposable.logLoginTapEvent(this.$eventLogger);
            BaseLoginComposable.BaseLoginComposable$lambda$5(this.$email$delegate, passwordCredential.getId());
            BaseLoginComposable.BaseLoginComposable$lambda$9(this.$password$delegate, passwordCredential.getPassword());
            this.$duxo.onCredentialsLoaded(BaseLoginComposable.BaseLoginComposable$lambda$4(this.$email$delegate), BaseLoginComposable.BaseLoginComposable$lambda$8(this.$password$delegate));
        } catch (Exception e) {
            if (!(e instanceof GetCredentialCancellationException) && !(e instanceof NoCredentialException)) {
                if ((e instanceof GetCredentialCustomException) || (e instanceof GetCredentialInterruptedException) || (e instanceof GetCredentialProviderConfigurationException) || (e instanceof GetCredentialUnknownException) || (e instanceof GetCredentialUnsupportedException)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
                } else {
                    throw e;
                }
            }
            if (this.$defaultEmail == null) {
                FocusRequester.m6497requestFocus3ESFkO8$default(this.$emailFocusRequester, 0, 1, null);
            } else {
                FocusRequester.m6497requestFocus3ESFkO8$default(this.$passwordFocusRequester, 0, 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}
