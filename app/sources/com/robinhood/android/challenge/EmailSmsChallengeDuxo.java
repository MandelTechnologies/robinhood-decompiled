package com.robinhood.android.challenge;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.challenge.EmailSmsChallengeDuxo;
import com.robinhood.android.challenge.EmailSmsChallengeFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: EmailSmsChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002%&B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0006\u0010\u001c\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010!\u001a\u00020\u0017J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/challenge/EmailSmsChallengeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/shared/security/auth/AuthManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "challengeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/api/Challenge;", "kotlin.jvm.PlatformType", "setChallenge", "", ErrorResponse.CHALLENGE, "getChallenge", "onCreate", "onResume", "resendCode", "onInputChange", "code", "", "submitCode", "replaceChallenge", "onSubmissionResult", "submitResult", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;", "SubmitCodeResult", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EmailSmsChallengeDuxo extends OldBaseDuxo<EmailSmsChallengeViewState> implements HasSavedState {
    public static final int CHALLENGE_CODE_LENGTH = 6;
    private final AuthManager authManager;
    private final ChallengeManager challengeManager;
    private final BehaviorRelay<Challenge> challengeRelay;
    private final ProfileInfoStore profileInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailSmsChallengeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Status.values().length];
            try {
                iArr[Challenge.Status.ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Status.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Challenge.Status.VALIDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Challenge.Status.REDEEMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailSmsChallengeDuxo(ChallengeManager challengeManager, UserStore userStore, ProfileInfoStore profileInfoStore, AuthManager authManager, SavedStateHandle savedStateHandle) {
        super(new EmailSmsChallengeViewState(null, null, null, null, null, false, null, null, false, 511, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.challengeManager = challengeManager;
        this.userStore = userStore;
        this.profileInfoStore = profileInfoStore;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<Challenge> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.challengeRelay = behaviorRelayCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChallenge(Challenge challenge) {
        this.challengeRelay.accept(challenge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Challenge getChallenge() {
        return this.challengeRelay.getValue();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        setChallenge(((EmailSmsChallengeFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getChallenge());
        applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onCreate$lambda$0(this.f$0, (EmailSmsChallengeViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onCreate$lambda$0(EmailSmsChallengeDuxo emailSmsChallengeDuxo, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, ((EmailSmsChallengeFragment.Args) INSTANCE.getArgs((HasSavedState) emailSmsChallengeDuxo)).getUsername(), null, false, null, null, emailSmsChallengeDuxo.authManager.isLoggedIn(), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> observableSwitchMapSingle = this.challengeRelay.switchMapSingle(new Function() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Long> apply(Challenge challenge) {
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                Duration durationBetween = Duration.between(instantNow, challenge.getExpires_at());
                Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                return Single.timer(durationBetween.getSeconds(), TimeUnit.SECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onResume$lambda$2(this.f$0, (Long) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.challengeRelay, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onResume$lambda$4(this.f$0, (Challenge) obj);
            }
        });
        if (((EmailSmsChallengeFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getChallengeSource().getRequiresAuth()) {
            UserStore.refresh$default(this.userStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailSmsChallengeDuxo.onResume$lambda$6(this.f$0, (User) obj);
                }
            });
            ProfileInfoStore.refreshProfileInfo$default(this.profileInfoStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.profileInfoStore.streamProfileInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailSmsChallengeDuxo.onResume$lambda$8(this.f$0, (UiProfileInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(EmailSmsChallengeDuxo emailSmsChallengeDuxo, Long l) {
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onResume$lambda$2$lambda$1((EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onResume$lambda$2$lambda$1(EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, false, new UiEvent(EmailSmsChallengeResult.FAILED_TIMEOUT), null, false, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(EmailSmsChallengeDuxo emailSmsChallengeDuxo, final Challenge challenge) {
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onResume$lambda$4$lambda$3(challenge, (EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onResume$lambda$4$lambda$3(Challenge challenge, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, challenge, null, null, null, null, false, null, null, false, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(EmailSmsChallengeDuxo emailSmsChallengeDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onResume$lambda$6$lambda$5(user, (EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onResume$lambda$6$lambda$5(User user, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, user, null, null, false, null, null, false, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(EmailSmsChallengeDuxo emailSmsChallengeDuxo, final UiProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onResume$lambda$8$lambda$7(profileInfo, (EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onResume$lambda$8$lambda$7(UiProfileInfo uiProfileInfo, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, uiProfileInfo, false, null, null, false, 495, null);
    }

    /* compiled from: EmailSmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.EmailSmsChallengeDuxo$resendCode$1", m3645f = "EmailSmsChallengeDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.challenge.EmailSmsChallengeDuxo$resendCode$1 */
    static final class C104871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C104871(Continuation<? super C104871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailSmsChallengeDuxo.this.new C104871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C104871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EmailSmsChallengeDuxo emailSmsChallengeDuxo = EmailSmsChallengeDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    ChallengeManager challengeManager = emailSmsChallengeDuxo.challengeManager;
                    Challenge challenge = emailSmsChallengeDuxo.getChallenge();
                    Intrinsics.checkNotNull(challenge);
                    UUID id = challenge.getId();
                    this.label = 1;
                    obj = challengeManager.retryChallenge(id, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((Challenge) obj);
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            EmailSmsChallengeDuxo emailSmsChallengeDuxo2 = EmailSmsChallengeDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                emailSmsChallengeDuxo2.setChallenge((Challenge) objM28550constructorimpl);
            }
            EmailSmsChallengeDuxo emailSmsChallengeDuxo3 = EmailSmsChallengeDuxo.this;
            final Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                emailSmsChallengeDuxo3.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$resendCode$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EmailSmsChallengeDuxo.C104871.invokeSuspend$lambda$2$lambda$1(thM28553exceptionOrNullimpl, (EmailSmsChallengeViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmailSmsChallengeViewState invokeSuspend$lambda$2$lambda$1(Throwable th, EmailSmsChallengeViewState emailSmsChallengeViewState) {
            return EmailSmsChallengeViewState.copy$default(emailSmsChallengeViewState, null, null, null, null, null, false, null, new UiEvent(th), false, 383, null);
        }
    }

    public final void resendCode() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C104871(null), 3, null);
    }

    public final void onInputChange(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (code.length() >= 6) {
            submitCode(code);
        }
    }

    private final void submitCode(String code) {
        ChallengeManager challengeManager = this.challengeManager;
        Challenge challenge = getChallenge();
        Intrinsics.checkNotNull(challenge);
        Observable<R> map = challengeManager.submitChallenge(challenge.getId(), code).subscribeOn(Schedulers.m3346io()).toObservable().map(new Function() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo.submitCode.1
            @Override // io.reactivex.functions.Function
            public final SubmitCodeResult.Success apply(Challenge p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new SubmitCodeResult.Success(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableOnErrorReturn = ObservableDelay2.minTimeInFlight$default(map, 1000L, null, 2, null).startWith((Observable) SubmitCodeResult.Pending.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo.submitCode.2
            @Override // io.reactivex.functions.Function
            public final SubmitCodeResult apply(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
                if (httpStatusCode != null && httpStatusCode.intValue() == 400) {
                    ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
                    if (errorResponseExtractErrorResponse instanceof ChallengeErrorResponse) {
                        return new SubmitCodeResult.InvalidCode(throwable, ((ChallengeErrorResponse) errorResponseExtractErrorResponse).getChallenge());
                    }
                    return new SubmitCodeResult.UnknownError(throwable);
                }
                return new SubmitCodeResult.UnknownError(throwable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        ScopedObservable.subscribeKotlin$default(bind(observableOnErrorReturn, LifecycleEvent.ON_DESTROY), new C104903(this), new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.submitCode$lambda$10(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: EmailSmsChallengeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.challenge.EmailSmsChallengeDuxo$submitCode$3 */
    /* synthetic */ class C104903 extends FunctionReferenceImpl implements Function1<SubmitCodeResult, Unit> {
        C104903(Object obj) {
            super(1, obj, EmailSmsChallengeDuxo.class, "onSubmissionResult", "onSubmissionResult(Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SubmitCodeResult submitCodeResult) {
            invoke2(submitCodeResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SubmitCodeResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EmailSmsChallengeDuxo) this.receiver).onSubmissionResult(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitCode$lambda$10(EmailSmsChallengeDuxo emailSmsChallengeDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.submitCode$lambda$10$lambda$9(throwable, (EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState submitCode$lambda$10$lambda$9(Throwable th, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, false, null, new UiEvent(th), false, 351, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState replaceChallenge$lambda$11(EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, true, null, null, false, 479, null);
    }

    public final void replaceChallenge() {
        applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.replaceChallenge$lambda$11((EmailSmsChallengeViewState) obj);
            }
        });
        Challenge challenge = getChallenge();
        Intrinsics.checkNotNull(challenge);
        Single singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C104862(challenge, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        bind(singleSubscribeOn, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.replaceChallenge$lambda$13(this.f$0, (Challenge) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.replaceChallenge$lambda$15(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: EmailSmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Challenge;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.EmailSmsChallengeDuxo$replaceChallenge$2", m3645f = "EmailSmsChallengeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.challenge.EmailSmsChallengeDuxo$replaceChallenge$2 */
    static final class C104862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Challenge>, Object> {
        final /* synthetic */ Challenge $challenge;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C104862(Challenge challenge, Continuation<? super C104862> continuation) {
            super(2, continuation);
            this.$challenge = challenge;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailSmsChallengeDuxo.this.new C104862(this.$challenge, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Challenge> continuation) {
            return ((C104862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ChallengeManager challengeManager = EmailSmsChallengeDuxo.this.challengeManager;
            UUID id = this.$challenge.getId();
            Challenge.Type type2 = this.$challenge.getType();
            this.label = 1;
            Object objReplaceChallenge = challengeManager.replaceChallenge(id, type2, this);
            return objReplaceChallenge == coroutine_suspended ? coroutine_suspended : objReplaceChallenge;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceChallenge$lambda$13(EmailSmsChallengeDuxo emailSmsChallengeDuxo, final Challenge challenge) {
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.replaceChallenge$lambda$13$lambda$12(challenge, (EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState replaceChallenge$lambda$13$lambda$12(Challenge challenge, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, new UiEvent(challenge), null, null, null, false, null, null, false, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceChallenge$lambda$15(EmailSmsChallengeDuxo emailSmsChallengeDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        emailSmsChallengeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.replaceChallenge$lambda$15$lambda$14(throwable, (EmailSmsChallengeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState replaceChallenge$lambda$15$lambda$14(Throwable th, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, false, null, new UiEvent(th), false, 351, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubmissionResult(final SubmitCodeResult submitResult) {
        final EmailSmsChallengeResult emailSmsChallengeResult;
        if (submitResult instanceof SubmitCodeResult.Pending) {
            applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailSmsChallengeDuxo.onSubmissionResult$lambda$16((EmailSmsChallengeViewState) obj);
                }
            });
            return;
        }
        if (submitResult instanceof SubmitCodeResult.Success) {
            applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailSmsChallengeDuxo.onSubmissionResult$lambda$17((EmailSmsChallengeViewState) obj);
                }
            });
            return;
        }
        if (submitResult instanceof SubmitCodeResult.InvalidCode) {
            Challenge challenge = ((SubmitCodeResult.InvalidCode) submitResult).getChallenge();
            setChallenge(challenge);
            int i = WhenMappings.$EnumSwitchMapping$0[challenge.getStatus().ordinal()];
            if (i == 1) {
                emailSmsChallengeResult = EmailSmsChallengeResult.FAILED_WRONG_CODE;
            } else if (i == 2) {
                emailSmsChallengeResult = EmailSmsChallengeResult.FAILED_WRONG_CODE_ATTEMPTS_EXHAUSTED;
            } else {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(challenge.getStatus());
                    throw new ExceptionsH();
                }
                emailSmsChallengeResult = EmailSmsChallengeResult.FAILED_TIMEOUT;
            }
            applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmailSmsChallengeDuxo.onSubmissionResult$lambda$18(emailSmsChallengeResult, (EmailSmsChallengeViewState) obj);
                }
            });
            return;
        }
        if (!(submitResult instanceof SubmitCodeResult.UnknownError)) {
            throw new NoWhenBranchMatchedException();
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.challenge.EmailSmsChallengeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailSmsChallengeDuxo.onSubmissionResult$lambda$19(submitResult, (EmailSmsChallengeViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onSubmissionResult$lambda$16(EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, true, null, null, false, 479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onSubmissionResult$lambda$17(EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, false, new UiEvent(EmailSmsChallengeResult.SUCCESS), null, false, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onSubmissionResult$lambda$18(EmailSmsChallengeResult emailSmsChallengeResult, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, false, new UiEvent(emailSmsChallengeResult), null, false, 415, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailSmsChallengeViewState onSubmissionResult$lambda$19(SubmitCodeResult submitCodeResult, EmailSmsChallengeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EmailSmsChallengeViewState.copy$default(applyMutation, null, null, null, null, null, false, null, new UiEvent(((SubmitCodeResult.UnknownError) submitCodeResult).getThrowable()), false, 351, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmailSmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;", "", "<init>", "()V", "Pending", "Success", "InvalidCode", "UnknownError", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$InvalidCode;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$Pending;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$Success;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$UnknownError;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class SubmitCodeResult {
        public /* synthetic */ SubmitCodeResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EmailSmsChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$Pending;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Pending extends SubmitCodeResult {
            public static final int $stable = 0;
            public static final Pending INSTANCE = new Pending();

            public boolean equals(Object other) {
                return this == other || (other instanceof Pending);
            }

            public int hashCode() {
                return 806580330;
            }

            public String toString() {
                return "Pending";
            }

            private Pending() {
                super(null);
            }
        }

        private SubmitCodeResult() {
        }

        /* compiled from: EmailSmsChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$Success;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends SubmitCodeResult {
            public static final int $stable = 8;
            private final Challenge challenge;

            public static /* synthetic */ Success copy$default(Success success, Challenge challenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    challenge = success.challenge;
                }
                return success.copy(challenge);
            }

            /* renamed from: component1, reason: from getter */
            public final Challenge getChallenge() {
                return this.challenge;
            }

            public final Success copy(Challenge challenge) {
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                return new Success(challenge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.challenge, ((Success) other).challenge);
            }

            public int hashCode() {
                return this.challenge.hashCode();
            }

            public String toString() {
                return "Success(challenge=" + this.challenge + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(Challenge challenge) {
                super(null);
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                this.challenge = challenge;
            }

            public final Challenge getChallenge() {
                return this.challenge;
            }
        }

        /* compiled from: EmailSmsChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$InvalidCode;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;", "throwable", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Ljava/lang/Throwable;Lcom/robinhood/models/api/Challenge;)V", "getThrowable", "()Ljava/lang/Throwable;", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvalidCode extends SubmitCodeResult {
            public static final int $stable = 8;
            private final Challenge challenge;
            private final Throwable throwable;

            public static /* synthetic */ InvalidCode copy$default(InvalidCode invalidCode, Throwable th, Challenge challenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = invalidCode.throwable;
                }
                if ((i & 2) != 0) {
                    challenge = invalidCode.challenge;
                }
                return invalidCode.copy(th, challenge);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component2, reason: from getter */
            public final Challenge getChallenge() {
                return this.challenge;
            }

            public final InvalidCode copy(Throwable throwable, Challenge challenge) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                return new InvalidCode(throwable, challenge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidCode)) {
                    return false;
                }
                InvalidCode invalidCode = (InvalidCode) other;
                return Intrinsics.areEqual(this.throwable, invalidCode.throwable) && Intrinsics.areEqual(this.challenge, invalidCode.challenge);
            }

            public int hashCode() {
                return (this.throwable.hashCode() * 31) + this.challenge.hashCode();
            }

            public String toString() {
                return "InvalidCode(throwable=" + this.throwable + ", challenge=" + this.challenge + ")";
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Challenge getChallenge() {
                return this.challenge;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidCode(Throwable throwable, Challenge challenge) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                this.throwable = throwable;
                this.challenge = challenge;
            }
        }

        /* compiled from: EmailSmsChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult$UnknownError;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$SubmitCodeResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnknownError extends SubmitCodeResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = unknownError.throwable;
                }
                return unknownError.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final UnknownError copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new UnknownError(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnknownError) && Intrinsics.areEqual(this.throwable, ((UnknownError) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "UnknownError(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownError(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: EmailSmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo;", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Args;", "<init>", "()V", "CHALLENGE_CODE_LENGTH", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EmailSmsChallengeDuxo, EmailSmsChallengeFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailSmsChallengeFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EmailSmsChallengeFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailSmsChallengeFragment.Args getArgs(EmailSmsChallengeDuxo emailSmsChallengeDuxo) {
            return (EmailSmsChallengeFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, emailSmsChallengeDuxo);
        }
    }
}
