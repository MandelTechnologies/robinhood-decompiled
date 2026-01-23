package com.robinhood.android.investmentstracker.composables.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import androidx.compose.foundation.StretchOverscrollNode$$ExternalSyntheticApiModelOutline0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.Brush2;
import androidx.compose.p011ui.graphics.Brush5;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.C16609xb1cbd9d2;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.C16610xb1cbd9d3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GradientComponent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a%\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, m3636d2 = {"SHADER_SOURCE", "", "GradientSquare", "", "points", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/Point;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GradientSquarePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-investments-tracker_externalDebug", "cachedBitmap", "Landroid/graphics/Bitmap;", "shader", "Landroid/graphics/RuntimeShader;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GradientComponent {
    private static final String SHADER_SOURCE = "\n        uniform float2 size;\n        uniform float[<size>] points;\n        float startingGreenDepth = -0.4;\n        const int imaginaryLineSize = 200;\n        \n        void generateLine(float2 a, float2 b, inout float[imaginaryLineSize] outPoints) {\n            float resolution = 200;\n            float dx = (b.x - a.x) / resolution;\n            float dy = (b.y - a.y) / resolution;\n            if (dx == 0) {\n                outPoints[0] = -3; // Error state\n                return;\n            }\n            if (dy >= 100) { // Paints red because the resolution is not enough\n                outPoints[0] = -3;\n                return;\n            }\n            if (dx != 0) {\n                for (int i = 0; i < imaginaryLineSize; i+=2) {\n                    outPoints[i] = float(a.x + (float(i) * dx));\n                    outPoints[i+1] = float(a.y + (float(i) * dy));\n                }\n            }\n        }\n        \n        // uniform shader composable;\n        half4 main(in float2 fragCoord) {\n            float lastX = 0;\n            for (int i = 0; i < <size>; i+=2) {\n                if (points[i] > lastX) {\n                    lastX = points[i];\n                }\n            }\n            if (fragCoord.x > lastX) {\n                return half4(0, 0, 0, 0);\n            }\n            // float alpha = startingGreenDepth - (fragCoord.y / size.y);\n            float alpha = startingGreenDepth + (fragCoord.y / size.y);\n            float minDistance = 1000000;\n            float2 currentMinPoint = float2(0,0);\n            float maxXPointValue = 0;\n            int nearestPointIndex = -1;\n            //Loop through every pair of points\n            for (int i = 0; i < <size>; i+=2) {\n                float pointX = points[i];\n                float pointY = points[i + 1];\n                //Find distance between this point and the coordinate we are rendering\n                float dist = abs(fragCoord.x - pointX);\n                if (dist < minDistance) {\n                    minDistance = dist;\n                    currentMinPoint = float2(pointX, pointY);\n                    nearestPointIndex = i;\n                }\n                if (maxXPointValue < pointX) {\n                    maxXPointValue = pointX;\n                }\n            }\n            // If below the nearest points y, then don't show\n            // This should never work theoretically because need to always calc the nearest lines to the pixels.\n            // if (fragCoord.y < currentMinPoint.y || fragCoord.x > maxXPointValue) {\n            //     alpha = 0;\n            // }\n            // Line checks\n            float leftX = 0;\n            float leftY = 0;\n            float leftDistance = 100000;\n            float rightX = 0;\n            float rightY = 0;\n            float rightDistance = 100000;\n            float2 rightPointJustInCase;\n            //First find which direction is best for this pixel are we on the left\n            // or the right of the nearest point\n            // Have to iterate because in GLSL 1.0 you can not access\n            // values in an array dynamically and it has to be determined at compile time\n            // for optimizations.\n            for (int j = 0; j < <size>; j+=2) {\n                if (j + 2 == nearestPointIndex) {\n                    leftX = points[j];\n                    leftY = points[j + 1];\n                    leftDistance = currentMinPoint.x - points[j];\n                }\n                if (j == nearestPointIndex) {\n                    rightX = points[j + 2];\n                    rightY = points[j + 3];\n                    rightDistance = points[j + 2] - currentMinPoint.x;\n                    rightPointJustInCase = float2(points[j + 4], points[j + 5]);\n                }\n            }\n            float[imaginaryLineSize] outPoints;\n            if (leftDistance < rightDistance) {// Need to generate a line for the left\n                // if (rightDistance != 100000) {\n                //     return half4(1, 0, 1, 1);\n                // }\n                // return half4(0.5, 0, 0, 1);\n                float2 startLeft = float2(leftX, leftY);\n                generateLine(startLeft, currentMinPoint, outPoints);\n            } else { // Need to generate a line for the right\n                // if (leftDistance != 100000) {\n                //     return half4(1, 1, 0, 1);\n                // }\n                // return half4(1, 0, 0, 1);\n                float2 pointForInput = float2(rightX, rightY);\n                if (currentMinPoint.x == rightX) {// If we found  the same points for minimum we need to grab the next point\n                    pointForInput = rightPointJustInCase;\n                }\n                generateLine(currentMinPoint, float2(rightX, rightY), outPoints);\n            }\n            // if (rightX > currentMinPoint.x) {\n            //     return half4(1, 0, 1, 1);\n            // }\n            // if (outPoints[3] > outPoints[1]) {\n            //     return half4(1, 0, 0, 1);\n            // }\n            if (outPoints[0] == -3 && fragCoord.y < currentMinPoint.y) {\n                // return half4(1, 0, 0, 1);\n                return half4(1, 0, 0, alpha);\n            }\n            float2 closestImaginaryLinePoint;\n            float currentMinX = 100000;\n            for (int i = 0; i < imaginaryLineSize; i+=2) {\n                    // if (outPoints[i] > fragCoord.x) { // Stop processing as we only care up to this x anyways\n                    //     break;\n                    // }\n                    if (abs(fragCoord.x - outPoints[i]) < currentMinX) {\n                        currentMinX = abs(fragCoord.x - outPoints[i]);\n                        closestImaginaryLinePoint = float2(outPoints[i], outPoints[i + 1]);\n                    }\n            }\n            \n            if (fragCoord.y > closestImaginaryLinePoint.y) {\n                alpha = 0;\n            }\n            \n            return half4(0, 1, 0, alpha);\n       }\n    ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientSquare$lambda$17(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GradientSquare(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientSquarePreview$lambda$18(int i, Composer composer, int i2) {
        GradientSquarePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final Bitmap GradientSquare$lambda$1(SnapshotState<Bitmap> snapshotState) {
        return snapshotState.getValue();
    }

    private static final RuntimeShader GradientSquare$lambda$4(SnapshotState<RuntimeShader> snapshotState) {
        return C16609xb1cbd9d2.m2012m(snapshotState.getValue());
    }

    public static final void GradientSquare(final ImmutableList<Point> points, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(points, "points");
        Composer composerStartRestartGroup = composer.startRestartGroup(49031481);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(points) : composerStartRestartGroup.changedInstance(points) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(49031481, i3, -1, "com.robinhood.android.investmentstracker.composables.components.GradientSquare (GradientComponent.kt:173)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            boolean z = true;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GradientComponent.GradientSquare$lambda$12$lambda$11(snapshotState, snapshotState2, (CacheDrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifierFillMaxSize$default, (Function1) objRememberedValue3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !composerStartRestartGroup.changedInstance(points))) {
                z = false;
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GradientComponent.GradientSquare$lambda$16$lambda$15(points, snapshotState2, snapshotState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(OnRemeasuredModifier2.onSizeChanged(modifierDrawWithCache, (Function1) objRememberedValue4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GradientComponent.GradientSquare$lambda$17(points, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult GradientSquare$lambda$12$lambda$11(SnapshotState snapshotState, SnapshotState snapshotState2, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final Bitmap bitmapGradientSquare$lambda$1 = GradientSquare$lambda$1(snapshotState);
        if (bitmapGradientSquare$lambda$1 != null) {
            return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GradientComponent.GradientSquare$lambda$12$lambda$11$lambda$7(bitmapGradientSquare$lambda$1, (ContentDrawScope) obj);
                }
            });
        }
        RuntimeShader runtimeShaderGradientSquare$lambda$4 = GradientSquare$lambda$4(snapshotState2);
        if (runtimeShaderGradientSquare$lambda$4 != null) {
            final Brush5 brush5ShaderBrush = Brush2.ShaderBrush(runtimeShaderGradientSquare$lambda$4);
            runtimeShaderGradientSquare$lambda$4.setFloatUniform("size", Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)));
            DrawResult drawResultOnDrawBehind = drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GradientComponent.GradientSquare$lambda$12$lambda$11$lambda$9$lambda$8(brush5ShaderBrush, (DrawScope) obj);
                }
            });
            if (drawResultOnDrawBehind != null) {
                return drawResultOnDrawBehind;
            }
        }
        return drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GradientComponent.GradientSquare$lambda$12$lambda$11$lambda$10((DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientSquare$lambda$12$lambda$11$lambda$9$lambda$8(Brush5 brush5, DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        DrawScope.m6957drawRectAsUm42w$default(onDrawBehind, brush5, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientSquare$lambda$12$lambda$11$lambda$10(DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientSquare$lambda$16$lambda$15(ImmutableList immutableList, SnapshotState snapshotState, SnapshotState snapshotState2, IntSize intSize) {
        if (((int) (intSize.getPackedValue() >> 32)) > 0 && ((int) (intSize.getPackedValue() & 4294967295L)) > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                arrayList.add(Float.valueOf(point.getX() * ((int) (intSize.getPackedValue() >> 32))));
                arrayList.add(Float.valueOf(point.getY() * ((int) (intSize.getPackedValue() & 4294967295L))));
            }
            float[] floatArray = CollectionsKt.toFloatArray(arrayList);
            RuntimeShader runtimeShaderM2013m = C16610xb1cbd9d3.m2013m(StringsKt.replace$default(SHADER_SOURCE, "<size>", String.valueOf(floatArray.length), false, 4, (Object) null));
            runtimeShaderM2013m.setFloatUniform("size", (int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & 4294967295L));
            runtimeShaderM2013m.setFloatUniform("points", floatArray);
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(0.0f, (int) (intSize.getPackedValue() & 4294967295L));
            runtimeShaderM2013m.setLocalMatrix(matrix);
            snapshotState.setValue(runtimeShaderM2013m);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & 4294967295L), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                GradientComponentKt$$ExternalSyntheticApiModelOutline3.m2124m();
                RenderNode renderNodeM94m = StretchOverscrollNode$$ExternalSyntheticApiModelOutline0.m94m("gradient_cache");
                renderNodeM94m.setPosition(0, 0, (int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & 4294967295L));
                RecordingCanvas recordingCanvasBeginRecording = renderNodeM94m.beginRecording();
                Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "beginRecording(...)");
                Brush2.ShaderBrush(runtimeShaderM2013m);
                Paint paint = new Paint();
                paint.setShader(runtimeShaderM2013m);
                recordingCanvasBeginRecording.drawRect(0.0f, 0.0f, (int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & 4294967295L), paint);
                renderNodeM94m.endRecording();
                canvas.drawRenderNode(renderNodeM94m);
                snapshotState2.setValue(bitmapCreateBitmap);
            } catch (Exception unused) {
                snapshotState2.setValue(null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientSquare$lambda$12$lambda$11$lambda$7(Bitmap bitmap, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        AndroidCanvas_androidKt.getNativeCanvas(onDrawWithContent.getDrawContext().getCanvas()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return Unit.INSTANCE;
    }

    private static final void GradientSquarePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(488020846);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488020846, i, -1, "com.robinhood.android.investmentstracker.composables.components.GradientSquarePreview (GradientComponent.kt:256)");
            }
            GradientSquare(extensions2.toPersistentList(CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, 1.0f), new Point(0.029368576f, 0.6666667f), new Point(0.05873715f, 0.6666667f), new Point(0.08810572f, 0.6666667f), new Point(0.1174743f, 0.6666667f), new Point(0.14684288f, 0.6666667f), new Point(0.17621145f, 0.6666667f), new Point(0.20558003f, 0.6666667f), new Point(0.2349486f, 0.6666667f), new Point(0.26431718f, 0.6666667f), new Point(0.29368576f, 0.6666667f), new Point(0.32305434f, 0.7666667f), new Point(0.3524229f, 0.8666667f), new Point(0.38179147f, 0.8666667f), new Point(0.41116005f, 0.8666667f), new Point(0.44052863f, 0.7666667f), new Point(0.4698972f, 0.766667f), new Point(0.4992658f, 0.6666667f), new Point(0.52863437f, 0.6666667f), new Point(0.55800295f, 0.6666667f), new Point(0.5873715f, 0.6666667f), new Point(0.6167401f, 0.6666667f), new Point(0.6461087f, 0.6666667f), new Point(0.67547727f, 0.6666667f), new Point(0.7048458f, 0.6666667f), new Point(0.73421437f, 0.6666667f), new Point(0.76358294f, 0.6666667f), new Point(0.7929515f, 0.6666667f), new Point(0.8223201f, 0.6666667f), new Point(0.8516887f, 0.6666667f), new Point(0.88105726f, 0.8305f), new Point(1.0f, 1.0f)})), null, composerStartRestartGroup, Point.$stable, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GradientComponent.GradientSquarePreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
