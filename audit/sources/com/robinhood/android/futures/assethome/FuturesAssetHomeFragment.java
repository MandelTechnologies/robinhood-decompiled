package com.robinhood.android.futures.assethome;

import android.net.Uri;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.extensions.BaseFragments3;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.educationtour.interfaces.EducationTourCallbacks;
import com.robinhood.android.futures.assethome.FuturesAssetHomeEvent;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartViewState;
import com.robinhood.android.futures.contracts.FuturesAssetHomeFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PortfolioAccountContext;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: FuturesAssetHomeFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001;B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010$\u001a\u00020%H\u0017¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020%H\u0016J\u001d\u0010/\u001a\u00020%2\u000e\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0003¢\u0006\u0002\u00103J\b\u00104\u001a\u00020%H\u0002J\t\u00105\u001a\u00020\tH\u0096\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u00060 j\u0002`!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<²\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020@X\u008a\u0084\u0002²\u0006\u0012\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeScreenCallbacks;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "hasBottomBar", "getHasBottomBar", "duxo", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "chartDuxo", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDuxo;", "getChartDuxo", "()Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDuxo;", "chartDuxo$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackFromAssetHome", "onSearchPressed", "handleDeeplink", "uri", "", "onViewAllFuturesPressed", "onShowEducationTour", "onHideEducationTour", "HandleEvents", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeEvent;", "(Lcom/robinhood/android/udf/event/Event;Landroidx/compose/runtime/Composer;I)V", "showEducationTour", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-futures-asset-home_externalDebug", "state", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;", "chartState", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesAssetHomeFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated, FuturesAssetHomeScreen3, EducationTourCallbacks {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesAssetHomeDuxo.class);

    /* renamed from: chartDuxo$delegate, reason: from kotlin metadata */
    private final Lazy chartDuxo = DuxosKt.duxo(this, FuturesAssetHomeChartDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(FuturesAssetHomeFragment futuresAssetHomeFragment, int i, Composer composer, int i2) {
        futuresAssetHomeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEvents$lambda$5(FuturesAssetHomeFragment futuresAssetHomeFragment, Event event, int i, Composer composer, int i2) {
        futuresAssetHomeFragment.HandleEvents(event, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEvents$lambda$7(FuturesAssetHomeFragment futuresAssetHomeFragment, Event event, int i, Composer composer, int i2) {
        futuresAssetHomeFragment.HandleEvents(event, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onShowEducationTour() {
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesAssetHomeDuxo getDuxo() {
        return (FuturesAssetHomeDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesAssetHomeChartDuxo getChartDuxo() {
        return (FuturesAssetHomeChartDuxo) this.chartDuxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ASSET_HOME, "FUTURES", "FUTURES", null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, ((FuturesAssetHomeFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PortfolioAccountContext(PortfolioAccountType.INDIVIDUAL, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -131073, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(691583584);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(691583584, i2, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeFragment.ComposeContent (FuturesAssetHomeFragment.kt:64)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getChartDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            ScreenLoggable2.ScreenLoggable(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingState(), new UserInteractionEventDescriptor(getEventScreen().getIdentifier(), getEventScreen(), null, getScreenEventContext(), null, null, 52, null), false, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1775239298, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1775239298, i3, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeFragment.ComposeContent.<anonymous> (FuturesAssetHomeFragment.kt:75)");
                    }
                    FuturesAssetHomeViewState futuresAssetHomeViewStateComposeContent$lambda$0 = FuturesAssetHomeFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    FuturesAssetHomeChartViewState futuresAssetHomeChartViewStateComposeContent$lambda$1 = FuturesAssetHomeFragment.ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    FuturesAssetHomeDuxo duxo = FuturesAssetHomeFragment.this.getDuxo();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(duxo);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new FuturesAssetHomeFragment2(duxo);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    FuturesAssetHomeScreen4.FuturesAssetHomeScreen(futuresAssetHomeViewStateComposeContent$lambda$0, futuresAssetHomeChartViewStateComposeContent$lambda$1, FuturesAssetHomeFragment.this, FuturesAssetHomeFragment.this.getChartDuxo(), (Function1) ((KFunction) objRememberedValue), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            HandleEvents(ComposeContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, (i2 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesAssetHomeViewState ComposeContent$lambda$0(SnapshotState4<FuturesAssetHomeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesAssetHomeChartViewState ComposeContent$lambda$1(SnapshotState4<FuturesAssetHomeChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<FuturesAssetHomeEvent> ComposeContent$lambda$2(SnapshotState4<Event<FuturesAssetHomeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.futures.assethome.FuturesAssetHomeScreen3
    public void onBackFromAssetHome() {
        popNearestParentBackStack();
    }

    @Override // com.robinhood.android.futures.assethome.FuturesAssetHomeScreen3
    public void onSearchPressed() {
        android.content.Context context = getContext();
        if (context != null) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), context, new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
    }

    @Override // com.robinhood.android.futures.assethome.FuturesAssetHomeScreen3
    public void handleDeeplink(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(uri), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.futures.assethome.FuturesAssetHomeScreen3
    public void onViewAllFuturesPressed() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, CuratedListKey.INSTANCE.getFuturesListKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onHideEducationTour() {
        getDuxo().onEducationTourHide();
    }

    private final void HandleEvents(final Event<FuturesAssetHomeEvent> event, Composer composer, final int i) {
        int i2;
        EventConsumer<FuturesAssetHomeEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-815652078);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-815652078, i2, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeFragment.HandleEvents (FuturesAssetHomeFragment.kt:115)");
            }
            if (event != null) {
                if ((event.getData() instanceof FuturesAssetHomeEvent.ShowEducationTour) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeFragment$HandleEvents$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14540invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14540invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            this.showEducationTour();
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FuturesAssetHomeFragment.HandleEvents$lambda$5(this.f$0, event, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeFragment.HandleEvents$lambda$7(this.f$0, event, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEducationTour() {
        ViewsKt.setEducationTourScreenName(getRootView(), EducationTourScreenNames.ASSET_HOME_FUTURES);
        BaseFragments3.showEducationTour(this, EducationTourScreenNames.ASSET_HOME_FUTURES, getEventScreen().getIdentifier(), this, true, true);
    }

    /* compiled from: FuturesAssetHomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeFragment;", "Lcom/robinhood/android/futures/contracts/FuturesAssetHomeFragmentKey;", "<init>", "()V", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<FuturesAssetHomeFragment, FuturesAssetHomeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(FuturesAssetHomeFragmentKey futuresAssetHomeFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, futuresAssetHomeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FuturesAssetHomeFragmentKey getArgs(FuturesAssetHomeFragment futuresAssetHomeFragment) {
            return (FuturesAssetHomeFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, futuresAssetHomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FuturesAssetHomeFragment newInstance(FuturesAssetHomeFragmentKey futuresAssetHomeFragmentKey) {
            return (FuturesAssetHomeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, futuresAssetHomeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FuturesAssetHomeFragment futuresAssetHomeFragment, FuturesAssetHomeFragmentKey futuresAssetHomeFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, futuresAssetHomeFragment, futuresAssetHomeFragmentKey);
        }
    }
}
