package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.DataRowCondensedDto;
import rh_server_driven_ui.p531v1.DataRowStackedDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.IconWithActionDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiDataRowIdl.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u000e2\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"SduiCondensedDataRow", "", "ActionT", "component", "Lrh_server_driven_ui/v1/DataRowCondensedDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lrh_server_driven_ui/v1/DataRowCondensedDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiStackedDataRow", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "(Lrh_server_driven_ui/v1/DataRowStackedDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiDataRowIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCondensedDataRow$lambda$1(DataRowCondensedDto dataRowCondensedDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiCondensedDataRow(dataRowCondensedDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiStackedDataRow$lambda$3(DataRowStackedDto dataRowStackedDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiStackedDataRow(dataRowStackedDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiCondensedDataRow(final DataRowCondensedDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Modifier modifierM4893clickableXHw0xAI$default;
        final HorizontalPadding horizontalPadding2;
        IconDto icon;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1776580250);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1776580250, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCondensedDataRow (SduiDataRowIdl.kt:22)");
                }
                IconWithActionDto label_icon = component.getLabel_icon();
                BentoIcon4 bentoIcon = (label_icon != null || (icon = label_icon.getIcon()) == null) ? null : SduiIcon2.toBentoIcon(icon);
                IconWithActionDto label_icon2 = component.getLabel_icon();
                ThemedColorDto icon_color_override = label_icon2 == null ? label_icon2.getIcon_color_override() : null;
                composerStartRestartGroup.startReplaceGroup(-2103350038);
                Color composeColor = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(component.getLabel(), null, 2, null), null, bentoIcon, composeColor, new AnnotatedString(component.getValue(), null, 2, null), null, null, null, null, false, false, 4037, null);
                IconWithActionDto label_icon3 = component.getLabel_icon();
                ActionDto action = label_icon3 == null ? label_icon3.getAction() : null;
                composerStartRestartGroup.startReplaceGroup(-2103343462);
                modifierM4893clickableXHw0xAI$default = action != null ? ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, SduiActionHandler3.handling(parseAction.invoke(action), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0)), 7, null) : null;
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                final Modifier modifierThen = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(1188702198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt.SduiCondensedDataRow.1
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
                            ComposerKt.traceEventStart(1188702198, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCondensedDataRow.<anonymous> (SduiDataRowIdl.kt:38)");
                        }
                        BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, modifierThen, null, null, null, composer2, BentoDataRowState.$stable, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiDataRowIdl.SduiCondensedDataRow$lambda$1(component, parseAction, modifier4, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IconWithActionDto label_icon4 = component.getLabel_icon();
            if (label_icon4 != null) {
                IconWithActionDto label_icon22 = component.getLabel_icon();
                if (label_icon22 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-2103350038);
                if (icon_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(component.getLabel(), null, 2, null), null, bentoIcon, composeColor, new AnnotatedString(component.getValue(), null, 2, null), null, null, null, null, false, false, 4037, null);
                IconWithActionDto label_icon32 = component.getLabel_icon();
                if (label_icon32 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-2103343462);
                if (action != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                }
                final Modifier modifierThen2 = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(1188702198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt.SduiCondensedDataRow.1
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
                            ComposerKt.traceEventStart(1188702198, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCondensedDataRow.<anonymous> (SduiDataRowIdl.kt:38)");
                        }
                        BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState2, modifierThen2, null, null, null, composer2, BentoDataRowState.$stable, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontalPadding2 = horizontalPadding3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiStackedDataRow(final DataRowStackedDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Modifier modifierM4893clickableXHw0xAI$default;
        final HorizontalPadding horizontalPadding2;
        IconDto icon;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1768203482);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1768203482, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStackedDataRow (SduiDataRowIdl.kt:51)");
                }
                IconWithActionDto label_icon = component.getLabel_icon();
                BentoIcon4 bentoIcon = (label_icon != null || (icon = label_icon.getIcon()) == null) ? null : SduiIcon2.toBentoIcon(icon);
                IconWithActionDto label_icon2 = component.getLabel_icon();
                ThemedColorDto icon_color_override = label_icon2 == null ? label_icon2.getIcon_color_override() : null;
                composerStartRestartGroup.startReplaceGroup(-1563489910);
                Color composeColor = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = new AnnotatedString(component.getLabel(), null, 2, null);
                AnnotatedString annotatedString2 = new AnnotatedString(component.getValue(), null, 2, null);
                ThemedColorDto value_color_override = component.getValue_color_override();
                composerStartRestartGroup.startReplaceGroup(-1563484182);
                Color composeColor2 = value_color_override != null ? null : SduiColors2.toComposeColor(value_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState = new BentoDataRowState(component.getValue_description(), annotatedString, null, bentoIcon, composeColor, annotatedString2, composeColor2, null, null, null, false, false, 3972, null);
                IconWithActionDto label_icon3 = component.getLabel_icon();
                ActionDto action = label_icon3 == null ? label_icon3.getAction() : null;
                composerStartRestartGroup.startReplaceGroup(-1563479174);
                modifierM4893clickableXHw0xAI$default = action != null ? ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, SduiActionHandler3.handling(parseAction.invoke(action), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0)), 7, null) : null;
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                final Modifier modifierThen = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(1270965302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt.SduiStackedDataRow.1
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
                            ComposerKt.traceEventStart(1270965302, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStackedDataRow.<anonymous> (SduiDataRowIdl.kt:69)");
                        }
                        BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierThen, null, composer2, BentoDataRowState.$stable, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiDataRowIdl.SduiStackedDataRow$lambda$3(component, parseAction, modifier4, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IconWithActionDto label_icon4 = component.getLabel_icon();
            if (label_icon4 != null) {
                IconWithActionDto label_icon22 = component.getLabel_icon();
                if (label_icon22 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1563489910);
                if (icon_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString3 = new AnnotatedString(component.getLabel(), null, 2, null);
                AnnotatedString annotatedString22 = new AnnotatedString(component.getValue(), null, 2, null);
                ThemedColorDto value_color_override2 = component.getValue_color_override();
                composerStartRestartGroup.startReplaceGroup(-1563484182);
                if (value_color_override2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final BentoDataRowState bentoDataRowState2 = new BentoDataRowState(component.getValue_description(), annotatedString3, null, bentoIcon, composeColor, annotatedString22, composeColor2, null, null, null, false, false, 3972, null);
                IconWithActionDto label_icon32 = component.getLabel_icon();
                if (label_icon32 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1563479174);
                if (action != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (modifierM4893clickableXHw0xAI$default == null) {
                }
                final Modifier modifierThen2 = modifier3.then(modifierM4893clickableXHw0xAI$default);
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(1270965302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdlKt.SduiStackedDataRow.1
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
                            ComposerKt.traceEventStart(1270965302, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStackedDataRow.<anonymous> (SduiDataRowIdl.kt:69)");
                        }
                        BentoDataRowKt.BentoDataRow(bentoDataRowState2, modifierThen2, null, composer2, BentoDataRowState.$stable, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontalPadding2 = horizontalPadding3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
