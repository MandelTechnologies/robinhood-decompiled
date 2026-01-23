package microgram.android;

import android.os.Parcel;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.Parcels;
import io.github.z4kn4fein.semver.StringExtensions2;
import io.github.z4kn4fein.semver.Version;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parceler;

/* compiled from: NullableVersionParceler.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/NullableVersionParceler;", "Lkotlinx/parcelize/Parceler;", "Lio/github/z4kn4fein/semver/Version;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class NullableVersionParceler implements Parceler<Version> {
    public static final NullableVersionParceler INSTANCE = new NullableVersionParceler();

    private NullableVersionParceler() {
    }

    public void write(Version version, Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (version == null) {
            Parcels.writeBooleanCompat(parcel, false);
        } else {
            Parcels.writeBooleanCompat(parcel, true);
            parcel.writeString(version.toString());
        }
    }

    public Version create(Parcel parcel) {
        String string2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (Parcels.readBooleanCompat(parcel)) {
            string2 = parcel.readString();
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = null;
        }
        if (string2 != null) {
            return StringExtensions2.toVersion$default(string2, false, 1, null);
        }
        return null;
    }
}
