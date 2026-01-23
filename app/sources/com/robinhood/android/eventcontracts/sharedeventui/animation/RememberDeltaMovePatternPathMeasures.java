package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.futures.sharedfuturesui.animations.PathMeasures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RememberDeltaMovePatternPathMeasures.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"rememberDeltaMovePatternPathMeasures", "", "Landroidx/compose/ui/graphics/PathMeasure;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "side", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.RememberDeltaMovePatternPathMeasuresKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RememberDeltaMovePatternPathMeasures {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<PathMeasure> rememberDeltaMovePatternPathMeasures(BoxWithConstraints4 boxWithConstraints4, MovingDeltasAnimation8 side, Composer composer, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(boxWithConstraints4, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        composer.startReplaceGroup(189233582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189233582, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.rememberDeltaMovePatternPathMeasures (RememberDeltaMovePatternPathMeasures.kt:18)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        long constraints = boxWithConstraints4.getConstraints();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changed(side.ordinal())) || (i & 48) == 32) | composer.changed(constraints) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = PathPattern2.buildPaths(Constraints.m7975getMaxWidthimpl(boxWithConstraints4.getConstraints()), Constraints.m7974getMaxHeightimpl(boxWithConstraints4.getConstraints()), density, side);
            composer.updateRememberedValue(objRememberedValue);
        }
        final List list = (List) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1464860379);
        if (((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, boxWithConstraints4.mo5103getMaxWidthD9Ej5fM(), boxWithConstraints4.mo5102getMaxHeightD9Ej5fM());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(list);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.animation.RememberDeltaMovePatternPathMeasuresKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RememberDeltaMovePatternPathMeasures.rememberDeltaMovePatternPathMeasures$lambda$3$lambda$2(list, (DrawScope) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Canvas2.Canvas(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue2, composer, 0);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(list);
        Object objRememberedValue3 = composer.rememberedValue();
        if (!zChanged2) {
            obj = objRememberedValue3;
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(PathMeasures.pathMeasure((Path) it.next()));
                }
                composer.updateRememberedValue(arrayList);
                obj = arrayList;
            }
        }
        List<PathMeasure> list3 = (List) obj;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberDeltaMovePatternPathMeasures$lambda$3$lambda$2(List list, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Color.Companion companion = Color.INSTANCE;
        for (Tuples2 tuples2 : CollectionsKt.zip(list, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion.m6724getRed0d7_KjU()), Color.m6701boximpl(companion.m6717getBlue0d7_KjU()), Color.m6701boximpl(companion.m6728getYellow0d7_KjU()), Color.m6701boximpl(companion.m6721getGreen0d7_KjU())}))) {
            DrawScope.m6955drawPathLG529CI$default(Canvas, (Path) tuples2.component1(), ((Color) tuples2.component2()).getValue(), 0.0f, new Stroke(1.0f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
        return Unit.INSTANCE;
    }
}
