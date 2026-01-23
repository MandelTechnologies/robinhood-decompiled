package com.robinhood.android.options.lib.simulatedreturn.slider;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DimensionSubcomposeLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlin/Function0;", "", "contentToMeasure", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "actualContent", "DimensionSubcomposeLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayoutKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DimensionSubcomposeLayout {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DimensionSubcomposeLayout$lambda$7(Function2 function2, Function3 function3, int i, Composer composer, int i2) {
        DimensionSubcomposeLayout(function2, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DimensionSubcomposeLayout(final Function2<? super Composer, ? super Integer, Unit> contentToMeasure, final Function3<? super Size, ? super Composer, ? super Integer, Unit> actualContent, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(contentToMeasure, "contentToMeasure");
        Intrinsics.checkNotNullParameter(actualContent, "actualContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(290763613);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(contentToMeasure) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(actualContent) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(290763613, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayout (DimensionSubcomposeLayout.kt:19)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayoutKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DimensionSubcomposeLayout.DimensionSubcomposeLayout$lambda$6$lambda$5(contentToMeasure, actualContent, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayoutKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DimensionSubcomposeLayout.DimensionSubcomposeLayout$lambda$7(contentToMeasure, actualContent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult DimensionSubcomposeLayout$lambda$6$lambda$5(Function2 function2, final Function3 function3, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(DimensionSubcomposeLayout3.MEASURE, function2);
        ArrayList<Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 10, null)));
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        for (Placeable placeable : arrayList) {
            intRef.element = Math.max(intRef.element, placeable.getWidth());
            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
        }
        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(DimensionSubcomposeLayout3.ACTUAL, ComposableLambda3.composableLambdaInstance(186231338, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayoutKt$DimensionSubcomposeLayout$1$1$actualPlaceables$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(186231338, i, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayout.<anonymous>.<anonymous>.<anonymous> (DimensionSubcomposeLayout.kt:38)");
                }
                Function3<Size, Composer, Integer, Unit> function32 = function3;
                float f = intRef.element;
                float f2 = intRef2.element;
                function32.invoke(Size.m6574boximpl(Size.m6575constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose2, 10));
        Iterator<T> it2 = listSubcompose2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Measurable) it2.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        return MeasureScope.layout$default(SubcomposeLayout, intRef.element, intRef2.element, null, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.DimensionSubcomposeLayoutKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DimensionSubcomposeLayout.DimensionSubcomposeLayout$lambda$6$lambda$5$lambda$4(arrayList2, intRef, intRef2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DimensionSubcomposeLayout$lambda$6$lambda$5$lambda$4(List list, Ref.IntRef intRef, Ref.IntRef intRef2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Placeable placeable = (Placeable) it.next();
            Placeable.PlacementScope.placeRelative$default(layout, placeable, (intRef.element - placeable.getWidth()) / 2, intRef2.element - placeable.getHeight(), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
