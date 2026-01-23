package com.robinhood.android.verification.email;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.verification.email.EmailLinkSentDuxo;
import com.robinhood.android.verification.email.EmailLinkSentFragment;
import com.robinhood.android.verification.email.EmailLinkSentViewState;
import com.robinhood.android.verification.email.EmailLinkSentViewState2;
import com.robinhood.models.api.sheriff.ApiUserVerifyEmailInfo;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EmailLinkSentDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "resendLink", "email", "", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EmailLinkSentDuxo extends OldBaseDuxo<EmailLinkSentViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailLinkSentDuxo(UserStore userStore, SuvWorkflowManager suvWorkflowManager, SavedStateHandle savedStateHandle) {
        super(EmailLinkSentViewState.Initial.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.suvWorkflowManager = suvWorkflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C314051(null), 3, null);
    }

    /* compiled from: EmailLinkSentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1", m3645f = "EmailLinkSentDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1 */
    static final class C314051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314051(Continuation<? super C314051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailLinkSentDuxo.this.new C314051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTakeWhile = FlowKt.takeWhile(FlowKt.m28818catch(EmailLinkSentDuxo.this.userStore.pollUserEmailVerifyInfo(), new AnonymousClass1(null)), new AnonymousClass2(EmailLinkSentDuxo.this, null));
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo.onStart.1.3
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
            EmailLinkSentDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EmailLinkSentDuxo.C314051.invokeSuspend$lambda$0((EmailLinkSentViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* compiled from: EmailLinkSentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1$1", m3645f = "EmailLinkSentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1$1, reason: invalid class name */
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

        /* compiled from: EmailLinkSentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1$2", m3645f = "EmailLinkSentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.verification.email.EmailLinkSentDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ApiUserVerifyEmailInfo, Continuation<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EmailLinkSentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EmailLinkSentDuxo emailLinkSentDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = emailLinkSentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
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
                return boxing.boxBoolean(!Intrinsics.areEqual(((ApiUserVerifyEmailInfo) this.L$0).getVerified_email(), ((EmailLinkSentFragment.Args) EmailLinkSentDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInitialToBeVerifiedEmail()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailLinkSentViewState invokeSuspend$lambda$0(EmailLinkSentViewState emailLinkSentViewState) {
            return new EmailLinkSentViewState.Event(new UiEvent(EmailLinkSentViewState2.EmailVerified.INSTANCE));
        }
    }

    /* compiled from: EmailLinkSentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailLinkSentDuxo$resendLink$1", m3645f = "EmailLinkSentDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentDuxo$resendLink$1 */
    static final class C314061 extends ContinuationImpl7 implements Function1<Continuation<? super User>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C314061(String str, Continuation<? super C314061> continuation) {
            super(1, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return EmailLinkSentDuxo.this.new C314061(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super User> continuation) {
            return ((C314061) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            IdlingResourceCounters2.increment(IdlingResourceType.VERIFICATION);
            EmailLinkSentDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$resendLink$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EmailLinkSentDuxo.C314061.invokeSuspend$lambda$0((EmailLinkSentViewState) obj2);
                }
            });
            UserStore userStore = EmailLinkSentDuxo.this.userStore;
            String str = this.$email;
            this.label = 1;
            Object objUpdateEmailAddress = userStore.updateEmailAddress(str, this);
            return objUpdateEmailAddress == coroutine_suspended ? coroutine_suspended : objUpdateEmailAddress;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailLinkSentViewState invokeSuspend$lambda$0(EmailLinkSentViewState emailLinkSentViewState) {
            return EmailLinkSentViewState.Loading.INSTANCE;
        }
    }

    public final void resendLink(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.suvWorkflowManager.handleRequest(new C314061(email, null), new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailLinkSentDuxo.resendLink$lambda$1(this.f$0, email, (User) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailLinkSentDuxo.resendLink$lambda$3(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EmailLinkSentDuxo.resendLink$lambda$5(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendLink$lambda$1(EmailLinkSentDuxo emailLinkSentDuxo, final String str, User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
        emailLinkSentDuxo.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailLinkSentDuxo.resendLink$lambda$1$lambda$0(str, (EmailLinkSentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailLinkSentViewState resendLink$lambda$1$lambda$0(String str, EmailLinkSentViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new EmailLinkSentViewState.Event(new UiEvent(new EmailLinkSentViewState2.LinkSent(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendLink$lambda$3(EmailLinkSentDuxo emailLinkSentDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
        emailLinkSentDuxo.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailLinkSentDuxo.resendLink$lambda$3$lambda$2(throwable, (EmailLinkSentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailLinkSentViewState resendLink$lambda$3$lambda$2(Throwable th, EmailLinkSentViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new EmailLinkSentViewState.Event(new UiEvent(new EmailLinkSentViewState2.Error(th)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendLink$lambda$5(EmailLinkSentDuxo emailLinkSentDuxo, final UUID workflowId, final boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        emailLinkSentDuxo.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailLinkSentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailLinkSentDuxo.resendLink$lambda$5$lambda$4(workflowId, z, (EmailLinkSentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailLinkSentViewState resendLink$lambda$5$lambda$4(UUID uuid, boolean z, EmailLinkSentViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new EmailLinkSentViewState.Event(new UiEvent(new EmailLinkSentViewState2.VerificationWorkflow(uuid, z)));
    }

    /* compiled from: EmailLinkSentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/verification/email/EmailLinkSentDuxo;", "Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Args;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EmailLinkSentDuxo, EmailLinkSentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailLinkSentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EmailLinkSentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailLinkSentFragment.Args getArgs(EmailLinkSentDuxo emailLinkSentDuxo) {
            return (EmailLinkSentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, emailLinkSentDuxo);
        }
    }
}
