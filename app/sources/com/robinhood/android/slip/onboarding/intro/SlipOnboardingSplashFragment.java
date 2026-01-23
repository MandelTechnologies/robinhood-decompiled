package com.robinhood.android.slip.onboarding.intro;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.ColorResources_androidKt;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipOnboardingSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003RSTB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020>H\u0016J\b\u0010D\u001a\u00020>H\u0016J\b\u0010E\u001a\u00020FH\u0016J\r\u0010G\u001a\u00020>H\u0017¢\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020>H\u0002J\u0010\u0010J\u001a\u00020F2\u0006\u0010K\u001a\u00020!H\u0016J\t\u0010L\u001a\u00020FH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R;\u00106\u001a\n\u0012\u0004\u0012\u00020!\u0018\u0001052\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020!\u0018\u0001058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U²\u0006\n\u0010V\u001a\u00020/X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getContent", "()Ljava/util/List;", "ctaContent", "getCtaContent", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "foregroundColorRes", "", "getForegroundColorRes", "()I", "backgroundColorRes", "getBackgroundColorRes", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "modal", "getModal", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "setModal", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "modal$delegate", "Landroidx/compose/runtime/MutableState;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onBackPressed", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onContinueClick", "handle", "action", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-slip_externalDebug", "headerImageResId"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingSplashFragment extends GenericActionHandlingFragment implements RegionGated, AutoLoggableFragment {
    public EventLogger eventLogger;
    public SurveyManager3 userLeapManager;
    public UserStore userStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SlipOnboardingSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SlipOnboardingSplashFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: modal$delegate, reason: from kotlin metadata */
    private final SnapshotState modal = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* compiled from: SlipOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Callbacks;", "", "onSplashContinueClicked", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSplashContinueClicked();
    }

    /* compiled from: SlipOnboardingSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SlipOnboardingSplashFragment slipOnboardingSplashFragment, int i, Composer composer, int i2) {
        slipOnboardingSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
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

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<UIComponent<GenericAction>> getContent() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSplash().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<UIComponent<GenericAction>> getCtaContent() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSplash().getCtaContent();
    }

    /* compiled from: SlipOnboardingSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1 */
    static final class C286861 implements Function2<Composer, Integer, Unit> {
        C286861() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SlipOnboardingSplashFragment slipOnboardingSplashFragment) {
            slipOnboardingSplashFragment.setModal(null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348220647, i, -1, "com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment.ComposeContent.<anonymous> (SlipOnboardingSplashFragment.kt:129)");
            }
            GenericAlertContent modal = SlipOnboardingSplashFragment.this.getModal();
            composer.startReplaceGroup(1440082606);
            if (modal != null) {
                final SlipOnboardingSplashFragment slipOnboardingSplashFragment = SlipOnboardingSplashFragment.this;
                final String title = modal.getTitle();
                final String body_markdown = modal.getBody_markdown();
                final List body_components = modal.getBody_components();
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                Button button = (Button) modal.getAction_buttons().get(0);
                int i2 = SduiAlert.$stable;
                final BentoAlertButton alertButton = sduiAlert.toAlertButton(button, slipOnboardingSplashFragment, composer, i2 << 6, 0);
                Button button2 = (Button) CollectionsKt.getOrNull(modal.getAction_buttons(), 1);
                composer.startReplaceGroup(1440093068);
                final BentoAlertButton alertButton2 = button2 == null ? null : sduiAlert.toAlertButton(button2, slipOnboardingSplashFragment, composer, i2 << 6, 0);
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(slipOnboardingSplashFragment);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlipOnboardingSplashFragment.C286861.invoke$lambda$2$lambda$1$lambda$0(slipOnboardingSplashFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                int i3 = BentoAlertButton.$stable;
                composer.startReplaceGroup(1528852666);
                final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-986234119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$invoke$lambda$2$$inlined$BentoSduiAlertDialog$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986234119, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialog.<anonymous> (BentoSduiAlertDialog.kt:36)");
                        }
                        String str = body_markdown;
                        List list = body_components;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(970837003);
                        if (str.length() > 0) {
                            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(str, null, null, null, 0, 1, 0, 0, null, composer2, 196608, 478);
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(970842998);
                        if (list != null) {
                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, companion, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100859904, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54);
                final ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = null;
                AndroidDialog_androidKt.Dialog(function0, null, ComposableLambda3.rememberComposableLambda(1779118225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$invoke$lambda$2$$inlined$BentoSduiAlertDialog$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1779118225, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialog.<anonymous> (BentoSduiAlertDialog.kt:52)");
                        }
                        Modifier modifierClip = Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
                        BentoAlertButton bentoAlertButton = alertButton;
                        BentoAlertButton bentoAlertButton2 = alertButton2;
                        ServerToBentoAssetMapper3 serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
                        String str = title;
                        Function2 function2 = composableLambdaRememberComposableLambda;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierClip);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoAlerts2.AlertContent(null, serverToBentoAssetMapper32, str, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{bentoAlertButton, bentoAlertButton2}), false, function2, composer2, (BentoAlertButton.$stable << 12) | 1572864, 41);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ((((i3 << 12) | (i3 << 9)) >> 18) & 14) | 384, 2);
                composer.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            SlipOnboardingSplashFragment slipOnboardingSplashFragment2 = SlipOnboardingSplashFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(((Args) SlipOnboardingSplashFragment.INSTANCE.getArgs((Fragment) slipOnboardingSplashFragment2)).getShowRecommendedFlow() ? C28532R.drawable.slip_splash_header_image_recommended : C28532R.drawable.slip_splash_header_image_generic);
                composer.updateRememberedValue(objRememberedValue2);
            }
            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1440107343);
            if (!((Args) SlipOnboardingSplashFragment.INSTANCE.getArgs((Fragment) SlipOnboardingSplashFragment.this)).getShowRecommendedFlow()) {
                Unit unit2 = Unit.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(SlipOnboardingSplashFragment.this);
                SlipOnboardingSplashFragment slipOnboardingSplashFragment3 = SlipOnboardingSplashFragment.this;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new SlipOnboardingSplashFragment2(slipOnboardingSplashFragment3, snapshotIntState2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 6);
            }
            composer.endReplaceGroup();
            SlipOnboardingSplashFragment slipOnboardingSplashFragment4 = SlipOnboardingSplashFragment.this;
            ImmutableList3 persistentList = extensions2.toPersistentList(slipOnboardingSplashFragment4.getContent());
            ImmutableList3 persistentList2 = extensions2.toPersistentList(SlipOnboardingSplashFragment.this.getCtaContent());
            Object obj = SlipOnboardingSplashFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(obj);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new SlipOnboardingSplashFragment3(obj);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            SplashComposable.m18999SplashComposable1YH7lEI(slipOnboardingSplashFragment4, persistentList, persistentList2, (Function0) ((KFunction) objRememberedValue4), snapshotIntState2.getIntValue(), ColorResources_androidKt.colorResource(SlipOnboardingSplashFragment.this.getBackgroundColorRes(), composer, 0), !((Args) r1.getArgs((Fragment) SlipOnboardingSplashFragment.this)).getShowRecommendedFlow(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 12582912, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SLIP_ONBOARDING_INTRO_ABBREVIATED, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Args) INSTANCE.getArgs((Fragment) this)).getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8193, -1, -1, -1, 16383, null), null, null, 109, null);
    }

    private final int getForegroundColorRes() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getShowRecommendedFlow()) {
            return C20690R.color.mobius_white;
        }
        return C20690R.color.mobius_black;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBackgroundColorRes() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getShowRecommendedFlow()) {
            return C20690R.color.mobius_jade_day;
        }
        return C20690R.color.mobius_x_ray_light_night;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final GenericAlertContent<GenericAction> getModal() {
        return (GenericAlertContent) this.modal.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setModal(GenericAlertContent<? extends GenericAction> genericAlertContent) {
        this.modal.setValue(genericAlertContent);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.setBackgroundColor(requireContext().getColor(getBackgroundColorRes()));
        BaseFragments2.setContentBelowToolbar(this, view);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        int color = requireContext().getColor(getForegroundColorRes());
        requireToolbar().getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
        Drawable navigationIcon = requireToolbar().getToolbar().getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(color);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() throws Resources.NotFoundException {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground1);
        requireToolbar().getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_arrow_left_24dp);
        Drawable navigationIcon = requireToolbar().getToolbar().getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(themeColor);
        }
        super.onStop();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getUserLeapManager().setPendingSurvey(Survey.SLIP_ONBOARDING_EXIT);
        return super.onBackPressed();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1596373180);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596373180, i2, -1, "com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment.ComposeContent (SlipOnboardingSplashFragment.kt:128)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1348220647, true, new C286861(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipOnboardingSplashFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContinueClick() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CONTINUE, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        getCallbacks().onSplashContinueClicked();
    }

    /* compiled from: SlipOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Args;", "Landroid/os/Parcelable;", "splash", "Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "showRecommendedFlow", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "<init>", "(Lcom/robinhood/models/db/SlipOnboarding$SplashView;ZLcom/robinhood/rosetta/eventlogging/SLIPContext;)V", "getSplash", "()Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "getShowRecommendedFlow", "()Z", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final SLIPContext loggingContext;
        private final boolean showRecommendedFlow;
        private final SlipOnboarding.SplashView splash;

        /* compiled from: SlipOnboardingSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((SlipOnboarding.SplashView) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, (SLIPContext) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, SlipOnboarding.SplashView splashView, boolean z, SLIPContext sLIPContext, int i, Object obj) {
            if ((i & 1) != 0) {
                splashView = args.splash;
            }
            if ((i & 2) != 0) {
                z = args.showRecommendedFlow;
            }
            if ((i & 4) != 0) {
                sLIPContext = args.loggingContext;
            }
            return args.copy(splashView, z, sLIPContext);
        }

        /* renamed from: component1, reason: from getter */
        public final SlipOnboarding.SplashView getSplash() {
            return this.splash;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final SLIPContext getLoggingContext() {
            return this.loggingContext;
        }

        public final Args copy(SlipOnboarding.SplashView splash, boolean showRecommendedFlow, SLIPContext loggingContext) {
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(splash, showRecommendedFlow, loggingContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.splash, args.splash) && this.showRecommendedFlow == args.showRecommendedFlow && Intrinsics.areEqual(this.loggingContext, args.loggingContext);
        }

        public int hashCode() {
            return (((this.splash.hashCode() * 31) + Boolean.hashCode(this.showRecommendedFlow)) * 31) + this.loggingContext.hashCode();
        }

        public String toString() {
            return "Args(splash=" + this.splash + ", showRecommendedFlow=" + this.showRecommendedFlow + ", loggingContext=" + this.loggingContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.splash, flags);
            dest.writeInt(this.showRecommendedFlow ? 1 : 0);
            dest.writeSerializable(this.loggingContext);
        }

        public Args(SlipOnboarding.SplashView splash, boolean z, SLIPContext loggingContext) {
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.splash = splash;
            this.showRecommendedFlow = z;
            this.loggingContext = loggingContext;
        }

        public final SlipOnboarding.SplashView getSplash() {
            return this.splash;
        }

        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        public final SLIPContext getLoggingContext() {
            return this.loggingContext;
        }
    }

    /* compiled from: SlipOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment;", "Lcom/robinhood/android/slip/onboarding/intro/SlipOnboardingSplashFragment$Args;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SlipOnboardingSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SlipOnboardingSplashFragment slipOnboardingSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, slipOnboardingSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipOnboardingSplashFragment newInstance(Args args) {
            return (SlipOnboardingSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipOnboardingSplashFragment slipOnboardingSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, slipOnboardingSplashFragment, args);
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment, com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.InfoAlert) {
            GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
            int i = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
            if (i == 1) {
                setModal(infoAlert.getValue2().getAlert());
                return true;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            sduiAlert.presentGenericAlertSheet(childFragmentManager, infoAlert.getValue2().getAlert());
            return true;
        }
        return super.mo15941handle(action);
    }
}
