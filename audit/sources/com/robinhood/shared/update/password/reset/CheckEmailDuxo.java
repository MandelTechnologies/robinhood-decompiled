package com.robinhood.shared.update.password.reset;

import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.GenericMessage;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.update.password.reset.CheckEmailEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
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

/* compiled from: CheckEmailDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/update/password/reset/CheckEmailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/update/password/reset/CheckEmailViewState;", "Lcom/robinhood/shared/update/password/reset/CheckEmailEvent;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "resendEmail", "hideEmailResentDialog", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CheckEmailDuxo extends BaseDuxo5<CheckEmailViewState, CheckEmailEvent> {
    public static final int $stable = 8;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEmailDuxo(UserStore userStore, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle) {
        super(new CheckEmailViewState(false, false, null, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable<R> map = this.userStore.getUser().map(new Function() { // from class: com.robinhood.shared.update.password.reset.CheckEmailDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final String apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                return user.getEmail();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.update.password.reset.CheckEmailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEmailDuxo.onCreate$lambda$0(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CheckEmailDuxo checkEmailDuxo, String str) {
        checkEmailDuxo.applyMutation(new CheckEmailDuxo2(str, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CheckEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/reset/CheckEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.CheckEmailDuxo$resendEmail$1", m3645f = "CheckEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.reset.CheckEmailDuxo$resendEmail$1 */
    static final class C412271 extends ContinuationImpl7 implements Function2<CheckEmailViewState, Continuation<? super CheckEmailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C412271(Continuation<? super C412271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412271 c412271 = new C412271(continuation);
            c412271.L$0 = obj;
            return c412271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckEmailViewState checkEmailViewState, Continuation<? super CheckEmailViewState> continuation) {
            return ((C412271) create(checkEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CheckEmailViewState.copy$default((CheckEmailViewState) this.L$0, true, false, null, 6, null);
        }
    }

    public final void resendEmail() {
        applyMutation(new C412271(null));
        this.suvWorkflowManager.handleRequest(new C412282(null), new Function1() { // from class: com.robinhood.shared.update.password.reset.CheckEmailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEmailDuxo.resendEmail$lambda$1(this.f$0, (GenericMessage) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.update.password.reset.CheckEmailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEmailDuxo.resendEmail$lambda$2(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.update.password.reset.CheckEmailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CheckEmailDuxo.resendEmail$lambda$3(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* compiled from: CheckEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/GenericMessage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.CheckEmailDuxo$resendEmail$2", m3645f = "CheckEmailDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.reset.CheckEmailDuxo$resendEmail$2 */
    static final class C412282 extends ContinuationImpl7 implements Function1<Continuation<? super GenericMessage>, Object> {
        int label;

        C412282(Continuation<? super C412282> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CheckEmailDuxo.this.new C412282(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super GenericMessage> continuation) {
            return ((C412282) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            UserStore userStore = CheckEmailDuxo.this.userStore;
            this.label = 1;
            Object objRequestPasswordResetEmail = userStore.requestPasswordResetEmail(this);
            return objRequestPasswordResetEmail == coroutine_suspended ? coroutine_suspended : objRequestPasswordResetEmail;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendEmail$lambda$1(CheckEmailDuxo checkEmailDuxo, GenericMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        checkEmailDuxo.applyMutation(new CheckEmailDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendEmail$lambda$2(CheckEmailDuxo checkEmailDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            checkEmailDuxo.applyMutation(new CheckEmailDuxo4(null));
            checkEmailDuxo.submit(new CheckEmailEvent.Error(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendEmail$lambda$3(CheckEmailDuxo checkEmailDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        checkEmailDuxo.submit(new CheckEmailEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }

    /* compiled from: CheckEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/reset/CheckEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.CheckEmailDuxo$hideEmailResentDialog$1", m3645f = "CheckEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.reset.CheckEmailDuxo$hideEmailResentDialog$1 */
    static final class C412251 extends ContinuationImpl7 implements Function2<CheckEmailViewState, Continuation<? super CheckEmailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C412251(Continuation<? super C412251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412251 c412251 = new C412251(continuation);
            c412251.L$0 = obj;
            return c412251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckEmailViewState checkEmailViewState, Continuation<? super CheckEmailViewState> continuation) {
            return ((C412251) create(checkEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CheckEmailViewState.copy$default((CheckEmailViewState) this.L$0, false, false, null, 5, null);
        }
    }

    public final void hideEmailResentDialog() {
        applyMutation(new C412251(null));
    }
}
