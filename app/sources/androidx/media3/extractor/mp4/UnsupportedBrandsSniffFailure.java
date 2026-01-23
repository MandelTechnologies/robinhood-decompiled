package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* loaded from: classes4.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, int[] iArr) {
        ImmutableIntArray immutableIntArrayM1018of;
        this.majorBrand = i;
        if (iArr != null) {
            immutableIntArrayM1018of = ImmutableIntArray.copyOf(iArr);
        } else {
            immutableIntArrayM1018of = ImmutableIntArray.m1018of();
        }
        this.compatibleBrands = immutableIntArrayM1018of;
    }
}
