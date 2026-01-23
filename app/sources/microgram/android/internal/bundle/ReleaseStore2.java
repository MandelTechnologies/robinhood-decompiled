package microgram.android.internal.bundle;

import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.targetbackend.Endpoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.okio.OkioStreams;
import microgram.android.internal.http.HttpCalls;
import microgram.manifest.DeployJson;
import microgram.manifest.VersionManifest;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okio.BufferedSource;

/* compiled from: ReleaseStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/android/internal/bundle/RealReleaseStore;", "Lmicrogram/android/internal/bundle/ReleaseStore;", "httpCallFactory", "Lokhttp3/Call$Factory;", "microgramTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Lokhttp3/Call$Factory;Lcom/robinhood/android/tracing/TrackTrace;)V", "trace", "fetchVersionManifest", "Lmicrogram/manifest/VersionManifest;", "appIdentifier", "", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.RealReleaseStore, reason: use source file name */
/* loaded from: classes14.dex */
public final class ReleaseStore2 implements ReleaseStore {
    private final Call.Factory httpCallFactory;
    private final RhTrace6 trace;
    private static final HttpUrl BASE_URL = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment("microgram").build();

    public ReleaseStore2(Call.Factory httpCallFactory, RhTrace6 microgramTrace) {
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        Intrinsics.checkNotNullParameter(microgramTrace, "microgramTrace");
        this.httpCallFactory = httpCallFactory;
        this.trace = microgramTrace.withMethodNamePrefix("RealReleaseStore.");
    }

    @Override // microgram.android.internal.bundle.ReleaseStore
    public VersionManifest fetchVersionManifest(String appIdentifier) {
        RhTrace3 rhTrace3BeginSpan;
        Intrinsics.checkNotNullParameter(appIdentifier, "appIdentifier");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("fetchVersionManifest(\"" + appIdentifier + "\")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            BufferedSource source = HttpCalls.getOrThrow$default(this.httpCallFactory, BASE_URL.newBuilder().addPathSegment(appIdentifier).addPathSegment("index.json").build(), null, 2, null).getSource();
            Json deployJson = DeployJson.getDeployJson();
            try {
                deployJson.getSerializersModule();
                VersionManifest versionManifest = (VersionManifest) OkioStreams.decodeFromBufferedSource(deployJson, VersionManifest.INSTANCE.serializer(), source);
                Closeable.closeFinally(source, null);
                return versionManifest;
            } finally {
            }
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }
}
