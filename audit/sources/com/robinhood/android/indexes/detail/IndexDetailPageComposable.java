package com.robinhood.android.indexes.detail;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.detail.component.about.DetailPageAboutComposable;
import com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBar3;
import com.robinhood.android.common.detail.component.disclosure.DetailPageDisclosureComposable;
import com.robinhood.android.common.detail.component.fundamentals.DetailPageFundamentalsComposable;
import com.robinhood.android.common.detail.component.history.DetailPageHistoryComposable;
import com.robinhood.android.common.detail.component.infobanner.DetailPageIacInfoBanner;
import com.robinhood.android.common.detail.component.news.DetailPageNewsComposable;
import com.robinhood.android.common.detail.component.optionsposition.DetailPageOptionsPositionComposable;
import com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposable;
import com.robinhood.android.common.detail.component.topbaraction.DetailPageAddToWatchlistActionComposable;
import com.robinhood.android.indexes.detail.components.about.IndexDetailPageAboutDuxo;
import com.robinhood.android.indexes.detail.components.appbar.IndexDetailPageTopAppBarDuxo;
import com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo;
import com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt;
import com.robinhood.android.indexes.detail.components.disclosure.IndexDetailPageDisclosureDuxo;
import com.robinhood.android.indexes.detail.components.fundamentals.IndexDetailPageFundamentalsDuxo;
import com.robinhood.android.indexes.detail.components.history.IndexDetailPageHistoryDuxo;
import com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo;
import com.robinhood.android.indexes.detail.components.news.IndexDetailPageNewsDuxo;
import com.robinhood.android.indexes.detail.components.optionsposition.IndexDetailPageOptionsPositionDuxo;
import com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo;
import com.robinhood.android.indexes.detail.components.topbaraction.IndexDetailPageAddToWatchlistActionDuxo;
import com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo;
import com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposable;
import com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSection;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.tooltips.ModifiersKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: IndexDetailPageComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"IndexDetailPageComposable", "", "duxo", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDuxo;", "indexId", "Ljava/util/UUID;", "onAddToWatchlistClicked", "Lkotlin/Function2;", "", "Lcom/robinhood/models/db/Security;", "onBackPressed", "Lkotlin/Function0;", "onPageDirectionUpdated", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/indexes/detail/IndexDetailPageDuxo;Ljava/util/UUID;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CANVAS_TAG", "", "feature-index-detail-page_externalDebug", "viewState", "Lcom/robinhood/android/indexes/detail/IndexDetailPageViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndexDetailPageComposable {
    public static final String CANVAS_TAG = "index_detail_page_canvas";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndexDetailPageComposable$lambda$4(IndexDetailPageDuxo indexDetailPageDuxo, UUID uuid, Function2 function2, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IndexDetailPageComposable(indexDetailPageDuxo, uuid, function2, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IndexDetailPageComposable(final IndexDetailPageDuxo duxo, final UUID indexId, final Function2<? super Boolean, ? super Security, Unit> onAddToWatchlistClicked, final Function0<Unit> onBackPressed, final Function1<? super Direction, Unit> onPageDirectionUpdated, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(onAddToWatchlistClicked, "onAddToWatchlistClicked");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onPageDirectionUpdated, "onPageDirectionUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(1556841640);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(indexId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddToWatchlistClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPageDirectionUpdated) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1556841640, i3, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable (IndexDetailPageComposable.kt:57)");
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changedInstance(indexId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IndexDetailPageComposable.IndexDetailPageComposable$lambda$2$lambda$1(duxo, indexId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(indexId, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 2);
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer2, 0, 1);
                final String accountNumber = IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getAccountNumber();
                final UUID instrumentId = IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getInstrumentId();
                final String symbol = IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getSymbol();
                BentoThemeOverlays.DirectionThemeOverlay(IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getPageDirection(), ComposableLambda3.rememberComposableLambda(559645634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2
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
                            ComposerKt.traceEventStart(559645634, i5, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous> (IndexDetailPageComposable.kt:72)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                        final ScrollState scrollState = scrollStateRememberScrollState;
                        final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                        final Function0<Unit> function0 = onBackPressed;
                        final String str = accountNumber;
                        final UUID uuid = instrumentId;
                        final String str2 = symbol;
                        final Function2<Boolean, Security, Unit> function2 = onAddToWatchlistClicked;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-858523522, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-858523522, i7, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous>.<anonymous> (IndexDetailPageComposable.kt:76)");
                                }
                                ScrollState scrollState2 = scrollState;
                                TopBarScrollState topBarScrollState2 = topBarScrollState;
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer4, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageTopAppBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer4.changedInstance(baseDuxo) | composer4.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$invoke$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$invoke$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer4, 0);
                                composer4.endReplaceGroup();
                                Function0<Unit> function02 = function0;
                                final String str3 = str;
                                final UUID uuid2 = uuid;
                                final String str4 = str2;
                                final Function2<Boolean, Security, Unit> function22 = function2;
                                DetailPageTopAppBar3.DetailPageTopAppBar(scrollState2, topBarScrollState2, baseDuxo, function02, null, ComposableLambda3.rememberComposableLambda(1926613903, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                                        invoke(row5, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 DetailPageTopAppBar, Composer composer5, int i8) {
                                        UUID uuid3;
                                        Intrinsics.checkNotNullParameter(DetailPageTopAppBar, "$this$DetailPageTopAppBar");
                                        if ((i8 & 17) == 16 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1926613903, i8, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous>.<anonymous>.<anonymous> (IndexDetailPageComposable.kt:82)");
                                        }
                                        composer5.startReplaceGroup(345057352);
                                        String str5 = str3;
                                        if (str5 != null && (uuid3 = uuid2) != null && str4 != null) {
                                            DetailPageOpenPipActionComposable.DetailPageOpenPipActionComposable(str5, uuid3, null, null, composer5, 0, 12);
                                        }
                                        composer5.endReplaceGroup();
                                        composer5.startReplaceGroup(-747520797);
                                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer5, LocalViewModelStoreOwner.$stable);
                                        if (current2 == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer5, 0);
                                        composer5.startReplaceableGroup(1729797275);
                                        ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageAddToWatchlistActionDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer5, 0, 0);
                                        composer5.endReplaceableGroup();
                                        final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                                        final Lifecycle lifecycle2 = ((LifecycleOwner) composer5.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                        composer5.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance3 = composer5.changedInstance(baseDuxo2) | composer5.changedInstance(lifecycle2);
                                        Object objRememberedValue3 = composer5.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$1$invoke$$inlined$duxo$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                                    lifecycle2.addObserver(duxoLifecycleObserver);
                                                    final Lifecycle lifecycle3 = lifecycle2;
                                                    return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$1$invoke$$inlined$duxo$1.1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            lifecycle3.removeObserver(duxoLifecycleObserver);
                                                        }
                                                    };
                                                }
                                            };
                                            composer5.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer5.endReplaceGroup();
                                        EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer5, 0);
                                        composer5.endReplaceGroup();
                                        DetailPageAddToWatchlistActionComposable.DetailPageAddToWatchlistActionComposable(baseDuxo2, null, function22, composer5, 0, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, (TopBarScrollState.$stable << 3) | 196608, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final SnapshotState4<IndexDetailPageViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final Modifier modifier5 = modifier4;
                        final ScrollState scrollState2 = scrollStateRememberScrollState;
                        final Function1<Direction, Unit> function1 = onPageDirectionUpdated;
                        final String str3 = accountNumber;
                        final UUID uuid2 = instrumentId;
                        final String str4 = symbol;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1652090323, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2.2
                            public final void invoke(PaddingValues contentPadding, Composer composer4, int i7) {
                                int i8;
                                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                if ((i7 & 6) == 0) {
                                    i8 = i7 | (composer4.changed(contentPadding) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1652090323, i8, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous>.<anonymous> (IndexDetailPageComposable.kt:96)");
                                }
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 0.0f, 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(IndexDetailPageComposable.IndexDetailPageComposable$lambda$3(snapshotState4).getTradeBarHeight()), 7, null);
                                Modifier modifier6 = modifier5;
                                ScrollState scrollState3 = scrollState2;
                                Function1<Direction, Unit> function12 = function1;
                                String str5 = str3;
                                UUID uuid3 = uuid2;
                                String str6 = str4;
                                SnapshotState4<IndexDetailPageViewState> snapshotState42 = snapshotState4;
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierUpdateTooltipCanvas = ModifiersKt.updateTooltipCanvas(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(modifier6, scrollState3, false, null, false, 14, null), 0.0f, 1, null), IndexDetailPageComposable.CANVAS_TAG);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composer4, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierUpdateTooltipCanvas);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer4.startReplaceGroup(-747520797);
                                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                                int i9 = LocalViewModelStoreOwner.$stable;
                                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageIacInfoBannerDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer4.changedInstance(baseDuxo) | composer4.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageIacInfoBanner.DetailPageIacInfoBanner(baseDuxo, composer4, 0);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current2 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexHistoricalChartDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                                final Lifecycle lifecycle2 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance3 = composer4.changedInstance(baseDuxo2) | composer4.changedInstance(lifecycle2);
                                Object objRememberedValue3 = composer4.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                            lifecycle2.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle3 = lifecycle2;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$2.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle3.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue3);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer4, 0);
                                composer4.endReplaceGroup();
                                IndexHistoricalChartKt.IndexHistoricalChart((IndexHistoricalChartDuxo) baseDuxo2, null, function12, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current3 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory3 = DuxosKt.createViewModelFactory(current3, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel3 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageUpcomingActivityDuxo.class), current3, (String) null, factoryCreateViewModelFactory3, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo3 = (BaseDuxo) viewModel3;
                                final Lifecycle lifecycle3 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance4 = composer4.changedInstance(baseDuxo3) | composer4.changedInstance(lifecycle3);
                                Object objRememberedValue4 = composer4.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo3);
                                            lifecycle3.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle4 = lifecycle3;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$3.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle4.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue4);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageHistoryComposable.DetailPageHistoryComposable(baseDuxo3, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current4 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current4 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory4 = DuxosKt.createViewModelFactory(current4, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageOptionsPositionDuxo.class), current4, (String) null, factoryCreateViewModelFactory4, current4 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current4).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo4 = (BaseDuxo) viewModel4;
                                final Lifecycle lifecycle4 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance5 = composer4.changedInstance(baseDuxo4) | composer4.changedInstance(lifecycle4);
                                Object objRememberedValue5 = composer4.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo4);
                                            lifecycle4.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle5 = lifecycle4;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$4.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle5.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue5);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageOptionsPositionComposable.DetailPageOptionsPositionComposable(baseDuxo4, null, composer4, 0, 2);
                                composer4.startReplaceGroup(131267539);
                                if (IndexDetailPageComposable.IndexDetailPageComposable$lambda$3(snapshotState42).getPnlUpdatesEnabled() && str5 != null && uuid3 != null && str6 != null) {
                                    ClosedPnlSection.ClosedPnlSection("idp", str5, uuid3, str6, null, composer4, 6, 16);
                                }
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current5 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current5 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory5 = DuxosKt.createViewModelFactory(current5, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel5 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageAboutDuxo.class), current5, (String) null, factoryCreateViewModelFactory5, current5 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current5).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo5 = (BaseDuxo) viewModel5;
                                final Lifecycle lifecycle5 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance6 = composer4.changedInstance(baseDuxo5) | composer4.changedInstance(lifecycle5);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo5);
                                            lifecycle5.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle6 = lifecycle5;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$5.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle6.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageAboutComposable.DetailPageAboutComposable(baseDuxo5, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current6 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory6 = DuxosKt.createViewModelFactory(current6, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel6 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageFundamentalsDuxo.class), current6, (String) null, factoryCreateViewModelFactory6, current6 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current6).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo6 = (BaseDuxo) viewModel6;
                                final Lifecycle lifecycle6 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance7 = composer4.changedInstance(baseDuxo6) | composer4.changedInstance(lifecycle6);
                                Object objRememberedValue7 = composer4.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo6);
                                            lifecycle6.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle7 = lifecycle6;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$6.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle7.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue7);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle6, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageFundamentalsComposable.DetailPageFundamentalsComposable(baseDuxo6, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current7 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory7 = DuxosKt.createViewModelFactory(current7, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel7 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageNewsDuxo.class), current7, (String) null, factoryCreateViewModelFactory7, current7 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current7).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo7 = (BaseDuxo) viewModel7;
                                final Lifecycle lifecycle7 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance8 = composer4.changedInstance(baseDuxo7) | composer4.changedInstance(lifecycle7);
                                Object objRememberedValue8 = composer4.rememberedValue();
                                if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo7);
                                            lifecycle7.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle8 = lifecycle7;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$7.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle8.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue8);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageNewsComposable.DetailPageNewsComposable(baseDuxo7, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current8 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current8 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory8 = DuxosKt.createViewModelFactory(current8, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel8 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageRelatedListDuxo.class), current8, (String) null, factoryCreateViewModelFactory8, current8 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current8).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo8 = (BaseDuxo) viewModel8;
                                final Lifecycle lifecycle8 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance9 = composer4.changedInstance(baseDuxo8) | composer4.changedInstance(lifecycle8);
                                Object objRememberedValue9 = composer4.rememberedValue();
                                if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$8
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo8);
                                            lifecycle8.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle9 = lifecycle8;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$8.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle9.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue9);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageRelatedListComposable.DetailPageRelatedListComposable(baseDuxo8, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current9 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current9 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory9 = DuxosKt.createViewModelFactory(current9, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel9 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageHistoryDuxo.class), current9, (String) null, factoryCreateViewModelFactory9, current9 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current9).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo9 = (BaseDuxo) viewModel9;
                                final Lifecycle lifecycle9 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance10 = composer4.changedInstance(baseDuxo9) | composer4.changedInstance(lifecycle9);
                                Object objRememberedValue10 = composer4.rememberedValue();
                                if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo9);
                                            lifecycle9.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle10 = lifecycle9;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$9.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle10.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue10);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle9, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageHistoryComposable.DetailPageHistoryComposable(baseDuxo9, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current10 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory10 = DuxosKt.createViewModelFactory(current10, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel10 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageDisclosureDuxo.class), current10, (String) null, factoryCreateViewModelFactory10, current10 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current10).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo10 = (BaseDuxo) viewModel10;
                                final Lifecycle lifecycle10 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance11 = composer4.changedInstance(baseDuxo10) | composer4.changedInstance(lifecycle10);
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChangedInstance11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo10);
                                            lifecycle10.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle11 = lifecycle10;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$10.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle11.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle10, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue11, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageDisclosureComposable.DetailPageDisclosureComposable(baseDuxo10, null, composer4, 0, 2);
                                composer4.endNode();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IndexDetailPageComposable.IndexDetailPageComposable$lambda$4(duxo, indexId, onAddToWatchlistClicked, onBackPressed, onPageDirectionUpdated, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changedInstance(indexId);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IndexDetailPageComposable.IndexDetailPageComposable$lambda$2$lambda$1(duxo, indexId, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                LifecycleEffectKt.LifecycleResumeEffect(indexId, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 2);
                final SnapshotState4<IndexDetailPageViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer2, 0, 1);
                final String accountNumber2 = IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getAccountNumber();
                final UUID instrumentId2 = IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getInstrumentId();
                final String symbol2 = IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getSymbol();
                BentoThemeOverlays.DirectionThemeOverlay(IndexDetailPageComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getPageDirection(), ComposableLambda3.rememberComposableLambda(559645634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2
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
                            ComposerKt.traceEventStart(559645634, i5, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous> (IndexDetailPageComposable.kt:72)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                        final ScrollState scrollState = scrollStateRememberScrollState2;
                        final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState2;
                        final Function0<Unit> function0 = onBackPressed;
                        final String str = accountNumber2;
                        final UUID uuid = instrumentId2;
                        final String str2 = symbol2;
                        final Function2<? super Boolean, ? super Security, Unit> function2 = onAddToWatchlistClicked;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-858523522, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-858523522, i7, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous>.<anonymous> (IndexDetailPageComposable.kt:76)");
                                }
                                ScrollState scrollState2 = scrollState;
                                TopBarScrollState topBarScrollState2 = topBarScrollState;
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer4, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageTopAppBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer4.changedInstance(baseDuxo) | composer4.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$invoke$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$invoke$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer4, 0);
                                composer4.endReplaceGroup();
                                Function0<Unit> function02 = function0;
                                final String str3 = str;
                                final UUID uuid2 = uuid;
                                final String str4 = str2;
                                final Function2<? super Boolean, ? super Security, Unit> function22 = function2;
                                DetailPageTopAppBar3.DetailPageTopAppBar(scrollState2, topBarScrollState2, baseDuxo, function02, null, ComposableLambda3.rememberComposableLambda(1926613903, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                                        invoke(row5, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 DetailPageTopAppBar, Composer composer5, int i8) {
                                        UUID uuid3;
                                        Intrinsics.checkNotNullParameter(DetailPageTopAppBar, "$this$DetailPageTopAppBar");
                                        if ((i8 & 17) == 16 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1926613903, i8, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous>.<anonymous>.<anonymous> (IndexDetailPageComposable.kt:82)");
                                        }
                                        composer5.startReplaceGroup(345057352);
                                        String str5 = str3;
                                        if (str5 != null && (uuid3 = uuid2) != null && str4 != null) {
                                            DetailPageOpenPipActionComposable.DetailPageOpenPipActionComposable(str5, uuid3, null, null, composer5, 0, 12);
                                        }
                                        composer5.endReplaceGroup();
                                        composer5.startReplaceGroup(-747520797);
                                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer5, LocalViewModelStoreOwner.$stable);
                                        if (current2 == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer5, 0);
                                        composer5.startReplaceableGroup(1729797275);
                                        ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageAddToWatchlistActionDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer5, 0, 0);
                                        composer5.endReplaceableGroup();
                                        final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                                        final Lifecycle lifecycle2 = ((LifecycleOwner) composer5.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                        composer5.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance3 = composer5.changedInstance(baseDuxo2) | composer5.changedInstance(lifecycle2);
                                        Object objRememberedValue3 = composer5.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$1$invoke$$inlined$duxo$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                                    lifecycle2.addObserver(duxoLifecycleObserver);
                                                    final Lifecycle lifecycle3 = lifecycle2;
                                                    return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$1$1$invoke$$inlined$duxo$1.1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            lifecycle3.removeObserver(duxoLifecycleObserver);
                                                        }
                                                    };
                                                }
                                            };
                                            composer5.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer5.endReplaceGroup();
                                        EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer5, 0);
                                        composer5.endReplaceGroup();
                                        DetailPageAddToWatchlistActionComposable.DetailPageAddToWatchlistActionComposable(baseDuxo2, null, function22, composer5, 0, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, (TopBarScrollState.$stable << 3) | 196608, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final SnapshotState4<IndexDetailPageViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final Modifier modifier5 = modifier4;
                        final ScrollState scrollState2 = scrollStateRememberScrollState2;
                        final Function1<? super Direction, Unit> function1 = onPageDirectionUpdated;
                        final String str3 = accountNumber2;
                        final UUID uuid2 = instrumentId2;
                        final String str4 = symbol2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1652090323, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt.IndexDetailPageComposable.2.2
                            public final void invoke(PaddingValues contentPadding, Composer composer4, int i7) {
                                int i8;
                                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                if ((i7 & 6) == 0) {
                                    i8 = i7 | (composer4.changed(contentPadding) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1652090323, i8, -1, "com.robinhood.android.indexes.detail.IndexDetailPageComposable.<anonymous>.<anonymous> (IndexDetailPageComposable.kt:96)");
                                }
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 0.0f, 0.0f, ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(IndexDetailPageComposable.IndexDetailPageComposable$lambda$3(snapshotState4).getTradeBarHeight()), 7, null);
                                Modifier modifier6 = modifier5;
                                ScrollState scrollState3 = scrollState2;
                                Function1<Direction, Unit> function12 = function1;
                                String str5 = str3;
                                UUID uuid3 = uuid2;
                                String str6 = str4;
                                SnapshotState4<IndexDetailPageViewState> snapshotState42 = snapshotState4;
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierUpdateTooltipCanvas = ModifiersKt.updateTooltipCanvas(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(modifier6, scrollState3, false, null, false, 14, null), 0.0f, 1, null), IndexDetailPageComposable.CANVAS_TAG);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composer4, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierUpdateTooltipCanvas);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer4.startReplaceGroup(-747520797);
                                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                                int i9 = LocalViewModelStoreOwner.$stable;
                                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageIacInfoBannerDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer4.changedInstance(baseDuxo) | composer4.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageIacInfoBanner.DetailPageIacInfoBanner(baseDuxo, composer4, 0);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current2 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexHistoricalChartDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                                final Lifecycle lifecycle2 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance3 = composer4.changedInstance(baseDuxo2) | composer4.changedInstance(lifecycle2);
                                Object objRememberedValue3 = composer4.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                            lifecycle2.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle3 = lifecycle2;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$2.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle3.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue3);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer4, 0);
                                composer4.endReplaceGroup();
                                IndexHistoricalChartKt.IndexHistoricalChart((IndexHistoricalChartDuxo) baseDuxo2, null, function12, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current3 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory3 = DuxosKt.createViewModelFactory(current3, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel3 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageUpcomingActivityDuxo.class), current3, (String) null, factoryCreateViewModelFactory3, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo3 = (BaseDuxo) viewModel3;
                                final Lifecycle lifecycle3 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance4 = composer4.changedInstance(baseDuxo3) | composer4.changedInstance(lifecycle3);
                                Object objRememberedValue4 = composer4.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo3);
                                            lifecycle3.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle4 = lifecycle3;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$3.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle4.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue4);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageHistoryComposable.DetailPageHistoryComposable(baseDuxo3, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current4 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current4 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory4 = DuxosKt.createViewModelFactory(current4, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageOptionsPositionDuxo.class), current4, (String) null, factoryCreateViewModelFactory4, current4 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current4).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo4 = (BaseDuxo) viewModel4;
                                final Lifecycle lifecycle4 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance5 = composer4.changedInstance(baseDuxo4) | composer4.changedInstance(lifecycle4);
                                Object objRememberedValue5 = composer4.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo4);
                                            lifecycle4.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle5 = lifecycle4;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$4.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle5.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue5);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageOptionsPositionComposable.DetailPageOptionsPositionComposable(baseDuxo4, null, composer4, 0, 2);
                                composer4.startReplaceGroup(131267539);
                                if (IndexDetailPageComposable.IndexDetailPageComposable$lambda$3(snapshotState42).getPnlUpdatesEnabled() && str5 != null && uuid3 != null && str6 != null) {
                                    ClosedPnlSection.ClosedPnlSection("idp", str5, uuid3, str6, null, composer4, 6, 16);
                                }
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current5 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current5 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory5 = DuxosKt.createViewModelFactory(current5, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel5 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageAboutDuxo.class), current5, (String) null, factoryCreateViewModelFactory5, current5 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current5).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo5 = (BaseDuxo) viewModel5;
                                final Lifecycle lifecycle5 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance6 = composer4.changedInstance(baseDuxo5) | composer4.changedInstance(lifecycle5);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo5);
                                            lifecycle5.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle6 = lifecycle5;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$5.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle6.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageAboutComposable.DetailPageAboutComposable(baseDuxo5, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current6 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory6 = DuxosKt.createViewModelFactory(current6, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel6 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageFundamentalsDuxo.class), current6, (String) null, factoryCreateViewModelFactory6, current6 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current6).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo6 = (BaseDuxo) viewModel6;
                                final Lifecycle lifecycle6 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance7 = composer4.changedInstance(baseDuxo6) | composer4.changedInstance(lifecycle6);
                                Object objRememberedValue7 = composer4.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo6);
                                            lifecycle6.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle7 = lifecycle6;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$6.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle7.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue7);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle6, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageFundamentalsComposable.DetailPageFundamentalsComposable(baseDuxo6, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current7 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory7 = DuxosKt.createViewModelFactory(current7, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel7 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageNewsDuxo.class), current7, (String) null, factoryCreateViewModelFactory7, current7 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current7).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo7 = (BaseDuxo) viewModel7;
                                final Lifecycle lifecycle7 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance8 = composer4.changedInstance(baseDuxo7) | composer4.changedInstance(lifecycle7);
                                Object objRememberedValue8 = composer4.rememberedValue();
                                if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo7);
                                            lifecycle7.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle8 = lifecycle7;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$7.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle8.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue8);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageNewsComposable.DetailPageNewsComposable(baseDuxo7, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current8 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current8 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory8 = DuxosKt.createViewModelFactory(current8, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel8 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageRelatedListDuxo.class), current8, (String) null, factoryCreateViewModelFactory8, current8 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current8).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo8 = (BaseDuxo) viewModel8;
                                final Lifecycle lifecycle8 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance9 = composer4.changedInstance(baseDuxo8) | composer4.changedInstance(lifecycle8);
                                Object objRememberedValue9 = composer4.rememberedValue();
                                if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$8
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo8);
                                            lifecycle8.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle9 = lifecycle8;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$8.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle9.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue9);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageRelatedListComposable.DetailPageRelatedListComposable(baseDuxo8, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current9 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current9 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory9 = DuxosKt.createViewModelFactory(current9, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel9 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageHistoryDuxo.class), current9, (String) null, factoryCreateViewModelFactory9, current9 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current9).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo9 = (BaseDuxo) viewModel9;
                                final Lifecycle lifecycle9 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance10 = composer4.changedInstance(baseDuxo9) | composer4.changedInstance(lifecycle9);
                                Object objRememberedValue10 = composer4.rememberedValue();
                                if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo9);
                                            lifecycle9.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle10 = lifecycle9;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$9.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle10.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue10);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle9, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageHistoryComposable.DetailPageHistoryComposable(baseDuxo9, null, composer4, 0, 2);
                                composer4.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current10 = localViewModelStoreOwner.getCurrent(composer4, i9);
                                if (current10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory10 = DuxosKt.createViewModelFactory(current10, composer4, 0);
                                composer4.startReplaceableGroup(1729797275);
                                ViewModel viewModel10 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IndexDetailPageDisclosureDuxo.class), current10, (String) null, factoryCreateViewModelFactory10, current10 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current10).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer4, 0, 0);
                                composer4.endReplaceableGroup();
                                final BaseDuxo baseDuxo10 = (BaseDuxo) viewModel10;
                                final Lifecycle lifecycle10 = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChangedInstance11 = composer4.changedInstance(baseDuxo10) | composer4.changedInstance(lifecycle10);
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChangedInstance11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo10);
                                            lifecycle10.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle11 = lifecycle10;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$2$2$invoke$lambda$2$lambda$1$$inlined$duxo$10.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle11.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle10, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue11, composer4, 0);
                                composer4.endReplaceGroup();
                                DetailPageDisclosureComposable.DetailPageDisclosureComposable(baseDuxo10, null, composer4, 0, 2);
                                composer4.endNode();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult IndexDetailPageComposable$lambda$2$lambda$1(IndexDetailPageDuxo indexDetailPageDuxo, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = indexDetailPageDuxo.bind(uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageComposableKt$IndexDetailPageComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexDetailPageViewState IndexDetailPageComposable$lambda$3(SnapshotState4<IndexDetailPageViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
