package com.robinhood.microgram.apppreferences;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: AppPreferences.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences;", "", AnalyticsStrings.BUTTON_LIST_DELETE, "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBool", "", "getDouble", "", "getEpochSeconds", "", "getInt", "", "getLong", "getString", "setBool", "value", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDouble", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEpochSeconds", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLong", "setString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.app_prefs")
/* loaded from: classes13.dex */
public interface AppPreferences {
    Object delete(String str, Continuation<? super Unit> continuation);

    Object getBool(String str, Continuation<? super Boolean> continuation);

    Object getDouble(String str, Continuation<? super Double> continuation);

    Object getEpochSeconds(String str, Continuation<? super Long> continuation);

    Object getInt(String str, Continuation<? super Integer> continuation);

    Object getLong(String str, Continuation<? super Long> continuation);

    Object getString(String str, Continuation<? super String> continuation);

    Object setBool(String str, boolean z, Continuation<? super Unit> continuation);

    Object setDouble(String str, double d, Continuation<? super Unit> continuation);

    Object setEpochSeconds(String str, long j, Continuation<? super Unit> continuation);

    Object setInt(String str, int i, Continuation<? super Unit> continuation);

    Object setLong(String str, long j, Continuation<? super Unit> continuation);

    Object setString(String str, String str2, Continuation<? super Unit> continuation);
}
