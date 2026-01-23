package microgram.android.internal.guest;

import com.robinhood.android.asset.Assets;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.ExceptionsH;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.BundledMicrogramApplication;
import microgram.android.HttpMicrogramSource;
import microgram.android.MicrogramSource;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.internal.bundle.PackageInitializer;
import microgram.android.internal.bundle.PackageInitializer3;
import microgram.android.internal.bundle.PackageManager;
import microgram.android.internal.guest.ResourceLoader;
import okhttp3.Call;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import timber.log.Timber;

/* compiled from: ResourceLoader.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lmicrogram/android/internal/guest/DefaultResourceLoaderFactory;", "Lmicrogram/android/internal/guest/ResourceLoader$Factory;", "assetFileSystem", "Lokio/FileSystem;", "httpCallFactory", "Lokhttp3/Call$Factory;", "packageManager", "Lmicrogram/android/internal/bundle/PackageManager;", "packageInitializer", "Lmicrogram/android/internal/bundle/PackageInitializer;", "<init>", "(Lokio/FileSystem;Lokhttp3/Call$Factory;Lmicrogram/android/internal/bundle/PackageManager;Lmicrogram/android/internal/bundle/PackageInitializer;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lmicrogram/android/internal/guest/ResourceLoader;", "source", "Lmicrogram/android/MicrogramSource;", "openBundled", "Lmicrogram/android/internal/guest/FileSystemResourceLoader;", "appId", "", "loadBundled", "openFilesystem", "Ljava/util/concurrent/Future;", "Lkotlin/Result;", "block", "Lkotlin/Function0;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.DefaultResourceLoaderFactory, reason: use source file name */
/* loaded from: classes14.dex */
public final class ResourceLoader2 implements ResourceLoader.Factory {
    private final FileSystem assetFileSystem;
    private final ExecutorService executor;
    private final Call.Factory httpCallFactory;
    private final PackageInitializer packageInitializer;
    private final PackageManager packageManager;
    private static final Path BASE_ASSET_PATH = Path.Companion.get$default(Path.INSTANCE, "/microgram/bundled", false, 1, (Object) null);

    public ResourceLoader2(@Assets FileSystem assetFileSystem, Call.Factory httpCallFactory, PackageManager packageManager, PackageInitializer packageInitializer) {
        Intrinsics.checkNotNullParameter(assetFileSystem, "assetFileSystem");
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(packageInitializer, "packageInitializer");
        this.assetFileSystem = assetFileSystem;
        this.httpCallFactory = httpCallFactory;
        this.packageManager = packageManager;
        this.packageInitializer = packageInitializer;
        this.executor = Executors.newCachedThreadPool();
    }

    @Override // microgram.android.internal.guest.ResourceLoader.Factory
    public ResourceLoader create(final MicrogramSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof BundledMicrogramApplication) {
            return openBundled(((BundledMicrogramApplication) source).getAppId());
        }
        if (source instanceof RemoteMicrogramApplication) {
            return new ResourceLoader3(openFilesystem(new Function0() { // from class: microgram.android.internal.guest.DefaultResourceLoaderFactory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ResourceLoader2.create$lambda$0(this.f$0, source);
                }
            }), Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null));
        }
        if (!(source instanceof HttpMicrogramSource)) {
            throw new NoWhenBranchMatchedException();
        }
        ((HttpMicrogramSource) source).getBaseUrl();
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileSystem create$lambda$0(ResourceLoader2 resourceLoader2, MicrogramSource microgramSource) throws IOException {
        try {
            return resourceLoader2.packageManager.loadPackage(((RemoteMicrogramApplication) microgramSource).getAppId(), ((RemoteMicrogramApplication) microgramSource).getMinMicrogramVersion());
        } catch (IOException e) {
            try {
                FileSystem fileSystemLoadBundled = resourceLoader2.loadBundled(((RemoteMicrogramApplication) microgramSource).getAppId());
                Timber.INSTANCE.mo3362w("Remote package load failed and bundled was selected", e);
                return fileSystemLoadBundled;
            } catch (FileNotFoundException e2) {
                ExceptionsKt.addSuppressed(e, e2);
                throw e;
            }
        }
    }

    private final ResourceLoader3 openBundled(final String appId) {
        return new ResourceLoader3(openFilesystem(new Function0() { // from class: microgram.android.internal.guest.DefaultResourceLoaderFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResourceLoader2.openBundled$lambda$1(this.f$0, appId);
            }
        }), Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileSystem openBundled$lambda$1(ResourceLoader2 resourceLoader2, String str) {
        try {
            return resourceLoader2.loadBundled(str);
        } catch (FileNotFoundException e) {
            throw new UnsupportedOperationException("The Microgram app `" + str + "` was not found within the bundled assets.", e);
        }
    }

    private final FileSystem loadBundled(String appId) throws FileNotFoundException {
        return Okio.openZip(this.assetFileSystem, BASE_ASSET_PATH.resolve(appId + ".zip"));
    }

    private final Future<Result<FileSystem>> openFilesystem(final Function0<? extends FileSystem> block) {
        Future<Result<FileSystem>> futureSubmit = this.executor.submit(new Callable() { // from class: microgram.android.internal.guest.DefaultResourceLoaderFactory.openFilesystem.1
            @Override // java.util.concurrent.Callable
            /* renamed from: call-xLWZpok, reason: not valid java name and merged with bridge method [inline-methods] */
            public final Result<? extends FileSystem> call() {
                Object objM28550constructorimpl;
                ResourceLoader2 resourceLoader2 = ResourceLoader2.this;
                Function0<FileSystem> function0 = block;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    FileSystem fileSystemInvoke = function0.invoke();
                    PackageInitializer3.initializePackage(resourceLoader2.packageInitializer, fileSystemInvoke);
                    objM28550constructorimpl = Result.m28550constructorimpl(fileSystemInvoke);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m28549boximpl(objM28550constructorimpl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "submit(...)");
        return futureSubmit;
    }
}
