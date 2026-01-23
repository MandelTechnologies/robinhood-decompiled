package microgram.android.internal.bundle;

import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.models.card.p311db.Card;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.okio.OkioStreams;
import microgram.android.internal.bundle.signature.PackageSignature;
import microgram.android.internal.bundle.signature.SignatureVerifier;
import microgram.manifest.AppInfo;
import microgram.manifest.DeployJson;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.HashingSource;
import okio.Okio;
import okio.Path;
import okio.Source;

/* compiled from: PackageVerifier.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/android/internal/bundle/RealPackageVerifier;", "Lmicrogram/android/internal/bundle/PackageVerifier;", "signatureVerifier", "Lmicrogram/android/internal/bundle/signature/SignatureVerifier;", "microgramTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Lmicrogram/android/internal/bundle/signature/SignatureVerifier;Lcom/robinhood/android/tracing/TrackTrace;)V", "localTrace", Card.Icon.VERIFY, "", "fileSystem", "Lokio/FileSystem;", "loadAppInfo", "Lmicrogram/manifest/AppInfo;", "verifyManifestEntry", "file", "Lokio/Path;", "entry", "Lmicrogram/manifest/AppInfo$ManifestEntry;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.RealPackageVerifier, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageVerifier2 implements PackageVerifier {
    private final RhTrace6 localTrace;
    private final SignatureVerifier signatureVerifier;

    public PackageVerifier2(SignatureVerifier signatureVerifier, RhTrace6 microgramTrace) {
        Intrinsics.checkNotNullParameter(signatureVerifier, "signatureVerifier");
        Intrinsics.checkNotNullParameter(microgramTrace, "microgramTrace");
        this.signatureVerifier = signatureVerifier;
        this.localTrace = microgramTrace.withMethodNamePrefix("RealPackageVerifier.");
    }

    @Override // microgram.android.internal.bundle.PackageVerifier
    public void verify(FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        RhTrace6 rhTrace6 = this.localTrace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan(Card.Icon.VERIFY);
        try {
            try {
                for (Map.Entry<String, AppInfo.ManifestEntry> entry : loadAppInfo(fileSystem).getManifest().entrySet()) {
                    verifyManifestEntry(fileSystem, Path.resolve$default(PackagePaths.INSTANCE.getROOT(), entry.getKey(), false, 2, (Object) null), entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
            } catch (IOException e) {
                if (!(e instanceof PackageManagementExceptions5)) {
                    throw new PackageManagementExceptions5(null, e, 1, null);
                }
            }
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    private final AppInfo loadAppInfo(FileSystem fileSystem) throws NoSuchAlgorithmException, IOException {
        PackageSignature signature = PackagePaths2.readSignature(fileSystem);
        Source source = fileSystem.source(PackagePaths.INSTANCE.getAPP_INFO());
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        HashingSource hashingSource = Okio.hashingSource(source, messageDigest);
        try {
            Json deployJson = DeployJson.getDeployJson();
            BufferedSource bufferedSourceBuffer = Okio.buffer(hashingSource);
            deployJson.getSerializersModule();
            Tuples2 tuples2M3642to = Tuples4.m3642to((AppInfo) OkioStreams.decodeFromBufferedSource(deployJson, AppInfo.INSTANCE.serializer(), bufferedSourceBuffer), hashingSource.hash());
            Closeable.closeFinally(hashingSource, null);
            AppInfo appInfo = (AppInfo) tuples2M3642to.component1();
            this.signatureVerifier.verify(signature, (ByteString) tuples2M3642to.component2());
            return appInfo;
        } finally {
        }
    }

    private final void verifyManifestEntry(FileSystem fileSystem, Path file, AppInfo.ManifestEntry entry) throws NoSuchAlgorithmException, IOException {
        ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(entry.getSha256());
        if (byteStringDecodeBase64 == null) {
            throw new PackageManagementExceptions("Hash was not base64-encoded: " + file, null, 2, null);
        }
        Source source = fileSystem.source(file);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        HashingSource hashingSource = Okio.hashingSource(source, messageDigest);
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.blackhole());
            try {
                bufferedSinkBuffer.writeAll(hashingSource);
                Closeable.closeFinally(bufferedSinkBuffer, null);
                ByteString byteStringHash = hashingSource.hash();
                Closeable.closeFinally(hashingSource, null);
                if (Intrinsics.areEqual(byteStringHash, byteStringDecodeBase64)) {
                    return;
                }
                throw new PackageManagementExceptions2("Expected hash `" + byteStringDecodeBase64 + "` for `" + file + "`, got `" + byteStringHash + "`", null, 2, null);
            } finally {
            }
        } finally {
        }
    }
}
