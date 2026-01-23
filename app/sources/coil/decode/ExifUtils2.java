package coil.decode;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: ExifUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"Lcoil/decode/ExifData;", "", "isFlipped", "", "rotationDegrees", "", "<init>", "(ZI)V", "()Z", "getRotationDegrees", "()I", "Companion", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: coil.decode.ExifData, reason: use source file name */
/* loaded from: classes.dex */
public final class ExifUtils2 {

    @JvmField
    public static final ExifUtils2 NONE = new ExifUtils2(false, 0);
    private final boolean isFlipped;
    private final int rotationDegrees;

    public ExifUtils2(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }

    /* renamed from: isFlipped, reason: from getter */
    public final boolean getIsFlipped() {
        return this.isFlipped;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }
}
