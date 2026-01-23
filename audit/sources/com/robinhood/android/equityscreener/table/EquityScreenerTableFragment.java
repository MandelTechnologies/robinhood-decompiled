package com.robinhood.android.equityscreener.table;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.equities.contracts.EquityScreenerTableFragmentKey;
import com.robinhood.android.equities.contracts.ScreenerDataDisplayKey;
import com.robinhood.android.equities.contracts.ScreenerInitialData;
import com.robinhood.android.equities.contracts.screeners.CreateScreenerContract;
import com.robinhood.android.equities.contracts.screeners.DeleteScreenerContract;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerContract;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerOptionsContract;
import com.robinhood.android.equities.contracts.screeners.ScreenerOverflowActionsContract;
import com.robinhood.android.equities.contracts.screeners.UnsavedScreenerChangesContract;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.table.EquityScreenerTableFragment;
import com.robinhood.android.equityscreener.table.EquityScreenerTableViewState;
import com.robinhood.android.equityscreener.table.data.RowClasses;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.GenericTableKt;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.serverdriven.experimental.api.ScreenerAction;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EquityScreenerTableFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001<B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\r\u0010\"\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\u00020\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020&H\u0002J\u0012\u0010*\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020\u0019H\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020&H\u0016J\u0018\u00101\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u00102\u001a\u00020&H\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\b\u00109\u001a\u00020\u0019H\u0016J\b\u0010:\u001a\u00020\u000bH\u0016J\b\u0010;\u001a\u00020\u0019H\u0002R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006=²\u0006\n\u0010>\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010@\u001a\u00020AX\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Callbacks;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Callbacks;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerOptionsContract$Callbacks;", "Lcom/robinhood/android/equities/contracts/screeners/ScreenerOverflowActionsContract$Callbacks;", "Lcom/robinhood/android/equities/contracts/screeners/DeleteScreenerContract$Callbacks;", "Lcom/robinhood/android/equities/contracts/screeners/UnsavedScreenerChangesContract$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDuxo;", "getDuxo", "()Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "curatedListQuickAddFragment", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showFilterScreen", "filterKey", "", "screenerId", "onRowClicked", "instrumentId", "onDataDisplayClicked", "onPresetSelected", "onCreateScreenerFromPreset", "onCreateCanceled", "onPresetBack", "onScreenerSaved", "id", "onSaved", "displayName", "onSaveAs", "openSaveBottomSheet", "saveType", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "onEditName", "onDelete", "exit", "onBackPressed", "ensureCuratedListQuickAddFragment", "Companion", "feature-equity-screener_externalDebug", "viewState", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState;", "contentSize", "Landroidx/compose/ui/unit/IntSize;", "displayShowAll"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityScreenerTableFragment extends GenericComposeFragment implements CreateScreenerContract.Callbacks, SaveScreenerContract.Callbacks, SaveScreenerOptionsContract.Callbacks, ScreenerOverflowActionsContract.Callbacks, DeleteScreenerContract.Callbacks, UnsavedScreenerChangesContract.Callbacks {
    private static final String QUICK_ADD_TAG = "quickAddFragment";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityScreenerTableDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(EquityScreenerTableFragment equityScreenerTableFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        equityScreenerTableFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityScreenerTableViewState ComposeContent$lambda$0(SnapshotState4<EquityScreenerTableViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ComposeContent$lambda$3(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityScreenerTableDuxo getDuxo() {
        return (EquityScreenerTableDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("quickAddFragment");
        if (fragmentFindFragmentByTag instanceof CuratedListQuickAddFragment) {
            return (CuratedListQuickAddFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C157661(null), 1, null);
    }

    /* compiled from: EquityScreenerTableFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$onViewCreated$1", m3645f = "EquityScreenerTableFragment.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$onViewCreated$1 */
    static final class C157661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C157661(Continuation<? super C157661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityScreenerTableFragment.this.new C157661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C157661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityScreenerTableViewState> stateFlow = EquityScreenerTableFragment.this.getDuxo().getStateFlow();
                final EquityScreenerTableFragment equityScreenerTableFragment = EquityScreenerTableFragment.this;
                FlowCollector<? super EquityScreenerTableViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((EquityScreenerTableViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(EquityScreenerTableViewState equityScreenerTableViewState, Continuation<? super Unit> continuation) {
                        EquityScreenerTableViewState.WatchlistToggleEvent watchlistToggleEventConsume;
                        CuratedListQuickAddFragment curatedListQuickAddFragment;
                        ComposeUiEvent<Unit> showCreateDialog = equityScreenerTableViewState.getShowCreateDialog();
                        if ((showCreateDialog != null ? showCreateDialog.consume() : null) != null) {
                            Navigator.DefaultImpls.createDialogFragment$default(equityScreenerTableFragment.getNavigator(), new CreateScreenerContract.Key(null, 1, null), null, 2, null).show(equityScreenerTableFragment.getChildFragmentManager(), "createScreenerBottomSheet");
                        }
                        ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> watchlistNavigationEvent = equityScreenerTableViewState.getWatchlistNavigationEvent();
                        if (watchlistNavigationEvent != null && (watchlistToggleEventConsume = watchlistNavigationEvent.consume()) != null && (curatedListQuickAddFragment = equityScreenerTableFragment.getCuratedListQuickAddFragment()) != null) {
                            curatedListQuickAddFragment.addSelectedItemToCuratedList(watchlistToggleEventConsume.getIsMember(), watchlistToggleEventConsume.getInstrument());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ensureCuratedListQuickAddFragment();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ActionBar supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        toolbar.setMaxHeight(0);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        ScreenerToolbar6 screenerToolbar6;
        LazyListState lazyListState;
        String id;
        Composer composerStartRestartGroup = composer.startRestartGroup(475748581);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(475748581, i2, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent (EquityScreenerTableFragment.kt:134)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Screener screener = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getScreener();
            final String str = (screener == null || (id = screener.getId()) == null || StringsKt.isBlank(id)) ? null : id;
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            EquityScreenerTableViewState equityScreenerTableViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Object displayName = equityScreenerTableViewStateComposeContent$lambda$0.getDisplayName(resources);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(displayName);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(density.mo5010roundToPx0680j_4(ScreenerToolbar4.getToolbarHeight()), density.mo5010roundToPx0680j_4(ScreenerToolbar4.getToolbarHeight()) + ((int) (ComposeContent$lambda$3(snapshotState) & 4294967295L)));
            final ScreenerToolbar6 screenerToolbar6RememberToolbarState = ScreenerToolbar4.rememberToolbarState(primitiveRanges2, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(primitiveRanges2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NestedScrollModifier() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$toolbarNestedScrollConnection$1$1
                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPostFling-RZ2iAVY */
                    public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                        return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                    }

                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPostScroll-DzOQY0M */
                    public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i3) {
                        return super.mo5024onPostScrollDzOQY0M(j, j2, i3);
                    }

                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPreFling-QWom1Mo */
                    public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                        return super.mo5609onPreFlingQWom1Mo(j, continuation);
                    }

                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPreScroll-OzD1aCk */
                    public long mo5298onPreScrollOzD1aCk(long available, int source) {
                        int i3 = (int) (available & 4294967295L);
                        if (Float.intBitsToFloat(i3) == 0.0f) {
                            return Offset.INSTANCE.m6553getZeroF1C5BW0();
                        }
                        screenerToolbar6RememberToolbarState.setScrollTopLimitReached(lazyListStateRememberLazyListState.getFirstVisibleItemIndex() == 0 && lazyListStateRememberLazyListState.getFirstVisibleItemScrollOffset() == 0);
                        ScreenerToolbar6 screenerToolbar62 = screenerToolbar6RememberToolbarState;
                        screenerToolbar62.setScrollOffset(screenerToolbar62.getScrollOffset() - Float.intBitsToFloat(i3));
                        if (screenerToolbar6RememberToolbarState.getProgress() > 0.0f) {
                            return available;
                        }
                        return Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(screenerToolbar6RememberToolbarState.getConsumed())));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final C15765x48faa9fe c15765x48faa9fe = (C15765x48faa9fe) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).isScanResultsEmpty());
            Boolean boolValueOf2 = Boolean.valueOf(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).isScanResultsLoading());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged3 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(screenerToolbar6RememberToolbarState) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(primitiveRanges2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                screenerToolbar6 = screenerToolbar6RememberToolbarState;
                lazyListState = lazyListStateRememberLazyListState;
                objRememberedValue3 = new EquityScreenerTableFragment$ComposeContent$1$1(lazyListState, screenerToolbar6, primitiveRanges2, snapshotState4CollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                screenerToolbar6 = screenerToolbar6RememberToolbarState;
                lazyListState = lazyListStateRememberLazyListState;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new SduiActionHandler() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$actionHandler$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(ScreenerAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action instanceof ScreenerAction.Deeplink) {
                            Navigator navigator = this.this$0.getNavigator();
                            Context contextRequireContext = this.this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((ScreenerAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                            return true;
                        }
                        if ((action instanceof ScreenerAction.Dismiss) || (action instanceof ScreenerAction.InfoAlert)) {
                            return false;
                        }
                        if (!(action instanceof ScreenerAction.TableSort)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ScreenerAction.TableSort tableSort = (ScreenerAction.TableSort) action;
                        this.this$0.getDuxo().sortTableBy(tableSort.getValue2().getSort_by(), tableSort.getValue2().getSort_direction());
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            final LazyListState lazyListState2 = lazyListState;
            final ScreenerToolbar6 screenerToolbar62 = screenerToolbar6;
            CompositionLocal3.CompositionLocalProvider(Overscroll4.getLocalOverscrollFactory().provides(null), ComposableLambda3.rememberComposableLambda(-29200987, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.2

                /* compiled from: EquityScreenerTableFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<IntSize> $contentSize$delegate;
                    final /* synthetic */ ScreenerToolbar6 $toolbarState;
                    final /* synthetic */ SnapshotState4<EquityScreenerTableViewState> $viewState$delegate;
                    final /* synthetic */ EquityScreenerTableFragment this$0;

                    AnonymousClass1(SnapshotState<IntSize> snapshotState, EquityScreenerTableFragment equityScreenerTableFragment, ScreenerToolbar6 screenerToolbar6, SnapshotState4<EquityScreenerTableViewState> snapshotState4) {
                        this.$contentSize$delegate = snapshotState;
                        this.this$0 = equityScreenerTableFragment;
                        this.$toolbarState = screenerToolbar6;
                        this.$viewState$delegate = snapshotState4;
                    }

                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1781727081, i, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:209)");
                        }
                        final int iMo5010roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(ScreenerToolbar4.getToolbarHeight());
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(companion, WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer, 6));
                        final SnapshotState<IntSize> snapshotState = this.$contentSize$delegate;
                        final EquityScreenerTableFragment equityScreenerTableFragment = this.this$0;
                        ScreenerToolbar6 screenerToolbar6 = this.$toolbarState;
                        SnapshotState4<EquityScreenerTableViewState> snapshotState4 = this.$viewState$delegate;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer.startReplaceGroup(977613782);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(snapshotState) | composer.changed(iMo5010roundToPx0680j_4);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EquityScreenerTableFragment.C157642.AnonymousClass1.invoke$lambda$7$lambda$2$lambda$1(iMo5010roundToPx0680j_4, snapshotState, (IntSize) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue);
                        if (((int) (EquityScreenerTableFragment.ComposeContent$lambda$3(snapshotState) & 4294967295L)) > 0) {
                            modifierOnSizeChanged = SizeKt.m5156height3ABfNKs(modifierOnSizeChanged, C2002Dp.m7993boximpl(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(screenerToolbar6.getHeight())).getValue());
                        }
                        composer.endReplaceGroup();
                        String iconUrl = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4).getIconUrl();
                        String iconEmoji = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4).getIconEmoji();
                        EquityScreenerTableViewState equityScreenerTableViewStateComposeContent$lambda$0 = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4);
                        Resources resources = equityScreenerTableFragment.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        String displayName = equityScreenerTableViewStateComposeContent$lambda$0.getDisplayName(resources);
                        EquityScreenerTableViewState equityScreenerTableViewStateComposeContent$lambda$02 = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4);
                        Resources resources2 = equityScreenerTableFragment.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        String updatedAtSubheader = equityScreenerTableViewStateComposeContent$lambda$02.getUpdatedAtSubheader(resources2);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(equityScreenerTableFragment);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EquityScreenerTableFragment.C157642.AnonymousClass1.invoke$lambda$7$lambda$6$lambda$5(equityScreenerTableFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ScreenerToolbar4.ScreenerCollapsingToolbar(modifierOnSizeChanged, iconUrl, iconEmoji, displayName, updatedAtSubheader, screenerToolbar6, (Function0) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1164162701, true, new EquityScreenerTableFragment$ComposeContent$2$1$1$4(snapshotState4, equityScreenerTableFragment), composer, 54), composer, 12582912, 0);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$2$lambda$1(int i, SnapshotState snapshotState, IntSize intSize) {
                        if (((int) (EquityScreenerTableFragment.ComposeContent$lambda$3(snapshotState) & 4294967295L)) < ((int) (intSize.getPackedValue() & 4294967295L)) - i) {
                            EquityScreenerTableFragment.ComposeContent$lambda$4(snapshotState, intSize.getPackedValue());
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6$lambda$5(EquityScreenerTableFragment equityScreenerTableFragment) {
                        equityScreenerTableFragment.onBackPressed();
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
                        ComposerKt.traceEventStart(-29200987, i3, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous> (EquityScreenerTableFragment.kt:205)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1781727081, true, new AnonymousClass1(snapshotState, this, screenerToolbar62, snapshotState4CollectAsStateWithLifecycle), composer2, 54);
                    final SduiActionHandler<ScreenerAction> sduiActionHandler2 = sduiActionHandler;
                    final C15765x48faa9fe c15765x48faa9fe2 = c15765x48faa9fe;
                    final EquityScreenerTableFragment equityScreenerTableFragment = this;
                    final String str2 = str;
                    final SnapshotState4<EquityScreenerTableViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    final LazyListState lazyListState3 = lazyListState2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(408322548, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.2.2

                        /* compiled from: EquityScreenerTableFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ PaddingValues $paddingValues;
                            final /* synthetic */ String $screenerId;
                            final /* synthetic */ C15765x48faa9fe $toolbarNestedScrollConnection;
                            final /* synthetic */ LazyListState $verticalScrollState;
                            final /* synthetic */ SnapshotState4<EquityScreenerTableViewState> $viewState$delegate;
                            final /* synthetic */ EquityScreenerTableFragment this$0;

                            AnonymousClass1(C15765x48faa9fe c15765x48faa9fe, PaddingValues paddingValues, EquityScreenerTableFragment equityScreenerTableFragment, String str, SnapshotState4<EquityScreenerTableViewState> snapshotState4, LazyListState lazyListState) {
                                this.$toolbarNestedScrollConnection = c15765x48faa9fe;
                                this.$paddingValues = paddingValues;
                                this.this$0 = equityScreenerTableFragment;
                                this.$screenerId = str;
                                this.$viewState$delegate = snapshotState4;
                                this.$verticalScrollState = lazyListState;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean invoke$lambda$10$lambda$9$lambda$5(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1581897843, i, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:275)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(NestedScrollModifier7.nestedScroll$default(companion, this.$toolbarNestedScrollConnection, null, 2, null), 0.0f, 1, null), this.$paddingValues);
                                final EquityScreenerTableFragment equityScreenerTableFragment = this.this$0;
                                final String str = this.$screenerId;
                                SnapshotState4<EquityScreenerTableViewState> snapshotState4 = this.$viewState$delegate;
                                LazyListState lazyListState = this.$verticalScrollState;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierHorizontalScroll$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 6, null);
                                List<ScreenerIndicator> selectedIndicators = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4).getSelectedIndicators();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(equityScreenerTableFragment) | composer.changed(str);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return EquityScreenerTableFragment.C157642.AnonymousClass2.AnonymousClass1.invoke$lambda$10$lambda$1$lambda$0(equityScreenerTableFragment, str);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer.changedInstance(equityScreenerTableFragment) | composer.changed(str);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return EquityScreenerTableFragment.C157642.AnonymousClass2.AnonymousClass1.invoke$lambda$10$lambda$3$lambda$2(equityScreenerTableFragment, str, (String) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                ScreenerIndicators.ScreenerIndicators(modifierM5146paddingqDBjuR0$default, selectedIndicators, function0, (Function1) objRememberedValue2, composer, 0, 0);
                                composer.startReplaceGroup(-1699596929);
                                final EquityScreenerTableViewState equityScreenerTableViewStateComposeContent$lambda$0 = EquityScreenerTableFragment.ComposeContent$lambda$0(snapshotState4);
                                if (equityScreenerTableViewStateComposeContent$lambda$0.isScanResultsEmpty()) {
                                    composer.startReplaceGroup(1130248139);
                                    ScreenerTable.EmptyState(composer, 0);
                                    composer.endReplaceGroup();
                                } else if (equityScreenerTableViewStateComposeContent$lambda$0.isScanResultsLoading() || equityScreenerTableViewStateComposeContent$lambda$0.getGenericTableData() == null) {
                                    composer.startReplaceGroup(1130251260);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, false, false, 0, composer, 0, 15);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(678248939);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue3 == companion3.getEmpty()) {
                                        objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (objRememberedValue4 == companion3.getEmpty()) {
                                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
                                    composer.endReplaceGroup();
                                    GenericTableData<ScreenTableCells> genericTableData = equityScreenerTableViewStateComposeContent$lambda$0.getGenericTableData();
                                    StickyColumn.StickAtStartAfterOnScreen stickAtStartAfterOnScreen = new StickyColumn.StickAtStartAfterOnScreen(1, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(42)), false, 4, null);
                                    Integer num = invoke$lambda$10$lambda$9$lambda$5(snapshotState) ? 40 : null;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-895372213, true, new EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1(equityScreenerTableFragment, equityScreenerTableViewStateComposeContent$lambda$0, coroutineScope), composer, 54);
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1878546069, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$2
                                        public final void invoke(Column5 GenericTable, Composer composer2, int i3) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(GenericTable, "$this$GenericTable");
                                            if ((i3 & 17) == 16 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1878546069, i3, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:332)");
                                            }
                                            EquityScreenerTableViewState equityScreenerTableViewState = equityScreenerTableViewStateComposeContent$lambda$0;
                                            SnapshotState<Boolean> snapshotState2 = snapshotState;
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion4);
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                            if (composer2.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                            Column6 column62 = Column6.INSTANCE;
                                            composer2.startReplaceGroup(1600261535);
                                            if (EquityScreenerTableFragment.C157642.AnonymousClass2.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$5(snapshotState2) && equityScreenerTableViewState.getGenericTableData().getRows().size() > 40) {
                                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1992123535, true, new EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$2$1$1(snapshotState2), composer2, 54), composer2, 6);
                                            }
                                            composer2.endReplaceGroup();
                                            RowClasses disclosureRow = equityScreenerTableViewState.getDisclosureRow();
                                            composer2.startReplaceGroup(1600306687);
                                            if (disclosureRow != null) {
                                                ScreenerTable.Disclosure(null, disclosureRow, composer2, StringResource.$stable << 3, 1);
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num2) throws Resources.NotFoundException {
                                            invoke(column5, composer2, num2.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composer, 54);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer.changedInstance(equityScreenerTableFragment);
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue5 == companion3.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return EquityScreenerTableFragment.C157642.AnonymousClass2.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8$lambda$7(equityScreenerTableFragment, (GenericRow) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer.endReplaceGroup();
                                    GenericTableKt.m14971GenericTable9SxZPhU(genericTableData, composableLambdaRememberComposableLambda, null, false, null, null, lazyListState, null, num, stickAtStartAfterOnScreen, composableLambdaRememberComposableLambda2, (Function1) objRememberedValue5, composer, GenericTableData.$stable | 48 | (StickyColumn.StickAtStartAfterOnScreen.$stable << 27), 6, 188);
                                    composer.endReplaceGroup();
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$10$lambda$1$lambda$0(EquityScreenerTableFragment equityScreenerTableFragment, String str) {
                                EquityScreenerTableFragment.showFilterScreen$default(equityScreenerTableFragment, null, str, 1, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$10$lambda$3$lambda$2(EquityScreenerTableFragment equityScreenerTableFragment, String str, String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                equityScreenerTableFragment.showFilterScreen(it, str);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void invoke$lambda$10$lambda$9$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(EquityScreenerTableFragment equityScreenerTableFragment, GenericRow it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                equityScreenerTableFragment.onRowClicked(it.getKey());
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(408322548, i5, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:274)");
                            }
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(1581897843, true, new AnonymousClass1(c15765x48faa9fe2, paddingValues, equityScreenerTableFragment, str2, snapshotState4, lazyListState3), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityScreenerTableFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$4(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    static /* synthetic */ void showFilterScreen$default(EquityScreenerTableFragment equityScreenerTableFragment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        equityScreenerTableFragment.showFilterScreen(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFilterScreen(String filterKey, String screenerId) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ScreenerFilters(screenerId, filterKey, ((EquityScreenerTableFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber()), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRowClicked(String instrumentId) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(com.robinhood.utils.extensions.StringsKt.toUuid(instrumentId), CollectionsKt.emptyList(), ((EquityScreenerTableFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), InstrumentDetailSource.SCREENER, false, 16, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDataDisplayClicked(String screenerId) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new ScreenerDataDisplayKey(new ScreenerInitialData(screenerId)), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.equities.contracts.screeners.CreateScreenerContract.Callbacks
    public void onPresetSelected(String screenerId) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        getDuxo().loadScreener(screenerId);
    }

    @Override // com.robinhood.android.equities.contracts.screeners.CreateScreenerContract.Callbacks
    public void onCreateScreenerFromPreset(String screenerId) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        getDuxo().loadScreener(screenerId);
    }

    @Override // com.robinhood.android.equities.contracts.screeners.CreateScreenerContract.Callbacks
    public void onCreateCanceled() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.robinhood.android.equities.contracts.screeners.CreateScreenerContract.Callbacks
    public void onPresetBack() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.robinhood.android.equities.contracts.screeners.SaveScreenerContract.Callbacks
    public void onScreenerSaved(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        getDuxo().logOnScreenerSaved();
        getDuxo().loadScreener(id);
    }

    @Override // com.robinhood.android.equities.contracts.screeners.SaveScreenerOptionsContract.Callbacks
    public void onSaved(String screenerId, String displayName) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewFindRoot = Snackbars.INSTANCE.findRoot(requireBaseActivity());
        String string2 = getString(C15652R.string.saved_toast, displayName);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        companion.make(viewFindRoot, HtmlCompat.fromHtml$default(string2, 0, 2, null), (int) Durations.INSTANCE.getFIVE_SECONDS().toMillis()).setLeadingIcon(ServerToBentoAssetMapper2.CHECKMARK_12.getResourceId()).show();
    }

    @Override // com.robinhood.android.equities.contracts.screeners.SaveScreenerOptionsContract.Callbacks
    public void onSaveAs(String screenerId) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        openSaveBottomSheet(new SaveScreenerContract.SaveType.SaveAs(screenerId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openSaveBottomSheet(SaveScreenerContract.SaveType saveType) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SaveScreenerContract.Key(saveType), null, 2, null).show(getChildFragmentManager(), "save-screener-bottom-sheet");
    }

    @Override // com.robinhood.android.equities.contracts.screeners.ScreenerOverflowActionsContract.Callbacks
    public void onEditName(String screenerId) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        openSaveBottomSheet(new SaveScreenerContract.SaveType.EditName(screenerId));
    }

    @Override // com.robinhood.android.equities.contracts.screeners.ScreenerOverflowActionsContract.Callbacks
    public void onDelete(String screenerId) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new DeleteScreenerContract.Key(screenerId), null, 2, null).show(getChildFragmentManager(), "delete-screener-bottom-sheet");
    }

    @Override // com.robinhood.android.equities.contracts.screeners.FinishableScreenerCallbacks
    public void exit() {
        getDuxo().clearDraftState();
        requireBaseActivity().finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getDuxo().getStateFlow().getValue().getDraft()) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), UnsavedScreenerChangesContract.Key.INSTANCE, null, 2, null).show(getChildFragmentManager(), "unsavedScreenerChanges");
            return true;
        }
        exit();
        return true;
    }

    private final void ensureCuratedListQuickAddFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (getCuratedListQuickAddFragment() != null || childFragmentManager.isStateSaved()) {
            return;
        }
        childFragmentManager.beginTransaction().add(CuratedListQuickAddFragment.Companion.newInstance$default(CuratedListQuickAddFragment.INSTANCE, false, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), 1, null), "quickAddFragment").commit();
    }

    /* compiled from: EquityScreenerTableFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableFragment;", "Lcom/robinhood/android/equities/contracts/EquityScreenerTableFragmentKey;", "<init>", "()V", "QUICK_ADD_TAG", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EquityScreenerTableFragment, EquityScreenerTableFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EquityScreenerTableFragmentKey equityScreenerTableFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, equityScreenerTableFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EquityScreenerTableFragmentKey getArgs(EquityScreenerTableFragment equityScreenerTableFragment) {
            return (EquityScreenerTableFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, equityScreenerTableFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityScreenerTableFragment newInstance(EquityScreenerTableFragmentKey equityScreenerTableFragmentKey) {
            return (EquityScreenerTableFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, equityScreenerTableFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityScreenerTableFragment equityScreenerTableFragment, EquityScreenerTableFragmentKey equityScreenerTableFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, equityScreenerTableFragment, equityScreenerTableFragmentKey);
        }
    }
}
