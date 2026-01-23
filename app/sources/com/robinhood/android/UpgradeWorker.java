package com.robinhood.android;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebStorage;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Cache;
import okio.FileSystem;
import okio.Path;
import timber.log.Timber;

/* compiled from: UpgradeWorker.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/UpgradeWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "okHttpCache", "Lokhttp3/Cache;", "getOkHttpCache", "()Lokhttp3/Cache;", "setOkHttpCache", "(Lokhttp3/Cache;)V", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "setFileSystem", "(Lokio/FileSystem;)V", "cacheDirectory", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "setCacheDirectory", "(Ljava/io/File;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "clearOkHttpCache", "", "clearWebCaches", "Companion", "feature-install-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class UpgradeWorker extends Hammer_UpgradeWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @CacheDirectory
    public File cacheDirectory;
    public FileSystem fileSystem;
    public Cache okHttpCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeWorker(Context context, WorkerParameters parameters) {
        super(context, parameters, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public final Cache getOkHttpCache() {
        Cache cache2 = this.okHttpCache;
        if (cache2 != null) {
            return cache2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("okHttpCache");
        return null;
    }

    public final void setOkHttpCache(Cache cache2) {
        Intrinsics.checkNotNullParameter(cache2, "<set-?>");
        this.okHttpCache = cache2;
    }

    public final FileSystem getFileSystem() {
        FileSystem fileSystem = this.fileSystem;
        if (fileSystem != null) {
            return fileSystem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileSystem");
        return null;
    }

    public final void setFileSystem(FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(fileSystem, "<set-?>");
        this.fileSystem = fileSystem;
    }

    public final File getCacheDirectory() {
        File file = this.cacheDirectory;
        if (file != null) {
            return file;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDirectory");
        return null;
    }

    public final void setCacheDirectory(File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.cacheDirectory = file;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() throws IOException {
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3356i("App upgrade maintenance starting...", new Object[0]);
        clearOkHttpCache();
        clearWebCaches();
        companion.mo3356i("App upgrade maintenance complete.", new Object[0]);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "success(...)");
        return resultSuccess;
    }

    private final void clearOkHttpCache() {
        Timber.INSTANCE.mo3356i("Evicting all entries from OkHttp cache", new Object[0]);
        try {
            getOkHttpCache().evictAll();
        } catch (IOException e) {
            Timber.INSTANCE.mo3355e(e, "Failed evicting entries from OkHttp cache", new Object[0]);
        }
    }

    private final void clearWebCaches() throws IOException {
        Timber.INSTANCE.mo3356i("Clearing web storage", new Object[0]);
        try {
            WebStorage.getInstance().deleteAllData();
        } catch (AndroidRuntimeException e) {
            Timber.INSTANCE.mo3355e(e, "Failed to clear web storage data.", new Object[0]);
        }
        Path.Companion companion = Path.INSTANCE;
        String path = getCacheDirectory().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        Path path2 = Path.Companion.get$default(companion, path, false, 1, (Object) null);
        Timber.Companion companion2 = Timber.INSTANCE;
        companion2.mo3356i("Clearing WebView cache", new Object[0]);
        getFileSystem().deleteRecursively(path2.resolve("WebView"));
        companion2.mo3356i("Clearing Chromium WebView cache", new Object[0]);
        getFileSystem().deleteRecursively(path2.resolve("org.chromium.android_webview"));
    }

    /* compiled from: UpgradeWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/UpgradeWorker$Companion;", "", "<init>", "()V", "request", "Landroidx/work/OneTimeWorkRequest;", "feature-install-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OneTimeWorkRequest request() {
            return new OneTimeWorkRequest.Builder(UpgradeWorker.class).build();
        }
    }
}
