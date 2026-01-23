package com.robinhood.prefs;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPreferencesExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001b\b\u0004\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m3636d2 = {"getOrNull", "T", "Landroid/content/SharedPreferences;", "key", "", "get", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lib-prefs_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.prefs.SharedPreferencesExtensionsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class SharedPreferencesExtensions {
    public static final <T> T getOrNull(SharedPreferences sharedPreferences, String key, Function1<? super SharedPreferences, ? extends T> get) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(get, "get");
        if (sharedPreferences.contains(key)) {
            return get.invoke(sharedPreferences);
        }
        return null;
    }
}
