package com.robinhood.android.gold.sparkle.compose;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.SizeF;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.TileMode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.gold.sparkle.SparkleManager;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldSparkleBrush.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\"\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0002X\u008a\u0084\u0002"}, m3636d2 = {"sparkleGradientStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "[Lkotlin/Pair;", "sparkleBrushAndShaderData", "Lcom/robinhood/android/gold/sparkle/compose/SparkleBrushAndShaderData;", "Landroidx/compose/ui/graphics/Brush$Companion;", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;", "stops", "sparkleBrushAndShaderData-EPk0efs", "(Landroidx/compose/ui/graphics/Brush$Companion;J[Lkotlin/Pair;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/gold/sparkle/compose/SparkleBrushAndShaderData;", "sparkle", "Landroidx/compose/ui/graphics/Brush;", "sparkle-EPk0efs", "(Landroidx/compose/ui/graphics/Brush$Companion;J[Lkotlin/Pair;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Brush;", "lib-gold-sparkle-compose_externalDebug", "translationOffset", "gradientOffsets"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSparkleBrush {
    private static final Tuples2<Float, Color>[] sparkleGradientStops = {Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4294954089L))), Tuples4.m3642to(Float.valueOf(0.1f), Color.m6701boximpl(Color2.Color(4294957972L))), Tuples4.m3642to(Float.valueOf(0.15f), Color.m6701boximpl(Color2.Color(4294961597L))), Tuples4.m3642to(Float.valueOf(0.2f), Color.m6701boximpl(Color2.Color(4294957972L))), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(Color2.Color(4294954089L))), Tuples4.m3642to(Float.valueOf(0.8f), Color.m6701boximpl(Color2.Color(4294957972L))), Tuples4.m3642to(Float.valueOf(0.85f), Color.m6701boximpl(Color2.Color(4294961597L))), Tuples4.m3642to(Float.valueOf(0.9f), Color.m6701boximpl(Color2.Color(4294957972L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4294954089L)))};

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 sparkleBrushAndShaderData_EPk0efs$lambda$4$lambda$3(long j, SizeF sizeF, SnapshotState snapshotState) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = (-Float.intBitsToFloat(i)) + Float.intBitsToFloat((int) (sparkleBrushAndShaderData_EPk0efs$lambda$1(snapshotState) >> 32));
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = (-Float.intBitsToFloat(i2)) + Float.intBitsToFloat((int) (sparkleBrushAndShaderData_EPk0efs$lambda$1(snapshotState) & 4294967295L));
        Offset offsetM6534boximpl = Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)));
        float width = (sizeF.getWidth() + Float.intBitsToFloat((int) (sparkleBrushAndShaderData_EPk0efs$lambda$1(snapshotState) >> 32))) - Float.intBitsToFloat(i);
        float height = (sizeF.getHeight() + Float.intBitsToFloat((int) (sparkleBrushAndShaderData_EPk0efs$lambda$1(snapshotState) & 4294967295L))) - Float.intBitsToFloat(i2);
        return Tuples4.m3642to(offsetM6534boximpl, Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32))));
    }

    /* renamed from: sparkleBrushAndShaderData-EPk0efs, reason: not valid java name */
    public static final SparkleBrushAndShaderData m15095sparkleBrushAndShaderDataEPk0efs(Brush.Companion sparkleBrushAndShaderData, final long j, Tuples2<Float, Color>[] tuples2Arr, Composer composer, int i, int i2) {
        ComponentCallbacks2 componentCallbacks2;
        SparkleManager sparkleManager;
        SizeF sizeF;
        int i3;
        Intrinsics.checkNotNullParameter(sparkleBrushAndShaderData, "$this$sparkleBrushAndShaderData");
        composer.startReplaceGroup(-1475436272);
        Tuples2<Float, Color>[] tuples2Arr2 = (i2 & 2) != 0 ? sparkleGradientStops : tuples2Arr;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1475436272, i, -1, "com.robinhood.android.gold.sparkle.compose.sparkleBrushAndShaderData (GoldSparkleBrush.kt:55)");
        }
        composer.startReplaceGroup(-555042429);
        if (((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            sparkleManager = PreviewSparkleManager.INSTANCE;
        } else {
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            sparkleManager = ((GoldSparkleBrush4) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).sparkleManager();
        }
        composer.endReplaceGroup();
        SizeF displayDimensions = sparkleManager.getDisplayDimensions();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            float width = displayDimensions.getWidth();
            i3 = 32;
            sizeF = displayDimensions;
            objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(displayDimensions.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(width) << 32))), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        } else {
            sizeF = displayDimensions;
            i3 = 32;
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        long jSparkleBrushAndShaderData_EPk0efs$lambda$1 = sparkleBrushAndShaderData_EPk0efs$lambda$1(snapshotState);
        composer.startReplaceGroup(-1633490746);
        int i4 = i3;
        boolean zChanged = ((((i & 112) ^ 48) > i4 && composer.changed(j)) || (i & 48) == i4) | composer.changed(jSparkleBrushAndShaderData_EPk0efs$lambda$1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            final SizeF sizeF2 = sizeF;
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldSparkleBrush.sparkleBrushAndShaderData_EPk0efs$lambda$4$lambda$3(j, sizeF2, snapshotState);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        if (!((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(sparkleManager) | composer.changedInstance(lifecycleOwner);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new GoldSparkleBrush2(sparkleManager, lifecycleOwner, snapshotState, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 6);
        }
        long packedValue = sparkleBrushAndShaderData_EPk0efs$lambda$5(snapshotState4).getFirst().getPackedValue();
        long packedValue2 = sparkleBrushAndShaderData_EPk0efs$lambda$5(snapshotState4).getSecond().getPackedValue();
        Brush brushM6687linearGradientmHitzGk = sparkleBrushAndShaderData.m6687linearGradientmHitzGk((Tuples2<Float, Color>[]) Arrays.copyOf(tuples2Arr2, tuples2Arr2.length), packedValue, packedValue2, TileMode.INSTANCE.m6865getRepeated3opZhB0());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (packedValue2 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (packedValue2 & 4294967295L));
        ArrayList arrayList = new ArrayList(tuples2Arr2.length);
        for (Tuples2<Float, Color> tuples2 : tuples2Arr2) {
            arrayList.add(Integer.valueOf(Color2.m6735toArgb8_81llA(tuples2.getSecond().getValue())));
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        ArrayList arrayList2 = new ArrayList(tuples2Arr2.length);
        for (Tuples2<Float, Color> tuples22 : tuples2Arr2) {
            arrayList2.add(Float.valueOf(tuples22.getFirst().floatValue()));
        }
        SparkleBrushAndShaderData sparkleBrushAndShaderData2 = new SparkleBrushAndShaderData(brushM6687linearGradientmHitzGk, new LinearGradient(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, intArray, CollectionsKt.toFloatArray(arrayList2), Shader.TileMode.REPEAT));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sparkleBrushAndShaderData2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sparkleBrushAndShaderData_EPk0efs$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    private static final long sparkleBrushAndShaderData_EPk0efs$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final Tuples2<Offset, Offset> sparkleBrushAndShaderData_EPk0efs$lambda$5(SnapshotState4<Tuples2<Offset, Offset>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* renamed from: sparkle-EPk0efs, reason: not valid java name */
    public static final Brush m15094sparkleEPk0efs(Brush.Companion sparkle, long j, Tuples2<Float, Color>[] tuples2Arr, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparkle, "$this$sparkle");
        composer.startReplaceGroup(-1652288716);
        if ((i2 & 2) != 0) {
            tuples2Arr = sparkleGradientStops;
        }
        Tuples2<Float, Color>[] tuples2Arr2 = tuples2Arr;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1652288716, i, -1, "com.robinhood.android.gold.sparkle.compose.sparkle (GoldSparkleBrush.kt:127)");
        }
        Brush brush = m15095sparkleBrushAndShaderDataEPk0efs(sparkle, j, tuples2Arr2, composer, i & 1022, 0).getBrush();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return brush;
    }
}
