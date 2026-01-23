package com.robinhood.shared.login.lib.p385ui;

import android.graphics.drawable.Drawable;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.authlock.PasskeyAndroidExperiment;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.designsystem.style.p099di.BrandLogo;
import com.robinhood.android.gdpr.manager.CryptoEuPrivacyScreenLaterExperiment;
import com.robinhood.android.gdpr.manager.GdprManager;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.WebauthnChallenge;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.login.lib.p385ui.BaseLoginEvent;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.extensions.Throwables;
import com.singular.sdk.internal.Constants;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: BaseLoginDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 [2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001[Ba\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010<\u001a\u00020=H\u0016J\u000e\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020 J7\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)2\b\u0010C\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u00010 2\u0006\u0010?\u001a\u00020 ¢\u0006\u0002\u0010EJ;\u0010F\u001a\u00020=2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)2\u001c\u0010G\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I\u0012\u0006\u0012\u0004\u0018\u00010K0HH\u0002¢\u0006\u0002\u0010LJ5\u0010M\u001a\u00020=2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)2\n\b\u0002\u0010C\u001a\u0004\u0018\u0001052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010NJ \u0010O\u001a\u00020=2\u0006\u0010P\u001a\u00020J2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)H\u0002J\u0016\u0010Q\u001a\u00020=2\u0006\u0010R\u001a\u00020)2\u0006\u0010B\u001a\u00020)J\u0006\u0010S\u001a\u00020=J\u0012\u0010T\u001a\u00020=2\n\u0010U\u001a\u00060Vj\u0002`WJ\u0016\u0010X\u001a\u00020=2\u0006\u0010C\u001a\u0002052\u0006\u0010Y\u001a\u00020)J\u0010\u0010Z\u001a\u00020=2\u0006\u0010C\u001a\u000205H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R.\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010)8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00101\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010)8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R*\u00106\u001a\u0002052\u0006\u0010\u001f\u001a\u0002058@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b7\u0010,\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginViewState;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "logo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/login/lib/ui/BaseLoginStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/scarlet/util/resource/DirectResourceReference;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/gdpr/manager/GdprManager;Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/login/lib/ui/BaseLoginStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "", BaseLoginDuxo.HAS_CREATED_PASSKEY_CHALLENGE, "getHasCreatedPasskeyChallenge", "()Z", "setHasCreatedPasskeyChallenge", "(Z)V", BaseLoginDuxo.SUV_KILLSWITCH_ENABLED, "getSuvKillswitchEnabled", "setSuvKillswitchEnabled", "", "savedCredentialId", "getSavedCredentialId$feature_lib_login_externalRelease$annotations", "()V", "getSavedCredentialId$feature_lib_login_externalRelease", "()Ljava/lang/String;", "setSavedCredentialId$feature_lib_login_externalRelease", "(Ljava/lang/String;)V", "savedCredentialPassword", "getSavedCredentialPassword$feature_lib_login_externalRelease$annotations", "getSavedCredentialPassword$feature_lib_login_externalRelease", "setSavedCredentialPassword$feature_lib_login_externalRelease", "Ljava/util/UUID;", "requestId", "getRequestId$feature_lib_login_externalRelease$annotations", "getRequestId$feature_lib_login_externalRelease", "()Ljava/util/UUID;", "setRequestId$feature_lib_login_externalRelease", "(Ljava/util/UUID;)V", "onCreate", "", "onForgotEmail", "generateRequestId", "onDoLogin", "email", "password", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "skipPrompt", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Z)V", "sendLoginRequestWithSuvHandler", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/login/LoginStatus;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "sendLoginRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;)V", "onLoginSuccess", "loginStatus", "onCredentialsLoaded", "id", "createPasskeyChallenge", "handlePasskeyException", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/lang/Exception;", "Lkotlin/Exception;", "validatePasskeyChallenge", "authResponseJson", "handlePasskeysLogin", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class BaseLoginDuxo extends BaseDuxo3<BaseLoginDataState, BaseLoginViewState, BaseLoginEvent> implements HasSavedState {
    private static final String CREDENTIAL_ID = "credentialId";
    private static final String CREDENTIAL_PASSWORD = "credentialPassword";
    public static final String HAS_CREATED_PASSKEY_CHALLENGE = "hasCreatedPasskeyChallenge";
    public static final String REQUEST_ID = "requestId";
    public static final String SUV_KILLSWITCH_ENABLED = "suvKillswitchEnabled";
    private final AppType appType;
    private final AuthManager authManager;
    private final ExperimentsStore experimentsStore;
    private final GdprManager gdprManager;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getRequestId$feature_lib_login_externalRelease$annotations() {
    }

    /* renamed from: getSavedCredentialId$feature_lib_login_externalRelease$annotations */
    public static /* synthetic */ void m2824x6ac34f02() {
    }

    /* renamed from: getSavedCredentialPassword$feature_lib_login_externalRelease$annotations */
    public static /* synthetic */ void m2825x297d9e82() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLoginDuxo(AppType appType, @BrandLogo DirectResourceReference<Drawable> logo, ExperimentsStore experimentsStore, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, GdprManager gdprManager, TargetBackend targetBackend, DuxoBundle duxoBundle, BaseLoginStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        super(new BaseLoginDataState(false, targetBackend.isApollo(), appType, logo, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.appType = appType;
        this.experimentsStore = experimentsStore;
        this.authManager = authManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.gdprManager = gdprManager;
        this.savedStateHandle = savedStateHandle;
    }

    private final boolean getHasCreatedPasskeyChallenge() {
        Boolean bool = (Boolean) getSavedStateHandle().get(HAS_CREATED_PASSKEY_CHALLENGE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setHasCreatedPasskeyChallenge(boolean z) {
        getSavedStateHandle().set(HAS_CREATED_PASSKEY_CHALLENGE, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSuvKillswitchEnabled() {
        Boolean bool = (Boolean) getSavedStateHandle().get(SUV_KILLSWITCH_ENABLED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setSuvKillswitchEnabled(boolean z) {
        getSavedStateHandle().set(SUV_KILLSWITCH_ENABLED, Boolean.valueOf(z));
    }

    public final String getSavedCredentialId$feature_lib_login_externalRelease() {
        return (String) getSavedStateHandle().get(CREDENTIAL_ID);
    }

    public final void setSavedCredentialId$feature_lib_login_externalRelease(String str) {
        getSavedStateHandle().set(CREDENTIAL_ID, str);
    }

    public final String getSavedCredentialPassword$feature_lib_login_externalRelease() {
        return (String) getSavedStateHandle().get(CREDENTIAL_PASSWORD);
    }

    public final void setSavedCredentialPassword$feature_lib_login_externalRelease(String str) {
        getSavedStateHandle().set(CREDENTIAL_PASSWORD, str);
    }

    public final UUID getRequestId$feature_lib_login_externalRelease() {
        UUID uuid = (UUID) getSavedStateHandle().get("requestId");
        if (uuid != null) {
            return uuid;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }

    public final void setRequestId$feature_lib_login_externalRelease(UUID value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getSavedStateHandle().set("requestId", value);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsStore.getState$default(this.experimentsStore, PasskeyAndroidExperiment.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsStore.getState$default(this.experimentsStore, SuvLoginExperiments.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C391043(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BaseLoginDuxo baseLoginDuxo, boolean z) {
        if (z) {
            baseLoginDuxo.createPasskeyChallenge();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BaseLoginDuxo baseLoginDuxo, boolean z) {
        baseLoginDuxo.setSuvKillswitchEnabled(z);
        return Unit.INSTANCE;
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onCreate$3", m3645f = "BaseLoginDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onCreate$3 */
    static final class C391043 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C391043(Continuation<? super C391043> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseLoginDuxo.this.new C391043(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391043) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C391043 c391043;
            Object objM22650coGetState0E7RQCE$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (BaseLoginDuxo.this.appType == AppType.RHC) {
                    ExperimentsStore experimentsStore = BaseLoginDuxo.this.experimentsStore;
                    CryptoEuPrivacyScreenLaterExperiment cryptoEuPrivacyScreenLaterExperiment = CryptoEuPrivacyScreenLaterExperiment.INSTANCE;
                    this.label = 1;
                    c391043 = this;
                    objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, cryptoEuPrivacyScreenLaterExperiment, false, c391043, 2, null);
                    if (objM22650coGetState0E7RQCE$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22650coGetState0E7RQCE$default = ((Result) obj).getValue();
                c391043 = this;
            }
            Boolean boolBoxBoolean = boxing.boxBoolean(false);
            if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default)) {
                objM22650coGetState0E7RQCE$default = boolBoxBoolean;
            }
            if (((Boolean) objM22650coGetState0E7RQCE$default).booleanValue() && !BaseLoginDuxo.this.gdprManager.getCurrentConsent().getHasCollectedConsent()) {
                BaseLoginDuxo.this.submit(BaseLoginEvent.PromptForPrivacy.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onForgotEmail(boolean generateRequestId) {
        if (generateRequestId) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            setRequestId$feature_lib_login_externalRelease(uuidRandomUUID);
        }
        applyMutation(new C391061(null));
        sendLoginRequestWithSuvHandler("", "", new C391072(null));
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onForgotEmail$1", m3645f = "BaseLoginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onForgotEmail$1 */
    static final class C391061 extends ContinuationImpl7 implements Function2<BaseLoginDataState, Continuation<? super BaseLoginDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C391061(Continuation<? super C391061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C391061 c391061 = new C391061(continuation);
            c391061.L$0 = obj;
            return c391061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseLoginDataState baseLoginDataState, Continuation<? super BaseLoginDataState> continuation) {
            return ((C391061) create(baseLoginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BaseLoginDataState.copy$default((BaseLoginDataState) this.L$0, true, false, null, null, 14, null);
        }
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/login/LoginStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onForgotEmail$2", m3645f = "BaseLoginDuxo.kt", m3646l = {120}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onForgotEmail$2 */
    static final class C391072 extends ContinuationImpl7 implements Function1<Continuation<? super LoginStatus>, Object> {
        int label;

        C391072(Continuation<? super C391072> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return BaseLoginDuxo.this.new C391072(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LoginStatus> continuation) {
            return ((C391072) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            AuthManager authManager = BaseLoginDuxo.this.authManager;
            UUID requestId$feature_lib_login_externalRelease = BaseLoginDuxo.this.getRequestId$feature_lib_login_externalRelease();
            this.label = 1;
            Object objLoginAccountRecovery = authManager.loginAccountRecovery(requestId$feature_lib_login_externalRelease, this);
            return objLoginAccountRecovery == coroutine_suspended ? coroutine_suspended : objLoginAccountRecovery;
        }
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onDoLogin$1", m3645f = "BaseLoginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onDoLogin$1 */
    static final class C391051 extends ContinuationImpl7 implements Function2<BaseLoginDataState, Continuation<? super BaseLoginDataState>, Object> {
        final /* synthetic */ UUID $challengeId;
        final /* synthetic */ String $email;
        final /* synthetic */ boolean $generateRequestId;
        final /* synthetic */ String $password;
        final /* synthetic */ Boolean $skipPrompt;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C391051(String str, String str2, UUID uuid, Boolean bool, boolean z, Continuation<? super C391051> continuation) {
            super(2, continuation);
            this.$email = str;
            this.$password = str2;
            this.$challengeId = uuid;
            this.$skipPrompt = bool;
            this.$generateRequestId = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C391051 c391051 = BaseLoginDuxo.this.new C391051(this.$email, this.$password, this.$challengeId, this.$skipPrompt, this.$generateRequestId, continuation);
            c391051.L$0 = obj;
            return c391051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseLoginDataState baseLoginDataState, Continuation<? super BaseLoginDataState> continuation) {
            return ((C391051) create(baseLoginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseLoginDataState baseLoginDataState = (BaseLoginDataState) this.L$0;
            if (baseLoginDataState.isLoading()) {
                return baseLoginDataState;
            }
            if (BaseLoginDuxo.this.getSuvKillswitchEnabled()) {
                BaseLoginDuxo.this.sendLoginRequest(this.$email, this.$password, this.$challengeId, this.$skipPrompt);
                return BaseLoginDataState.copy$default(baseLoginDataState, true, false, null, null, 14, null);
            }
            if (this.$generateRequestId) {
                BaseLoginDuxo baseLoginDuxo = BaseLoginDuxo.this;
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                baseLoginDuxo.setRequestId$feature_lib_login_externalRelease(uuidRandomUUID);
            }
            BaseLoginDuxo baseLoginDuxo2 = BaseLoginDuxo.this;
            String str = this.$email;
            String str2 = this.$password;
            baseLoginDuxo2.sendLoginRequestWithSuvHandler(str, str2, new AnonymousClass1(baseLoginDuxo2, str, str2, this.$challengeId, this.$skipPrompt, null));
            return BaseLoginDataState.copy$default(baseLoginDataState, true, false, null, null, 14, null);
        }

        /* compiled from: BaseLoginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/login/LoginStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onDoLogin$1$1", m3645f = "BaseLoginDuxo.kt", m3646l = {339}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onDoLogin$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super LoginStatus>, Object> {
            final /* synthetic */ UUID $challengeId;
            final /* synthetic */ String $email;
            final /* synthetic */ String $password;
            final /* synthetic */ Boolean $skipPrompt;
            int label;
            final /* synthetic */ BaseLoginDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BaseLoginDuxo baseLoginDuxo, String str, String str2, UUID uuid, Boolean bool, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = baseLoginDuxo;
                this.$email = str;
                this.$password = str2;
                this.$challengeId = uuid;
                this.$skipPrompt = bool;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$email, this.$password, this.$challengeId, this.$skipPrompt, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super LoginStatus> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Single<LoginStatus> singleLogin = this.this$0.authManager.login(this.$email, this.$password, this.$challengeId, this.$skipPrompt, this.this$0.getRequestId$feature_lib_login_externalRelease());
                    this.label = 1;
                    obj = RxAwait3.await(singleLogin, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
                return obj;
            }
        }
    }

    public final void onDoLogin(String email, String password, UUID challengeId, Boolean skipPrompt, boolean generateRequestId) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        applyMutation(new C391051(email, password, challengeId, skipPrompt, generateRequestId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendLoginRequestWithSuvHandler(final String email, final String password, Function1<? super Continuation<? super LoginStatus>, ? extends Object> request) {
        this.suvWorkflowManager.handleRequest(request, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.sendLoginRequestWithSuvHandler$lambda$2(this.f$0, email, password, (LoginStatus) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.sendLoginRequestWithSuvHandler$lambda$3(this.f$0, email, password, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseLoginDuxo.sendLoginRequestWithSuvHandler$lambda$4(this.f$0, email, password, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLoginRequestWithSuvHandler$lambda$2(BaseLoginDuxo baseLoginDuxo, String str, String str2, LoginStatus loginStatus) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        baseLoginDuxo.onLoginSuccess(loginStatus, str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLoginRequestWithSuvHandler$lambda$3(BaseLoginDuxo baseLoginDuxo, String str, String str2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseLoginDuxo.applyMutation(new BaseLoginDuxo5(null));
        baseLoginDuxo.submit(new BaseLoginEvent.LoginError(it, str, str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLoginRequestWithSuvHandler$lambda$4(BaseLoginDuxo baseLoginDuxo, String str, String str2, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        baseLoginDuxo.applyMutation(new BaseLoginDuxo6(null));
        if (str.length() == 0 && str2.length() == 0) {
            baseLoginDuxo.submit(new BaseLoginEvent.AccountRecoveryVerificationRequired(workflowId, z));
        } else {
            baseLoginDuxo.submit(new BaseLoginEvent.LoginVerificationRequired(workflowId, z));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void sendLoginRequest$default(BaseLoginDuxo baseLoginDuxo, String str, String str2, UUID uuid, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        baseLoginDuxo.sendLoginRequest(str, str2, uuid, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendLoginRequest(final String email, final String password, UUID challengeId, Boolean skipPrompt) {
        LifecycleHost.DefaultImpls.bind$default(this, AuthManager.DefaultImpls.login$default(this.authManager, email, password, challengeId, skipPrompt, null, 16, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.sendLoginRequest$lambda$5(this.f$0, email, password, (LoginStatus) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.sendLoginRequest$lambda$6(this.f$0, email, password, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLoginRequest$lambda$5(BaseLoginDuxo baseLoginDuxo, String str, String str2, LoginStatus loginStatus) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        baseLoginDuxo.onLoginSuccess(loginStatus, str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendLoginRequest$lambda$6(BaseLoginDuxo baseLoginDuxo, String str, String str2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        baseLoginDuxo.applyMutation(new BaseLoginDuxo4(null));
        baseLoginDuxo.submit(new BaseLoginEvent.LoginError(throwable, str, str2));
        return Unit.INSTANCE;
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onLoginSuccess$1", m3645f = "BaseLoginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$onLoginSuccess$1 */
    static final class C391081 extends ContinuationImpl7 implements Function2<BaseLoginDataState, Continuation<? super BaseLoginDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C391081(Continuation<? super C391081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C391081 c391081 = new C391081(continuation);
            c391081.L$0 = obj;
            return c391081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseLoginDataState baseLoginDataState, Continuation<? super BaseLoginDataState> continuation) {
            return ((C391081) create(baseLoginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BaseLoginDataState.copy$default((BaseLoginDataState) this.L$0, false, false, null, null, 14, null);
        }
    }

    private final void onLoginSuccess(LoginStatus loginStatus, String email, String password) {
        applyMutation(new C391081(null));
        boolean z = email.length() == 0 || password.length() == 0;
        boolean z2 = Intrinsics.areEqual(email, getSavedCredentialId$feature_lib_login_externalRelease()) && Intrinsics.areEqual(password, getSavedCredentialPassword$feature_lib_login_externalRelease());
        if (z || z2) {
            submit(new BaseLoginEvent.LoginSuccess(loginStatus, email, password));
        } else {
            submit(new BaseLoginEvent.SaveCredentials(loginStatus, email, password));
        }
    }

    public final void onCredentialsLoaded(String id, String password) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(password, "password");
        setSavedCredentialId$feature_lib_login_externalRelease(id);
        setSavedCredentialPassword$feature_lib_login_externalRelease(password);
        onDoLogin(id, password, null, null, true);
    }

    public final void createPasskeyChallenge() {
        if (getHasCreatedPasskeyChallenge()) {
            return;
        }
        setHasCreatedPasskeyChallenge(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C391031(null), 3, null);
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$createPasskeyChallenge$1", m3645f = "BaseLoginDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$createPasskeyChallenge$1 */
    static final class C391031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C391031(Continuation<? super C391031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseLoginDuxo.this.new C391031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            boolean zIsNetworkRelated;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthManager authManager = BaseLoginDuxo.this.authManager;
                    this.label = 1;
                    obj = authManager.loginWebauthnChallenge(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BaseLoginDuxo.this.submit(new BaseLoginEvent.ShowPasskeyBottomSheet(((WebauthnChallenge) obj).getChallenge()));
            } finally {
                if (!zIsNetworkRelated) {
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public final void handlePasskeyException(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if ((e instanceof GetCredentialCancellationException) || (e instanceof GetCredentialInterruptedException)) {
            submit(BaseLoginEvent.PasskeyCancelledOrInterrupted.INSTANCE);
        } else if ((e instanceof NoCredentialException) || (e instanceof GetCredentialUnknownException)) {
            submit(BaseLoginEvent.PasskeyNoCredentialsAvailable.INSTANCE);
        }
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$validatePasskeyChallenge$1", m3645f = "BaseLoginDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$validatePasskeyChallenge$1 */
    static final class C391091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $authResponseJson;
        final /* synthetic */ UUID $challengeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C391091(UUID uuid, String str, Continuation<? super C391091> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
            this.$authResponseJson = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseLoginDuxo.this.new C391091(this.$challengeId, this.$authResponseJson, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseLoginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$validatePasskeyChallenge$1$1", m3645f = "BaseLoginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$validatePasskeyChallenge$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BaseLoginDataState, Continuation<? super BaseLoginDataState>, Object> {
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
            public final Object invoke(BaseLoginDataState baseLoginDataState, Continuation<? super BaseLoginDataState> continuation) {
                return ((AnonymousClass1) create(baseLoginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BaseLoginDataState.copy$default((BaseLoginDataState) this.L$0, true, false, null, null, 14, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BaseLoginDuxo.this.applyMutation(new AnonymousClass1(null));
                    AuthManager authManager = BaseLoginDuxo.this.authManager;
                    UUID uuid = this.$challengeId;
                    String str = this.$authResponseJson;
                    this.label = 1;
                    obj = authManager.validatePasskeyLoginChallenge(uuid, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BaseLoginDuxo.this.handlePasskeysLogin(((Challenge) obj).getId());
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    BaseLoginDuxo.this.applyMutation(new AnonymousClass2(null));
                    BaseLoginDuxo.this.submit(new BaseLoginEvent.PasskeyLoginFailure(th));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BaseLoginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginDuxo$validatePasskeyChallenge$1$2", m3645f = "BaseLoginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$validatePasskeyChallenge$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BaseLoginDataState, Continuation<? super BaseLoginDataState>, Object> {
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
            public final Object invoke(BaseLoginDataState baseLoginDataState, Continuation<? super BaseLoginDataState> continuation) {
                return ((AnonymousClass2) create(baseLoginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BaseLoginDataState.copy$default((BaseLoginDataState) this.L$0, false, false, null, null, 14, null);
            }
        }
    }

    public final void validatePasskeyChallenge(UUID challengeId, String authResponseJson) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(authResponseJson, "authResponseJson");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C391091(challengeId, authResponseJson, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePasskeysLogin(UUID challengeId) {
        LifecycleHost.DefaultImpls.bind$default(this, this.authManager.loginPasskeys(challengeId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.handlePasskeysLogin$lambda$7(this.f$0, (LoginStatus) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseLoginDuxo.handlePasskeysLogin$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePasskeysLogin$lambda$7(BaseLoginDuxo baseLoginDuxo, LoginStatus loginStatus) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        baseLoginDuxo.applyMutation(new BaseLoginDuxo2(null));
        baseLoginDuxo.submit(new BaseLoginEvent.PasskeyLoginSuccess(loginStatus));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePasskeysLogin$lambda$8(BaseLoginDuxo baseLoginDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        baseLoginDuxo.applyMutation(new BaseLoginDuxo3(null));
        baseLoginDuxo.submit(new BaseLoginEvent.PasskeyLoginFailure(t));
        return Unit.INSTANCE;
    }

    /* compiled from: BaseLoginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo$Companion;", "", "<init>", "()V", "HAS_CREATED_PASSKEY_CHALLENGE", "", "getHAS_CREATED_PASSKEY_CHALLENGE$feature_lib_login_externalRelease$annotations", "SUV_KILLSWITCH_ENABLED", "getSUV_KILLSWITCH_ENABLED$feature_lib_login_externalRelease$annotations", "REQUEST_ID", "getREQUEST_ID$feature_lib_login_externalRelease$annotations", "CREDENTIAL_ID", "CREDENTIAL_PASSWORD", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHAS_CREATED_PASSKEY_CHALLENGE$feature_lib_login_externalRelease$annotations */
        public static /* synthetic */ void m2826x6ad6bfff() {
        }

        public static /* synthetic */ void getREQUEST_ID$feature_lib_login_externalRelease$annotations() {
        }

        /* renamed from: getSUV_KILLSWITCH_ENABLED$feature_lib_login_externalRelease$annotations */
        public static /* synthetic */ void m2827x78ae2ef4() {
        }

        private Companion() {
        }
    }
}
