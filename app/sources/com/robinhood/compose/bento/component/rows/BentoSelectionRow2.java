package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: BentoSelectionRow.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a{\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"BentoSelectionRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoSelectionRowIcon", "(Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;Landroidx/compose/runtime/Composer;I)V", "type", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;", "primaryText", "", "selected", "", "secondaryText", "enabled", "iconPosition", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;", "showBottomDivider", "removeHorizontalPadding", "removeVerticalPadding", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$Type;Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/compose/bento/component/rows/BentoSelectionRowState$IconPosition;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoSelectionRow2 {

    /* compiled from: BentoSelectionRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoSelectionRowState.Type.values().length];
            try {
                iArr[BentoSelectionRowState.Type.RadioButton.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoSelectionRowState.Type.Checkbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSelectionRow$lambda$1(Modifier modifier, BentoSelectionRowState bentoSelectionRowState, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoSelectionRow(modifier, bentoSelectionRowState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSelectionRow$lambda$3(Modifier modifier, BentoSelectionRowState.Type type2, String str, boolean z, String str2, boolean z2, BentoSelectionRowState.IconPosition iconPosition, boolean z3, boolean z4, boolean z5, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        BentoSelectionRow(modifier, type2, str, z, str2, z2, iconPosition, z3, z4, z5, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSelectionRowIcon$lambda$2(BentoSelectionRowState bentoSelectionRowState, int i, Composer composer, int i2) {
        BentoSelectionRowIcon(bentoSelectionRowState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BentoSelectionRow(Modifier modifier, final BentoSelectionRowState state, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Tuples2 tuples2M3642to;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(418343655);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418343655, i3, -1, "com.robinhood.compose.bento.component.rows.BentoSelectionRow (BentoSelectionRow.kt:89)");
            }
            BentoSelectionRowStyle.Colors colors = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getSelectionRowStyle(composerStartRestartGroup, 0).getColors();
            if (state.getEnabled()) {
                tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(colors.m21691getFgColor0d7_KjU()), Color.m6701boximpl(colors.m21693getFgColorSecondary0d7_KjU()));
            } else {
                tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(colors.m21692getFgColorDisabled0d7_KjU()), Color.m6701boximpl(colors.m21692getFgColorDisabled0d7_KjU()));
            }
            final long value = ((Color) tuples2M3642to.component1()).getValue();
            final long value2 = ((Color) tuples2M3642to.component2()).getValue();
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(Selectable3.m5315selectableXHw0xAI(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), state.getSelected(), state.getEnabled(), Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), onClick), null, ComposableLambda3.rememberComposableLambda(1562311587, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt.BentoSelectionRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1562311587, i5, -1, "com.robinhood.compose.bento.component.rows.BentoSelectionRow.<anonymous> (BentoSelectionRow.kt:108)");
                    }
                    BentoSelectionRowState.IconPosition iconPosition = state.getIconPosition();
                    if (iconPosition instanceof BentoSelectionRowState.IconPosition.Leading) {
                        composer3.startReplaceGroup(-1857115745);
                        BentoSelectionRow2.BentoSelectionRowIcon(state, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(iconPosition instanceof BentoSelectionRowState.IconPosition.Trailing)) {
                            composer3.startReplaceGroup(-1857117846);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-1735908713);
                        Function2<Composer, Integer, Unit> startElement = ((BentoSelectionRowState.IconPosition.Trailing) state.getIconPosition()).getStartElement();
                        if (startElement != null) {
                            startElement.invoke(composer3, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(858448612, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt.BentoSelectionRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(858448612, i5, -1, "com.robinhood.compose.bento.component.rows.BentoSelectionRow.<anonymous> (BentoSelectionRow.kt:114)");
                    }
                    BentoBaseRowKt.m20917RowPrimaryElementcf5BqRc((Modifier) null, state.getPrimaryText(), value, state.getInlineContent(), composer3, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(154585637, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt.BentoSelectionRow.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(154585637, i5, -1, "com.robinhood.compose.bento.component.rows.BentoSelectionRow.<anonymous> (BentoSelectionRow.kt:121)");
                    }
                    BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, state.getSecondaryText(), value2, state.getOnClick(), composer3, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1253140313, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt.BentoSelectionRow.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1253140313, i5, -1, "com.robinhood.compose.bento.component.rows.BentoSelectionRow.<anonymous> (BentoSelectionRow.kt:128)");
                    }
                    BentoSelectionRowState.IconPosition iconPosition = state.getIconPosition();
                    if (iconPosition instanceof BentoSelectionRowState.IconPosition.Leading) {
                        composer3.startReplaceGroup(-447212429);
                        Function2<Composer, Integer, Unit> endElement = ((BentoSelectionRowState.IconPosition.Leading) state.getIconPosition()).getEndElement();
                        if (endElement != null) {
                            endElement.invoke(composer3, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                    } else {
                        if (!(iconPosition instanceof BentoSelectionRowState.IconPosition.Trailing)) {
                            composer3.startReplaceGroup(-1676997268);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-1676992477);
                        BentoSelectionRow2.BentoSelectionRowIcon(state, composer3, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), state.getShowBottomDivider(), state.getRemoveVerticalPadding(), state.getRemoveHorizontalPadding(), null, composer2, 1600896, 0, 1058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSelectionRow2.BentoSelectionRow$lambda$1(modifier3, state, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoSelectionRowIcon(final BentoSelectionRowState bentoSelectionRowState, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-911898863);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoSelectionRowState) : composerStartRestartGroup.changedInstance(bentoSelectionRowState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911898863, i2, -1, "com.robinhood.compose.bento.component.rows.BentoSelectionRowIcon (BentoSelectionRow.kt:142)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[bentoSelectionRowState.getType().ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-161473704);
                BentoRadioButton2.BentoRadioButton(bentoSelectionRowState.getSelected(), null, bentoSelectionRowState.getEnabled(), composerStartRestartGroup, 0, 2);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    composerStartRestartGroup.startReplaceGroup(-161475714);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-161468776);
                composer2 = composerStartRestartGroup;
                BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, bentoSelectionRowState.getSelected(), bentoSelectionRowState.getEnabled(), null, null, composer2, 24576, 9);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSelectionRow2.BentoSelectionRowIcon$lambda$2(bentoSelectionRowState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSelectionRow(Modifier modifier, final BentoSelectionRowState.Type type2, final String primaryText, final boolean z, String str, boolean z2, BentoSelectionRowState.IconPosition iconPosition, boolean z3, boolean z4, boolean z5, final Function0<Unit> onClick, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean z6;
        int i7;
        final boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        BentoSelectionRowState.IconPosition trailing;
        boolean z8;
        boolean z9;
        Modifier modifier3;
        int i13;
        String str3;
        Composer composer2;
        boolean z10;
        final BentoSelectionRowState.IconPosition iconPosition2;
        boolean z11;
        Composer composer3;
        final Modifier modifier4;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final String str4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-517988788);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(type2.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(primaryText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str2 = str;
                    i4 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    z6 = z2;
                } else {
                    z6 = z2;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    if ((i3 & 64) != 0) {
                        i14 = 524288;
                        i4 |= i14;
                    } else {
                        if ((i & 2097152) == 0 ? composerStartRestartGroup.changed(iconPosition) : composerStartRestartGroup.changedInstance(iconPosition)) {
                            i14 = 1048576;
                        }
                        i4 |= i14;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    z7 = z3;
                } else {
                    z7 = z3;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(z7) ? 8388608 : 4194304;
                    }
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(z4) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(z5) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i2 | (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2);
                        } else {
                            i12 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z12 = z5;
                            composer3 = composerStartRestartGroup;
                            z14 = z6;
                            modifier4 = modifier2;
                            str4 = str2;
                            iconPosition2 = iconPosition;
                            z13 = z4;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    str2 = null;
                                }
                                if (i6 != 0) {
                                    z6 = true;
                                }
                                if ((i3 & 64) == 0) {
                                    trailing = new BentoSelectionRowState.IconPosition.Trailing(null);
                                    i4 &= -3670017;
                                } else {
                                    trailing = iconPosition;
                                }
                                z8 = i7 == 0 ? z7 : true;
                                z9 = i9 == 0 ? false : z4;
                                if (i11 == 0) {
                                    BentoSelectionRowState.IconPosition iconPosition3 = trailing;
                                    z11 = false;
                                    i13 = i4;
                                    composer2 = composerStartRestartGroup;
                                    z10 = z6;
                                    iconPosition2 = iconPosition3;
                                    modifier3 = modifier5;
                                    str3 = str2;
                                } else {
                                    modifier3 = modifier5;
                                    i13 = i4;
                                    str3 = str2;
                                    composer2 = composerStartRestartGroup;
                                    z10 = z6;
                                    iconPosition2 = trailing;
                                    z11 = z5;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                z8 = z7;
                                modifier3 = modifier2;
                                i13 = i4;
                                str3 = str2;
                                z9 = z4;
                                z11 = z5;
                                composer2 = composerStartRestartGroup;
                                z10 = z6;
                                iconPosition2 = iconPosition;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-517988788, i13, i12, "com.robinhood.compose.bento.component.rows.BentoSelectionRow (BentoSelectionRow.kt:170)");
                            }
                            composer3 = composer2;
                            String str5 = str3;
                            Modifier modifier6 = modifier3;
                            BentoSelectionRow(modifier6, new BentoSelectionRowState(type2, primaryText, z, str3 != null ? new BentoBaseRowState.Text.Plain(str3) : null, z10, z8, iconPosition2, z9, z11, (ImmutableMap) null, (Function0) null, 1536, (DefaultConstructorMarker) null), onClick, composer3, (i13 & 14) | ((i12 << 6) & 896), 0);
                            modifier4 = modifier6;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z12 = z11;
                            z13 = z9;
                            z7 = z8;
                            z14 = z10;
                            str4 = str5;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSelectionRowKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoSelectionRow2.BentoSelectionRow$lambda$3(modifier4, type2, primaryText, z, str4, z14, iconPosition2, z7, z13, z12, onClick, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i11 = i10;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer3 = composer2;
                            String str52 = str3;
                            Modifier modifier62 = modifier3;
                            BentoSelectionRow(modifier62, new BentoSelectionRowState(type2, primaryText, z, str3 != null ? new BentoBaseRowState.Text.Plain(str3) : null, z10, z8, iconPosition2, z9, z11, (ImmutableMap) null, (Function0) null, 1536, (DefaultConstructorMarker) null), onClick, composer3, (i13 & 14) | ((i12 << 6) & 896), 0);
                            modifier4 = modifier62;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z12 = z11;
                            z13 = z9;
                            z7 = z8;
                            z14 = z10;
                            str4 = str52;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 1024) != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str2 = str;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 1024) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 1024) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
