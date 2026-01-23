package com.robinhood.apy.mindeposit.contracts;

import com.robinhood.apy.mindeposit.contracts.ApyMinDepositEducationService_Adapter;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.MessageDispatcher;
import microgram.MessageDispatcher2;
import microgram.annotation.ManagedServices;
import microgram.generator.IdGenerator;
import microgram.service.bridge.ClientBridge;
import microgram.service.bridge.ImplementationBridge;
import microgram.service.bridge.PeerClientBridge;
import microgram.service.managed.Endpoints3;
import microgram.service.protocol.Peer5;
import microgram.service.protocol.ProtocolMessageSubscriber4;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ApyMinDepositEducationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0013\u001a'\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0013\u001a0\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017*\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\"$\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, m3636d2 = {"contractAnnotation", "Lmicrogram/annotation/Contract;", "Lkotlin/reflect/KClass;", "Lcom/robinhood/apy/mindeposit/contracts/ApyMinDepositEducationService;", "getContractAnnotation_ApyMinDepositEducationService$annotations", "(Lkotlin/reflect/KClass;)V", "getContractAnnotation_ApyMinDepositEducationService", "(Lkotlin/reflect/KClass;)Lmicrogram/annotation/Contract;", "createClient", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "uuidGenerator", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "messageDispatcher", "Lmicrogram/MessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "createClient_ApyMinDepositEducationService", "bridge", "Lmicrogram/service/bridge/ClientBridge;", "createMessageHandler", "Lkotlin/Pair;", "", "Lmicrogram/MessageHandler;", "endpoints", "", "Lmicrogram/service/protocol/ServiceCallable;", "contracts"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.robinhood.apy.mindeposit.contracts.ApyMinDepositEducationService_AdapterKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class ApyMinDepositEducationService_Adapter3 {
    public static /* synthetic */ void getContractAnnotation_ApyMinDepositEducationService$annotations(KClass kClass) {
    }

    public static final Map<String, ServiceCallable> endpoints(ApyMinDepositEducationService apyMinDepositEducationService, Json json) {
        Intrinsics.checkNotNullParameter(apyMinDepositEducationService, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        return MapsKt.mapOf(Tuples4.m3642to("dismissPage", new ApyMinDepositEducationService_Adapter.Endpoint_dismissPage(apyMinDepositEducationService, json)));
    }

    @JvmName
    public static final ApyMinDepositEducationService createClient_ApyMinDepositEducationService(KClass<ApyMinDepositEducationService> kClass, ClientBridge bridge, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        return new ApyMinDepositEducationService_Adapter(bridge, json);
    }

    @JvmName
    public static final ApyMinDepositEducationService createClient_ApyMinDepositEducationService(KClass<ApyMinDepositEducationService> kClass, CoroutineScope coroutineScope, IdGenerator<UUID> uuidGenerator, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        PeerClientBridge peerClientBridge = new PeerClientBridge(Peer5.peer(messageDispatcher, "com.robinhood.apy.mindeposit.ApyMinDepositEducationService#implementation", json), uuidGenerator);
        messageDispatcher.registerMessageHandler("com.robinhood.apy.mindeposit.ApyMinDepositEducationService#client", ProtocolMessageSubscriber4.createMessageHandler(peerClientBridge, coroutineScope, json));
        return new ApyMinDepositEducationService_Adapter(peerClientBridge, json);
    }

    public static final Tuples2<String, MessageDispatcher2> createMessageHandler(ApyMinDepositEducationService apyMinDepositEducationService, CoroutineScope coroutineScope, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(apyMinDepositEducationService, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        return new Tuples2<>("com.robinhood.apy.mindeposit.ApyMinDepositEducationService#implementation", ProtocolMessageSubscriber4.createMessageHandler(new ImplementationBridge(coroutineScope, new Endpoints3(json, endpoints(apyMinDepositEducationService, json)), Peer5.peer(messageDispatcher, "com.robinhood.apy.mindeposit.ApyMinDepositEducationService#client", json)), coroutineScope, json));
    }

    @JvmName
    public static final ManagedServices getContractAnnotation_ApyMinDepositEducationService(KClass<ApyMinDepositEducationService> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        final String str = "com.robinhood.apy.mindeposit.ApyMinDepositEducationService";
        return new ManagedServices(str) { // from class: com.robinhood.apy.mindeposit.contracts.ApyMinDepositEducationService_AdapterKt$annotationImpl$microgram_annotation_Contract$0
            private final /* synthetic */ String serviceName;

            {
                Intrinsics.checkNotNullParameter(str, "serviceName");
                this.serviceName = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ManagedServices.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ManagedServices) && Intrinsics.areEqual(serviceName(), ((ManagedServices) obj).serviceName());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.serviceName.hashCode() ^ (-115532512);
            }

            @Override // microgram.annotation.ManagedServices
            public final /* synthetic */ String serviceName() {
                return this.serviceName;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@microgram.annotation.Contract(serviceName=" + this.serviceName + ")";
            }
        };
    }
}
