package com.robinhood.shared.microgram.common.services;

import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.microgram.apppreferences.AppPreferences;
import com.robinhood.microgram.apppreferences.AppPreferences_AdapterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.ManagedServiceExtension;

/* compiled from: RealMicrogramAppPreferencesManager_Hammer.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramAppPreferencesManager_Provisions;", "", "<init>", "()V", "provideServiceExtension", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.microgram.common.services.RealMicrogramAppPreferencesManager_Provisions, reason: use source file name */
/* loaded from: classes6.dex */
public final class RealMicrogramAppPreferencesManager_Hammer2 {
    public static final RealMicrogramAppPreferencesManager_Hammer2 INSTANCE = new RealMicrogramAppPreferencesManager_Hammer2();

    private RealMicrogramAppPreferencesManager_Hammer2() {
    }

    public final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, Json json, AppPreferences service) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(service, "service");
        return new ManagedServiceExtension(coroutineScope, messageDispatcher, AppPreferences_AdapterKt.getContractAnnotation_AppPreferences(Reflection.getOrCreateKotlinClass(AppPreferences.class)), AppPreferences_AdapterKt.endpoints(service, json), json, service);
    }
}
