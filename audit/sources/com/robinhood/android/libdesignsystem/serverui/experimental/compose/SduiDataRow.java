package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.models.serverdriven.experimental.api.DataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.DataRowGrid;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconWithAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiDataRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"SduiCondensedDataRow", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/DataRowCondensed;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/DataRowCondensed;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiStackedDataRow", "Lcom/robinhood/models/serverdriven/experimental/api/DataRowStacked;", "(Lcom/robinhood/models/serverdriven/experimental/api/DataRowStacked;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiDataRowGrid", "components", "Lcom/robinhood/models/serverdriven/experimental/api/DataRowGrid;", "(Lcom/robinhood/models/serverdriven/experimental/api/DataRowGrid;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiDataRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCondensedDataRow$lambda$1(DataRowCondensed dataRowCondensed, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiCondensedDataRow(dataRowCondensed, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDataRowGrid$lambda$8(DataRowGrid dataRowGrid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiDataRowGrid(dataRowGrid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiStackedDataRow$lambda$3(DataRowStacked dataRowStacked, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiStackedDataRow(dataRowStacked, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiCondensedDataRow(final DataRowCondensed<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Modifier modifierM4893clickableXHw0xAI$default;
        final HorizontalPadding horizontalPadding2;
        Icon icon;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1555830333);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1555830333, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCondensedDataRow (SduiDataRow.kt:25)");
                }
                IconWithAction<ActionT> icon_with_action = component.getIcon_with_action();
                BentoIcon4 bentoIcon = (icon_with_action != null || (icon = icon_with_action.getIcon()) == null) ? null : SduiIcon2.toBentoIcon(icon);
                IconWithAction<ActionT> icon_with_action2 = component.getIcon_with_action();
                ThemedColor icon_color_override = icon_with_action2 == null ? icon_with_action2.getIcon_color_override() : null;
                composerStartRestartGroup.startReplaceGroup(504344141);
                Color composeColor = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(component.getLabel(), null, 2, null), null, bentoIcon, composeColor, new AnnotatedString(component.getValue(), null, 2, null), null, null, null, null, false, false, 4037, null);
                IconWithAction<ActionT> icon_with_action3 = component.getIcon_with_action();
                Parcelable action = icon_with_action3 == null ? icon_with_action3.getAction() : null;
                composerStartRestartGroup.startReplaceGroup(504350833);
                modifierM4893clickableXHw0xAI$default = action != null ? ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action), 7, null) : null;
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                final Modifier modifierThen = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-1214775399, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt.SduiCondensedDataRow.1
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
                            ComposerKt.traceEventStart(-1214775399, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCondensedDataRow.<anonymous> (SduiDataRow.kt:40)");
                        }
                        BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, modifierThen, null, null, null, composer2, BentoDataRowState.$stable, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                horizontalPadding2 = horizontalPadding;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiDataRow.SduiCondensedDataRow$lambda$1(component, modifier4, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IconWithAction<ActionT> icon_with_action4 = component.getIcon_with_action();
            if (icon_with_action4 != null) {
                IconWithAction<ActionT> icon_with_action22 = component.getIcon_with_action();
                if (icon_with_action22 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(504344141);
                if (icon_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(component.getLabel(), null, 2, null), null, bentoIcon, composeColor, new AnnotatedString(component.getValue(), null, 2, null), null, null, null, null, false, false, 4037, null);
                IconWithAction<ActionT> icon_with_action32 = component.getIcon_with_action();
                if (icon_with_action32 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(504350833);
                if (action != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                }
                final Modifier modifierThen2 = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-1214775399, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt.SduiCondensedDataRow.1
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
                            ComposerKt.traceEventStart(-1214775399, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCondensedDataRow.<anonymous> (SduiDataRow.kt:40)");
                        }
                        BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState2, modifierThen2, null, null, null, composer2, BentoDataRowState.$stable, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontalPadding2 = horizontalPadding3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiStackedDataRow(final DataRowStacked<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Modifier modifierM4893clickableXHw0xAI$default;
        final HorizontalPadding horizontalPadding2;
        Icon icon;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2065644419);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2065644419, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStackedDataRow (SduiDataRow.kt:52)");
                }
                IconWithAction<ActionT> icon_with_action = component.getIcon_with_action();
                BentoIcon4 bentoIcon = (icon_with_action != null || (icon = icon_with_action.getIcon()) == null) ? null : SduiIcon2.toBentoIcon(icon);
                IconWithAction<ActionT> icon_with_action2 = component.getIcon_with_action();
                ThemedColor icon_color_override = icon_with_action2 == null ? icon_with_action2.getIcon_color_override() : null;
                composerStartRestartGroup.startReplaceGroup(-809383187);
                Color composeColor = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = new AnnotatedString(component.getLabel(), null, 2, null);
                AnnotatedString annotatedString2 = new AnnotatedString(component.getValue(), null, 2, null);
                ThemedColor value_color_override = component.getValue_color_override();
                composerStartRestartGroup.startReplaceGroup(-809377459);
                Color composeColor2 = value_color_override != null ? null : SduiColors2.toComposeColor(value_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState = new BentoDataRowState(component.getValue_description(), annotatedString, null, bentoIcon, composeColor, annotatedString2, composeColor2, null, null, null, false, false, 3972, null);
                IconWithAction<ActionT> icon_with_action3 = component.getIcon_with_action();
                Parcelable action = icon_with_action3 == null ? icon_with_action3.getAction() : null;
                composerStartRestartGroup.startReplaceGroup(-809372335);
                modifierM4893clickableXHw0xAI$default = action != null ? ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action), 7, null) : null;
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                final Modifier modifierThen = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-2130723879, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt.SduiStackedDataRow.1
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
                            ComposerKt.traceEventStart(-2130723879, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStackedDataRow.<anonymous> (SduiDataRow.kt:69)");
                        }
                        BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierThen, null, composer2, BentoDataRowState.$stable, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                horizontalPadding2 = horizontalPadding;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiDataRow.SduiStackedDataRow$lambda$3(component, modifier4, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IconWithAction<ActionT> icon_with_action4 = component.getIcon_with_action();
            if (icon_with_action4 != null) {
                IconWithAction<ActionT> icon_with_action22 = component.getIcon_with_action();
                if (icon_with_action22 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-809383187);
                if (icon_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString3 = new AnnotatedString(component.getLabel(), null, 2, null);
                AnnotatedString annotatedString22 = new AnnotatedString(component.getValue(), null, 2, null);
                ThemedColor value_color_override2 = component.getValue_color_override();
                composerStartRestartGroup.startReplaceGroup(-809377459);
                if (value_color_override2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState2 = new BentoDataRowState(component.getValue_description(), annotatedString3, null, bentoIcon, composeColor, annotatedString22, composeColor2, null, null, null, false, false, 3972, null);
                IconWithAction<ActionT> icon_with_action32 = component.getIcon_with_action();
                if (icon_with_action32 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-809372335);
                if (action != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                }
                final Modifier modifierThen2 = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-2130723879, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt.SduiStackedDataRow.1
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
                            ComposerKt.traceEventStart(-2130723879, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStackedDataRow.<anonymous> (SduiDataRow.kt:69)");
                        }
                        BentoDataRowKt.BentoDataRow(bentoDataRowState2, modifierThen2, null, composer2, BentoDataRowState.$stable, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontalPadding2 = horizontalPadding3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiDataRowGrid(final DataRowGrid<? extends ActionT> components, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator<T> it;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Composer composerStartRestartGroup = composer.startRestartGroup(1050700684);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(components) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1050700684, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowGrid (SduiDataRow.kt:80)");
                }
                float f = 0.0f;
                Object obj = null;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-18039402);
                it = components.getItems().iterator();
                while (it.hasNext()) {
                    List<UIComponent> list = (List) it.next();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, obj);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    final Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1777670685);
                    for (final UIComponent uIComponent : list) {
                        UtilKt.NoHorizontalPadding(ComposableLambda3.rememberComposableLambda(189815144, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt$SduiDataRowGrid$1$1$1$1$1
                            public final void invoke(Composer composer2, int i5) {
                                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(189815144, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiDataRow.kt:90)");
                                }
                                Modifier modifierWeight$default = Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null);
                                UIComponent<ActionT> uIComponent2 = uIComponent;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                SduiComponent3.SduiComponent(uIComponent2, null, null, composer2, 0, 6);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    f = 0.0f;
                    obj = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SduiDataRow.SduiDataRowGrid$lambda$8(components, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f2 = 0.0f;
            Object obj2 = null;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-18039402);
                it = components.getItems().iterator();
                while (it.hasNext()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
