package microgram.android.internal.bundle;

import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.internal.HostCompatibilityFlags;
import microgram.android.internal.InboundMessageRouter;
import microgram.manifest.AppInfo;
import timber.log.Timber;

/* compiled from: PackageInitializer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/android/internal/bundle/RealPackageInitializer;", "Lmicrogram/android/internal/bundle/PackageInitializer;", "inboundMessageRouter", "Lmicrogram/android/internal/InboundMessageRouter;", "hostCompatibilityFlags", "Lmicrogram/android/internal/HostCompatibilityFlags;", "instanceTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Lmicrogram/android/internal/InboundMessageRouter;Lmicrogram/android/internal/HostCompatibilityFlags;Lcom/robinhood/android/tracing/TrackTrace;)V", "localTrace", "initializePackage", "", "appInfo", "Lmicrogram/manifest/AppInfo;", "installDependentExtensions", "extensions", "", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.RealPackageInitializer, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageInitializer4 implements PackageInitializer {
    private final HostCompatibilityFlags hostCompatibilityFlags;
    private final InboundMessageRouter inboundMessageRouter;
    private final RhTrace6 localTrace;

    public PackageInitializer4(InboundMessageRouter inboundMessageRouter, HostCompatibilityFlags hostCompatibilityFlags, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(inboundMessageRouter, "inboundMessageRouter");
        Intrinsics.checkNotNullParameter(hostCompatibilityFlags, "hostCompatibilityFlags");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        this.inboundMessageRouter = inboundMessageRouter;
        this.hostCompatibilityFlags = hostCompatibilityFlags;
        this.localTrace = instanceTrace.withMethodNamePrefix("RealPackageInitializer.");
    }

    @Override // microgram.android.internal.bundle.PackageInitializer
    public void initializePackage(AppInfo appInfo) throws IOException {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        RhTrace6 rhTrace6 = this.localTrace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("initializePackage");
        try {
            installDependentExtensions(appInfo.getDependentExtensions());
            this.hostCompatibilityFlags.initialize$lib_microgram_externalRelease(appInfo.getCompatibilityFlags());
            Unit unit = Unit.INSTANCE;
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    private final void installDependentExtensions(Set<String> extensions) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InboundMessageRouter inboundMessageRouter = this.inboundMessageRouter;
        for (Object obj : extensions) {
            if (!inboundMessageRouter.installExtension((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Timber.INSTANCE.mo3353e("Local app is missing one or more service extensions: " + linkedHashSet, new Object[0]);
    }
}
