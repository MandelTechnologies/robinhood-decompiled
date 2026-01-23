package com.robinhood.android.rhy.referral.referee;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.googlepay.GooglePayPushTokenizeManager;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.RhyRefereeLandingKey;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.android.rhy.referral.ineligibility.RhyReferralLandingIneligibilityDialog;
import com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingEvent;
import com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment;
import com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingViewState;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding;
import com.robinhood.models.rhy.referral.p345db.RhyReferralIneligibilityData;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rhy.referral.HasSeenRhyReferralLandingTooltipPref;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RhyReferralsRefereeLandingFragment.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u000201H\u0016J\u0010\u00106\u001a\u0002012\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000201H\u0016J\u001a\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010=\u001a\u000201H\u0016J\r\u0010>\u001a\u000201H\u0017¢\u0006\u0002\u0010?J\u0015\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0007¢\u0006\u0002\u0010CJ\u0015\u0010D\u001a\u0002012\u0006\u0010A\u001a\u00020EH\u0003¢\u0006\u0002\u0010FJ)\u0010G\u001a\u0002012\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002010IH\u0003¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u0002012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NH\u0002J\t\u0010P\u001a\u00020#H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010.\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u0002010/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RX\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\u0012\u0010M\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010NX\u008a\u0084\u0002²\u0006\f\u0010Y\u001a\u0004\u0018\u00010ZX\u008a\u008e\u0002²\u0006\n\u0010[\u001a\u00020#X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "hasSeenRhyReferralLandingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasSeenRhyReferralLandingTooltipPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasSeenRhyReferralLandingTooltipPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "shouldClearTop", "", "getShouldClearTop", "()Ljava/lang/Boolean;", "duxo", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "RhyReferralsRefereeLandingComposable", "viewState", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "(Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;Landroidx/compose/runtime/Composer;I)V", "RhyReferralsRefereeLandingLoaded", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded;", "(Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded;Landroidx/compose/runtime/Composer;I)V", "DebugAddCardToGooglePayDialog", "onActionConfirmed", "Lkotlin/Function0;", "onActionCancelled", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-referral_externalDebug", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowIneligibilityDialog;", "showIneligibilityDialog", "Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;", "showTooltip"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralsRefereeLandingFragment extends GenericActionHandlingFragment implements RegionGated, AutoLoggableFragment {
    private static final int REQUEST_PUSH_TOKENIZE = 179;
    public EventLogger eventLogger;

    @HasSeenRhyReferralLandingTooltipPref
    public BooleanPreference hasSeenRhyReferralLandingTooltipPref;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    private final boolean shouldClearTop;
    public TooltipManager tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RHY_REFERRALS_REFEREE_LANDING_PAGE, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RhyReferralsRefereeLandingDuxo.class);
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RhyReferralsRefereeLandingFragment.launchSuv$lambda$1(this.f$0);
        }
    }, (Function0) null, 4, (Object) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, int i, Composer composer, int i2) {
        rhyReferralsRefereeLandingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebugAddCardToGooglePayDialog$lambda$24(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        rhyReferralsRefereeLandingFragment.DebugAddCardToGooglePayDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsRefereeLandingComposable$lambda$8(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, RhyReferralsRefereeLandingViewState rhyReferralsRefereeLandingViewState, int i, Composer composer, int i2) {
        rhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable(rhyReferralsRefereeLandingViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsRefereeLandingLoaded$lambda$23(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, RhyReferralsRefereeLandingViewState.Loaded loaded, int i, Composer composer, int i2) {
        rhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded(loaded, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<RhyReferralsRefereeLandingEvent> event) {
        EventConsumer<RhyReferralsRefereeLandingEvent> eventConsumerInvoke;
        EventConsumer<RhyReferralsRefereeLandingEvent> eventConsumerInvoke2;
        EventConsumer<RhyReferralsRefereeLandingEvent> eventConsumerInvoke3;
        EventConsumer<RhyReferralsRefereeLandingEvent> eventConsumerInvoke4;
        EventConsumer<RhyReferralsRefereeLandingEvent> eventConsumerInvoke5;
        if ((event.getData() instanceof RhyReferralsRefereeLandingEvent.PushTokenizeEvent) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18295invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18295invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RhyReferralsRefereeLandingEvent.PushTokenizeEvent pushTokenizeEvent = (RhyReferralsRefereeLandingEvent.PushTokenizeEvent) event.getData();
                    GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    googlePayPushTokenizeManager.pushTokenize(fragmentActivityRequireActivity, pushTokenizeEvent.getRequest(), EnumC7081g.f2780x600b66fe);
                }
            });
        }
        if ((event.getData() instanceof RhyReferralsRefereeLandingEvent.VerificationRequired) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18296invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18296invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RhyReferralsRefereeLandingEvent.VerificationRequired verificationRequired = (RhyReferralsRefereeLandingEvent.VerificationRequired) event.getData();
                    this.launchSuv.invoke(verificationRequired.getError().getWorkflowInstanceUuid(), Boolean.valueOf(verificationRequired.getError().isMigrated()));
                }
            });
        }
        if ((event.getData() instanceof RhyReferralsRefereeLandingEvent.ShowFundMyAccount) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18297invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18297invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHY, 3, null), null, null, null, false, false, null, null, false, 8167, null)), null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof RhyReferralsRefereeLandingEvent.ShowCardNumber) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18298invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18298invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.RhyCardSettings(LegacyFragmentKey.RhyCardSettings.Action.SHOW_CARD_NUMBER), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
            });
        }
        if (!(event.getData() instanceof RhyReferralsRefereeLandingEvent.ShowFragment) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$handleEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18299invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18299invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RhyReferralsRefereeLandingEvent.ShowFragment showFragment = (RhyReferralsRefereeLandingEvent.ShowFragment) event.getData();
                Navigator navigator = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, showFragment.getFragmentKey(), false, false, false, false, null, false, null, null, 1020, null);
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    private static final RhyReferralsRefereeLandingViewState ComposeContent$lambda$6(SnapshotState4<? extends RhyReferralsRefereeLandingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final RhyReferralIneligibilityData RhyReferralsRefereeLandingLoaded$lambda$11(SnapshotState<RhyReferralIneligibilityData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RhyReferralsRefereeLandingLoaded$lambda$20(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Event<RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog> RhyReferralsRefereeLandingLoaded$lambda$9(SnapshotState4<Event<RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog>> snapshotState4) {
        return snapshotState4.getValue();
    }

    public final TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public final void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    public final BooleanPreference getHasSeenRhyReferralLandingTooltipPref() {
        BooleanPreference booleanPreference = this.hasSeenRhyReferralLandingTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasSeenRhyReferralLandingTooltipPref");
        return null;
    }

    public final void setHasSeenRhyReferralLandingTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasSeenRhyReferralLandingTooltipPref = booleanPreference;
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment
    public Boolean getShouldClearTop() {
        return Boolean.valueOf(this.shouldClearTop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyReferralsRefereeLandingDuxo getDuxo() {
        return (RhyReferralsRefereeLandingDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
        rhyReferralsRefereeLandingFragment.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getRhyGlobalLoggingContext().refresh();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RhyReferralsRefereeLandingFragment8.removeToolbarStyle(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingFragment.onResume$lambda$4(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhyReferralsRefereeLandingFragment8.setToolbarStyle(rhyReferralsRefereeLandingFragment);
        Toolbar toolbar = rhyReferralsRefereeLandingFragment.requireToolbar().getToolbar();
        Drawable drawable = ViewsKt.getDrawable(toolbar, C20690R.drawable.ic_rds_close_24dp);
        drawable.setTint(ContextCompat.getColor(toolbar.getContext(), C11048R.color.text_color_primary));
        toolbar.setNavigationIcon(drawable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C275041(null), 1, null);
    }

    /* compiled from: RhyReferralsRefereeLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$onViewCreated$1", m3645f = "RhyReferralsRefereeLandingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$onViewCreated$1 */
    static final class C275041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C275041(Continuation<? super C275041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralsRefereeLandingFragment.this.new C275041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C275041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyReferralsRefereeLandingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RhyReferralsRefereeLandingFragment $tmp0;

            AnonymousClass1(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
                this.$tmp0 = rhyReferralsRefereeLandingFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RhyReferralsRefereeLandingFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<RhyReferralsRefereeLandingEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C275041.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<RhyReferralsRefereeLandingEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RhyReferralsRefereeLandingFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyReferralsRefereeLandingFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, Event event, Continuation continuation) {
            rhyReferralsRefereeLandingFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RhyReferralsRefereeLandingFragment8.setToolbarStyle(this);
        GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, googlePayPushTokenizeManager.onDataChanged(fragmentActivityRequireActivity), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyReferralsRefereeLandingFragment.onStart$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
        rhyReferralsRefereeLandingFragment.getDuxo().updateGooglePayData();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(11923841);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(11923841, i2, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.ComposeContent (RhyReferralsRefereeLandingFragment.kt:154)");
            }
            RhyReferralsRefereeLandingComposable(ComposeContent$lambda$6(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, (i2 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsRefereeLandingFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void RhyReferralsRefereeLandingComposable(final RhyReferralsRefereeLandingViewState viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1000900621);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1000900621, i2, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable (RhyReferralsRefereeLandingFragment.kt:162)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1738469218, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1738469218, i3, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable.<anonymous> (RhyReferralsRefereeLandingFragment.kt:164)");
                    }
                    RhyReferralsRefereeLandingViewState rhyReferralsRefereeLandingViewState = viewState;
                    final RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment = this;
                    Crossfade.Crossfade(rhyReferralsRefereeLandingViewState, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambda3.rememberComposableLambda(69113481, true, new Function3<RhyReferralsRefereeLandingViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhyReferralsRefereeLandingViewState rhyReferralsRefereeLandingViewState2, Composer composer3, Integer num) throws Throwable {
                            invoke(rhyReferralsRefereeLandingViewState2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhyReferralsRefereeLandingViewState state, Composer composer3, int i4) throws Throwable {
                            Intrinsics.checkNotNullParameter(state, "state");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer3.changed(state) : composer3.changedInstance(state) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(69113481, i4, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable.<anonymous>.<anonymous> (RhyReferralsRefereeLandingFragment.kt:165)");
                            }
                            if (state instanceof RhyReferralsRefereeLandingViewState.Loaded) {
                                composer3.startReplaceGroup(1993549392);
                                rhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded((RhyReferralsRefereeLandingViewState.Loaded) state, composer3, 0);
                                composer3.endReplaceGroup();
                            } else if (state instanceof RhyReferralsRefereeLandingViewState.Error) {
                                composer3.startReplaceGroup(1993552842);
                                composer3.endReplaceGroup();
                                rhyReferralsRefereeLandingFragment.getActivityErrorHandler().invoke2(((RhyReferralsRefereeLandingViewState.Error) state).getError());
                            } else {
                                if (!Intrinsics.areEqual(state, RhyReferralsRefereeLandingViewState.Loading.INSTANCE)) {
                                    composer3.startReplaceGroup(1993547054);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(1993556863);
                                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composer3, 384, 11);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 24576, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingComposable$lambda$8(this.f$0, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RhyReferralsRefereeLandingLoaded(final RhyReferralsRefereeLandingViewState.Loaded loaded, Composer composer, final int i) {
        int i2;
        EventConsumer<RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1513423778);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1513423778, i2, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded (RhyReferralsRefereeLandingFragment.kt:176)");
            }
            final StateFlow<Event<RhyReferralsRefereeLandingEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "RhyReferralsRefereeLandingFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            Event<RhyReferralsRefereeLandingEvent> value = eventFlow.getValue();
            Event<RhyReferralsRefereeLandingEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Event<RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog> eventRhyReferralsRefereeLandingLoaded$lambda$9 = RhyReferralsRefereeLandingLoaded$lambda$9(snapshotState4CollectAsStateWithLifecycle);
            if (eventRhyReferralsRefereeLandingLoaded$lambda$9 != null && (eventRhyReferralsRefereeLandingLoaded$lambda$9.getData() instanceof RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog) && (eventConsumerInvoke = eventRhyReferralsRefereeLandingLoaded$lambda$9.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventRhyReferralsRefereeLandingLoaded$lambda$9, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m18294invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m18294invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        snapshotState.setValue(((RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog) eventRhyReferralsRefereeLandingLoaded$lambda$9.getData()).getIneligibilityData());
                    }
                });
            }
            RhyReferralIneligibilityData rhyReferralIneligibilityDataRhyReferralsRefereeLandingLoaded$lambda$11 = RhyReferralsRefereeLandingLoaded$lambda$11(snapshotState);
            composerStartRestartGroup.startReplaceGroup(1593680822);
            if (rhyReferralIneligibilityDataRhyReferralsRefereeLandingLoaded$lambda$11 != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded$lambda$16$lambda$15$lambda$14(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhyReferralLandingIneligibilityDialog.RhyReferralLandingIneligibilityDialog(rhyReferralIneligibilityDataRhyReferralsRefereeLandingLoaded$lambda$11, (Function0) objRememberedValue2, composerStartRestartGroup, 48);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1593687088);
            if (loaded.getShowDebugAddCardToGooglePayDialog()) {
                RhyReferralsRefereeLandingDuxo duxo = getDuxo();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new RhyReferralsRefereeLandingFragment4(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function0 = (Function0) ((KFunction) objRememberedValue3);
                RhyReferralsRefereeLandingDuxo duxo2 = getDuxo();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new RhyReferralsRefereeLandingFragment5(duxo2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                DebugAddCardToGooglePayDialog(function0, (Function0) ((KFunction) objRememberedValue4), composerStartRestartGroup, (i2 << 3) & 896);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new RhyReferralsRefereeLandingFragment6(this, snapshotState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
            final RefereeLanding refereeLanding = loaded.getRefereeLanding();
            ActionHandlingFragment2.ContentWithDialog(this, ComposableLambda3.rememberComposableLambda(-526855878, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.6

                /* compiled from: RhyReferralsRefereeLandingFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$6$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ RefereeLanding $refereeLanding;
                    final /* synthetic */ RhyReferralsRefereeLandingViewState.Loaded $viewState;
                    final /* synthetic */ RhyReferralsRefereeLandingFragment this$0;

                    /* compiled from: RhyReferralsRefereeLandingFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$6$2$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[RhyReferralsRefereeLandingViewState.Loaded.CtaType.values().length];
                            try {
                                iArr[RhyReferralsRefereeLandingViewState.Loaded.CtaType.FUND_MY_ACCOUNT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[RhyReferralsRefereeLandingViewState.Loaded.CtaType.ADD_TO_GOOGLE_PAY.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[RhyReferralsRefereeLandingViewState.Loaded.CtaType.VIEW_CARD_NUMBER.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass2(RefereeLanding refereeLanding, RhyReferralsRefereeLandingViewState.Loaded loaded, RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
                        this.$refereeLanding = refereeLanding;
                        this.$viewState = loaded;
                        this.this$0 = rhyReferralsRefereeLandingFragment;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Function0 function0;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(666168124, i2, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.<anonymous>.<anonymous> (RhyReferralsRefereeLandingFragment.kt:236)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                        RefereeLanding refereeLanding = this.$refereeLanding;
                        final RhyReferralsRefereeLandingViewState.Loaded loaded = this.$viewState;
                        final RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment = this.this$0;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        ImmutableList3 persistentList = extensions2.toPersistentList(refereeLanding.getBody());
                        Modifier modifierWeight$default = Column5.weight$default(column6, companion, 1.0f, false, 2, null);
                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                        composer.startReplaceGroup(767440808);
                        SduiColumns.SduiLazyColumn(persistentList, GenericAction.class, modifierWeight$default, LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3), null, null, horizontalPadding, true, composer, 14155776, 0);
                        composer.endReplaceGroup();
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        ImmutableList3 persistentList2 = extensions2.toPersistentList(refereeLanding.getFooter());
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(persistentList2, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), true, composer, 100663296, 0);
                        composer.endReplaceGroup();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
                        String primaryCtaText = loaded.getPrimaryCtaText(composer, 0);
                        String secondaryCtaText = loaded.getSecondaryCtaText(composer, 0);
                        final RhyReferralsRefereeLandingViewState.Loaded.CtaType secondaryCtaType = loaded.getSecondaryCtaType();
                        composer.startReplaceGroup(-577385813);
                        if (secondaryCtaType == null) {
                            function0 = null;
                        } else {
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(rhyReferralsRefereeLandingFragment) | composer.changed(secondaryCtaType.ordinal());
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$6$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RhyReferralsRefereeLandingFragment.C275026.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$2$lambda$1$lambda$0(rhyReferralsRefereeLandingFragment, secondaryCtaType);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                        }
                        Function0 function02 = function0;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(loaded) | composer.changedInstance(rhyReferralsRefereeLandingFragment);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$6$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RhyReferralsRefereeLandingFragment.C275026.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4$lambda$3(loaded, rhyReferralsRefereeLandingFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue2, primaryCtaText, false, null, false, function02, secondaryCtaText, false, null, false, composer, 0, 0, 59198);
                        composer.endNode();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(RhyReferralsRefereeLandingViewState.Loaded loaded, RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
                        UserInteractionEventData.Action action;
                        int i = WhenMappings.$EnumSwitchMapping$0[loaded.getPrimaryCtaType().ordinal()];
                        if (i == 1) {
                            action = UserInteractionEventData.Action.VIEW_VIRTUAL_CARD;
                        } else if (i == 2) {
                            action = UserInteractionEventData.Action.SET_UP_MOBILE_WALLET;
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            action = UserInteractionEventData.Action.FUND;
                        }
                        EventLogger.DefaultImpls.logTap$default(rhyReferralsRefereeLandingFragment.getEventLogger(), action, rhyReferralsRefereeLandingFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(rhyReferralsRefereeLandingFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
                        rhyReferralsRefereeLandingFragment.getDuxo().ctaClicked(loaded.getPrimaryCtaType());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$2$lambda$1$lambda$0(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment, RhyReferralsRefereeLandingViewState.Loaded.CtaType ctaType) {
                        rhyReferralsRefereeLandingFragment.getDuxo().ctaClicked(ctaType);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-526855878, i3, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.<anonymous> (RhyReferralsRefereeLandingFragment.kt:204)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    final RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment = RhyReferralsRefereeLandingFragment.this;
                    final SnapshotState<Boolean> snapshotState3 = snapshotState2;
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(1444224405, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.6.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1444224405, i5, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.<anonymous>.<anonymous> (RhyReferralsRefereeLandingFragment.kt:208)");
                            }
                            long cosmonautLight = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getCosmonautLight();
                            Function2<Composer, Integer, Unit> function2M18288getLambda$1296184248$feature_rhy_referral_externalDebug = RhyReferralsRefereeLandingFragment2.INSTANCE.m18288getLambda$1296184248$feature_rhy_referral_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1569768588, true, new C505161(rhyReferralsRefereeLandingFragment), composer3, 54);
                            final RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment2 = rhyReferralsRefereeLandingFragment;
                            final SnapshotState<Boolean> snapshotState4 = snapshotState3;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M18288getLambda$1296184248$feature_rhy_referral_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-144442061, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.6.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                    invoke(row5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer4, int i6) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-144442061, i6, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.<anonymous>.<anonymous>.<anonymous> (RhyReferralsRefereeLandingFragment.kt:215)");
                                    }
                                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.HISTORY_24);
                                    String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_referrer_history, composer4, 0);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer4, i7).m21425getFg0d7_KjU();
                                    RhyReferralsRefereeLandingDuxo duxo3 = rhyReferralsRefereeLandingFragment2.getDuxo();
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer4.changedInstance(duxo3);
                                    Object objRememberedValue7 = composer4.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new RhyReferralsRefereeLandingFragment7(duxo3);
                                        composer4.updateRememberedValue(objRememberedValue7);
                                    }
                                    KFunction kFunction = (KFunction) objRememberedValue7;
                                    composer4.endReplaceGroup();
                                    Modifier modifier = Modifier.INSTANCE;
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier, bentoTheme2.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                    composer4.startReplaceGroup(-1369848521);
                                    if (RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded$lambda$20(snapshotState4)) {
                                        modifier = ModifiersKt.tooltip$default(modifier, StringResources_androidKt.stringResource(C27406R.string.rhy_referrer_landing_history_tooltip, composer4, 0), null, null, null, false, 30, null);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU2, modifierM5144paddingVpY3zN4$default.then(modifier), (Function0) kFunction, false, composer4, BentoIcon4.Size24.$stable, 32);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, false, false, null, Color.m6701boximpl(cosmonautLight), 0L, null, composer3, 3462, 0, 1778);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RhyReferralsRefereeLandingFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$6$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C505161 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ RhyReferralsRefereeLandingFragment this$0;

                            C505161(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
                                this.this$0 = rhyReferralsRefereeLandingFragment;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment) {
                                rhyReferralsRefereeLandingFragment.requireBaseActivity().finish();
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1569768588, i, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded.<anonymous>.<anonymous>.<anonymous> (RhyReferralsRefereeLandingFragment.kt:211)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final RhyReferralsRefereeLandingFragment rhyReferralsRefereeLandingFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$RhyReferralsRefereeLandingLoaded$6$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhyReferralsRefereeLandingFragment.C275026.AnonymousClass1.C505161.invoke$lambda$1$lambda$0(rhyReferralsRefereeLandingFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composer2, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(666168124, true, new AnonymousClass2(refereeLanding, loaded, RhyReferralsRefereeLandingFragment.this), composer2, 54), composer2, 384, 12582912, 32763);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsRefereeLandingFragment.RhyReferralsRefereeLandingLoaded$lambda$23(this.f$0, loaded, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsRefereeLandingLoaded$lambda$16$lambda$15$lambda$14(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RhyReferralsRefereeLandingLoaded$lambda$21(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private final void DebugAddCardToGooglePayDialog(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(927752986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(927752986, i2, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.DebugAddCardToGooglePayDialog (RhyReferralsRefereeLandingFragment.kt:291)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(932730725, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.DebugAddCardToGooglePayDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(932730725, i3, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment.DebugAddCardToGooglePayDialog.<anonymous> (RhyReferralsRefereeLandingFragment.kt:293)");
                    }
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text("Fake adding a card to Google Wallet");
                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.PAYMENT_CARD;
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), function0);
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer2, 0), function02);
                    Function0<Unit> function03 = function02;
                    int i4 = (BentoAlertDialog2.Body.Text.$stable << 3) | 196614;
                    int i5 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog("Test Add Card to Google Wallet", text, bentoAlertButton, null, bentoAlertButton2, serverToBentoAssetMapper3, false, null, function03, composer2, i4 | (i5 << 6) | (i5 << 12), 200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsRefereeLandingFragment.DebugAddCardToGooglePayDialog$lambda$24(this.f$0, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RhyReferralsRefereeLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/rhy/contracts/RhyRefereeLandingKey;", "<init>", "()V", "REQUEST_PUSH_TOKENIZE", "", "createFragment", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingFragment;", "key", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RhyRefereeLandingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RhyReferralsRefereeLandingFragment createFragment(RhyRefereeLandingKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyReferralsRefereeLandingFragment();
        }
    }
}
