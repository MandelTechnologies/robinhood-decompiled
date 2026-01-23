package com.robinhood.android.generic.table;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aG\u0010\u0011\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"", "screenWidthDp", "", "Landroidx/compose/ui/unit/Dp;", "widths", "Lcom/robinhood/android/generic/table/TableScreenFillSettings;", "tableScreenFillSettings", "adjustColumnWidthsToFillScreen", "(ILjava/util/List;Lcom/robinhood/android/generic/table/TableScreenFillSettings;)Ljava/util/List;", "maxColumnWidth", "Lkotlin/Function0;", "", "contentToMeasure", "Lkotlin/Function2;", "contentToDisplay", "SubCompose-B-JOX-Q", "(Landroidx/compose/ui/unit/Dp;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "SubCompose", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubCompose_B_JOX_Q$lambda$12(C2002Dp c2002Dp, Function2 function2, Function4 function4, int i, Composer composer, int i2) {
        m14981SubComposeBJOXQ(c2002Dp, function2, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final List<C2002Dp> adjustColumnWidthsToFillScreen(int i, List<C2002Dp> widths, TableScreenFillSettings tableScreenFillSettings) {
        Intrinsics.checkNotNullParameter(widths, "widths");
        Intrinsics.checkNotNullParameter(tableScreenFillSettings, "tableScreenFillSettings");
        Iterator<T> it = widths.iterator();
        float value = 0.0f;
        while (it.hasNext()) {
            value += ((C2002Dp) it.next()).getValue();
        }
        float f = i - value;
        if (f <= 0.0f) {
            return widths;
        }
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl((f * 0.99f) / (widths.size() - tableScreenFillSettings.getColumnsToSkip().size()));
        List<C2002Dp> list = widths;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float value2 = ((C2002Dp) obj).getValue();
            if (!tableScreenFillSettings.getColumnsToSkip().contains(Integer.valueOf(i2))) {
                value2 = C2002Dp.m7995constructorimpl(value2 + fM7995constructorimpl);
            }
            arrayList.add(C2002Dp.m7993boximpl(value2));
            i2 = i3;
        }
        return arrayList;
    }

    /* renamed from: SubCompose-B-JOX-Q, reason: not valid java name */
    public static final void m14981SubComposeBJOXQ(final C2002Dp c2002Dp, final Function2<? super Composer, ? super Integer, Unit> contentToMeasure, final Function4<? super List<C2002Dp>, ? super C2002Dp, ? super Composer, ? super Integer, Unit> contentToDisplay, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(contentToMeasure, "contentToMeasure");
        Intrinsics.checkNotNullParameter(contentToDisplay, "contentToDisplay");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1618154316);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(contentToMeasure) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(contentToDisplay) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1618154316, i2, -1, "com.robinhood.android.generic.table.SubCompose (Utils.kt:46)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.generic.table.UtilsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UtilsKt.SubCompose_B_JOX_Q$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(companion, (Function1) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = ((i2 & 14) == 4) | ((i2 & 112) == 32) | composerStartRestartGroup.changed(density) | ((i2 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.generic.table.UtilsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UtilsKt.SubCompose_B_JOX_Q$lambda$11$lambda$10(contentToMeasure, c2002Dp, density, contentToDisplay, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifierClearAndSetSemantics, (Function2) objRememberedValue2, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.UtilsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.SubCompose_B_JOX_Q$lambda$12(c2002Dp, contentToMeasure, contentToDisplay, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubCompose_B_JOX_Q$lambda$3$lambda$2(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult SubCompose_B_JOX_Q$lambda$11$lambda$10(Function2 function2, C2002Dp c2002Dp, final Density density, final Function4 function4, final SubcomposeMeasureScope SubcomposeLayout, final Constraints constraints) {
        float fM7995constructorimpl;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        final ArrayList arrayList = new ArrayList();
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(SlotsEnum.MAIN, function2);
        ArrayList<Placeable> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Integer.MIN_VALUE;
        for (Placeable placeable : arrayList2) {
            if (c2002Dp != null) {
                fM7995constructorimpl = c2002Dp.getValue();
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(Integer.MAX_VALUE);
            }
            C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM(placeable.getWidth()));
            if (placeable.getWidth() > 0) {
                c2002DpM7993boximpl = C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(c2002DpM7993boximpl.getValue() + C2002Dp.m7995constructorimpl(8)));
            }
            arrayList.add(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(Math.min(fM7995constructorimpl, c2002DpM7993boximpl.getValue()))));
            if (placeable.getHeight() > intRef.element) {
                intRef.element = placeable.getHeight();
            }
        }
        return MeasureScope.layout$default(SubcomposeLayout, 0, 0, null, new Function1() { // from class: com.robinhood.android.generic.table.UtilsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtilsKt.SubCompose_B_JOX_Q$lambda$11$lambda$10$lambda$9(SubcomposeLayout, function4, arrayList, density, intRef, constraints, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubCompose_B_JOX_Q$lambda$11$lambda$10$lambda$9(SubcomposeMeasureScope subcomposeMeasureScope, final Function4 function4, final List list, final Density density, final Ref.IntRef intRef, Constraints constraints, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator<T> it = subcomposeMeasureScope.subcompose(SlotsEnum.DEPENDENT, ComposableLambda3.composableLambdaInstance(-1519821485, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.UtilsKt$SubCompose$2$1$2$1
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
                    ComposerKt.traceEventStart(-1519821485, i, -1, "com.robinhood.android.generic.table.SubCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Utils.kt:72)");
                }
                function4.invoke(list, C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM(intRef.element)), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })).iterator();
        while (it.hasNext()) {
            ((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue());
        }
        return Unit.INSTANCE;
    }
}
