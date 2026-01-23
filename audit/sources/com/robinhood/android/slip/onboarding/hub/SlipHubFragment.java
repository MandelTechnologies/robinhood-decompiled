package com.robinhood.android.slip.onboarding.hub;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.margin.contracts.SlipOnboardingKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.hub.SlipHubFragment;
import com.robinhood.android.slip.onboarding.hub.SlipHubViewState;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003QRSB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\r\u00103\u001a\u000200H\u0017¢\u0006\u0002\u00104J\u001a\u00105\u001a\u0002002\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0002J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u000209H\u0002J\u0010\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000200H\u0002J\b\u0010@\u001a\u000200H\u0002J\u0010\u0010A\u001a\u0002002\u0006\u0010B\u001a\u000209H\u0002J\b\u0010C\u001a\u000200H\u0002J\u0010\u0010D\u001a\u0002002\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010G\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u000200H\u0016J\t\u0010K\u001a\u00020*H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MX\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T²\u0006\n\u0010U\u001a\u00020VX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/onboarding/hub/SlipHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "toolbarVisible", "getToolbarVisible", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onClickInstrumentRow", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "onClickTitleIcon", "deeplinkUrl", "onClickAccountChip", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "redirectToOnboarding", "showSlipHubUnavailableDialog", "showSnackbar", "message", "showUpdateSlipConsentStatusErrorDialog", "onDialogDismissed", "id", "", "onAccountSelected", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAllAccountsSelected", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-slip_externalDebug", "viewState", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipHubFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment, LocalAccountSwitcherCallbacks {
    private static final int FEATURE_UNAVAILABLE_DIALOG_ID = 501;
    public EventLogger eventLogger;
    public Markwon markwon;
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SlipHubFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, SlipHubDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SlipHubFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.SLIP_HUB, null, null, null, 14, null);
    private final boolean excludeFromAutoScreenDisappearEventLogging = true;

    /* compiled from: SlipHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Callbacks;", "", "onSettingsTap", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSettingsTap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$16(SlipHubFragment slipHubFragment, int i, Composer composer, int i2) {
        slipHubFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        LocalAccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks, com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onRefreshAccountsClicked(this);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    private final SlipHubDuxo getDuxo() {
        return (SlipHubDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        getDuxo().updateSelectedAccountNumber(((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Function0 function0;
        SlipHubViewState.Result resultConsume;
        Composer composerStartRestartGroup = composer.startRestartGroup(-794300229);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-794300229, i2, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubFragment.ComposeContent (SlipHubFragment.kt:71)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new SlipHubViewState(false, null, null, null, null, null, null, null, null, 511, null), composerStartRestartGroup, 0);
            UiEvent<Unit> slipUnavailableEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getSlipUnavailableEvent();
            if ((slipUnavailableEvent != null ? slipUnavailableEvent.consume() : null) != null) {
                showSlipHubUnavailableDialog();
            }
            UiEvent<Unit> disableSlipSurveyEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getDisableSlipSurveyEvent();
            if ((disableSlipSurveyEvent != null ? disableSlipSurveyEvent.consume() : null) != null) {
                getUserLeapManager().presentSurveyIfNecessary(this, Survey.SLIP_DISABLE_REASON);
            }
            UiEvent<Unit> redirectToOnboardingEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getRedirectToOnboardingEvent();
            if ((redirectToOnboardingEvent != null ? redirectToOnboardingEvent.consume() : null) != null) {
                redirectToOnboarding();
            }
            UiEvent<SlipHubViewState.Result> updateConsentEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getUpdateConsentEvent();
            if (updateConsentEvent != null && (resultConsume = updateConsentEvent.consume()) != null) {
                if (resultConsume instanceof SlipHubViewState.Result.Success) {
                    showSnackbar(((SlipHubViewState.Result.Success) resultConsume).getToastMessage());
                } else {
                    if (!(resultConsume instanceof SlipHubViewState.Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showUpdateSlipConsentStatusErrorDialog();
                }
            }
            SlipHubViewState slipHubViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4SubscribeAsState);
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            final HubPageViewModel hubPageViewModelCurrentPageViewModel = slipHubViewStateComposeContent$lambda$0.currentPageViewModel(resources);
            if (hubPageViewModelCurrentPageViewModel != null) {
                Navigator navigator = getNavigator();
                int i3 = i2;
                Markwon markwon = getMarkwon();
                boolean zIsLoading = ComposeContent$lambda$0(snapshotState4SubscribeAsState).isLoading();
                boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SlipHubFragment2(this);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Callbacks callbacks = getCallbacks();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SlipHubFragment3(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1181739802);
                if (ComposeContent$lambda$0(snapshotState4SubscribeAsState).getOverrideOnClickEnableCta()) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlipHubFragment.ComposeContent$lambda$15$lambda$5$lambda$4(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function1 function1 = (Function1) kFunction;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(hubPageViewModelCurrentPageViewModel) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlipHubFragment.ComposeContent$lambda$15$lambda$8$lambda$7(hubPageViewModelCurrentPageViewModel, this);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(hubPageViewModelCurrentPageViewModel) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlipHubFragment.ComposeContent$lambda$15$lambda$10$lambda$9(hubPageViewModelCurrentPageViewModel, this, (UUID) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function12 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Function0 function03 = (Function0) kFunction2;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlipHubFragment.ComposeContent$lambda$15$lambda$12$lambda$11(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function0 function04 = (Function0) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(hubPageViewModelCurrentPageViewModel) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlipHubFragment.ComposeContent$lambda$15$lambda$14$lambda$13(hubPageViewModelCurrentPageViewModel, this, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                SlipHubComposable3.SlipHubComposable(navigator, markwon, zIsLoading, isDay, this, function1, function02, function12, function03, function04, (Function1) objRememberedValue7, hubPageViewModelCurrentPageViewModel, modifierFillMaxSize$default, function0, composerStartRestartGroup, (i3 << 12) & 57344, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipHubFragment.ComposeContent$lambda$16(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SlipHubViewState ComposeContent$lambda$0(SnapshotState4<SlipHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$8$lambda$7(HubPageViewModel hubPageViewModel, SlipHubFragment slipHubFragment) {
        AccountSwitcherData accountSwitcherData = hubPageViewModel.getAccountSwitcherData();
        if (accountSwitcherData != null) {
            slipHubFragment.onClickAccountChip(accountSwitcherData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$10$lambda$9(HubPageViewModel hubPageViewModel, SlipHubFragment slipHubFragment, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        HubPageViewModel2 hubPageViewModel2 = hubPageViewModel instanceof HubPageViewModel2 ? (HubPageViewModel2) hubPageViewModel : null;
        slipHubFragment.onClickInstrumentRow(instrumentId, hubPageViewModel2 != null ? hubPageViewModel2.getAccountNumber() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$12$lambda$11(SlipHubFragment slipHubFragment) {
        slipHubFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$14$lambda$13(HubPageViewModel hubPageViewModel, SlipHubFragment slipHubFragment, boolean z) {
        if (hubPageViewModel instanceof HubPageViewModel2) {
            SlipHubEventLogger.INSTANCE.logTapForConsentStatusUpdate(slipHubFragment.getEventLogger(), slipHubFragment.getEventScreen(), z);
            slipHubFragment.getDuxo().updateAccountStatus(((HubPageViewModel2) hubPageViewModel).getAccountNumber(), z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$5$lambda$4(SlipHubFragment slipHubFragment) {
        slipHubFragment.getCallbacks().onSettingsTap();
        return Unit.INSTANCE;
    }

    private final void onClickInstrumentRow(UUID instrumentId, String accountNumber) {
        SlipHubEventLogger.INSTANCE.logInstrumentRowTap(getEventLogger(), getEventScreen());
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrumentId, null, accountNumber, InstrumentDetailSource.SLIP_HUB, false, 18, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* compiled from: SlipHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubFragment$onClickTitleIcon$1", m3645f = "SlipHubFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$onClickTitleIcon$1 */
    static final class C286681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $deeplinkUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286681(String str, Continuation<? super C286681> continuation) {
            super(2, continuation);
            this.$deeplinkUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipHubFragment.this.new C286681(this.$deeplinkUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = SlipHubFragment.this.getNavigator();
                Context contextRequireContext = SlipHubFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Uri uri = Uri.parse(this.$deeplinkUrl);
                this.label = 1;
                if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, null, this, 28, null) == coroutine_suspended) {
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
    public final void onClickTitleIcon(String deeplinkUrl) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C286681(deeplinkUrl, null), 3, null);
    }

    private final void onClickAccountChip(AccountSwitcherData accountSwitcherData) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(accountSwitcherData), null, 2, null).show(getChildFragmentManager(), "slip-hub-account-switcher");
    }

    private final void redirectToOnboarding() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new SlipOnboardingKey("hub_redirect", null, false, false, 14, null), null, false, null, null, 60, null);
        requireActivity().finish();
    }

    private final void showSlipHubUnavailableDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message = companion.create(contextRequireContext).setId(FEATURE_UNAVAILABLE_DIALOG_ID).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C28532R.string.slip_hub_unavailable_dialog_message, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, childFragmentManager, "slip-hub-unavailable-dialog", false, 4, null);
    }

    private final void showSnackbar(String message) {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        companion.make(viewRequireView, message, -1).show();
    }

    private final void showUpdateSlipConsentStatusErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.general_error_summary, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, childFragmentManager, "slip-hub-update-consent-error", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        super.onDialogDismissed(id);
        if (id == FEATURE_UNAVAILABLE_DIALOG_ID) {
            requireBaseActivity().onBackPressed();
        }
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().updateSelectedAccountNumber(accountNumber);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        getDuxo().updateSelectedAccountNumber(null);
    }

    /* compiled from: SlipHubFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: SlipHubFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            return new Args(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            String str = this.accountNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public Args(String str) {
            this.accountNumber = str;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: SlipHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubFragment$Args;", "<init>", "()V", "FEATURE_UNAVAILABLE_DIALOG_ID", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SlipHubFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SlipHubFragment slipHubFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, slipHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipHubFragment newInstance(Args args) {
            return (SlipHubFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipHubFragment slipHubFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, slipHubFragment, args);
        }
    }
}
