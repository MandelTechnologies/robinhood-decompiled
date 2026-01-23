package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.Border;
import com.robinhood.models.serverdriven.experimental.api.ElevatedCard;
import com.robinhood.models.serverdriven.experimental.api.Outline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiElevatedCard.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiElevatedCard", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/ElevatedCard;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ElevatedCard;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiElevatedCard2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiElevatedCard$lambda$1(ElevatedCard elevatedCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiElevatedCard(elevatedCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiElevatedCard(final ElevatedCard<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        long jM6705copywmQWz5c$default;
        float fM7995constructorimpl;
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(724535348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
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
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(724535348, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCard (SduiElevatedCard.kt:20)");
                }
                composerStartRestartGroup.startReplaceGroup(493776897);
                if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                    Color composeColor = SduiColors2.toComposeColor(component.getBackground_color(), composerStartRestartGroup, 0);
                    boolean z = composeColor == null ? false : Color.m6707equalsimpl0(composeColor.getValue(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU());
                    composerStartRestartGroup.endReplaceGroup();
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(-1872671016);
                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), component.getBackground_color_opacity(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1872577551);
                        Color composeColor2 = SduiColors2.toComposeColor(component.getBackground_color(), composerStartRestartGroup, 0);
                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(composeColor2 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor2.getValue(), component.getBackground_color_opacity(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(component.getOutline() != null ? r3.getElevation() : 0);
                    } else {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    }
                    composerStartRestartGroup.startReplaceGroup(493796355);
                    if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                        borderStrokeM4886BorderStrokecXLIe8U = null;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier3, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null);
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(component.getCorner_radius()));
                        CardDefaults cardDefaults = CardDefaults.INSTANCE;
                        int i5 = CardDefaults.$stable;
                        Modifier modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        CardKt.Card(modifierM5144paddingVpY3zN4$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(jM6705copywmQWz5c$default, 0L, 0L, 0L, composerStartRestartGroup, i5 << 12, 14), cardDefaults.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i5 << 18, 62), borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(1657453698, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardKt.SduiElevatedCard.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                invoke(column5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 Card, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1657453698, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCard.<anonymous> (SduiElevatedCard.kt:70)");
                                }
                                SduiComponent3.SduiComponent(component.getContent(), null, null, composer3, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 196608, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        Outline outline = component.getOutline();
                        if ((outline != null ? outline.getBorder() : null) != null) {
                            Outline outline2 = component.getOutline();
                            Border border = outline2 != null ? outline2.getBorder() : null;
                            if (border != null) {
                                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(border.getWidth().getMobile());
                                Color composeColor3 = SduiColors2.toComposeColor(border.getColor(), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceGroup(493803242);
                                long jM21373getBg30d7_KjU = composeColor3 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU() : composeColor3.getValue();
                                composerStartRestartGroup.endReplaceGroup();
                                borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl2, jM21373getBg30d7_KjU);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier3, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null);
                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(component.getCorner_radius()));
                            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                            int i52 = CardDefaults.$stable;
                            Modifier modifier42 = modifier3;
                            composer2 = composerStartRestartGroup;
                            CardKt.Card(modifierM5144paddingVpY3zN4$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, cardDefaults2.m5729cardColorsro_MJ88(jM6705copywmQWz5c$default, 0L, 0L, 0L, composerStartRestartGroup, i52 << 12, 14), cardDefaults2.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i52 << 18, 62), borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(1657453698, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardKt.SduiElevatedCard.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 Card, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1657453698, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCard.<anonymous> (SduiElevatedCard.kt:70)");
                                    }
                                    SduiComponent3.SduiComponent(component.getContent(), null, null, composer3, 0, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 196608, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiElevatedCard2.SduiElevatedCard$lambda$1(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(493776897);
            if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
