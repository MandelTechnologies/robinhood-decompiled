package com.robinhood.android.verification.email;

import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.verification.email.EmailUpdateDuxo;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmailUpdateDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailUpdateDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/verification/email/EmailUpdateViewState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;)V", "setEmailText", "", "email", "", "submitEmailWithChallengeId", "sendUserConsentedToDisclosureAndSubmitUserEmail", "sendUserConsentedToDisclosureCompletable", "Lio/reactivex/Completable;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EmailUpdateDuxo extends OldBaseDuxo<EmailUpdateViewState> {
    public static final int $stable = 8;
    private final Identi identi;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailUpdateDuxo(UserStore userStore, Identi identi2, SuvWorkflowManager suvWorkflowManager) {
        super(new EmailUpdateViewState(false, false, null, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        this.userStore = userStore;
        this.identi = identi2;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    public final void setEmailText(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.setEmailText$lambda$0(email, (EmailUpdateViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailUpdateViewState setEmailText$lambda$0(String str, EmailUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return Intrinsics.areEqual(applyMutation.getEmailInput(), str) ? applyMutation : EmailUpdateViewState.copy$default(applyMutation, false, false, null, null, str, 14, null);
    }

    /* compiled from: EmailUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailUpdateDuxo$submitEmailWithChallengeId$1", m3645f = "EmailUpdateDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.email.EmailUpdateDuxo$submitEmailWithChallengeId$1 */
    static final class C314151 extends ContinuationImpl7 implements Function1<Continuation<? super User>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C314151(String str, Continuation<? super C314151> continuation) {
            super(1, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return EmailUpdateDuxo.this.new C314151(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super User> continuation) {
            return ((C314151) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            EmailUpdateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$submitEmailWithChallengeId$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EmailUpdateDuxo.C314151.invokeSuspend$lambda$0((EmailUpdateViewState) obj2);
                }
            });
            UserStore userStore = EmailUpdateDuxo.this.userStore;
            String str = this.$email;
            this.label = 1;
            Object objUpdateEmailAddress = userStore.updateEmailAddress(str, this);
            return objUpdateEmailAddress == coroutine_suspended ? coroutine_suspended : objUpdateEmailAddress;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailUpdateViewState invokeSuspend$lambda$0(EmailUpdateViewState emailUpdateViewState) {
            return EmailUpdateViewState.copy$default(emailUpdateViewState, false, true, null, null, null, 29, null);
        }
    }

    public final void submitEmailWithChallengeId(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.suvWorkflowManager.handleRequest(new C314151(email, null), new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.submitEmailWithChallengeId$lambda$2(this.f$0, email, (User) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.submitEmailWithChallengeId$lambda$4(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EmailUpdateDuxo.submitEmailWithChallengeId$lambda$6(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitEmailWithChallengeId$lambda$2(EmailUpdateDuxo emailUpdateDuxo, final String str, User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
        emailUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.submitEmailWithChallengeId$lambda$2$lambda$1(str, (EmailUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailUpdateViewState submitEmailWithChallengeId$lambda$2$lambda$1(String str, EmailUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailUpdateViewState.copy$default(applyMutation, false, false, new UiEvent(new Either.Left(str)), null, null, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitEmailWithChallengeId$lambda$4(EmailUpdateDuxo emailUpdateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
        emailUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.submitEmailWithChallengeId$lambda$4$lambda$3(throwable, (EmailUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailUpdateViewState submitEmailWithChallengeId$lambda$4$lambda$3(Throwable th, EmailUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailUpdateViewState.copy$default(applyMutation, false, false, new UiEvent(new Either.Right(th)), null, null, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitEmailWithChallengeId$lambda$6(EmailUpdateDuxo emailUpdateDuxo, final UUID workflowId, final boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        emailUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.submitEmailWithChallengeId$lambda$6$lambda$5(workflowId, z, (EmailUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailUpdateViewState submitEmailWithChallengeId$lambda$6$lambda$5(UUID uuid, boolean z, EmailUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailUpdateViewState.copy$default(applyMutation, false, false, null, new UiEvent(Tuples4.m3642to(uuid, Boolean.valueOf(z))), null, 21, null);
    }

    /* compiled from: EmailUpdateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailUpdateDuxo$sendUserConsentedToDisclosureAndSubmitUserEmail$1 */
    static final class C314121<T> implements Consumer {
        C314121() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailUpdateViewState accept$lambda$0(EmailUpdateViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return EmailUpdateViewState.copy$default(applyMutation, false, true, null, null, null, 29, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            EmailUpdateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$sendUserConsentedToDisclosureAndSubmitUserEmail$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailUpdateDuxo.C314121.accept$lambda$0((EmailUpdateViewState) obj);
                }
            });
        }
    }

    public final void sendUserConsentedToDisclosureAndSubmitUserEmail(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        Completable completableDoOnSubscribe = sendUserConsentedToDisclosureCompletable().doOnSubscribe(new C314121());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, RxUtils.addVerificationIdlingResource(completableDoOnSubscribe), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailUpdateDuxo.sendUserConsentedToDisclosureAndSubmitUserEmail$lambda$7(this.f$0, email);
            }
        }, new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.sendUserConsentedToDisclosureAndSubmitUserEmail$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendUserConsentedToDisclosureAndSubmitUserEmail$lambda$7(EmailUpdateDuxo emailUpdateDuxo, String str) {
        emailUpdateDuxo.submitEmailWithChallengeId(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendUserConsentedToDisclosureAndSubmitUserEmail$lambda$9(EmailUpdateDuxo emailUpdateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        emailUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateDuxo.m2572x1faa5d0f(throwable, (EmailUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendUserConsentedToDisclosureAndSubmitUserEmail$lambda$9$lambda$8 */
    public static final EmailUpdateViewState m2572x1faa5d0f(Throwable th, EmailUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailUpdateViewState.copy$default(applyMutation, false, false, new UiEvent(new Either.Right(th)), null, null, 25, null);
    }

    /* compiled from: EmailUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailUpdateDuxo$sendUserConsentedToDisclosureCompletable$1", m3645f = "EmailUpdateDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.email.EmailUpdateDuxo$sendUserConsentedToDisclosureCompletable$1 */
    static final class C314131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314131(Continuation<? super C314131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailUpdateDuxo.this.new C314131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = EmailUpdateDuxo.this.identi;
                ApiUserAgreement.Request emailVerification = ApiUserAgreement.Request.INSTANCE.getEmailVerification();
                this.label = 1;
                if (identi2.agreeToUserAgreement(emailVerification, this) == coroutine_suspended) {
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

    private final Completable sendUserConsentedToDisclosureCompletable() {
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C314131(null), 1, null).doOnComplete(new C314142());
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    /* compiled from: EmailUpdateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailUpdateDuxo$sendUserConsentedToDisclosureCompletable$2 */
    static final class C314142 implements Action {
        C314142() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailUpdateViewState run$lambda$0(EmailUpdateViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return EmailUpdateViewState.copy$default(applyMutation, true, false, null, null, null, 30, null);
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            EmailUpdateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateDuxo$sendUserConsentedToDisclosureCompletable$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailUpdateDuxo.C314142.run$lambda$0((EmailUpdateViewState) obj);
                }
            });
        }
    }
}
