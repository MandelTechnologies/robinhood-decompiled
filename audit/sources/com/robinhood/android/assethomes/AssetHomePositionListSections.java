package com.robinhood.android.assethomes;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.positionsList.PositionsSection;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.models.portfolio.api.AssetHomeStateOrdering;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomePositionListSections.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\n\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\u0002\b\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a8\u0010\u0016\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\u0002\b\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0017\u001a.\u0010\u0018\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\u0002\b\u00042\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001c\u001a.\u0010\u001d\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\u0002\b\u00042\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001c\u001a.\u0010\u001f\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\u0002\b\u00042\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001c\u001a.\u0010!\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\u0002\b\u00042\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\"\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001c\u001a\u0019\u0010#\u001a\u00020$*\u00020\r2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a\u001f\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020+H\u0003¢\u0006\u0002\u0010,\u001a\f\u0010-\u001a\u00020.*\u00020/H\u0002\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u001bX\u0080T¢\u0006\u0002\n\u0000*.\b\u0000\u0010\u0000\"\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¨\u00061"}, m3636d2 = {"ReorderableLazyListContent", "Lkotlin/Function1;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "EQUITIES_PNL_ENTRY_POINT", "", "EQUITIES_PNL_ENTRY_POINT_SOURCE", "OPTIONS_PNL_ENTRY_POINT", "OPTIONS_PNL_ENTRY_POINT_SOURCE", "assetHomePnlHubEntryPoint", "Lcom/robinhood/android/assethomes/ReorderableLazyListContent;", "assetHomeState", "Lcom/robinhood/android/models/portfolio/AssetHomeState;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "showNewTag", "", "pnlUpdatesEnabled", "onNavigate", "Lkotlin/Function0;", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Lcom/robinhood/android/navigation/Navigator;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "assetHomeOptionsPortfolioRiskAnalyzerEntryPoint", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "assetHomePendingEquitiesSection", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "observePendingEquitiesCount", "", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Landroidx/compose/runtime/Composer;I)I", "assetHomeEquitiesSection", "observeEquitiesCount", "assetHomePendingOptionsSection", "observePendingOptionsCount", "assetHomeOptionsSection", "observeOptionsCount", "positionsListState", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "AssetHomePositionsHeader", "header", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toAssetClass", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "LoadingPlaceholderItemCount", "feature-asset-homes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomePositionListSections {
    public static final String EQUITIES_PNL_ENTRY_POINT = "equities_pnl_entry_point";
    public static final String EQUITIES_PNL_ENTRY_POINT_SOURCE = "equities_asset_home";
    public static final int LoadingPlaceholderItemCount = 3;
    public static final String OPTIONS_PNL_ENTRY_POINT = "options_pnl_entry_point";
    public static final String OPTIONS_PNL_ENTRY_POINT_SOURCE = "options_asset_home";

    /* compiled from: AssetHomePositionListSections.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$WhenMappings */
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
    public static final Unit AssetHomePositionsHeader$lambda$14(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetHomePositionsHeader(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function1<ReorderableLazyListScope, Unit> assetHomePnlHubEntryPoint(final AssetHomeState assetHomeState, final Navigator navigator, final boolean z, final boolean z2, final Function0<Unit> onNavigate, Composer composer, int i) {
        Function1<ReorderableLazyListScope, Unit> function1;
        List<AssetHomeStateOrdering> ordering;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onNavigate, "onNavigate");
        composer.startReplaceGroup(221241658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(221241658, i, -1, "com.robinhood.android.assethomes.assetHomePnlHubEntryPoint (AssetHomePositionListSections.kt:66)");
        }
        if (assetHomeState == null || (ordering = assetHomeState.getOrdering()) == null) {
            function1 = null;
        } else {
            boolean z3 = true;
            if (ordering.contains(AssetHomeStateOrdering.PNL_HUB_ENTRY_POINT)) {
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((((57344 & i) ^ 24576) > 16384 && composer.changed(onNavigate)) || (i & 24576) == 16384) | composer.changedInstance(assetHomeState) | composer.changedInstance(navigator) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z2)) || (i & 3072) == 2048);
                if ((((i & 896) ^ 384) <= 256 || !composer.changed(z)) && (i & 384) != 256) {
                    z3 = false;
                }
                boolean z4 = zChangedInstance | z3;
                Object objRememberedValue = composer.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetHomePositionListSections.assetHomePnlHubEntryPoint$lambda$1$lambda$0(onNavigate, assetHomeState, navigator, z2, z, (ReorderableLazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(function12);
                    objRememberedValue = function12;
                }
                function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomePnlHubEntryPoint$lambda$1$lambda$0(Function0 function0, AssetHomeState assetHomeState, Navigator navigator, boolean z, boolean z2, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(400515858, true, new AssetHomePositionListSections3(function0, assetHomeState, navigator, z, z2)), 3, null);
        return Unit.INSTANCE;
    }

    public static final Function1<ReorderableLazyListScope, Unit> assetHomeOptionsPortfolioRiskAnalyzerEntryPoint(final AssetHomeState assetHomeState, final Navigator navigator, Composer composer, int i) {
        Function1<ReorderableLazyListScope, Unit> function1;
        List<AssetHomeStateOrdering> ordering;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        composer.startReplaceGroup(-1239399274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239399274, i, -1, "com.robinhood.android.assethomes.assetHomeOptionsPortfolioRiskAnalyzerEntryPoint (AssetHomePositionListSections.kt:178)");
        }
        if (assetHomeState == null || (ordering = assetHomeState.getOrdering()) == null || !ordering.contains(AssetHomeStateOrdering.OPTIONS_PORTFOLIO_RISK_ANALYZER_ENTRY_POINT)) {
            function1 = null;
        } else {
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(assetHomeState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetHomePositionListSections.m1738x30b24aab(navigator, assetHomeState, (ReorderableLazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assetHomeOptionsPortfolioRiskAnalyzerEntryPoint$lambda$3$lambda$2 */
    public static final Unit m1738x30b24aab(Navigator navigator, AssetHomeState assetHomeState, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(533361262, true, new AssetHomePositionListSections2(navigator, assetHomeState)), 3, null);
        return Unit.INSTANCE;
    }

    public static final Function1<ReorderableLazyListScope, Unit> assetHomePendingEquitiesSection(AssetHomeState assetHomeState, Composer composer, int i) {
        Function1<ReorderableLazyListScope, Unit> function1;
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(1376156751);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376156751, i, -1, "com.robinhood.android.assethomes.assetHomePendingEquitiesSection (AssetHomePositionListSections.kt:247)");
        }
        if (assetHomeState.getOrdering().contains(AssetHomeStateOrdering.HOLDINGS_EQUITIES_PENDING)) {
            final ReorderablePositionsList reorderablePositionsListPositionsListState = positionsListState(assetHomeState, PositionInstrumentType.EQUITY_PENDING, composer, (i & 14) | 48);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(reorderablePositionsListPositionsListState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetHomePositionListSections.assetHomePendingEquitiesSection$lambda$5$lambda$4(reorderablePositionsListPositionsListState, (ReorderableLazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomePendingEquitiesSection$lambda$5$lambda$4(ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        PositionsSection.lazyPendingEquitiesPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    public static final int observePendingEquitiesCount(AssetHomeState assetHomeState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(868197648);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(868197648, i, -1, "com.robinhood.android.assethomes.observePendingEquitiesCount (AssetHomePositionListSections.kt:262)");
        }
        int iObservePositionsListItemCount = ReorderablePositionsList2.observePositionsListItemCount(assetHomeState.getAccountNumber(), PositionInstrumentType.EQUITY_PENDING, PositionsLocation.ASSET_HOME, 0, 0, null, null, null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iObservePositionsListItemCount;
    }

    public static final Function1<ReorderableLazyListScope, Unit> assetHomeEquitiesSection(AssetHomeState assetHomeState, Composer composer, int i) {
        Function1<ReorderableLazyListScope, Unit> function1;
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(1812726404);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1812726404, i, -1, "com.robinhood.android.assethomes.assetHomeEquitiesSection (AssetHomePositionListSections.kt:271)");
        }
        if (assetHomeState.getOrdering().contains(AssetHomeStateOrdering.HOLDINGS_EQUITIES)) {
            final ReorderablePositionsList reorderablePositionsListPositionsListState = positionsListState(assetHomeState, PositionInstrumentType.EQUITY, composer, (i & 14) | 48);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(reorderablePositionsListPositionsListState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetHomePositionListSections.assetHomeEquitiesSection$lambda$8$lambda$7(reorderablePositionsListPositionsListState, (ReorderableLazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomeEquitiesSection$lambda$8$lambda$7(ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        PositionsSection.lazyEquitiesPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetHomePositionListSections.assetHomeEquitiesSection$lambda$8$lambda$7$lambda$6((LazyListScope) obj);
            }
        }, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomeEquitiesSection$lambda$8$lambda$7$lambda$6(LazyListScope lazyEquitiesPositionsSection) {
        Intrinsics.checkNotNullParameter(lazyEquitiesPositionsSection, "$this$lazyEquitiesPositionsSection");
        AssetHomePositionListSections4 assetHomePositionListSections4 = AssetHomePositionListSections4.INSTANCE;
        LazyListScope.item$default(lazyEquitiesPositionsSection, null, null, assetHomePositionListSections4.m11338getLambda$1164719104$feature_asset_homes_externalDebug(), 3, null);
        LazyListScope.items$default(lazyEquitiesPositionsSection, 3, null, null, assetHomePositionListSections4.getLambda$648828297$feature_asset_homes_externalDebug(), 6, null);
        return Unit.INSTANCE;
    }

    public static final int observeEquitiesCount(AssetHomeState assetHomeState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(448694283);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(448694283, i, -1, "com.robinhood.android.assethomes.observeEquitiesCount (AssetHomePositionListSections.kt:295)");
        }
        int iObservePositionsListItemCount = ReorderablePositionsList2.observePositionsListItemCount(assetHomeState.getAccountNumber(), PositionInstrumentType.EQUITY, PositionsLocation.ASSET_HOME, 4, 1, null, null, null, composer, 28080, 224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iObservePositionsListItemCount;
    }

    public static final Function1<ReorderableLazyListScope, Unit> assetHomePendingOptionsSection(AssetHomeState assetHomeState, Composer composer, int i) {
        Function1<ReorderableLazyListScope, Unit> function1;
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(-743830048);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-743830048, i, -1, "com.robinhood.android.assethomes.assetHomePendingOptionsSection (AssetHomePositionListSections.kt:306)");
        }
        if (assetHomeState.getOrdering().contains(AssetHomeStateOrdering.HOLDINGS_OPTIONS_PENDING)) {
            final ReorderablePositionsList reorderablePositionsListPositionsListState = positionsListState(assetHomeState, PositionInstrumentType.OPTIONS_PENDING, composer, (i & 14) | 48);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(reorderablePositionsListPositionsListState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetHomePositionListSections.assetHomePendingOptionsSection$lambda$10$lambda$9(reorderablePositionsListPositionsListState, (ReorderableLazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomePendingOptionsSection$lambda$10$lambda$9(ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        PositionsSection.lazyPendingOptionsPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    public static final int observePendingOptionsCount(AssetHomeState assetHomeState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(1985903911);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985903911, i, -1, "com.robinhood.android.assethomes.observePendingOptionsCount (AssetHomePositionListSections.kt:321)");
        }
        int iObservePositionsListItemCount = ReorderablePositionsList2.observePositionsListItemCount(assetHomeState.getAccountNumber(), PositionInstrumentType.OPTIONS_PENDING, PositionsLocation.ASSET_HOME, 0, 0, null, null, null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iObservePositionsListItemCount;
    }

    public static final Function1<ReorderableLazyListScope, Unit> assetHomeOptionsSection(AssetHomeState assetHomeState, Composer composer, int i) {
        Function1<ReorderableLazyListScope, Unit> function1;
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(-1838125813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1838125813, i, -1, "com.robinhood.android.assethomes.assetHomeOptionsSection (AssetHomePositionListSections.kt:330)");
        }
        if (assetHomeState.getOrdering().contains(AssetHomeStateOrdering.HOLDINGS_OPTIONS)) {
            final ReorderablePositionsList reorderablePositionsListPositionsListState = positionsListState(assetHomeState, PositionInstrumentType.OPTIONS, composer, (i & 14) | 48);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(reorderablePositionsListPositionsListState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetHomePositionListSections.assetHomeOptionsSection$lambda$13$lambda$12(reorderablePositionsListPositionsListState, (ReorderableLazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomeOptionsSection$lambda$13$lambda$12(ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        PositionsSection.lazyOptionsPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, new Function1() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetHomePositionListSections.assetHomeOptionsSection$lambda$13$lambda$12$lambda$11((LazyListScope) obj);
            }
        }, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetHomeOptionsSection$lambda$13$lambda$12$lambda$11(LazyListScope lazyOptionsPositionsSection) {
        Intrinsics.checkNotNullParameter(lazyOptionsPositionsSection, "$this$lazyOptionsPositionsSection");
        AssetHomePositionListSections4 assetHomePositionListSections4 = AssetHomePositionListSections4.INSTANCE;
        LazyListScope.item$default(lazyOptionsPositionsSection, null, null, assetHomePositionListSections4.getLambda$513852032$feature_asset_homes_externalDebug(), 3, null);
        LazyListScope.items$default(lazyOptionsPositionsSection, 3, null, null, assetHomePositionListSections4.m11339getLambda$248505783$feature_asset_homes_externalDebug(), 6, null);
        return Unit.INSTANCE;
    }

    public static final int observeOptionsCount(AssetHomeState assetHomeState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(assetHomeState, "assetHomeState");
        composer.startReplaceGroup(1556729548);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1556729548, i, -1, "com.robinhood.android.assethomes.observeOptionsCount (AssetHomePositionListSections.kt:354)");
        }
        int iObservePositionsListItemCount = ReorderablePositionsList2.observePositionsListItemCount(assetHomeState.getAccountNumber(), PositionInstrumentType.OPTIONS, PositionsLocation.ASSET_HOME, 4, 1, null, null, null, composer, 28080, 224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iObservePositionsListItemCount;
    }

    private static final ReorderablePositionsList positionsListState(AssetHomeState assetHomeState, PositionInstrumentType positionInstrumentType, Composer composer, int i) {
        composer.startReplaceGroup(145758774);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(145758774, i, -1, "com.robinhood.android.assethomes.positionsListState (AssetHomePositionListSections.kt:366)");
        }
        ReorderablePositionsList reorderablePositionsListStreamAndRememberPositionsListState = ReorderablePositionsList2.streamAndRememberPositionsListState(assetHomeState.getAccountNumber(), positionInstrumentType, PositionsLocation.ASSET_HOME, false, null, composer, (i & 112) | 384, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return reorderablePositionsListStreamAndRememberPositionsListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetHomePositionsHeader(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-433749488);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-433749488, i3, -1, "com.robinhood.android.assethomes.AssetHomePositionsHeader (AssetHomePositionListSections.kt:376)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier3 = modifier2;
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, i3 & 14, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetHomePositionListSections.AssetHomePositionsHeader$lambda$14(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifier32 = modifier2;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, i3 & 14, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetClass toAssetClass(AssetType assetType) {
        int i = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
        if (i == 1) {
            return AssetClass.EQUITY;
        }
        if (i == 2) {
            return AssetClass.OPTION;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Futures not supported");
    }
}
