package microgram.android;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GuestError.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lmicrogram/android/GuestException;", "Ljava/io/IOException;", "Lokio/IOException;", "Lmicrogram/android/GuestError;", "error", "<init>", "(Lmicrogram/android/GuestError;)V", "Lmicrogram/android/GuestError;", "getError", "()Lmicrogram/android/GuestError;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.GuestException, reason: use source file name */
/* loaded from: classes14.dex */
public final class GuestError3 extends IOException {
    private final GuestError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestError3(GuestError error) {
        super(error.toString());
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }
}
