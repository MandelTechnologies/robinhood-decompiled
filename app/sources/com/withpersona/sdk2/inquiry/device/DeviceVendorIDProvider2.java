package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: DeviceVendorIDProvider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/device/RealDeviceVendorIDProvider;", "Lcom/withpersona/sdk2/inquiry/device/DeviceVendorIDProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "androidId", "", "appSetId", "deviceVendorId", "refreshDeviceVendorId", "", "getAndroidId", "device_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider, reason: use source file name */
/* loaded from: classes18.dex */
public final class DeviceVendorIDProvider2 implements DeviceVendorIDProvider {
    private final String androidId;
    private String appSetId;
    private final Context context;

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;

    public DeviceVendorIDProvider2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceVendorIDProvider2.prefs_delegate$lambda$0(this.f$0);
            }
        });
        this.androidId = getAndroidId();
        this.appSetId = "";
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$0(DeviceVendorIDProvider2 deviceVendorIDProvider2) {
        return deviceVendorIDProvider2.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider
    public String deviceVendorId() {
        if (!StringsKt.isBlank(this.androidId)) {
            return this.androidId;
        }
        if (this.appSetId.length() == 0) {
            refreshDeviceVendorId();
        }
        return this.appSetId;
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider
    public void refreshDeviceVendorId() {
        if (StringsKt.isBlank(this.androidId)) {
            AppSetIdClient client = AppSet.getClient(this.context);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
            final Function1 function1 = new Function1() { // from class: com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceVendorIDProvider2.refreshDeviceVendorId$lambda$1(this.f$0, (AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshDeviceVendorId$lambda$1(DeviceVendorIDProvider2 deviceVendorIDProvider2, AppSetIdInfo appSetIdInfo) {
        deviceVendorIDProvider2.appSetId = appSetIdInfo.getId();
        return Unit.INSTANCE;
    }

    private final String getAndroidId() throws NoSuchAlgorithmException {
        if (Build.VERSION.SDK_INT < 26) {
            return "";
        }
        String string2 = getPrefs().getString("ANDROID_ID", null);
        if (string2 != null && !StringsKt.isBlank(string2)) {
            return string2;
        }
        String string3 = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string3 == null || StringsKt.isBlank(string3)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        byte[] bytes = MODEL.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        String str = string3 + ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceVendorIDProvider2.getAndroidId$lambda$3(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
        getPrefs().edit().putString("ANDROID_ID", str).apply();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getAndroidId$lambda$3(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
