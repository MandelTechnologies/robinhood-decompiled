package coil.size;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Size.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"", "width", "height", "Lcoil/size/Size;", "Size", "(II)Lcoil/size/Size;", "", "isOriginal", "(Lcoil/size/Size;)Z", "coil-base_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* renamed from: coil.size.-Sizes, reason: invalid class name */
/* loaded from: classes.dex */
public final class Sizes {
    public static final Size Size(int i, int i2) {
        return new Size(Dimension2.Dimension(i), Dimension2.Dimension(i2));
    }

    public static final boolean isOriginal(Size size) {
        return Intrinsics.areEqual(size, Size.ORIGINAL);
    }
}
