package coil;

import android.content.Context;
import coil.ImageLoader;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: ImageLoaders.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Landroid/content/Context;", "context", "Lcoil/ImageLoader;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroid/content/Context;)Lcoil/ImageLoader;", "ImageLoader", "coil-base_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes16.dex */
public final class ImageLoaders {
    @JvmName
    public static final ImageLoader create(Context context) {
        return new ImageLoader.Builder(context).build();
    }
}
