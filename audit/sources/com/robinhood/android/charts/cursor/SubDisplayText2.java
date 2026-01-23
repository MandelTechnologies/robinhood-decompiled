package com.robinhood.android.charts.cursor;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SubDisplayText.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\tH\u0002\u001a\u001f\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"SubDisplayText", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Landroidx/compose/runtime/Composer;II)V", "toBentoIcons", "Lcom/robinhood/compose/bento/component/BentoIcons;", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "TintedIconText", "Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;Landroidx/compose/runtime/Composer;II)V", "TintedRegularText", "Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "shouldCenterText", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;ZLandroidx/compose/runtime/Composer;II)V", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.cursor.SubDisplayTextKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SubDisplayText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubDisplayText$lambda$3(Modifier modifier, CursorData.SubDisplayText subDisplayText, int i, int i2, Composer composer, int i3) {
        SubDisplayText(modifier, subDisplayText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TintedIconText$lambda$7(Modifier modifier, CursorData.IconDisplayText iconDisplayText, int i, int i2, Composer composer, int i3) {
        TintedIconText(modifier, iconDisplayText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TintedRegularText$lambda$8(Modifier modifier, CursorData.DisplayText displayText, boolean z, int i, int i2, Composer composer, int i3) {
        TintedRegularText(modifier, displayText, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SubDisplayText(final Modifier modifier, final CursorData.SubDisplayText state, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(991866919);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(991866919, i3, -1, "com.robinhood.android.charts.cursor.SubDisplayText (SubDisplayText.kt:24)");
            }
            Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(modifier, C2002Dp.m7995constructorimpl(24), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(4)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5158heightInVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1185680218);
            if (state.getMain().getValue().length() > 0 || state.getMain().getIcon() != null) {
                TintedIconText(null, state.getMain(), composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            CursorData.DisplayText description = state.getDescription();
            composerStartRestartGroup.startReplaceGroup(1185685907);
            if (description != null) {
                TintedRegularText(null, description, false, composerStartRestartGroup, 0, 5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Icon trailingIcon = state.getTrailingIcon();
            BentoIcon4 bentoIcons = trailingIcon != null ? toBentoIcons(trailingIcon) : null;
            composerStartRestartGroup.startReplaceGroup(1185690981);
            if (bentoIcons != null) {
                BentoIcon2.m20644BentoIconFU0evQE(bentoIcons, null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.SubDisplayTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SubDisplayText2.SubDisplayText$lambda$3(modifier, state, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final BentoIcon4 toBentoIcons(Icon icon) {
        Object next;
        Function1 function1;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon.getServerValue());
        if (serverToBentoAssetMapper2FromServerValue == null) {
            return null;
        }
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("12", SubDisplayText3.INSTANCE), Tuples4.m3642to("16", SubDisplayText4.INSTANCE), Tuples4.m3642to("24", SubDisplayText5.INSTANCE), Tuples4.m3642to("32", SubDisplayText6.INSTANCE), Tuples4.m3642to("40", SubDisplayText7.INSTANCE));
        Iterator it = mapMapOf.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.endsWith$default(icon.getServerValue(), (String) next, false, 2, (Object) null)) {
                break;
            }
        }
        String str = (String) next;
        if (str == null || (function1 = (Function1) mapMapOf.get(str)) == null) {
            return null;
        }
        return (BentoIcon4) function1.invoke(serverToBentoAssetMapper2FromServerValue);
    }

    public static final void TintedIconText(Modifier modifier, final CursorData.IconDisplayText state, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(626776009);
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
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626776009, i3, -1, "com.robinhood.android.charts.cursor.TintedIconText (SubDisplayText.kt:68)");
            }
            Modifier modifierDrawMask = ModifiersKt.drawMask(modifier4, state.getGradientColorBrush());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(2)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawMask);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Icon icon = state.getIcon();
            BentoIcon4 bentoIcons = icon != null ? toBentoIcons(icon) : null;
            composerStartRestartGroup.startReplaceGroup(-194696353);
            if (bentoIcons != null) {
                BentoIcon2.m20644BentoIconFU0evQE(bentoIcons, null, StaleState2.m12177orStaleek8zF_U(state.m12002getColor0d7_KjU(), composerStartRestartGroup, 0), null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
            }
            composerStartRestartGroup.endReplaceGroup();
            String value = state.getValue();
            Color colorM6701boximpl = Color.m6701boximpl(StaleState2.m12177orStaleek8zF_U(state.m12002getColor0d7_KjU(), composerStartRestartGroup, 0));
            TextStyle style = state.getStyle();
            composerStartRestartGroup.startReplaceGroup(-194687078);
            if (style == null) {
                style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
            }
            TextStyle textStyle = style;
            composerStartRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(value, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, textStyle, composerStartRestartGroup, 0, 0, 8186);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.SubDisplayTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SubDisplayText2.TintedIconText$lambda$7(modifier3, state, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TintedRegularText(Modifier modifier, final CursorData.DisplayText state, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        TextStyle style;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1141233771);
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
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1141233771, i3, -1, "com.robinhood.android.charts.cursor.TintedRegularText (SubDisplayText.kt:96)");
                }
                String value = state.getValue();
                long jM12177orStaleek8zF_U = StaleState2.m12177orStaleek8zF_U(state.m11998getColor0d7_KjU(), composerStartRestartGroup, 0);
                style = state.getStyle();
                composerStartRestartGroup.startReplaceGroup(1509002296);
                if (style == null) {
                    style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                }
                TextStyle textStyle = style;
                composerStartRestartGroup.endReplaceGroup();
                int i6 = (i3 << 3) & 112;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(value, modifier5, Color.m6701boximpl(jM12177orStaleek8zF_U), null, null, null, !z4 ? TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()) : null, 0, false, 0, 0, null, 0, textStyle, composer2, i6, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                z3 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.SubDisplayTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SubDisplayText2.TintedRegularText$lambda$8(modifier3, state, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String value2 = state.getValue();
            long jM12177orStaleek8zF_U2 = StaleState2.m12177orStaleek8zF_U(state.m11998getColor0d7_KjU(), composerStartRestartGroup, 0);
            style = state.getStyle();
            composerStartRestartGroup.startReplaceGroup(1509002296);
            if (style == null) {
            }
            TextStyle textStyle2 = style;
            composerStartRestartGroup.endReplaceGroup();
            int i62 = (i3 << 3) & 112;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            BentoText2.m20747BentoText38GnDrw(value2, modifier52, Color.m6701boximpl(jM12177orStaleek8zF_U2), null, null, null, !z4 ? TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()) : null, 0, false, 0, 0, null, 0, textStyle2, composer2, i62, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            z3 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
