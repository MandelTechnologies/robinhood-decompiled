package com.robinhood.android.alldaytrading.infosheet.instrumentinfo;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdtInstrumentInfoContents.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"InstrumentInfoContents", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewState", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoViewState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;I)V", "feature-all-day-trading_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoContentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdtInstrumentInfoContents {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentInfoContents$lambda$0(Modifier modifier, AdtInstrumentInfoViewState adtInstrumentInfoViewState, SduiActionHandler sduiActionHandler, int i, Composer composer, int i2) {
        InstrumentInfoContents(modifier, adtInstrumentInfoViewState, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstrumentInfoContents(final Modifier modifier, final AdtInstrumentInfoViewState viewState, final SduiActionHandler<? super GenericAction> actionHandler, Composer composer, int i) {
        int i2;
        Composer composer2;
        final int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(75400034);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(75400034, i4, -1, "com.robinhood.android.alldaytrading.infosheet.instrumentinfo.InstrumentInfoContents (AdtInstrumentInfoContents.kt:17)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            ImmutableList immutableList = extensions2.toImmutableList(viewState.getSduiComponents());
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            composer2 = composerStartRestartGroup;
            i3 = i;
            SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierVerticalScroll$default, null, actionHandler, HorizontalPadding.Default, center, Alignment.INSTANCE.getStart(), false, composer2, (((((i4 << 3) & 7168) | 12779520) << 3) & 57344) | 102236160, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i3 = i;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoContentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdtInstrumentInfoContents.InstrumentInfoContents$lambda$0(modifier, viewState, actionHandler, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
