package com.robinhood.android.charts;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Placeholders.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"ChartPlaceholder", "", "modifier", "Landroidx/compose/ui/Modifier;", "loading", "", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "mountainPoints", "", "Lcom/robinhood/android/charts/model/Point;", "MountainsShape", "Landroidx/compose/foundation/shape/GenericShape;", "getMountainsShape", "()Landroidx/compose/foundation/shape/GenericShape;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.PlaceholdersKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Placeholders2 {
    private static final List<Point> mountainPoints = CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, 0.0f), new Point(0.0f, 0.27f), new Point(0.07f, 0.429f), new Point(0.248f, 0.12f), new Point(0.328f, 0.27f), new Point(0.412f, 0.12f), new Point(0.648f, 0.581f), new Point(0.83f, 0.27f), new Point(0.912f, 0.429f), new Point(1.0f, 0.27f), new Point(1.0f, 0.0f)});
    private static final GenericShape MountainsShape = new GenericShape(new Function3() { // from class: com.robinhood.android.charts.PlaceholdersKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Placeholders2.MountainsShape$lambda$3((Path) obj, (Size) obj2, (LayoutDirection) obj3);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartPlaceholder$lambda$0(Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        ChartPlaceholder(modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartPlaceholder(final Modifier modifier, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifierM4871backgroundbw27NRU;
        Composer composerStartRestartGroup = composer.startRestartGroup(574187377);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(z)) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    z = ((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue();
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(574187377, i3, -1, "com.robinhood.android.charts.ChartPlaceholder (Placeholders.kt:18)");
                }
                composerStartRestartGroup.startReplaceGroup(2038260708);
                if (!z) {
                    modifierM4871backgroundbw27NRU = com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder(modifier, true, MountainsShape);
                } else {
                    modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(PltModifiers.recordLoadingState$default(modifier, true, null, 2, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), MountainsShape);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(modifierM4871backgroundbw27NRU, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(2038260708);
                if (!z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(modifierM4871backgroundbw27NRU, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.PlaceholdersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Placeholders2.ChartPlaceholder$lambda$0(modifier, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final GenericShape getMountainsShape() {
        return MountainsShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountainsShape$lambda$3(Path GenericShape, Size size, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(GenericShape, "$this$GenericShape");
        Intrinsics.checkNotNullParameter(layoutDirection, "<unused var>");
        GenericShape.reset();
        Rect rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(size.getPackedValue());
        long translation = RectExtensions.getTranslation(rectM6592toRectuvyYCjk, new Point(0.0f, 0.0f));
        GenericShape.moveTo(Float.intBitsToFloat((int) (translation >> 32)), Float.intBitsToFloat((int) (translation & 4294967295L)));
        List<Point> list = mountainPoints;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Offset.m6534boximpl(RectExtensions.getTranslation(rectM6592toRectuvyYCjk, (Point) it.next())));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long packedValue = ((Offset) it2.next()).getPackedValue();
            GenericShape.lineTo(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & 4294967295L)));
        }
        GenericShape.close();
        return Unit.INSTANCE;
    }
}
