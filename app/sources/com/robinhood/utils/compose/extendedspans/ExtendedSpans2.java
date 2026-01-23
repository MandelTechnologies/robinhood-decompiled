package com.robinhood.utils.compose.extendedspans;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExtendedSpans.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"drawBehind", "Landroidx/compose/ui/Modifier;", "spans", "Lcom/robinhood/utils/compose/extendedspans/ExtendedSpans;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.extendedspans.ExtendedSpansKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ExtendedSpans2 {
    public static final Modifier drawBehind(Modifier modifier, final ExtendedSpans spans) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(spans, "spans");
        return DrawModifierKt.drawBehind(modifier, new Function1() { // from class: com.robinhood.utils.compose.extendedspans.ExtendedSpansKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExtendedSpans2.drawBehind$lambda$2(spans, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawBehind$lambda$2(ExtendedSpans extendedSpans, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        List<ExtendedSpanPainter2> drawInstructions$lib_utils_compose_externalDebug = extendedSpans.getDrawInstructions$lib_utils_compose_externalDebug();
        int size = drawInstructions$lib_utils_compose_externalDebug.size();
        for (int i = 0; i < size; i++) {
            drawInstructions$lib_utils_compose_externalDebug.get(i).draw(drawBehind);
        }
        return Unit.INSTANCE;
    }
}
