package com.robinhood.android.graphics;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.core.content.res.TypedArray2;
import com.robinhood.utils.Colors;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TypedValues;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: Gradient.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/graphics/Gradient;", "", "colors", "", "positions", "", "<init>", "([I[F)V", "getColors", "()[I", "getPositions", "()[F", "size", "", "getSize", "()I", "isEmpty", "", "toString", "", "equals", "other", "hashCode", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class Gradient {
    private final int[] colors;
    private final float[] positions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Gradient EMPTY = new Gradient(new int[0], new float[0]);

    public Gradient(int[] colors, float[] positions) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.colors = colors;
        this.positions = positions;
        if (colors.length == positions.length) {
            return;
        }
        String string2 = Arrays.toString(colors);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = Arrays.toString(positions);
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        throw new IllegalArgumentException(("Colors and positions must be the same size: " + string2 + ", " + string3).toString());
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final int getSize() {
        return this.colors.length;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gradient(colors=[");
        sb.append(ArraysKt.joinToString$default(this.colors, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.robinhood.android.graphics.Gradient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Gradient.toString$lambda$2$lambda$1(((Integer) obj).intValue());
            }
        }, 31, (Object) null));
        sb.append("], positions=");
        String string2 = Arrays.toString(this.positions);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$2$lambda$1(int i) {
        return Colors.INSTANCE.toArgbString(i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Gradient.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.robinhood.android.graphics.Gradient");
        Gradient gradient = (Gradient) other;
        return Arrays.equals(this.colors, gradient.colors) && Arrays.equals(this.positions, gradient.positions);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.colors) * 31) + Arrays.hashCode(this.positions);
    }

    /* compiled from: Gradient.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\u0010\u000f\u001a\u00060\u0010R\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/graphics/Gradient$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/robinhood/android/graphics/Gradient;", "getEMPTY", "()Lcom/robinhood/android/graphics/Gradient;", "of", ResourceTypes.COLOR, "", "fromTypedArray", "values", "Landroid/content/res/TypedArray;", "fromTypedValue", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Gradient getEMPTY() {
            return Gradient.EMPTY;
        }

        /* renamed from: of */
        public final Gradient m2057of(int color) {
            return new Gradient(new int[]{color}, new float[]{0.0f});
        }

        @SuppressLint({"Recycle", "ResourceType"})
        public final Gradient fromTypedArray(TypedArray values) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(values, "values");
            int length = values.length();
            if (length == 0) {
                return getEMPTY();
            }
            Resources resources = values.getResources();
            int[] iArr = new int[length];
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(TypedArray2.getResourceIdOrThrow(values, i));
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "obtainTypedArray(...)");
                if (typedArrayObtainTypedArray.length() != 2) {
                    throw new IllegalArgumentException(("Stop array must be of length 2: " + typedArrayObtainTypedArray).toString());
                }
                int colorOrThrow = TypedArray2.getColorOrThrow(typedArrayObtainTypedArray, 0);
                float floatOrThrow = TypedArray2.getFloatOrThrow(typedArrayObtainTypedArray, 1);
                iArr[i] = colorOrThrow;
                fArr[i] = floatOrThrow;
                Unit unit = Unit.INSTANCE;
                typedArrayObtainTypedArray.recycle();
            }
            return new Gradient(iArr, fArr);
        }

        @SuppressLint({"Recycle"})
        public final Gradient fromTypedValue(Resources.Theme theme, TypedValue value) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            int i = value.type;
            PrimitiveRanges2 range_color = TypedValues.INSTANCE.getRANGE_COLOR();
            int first = range_color.getFirst();
            if (i <= range_color.getLast() && first <= i) {
                return m2057of(value.data);
            }
            if (i == 1) {
                TypedArray typedArrayObtainTypedArray = theme.getResources().obtainTypedArray(value.resourceId);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "obtainTypedArray(...)");
                Gradient gradientFromTypedArray = fromTypedArray(typedArrayObtainTypedArray);
                typedArrayObtainTypedArray.recycle();
                return gradientFromTypedArray;
            }
            if (i == 0) {
                return null;
            }
            throw new UnsupportedOperationException("Unsupported value type: " + value);
        }
    }
}
