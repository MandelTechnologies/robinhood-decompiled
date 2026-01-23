package androidx.compose.p011ui.unit.fontscaling;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: MathUtils.android.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u0011"}, m3636d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "()V", "constrainedMap", "", "rangeMin", "rangeMax", "valueMin", "valueMax", "value", "lerp", "start", "stop", "amount", "lerpInv", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "ui-unit_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class MathUtils {
    public static final MathUtils INSTANCE = new MathUtils();

    public final float lerp(float start, float stop, float amount) {
        return start + ((stop - start) * amount);
    }

    public final float lerpInv(float a, float b, float value) {
        if (a == b) {
            return 0.0f;
        }
        return (value - a) / (b - a);
    }

    private MathUtils() {
    }

    public final float constrainedMap(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return lerp(rangeMin, rangeMax, Math.max(0.0f, Math.min(1.0f, lerpInv(valueMin, valueMax, value))));
    }
}
