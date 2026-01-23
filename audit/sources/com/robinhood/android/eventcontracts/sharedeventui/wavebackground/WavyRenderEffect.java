package com.robinhood.android.eventcontracts.sharedeventui.wavebackground;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.AndroidRenderEffect_androidKt;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WavyRenderEffect.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H\u0001\"\u0010\u0010\u0000\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m3636d2 = {"IMG_SHADER_SRC", "", "wavyRenderEffect", "Landroidx/compose/ui/Modifier;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffectKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class WavyRenderEffect {
    private static final String IMG_SHADER_SRC = "\n    uniform float2 size;\n    uniform float time;\n    uniform shader composable;\n    \n    float2 complexWave(float2 position, float time, float2 size, float speed, float strength, float frequency) {\n        float2 normalizedPosition = position / size.xy;\n        float moveAmount = time * speed;\n    \n        position.x += normalizedPosition.y + (sin((normalizedPosition.x + moveAmount) * frequency) * strength);\n        position.y += normalizedPosition.x + (sin((normalizedPosition.x + moveAmount) * frequency) * strength);\n    \n        return position;\n    }\n    half4 main(float2 fragCoord) {\n        return composable.eval(complexWave(fragCoord, time, size, 0.4, 5.0, 5.0));\n    }\n";

    /* compiled from: WavyRenderEffect.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffectKt$wavyRenderEffect$1 */
    static final class C166111 implements Function3<Modifier, Composer, Integer, Modifier> {
        public static final C166111 INSTANCE = new C166111();

        C166111() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(RuntimeShader runtimeShader, IntSize intSize) {
            runtimeShader.setFloatUniform("size", (int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & 4294967295L));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(RuntimeShader runtimeShader, SnapshotFloatState2 snapshotFloatState2, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setClip(true);
            runtimeShader.setFloatUniform("time", snapshotFloatState2.getFloatValue());
            RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "composable");
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateRuntimeShaderEffect, "createRuntimeShaderEffect(...)");
            graphicsLayer.setRenderEffect(AndroidRenderEffect_androidKt.asComposeRenderEffect(renderEffectCreateRuntimeShaderEffect));
            return Unit.INSTANCE;
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-1687705531);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1687705531, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.wavebackground.wavyRenderEffect.<anonymous> (WavyRenderEffect.kt:40)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = C16610xb1cbd9d3.m2013m(WavyRenderEffect.IMG_SHADER_SRC);
                composer.updateRememberedValue(objRememberedValue);
            }
            final RuntimeShader runtimeShaderM2012m = C16609xb1cbd9d2.m2012m(objRememberedValue);
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue2;
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new WavyRenderEffect2(snapshotFloatState2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 6);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(runtimeShaderM2012m);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffectKt$wavyRenderEffect$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WavyRenderEffect.C166111.invoke$lambda$4$lambda$3(runtimeShaderM2012m, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(composed, (Function1) objRememberedValue4);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(runtimeShaderM2012m);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WavyRenderEffectKt$wavyRenderEffect$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WavyRenderEffect.C166111.invoke$lambda$6$lambda$5(runtimeShaderM2012m, snapshotFloatState2, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierOnSizeChanged, (Function1) objRememberedValue5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierGraphicsLayer;
        }
    }

    public static final Modifier wavyRenderEffect(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, C166111.INSTANCE, 1, null);
    }
}
