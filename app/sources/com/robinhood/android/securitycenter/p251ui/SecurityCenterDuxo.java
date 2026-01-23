package com.robinhood.android.securitycenter.p251ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.authlock.PasskeyAndroidExperiment;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.securitycenter.SecurityCenterConstants;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterDuxo7;
import com.robinhood.android.securitycenter.p251ui.mfa.MfaSettingsKillSwitchExperiment;
import com.robinhood.android.settings.util.MfaManager;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.Mfa;
import com.robinhood.models.api.WebauthnChallenge;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.extensions.Throwables;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: SecurityCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001Ba\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010#\u001a\u00020\u001eJ\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterViewState;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent;", "mfaManager", "Lcom/robinhood/android/settings/util/MfaManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "markwon", "Lio/noties/markwon/Markwon;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/settings/util/MfaManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;Lio/noties/markwon/Markwon;Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;Lcom/robinhood/android/authlock/pin/PinManager;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/android/securitycenter/ui/SecurityCenterStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "checkForExistingPasskeys", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "getPasskeyChallenge", "launchPasskeyInAppVerification", "validatePasskeyChallenge", "registrationAuthJson", "", "showPasskeyExistsDialog", "show", "", "showPasskeyEnrollmentErrorDialog", "showPasskeySuccessBottomSheet", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SecurityCenterDuxo extends BaseDuxo3<SecurityCenterDataState, SecurityCenterViewState, SecurityCenterDuxo7> {
    public static final int $stable = 8;
    private final AuthManager authManager;
    private final BiometricAuthManager biometricAuthManager;
    private final ChallengeManager challengeManager;
    private final ExperimentsStore experimentsStore;
    private final Markwon markwon;
    private final MatchaTreatmentStore matchaTreatmentStore;
    private final MfaManager mfaManager;
    private final PinManager pinManager;
    private final StaticContentStore staticContentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityCenterDuxo(MfaManager mfaManager, ExperimentsStore experimentsStore, StaticContentStore staticContentStore, MatchaTreatmentStore matchaTreatmentStore, Markwon markwon, BiometricAuthManager biometricAuthManager, PinManager pinManager, AuthManager authManager, ChallengeManager challengeManager, SecurityCenterStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new SecurityCenterDataState(false, biometricAuthManager.isBiometricsAuthEnabled(), pinManager.isPinEnabled(), null, false, false, false, null, false, false, false, 2041, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mfaManager = mfaManager;
        this.experimentsStore = experimentsStore;
        this.staticContentStore = staticContentStore;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.markwon = markwon;
        this.biometricAuthManager = biometricAuthManager;
        this.pinManager = pinManager;
        this.authManager = authManager;
        this.challengeManager = challengeManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.mfaManager.refresh();
        LifecycleHost.DefaultImpls.bind$default(this, this.mfaManager.getMfaObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.onResume$lambda$0(this.f$0, (Mfa) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaTreatmentStore.streamCanInitiate(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.onResume$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsStore.getState$default(this.experimentsStore, PasskeyAndroidExperiment.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.onResume$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MfaSettingsKillSwitchExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.onResume$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        applyMutation(new C282025(null));
        Single singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282036(null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleSubscribeOn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.onResume$lambda$4(this.f$0, (String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.onResume$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(SecurityCenterDuxo securityCenterDuxo, Mfa mfa) {
        Intrinsics.checkNotNullParameter(mfa, "mfa");
        securityCenterDuxo.applyMutation(new SecurityCenterDuxo2(mfa, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(SecurityCenterDuxo securityCenterDuxo, boolean z) {
        securityCenterDuxo.applyMutation(new SecurityCenterDuxo3(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(SecurityCenterDuxo securityCenterDuxo, boolean z) {
        securityCenterDuxo.applyMutation(new SecurityCenterDuxo4(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(SecurityCenterDuxo securityCenterDuxo, boolean z) {
        securityCenterDuxo.applyMutation(new SecurityCenterDuxo5(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$5", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$5 */
    static final class C282025 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282025(Continuation<? super C282025> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282025 c282025 = SecurityCenterDuxo.this.new C282025(continuation);
            c282025.L$0 = obj;
            return c282025;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C282025) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, SecurityCenterDuxo.this.biometricAuthManager.isBiometricsAuthEnabled(), SecurityCenterDuxo.this.pinManager.isPinEnabled(), null, false, false, false, null, false, false, false, 2041, null);
        }
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$6", m3645f = "SecurityCenterDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$6 */
    static final class C282036 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C282036(Continuation<? super C282036> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecurityCenterDuxo.this.new C282036(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C282036) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = SecurityCenterDuxo.this.staticContentStore;
                this.label = 1;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, SecurityCenterConstants.SECURITY_SUBTITLE_CONTENTFUL_ID, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((OtherMarkdown) ((EntryResource) obj).getValue()).getMarkdown2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(SecurityCenterDuxo securityCenterDuxo, String str) {
        securityCenterDuxo.applyMutation(new SecurityCenterDuxo6(securityCenterDuxo, str, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(SecurityCenterDuxo securityCenterDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Timber.INSTANCE.mo3355e(t, "Failed to load Contentful parcel", new Object[0]);
        securityCenterDuxo.submit(new SecurityCenterDuxo7.ErrorEvent(t));
        return Unit.INSTANCE;
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$1 */
    static final class C281981 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C281981(Continuation<? super C281981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281981 c281981 = new C281981(continuation);
            c281981.L$0 = obj;
            return c281981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C281981) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, true, false, false, null, false, false, false, null, false, false, false, 2046, null);
        }
    }

    public final void checkForExistingPasskeys(UUID challengeId) {
        applyMutation(new C281981(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C281992(challengeId, null), 3, null);
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$2", m3645f = "SecurityCenterDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$2 */
    static final class C281992 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $challengeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C281992(UUID uuid, Continuation<? super C281992> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecurityCenterDuxo.this.new C281992(this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C281992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthManager authManager = SecurityCenterDuxo.this.authManager;
                    this.label = 1;
                    obj = authManager.getWebauthnCredentials(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SecurityCenterDuxo.this.applyMutation(new AnonymousClass1(null));
                if (((PaginatedResult) obj).getCount() > 0) {
                    SecurityCenterDuxo.this.showPasskeyExistsDialog(true);
                } else {
                    SecurityCenterDuxo.this.getPasskeyChallenge(this.$challengeId);
                }
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    SecurityCenterDuxo.this.applyMutation(new AnonymousClass2(null));
                    SecurityCenterDuxo.this.submit(new SecurityCenterDuxo7.ErrorEvent(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$2$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
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
            public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
                return ((AnonymousClass1) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, false, 2046, null);
            }
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$2$2", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$checkForExistingPasskeys$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
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
            public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
                return ((AnonymousClass2) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, false, 2046, null);
            }
        }
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$1 */
    static final class C282001 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282001(Continuation<? super C282001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282001 c282001 = new C282001(continuation);
            c282001.L$0 = obj;
            return c282001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C282001) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, true, false, false, null, false, false, false, null, false, false, false, 2046, null);
        }
    }

    public final void getPasskeyChallenge(UUID challengeId) {
        applyMutation(new C282001(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C282012(challengeId, null), 3, null);
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$2", m3645f = "SecurityCenterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$2 */
    static final class C282012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $challengeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282012(UUID uuid, Continuation<? super C282012> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecurityCenterDuxo.this.new C282012(this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthManager authManager = SecurityCenterDuxo.this.authManager;
                    UUID uuid = this.$challengeId;
                    this.label = 1;
                    obj = authManager.registerWebauthnChallenge(uuid, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SecurityCenterDuxo.this.applyMutation(new AnonymousClass1(null));
                SecurityCenterDuxo.this.submit(new SecurityCenterDuxo7.PasskeyChallengeReceived(((WebauthnChallenge) obj).getChallenge()));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    SecurityCenterDuxo.this.applyMutation(new AnonymousClass2(null));
                    SecurityCenterDuxo.this.submit(new SecurityCenterDuxo7.ErrorEvent(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$2$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
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
            public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
                return ((AnonymousClass1) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, false, 2046, null);
            }
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$2$2", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$getPasskeyChallenge$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
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
            public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
                return ((AnonymousClass2) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, false, 2046, null);
            }
        }
    }

    public final void launchPasskeyInAppVerification() {
        LifecycleHost.DefaultImpls.bind$default(this, ChallengeManager.createChallenge$default(this.challengeManager, Challenge.Flow.UPDATE_WEBAUTHN, (String) null, (Boolean) null, (UUID) null, 14, (Object) null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.launchPasskeyInAppVerification$lambda$7(this.f$0, (ChallengeManager.CreateChallengeResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SecurityCenterDuxo.launchPasskeyInAppVerification$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchPasskeyInAppVerification$lambda$7(SecurityCenterDuxo securityCenterDuxo, ChallengeManager.CreateChallengeResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Challenge challenge = it.getChallenge();
        if (challenge != null) {
            securityCenterDuxo.submit(new SecurityCenterDuxo7.PasskeyChallenge.Verification(challenge));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchPasskeyInAppVerification$lambda$8(SecurityCenterDuxo securityCenterDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        securityCenterDuxo.submit(new SecurityCenterDuxo7.PasskeyChallenge.Error(it));
        return Unit.INSTANCE;
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$1 */
    static final class C282071 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282071(Continuation<? super C282071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282071 c282071 = new C282071(continuation);
            c282071.L$0 = obj;
            return c282071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C282071) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, true, false, false, null, false, false, false, null, false, false, false, 2046, null);
        }
    }

    public final void validatePasskeyChallenge(UUID challengeId, String registrationAuthJson) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(registrationAuthJson, "registrationAuthJson");
        applyMutation(new C282071(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C282082(challengeId, registrationAuthJson, null), 3, null);
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$2", m3645f = "SecurityCenterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$2 */
    static final class C282082 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $challengeId;
        final /* synthetic */ String $registrationAuthJson;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282082(UUID uuid, String str, Continuation<? super C282082> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
            this.$registrationAuthJson = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecurityCenterDuxo.this.new C282082(this.$challengeId, this.$registrationAuthJson, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthManager authManager = SecurityCenterDuxo.this.authManager;
                    UUID uuid = this.$challengeId;
                    String str = this.$registrationAuthJson;
                    this.label = 1;
                    if (authManager.validatePasskeyRegistrationChallenge(uuid, str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SecurityCenterDuxo.this.applyMutation(new AnonymousClass1(null));
                SecurityCenterDuxo.this.showPasskeySuccessBottomSheet(true);
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    SecurityCenterDuxo.this.applyMutation(new AnonymousClass2(null));
                    SecurityCenterDuxo.this.submit(new SecurityCenterDuxo7.ErrorEvent(th));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$2$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
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
            public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
                return ((AnonymousClass1) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, false, 2046, null);
            }
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$2$2", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$validatePasskeyChallenge$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
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
            public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
                return ((AnonymousClass2) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, false, 2046, null);
            }
        }
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$showPasskeyExistsDialog$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$showPasskeyExistsDialog$1 */
    static final class C282051 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        final /* synthetic */ boolean $show;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282051(boolean z, Continuation<? super C282051> continuation) {
            super(2, continuation);
            this.$show = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282051 c282051 = new C282051(this.$show, continuation);
            c282051.L$0 = obj;
            return c282051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C282051) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, this.$show, false, false, 1791, null);
        }
    }

    public final void showPasskeyExistsDialog(boolean show) {
        applyMutation(new C282051(show, null));
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$showPasskeyEnrollmentErrorDialog$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$showPasskeyEnrollmentErrorDialog$1 */
    static final class C282041 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        final /* synthetic */ boolean $show;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282041(boolean z, Continuation<? super C282041> continuation) {
            super(2, continuation);
            this.$show = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282041 c282041 = new C282041(this.$show, continuation);
            c282041.L$0 = obj;
            return c282041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C282041) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, this.$show, false, 1535, null);
        }
    }

    public final void showPasskeyEnrollmentErrorDialog(boolean show) {
        applyMutation(new C282041(show, null));
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$showPasskeySuccessBottomSheet$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$showPasskeySuccessBottomSheet$1 */
    static final class C282061 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
        final /* synthetic */ boolean $show;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282061(boolean z, Continuation<? super C282061> continuation) {
            super(2, continuation);
            this.$show = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282061 c282061 = new C282061(this.$show, continuation);
            c282061.L$0 = obj;
            return c282061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
            return ((C282061) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, false, false, false, null, false, false, this.$show, 1023, null);
        }
    }

    public final void showPasskeySuccessBottomSheet(boolean show) {
        applyMutation(new C282061(show, null));
    }
}
