package microgram.android;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: ConnectToMicrogramState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/MicrogramConnectTerminatedException;", "Ljava/io/IOException;", "Lokio/IOException;", "cause", "<init>", "(Ljava/io/IOException;)V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.MicrogramConnectTerminatedException, reason: use source file name */
/* loaded from: classes14.dex */
public final class ConnectToMicrogramState2 extends IOException {
    public ConnectToMicrogramState2(IOException iOException) {
        super("connectToMicrogramState terminated", iOException);
    }
}
