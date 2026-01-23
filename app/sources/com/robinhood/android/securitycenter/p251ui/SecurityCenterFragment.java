package com.robinhood.android.securitycenter.p251ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManager;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterDuxo7;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.Challenge;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResultContract;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SecurityCenterFragment.kt */
@Metadata(m3635d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002*\u0001,\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002QRB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0016J\u001a\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\r\u0010@\u001a\u000202H\u0017¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u0002022\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010DH\u0002J\u0018\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0082@¢\u0006\u0002\u0010JJ\u0010\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020PH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001d \u001e*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u000205X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006S²\u0006\n\u0010T\u001a\u00020UX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "credentialManager", "Landroidx/credentials/CredentialManager;", "getCredentialManager", "()Landroidx/credentials/CredentialManager;", "setCredentialManager", "(Landroidx/credentials/CredentialManager;)V", "<set-?>", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getChallengeId", "()Ljava/util/UUID;", "setChallengeId", "(Ljava/util/UUID;)V", "challengeId$delegate", "Lkotlin/properties/ReadWriteProperty;", "verifyWithChallenge", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationIntentKey;", "kotlin.jvm.PlatformType", "duxo", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorHandler", "com/robinhood/android/securitycenter/ui/SecurityCenterFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$errorHandler$2$1;", "errorHandler$delegate", "updatePasswordOnClick", "Lkotlin/Function0;", "", "handleMfaOnClick", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "processEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent;", "createPasskey", "Landroidx/credentials/CreatePublicKeyCredentialResponse;", "webauthnOptions", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCallbacks", "type", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$SecurityRowType;", "onDialogDismissed", "id", "", "SecurityRowType", "Callbacks", "feature-security-center_externalDebug", "viewState", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SecurityCenterFragment extends GenericComposeFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SecurityCenterFragment.class, ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getChallengeId()Ljava/util/UUID;", 0)), Reflection.property1(new PropertyReference1Impl(SecurityCenterFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$Callbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: challengeId$delegate, reason: from kotlin metadata */
    private final Interfaces3 challengeId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
    public CredentialManager credentialManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final Function0<Unit> handleMfaOnClick;
    private final Function0<Unit> updatePasswordOnClick;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> verifyWithChallenge;

    /* compiled from: SecurityCenterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$Callbacks;", "", "onUpdatePasswordClicked", "", "onDeviceSecurityClicked", "onMfaSettingsClicked", "onTrustedDeviceListClicked", "onProfileVisibilityClicked", "onBlockingClicked", "onManageDataClicked", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBlockingClicked();

        void onDeviceSecurityClicked();

        void onManageDataClicked();

        void onMfaSettingsClicked();

        void onProfileVisibilityClicked();

        void onTrustedDeviceListClicked();

        void onUpdatePasswordClicked();
    }

    /* compiled from: SecurityCenterFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecurityRowType.values().length];
            try {
                iArr[SecurityRowType.DEVICE_SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityRowType.TRUSTED_DEVICES_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityRowType.PROFILE_VISIBILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SecurityRowType.BLOCKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SecurityRowType.MANAGE_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SecurityCenterFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterFragment", m3645f = "SecurityCenterFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "createPasskey")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$createPasskey$1 */
    static final class C282101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C282101(Continuation<? super C282101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SecurityCenterFragment.this.createPasskey(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$21(SecurityCenterFragment securityCenterFragment, int i, Composer composer, int i2) {
        securityCenterFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEvent(final Event<SecurityCenterDuxo7> event) {
        EventConsumer<SecurityCenterDuxo7> eventConsumerInvoke;
        if (event == null || !(event.getData() instanceof SecurityCenterDuxo7) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$processEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18777invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18777invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SecurityCenterDuxo7 securityCenterDuxo7 = (SecurityCenterDuxo7) event.getData();
                if (securityCenterDuxo7 instanceof SecurityCenterDuxo7.ErrorEvent) {
                    AbsErrorHandler.handleError$default(this.getErrorHandler(), ((SecurityCenterDuxo7.ErrorEvent) securityCenterDuxo7).getError(), false, 2, null);
                    return;
                }
                if (securityCenterDuxo7 instanceof SecurityCenterDuxo7.PasskeyChallenge) {
                    SecurityCenterDuxo7.PasskeyChallenge passkeyChallenge = (SecurityCenterDuxo7.PasskeyChallenge) securityCenterDuxo7;
                    if (passkeyChallenge instanceof SecurityCenterDuxo7.PasskeyChallenge.Verification) {
                        NavigationActivityResultContract3.launch$default(this.verifyWithChallenge, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(Challenge.Flow.UPDATE_WEBAUTHN.getId(), false, ((SecurityCenterDuxo7.PasskeyChallenge.Verification) securityCenterDuxo7).getChallenge(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null)), null, false, 6, null);
                        return;
                    } else {
                        if (passkeyChallenge instanceof SecurityCenterDuxo7.PasskeyChallenge.Error) {
                            AbsErrorHandler.handleError$default(this.getErrorHandler(), ((SecurityCenterDuxo7.PasskeyChallenge.Error) securityCenterDuxo7).getError(), false, 2, null);
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (!(securityCenterDuxo7 instanceof SecurityCenterDuxo7.PasskeyChallengeReceived)) {
                    throw new NoWhenBranchMatchedException();
                }
                String webauthn_options = ((SecurityCenterDuxo7.PasskeyChallengeReceived) securityCenterDuxo7).getChallenge().getWebauthn_options();
                if (webauthn_options != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.getLifecycleScope(), null, null, new SecurityCenterFragment3(this, webauthn_options, securityCenterDuxo7, null), 3, null);
                }
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public SecurityCenterFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeVerificationResultContract(new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$verifyWithChallenge$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ChallengeVerificationResult challengeVerificationResult) {
                if (challengeVerificationResult instanceof ChallengeVerificationResult.Completed) {
                    this.this$0.setChallengeId(((ChallengeVerificationResult.Completed) challengeVerificationResult).getChallengeId());
                    this.this$0.getDuxo().checkForExistingPasskeys(this.this$0.getChallengeId());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.verifyWithChallenge = activityResultLauncherRegisterForActivityResult;
        this.duxo = DuxosKt.duxo(this, SecurityCenterDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecurityCenterFragment.errorHandler_delegate$lambda$1(this.f$0);
            }
        });
        this.updatePasswordOnClick = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecurityCenterFragment.updatePasswordOnClick$lambda$2(this.f$0);
            }
        };
        this.handleMfaOnClick = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecurityCenterFragment.handleMfaOnClick$lambda$3(this.f$0);
            }
        };
        this.eventScreen = new Screen(Screen.Name.SECURITY_PRIVACY_CENTER, null, null, null, 14, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SecurityCenterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$SecurityRowType;", "", "<init>", "(Ljava/lang/String;I)V", "DEVICE_SECURITY", "TRUSTED_DEVICES_LIST", "PROFILE_VISIBILITY", "BLOCKING", "MANAGE_DATA", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SecurityRowType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SecurityRowType[] $VALUES;
        public static final SecurityRowType DEVICE_SECURITY = new SecurityRowType("DEVICE_SECURITY", 0);
        public static final SecurityRowType TRUSTED_DEVICES_LIST = new SecurityRowType("TRUSTED_DEVICES_LIST", 1);
        public static final SecurityRowType PROFILE_VISIBILITY = new SecurityRowType("PROFILE_VISIBILITY", 2);
        public static final SecurityRowType BLOCKING = new SecurityRowType("BLOCKING", 3);
        public static final SecurityRowType MANAGE_DATA = new SecurityRowType("MANAGE_DATA", 4);

        private static final /* synthetic */ SecurityRowType[] $values() {
            return new SecurityRowType[]{DEVICE_SECURITY, TRUSTED_DEVICES_LIST, PROFILE_VISIBILITY, BLOCKING, MANAGE_DATA};
        }

        public static EnumEntries<SecurityRowType> getEntries() {
            return $ENTRIES;
        }

        private SecurityRowType(String str, int i) {
        }

        static {
            SecurityRowType[] securityRowTypeArr$values = $values();
            $VALUES = securityRowTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(securityRowTypeArr$values);
        }

        public static SecurityRowType valueOf(String str) {
            return (SecurityRowType) Enum.valueOf(SecurityRowType.class, str);
        }

        public static SecurityRowType[] values() {
            return (SecurityRowType[]) $VALUES.clone();
        }
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final CredentialManager getCredentialManager() {
        CredentialManager credentialManager = this.credentialManager;
        if (credentialManager != null) {
            return credentialManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentialManager");
        return null;
    }

    public final void setCredentialManager(CredentialManager credentialManager) {
        Intrinsics.checkNotNullParameter(credentialManager, "<set-?>");
        this.credentialManager = credentialManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getChallengeId() {
        return (UUID) this.challengeId.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChallengeId(UUID uuid) {
        this.challengeId.setValue(this, $$delegatedProperties[0], uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecurityCenterDuxo getDuxo() {
        return (SecurityCenterDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecurityCenterFragment2 getErrorHandler() {
        return (SecurityCenterFragment2) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.securitycenter.ui.SecurityCenterFragment$errorHandler$2$1] */
    public static final SecurityCenterFragment2 errorHandler_delegate$lambda$1(final SecurityCenterFragment securityCenterFragment) {
        final FragmentActivity fragmentActivityRequireActivity = securityCenterFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, true, 0, null, 12, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showLongError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                RhDialogFragment.Builder message2 = companion.create(fragmentActivityRequireActivity2).setId(C11048R.id.dialog_id_generic_error).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
                FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
            }
        };
    }

    private static final SecurityCenterViewState ComposeContent$lambda$4(SnapshotState4<SecurityCenterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePasswordOnClick$lambda$2(SecurityCenterFragment securityCenterFragment) {
        EventLogger.DefaultImpls.logTap$default(securityCenterFragment.getEventLogger(), UserInteractionEventData.Action.UPDATE_PASSWORD, new Screen(Screen.Name.SECURITY_PRIVACY_CENTER, null, null, null, 14, null), null, null, null, false, 60, null);
        securityCenterFragment.getCallbacks().onUpdatePasswordClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMfaOnClick$lambda$3(SecurityCenterFragment securityCenterFragment) {
        EventLogger.DefaultImpls.logTap$default(securityCenterFragment.getEventLogger(), UserInteractionEventData.Action.UPDATE_TWO_FACTOR_AUTHENTICATION, new Screen(Screen.Name.SECURITY_PRIVACY_CENTER, null, null, null, 14, null), null, null, null, false, 60, null);
        securityCenterFragment.getCallbacks().onMfaSettingsClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C282111(null), 1, null);
    }

    /* compiled from: SecurityCenterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterFragment$onViewCreated$1", m3645f = "SecurityCenterFragment.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$onViewCreated$1 */
    static final class C282111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C282111(Continuation<? super C282111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SecurityCenterFragment.this.new C282111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<SecurityCenterDuxo7>> eventFlow = SecurityCenterFragment.this.getDuxo().getEventFlow();
                final SecurityCenterFragment securityCenterFragment = SecurityCenterFragment.this;
                FlowCollector<? super Event<SecurityCenterDuxo7>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<SecurityCenterDuxo7>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Event<SecurityCenterDuxo7> event, Continuation<? super Unit> continuation) {
                        securityCenterFragment.processEvent(event);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1550386728);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1550386728, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterFragment.ComposeContent (SecurityCenterFragment.kt:125)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SecurityCenterViewState securityCenterViewStateComposeContent$lambda$4 = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle);
            Integer deviceSecurityText = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle).getDeviceSecurityText();
            boolean showPasskeyExistsDialog = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle).getShowPasskeyExistsDialog();
            boolean showPasskeyErrorDialog = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle).getShowPasskeyErrorDialog();
            boolean showPasskeySuccessBottomSheet = ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle).getShowPasskeySuccessBottomSheet();
            Function0<Unit> function0 = this.updatePasswordOnClick;
            Function0<Unit> function02 = this.handleMfaOnClick;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function03 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$8$lambda$7(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function04 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SecurityCenterFragment.ComposeContent$lambda$10$lambda$9(this.f$0, (SecurityCenterFragment.SecurityRowType) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$12$lambda$11(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function05 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$14$lambda$13(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function06 = (Function0) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$16$lambda$15(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function0 function07 = (Function0) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$18$lambda$17(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            com.robinhood.android.securitycenter.p251ui.Callbacks callbacks = new com.robinhood.android.securitycenter.p251ui.Callbacks(function03, function0, function02, function04, function1, function05, function06, function07, (Function0) objRememberedValue7);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterFragment.ComposeContent$lambda$20$lambda$19(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            SecurityCenterComposableKt.SecurityCenterComposable(securityCenterViewStateComposeContent$lambda$4, deviceSecurityText, showPasskeyExistsDialog, showPasskeyErrorDialog, showPasskeySuccessBottomSheet, callbacks, (Function0) objRememberedValue8, composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterFragment.ComposeContent$lambda$21(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(SecurityCenterFragment securityCenterFragment) {
        securityCenterFragment.getDuxo().launchPasskeyInAppVerification();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7(SecurityCenterFragment securityCenterFragment) {
        WebUtils.viewUrl$default(securityCenterFragment.getContext(), securityCenterFragment.getString(C32428R.string.url_privacy), 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10$lambda$9(SecurityCenterFragment securityCenterFragment, SecurityRowType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        securityCenterFragment.handleCallbacks(value);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$18$lambda$17(SecurityCenterFragment securityCenterFragment) {
        securityCenterFragment.getDuxo().showPasskeySuccessBottomSheet(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$12$lambda$11(SecurityCenterFragment securityCenterFragment) {
        securityCenterFragment.getDuxo().showPasskeyExistsDialog(false);
        securityCenterFragment.getDuxo().getPasskeyChallenge(securityCenterFragment.getChallengeId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$14$lambda$13(SecurityCenterFragment securityCenterFragment) {
        securityCenterFragment.getDuxo().showPasskeyExistsDialog(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$16$lambda$15(SecurityCenterFragment securityCenterFragment) {
        securityCenterFragment.getDuxo().showPasskeyEnrollmentErrorDialog(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$20$lambda$19(SecurityCenterFragment securityCenterFragment) {
        Navigator navigator = securityCenterFragment.getNavigator();
        FragmentActivity fragmentActivityRequireActivity = securityCenterFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        FragmentManager supportFragmentManager = securityCenterFragment.requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.Logout(fragmentActivityRequireActivity, supportFragmentManager), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPasskey(String str, Continuation<? super CreatePublicKeyCredentialResponse> continuation) {
        C282101 c282101;
        if (continuation instanceof C282101) {
            c282101 = (C282101) continuation;
            int i = c282101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c282101.label = i - Integer.MIN_VALUE;
            } else {
                c282101 = new C282101(continuation);
            }
        }
        Object objCreateCredential = c282101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c282101.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateCredential);
                CredentialManager credentialManager = getCredentialManager();
                BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = new CreatePublicKeyCredentialRequest(str, null, false, null, false, 30, null);
                c282101.label = 1;
                objCreateCredential = credentialManager.createCredential(baseActivityRequireBaseActivity, createPublicKeyCredentialRequest, c282101);
                if (objCreateCredential == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateCredential);
            }
            Intrinsics.checkNotNull(objCreateCredential, "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse");
            return (CreatePublicKeyCredentialResponse) objCreateCredential;
        } catch (CreateCredentialException e) {
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            companion.log("Passkey Exception: Unable to create passkey credential");
            CrashReporter.DefaultImpls.reportNonFatal$default(companion, e, false, null, 4, null);
            return null;
        }
    }

    private final void handleCallbacks(SecurityRowType type2) {
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            getCallbacks().onDeviceSecurityClicked();
            return;
        }
        if (i == 2) {
            getCallbacks().onTrustedDeviceListClicked();
            return;
        }
        if (i == 3) {
            getCallbacks().onProfileVisibilityClicked();
        } else if (i == 4) {
            getCallbacks().onBlockingClicked();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onManageDataClicked();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }
}
