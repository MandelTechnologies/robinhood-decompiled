package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Toggleable2;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001aw\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u001d\u001a?\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020 0\u0005H\u0003¢\u0006\u0002\u0010!\u001a!\u0010\"\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010#\u001aS\u0010$\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010)\u001a\r\u0010*\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.H\u0003¢\u0006\u0002\u0010/\u001a\u0015\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u000202H\u0003¢\u0006\u0002\u00103\u001a\r\u00109\u001a\u000202H\u0003¢\u0006\u0002\u0010:\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020205H\u0003¢\u0006\u0002\u0010=\"\u0016\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b05X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>²\u0006\n\u0010\u0013\u001a\u00020\u0006X\u008a\u008e\u0002"}, m3636d2 = {"BentoToggleRow", "", "state", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState;", "onValueChanged", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "start", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "end", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End;", "primaryText", "", "secondaryText", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;", "enabled", "checked", "contentDescription", "loading", "shouldIncludeLoadingPlaceholder", "showBottomDivider", "checkedIcon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Text;ZZLjava/lang/String;ZZZLcom/robinhood/compose/bento/component/BentoIcons$Size16;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLcom/robinhood/compose/bento/component/BentoIcons$Size16;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RowStartElement", "resolveStartTint", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RowEndElement", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$End;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RowSwitchElement", "colors", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowColors;", "icon", "onCheckedChange", "(ZZLcom/robinhood/compose/bento/component/rows/BentoToggleRowColors;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoIcons$Size16;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BentoToggleRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "ExampleToggleRow", "model", "Lcom/robinhood/compose/bento/component/rows/ToggleModel;", "(Lcom/robinhood/compose/bento/component/rows/ToggleModel;Landroidx/compose/runtime/Composer;I)V", "Section", "section", "Lcom/robinhood/compose/bento/component/rows/ToggleSection;", "(Lcom/robinhood/compose/bento/component/rows/ToggleSection;Landroidx/compose/runtime/Composer;I)V", "startList", "", "enabledSection", "disabledSection", "singleLineSection", "getThemesSection", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/ToggleSection;", "loadingSection", "getSections", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.BentoToggleRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoToggleRow3 {
    private static final ToggleSection disabledSection;
    private static final ToggleSection enabledSection;
    private static final ToggleSection loadingSection;
    private static final ToggleSection singleLineSection;
    private static final List<BentoToggleRowState.Start> startList;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoToggleRow$lambda$0(BentoToggleRowState bentoToggleRowState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoToggleRow(bentoToggleRowState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoToggleRow$lambda$10(BentoToggleRowState.Start start, String str, String str2, boolean z, boolean z2, String str3, boolean z3, BentoIcon4.Size16 size16, Function1 function1, int i, int i2, Composer composer, int i3) {
        BentoToggleRow(start, str, str2, z, z2, str3, z3, size16, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoToggleRow$lambda$8(BentoToggleRowState.Start start, BentoToggleRowState.End end, String str, BentoToggleRowState.Text text, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, BentoIcon4.Size16 size16, Function1 function1, Modifier modifier, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        BentoToggleRow(start, end, str, text, z, z2, str2, z3, z4, z5, size16, function1, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoToggleRowPreview$lambda$14(int i, Composer composer, int i2) {
        BentoToggleRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExampleToggleRow$lambda$18(ToggleModel toggleModel, int i, Composer composer, int i2) {
        ExampleToggleRow(toggleModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowEndElement$lambda$12(BentoToggleRowState.End end, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowEndElement(end, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartElement$lambda$11(Modifier modifier, BentoToggleRowState.Start start, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        RowStartElement(modifier, start, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowSwitchElement$lambda$13(boolean z, boolean z2, BentoToggleRow bentoToggleRow, Modifier modifier, BentoIcon4.Size16 size16, Function1 function1, int i, int i2, Composer composer, int i3) {
        RowSwitchElement(z, z2, bentoToggleRow, modifier, size16, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$21(ToggleSection toggleSection, int i, Composer composer, int i2) {
        Section(toggleSection, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExampleToggleRow$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoToggleRow(final BentoToggleRowState state, final Function1<? super Boolean, Unit> onValueChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(590917488);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChanged) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590917488, i3, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow (BentoToggleRow.kt:108)");
                }
                composer2 = composerStartRestartGroup;
                BentoToggleRow(state.getStart(), null, state.getPrimaryText(), state.getSecondaryText(), state.getEnabled(), state.getChecked(), state.getContentDescription(), state.getLoading(), state.getShouldIncludeLoadingPlaceholder(), state.getShowBottomDivider(), state.getCheckedIcon(), onValueChanged, modifier4, null, composer2, 48, (i3 & 112) | 3072 | (i3 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoToggleRow3.BentoToggleRow$lambda$0(state, onValueChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoToggleRow(state.getStart(), null, state.getPrimaryText(), state.getSecondaryText(), state.getEnabled(), state.getChecked(), state.getContentDescription(), state.getLoading(), state.getShouldIncludeLoadingPlaceholder(), state.getShowBottomDivider(), state.getCheckedIcon(), onValueChanged, modifier4, null, composer2, 48, (i3 & 112) | 3072 | (i3 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoToggleRow(final BentoToggleRowState.Start start, BentoToggleRowState.End end, final String primaryText, final BentoToggleRowState.Text text, final boolean z, final boolean z2, final String str, final boolean z3, final boolean z4, final boolean z5, final BentoIcon4.Size16 size16, final Function1<? super Boolean, Unit> onValueChanged, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z6;
        boolean z7;
        Object objRememberedValue;
        Composer composer2;
        final BentoToggleRowState.End end2;
        final Modifier modifier2;
        final Function0<Unit> function02;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1944205241);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(start) : composerStartRestartGroup.changedInstance(start) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(end) : composerStartRestartGroup.changedInstance(end) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(primaryText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(text) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i11 = (1572864 & i) == 0 ? composerStartRestartGroup.changed(str) ? 1048576 : 524288 : 1572864;
            if ((i3 & 128) != 0) {
                i10 = (12582912 & i) == 0 ? composerStartRestartGroup.changed(z3) ? 8388608 : 4194304 : 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else {
                    if ((100663296 & i) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 67108864 : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        if ((805306368 & i) == 0) {
                            i4 |= composerStartRestartGroup.changed(z5) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i5 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i5 = i2 | (composerStartRestartGroup.changed(size16) ? 4 : 2);
                        } else {
                            i5 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i5 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(onValueChanged) ? 32 : 16;
                        }
                        int i12 = i5;
                        i6 = i3 & 4096;
                        if (i6 != 0) {
                            i7 = i12 | 384;
                        } else {
                            int i13 = i12;
                            if ((i2 & 384) == 0) {
                                i13 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                            }
                            i7 = i13;
                        }
                        i8 = i3 & 8192;
                        if (i8 != 0) {
                            i9 = i7 | 3072;
                        } else {
                            int i14 = i7;
                            if ((i2 & 3072) == 0) {
                                i9 = i14 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
                            } else {
                                i9 = i14;
                            }
                        }
                        if ((i4 & 306783379) != 306783378 || (i9 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                            final Function0<Unit> function03 = i8 == 0 ? null : function0;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1944205241, i4, i9, "com.robinhood.compose.bento.component.rows.BentoToggleRow (BentoToggleRow.kt:145)");
                            }
                            int i15 = i4;
                            final BentoToggleRow bentoToggleRowCreate = BentoToggleRow.INSTANCE.create(z, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getToggleRow(composerStartRestartGroup, 0), composerStartRestartGroup, ((i15 >> 12) & 14) | 384 | (ToggleRowStyle.$stable << 3));
                            boolean z8 = (z || z3) ? false : true;
                            z6 = function03 != null;
                            composerStartRestartGroup.startReplaceGroup(70497419);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            if (z6) {
                                modifierFillMaxWidth$default = Toggleable2.m5319toggleableXHw0xAI(modifierFillMaxWidth$default, z2, z8, Role.m7472boximpl(Role.INSTANCE.m7485getSwitcho7Vup1c()), onValueChanged);
                            }
                            Modifier modifierM4893clickableXHw0xAI$default = modifierFillMaxWidth$default;
                            if (!z6) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z9 = (i9 & 7168) == 2048;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BentoToggleRow3.BentoToggleRow$lambda$4$lambda$3$lambda$2(function03);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                            }
                            Modifier modifier4 = modifierM4893clickableXHw0xAI$default;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z7 = (i15 & 3670016) != 1048576;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoToggleRow3.BentoToggleRow$lambda$7$lambda$6(str, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null);
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-911105411, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i16) {
                                    if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-911105411, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:172)");
                                    }
                                    BentoToggleRowState.Start start2 = start;
                                    boolean z10 = z;
                                    BentoToggleRow bentoToggleRow = bentoToggleRowCreate;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChanged = composer3.changed(bentoToggleRow);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new BentoToggleRow4(bentoToggleRow);
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer3.endReplaceGroup();
                                    BentoToggleRow3.RowStartElement(null, start2, z10, (Function1) ((KFunction) objRememberedValue3), composer3, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1779858012, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i16) {
                                    if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1779858012, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:184)");
                                    }
                                    BentoBaseRowKt.m20917RowPrimaryElementcf5BqRc((Modifier) null, new AnnotatedString(primaryText, null, 2, null), bentoToggleRowCreate.m21007getFg0d7_KjU(), (ImmutableMap<String, InlineTextContent>) null, composer3, 0, 9);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(175854139, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
                                /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer3, int i16) {
                                    BentoBaseRowState.Text plain;
                                    BentoBaseRowState.Text annotated;
                                    if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(175854139, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:190)");
                                    }
                                    BentoToggleRowState.Text text2 = text;
                                    if (text2 instanceof BentoToggleRowState.Text.MarkdownText) {
                                        plain = new BentoBaseRowState.Text.Markdown(((BentoToggleRowState.Text.MarkdownText) text).getMarkdownText(), C20690R.attr.textAppearanceRegularSmall, null, Color.m6701boximpl(bentoToggleRowCreate.m21008getFgSecondary0d7_KjU()), 4, null);
                                    } else if (text2 instanceof BentoToggleRowState.Text.Plain) {
                                        plain = new BentoBaseRowState.Text.Plain(((BentoToggleRowState.Text.Plain) text).getText());
                                    } else {
                                        plain = null;
                                        if (text2 instanceof BentoToggleRowState.Text.Annotated) {
                                            annotated = new BentoBaseRowState.Text.Annotated(((BentoToggleRowState.Text.Annotated) text).getAnnotatedString(), null, 2, null);
                                            BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, annotated, bentoToggleRowCreate.m21008getFgSecondary0d7_KjU(), null, composer3, 0, 9);
                                            if (ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        if (text2 != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    annotated = plain;
                                    BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, annotated, bentoToggleRowCreate.m21008getFgSecondary0d7_KjU(), null, composer3, 0, 9);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            Modifier modifier5 = modifier3;
                            Function0<Unit> function04 = function03;
                            composer2 = composerStartRestartGroup;
                            final boolean z10 = z8;
                            final boolean z11 = z6;
                            end2 = end;
                            BentoBaseRowLayout.BentoBaseRowLayout(modifierSemantics$default, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, ComposableLambda3.rememberComposableLambda(-1428149734, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.8
                                public final void invoke(Composer composer3, int i16) {
                                    if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1428149734, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:213)");
                                    }
                                    boolean z12 = z4;
                                    boolean z13 = z3;
                                    boolean z14 = z;
                                    BentoToggleRow bentoToggleRow = bentoToggleRowCreate;
                                    boolean z15 = z2;
                                    boolean z16 = z10;
                                    BentoIcon4.Size16 size162 = size16;
                                    boolean z17 = z11;
                                    Function1<Boolean, Unit> function1 = onValueChanged;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start2, companion2.getTop(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    composer3.startReplaceGroup(-999600866);
                                    if (z12 || (z13 && z14)) {
                                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(LocalShowPlaceholder.withBentoCirclePlaceholder$default(row6.align(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion, (z13 && z14) ? false : true), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, 11, null), companion2.getCenterVertically()), false, 1, null), BentoProgressIndicator3.f5153XS, bentoToggleRow.m21007getFg0d7_KjU(), composer3, 48, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    BentoToggleRow3.RowSwitchElement(z15, z16, bentoToggleRow, null, size162, !z17 ? function1 : null, composer3, 0, 8);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), ComposableLambda3.rememberComposableLambda(1262813689, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i16) {
                                    if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1262813689, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:179)");
                                    }
                                    BentoToggleRow3.RowEndElement(end2, null, composer3, 0, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), z5, false, false, null, composer2, (29360128 & (i15 >> 6)) | 1797504, 0, 1794);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier5;
                            function02 = function04;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function02 = function0;
                            end2 = end;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final BentoToggleRowState.End end3 = end2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoToggleRow3.BentoToggleRow$lambda$8(start, end3, primaryText, text, z, z2, str, z3, z4, z5, size16, onValueChanged, modifier2, function02, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    int i122 = i5;
                    i6 = i3 & 4096;
                    if (i6 != 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i152 = i4;
                        final BentoToggleRow bentoToggleRowCreate2 = BentoToggleRow.INSTANCE.create(z, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getToggleRow(composerStartRestartGroup, 0), composerStartRestartGroup, ((i152 >> 12) & 14) | 384 | (ToggleRowStyle.$stable << 3));
                        if (z) {
                            if (function03 != null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(70497419);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            if (z6) {
                            }
                            Modifier modifierM4893clickableXHw0xAI$default2 = modifierFillMaxWidth$default2;
                            if (!z6) {
                            }
                            Modifier modifier42 = modifierM4893clickableXHw0xAI$default2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if ((i152 & 3670016) != 1048576) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z7) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoToggleRow3.BentoToggleRow$lambda$7$lambda$6(str, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier42, false, (Function1) objRememberedValue, 1, null);
                                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-911105411, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i16) {
                                        if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-911105411, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:172)");
                                        }
                                        BentoToggleRowState.Start start2 = start;
                                        boolean z102 = z;
                                        BentoToggleRow bentoToggleRow = bentoToggleRowCreate2;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChanged = composer3.changed(bentoToggleRow);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new BentoToggleRow4(bentoToggleRow);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceGroup();
                                        BentoToggleRow3.RowStartElement(null, start2, z102, (Function1) ((KFunction) objRememberedValue3), composer3, 0, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(1779858012, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i16) {
                                        if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1779858012, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:184)");
                                        }
                                        BentoBaseRowKt.m20917RowPrimaryElementcf5BqRc((Modifier) null, new AnnotatedString(primaryText, null, 2, null), bentoToggleRowCreate2.m21007getFg0d7_KjU(), (ImmutableMap<String, InlineTextContent>) null, composer3, 0, 9);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(175854139, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
                                    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer3, int i16) {
                                        BentoBaseRowState.Text plain;
                                        BentoBaseRowState.Text annotated;
                                        if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(175854139, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:190)");
                                        }
                                        BentoToggleRowState.Text text2 = text;
                                        if (text2 instanceof BentoToggleRowState.Text.MarkdownText) {
                                            plain = new BentoBaseRowState.Text.Markdown(((BentoToggleRowState.Text.MarkdownText) text).getMarkdownText(), C20690R.attr.textAppearanceRegularSmall, null, Color.m6701boximpl(bentoToggleRowCreate2.m21008getFgSecondary0d7_KjU()), 4, null);
                                        } else if (text2 instanceof BentoToggleRowState.Text.Plain) {
                                            plain = new BentoBaseRowState.Text.Plain(((BentoToggleRowState.Text.Plain) text).getText());
                                        } else {
                                            plain = null;
                                            if (text2 instanceof BentoToggleRowState.Text.Annotated) {
                                                annotated = new BentoBaseRowState.Text.Annotated(((BentoToggleRowState.Text.Annotated) text).getAnnotatedString(), null, 2, null);
                                                BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, annotated, bentoToggleRowCreate2.m21008getFgSecondary0d7_KjU(), null, composer3, 0, 9);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    return;
                                                }
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            if (text2 != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        annotated = plain;
                                        BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, annotated, bentoToggleRowCreate2.m21008getFgSecondary0d7_KjU(), null, composer3, 0, 9);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                Modifier modifier52 = modifier3;
                                Function0<Unit> function042 = function03;
                                composer2 = composerStartRestartGroup;
                                final boolean z102 = z8;
                                final boolean z112 = z6;
                                end2 = end;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifierSemantics$default2, null, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda22, composableLambdaRememberComposableLambda32, ComposableLambda3.rememberComposableLambda(-1428149734, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.8
                                    public final void invoke(Composer composer3, int i16) {
                                        if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1428149734, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:213)");
                                        }
                                        boolean z12 = z4;
                                        boolean z13 = z3;
                                        boolean z14 = z;
                                        BentoToggleRow bentoToggleRow = bentoToggleRowCreate2;
                                        boolean z15 = z2;
                                        boolean z16 = z102;
                                        BentoIcon4.Size16 size162 = size16;
                                        boolean z17 = z112;
                                        Function1<Boolean, Unit> function1 = onValueChanged;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start2, companion2.getTop(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        composer3.startReplaceGroup(-999600866);
                                        if (z12 || (z13 && z14)) {
                                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(LocalShowPlaceholder.withBentoCirclePlaceholder$default(row6.align(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion, (z13 && z14) ? false : true), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, 11, null), companion2.getCenterVertically()), false, 1, null), BentoProgressIndicator3.f5153XS, bentoToggleRow.m21007getFg0d7_KjU(), composer3, 48, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        BentoToggleRow3.RowSwitchElement(z15, z16, bentoToggleRow, null, size162, !z17 ? function1 : null, composer3, 0, 8);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), ComposableLambda3.rememberComposableLambda(1262813689, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.BentoToggleRow.9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i16) {
                                        if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1262813689, i16, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow.<anonymous> (BentoToggleRow.kt:179)");
                                        }
                                        BentoToggleRow3.RowEndElement(end2, null, composer3, 0, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), z5, false, false, null, composer2, (29360128 & (i152 >> 6)) | 1797504, 0, 1794);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier52;
                                function02 = function042;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                int i1222 = i5;
                i6 = i3 & 4096;
                if (i6 != 0) {
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i4 |= i10;
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i12222 = i5;
            i6 = i3 & 4096;
            if (i6 != 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 |= i11;
        if ((i3 & 128) != 0) {
        }
        i4 |= i10;
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i122222 = i5;
        i6 = i3 & 4096;
        if (i6 != 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoToggleRow$lambda$4$lambda$3$lambda$2(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoToggleRow$lambda$7$lambda$6(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (str != null) {
            SemanticsPropertiesKt.setStateDescription(semantics, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoToggleRow(BentoToggleRowState.Start start, String str, String str2, boolean z, final boolean z2, String str3, boolean z3, BentoIcon4.Size16 size16, final Function1<? super Boolean, Unit> onValueChanged, Composer composer, final int i, final int i2) {
        int i3;
        String str4;
        int i4;
        String str5;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final String str6;
        final BentoToggleRowState.Start start2;
        final String str7;
        final boolean z6;
        final BentoIcon4.Size16 size162;
        final String str8;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(981602761);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(start) : composerStartRestartGroup.changedInstance(start) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str5 = str2;
                    i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z5 = z2;
                            i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                        }
                        i6 = i2 & 32;
                        if (i6 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changed(size16) ? 8388608 : 4194304;
                            }
                            if ((i2 & 256) == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(onValueChanged) ? 67108864 : 33554432;
                            }
                            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                BentoToggleRowState.Start start3 = i10 == 0 ? null : start;
                                if (i11 != 0) {
                                    str4 = "";
                                }
                                if (i4 != 0) {
                                    str5 = null;
                                }
                                boolean z8 = i5 == 0 ? true : z4;
                                String str9 = i6 == 0 ? null : str3;
                                boolean z9 = i7 == 0 ? false : z3;
                                BentoIcon4.Size16 size163 = i9 == 0 ? null : size16;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(981602761, i3, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRow (BentoToggleRow.kt:253)");
                                }
                                BentoToggleRowState.Start start4 = start3;
                                String str10 = str4;
                                BentoToggleRow(new BentoToggleRowState(start4, str10, str5 != null ? new BentoToggleRowState.Text.Plain(str5) : null, z8, z5, size163, str9, z9, false, false, 768, null), onValueChanged, null, composerStartRestartGroup, (i3 >> 21) & 112, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = composerStartRestartGroup;
                                str6 = str5;
                                start2 = start4;
                                str7 = str10;
                                z6 = z8;
                                size162 = size163;
                                str8 = str9;
                                z7 = z9;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                start2 = start;
                                z7 = z3;
                                composer2 = composerStartRestartGroup;
                                str7 = str4;
                                str6 = str5;
                                z6 = z4;
                                str8 = str3;
                                size162 = size16;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoToggleRow3.BentoToggleRow$lambda$10(start2, str7, str6, z6, z2, str8, z7, size162, onValueChanged, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i9 = i8;
                        if ((i2 & 256) == 0) {
                        }
                        if ((38347923 & i3) == 38347922) {
                            if (i10 == 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            BentoToggleRowState.Start start42 = start3;
                            String str102 = str4;
                            BentoToggleRow(new BentoToggleRowState(start42, str102, str5 != null ? new BentoToggleRowState.Text.Plain(str5) : null, z8, z5, size163, str9, z9, false, false, 768, null), onValueChanged, null, composerStartRestartGroup, (i3 >> 21) & 112, 4);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            str6 = str5;
                            start2 = start42;
                            str7 = str102;
                            z6 = z8;
                            size162 = size163;
                            str8 = str9;
                            z7 = z9;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z5 = z2;
                    i6 = i2 & 32;
                    if (i6 != 0) {
                    }
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i2 & 256) == 0) {
                    }
                    if ((38347923 & i3) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z;
                if ((i2 & 16) == 0) {
                }
                z5 = z2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & 256) == 0) {
                }
                if ((38347923 & i3) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str5 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z;
            if ((i2 & 16) == 0) {
            }
            z5 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & 256) == 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str5 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z;
        if ((i2 & 16) == 0) {
        }
        z5 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RowStartElement(Modifier modifier, final BentoToggleRowState.Start start, final boolean z, final Function1<? super Color, Color> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1757712073);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(start) : composerStartRestartGroup.changedInstance(start) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757712073, i3, -1, "com.robinhood.compose.bento.component.rows.RowStartElement (BentoToggleRow.kt:276)");
            }
            if (start == null) {
                composerStartRestartGroup.startReplaceGroup(-1239147877);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier5;
                composer2 = composerStartRestartGroup;
            } else if (start instanceof BentoToggleRowState.Start.Icon) {
                composerStartRestartGroup.startReplaceGroup(241178023);
                BentoToggleRowState.Start.Icon icon = (BentoToggleRowState.Start.Icon) start;
                composer2 = composerStartRestartGroup;
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(icon.getAsset().getResourceId(), composerStartRestartGroup, 0), (String) null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier5, false, 1, null), function1.invoke(icon.m21019getTintQN2ZGVo()).getValue(), composer2, 48, 0);
                composer2.endReplaceGroup();
                modifier3 = modifier5;
            } else if (start instanceof BentoToggleRowState.Start.NumberPog) {
                composerStartRestartGroup.startReplaceGroup(241452559);
                modifier3 = modifier5;
                BentoPogKt.m20683BentoNumberPogxqIIw2o(((BentoToggleRowState.Start.NumberPog) start).getNumber(), modifier3, z2, null, composerStartRestartGroup, ((i3 << 3) & 112) | (i3 & 896), 8);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                modifier3 = modifier5;
                if (!(start instanceof BentoToggleRowState.Start.PictogramPog)) {
                    composerStartRestartGroup.startReplaceGroup(-1239148188);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(241630592);
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(((BentoToggleRowState.Start.PictogramPog) start).getAsset().getResourceId(), modifier3, z, null, null, null, null, composerStartRestartGroup, ((i3 << 3) & 112) | (i3 & 896), 120);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoToggleRow3.RowStartElement$lambda$11(modifier4, start, z, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RowEndElement(final BentoToggleRowState.End end, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-263399540);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(end) : composerStartRestartGroup.changedInstance(end) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263399540, i3, -1, "com.robinhood.compose.bento.component.rows.RowEndElement (BentoToggleRow.kt:307)");
            }
            if (end != null) {
                if (!(end instanceof BentoToggleRowState.End.Caret)) {
                    throw new NoWhenBranchMatchedException();
                }
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(((BentoToggleRowState.End.Caret) end).getDirection().getResId(), composerStartRestartGroup, 0), "Caret", LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier, false, 1, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21925getCaretColor0d7_KjU(), composerStartRestartGroup, 48, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoToggleRow3.RowEndElement$lambda$12(end, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowSwitchElement(final boolean z, final boolean z2, final BentoToggleRow bentoToggleRow, Modifier modifier, BentoIcon4.Size16 size16, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        int i4;
        BentoIcon4.Size16 size162;
        int i5;
        Function1<? super Boolean, Unit> function12;
        ComposableLambda composableLambdaRememberComposableLambda;
        final BentoIcon4.Size16 size163;
        final Function1<? super Boolean, Unit> function13;
        final Modifier modifier3;
        final BentoIcon4.Size16 size164;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1863775473);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoToggleRow) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    size162 = size16;
                    i3 |= composerStartRestartGroup.changed(size162) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        composableLambdaRememberComposableLambda = null;
                        size163 = i4 == 0 ? null : size162;
                        if (i5 != 0) {
                            function12 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1863775473, i3, -1, "com.robinhood.compose.bento.component.rows.RowSwitchElement (BentoToggleRow.kt:330)");
                        }
                        Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(modifier4, false, 1, null);
                        SwitchColors switchColors = bentoToggleRow.switchColors(composerStartRestartGroup, (i3 >> 6) & 14);
                        composerStartRestartGroup.startReplaceGroup(-86851673);
                        if (size163 != null && z) {
                            composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(294683173, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.RowSwitchElement.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i7) {
                                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(294683173, i7, -1, "com.robinhood.compose.bento.component.rows.RowSwitchElement.<anonymous> (BentoToggleRow.kt:339)");
                                    }
                                    BentoIcon2.m20644BentoIconFU0evQE(size163, null, bentoToggleRow.getCheckedTrackColor(), null, null, false, composer2, 48, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function1<? super Boolean, Unit> function14 = function12;
                        SwitchKt.Switch(z, function14, modifierWithBentoPillPlaceholder$default, composableLambdaRememberComposableLambda, z3, switchColors, null, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | ((i3 << 9) & 57344), 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function13 = function14;
                        modifier3 = modifier4;
                        size164 = size163;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        size164 = size162;
                        function13 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoToggleRow3.RowSwitchElement$lambda$13(z, z2, bentoToggleRow, modifier3, size164, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function12 = function1;
                if ((74899 & i3) == 74898) {
                    if (i6 == 0) {
                    }
                    composableLambdaRememberComposableLambda = null;
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierWithBentoPillPlaceholder$default2 = LocalShowPlaceholder.withBentoPillPlaceholder$default(modifier4, false, 1, null);
                    SwitchColors switchColors2 = bentoToggleRow.switchColors(composerStartRestartGroup, (i3 >> 6) & 14);
                    composerStartRestartGroup.startReplaceGroup(-86851673);
                    if (size163 != null) {
                        composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(294683173, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt.RowSwitchElement.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(294683173, i7, -1, "com.robinhood.compose.bento.component.rows.RowSwitchElement.<anonymous> (BentoToggleRow.kt:339)");
                                }
                                BentoIcon2.m20644BentoIconFU0evQE(size163, null, bentoToggleRow.getCheckedTrackColor(), null, null, false, composer2, 48, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1<? super Boolean, Unit> function142 = function12;
                    SwitchKt.Switch(z, function142, modifierWithBentoPillPlaceholder$default2, composableLambdaRememberComposableLambda, z3, switchColors2, null, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | ((i3 << 9) & 57344), 64);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function13 = function142;
                    modifier3 = modifier4;
                    size164 = size163;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size162 = size16;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function12 = function1;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        size162 = size16;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BentoToggleRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1584648287);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1584648287, i, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRowPreview (BentoToggleRow.kt:475)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoToggleRow6.INSTANCE.getLambda$524748633$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoToggleRow3.BentoToggleRowPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ExampleToggleRow(final ToggleModel toggleModel, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1415057480);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(toggleModel) : composerStartRestartGroup.changedInstance(toggleModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415057480, i2, -1, "com.robinhood.compose.bento.component.rows.ExampleToggleRow (BentoToggleRow.kt:507)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(toggleModel.getChecked()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Color colorM21090getAccentColorOverrideQN2ZGVo = toggleModel.m21090getAccentColorOverrideQN2ZGVo();
            composerStartRestartGroup.startReplaceGroup(1634399917);
            long jM21368getAccent0d7_KjU = colorM21090getAccentColorOverrideQN2ZGVo == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU() : colorM21090getAccentColorOverrideQN2ZGVo.getValue();
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jM21368getAccent0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-728272730, true, new C326021(toggleModel, snapshotState), composerStartRestartGroup, 54), composer2, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoToggleRow3.ExampleToggleRow$lambda$18(toggleModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExampleToggleRow$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: BentoToggleRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$ExampleToggleRow$1 */
    static final class C326021 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $checked$delegate;
        final /* synthetic */ ToggleModel $model;

        C326021(ToggleModel toggleModel, SnapshotState<Boolean> snapshotState) {
            this.$model = toggleModel;
            this.$checked$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-728272730, i, -1, "com.robinhood.compose.bento.component.rows.ExampleToggleRow.<anonymous> (BentoToggleRow.kt:512)");
            }
            BentoToggleRowState.Start start = this.$model.getStart();
            String primaryText = this.$model.getPrimaryText();
            String secondaryText = this.$model.getSecondaryText();
            boolean enabled = this.$model.getEnabled();
            boolean zExampleToggleRow$lambda$16 = BentoToggleRow3.ExampleToggleRow$lambda$16(this.$checked$delegate);
            String str = BentoToggleRow3.ExampleToggleRow$lambda$16(this.$checked$delegate) ? "Row toggled on" : "Row toggled off";
            boolean loading = this.$model.getLoading();
            BentoIcon4.Size16 checkedIcon = this.$model.getCheckedIcon();
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$checked$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$ExampleToggleRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoToggleRow3.C326021.invoke$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoToggleRow3.BentoToggleRow(start, primaryText, secondaryText, enabled, zExampleToggleRow$lambda$16, str, loading, checkedIcon, (Function1) objRememberedValue, composer, 100663296, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
            BentoToggleRow3.ExampleToggleRow$lambda$17(snapshotState, !BentoToggleRow3.ExampleToggleRow$lambda$16(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Section(final ToggleSection toggleSection, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1013765009);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(toggleSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1013765009, i2, -1, "com.robinhood.compose.bento.component.rows.Section (BentoToggleRow.kt:527)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String title = toggleSection.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, 6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(449706713);
            Iterator<T> it = toggleSection.getModels().iterator();
            while (it.hasNext()) {
                ExampleToggleRow((ToggleModel) it.next(), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoToggleRow3.Section$lambda$21(toggleSection, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List<BentoToggleRowState.Start> listListOf = CollectionsKt.listOf((Object[]) new BentoToggleRowState.Start[]{null, new BentoToggleRowState.Start.Icon(ServerToBentoAssetMapper2.DOWNLOAD_24, null, 2, 0 == true ? 1 : 0), new BentoToggleRowState.Start.NumberPog(1), new BentoToggleRowState.Start.PictogramPog(ServerToBentoAssetMapper3.MEGAPHONE)});
        startList = listListOf;
        List<BentoToggleRowState.Start> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ToggleModel((BentoToggleRowState.Start) it.next(), null, null, true, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null));
        }
        enabledSection = new ToggleSection("Enabled", CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf((Object[]) new ToggleModel[]{new ToggleModel(null, null, null, false, true, false, null, null, 239, null), new ToggleModel(null, null, null, false, true, false, new BentoIcon4.Size16(ServerToBentoAssetMapper2.LOCK_16), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, null)})));
        List<BentoToggleRowState.Start> list2 = startList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(new ToggleModel((BentoToggleRowState.Start) obj, null, null, false, i % 2 == 0, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null));
            i = i2;
        }
        disabledSection = new ToggleSection("Disabled", arrayList2);
        List<BentoToggleRowState.Start> list3 = startList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new ToggleModel((BentoToggleRowState.Start) it2.next(), null, "", false, false, false, null, null, 250, null));
        }
        singleLineSection = new ToggleSection("Single line", arrayList3);
        loadingSection = new ToggleSection("Loading indicator", CollectionsKt.listOf((Object[]) new ToggleModel[]{new ToggleModel(null, null, null, false, false, true, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null), new ToggleModel(null, "Disabled rows cannot be loading", null, false, false, true, null, null, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, null)}));
    }

    private static final ToggleSection getThemesSection(Composer composer, int i) {
        composer.startReplaceGroup(-1257908353);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1257908353, i, -1, "com.robinhood.compose.bento.component.rows.getThemesSection (BentoToggleRow.kt:592)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        ToggleSection toggleSection = new ToggleSection("Custom coloring", CollectionsKt.listOf((Object[]) new ToggleModel[]{new ToggleModel(null, "Error", null, false, true, false, null, Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU()), 109, null), new ToggleModel(null, "Foreground", null, false, true, false, null, Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU()), 109, null), new ToggleModel(null, "Sol", null, false, true, false, null, Color.m6701boximpl(bentoTheme.getColors(composer, 6).getSol()), 109, null)}));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return toggleSection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ToggleSection> getSections(Composer composer, int i) {
        composer.startReplaceGroup(-353447913);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-353447913, i, -1, "com.robinhood.compose.bento.component.rows.getSections (BentoToggleRow.kt:628)");
        }
        List<ToggleSection> listListOf = CollectionsKt.listOf((Object[]) new ToggleSection[]{enabledSection, disabledSection, singleLineSection, getThemesSection(composer, 0), loadingSection});
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listListOf;
    }
}
