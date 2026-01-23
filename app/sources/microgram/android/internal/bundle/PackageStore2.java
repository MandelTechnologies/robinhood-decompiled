package microgram.android.internal.bundle;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.concurrent.KeyedLock;
import com.robinhood.concurrent.KeyedLock2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MicrogramInstallContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import microgram.android.internal.http.HttpCalls;
import microgram.manifest.AppInfo;
import okhttp3.CacheControl;
import okhttp3.Call;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.HashingSource;
import okio.Okio;
import okio.Path;
import timber.log.Timber;

/* compiled from: PackageStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020#2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u00020\u0004*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u00108\u001a\u00020\u0004*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0018\u0010:\u001a\u00020\u0004*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00105¨\u0006<"}, m3636d2 = {"Lmicrogram/android/internal/bundle/RealPackageStore;", "Lmicrogram/android/internal/bundle/PackageStore;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "cacheDirectory", "Lokhttp3/Call$Factory;", "httpCallFactory", "Lmicrogram/android/internal/bundle/PackageVerifier;", "packageVerifier", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/tracing/TrackTrace;", "microgramTrace", "<init>", "(Lokio/FileSystem;Lokio/Path;Lokhttp3/Call$Factory;Lmicrogram/android/internal/bundle/PackageVerifier;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/tracing/TrackTrace;)V", "path", "openLocalFile", "(Lokio/Path;)Lokio/FileSystem;", "Lmicrogram/android/internal/bundle/PackageReference;", "reference", "fetchBundle", "(Lmicrogram/android/internal/bundle/PackageReference;)Lokio/FileSystem;", "Lokio/HashingSource;", "source", "storeBundle", "(Lmicrogram/android/internal/bundle/PackageReference;Lokio/HashingSource;)Lokio/FileSystem;", "loadPackage", "Lmicrogram/android/internal/bundle/PackageId;", "id", "openPackage", "(Lmicrogram/android/internal/bundle/PackageId;)Lokio/FileSystem;", "Lkotlin/Function1;", "", "retain", "", "trim", "(Lkotlin/jvm/functions/Function1;)V", "Lokio/FileSystem;", "Lokhttp3/Call$Factory;", "Lmicrogram/android/internal/bundle/PackageVerifier;", "Lcom/robinhood/analytics/EventLogger;", "trace", "Lcom/robinhood/android/tracing/TrackTrace;", "storageDirectory", "Lokio/Path;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "maintenanceLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Lcom/robinhood/concurrent/KeyedLock;", "packageLock", "Lcom/robinhood/concurrent/KeyedLock;", "getLocalBasePath", "(Lmicrogram/android/internal/bundle/PackageId;)Lokio/Path;", "localBasePath", "getLocalTemporaryPackageFile", "localTemporaryPackageFile", "getLocalPackageFile", "localPackageFile", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.RealPackageStore, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageStore2 implements PackageStore {
    private static final CacheControl NO_CACHE = new CacheControl.Builder().noCache().noStore().build();
    private final EventLogger eventLogger;
    private final FileSystem fileSystem;
    private final Call.Factory httpCallFactory;
    private final ReentrantReadWriteLock maintenanceLock;
    private final KeyedLock<PackageId> packageLock;
    private final PackageVerifier packageVerifier;
    private final Path storageDirectory;
    private final RhTrace6 trace;

    public PackageStore2(FileSystem fileSystem, Path cacheDirectory, Call.Factory httpCallFactory, PackageVerifier packageVerifier, EventLogger eventLogger, RhTrace6 microgramTrace) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        Intrinsics.checkNotNullParameter(packageVerifier, "packageVerifier");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(microgramTrace, "microgramTrace");
        this.fileSystem = fileSystem;
        this.httpCallFactory = httpCallFactory;
        this.packageVerifier = packageVerifier;
        this.eventLogger = eventLogger;
        this.trace = microgramTrace.withMethodNamePrefix("RealPackageStore.");
        this.storageDirectory = cacheDirectory.resolve("apps");
        this.maintenanceLock = new ReentrantReadWriteLock();
        this.packageLock = KeyedLock2.KeyedLock(PackageStore3.INSTANCE);
    }

    @Override // microgram.android.internal.bundle.PackageStore
    public FileSystem loadPackage(PackageReference reference) {
        RhTrace3 rhTrace3BeginSpan;
        Intrinsics.checkNotNullParameter(reference, "reference");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("loadPackage(" + reference + ")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.maintenanceLock.readLock();
            lock.lock();
            try {
                KeyedLock<PackageId> keyedLock = this.packageLock;
                PackageId id = reference.getId();
                keyedLock.lockInterruptibly(id);
                try {
                    FileSystem fileSystemOpenPackage = openPackage(reference.getId());
                    if (fileSystemOpenPackage == null) {
                        fileSystemOpenPackage = fetchBundle(reference);
                    }
                    return fileSystemOpenPackage;
                } finally {
                    keyedLock.unlock(id);
                }
            } finally {
                lock.unlock();
            }
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    public FileSystem openPackage(PackageId id) {
        RhTrace3 rhTrace3BeginSpan;
        Intrinsics.checkNotNullParameter(id, "id");
        RhTrace6 rhTrace6 = this.trace;
        FileSystem fileSystem = null;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("openPackage(" + id + ")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.maintenanceLock.readLock();
            lock.lock();
            try {
                KeyedLock<PackageId> keyedLock = this.packageLock;
                keyedLock.lockInterruptibly(id);
                try {
                    this.fileSystem.delete(getLocalTemporaryPackageFile(id));
                    Path localPackageFile = getLocalPackageFile(id);
                    FileSystem fileSystemOpenLocalFile = openLocalFile(localPackageFile);
                    if (fileSystemOpenLocalFile != null) {
                        Timber.INSTANCE.mo3350d("Found cached package: %s", localPackageFile);
                        fileSystem = fileSystemOpenLocalFile;
                    }
                    return fileSystem;
                } finally {
                    keyedLock.unlock(id);
                }
            } finally {
                lock.unlock();
            }
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // microgram.android.internal.bundle.PackageStore
    public void trim(Function1<? super PackageId, Boolean> retain) {
        Intrinsics.checkNotNullParameter(retain, "retain");
        RhTrace6 rhTrace6 = this.trace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("trim");
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.maintenanceLock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                for (Path path : this.fileSystem.list(this.storageDirectory)) {
                    String strName = path.name();
                    List<Path> listListOrNull = this.fileSystem.listOrNull(path);
                    if (listListOrNull == null) {
                        listListOrNull = CollectionsKt.emptyList();
                    }
                    for (Path path2 : listListOrNull) {
                        if (!retain.invoke(new PackageId(strName, path2.name())).booleanValue()) {
                            this.fileSystem.deleteRecursively(path2);
                        }
                    }
                    List<Path> listListOrNull2 = this.fileSystem.listOrNull(path);
                    if (listListOrNull2 == null || listListOrNull2.isEmpty()) {
                        this.fileSystem.deleteRecursively(path);
                    }
                }
                Unit unit = Unit.INSTANCE;
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                Unit unit2 = Unit.INSTANCE;
                if (rhTrace3BeginSpan != null) {
                    rhTrace3BeginSpan.end();
                }
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } catch (Throwable th) {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            throw th;
        }
    }

    private final FileSystem openLocalFile(Path path) throws IOException {
        try {
            return Okio.openZip(this.fileSystem, path);
        } catch (IOException unused) {
            Timber.INSTANCE.mo3350d("Could not open %s", path);
            this.fileSystem.delete(path);
            return null;
        }
    }

    private final FileSystem fetchBundle(PackageReference reference) throws PackageManagementExceptions4 {
        try {
            BufferedSource source = HttpCalls.getOrThrow(this.httpCallFactory, reference.getUrl(), NO_CACHE).getSource();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
                FileSystem fileSystemStoreBundle = storeBundle(reference, Okio.hashingSource(source, messageDigest));
                Closeable.closeFinally(source, null);
                AppInfo info = PackagePaths2.readInfo(fileSystemStoreBundle);
                EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(null, null, null, UserInteractionEventData.Action.MICROGRAM_INSTALL, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MicrogramInstallContext(info.getIdentifier(), info.getVersion().toString(), info.getBuild(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -3, 16383, null), null, null, 103, null), false, false, 6, null);
                return fileSystemStoreBundle;
            } finally {
            }
        } catch (IOException e) {
            throw new PackageManagementExceptions4("Failed to install package: " + reference, e);
        }
    }

    private final FileSystem storeBundle(PackageReference reference, HashingSource source) throws IOException {
        Throwable th;
        PackageId id = reference.getId();
        Path localPackageFile = getLocalPackageFile(id);
        Timber.INSTANCE.mo3350d("Storing local package for %s", id);
        Path localTemporaryPackageFile = getLocalTemporaryPackageFile(id);
        try {
            try {
                FileSystem fileSystem = this.fileSystem;
                fileSystem.createDirectories(getLocalBasePath(id));
                BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.mo11323sink(localTemporaryPackageFile, false));
                try {
                    bufferedSinkBuffer.writeAll(source);
                    Unit unit = Unit.INSTANCE;
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        th = null;
                    }
                } catch (Throwable th3) {
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable th4) {
                            ExceptionsKt.addSuppressed(th3, th4);
                        }
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                String sha256 = reference.getSha256();
                String strHex = source.hash().hex();
                if (!Intrinsics.areEqual(strHex, sha256)) {
                    throw new PackageManagementExceptions3("Expected SHA-256 of `" + sha256 + "` but was `" + strHex + "`", null, 2, null);
                }
                this.packageVerifier.verify(Okio.openZip(this.fileSystem, localTemporaryPackageFile));
                this.fileSystem.mo11318atomicMove(localTemporaryPackageFile, localPackageFile);
                FileSystem fileSystemOpenZip = Okio.openZip(this.fileSystem, localPackageFile);
                this.fileSystem.delete(localTemporaryPackageFile);
                return fileSystemOpenZip;
            } catch (PackageManagementExceptions5 e) {
                PackageManagementExceptions5 packageManagementExceptions5 = new PackageManagementExceptions5("Failed to verify package: " + reference, e);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, packageManagementExceptions5, false, null, 6, null);
                throw packageManagementExceptions5;
            }
        } catch (Throwable th5) {
            this.fileSystem.delete(localTemporaryPackageFile);
            throw th5;
        }
    }

    private final Path getLocalBasePath(PackageId packageId) {
        return this.storageDirectory.resolve(packageId.getAppIdentifier());
    }

    private final Path getLocalTemporaryPackageFile(PackageId packageId) {
        return getLocalBasePath(packageId).resolve(packageId.getRevision() + ".tmp");
    }

    private final Path getLocalPackageFile(PackageId packageId) {
        return getLocalBasePath(packageId).resolve(packageId.getRevision());
    }
}
