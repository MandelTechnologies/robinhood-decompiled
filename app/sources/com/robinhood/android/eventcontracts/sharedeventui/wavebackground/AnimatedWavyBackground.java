package com.robinhood.android.eventcontracts.sharedeventui.wavebackground;

import android.os.Build;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.sharedeventui.ImageBackground4;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackground2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimatedWavyBackground.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a!\u0010\b\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"AnimatedWavyBackground", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/WaveBackgroundData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/WaveBackgroundData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "gradientPath", "PreviewWavyBackground", "params", "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/PreviewWavyBackgroundParameterProvider$Parameter;", "(Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/PreviewWavyBackgroundParameterProvider$Parameter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackgroundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AnimatedWavyBackground {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedWavyBackground$lambda$0(WaveBackgroundData waveBackgroundData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AnimatedWavyBackground(waveBackgroundData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewWavyBackground$lambda$6(AnimatedWavyBackground2.Parameter parameter, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PreviewWavyBackground(parameter, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AnimatedWavyBackground(final WaveBackgroundData data, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifierWavyRenderEffect;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(462183345);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(462183345, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackground (AnimatedWavyBackground.kt:32)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(data.getPatternResId(), composerStartRestartGroup, 0);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            if (Build.VERSION.SDK_INT >= 33) {
                modifierWavyRenderEffect = WavyRenderEffect.wavyRenderEffect(Modifier.INSTANCE);
            } else {
                modifierWavyRenderEffect = Modifier.INSTANCE;
            }
            ImageKt.Image(painterPainterResource, (String) null, gradientPath(modifierFillMaxSize$default.then(modifierWavyRenderEffect), data), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackgroundKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnimatedWavyBackground.AnimatedWavyBackground$lambda$0(data, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Modifier gradientPath(Modifier modifier, final WaveBackgroundData waveBackgroundData) {
        return DrawModifierKt.drawWithCache(modifier, new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackgroundKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnimatedWavyBackground.gradientPath$lambda$5(waveBackgroundData, (CacheDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult gradientPath$lambda$5(final WaveBackgroundData waveBackgroundData, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final Path gradientPath = waveBackgroundData.getGradientPath();
        final Rect bounds = gradientPath.getBounds();
        return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackgroundKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnimatedWavyBackground.gradientPath$lambda$5$lambda$4(bounds, gradientPath, waveBackgroundData, (ContentDrawScope) obj);
            }
        });
    }

    private static final void PreviewWavyBackground(final AnimatedWavyBackground2.Parameter parameter, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(503740968);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(parameter) : composerStartRestartGroup.changedInstance(parameter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(503740968, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.wavebackground.PreviewWavyBackground (AnimatedWavyBackground.kt:116)");
            }
            ImageBackground4.EventContractBackground(parameter.getBackgroundData(), SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, ComposableLambda3.rememberComposableLambda(579164339, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackgroundKt.PreviewWavyBackground.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope EventContractBackground, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(EventContractBackground, "$this$EventContractBackground");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(579164339, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.wavebackground.PreviewWavyBackground.<anonymous> (AnimatedWavyBackground.kt:121)");
                    }
                    TextKt.m6028Text4IGK_g(parameter.getName(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.AnimatedWavyBackgroundKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnimatedWavyBackground.PreviewWavyBackground$lambda$6(parameter, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gradientPath$lambda$5$lambda$4(Rect rect, Path path, WaveBackgroundData waveBackgroundData, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        Canvas canvas = onDrawWithContent.getDrawContext().getCanvas();
        Offset.Companion companion = Offset.INSTANCE;
        try {
            canvas.saveLayer(Rect2.m6565Recttz77jQw(companion.m6553getZeroF1C5BW0(), onDrawWithContent.mo6963getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
            onDrawWithContent.drawContent();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (onDrawWithContent.mo6963getSizeNHjbRc() >> 32)) / rect.getRight();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (onDrawWithContent.mo6963getSizeNHjbRc() & 4294967295L)) / rect.getBottom();
            long jM6553getZeroF1C5BW0 = companion.m6553getZeroF1C5BW0();
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6942scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jM6553getZeroF1C5BW0);
                DrawScope.m6954drawPathGBMwjPU$default(onDrawWithContent, path, waveBackgroundData.getGradientBrush(), 0.0f, null, null, BlendMode.INSTANCE.m6667getSrcAtop0nO6VwU(), 28, null);
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                canvas.restore();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restore();
            throw th2;
        }
    }
}
