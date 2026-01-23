package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.content.SharedPreferences;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceId.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR*\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/device/RealDeviceIdProvider;", "Lcom/withpersona/sdk2/inquiry/device/DeviceIdProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "value", "", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "device_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider, reason: use source file name */
/* loaded from: classes18.dex */
public final class DeviceId2 implements DeviceId {
    private final Context context;
    private String deviceId;

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;

    public DeviceId2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceId2.prefs_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$0(DeviceId2 deviceId2) {
        return deviceId2.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceId
    public String getDeviceId() {
        String str = this.deviceId;
        return str == null ? getPrefs().getString("DEVICE_ID", null) : str;
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceId
    public void setDeviceId(String str) {
        if ((!Intrinsics.areEqual(str, this.deviceId) ? str : null) != null) {
            this.deviceId = str;
            getPrefs().edit().putString("DEVICE_ID", this.deviceId).apply();
        }
    }
}
