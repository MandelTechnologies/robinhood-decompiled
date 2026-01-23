package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.os.LocaleListCompat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.utils.Supplier;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: DeviceDataFactoryImpl.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "context", "Landroid/content/Context;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/Supplier;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "", "", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class DeviceDataFactoryImpl implements DeviceDataFactory {
    private final DisplayMetrics displayMetrics;
    private final Supplier<HardwareId> hardwareIdSupplier;

    public DeviceDataFactoryImpl(Context context, Supplier<HardwareId> hardwareIdSupplier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hardwareIdSupplier, "hardwareIdSupplier");
        this.hardwareIdSupplier = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.displayMetrics = displayMetrics;
    }

    @Override // com.stripe.android.stripe3ds2.init.DeviceDataFactory
    public Map<String, Object> create() {
        Map mapEmptyMap;
        String value = this.hardwareIdSupplier.get().getValue();
        Tuples2 tuples2M3642to = Tuples4.m3642to(DeviceParam.PARAM_PLATFORM.getCode(), "Android");
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(DeviceParam.PARAM_DEVICE_MODEL.getCode(), Build.MODEL);
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(DeviceParam.PARAM_OS_NAME.getCode(), Build.VERSION.CODENAME);
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(DeviceParam.PARAM_OS_VERSION.getCode(), Build.VERSION.RELEASE);
        Tuples2 tuples2M3642to5 = Tuples4.m3642to(DeviceParam.PARAM_LOCALE.getCode(), LocaleListCompat.create(Locale.getDefault()).toLanguageTags());
        Tuples2 tuples2M3642to6 = Tuples4.m3642to(DeviceParam.PARAM_TIME_ZONE.getCode(), TimeZone.getDefault().getDisplayName());
        String code = DeviceParam.PARAM_SCREEN_RESOLUTION.getCode();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.displayMetrics.heightPixels), Integer.valueOf(this.displayMetrics.widthPixels)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        Map mapMapOf = MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, Tuples4.m3642to(code, str));
        if (value.length() > 0) {
            mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to(DeviceParam.PARAM_HARDWARE_ID.getCode(), value));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapMapOf, mapEmptyMap);
    }
}
