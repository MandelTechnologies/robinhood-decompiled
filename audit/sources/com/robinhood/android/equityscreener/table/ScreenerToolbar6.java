package com.robinhood.android.equityscreener.table;

import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.saveable.MapSaver;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: ScreenerToolbar.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0010R+\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/ToolbarState;", "", "heightRange", "Lkotlin/ranges/IntRange;", "initialScrollOffset", "", "<init>", "(Lkotlin/ranges/IntRange;F)V", "minHeight", "", "maxHeight", "rangeDifference", "getRangeDifference", "()I", "consumed", "getConsumed", "()F", "setConsumed", "(F)V", "scrollTopLimitReached", "", "getScrollTopLimitReached", "()Z", "setScrollTopLimitReached", "(Z)V", "value", "scrollOffset", "getScrollOffset", "setScrollOffset", "progress", "getProgress", "height", "getHeight", "<set-?>", "internalScrollOffset", "getInternalScrollOffset", "setInternalScrollOffset", "internalScrollOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.table.ToolbarState, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerToolbar6 {
    private static final Saver<ScreenerToolbar6, Object> Saver;
    private float consumed;

    /* renamed from: internalScrollOffset$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 internalScrollOffset;
    private int maxHeight;
    private int minHeight;
    private boolean scrollTopLimitReached;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ScreenerToolbar6(PrimitiveRanges2 heightRange, float f) {
        Intrinsics.checkNotNullParameter(heightRange, "heightRange");
        if (heightRange.getFirst() < 0 || heightRange.getLast() < heightRange.getFirst()) {
            throw new IllegalArgumentException("The lowest height value must be >= 0 and the highest height value must be >= the lowest value.");
        }
        this.minHeight = heightRange.getFirst();
        this.maxHeight = heightRange.getLast();
        this.scrollTopLimitReached = true;
        this.internalScrollOffset = SnapshotFloatState3.mutableFloatStateOf(f);
    }

    public /* synthetic */ ScreenerToolbar6(PrimitiveRanges2 primitiveRanges2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(primitiveRanges2, (i & 2) != 0 ? 0.0f : f);
    }

    private final int getRangeDifference() {
        return this.maxHeight - this.minHeight;
    }

    public final float getConsumed() {
        return this.consumed;
    }

    public final void setConsumed(float f) {
        this.consumed = f;
    }

    public final boolean getScrollTopLimitReached() {
        return this.scrollTopLimitReached;
    }

    public final void setScrollTopLimitReached(boolean z) {
        this.scrollTopLimitReached = z;
    }

    public final float getScrollOffset() {
        return getInternalScrollOffset();
    }

    public final void setScrollOffset(float f) {
        if (this.scrollTopLimitReached) {
            float internalScrollOffset = getInternalScrollOffset();
            setInternalScrollOffset(RangesKt.coerceIn(f, 0.0f, getRangeDifference()));
            this.consumed = internalScrollOffset - getInternalScrollOffset();
            return;
        }
        this.consumed = 0.0f;
    }

    public final float getProgress() {
        return RangesKt.coerceIn(1 - ((this.maxHeight - getHeight()) / getRangeDifference()), 0.0f, 1.0f);
    }

    public final float getHeight() {
        return RangesKt.coerceIn(this.maxHeight - getScrollOffset(), this.minHeight, this.maxHeight);
    }

    private final float getInternalScrollOffset() {
        return this.internalScrollOffset.getFloatValue();
    }

    private final void setInternalScrollOffset(float f) {
        this.internalScrollOffset.setFloatValue(f);
    }

    /* compiled from: ScreenerToolbar.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/ToolbarState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/android/equityscreener/table/ToolbarState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityscreener.table.ToolbarState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<ScreenerToolbar6, Object> getSaver() {
            return ScreenerToolbar6.Saver;
        }
    }

    static {
        final String str = "MinHeight";
        final String str2 = "MaxHeight";
        final String str3 = "ScrollOffset";
        Saver = MapSaver.mapSaver(new Function2() { // from class: com.robinhood.android.equityscreener.table.ToolbarState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScreenerToolbar6.Saver$lambda$3$lambda$1(str, str2, str3, (Saver5) obj, (ScreenerToolbar6) obj2);
            }
        }, new Function1() { // from class: com.robinhood.android.equityscreener.table.ToolbarState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenerToolbar6.Saver$lambda$3$lambda$2(str, str2, str3, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Saver$lambda$3$lambda$1(String str, String str2, String str3, Saver5 mapSaver, ScreenerToolbar6 it) {
        Intrinsics.checkNotNullParameter(mapSaver, "$this$mapSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.mapOf(Tuples4.m3642to(str, Integer.valueOf(it.minHeight)), Tuples4.m3642to(str2, Integer.valueOf(it.maxHeight)), Tuples4.m3642to(str3, Float.valueOf(it.getScrollOffset())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenerToolbar6 Saver$lambda$3$lambda$2(String str, String str2, String str3, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(str);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = it.get(str2);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(iIntValue, ((Integer) obj2).intValue());
        Object obj3 = it.get(str3);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Float");
        return new ScreenerToolbar6(primitiveRanges2, ((Float) obj3).floatValue());
    }
}
