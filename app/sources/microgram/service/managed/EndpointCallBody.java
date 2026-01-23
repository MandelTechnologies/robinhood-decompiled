package microgram.service.managed;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializers2;

/* compiled from: Endpoints.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, m3636d2 = {"Lmicrogram/service/managed/EndpointCallBody;", "", "", "endpointName", "Lkotlinx/serialization/json/JsonElement;", "arguments", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_service", "(Lmicrogram/service/managed/EndpointCallBody;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEndpointName", "Lkotlinx/serialization/json/JsonElement;", "getArguments", "()Lkotlinx/serialization/json/JsonElement;", "Companion", "$serializer", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class EndpointCallBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final JsonElement arguments;
    private final String endpointName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointCallBody)) {
            return false;
        }
        EndpointCallBody endpointCallBody = (EndpointCallBody) other;
        return Intrinsics.areEqual(this.endpointName, endpointCallBody.endpointName) && Intrinsics.areEqual(this.arguments, endpointCallBody.arguments);
    }

    public int hashCode() {
        return (this.endpointName.hashCode() * 31) + this.arguments.hashCode();
    }

    public String toString() {
        return "EndpointCallBody(endpointName=" + this.endpointName + ", arguments=" + this.arguments + ")";
    }

    /* compiled from: Endpoints.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/service/managed/EndpointCallBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/managed/EndpointCallBody;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EndpointCallBody> serializer() {
            return Endpoints2.INSTANCE;
        }
    }

    public /* synthetic */ EndpointCallBody(int i, String str, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, Endpoints2.INSTANCE.getDescriptor());
        }
        this.endpointName = str;
        this.arguments = jsonElement;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_service(EndpointCallBody self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.endpointName);
        output.encodeSerializableElement(serialDesc, 1, JsonElementSerializers2.INSTANCE, self.arguments);
    }

    public EndpointCallBody(String endpointName, JsonElement arguments) {
        Intrinsics.checkNotNullParameter(endpointName, "endpointName");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.endpointName = endpointName;
        this.arguments = arguments;
    }

    public final String getEndpointName() {
        return this.endpointName;
    }

    public final JsonElement getArguments() {
        return this.arguments;
    }
}
