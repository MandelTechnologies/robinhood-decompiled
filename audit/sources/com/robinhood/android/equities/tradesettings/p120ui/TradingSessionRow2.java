package com.robinhood.android.equities.tradesettings.p120ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradingSessionRow.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"TradingSessionRow", "", "rowState", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "Lcom/robinhood/models/db/OrderMarketHours;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradingSessionRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionRow$lambda$1(SelectionRowState selectionRowState, boolean z, Function0 function0, int i, Composer composer, int i2) {
        TradingSessionRow(selectionRowState, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TradingSessionRow(final SelectionRowState<OrderMarketHours> rowState, final boolean z, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rowState, "rowState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(367399401);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rowState) : composerStartRestartGroup.changedInstance(rowState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(367399401, i2, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionRow (TradingSessionRow.kt:25)");
            }
            final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            BentoSelectionRowStyle.Colors colors = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getSelectionRowStyle(composerStartRestartGroup, 0).getColors();
            Tuples2 tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(colors.m21691getFgColor0d7_KjU()), Color.m6701boximpl(colors.m21693getFgColorSecondary0d7_KjU()));
            final long value = ((Color) tuples2M3642to.component1()).getValue();
            final long value2 = ((Color) tuples2M3642to.component2()).getValue();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(Selectable3.m5316selectableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), onClick, 2, null), null, ComposableLambda3.rememberComposableLambda(1097038253, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionRowKt.TradingSessionRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1097038253, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionRow.<anonymous> (TradingSessionRow.kt:40)");
                    }
                    BentoRadioButton2.BentoRadioButton(z, null, false, composer3, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1351427660, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionRowKt.TradingSessionRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1351427660, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionRow.<anonymous> (TradingSessionRow.kt:45)");
                    }
                    SelectionRowState<OrderMarketHours> selectionRowState = rowState;
                    Resources resources2 = resources;
                    long j = value;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    StringResource primaryText = selectionRowState.getPrimaryText();
                    Intrinsics.checkNotNull(resources2);
                    BentoText2.m20747BentoText38GnDrw(primaryText.getText(resources2).toString(), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer3.consume(Styles2.getLocalStyles())).getRow(composer3, 0).getTypography().getPrimaryTextStyle(), composer3, 0, 0, 8186);
                    composer3.startReplaceGroup(1680194706);
                    if (selectionRowState.getShowNewTag()) {
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C14990R.string.new_tag, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, false, null, null, composer3, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1605817067, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionRowKt.TradingSessionRow.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1605817067, i3, -1, "com.robinhood.android.equities.tradesettings.ui.TradingSessionRow.<anonymous> (TradingSessionRow.kt:62)");
                    }
                    StringResource secondaryText = rowState.getSecondaryText();
                    Resources resources2 = resources;
                    Intrinsics.checkNotNull(resources2);
                    BentoText2.m20747BentoText38GnDrw(secondaryText.getText(resources2).toString(), null, Color.m6701boximpl(value2), null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer3.consume(Styles2.getLocalStyles())).getRow(composer3, 0).getTypography().getSecondaryTextStyle(), composer3, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, false, null, composer2, 28032, 0, 2018);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.tradesettings.ui.TradingSessionRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingSessionRow2.TradingSessionRow$lambda$1(rowState, z, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
