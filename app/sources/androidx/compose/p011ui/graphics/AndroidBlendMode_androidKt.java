package androidx.compose.p011ui.graphics;

import android.graphics.PorterDuff;
import androidx.compose.p011ui.graphics.BlendMode;
import kotlin.Metadata;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m3636d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toAndroidBlendMode", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {
    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m6594toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m6640equalsimpl0(i, companion.m6643getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6666getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6649getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6670getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6653getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6668getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6651getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6669getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6652getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6667getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6650getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6671getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6662getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6664getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6661getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6647getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6657getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m6640equalsimpl0(i, companion.m6659getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m6593toAndroidBlendModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m6640equalsimpl0(i, companion.m6643getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m6640equalsimpl0(i, companion.m6666getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m6640equalsimpl0(i, companion.m6649getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m6640equalsimpl0(i, companion.m6670getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m6640equalsimpl0(i, companion.m6653getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m6640equalsimpl0(i, companion.m6668getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m6640equalsimpl0(i, companion.m6651getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m6640equalsimpl0(i, companion.m6669getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m6640equalsimpl0(i, companion.m6652getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m6640equalsimpl0(i, companion.m6667getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m6640equalsimpl0(i, companion.m6650getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m6640equalsimpl0(i, companion.m6671getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m6640equalsimpl0(i, companion.m6662getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m6640equalsimpl0(i, companion.m6659getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m6640equalsimpl0(i, companion.m6664getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m6640equalsimpl0(i, companion.m6661getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m6640equalsimpl0(i, companion.m6647getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m6640equalsimpl0(i, companion.m6657getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m6640equalsimpl0(i, companion.m6646getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m6640equalsimpl0(i, companion.m6645getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m6640equalsimpl0(i, companion.m6655getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m6640equalsimpl0(i, companion.m6665getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m6640equalsimpl0(i, companion.m6648getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m6640equalsimpl0(i, companion.m6654getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m6640equalsimpl0(i, companion.m6660getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m6640equalsimpl0(i, companion.m6656getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m6640equalsimpl0(i, companion.m6663getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m6640equalsimpl0(i, companion.m6644getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m6640equalsimpl0(i, companion.m6658getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }
}
