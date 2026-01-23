package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit.InvestingMonitorActionsBottomSheetKt;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.loading.InvestingMonitorMainLoadingContentKt;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorComposable5;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorViewState;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting.InvestingMonitorSortActionsRow;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting.InvestingMonitorSortType;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.tabs.InvestingMonitorWatchlistTabRow;
import com.robinhood.android.redesigninvesting.investingmonitor.utils.InvestingMonitorUiUtils;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: InvestingMonitorComposable.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001aÍ\u0003\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\t2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u000f26\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\t26\u0010 \u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\"2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00010\u000f2'\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\r0\u000f2\b\b\u0002\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\u0010*¨\u0006+²\u0006\n\u0010\u0006\u001a\u00020,X\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002"}, m3636d2 = {"InvestingMonitorComposable", "", "duxo", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo;", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "viewState", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Loaded;", "onAssetMoved", "Lkotlin/Function2;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;", "", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "Lkotlinx/coroutines/Job;", "onListCreated", "Lkotlin/Function1;", "Lcom/robinhood/models/db/CuratedList;", "Lkotlin/ParameterName;", "name", "curatedList", "onScreenerCreated", "Lcom/robinhood/equityscreener/models/db/Screener;", "screener", "onRecentlyCreatedPageProcessed", "page", "onPageDeleteRequested", "onSortTypeSelected", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/sorting/InvestingMonitorSortType;", "sortType", "onWatchlistRenamed", "", "newName", "onWatchlistTempRenamed", "onWatchlistRenamedCancelled", "Lkotlin/Function0;", "onViewModeChanged", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "currentViewMode", "onTabsReordered", "tabs", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Loaded;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "feature-investing-monitor_externalDebug", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "activeAssetPageActionsTarget"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorComposable$lambda$1(InvestingMonitorDuxo investingMonitorDuxo, int i, int i2, Composer composer, int i3) {
        InvestingMonitorComposable(investingMonitorDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$7(InvestingMonitorViewState.Loaded loaded, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function2 function23, Function2 function24, Function0 function0, Function1 function15, Function1 function16, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        MainContent(loaded, function2, function1, function12, function13, function14, function22, function23, function24, function0, function15, function16, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingMonitorComposable(InvestingMonitorDuxo investingMonitorDuxo, Composer composer, final int i, final int i2) {
        InvestingMonitorDuxo investingMonitorDuxo2;
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        final InvestingMonitorDuxo investingMonitorDuxo3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1134197259);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                investingMonitorDuxo2 = investingMonitorDuxo;
                if (composerStartRestartGroup.changedInstance(investingMonitorDuxo2)) {
                    i4 = 4;
                }
                i3 = i4 | i;
            } else {
                investingMonitorDuxo2 = investingMonitorDuxo;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            investingMonitorDuxo2 = investingMonitorDuxo;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InvestingMonitorDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    investingMonitorDuxo2 = (InvestingMonitorDuxo) baseDuxo;
                    i3 &= -15;
                }
                investingMonitorDuxo3 = investingMonitorDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1134197259, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposable (InvestingMonitorComposable.kt:69)");
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-332959917, true, new C265931(investingMonitorDuxo3, FlowExtKt.collectAsStateWithLifecycle(investingMonitorDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                investingMonitorDuxo3 = investingMonitorDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-332959917, true, new C265931(investingMonitorDuxo3, FlowExtKt.collectAsStateWithLifecycle(investingMonitorDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            investingMonitorDuxo3 = investingMonitorDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorComposable5.InvestingMonitorComposable$lambda$1(investingMonitorDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InvestingMonitorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1 */
    static final class C265931 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ InvestingMonitorDuxo $duxo;
        final /* synthetic */ SnapshotState4<InvestingMonitorViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C265931(InvestingMonitorDuxo investingMonitorDuxo, SnapshotState4<? extends InvestingMonitorViewState> snapshotState4) {
            this.$duxo = investingMonitorDuxo;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-332959917, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposable.<anonymous> (InvestingMonitorComposable.kt:73)");
            }
            InvestingMonitorViewState investingMonitorViewStateInvestingMonitorComposable$lambda$0 = InvestingMonitorComposable5.InvestingMonitorComposable$lambda$0(this.$viewState$delegate);
            if (investingMonitorViewStateInvestingMonitorComposable$lambda$0 instanceof InvestingMonitorViewState.Loading) {
                composer.startReplaceGroup(-2129318421);
                InvestingMonitorMainLoadingContentKt.InvestingMonitorMainLoadingContent(null, composer, 0, 1);
                composer.endReplaceGroup();
            } else if (investingMonitorViewStateInvestingMonitorComposable$lambda$0 instanceof InvestingMonitorViewState.Loaded) {
                composer.startReplaceGroup(-2129057897);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo = this.$duxo;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$1$lambda$0(investingMonitorDuxo, (InvestingMonitorPage) obj, (List) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                final Function2 function2 = (Function2) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$3$lambda$2(investingMonitorDuxo2, (CuratedList) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged3 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo3 = this.$duxo;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$5$lambda$4(investingMonitorDuxo3, (Screener) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                final Function1 function12 = (Function1) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged4 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo4 = this.$duxo;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$7$lambda$6(investingMonitorDuxo4, (InvestingMonitorPage) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                final Function1 function13 = (Function1) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged5 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo5 = this.$duxo;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$9$lambda$8(investingMonitorDuxo5, (InvestingMonitorPage) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                final Function1 function14 = (Function1) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                final InvestingMonitorDuxo investingMonitorDuxo6 = this.$duxo;
                Object objRememberedValue6 = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$11$lambda$10(investingMonitorDuxo6, (InvestingMonitorSortType) obj, (InvestingMonitorPage) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                final Function2 function22 = (Function2) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged6 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo7 = this.$duxo;
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$13$lambda$12(investingMonitorDuxo7, (CuratedList) obj, (String) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                final Function2 function23 = (Function2) objRememberedValue7;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged7 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo8 = this.$duxo;
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChanged7 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$15$lambda$14(investingMonitorDuxo8, (CuratedList) obj, (String) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                final Function2 function24 = (Function2) objRememberedValue8;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged8 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo9 = this.$duxo;
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged8 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$17$lambda$16(investingMonitorDuxo9);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue9);
                }
                final Function0 function0 = (Function0) objRememberedValue9;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged9 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo10 = this.$duxo;
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChanged9 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$19$lambda$18(investingMonitorDuxo10, (InvestingMonitorViewMode) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue10);
                }
                final Function1 function15 = (Function1) objRememberedValue10;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged10 = composer.changed(this.$duxo);
                final InvestingMonitorDuxo investingMonitorDuxo11 = this.$duxo;
                Object objRememberedValue11 = composer.rememberedValue();
                if (zChanged10 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$InvestingMonitorComposable$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265931.invoke$lambda$21$lambda$20(investingMonitorDuxo11, (List) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue11);
                }
                final Function1 function16 = (Function1) objRememberedValue11;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue12 = composer.rememberedValue();
                if (objRememberedValue12 == companion.getEmpty()) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INVESTING_MONITOR, null, null, null, 14, null), null, null, null, null, 61, null);
                    composer.updateRememberedValue(userInteractionEventDescriptor);
                    objRememberedValue12 = userInteractionEventDescriptor;
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) objRememberedValue12;
                composer.endReplaceGroup();
                final SnapshotState4<InvestingMonitorViewState> snapshotState4 = this.$viewState$delegate;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor2, ComposableLambda3.rememberComposableLambda(2129321607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt.InvestingMonitorComposable.1.1
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
                            ComposerKt.traceEventStart(2129321607, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposable.<anonymous>.<anonymous> (InvestingMonitorComposable.kt:169)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, userInteractionEventDescriptor2, false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                        InvestingMonitorViewState investingMonitorViewStateInvestingMonitorComposable$lambda$02 = InvestingMonitorComposable5.InvestingMonitorComposable$lambda$0(snapshotState4);
                        Intrinsics.checkNotNull(investingMonitorViewStateInvestingMonitorComposable$lambda$02, "null cannot be cast to non-null type com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorViewState.Loaded");
                        InvestingMonitorComposable5.MainContent((InvestingMonitorViewState.Loaded) investingMonitorViewStateInvestingMonitorComposable$lambda$02, function2, function1, function12, function13, function14, function22, function24, function23, function0, function15, function16, modifierAutoLogEvents$default, composer2, 1572864, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 48);
                composer.endReplaceGroup();
            } else {
                if (!(investingMonitorViewStateInvestingMonitorComposable$lambda$0 instanceof InvestingMonitorViewState.Empty)) {
                    composer.startReplaceGroup(-2146895038);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2124581962);
                BentoText2.m20747BentoText38GnDrw("Empty state - TODO", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Job invoke$lambda$1$lambda$0(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorPage page, List newAssetOrdered) {
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(newAssetOrdered, "newAssetOrdered");
            return investingMonitorDuxo.onAssetOrderChanged(page, newAssetOrdered);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(InvestingMonitorDuxo investingMonitorDuxo, CuratedList curatedList) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            investingMonitorDuxo.onListCreated(curatedList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(InvestingMonitorDuxo investingMonitorDuxo, Screener screener) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            investingMonitorDuxo.onScreenerCreated(screener);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorPage page) {
            Intrinsics.checkNotNullParameter(page, "page");
            investingMonitorDuxo.onRecentlyCreatedPageProcessed(page);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorPage page) {
            Intrinsics.checkNotNullParameter(page, "page");
            investingMonitorDuxo.onWatchlistDeleteRequested(page.getCuratedList());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorSortType selectedSortType, InvestingMonitorPage page) {
            Intrinsics.checkNotNullParameter(selectedSortType, "selectedSortType");
            Intrinsics.checkNotNullParameter(page, "page");
            investingMonitorDuxo.onSortOrderChanged$feature_investing_monitor_externalDebug(selectedSortType, page);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(InvestingMonitorDuxo investingMonitorDuxo, CuratedList curatedList, String newName) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            Intrinsics.checkNotNullParameter(newName, "newName");
            investingMonitorDuxo.onWatchlistTempRenamed(curatedList, newName);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14(InvestingMonitorDuxo investingMonitorDuxo, CuratedList curatedList, String newName) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            Intrinsics.checkNotNullParameter(newName, "newName");
            investingMonitorDuxo.onWatchlistRenamed(curatedList, newName);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$17$lambda$16(InvestingMonitorDuxo investingMonitorDuxo) {
            investingMonitorDuxo.onWatchlistRenameCancelled();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$18(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorViewMode currentViewMode) {
            Intrinsics.checkNotNullParameter(currentViewMode, "currentViewMode");
            investingMonitorDuxo.onSwitchViewMode(currentViewMode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Job invoke$lambda$21$lambda$20(InvestingMonitorDuxo investingMonitorDuxo, List tabs) {
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            return investingMonitorDuxo.onTabsReordered(tabs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestingMonitorViewState InvestingMonitorComposable$lambda$0(SnapshotState4<? extends InvestingMonitorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestingMonitorPage MainContent$lambda$3(SnapshotState<InvestingMonitorPage> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: InvestingMonitorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3 */
    static final class C265963 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<InvestingMonitorPage> $activeAssetPageActionsTarget$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function2<InvestingMonitorPage, List<InvestingMonitorAsset>, Job> $onAssetMoved;
        final /* synthetic */ Function1<CuratedList, Unit> $onListCreated;
        final /* synthetic */ Function1<InvestingMonitorPage, Unit> $onPageDeleteRequested;
        final /* synthetic */ Function1<InvestingMonitorPage, Unit> $onRecentlyCreatedPageProcessed;
        final /* synthetic */ Function1<Screener, Unit> $onScreenerCreated;
        final /* synthetic */ Function2<InvestingMonitorSortType, InvestingMonitorPage, Unit> $onSortTypeSelected;
        final /* synthetic */ Function1<List<CuratedList>, Job> $onTabsReordered;
        final /* synthetic */ Function2<CuratedList, String, Unit> $onWatchlistRenamed;
        final /* synthetic */ Function0<Unit> $onWatchlistRenamedCancelled;
        final /* synthetic */ Function2<CuratedList, String, Unit> $onWatchlistTempRenamed;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ ImmutableList3<InvestingMonitorPage> $pages;
        final /* synthetic */ ImmutableList3<String> $titles;
        final /* synthetic */ InvestingMonitorViewState.Loaded $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C265963(PagerState pagerState, ImmutableList3<String> immutableList3, Function1<? super CuratedList, Unit> function1, Function1<? super Screener, Unit> function12, ImmutableList3<InvestingMonitorPage> immutableList32, Function2<? super InvestingMonitorSortType, ? super InvestingMonitorPage, Unit> function2, InvestingMonitorViewState.Loaded loaded, Function1<? super InvestingMonitorPage, Unit> function13, Function2<? super CuratedList, ? super String, Unit> function22, Function2<? super CuratedList, ? super String, Unit> function23, Function0<Unit> function0, Function1<? super InvestingMonitorPage, Unit> function14, Function1<? super List<CuratedList>, ? extends Job> function15, SnapshotState<InvestingMonitorPage> snapshotState, Function2<? super InvestingMonitorPage, ? super List<InvestingMonitorAsset>, ? extends Job> function24, Navigator navigator, Context context) {
            this.$pagerState = pagerState;
            this.$titles = immutableList3;
            this.$onListCreated = function1;
            this.$onScreenerCreated = function12;
            this.$pages = immutableList32;
            this.$onSortTypeSelected = function2;
            this.$viewState = loaded;
            this.$onRecentlyCreatedPageProcessed = function13;
            this.$onWatchlistTempRenamed = function22;
            this.$onWatchlistRenamed = function23;
            this.$onWatchlistRenamedCancelled = function0;
            this.$onPageDeleteRequested = function14;
            this.$onTabsReordered = function15;
            this.$activeAssetPageActionsTarget$delegate = snapshotState;
            this.$onAssetMoved = function24;
            this.$navigator = navigator;
            this.$context = context;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Column6 column6;
            final SnapshotState<InvestingMonitorPage> snapshotState;
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
                ComposerKt.traceEventStart(1532106331, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent.<anonymous> (InvestingMonitorComposable.kt:277)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            final PagerState pagerState = this.$pagerState;
            ImmutableList3<String> immutableList3 = this.$titles;
            Function1<CuratedList, Unit> function1 = this.$onListCreated;
            Function1<Screener, Unit> function12 = this.$onScreenerCreated;
            final ImmutableList3<InvestingMonitorPage> immutableList32 = this.$pages;
            final Function2<InvestingMonitorSortType, InvestingMonitorPage, Unit> function2 = this.$onSortTypeSelected;
            InvestingMonitorViewState.Loaded loaded = this.$viewState;
            Function1<InvestingMonitorPage, Unit> function13 = this.$onRecentlyCreatedPageProcessed;
            final Function2<CuratedList, String, Unit> function22 = this.$onWatchlistTempRenamed;
            final Function2<CuratedList, String, Unit> function23 = this.$onWatchlistRenamed;
            final Function0<Unit> function0 = this.$onWatchlistRenamedCancelled;
            final Function1<InvestingMonitorPage, Unit> function14 = this.$onPageDeleteRequested;
            Function1<List<CuratedList>, Job> function15 = this.$onTabsReordered;
            final SnapshotState<InvestingMonitorPage> snapshotState2 = this.$activeAssetPageActionsTarget$delegate;
            Function2<InvestingMonitorPage, List<InvestingMonitorAsset>, Job> function24 = this.$onAssetMoved;
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Column6 column62 = Column6.INSTANCE;
            int currentPage = pagerState.getCurrentPage();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(immutableList32);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$1$lambda$0(immutableList32, snapshotState2, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InvestingMonitorWatchlistTabRow.SelectableTabRow(currentPage, immutableList3, pagerState, function1, function12, (Function1) objRememberedValue, composer, 0);
            composer.startReplaceGroup(503851025);
            if (immutableList32.size() < 1 || immutableList32.get(pagerState.getCurrentPage()).getAssets().isEmpty() || immutableList32.get(pagerState.getCurrentPage()).getCuratedList().isOptionsWatchlist()) {
                column6 = column62;
            } else {
                CuratedList curatedList = immutableList32.get(pagerState.getCurrentPage()).getCuratedList();
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(function2) | composer.changedInstance(immutableList32) | composer.changed(pagerState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$3$lambda$2(function2, immutableList32, pagerState, (InvestingMonitorSortType) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                column6 = column62;
                InvestingMonitorSortActionsRow.SortActionsRow(column6, (Function1) objRememberedValue2, curatedList, null, composer, 6, 4);
            }
            composer.endReplaceGroup();
            PagerKt.m5301HorizontalPager8jOkeI(pagerState, SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null), null, PageSize.Fill.INSTANCE, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(2087685842, true, new InvestingMonitorComposable6(immutableList32, loaded, function24, navigator, context, snapshotState2), composer, 54), composer, 27648, 24576, 16356);
            Object objRememberedValue3 = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            UiEvent<InvestingMonitorPage> recentlyCreatedPage = loaded.getRecentlyCreatedPage();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(loaded) | composer.changedInstance(coroutineScope) | composer.changedInstance(immutableList32) | composer.changed(pagerState) | composer.changed(function13);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion3.getEmpty()) {
                Object investingMonitorComposable8 = new InvestingMonitorComposable8(loaded, coroutineScope, immutableList32, pagerState, function13, null);
                composer.updateRememberedValue(investingMonitorComposable8);
                objRememberedValue4 = investingMonitorComposable8;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(pagerState, recentlyCreatedPage, (Function2) objRememberedValue4, composer, 0);
            InvestingMonitorPage investingMonitorPageMainContent$lambda$3 = InvestingMonitorComposable5.MainContent$lambda$3(snapshotState2);
            composer.startReplaceGroup(504038172);
            if (investingMonitorPageMainContent$lambda$3 != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList32, 10));
                Iterator<InvestingMonitorPage> it = immutableList32.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getCuratedList());
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                composer.startReplaceGroup(5004770);
                Object objRememberedValue5 = composer.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue5 == companion4.getEmpty()) {
                    snapshotState = snapshotState2;
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$7$lambda$6(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                } else {
                    snapshotState = snapshotState2;
                }
                Function0 function02 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(function22);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$10$lambda$9(snapshotState, function22, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function1 function16 = (Function1) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged3 = composer.changed(function23);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue7 == companion4.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$13$lambda$12(snapshotState, function23, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                Function1 function17 = (Function1) objRememberedValue7;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged4 = composer.changed(function0);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue8 == companion4.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$15$lambda$14(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                Function0 function03 = (Function0) objRememberedValue8;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged5 = composer.changed(function14);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged5 || objRememberedValue9 == companion4.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorComposable5.C265963.invoke$lambda$18$lambda$17$lambda$16(function14, snapshotState, (InvestingMonitorPage) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue9);
                }
                composer.endReplaceGroup();
                InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet(investingMonitorPageMainContent$lambda$3, persistentList, function02, function16, function17, function03, (Function1) objRememberedValue9, function15, composer, 384);
            }
            composer.endReplaceGroup();
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
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invoke$lambda$18$lambda$1$lambda$0(ImmutableList3 immutableList3, SnapshotState snapshotState, int i) {
            InvestingMonitorComposable5.MainContent$lambda$4(snapshotState, (InvestingMonitorPage) immutableList3.get(i));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$3$lambda$2(Function2 function2, ImmutableList3 immutableList3, PagerState pagerState, InvestingMonitorSortType sortType) {
            Intrinsics.checkNotNullParameter(sortType, "sortType");
            function2.invoke(sortType, immutableList3.get(pagerState.getCurrentPage()));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$7$lambda$6(SnapshotState snapshotState) {
            InvestingMonitorComposable5.MainContent$lambda$4(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$17$lambda$16(Function1 function1, SnapshotState snapshotState, InvestingMonitorPage page) {
            Intrinsics.checkNotNullParameter(page, "page");
            InvestingMonitorComposable5.MainContent$lambda$4(snapshotState, null);
            function1.invoke(page);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$10$lambda$9(SnapshotState snapshotState, Function2 function2, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            InvestingMonitorPage investingMonitorPageMainContent$lambda$3 = InvestingMonitorComposable5.MainContent$lambda$3(snapshotState);
            if (investingMonitorPageMainContent$lambda$3 != null) {
                function2.invoke(investingMonitorPageMainContent$lambda$3.getCuratedList(), newValue);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$13$lambda$12(SnapshotState snapshotState, Function2 function2, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            InvestingMonitorPage investingMonitorPageMainContent$lambda$3 = InvestingMonitorComposable5.MainContent$lambda$3(snapshotState);
            if (investingMonitorPageMainContent$lambda$3 != null) {
                function2.invoke(investingMonitorPageMainContent$lambda$3.getCuratedList(), newValue);
            }
            InvestingMonitorComposable5.MainContent$lambda$4(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$15$lambda$14(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$4(SnapshotState<InvestingMonitorPage> snapshotState, InvestingMonitorPage investingMonitorPage) {
        snapshotState.setValue(investingMonitorPage);
    }

    public static final void MainContent(final InvestingMonitorViewState.Loaded viewState, final Function2<? super InvestingMonitorPage, ? super List<InvestingMonitorAsset>, ? extends Job> onAssetMoved, final Function1<? super CuratedList, Unit> onListCreated, final Function1<? super Screener, Unit> onScreenerCreated, final Function1<? super InvestingMonitorPage, Unit> onRecentlyCreatedPageProcessed, final Function1<? super InvestingMonitorPage, Unit> onPageDeleteRequested, final Function2<? super InvestingMonitorSortType, ? super InvestingMonitorPage, Unit> onSortTypeSelected, final Function2<? super CuratedList, ? super String, Unit> onWatchlistRenamed, final Function2<? super CuratedList, ? super String, Unit> onWatchlistTempRenamed, final Function0<Unit> onWatchlistRenamedCancelled, final Function1<? super InvestingMonitorViewMode, Unit> onViewModeChanged, final Function1<? super List<CuratedList>, ? extends Job> onTabsReordered, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onAssetMoved, "onAssetMoved");
        Intrinsics.checkNotNullParameter(onListCreated, "onListCreated");
        Intrinsics.checkNotNullParameter(onScreenerCreated, "onScreenerCreated");
        Intrinsics.checkNotNullParameter(onRecentlyCreatedPageProcessed, "onRecentlyCreatedPageProcessed");
        Intrinsics.checkNotNullParameter(onPageDeleteRequested, "onPageDeleteRequested");
        Intrinsics.checkNotNullParameter(onSortTypeSelected, "onSortTypeSelected");
        Intrinsics.checkNotNullParameter(onWatchlistRenamed, "onWatchlistRenamed");
        Intrinsics.checkNotNullParameter(onWatchlistTempRenamed, "onWatchlistTempRenamed");
        Intrinsics.checkNotNullParameter(onWatchlistRenamedCancelled, "onWatchlistRenamedCancelled");
        Intrinsics.checkNotNullParameter(onViewModeChanged, "onViewModeChanged");
        Intrinsics.checkNotNullParameter(onTabsReordered, "onTabsReordered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1812003062);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onAssetMoved) ? 32 : 16;
        }
        int i9 = i4;
        if ((i3 & 4) != 0) {
            i5 = i9 | 384;
        } else if ((i & 384) == 0) {
            i5 = i9 | (composerStartRestartGroup.changedInstance(onListCreated) ? 256 : 128);
        } else {
            i5 = i9;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onScreenerCreated) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onRecentlyCreatedPageProcessed) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i & 196608) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onPageDeleteRequested) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onSortTypeSelected) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onWatchlistRenamed) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i5 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onWatchlistTempRenamed) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i5 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onWatchlistRenamedCancelled) ? 536870912 : 268435456;
        }
        if ((i3 & 1024) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i6 = i2 | (composerStartRestartGroup.changedInstance(onViewModeChanged) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i3 & 2048) != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onTabsReordered) ? 32 : 16;
        }
        int i10 = i3 & 4096;
        if (i10 != 0) {
            i7 = i10;
            i8 = i6 | 384;
        } else {
            i7 = i10;
            int i11 = i6;
            if ((i2 & 384) == 0) {
                i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i8 = i11;
        }
        if ((i5 & 306783379) != 306783378 || (i8 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1812003062, i5, i8, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent (InvestingMonitorComposable.kt:211)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final ImmutableList3<InvestingMonitorPage> pages = viewState.getPages();
            ImmutableList3<String> titles = viewState.getTitles();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pages);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(pages.size());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 3);
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(-883620154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt.MainContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i12) {
                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-883620154, i12, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent.<anonymous> (InvestingMonitorComposable.kt:229)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    InvestingMonitorComposable investingMonitorComposable = InvestingMonitorComposable.INSTANCE;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(investingMonitorComposable.getLambda$164519417$feature_investing_monitor_externalDebug(), modifierFillMaxWidth$default, investingMonitorComposable.m18003getLambda$1279492315$feature_investing_monitor_externalDebug(), ComposableLambda3.rememberComposableLambda(-1109005468, true, new AnonymousClass1(viewState, onViewModeChanged), composer3, 54), null, false, false, null, null, 0L, null, composer3, 3510, 0, 2032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: InvestingMonitorComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ Function1<InvestingMonitorViewMode, Unit> $onViewModeChanged;
                    final /* synthetic */ InvestingMonitorViewState.Loaded $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(InvestingMonitorViewState.Loaded loaded, Function1<? super InvestingMonitorViewMode, Unit> function1) {
                        this.$viewState = loaded;
                        this.$onViewModeChanged = function1;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                        invoke(row5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, InvestingMonitorViewState.Loaded loaded) {
                        function1.invoke(loaded.getViewMode());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1109005468, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent.<anonymous>.<anonymous> (InvestingMonitorComposable.kt:239)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                        long jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU();
                        BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(this.$viewState.getViewMode().getIcon());
                        String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_switch_view_mode, composer, 0);
                        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                        BentoIconButton4.Type type2 = BentoIconButton4.Type.Primary;
                        float fM21594getXlargeD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changed(this.$onViewModeChanged);
                        final Function1<InvestingMonitorViewMode, Unit> function1 = this.$onViewModeChanged;
                        final InvestingMonitorViewState.Loaded loaded = this.$viewState;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestingMonitorComposable5.C265941.AnonymousClass1.invoke$lambda$1$lambda$0(function1, loaded);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, heroSize24, strStringResource, null, type2, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21372getBg20d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), C2002Dp.m7993boximpl(fM21594getXlargeD9Ej5fM), false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 100687872, 0, 1064);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1837873699, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt.MainContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: InvestingMonitorComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ PagerState $pagerState;
                    final /* synthetic */ ImmutableList3<InvestingMonitorPage> $pages;

                    AnonymousClass1(ImmutableList3<InvestingMonitorPage> immutableList3, PagerState pagerState, Navigator navigator, Context context) {
                        this.$pages = immutableList3;
                        this.$pagerState = pagerState;
                        this.$navigator = navigator;
                        this.$context = context;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1068569680, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent.<anonymous>.<anonymous> (InvestingMonitorComposable.kt:257)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null);
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                        RoundedCornerShape circleShape = RoundedCornerShape2.getCircleShape();
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(this.$pages) | composer.changed(this.$pagerState) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                        final ImmutableList3<InvestingMonitorPage> immutableList3 = this.$pages;
                        final PagerState pagerState = this.$pagerState;
                        final Navigator navigator = this.$navigator;
                        final Context context = this.$context;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestingMonitorComposable5.C265952.AnonymousClass1.invoke$lambda$1$lambda$0(immutableList3, pagerState, navigator, context);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        FloatingActionButtonKt.m5864FloatingActionButtonXz6DiA((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, circleShape, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, null, InvestingMonitorComposable.INSTANCE.m18002getLambda$1205112978$feature_investing_monitor_externalDebug(), composer, 12582912, 96);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Multi-variable type inference failed */
                    public static final Unit invoke$lambda$1$lambda$0(ImmutableList3 immutableList3, PagerState pagerState, Navigator navigator, Context context) {
                        InvestingMonitorUiUtils.launchAssetAddAction(((InvestingMonitorPage) immutableList3.get(pagerState.getCurrentPage())).getCuratedList(), navigator, context);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer3, int i12) {
                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1837873699, i12, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent.<anonymous> (InvestingMonitorComposable.kt:254)");
                    }
                    if (!pages.get(pagerStateRememberPagerState.getCurrentPage()).getAssets().isEmpty()) {
                        BentoTheme2.BentoTheme(null, null, null, null, Boolean.TRUE, null, null, null, ComposableLambda3.rememberComposableLambda(-1068569680, true, new AnonymousClass1(pages, pagerStateRememberPagerState, navigator, context), composer3, 54), composer3, 100687872, 239);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), WindowInsetsKt.m5185WindowInsetsa9UjIt4$default(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), ComposableLambda3.rememberComposableLambda(1532106331, true, new C265963(pagerStateRememberPagerState, titles, onListCreated, onScreenerCreated, pages, onSortTypeSelected, viewState, onRecentlyCreatedPageProcessed, onWatchlistTempRenamed, onWatchlistRenamed, onWatchlistRenamedCancelled, onPageDeleteRequested, onTabsReordered, snapshotState, onAssetMoved, navigator, context), composer2, 54), composer2, 805330992, 108);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorComposable5.MainContent$lambda$7(viewState, onAssetMoved, onListCreated, onScreenerCreated, onRecentlyCreatedPageProcessed, onPageDeleteRequested, onSortTypeSelected, onWatchlistRenamed, onWatchlistTempRenamed, onWatchlistRenamedCancelled, onViewModeChanged, onTabsReordered, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
