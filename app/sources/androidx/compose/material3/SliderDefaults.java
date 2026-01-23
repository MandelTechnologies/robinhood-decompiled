package androidx.compose.material3;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.Hoverable2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.geometry.CornerRadius2;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.RoundRect;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÄ\u0001\u0010 \u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u001f\u0010\u0019\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0002\b\u00182#\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010)\u001a\u00020\u0017*\u00020\u00042\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J2\u0010\u0019\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/JB\u00109\u001a\u00020\u00172\u0006\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00104\u001a\u00020\u001c2\b\b\u0002\u00106\u001a\u000205H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0096\u0001\u0010>\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:2\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\u001c2\b\b\u0002\u0010.\u001a\u00020-2!\b\u0002\u0010\u0019\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0002\b\u00182%\b\u0002\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u001d\u0010?\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010C\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u00020-*\u00020H8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, m3636d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "tickFractions", "", "activeRangeStart", "activeRangeEnd", "Landroidx/compose/ui/graphics/Color;", "inactiveTrackColor", "activeTrackColor", "inactiveTickColor", "activeTickColor", "Landroidx/compose/ui/unit/Dp;", "height", "startThumbWidth", "endThumbWidth", "thumbTrackGapSize", "trackInsideCornerSize", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "drawStopIndicator", "Lkotlin/Function3;", "drawTick", "", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrack", "offset", "Landroidx/compose/ui/geometry/Size;", "size", ResourceTypes.COLOR, "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "drawTrackPath", "drawScope", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "Landroidx/compose/material3/SliderColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/ui/unit/DpSize;", "thumbSize", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Thumb", "Landroidx/compose/material3/SliderState;", "sliderState", "Track-4EFweAY", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "Track", "TrackStopIndicatorSize", "F", "getTrackStopIndicatorSize-D9Ej5fM", "()F", "TickSize", "getTickSize-D9Ej5fM", "Landroidx/compose/ui/graphics/Path;", "trackPath", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "defaultSliderColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SliderDefaults {
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TickSize;
    private static final float TrackStopIndicatorSize;
    private static final Path trackPath;

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSliderColors$material3_release;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        SliderColors sliderColors = new SliderColors(ColorScheme2.fromToken(colorScheme, sliderTokens.getHandleColor()), ColorScheme2.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorScheme2.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorScheme2.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorScheme2.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, sliderTokens.getDisabledHandleColor()), sliderTokens.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5951Thumb9LiSoMs(final InteractionSource3 interactionSource3, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        long j3;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        boolean z3;
        Object objRememberedValue2;
        int i6;
        long jM8020copyDwJknco$default;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(interactionSource3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i8 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i8;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        j2 = j;
                        i3 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        } else {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = sliderColorsColors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 == 0) {
                                j3 = SliderKt.ThumbSize;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            int i9 = i3 & 14;
                            z3 = i9 == 4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z3 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new SliderDefaults$Thumb$1$1(interactionSource3, snapshotStateList, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            EffectsKt.LaunchedEffect(interactionSource3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i9);
                            if (snapshotStateList.isEmpty()) {
                                i6 = 2;
                                jM8020copyDwJknco$default = Dp5.m8020copyDwJknco$default(j3, C2002Dp.m7995constructorimpl(Dp5.m8024getWidthD9Ej5fM(j3) / 2), 0.0f, 2, null);
                            } else {
                                i6 = 2;
                                jM8020copyDwJknco$default = j3;
                            }
                            Spacer2.Spacer(Background3.m4871backgroundbw27NRU(Hoverable2.hoverable$default(SizeKt.m5170size6HolHcs(modifier2, jM8020copyDwJknco$default), interactionSource3, false, i6, null), sliderColors2.m5943thumbColorvNxB06k$material3_release(z2), Shapes5.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                        }
                        j3 = j2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        int i92 = i3 & 14;
                        if (i92 == 4) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                            objRememberedValue2 = new SliderDefaults$Thumb$1$1(interactionSource3, snapshotStateList, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            EffectsKt.LaunchedEffect(interactionSource3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i92);
                            if (snapshotStateList.isEmpty()) {
                            }
                            Spacer2.Spacer(Background3.m4871backgroundbw27NRU(Hoverable2.hoverable$default(SizeKt.m5170size6HolHcs(modifier2, jM8020copyDwJknco$default), interactionSource3, false, i6, null), sliderColors2.m5943thumbColorvNxB06k$material3_release(z2), Shapes5.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j4 = j3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j4 = j2;
                    }
                    final SliderColors sliderColors3 = sliderColors2;
                    final boolean z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                this.$tmp2_rcvr.m5951Thumb9LiSoMs(interactionSource3, modifier3, sliderColors3, z4, j4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                j2 = j;
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i7 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            j3 = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        int i922 = i3 & 14;
                        if (i922 == 4) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                        }
                    }
                }
                final SliderColors sliderColors32 = sliderColors2;
                final boolean z42 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            j2 = j;
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            final SliderColors sliderColors322 = sliderColors2;
            final boolean z422 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        j2 = j;
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        final SliderColors sliderColors3222 = sliderColors2;
        final boolean z4222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) = 
      (r2v11 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
      (r2v15 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
     binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5952Track4EFweAY(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        final Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        float f3;
        int i7;
        final float f4;
        int i8;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        SliderColors sliderColors3;
        final float f5;
        boolean z5;
        final float f6;
        final boolean z6;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(49984771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        int i11 = composerStartRestartGroup.changed(sliderColors2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        int i12 = composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        function22 = function2;
                    }
                    i3 |= i12;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i9 = (i & 100663296) == 0 ? composerStartRestartGroup.changed(this) ? 67108864 : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                                sliderColors2 = sliderColorsColors;
                            }
                            if ((i2 & 16) != 0) {
                                boolean z7 = ((((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m5955invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m5955invokeUv8p0NA(DrawScope drawScope, long j) {
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            sliderDefaults.m5948drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m5954getTrackStopIndicatorSizeD9Ej5fM(), sliderColors2.m5945trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                i3 &= -57345;
                                function22 = (Function2) objRememberedValue2;
                            }
                            if (i5 != 0) {
                                function32 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m5956invokewPWG1Vc(drawScope, offset.getPackedValue(), color.getValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m5956invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                        sliderDefaults.m5948drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m5953getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                            }
                            if (i6 != 0) {
                                f3 = SliderKt.ThumbTrackGapSize;
                            }
                            if (i7 != 0) {
                                f4 = SliderKt.TrackInsideCornerSize;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        i8 = i3;
                        Modifier modifier4 = modifier2;
                        SliderColors sliderColors5 = sliderColors2;
                        float f7 = f3;
                        boolean z8 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(49984771, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
                        }
                        final long jM5945trackColorWaAFU9c$material3_release = sliderColors5.m5945trackColorWaAFU9c$material3_release(z8, false);
                        final long jM5945trackColorWaAFU9c$material3_release2 = sliderColors5.m5945trackColorWaAFU9c$material3_release(z8, true);
                        float f8 = f4;
                        Function2<? super DrawScope, ? super Offset, Unit> function24 = function22;
                        final long jM5944tickColorWaAFU9c$material3_release = sliderColors5.m5944tickColorWaAFU9c$material3_release(z8, false);
                        final long jM5944tickColorWaAFU9c$material3_release2 = sliderColors5.m5944tickColorWaAFU9c$material3_release(z8, true);
                        Modifier modifierRotate = Rotate.rotate(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), SliderKt.getTrackHeight()), composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        boolean zChangedInstance = ((i8 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(sliderState) | composerStartRestartGroup.changed(jM5945trackColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM5945trackColorWaAFU9c$material3_release2) | composerStartRestartGroup.changed(jM5944tickColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM5944tickColorWaAFU9c$material3_release2) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                            function23 = function24;
                            if (composerStartRestartGroup.changed(function23)) {
                                z3 = true;
                                z4 = zChangedInstance | z3 | ((458752 & i8) == 131072);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    composer2 = composerStartRestartGroup;
                                    sliderColors3 = sliderColors5;
                                    f5 = f7;
                                    function22 = function23;
                                    f4 = f8;
                                    z5 = z8;
                                    Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DrawScope drawScope) {
                                            SliderDefaults.INSTANCE.m5949drawTrackngJ0SCU(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM5945trackColorWaAFU9c$material3_release, jM5945trackColorWaAFU9c$material3_release2, jM5944tickColorWaAFU9c$material3_release, jM5944tickColorWaAFU9c$material3_release2, drawScope.mo5012toDpu2uoSUM(sliderState.getTrackHeight$material3_release()), drawScope.mo5013toDpu2uoSUM(0), drawScope.mo5012toDpu2uoSUM(sliderState.getThumbWidth$material3_release()), f5, f4, function22, function32, false);
                                        }
                                    };
                                    composer2.updateRememberedValue(function1);
                                    objRememberedValue = function1;
                                } else {
                                    f5 = f7;
                                    f4 = f8;
                                    function22 = function23;
                                    z5 = z8;
                                    composer2 = composerStartRestartGroup;
                                    sliderColors3 = sliderColors5;
                                }
                                Canvas2.Canvas(modifierRotate, (Function1) objRememberedValue, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f6 = f5;
                                z6 = z5;
                                sliderColors4 = sliderColors3;
                                modifier3 = modifier4;
                            }
                        } else {
                            function23 = function24;
                        }
                        if ((i8 & 24576) == 16384) {
                            z3 = false;
                        }
                        z4 = zChangedInstance | z3 | ((458752 & i8) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            composer2 = composerStartRestartGroup;
                            sliderColors3 = sliderColors5;
                            f5 = f7;
                            function22 = function23;
                            f4 = f8;
                            z5 = z8;
                            Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m5949drawTrackngJ0SCU(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM5945trackColorWaAFU9c$material3_release, jM5945trackColorWaAFU9c$material3_release2, jM5944tickColorWaAFU9c$material3_release, jM5944tickColorWaAFU9c$material3_release2, drawScope.mo5012toDpu2uoSUM(sliderState.getTrackHeight$material3_release()), drawScope.mo5013toDpu2uoSUM(0), drawScope.mo5012toDpu2uoSUM(sliderState.getThumbWidth$material3_release()), f5, f4, function22, function32, false);
                                }
                            };
                            composer2.updateRememberedValue(function12);
                            objRememberedValue = function12;
                            Canvas2.Canvas(modifierRotate, (Function1) objRememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f6 = f5;
                            z6 = z5;
                            sliderColors4 = sliderColors3;
                            modifier3 = modifier4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                        f6 = f3;
                        z6 = z2;
                    }
                    final float f9 = f4;
                    final Function2<? super DrawScope, ? super Offset, Unit> function25 = function22;
                    final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33 = function32;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i13) {
                                this.$tmp2_rcvr.m5952Track4EFweAY(sliderState, modifier3, z6, sliderColors4, function25, function33, f6, f9, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i9;
                if ((38347923 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        i8 = i3;
                        Modifier modifier42 = modifier2;
                        SliderColors sliderColors52 = sliderColors2;
                        float f72 = f3;
                        boolean z82 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final long jM5945trackColorWaAFU9c$material3_release3 = sliderColors52.m5945trackColorWaAFU9c$material3_release(z82, false);
                        final long jM5945trackColorWaAFU9c$material3_release22 = sliderColors52.m5945trackColorWaAFU9c$material3_release(z82, true);
                        float f82 = f4;
                        Function2<? super DrawScope, ? super Offset, Unit> function242 = function22;
                        final long jM5944tickColorWaAFU9c$material3_release3 = sliderColors52.m5944tickColorWaAFU9c$material3_release(z82, false);
                        final long jM5944tickColorWaAFU9c$material3_release22 = sliderColors52.m5944tickColorWaAFU9c$material3_release(z82, true);
                        Modifier modifierRotate2 = Rotate.rotate(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null), SliderKt.getTrackHeight()), composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        boolean zChangedInstance2 = ((i8 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(sliderState) | composerStartRestartGroup.changed(jM5945trackColorWaAFU9c$material3_release3) | composerStartRestartGroup.changed(jM5945trackColorWaAFU9c$material3_release22) | composerStartRestartGroup.changed(jM5944tickColorWaAFU9c$material3_release3) | composerStartRestartGroup.changed(jM5944tickColorWaAFU9c$material3_release22) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                        }
                        if ((i8 & 24576) == 16384) {
                        }
                        z4 = zChangedInstance2 | z3 | ((458752 & i8) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                final float f92 = f4;
                final Function2<? super DrawScope, ? super Offset, Unit> function252 = function22;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function332 = function32;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i9;
            if ((38347923 & i3) == 38347922) {
            }
            final float f922 = f4;
            final Function2<? super DrawScope, ? super Offset, Unit> function2522 = function22;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3322 = function32;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i9;
        if ((38347923 & i3) == 38347922) {
        }
        final float f9222 = f4;
        final Function2<? super DrawScope, ? super Offset, Unit> function25222 = function22;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33222 = function32;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5949drawTrackngJ0SCU(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z) {
        float fMo5016toPx0680j_4;
        float fMo5016toPx0680j_42;
        float f8;
        int i;
        float f9;
        float f10;
        long jOffset = OffsetKt.Offset(0.0f, Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()));
        long jOffset2 = OffsetKt.Offset(Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()), Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()));
        float fMo5016toPx0680j_43 = drawScope.mo5016toPx0680j_4(f3);
        long jOffset3 = OffsetKt.Offset(Offset.m6543getXimpl(jOffset) + ((Offset.m6543getXimpl(jOffset2) - Offset.m6543getXimpl(jOffset)) * f2), Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()));
        long jOffset4 = OffsetKt.Offset(Offset.m6543getXimpl(jOffset) + ((Offset.m6543getXimpl(jOffset2) - Offset.m6543getXimpl(jOffset)) * f), Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()));
        float f11 = 2;
        float f12 = fMo5016toPx0680j_43 / f11;
        float fMo5016toPx0680j_44 = drawScope.mo5016toPx0680j_4(f7);
        if (C2002Dp.m7994compareTo0680j_4(f6, C2002Dp.m7995constructorimpl(0)) > 0) {
            fMo5016toPx0680j_4 = (drawScope.mo5016toPx0680j_4(f4) / f11) + drawScope.mo5016toPx0680j_4(f6);
            fMo5016toPx0680j_42 = (drawScope.mo5016toPx0680j_4(f5) / f11) + drawScope.mo5016toPx0680j_4(f6);
        } else {
            fMo5016toPx0680j_4 = 0.0f;
            fMo5016toPx0680j_42 = 0.0f;
        }
        if (!z || Offset.m6543getXimpl(jOffset4) <= Offset.m6543getXimpl(jOffset) + fMo5016toPx0680j_4 + f12) {
            f8 = fMo5016toPx0680j_43;
            i = 0;
        } else {
            float fM6543getXimpl = Offset.m6543getXimpl(jOffset);
            f8 = fMo5016toPx0680j_43;
            i = 0;
            m5950drawTrackPathCx2C_VA(drawScope, Offset.INSTANCE.m6553getZeroF1C5BW0(), androidx.compose.p011ui.geometry.SizeKt.Size((Offset.m6543getXimpl(jOffset4) - fMo5016toPx0680j_4) - fM6543getXimpl, fMo5016toPx0680j_43), j, f12, fMo5016toPx0680j_44);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m6534boximpl(OffsetKt.Offset(fM6543getXimpl + f12, Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()))));
            }
        }
        if (Offset.m6543getXimpl(jOffset3) < (Offset.m6543getXimpl(jOffset2) - fMo5016toPx0680j_42) - f12) {
            float fM6543getXimpl2 = Offset.m6543getXimpl(jOffset3) + fMo5016toPx0680j_42;
            float fM6543getXimpl3 = Offset.m6543getXimpl(jOffset2);
            float f13 = f8;
            f10 = f13;
            m5950drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(fM6543getXimpl2, 0.0f), androidx.compose.p011ui.geometry.SizeKt.Size(fM6543getXimpl3 - fM6543getXimpl2, f13), j, fMo5016toPx0680j_44, f12);
            f9 = f12;
            fMo5016toPx0680j_44 = fMo5016toPx0680j_44;
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m6534boximpl(OffsetKt.Offset(fM6543getXimpl3 - f9, Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()))));
            }
        } else {
            f9 = f12;
            f10 = f8;
        }
        float fM6543getXimpl4 = z ? Offset.m6543getXimpl(jOffset4) + fMo5016toPx0680j_4 : 0.0f;
        float fM6543getXimpl5 = Offset.m6543getXimpl(jOffset3) - fMo5016toPx0680j_42;
        float f14 = z ? fMo5016toPx0680j_44 : f9;
        float f15 = fM6543getXimpl5 - fM6543getXimpl4;
        if (f15 > f14) {
            m5950drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(fM6543getXimpl4, 0.0f), androidx.compose.p011ui.geometry.SizeKt.Size(f15, f10), j2, f14, fMo5016toPx0680j_44);
        }
        long jOffset5 = OffsetKt.Offset(Offset.m6543getXimpl(jOffset) + f9, Offset.m6544getYimpl(jOffset));
        long jOffset6 = OffsetKt.Offset(Offset.m6543getXimpl(jOffset2) - f9, Offset.m6544getYimpl(jOffset2));
        Ranges3<Float> ranges3RangeTo = RangesKt.rangeTo(Offset.m6543getXimpl(jOffset4) - fMo5016toPx0680j_4, Offset.m6543getXimpl(jOffset4) + fMo5016toPx0680j_4);
        Ranges3<Float> ranges3RangeTo2 = RangesKt.rangeTo(Offset.m6543getXimpl(jOffset3) - fMo5016toPx0680j_42, Offset.m6543getXimpl(jOffset3) + fMo5016toPx0680j_42);
        int length = fArr.length;
        int i2 = i;
        int i3 = i2;
        while (i2 < length) {
            float f16 = fArr[i2];
            int i4 = i3 + 1;
            int i5 = 1;
            if (function2 == null || ((!z || i3 != 0) && i3 != fArr.length - 1)) {
                if (f16 <= f2 && f16 >= f) {
                    i5 = i;
                }
                long jOffset7 = OffsetKt.Offset(Offset.m6543getXimpl(OffsetKt.m6554lerpWko1d7g(jOffset5, jOffset6, f16)), Offset.m6544getYimpl(drawScope.mo6962getCenterF1C5BW0()));
                if ((!z || !ranges3RangeTo.contains(Float.valueOf(Offset.m6543getXimpl(jOffset7)))) && !ranges3RangeTo2.contains(Float.valueOf(Offset.m6543getXimpl(jOffset7)))) {
                    function3.invoke(drawScope, Offset.m6534boximpl(jOffset7), Color.m6701boximpl(i5 != 0 ? j3 : j4));
                }
            }
            i2++;
            i3 = i4;
        }
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m5950drawTrackPathCx2C_VA(DrawScope drawScope, long j, long j2, long j3, float f, float f2) {
        long jCornerRadius = CornerRadius2.CornerRadius(f, f);
        long jCornerRadius2 = CornerRadius2.CornerRadius(f2, f2);
        RoundRect roundRectM6570RoundRectZAM2FJo = RoundRect2.m6570RoundRectZAM2FJo(Rect2.m6565Recttz77jQw(OffsetKt.Offset(Offset.m6543getXimpl(j), 0.0f), androidx.compose.p011ui.geometry.SizeKt.Size(Size.m6583getWidthimpl(j2), Size.m6580getHeightimpl(j2))), jCornerRadius, jCornerRadius2, jCornerRadius2, jCornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, roundRectM6570RoundRectZAM2FJo, null, 2, null);
        DrawScope.m6955drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m5948drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo5016toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, 120, null);
    }

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackStopIndicatorSize = sliderTokens.m6291getStopIndicatorSizeD9Ej5fM();
        TickSize = sliderTokens.m6291getStopIndicatorSizeD9Ej5fM();
        trackPath = AndroidPath_androidKt.Path();
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m5954getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m5953getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
