package com.robinhood.android.investmentstracker.composables.components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import androidx.compose.foundation.StretchOverscrollNode$$ExternalSyntheticApiModelOutline0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush2;
import androidx.compose.p011ui.graphics.Brush5;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Canvas3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.PaintingStyle;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.C16609xb1cbd9d2;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.C16610xb1cbd9d3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GradientComponentWithDraw.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, m3636d2 = {"SHADER_SOURCE", "", "GradientComponentWithDrawPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "GradientComponentWithDraw", "points", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/Point;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug", "cachedBitmap", "Landroid/graphics/Bitmap;", "shader", "Landroid/graphics/RuntimeShader;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GradientComponentWithDraw {
    private static final String SHADER_SOURCE = "\n    uniform float2 screenSize;\n    uniform float[<size>] points;\n    uniform float isPositive;\n    float startingGreenDepth = 0;\n    float firstColorStopAlpha = 0.3;\n    float gradientLengthScaleDenominator = 3;\n    half4 main(in float2 fragCoord) {\n        float nearestPointY = -1;\n        float alpha = firstColorStopAlpha - (startingGreenDepth + ((fragCoord.y / screenSize.y) / gradientLengthScaleDenominator));\n        for (int i = 0; i < <size>; i+=2) {\n            if (points[i] - 1 < fragCoord.x && points[i] + 1 > fragCoord.x) {\n                nearestPointY = points[i+1]; \n            }\n        }\n        if (nearestPointY == -1) {\n            return half4(0, 0, 0, 0);\n        }\n        if (fragCoord.y < nearestPointY) {\n            alpha = 0;\n        }\n        if (isPositive < 1) {\n            return half4(0, 0.784, 0.019, alpha);\n        } else {\n            return half4(0.784, 0, 0.019, alpha);\n        }\n    }\n";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientComponentWithDraw$lambda$23(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GradientComponentWithDraw(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientComponentWithDrawPreview$lambda$1(int i, Composer composer, int i2) {
        GradientComponentWithDrawPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void GradientComponentWithDrawPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-567601738);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-567601738, i, -1, "com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawPreview (GradientComponentWithDraw.kt:71)");
            }
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(100));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            GradientComponentWithDraw(extensions2.toPersistentList(CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, 1.0f), new Point(0.029368576f, 0.6666667f), new Point(0.05873715f, 0.6666667f), new Point(0.08810572f, 0.6666667f), new Point(0.1174743f, 0.6666667f), new Point(0.14684288f, 0.6666667f), new Point(0.17621145f, 0.6666667f), new Point(0.20558003f, 0.6666667f), new Point(0.2349486f, 0.6666667f), new Point(0.26431718f, 0.6666667f), new Point(0.29368576f, 0.6666667f), new Point(0.32305434f, 0.7666667f), new Point(0.3524229f, 0.8666667f), new Point(0.38179147f, 0.8666667f), new Point(0.41116005f, 0.8666667f), new Point(0.44052863f, 0.7666667f), new Point(0.4698972f, 0.766667f), new Point(0.4992658f, 0.6666667f), new Point(0.52863437f, 0.6666667f), new Point(0.55800295f, 0.6666667f), new Point(0.5873715f, 0.6666667f), new Point(0.6167401f, 0.6666667f), new Point(0.6461087f, 0.6666667f), new Point(0.67547727f, 0.6666667f), new Point(0.7048458f, 0.6666667f), new Point(0.73421437f, 0.6666667f), new Point(0.76358294f, 0.6666667f), new Point(0.7929515f, 0.6666667f), new Point(0.8223201f, 0.6666667f), new Point(0.8516887f, 0.6666667f), new Point(0.88105726f, 0.8305f), new Point(1.0f, 1.0f)})), null, composerStartRestartGroup, Point.$stable, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GradientComponentWithDraw.GradientComponentWithDrawPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Bitmap GradientComponentWithDraw$lambda$3(SnapshotState<Bitmap> snapshotState) {
        return snapshotState.getValue();
    }

    private static final RuntimeShader GradientComponentWithDraw$lambda$6(SnapshotState<RuntimeShader> snapshotState) {
        return C16609xb1cbd9d2.m2012m(snapshotState.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GradientComponentWithDraw(final ImmutableList<Point> points, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        boolean z;
        Object objRememberedValue3;
        boolean z2;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(points, "points");
        Composer composerStartRestartGroup = composer.startRestartGroup(581953693);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(points) : composerStartRestartGroup.changedInstance(points) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(581953693, i3, -1, "com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDraw (GradientComponentWithDraw.kt:121)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i5 = i3 & 14;
                z = i5 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(points));
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GradientComponentWithDraw.GradientComponentWithDraw$lambda$14$lambda$13(snapshotState, snapshotState2, points, (CacheDrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifierFillMaxHeight$default, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z2 = i5 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(points));
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GradientComponentWithDraw.GradientComponentWithDraw$lambda$22$lambda$21(points, snapshotState2, snapshotState, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(OnRemeasuredModifier2.onSizeChanged(modifierDrawWithCache, (Function1) objRememberedValue4), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GradientComponentWithDraw.GradientComponentWithDraw$lambda$23(points, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i52 = i3 & 14;
            if (i52 != 4) {
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GradientComponentWithDraw.GradientComponentWithDraw$lambda$14$lambda$13(snapshotState, snapshotState2, points, (CacheDrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierDrawWithCache2 = DrawModifierKt.drawWithCache(modifierFillMaxHeight$default2, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if (i52 != 4) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GradientComponentWithDraw.GradientComponentWithDraw$lambda$22$lambda$21(points, snapshotState2, snapshotState, (IntSize) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            BoxKt.Box(OnRemeasuredModifier2.onSizeChanged(modifierDrawWithCache2, (Function1) objRememberedValue4), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult GradientComponentWithDraw$lambda$14$lambda$13(SnapshotState snapshotState, SnapshotState snapshotState2, ImmutableList immutableList, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final Bitmap bitmapGradientComponentWithDraw$lambda$3 = GradientComponentWithDraw$lambda$3(snapshotState);
        if (bitmapGradientComponentWithDraw$lambda$3 != null) {
            return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GradientComponentWithDraw.GradientComponentWithDraw$lambda$14$lambda$13$lambda$9(bitmapGradientComponentWithDraw$lambda$3, (ContentDrawScope) obj);
                }
            });
        }
        RuntimeShader runtimeShaderGradientComponentWithDraw$lambda$6 = GradientComponentWithDraw$lambda$6(snapshotState2);
        if (runtimeShaderGradientComponentWithDraw$lambda$6 != null) {
            final Brush5 brush5ShaderBrush = Brush2.ShaderBrush(runtimeShaderGradientComponentWithDraw$lambda$6);
            runtimeShaderGradientComponentWithDraw$lambda$6.setFloatUniform("screenSize", Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)));
            runtimeShaderGradientComponentWithDraw$lambda$6.setFloatUniform("isPositive", ((Point) CollectionsKt.first((List) immutableList)).getY() > ((Point) CollectionsKt.last((List) immutableList)).getY() ? 0.0f : 1.0f);
            DrawResult drawResultOnDrawBehind = drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GradientComponentWithDraw.m2125x3f7510ff(brush5ShaderBrush, (DrawScope) obj);
                }
            });
            if (drawResultOnDrawBehind != null) {
                return drawResultOnDrawBehind;
            }
        }
        return drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.GradientComponentWithDrawKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GradientComponentWithDraw.GradientComponentWithDraw$lambda$14$lambda$13$lambda$12((DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GradientComponentWithDraw$lambda$14$lambda$13$lambda$11$lambda$10 */
    public static final Unit m2125x3f7510ff(Brush5 brush5, DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        DrawScope.m6957drawRectAsUm42w$default(onDrawBehind, brush5, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientComponentWithDraw$lambda$14$lambda$13$lambda$12(DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit GradientComponentWithDraw$lambda$22$lambda$21(ImmutableList immutableList, SnapshotState snapshotState, SnapshotState snapshotState2, IntSize intSize) {
        long packedValue = intSize.getPackedValue();
        char c = ' ';
        int i = (int) (packedValue >> 32);
        long j = 4294967295L;
        int i2 = (int) (packedValue & 4294967295L);
        if (i == 0 || i2 == 0) {
            return Unit.INSTANCE;
        }
        ImageBitmap imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888));
        Canvas Canvas = Canvas3.Canvas(imageBitmapAsImageBitmap);
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo6617setColor8_81llA(Color.INSTANCE.m6724getRed0d7_KjU());
        Paint.mo6621setStylek9PVt8s(PaintingStyle.INSTANCE.m6803getStrokeTiuSbCo());
        Paint.setStrokeWidth(2.0f);
        Paint.setAntiAlias(true);
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            Path Path = AndroidPath_androidKt.Path();
            float f = i;
            char c2 = c;
            float f2 = i2;
            Path.moveTo(((Point) immutableList.get(0)).getX() * f, ((Point) immutableList.get(0)).getY() * f2);
            int size = immutableList.size();
            int i3 = 1;
            while (i3 < size) {
                Path.lineTo(((Point) immutableList.get(i3)).getX() * f, ((Point) immutableList.get(i3)).getY() * f2);
                i3++;
                j = j;
            }
            Canvas.drawPath(Path, Paint);
            c = c2;
        }
        char c3 = c;
        long j2 = j;
        int[] iArr = new int[i * i2];
        AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmapAsImageBitmap).getPixels(iArr, 0, i, 0, 0, i, i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                if (((iArr[(i4 * i) + i5] >> 24) & 255) != 0 && !linkedHashMap.containsKey(Integer.valueOf(i5))) {
                    linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(i4));
                }
            }
        }
        ArrayList<Point> arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Point(((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Point point : arrayList) {
            arrayList2.add(Float.valueOf(point.getX()));
            arrayList2.add(Float.valueOf(point.getY()));
        }
        float[] floatArray = CollectionsKt.toFloatArray(arrayList2);
        RuntimeShader runtimeShaderM2013m = C16610xb1cbd9d3.m2013m(StringsKt.replace$default(SHADER_SOURCE, "<size>", String.valueOf(floatArray.length), false, 4, (Object) null));
        runtimeShaderM2013m.setFloatUniform("screenSize", (int) (intSize.getPackedValue() >> c3), (int) (intSize.getPackedValue() & j2));
        runtimeShaderM2013m.setFloatUniform("isPositive", ((Point) CollectionsKt.first((List) immutableList)).getY() > ((Point) CollectionsKt.last((List) immutableList)).getY() ? 0.0f : 1.0f);
        runtimeShaderM2013m.setFloatUniform("points", floatArray);
        snapshotState.setValue(runtimeShaderM2013m);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (intSize.getPackedValue() >> c3), (int) (intSize.getPackedValue() & j2), Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            GradientComponentKt$$ExternalSyntheticApiModelOutline3.m2124m();
            RenderNode renderNodeM94m = StretchOverscrollNode$$ExternalSyntheticApiModelOutline0.m94m("gradient_cache");
            renderNodeM94m.setPosition(0, 0, (int) (intSize.getPackedValue() >> c3), (int) (intSize.getPackedValue() & j2));
            RecordingCanvas recordingCanvasBeginRecording = renderNodeM94m.beginRecording();
            Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "beginRecording(...)");
            Brush2.ShaderBrush(runtimeShaderM2013m);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setShader(GradientComponentWithDraw$lambda$6(snapshotState));
            recordingCanvasBeginRecording.drawRect(0.0f, 0.0f, (int) (intSize.getPackedValue() >> c3), (int) (intSize.getPackedValue() & j2), paint);
            renderNodeM94m.endRecording();
            canvas.drawRenderNode(renderNodeM94m);
            snapshotState2.setValue(bitmapCreateBitmap);
        } catch (Exception unused) {
            snapshotState2.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientComponentWithDraw$lambda$14$lambda$13$lambda$9(Bitmap bitmap, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        AndroidCanvas_androidKt.getNativeCanvas(onDrawWithContent.getDrawContext().getCanvas()).drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return Unit.INSTANCE;
    }
}
