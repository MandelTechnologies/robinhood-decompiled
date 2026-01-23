package com.robinhood.shared.unverifiedaccountrecovery;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateDuxo;
import com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateViewState;
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

/* compiled from: UarContactSelfieVerificationInitiateDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "installation", "Lcom/robinhood/prefs/Installation;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/prefs/Installation;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitSelfieVerificationResult", "", "success", "", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UarContactSelfieVerificationInitiateDuxo extends OldBaseDuxo<UarContactSelfieVerificationInitiateViewState> implements HasSavedState {
    private final Installation installation;
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
    public UarContactSelfieVerificationInitiateDuxo(PathfinderStore pathfinderStore, Installation installation, SavedStateHandle savedStateHandle) {
        super(new UarContactSelfieVerificationInitiateViewState(UarContactSelfieVerificationInitiateViewState.State.InFlow.INSTANCE), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.installation = installation;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: UarContactSelfieVerificationInitiateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateDuxo$submitSelfieVerificationResult$1", m3645f = "UarContactSelfieVerificationInitiateDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateDuxo$submitSelfieVerificationResult$1 */
    static final class C411321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C411321(boolean z, Continuation<? super C411321> continuation) {
            super(2, continuation);
            this.$success = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UarContactSelfieVerificationInitiateDuxo.this.new C411321(this.$success, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UarContactSelfieVerificationInitiateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateDuxo$submitSelfieVerificationResult$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UarContactSelfieVerificationInitiateDuxo.C411321.invokeSuspend$lambda$0((UarContactSelfieVerificationInitiateViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = UarContactSelfieVerificationInitiateDuxo.this.pathfinderStore;
                Companion companion = UarContactSelfieVerificationInitiateDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.UarContactSelfieVerificationInitiate) companion.getArgs((HasSavedState) UarContactSelfieVerificationInitiateDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.UarContactSelfieVerificationInitiate) companion.getArgs((HasSavedState) UarContactSelfieVerificationInitiateDuxo.this)).getUserViewState().getSequence();
                UserViewInput.UarContactSelfieVerificationInitiate uarContactSelfieVerificationInitiate = new UserViewInput.UarContactSelfieVerificationInitiate(this.$success, UarContactSelfieVerificationInitiateDuxo.this.installation.mo2745id());
                final UarContactSelfieVerificationInitiateDuxo uarContactSelfieVerificationInitiateDuxo = UarContactSelfieVerificationInitiateDuxo.this;
                final boolean z = this.$success;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateDuxo$submitSelfieVerificationResult$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(UarContactSelfieVerificationInitiateDuxo.C411321.invokeSuspend$lambda$3(uarContactSelfieVerificationInitiateDuxo, z, (Throwable) obj2));
                    }
                };
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, uarContactSelfieVerificationInitiate, function1, this) == coroutine_suspended) {
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
        public static final UarContactSelfieVerificationInitiateViewState invokeSuspend$lambda$0(UarContactSelfieVerificationInitiateViewState uarContactSelfieVerificationInitiateViewState) {
            return uarContactSelfieVerificationInitiateViewState.copy(UarContactSelfieVerificationInitiateViewState.State.Submitting.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(UarContactSelfieVerificationInitiateDuxo uarContactSelfieVerificationInitiateDuxo, final boolean z, Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                uarContactSelfieVerificationInitiateDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateDuxo$submitSelfieVerificationResult$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarContactSelfieVerificationInitiateDuxo.C411321.invokeSuspend$lambda$3$lambda$2$lambda$1(z, (UarContactSelfieVerificationInitiateViewState) obj);
                    }
                });
            }
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarContactSelfieVerificationInitiateViewState invokeSuspend$lambda$3$lambda$2$lambda$1(boolean z, UarContactSelfieVerificationInitiateViewState uarContactSelfieVerificationInitiateViewState) {
            return uarContactSelfieVerificationInitiateViewState.copy(new UarContactSelfieVerificationInitiateViewState.State.SubmitNetworkError(z));
        }
    }

    public final void submitSelfieVerificationResult(boolean success) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C411321(success, null), 3, null);
    }

    /* compiled from: UarContactSelfieVerificationInitiateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationInitiate;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UarContactSelfieVerificationInitiateDuxo, LegacyFragmentKey.UarContactSelfieVerificationInitiate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.UarContactSelfieVerificationInitiate getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.UarContactSelfieVerificationInitiate) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.UarContactSelfieVerificationInitiate getArgs(UarContactSelfieVerificationInitiateDuxo uarContactSelfieVerificationInitiateDuxo) {
            return (LegacyFragmentKey.UarContactSelfieVerificationInitiate) DuxoCompanion.DefaultImpls.getArgs(this, uarContactSelfieVerificationInitiateDuxo);
        }
    }
}
