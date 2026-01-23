package com.twilio.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerDispatcher4;

/* compiled from: CurrentThreadDispatcherAndroid.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"currentThreadDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.CurrentThreadDispatcherAndroidKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CurrentThreadDispatcherAndroid {
    public static final CoroutineDispatcher currentThreadDispatcher() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper == null ? Dispatchers.getMain() : HandlerDispatcher4.from$default(new Handler(looperMyLooper), null, 1, null);
    }
}
