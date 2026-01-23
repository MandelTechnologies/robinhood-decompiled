package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

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
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.BorderDto;
import rh_server_driven_ui.p531v1.CardDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiElevatedCardIdl.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"SduiElevatedCard", "", "ActionT", "component", "Lrh_server_driven_ui/v1/CardDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/CardDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiElevatedCardIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiElevatedCard$lambda$0(CardDto cardDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiElevatedCard(cardDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiElevatedCard(final CardDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM6705copywmQWz5c$default;
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-344889867);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-344889867, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCard (SduiElevatedCardIdl.kt:21)");
                }
                ThemedColorDto background_color = component.getBackground_color();
                composerStartRestartGroup.startReplaceGroup(-726669787);
                Color composeColor = background_color != null ? null : SduiColors2.toComposeColor(background_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-726667921);
                if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                    boolean z = composeColor == null ? false : Color.m6707equalsimpl0(composeColor.getValue(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU());
                    composerStartRestartGroup.endReplaceGroup();
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(-1051772721);
                        long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                        Float background_color_opacity = component.getBackground_color_opacity();
                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(jM21372getBg20d7_KjU, background_color_opacity != null ? background_color_opacity.floatValue() : 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1051671909);
                        long jM21371getBg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                        Float background_color_opacity2 = component.getBackground_color_opacity();
                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(jM21371getBg0d7_KjU, background_color_opacity2 != null ? background_color_opacity2.floatValue() : 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    float fM7995constructorimpl = ((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0) ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(0);
                    CardDto.OutlineDto outline = component.getOutline();
                    BorderDto border = outline != null ? outline.getBorder() : null;
                    Double width = border != null ? border.getWidth() : null;
                    composerStartRestartGroup.startReplaceGroup(-726642747);
                    if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0) || width == null) {
                        borderStrokeM4886BorderStrokecXLIe8U = null;
                    } else {
                        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl((float) width.doubleValue());
                        ThemedColorDto color = border.getColor();
                        composerStartRestartGroup.startReplaceGroup(-726637979);
                        Color composeColor2 = color == null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl2, composeColor2 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU() : composeColor2.getValue());
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(component.getCorner_radius() != null ? r6.intValue() : 0));
                    Modifier modifier5 = modifier4;
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    int i5 = CardDefaults.$stable;
                    composer2 = composerStartRestartGroup;
                    CardKt.Card(modifierM5144paddingVpY3zN4$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(jM6705copywmQWz5c$default, 0L, 0L, 0L, composerStartRestartGroup, i5 << 12, 14), cardDefaults.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i5 << 18, 62), borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(1802660931, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardIdlKt.SduiElevatedCard.1
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
                                ComposerKt.traceEventStart(1802660931, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCard.<anonymous> (SduiElevatedCardIdl.kt:74)");
                            }
                            UIComponentDto content = component.getContent();
                            if (content != null) {
                                SduiComponentIdl.SduiComponent(content, parseAction, (Modifier) null, (HorizontalPadding) null, composer3, 0, 12);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiElevatedCardIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiElevatedCardIdl.SduiElevatedCard$lambda$0(component, parseAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            ThemedColorDto background_color2 = component.getBackground_color();
            composerStartRestartGroup.startReplaceGroup(-726669787);
            if (background_color2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-726667921);
            if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
