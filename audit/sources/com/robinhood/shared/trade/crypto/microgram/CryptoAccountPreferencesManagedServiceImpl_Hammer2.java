package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.hammer.core.internal.RhGenerated;
import contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService;
import contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService_Adapter3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.ManagedServiceExtension;

/* compiled from: CryptoAccountPreferencesManagedServiceImpl_Hammer.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl_Provisions;", "", "<init>", "()V", "provideServiceExtension", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "service", "Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl_Provisions, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoAccountPreferencesManagedServiceImpl_Hammer2 {
    public static final int $stable = 0;
    public static final CryptoAccountPreferencesManagedServiceImpl_Hammer2 INSTANCE = new CryptoAccountPreferencesManagedServiceImpl_Hammer2();

    private CryptoAccountPreferencesManagedServiceImpl_Hammer2() {
    }

    public final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, Json json, CryptoAccountPreferencesManagedService service) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(service, "service");
        return new ManagedServiceExtension(coroutineScope, messageDispatcher, CryptoAccountPreferencesManagedService_Adapter3.getContractAnnotation_CryptoAccountPreferencesManagedService(Reflection.getOrCreateKotlinClass(CryptoAccountPreferencesManagedService.class)), CryptoAccountPreferencesManagedService_Adapter3.endpoints(service, json), json, service);
    }
}
