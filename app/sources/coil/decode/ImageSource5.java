package coil.decode;

import android.content.Context;
import coil.content.Utils;
import coil.decode.ImageSource;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* compiled from: ImageSource.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u0010\u001a+\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\t\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lokio/Path;", "file", "Lokio/FileSystem;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "Lcoil/decode/ImageSource;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/io/Closeable;)Lcoil/decode/ImageSource;", "ImageSource", "Lokio/BufferedSource;", "source", "Landroid/content/Context;", "context", "(Lokio/BufferedSource;Landroid/content/Context;)Lcoil/decode/ImageSource;", "Lcoil/decode/ImageSource$Metadata;", "metadata", "(Lokio/BufferedSource;Landroid/content/Context;Lcoil/decode/ImageSource$Metadata;)Lcoil/decode/ImageSource;", "coil-base_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* renamed from: coil.decode.ImageSources, reason: use source file name */
/* loaded from: classes.dex */
public final class ImageSource5 {
    public static /* synthetic */ ImageSource create$default(Path path, FileSystem fileSystem, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            fileSystem = FileSystem.SYSTEM;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return create(path, fileSystem, str, closeable);
    }

    @JvmName
    public static final ImageSource create(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        return new ImageSource4(path, fileSystem, str, closeable, null);
    }

    @JvmName
    public static final ImageSource create(BufferedSource bufferedSource, final Context context) {
        return new ImageSource7(bufferedSource, new Function0() { // from class: coil.decode.ImageSources$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.getSafeCacheDir(context);
            }
        }, null);
    }

    @JvmName
    public static final ImageSource create(BufferedSource bufferedSource, final Context context, ImageSource.Metadata metadata) {
        return new ImageSource7(bufferedSource, new Function0() { // from class: coil.decode.ImageSources$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.getSafeCacheDir(context);
            }
        }, metadata);
    }
}
