package com.robinhood.shared.stepupverification.identityverification;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo;
import com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateViewState;
import com.robinhood.udf.UiEvent;
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

/* compiled from: IdentityVerificationInitiateDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/shared/security/auth/AuthManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitVerificationResult", "", "success", "", "handleError", "throwable", "", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class IdentityVerificationInitiateDuxo extends OldBaseDuxo<IdentityVerificationInitiateViewState> implements HasSavedState {
    private final AuthManager authManager;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdentityVerificationInitiateDuxo(PathfinderStore pathfinderStore, AuthManager authManager, SavedStateHandle savedStateHandle) {
        super(new IdentityVerificationInitiateViewState.Initial(authManager.isLoggedIn()), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: IdentityVerificationInitiateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo$submitVerificationResult$1", m3645f = "IdentityVerificationInitiateDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo$submitVerificationResult$1 */
    static final class C398541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398541(boolean z, Continuation<? super C398541> continuation) {
            super(2, continuation);
            this.$success = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdentityVerificationInitiateDuxo.this.new C398541(this.$success, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo = IdentityVerificationInitiateDuxo.this;
                identityVerificationInitiateDuxo.mutate(new Function1() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo$submitVerificationResult$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return IdentityVerificationInitiateDuxo.C398541.invokeSuspend$lambda$0(identityVerificationInitiateDuxo, (IdentityVerificationInitiateViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = IdentityVerificationInitiateDuxo.this.pathfinderStore;
                Companion companion = IdentityVerificationInitiateDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderIdentityVerificationInitiate) companion.getArgs((HasSavedState) IdentityVerificationInitiateDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderIdentityVerificationInitiate) companion.getArgs((HasSavedState) IdentityVerificationInitiateDuxo.this)).getUserViewState().getSequence();
                UserViewInput.IdentityVerificationInitiate identityVerificationInitiate = new UserViewInput.IdentityVerificationInitiate(this.$success);
                final IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo2 = IdentityVerificationInitiateDuxo.this;
                final boolean z = this.$success;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo$submitVerificationResult$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(IdentityVerificationInitiateDuxo.C398541.invokeSuspend$lambda$1(identityVerificationInitiateDuxo2, z, (Throwable) obj2));
                    }
                };
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, identityVerificationInitiate, function1, this) == coroutine_suspended) {
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
        public static final IdentityVerificationInitiateViewState invokeSuspend$lambda$0(IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo, IdentityVerificationInitiateViewState identityVerificationInitiateViewState) {
            return new IdentityVerificationInitiateViewState.Initial(identityVerificationInitiateDuxo.authManager.isLoggedIn());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1(IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo, boolean z, Throwable th) {
            return identityVerificationInitiateDuxo.handleError(th, z);
        }
    }

    public final void submitVerificationResult(boolean success) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C398541(success, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleError(final Throwable throwable, final boolean success) {
        if (Throwables.isConnectivityException(throwable)) {
            mutate(new Function1() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IdentityVerificationInitiateDuxo.handleError$lambda$0(success, this, (IdentityVerificationInitiateViewState) obj);
                }
            });
            return true;
        }
        if (!Throwables.isHttpException(throwable)) {
            return false;
        }
        mutate(new Function1() { // from class: com.robinhood.shared.stepupverification.identityverification.IdentityVerificationInitiateDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IdentityVerificationInitiateDuxo.handleError$lambda$1(throwable, this, (IdentityVerificationInitiateViewState) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdentityVerificationInitiateViewState handleError$lambda$0(boolean z, IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo, IdentityVerificationInitiateViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new IdentityVerificationInitiateViewState.InputError(z, identityVerificationInitiateDuxo.authManager.isLoggedIn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdentityVerificationInitiateViewState handleError$lambda$1(Throwable th, IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo, IdentityVerificationInitiateViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new IdentityVerificationInitiateViewState.UnknownError(new UiEvent(th), identityVerificationInitiateDuxo.authManager.isLoggedIn());
    }

    /* compiled from: IdentityVerificationInitiateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/identityverification/IdentityVerificationInitiateDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderIdentityVerificationInitiate;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IdentityVerificationInitiateDuxo, LegacyFragmentKey.PathfinderIdentityVerificationInitiate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderIdentityVerificationInitiate getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PathfinderIdentityVerificationInitiate) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderIdentityVerificationInitiate getArgs(IdentityVerificationInitiateDuxo identityVerificationInitiateDuxo) {
            return (LegacyFragmentKey.PathfinderIdentityVerificationInitiate) DuxoCompanion.DefaultImpls.getArgs(this, identityVerificationInitiateDuxo);
        }
    }
}
