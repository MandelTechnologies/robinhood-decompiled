package androidx.compose.p011ui.graphics;

import android.graphics.BlendModeColorFilter;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m3636d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", "BlendModeColorFilter-xETnrds", "(JI)Landroid/graphics/BlendModeColorFilter;", "BlendModeColorFilter", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final BlendModeColorFilter m6673BlendModeColorFilterxETnrds(long color, int blendMode) {
        BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline1.m222m();
        return BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m221m(Color2.m6735toArgb8_81llA(color), AndroidBlendMode_androidKt.m6593toAndroidBlendModes9anfk8(blendMode));
    }
}
