package advisory.update_investor_profile.proto.p009v1;

import advisory.update_investor_profile.proto.p009v1.AdvisoryUpdateInvestorProfileAllocationService_Adapter;
import com.robinhood.idl.RhGenerated;
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

/* compiled from: AdvisoryUpdateInvestorProfileAllocationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a'\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u000b\u001aA\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u000b\u001a0\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\"$\u0010\u0017\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00040\b8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"endpoints", "", "", "Lmicrogram/service/protocol/ServiceCallable;", "Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "json", "Lkotlinx/serialization/json/Json;", "createClient", "Lkotlin/reflect/KClass;", "bridge", "Lmicrogram/service/bridge/ClientBridge;", "createClient_AdvisoryUpdateInvestorProfileAllocationService", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "uuidGenerator", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "messageDispatcher", "Lmicrogram/MessageDispatcher;", "createMessageHandler", "Lkotlin/Pair;", "Lmicrogram/MessageHandler;", "contractAnnotation", "Lmicrogram/annotation/Contract;", "getContractAnnotation_AdvisoryUpdateInvestorProfileAllocationService$annotations", "(Lkotlin/reflect/KClass;)V", "getContractAnnotation_AdvisoryUpdateInvestorProfileAllocationService", "(Lkotlin/reflect/KClass;)Lmicrogram/annotation/Contract;", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService_AdapterKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class AdvisoryUpdateInvestorProfileAllocationService_Adapter2 {
    @RhGenerated
    /* renamed from: getContractAnnotation_AdvisoryUpdateInvestorProfileAllocationService$annotations */
    public static /* synthetic */ void m2x113e17ce(KClass kClass) {
    }

    @RhGenerated
    public static final Map<String, ServiceCallable> endpoints(AdvisoryUpdateInvestorProfileAllocationService advisoryUpdateInvestorProfileAllocationService, Json json) {
        Intrinsics.checkNotNullParameter(advisoryUpdateInvestorProfileAllocationService, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        return MapsKt.mapOf(Tuples4.m3642to("GetAllocationFlow", new AdvisoryUpdateInvestorProfileAllocationService_Adapter.GetAllocationFlowEndpoint(advisoryUpdateInvestorProfileAllocationService, json)), Tuples4.m3642to("GetNavigationFlow", new AdvisoryUpdateInvestorProfileAllocationService_Adapter.GetNavigationFlowEndpoint(advisoryUpdateInvestorProfileAllocationService, json)));
    }

    @RhGenerated
    @JvmName
    public static final AdvisoryUpdateInvestorProfileAllocationService createClient_AdvisoryUpdateInvestorProfileAllocationService(KClass<AdvisoryUpdateInvestorProfileAllocationService> kClass, ClientBridge bridge, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        return new AdvisoryUpdateInvestorProfileAllocationService_Adapter(bridge, json);
    }

    @RhGenerated
    @JvmName
    public static final AdvisoryUpdateInvestorProfileAllocationService createClient_AdvisoryUpdateInvestorProfileAllocationService(KClass<AdvisoryUpdateInvestorProfileAllocationService> kClass, CoroutineScope coroutineScope, IdGenerator<UUID> uuidGenerator, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        PeerClientBridge peerClientBridge = new PeerClientBridge(Peer5.peer(messageDispatcher, "advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService#implementation", json), uuidGenerator);
        messageDispatcher.registerMessageHandler("advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService#client", ProtocolMessageSubscriber4.createMessageHandler(peerClientBridge, coroutineScope, json));
        return new AdvisoryUpdateInvestorProfileAllocationService_Adapter(peerClientBridge, json);
    }

    @RhGenerated
    public static final Tuples2<String, MessageDispatcher2> createMessageHandler(AdvisoryUpdateInvestorProfileAllocationService advisoryUpdateInvestorProfileAllocationService, CoroutineScope coroutineScope, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(advisoryUpdateInvestorProfileAllocationService, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        return new Tuples2<>("advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService#implementation", ProtocolMessageSubscriber4.createMessageHandler(new ImplementationBridge(coroutineScope, new Endpoints3(json, endpoints(advisoryUpdateInvestorProfileAllocationService, json)), Peer5.peer(messageDispatcher, "advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService#client", json)), coroutineScope, json));
    }

    @JvmName
    /* renamed from: getContractAnnotation_AdvisoryUpdateInvestorProfileAllocationService */
    public static final ManagedServices m1xb4b9604e(KClass<AdvisoryUpdateInvestorProfileAllocationService> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        final String str = "advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService";
        return new ManagedServices(str) { // from class: advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService_AdapterKt$annotationImpl$microgram_annotation_Contract$0
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
