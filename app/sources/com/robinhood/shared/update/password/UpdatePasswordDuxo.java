package com.robinhood.shared.update.password;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.update.password.UpdatePasswordDuxo;
import com.robinhood.shared.update.password.UpdatePasswordDuxo8;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/update/password/UpdatePasswordDataState;", "Lcom/robinhood/shared/update/password/UpdatePasswordViewState;", "Lcom/robinhood/shared/update/password/UpdatePasswordEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/shared/update/password/UpdatePasswordStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/shared/update/password/UpdatePasswordStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onSubmit", "", UpdatePasswordDuxo.SAVED_CURRENT_PASSWORD, "", UpdatePasswordDuxo.SAVED_NEW_PASSWORD, "confirmNewPassword", "updatePassword", "Companion", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UpdatePasswordDuxo extends BaseDuxo3<UpdatePasswordDataState, UpdatePasswordViewState, UpdatePasswordDuxo8> implements HasSavedState {
    private static final String SAVED_CURRENT_PASSWORD = "currentPassword";
    private static final String SAVED_NEW_PASSWORD = "newPassword";
    private final AuthManager authManager;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePasswordDuxo(SavedStateHandle savedStateHandle, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, UpdatePasswordStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new UpdatePasswordDataState(false, (String) savedStateHandle.get(SAVED_CURRENT_PASSWORD), (String) savedStateHandle.get(SAVED_NEW_PASSWORD), null, 9, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.authManager = authManager;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    public final void onSubmit(String currentPassword, String newPassword, String confirmNewPassword) {
        Intrinsics.checkNotNullParameter(currentPassword, "currentPassword");
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        Intrinsics.checkNotNullParameter(confirmNewPassword, "confirmNewPassword");
        getSavedStateHandle().set(SAVED_CURRENT_PASSWORD, currentPassword);
        getSavedStateHandle().set(SAVED_NEW_PASSWORD, newPassword);
        applyMutation(new C412181(currentPassword, newPassword, confirmNewPassword, null));
        withDataState(new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdatePasswordDuxo.onSubmit$lambda$0(this.f$0, (UpdatePasswordDataState) obj);
            }
        });
    }

    /* compiled from: UpdatePasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/UpdatePasswordDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.UpdatePasswordDuxo$onSubmit$1", m3645f = "UpdatePasswordDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.UpdatePasswordDuxo$onSubmit$1 */
    static final class C412181 extends ContinuationImpl7 implements Function2<UpdatePasswordDataState, Continuation<? super UpdatePasswordDataState>, Object> {
        final /* synthetic */ String $confirmNewPassword;
        final /* synthetic */ String $currentPassword;
        final /* synthetic */ String $newPassword;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412181(String str, String str2, String str3, Continuation<? super C412181> continuation) {
            super(2, continuation);
            this.$currentPassword = str;
            this.$newPassword = str2;
            this.$confirmNewPassword = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412181 c412181 = new C412181(this.$currentPassword, this.$newPassword, this.$confirmNewPassword, continuation);
            c412181.L$0 = obj;
            return c412181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdatePasswordDataState updatePasswordDataState, Continuation<? super UpdatePasswordDataState> continuation) {
            return ((C412181) create(updatePasswordDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UpdatePasswordDataState.copy$default((UpdatePasswordDataState) this.L$0, false, this.$currentPassword, this.$newPassword, this.$confirmNewPassword, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubmit$lambda$0(UpdatePasswordDuxo updatePasswordDuxo, UpdatePasswordDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getReadyToUpdate()) {
            updatePasswordDuxo.submit(UpdatePasswordDuxo8.UpdatePassword.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UpdatePasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/UpdatePasswordDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1", m3645f = "UpdatePasswordDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1 */
    static final class C412191 extends ContinuationImpl7 implements Function2<UpdatePasswordDataState, Continuation<? super UpdatePasswordDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C412191(Continuation<? super C412191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412191 c412191 = UpdatePasswordDuxo.this.new C412191(continuation);
            c412191.L$0 = obj;
            return c412191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdatePasswordDataState updatePasswordDataState, Continuation<? super UpdatePasswordDataState> continuation) {
            return ((C412191) create(updatePasswordDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UpdatePasswordDataState updatePasswordDataState = (UpdatePasswordDataState) this.L$0;
                SuvWorkflowManager suvWorkflowManager = UpdatePasswordDuxo.this.suvWorkflowManager;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdatePasswordDuxo.this, updatePasswordDataState, null);
                final UpdatePasswordDuxo updatePasswordDuxo = UpdatePasswordDuxo.this;
                Function1 function1 = new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UpdatePasswordDuxo.C412191.invokeSuspend$lambda$0(updatePasswordDuxo, (Unit) obj2);
                    }
                };
                final UpdatePasswordDuxo updatePasswordDuxo2 = UpdatePasswordDuxo.this;
                Function1<? super Throwable, Unit> function12 = new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UpdatePasswordDuxo.C412191.invokeSuspend$lambda$1(updatePasswordDuxo2, (Throwable) obj2);
                    }
                };
                final UpdatePasswordDuxo updatePasswordDuxo3 = UpdatePasswordDuxo.this;
                suvWorkflowManager.handleRequest(anonymousClass1, function1, function12, new Function2() { // from class: com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return UpdatePasswordDuxo.C412191.invokeSuspend$lambda$2(updatePasswordDuxo3, (UUID) obj2, ((Boolean) obj3).booleanValue());
                    }
                });
                return UpdatePasswordDataState.copy$default(updatePasswordDataState, true, null, null, null, 14, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: UpdatePasswordDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$1", m3645f = "UpdatePasswordDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ UpdatePasswordDataState $$this$applyMutation;
            int label;
            final /* synthetic */ UpdatePasswordDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdatePasswordDuxo updatePasswordDuxo, UpdatePasswordDataState updatePasswordDataState, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = updatePasswordDuxo;
                this.$$this$applyMutation = updatePasswordDataState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$$this$applyMutation, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthManager authManager = this.this$0.authManager;
                    String currentPassword = this.$$this$applyMutation.getCurrentPassword();
                    Intrinsics.checkNotNull(currentPassword);
                    String newPassword = this.$$this$applyMutation.getNewPassword();
                    Intrinsics.checkNotNull(newPassword);
                    this.label = 1;
                    if (authManager.changePassword(currentPassword, newPassword, this) == coroutine_suspended) {
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
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(UpdatePasswordDuxo updatePasswordDuxo, Unit unit) {
            updatePasswordDuxo.applyMutation(new UpdatePasswordDuxo5(null));
            updatePasswordDuxo.submit(UpdatePasswordDuxo8.UpdatePasswordSuccess.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(UpdatePasswordDuxo updatePasswordDuxo, Throwable th) throws Throwable {
            if (Throwables.isNetworkRelated(th)) {
                updatePasswordDuxo.applyMutation(new UpdatePasswordDuxo6(null));
                updatePasswordDuxo.submit(new UpdatePasswordDuxo8.Error(th));
                return Unit.INSTANCE;
            }
            throw th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(UpdatePasswordDuxo updatePasswordDuxo, UUID uuid, boolean z) {
            updatePasswordDuxo.applyMutation(new UpdatePasswordDuxo7(null));
            updatePasswordDuxo.submit(new UpdatePasswordDuxo8.VerificationWorkflow(uuid, z));
            return Unit.INSTANCE;
        }
    }

    public final void updatePassword() {
        applyMutation(new C412191(null));
    }
}
