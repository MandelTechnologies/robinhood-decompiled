package microgram.android.internal.bundle;

import kotlin.Metadata;
import okio.Path;

/* compiled from: PackagePaths.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackagePaths;", "", "<init>", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "APP_INFO", "getAPP_INFO", "SIGNATURE", "getSIGNATURE", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PackagePaths {
    private static final Path APP_INFO;
    public static final PackagePaths INSTANCE = new PackagePaths();
    private static final Path ROOT;
    private static final Path SIGNATURE;

    private PackagePaths() {
    }

    static {
        Path.Companion companion = Path.INSTANCE;
        ROOT = Path.Companion.get$default(companion, "/", false, 1, (Object) null);
        APP_INFO = Path.Companion.get$default(companion, "/info.json", false, 1, (Object) null);
        SIGNATURE = Path.Companion.get$default(companion, "/signature", false, 1, (Object) null);
    }

    public final Path getROOT() {
        return ROOT;
    }

    public final Path getAPP_INFO() {
        return APP_INFO;
    }

    public final Path getSIGNATURE() {
        return SIGNATURE;
    }
}
