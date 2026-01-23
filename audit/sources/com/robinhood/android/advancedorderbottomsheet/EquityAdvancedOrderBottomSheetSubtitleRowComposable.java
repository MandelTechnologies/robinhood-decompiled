package com.robinhood.android.advancedorderbottomsheet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderBottomSheetSubtitleRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"EquityAdvancedOrderBottomSheetSubtitleRowComposable", "", "state", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$SubtitleRow;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$SubtitleRow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetSubtitleRowComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class EquityAdvancedOrderBottomSheetSubtitleRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderBottomSheetSubtitleRowComposable$lambda$0(EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow subtitleRow, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityAdvancedOrderBottomSheetSubtitleRowComposable(subtitleRow, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EquityAdvancedOrderBottomSheetSubtitleRowComposable(final EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(695766699);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(695766699, i3, -1, "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetSubtitleRowComposable (EquityAdvancedOrderBottomSheetSubtitleRowComposable.kt:16)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1336266112, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetSubtitleRowComposableKt.EquityAdvancedOrderBottomSheetSubtitleRowComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1336266112, i5, -1, "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetSubtitleRowComposable.<anonymous> (EquityAdvancedOrderBottomSheetSubtitleRowComposable.kt:19)");
                    }
                    StringResource rowPrimaryText = state.getRowPrimaryText();
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String string2 = rowPrimaryText.getText(resources).toString();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    int iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
                    BentoText2.m20747BentoText38GnDrw(string2, TestTag3.testTag(modifier, state.getTestTag()), Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(iM7924getStarte0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextL(), composer2, 24576, 0, 8104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetSubtitleRowComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderBottomSheetSubtitleRowComposable.EquityAdvancedOrderBottomSheetSubtitleRowComposable$lambda$0(state, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
