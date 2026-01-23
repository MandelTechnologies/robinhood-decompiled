package com.robinhood.android.p148fx.tooltip;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: TooltipPopup.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a£\u0001\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u008f\u0001\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%\" \u0010'\u001a\u00020&8\u0000X\u0081D¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006-²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/TooltipPopupPosition;", "position", "", "isMinified", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Landroidx/compose/ui/unit/Dp;", "backgroundMinHeight", "backgroundCornerSize", "arrowWidth", "arrowHeight", "arrowPadding", "horizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function0;", "", "onClick", "onDismissRequest", "content", "TooltipPopup-2iulXZU", "(Lcom/robinhood/android/fx/tooltip/TooltipPopupPosition;ZJFFFFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TooltipPopup", "Lcom/robinhood/android/fx/tooltip/TooltipAlignment;", "alignment", "", "arrowPositionX", "Landroidx/compose/ui/Modifier;", "modifier", "TooltipBubble-xKDTGhA", "(Lcom/robinhood/android/fx/tooltip/TooltipAlignment;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZJFFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TooltipBubble", "Landroid/view/View;", "view", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "calculateTooltipPopupPosition", "(Landroid/view/View;Landroidx/compose/ui/layout/LayoutCoordinates;)Lcom/robinhood/android/fx/tooltip/TooltipPopupPosition;", "", "fxTooltipBubbleTestTag", "Ljava/lang/String;", "getFxTooltipBubbleTestTag", "()Ljava/lang/String;", "getFxTooltipBubbleTestTag$annotations", "()V", "lib-fx-tooltip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.fx.tooltip.TooltipPopupKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class TooltipPopup4 {
    private static final String fxTooltipBubbleTestTag = "fxTooltipBubble";

    /* compiled from: TooltipPopup.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.fx.tooltip.TooltipPopupKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TooltipPopup2.values().length];
            try {
                iArr[TooltipPopup2.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipPopup2.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBubble_xKDTGhA$lambda$17(TooltipPopup2 tooltipPopup2, float f, Modifier modifier, Function0 function0, boolean z, long j, float f2, float f3, float f4, float f5, PaddingValues paddingValues, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m14947TooltipBubblexKDTGhA(tooltipPopup2, f, modifier, function0, z, j, f2, f3, f4, f5, paddingValues, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipPopup_2iulXZU$lambda$7(TooltipPopupPosition tooltipPopupPosition, boolean z, long j, float f, float f2, float f3, float f4, float f5, float f6, PaddingValues paddingValues, Function0 function0, Function0 function02, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m14948TooltipPopup2iulXZU(tooltipPopupPosition, z, j, f, f2, f3, f4, f5, f6, paddingValues, function0, function02, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getFxTooltipBubbleTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /* renamed from: TooltipPopup-2iulXZU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14948TooltipPopup2iulXZU(final TooltipPopupPosition position, boolean z, long j, float f, float f2, float f3, float f4, float f5, float f6, PaddingValues paddingValues, Function0<Unit> function0, Function0<Unit> function02, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z2;
        long j2;
        int i5;
        float f7;
        int i6;
        float f8;
        int i7;
        float fM7995constructorimpl;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long jM21372getBg20d7_KjU;
        float value;
        boolean z3;
        PaddingValues paddingValuesM5136PaddingValuesYgX7TsA;
        Function0<Unit> function03;
        int i18;
        PaddingValues paddingValues2;
        float f9;
        final float f10;
        final float f11;
        Function0<Unit> function04;
        final float f12;
        long j3;
        final float f13;
        float fMo5016toPx0680j_4;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotFloatState2 snapshotFloatState2;
        int i19;
        Alignment topCenter;
        long jM8035copyiSbpLlY$default;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Function0<Unit> function05;
        final boolean z4;
        final long j4;
        final float f14;
        final float f15;
        final float f16;
        final float f17;
        final Function0<Unit> function06;
        final float f18;
        final float f19;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1952424166);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(position) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                j2 = j;
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    f7 = f;
                    i4 |= composerStartRestartGroup.changed(f7) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        f8 = f2;
                        i4 |= composerStartRestartGroup.changed(f8) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        fM7995constructorimpl = f3;
                    } else {
                        fM7995constructorimpl = f3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(f5) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(f6)) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
                        }
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                            i16 = i15;
                        } else if ((i2 & 48) == 0) {
                            i16 = i15;
                            i14 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
                        } else {
                            i16 = i15;
                        }
                        i17 = i14;
                        if ((i3 & 4096) != 0) {
                            i17 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i17 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
                        }
                        if ((306783379 & i4) == 306783378 && (i17 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            f17 = f4;
                            composer2 = composerStartRestartGroup;
                            f16 = fM7995constructorimpl;
                            j4 = j2;
                            z4 = z2;
                            f14 = f7;
                            f15 = f8;
                            f18 = f5;
                            f19 = f6;
                            paddingValues3 = paddingValues;
                            function05 = function0;
                            function06 = function02;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                boolean z5 = i20 == 0 ? false : z2;
                                if ((i3 & 4) == 0) {
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i21 = BentoTheme.$stable;
                                    if (bentoTheme.getColors(composerStartRestartGroup, i21).getIsDay()) {
                                        composerStartRestartGroup.startReplaceGroup(621090716);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i21).m21425getFg0d7_KjU();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(621091549);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i21).m21372getBg20d7_KjU();
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    i4 &= -897;
                                } else {
                                    jM21372getBg20d7_KjU = j2;
                                }
                                float fM7995constructorimpl2 = i5 == 0 ? C2002Dp.m7995constructorimpl(50) : f7;
                                float fM7995constructorimpl3 = i6 == 0 ? C2002Dp.m7995constructorimpl(8) : f8;
                                if (i7 != 0) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(12);
                                }
                                float fM7995constructorimpl4 = i8 == 0 ? C2002Dp.m7995constructorimpl(8) : f4;
                                float fM7995constructorimpl5 = i9 == 0 ? C2002Dp.m7995constructorimpl(4) : f5;
                                if ((i3 & 256) == 0) {
                                    value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                                    i4 &= -234881025;
                                } else {
                                    value = f6;
                                }
                                if (i11 == 0) {
                                    z3 = z5;
                                    paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(8));
                                } else {
                                    z3 = z5;
                                    paddingValuesM5136PaddingValuesYgX7TsA = paddingValues;
                                }
                                Function0<Unit> function07 = i13 == 0 ? null : function0;
                                function03 = i16 == 0 ? null : function02;
                                i18 = i4;
                                Function0<Unit> function08 = function07;
                                z2 = z3;
                                float f20 = fM7995constructorimpl3;
                                paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                                f9 = fM7995constructorimpl5;
                                f10 = fM7995constructorimpl2;
                                f11 = fM7995constructorimpl4;
                                function04 = function08;
                                f12 = fM7995constructorimpl;
                                j3 = jM21372getBg20d7_KjU;
                                f13 = f20;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                f9 = f5;
                                value = f6;
                                function03 = function02;
                                i18 = i4;
                                f10 = f7;
                                f13 = f8;
                                paddingValues2 = paddingValues;
                                function04 = function0;
                                long j5 = j2;
                                f11 = f4;
                                f12 = fM7995constructorimpl;
                                j3 = j5;
                            }
                            composerStartRestartGroup.endDefaults();
                            final long j6 = j3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1952424166, i18, i17, "com.robinhood.android.fx.tooltip.TooltipPopup (TooltipPopup.kt:61)");
                            }
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            companion2.getTopCenter();
                            long jM14952getOffsetnOccac = position.m14952getOffsetnOccac();
                            int i22 = i17;
                            fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(value);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(position.getCenterPositionX());
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            int iRoundToInt = MathKt.roundToInt(density.mo5016toPx0680j_4(f9));
                            int iRoundToInt2 = MathKt.roundToInt(density.mo5016toPx0680j_4(f11));
                            float f21 = f9;
                            i19 = WhenMappings.$EnumSwitchMapping$0[position.getAlignment().ordinal()];
                            if (i19 != 1) {
                                topCenter = companion2.getTopCenter();
                                jM8035copyiSbpLlY$default = IntOffset.m8035copyiSbpLlY$default(jM14952getOffsetnOccac, 0, IntOffset.m8039getYimpl(position.m14952getOffsetnOccac()) + iRoundToInt + iRoundToInt2, 1, null);
                            } else {
                                if (i19 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                topCenter = companion2.getBottomCenter();
                                jM8035copyiSbpLlY$default = IntOffset.m8035copyiSbpLlY$default(jM14952getOffsetnOccac, 0, (IntOffset.m8039getYimpl(position.m14952getOffsetnOccac()) - iRoundToInt) - iRoundToInt2, 1, null);
                            }
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(topCenter) | composerStartRestartGroup.changed(jM8035copyiSbpLlY$default);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new TooltipPopup3(topCenter, jM8035copyiSbpLlY$default, position.getCenterPositionX(), fMo5016toPx0680j_4, new Function1() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TooltipPopup4.TooltipPopup_2iulXZU$lambda$6$lambda$5(snapshotFloatState2, ((Float) obj).floatValue());
                                    }
                                }, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            final boolean z6 = z2;
                            paddingValues3 = paddingValues2;
                            final float f22 = value;
                            final Function0<Unit> function09 = function04;
                            AndroidPopup_androidKt.Popup((TooltipPopup3) objRememberedValue2, function03, new PopupProperties(false, false, false, false, 13, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(-1652236868, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$TooltipPopup$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i23) {
                                    if ((i23 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1652236868, i23, -1, "com.robinhood.android.fx.tooltip.TooltipPopup.<anonymous> (TooltipPopup.kt:104)");
                                    }
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(Modifier.INSTANCE, TooltipPopup4.getFxTooltipBubbleTestTag()), f22, 0.0f, 2, null);
                                    TooltipPopup2 alignment = position.getAlignment();
                                    float floatValue = snapshotFloatState2.getFloatValue();
                                    Function0<Unit> function010 = function09;
                                    boolean z7 = z6;
                                    long j7 = j6;
                                    float f23 = f10;
                                    float f24 = f13;
                                    float f25 = f12;
                                    float f26 = f11;
                                    PaddingValues paddingValues4 = paddingValues3;
                                    final Function2<Composer, Integer, Unit> function2 = content;
                                    TooltipPopup4.m14947TooltipBubblexKDTGhA(alignment, floatValue, modifierM5144paddingVpY3zN4$default, function010, z7, j7, f23, f24, f25, f26, paddingValues4, ComposableLambda3.rememberComposableLambda(-1306396760, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$TooltipPopup$2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i24) {
                                            if ((i24 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1306396760, i24, -1, "com.robinhood.android.fx.tooltip.TooltipPopup.<anonymous>.<anonymous> (TooltipPopup.kt:119)");
                                            }
                                            function2.invoke(composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 0, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, (i22 & 112) | 3456, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function05 = function09;
                            z4 = z6;
                            j4 = j6;
                            f14 = f10;
                            f15 = f13;
                            f16 = f12;
                            f17 = f11;
                            function06 = function03;
                            f18 = f21;
                            f19 = f22;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TooltipPopup4.TooltipPopup_2iulXZU$lambda$7(position, z4, j4, f14, f15, f16, f17, f18, f19, paddingValues3, function05, function06, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    i17 = i14;
                    if ((i3 & 4096) != 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i20 == 0) {
                            }
                            if ((i3 & 4) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            i18 = i4;
                            Function0<Unit> function082 = function07;
                            z2 = z3;
                            float f202 = fM7995constructorimpl3;
                            paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                            f9 = fM7995constructorimpl5;
                            f10 = fM7995constructorimpl2;
                            f11 = fM7995constructorimpl4;
                            function04 = function082;
                            f12 = fM7995constructorimpl;
                            j3 = jM21372getBg20d7_KjU;
                            f13 = f202;
                            composerStartRestartGroup.endDefaults();
                            final long j62 = j3;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            companion22.getTopCenter();
                            long jM14952getOffsetnOccac2 = position.m14952getOffsetnOccac();
                            int i222 = i17;
                            fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(value);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            int iRoundToInt3 = MathKt.roundToInt(density2.mo5016toPx0680j_4(f9));
                            int iRoundToInt22 = MathKt.roundToInt(density2.mo5016toPx0680j_4(f11));
                            float f212 = f9;
                            i19 = WhenMappings.$EnumSwitchMapping$0[position.getAlignment().ordinal()];
                            if (i19 != 1) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(topCenter) | composerStartRestartGroup.changed(jM8035copyiSbpLlY$default);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = new TooltipPopup3(topCenter, jM8035copyiSbpLlY$default, position.getCenterPositionX(), fMo5016toPx0680j_4, new Function1() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TooltipPopup4.TooltipPopup_2iulXZU$lambda$6$lambda$5(snapshotFloatState2, ((Float) obj).floatValue());
                                    }
                                }, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                final boolean z62 = z2;
                                paddingValues3 = paddingValues2;
                                final float f222 = value;
                                final Function0<Unit> function092 = function04;
                                AndroidPopup_androidKt.Popup((TooltipPopup3) objRememberedValue2, function03, new PopupProperties(false, false, false, false, 13, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(-1652236868, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$TooltipPopup$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i23) {
                                        if ((i23 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1652236868, i23, -1, "com.robinhood.android.fx.tooltip.TooltipPopup.<anonymous> (TooltipPopup.kt:104)");
                                        }
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(Modifier.INSTANCE, TooltipPopup4.getFxTooltipBubbleTestTag()), f222, 0.0f, 2, null);
                                        TooltipPopup2 alignment = position.getAlignment();
                                        float floatValue = snapshotFloatState2.getFloatValue();
                                        Function0<Unit> function010 = function092;
                                        boolean z7 = z62;
                                        long j7 = j62;
                                        float f23 = f10;
                                        float f24 = f13;
                                        float f25 = f12;
                                        float f26 = f11;
                                        PaddingValues paddingValues4 = paddingValues3;
                                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                                        TooltipPopup4.m14947TooltipBubblexKDTGhA(alignment, floatValue, modifierM5144paddingVpY3zN4$default, function010, z7, j7, f23, f24, f25, f26, paddingValues4, ComposableLambda3.rememberComposableLambda(-1306396760, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$TooltipPopup$2.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i24) {
                                                if ((i24 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1306396760, i24, -1, "com.robinhood.android.fx.tooltip.TooltipPopup.<anonymous>.<anonymous> (TooltipPopup.kt:119)");
                                                }
                                                function2.invoke(composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 0, 48, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, (i222 & 112) | 3456, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function05 = function092;
                                z4 = z62;
                                j4 = j62;
                                f14 = f10;
                                f15 = f13;
                                f16 = f12;
                                f17 = f11;
                                function06 = function03;
                                f18 = f212;
                                f19 = f222;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f8 = f2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                i17 = i14;
                if ((i3 & 4096) != 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f7 = f;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            f8 = f2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            i17 = i14;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f7 = f;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        f8 = f2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        i17 = i14;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipPopup_2iulXZU$lambda$6$lambda$5(SnapshotFloatState2 snapshotFloatState2, float f) {
        snapshotFloatState2.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* renamed from: TooltipBubble-xKDTGhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14947TooltipBubblexKDTGhA(final TooltipPopup2 alignment, final float f, Modifier modifier, Function0<Unit> function0, boolean z, long j, float f2, float f3, float f4, float f5, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        Function0<Unit> function02;
        int i7;
        final boolean z2;
        final long jM21372getBg20d7_KjU;
        float fM7995constructorimpl;
        int i8;
        float fM7995constructorimpl2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float fM7995constructorimpl3;
        float fM7995constructorimpl4;
        Modifier modifier3;
        PaddingValues paddingValuesM5136PaddingValuesYgX7TsA;
        final float fMo5016toPx0680j_4;
        final float fMo5016toPx0680j_42;
        final float fMo5016toPx0680j_43;
        float f6;
        boolean z3;
        final Painter painterPainterResource;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        Modifier modifierM4893clickableXHw0xAI$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final PaddingValues paddingValues2;
        final float f7;
        final float f8;
        final float f9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-613188323);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(alignment.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z2 = z;
                            i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        if ((i & 196608) == 0) {
                            jM21372getBg20d7_KjU = j;
                            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(jM21372getBg20d7_KjU)) ? 131072 : 65536;
                        } else {
                            jM21372getBg20d7_KjU = j;
                        }
                        if ((i & 1572864) == 0) {
                            fM7995constructorimpl = f2;
                            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(fM7995constructorimpl)) ? 1048576 : 524288;
                        } else {
                            fM7995constructorimpl = f2;
                        }
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                            fM7995constructorimpl2 = f3;
                        } else {
                            fM7995constructorimpl2 = f3;
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i10 = i9;
                                i4 |= composerStartRestartGroup.changed(f4) ? 67108864 : 33554432;
                            }
                            i11 = i3 & 512;
                            if (i11 != 0) {
                                if ((i & 805306368) == 0) {
                                    i12 = i11;
                                    i4 |= composerStartRestartGroup.changed(f5) ? 536870912 : 268435456;
                                }
                                i13 = i3 & 1024;
                                if (i13 != 0) {
                                    i15 = i2 | 6;
                                    i14 = i13;
                                } else if ((i2 & 6) == 0) {
                                    i14 = i13;
                                    i15 = i2 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                    i15 = i2;
                                }
                                if ((i3 & 2048) != 0) {
                                    i15 |= 48;
                                } else if ((i2 & 48) == 0) {
                                    i15 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
                                }
                                int i17 = i15;
                                int i18 = i4;
                                if ((i4 & 306783379) == 306783378 && (i17 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    float f10 = fM7995constructorimpl;
                                    f8 = fM7995constructorimpl2;
                                    f7 = f10;
                                    f9 = f4;
                                    f6 = f5;
                                    paddingValues2 = paddingValues;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i6 != 0) {
                                            function02 = null;
                                        }
                                        if (i7 != 0) {
                                            z2 = false;
                                        }
                                        if ((i3 & 32) == 0) {
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i19 = BentoTheme.$stable;
                                            if (bentoTheme.getColors(composerStartRestartGroup, i19).getIsDay()) {
                                                composerStartRestartGroup.startReplaceGroup(-863449921);
                                                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i19).m21425getFg0d7_KjU();
                                            } else {
                                                composerStartRestartGroup.startReplaceGroup(-863449088);
                                                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i19).m21372getBg20d7_KjU();
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            i16 = i18 & (-458753);
                                        } else {
                                            i16 = i18;
                                        }
                                        if ((i3 & 64) != 0) {
                                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(z2 ? 40 : 50);
                                            i16 &= -3670017;
                                        }
                                        if (i8 != 0) {
                                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(8);
                                        }
                                        fM7995constructorimpl3 = i10 == 0 ? C2002Dp.m7995constructorimpl(12) : f4;
                                        fM7995constructorimpl4 = i12 == 0 ? C2002Dp.m7995constructorimpl(8) : f5;
                                        if (i14 == 0) {
                                            modifier3 = modifier5;
                                            paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(8));
                                        } else {
                                            modifier3 = modifier5;
                                            paddingValuesM5136PaddingValuesYgX7TsA = paddingValues;
                                        }
                                        modifier2 = modifier3;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        int i20 = (i3 & 32) != 0 ? i18 & (-458753) : i18;
                                        if ((i3 & 64) != 0) {
                                            i20 &= -3670017;
                                        }
                                        fM7995constructorimpl3 = f4;
                                        fM7995constructorimpl4 = f5;
                                        i16 = i20;
                                        paddingValuesM5136PaddingValuesYgX7TsA = paddingValues;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    boolean z4 = z2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-613188323, i16, i17, "com.robinhood.android.fx.tooltip.TooltipBubble (TooltipPopup.kt:233)");
                                    }
                                    fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl4);
                                    fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl3);
                                    fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl2);
                                    f6 = fM7995constructorimpl4;
                                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl2);
                                    float f11 = fM7995constructorimpl2;
                                    int i21 = i16;
                                    z3 = alignment != TooltipPopup2.Top;
                                    painterPainterResource = PainterResources_androidKt.painterResource(!z3 ? C17652R.drawable.arrow_up : C17652R.drawable.arrow_down, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    float f12 = fM7995constructorimpl3;
                                    zChanged = ((i21 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(painterPainterResource) | ((((i21 & 458752) ^ 196608) <= 131072 && composerStartRestartGroup.changed(jM21372getBg20d7_KjU)) || (i21 & 196608) == 131072);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final long j2 = jM21372getBg20d7_KjU;
                                        final boolean z5 = z3;
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return TooltipPopup4.TooltipBubble_xKDTGhA$lambda$14$lambda$13(f, fMo5016toPx0680j_42, fMo5016toPx0680j_43, z5, fMo5016toPx0680j_4, painterPainterResource, j2, (DrawScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierClip = Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5155defaultMinSizeVpY3zN4$default(DrawModifierKt.drawBehind(modifier2, (Function1) objRememberedValue), 0.0f, fM7995constructorimpl, 1, null), jM21372getBg20d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                                    if (function02 == null) {
                                        modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, function02, 7, null);
                                        modifier4 = modifierClip;
                                        if (modifierM4893clickableXHw0xAI$default == null) {
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValuesM5136PaddingValuesYgX7TsA);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
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
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        content.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 14));
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z2 = z4;
                                        paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                                        f7 = fM7995constructorimpl;
                                        f8 = f11;
                                        f9 = f12;
                                    } else {
                                        modifier4 = modifierClip;
                                    }
                                    modifierM4893clickableXHw0xAI$default = modifier4;
                                    Modifier modifierPadding2 = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValuesM5136PaddingValuesYgX7TsA);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        content.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 14));
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        z2 = z4;
                                        paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                                        f7 = fM7995constructorimpl;
                                        f8 = f11;
                                        f9 = f12;
                                    }
                                }
                                final Function0<Unit> function03 = function02;
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Modifier modifier6 = modifier2;
                                    final float f13 = f6;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return TooltipPopup4.TooltipBubble_xKDTGhA$lambda$17(alignment, f, modifier6, function03, z2, jM21372getBg20d7_KjU, f7, f8, f9, f13, paddingValues2, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 805306368;
                            i12 = i11;
                            i13 = i3 & 1024;
                            if (i13 != 0) {
                            }
                            if ((i3 & 2048) != 0) {
                            }
                            int i172 = i15;
                            int i182 = i4;
                            if ((i4 & 306783379) == 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i5 == 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i3 & 32) == 0) {
                                    }
                                    if ((i3 & 64) != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    modifier2 = modifier3;
                                    composerStartRestartGroup.endDefaults();
                                    boolean z42 = z2;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl4);
                                    fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl3);
                                    fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl2);
                                    f6 = fM7995constructorimpl4;
                                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl2);
                                    float f112 = fM7995constructorimpl2;
                                    int i212 = i16;
                                    if (alignment != TooltipPopup2.Top) {
                                    }
                                    painterPainterResource = PainterResources_androidKt.painterResource(!z3 ? C17652R.drawable.arrow_up : C17652R.drawable.arrow_down, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    float f122 = fM7995constructorimpl3;
                                    if (((i212 & 458752) ^ 196608) <= 131072) {
                                        zChanged = ((i212 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(painterPainterResource) | ((((i212 & 458752) ^ 196608) <= 131072 && composerStartRestartGroup.changed(jM21372getBg20d7_KjU)) || (i212 & 196608) == 131072);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged) {
                                            final long j22 = jM21372getBg20d7_KjU;
                                            final boolean z52 = z3;
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.fx.tooltip.TooltipPopupKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return TooltipPopup4.TooltipBubble_xKDTGhA$lambda$14$lambda$13(f, fMo5016toPx0680j_42, fMo5016toPx0680j_43, z52, fMo5016toPx0680j_4, painterPainterResource, j22, (DrawScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierClip2 = Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5155defaultMinSizeVpY3zN4$default(DrawModifierKt.drawBehind(modifier2, (Function1) objRememberedValue), 0.0f, fM7995constructorimpl, 1, null), jM21372getBg20d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_42), roundedCornerShapeM5327RoundedCornerShape0680j_42);
                                            if (function02 == null) {
                                            }
                                            modifierM4893clickableXHw0xAI$default = modifier4;
                                            Modifier modifierPadding22 = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValuesM5136PaddingValuesYgX7TsA);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding22);
                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting()) {
                                            }
                                        }
                                    } else {
                                        zChanged = ((i212 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(painterPainterResource) | ((((i212 & 458752) ^ 196608) <= 131072 && composerStartRestartGroup.changed(jM21372getBg20d7_KjU)) || (i212 & 196608) == 131072);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged) {
                                        }
                                    }
                                }
                            }
                            final Function0 function032 = function02;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 512;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                        }
                        if ((i3 & 2048) != 0) {
                        }
                        int i1722 = i15;
                        int i1822 = i4;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        final Function0 function0322 = function02;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    if ((i & 196608) == 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    int i17222 = i15;
                    int i18222 = i4;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    final Function0 function03222 = function02;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function02 = function0;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                z2 = z;
                if ((i & 196608) == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                int i172222 = i15;
                int i182222 = i4;
                if ((i4 & 306783379) == 306783378) {
                }
                final Function0 function032222 = function02;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function02 = function0;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            z2 = z;
            if ((i & 196608) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i1722222 = i15;
            int i1822222 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            final Function0 function0322222 = function02;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function02 = function0;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z2 = z;
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i17222222 = i15;
        int i18222222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        final Function0 function03222222 = function02;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBubble_xKDTGhA$lambda$14$lambda$13(float f, float f2, float f3, boolean z, float f4, Painter painter, long j, DrawScope drawBehind) {
        float f5;
        float fIntBitsToFloat;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (f <= 0.0f) {
            return Unit.INSTANCE;
        }
        float fCoerceIn = RangesKt.coerceIn(f - (f2 / 2), f3, Float.intBitsToFloat((int) (drawBehind.getDrawContext().mo6936getSizeNHjbRc() >> 32)) - f3);
        if (z) {
            f5 = f4;
            fIntBitsToFloat = -f5;
        } else {
            f5 = f4;
            fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.getDrawContext().mo6936getSizeNHjbRc() & 4294967295L));
        }
        float f6 = fIntBitsToFloat;
        drawBehind.getDrawContext().getTransform().translate(fCoerceIn, f6);
        try {
            Painter.m7009drawx_KDEd0$default(painter, drawBehind, Size.m6575constructorimpl((4294967295L & Float.floatToRawIntBits(f5)) | (Float.floatToRawIntBits(f2) << 32)), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, j, 0, 2, null), 2, null);
            drawBehind.getDrawContext().getTransform().translate(-fCoerceIn, -f6);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawBehind.getDrawContext().getTransform().translate(-fCoerceIn, -f6);
            throw th;
        }
    }

    public static final TooltipPopupPosition calculateTooltipPopupPosition(View view, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (layoutCoordinates == null) {
            return new TooltipPopupPosition(0L, null, 0.0f, 7, null);
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(layoutCoordinates);
        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow2 = parentCoordinates != null ? LayoutCoordinates2.boundsInWindow(parentCoordinates) : null;
        float top = rectBoundsInWindow.getTop() - rect.top;
        float bottom = (rect.bottom - r3) - rectBoundsInWindow.getBottom();
        float right = rectBoundsInWindow.getRight() - ((rectBoundsInWindow.getRight() - rectBoundsInWindow.getLeft()) / 2);
        float fCenterX = right - rect.centerX();
        if (top < bottom) {
            return new TooltipPopupPosition(IntOffset.m8033constructorimpl(((((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L)) + ((int) (rectBoundsInWindow2 != null ? rectBoundsInWindow.getTop() - rectBoundsInWindow2.getTop() : 0.0f))) & 4294967295L) | (((int) fCenterX) << 32)), TooltipPopup2.Top, right, null);
        }
        return new TooltipPopupPosition(IntOffset.m8033constructorimpl((((-((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L))) - ((int) (rectBoundsInWindow2 != null ? rectBoundsInWindow2.getBottom() - rectBoundsInWindow.getBottom() : 0.0f))) & 4294967295L) | (((int) fCenterX) << 32)), TooltipPopup2.Bottom, right, null);
    }

    public static final String getFxTooltipBubbleTestTag() {
        return fxTooltipBubbleTestTag;
    }
}
