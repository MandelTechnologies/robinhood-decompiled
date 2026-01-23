package microgram.android.internal.guest;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.okio.OkioStreams;
import microgram.manifest.AppInfo;
import microgram.manifest.DeployJson;
import okio.BufferedSource;

/* compiled from: ResourceLoader.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"fetchAppInfo", "Lmicrogram/manifest/AppInfo;", "Lmicrogram/android/internal/guest/ResourceLoader;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.guest.ResourceLoaderKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ResourceLoader5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final AppInfo fetchAppInfo(ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "<this>");
        BufferedSource source = resourceLoader.fetch("/info.json").getSource();
        Json deployJson = DeployJson.getDeployJson();
        AppInfo th = null;
        try {
            deployJson.getSerializersModule();
            AppInfo appInfo = (AppInfo) OkioStreams.decodeFromBufferedSource(deployJson, AppInfo.INSTANCE.serializer(), source);
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            AppInfo appInfo2 = th;
            th = appInfo;
            th = appInfo2;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
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
