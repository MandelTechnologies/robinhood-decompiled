package com.robinhood.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import dagger.MembersInjector;
import java.io.File;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okio.FileSystem;

/* compiled from: UpgradeWorker_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/UpgradeWorker_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/UpgradeWorker;", "okHttpCache", "Ljavax/inject/Provider;", "Lokhttp3/Cache;", "fileSystem", "Lokio/FileSystem;", "cacheDirectory", "Ljava/io/File;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-install-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class UpgradeWorker_MembersInjector implements MembersInjector<UpgradeWorker> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<File> cacheDirectory;
    private final Provider<FileSystem> fileSystem;
    private final Provider<Cache> okHttpCache;

    @JvmStatic
    public static final MembersInjector<UpgradeWorker> create(Provider<Cache> provider, Provider<FileSystem> provider2, Provider<File> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    @CacheDirectory
    public static final void injectCacheDirectory(UpgradeWorker upgradeWorker, File file) {
        INSTANCE.injectCacheDirectory(upgradeWorker, file);
    }

    @JvmStatic
    public static final void injectFileSystem(UpgradeWorker upgradeWorker, FileSystem fileSystem) {
        INSTANCE.injectFileSystem(upgradeWorker, fileSystem);
    }

    @JvmStatic
    public static final void injectOkHttpCache(UpgradeWorker upgradeWorker, Cache cache2) {
        INSTANCE.injectOkHttpCache(upgradeWorker, cache2);
    }

    public UpgradeWorker_MembersInjector(Provider<Cache> okHttpCache, Provider<FileSystem> fileSystem, Provider<File> cacheDirectory) {
        Intrinsics.checkNotNullParameter(okHttpCache, "okHttpCache");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        this.okHttpCache = okHttpCache;
        this.fileSystem = fileSystem;
        this.cacheDirectory = cacheDirectory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UpgradeWorker instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Cache cache2 = this.okHttpCache.get();
        Intrinsics.checkNotNullExpressionValue(cache2, "get(...)");
        companion.injectOkHttpCache(instance, cache2);
        FileSystem fileSystem = this.fileSystem.get();
        Intrinsics.checkNotNullExpressionValue(fileSystem, "get(...)");
        companion.injectFileSystem(instance, fileSystem);
        File file = this.cacheDirectory.get();
        Intrinsics.checkNotNullExpressionValue(file, "get(...)");
        companion.injectCacheDirectory(instance, file);
    }

    /* compiled from: UpgradeWorker_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/UpgradeWorker_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/UpgradeWorker;", "okHttpCache", "Ljavax/inject/Provider;", "Lokhttp3/Cache;", "fileSystem", "Lokio/FileSystem;", "cacheDirectory", "Ljava/io/File;", "injectOkHttpCache", "", "instance", "injectFileSystem", "injectCacheDirectory", "feature-install-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<UpgradeWorker> create(Provider<Cache> okHttpCache, Provider<FileSystem> fileSystem, Provider<File> cacheDirectory) {
            Intrinsics.checkNotNullParameter(okHttpCache, "okHttpCache");
            Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            return new UpgradeWorker_MembersInjector(okHttpCache, fileSystem, cacheDirectory);
        }

        @JvmStatic
        public final void injectOkHttpCache(UpgradeWorker instance, Cache okHttpCache) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(okHttpCache, "okHttpCache");
            instance.setOkHttpCache(okHttpCache);
        }

        @JvmStatic
        public final void injectFileSystem(UpgradeWorker instance, FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
            instance.setFileSystem(fileSystem);
        }

        @JvmStatic
        @CacheDirectory
        public final void injectCacheDirectory(UpgradeWorker instance, File cacheDirectory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            instance.setCacheDirectory(cacheDirectory);
        }
    }
}
