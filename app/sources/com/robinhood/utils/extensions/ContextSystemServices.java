package com.robinhood.utils.extensions;

import android.app.ActivityManager;
import android.app.DownloadManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationManagerCompat;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ContextSystemServices.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\n\"\u001f\u0010\f\u001a\u00020\r*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001f\u0010\u0011\u001a\u00020\u0012*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001f\u0010\u0016\u001a\u00020\u0017*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001b\u001a\u00020\u001c*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001f\u0010 \u001a\u00020!*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010%\u001a\u00020&*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u001f\u0010)\u001a\u00020**\u00020\u00028GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b+\u0010,\"\u001f\u0010.\u001a\u00020/*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b0\u00101\"\u001f\u00103\u001a\u000204*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b5\u00106\"\u001f\u00108\u001a\u000209*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b:\u0010;\"\u001f\u0010=\u001a\u00020>*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\b?\u0010@\"\u001f\u0010B\u001a\u00020C*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bD\u0010E\"\u001f\u0010G\u001a\u00020H*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, m3636d2 = {"activityManager", "Landroid/app/ActivityManager;", "Landroid/content/Context;", "getActivityManager", "(Landroid/content/Context;)Landroid/app/ActivityManager;", "activityManager$delegate", "Lkotlin/properties/ReadOnlyProperty;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "clipboardManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "(Landroid/content/Context;)Landroid/content/ClipboardManager;", "clipboardManager$delegate", "downloadManager", "Landroid/app/DownloadManager;", "getDownloadManager", "(Landroid/content/Context;)Landroid/app/DownloadManager;", "downloadManager$delegate", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager$delegate", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "layoutInflater$delegate", "sensorManager", "Landroid/hardware/SensorManager;", "getSensorManager", "(Landroid/content/Context;)Landroid/hardware/SensorManager;", "sensorManager$delegate", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManager", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "shortcutManager", "Landroid/content/pm/ShortcutManager;", "getShortcutManager", "(Landroid/content/Context;)Landroid/content/pm/ShortcutManager;", "shortcutManager$delegate", "powerManager", "Landroid/os/PowerManager;", "getPowerManager", "(Landroid/content/Context;)Landroid/os/PowerManager;", "powerManager$delegate", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "(Landroid/content/Context;)Landroid/location/LocationManager;", "locationManager$delegate", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager", "(Landroid/content/Context;)Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager$delegate", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", "telephonyManager$delegate", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "(Landroid/content/Context;)Landroid/net/wifi/WifiManager;", "wifiManager$delegate", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "(Landroid/content/Context;)Landroid/media/AudioManager;", "audioManager$delegate", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ContextSystemServicesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ContextSystemServices {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "activityManager", "getActivityManager(Landroid/content/Context;)Landroid/app/ActivityManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "connectivityManager", "getConnectivityManager(Landroid/content/Context;)Landroid/net/ConnectivityManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "clipboardManager", "getClipboardManager(Landroid/content/Context;)Landroid/content/ClipboardManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "downloadManager", "getDownloadManager(Landroid/content/Context;)Landroid/app/DownloadManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "inputMethodManager", "getInputMethodManager(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "layoutInflater", "getLayoutInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "sensorManager", "getSensorManager(Landroid/content/Context;)Landroid/hardware/SensorManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "shortcutManager", "getShortcutManager(Landroid/content/Context;)Landroid/content/pm/ShortcutManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "powerManager", "getPowerManager(Landroid/content/Context;)Landroid/os/PowerManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "locationManager", "getLocationManager(Landroid/content/Context;)Landroid/location/LocationManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "accessibilityManager", "getAccessibilityManager(Landroid/content/Context;)Landroid/view/accessibility/AccessibilityManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "telephonyManager", "getTelephonyManager(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "wifiManager", "getWifiManager(Landroid/content/Context;)Landroid/net/wifi/WifiManager;", 1)), Reflection.property1(new PropertyReference1Impl(ContextSystemServices.class, "audioManager", "getAudioManager(Landroid/content/Context;)Landroid/media/AudioManager;", 1))};
    private static final Interfaces2 accessibilityManager$delegate;
    private static final Interfaces2 activityManager$delegate;
    private static final Interfaces2 audioManager$delegate;
    private static final Interfaces2 clipboardManager$delegate;
    private static final Interfaces2 connectivityManager$delegate;
    private static final Interfaces2 downloadManager$delegate;
    private static final Interfaces2 inputMethodManager$delegate;
    private static final Interfaces2 layoutInflater$delegate;
    private static final Interfaces2 locationManager$delegate;
    private static final Interfaces2 powerManager$delegate;
    private static final Interfaces2 sensorManager$delegate;
    private static final Interfaces2 shortcutManager$delegate;
    private static final Interfaces2 telephonyManager$delegate;
    private static final Interfaces2 wifiManager$delegate;

    static {
        ContextSystemServices2 contextSystemServices2 = ContextSystemServices2.INSTANCE;
        activityManager$delegate = contextSystemServices2.systemService("activity");
        connectivityManager$delegate = contextSystemServices2.systemService("connectivity");
        clipboardManager$delegate = contextSystemServices2.systemService("clipboard");
        downloadManager$delegate = contextSystemServices2.systemService("download");
        inputMethodManager$delegate = contextSystemServices2.systemService("input_method");
        layoutInflater$delegate = contextSystemServices2.systemService("layout_inflater");
        sensorManager$delegate = contextSystemServices2.systemService("sensor");
        shortcutManager$delegate = contextSystemServices2.systemService("shortcut");
        powerManager$delegate = contextSystemServices2.systemService("power");
        locationManager$delegate = contextSystemServices2.systemService("location");
        accessibilityManager$delegate = contextSystemServices2.systemService("accessibility");
        telephonyManager$delegate = contextSystemServices2.systemService("phone");
        wifiManager$delegate = contextSystemServices2.systemService(Constants.WIFI);
        audioManager$delegate = contextSystemServices2.systemService("audio");
    }

    public static final ActivityManager getActivityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ActivityManager) activityManager$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public static final ConnectivityManager getConnectivityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ConnectivityManager) connectivityManager$delegate.getValue(context, $$delegatedProperties[1]);
    }

    public static final ClipboardManager getClipboardManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ClipboardManager) clipboardManager$delegate.getValue(context, $$delegatedProperties[2]);
    }

    public static final DownloadManager getDownloadManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DownloadManager) downloadManager$delegate.getValue(context, $$delegatedProperties[3]);
    }

    public static final InputMethodManager getInputMethodManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (InputMethodManager) inputMethodManager$delegate.getValue(context, $$delegatedProperties[4]);
    }

    public static final LayoutInflater getLayoutInflater(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (LayoutInflater) layoutInflater$delegate.getValue(context, $$delegatedProperties[5]);
    }

    public static final SensorManager getSensorManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (SensorManager) sensorManager$delegate.getValue(context, $$delegatedProperties[6]);
    }

    public static final NotificationManagerCompat getNotificationManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(...)");
        return notificationManagerCompatFrom;
    }

    public static final ShortcutManager getShortcutManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextSystemServicesKt$$ExternalSyntheticApiModelOutline0.m2974m(shortcutManager$delegate.getValue(context, $$delegatedProperties[7]));
    }

    public static final PowerManager getPowerManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (PowerManager) powerManager$delegate.getValue(context, $$delegatedProperties[8]);
    }

    public static final LocationManager getLocationManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (LocationManager) locationManager$delegate.getValue(context, $$delegatedProperties[9]);
    }

    public static final AccessibilityManager getAccessibilityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (AccessibilityManager) accessibilityManager$delegate.getValue(context, $$delegatedProperties[10]);
    }

    public static final TelephonyManager getTelephonyManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (TelephonyManager) telephonyManager$delegate.getValue(context, $$delegatedProperties[11]);
    }

    public static final WifiManager getWifiManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (WifiManager) wifiManager$delegate.getValue(context, $$delegatedProperties[12]);
    }

    public static final AudioManager getAudioManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (AudioManager) audioManager$delegate.getValue(context, $$delegatedProperties[13]);
    }
}
