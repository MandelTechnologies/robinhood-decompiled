package io.bitdrift.capture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Preferences.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\"\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lio/bitdrift/capture/Preferences;", "Lio/bitdrift/capture/IPreferences;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "underlyingPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getLong", "", "key", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getString", "setLong", "", "value", "setString", "blocking", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Preferences implements IPreferences {
    private final Context context;
    private final SharedPreferences underlyingPreferences;

    public Preferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.underlyingPreferences = context.getSharedPreferences("io.bitdrift.storage", 0);
    }

    @Override // io.bitdrift.capture.IPreferences
    public Long getLong(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.underlyingPreferences.contains(key)) {
            return Long.valueOf(this.underlyingPreferences.getLong(key, -1L));
        }
        return null;
    }

    @Override // io.bitdrift.capture.IPreferences
    public void setLong(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.underlyingPreferences.edit().putLong(key, value).apply();
    }

    @Override // io.bitdrift.capture.IPreferences
    public String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.underlyingPreferences.getString(key, null);
    }

    @Override // io.bitdrift.capture.IPreferences
    @SuppressLint({"ApplySharedPref"})
    public void setString(String key, String value, boolean blocking) {
        SharedPreferences.Editor editorPutString;
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null) {
            editorPutString = this.underlyingPreferences.edit().remove(key);
        } else {
            editorPutString = this.underlyingPreferences.edit().putString(key, value);
        }
        if (blocking) {
            editorPutString.commit();
        } else {
            editorPutString.apply();
        }
    }
}
