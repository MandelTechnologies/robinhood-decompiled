package com.twilio.twilsock.client;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 92\u00020\u0001:\u000289Bm\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BQ\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0012J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÁ\u0001¢\u0006\u0002\b7R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/twilio/twilsock/client/InitMessageHeaders;", "", "seen1", "", "capabilities", "", "", "token", "continuationToken", "registrations", "Lcom/twilio/twilsock/client/InitRegistration;", "tweaks", "Lkotlinx/serialization/json/JsonObject;", "metadata", "Lcom/twilio/twilsock/client/ClientMetadata;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Lcom/twilio/twilsock/client/ClientMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Lcom/twilio/twilsock/client/ClientMetadata;)V", "getCapabilities$annotations", "()V", "getCapabilities", "()Ljava/util/List;", "getContinuationToken$annotations", "getContinuationToken", "()Ljava/lang/String;", "getMetadata$annotations", "getMetadata", "()Lcom/twilio/twilsock/client/ClientMetadata;", "getRegistrations$annotations", "getRegistrations", "getToken$annotations", "getToken", "getTweaks$annotations", "getTweaks", "()Lkotlinx/serialization/json/JsonObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class InitMessageHeaders {
    private final List<String> capabilities;
    private final String continuationToken;
    private final ClientMetadata metadata;
    private final List<InitRegistration> registrations;
    private final String token;
    private final JsonElement6 tweaks;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, new ArrayListSerializer(InitRegistration$$serializer.INSTANCE), null, null};

    public static /* synthetic */ InitMessageHeaders copy$default(InitMessageHeaders initMessageHeaders, List list, String str, String str2, List list2, JsonElement6 jsonElement6, ClientMetadata clientMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            list = initMessageHeaders.capabilities;
        }
        if ((i & 2) != 0) {
            str = initMessageHeaders.token;
        }
        if ((i & 4) != 0) {
            str2 = initMessageHeaders.continuationToken;
        }
        if ((i & 8) != 0) {
            list2 = initMessageHeaders.registrations;
        }
        if ((i & 16) != 0) {
            jsonElement6 = initMessageHeaders.tweaks;
        }
        if ((i & 32) != 0) {
            clientMetadata = initMessageHeaders.metadata;
        }
        JsonElement6 jsonElement62 = jsonElement6;
        ClientMetadata clientMetadata2 = clientMetadata;
        return initMessageHeaders.copy(list, str, str2, list2, jsonElement62, clientMetadata2);
    }

    @SerialName("capabilities")
    public static /* synthetic */ void getCapabilities$annotations() {
    }

    @SerialName("continuation_token")
    public static /* synthetic */ void getContinuationToken$annotations() {
    }

    @SerialName("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @SerialName("registrations")
    public static /* synthetic */ void getRegistrations$annotations() {
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @SerialName("tweaks")
    public static /* synthetic */ void getTweaks$annotations() {
    }

    public final List<String> component1() {
        return this.capabilities;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<InitRegistration> component4() {
        return this.registrations;
    }

    /* renamed from: component5, reason: from getter */
    public final JsonElement6 getTweaks() {
        return this.tweaks;
    }

    /* renamed from: component6, reason: from getter */
    public final ClientMetadata getMetadata() {
        return this.metadata;
    }

    public final InitMessageHeaders copy(List<String> capabilities, String token, String continuationToken, List<InitRegistration> registrations, JsonElement6 tweaks, ClientMetadata metadata) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(token, "token");
        return new InitMessageHeaders(capabilities, token, continuationToken, registrations, tweaks, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitMessageHeaders)) {
            return false;
        }
        InitMessageHeaders initMessageHeaders = (InitMessageHeaders) other;
        return Intrinsics.areEqual(this.capabilities, initMessageHeaders.capabilities) && Intrinsics.areEqual(this.token, initMessageHeaders.token) && Intrinsics.areEqual(this.continuationToken, initMessageHeaders.continuationToken) && Intrinsics.areEqual(this.registrations, initMessageHeaders.registrations) && Intrinsics.areEqual(this.tweaks, initMessageHeaders.tweaks) && Intrinsics.areEqual(this.metadata, initMessageHeaders.metadata);
    }

    public int hashCode() {
        int iHashCode = ((this.capabilities.hashCode() * 31) + this.token.hashCode()) * 31;
        String str = this.continuationToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<InitRegistration> list = this.registrations;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        JsonElement6 jsonElement6 = this.tweaks;
        int iHashCode4 = (iHashCode3 + (jsonElement6 == null ? 0 : jsonElement6.hashCode())) * 31;
        ClientMetadata clientMetadata = this.metadata;
        return iHashCode4 + (clientMetadata != null ? clientMetadata.hashCode() : 0);
    }

    public String toString() {
        return "InitMessageHeaders(capabilities=" + this.capabilities + ", token=" + this.token + ", continuationToken=" + this.continuationToken + ", registrations=" + this.registrations + ", tweaks=" + this.tweaks + ", metadata=" + this.metadata + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/InitMessageHeaders$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/InitMessageHeaders;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitMessageHeaders> serializer() {
            return InitMessageHeaders$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ InitMessageHeaders(int i, @SerialName("capabilities") List list, @SerialName("token") String str, @SerialName("continuation_token") String str2, @SerialName("registrations") List list2, @SerialName("tweaks") JsonElement6 jsonElement6, @SerialName("metadata") ClientMetadata clientMetadata, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, InitMessageHeaders$$serializer.INSTANCE.getDescriptor());
        }
        this.capabilities = list;
        this.token = str;
        if ((i & 4) == 0) {
            this.continuationToken = null;
        } else {
            this.continuationToken = str2;
        }
        if ((i & 8) == 0) {
            this.registrations = null;
        } else {
            this.registrations = list2;
        }
        if ((i & 16) == 0) {
            this.tweaks = null;
        } else {
            this.tweaks = jsonElement6;
        }
        if ((i & 32) == 0) {
            this.metadata = null;
        } else {
            this.metadata = clientMetadata;
        }
    }

    public InitMessageHeaders(List<String> capabilities, String token, String str, List<InitRegistration> list, JsonElement6 jsonElement6, ClientMetadata clientMetadata) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(token, "token");
        this.capabilities = capabilities;
        this.token = token;
        this.continuationToken = str;
        this.registrations = list;
        this.tweaks = jsonElement6;
        this.metadata = clientMetadata;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(InitMessageHeaders self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.capabilities);
        output.encodeStringElement(serialDesc, 1, self.token);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.continuationToken != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.continuationToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.registrations != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.registrations);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.tweaks != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, JsonElementSerializers6.INSTANCE, self.tweaks);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, ClientMetadata$$serializer.INSTANCE, self.metadata);
    }

    public /* synthetic */ InitMessageHeaders(List list, String str, String str2, List list2, JsonElement6 jsonElement6, ClientMetadata clientMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : jsonElement6, (i & 32) != 0 ? null : clientMetadata);
    }

    public final List<String> getCapabilities() {
        return this.capabilities;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<InitRegistration> getRegistrations() {
        return this.registrations;
    }

    public final JsonElement6 getTweaks() {
        return this.tweaks;
    }

    public final ClientMetadata getMetadata() {
        return this.metadata;
    }
}
