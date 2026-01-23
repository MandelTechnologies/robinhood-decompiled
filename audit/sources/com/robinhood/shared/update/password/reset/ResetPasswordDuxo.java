package com.robinhood.shared.update.password.reset;

import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.GenericMessage;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.update.password.reset.ResetPasswordEvent;
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

/* compiled from: ResetPasswordDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/update/password/reset/ResetPasswordDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/update/password/reset/ResetPasswordViewState;", "Lcom/robinhood/shared/update/password/reset/ResetPasswordEvent;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "sendEmail", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ResetPasswordDuxo extends BaseDuxo5<ResetPasswordViewState, ResetPasswordEvent> {
    public static final int $stable = 8;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordDuxo(UserStore userStore, SuvWorkflowManager suvWorkflowManager, AppType appType, DuxoBundle duxoBundle) {
        super(new ResetPasswordViewState(false, null, appType != AppType.RHC, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetPasswordDuxo.onCreate$lambda$0(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ResetPasswordDuxo resetPasswordDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        resetPasswordDuxo.applyMutation(new ResetPasswordDuxo2(user, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ResetPasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/reset/ResetPasswordViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.ResetPasswordDuxo$sendEmail$1", m3645f = "ResetPasswordDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$sendEmail$1 */
    static final class C412331 extends ContinuationImpl7 implements Function2<ResetPasswordViewState, Continuation<? super ResetPasswordViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C412331(Continuation<? super C412331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412331 c412331 = new C412331(continuation);
            c412331.L$0 = obj;
            return c412331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ResetPasswordViewState resetPasswordViewState, Continuation<? super ResetPasswordViewState> continuation) {
            return ((C412331) create(resetPasswordViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ResetPasswordViewState.copy$default((ResetPasswordViewState) this.L$0, true, null, false, 6, null);
        }
    }

    public final void sendEmail() {
        applyMutation(new C412331(null));
        this.suvWorkflowManager.handleRequest(new C412342(null), new Function1() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetPasswordDuxo.sendEmail$lambda$1(this.f$0, (GenericMessage) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetPasswordDuxo.sendEmail$lambda$2(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ResetPasswordDuxo.sendEmail$lambda$3(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* compiled from: ResetPasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/GenericMessage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.ResetPasswordDuxo$sendEmail$2", m3645f = "ResetPasswordDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$sendEmail$2 */
    static final class C412342 extends ContinuationImpl7 implements Function1<Continuation<? super GenericMessage>, Object> {
        int label;

        C412342(Continuation<? super C412342> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ResetPasswordDuxo.this.new C412342(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super GenericMessage> continuation) {
            return ((C412342) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            UserStore userStore = ResetPasswordDuxo.this.userStore;
            this.label = 1;
            Object objRequestPasswordResetEmail = userStore.requestPasswordResetEmail(this);
            return objRequestPasswordResetEmail == coroutine_suspended ? coroutine_suspended : objRequestPasswordResetEmail;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEmail$lambda$1(ResetPasswordDuxo resetPasswordDuxo, GenericMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        resetPasswordDuxo.applyMutation(new ResetPasswordDuxo3(null));
        resetPasswordDuxo.submit(ResetPasswordEvent.EmailSent.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEmail$lambda$2(ResetPasswordDuxo resetPasswordDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            resetPasswordDuxo.applyMutation(new ResetPasswordDuxo4(null));
            resetPasswordDuxo.submit(new ResetPasswordEvent.Error(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEmail$lambda$3(ResetPasswordDuxo resetPasswordDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        resetPasswordDuxo.submit(new ResetPasswordEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }
}
