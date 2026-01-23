package microgram.android.internal.bundle;

import com.squareup.wire.ProtoAdapter;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.okio.OkioStreams;
import microgram.android.internal.bundle.signature.PackageSignature;
import microgram.manifest.AppInfo;
import microgram.manifest.DeployJson;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: PackagePaths.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, m3636d2 = {"readSignature", "Lmicrogram/android/internal/bundle/signature/PackageSignature;", "Lokio/FileSystem;", "readInfo", "Lmicrogram/manifest/AppInfo;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.PackagePathsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackagePaths2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final PackageSignature readSignature(FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Path signature = PackagePaths.INSTANCE.getSIGNATURE();
        ProtoAdapter<PackageSignature> protoAdapter = PackageSignature.ADAPTER;
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(signature));
        PackageSignature th = null;
        try {
            PackageSignature packageSignatureDecode = protoAdapter.decode(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = packageSignatureDecode;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final AppInfo readInfo(FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Path app_info = PackagePaths.INSTANCE.getAPP_INFO();
        Json deployJson = DeployJson.getDeployJson();
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(app_info));
        AppInfo th = null;
        try {
            deployJson.getSerializersModule();
            AppInfo appInfo = (AppInfo) OkioStreams.decodeFromBufferedSource(deployJson, AppInfo.INSTANCE.serializer(), bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = appInfo;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
