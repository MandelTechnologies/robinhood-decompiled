package com.salesforce.android.smi.network.data.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.common.internal.util.Hash;
import com.salesforce.android.smi.common.internal.util.SingletonHolder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: Device.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\rH\u0002R\u0018\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0012\u0010\u0019\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0012\u0010\u001b\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0012\u0010\u001d\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/Device;", "Lcom/salesforce/android/smi/network/data/model/DeviceBuildInfo;", "Lcom/salesforce/android/smi/network/data/model/DeviceInfo;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "applicationContext", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "sharedPreferences", "Landroid/content/SharedPreferences;", "applicationId", "", "applicationIdSha256", "applicationIdBase64", "Ljava/lang/String;", "deviceUUID", "getDeviceUUID", "()Ljava/lang/String;", "deviceApplicationId", "getDeviceApplicationId", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "getDeviceId", "generateDeviceId", "deviceType", "getDeviceType", "osName", "getOsName", "osVersion", "getOsVersion", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Device implements DeviceBuildInfo, DeviceInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ DeviceBuild $$delegate_0;
    private final Context applicationContext;
    private final String applicationId;
    private final String applicationIdBase64;
    private final String applicationIdSha256;
    private final String deviceApplicationId;
    private final String deviceId;
    private final String deviceUUID;
    private final SharedPreferences sharedPreferences;

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

    public Device(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = DeviceBuild.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.salesforce.android.smi.core", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
        String packageName = applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.applicationId = packageName;
        Hash hash = Hash.INSTANCE;
        String strSha256 = hash.sha256(packageName);
        this.applicationIdSha256 = strSha256;
        byte[] bytes = strSha256.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        this.applicationIdBase64 = strEncodeToString;
        String string2 = sharedPreferences.getString("unique_device_id", null);
        string2 = string2 == null ? generateDeviceId() : string2;
        this.deviceUUID = string2;
        this.deviceApplicationId = hash.sha256(string2 + ":" + packageName);
        this.deviceId = string2 + ":" + strEncodeToString;
    }

    public final String getDeviceUUID() {
        return this.deviceUUID;
    }

    public final String getDeviceApplicationId() {
        return this.deviceApplicationId;
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceInfo
    public String getDeviceId() {
        return this.deviceId;
    }

    private final String generateDeviceId() {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("unique_device_id", string2);
        editorEdit.apply();
        return string2;
    }

    /* compiled from: Device.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/Device$Companion;", "Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "Lcom/salesforce/android/smi/network/data/model/Device;", "Landroid/content/Context;", "<init>", "()V", "SHARED_PREFS_NAME", "", "SHARED_PREFS_KEY_DEVICE_ID", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends SingletonHolder<Device, Context> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: Device.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.salesforce.android.smi.network.data.model.Device$Companion$1 */
        /* synthetic */ class C423201 extends FunctionReferenceImpl implements Function1<Context, Device> {
            public static final C423201 INSTANCE = new C423201();

            C423201() {
                super(1, Device.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Device invoke(Context p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new Device(p0);
            }
        }

        private Companion() {
            super(C423201.INSTANCE, null, null, 6, null);
        }
    }
}
