package microgram.service.protocol;

import com.robinhood.android.car.result.CarResultComposable2;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializers2;
import microgram.serialization.UuidStringSerializer;

/* compiled from: ProtocolMessage.kt */
@JsonAnnotations(discriminator = "kind")
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/service/protocol/Request;", "Lmicrogram/service/protocol/ProtocolMessage;", "<init>", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Call", "Cancellation", "Companion", "Lmicrogram/service/protocol/Request$Call;", "Lmicrogram/service/protocol/Request$Cancellation;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* renamed from: microgram.service.protocol.Request, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class ProtocolMessage3 extends ProtocolMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.service.protocol.Request$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProtocolMessage3._init_$_anonymous_();
        }
    });

    public /* synthetic */ ProtocolMessage3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Request$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Request;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.service.protocol.Request$Companion, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ProtocolMessage3.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProtocolMessage3> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ ProtocolMessage3(int i, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedSerializer("microgram.service.protocol.Request", Reflection.getOrCreateKotlinClass(ProtocolMessage3.class), new KClass[]{Reflection.getOrCreateKotlinClass(Call.class), Reflection.getOrCreateKotlinClass(Cancellation.class)}, new KSerializer[]{ProtocolMessage4.INSTANCE, ProtocolMessage5.INSTANCE}, new Annotation[]{new ProtocolMessage2("kind")});
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, m3636d2 = {"Lmicrogram/service/protocol/Request$Call;", "Lmicrogram/service/protocol/Request;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "callId", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "", "limit", "<init>", "(Ljava/util/UUID;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_service", "(Lmicrogram/service/protocol/Request$Call;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getCallId", "()Ljava/util/UUID;", "Lkotlinx/serialization/json/JsonElement;", "getBody", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "Companion", "$serializer", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    @SerialName("call")
    /* renamed from: microgram.service.protocol.Request$Call, reason: from toString */
    public static final /* data */ class Call extends ProtocolMessage3 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final JsonElement body;
        private final UUID callId;
        private final Integer limit;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Call)) {
                return false;
            }
            Call call = (Call) other;
            return Intrinsics.areEqual(this.callId, call.callId) && Intrinsics.areEqual(this.body, call.body) && Intrinsics.areEqual(this.limit, call.limit);
        }

        public int hashCode() {
            int iHashCode = ((this.callId.hashCode() * 31) + this.body.hashCode()) * 31;
            Integer num = this.limit;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Call(callId=" + this.callId + ", body=" + this.body + ", limit=" + this.limit + ")";
        }

        /* compiled from: ProtocolMessage.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Request$Call$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Request$Call;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.service.protocol.Request$Call$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Call> serializer() {
                return ProtocolMessage4.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Call(int i, UUID uuid, JsonElement jsonElement, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, ProtocolMessage4.INSTANCE.getDescriptor());
            }
            this.callId = uuid;
            this.body = jsonElement;
            if ((i & 4) == 0) {
                this.limit = null;
            } else {
                this.limit = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_service(Call self, Encoding3 output, SerialDescriptor serialDesc) {
            ProtocolMessage.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, UuidStringSerializer.INSTANCE, self.getCallId());
            output.encodeSerializableElement(serialDesc, 1, JsonElementSerializers2.INSTANCE, self.body);
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.limit == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.limit);
        }

        public UUID getCallId() {
            return this.callId;
        }

        public final JsonElement getBody() {
            return this.body;
        }

        public final Integer getLimit() {
            return this.limit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Call(UUID callId, JsonElement body, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(body, "body");
            this.callId = callId;
            this.body = body;
            this.limit = num;
        }
    }

    private ProtocolMessage3() {
        super(null);
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, m3636d2 = {"Lmicrogram/service/protocol/Request$Cancellation;", "Lmicrogram/service/protocol/Request;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "callId", "<init>", "(Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_service", "(Lmicrogram/service/protocol/Request$Cancellation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getCallId", "()Ljava/util/UUID;", "Companion", "$serializer", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    @SerialName("cancellation")
    /* renamed from: microgram.service.protocol.Request$Cancellation, reason: from toString */
    public static final /* data */ class Cancellation extends ProtocolMessage3 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UUID callId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cancellation) && Intrinsics.areEqual(this.callId, ((Cancellation) other).callId);
        }

        public int hashCode() {
            return this.callId.hashCode();
        }

        public String toString() {
            return "Cancellation(callId=" + this.callId + ")";
        }

        /* compiled from: ProtocolMessage.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Request$Cancellation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Request$Cancellation;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.service.protocol.Request$Cancellation$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Cancellation> serializer() {
                return ProtocolMessage5.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cancellation(int i, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, ProtocolMessage5.INSTANCE.getDescriptor());
            }
            this.callId = uuid;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_service(Cancellation self, Encoding3 output, SerialDescriptor serialDesc) {
            ProtocolMessage.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, UuidStringSerializer.INSTANCE, self.getCallId());
        }

        public UUID getCallId() {
            return this.callId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancellation(UUID callId) {
            super(null);
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.callId = callId;
        }
    }
}
