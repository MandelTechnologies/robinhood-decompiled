package com.robinhood.android.shareholderexperience.sdui;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.rows.EventRow;
import com.robinhood.compose.bento.component.rows.EventRowState;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventNavigationRow;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiShareholderEventNavigationRow.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"SduiShareholderEventNavigationRow", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/ShareholderEventNavigationRow;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/ShareholderEventNavigationRow;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "feature-shareholder-experience_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.sdui.SduiShareholderEventNavigationRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SduiShareholderEventNavigationRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiShareholderEventNavigationRow$lambda$0(ShareholderEventNavigationRow shareholderEventNavigationRow, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiShareholderEventNavigationRow(shareholderEventNavigationRow, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @SduiComposable
    public static final <ActionT extends Parcelable> void SduiShareholderEventNavigationRow(final ShareholderEventNavigationRow<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(811928269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(811928269, i3, -1, "com.robinhood.android.shareholderexperience.sdui.SduiShareholderEventNavigationRow (SduiShareholderEventNavigationRow.kt:27)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(1303080689, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.shareholderexperience.sdui.SduiShareholderEventNavigationRowKt.SduiShareholderEventNavigationRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1303080689, i6, -1, "com.robinhood.android.shareholderexperience.sdui.SduiShareholderEventNavigationRow.<anonymous> (SduiShareholderEventNavigationRow.kt:29)");
                    }
                    String month = component.getStart_component().getMonth();
                    String day = component.getStart_component().getDay();
                    ThemedColor foreground_color_override = component.getStart_component().getForeground_color_override();
                    composer2.startReplaceGroup(-1869896479);
                    Color composeColor = foreground_color_override == null ? null : SduiColors2.toComposeColor(foreground_color_override, composer2, 0);
                    composer2.endReplaceGroup();
                    ThemedColor background_color_override = component.getStart_component().getBackground_color_override();
                    composer2.startReplaceGroup(-1869891391);
                    Color composeColor2 = background_color_override != null ? SduiColors2.toComposeColor(background_color_override, composer2, 0) : null;
                    composer2.endReplaceGroup();
                    EventRow.EventRow(new EventRowState(new EventRowState.Start.TwoLine(month, day, composeColor, composeColor2, null), component.getTitle(), component.getSubtitle()), SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), ModifiersKt.autoLogEvents$default(modifier, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composer2, AutoLoggingCompositionLocals3.$stable), null, null, 51, null), true, false, false, true, false, null, 108, null), composer2, EventRowState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.shareholderexperience.sdui.SduiShareholderEventNavigationRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiShareholderEventNavigationRow2.SduiShareholderEventNavigationRow$lambda$0(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
