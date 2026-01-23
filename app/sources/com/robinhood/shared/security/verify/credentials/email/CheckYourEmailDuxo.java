package com.robinhood.shared.security.verify.credentials.email;

import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.api.sheriff.ApiUserVerifyEmailInfo;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.security.verify.credentials.email.CheckYourEmailEvent;
import com.robinhood.shared.store.user.UserStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CheckYourEmailDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailViewState;", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailEvent;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "pollVerification", "", "email", "", "resendLink", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CheckYourEmailDuxo extends BaseDuxo5<CheckYourEmailViewState, CheckYourEmailEvent> {
    public static final int $stable = 8;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckYourEmailDuxo(UserStore userStore, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle) {
        super(new CheckYourEmailViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    /* compiled from: CheckYourEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$pollVerification$1", m3645f = "CheckYourEmailDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$pollVerification$1 */
    static final class C397141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397141(String str, Continuation<? super C397141> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckYourEmailDuxo.this.new C397141(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTakeWhile = FlowKt.takeWhile(FlowKt.m28818catch(CheckYourEmailDuxo.this.userStore.pollUserEmailVerifyInfo(), new AnonymousClass1(null)), new AnonymousClass2(this.$email, null));
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo.pollVerification.1.3
                    public final Object emit(ApiUserVerifyEmailInfo apiUserVerifyEmailInfo, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ApiUserVerifyEmailInfo) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (flowTakeWhile.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CheckYourEmailDuxo.this.submit(CheckYourEmailEvent.EmailVerified.INSTANCE);
            return Unit.INSTANCE;
        }

        /* compiled from: CheckYourEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$pollVerification$1$1", m3645f = "CheckYourEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$pollVerification$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FlowCollector<? super ApiUserVerifyEmailInfo>, Throwable, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super ApiUserVerifyEmailInfo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass1(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CheckYourEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$pollVerification$1$2", m3645f = "CheckYourEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$pollVerification$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ApiUserVerifyEmailInfo, Continuation<? super Boolean>, Object> {
            final /* synthetic */ String $email;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$email = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$email, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiUserVerifyEmailInfo apiUserVerifyEmailInfo, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(apiUserVerifyEmailInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(!Intrinsics.areEqual(((ApiUserVerifyEmailInfo) this.L$0).getVerified_email(), this.$email));
            }
        }
    }

    public final void pollVerification(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397141(email, null), 3, null);
    }

    /* compiled from: CheckYourEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$resendLink$1", m3645f = "CheckYourEmailDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$resendLink$1 */
    static final class C397151 extends ContinuationImpl7 implements Function1<Continuation<? super User>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397151(String str, Continuation<? super C397151> continuation) {
            super(1, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CheckYourEmailDuxo.this.new C397151(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super User> continuation) {
            return ((C397151) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CheckYourEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$resendLink$1$1", m3645f = "CheckYourEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$resendLink$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CheckYourEmailViewState, Continuation<? super CheckYourEmailViewState>, Object> {
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
            public final Object invoke(CheckYourEmailViewState checkYourEmailViewState, Continuation<? super CheckYourEmailViewState> continuation) {
                return ((AnonymousClass1) create(checkYourEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CheckYourEmailViewState) this.L$0).copy(true);
            }
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
            CheckYourEmailDuxo.this.applyMutation(new AnonymousClass1(null));
            UserStore userStore = CheckYourEmailDuxo.this.userStore;
            String str = this.$email;
            this.label = 1;
            Object objUpdateEmailAddress = userStore.updateEmailAddress(str, this);
            return objUpdateEmailAddress == coroutine_suspended ? coroutine_suspended : objUpdateEmailAddress;
        }
    }

    public final void resendLink(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.suvWorkflowManager.handleRequest(new C397151(email, null), new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckYourEmailDuxo.resendLink$lambda$0(this.f$0, (User) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckYourEmailDuxo.resendLink$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CheckYourEmailDuxo.resendLink$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendLink$lambda$0(CheckYourEmailDuxo checkYourEmailDuxo, User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        checkYourEmailDuxo.applyMutation(new CheckYourEmailDuxo2(null));
        checkYourEmailDuxo.submit(CheckYourEmailEvent.LinkSent.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendLink$lambda$1(CheckYourEmailDuxo checkYourEmailDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        checkYourEmailDuxo.applyMutation(new CheckYourEmailDuxo3(null));
        checkYourEmailDuxo.submit(new CheckYourEmailEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendLink$lambda$2(CheckYourEmailDuxo checkYourEmailDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        checkYourEmailDuxo.applyMutation(new CheckYourEmailDuxo4(null));
        checkYourEmailDuxo.submit(new CheckYourEmailEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }
}
