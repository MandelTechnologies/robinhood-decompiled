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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializers2;
import microgram.MicrogramError;
import microgram.serialization.UuidStringSerializer;

/* compiled from: ProtocolMessage.kt */
@JsonAnnotations(discriminator = "kind")
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/service/protocol/Response;", "Lmicrogram/service/protocol/ProtocolMessage;", "<init>", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Emission", "Termination", "Companion", "Lmicrogram/service/protocol/Response$Emission;", "Lmicrogram/service/protocol/Response$Termination;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* renamed from: microgram.service.protocol.Response, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class ProtocolMessage6 extends ProtocolMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.service.protocol.Response$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProtocolMessage6._init_$_anonymous_();
        }
    });

    public /* synthetic */ ProtocolMessage6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Response;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.service.protocol.Response$Companion, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ProtocolMessage6.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProtocolMessage6> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ ProtocolMessage6(int i, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedSerializer("microgram.service.protocol.Response", Reflection.getOrCreateKotlinClass(ProtocolMessage6.class), new KClass[]{Reflection.getOrCreateKotlinClass(Emission.class), Reflection.getOrCreateKotlinClass(Termination.class)}, new KSerializer[]{ProtocolMessage7.INSTANCE, ProtocolMessage8.INSTANCE}, new Annotation[]{new ProtocolMessage2("kind")});
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Emission;", "Lmicrogram/service/protocol/Response;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "callId", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "<init>", "(Ljava/util/UUID;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_service", "(Lmicrogram/service/protocol/Response$Emission;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getCallId", "()Ljava/util/UUID;", "Lkotlinx/serialization/json/JsonElement;", "getBody", "()Lkotlinx/serialization/json/JsonElement;", "Companion", "$serializer", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    @SerialName("emission")
    /* renamed from: microgram.service.protocol.Response$Emission, reason: from toString */
    public static final /* data */ class Emission extends ProtocolMessage6 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final JsonElement body;
        private final UUID callId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Emission)) {
                return false;
            }
            Emission emission = (Emission) other;
            return Intrinsics.areEqual(this.callId, emission.callId) && Intrinsics.areEqual(this.body, emission.body);
        }

        public int hashCode() {
            return (this.callId.hashCode() * 31) + this.body.hashCode();
        }

        public String toString() {
            return "Emission(callId=" + this.callId + ", body=" + this.body + ")";
        }

        /* compiled from: ProtocolMessage.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Response$Emission;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.service.protocol.Response$Emission$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Emission> serializer() {
                return ProtocolMessage7.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Emission(int i, UUID uuid, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, ProtocolMessage7.INSTANCE.getDescriptor());
            }
            this.callId = uuid;
            this.body = jsonElement;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_service(Emission self, Encoding3 output, SerialDescriptor serialDesc) {
            ProtocolMessage.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, UuidStringSerializer.INSTANCE, self.getCallId());
            output.encodeSerializableElement(serialDesc, 1, JsonElementSerializers2.INSTANCE, self.body);
        }

        public UUID getCallId() {
            return this.callId;
        }

        public final JsonElement getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Emission(UUID callId, JsonElement body) {
            super(null);
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(body, "body");
            this.callId = callId;
            this.body = body;
        }
    }

    private ProtocolMessage6() {
        super(null);
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003()'B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Termination;", "Lmicrogram/service/protocol/Response;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "callId", "Lmicrogram/service/protocol/Response$Termination$Error;", "error", "<init>", "(Ljava/util/UUID;Lmicrogram/service/protocol/Response$Termination$Error;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Lmicrogram/service/protocol/Response$Termination$Error;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_service", "(Lmicrogram/service/protocol/Response$Termination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getCallId", "()Ljava/util/UUID;", "Lmicrogram/service/protocol/Response$Termination$Error;", "getError", "()Lmicrogram/service/protocol/Response$Termination$Error;", "Companion", "Error", "$serializer", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    @SerialName("termination")
    /* renamed from: microgram.service.protocol.Response$Termination, reason: from toString */
    public static final /* data */ class Termination extends ProtocolMessage6 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UUID callId;
        private final Error error;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Termination)) {
                return false;
            }
            Termination termination = (Termination) other;
            return Intrinsics.areEqual(this.callId, termination.callId) && Intrinsics.areEqual(this.error, termination.error);
        }

        public int hashCode() {
            int iHashCode = this.callId.hashCode() * 31;
            Error error = this.error;
            return iHashCode + (error == null ? 0 : error.hashCode());
        }

        public String toString() {
            return "Termination(callId=" + this.callId + ", error=" + this.error + ")";
        }

        /* compiled from: ProtocolMessage.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Termination$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Response$Termination;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: microgram.service.protocol.Response$Termination$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Termination> serializer() {
                return ProtocolMessage8.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Termination(int i, UUID uuid, Error error, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, ProtocolMessage8.INSTANCE.getDescriptor());
            }
            this.callId = uuid;
            if ((i & 2) == 0) {
                this.error = null;
            } else {
                this.error = error;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_service(Termination self, Encoding3 output, SerialDescriptor serialDesc) {
            ProtocolMessage.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, UuidStringSerializer.INSTANCE, self.getCallId());
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.error == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, ProtocolMessage9.INSTANCE, self.error);
        }

        public UUID getCallId() {
            return this.callId;
        }

        public final Error getError() {
            return this.error;
        }

        /* compiled from: ProtocolMessage.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0017¨\u0006'"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Termination$Error;", "", "Lmicrogram/MicrogramError;", "code", "", "description", "<init>", "(Lmicrogram/MicrogramError;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/MicrogramError;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_service", "(Lmicrogram/service/protocol/Response$Termination$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/MicrogramError;", "getCode", "()Lmicrogram/MicrogramError;", "getCode$annotations", "()V", "Ljava/lang/String;", "getDescription", "Companion", "$serializer", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        /* renamed from: microgram.service.protocol.Response$Termination$Error, reason: from toString */
        public static final /* data */ class Error {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final MicrogramError code;
            private final String description;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return this.code == error.code && Intrinsics.areEqual(this.description, error.description);
            }

            public int hashCode() {
                return (this.code.hashCode() * 31) + this.description.hashCode();
            }

            public String toString() {
                return "Error(code=" + this.code + ", description=" + this.description + ")";
            }

            /* compiled from: ProtocolMessage.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/protocol/Response$Termination$Error$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/Response$Termination$Error;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: microgram.service.protocol.Response$Termination$Error$Companion, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Error> serializer() {
                    return ProtocolMessage9.INSTANCE;
                }
            }

            public /* synthetic */ Error(int i, MicrogramError microgramError, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, ProtocolMessage9.INSTANCE.getDescriptor());
                }
                this.code = microgramError;
                this.description = str;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_service(Error self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, MicrogramError.CodeSerializer.INSTANCE, self.code);
                output.encodeStringElement(serialDesc, 1, self.description);
            }

            public Error(MicrogramError code, String description) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(description, "description");
                this.code = code;
                this.description = description;
            }

            public final MicrogramError getCode() {
                return this.code;
            }

            public final String getDescription() {
                return this.description;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Termination(UUID callId, Error error) {
            super(null);
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.callId = callId;
            this.error = error;
        }
    }
}
