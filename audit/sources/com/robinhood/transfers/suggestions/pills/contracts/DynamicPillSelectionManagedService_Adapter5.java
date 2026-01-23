package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService_Adapter;
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

/* compiled from: DynamicPillSelectionManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0013\u001a'\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0013\u001a0\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017*\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\"$\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, m3636d2 = {"contractAnnotation", "Lmicrogram/annotation/Contract;", "Lkotlin/reflect/KClass;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillSelectionManagedService;", "getContractAnnotation_DynamicPillSelectionManagedService$annotations", "(Lkotlin/reflect/KClass;)V", "getContractAnnotation_DynamicPillSelectionManagedService", "(Lkotlin/reflect/KClass;)Lmicrogram/annotation/Contract;", "createClient", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "uuidGenerator", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "messageDispatcher", "Lmicrogram/MessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "createClient_DynamicPillSelectionManagedService", "bridge", "Lmicrogram/service/bridge/ClientBridge;", "createMessageHandler", "Lkotlin/Pair;", "", "Lmicrogram/MessageHandler;", "endpoints", "", "Lmicrogram/service/protocol/ServiceCallable;", "contracts"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService_AdapterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DynamicPillSelectionManagedService_Adapter5 {
    /* renamed from: getContractAnnotation_DynamicPillSelectionManagedService$annotations */
    public static /* synthetic */ void m2970xf0098892(KClass kClass) {
    }

    public static final Map<String, ServiceCallable> endpoints(DynamicPillSelectionManagedService dynamicPillSelectionManagedService, Json json) {
        Intrinsics.checkNotNullParameter(dynamicPillSelectionManagedService, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        return MapsKt.mapOf(Tuples4.m3642to(TestTags.LOADED, new DynamicPillSelectionManagedService_Adapter.Endpoint_loaded(dynamicPillSelectionManagedService, json)), Tuples4.m3642to("pillSelected", new DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected(dynamicPillSelectionManagedService, json)));
    }

    @JvmName
    public static final DynamicPillSelectionManagedService createClient_DynamicPillSelectionManagedService(KClass<DynamicPillSelectionManagedService> kClass, ClientBridge bridge, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        return new DynamicPillSelectionManagedService_Adapter(bridge, json);
    }

    @JvmName
    public static final DynamicPillSelectionManagedService createClient_DynamicPillSelectionManagedService(KClass<DynamicPillSelectionManagedService> kClass, CoroutineScope coroutineScope, IdGenerator<UUID> uuidGenerator, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        PeerClientBridge peerClientBridge = new PeerClientBridge(Peer5.peer(messageDispatcher, "mg.dynamicpillsselection#implementation", json), uuidGenerator);
        messageDispatcher.registerMessageHandler("mg.dynamicpillsselection#client", ProtocolMessageSubscriber4.createMessageHandler(peerClientBridge, coroutineScope, json));
        return new DynamicPillSelectionManagedService_Adapter(peerClientBridge, json);
    }

    public static final Tuples2<String, MessageDispatcher2> createMessageHandler(DynamicPillSelectionManagedService dynamicPillSelectionManagedService, CoroutineScope coroutineScope, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(dynamicPillSelectionManagedService, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        return new Tuples2<>("mg.dynamicpillsselection#implementation", ProtocolMessageSubscriber4.createMessageHandler(new ImplementationBridge(coroutineScope, new Endpoints3(json, endpoints(dynamicPillSelectionManagedService, json)), Peer5.peer(messageDispatcher, "mg.dynamicpillsselection#client", json)), coroutineScope, json));
    }

    @JvmName
    public static final ManagedServices getContractAnnotation_DynamicPillSelectionManagedService(KClass<DynamicPillSelectionManagedService> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        final String str = "mg.dynamicpillsselection";
        return new ManagedServices(str) { // from class: com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService_AdapterKt$annotationImpl$microgram_annotation_Contract$0
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
