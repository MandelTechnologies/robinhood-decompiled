package microgram.android.internal.guest;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.IOException;
import kotlin.Metadata;
import microgram.android.MicrogramSource;

/* compiled from: ResourceLoader.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/android/internal/guest/ResourceLoader;", "", "fetch", "Lmicrogram/android/internal/guest/Resource;", "path", "", "Factory", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ResourceLoader {

    /* compiled from: ResourceLoader.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/internal/guest/ResourceLoader$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lmicrogram/android/internal/guest/ResourceLoader;", "source", "Lmicrogram/android/MicrogramSource;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        ResourceLoader create(MicrogramSource source);
    }

    Resource fetch(String path) throws IOException;
}
