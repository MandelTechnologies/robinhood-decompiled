package com.robinhood.android.charts.span;

import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.C10974R;
import com.robinhood.android.charts.span.SpanSelector3;
import com.robinhood.android.charts.span.SpanSelector5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SpanSelector.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aR\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020#*\u00020\u0018H\u0003¢\u0006\u0004\b$\u0010%\u001ao\u0010/\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0)2\u0006\u0010+\u001a\u00020'2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b/\u00100\"\u0017\u00104\u001a\u0004\u0018\u000101*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0014\u00108\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"", "text", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/Modifier;", "modifier", "", "SpanButtonText-3IgeMak", "(Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpanButtonText", "Lkotlin/Function0;", "onClick", "", "isActive", "Lcom/robinhood/android/charts/span/SpanDotState;", "spanDotState", "hasCustomIntervals", "showPlaceholder", "SpanButton", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLcom/robinhood/android/charts/span/SpanDotState;ZZLandroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/charts/span/TrailingButtonData;", WebsocketGatewayConstants.DATA_KEY, "ChartSpanTrailingButton", "(Lcom/robinhood/android/charts/span/TrailingButtonData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/theme/style/SpanButtonStyle$Colors;", "colors", "enabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "SpanButtonContainer", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/theme/style/SpanButtonStyle$Colors;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getSpanButtonColors", "(ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SpanButtonStyle$Colors;", "Landroidx/compose/material3/ButtonColors;", "toButtonColors", "(Lcom/robinhood/compose/theme/style/SpanButtonStyle$Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "spanModifiers", "", "spans", "activeSpan", "onSpanSelected", "Landroidx/compose/ui/graphics/Brush;", "gradientMaskBrush", "DisplaySpanSelector", "(Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableMap;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "getWidth", "(Lcom/robinhood/android/charts/span/TrailingButtonData;)Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Shape;", "getSpanButtonShape", "()Landroidx/compose/ui/graphics/Shape;", "SpanButtonShape", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.span.SpanSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SpanSelector3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSpanTrailingButton$lambda$9(SpanSelector5 spanSelector5, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartSpanTrailingButton(spanSelector5, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySpanSelector$lambda$16(Modifier modifier, ImmutableMap immutableMap, List list, DisplaySpan displaySpan, Function1 function1, boolean z, Brush brush, int i, int i2, Composer composer, int i3) {
        DisplaySpanSelector(modifier, immutableMap, list, displaySpan, function1, z, brush, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanButton$lambda$5(Modifier modifier, Function0 function0, String str, boolean z, SpanDotState spanDotState, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        SpanButton(modifier, function0, str, z, spanDotState, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanButtonContainer$lambda$10(Modifier modifier, Function0 function0, SpanButtonStyle.Colors colors, boolean z, Function3 function3, int i, int i2, Composer composer, int i3) {
        SpanButtonContainer(modifier, function0, colors, z, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanButtonText_3IgeMak$lambda$0(String str, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m12147SpanButtonText3IgeMak(str, j, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: SpanButtonText-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12147SpanButtonText3IgeMak(final String text, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1471824182);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1471824182, i3, -1, "com.robinhood.android.charts.span.SpanButtonText (SpanSelector.kt:59)");
                    }
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(text, modifier5, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getSpanButton(composerStartRestartGroup, 0).getTypography().getTextStyle(), composerStartRestartGroup, (i3 & 14) | 24576 | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 8168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SpanSelector3.SpanButtonText_3IgeMak$lambda$0(text, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) != 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(text, modifier52, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getSpanButton(composerStartRestartGroup, 0).getTypography().getTextStyle(), composerStartRestartGroup, (i3 & 14) | 24576 | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 8168);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpanButton(Modifier modifier, Function0<Unit> function0, final String text, final boolean z, SpanDotState spanDotState, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Function0<Unit> function02;
        int i4;
        SpanDotState spanDotState2;
        int i5;
        boolean z4;
        int i6;
        final boolean z5;
        final View view;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Function0<Unit> function03;
        final boolean z6;
        final SpanDotState spanDotState3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(775446654);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(text) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    spanDotState2 = spanDotState;
                    i3 |= composerStartRestartGroup.changed(spanDotState2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue2;
                        }
                        final SpanDotState spanDotState4 = i4 == 0 ? null : spanDotState2;
                        final boolean z7 = i5 == 0 ? false : z4;
                        if (i6 != 0) {
                            z5 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(775446654, i3, -1, "com.robinhood.android.charts.span.SpanButton (SpanSelector.kt:78)");
                        }
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        final SpanButtonStyle.Colors spanButtonColors = getSpanButtonColors(z, composerStartRestartGroup, (i3 >> 9) & 14);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(view);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SpanSelector3.SpanButton$lambda$4$lambda$3(view, function02);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final boolean z8 = z5;
                        Function0<Unit> function04 = function02;
                        Modifier modifier5 = modifier4;
                        SpanButtonContainer(modifier5, (Function0) objRememberedValue, spanButtonColors, !z5, ComposableLambda3.rememberComposableLambda(-378548884, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.span.SpanSelectorKt.SpanButton.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 SpanButtonContainer, Composer composer2, int i9) {
                                Intrinsics.checkNotNullParameter(SpanButtonContainer, "$this$SpanButtonContainer");
                                if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-378548884, i9, -1, "com.robinhood.android.charts.span.SpanButton.<anonymous> (SpanSelector.kt:90)");
                                }
                                composer2.startReplaceGroup(1286743199);
                                SpanDotState spanDotState5 = spanDotState4;
                                if (spanDotState5 != null) {
                                    SpanDot.m12142SpanDotFNF3uiM(null, spanDotState5.getPulsing(), SpanDot.getSpanDotColor(spanButtonColors, spanDotState4, composer2, SpanButtonStyle.Colors.$stable), composer2, 0, 1);
                                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(6)), composer2, 6);
                                }
                                composer2.endReplaceGroup();
                                SpanSelector3.m12147SpanButtonText3IgeMak(text, spanButtonColors.m21961getContentColor0d7_KjU(), ModifiersKt.bentoPlaceholder(Modifier.INSTANCE, z8, SpanSelector3.getSpanButtonShape()), composer2, 0, 0);
                                if (z7) {
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_DOWN_FILL_16), StringResources_androidKt.stringResource(C10974R.string.custom_intervals, composer2, 0), spanButtonColors.m21961getContentColor0d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable, 56);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 24576 | (SpanButtonStyle.Colors.$stable << 6), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function04;
                        z5 = z8;
                        z6 = z7;
                        spanDotState3 = spanDotState4;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function03 = function02;
                        spanDotState3 = spanDotState2;
                        z6 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SpanSelector3.SpanButton$lambda$5(modifier3, function03, text, z, spanDotState3, z6, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z4 = z2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    final SpanButtonStyle.Colors spanButtonColors2 = getSpanButtonColors(z, composerStartRestartGroup, (i3 >> 9) & 14);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SpanSelector3.SpanButton$lambda$4$lambda$3(view, function02);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        final boolean z82 = z5;
                        Function0<Unit> function042 = function02;
                        Modifier modifier52 = modifier4;
                        SpanButtonContainer(modifier52, (Function0) objRememberedValue, spanButtonColors2, !z5, ComposableLambda3.rememberComposableLambda(-378548884, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.span.SpanSelectorKt.SpanButton.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 SpanButtonContainer, Composer composer2, int i9) {
                                Intrinsics.checkNotNullParameter(SpanButtonContainer, "$this$SpanButtonContainer");
                                if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-378548884, i9, -1, "com.robinhood.android.charts.span.SpanButton.<anonymous> (SpanSelector.kt:90)");
                                }
                                composer2.startReplaceGroup(1286743199);
                                SpanDotState spanDotState5 = spanDotState4;
                                if (spanDotState5 != null) {
                                    SpanDot.m12142SpanDotFNF3uiM(null, spanDotState5.getPulsing(), SpanDot.getSpanDotColor(spanButtonColors2, spanDotState4, composer2, SpanButtonStyle.Colors.$stable), composer2, 0, 1);
                                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(6)), composer2, 6);
                                }
                                composer2.endReplaceGroup();
                                SpanSelector3.m12147SpanButtonText3IgeMak(text, spanButtonColors2.m21961getContentColor0d7_KjU(), ModifiersKt.bentoPlaceholder(Modifier.INSTANCE, z82, SpanSelector3.getSpanButtonShape()), composer2, 0, 0);
                                if (z7) {
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_DOWN_FILL_16), StringResources_androidKt.stringResource(C10974R.string.custom_intervals, composer2, 0), spanButtonColors2.m21961getContentColor0d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable, 56);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 24576 | (SpanButtonStyle.Colors.$stable << 6), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function03 = function042;
                        z5 = z82;
                        z6 = z7;
                        spanDotState3 = spanDotState4;
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            spanDotState2 = spanDotState;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        spanDotState2 = spanDotState;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanButton$lambda$4$lambda$3(View view, Function0 function0) {
        view.performHapticFeedback(6);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Shape getSpanButtonShape() {
        return RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
    }

    public static final C2002Dp getWidth(SpanSelector5 spanSelector5) {
        Intrinsics.checkNotNullParameter(spanSelector5, "<this>");
        if (spanSelector5 instanceof SpanSelector5.BentoIcon) {
            return C2002Dp.m7993boximpl(((SpanSelector5.BentoIcon) spanSelector5).getIcon().mo20645getSizeD9Ej5fM());
        }
        if (spanSelector5 instanceof SpanSelector5.Drawable) {
            return C2002Dp.m7993boximpl(((SpanSelector5.Drawable) spanSelector5).m12155getSizeD9Ej5fM());
        }
        if (spanSelector5 instanceof SpanSelector5.Text) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void ChartSpanTrailingButton(final SpanSelector5 data, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifierM5174width3ABfNKs;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(440670591);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(data) : composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(440670591, i3, -1, "com.robinhood.android.charts.span.ChartSpanTrailingButton (SpanSelector.kt:144)");
            }
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            SpanButtonStyle.Colors spanButtonColors = getSpanButtonColors(false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1717314895);
            C2002Dp width = getWidth(data);
            if (width == null || (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(width.getValue() + C2002Dp.m7995constructorimpl(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getSpanButton(composerStartRestartGroup, 0).m21953getTrailingButtonHorizontalPaddingD9Ej5fM() * 2)))) == null) {
                modifierM5174width3ABfNKs = modifier;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpanSelector3.ChartSpanTrailingButton$lambda$8$lambda$7(view, onClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpanButtonContainer(modifierM5174width3ABfNKs, (Function0) objRememberedValue, spanButtonColors, false, ComposableLambda3.rememberComposableLambda(1995766637, true, new C110293(data, spanButtonColors, view, onClick), composerStartRestartGroup, 54), composerStartRestartGroup, (SpanButtonStyle.Colors.$stable << 6) | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpanSelector3.ChartSpanTrailingButton$lambda$9(data, onClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSpanTrailingButton$lambda$8$lambda$7(View view, Function0 function0) {
        view.performHapticFeedback(6);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: SpanSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.span.SpanSelectorKt$ChartSpanTrailingButton$3 */
    static final class C110293 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ SpanButtonStyle.Colors $colors;
        final /* synthetic */ SpanSelector5 $data;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ View $view;

        C110293(SpanSelector5 spanSelector5, SpanButtonStyle.Colors colors, View view, Function0<Unit> function0) {
            this.$data = spanSelector5;
            this.$colors = colors;
            this.$view = view;
            this.$onClick = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 SpanButtonContainer, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SpanButtonContainer, "$this$SpanButtonContainer");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995766637, i, -1, "com.robinhood.android.charts.span.ChartSpanTrailingButton.<anonymous> (SpanSelector.kt:161)");
            }
            SpanSelector5 spanSelector5 = this.$data;
            if (spanSelector5 instanceof SpanSelector5.BentoIcon) {
                composer.startReplaceGroup(651681345);
                BentoIcon2.m20644BentoIconFU0evQE(((SpanSelector5.BentoIcon) this.$data).getIcon(), ((SpanSelector5.BentoIcon) this.$data).getContentDescription(), this.$colors.m21961getContentColor0d7_KjU(), null, null, false, composer, BentoIcon4.$stable, 56);
                composer.endReplaceGroup();
            } else if (spanSelector5 instanceof SpanSelector5.Drawable) {
                composer.startReplaceGroup(651959694);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(((SpanSelector5.Drawable) this.$data).getResourceId(), composer, 0);
                String contentDescription = ((SpanSelector5.Drawable) this.$data).getContentDescription();
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, ((SpanSelector5.Drawable) this.$data).m12155getSizeD9Ej5fM());
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composer.endReplaceGroup();
                IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, ((SpanSelector5.Drawable) this.$data).m12155getSizeD9Ej5fM(), 0L, 4, null);
                Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c());
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$view) | composer.changed(this.$onClick);
                final View view = this.$view;
                final Function0<Unit> function0 = this.$onClick;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$ChartSpanTrailingButton$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SpanSelector3.C110293.invoke$lambda$2$lambda$1(view, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                ImageKt.Image(painterPainterResource, contentDescription, ClickableKt.m4891clickableO2vRcR0$default(modifierM5169size3ABfNKs, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, roleM7472boximpl, (Function0) objRememberedValue2, 12, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 0, 120);
                composer.endReplaceGroup();
            } else {
                if (!(spanSelector5 instanceof SpanSelector5.Text)) {
                    composer.startReplaceGroup(-1918641436);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(652845116);
                SpanSelector3.m12147SpanButtonText3IgeMak(((SpanSelector5.Text) this.$data).getValue(), this.$colors.m21961getContentColor0d7_KjU(), null, composer, 0, 4);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(View view, Function0 function0) {
            view.performHapticFeedback(6);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpanButtonContainer(Modifier modifier, final Function0<Unit> onClick, final SpanButtonStyle.Colors colors, boolean z, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1184381412);
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
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(colors) : composerStartRestartGroup.changedInstance(colors) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1184381412, i3, -1, "com.robinhood.android.charts.span.SpanButtonContainer (SpanSelector.kt:208)");
                }
                int i6 = i3 >> 3;
                ButtonKt.Button(onClick, SizeKt.m5154defaultMinSizeVpY3zN4(modifier4, ButtonDefaults.INSTANCE.m5723getMinWidthD9Ej5fM(), C2002Dp.m7995constructorimpl(30)), z4, getSpanButtonShape(), toButtonColors(colors, composerStartRestartGroup, SpanButtonStyle.Colors.$stable | ((i3 >> 6) & 14)), null, null, PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), null, content, composerStartRestartGroup, (i6 & 896) | (i6 & 14) | 12779520 | ((i3 << 15) & 1879048192), EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z4;
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SpanSelector3.SpanButtonContainer$lambda$10(modifier3, onClick, colors, z3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = i3 >> 3;
            ButtonKt.Button(onClick, SizeKt.m5154defaultMinSizeVpY3zN4(modifier4, ButtonDefaults.INSTANCE.m5723getMinWidthD9Ej5fM(), C2002Dp.m7995constructorimpl(30)), z4, getSpanButtonShape(), toButtonColors(colors, composerStartRestartGroup, SpanButtonStyle.Colors.$stable | ((i3 >> 6) & 14)), null, null, PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), null, content, composerStartRestartGroup, (i62 & 896) | (i62 & 14) | 12779520 | ((i3 << 15) & 1879048192), EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final SpanButtonStyle.Colors getSpanButtonColors(boolean z, Composer composer, int i) {
        SpanButtonStyle.Colors inactiveColors;
        composer.startReplaceGroup(343992584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(343992584, i, -1, "com.robinhood.android.charts.span.getSpanButtonColors (SpanSelector.kt:226)");
        }
        SpanButtonStyle spanButton = ((Styles) composer.consume(Styles2.getLocalStyles())).getSpanButton(composer, 0);
        if (z) {
            inactiveColors = spanButton.getActiveColors();
        } else {
            inactiveColors = spanButton.getInactiveColors();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return inactiveColors;
    }

    private static final ButtonColors toButtonColors(SpanButtonStyle.Colors colors, Composer composer, int i) {
        composer.startReplaceGroup(-1125272035);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1125272035, i, -1, "com.robinhood.android.charts.span.toButtonColors (SpanSelector.kt:236)");
        }
        ButtonColors buttonColorsM5719buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(colors.m21960getBackgroundColor0d7_KjU(), colors.m21961getContentColor0d7_KjU(), colors.m21962getDisabledBackgroundColor0d7_KjU(), colors.m21963getDisabledContentColor0d7_KjU(), composer, ButtonDefaults.$stable << 12, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return buttonColorsM5719buttonColorsro_MJ88;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisplaySpanSelector(Modifier modifier, ImmutableMap<DisplaySpan, ? extends Modifier> immutableMap, final List<? extends DisplaySpan> spans, final DisplaySpan activeSpan, final Function1<? super DisplaySpan, Unit> onSpanSelected, boolean z, Brush brush, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        ImmutableMap<DisplaySpan, ? extends Modifier> immutableMap2;
        int i4;
        boolean z2;
        int i5;
        Brush brush2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator it;
        Composer composer2;
        final ImmutableMap<DisplaySpan, ? extends Modifier> immutableMap3;
        final Brush brush3;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(activeSpan, "activeSpan");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-572226083);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                immutableMap2 = immutableMap;
                i3 |= composerStartRestartGroup.changed(immutableMap2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(spans) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(activeSpan.ordinal()) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        brush2 = brush;
                        i3 |= composerStartRestartGroup.changed(brush2) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        immutableMap3 = immutableMap2;
                        z3 = z2;
                        brush3 = brush2;
                    } else {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        ImmutableMap<DisplaySpan, ? extends Modifier> immutableMapPersistentMapOf = i7 == 0 ? extensions2.persistentMapOf() : immutableMap2;
                        boolean z4 = i4 == 0 ? false : z2;
                        Brush brush4 = i5 == 0 ? null : brush2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-572226083, i3, -1, "com.robinhood.android.charts.span.DisplaySpanSelector (SpanSelector.kt:288)");
                        }
                        Modifier modifierDrawMask = com.robinhood.android.charts.ModifiersKt.drawMask(modifier2, brush4);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(SpanSelector2.INSTANCE.m12141getBetweenSpanSpaceD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawMask);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1514472207);
                        it = spans.iterator();
                        while (it.hasNext()) {
                            final DisplaySpan displaySpan = (DisplaySpan) it.next();
                            boolean z5 = displaySpan == activeSpan;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChanged = ((57344 & i3) == 16384) | composerStartRestartGroup.changed(displaySpan.ordinal());
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SpanSelector3.DisplaySpanSelector$lambda$15$lambda$14$lambda$12$lambda$11(onSpanSelected, displaySpan);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Iterator it2 = it;
                            Modifier modifierBentoPlaceholder = ModifiersKt.bentoPlaceholder(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), z5 && z4, getSpanButtonShape());
                            if (immutableMapPersistentMapOf.containsKey(displaySpan)) {
                                modifierBentoPlaceholder = modifierBentoPlaceholder.then(immutableMapPersistentMapOf.getOrDefault(displaySpan, companion2));
                            }
                            Composer composer3 = composerStartRestartGroup;
                            SpanButton(com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(modifierBentoPlaceholder, ChartDisplaySpanExtensions.getEducationTourId(displaySpan), function0, null, false, false, 28, null), function0, StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(displaySpan), composerStartRestartGroup, 0), z5, null, false, !z5 && z4, composer3, 0, 48);
                            it = it2;
                            brush4 = brush4;
                            composerStartRestartGroup = composer3;
                        }
                        composer2 = composerStartRestartGroup;
                        Brush brush5 = brush4;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        immutableMap3 = immutableMapPersistentMapOf;
                        brush3 = brush5;
                        modifier3 = modifier2;
                        z3 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanSelectorKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SpanSelector3.DisplaySpanSelector$lambda$16(modifier3, immutableMap3, spans, activeSpan, onSpanSelected, z3, brush3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                brush2 = brush;
                if ((i3 & 599187) != 599186) {
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierDrawMask2 = com.robinhood.android.charts.ModifiersKt.drawMask(modifier2, brush4);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(SpanSelector2.INSTANCE.m12141getBetweenSpanSpaceD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawMask2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1514472207);
                        it = spans.iterator();
                        while (it.hasNext()) {
                        }
                        composer2 = composerStartRestartGroup;
                        Brush brush52 = brush4;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        immutableMap3 = immutableMapPersistentMapOf;
                        brush3 = brush52;
                        modifier3 = modifier2;
                        z3 = z4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            brush2 = brush;
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        immutableMap2 = immutableMap;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        brush2 = brush;
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySpanSelector$lambda$15$lambda$14$lambda$12$lambda$11(Function1 function1, DisplaySpan displaySpan) {
        function1.invoke(displaySpan);
        return Unit.INSTANCE;
    }
}
