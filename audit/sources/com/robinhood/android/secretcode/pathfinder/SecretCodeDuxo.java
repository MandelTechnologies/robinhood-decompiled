package com.robinhood.android.secretcode.pathfinder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.secretcode.pathfinder.SecretCodeDuxo;
import com.robinhood.android.secretcode.pathfinder.SecretCodeViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.librobinhood.data.store.sheriff.SecretCodeStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SecretCodeDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/secretcode/pathfinder/SecretCodeDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "secretCodeStore", "Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;", "installation", "Lcom/robinhood/prefs/Installation;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;Lcom/robinhood/prefs/Installation;Lcom/robinhood/prefs/TrustedDeviceIdPref;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "sendSecretCode", "Companion", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SecretCodeDuxo extends OldBaseDuxo<SecretCodeViewState> implements HasSavedState {
    private final Installation installation;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;
    private final SecretCodeStore secretCodeStore;
    private final TrustedDeviceIdPref trustedDeviceIdPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SecretCodeDuxo(PathfinderStore pathfinderStore, SecretCodeStore secretCodeStore, Installation installation, TrustedDeviceIdPref trustedDeviceIdPref, SavedStateHandle savedStateHandle) {
        super(new SecretCodeViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(secretCodeStore, "secretCodeStore");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.secretCodeStore = secretCodeStore;
        this.installation = installation;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        sendSecretCode();
    }

    /* compiled from: SecretCodeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.secretcode.pathfinder.SecretCodeDuxo$sendSecretCode$1", m3645f = "SecretCodeDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.secretcode.pathfinder.SecretCodeDuxo$sendSecretCode$1 */
    static final class C281761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C281761(Continuation<? super C281761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecretCodeDuxo.this.new C281761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C281761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SecretCodeDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.secretcode.pathfinder.SecretCodeDuxo$sendSecretCode$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SecretCodeDuxo.C281761.invokeSuspend$lambda$0((SecretCodeViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = SecretCodeDuxo.this.pathfinderStore;
                Companion companion = SecretCodeDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.LoggedOutSecretCodeValidation) companion.getArgs((HasSavedState) SecretCodeDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.LoggedOutSecretCodeValidation) companion.getArgs((HasSavedState) SecretCodeDuxo.this)).getUserViewState().getSequence();
                UserViewInput.ContactSecretCode contactSecretCode = new UserViewInput.ContactSecretCode(SecretCodeDuxo.this.secretCodeStore.getSecretCode(), SecretCodeDuxo.this.trustedDeviceIdPref.get(), SecretCodeDuxo.this.installation.mo2745id());
                final SecretCodeDuxo secretCodeDuxo = SecretCodeDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.secretcode.pathfinder.SecretCodeDuxo$sendSecretCode$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(SecretCodeDuxo.C281761.invokeSuspend$lambda$2(secretCodeDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, contactSecretCode, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SecretCodeViewState invokeSuspend$lambda$0(SecretCodeViewState secretCodeViewState) {
            return secretCodeViewState.copy(SecretCodeViewState.State.Loading.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$2(SecretCodeDuxo secretCodeDuxo, Throwable th) throws Throwable {
            if (Throwables.isNetworkRelated(th)) {
                secretCodeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.secretcode.pathfinder.SecretCodeDuxo$sendSecretCode$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SecretCodeDuxo.C281761.invokeSuspend$lambda$2$lambda$1((SecretCodeViewState) obj);
                    }
                });
                return true;
            }
            throw th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SecretCodeViewState invokeSuspend$lambda$2$lambda$1(SecretCodeViewState secretCodeViewState) {
            return secretCodeViewState.copy(SecretCodeViewState.State.Failed.INSTANCE);
        }
    }

    public final void sendSecretCode() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C281761(null), 3, null);
    }

    /* compiled from: SecretCodeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/secretcode/pathfinder/SecretCodeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$LoggedOutSecretCodeValidation;", "<init>", "()V", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SecretCodeDuxo, LegacyFragmentKey.LoggedOutSecretCodeValidation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.LoggedOutSecretCodeValidation getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.LoggedOutSecretCodeValidation) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.LoggedOutSecretCodeValidation getArgs(SecretCodeDuxo secretCodeDuxo) {
            return (LegacyFragmentKey.LoggedOutSecretCodeValidation) DuxoCompanion.DefaultImpls.getArgs(this, secretCodeDuxo);
        }
    }
}
