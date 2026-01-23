package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: TypedValues.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/extensions/TypedValues;", "", "<init>", "()V", "RANGE_INT", "Lkotlin/ranges/IntRange;", "getRANGE_INT", "()Lkotlin/ranges/IntRange;", "RANGE_COLOR", "getRANGE_COLOR", "isInt", "", "typedValueType", "", "isColorInt", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TypedValues {
    public static final TypedValues INSTANCE = new TypedValues();
    private static final PrimitiveRanges2 RANGE_INT = new PrimitiveRanges2(16, 31);
    private static final PrimitiveRanges2 RANGE_COLOR = new PrimitiveRanges2(28, 31);

    private TypedValues() {
    }

    public final PrimitiveRanges2 getRANGE_INT() {
        return RANGE_INT;
    }

    public final PrimitiveRanges2 getRANGE_COLOR() {
        return RANGE_COLOR;
    }

    public final boolean isInt(int typedValueType) {
        PrimitiveRanges2 primitiveRanges2 = RANGE_INT;
        return typedValueType <= primitiveRanges2.getLast() && primitiveRanges2.getFirst() <= typedValueType;
    }

    public final boolean isColorInt(int typedValueType) {
        PrimitiveRanges2 primitiveRanges2 = RANGE_COLOR;
        return typedValueType <= primitiveRanges2.getLast() && primitiveRanges2.getFirst() <= typedValueType;
    }
}
