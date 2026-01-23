package com.robinhood.android.rollover401k.steps;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.rollover401k.C27696R;
import com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Rollover401kAccountNumbersFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0003HIJB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0014J\r\u0010.\u001a\u00020(H\u0017¢\u0006\u0002\u0010/J\u0019\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u000102H\u0001¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0003¢\u0006\u0002\u00104J\u0015\u00106\u001a\u00020(2\u0006\u00107\u001a\u000208H\u0003¢\u0006\u0002\u00109J\r\u0010:\u001a\u00020(H\u0003¢\u0006\u0002\u0010/J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0004H\u0016J\u001a\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010@H\u0002J\t\u0010B\u001a\u00020<H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K²\u0006\f\u0010L\u001a\u0004\u0018\u00010MX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "retirement401kRolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "getRetirement401kRolloverStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "setRetirement401kRolloverStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "activity", "Landroid/app/Activity;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "DialogContent", "viewModel", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumbersViewModel;", "DialogContent$feature_rollover_401k_externalDebug", "(Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumbersViewModel;Landroidx/compose/runtime/Composer;I)V", "AccountNumbers", "AccountNumberRow", "row", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;", "(Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;Landroidx/compose/runtime/Composer;I)V", "LoadingState", "handle", "", "action", "copyAccountNumberToClipboard", "accountNumber", "", "accountName", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rollover-401k_externalDebug", "viewState", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Rollover401kAccountNumbersFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated, SduiActionHandler<GenericAction> {
    public static final int DEFAULT_NUMBERS_TO_SHOW = 4;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof Rollover401kAccountNumbersFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public EventLogger eventLogger;
    public Retirement401kRolloverStore retirement401kRolloverStore;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Rollover401kAccountNumbersFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Rollover401kAccountNumbersFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Callbacks;", "", "onRequestAuthentication", "", "account", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$AccountNumberRow;", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRequestAuthentication(Retirement401kRolloverViewModel.AccountNumberRow account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountNumberRow$lambda$8(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, Retirement401kRolloverViewModel.AccountNumberRow accountNumberRow, int i, Composer composer, int i2) {
        rollover401kAccountNumbersFragment.AccountNumberRow(accountNumberRow, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountNumbers$lambda$5(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, Retirement401kRolloverViewModel.AccountNumbersViewModel accountNumbersViewModel, int i, Composer composer, int i2) {
        rollover401kAccountNumbersFragment.AccountNumbers(accountNumbersViewModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, int i, Composer composer, int i2) {
        rollover401kAccountNumbersFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DialogContent$lambda$2(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, Retirement401kRolloverViewModel.AccountNumbersViewModel accountNumbersViewModel, int i, Composer composer, int i2) {
        rollover401kAccountNumbersFragment.DialogContent$feature_rollover_401k_externalDebug(accountNumbersViewModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingState$lambda$12(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, int i, Composer composer, int i2) {
        rollover401kAccountNumbersFragment.LoadingState(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final Retirement401kRolloverStore getRetirement401kRolloverStore() {
        Retirement401kRolloverStore retirement401kRolloverStore = this.retirement401kRolloverStore;
        if (retirement401kRolloverStore != null) {
            return retirement401kRolloverStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirement401kRolloverStore");
        return null;
    }

    public final void setRetirement401kRolloverStore(Retirement401kRolloverStore retirement401kRolloverStore) {
        Intrinsics.checkNotNullParameter(retirement401kRolloverStore, "<set-?>");
        this.retirement401kRolloverStore = retirement401kRolloverStore;
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Screen getEventScreen() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).isForCapitalize()) {
            return new Screen(Screen.Name.RETIREMENT_401K_ROLLOVER_CAPITALIZE, null, null, null, 14, null);
        }
        return new Screen(Screen.Name.RETIREMENT_401K_ROLLOVER_DIY, null, null, null, 14, null);
    }

    private final Component getEventComponent() {
        String str;
        Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
        if (((Args) INSTANCE.getArgs((Fragment) this)).isForCapitalize()) {
            str = "rollover_401k_account_numbers_capitalize";
        } else {
            str = "rollover_401k_account_numbers_diy";
        }
        return new Component(componentType, str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retirement401kRolloverViewModel ComposeContent$lambda$0(SnapshotState4<Retirement401kRolloverViewModel> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (((Args) INSTANCE.getArgs((Fragment) this)).isForCapitalize()) {
            getUserLeapManager().track(TrackingEvent.ROLLOVER_END_CAPITALIZE);
        }
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), getEventComponent(), null, null, 25, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onDismiss(activity);
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), getEventComponent(), null, null, 25, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-640229317);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640229317, i2, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.ComposeContent (Rollover401kAccountNumbersFragment.kt:111)");
            }
            Flow flowRetirement401kRolloverQuery$default = Retirement401kRolloverStore.retirement401kRolloverQuery$default(getRetirement401kRolloverStore(), false, 1, null);
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((Flow<? extends Object>) flowRetirement401kRolloverQuery$default, (Object) null, lifecycle, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 48, 12);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1555666662, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    Retirement401kRolloverViewModel.RolloverViewModels rolloverViewModels;
                    Retirement401kRolloverViewModel.RolloverViewModels rolloverViewModels2;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1555666662, i3, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.ComposeContent.<anonymous> (Rollover401kAccountNumbersFragment.kt:124)");
                    }
                    Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment = Rollover401kAccountNumbersFragment.this;
                    Retirement401kRolloverViewModel.AccountNumbersViewModel accountNumbersDiyViewModel = null;
                    if (((Args) Rollover401kAccountNumbersFragment.INSTANCE.getArgs((Fragment) rollover401kAccountNumbersFragment)).isForCapitalize()) {
                        Retirement401kRolloverViewModel retirement401kRolloverViewModelComposeContent$lambda$0 = Rollover401kAccountNumbersFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (retirement401kRolloverViewModelComposeContent$lambda$0 != null && (rolloverViewModels2 = retirement401kRolloverViewModelComposeContent$lambda$0.getRolloverViewModels()) != null) {
                            accountNumbersDiyViewModel = rolloverViewModels2.getAccountNumbersCapitalizeViewModel();
                        }
                    } else {
                        Retirement401kRolloverViewModel retirement401kRolloverViewModelComposeContent$lambda$02 = Rollover401kAccountNumbersFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (retirement401kRolloverViewModelComposeContent$lambda$02 != null && (rolloverViewModels = retirement401kRolloverViewModelComposeContent$lambda$02.getRolloverViewModels()) != null) {
                            accountNumbersDiyViewModel = rolloverViewModels.getAccountNumbersDiyViewModel();
                        }
                    }
                    rollover401kAccountNumbersFragment.DialogContent$feature_rollover_401k_externalDebug(accountNumbersDiyViewModel, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kAccountNumbersFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void DialogContent$feature_rollover_401k_externalDebug(final Retirement401kRolloverViewModel.AccountNumbersViewModel accountNumbersViewModel, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(215508842);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(accountNumbersViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(215508842, i2, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.DialogContent (Rollover401kAccountNumbersFragment.kt:137)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1159916277, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$DialogContent$1
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
                        ComposerKt.traceEventStart(1159916277, i3, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.DialogContent.<anonymous> (Rollover401kAccountNumbersFragment.kt:139)");
                    }
                    if (accountNumbersViewModel == null) {
                        composer2.startReplaceGroup(2053949919);
                        this.LoadingState(composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(2054002216);
                        this.AccountNumbers(accountNumbersViewModel, composer2, 0);
                        composer2.endReplaceGroup();
                    }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kAccountNumbersFragment.DialogContent$lambda$2(this.f$0, accountNumbersViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountNumbers(final Retirement401kRolloverViewModel.AccountNumbersViewModel accountNumbersViewModel, Composer composer, final int i) {
        int i2;
        final Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment;
        Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment2 = this;
        Composer composerStartRestartGroup = composer.startRestartGroup(694398162);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(accountNumbersViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rollover401kAccountNumbersFragment2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            rollover401kAccountNumbersFragment = rollover401kAccountNumbersFragment2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694398162, i2, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.AccountNumbers (Rollover401kAccountNumbersFragment.kt:150)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "AccountNumbers");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(accountNumbersViewModel.getTitle(), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            List<UIComponent<GenericAction>> content = accountNumbersViewModel.getContent();
            Modifier modifierTestTag2 = TestTag3.testTag(companion, "Content");
            int i4 = (i2 << 6) & 7168;
            composerStartRestartGroup.startReplaceGroup(1510558093);
            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
            ImmutableList3 persistentList = extensions2.toPersistentList(content);
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            int i5 = i2;
            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierTestTag2, null, rollover401kAccountNumbersFragment2, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composerStartRestartGroup, 100663680 | (((((196656 | i4) & 7168) | 12582960) << 3) & 57344), 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1663539738);
            Iterator<T> it = accountNumbersViewModel.getRows().iterator();
            while (it.hasNext()) {
                rollover401kAccountNumbersFragment2.AccountNumberRow((Retirement401kRolloverViewModel.AccountNumberRow) it.next(), composerStartRestartGroup, i5 & 112);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1663543562);
            if (!accountNumbersViewModel.getBelowRowsContent().isEmpty()) {
                List<UIComponent<GenericAction>> belowRowsContent = accountNumbersViewModel.getBelowRowsContent();
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, "BelowRowsContent"), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(1510558093);
                HorizontalPadding horizontalPadding2 = HorizontalPadding.Default;
                ImmutableList3 persistentList2 = extensions2.toPersistentList(belowRowsContent);
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                SduiColumns.SduiColumn(persistentList2, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, rollover401kAccountNumbersFragment2, horizontalPadding2, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composerStartRestartGroup, (((((i4 | 196608) & 7168) | 12582912) << 3) & 57344) | 100663296, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            List<UIComponent<GenericAction>> footer = accountNumbersViewModel.getFooter();
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, "Footer"), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(1510558093);
            HorizontalPadding horizontalPadding3 = HorizontalPadding.Default;
            ImmutableList3 persistentList3 = extensions2.toPersistentList(footer);
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment3 = this;
            SduiColumns.SduiColumn(persistentList3, GenericAction.class, modifierM5146paddingqDBjuR0$default2, null, rollover401kAccountNumbersFragment3, horizontalPadding3, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composerStartRestartGroup, (((((i4 | 196608) & 7168) | 12582912) << 3) & 57344) | 100663296, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            rollover401kAccountNumbersFragment = rollover401kAccountNumbersFragment3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                rollover401kAccountNumbersFragment = rollover401kAccountNumbersFragment3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kAccountNumbersFragment.AccountNumbers$lambda$5(this.f$0, accountNumbersViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void AccountNumberRow(final Retirement401kRolloverViewModel.AccountNumberRow accountNumberRow, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-113262398);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(accountNumberRow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-113262398, i2, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.AccountNumberRow (Rollover401kAccountNumbersFragment.kt:196)");
            }
            final String accountNumber = accountNumberRow.getAccountNumber();
            composerStartRestartGroup.startReplaceGroup(-1470975942);
            String strStringResource = ((Args) INSTANCE.getArgs((Fragment) this)).isAuthenticated() ? accountNumber : StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_number_masked, new Object[]{StringsKt.takeLast(accountNumber, 4)}, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            String accountName = accountNumberRow.getAccountName();
            BentoSettingsRows.EndElement.Icon icon = new BentoSettingsRows.EndElement.Icon(ServerToBentoAssetMapper2.COPY_16, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(accountNumber) | composerStartRestartGroup.changedInstance(accountNumberRow);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Rollover401kAccountNumbersFragment.AccountNumberRow$lambda$7$lambda$6(this.f$0, accountNumber, accountNumberRow);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, accountName, strStringResource, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) icon, false, false, (Function0<Unit>) objRememberedValue, composerStartRestartGroup, BentoSettingsRows.EndElement.Icon.$stable << 12, 105);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kAccountNumbersFragment.AccountNumberRow$lambda$8(this.f$0, accountNumberRow, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountNumberRow$lambda$7$lambda$6(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, String str, Retirement401kRolloverViewModel.AccountNumberRow accountNumberRow) throws Resources.NotFoundException {
        if (((Args) INSTANCE.getArgs((Fragment) rollover401kAccountNumbersFragment)).isAuthenticated()) {
            rollover401kAccountNumbersFragment.copyAccountNumberToClipboard(str, accountNumberRow.getAccountName());
        } else {
            rollover401kAccountNumbersFragment.getCallbacks().onRequestAuthentication(accountNumberRow);
            rollover401kAccountNumbersFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LoadingState(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-735254835);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-735254835, i, -1, "com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment.LoadingState (Rollover401kAccountNumbersFragment.kt:221)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "LoadingColumn");
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw("", SizeKt.fillMaxWidth(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), 0.0f, 8, null), true, null, 2, null), 0.67f), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getDisplayCapsuleMedium(), composerStartRestartGroup, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("", SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM()), true, null, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16380);
            LocalShowPlaceholder.Loadable(true, null, null, Rollover401kAccountNumbersFragment2.INSTANCE.getLambda$1410858835$feature_rollover_401k_externalDebug(), composerStartRestartGroup, 3078, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", SizeKt.fillMaxWidth$default(ModifiersKt.bentoPillPlaceholder(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM()), true), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 54, 0, 8184);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kAccountNumbersFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kAccountNumbersFragment.LoadingState$lambda$12(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        }
        if (!(action instanceof GenericAction.Dismiss)) {
            return false;
        }
        dismiss();
        return true;
    }

    private final void copyAccountNumberToClipboard(String accountNumber, String accountName) throws Resources.NotFoundException {
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        if (accountName == null) {
            accountName = "";
        }
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        clipboardUtil.copyToClipboardWithHapticFeedback(accountNumber, accountName, viewRequireView, true);
    }

    /* compiled from: Rollover401kAccountNumbersFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Args;", "Landroid/os/Parcelable;", "isForCapitalize", "", "isAuthenticated", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isAuthenticated;
        private final boolean isForCapitalize;

        /* compiled from: Rollover401kAccountNumbersFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isForCapitalize;
            }
            if ((i & 2) != 0) {
                z2 = args.isAuthenticated;
            }
            return args.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsForCapitalize() {
            return this.isForCapitalize;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAuthenticated() {
            return this.isAuthenticated;
        }

        public final Args copy(boolean isForCapitalize, boolean isAuthenticated) {
            return new Args(isForCapitalize, isAuthenticated);
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
            return this.isForCapitalize == args.isForCapitalize && this.isAuthenticated == args.isAuthenticated;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isForCapitalize) * 31) + Boolean.hashCode(this.isAuthenticated);
        }

        public String toString() {
            return "Args(isForCapitalize=" + this.isForCapitalize + ", isAuthenticated=" + this.isAuthenticated + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isForCapitalize ? 1 : 0);
            dest.writeInt(this.isAuthenticated ? 1 : 0);
        }

        public Args(boolean z, boolean z2) {
            this.isForCapitalize = z;
            this.isAuthenticated = z2;
        }

        public final boolean isForCapitalize() {
            return this.isForCapitalize;
        }

        public final boolean isAuthenticated() {
            return this.isAuthenticated;
        }
    }

    /* compiled from: Rollover401kAccountNumbersFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kAccountNumbersFragment$Args;", "<init>", "()V", "DEFAULT_NUMBERS_TO_SHOW", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<Rollover401kAccountNumbersFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rollover401kAccountNumbersFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public Rollover401kAccountNumbersFragment newInstance(Args args) {
            return (Rollover401kAccountNumbersFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(Rollover401kAccountNumbersFragment rollover401kAccountNumbersFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rollover401kAccountNumbersFragment, args);
        }
    }
}
