package com.robinhood.android.challenge.verification;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.databinding.FragmentChallengeVerificationHelpBottomSheetBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ChallengeVerificationHelpBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0003./0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "callbacks", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationHelpBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationHelpBottomSheetBinding;", "binding$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChallengeVerificationHelpBottomSheetFragment extends BaseBottomSheetDialogFragment implements AutoLoggableFragment {
    public static final String TAG = "challengeVerificationHelpBottomSheet";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private final Component screenEventComponent;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChallengeVerificationHelpBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(ChallengeVerificationHelpBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationHelpBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChallengeVerificationHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Callbacks;", "", "onContactSupportClicked", "", "isLoggedIn", "", "logOutForUar", "appType", "Lcom/robinhood/shared/app/type/AppType;", "resendCode", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContactSupportClicked(boolean isLoggedIn, boolean logOutForUar, AppType appType);

        void resendCode(UUID challengeId);
    }

    /* compiled from: ChallengeVerificationHelpBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public ChallengeVerificationHelpBottomSheetFragment() {
        super(C10497R.layout.fragment_challenge_verification_help_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, ChallengeVerificationHelpBottomSheetFragment2.INSTANCE);
        this.screenEventComponent = new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null);
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

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentChallengeVerificationHelpBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChallengeVerificationHelpBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.IN_APP_VERIFICATION, null, ((Args) INSTANCE.getArgs((Fragment) this)).getChallenge().getType().getServerValue(), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return this.screenEventComponent;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        ChallengeContext.ChallengeType challengeType;
        Companion companion = INSTANCE;
        String string2 = ((Args) companion.getArgs((Fragment) this)).getChallenge().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String strValueOf = String.valueOf(((Args) companion.getArgs((Fragment) this)).getVerificationWorkflowId());
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getChallenge().getType().ordinal()];
        if (i == 1) {
            challengeType = ChallengeContext.ChallengeType.SMS;
        } else if (i == 2) {
            challengeType = ChallengeContext.ChallengeType.APP;
        } else if (i == 3) {
            challengeType = ChallengeContext.ChallengeType.EMAIL;
        } else {
            challengeType = ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNKNOWN;
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, string2, challengeType, null, null, strValueOf, null, null, null, null, null, null, 4057, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout challengeVerificationHelpBottomSheetContainer = getBinding().challengeVerificationHelpBottomSheetContainer;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpBottomSheetContainer, "challengeVerificationHelpBottomSheetContainer");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, challengeVerificationHelpBottomSheetContainer, 0.0f, 2, null);
        RdsButton challengeVerificationHelpDismiss = getBinding().challengeVerificationHelpDismiss;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpDismiss, "challengeVerificationHelpDismiss");
        OnClickListeners.onClick(challengeVerificationHelpDismiss, new Function0() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeVerificationHelpBottomSheetFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsRowView challengeVerificationHelpResendCode = getBinding().challengeVerificationHelpResendCode;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpResendCode, "challengeVerificationHelpResendCode");
        OnClickListeners.onClick(challengeVerificationHelpResendCode, new Function0() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeVerificationHelpBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsRowView challengeVerificationHelpSelfServiceRecovery = getBinding().challengeVerificationHelpSelfServiceRecovery;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpSelfServiceRecovery, "challengeVerificationHelpSelfServiceRecovery");
        Companion companion = INSTANCE;
        challengeVerificationHelpSelfServiceRecovery.setVisibility(!((Args) companion.getArgs((Fragment) this)).getHideSmsUarFallback() ? 0 : 8);
        final ChallengeVerificationHelpBottomSheetViewState challengeVerificationHelpBottomSheetViewState = new ChallengeVerificationHelpBottomSheetViewState(((Args) companion.getArgs((Fragment) this)).getChallenge(), ((Args) companion.getArgs((Fragment) this)).getIsLoggedIn(), ((Args) companion.getArgs((Fragment) this)).getIsEmbeddedInPathfinder(), getAppType(), ((Args) companion.getArgs((Fragment) this)).getFallbackCtaText());
        RdsRowView challengeVerificationHelpResendCode2 = getBinding().challengeVerificationHelpResendCode;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpResendCode2, "challengeVerificationHelpResendCode");
        challengeVerificationHelpResendCode2.setVisibility(challengeVerificationHelpBottomSheetViewState.isResendCodeButtonVisible() ? 0 : 8);
        getBinding().challengeVerificationHelpBottomSheetTitle.setText(challengeVerificationHelpBottomSheetViewState.getTitleRes());
        getBinding().challengeVerificationHelpBottomSheetSubtitle.setText(challengeVerificationHelpBottomSheetViewState.getSubtitleRes());
        getBinding().challengeVerificationHelpDismiss.setText(challengeVerificationHelpBottomSheetViewState.getDismissButtonRes());
        RdsRowView challengeVerificationHelpSelfServiceRecovery2 = getBinding().challengeVerificationHelpSelfServiceRecovery;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpSelfServiceRecovery2, "challengeVerificationHelpSelfServiceRecovery");
        challengeVerificationHelpSelfServiceRecovery2.setVisibility(challengeVerificationHelpBottomSheetViewState.isLoggedInUarRecoveryEnabled() ? 0 : 8);
        RdsRowView rdsRowView = getBinding().challengeVerificationHelpSelfServiceRecovery;
        StringResource fallbackText = challengeVerificationHelpBottomSheetViewState.getFallbackText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsRowView.setPrimaryText(fallbackText.getText(resources));
        RdsRowView challengeVerificationHelpSelfServiceRecovery3 = getBinding().challengeVerificationHelpSelfServiceRecovery;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpSelfServiceRecovery3, "challengeVerificationHelpSelfServiceRecovery");
        OnClickListeners.onClick(challengeVerificationHelpSelfServiceRecovery3, new Function0() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeVerificationHelpBottomSheetFragment.onViewCreated$lambda$3$lambda$2(this.f$0, challengeVerificationHelpBottomSheetViewState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ChallengeVerificationHelpBottomSheetFragment challengeVerificationHelpBottomSheetFragment) {
        challengeVerificationHelpBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ChallengeVerificationHelpBottomSheetFragment challengeVerificationHelpBottomSheetFragment) {
        EventLogger.DefaultImpls.logTap$default(challengeVerificationHelpBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.RESEND_CHALLENGE, challengeVerificationHelpBottomSheetFragment.getEventScreen(), null, null, challengeVerificationHelpBottomSheetFragment.getScreenEventContext(), false, 44, null);
        challengeVerificationHelpBottomSheetFragment.getCallbacks().resendCode(((Args) INSTANCE.getArgs((Fragment) challengeVerificationHelpBottomSheetFragment)).getChallenge().getId());
        challengeVerificationHelpBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(ChallengeVerificationHelpBottomSheetFragment challengeVerificationHelpBottomSheetFragment, ChallengeVerificationHelpBottomSheetViewState challengeVerificationHelpBottomSheetViewState) {
        EventLogger.DefaultImpls.logTap$default(challengeVerificationHelpBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.CHALLENGE_FALLBACK, challengeVerificationHelpBottomSheetFragment.getEventScreen(), null, null, challengeVerificationHelpBottomSheetFragment.getScreenEventContext(), false, 44, null);
        challengeVerificationHelpBottomSheetFragment.getCallbacks().onContactSupportClicked(((Args) INSTANCE.getArgs((Fragment) challengeVerificationHelpBottomSheetFragment)).getIsLoggedIn(), challengeVerificationHelpBottomSheetViewState.isLoggedInUarRecoveryEnabled(), challengeVerificationHelpBottomSheetFragment.getAppType());
        challengeVerificationHelpBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: ChallengeVerificationHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Args;", "Landroid/os/Parcelable;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "isLoggedIn", "", "flowId", "", "isEmbeddedInPathfinder", "fallbackCtaText", "hideSmsUarFallback", "email", "verificationWorkflowId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/api/Challenge;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/util/UUID;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "()Z", "getFlowId", "()Ljava/lang/String;", "getFallbackCtaText", "getHideSmsUarFallback", "getEmail", "getVerificationWorkflowId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Challenge challenge;
        private final String email;
        private final String fallbackCtaText;
        private final String flowId;
        private final boolean hideSmsUarFallback;
        private final boolean isEmbeddedInPathfinder;
        private final boolean isLoggedIn;
        private final UUID verificationWorkflowId;

        /* compiled from: ChallengeVerificationHelpBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Challenge challenge = (Challenge) parcel.readParcelable(Args.class.getClassLoader());
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                }
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                return new Args(challenge, z4, string2, z2, string3, z, parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.challenge, flags);
            dest.writeInt(this.isLoggedIn ? 1 : 0);
            dest.writeString(this.flowId);
            dest.writeInt(this.isEmbeddedInPathfinder ? 1 : 0);
            dest.writeString(this.fallbackCtaText);
            dest.writeInt(this.hideSmsUarFallback ? 1 : 0);
            dest.writeString(this.email);
            dest.writeSerializable(this.verificationWorkflowId);
        }

        public Args(Challenge challenge, boolean z, String flowId, boolean z2, String str, boolean z3, String str2, UUID uuid) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(flowId, "flowId");
            this.challenge = challenge;
            this.isLoggedIn = z;
            this.flowId = flowId;
            this.isEmbeddedInPathfinder = z2;
            this.fallbackCtaText = str;
            this.hideSmsUarFallback = z3;
            this.email = str2;
            this.verificationWorkflowId = uuid;
        }

        public /* synthetic */ Args(Challenge challenge, boolean z, String str, boolean z2, String str2, boolean z3, String str3, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, z, str, z2, str2, z3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : uuid);
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }

        /* renamed from: isLoggedIn, reason: from getter */
        public final boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        public final String getFlowId() {
            return this.flowId;
        }

        /* renamed from: isEmbeddedInPathfinder, reason: from getter */
        public final boolean getIsEmbeddedInPathfinder() {
            return this.isEmbeddedInPathfinder;
        }

        public final String getFallbackCtaText() {
            return this.fallbackCtaText;
        }

        public final boolean getHideSmsUarFallback() {
            return this.hideSmsUarFallback;
        }

        public final String getEmail() {
            return this.email;
        }

        public final UUID getVerificationWorkflowId() {
            return this.verificationWorkflowId;
        }
    }

    /* compiled from: ChallengeVerificationHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Args;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Callbacks;", "<init>", "()V", "TAG", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<ChallengeVerificationHelpBottomSheetFragment, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ChallengeVerificationHelpBottomSheetFragment challengeVerificationHelpBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, challengeVerificationHelpBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> ChallengeVerificationHelpBottomSheetFragment newInstance(Args args, C c, int i) {
            return (ChallengeVerificationHelpBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
