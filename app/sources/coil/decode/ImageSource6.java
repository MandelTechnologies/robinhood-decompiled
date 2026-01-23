package coil.decode;

import coil.decode.ImageSource;
import kotlin.Metadata;

/* compiled from: ImageSource.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcoil/decode/ResourceMetadata;", "Lcoil/decode/ImageSource$Metadata;", "", "packageName", "", "resId", "density", "<init>", "(Ljava/lang/String;II)V", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "I", "getResId", "()I", "getDensity", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: coil.decode.ResourceMetadata, reason: use source file name */
/* loaded from: classes.dex */
public final class ImageSource6 extends ImageSource.Metadata {
    private final int density;
    private final String packageName;
    private final int resId;

    public final int getDensity() {
        return this.density;
    }

    public ImageSource6(String str, int i, int i2) {
        this.packageName = str;
        this.resId = i;
        this.density = i2;
    }
}
