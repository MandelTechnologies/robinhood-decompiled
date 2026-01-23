package com.robinhood.android.assethomes;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeComposable;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection2;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.api.AssetHomeStateOrdering;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomeComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"AssetHomeComposable", "", "viewState", "Lcom/robinhood/android/assethomes/AssetHomeViewState;", "onChartLoaded", "Lkotlin/Function0;", "onBack", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "modifier", "Landroidx/compose/ui/Modifier;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onPnlNavigate", "(Lcom/robinhood/android/assethomes/AssetHomeViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "assetHistoryType", "Lcom/robinhood/android/assethomes/shared/AssetHistoryType;", "Lcom/robinhood/android/models/portfolio/AssetHomeState;", "getAssetHistoryType", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;)Lcom/robinhood/android/assethomes/shared/AssetHistoryType;", "feature-asset-homes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomeComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeComposable {

    /* compiled from: AssetHomeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType.values().length];
            try {
                iArr[AssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeComposable$lambda$5(AssetHomeViewState assetHomeViewState, Function0 function0, Function0 function02, Navigator navigator, Modifier modifier, LazyListState lazyListState, Function0 function03, int i, int i2, Composer composer, int i3) {
        AssetHomeComposable(assetHomeViewState, function0, function02, navigator, modifier, lazyListState, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetHomeComposable(final AssetHomeViewState viewState, final Function0<Unit> onChartLoaded, final Function0<Unit> onBack, final Navigator navigator, Modifier modifier, LazyListState lazyListState, final Function0<Unit> onPnlNavigate, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListState2;
        final LazyListState lazyListStateRememberLazyListState;
        Modifier modifier3;
        int i4;
        int i5;
        String str;
        String strRegionGateStringResource;
        int i6;
        final LazyListState lazyListState3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onChartLoaded, "onChartLoaded");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onPnlNavigate, "onPnlNavigate");
        Composer composerStartRestartGroup = composer.startRestartGroup(330746400);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChartLoaded) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    lazyListState2 = lazyListState;
                    int i8 = composerStartRestartGroup.changed(lazyListState2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    lazyListState2 = lazyListState;
                }
                i3 |= i8;
            } else {
                lazyListState2 = lazyListState;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPnlNavigate) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 32) == 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -458753;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(330746400, i3, -1, "com.robinhood.android.assethomes.AssetHomeComposable (AssetHomeComposable.kt:42)");
                    }
                    final AssetHomeState assetHomeState = viewState.getAssetHomeState();
                    int i9 = i3 >> 6;
                    Function1<ReorderableLazyListScope, Unit> function1AssetHomePnlHubEntryPoint = AssetHomePositionListSections.assetHomePnlHubEntryPoint(assetHomeState, navigator, viewState.getPnlShowNewTag(), viewState.getPnlUpdatesEnabled(), onPnlNavigate, composerStartRestartGroup, i9 & 57456);
                    Function1<ReorderableLazyListScope, Unit> function1AssetHomeOptionsPortfolioRiskAnalyzerEntryPoint = AssetHomePositionListSections.assetHomeOptionsPortfolioRiskAnalyzerEntryPoint(assetHomeState, navigator, composerStartRestartGroup, i9 & 112);
                    composerStartRestartGroup.startReplaceGroup(19741756);
                    PerformanceChartType performanceChartType = null;
                    Function1<ReorderableLazyListScope, Unit> function1AssetHomePendingEquitiesSection = assetHomeState == null ? null : AssetHomePositionListSections.assetHomePendingEquitiesSection(assetHomeState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(19746229);
                    Function1<ReorderableLazyListScope, Unit> function1AssetHomeEquitiesSection = assetHomeState == null ? null : AssetHomePositionListSections.assetHomeEquitiesSection(assetHomeState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(19750683);
                    Function1<ReorderableLazyListScope, Unit> function1AssetHomePendingOptionsSection = assetHomeState == null ? null : AssetHomePositionListSections.assetHomePendingOptionsSection(assetHomeState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(19755092);
                    Function1<ReorderableLazyListScope, Unit> function1AssetHomeOptionsSection = assetHomeState == null ? null : AssetHomePositionListSections.assetHomeOptionsSection(assetHomeState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(19759682);
                    Function1<LazyListScope, Unit> function1AssetHistoryPreviewSection = assetHomeState == null ? null : AssetHistoryPreviewSection.assetHistoryPreviewSection(assetHomeState.getAccountNumber(), viewState.getBrokerageAccountType(), getAssetHistoryType(assetHomeState), null, null, composerStartRestartGroup, 0, 24);
                    composerStartRestartGroup.endReplaceGroup();
                    final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                    AssetType assetType = assetHomeState != null ? assetHomeState.getAssetType() : null;
                    i4 = assetType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
                    if (i4 == -1) {
                        i5 = 1;
                        str = "Futures not supported";
                        composerStartRestartGroup.startReplaceGroup(613323965);
                        composerStartRestartGroup.endReplaceGroup();
                        strRegionGateStringResource = null;
                    } else if (i4 == 1) {
                        composerStartRestartGroup.startReplaceGroup(19772950);
                        i5 = 1;
                        str = "Futures not supported";
                        strRegionGateStringResource = LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C9612R.string.equities_title, C9612R.string.equities_title_without_etf, null, composerStartRestartGroup, 0, 8);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                composerStartRestartGroup.startReplaceGroup(19771045);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(19783038);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new IllegalStateException("Futures not supported");
                        }
                        composerStartRestartGroup.startReplaceGroup(19780742);
                        String strStringResource = StringResources_androidKt.stringResource(C9612R.string.options_title, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        strRegionGateStringResource = strStringResource;
                        i5 = 1;
                        str = "Futures not supported";
                    }
                    AssetType assetType2 = assetHomeState != null ? assetHomeState.getAssetType() : null;
                    i6 = assetType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[assetType2.ordinal()];
                    if (i6 != -1) {
                        if (i6 == i5) {
                            performanceChartType = PerformanceChartType.EQUITY;
                        } else {
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    throw new IllegalStateException(str);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            performanceChartType = PerformanceChartType.OPTIONS;
                        }
                    }
                    final PerformanceChartType performanceChartType2 = performanceChartType;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU();
                    final String str2 = strRegionGateStringResource;
                    LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                    int i11 = ((i3 >> 12) & 14) | 805306416;
                    Modifier modifier5 = modifier3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(527656932, i5, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt.AssetHomeComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(527656932, i12, -1, "com.robinhood.android.assethomes.AssetHomeComposable.<anonymous> (AssetHomeComposable.kt:101)");
                            }
                            AssetHomeState assetHomeState2 = assetHomeState;
                            if (assetHomeState2 != null && str2 != null && performanceChartType2 != null) {
                                AssetHomeTopAppBar.AssetHomeTopAppBar(str2, assetHomeState2.getAccountNumber(), performanceChartType2, onBack, navigator, topBarScrollStateRememberTopBarScrollState, viewState.getBrokerageAccountType(), viewState.getShowSearchIcon(), TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListStateRememberLazyListState, topBarScrollStateRememberTopBarScrollState), null, composer2, TopBarScrollState.$stable << 15, 512);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-679077009, true, new C95772(lazyListState4, assetHomeState, str2, performanceChartType2, viewState, onChartLoaded, function1AssetHomePnlHubEntryPoint, function1AssetHomeOptionsPortfolioRiskAnalyzerEntryPoint, function1AssetHomePendingEquitiesSection, function1AssetHomeEquitiesSection, function1AssetHomePendingOptionsSection, function1AssetHomeOptionsSection, function1AssetHistoryPreviewSection, navigator), composerStartRestartGroup, 54), composerStartRestartGroup, i11, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    lazyListState3 = lazyListState4;
                    modifier4 = modifier5;
                }
                modifier3 = modifier2;
                lazyListStateRememberLazyListState = lazyListState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AssetHomeState assetHomeState2 = viewState.getAssetHomeState();
                int i92 = i3 >> 6;
                Function1<ReorderableLazyListScope, Unit> function1AssetHomePnlHubEntryPoint2 = AssetHomePositionListSections.assetHomePnlHubEntryPoint(assetHomeState2, navigator, viewState.getPnlShowNewTag(), viewState.getPnlUpdatesEnabled(), onPnlNavigate, composerStartRestartGroup, i92 & 57456);
                Function1<ReorderableLazyListScope, Unit> function1AssetHomeOptionsPortfolioRiskAnalyzerEntryPoint2 = AssetHomePositionListSections.assetHomeOptionsPortfolioRiskAnalyzerEntryPoint(assetHomeState2, navigator, composerStartRestartGroup, i92 & 112);
                composerStartRestartGroup.startReplaceGroup(19741756);
                PerformanceChartType performanceChartType3 = null;
                if (assetHomeState2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19746229);
                if (assetHomeState2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19750683);
                if (assetHomeState2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19755092);
                if (assetHomeState2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19759682);
                if (assetHomeState2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                if (assetHomeState2 != null) {
                }
                if (assetType == null) {
                }
                if (i4 == -1) {
                }
                if (assetHomeState2 != null) {
                }
                if (assetType2 == null) {
                }
                if (i6 != -1) {
                }
                final PerformanceChartType performanceChartType22 = performanceChartType3;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i102 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i102).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i102).m21425getFg0d7_KjU();
                final String str22 = strRegionGateStringResource;
                LazyListState lazyListState42 = lazyListStateRememberLazyListState;
                int i112 = ((i3 >> 12) & 14) | 805306416;
                Modifier modifier52 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(527656932, i5, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt.AssetHomeComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(527656932, i12, -1, "com.robinhood.android.assethomes.AssetHomeComposable.<anonymous> (AssetHomeComposable.kt:101)");
                        }
                        AssetHomeState assetHomeState22 = assetHomeState2;
                        if (assetHomeState22 != null && str22 != null && performanceChartType22 != null) {
                            AssetHomeTopAppBar.AssetHomeTopAppBar(str22, assetHomeState22.getAccountNumber(), performanceChartType22, onBack, navigator, topBarScrollStateRememberTopBarScrollState2, viewState.getBrokerageAccountType(), viewState.getShowSearchIcon(), TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListStateRememberLazyListState, topBarScrollStateRememberTopBarScrollState2), null, composer2, TopBarScrollState.$stable << 15, 512);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(-679077009, true, new C95772(lazyListState42, assetHomeState2, str22, performanceChartType22, viewState, onChartLoaded, function1AssetHomePnlHubEntryPoint2, function1AssetHomeOptionsPortfolioRiskAnalyzerEntryPoint2, function1AssetHomePendingEquitiesSection, function1AssetHomeEquitiesSection, function1AssetHomePendingOptionsSection, function1AssetHomeOptionsSection, function1AssetHistoryPreviewSection, navigator), composerStartRestartGroup, 54), composerStartRestartGroup, i112, 316);
                if (ComposerKt.isTraceInProgress()) {
                }
                lazyListState3 = lazyListState42;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                lazyListState3 = lazyListState2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetHomeComposable.AssetHomeComposable$lambda$5(viewState, onChartLoaded, onBack, navigator, modifier4, lazyListState3, onPnlNavigate, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i7 != 0) {
                }
                if ((i2 & 32) == 0) {
                    modifier3 = modifier2;
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AssetHomeState assetHomeState22 = viewState.getAssetHomeState();
                int i922 = i3 >> 6;
                Function1<ReorderableLazyListScope, Unit> function1AssetHomePnlHubEntryPoint22 = AssetHomePositionListSections.assetHomePnlHubEntryPoint(assetHomeState22, navigator, viewState.getPnlShowNewTag(), viewState.getPnlUpdatesEnabled(), onPnlNavigate, composerStartRestartGroup, i922 & 57456);
                Function1<ReorderableLazyListScope, Unit> function1AssetHomeOptionsPortfolioRiskAnalyzerEntryPoint22 = AssetHomePositionListSections.assetHomeOptionsPortfolioRiskAnalyzerEntryPoint(assetHomeState22, navigator, composerStartRestartGroup, i922 & 112);
                composerStartRestartGroup.startReplaceGroup(19741756);
                PerformanceChartType performanceChartType32 = null;
                if (assetHomeState22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19746229);
                if (assetHomeState22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19750683);
                if (assetHomeState22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19755092);
                if (assetHomeState22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(19759682);
                if (assetHomeState22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState22 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                if (assetHomeState22 != null) {
                }
                if (assetType == null) {
                }
                if (i4 == -1) {
                }
                if (assetHomeState22 != null) {
                }
                if (assetType2 == null) {
                }
                if (i6 != -1) {
                }
                final PerformanceChartType performanceChartType222 = performanceChartType32;
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i1022 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU22 = bentoTheme22.getColors(composerStartRestartGroup, i1022).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU22 = bentoTheme22.getColors(composerStartRestartGroup, i1022).m21425getFg0d7_KjU();
                final String str222 = strRegionGateStringResource;
                LazyListState lazyListState422 = lazyListStateRememberLazyListState;
                int i1122 = ((i3 >> 12) & 14) | 805306416;
                Modifier modifier522 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier522, ComposableLambda3.rememberComposableLambda(527656932, i5, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt.AssetHomeComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(527656932, i12, -1, "com.robinhood.android.assethomes.AssetHomeComposable.<anonymous> (AssetHomeComposable.kt:101)");
                        }
                        AssetHomeState assetHomeState222 = assetHomeState22;
                        if (assetHomeState222 != null && str222 != null && performanceChartType222 != null) {
                            AssetHomeTopAppBar.AssetHomeTopAppBar(str222, assetHomeState222.getAccountNumber(), performanceChartType222, onBack, navigator, topBarScrollStateRememberTopBarScrollState22, viewState.getBrokerageAccountType(), viewState.getShowSearchIcon(), TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListStateRememberLazyListState, topBarScrollStateRememberTopBarScrollState22), null, composer2, TopBarScrollState.$stable << 15, 512);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU22, jM21425getFg0d7_KjU22, null, ComposableLambda3.rememberComposableLambda(-679077009, true, new C95772(lazyListState422, assetHomeState22, str222, performanceChartType222, viewState, onChartLoaded, function1AssetHomePnlHubEntryPoint22, function1AssetHomeOptionsPortfolioRiskAnalyzerEntryPoint22, function1AssetHomePendingEquitiesSection, function1AssetHomeEquitiesSection, function1AssetHomePendingOptionsSection, function1AssetHomeOptionsSection, function1AssetHistoryPreviewSection, navigator), composerStartRestartGroup, 54), composerStartRestartGroup, i1122, 316);
                if (ComposerKt.isTraceInProgress()) {
                }
                lazyListState3 = lazyListState422;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AssetHomeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.assethomes.AssetHomeComposableKt$AssetHomeComposable$2 */
    static final class C95772 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function1<LazyListScope, Unit> $assetHistorySection;
        final /* synthetic */ AssetHomeState $assetHomeState;
        final /* synthetic */ String $assetTitle;
        final /* synthetic */ PerformanceChartType $chartType;
        final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $equitiesSection;
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onChartLoaded;
        final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $optionsPortfolioRiskAnalyzer;
        final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $optionsSection;
        final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $pendingEquitiesSection;
        final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $pendingOptionsSection;
        final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $pnlHubEntryPoint;
        final /* synthetic */ AssetHomeViewState $viewState;

        /* compiled from: AssetHomeComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.assethomes.AssetHomeComposableKt$AssetHomeComposable$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetHomeStateOrdering.values().length];
                try {
                    iArr[AssetHomeStateOrdering.CHART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetHomeStateOrdering.PNL_HUB_ENTRY_POINT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetHomeStateOrdering.OPTIONS_PORTFOLIO_RISK_ANALYZER_ENTRY_POINT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetHomeStateOrdering.HOLDINGS_EQUITIES_PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetHomeStateOrdering.HOLDINGS_EQUITIES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetHomeStateOrdering.HOLDINGS_OPTIONS_PENDING.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AssetHomeStateOrdering.HOLDINGS_OPTIONS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AssetHomeStateOrdering.HISTORY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AssetHomeStateOrdering.PORTFOLIO_BREAKDOWN.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AssetHomeStateOrdering.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C95772(LazyListState lazyListState, AssetHomeState assetHomeState, String str, PerformanceChartType performanceChartType, AssetHomeViewState assetHomeViewState, Function0<Unit> function0, Function1<? super ReorderableLazyListScope, Unit> function1, Function1<? super ReorderableLazyListScope, Unit> function12, Function1<? super ReorderableLazyListScope, Unit> function13, Function1<? super ReorderableLazyListScope, Unit> function14, Function1<? super ReorderableLazyListScope, Unit> function15, Function1<? super ReorderableLazyListScope, Unit> function16, Function1<? super LazyListScope, Unit> function17, Navigator navigator) {
            this.$lazyListState = lazyListState;
            this.$assetHomeState = assetHomeState;
            this.$assetTitle = str;
            this.$chartType = performanceChartType;
            this.$viewState = assetHomeViewState;
            this.$onChartLoaded = function0;
            this.$pnlHubEntryPoint = function1;
            this.$optionsPortfolioRiskAnalyzer = function12;
            this.$pendingEquitiesSection = function13;
            this.$equitiesSection = function14;
            this.$pendingOptionsSection = function15;
            this.$optionsSection = function16;
            this.$assetHistorySection = function17;
            this.$navigator = navigator;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            final Navigator navigator;
            final AssetHomeViewState assetHomeViewState;
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
                ComposerKt.traceEventStart(-679077009, i2, -1, "com.robinhood.android.assethomes.AssetHomeComposable.<anonymous> (AssetHomeComposable.kt:119)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            LazyListState lazyListState = this.$lazyListState;
            final AssetHomeState assetHomeState = this.$assetHomeState;
            final String str = this.$assetTitle;
            final PerformanceChartType performanceChartType = this.$chartType;
            AssetHomeViewState assetHomeViewState2 = this.$viewState;
            final Function0<Unit> function0 = this.$onChartLoaded;
            final Function1<ReorderableLazyListScope, Unit> function1 = this.$pnlHubEntryPoint;
            final Function1<ReorderableLazyListScope, Unit> function12 = this.$optionsPortfolioRiskAnalyzer;
            final Function1<ReorderableLazyListScope, Unit> function13 = this.$pendingEquitiesSection;
            final Function1<ReorderableLazyListScope, Unit> function14 = this.$equitiesSection;
            final Function1<ReorderableLazyListScope, Unit> function15 = this.$pendingOptionsSection;
            final Function1<ReorderableLazyListScope, Unit> function16 = this.$optionsSection;
            final Function1<LazyListScope, Unit> function17 = this.$assetHistorySection;
            Navigator navigator2 = this.$navigator;
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
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(assetHomeState) | composer.changed(str) | composer.changed(performanceChartType == null ? -1 : performanceChartType.ordinal()) | composer.changedInstance(assetHomeViewState2) | composer.changed(function0) | composer.changed(function1) | composer.changed(function12) | composer.changed(function13) | composer.changed(function14) | composer.changed(function15) | composer.changed(function16) | composer.changed(function17) | composer.changedInstance(navigator2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                navigator = navigator2;
                assetHomeViewState = assetHomeViewState2;
                Object obj = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt$AssetHomeComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetHomeComposable.C95772.invoke$lambda$3$lambda$2$lambda$1(assetHomeState, function1, function12, function13, function14, function15, function16, function17, str, performanceChartType, assetHomeViewState, function0, navigator, (ReorderableLazyListScope) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                navigator = navigator2;
                assetHomeViewState = assetHomeViewState2;
            }
            composer.endReplaceGroup();
            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierWeight$default, lazyListState, null, false, null, null, null, false, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            AssetHomeBottomBar2.AssetHomeBottomBar(assetHomeViewState, navigator, lazyListState, null, composer, 0, 8);
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
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(final AssetHomeState assetHomeState, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, final String str, final PerformanceChartType performanceChartType, final AssetHomeViewState assetHomeViewState, final Function0 function0, final Navigator navigator, ReorderableLazyListScope reorderableLazyListScope) {
            List<AssetHomeStateOrdering> ordering;
            ReorderableLazyListScope ReorderableLazyColumn = reorderableLazyListScope;
            Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
            if (assetHomeState != null && (ordering = assetHomeState.getOrdering()) != null) {
                for (AssetHomeStateOrdering assetHomeStateOrdering : ordering) {
                    switch (WhenMappings.$EnumSwitchMapping$0[assetHomeStateOrdering.ordinal()]) {
                        case 1:
                            LazyListScope.item$default(ReorderableLazyColumn, assetHomeStateOrdering, null, ComposableLambda3.composableLambdaInstance(-1592803765, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt$AssetHomeComposable$2$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1592803765, i, -1, "com.robinhood.android.assethomes.AssetHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetHomeComposable.kt:128)");
                                    }
                                    if (str != null && performanceChartType != null) {
                                        AssetHomeChart.AssetHomeChart(assetHomeState.getAccountNumber(), performanceChartType, assetHomeState.getAssetType(), str, assetHomeViewState.getBrokerageAccountType(), assetHomeViewState.getShowOptionLevel3EntryPoint(), assetHomeViewState.getShowInfoIconInHeader(), function0, composer, 0, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 2, null);
                            break;
                        case 2:
                            if (function1 != null) {
                                function1.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (function12 != null) {
                                function12.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (function13 != null) {
                                function13.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (function14 != null) {
                                function14.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (function15 != null) {
                                function15.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (function16 != null) {
                                function16.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (function17 != null) {
                                function17.invoke(ReorderableLazyColumn);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                        case 10:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ReorderableLazyColumn = reorderableLazyListScope;
                }
            }
            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1406019129, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeComposableKt$AssetHomeComposable$2$1$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1406019129, i, -1, "com.robinhood.android.assethomes.AssetHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetHomeComposable.kt:168)");
                    }
                    String disclosureContentfulId = assetHomeViewState.getDisclosureContentfulId();
                    Navigator navigator2 = navigator;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    AssetHomeDisclosureFooter.AssetHomeDisclosureFooter(disclosureContentfulId, navigator2, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM(), composer, 6, 0), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            LazyListScope.item$default(reorderableLazyListScope, "bottom_padding", null, AssetHomeComposable4.INSTANCE.getLambda$370285104$feature_asset_homes_externalDebug(), 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final AssetHistoryPreviewSection2 getAssetHistoryType(AssetHomeState assetHomeState) {
        Intrinsics.checkNotNullParameter(assetHomeState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[assetHomeState.getAssetType().ordinal()];
        if (i == 1) {
            return AssetHistoryPreviewSection2.EQUITIES;
        }
        if (i == 2) {
            return AssetHistoryPreviewSection2.OPTIONS;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Futures not supported");
    }
}
