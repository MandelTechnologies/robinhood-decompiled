package com.robinhood.android.eventcontracts.sharedeventui.sports;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SportsHubBackground.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"SportsHubBackground", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "patternColor", "Landroidx/compose/ui/graphics/Color;", "isDay", "", "(Z)J", "horizontalBrush", "Landroidx/compose/ui/graphics/Brush;", "size", "Landroidx/compose/ui/geometry/Size;", "horizontalBrush-TmRCtEA", "(JZ)Landroidx/compose/ui/graphics/Brush;", "verticalBrush", "verticalBrush-TmRCtEA", "lightHorizontalBrush", "lightHorizontalBrush-uvyYCjk", "(J)Landroidx/compose/ui/graphics/Brush;", "lightVerticalBrush", "lightVerticalBrush-uvyYCjk", "darkHorizontalBrush", "darkHorizontalBrush-uvyYCjk", "darkVerticalBrush", "darkVerticalBrush-uvyYCjk", "SportsHubBackgroundPreview_day", "(Landroidx/compose/runtime/Composer;I)V", "SportsHubBackgroundPreview_night", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SportsHubBackground4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsHubBackground$lambda$5(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SportsHubBackground(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsHubBackgroundPreview_day$lambda$6(int i, Composer composer, int i2) {
        SportsHubBackgroundPreview_day(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsHubBackgroundPreview_night$lambda$7(int i, Composer composer, int i2) {
        SportsHubBackgroundPreview_night(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SportsHubBackground(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-449504256);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449504256, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackground (SportsHubBackground.kt:26)");
            }
            final boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
            long jPatternColor = patternColor(isDay);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(C16594R.drawable.hub_sports_pattern, composerStartRestartGroup, 0);
            Alignment topCenter = Alignment.INSTANCE.getTopCenter();
            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
            ColorFilter colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, jPatternColor, 0, 2, null);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(isDay);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SportsHubBackground4.SportsHubBackground$lambda$4$lambda$3(isDay, (CacheDrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ImageKt.Image(painterPainterResource, (String) null, DrawModifierKt.drawWithCache(modifierFillMaxSize$default, (Function1) objRememberedValue), topCenter, fillWidth, 0.0f, colorFilterM6729tintxETnrds$default, composerStartRestartGroup, 27696, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportsHubBackground4.SportsHubBackground$lambda$5(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult SportsHubBackground$lambda$4$lambda$3(boolean z, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final Brush brushM14416horizontalBrushTmRCtEA = m14416horizontalBrushTmRCtEA(drawWithCache.m6459getSizeNHjbRc(), z);
        final Brush brushM14419verticalBrushTmRCtEA = m14419verticalBrushTmRCtEA(drawWithCache.m6459getSizeNHjbRc(), z);
        return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SportsHubBackground4.SportsHubBackground$lambda$4$lambda$3$lambda$2(brushM14416horizontalBrushTmRCtEA, brushM14419verticalBrushTmRCtEA, (ContentDrawScope) obj);
            }
        });
    }

    private static final long patternColor(boolean z) {
        if (z) {
            return Color.m6705copywmQWz5c$default(Color.INSTANCE.m6716getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return Color.m6705copywmQWz5c$default(Color.INSTANCE.m6727getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: horizontalBrush-TmRCtEA, reason: not valid java name */
    private static final Brush m14416horizontalBrushTmRCtEA(long j, boolean z) {
        if (z) {
            return m14417lightHorizontalBrushuvyYCjk(j);
        }
        return m14414darkHorizontalBrushuvyYCjk(j);
    }

    /* renamed from: verticalBrush-TmRCtEA, reason: not valid java name */
    private static final Brush m14419verticalBrushTmRCtEA(long j, boolean z) {
        if (z) {
            return m14418lightVerticalBrushuvyYCjk(j);
        }
        return m14415darkVerticalBrushuvyYCjk(j);
    }

    /* renamed from: lightHorizontalBrush-uvyYCjk, reason: not valid java name */
    private static final Brush m14417lightHorizontalBrushuvyYCjk(long j) {
        Brush.Companion companion = Brush.INSTANCE;
        Float fValueOf = Float.valueOf(0.0f);
        Color.Companion companion2 = Color.INSTANCE;
        Tuples2[] tuples2Arr = {Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6727getWhite0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6727getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null)))};
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) * 0.5f;
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) * 0.5f;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) * 1.09f;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) * 0.5f;
        return Brush.Companion.m6679linearGradientmHitzGk$default(companion, tuples2Arr, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), 0, 8, (Object) null);
    }

    /* renamed from: lightVerticalBrush-uvyYCjk, reason: not valid java name */
    private static final Brush m14418lightVerticalBrushuvyYCjk(long j) {
        Brush.Companion companion = Brush.INSTANCE;
        Float fValueOf = Float.valueOf(0.01f);
        Color.Companion companion2 = Color.INSTANCE;
        Tuples2[] tuples2Arr = {Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6727getWhite0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.16f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6727getWhite0d7_KjU(), 0.97f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.29f), Color.m6701boximpl(companion2.m6727getWhite0d7_KjU()))};
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) * 0.5f;
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) * 0.01f;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) * 0.5f;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) * 1.0f;
        return Brush.Companion.m6679linearGradientmHitzGk$default(companion, tuples2Arr, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), 0, 8, (Object) null);
    }

    /* renamed from: darkHorizontalBrush-uvyYCjk, reason: not valid java name */
    private static final Brush m14414darkHorizontalBrushuvyYCjk(long j) {
        Brush.Companion companion = Brush.INSTANCE;
        Float fValueOf = Float.valueOf(0.0f);
        Color.Companion companion2 = Color.INSTANCE;
        Tuples2[] tuples2Arr = {Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null)))};
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) * 0.41f;
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) * 0.5f;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) * 1.09f;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) * 0.5f;
        return Brush.Companion.m6679linearGradientmHitzGk$default(companion, tuples2Arr, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), 0, 8, (Object) null);
    }

    /* renamed from: darkVerticalBrush-uvyYCjk, reason: not valid java name */
    private static final Brush m14415darkVerticalBrushuvyYCjk(long j) {
        Brush.Companion companion = Brush.INSTANCE;
        Float fValueOf = Float.valueOf(0.0f);
        Color.Companion companion2 = Color.INSTANCE;
        Tuples2[] tuples2Arr = {Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.35f), Color.m6701boximpl(companion2.m6716getBlack0d7_KjU()))};
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(r4) * 0.5f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * 0.5f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * 0.52f;
        return Brush.Companion.m6679linearGradientmHitzGk$default(companion, tuples2Arr, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0, 8, (Object) null);
    }

    private static final void SportsHubBackgroundPreview_day(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1551182320);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1551182320, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundPreview_day (SportsHubBackground.kt:145)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SportsHubBackground.INSTANCE.getLambda$825822520$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportsHubBackground4.SportsHubBackgroundPreview_day$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SportsHubBackgroundPreview_night(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1973719468);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1973719468, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundPreview_night (SportsHubBackground.kt:157)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, SportsHubBackground.INSTANCE.getLambda$687653620$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackgroundKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportsHubBackground4.SportsHubBackgroundPreview_night$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsHubBackground$lambda$4$lambda$3$lambda$2(Brush brush, Brush brush2, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        Canvas canvas = onDrawWithContent.getDrawContext().getCanvas();
        try {
            canvas.saveLayer(Rect2.m6565Recttz77jQw(Offset.INSTANCE.m6553getZeroF1C5BW0(), onDrawWithContent.mo6963getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
            onDrawWithContent.drawContent();
            BlendMode.Companion companion = BlendMode.INSTANCE;
            DrawScope.m6957drawRectAsUm42w$default(onDrawWithContent, brush, 0L, 0L, 0.0f, null, null, companion.m6667getSrcAtop0nO6VwU(), 62, null);
            DrawScope.m6957drawRectAsUm42w$default(onDrawWithContent, brush2, 0L, 0L, 0.0f, null, null, companion.m6667getSrcAtop0nO6VwU(), 62, null);
            canvas.restore();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            canvas.restore();
            throw th;
        }
    }
}
