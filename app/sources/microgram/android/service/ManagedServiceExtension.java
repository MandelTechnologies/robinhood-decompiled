package microgram.android.service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.MessageHandler;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.protocol.Peer3;
import microgram.android.service.protocol.ProtocolMessageSubscriber2;
import microgram.annotation.ManagedServices;
import microgram.annotation.ManagedServices2;
import microgram.service.bridge.ImplementationBridge;
import microgram.service.managed.Endpoints3;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ManagedServiceExtension.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/android/service/ManagedServiceExtension;", "I", "", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "contractAnnotation", "Lmicrogram/annotation/Contract;", "endpoints", "", "", "Lmicrogram/service/protocol/ServiceCallable;", "json", "Lkotlinx/serialization/json/Json;", "instance", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/HostMessageDispatcher;Lmicrogram/annotation/Contract;Ljava/util/Map;Lkotlinx/serialization/json/Json;Ljava/lang/Object;)V", "getInstance", "()Ljava/lang/Object;", "Ljava/lang/Object;", "createMessageHandlers", "Lmicrogram/android/MessageHandler;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ManagedServiceExtension<I> implements ServiceExtension {
    private final ManagedServices contractAnnotation;
    private final CoroutineScope coroutineScope;
    private final Map<String, ServiceCallable> endpoints;
    private final I instance;
    private final Json json;
    private final HostMessageDispatcher messageDispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, ManagedServices contractAnnotation, Map<String, ? extends ServiceCallable> endpoints, Json json, I instance) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(contractAnnotation, "contractAnnotation");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.coroutineScope = coroutineScope;
        this.messageDispatcher = messageDispatcher;
        this.contractAnnotation = contractAnnotation;
        this.endpoints = endpoints;
        this.json = json;
        this.instance = instance;
    }

    @Override // microgram.android.extension.ServiceExtension
    /* renamed from: getInstance */
    public I getService() {
        return this.instance;
    }

    @Override // microgram.android.extension.ServiceExtension
    public Map<String, MessageHandler> createMessageHandlers() {
        return MapsKt.mapOf(Tuples4.m3642to(ManagedServices2.getImplementationTargetName(this.contractAnnotation), ProtocolMessageSubscriber2.createMessageHandler(new ImplementationBridge(this.coroutineScope, new Endpoints3(this.json, this.endpoints), Peer3.peer(this.messageDispatcher, ManagedServices2.getClientTargetName(this.contractAnnotation), this.json)), this.json, this.coroutineScope)));
    }
}
