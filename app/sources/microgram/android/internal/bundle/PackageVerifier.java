package microgram.android.internal.bundle;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import okio.FileSystem;

/* compiled from: PackageVerifier.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageVerifier;", "", Card.Icon.VERIFY, "", "fileSystem", "Lokio/FileSystem;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface PackageVerifier {
    void verify(FileSystem fileSystem) throws PackageManagementExceptions5;
}
