package com.salesforce.android.smi.network.data.model;

import android.content.Context;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.common.internal.util.SingletonHolder;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Install.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0012\u0010\u0012\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0012\u0010\u0014\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0012\u0010\u0016\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/Install;", "Lcom/salesforce/android/smi/network/data/model/DeviceInfo;", "Lcom/salesforce/android/smi/network/data/model/InstallBuildInfo;", "Lcom/salesforce/android/smi/network/data/model/InstallInfo;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appName", "", "getAppName", "()Ljava/lang/String;", Auth.CAPABILITIES_KEY, "getCapabilitiesVersion", "clientVersion", "getClientVersion", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "getDeviceId", "deviceType", "getDeviceType", "osName", "getOsName", "osVersion", "getOsVersion", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Install implements DeviceInfo, InstallBuildInfo, InstallInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ Device $$delegate_0;
    private final /* synthetic */ InstallBuild $$delegate_1;
    private final String appName;

    @Override // com.salesforce.android.smi.network.data.model.InstallBuildInfo
    public String getCapabilitiesVersion() {
        return this.$$delegate_1.getCapabilitiesVersion();
    }

    @Override // com.salesforce.android.smi.network.data.model.InstallBuildInfo
    public String getClientVersion() {
        return this.$$delegate_1.getClientVersion();
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceInfo
    public String getDeviceId() {
        return this.$$delegate_0.getDeviceId();
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceBuildInfo
    public String getDeviceType() {
        return this.$$delegate_0.getDeviceType();
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceBuildInfo
    public String getOsName() {
        return this.$$delegate_0.getOsName();
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceBuildInfo
    public String getOsVersion() {
        return this.$$delegate_0.getOsVersion();
    }

    public Install(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = Device.INSTANCE.getInstance(context);
        this.$$delegate_1 = InstallBuild.INSTANCE;
        this.appName = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    /* compiled from: Install.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/Install$Companion;", "Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "Lcom/salesforce/android/smi/network/data/model/Install;", "Landroid/content/Context;", "<init>", "()V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends SingletonHolder<Install, Context> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: Install.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.salesforce.android.smi.network.data.model.Install$Companion$1 */
        /* synthetic */ class C423211 extends FunctionReferenceImpl implements Function1<Context, Install> {
            public static final C423211 INSTANCE = new C423211();

            C423211() {
                super(1, Install.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Install invoke(Context p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new Install(p0);
            }
        }

        private Companion() {
            super(C423211.INSTANCE, null, null, 6, null);
        }
    }

    @Override // com.salesforce.android.smi.network.data.model.InstallInfo
    public String getAppName() {
        return this.appName;
    }
}
