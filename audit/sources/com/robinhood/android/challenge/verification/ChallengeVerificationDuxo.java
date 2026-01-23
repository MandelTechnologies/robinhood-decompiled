package com.robinhood.android.challenge.verification;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogType;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.rosetta.converters.security.Challenges;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ChallengeVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 N2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001NB[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J%\u00103\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00109\u001a\u00020\u001e2\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u00020\u001e¢\u0006\u0004\b:\u0010&J\u0015\u0010;\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010FR\"\u0010J\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010H0H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010L\u001a\n I*\u0004\u0018\u00010H0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationViewState;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/challenge/verification/ChallengeVerificationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;)V", "Lcom/robinhood/models/api/Challenge;", ErrorResponse.CHALLENGE, "", "challengeLoaded", "(Lcom/robinhood/models/api/Challenge;)V", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "sendSheriffRetryRequest", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "()V", "onResume", "resendCode", "(Ljava/util/UUID;)V", "", "code", "submitChallenge", "(Ljava/util/UUID;Ljava/lang/String;)V", "", "isLoggedIn", "logOutForUar", "Lcom/robinhood/shared/app/type/AppType;", "appType", "onContactSupportClicked", "(ZZLcom/robinhood/shared/app/type/AppType;)V", "Lcom/robinhood/models/api/ChallengeErrorResponse;", "errorResponse", "onChallengeErrorResponse$feature_challenge_externalDebug", "(Lcom/robinhood/models/api/ChallengeErrorResponse;)V", "onChallengeErrorResponse", "returnChallengeId", "onInputChange", "(Ljava/lang/String;)V", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "Lcom/robinhood/analytics/SharedEventLogger;", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lj$/time/Clock;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "j$/time/Instant", "kotlin.jvm.PlatformType", "expiryTimeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "nextSmsTime", "Lj$/time/Instant;", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChallengeVerificationDuxo extends BaseDuxo3<ChallengeVerificationDataState, ChallengeVerificationViewState, ChallengeVerificationEvent> implements HasSavedState {
    public static final int CHALLENGE_CODE_LENGTH = 6;
    public static final long SMS_RESEND_DELAY_SECONDS = 60;
    private final AuthManager authManager;
    private final ChallengeManager challengeManager;
    private final Clock clock;
    private final SharedEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final BehaviorRelay<Instant> expiryTimeRelay;
    private Instant nextSmsTime;
    private final ProfileInfoStore profileInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChallengeVerificationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "sendSheriffRetryRequest")
    /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$sendSheriffRetryRequest$1 */
    static final class C105031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C105031(Continuation<? super C105031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChallengeVerificationDuxo.this.sendSheriffRetryRequest(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChallengeVerificationDuxo(ChallengeManager challengeManager, UserStore userStore, ProfileInfoStore profileInfoStore, SharedEventLogger eventLogger, AuthManager authManager, ExperimentsStore experimentsStore, ChallengeVerificationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, @ElapsedRealtime Clock clock) {
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Companion companion = INSTANCE;
        super(new ChallengeVerificationDataState(null, null, null, ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).getEmail(), false, ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).getFlowId(), ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).getFallbackCtaText(), ((ChallengeVerificationInput) companion.getArgs(savedStateHandle)).isEmbeddedInPathfinder(), false, false, 791, null), stateProvider, duxoBundle);
        this.challengeManager = challengeManager;
        this.userStore = userStore;
        this.profileInfoStore = profileInfoStore;
        this.eventLogger = eventLogger;
        this.authManager = authManager;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        BehaviorRelay<Instant> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.expiryTimeRelay = behaviorRelayCreate;
        this.nextSmsTime = Instant.EPOCH;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Single<ChallengeManager.CreateChallengeResult> singleRecreateChallenge;
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsStore.getState$default(this.experimentsStore, SuvLoginUarKillswitchExperiments2.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsStore.getState$default(this.experimentsStore, SuvLoginUarKillswitchExperiments.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Companion companion = INSTANCE;
        if (((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge() != null) {
            Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
            if ((challenge != null ? challenge.getType() : null) != Challenge.Type.PROMPTS) {
                Challenge challenge2 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
                Intrinsics.checkNotNull(challenge2);
                challengeLoaded(challenge2);
                return;
            }
        }
        if (((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).isEmbeddedInPathfinder() && !this.authManager.isLoggedIn()) {
            singleRecreateChallenge = RxFactory.DefaultImpls.rxSingle$default(this, null, new ChallengeVerificationDuxo$onCreate$resultSingle$1(this, new Challenge.LoggedOutCreateChallengeRequest(((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getUserUuid()), null), 1, null);
        } else {
            ChallengeManager challengeManager = this.challengeManager;
            String flowId = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId();
            Challenge challenge3 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
            UUID verificationWorkflowId = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getVerificationWorkflowId();
            String email = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getEmail();
            Challenge challenge4 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
            singleRecreateChallenge = challengeManager.recreateChallenge(flowId, challenge3, verificationWorkflowId, email, Boolean.valueOf((challenge4 != null ? challenge4.getType() : null) == Challenge.Type.PROMPTS));
        }
        LifecycleHost.DefaultImpls.bind$default(this, singleRecreateChallenge, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.onCreate$lambda$2(this.f$0, (ChallengeManager.CreateChallengeResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ChallengeVerificationDuxo challengeVerificationDuxo, boolean z) {
        challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$onCreate$1$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(ChallengeVerificationDuxo challengeVerificationDuxo, boolean z) {
        challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$onCreate$2$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(ChallengeVerificationDuxo challengeVerificationDuxo, ChallengeManager.CreateChallengeResult it) {
        ChallengeReplacementInfo.ChallengeType protobuf;
        ChallengeReplacementInfo.ChallengeType protobuf2;
        Boolean silent;
        Challenge.Type type2;
        UUID id;
        String string2;
        Challenge.Type type3;
        UUID id2;
        String string3;
        Intrinsics.checkNotNullParameter(it, "it");
        Companion companion = INSTANCE;
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getChallenge();
        if ((challenge != null ? challenge.getType() : null) == Challenge.Type.PROMPTS) {
            SharedEventLogger sharedEventLogger = challengeVerificationDuxo.eventLogger;
            Challenge challenge2 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getChallenge();
            String str = (challenge2 == null || (id2 = challenge2.getId()) == null || (string3 = id2.toString()) == null) ? "" : string3;
            Challenge challenge3 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getChallenge();
            if (challenge3 == null || (type3 = challenge3.getType()) == null || (protobuf = Challenges.toProtobuf(type3)) == null) {
                protobuf = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
            }
            ChallengeReplacementInfo.ChallengeType challengeType = protobuf;
            Challenge challenge4 = it.getChallenge();
            String str2 = (challenge4 == null || (id = challenge4.getId()) == null || (string2 = id.toString()) == null) ? "" : string2;
            Challenge challenge5 = it.getChallenge();
            if (challenge5 == null || (type2 = challenge5.getType()) == null || (protobuf2 = Challenges.toProtobuf(type2)) == null) {
                protobuf2 = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
            }
            ChallengeReplacementInfo.ChallengeType challengeType2 = protobuf2;
            Challenge challenge6 = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getChallenge();
            SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, new ChallengeReplacementInfo(str, challengeType, str2, challengeType2, (challenge6 == null || (silent = challenge6.getSilent()) == null) ? false : silent.booleanValue(), ((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getFlowId(), null, 64, null), null, null, null, null, 30, null);
        }
        Challenge challenge7 = it.getChallenge();
        Intrinsics.checkNotNull(challenge7);
        challengeVerificationDuxo.challengeLoaded(challenge7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(ChallengeVerificationDuxo challengeVerificationDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        challengeVerificationDuxo.submit(new ChallengeVerificationEvent.Error(it));
        return Unit.INSTANCE;
    }

    /* compiled from: ChallengeVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$challengeLoaded$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$challengeLoaded$1 */
    static final class C104981 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
        final /* synthetic */ Challenge $challenge;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C104981(Challenge challenge, Continuation<? super C104981> continuation) {
            super(2, continuation);
            this.$challenge = challenge;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104981 c104981 = new C104981(this.$challenge, continuation);
            c104981.L$0 = obj;
            return c104981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
            return ((C104981) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ChallengeVerificationDataState.copy$default((ChallengeVerificationDataState) this.L$0, this.$challenge, null, null, null, false, null, null, false, false, false, 1022, null);
        }
    }

    private final void challengeLoaded(Challenge challenge) {
        this.expiryTimeRelay.accept(challenge.getExpires_at());
        applyMutation(new C104981(challenge, null));
        Observable observableSwitchMapSingle = this.expiryTimeRelay.distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo.challengeLoaded.2
            @Override // io.reactivex.functions.Function
            public final Long apply(Instant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                Duration durationBetween = Duration.between(instantNow, it);
                Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                return Long.valueOf(durationBetween.getSeconds());
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo.challengeLoaded.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Long> apply(Long timeout) {
                Intrinsics.checkNotNullParameter(timeout, "timeout");
                return Single.timer(timeout.longValue(), TimeUnit.SECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.challengeLoaded$lambda$5(this.f$0, (Long) obj);
            }
        });
        if (challenge.getType() == Challenge.Type.SMS) {
            this.nextSmsTime = this.clock.instant().plusSeconds(60L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit challengeLoaded$lambda$5(final ChallengeVerificationDuxo challengeVerificationDuxo, Long l) {
        challengeVerificationDuxo.withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.challengeLoaded$lambda$5$lambda$4(this.f$0, (ChallengeVerificationDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit challengeLoaded$lambda$5$lambda$4(ChallengeVerificationDuxo challengeVerificationDuxo, ChallengeVerificationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        challengeVerificationDuxo.submit(new ChallengeVerificationEvent.Dialog(dataState.getChallengeDialogInfo(ChallengeDialogType.TIME_EXPIRED)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        if (this.authManager.isLoggedIn()) {
            UserStore.refresh$default(this.userStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChallengeVerificationDuxo.onResume$lambda$6(this.f$0, (User) obj);
                }
            });
            ProfileInfoStore.refreshProfileInfo$default(this.profileInfoStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.profileInfoStore.streamProfileInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChallengeVerificationDuxo.onResume$lambda$7(this.f$0, (UiProfileInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(ChallengeVerificationDuxo challengeVerificationDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$onResume$1$1(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(ChallengeVerificationDuxo challengeVerificationDuxo, UiProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$onResume$2$1(profileInfo, null));
        return Unit.INSTANCE;
    }

    public final void resendCode(UUID challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Companion companion = INSTANCE;
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getChallenge();
        if ((challenge != null ? challenge.getType() : null) == Challenge.Type.SMS && this.clock.instant().isBefore(this.nextSmsTime)) {
            withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChallengeVerificationDuxo.resendCode$lambda$8(this.f$0, (ChallengeVerificationDataState) obj);
                }
            });
        } else if (!Intrinsics.areEqual(((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), Challenge.Flow.LOGIN.getId()) || !((ChallengeVerificationInput) companion.getArgs((HasSavedState) this)).isEmbeddedInPathfinder()) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105022(challengeId, null), 3, null);
        } else {
            submit(ChallengeVerificationEvent.Resend.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendCode$lambda$8(ChallengeVerificationDuxo challengeVerificationDuxo, ChallengeVerificationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        challengeVerificationDuxo.submit(new ChallengeVerificationEvent.Dialog(dataState.getChallengeDialogInfo(ChallengeDialogType.RESEND_CODE_ERROR)));
        return Unit.INSTANCE;
    }

    /* compiled from: ChallengeVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$resendCode$2", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$resendCode$2 */
    static final class C105022 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $challengeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105022(UUID uuid, Continuation<? super C105022> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeVerificationDuxo.this.new C105022(this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChallengeVerificationDuxo challengeVerificationDuxo = ChallengeVerificationDuxo.this;
                UUID uuid = this.$challengeId;
                this.label = 1;
                if (challengeVerificationDuxo.sendSheriffRetryRequest(uuid, this) == coroutine_suspended) {
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
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSheriffRetryRequest(UUID uuid, Continuation<? super Unit> continuation) throws Throwable {
        C105031 c105031;
        Object objM28550constructorimpl;
        if (continuation instanceof C105031) {
            c105031 = (C105031) continuation;
            int i = c105031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105031.label = i - Integer.MIN_VALUE;
            } else {
                c105031 = new C105031(continuation);
            }
        }
        Object objRetryChallenge = c105031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105031.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRetryChallenge);
                Result.Companion companion = Result.INSTANCE;
                ChallengeManager challengeManager = this.challengeManager;
                c105031.label = 1;
                objRetryChallenge = challengeManager.retryChallenge(uuid, c105031);
                if (objRetryChallenge == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRetryChallenge);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((Challenge) objRetryChallenge);
        } catch (Throwable th) {
            Throwables.rethrowIfNotNetworkRelated(th);
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            Challenge challenge = (Challenge) objM28550constructorimpl;
            this.expiryTimeRelay.accept(challenge.getExpires_at());
            if (challenge.getType() == Challenge.Type.SMS && challenge.getRemaining_retries() > 0) {
                this.nextSmsTime = this.clock.instant().plusSeconds(60L);
            }
            applyMutation(new ChallengeVerificationDuxo$sendSheriffRetryRequest$3$1(this, challenge, null));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            submit(new ChallengeVerificationEvent.Error(thM28553exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }

    public final void submitChallenge(UUID challengeId, String code) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(code, "code");
        if (code.length() > 0) {
            Single<Challenge> singleDoOnSubscribe = this.challengeManager.submitChallenge(challengeId, code).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo.submitChallenge.1

                /* compiled from: ChallengeVerificationDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$submitChallenge$1$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$submitChallenge$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
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
                    public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
                        return ((AnonymousClass1) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ChallengeVerificationDataState.copy$default((ChallengeVerificationDataState) this.L$0, null, null, null, null, true, null, null, false, false, false, ErrorCodes.IO_EXCEPTION, null);
                    }
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    ChallengeVerificationDuxo.this.applyMutation(new AnonymousClass1(null));
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChallengeVerificationDuxo.submitChallenge$lambda$12(this.f$0, (Challenge) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChallengeVerificationDuxo.submitChallenge$lambda$13(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitChallenge$lambda$12(ChallengeVerificationDuxo challengeVerificationDuxo, Challenge challenge) {
        challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$submitChallenge$2$1(challengeVerificationDuxo, challenge, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitChallenge$lambda$13(ChallengeVerificationDuxo challengeVerificationDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        Integer httpStatusCode = Throwables.getHttpStatusCode(t);
        if (httpStatusCode != null && httpStatusCode.intValue() == 400) {
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
            if (errorResponseExtractErrorResponse instanceof ChallengeErrorResponse) {
                challengeVerificationDuxo.onChallengeErrorResponse$feature_challenge_externalDebug((ChallengeErrorResponse) errorResponseExtractErrorResponse);
            } else {
                challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$submitChallenge$3$1(challengeVerificationDuxo, t, null));
            }
        } else if (Throwables.isNetworkRelated(t)) {
            challengeVerificationDuxo.applyMutation(new ChallengeVerificationDuxo$submitChallenge$3$2(challengeVerificationDuxo, t, null));
        } else {
            throw t;
        }
        return Unit.INSTANCE;
    }

    public final void onContactSupportClicked(final boolean isLoggedIn, final boolean logOutForUar, final AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.onContactSupportClicked$lambda$15(appType, this, logOutForUar, isLoggedIn, (ChallengeVerificationDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onContactSupportClicked$lambda$15(AppType appType, final ChallengeVerificationDuxo challengeVerificationDuxo, boolean z, boolean z2, ChallengeVerificationDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AppType appType2 = AppType.RHC;
        if (appType != appType2) {
            Companion companion = INSTANCE;
            if (((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).isEmbeddedInPathfinder() && Intrinsics.areEqual(((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getFlowId(), Challenge.Flow.LOGIN.getId())) {
                Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((HasSavedState) challengeVerificationDuxo)).getChallenge();
                challengeVerificationDuxo.submit(new ChallengeVerificationEvent.Fallback(challenge != null ? challenge.getId() : null));
            } else if (appType != appType2) {
                Challenge challenge2 = it.getChallenge();
                if ((challenge2 != null ? challenge2.getType() : null) == Challenge.Type.SMS) {
                    challengeVerificationDuxo.submit(ChallengeVerificationEvent.UpdatePhone.INSTANCE);
                }
            } else if (appType != appType2 && ((ChallengeVerificationInput) INSTANCE.getArgs((HasSavedState) challengeVerificationDuxo)).isEmbeddedInPathfinder()) {
                challengeVerificationDuxo.submit(new ChallengeVerificationEvent.ChallengeVerified(null));
            } else if (appType != appType2 && z) {
                challengeVerificationDuxo.withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChallengeVerificationDuxo.onContactSupportClicked$lambda$15$lambda$14(this.f$0, (ChallengeVerificationDataState) obj);
                    }
                });
            } else {
                challengeVerificationDuxo.submit(new ChallengeVerificationEvent.ContactSupport(z2));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContactSupportClicked$lambda$15$lambda$14(ChallengeVerificationDuxo challengeVerificationDuxo, ChallengeVerificationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        challengeVerificationDuxo.submit(new ChallengeVerificationEvent.Dialog(dataState.getChallengeDialogInfo(ChallengeDialogType.START_UAR)));
        return Unit.INSTANCE;
    }

    public final void onChallengeErrorResponse$feature_challenge_externalDebug(ChallengeErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        if (errorResponse.getChallenge().getStatus() == Challenge.Status.FAILED && ((ChallengeVerificationInput) INSTANCE.getArgs((HasSavedState) this)).isEmbeddedInPathfinder()) {
            returnChallengeId();
        } else {
            applyMutation(new ChallengeVerificationDuxo$onChallengeErrorResponse$1(this, errorResponse, null));
        }
    }

    public final void returnChallengeId() {
        withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeVerificationDuxo.returnChallengeId$lambda$16(this.f$0, (ChallengeVerificationDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnChallengeId$lambda$16(ChallengeVerificationDuxo challengeVerificationDuxo, ChallengeVerificationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Challenge challenge = dataState.getChallenge();
        Intrinsics.checkNotNull(challenge);
        challengeVerificationDuxo.submit(new ChallengeVerificationEvent.ChallengeVerified(challenge.getId()));
        return Unit.INSTANCE;
    }

    /* compiled from: ChallengeVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$onInputChange$1", m3645f = "ChallengeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationDuxo$onInputChange$1 */
    static final class C105011 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
        final /* synthetic */ String $code;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105011(String str, Continuation<? super C105011> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105011 c105011 = ChallengeVerificationDuxo.this.new C105011(this.$code, continuation);
            c105011.L$0 = obj;
            return c105011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
            return ((C105011) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChallengeVerificationDataState challengeVerificationDataState = (ChallengeVerificationDataState) this.L$0;
            ChallengeVerificationDuxo challengeVerificationDuxo = ChallengeVerificationDuxo.this;
            Challenge challenge = challengeVerificationDataState.getChallenge();
            Intrinsics.checkNotNull(challenge);
            challengeVerificationDuxo.submit(new ChallengeVerificationEvent.Submit(challenge.getId(), this.$code));
            return ChallengeVerificationDataState.copy$default(challengeVerificationDataState, null, null, null, null, true, null, null, false, false, false, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void onInputChange(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (code.length() >= 6) {
            applyMutation(new C105011(code, null));
        }
    }

    /* compiled from: ChallengeVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput;", "<init>", "()V", "CHALLENGE_CODE_LENGTH", "", "SMS_RESEND_DELAY_SECONDS", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ChallengeVerificationDuxo, ChallengeVerificationInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChallengeVerificationInput getArgs(SavedStateHandle savedStateHandle) {
            return (ChallengeVerificationInput) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChallengeVerificationInput getArgs(ChallengeVerificationDuxo challengeVerificationDuxo) {
            return (ChallengeVerificationInput) DuxoCompanion.DefaultImpls.getArgs(this, challengeVerificationDuxo);
        }
    }
}
