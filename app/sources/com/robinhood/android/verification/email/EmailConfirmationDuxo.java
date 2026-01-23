package com.robinhood.android.verification.email;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.verification.email.EmailConfirmationDuxo;
import com.robinhood.android.verification.email.EmailConfirmationViewState;
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

/* compiled from: EmailConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/verification/email/EmailConfirmationViewState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;)V", "sendLink", "", "email", "", "sendUserConsentedToDisclosureAndSendLink", "sendUserConsentedToDisclosureCompletable", "Lio/reactivex/Completable;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EmailConfirmationDuxo extends OldBaseDuxo<EmailConfirmationViewState> {
    public static final int $stable = 8;
    private final Identi identi;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailConfirmationDuxo(UserStore userStore, Identi identi2, SuvWorkflowManager suvWorkflowManager) {
        super(EmailConfirmationViewState.Initial.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        this.userStore = userStore;
        this.identi = identi2;
        this.suvWorkflowManager = suvWorkflowManager;
    }

    /* compiled from: EmailConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailConfirmationDuxo$sendLink$1", m3645f = "EmailConfirmationDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.email.EmailConfirmationDuxo$sendLink$1 */
    static final class C313961 extends ContinuationImpl7 implements Function1<Continuation<? super User>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313961(String str, Continuation<? super C313961> continuation) {
            super(1, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return EmailConfirmationDuxo.this.new C313961(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super User> continuation) {
            return ((C313961) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            EmailConfirmationDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$sendLink$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EmailConfirmationDuxo.C313961.invokeSuspend$lambda$0((EmailConfirmationViewState) obj2);
                }
            });
            UserStore userStore = EmailConfirmationDuxo.this.userStore;
            String str = this.$email;
            this.label = 1;
            Object objUpdateEmailAddress = userStore.updateEmailAddress(str, this);
            return objUpdateEmailAddress == coroutine_suspended ? coroutine_suspended : objUpdateEmailAddress;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailConfirmationViewState invokeSuspend$lambda$0(EmailConfirmationViewState emailConfirmationViewState) {
            return EmailConfirmationViewState.Loading.INSTANCE;
        }
    }

    public final void sendLink(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.suvWorkflowManager.handleRequest(new C313961(email, null), new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailConfirmationDuxo.sendLink$lambda$1(this.f$0, email, (User) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailConfirmationDuxo.sendLink$lambda$3(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EmailConfirmationDuxo.sendLink$lambda$5(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLink$lambda$1(EmailConfirmationDuxo emailConfirmationDuxo, final String str, User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
        emailConfirmationDuxo.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailConfirmationDuxo.sendLink$lambda$1$lambda$0(str, (EmailConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailConfirmationViewState sendLink$lambda$1$lambda$0(String str, EmailConfirmationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new EmailConfirmationViewState.LinkSentOrError(new UiEvent(new Either.Left(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLink$lambda$3(EmailConfirmationDuxo emailConfirmationDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
        emailConfirmationDuxo.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailConfirmationDuxo.sendLink$lambda$3$lambda$2(throwable, (EmailConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailConfirmationViewState sendLink$lambda$3$lambda$2(Throwable th, EmailConfirmationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new EmailConfirmationViewState.LinkSentOrError(new UiEvent(new Either.Right(th)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLink$lambda$5(EmailConfirmationDuxo emailConfirmationDuxo, final UUID workflowId, final boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        emailConfirmationDuxo.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailConfirmationDuxo.sendLink$lambda$5$lambda$4(workflowId, z, (EmailConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailConfirmationViewState sendLink$lambda$5$lambda$4(UUID uuid, boolean z, EmailConfirmationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new EmailConfirmationViewState.VerificationWorkflow(new UiEvent(Tuples4.m3642to(uuid, Boolean.valueOf(z))));
    }

    /* compiled from: EmailConfirmationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailConfirmationDuxo$sendUserConsentedToDisclosureAndSendLink$1 */
    static final class C313971<T> implements Consumer {
        C313971() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailConfirmationViewState accept$lambda$0(EmailConfirmationViewState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return EmailConfirmationViewState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            EmailConfirmationDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$sendUserConsentedToDisclosureAndSendLink$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailConfirmationDuxo.C313971.accept$lambda$0((EmailConfirmationViewState) obj);
                }
            });
        }
    }

    public final void sendUserConsentedToDisclosureAndSendLink(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        Completable completableDoOnSubscribe = sendUserConsentedToDisclosureCompletable().doOnSubscribe(new C313971());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, RxUtils.addVerificationIdlingResource(completableDoOnSubscribe), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.verification.email.EmailConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailConfirmationDuxo.sendUserConsentedToDisclosureAndSendLink$lambda$6(this.f$0, email);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendUserConsentedToDisclosureAndSendLink$lambda$6(EmailConfirmationDuxo emailConfirmationDuxo, String str) {
        emailConfirmationDuxo.sendLink(str);
        return Unit.INSTANCE;
    }

    /* compiled from: EmailConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.email.EmailConfirmationDuxo$sendUserConsentedToDisclosureCompletable$1", m3645f = "EmailConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.email.EmailConfirmationDuxo$sendUserConsentedToDisclosureCompletable$1 */
    static final class C313981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313981(Continuation<? super C313981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailConfirmationDuxo.this.new C313981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = EmailConfirmationDuxo.this.identi;
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
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C313981(null), 1, null);
    }
}
