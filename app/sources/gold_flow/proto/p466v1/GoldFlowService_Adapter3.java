package gold_flow.proto.p466v1;

import com.robinhood.idl.RhGenerated;
import gold_flow.proto.p466v1.GoldFlowService_Adapter;
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

/* compiled from: GoldFlowService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a'\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u000b\u001aA\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u000b\u001a0\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\"$\u0010\u0017\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00040\b8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"endpoints", "", "", "Lmicrogram/service/protocol/ServiceCallable;", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "createClient", "Lkotlin/reflect/KClass;", "bridge", "Lmicrogram/service/bridge/ClientBridge;", "createClient_GoldFlowService", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "uuidGenerator", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "messageDispatcher", "Lmicrogram/MessageDispatcher;", "createMessageHandler", "Lkotlin/Pair;", "Lmicrogram/MessageHandler;", "contractAnnotation", "Lmicrogram/annotation/Contract;", "getContractAnnotation_GoldFlowService$annotations", "(Lkotlin/reflect/KClass;)V", "getContractAnnotation_GoldFlowService", "(Lkotlin/reflect/KClass;)Lmicrogram/annotation/Contract;", "gold_flow.v1_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: gold_flow.proto.v1.GoldFlowService_AdapterKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GoldFlowService_Adapter3 {
    @RhGenerated
    public static /* synthetic */ void getContractAnnotation_GoldFlowService$annotations(KClass kClass) {
    }

    @RhGenerated
    public static final Map<String, ServiceCallable> endpoints(GoldFlowService goldFlowService, Json json) {
        Intrinsics.checkNotNullParameter(goldFlowService, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        return MapsKt.mapOf(Tuples4.m3642to("StreamRouterMessage", new GoldFlowService_Adapter.StreamRouterMessageEndpoint(goldFlowService, json)), Tuples4.m3642to("SendAction", new GoldFlowService_Adapter.SendActionEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamValuePropsContent", new GoldFlowService_Adapter.StreamValuePropsContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamMultiAgreementsContent", new GoldFlowService_Adapter.StreamMultiAgreementsContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamSingleAgreementContent", new GoldFlowService_Adapter.StreamSingleAgreementContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamConfirmationContent", new GoldFlowService_Adapter.StreamConfirmationContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamSuggestedActionContent", new GoldFlowService_Adapter.StreamSuggestedActionContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamAgreementDisplayContent", new GoldFlowService_Adapter.StreamAgreementDisplayContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamValuePropsPromoContent", new GoldFlowService_Adapter.StreamValuePropsPromoContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamPlanSelectionContent", new GoldFlowService_Adapter.StreamPlanSelectionContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamSageStartApplicationContent", new GoldFlowService_Adapter.StreamSageStartApplicationContentEndpoint(goldFlowService, json)), Tuples4.m3642to("StreamSageApplicationContent", new GoldFlowService_Adapter.StreamSageApplicationContentEndpoint(goldFlowService, json)));
    }

    @RhGenerated
    @JvmName
    public static final GoldFlowService createClient_GoldFlowService(KClass<GoldFlowService> kClass, ClientBridge bridge, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        return new GoldFlowService_Adapter(bridge, json);
    }

    @RhGenerated
    @JvmName
    public static final GoldFlowService createClient_GoldFlowService(KClass<GoldFlowService> kClass, CoroutineScope coroutineScope, IdGenerator<UUID> uuidGenerator, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        PeerClientBridge peerClientBridge = new PeerClientBridge(Peer5.peer(messageDispatcher, "gold_flow.proto.v1.GoldFlowService#implementation", json), uuidGenerator);
        messageDispatcher.registerMessageHandler("gold_flow.proto.v1.GoldFlowService#client", ProtocolMessageSubscriber4.createMessageHandler(peerClientBridge, coroutineScope, json));
        return new GoldFlowService_Adapter(peerClientBridge, json);
    }

    @RhGenerated
    public static final Tuples2<String, MessageDispatcher2> createMessageHandler(GoldFlowService goldFlowService, CoroutineScope coroutineScope, MessageDispatcher messageDispatcher, Json json) {
        Intrinsics.checkNotNullParameter(goldFlowService, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        return new Tuples2<>("gold_flow.proto.v1.GoldFlowService#implementation", ProtocolMessageSubscriber4.createMessageHandler(new ImplementationBridge(coroutineScope, new Endpoints3(json, endpoints(goldFlowService, json)), Peer5.peer(messageDispatcher, "gold_flow.proto.v1.GoldFlowService#client", json)), coroutineScope, json));
    }

    @JvmName
    public static final ManagedServices getContractAnnotation_GoldFlowService(KClass<GoldFlowService> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        final String str = "gold_flow.proto.v1.GoldFlowService";
        return new ManagedServices(str) { // from class: gold_flow.proto.v1.GoldFlowService_AdapterKt$annotationImpl$microgram_annotation_Contract$0
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
