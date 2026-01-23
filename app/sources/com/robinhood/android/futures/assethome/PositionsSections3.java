package com.robinhood.android.futures.assethome;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.portfolio.positionsList.PositionsSection;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionsSections.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a!\u0010\f\u001a\u00020\u0004*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"", "accountNumber", "Lkotlin/Function1;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "pendingOrdersSection", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "positionsSection", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/Function0;", "header", "positionsSectionLoadingItems", "(Landroidx/compose/foundation/lazy/LazyListScope;Lkotlin/jvm/functions/Function2;)V", "", "LoadingPlaceholderItemCount", "I", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.PositionsSectionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PositionsSections3 {
    public static final int LoadingPlaceholderItemCount = 3;

    public static final Function1<ReorderableLazyListScope, Unit> pendingOrdersSection(String str, Composer composer, int i) {
        composer.startReplaceGroup(-125246240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125246240, i, -1, "com.robinhood.android.futures.assethome.pendingOrdersSection (PositionsSections.kt:20)");
        }
        final ReorderablePositionsList reorderablePositionsListStreamAndRememberPositionsListState = ReorderablePositionsList2.streamAndRememberPositionsListState(str, PositionInstrumentType.FUTURES_PENDING, PositionsLocation.ASSET_HOME, false, null, composer, (i & 14) | 432, 24);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(reorderablePositionsListStreamAndRememberPositionsListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionsSections3.pendingOrdersSection$lambda$2$lambda$1(reorderablePositionsListStreamAndRememberPositionsListState, (ReorderableLazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<ReorderableLazyListScope, Unit> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pendingOrdersSection$lambda$2$lambda$1(ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        PositionsSection.lazyFuturesPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, new Function1() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsSections3.pendingOrdersSection$lambda$2$lambda$1$lambda$0((LazyListScope) obj);
            }
        }, null, null, "lazyPendingFutures", 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pendingOrdersSection$lambda$2$lambda$1$lambda$0(LazyListScope lazyFuturesPositionsSection) {
        Intrinsics.checkNotNullParameter(lazyFuturesPositionsSection, "$this$lazyFuturesPositionsSection");
        positionsSectionLoadingItems(lazyFuturesPositionsSection, new Function2<Composer, Integer, String>() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt$pendingOrdersSection$1$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ String invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final String invoke(Composer composer, int i) {
                composer.startReplaceGroup(-971330816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971330816, i, -1, "com.robinhood.android.futures.assethome.pendingOrdersSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PositionsSections.kt:32)");
                }
                String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_pending_orders_header, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return strStringResource;
            }
        });
        return Unit.INSTANCE;
    }

    public static final Function1<ReorderableLazyListScope, Unit> positionsSection(String str, Composer composer, int i) {
        composer.startReplaceGroup(710562414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(710562414, i, -1, "com.robinhood.android.futures.assethome.positionsSection (PositionsSections.kt:42)");
        }
        final ReorderablePositionsList reorderablePositionsListStreamAndRememberPositionsListState = ReorderablePositionsList2.streamAndRememberPositionsListState(str, PositionInstrumentType.FUTURES, PositionsLocation.ASSET_HOME, false, null, composer, (i & 14) | 432, 24);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(reorderablePositionsListStreamAndRememberPositionsListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionsSections3.positionsSection$lambda$5$lambda$4(reorderablePositionsListStreamAndRememberPositionsListState, (ReorderableLazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<ReorderableLazyListScope, Unit> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit positionsSection$lambda$5$lambda$4(ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        PositionsSection.lazyFuturesPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, new Function1() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsSections3.positionsSection$lambda$5$lambda$4$lambda$3((LazyListScope) obj);
            }
        }, null, null, "lazyFutures", 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit positionsSection$lambda$5$lambda$4$lambda$3(LazyListScope lazyFuturesPositionsSection) {
        Intrinsics.checkNotNullParameter(lazyFuturesPositionsSection, "$this$lazyFuturesPositionsSection");
        positionsSectionLoadingItems(lazyFuturesPositionsSection, new Function2<Composer, Integer, String>() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt$positionsSection$1$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ String invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final String invoke(Composer composer, int i) {
                composer.startReplaceGroup(-1425790834);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1425790834, i, -1, "com.robinhood.android.futures.assethome.positionsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PositionsSections.kt:54)");
                }
                String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_positions_header, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return strStringResource;
            }
        });
        return Unit.INSTANCE;
    }

    public static final void positionsSectionLoadingItems(LazyListScope lazyListScope, final Function2<? super Composer, ? super Integer, String> header) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1073717344, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.PositionsSectionsKt.positionsSectionLoadingItems.1
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
                    ComposerKt.traceEventStart(-1073717344, i, -1, "com.robinhood.android.futures.assethome.positionsSectionLoadingItems.<anonymous> (PositionsSections.kt:65)");
                }
                String strInvoke = header.invoke(composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strInvoke, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.items$default(lazyListScope, 3, null, null, PositionsSections.INSTANCE.getLambda$854646825$feature_futures_asset_home_externalDebug(), 6, null);
    }
}
