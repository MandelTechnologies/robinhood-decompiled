package com.robinhood.android.equityscreener.filters;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityScreenerFilterFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000245B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\r\u0010\u001d\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0003¢\u0006\u0002\u0010&J5\u0010'\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u001a2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0-H\u0003¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010%H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u00066²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Landroidx/core/view/MenuProvider;", "<init>", "()V", "duxo", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDuxo;", "getDuxo", "()Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", "", "menuItem", "Landroid/view/MenuItem;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "FilterSegment", "indicatorGroups", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicatorGroup;", "selectedColumns", "", "", "(Ljava/util/List;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)V", "IndicatorRow", "modifier", "Landroidx/compose/ui/Modifier;", "indicatorTitle", "isSelected", "onIndicatorClicked", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showIndicatorScreen", "indicator", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "onSaveFiltersClicked", "id", "Args", "Companion", "feature-equity-screener_externalDebug", "viewState", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityScreenerFilterFragment extends GenericComposeFragment implements MenuProvider {
    public static final int GROUP_ROW_LIMIT = 6;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityScreenerFilterDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(EquityScreenerFilterFragment equityScreenerFilterFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        equityScreenerFilterFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilterSegment$lambda$11(EquityScreenerFilterFragment equityScreenerFilterFragment, List list, Set set, int i, Composer composer, int i2) {
        equityScreenerFilterFragment.FilterSegment(list, set, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRow$lambda$16(EquityScreenerFilterFragment equityScreenerFilterFragment, Modifier modifier, String str, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        equityScreenerFilterFragment.IndicatorRow(modifier, str, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    private final EquityScreenerFilterDuxo getDuxo() {
        return (EquityScreenerFilterDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fragmentActivityRequireActivity.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED);
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(C15652R.menu.menu_screener_filters, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != C15652R.id.reset_all_indicator_filters) {
            return false;
        }
        getDuxo().resetAllFilters(((Args) INSTANCE.getArgs((Fragment) this)).getScreenerId());
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1457809808);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1457809808, i2, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.ComposeContent (EquityScreenerFilterFragment.kt:83)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            String strStringResource = StringResources_androidKt.stringResource(C15652R.string.screener_filters_results_text, new Object[]{ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSubtitle()}, composerStartRestartGroup, 0);
            boolean zIsLoading = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityScreenerFilterFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FilterLayout.FilterLayout(modifierNavigationBarsPadding, null, strStringResource, zIsLoading, (Function0) objRememberedValue, null, ComposableLambda3.rememberComposableLambda(-1474882394, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.ComposeContent.2
                public final void invoke(BoxWithConstraints4 FilterLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(FilterLayout, "$this$FilterLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1474882394, i3, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.ComposeContent.<anonymous> (EquityScreenerFilterFragment.kt:95)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    EquityScreenerFilterFragment equityScreenerFilterFragment = EquityScreenerFilterFragment.this;
                    SnapshotState4<EquityScreenerFilterViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    equityScreenerFilterFragment.FilterSegment(EquityScreenerFilterFragment.ComposeContent$lambda$0(snapshotState4).getIndicatorGroups(), EquityScreenerFilterFragment.ComposeContent$lambda$0(snapshotState4).getSelectedColumns(), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 34);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityScreenerFilterFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityScreenerFilterViewState ComposeContent$lambda$0(SnapshotState4<EquityScreenerFilterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(EquityScreenerFilterFragment equityScreenerFilterFragment) {
        equityScreenerFilterFragment.onSaveFiltersClicked(((Args) INSTANCE.getArgs((Fragment) equityScreenerFilterFragment)).getScreenerId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void FilterSegment(final List<ScreenerIndicatorGroup> list, final Set<String> set, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(240719596);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(set) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240719596, i2, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.FilterSegment (EquityScreenerFilterFragment.kt:112)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ScreenerIndicatorGroup) obj).getIndicators().size() > 6) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Tuples4.m3642to(((ScreenerIndicatorGroup) it.next()).getTitle(), Boolean.FALSE));
                }
                objRememberedValue = SnapshotStateKt.toMutableStateMap(arrayList2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(snapshotStateMap) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(set);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityScreenerFilterFragment.FilterSegment$lambda$10$lambda$9(list, snapshotStateMap, this, set, (LazyListScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(null, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EquityScreenerFilterFragment.FilterSegment$lambda$11(this.f$0, list, set, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilterSegment$lambda$10$lambda$9(List list, SnapshotStateMap snapshotStateMap, EquityScreenerFilterFragment equityScreenerFilterFragment, Set set, LazyListScope LazyColumn) {
        LazyListScope lazyListScope = LazyColumn;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ScreenerIndicatorGroup screenerIndicatorGroup = (ScreenerIndicatorGroup) it.next();
            LazyListScope.stickyHeader$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1785616579, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$FilterSegment$1$1$1$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                    if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1785616579, i2, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.FilterSegment.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerFilterFragment.kt:126)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    BentoText2.m20747BentoText38GnDrw(screenerIndicatorGroup.getTitle(), modifierM5144paddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 24576, 0, 8172);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            Boolean bool = (Boolean) snapshotStateMap.get(screenerIndicatorGroup.getTitle());
            LazyListScope.items$default(LazyColumn, Intrinsics.areEqual(bool, Boolean.FALSE) ? 6 : screenerIndicatorGroup.getIndicators().size(), new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityScreenerFilterFragment.FilterSegment$lambda$10$lambda$9$lambda$8$lambda$7(screenerIndicatorGroup, ((Integer) obj).intValue());
                }
            }, null, ComposableLambda3.composableLambdaInstance(1921112634, true, new EquityScreenerFilterFragment3(screenerIndicatorGroup, equityScreenerFilterFragment, set)), 4, null);
            lazyListScope = LazyColumn;
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1479518671, true, new EquityScreenerFilterFragment4(bool, equityScreenerFilterFragment, snapshotStateMap, screenerIndicatorGroup)), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FilterSegment$lambda$10$lambda$9$lambda$8$lambda$7(ScreenerIndicatorGroup screenerIndicatorGroup, int i) {
        return screenerIndicatorGroup.getIndicators().get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IndicatorRow(Modifier modifier, final String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        Function0<Unit> function02;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final long jM21456getPositive0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-690055428);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-690055428, i3, -1, "com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment.IndicatorRow (EquityScreenerFilterFragment.kt:182)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierThen = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, function02, 7, null).then(modifier4);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    float value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, value, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str2, null, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 0, 8174);
                    Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                    Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 11, null), !z ? 1.0f : 0.0f);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(jM21456getPositive0d7_KjU);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EquityScreenerFilterFragment.IndicatorRow$lambda$15$lambda$14$lambda$13$lambda$12(jM21456getPositive0d7_KjU, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Canvas2.Canvas(modifierAlpha, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Color colorM21927getDividerColorQN2ZGVo = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21927getDividerColorQN2ZGVo();
                    composerStartRestartGroup.startReplaceGroup(-1651440407);
                    long jM21425getFg0d7_KjU = colorM21927getDividerColorQN2ZGVo != null ? bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 0.0f, 1, null), jM21425getFg0d7_KjU, 0.0f, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EquityScreenerFilterFragment.IndicatorRow$lambda$16(this.f$0, modifier3, str, z, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierThen2 = ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, function02, 7, null).then(modifier4);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    float value2 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion4, value2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 0, 8174);
                        Spacer2.Spacer(Row5.weight$default(row62, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        jM21456getPositive0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU();
                        Modifier modifierAlpha2 = Alpha.alpha(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5169size3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 11, null), !z ? 1.0f : 0.0f);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(jM21456getPositive0d7_KjU);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EquityScreenerFilterFragment.IndicatorRow$lambda$15$lambda$14$lambda$13$lambda$12(jM21456getPositive0d7_KjU, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Canvas2.Canvas(modifierAlpha2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            Color colorM21927getDividerColorQN2ZGVo2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21927getDividerColorQN2ZGVo();
                            composerStartRestartGroup.startReplaceGroup(-1651440407);
                            long jM21425getFg0d7_KjU2 = colorM21927getDividerColorQN2ZGVo2 != null ? bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU() : colorM21927getDividerColorQN2ZGVo2.getValue();
                            composerStartRestartGroup.endReplaceGroup();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion4, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 0.0f, 1, null), jM21425getFg0d7_KjU2, 0.0f, composerStartRestartGroup, 0, 4);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRow$lambda$15$lambda$14$lambda$13$lambda$12(long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, 0.0f, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showIndicatorScreen(ScreenerIndicator indicator) {
        BaseActivity baseActivity = getBaseActivity();
        EquityScreenerFiltersActivity equityScreenerFiltersActivity = baseActivity instanceof EquityScreenerFiltersActivity ? (EquityScreenerFiltersActivity) baseActivity : null;
        if (equityScreenerFiltersActivity != null) {
            equityScreenerFiltersActivity.showIndicatorScreen(indicator.getKey());
        }
    }

    private final void onSaveFiltersClicked(String id) {
        if (id != null) {
            requireActivity().finish();
        }
    }

    /* compiled from: EquityScreenerFilterFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment$Args;", "Landroid/os/Parcelable;", "screenerId", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getScreenerId", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String screenerId;

        /* compiled from: EquityScreenerFilterFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.screenerId;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreenerId() {
            return this.screenerId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String screenerId, String accountNumber) {
            return new Args(screenerId, accountNumber);
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
            return Intrinsics.areEqual(this.screenerId, args.screenerId) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            String str = this.screenerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(screenerId=" + this.screenerId + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.screenerId);
            dest.writeString(this.accountNumber);
        }

        public Args(String str, String str2) {
            this.screenerId = str;
            this.accountNumber = str2;
        }

        public final String getScreenerId() {
            return this.screenerId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: EquityScreenerFilterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment;", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment$Args;", "<init>", "()V", "GROUP_ROW_LIMIT", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EquityScreenerFilterFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EquityScreenerFilterFragment equityScreenerFilterFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, equityScreenerFilterFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityScreenerFilterFragment newInstance(Args args) {
            return (EquityScreenerFilterFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityScreenerFilterFragment equityScreenerFilterFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, equityScreenerFilterFragment, args);
        }
    }
}
