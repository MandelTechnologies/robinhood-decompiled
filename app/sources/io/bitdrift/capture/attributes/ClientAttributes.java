package io.bitdrift.capture.attributes;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.singular.sdk.internal.Constants;
import io.bitdrift.capture.providers.FieldProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientAttributes.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0012j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006%"}, m3636d2 = {"Lio/bitdrift/capture/attributes/ClientAttributes;", "Lio/bitdrift/capture/providers/FieldProvider;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "processLifecycleOwner", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;)V", "Landroid/content/pm/PackageManager;", "", "packageName", "", "flags", "Landroid/content/pm/PackageInfo;", "getPackageInfoCompat", "(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;", "isForeground", "()Ljava/lang/String;", "", "Lio/bitdrift/capture/providers/Fields;", "invoke", "()Ljava/util/Map;", "Landroidx/lifecycle/LifecycleOwner;", "appId", "Ljava/lang/String;", "getAppId", "packageInfo", "Landroid/content/pm/PackageInfo;", "getPackageInfo$annotations", "()V", "", "getAppVersionCode", "()J", "appVersionCode", "getAppVersion", "appVersion", "Companion", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ClientAttributes implements FieldProvider {
    private final String appId;
    private final PackageInfo packageInfo;
    private final LifecycleOwner processLifecycleOwner;

    public ClientAttributes(Context context, LifecycleOwner processLifecycleOwner) {
        ClientAttributes clientAttributes;
        PackageInfo packageInfoCompat$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        this.processLifecycleOwner = processLifecycleOwner;
        String packageName = context.getPackageName();
        String str = packageName == null ? "unknown" : packageName;
        this.appId = str;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            clientAttributes = this;
            try {
                packageInfoCompat$default = getPackageInfoCompat$default(clientAttributes, packageManager, str, 0, 2, null);
            } catch (Exception unused) {
                packageInfoCompat$default = null;
                clientAttributes.packageInfo = packageInfoCompat$default;
            }
        } catch (Exception unused2) {
            clientAttributes = this;
        }
        clientAttributes.packageInfo = packageInfoCompat$default;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        PackageInfo packageInfo = this.packageInfo;
        String str = packageInfo != null ? packageInfo.versionName : null;
        return str == null ? "?.?.?" : str;
    }

    public final long getAppVersionCode() {
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = this.packageInfo;
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
            return -1L;
        }
        if (this.packageInfo != null) {
            return r0.versionCode;
        }
        return -1L;
    }

    @Override // io.bitdrift.capture.providers.FieldProvider, kotlin.jvm.functions.Function0
    public Map<String, ? extends String> invoke() {
        return MapsKt.mapOf(Tuples4.m3642to("app_id", this.appId), Tuples4.m3642to("os", "Android"), Tuples4.m3642to("os_version", Build.VERSION.RELEASE), Tuples4.m3642to("foreground", isForeground()), Tuples4.m3642to("app_version", getAppVersion()), Tuples4.m3642to("_app_version_code", String.valueOf(getAppVersionCode())));
    }

    private final String isForeground() {
        if (this.processLifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            return Constants.SdidMigrationStatusCodes.ALREADY_SDID;
        }
        return "0";
    }

    static /* synthetic */ PackageInfo getPackageInfoCompat$default(ClientAttributes clientAttributes, PackageManager packageManager, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return clientAttributes.getPackageInfoCompat(packageManager, str, i);
    }

    private final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, i);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }
}
