package com.robinhood.shared.security.verify.credentials.password;

import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.security.verify.credentials.password.UpdatePasswordEvent;
import com.robinhood.shared.store.user.UserStore;
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
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordViewState;", "Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordEvent;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "submitPassword", "", "newPassword", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class UpdatePasswordDuxo extends BaseDuxo5<UpdatePasswordViewState, UpdatePasswordEvent> {
    public static final int $stable = 8;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePasswordDuxo(UserStore userStore, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle) {
        super(new UpdatePasswordViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    /* compiled from: UpdatePasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$submitPassword$1", m3645f = "UpdatePasswordDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$submitPassword$1 */
    static final class C397461 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $newPassword;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397461(String str, Continuation<? super C397461> continuation) {
            super(1, continuation);
            this.$newPassword = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UpdatePasswordDuxo.this.new C397461(this.$newPassword, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C397461) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UpdatePasswordDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$submitPassword$1$1", m3645f = "UpdatePasswordDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$submitPassword$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UpdatePasswordViewState, Continuation<? super UpdatePasswordViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UpdatePasswordViewState updatePasswordViewState, Continuation<? super UpdatePasswordViewState> continuation) {
                return ((AnonymousClass1) create(updatePasswordViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((UpdatePasswordViewState) this.L$0).copy(true);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UpdatePasswordDuxo.this.applyMutation(new AnonymousClass1(null));
                UserStore userStore = UpdatePasswordDuxo.this.userStore;
                String str = this.$newPassword;
                this.label = 1;
                if (userStore.resetPassword(str, this) == coroutine_suspended) {
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

    public final void submitPassword(String newPassword) {
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        this.suvWorkflowManager.handleRequest(new C397461(newPassword, null), new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdatePasswordDuxo.submitPassword$lambda$0(this.f$0, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdatePasswordDuxo.submitPassword$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UpdatePasswordDuxo.submitPassword$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitPassword$lambda$0(UpdatePasswordDuxo updatePasswordDuxo, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        updatePasswordDuxo.applyMutation(new UpdatePasswordDuxo2(null));
        updatePasswordDuxo.submit(UpdatePasswordEvent.Success.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitPassword$lambda$1(UpdatePasswordDuxo updatePasswordDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        updatePasswordDuxo.applyMutation(new UpdatePasswordDuxo3(null));
        updatePasswordDuxo.submit(new UpdatePasswordEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitPassword$lambda$2(UpdatePasswordDuxo updatePasswordDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        updatePasswordDuxo.applyMutation(new UpdatePasswordDuxo4(null));
        updatePasswordDuxo.submit(new UpdatePasswordEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }
}
