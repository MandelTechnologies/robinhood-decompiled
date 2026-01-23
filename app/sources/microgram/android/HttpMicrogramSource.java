package microgram.android;

import kotlin.Metadata;
import kotlin.Standard2;

/* compiled from: HttpMicrogramSource.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/HttpMicrogramSource;", "Lmicrogram/android/MicrogramSource;", "<init>", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/Void;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class HttpMicrogramSource extends MicrogramSource {
    private HttpMicrogramSource() {
        super(null);
    }

    public final Void getBaseUrl() {
        throw new Standard2("This is not supported on production builds.");
    }
}
