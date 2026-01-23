package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CardUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"measureMaxWidthInDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/text/TextMeasurer;", "strings", "Lkotlinx/collections/immutable/ImmutableList;", "", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/TextMeasurer;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)F", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.CardUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CardUtils2 {
    public static final float measureMaxWidthInDp(TextMeasurer textMeasurer, ImmutableList<String> strings, TextStyle style, Composer composer, int i) {
        Integer num;
        Intrinsics.checkNotNullParameter(textMeasurer, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(style, "style");
        composer.startReplaceGroup(1978979727);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1978979727, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.measureMaxWidthInDp (CardUtils.kt:16)");
        }
        if (!strings.isEmpty()) {
            Iterator<String> it = strings.iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, it.next(), style, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32));
                while (it.hasNext()) {
                    String next = it.next();
                    Integer num2 = numValueOf;
                    numValueOf = Integer.valueOf((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, next, style, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32));
                    if (num2.compareTo(numValueOf) >= 0) {
                        numValueOf = num2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(num.intValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return fMo5013toDpu2uoSUM;
            }
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return fM7995constructorimpl;
        }
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM7995constructorimpl2;
    }
}
