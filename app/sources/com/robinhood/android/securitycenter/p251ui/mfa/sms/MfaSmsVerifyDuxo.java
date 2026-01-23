package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.securitycenter.p251ui.mfa.sms.MfaSmsVerifyEvent;
import com.robinhood.android.securitycenter.p251ui.mfa.sms.MfaSmsVerifyFragment;
import com.robinhood.android.settings.util.MfaManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.Mfa;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MfaSmsVerifyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00016BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u000e\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020$H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010.\u001a\u00020$2\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8A@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyViewState;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "mfaManager", "Lcom/robinhood/android/settings/util/MfaManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/android/settings/util/MfaManager;Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/security/auth/AuthManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "Ljava/util/UUID;", "challengeId", "getChallengeId$feature_security_center_externalDebug", "()Ljava/util/UUID;", "setChallengeId$feature_security_center_externalDebug", "(Ljava/util/UUID;)V", "onCreate", "", "onStart", "sendCode", "resending", "", "onInputChange", "code", "", "sendCodeLoggedOut", "sendCodeLoggedIn", "sendCodeToPhoneNumber", "phoneNumber", "", "handleLoggedOutVerification", "handleLoggedInVerification", "handleThrowable", "t", "", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaSmsVerifyDuxo extends BaseDuxo3<MfaSmsVerifyDataState, MfaSmsVerifyViewState, MfaSmsVerifyEvent> implements HasSavedState {
    private static final String SAVED_CHALLENGE_ID = "challengeId";
    public static final int SMS_VERIFY_CODE_LENGTH = 6;
    private final AuthManager authManager;
    private final ChallengeManager challengeManager;
    private final MfaManager mfaManager;
    private final ProfileInfoStore profileInfoStore;
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
    public MfaSmsVerifyDuxo(ProfileInfoStore profileInfoStore, MfaManager mfaManager, ChallengeManager challengeManager, SuvWorkflowManager suvWorkflowManager, UserStore userStore, AuthManager authManager, SavedStateHandle savedStateHandle, MfaSmsVerifyStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new MfaSmsVerifyDataState(false, false, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.profileInfoStore = profileInfoStore;
        this.mfaManager = mfaManager;
        this.challengeManager = challengeManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.userStore = userStore;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
    }

    public final UUID getChallengeId$feature_security_center_externalDebug() {
        UUID uuid = (UUID) getSavedStateHandle().get("challengeId");
        return uuid == null ? ((MfaSmsVerifyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getChallengeId() : uuid;
    }

    public final void setChallengeId$feature_security_center_externalDebug(UUID uuid) {
        getSavedStateHandle().set("challengeId", uuid);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (!this.authManager.isLoggedIn()) {
            applyMutation(new C282851(null));
        } else {
            applyMutation(new C282862(null));
            sendCode(false);
        }
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$onCreate$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$onCreate$1 */
    static final class C282851 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282851(Continuation<? super C282851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282851 c282851 = MfaSmsVerifyDuxo.this.new C282851(continuation);
            c282851.L$0 = obj;
            return c282851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
            return ((C282851) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MfaSmsVerifyDataState mfaSmsVerifyDataState = (MfaSmsVerifyDataState) this.L$0;
            String phoneNumber = ((MfaSmsVerifyFragment.Args) MfaSmsVerifyDuxo.INSTANCE.getArgs((HasSavedState) MfaSmsVerifyDuxo.this)).getPhoneNumber();
            Intrinsics.checkNotNull(phoneNumber);
            return MfaSmsVerifyDataState.copy$default(mfaSmsVerifyDataState, false, false, phoneNumber, null, 8, null);
        }
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$onCreate$2", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$onCreate$2 */
    static final class C282862 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282862(Continuation<? super C282862> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282862 c282862 = new C282862(continuation);
            c282862.L$0 = obj;
            return c282862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
            return ((C282862) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, false, true, null, null, 13, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.onStart$lambda$0(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        mfaSmsVerifyDuxo.applyMutation(new MfaSmsVerifyDuxo2(user, null));
        return Unit.INSTANCE;
    }

    public final void sendCode(boolean resending) {
        if (!this.authManager.isLoggedIn()) {
            sendCodeLoggedOut();
        } else {
            sendCodeLoggedIn(resending);
        }
    }

    public final void onInputChange(CharSequence code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (code.length() < 6) {
            return;
        }
        if (!this.authManager.isLoggedIn()) {
            handleLoggedOutVerification(code);
        } else {
            handleLoggedInVerification(code);
        }
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedOut$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedOut$1 */
    static final class C282881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C282881(Continuation<? super C282881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaSmsVerifyDuxo.this.new C282881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaSmsVerifyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedOut$1$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedOut$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
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
            public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                return ((AnonymousClass1) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, true, false, null, null, 14, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
                    MfaSmsVerifyDuxo mfaSmsVerifyDuxo = MfaSmsVerifyDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    ChallengeManager challengeManager = mfaSmsVerifyDuxo.challengeManager;
                    UUID challengeId$feature_security_center_externalDebug = mfaSmsVerifyDuxo.getChallengeId$feature_security_center_externalDebug();
                    Intrinsics.checkNotNull(challengeId$feature_security_center_externalDebug);
                    this.label = 1;
                    obj = challengeManager.retryChallenge(challengeId$feature_security_center_externalDebug, this);
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
            MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass2(null));
            MfaSmsVerifyDuxo mfaSmsVerifyDuxo2 = MfaSmsVerifyDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                mfaSmsVerifyDuxo2.setChallengeId$feature_security_center_externalDebug(((Challenge) objM28550constructorimpl).getId());
                String phoneNumber = ((MfaSmsVerifyFragment.Args) MfaSmsVerifyDuxo.INSTANCE.getArgs((HasSavedState) mfaSmsVerifyDuxo2)).getPhoneNumber();
                Intrinsics.checkNotNull(phoneNumber);
                mfaSmsVerifyDuxo2.submit(new MfaSmsVerifyEvent.ResendEvent(phoneNumber));
            } else {
                mfaSmsVerifyDuxo2.submit(new MfaSmsVerifyEvent.ErrorEvent(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MfaSmsVerifyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedOut$1$2", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedOut$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                return ((AnonymousClass2) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, false, false, null, null, 14, null);
            }
        }
    }

    private final void sendCodeLoggedOut() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C282881(null), 3, null);
    }

    private final void sendCodeLoggedIn(final boolean resending) {
        if (!resending) {
            this.profileInfoStore.refreshProfileInfo(true);
        }
        Observable<UiProfileInfo> observableTake = this.profileInfoStore.streamProfileInfo().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo.sendCodeLoggedIn.1

            /* compiled from: MfaSmsVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedIn$1$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeLoggedIn$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
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
                public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                    return ((AnonymousClass1) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, true, false, null, null, 14, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.sendCodeLoggedIn$lambda$1(this.f$0, resending, (UiProfileInfo) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.sendCodeLoggedIn$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCodeLoggedIn$lambda$1(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, boolean z, UiProfileInfo uiProfileInfo) {
        mfaSmsVerifyDuxo.sendCodeToPhoneNumber(z, uiProfileInfo.getPhoneNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCodeLoggedIn$lambda$2(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        mfaSmsVerifyDuxo.handleThrowable(it);
        return Unit.INSTANCE;
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeToPhoneNumber$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$sendCodeToPhoneNumber$1 */
    static final class C282891 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $phoneNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282891(String str, Continuation<? super C282891> continuation) {
            super(1, continuation);
            this.$phoneNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return MfaSmsVerifyDuxo.this.new C282891(this.$phoneNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C282891) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MfaManager mfaManager = MfaSmsVerifyDuxo.this.mfaManager;
                String str = this.$phoneNumber;
                UUID challengeId$feature_security_center_externalDebug = MfaSmsVerifyDuxo.this.getChallengeId$feature_security_center_externalDebug();
                this.label = 1;
                if (mfaManager.enableSmsMfa(str, challengeId$feature_security_center_externalDebug, this) == coroutine_suspended) {
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

    private final void sendCodeToPhoneNumber(final boolean resending, final String phoneNumber) {
        this.suvWorkflowManager.handleRequest(new C282891(phoneNumber, null), new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.sendCodeToPhoneNumber$lambda$3(this.f$0, resending, phoneNumber, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.sendCodeToPhoneNumber$lambda$4(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MfaSmsVerifyDuxo.sendCodeToPhoneNumber$lambda$5(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCodeToPhoneNumber$lambda$3(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, boolean z, String str, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mfaSmsVerifyDuxo.applyMutation(new MfaSmsVerifyDuxo3(str, null));
        if (z) {
            mfaSmsVerifyDuxo.submit(new MfaSmsVerifyEvent.ResendEvent(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCodeToPhoneNumber$lambda$4(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        mfaSmsVerifyDuxo.handleThrowable(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendCodeToPhoneNumber$lambda$5(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        mfaSmsVerifyDuxo.submit(new MfaSmsVerifyEvent.VerificationWorkflowEvent(workflowId, z));
        return Unit.INSTANCE;
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Mfa$RecoverSmsMfaResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedOutVerification$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedOutVerification$1 */
    static final class C282811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Mfa.RecoverSmsMfaResponse>, Object> {
        final /* synthetic */ CharSequence $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282811(CharSequence charSequence, Continuation<? super C282811> continuation) {
            super(2, continuation);
            this.$code = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaSmsVerifyDuxo.this.new C282811(this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Mfa.RecoverSmsMfaResponse> continuation) {
            return ((C282811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MfaManager mfaManager = MfaSmsVerifyDuxo.this.mfaManager;
            UUID challengeId$feature_security_center_externalDebug = MfaSmsVerifyDuxo.this.getChallengeId$feature_security_center_externalDebug();
            Intrinsics.checkNotNull(challengeId$feature_security_center_externalDebug);
            String string2 = this.$code.toString();
            String enrollmentToken = ((MfaSmsVerifyFragment.Args) MfaSmsVerifyDuxo.INSTANCE.getArgs((HasSavedState) MfaSmsVerifyDuxo.this)).getEnrollmentToken();
            Intrinsics.checkNotNull(enrollmentToken);
            this.label = 1;
            Object objRecoverSmsMfa = mfaManager.recoverSmsMfa(challengeId$feature_security_center_externalDebug, string2, enrollmentToken, this);
            return objRecoverSmsMfa == coroutine_suspended ? coroutine_suspended : objRecoverSmsMfa;
        }
    }

    private final void handleLoggedOutVerification(CharSequence code) {
        Single singleDoFinally = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282811(code, null), 1, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo.handleLoggedOutVerification.2

            /* compiled from: MfaSmsVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedOutVerification$2$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedOutVerification$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
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
                public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                    return ((AnonymousClass1) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, true, false, null, null, 14, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo.handleLoggedOutVerification.3

            /* compiled from: MfaSmsVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedOutVerification$3$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedOutVerification$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
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
                public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                    return ((AnonymousClass1) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, false, false, null, null, 14, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.handleLoggedOutVerification$lambda$6(this.f$0, (Mfa.RecoverSmsMfaResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.handleLoggedOutVerification$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedOutVerification$lambda$6(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, Mfa.RecoverSmsMfaResponse recoverSmsMfaResponse) {
        mfaSmsVerifyDuxo.submit(MfaSmsVerifyEvent.SubmitSuccessEvent.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedOutVerification$lambda$7(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        mfaSmsVerifyDuxo.handleThrowable(t);
        return Unit.INSTANCE;
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Mfa;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedInVerification$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedInVerification$1 */
    static final class C282781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Mfa>, Object> {
        final /* synthetic */ CharSequence $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282781(CharSequence charSequence, Continuation<? super C282781> continuation) {
            super(2, continuation);
            this.$code = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaSmsVerifyDuxo.this.new C282781(this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Mfa> continuation) {
            return ((C282781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MfaManager mfaManager = MfaSmsVerifyDuxo.this.mfaManager;
            String string2 = this.$code.toString();
            UUID challengeId$feature_security_center_externalDebug = MfaSmsVerifyDuxo.this.getChallengeId$feature_security_center_externalDebug();
            this.label = 1;
            Object objVerifySmsMfa = mfaManager.verifySmsMfa(string2, challengeId$feature_security_center_externalDebug, this);
            return objVerifySmsMfa == coroutine_suspended ? coroutine_suspended : objVerifySmsMfa;
        }
    }

    private final void handleLoggedInVerification(CharSequence code) {
        Single singleDoFinally = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282781(code, null), 1, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo.handleLoggedInVerification.2

            /* compiled from: MfaSmsVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedInVerification$2$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedInVerification$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
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
                public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                    return ((AnonymousClass1) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, true, false, null, null, 14, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo.handleLoggedInVerification.3

            /* compiled from: MfaSmsVerifyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedInVerification$3$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleLoggedInVerification$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
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
                public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
                    return ((AnonymousClass1) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, false, false, null, null, 14, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                MfaSmsVerifyDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.handleLoggedInVerification$lambda$8(this.f$0, (Mfa) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyDuxo.handleLoggedInVerification$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedInVerification$lambda$8(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, Mfa mfa) {
        mfaSmsVerifyDuxo.submit(MfaSmsVerifyEvent.SubmitSuccessEvent.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleLoggedInVerification$lambda$9(MfaSmsVerifyDuxo mfaSmsVerifyDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        mfaSmsVerifyDuxo.handleThrowable(t);
        return Unit.INSTANCE;
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleThrowable$1", m3645f = "MfaSmsVerifyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyDuxo$handleThrowable$1 */
    static final class C282841 extends ContinuationImpl7 implements Function2<MfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282841(Continuation<? super C282841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282841 c282841 = new C282841(continuation);
            c282841.L$0 = obj;
            return c282841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MfaSmsVerifyDataState mfaSmsVerifyDataState, Continuation<? super MfaSmsVerifyDataState> continuation) {
            return ((C282841) create(mfaSmsVerifyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MfaSmsVerifyDataState.copy$default((MfaSmsVerifyDataState) this.L$0, false, false, null, null, 14, null);
        }
    }

    private final void handleThrowable(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            applyMutation(new C282841(null));
            submit(new MfaSmsVerifyEvent.ErrorEvent(t));
            return;
        }
        throw t;
    }

    /* compiled from: MfaSmsVerifyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Args;", "<init>", "()V", "SMS_VERIFY_CODE_LENGTH", "", "SAVED_CHALLENGE_ID", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MfaSmsVerifyDuxo, MfaSmsVerifyFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaSmsVerifyFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MfaSmsVerifyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MfaSmsVerifyFragment.Args getArgs(MfaSmsVerifyDuxo mfaSmsVerifyDuxo) {
            return (MfaSmsVerifyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, mfaSmsVerifyDuxo);
        }
    }
}
