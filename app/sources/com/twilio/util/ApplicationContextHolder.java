package com.twilio.util;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ApplicationContextHolder.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R1\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, m3636d2 = {"Lcom/twilio/util/ApplicationContextHolder;", "", "()V", "<set-?>", "Landroid/content/Context;", "applicationContext", "getApplicationContext$annotations", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "applicationContext$delegate", "Lkotlin/properties/ReadWriteProperty;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ApplicationContextHolder {
    public static final ApplicationContextHolder INSTANCE = new ApplicationContextHolder();
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(INSTANCE, ApplicationContextHolder.class, "applicationContext", "getApplicationContext()Landroid/content/Context;", 0))};

    /* renamed from: applicationContext$delegate, reason: from kotlin metadata */
    private static final Interfaces3 applicationContext = DelegatesExtensions2.atomicNotNull(Delegates.INSTANCE);

    @JvmStatic
    public static /* synthetic */ void getApplicationContext$annotations() {
    }

    private ApplicationContextHolder() {
    }

    public static final Context getApplicationContext() {
        return (Context) applicationContext.getValue(INSTANCE, $$delegatedProperties[0]);
    }

    public static final void setApplicationContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        applicationContext.setValue(INSTANCE, $$delegatedProperties[0], context);
    }
}
