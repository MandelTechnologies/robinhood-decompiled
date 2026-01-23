package com.robinhood.android.challenge.verification.backup;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.verification.ChallengeVerificationDataState;
import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogType;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.BackupCodeVerificationInput;
import com.robinhood.shared.store.user.UserStore;
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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: BackupCodeVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001,BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationViewState;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "onResume", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "", "code", "submitChallenge", "(Ljava/util/UUID;Ljava/lang/String;)V", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "Lcom/robinhood/shared/security/auth/AuthManager;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "j$/time/Instant", "kotlin.jvm.PlatformType", "expiryTimeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BackupCodeVerificationDuxo extends BaseDuxo3<ChallengeVerificationDataState, BackupCodeVerificationViewState, ChallengeVerificationEvent> implements HasSavedState {
    private final AuthManager authManager;
    private final ChallengeManager challengeManager;
    private final BehaviorRelay<Instant> expiryTimeRelay;
    private final ProfileInfoStore profileInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupCodeVerificationDuxo(ChallengeManager challengeManager, UserStore userStore, ProfileInfoStore profileInfoStore, AuthManager authManager, BackupCodeVerificationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ChallengeVerificationDataState(null, null, null, null, false, Challenge.Flow.BACKUP_CODE.getId(), null, false, false, false, 991, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.challengeManager = challengeManager;
        this.userStore = userStore;
        this.profileInfoStore = profileInfoStore;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<Instant> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.expiryTimeRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        ChallengeManager challengeManager = this.challengeManager;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, ChallengeManager.createBackupCodeChallenge$default(challengeManager, ((BackupCodeVerificationInput) companion.getArgs((HasSavedState) this)).getFlowId(), ((BackupCodeVerificationInput) companion.getArgs((HasSavedState) this)).getEmail(), null, 4, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupCodeVerificationDuxo.onCreate$lambda$0(this.f$0, (ChallengeManager.CreateChallengeResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupCodeVerificationDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
        Observable observableSwitchMapSingle = this.expiryTimeRelay.distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final Long apply(Instant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                Duration durationBetween = Duration.between(instantNow, it);
                Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                return Long.valueOf(durationBetween.getSeconds());
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo.onCreate.4
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Long> apply(Long timeout) {
                Intrinsics.checkNotNullParameter(timeout, "timeout");
                return Single.timer(timeout.longValue(), TimeUnit.SECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupCodeVerificationDuxo.onCreate$lambda$3(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BackupCodeVerificationDuxo backupCodeVerificationDuxo, ChallengeManager.CreateChallengeResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BehaviorRelay<Instant> behaviorRelay = backupCodeVerificationDuxo.expiryTimeRelay;
        Challenge challenge = result.getChallenge();
        Intrinsics.checkNotNull(challenge);
        behaviorRelay.accept(challenge.getExpires_at());
        backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo2(result, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BackupCodeVerificationDuxo backupCodeVerificationDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            backupCodeVerificationDuxo.submit(new ChallengeVerificationEvent.Error(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final BackupCodeVerificationDuxo backupCodeVerificationDuxo, Long l) {
        backupCodeVerificationDuxo.withDataState(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupCodeVerificationDuxo.onCreate$lambda$3$lambda$2(this.f$0, (ChallengeVerificationDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3$lambda$2(BackupCodeVerificationDuxo backupCodeVerificationDuxo, ChallengeVerificationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        backupCodeVerificationDuxo.submit(new ChallengeVerificationEvent.Dialog(dataState.getChallengeDialogInfo(ChallengeDialogType.TIME_EXPIRED)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        if (this.authManager.isLoggedIn()) {
            UserStore.refresh$default(this.userStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BackupCodeVerificationDuxo.onResume$lambda$4(this.f$0, (User) obj);
                }
            });
            ProfileInfoStore.refreshProfileInfo$default(this.profileInfoStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.profileInfoStore.streamProfileInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BackupCodeVerificationDuxo.onResume$lambda$5(this.f$0, (UiProfileInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(BackupCodeVerificationDuxo backupCodeVerificationDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo3(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(BackupCodeVerificationDuxo backupCodeVerificationDuxo, UiProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo4(profileInfo, null));
        return Unit.INSTANCE;
    }

    public final void submitChallenge(UUID challengeId, String code) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(code, "code");
        if (code.length() > 0) {
            Single<Challenge> singleDoOnSubscribe = this.challengeManager.submitChallenge(challengeId, code).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo.submitChallenge.1

                /* compiled from: BackupCodeVerificationDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$submitChallenge$1$1", m3645f = "BackupCodeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$submitChallenge$1$1, reason: invalid class name */
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
                    BackupCodeVerificationDuxo.this.applyMutation(new AnonymousClass1(null));
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BackupCodeVerificationDuxo.submitChallenge$lambda$6(this.f$0, (Challenge) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BackupCodeVerificationDuxo.submitChallenge$lambda$7(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitChallenge$lambda$6(BackupCodeVerificationDuxo backupCodeVerificationDuxo, Challenge challenge) {
        backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo5(backupCodeVerificationDuxo, challenge, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitChallenge$lambda$7(BackupCodeVerificationDuxo backupCodeVerificationDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        Integer httpStatusCode = Throwables.getHttpStatusCode(t);
        if (httpStatusCode != null && httpStatusCode.intValue() == 400) {
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
            if (errorResponseExtractErrorResponse instanceof ChallengeErrorResponse) {
                backupCodeVerificationDuxo.expiryTimeRelay.accept(((ChallengeErrorResponse) errorResponseExtractErrorResponse).getChallenge().getExpires_at());
                backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo6(backupCodeVerificationDuxo, errorResponseExtractErrorResponse, null));
            } else {
                backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo7(backupCodeVerificationDuxo, t, null));
            }
        } else if (Throwables.isNetworkRelated(t)) {
            backupCodeVerificationDuxo.applyMutation(new BackupCodeVerificationDuxo8(backupCodeVerificationDuxo, t, null));
        } else {
            throw t;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BackupCodeVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationDuxo;", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "<init>", "()V", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BackupCodeVerificationDuxo, BackupCodeVerificationInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BackupCodeVerificationInput getArgs(SavedStateHandle savedStateHandle) {
            return (BackupCodeVerificationInput) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BackupCodeVerificationInput getArgs(BackupCodeVerificationDuxo backupCodeVerificationDuxo) {
            return (BackupCodeVerificationInput) DuxoCompanion.DefaultImpls.getArgs(this, backupCodeVerificationDuxo);
        }
    }
}
