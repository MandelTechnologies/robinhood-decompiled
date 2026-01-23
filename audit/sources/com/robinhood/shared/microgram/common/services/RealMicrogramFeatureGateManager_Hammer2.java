package com.robinhood.shared.microgram.common.services;

import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.microgram.featuregate.MicrogramFeatureGateManager;
import com.robinhood.microgram.featuregate.MicrogramFeatureGateManager_Adapter5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.ManagedServiceExtension;

/* compiled from: RealMicrogramFeatureGateManager_Hammer.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramFeatureGateManager_Provisions;", "", "<init>", "()V", "provideServiceExtension", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "service", "Lcom/robinhood/microgram/featuregate/MicrogramFeatureGateManager;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.microgram.common.services.RealMicrogramFeatureGateManager_Provisions, reason: use source file name */
/* loaded from: classes6.dex */
public final class RealMicrogramFeatureGateManager_Hammer2 {
    public static final RealMicrogramFeatureGateManager_Hammer2 INSTANCE = new RealMicrogramFeatureGateManager_Hammer2();

    private RealMicrogramFeatureGateManager_Hammer2() {
    }

    public final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, Json json, MicrogramFeatureGateManager service) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(service, "service");
        return new ManagedServiceExtension(coroutineScope, messageDispatcher, MicrogramFeatureGateManager_Adapter5.getContractAnnotation_MicrogramFeatureGateManager(Reflection.getOrCreateKotlinClass(MicrogramFeatureGateManager.class)), MicrogramFeatureGateManager_Adapter5.endpoints(service, json), json, service);
    }
}
