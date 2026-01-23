package com.robinhood.shared.trading.tradecomponentscompose.input;

import androidx.compose.p011ui.text.input.OffsetMapping;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeQuantityNumberVisualFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/input/NumberOffsetMapper;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetCharIndexes", "", "", "<init>", "(Ljava/util/List;)V", "originalToTransformed", "offset", "transformedToOriginal", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.input.NumberOffsetMapper, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeQuantityNumberVisualFormatter2 implements OffsetMapping {
    public static final int $stable = 8;
    private final List<Integer> offsetCharIndexes;

    public TradeQuantityNumberVisualFormatter2(List<Integer> offsetCharIndexes) {
        Intrinsics.checkNotNullParameter(offsetCharIndexes, "offsetCharIndexes");
        this.offsetCharIndexes = offsetCharIndexes;
    }

    @Override // androidx.compose.p011ui.text.input.OffsetMapping
    public int originalToTransformed(int offset) {
        Iterator<T> it = this.offsetCharIndexes.iterator();
        while (it.hasNext()) {
            if (offset >= ((Number) it.next()).intValue()) {
                offset++;
            }
        }
        return offset;
    }

    @Override // androidx.compose.p011ui.text.input.OffsetMapping
    public int transformedToOriginal(int offset) {
        Iterator it = CollectionsKt.reversed(this.offsetCharIndexes).iterator();
        while (it.hasNext()) {
            if (offset >= ((Number) it.next()).intValue()) {
                offset--;
            }
        }
        return Math.max(0, offset);
    }
}
