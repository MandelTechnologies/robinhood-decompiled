package com.robinhood.android;

import com.robinhood.android.AppComponent;
import com.robinhood.android.MergedAppComponent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MergedAppComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/DaggerAppComponent;", "", "<init>", "()V", "factory", "Lcom/robinhood/android/AppComponent$Factory;", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.DaggerAppComponent, reason: use source file name */
/* loaded from: classes17.dex */
public final class MergedAppComponent2 {
    public static final MergedAppComponent2 INSTANCE = new MergedAppComponent2();

    private MergedAppComponent2() {
    }

    @JvmStatic
    public static final AppComponent.Factory factory() {
        MergedAppComponent.Factory factory = DaggerMergedAppComponent.factory();
        Intrinsics.checkNotNullExpressionValue(factory, "factory(...)");
        return factory;
    }
}
