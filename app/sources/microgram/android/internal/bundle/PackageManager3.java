package microgram.android.internal.bundle;

import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.utils.ReleaseVersion;
import io.github.z4kn4fein.semver.StringExtensions2;
import io.github.z4kn4fein.semver.Version;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.AppUpdateRequiredException;
import microgram.android.internal.bundle.rollout.RolloutEvaluator;
import microgram.manifest.AppInfo;
import microgram.manifest.Release;
import microgram.manifest.VersionManifest;
import okio.FileSystem;
import timber.log.Timber;

/* compiled from: PackageManager.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lmicrogram/android/internal/bundle/RealPackageManager;", "Lmicrogram/android/internal/bundle/PackageManager;", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "Lmicrogram/android/internal/bundle/ReleaseStore;", "releaseStore", "Lmicrogram/android/internal/bundle/PackageStore;", "packageStore", "Lmicrogram/android/internal/bundle/PackageInterceptor;", "packageInterceptor", "Lmicrogram/android/internal/bundle/rollout/RolloutEvaluator;", "rolloutEvaluator", "Lcom/robinhood/android/tracing/TrackTrace;", "microgramTrace", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;Lmicrogram/android/internal/bundle/ReleaseStore;Lmicrogram/android/internal/bundle/PackageStore;Lmicrogram/android/internal/bundle/PackageInterceptor;Lmicrogram/android/internal/bundle/rollout/RolloutEvaluator;Lcom/robinhood/android/tracing/TrackTrace;)V", "", "appId", "Lio/github/z4kn4fein/semver/Version;", "minMicrogramVersion", "Lokio/FileSystem;", "loadPackageInternal", "(Ljava/lang/String;Lio/github/z4kn4fein/semver/Version;)Lokio/FileSystem;", "Lmicrogram/manifest/VersionManifest;", "Lmicrogram/manifest/Release;", "selectRelease", "(Lmicrogram/manifest/VersionManifest;Lio/github/z4kn4fein/semver/Version;)Lmicrogram/manifest/Release;", "loadPackage", "", "deleteStalePackages", "()V", "Lmicrogram/android/internal/bundle/ReleaseStore;", "Lmicrogram/android/internal/bundle/PackageStore;", "Lmicrogram/android/internal/bundle/PackageInterceptor;", "Lmicrogram/android/internal/bundle/rollout/RolloutEvaluator;", "localTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "appVersion", "Lio/github/z4kn4fein/semver/Version;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.RealPackageManager, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageManager3 implements PackageManager {
    private final Version appVersion;
    private final RhTrace6 localTrace;
    private final PackageInterceptor packageInterceptor;
    private final PackageStore packageStore;
    private final ReleaseStore releaseStore;
    private final RolloutEvaluator rolloutEvaluator;
    private static final Comparator<AppInfo> APP_INFO_COMPARATOR = ComparisonsKt.compareBy(new PropertyReference1Impl() { // from class: microgram.android.internal.bundle.RealPackageManager$Companion$APP_INFO_COMPARATOR$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((AppInfo) obj).getIdentifier();
        }
    }, new PropertyReference1Impl() { // from class: microgram.android.internal.bundle.RealPackageManager$Companion$APP_INFO_COMPARATOR$2
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((AppInfo) obj).getVersion();
        }
    }, new PropertyReference1Impl() { // from class: microgram.android.internal.bundle.RealPackageManager$Companion$APP_INFO_COMPARATOR$3
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((AppInfo) obj).getBuild();
        }
    }).reversed();

    public PackageManager3(ReleaseVersion releaseVersion, ReleaseStore releaseStore, PackageStore packageStore, PackageInterceptor packageInterceptor, RolloutEvaluator rolloutEvaluator, RhTrace6 microgramTrace) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(releaseStore, "releaseStore");
        Intrinsics.checkNotNullParameter(packageStore, "packageStore");
        Intrinsics.checkNotNullParameter(packageInterceptor, "packageInterceptor");
        Intrinsics.checkNotNullParameter(rolloutEvaluator, "rolloutEvaluator");
        Intrinsics.checkNotNullParameter(microgramTrace, "microgramTrace");
        this.releaseStore = releaseStore;
        this.packageStore = packageStore;
        this.packageInterceptor = packageInterceptor;
        this.rolloutEvaluator = rolloutEvaluator;
        this.localTrace = microgramTrace.withMethodNamePrefix("RealPackageManager.");
        this.appVersion = StringExtensions2.toVersion$default(releaseVersion.getVersionName(), false, 1, null);
    }

    @Override // microgram.android.internal.bundle.PackageManager
    public FileSystem loadPackage(String appId, Version minMicrogramVersion) {
        RhTrace3 rhTrace3BeginSpan;
        Intrinsics.checkNotNullParameter(appId, "appId");
        RhTrace6 rhTrace6 = this.localTrace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("loadPackage(\"" + appId + "\", \"" + minMicrogramVersion + "\")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            Timber.INSTANCE.mo3356i("loadPackage(%s, %s)", appId, minMicrogramVersion);
            FileSystem fileSystemLoadPackageInternal = loadPackageInternal(appId, minMicrogramVersion);
            if (fileSystemLoadPackageInternal != null) {
                return fileSystemLoadPackageInternal;
            }
            throw new AppUpdateRequiredException(null, null, 3, null);
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    private final FileSystem loadPackageInternal(String appId, Version minMicrogramVersion) {
        Object objM28550constructorimpl;
        FileSystem fileSystemInterceptPackageLoad;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(this.releaseStore.fetchVersionManifest(appId));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl) && (fileSystemInterceptPackageLoad = this.packageInterceptor.interceptPackageLoad(appId, null)) != null) {
            return fileSystemInterceptPackageLoad;
        }
        ResultKt.throwOnFailure(objM28550constructorimpl);
        Release releaseSelectRelease = selectRelease((VersionManifest) objM28550constructorimpl, minMicrogramVersion);
        FileSystem fileSystemInterceptPackageLoad2 = this.packageInterceptor.interceptPackageLoad(appId, releaseSelectRelease != null ? releaseSelectRelease.getVersion() : null);
        if (fileSystemInterceptPackageLoad2 != null) {
            return fileSystemInterceptPackageLoad2;
        }
        if (releaseSelectRelease == null) {
            return null;
        }
        return this.packageStore.loadPackage(PackageModels2.toPackageReference(releaseSelectRelease));
    }

    private final Release selectRelease(VersionManifest versionManifest, Version version) {
        Object next;
        Iterator it = CollectionsKt.sortedWith(CollectionsKt.plus((Collection<? extends Release>) versionManifest.getAlternatives(), versionManifest.getCurrent()), new Comparator() { // from class: microgram.android.internal.bundle.RealPackageManager$selectRelease$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Release) t2).getVersion(), ((Release) t).getVersion());
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Release release = (Release) next;
            if (PackageManager2.isSupportedBy(release, this.appVersion) && (version == null || PackageManager2.isMicrogramVersionAtLeast(release, version))) {
                if (this.rolloutEvaluator.isAvailable(release)) {
                    break;
                }
            }
        }
        return (Release) next;
    }

    @Override // microgram.android.internal.bundle.PackageManager
    public void deleteStalePackages() {
        RhTrace6 rhTrace6 = this.localTrace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("deleteStalePackages");
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.packageStore.trim(new Function1() { // from class: microgram.android.internal.bundle.RealPackageManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(PackageManager3.deleteStalePackages$lambda$9$lambda$8(linkedHashMap, this, (PackageId) obj));
                }
            });
            Unit unit = Unit.INSTANCE;
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteStalePackages$lambda$9$lambda$8(Map map, PackageManager3 packageManager3, PackageId id) {
        Set set;
        Intrinsics.checkNotNullParameter(id, "id");
        if (!map.containsKey(id.getAppIdentifier())) {
            Set setFetchActiveBuildRevisions = PackageManager2.fetchActiveBuildRevisions(packageManager3.releaseStore, id.getAppIdentifier());
            map.put(id.getAppIdentifier(), setFetchActiveBuildRevisions);
            set = setFetchActiveBuildRevisions;
        } else {
            set = (Set) map.get(id.getAppIdentifier());
        }
        return set == null || set.contains(id.getRevision());
    }
}
