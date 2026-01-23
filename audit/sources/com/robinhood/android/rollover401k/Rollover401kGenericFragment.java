package com.robinhood.android.rollover401k;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rollover401k.steps.Rollover401kOptionsDetailsFragment;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.models.serverdriven.experimental.api.RetirementRollover401KOptionDetailOpenAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Rollover401kGenericFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\r\u0010\u001e\u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0002H\u0016J\t\u0010$\u001a\u00020\u0015H\u0096\u0001R\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*²\u0006\f\u0010+\u001a\u0004\u0018\u00010,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kGenericFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementRollover401KOptionDetailOpenAction;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rollover401k/Rollover401kBasicScreenInteractions;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "retirement401kRolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "getRetirement401kRolloverStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "setRetirement401kRolloverStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;)V", "hidePromo", "", "getHidePromo", "()Z", "toolbarVisible", "getToolbarVisible", "getContentData", "Lcom/robinhood/android/rollover401k/Rollover401kContent;", "viewModels", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$RolloverViewModels;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackButtonClick", "handle", "action", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "feature-rollover-401k_externalDebug", "viewState", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public abstract class Rollover401kGenericFragment extends ActionHandlingFragment<RetirementRollover401KOptionDetailOpenAction> implements RegionGated, Rollover401kBasicScreen, AutoLoggableFragment {
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    private final boolean hidePromo;
    public Markwon markwon;
    public Retirement401kRolloverStore retirement401kRolloverStore;
    private final boolean toolbarVisible;

    public abstract Rollover401kContent getContentData(Retirement401kRolloverViewModel.RolloverViewModels viewModels);

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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    public boolean getHidePromo() {
        return this.hidePromo;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, int i) {
        composer.startReplaceGroup(257217102);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(257217102, i, -1, "com.robinhood.android.rollover401k.Rollover401kGenericFragment.ComposeContent (Rollover401kGenericFragment.kt:42)");
        }
        Flow<Retirement401kRolloverViewModel> flowRetirement401kRolloverQuery = getRetirement401kRolloverStore().retirement401kRolloverQuery(getHidePromo());
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flowRetirement401kRolloverQuery, (Object) null, lifecycle, (Lifecycle.State) null, (CoroutineContext) null, composer, 48, 12);
        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(478628985, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.Rollover401kGenericFragment.ComposeContent.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(478628985, i2, -1, "com.robinhood.android.rollover401k.Rollover401kGenericFragment.ComposeContent.<anonymous> (Rollover401kGenericFragment.kt:52)");
                }
                Rollover401kGenericFragment rollover401kGenericFragment = Rollover401kGenericFragment.this;
                Retirement401kRolloverViewModel retirement401kRolloverViewModelComposeContent$lambda$0 = Rollover401kGenericFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                Rollover401kBasicScreen2.Rollover401kBasicScreen(rollover401kGenericFragment.getContentData(retirement401kRolloverViewModelComposeContent$lambda$0 != null ? retirement401kRolloverViewModelComposeContent$lambda$0.getRolloverViewModels() : null), Rollover401kGenericFragment.this, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.robinhood.android.rollover401k.Rollover401kBasicScreen
    public void onBackButtonClick() {
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(RetirementRollover401KOptionDetailOpenAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof RetirementRollover401KOptionDetailOpenAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink$default(this, ((RetirementRollover401KOptionDetailOpenAction.Deeplink) action).getValue2(), null, 2, null);
        }
        if (action instanceof RetirementRollover401KOptionDetailOpenAction.Dismiss) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        if (action instanceof RetirementRollover401KOptionDetailOpenAction.InfoAlert) {
            return ActionHandlingFragment.handleAlert$default(this, ((RetirementRollover401KOptionDetailOpenAction.InfoAlert) action).getValue2(), null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
        if (!(action instanceof RetirementRollover401KOptionDetailOpenAction.FullScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RetirementRollover401KOptionDetailOpenAction.FullScreen fullScreen = (RetirementRollover401KOptionDetailOpenAction.FullScreen) action;
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new Rollover401kOptionsDetailsFragment.Rollover401kOptionsDetailsKey(fullScreen.getValue2().getPage().getBody(), fullScreen.getValue2().getPage().getFooter()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retirement401kRolloverViewModel ComposeContent$lambda$0(SnapshotState4<Retirement401kRolloverViewModel> snapshotState4) {
        return snapshotState4.getValue();
    }
}
