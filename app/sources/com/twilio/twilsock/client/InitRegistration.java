package com.twilio.twilsock.client;

import com.robinhood.referral.SingularAttributionManager;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002,-BM\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J7\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/twilio/twilsock/client/InitRegistration;", "", "seen1", "", "productId", "", "type", "notificationProtocolVersion", "messageTypes", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)V", "getMessageTypes$annotations", "()V", "getMessageTypes", "()Ljava/util/Set;", "getNotificationProtocolVersion$annotations", "getNotificationProtocolVersion", "()I", "getProductId$annotations", "getProductId", "()Ljava/lang/String;", "getType$annotations", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class InitRegistration {
    private final Set<String> messageTypes;
    private final int notificationProtocolVersion;
    private final String productId;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new LinkedHashSetSerializer(StringSerializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitRegistration copy$default(InitRegistration initRegistration, String str, String str2, int i, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = initRegistration.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = initRegistration.type;
        }
        if ((i2 & 4) != 0) {
            i = initRegistration.notificationProtocolVersion;
        }
        if ((i2 & 8) != 0) {
            set = initRegistration.messageTypes;
        }
        return initRegistration.copy(str, str2, i, set);
    }

    @SerialName("message_types")
    public static /* synthetic */ void getMessageTypes$annotations() {
    }

    @SerialName("notification_protocol_version")
    public static /* synthetic */ void getNotificationProtocolVersion$annotations() {
    }

    @SerialName(SingularAttributionManager.PRODUCT_PARAM_KEY)
    public static /* synthetic */ void getProductId$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNotificationProtocolVersion() {
        return this.notificationProtocolVersion;
    }

    public final Set<String> component4() {
        return this.messageTypes;
    }

    public final InitRegistration copy(String productId, String type2, int notificationProtocolVersion, Set<String> messageTypes) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(messageTypes, "messageTypes");
        return new InitRegistration(productId, type2, notificationProtocolVersion, messageTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitRegistration)) {
            return false;
        }
        InitRegistration initRegistration = (InitRegistration) other;
        return Intrinsics.areEqual(this.productId, initRegistration.productId) && Intrinsics.areEqual(this.type, initRegistration.type) && this.notificationProtocolVersion == initRegistration.notificationProtocolVersion && Intrinsics.areEqual(this.messageTypes, initRegistration.messageTypes);
    }

    public int hashCode() {
        return (((((this.productId.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.notificationProtocolVersion)) * 31) + this.messageTypes.hashCode();
    }

    public String toString() {
        return "InitRegistration(productId=" + this.productId + ", type=" + this.type + ", notificationProtocolVersion=" + this.notificationProtocolVersion + ", messageTypes=" + this.messageTypes + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/InitRegistration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/InitRegistration;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitRegistration> serializer() {
            return InitRegistration$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ InitRegistration(int i, @SerialName(SingularAttributionManager.PRODUCT_PARAM_KEY) String str, @SerialName("type") String str2, @SerialName("notification_protocol_version") int i2, @SerialName("message_types") Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, InitRegistration$$serializer.INSTANCE.getDescriptor());
        }
        this.productId = str;
        this.type = str2;
        this.notificationProtocolVersion = i2;
        this.messageTypes = set;
    }

    public InitRegistration(String productId, String type2, int i, Set<String> messageTypes) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(messageTypes, "messageTypes");
        this.productId = productId;
        this.type = type2;
        this.notificationProtocolVersion = i;
        this.messageTypes = messageTypes;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(InitRegistration self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.productId);
        output.encodeStringElement(serialDesc, 1, self.type);
        output.encodeIntElement(serialDesc, 2, self.notificationProtocolVersion);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.messageTypes);
    }

    public final String getProductId() {
        return this.productId;
    }

    public /* synthetic */ InitRegistration(String str, String str2, int i, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "ers" : str2, (i2 & 4) != 0 ? 4 : i, set);
    }

    public final String getType() {
        return this.type;
    }

    public final int getNotificationProtocolVersion() {
        return this.notificationProtocolVersion;
    }

    public final Set<String> getMessageTypes() {
        return this.messageTypes;
    }
}
