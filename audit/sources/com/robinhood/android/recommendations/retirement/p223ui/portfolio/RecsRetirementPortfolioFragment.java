package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioFragment;
import com.robinhood.android.regiongate.RecommendationsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecsRetirementPortfolioFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003?@AB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\r\u0010$\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010%J*\u0010&\u001a\u00020\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020,0+H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0016J(\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H\u0016J\u0010\u00106\u001a\u00020\u001e2\u0006\u00101\u001a\u00020)H\u0016J\b\u00107\u001a\u00020\u001eH\u0016J\t\u00108\u001a\u000209H\u0096\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B²\u0006\n\u0010C\u001a\u00020DX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "topHalfBackground", "", "callbacks", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onContinueClicked", "assetIds", "", "Ljava/util/UUID;", "allocationMap", "", "", "onProspectusClicked", "prospectus", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$Prospectus;", "onLearnMoreClicked", "assetId", "allocation", "title", "", ResourceTypes.COLOR, "onRowExpanded", "onRowCollapsed", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-recommendations-for-retirement_externalDebug", "viewState", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecsRetirementPortfolioFragment extends GenericActionHandlingFragment implements RecsRetirementPortfolioContent3, RegionGated, AutoLoggableFragment {
    public static final int $stable = 0;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecsRetirementPortfolioFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RecommendationsRegionGate.INSTANCE, RetirementRegionGate.INSTANCE);
    private final int topHalfBackground = C20690R.attr.colorBackground2;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RecsRetirementPortfolioFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RecsRetirementPortfolioDuxo.class);

    /* compiled from: RecsRetirementPortfolioFragment.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J2\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Callbacks;", "", "onContinueFromPortfolio", "", "recommendationId", "Ljava/util/UUID;", "onContinueToInvestFlowCheckout", "instrumentIds", "", "allocationMap", "", "", "onViewProspectus", "prospectus", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$Prospectus;", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueFromPortfolio(UUID recommendationId);

        void onContinueToInvestFlowCheckout(UUID recommendationId, List<UUID> instrumentIds, Map<UUID, Float> allocationMap);

        void onViewProspectus(ApiRecsRetirementPortfolio.Prospectus prospectus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(RecsRetirementPortfolioFragment recsRetirementPortfolioFragment, int i, Composer composer, int i2) {
        recsRetirementPortfolioFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RecsRetirementPortfolioDuxo getDuxo() {
        return (RecsRetirementPortfolioDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name;
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).isReorder()) {
            name = Screen.Name.RECS_RET_BUY_AGAIN;
        } else {
            name = Screen.Name.RECS_RET_PORTFOLIO;
        }
        String string2 = ((Args) companion.getArgs((Fragment) this)).getRecommendationId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, null, null, null, 125, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<Throwable> errorEvent = ((RecsRetirementPortfolioViewState) it).getErrorEvent();
                return Optional3.asOptional(errorEvent != null ? errorEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RecsRetirementPortfolioFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioFragment.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementPortfolioViewState ComposeContent$lambda$4(SnapshotState4<RecsRetirementPortfolioViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecsRetirementPortfolioFragment recsRetirementPortfolioFragment, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = recsRetirementPortfolioFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, t, false, false, 0, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioFragment.onViewCreated$lambda$3$lambda$2(view, this, (DayNightOverlay) obj);
            }
        });
        BaseFragments2.setContentBelowToolbar(this, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(View view, RecsRetirementPortfolioFragment recsRetirementPortfolioFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context contextRequireContext = recsRetirementPortfolioFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        view.setBackgroundColor(ThemeColors.getThemeColor(contextRequireContext, recsRetirementPortfolioFragment.topHalfBackground));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1717171514);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1717171514, i2, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent (RecsRetirementPortfolioFragment.kt:104)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStatesFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle).getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-480005329, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-480005329, i3, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent.<anonymous> (RecsRetirementPortfolioFragment.kt:113)");
                    }
                    final RecsRetirementPortfolioFragment recsRetirementPortfolioFragment = RecsRetirementPortfolioFragment.this;
                    final SnapshotState4<RecsRetirementPortfolioViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-626618438, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-626618438, i4, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent.<anonymous>.<anonymous> (RecsRetirementPortfolioFragment.kt:114)");
                            }
                            final RecsRetirementPortfolioFragment recsRetirementPortfolioFragment2 = recsRetirementPortfolioFragment;
                            final SnapshotState4<RecsRetirementPortfolioViewState> snapshotState42 = snapshotState4;
                            ActionHandlingFragment2.ContentWithDialog(recsRetirementPortfolioFragment2, ComposableLambda3.rememberComposableLambda(1876026006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1876026006, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RecsRetirementPortfolioFragment.kt:115)");
                                    }
                                    RecsRetirementPortfolioContent4.Portfolio(RecsRetirementPortfolioFragment.ComposeContent$lambda$4(snapshotState42), recsRetirementPortfolioFragment2, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementPortfolioFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioContent3
    public void onContinueClicked(List<UUID> assetIds, Map<UUID, Float> allocationMap) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        Intrinsics.checkNotNullParameter(allocationMap, "allocationMap");
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).isReorder()) {
            getCallbacks().onContinueToInvestFlowCheckout(((Args) companion.getArgs((Fragment) this)).getRecommendationId(), assetIds, allocationMap);
        } else {
            getCallbacks().onContinueFromPortfolio(((Args) companion.getArgs((Fragment) this)).getRecommendationId());
        }
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioContent3
    public void onProspectusClicked(ApiRecsRetirementPortfolio.Prospectus prospectus) {
        Intrinsics.checkNotNullParameter(prospectus, "prospectus");
        getCallbacks().onViewProspectus(prospectus);
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioContent3
    public void onLearnMoreClicked(UUID assetId, float allocation, String title, String color) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(color, "color");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.RecommendationsLearnMore(assetId, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), RecommendationsLearnMoreEntryPoint.RECOMMENDATIONS_FOR_RETIREMENT, Float.valueOf(allocation), title, color), null, 2, null).show(getChildFragmentManager(), "rec-ret-portfolio-learn-more");
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioContent3
    public void onRowExpanded(UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        getDuxo().onSelectRow(assetId);
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioContent3
    public void onRowCollapsed() {
        getDuxo().onSelectRow(null);
    }

    /* compiled from: RecsRetirementPortfolioFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Args;", "Landroid/os/Parcelable;", "source", "", "accountNumber", "accountType", "recommendationId", "Ljava/util/UUID;", "isReorder", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Z)V", "getSource", "()Ljava/lang/String;", "getAccountNumber", "getAccountType", "getRecommendationId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String accountType;
        private final boolean isReorder;
        private final UUID recommendationId;
        private final String source;

        /* compiled from: RecsRetirementPortfolioFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = args.accountType;
            }
            if ((i & 8) != 0) {
                uuid = args.recommendationId;
            }
            if ((i & 16) != 0) {
                z = args.isReorder;
            }
            boolean z2 = z;
            String str4 = str3;
            return args.copy(str, str2, str4, uuid, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsReorder() {
            return this.isReorder;
        }

        public final Args copy(String source, String accountNumber, String accountType, UUID recommendationId, boolean isReorder) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            return new Args(source, accountNumber, accountType, recommendationId, isReorder);
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
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.accountType, args.accountType) && Intrinsics.areEqual(this.recommendationId, args.recommendationId) && this.isReorder == args.isReorder;
        }

        public int hashCode() {
            return (((((((this.source.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.accountType.hashCode()) * 31) + this.recommendationId.hashCode()) * 31) + Boolean.hashCode(this.isReorder);
        }

        public String toString() {
            return "Args(source=" + this.source + ", accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ", recommendationId=" + this.recommendationId + ", isReorder=" + this.isReorder + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.accountNumber);
            dest.writeString(this.accountType);
            dest.writeSerializable(this.recommendationId);
            dest.writeInt(this.isReorder ? 1 : 0);
        }

        public Args(String source, String accountNumber, String accountType, UUID recommendationId, boolean z) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            this.source = source;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.recommendationId = recommendationId;
            this.isReorder = z;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getAccountType() {
            return this.accountType;
        }

        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        public final boolean isReorder() {
            return this.isReorder;
        }
    }

    /* compiled from: RecsRetirementPortfolioFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Args;", "<init>", "()V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecsRetirementPortfolioFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecsRetirementPortfolioFragment recsRetirementPortfolioFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recsRetirementPortfolioFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecsRetirementPortfolioFragment newInstance(Args args) {
            return (RecsRetirementPortfolioFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecsRetirementPortfolioFragment recsRetirementPortfolioFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recsRetirementPortfolioFragment, args);
        }
    }
}
