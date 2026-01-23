package com.robinhood.android.lib.screener;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenerCellPreviews.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\t"}, m3636d2 = {"IconCellPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "IconCellWithFg2Preview", "IndexCellPreview", "EmptyCellPreview", "RowStartExpandedPreview", "RowStartCollapsedPreview", "RowStartSpacerPreview", "feature-lib-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ScreenerCellPreviews9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyCellPreview$lambda$3(int i, Composer composer, int i2) {
        EmptyCellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconCellPreview$lambda$0(int i, Composer composer, int i2) {
        IconCellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconCellWithFg2Preview$lambda$1(int i, Composer composer, int i2) {
        IconCellWithFg2Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndexCellPreview$lambda$2(int i, Composer composer, int i2) {
        IndexCellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartCollapsedPreview$lambda$5(int i, Composer composer, int i2) {
        RowStartCollapsedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartExpandedPreview$lambda$4(int i, Composer composer, int i2) {
        RowStartExpandedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartSpacerPreview$lambda$6(int i, Composer composer, int i2) {
        RowStartSpacerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IconCellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-929974675);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-929974675, i, -1, "com.robinhood.android.lib.screener.IconCellPreview (ScreenerCellPreviews.kt:19)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.getLambda$1553712677$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.IconCellPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void IconCellWithFg2Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1953499956);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1953499956, i, -1, "com.robinhood.android.lib.screener.IconCellWithFg2Preview (ScreenerCellPreviews.kt:47)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.m15854getLambda$56664964$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.IconCellWithFg2Preview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void IndexCellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1328448464);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1328448464, i, -1, "com.robinhood.android.lib.screener.IndexCellPreview (ScreenerCellPreviews.kt:75)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.getLambda$1013345048$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.IndexCellPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EmptyCellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-499930571);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-499930571, i, -1, "com.robinhood.android.lib.screener.EmptyCellPreview (ScreenerCellPreviews.kt:102)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.m15855getLambda$815033987$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.EmptyCellPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RowStartExpandedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1443693785);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1443693785, i, -1, "com.robinhood.android.lib.screener.RowStartExpandedPreview (ScreenerCellPreviews.kt:131)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.getLambda$665703135$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.RowStartExpandedPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RowStartCollapsedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2068806645);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2068806645, i, -1, "com.robinhood.android.lib.screener.RowStartCollapsedPreview (ScreenerCellPreviews.kt:161)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.m15852getLambda$1259365571$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.RowStartCollapsedPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RowStartSpacerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(825380500);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(825380500, i, -1, "com.robinhood.android.lib.screener.RowStartSpacerPreview (ScreenerCellPreviews.kt:191)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerCellPreviews.INSTANCE.m15853getLambda$1733315508$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.ScreenerCellPreviewsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerCellPreviews9.RowStartSpacerPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
