package com.robinhood.lib.transfers.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter;
import com.robinhood.lib.transfers.contracts.models.TransferAccount;
import com.robinhood.lib.transfers.contracts.models.TransferAccount2;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: TransferAccountsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/lib/transfers/contracts/TransferAccountsService_Adapter;", "Lcom/robinhood/lib/transfers/contracts/TransferAccountsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount;", "getTransferAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getTransferAccounts", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class TransferAccountsService_Adapter implements TransferAccountsService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: TransferAccountsService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter", m3645f = "TransferAccountsService_Adapter.kt", m3646l = {112}, m3647m = "getTransferAccounts")
    /* renamed from: com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter$getTransferAccounts$1 */
    static final class C333981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C333981(Continuation<? super C333981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferAccountsService_Adapter.this.getTransferAccounts(this);
        }
    }

    public TransferAccountsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.lib.transfers.contracts.TransferAccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTransferAccounts(Continuation<? super List<TransferAccount>> continuation) throws IOException {
        C333981 c333981;
        if (continuation instanceof C333981) {
            c333981 = (C333981) continuation;
            int i = c333981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333981.label = i - Integer.MIN_VALUE;
            } else {
                c333981 = new C333981(continuation);
            }
        }
        C333981 c3339812 = c333981;
        Object objCallSuspendFunction = c3339812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3339812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_getTransferAccounts.Emission> kSerializerSerializer = Endpoint_getTransferAccounts.Emission.INSTANCE.serializer();
            c3339812.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "getTransferAccounts", unit, c3339812);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getTransferAccounts.Emission) objCallSuspendFunction).getValue();
    }

    /* compiled from: TransferAccountsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/lib/transfers/contracts/TransferAccountsService_Adapter$Endpoint_getTransferAccounts;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/lib/transfers/contracts/TransferAccountsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/lib/transfers/contracts/TransferAccountsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getTransferAccounts implements ServiceCallable {
        private final Json json;
        private final TransferAccountsService service;

        public Endpoint_getTransferAccounts(TransferAccountsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            TransferAccountsService_Adapter3 transferAccountsService_Adapter3 = new TransferAccountsService_Adapter3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, transferAccountsService_Adapter3);
        }

        /* compiled from: TransferAccountsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/lib/transfers/contracts/TransferAccountsService_Adapter$Endpoint_getTransferAccounts$Emission;", "", "value", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<TransferAccount> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter$Endpoint_getTransferAccounts$Emission$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountsService_Adapter.Endpoint_getTransferAccounts.Emission._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(TransferAccount2.INSTANCE);
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22543boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends TransferAccount> m22544constructorimpl(List<TransferAccount> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22545equalsimpl(List<? extends TransferAccount> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22546equalsimpl0(List<? extends TransferAccount> list, List<? extends TransferAccount> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22547hashCodeimpl(List<? extends TransferAccount> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22548toStringimpl(List<? extends TransferAccount> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m22545equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22547hashCodeimpl(this.value);
            }

            public String toString() {
                return m22548toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: TransferAccountsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/lib/transfers/contracts/TransferAccountsService_Adapter$Endpoint_getTransferAccounts$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/lib/transfers/contracts/TransferAccountsService_Adapter$Endpoint_getTransferAccounts$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return TransferAccountsService_Adapter2.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<TransferAccount> getValue() {
                return this.value;
            }
        }
    }
}
