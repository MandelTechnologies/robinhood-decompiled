package com.robinhood.shared.microgram.common.services;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.microgram.apppreferences.AppPreferences;
import com.robinhood.shared.microgram.common.services.prefs.MicrogramUserPrefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RealMicrogramAppPreferencesManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u001cJ\u0016\u0010 \u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramAppPreferencesManager;", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "getBool", "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDouble", "", "getInt", "", "getEpochSeconds", "", "getLong", "getString", "setBool", "", "value", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDouble", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLong", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEpochSeconds", AnalyticsStrings.BUTTON_LIST_DELETE, "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RealMicrogramAppPreferencesManager implements AppPreferences {
    private final SharedPreferences preferences;

    public RealMicrogramAppPreferencesManager(@MicrogramUserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object getBool(String str, Continuation<? super Boolean> continuation) {
        return boxing.boxBoolean(this.preferences.getBoolean(str, false));
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object getDouble(String str, Continuation<? super Double> continuation) {
        if (this.preferences.contains(str)) {
            return boxing.boxDouble(Double.longBitsToDouble(this.preferences.getLong(str, Double.doubleToRawLongBits(0.0d))));
        }
        return null;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object getInt(String str, Continuation<? super Integer> continuation) {
        if (this.preferences.contains(str)) {
            return boxing.boxInt(this.preferences.getInt(str, 0));
        }
        return null;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object getEpochSeconds(String str, Continuation<? super Long> continuation) {
        if (this.preferences.contains(str)) {
            return boxing.boxLong(this.preferences.getLong(str, 0L));
        }
        return null;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object getLong(String str, Continuation<? super Long> continuation) {
        if (this.preferences.contains(str)) {
            return boxing.boxLong(this.preferences.getLong(str, 0L));
        }
        return null;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object getString(String str, Continuation<? super String> continuation) {
        if (this.preferences.contains(str)) {
            return this.preferences.getString(str, "");
        }
        return null;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setBool(String str, boolean z, Continuation<? super Unit> continuation) {
        this.preferences.edit().putBoolean(str, z).apply();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setDouble(String str, double d, Continuation<? super Unit> continuation) {
        this.preferences.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setInt(String str, int i, Continuation<? super Unit> continuation) {
        this.preferences.edit().putInt(str, i).apply();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setLong(String str, long j, Continuation<? super Unit> continuation) {
        this.preferences.edit().putLong(str, j).apply();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setString(String str, String str2, Continuation<? super Unit> continuation) {
        this.preferences.edit().putString(str, str2).apply();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setEpochSeconds(String str, long j, Continuation<? super Unit> continuation) {
        this.preferences.edit().putLong(str, j).apply();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object delete(String str, Continuation<? super Unit> continuation) {
        this.preferences.edit().remove(str).apply();
        return Unit.INSTANCE;
    }
}
