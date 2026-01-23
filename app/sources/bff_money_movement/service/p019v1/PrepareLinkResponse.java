package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: PrepareLinkResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b'\u0010\u001cR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkResponse;", "Lcom/squareup/wire/Message;", "", "", "link_token", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "expires_at", "Laccio/service/v1/Provider;", "provider", "", "metadata", "updated_account_link_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Laccio/service/v1/Provider;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Laccio/service/v1/Provider;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)Lbff_money_movement/service/v1/PrepareLinkResponse;", "Ljava/lang/String;", "getLink_token", "Lj$/time/Instant;", "getExpires_at", "()Lj$/time/Instant;", "Laccio/service/v1/Provider;", "getProvider", "()Laccio/service/v1/Provider;", "getUpdated_account_link_id", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PrepareLinkResponse extends Message {

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expiresAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant expires_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "linkToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String link_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final Map<String, String> metadata;

    @WireField(adapter = "accio.service.v1.Provider#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Provider provider;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAccountLinkId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String updated_account_link_id;

    @JvmField
    public static final ProtoAdapter<PrepareLinkResponse> ADAPTER = new PrepareLinkResponse2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(PrepareLinkResponse.class), Syntax.PROTO_3);

    public PrepareLinkResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ PrepareLinkResponse(String str, Instant instant, Provider provider, Map map, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? Provider.PROVIDER_UNSPECIFIED : provider, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8508newBuilder();
    }

    public final String getLink_token() {
        return this.link_token;
    }

    public final Instant getExpires_at() {
        return this.expires_at;
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final String getUpdated_account_link_id() {
        return this.updated_account_link_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareLinkResponse(String link_token, Instant instant, Provider provider, Map<String, String> metadata, String updated_account_link_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(link_token, "link_token");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(updated_account_link_id, "updated_account_link_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.link_token = link_token;
        this.expires_at = instant;
        this.provider = provider;
        this.updated_account_link_id = updated_account_link_id;
        this.metadata = Internal.immutableCopyOf("metadata", metadata);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8508newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrepareLinkResponse)) {
            return false;
        }
        PrepareLinkResponse prepareLinkResponse = (PrepareLinkResponse) other;
        return Intrinsics.areEqual(unknownFields(), prepareLinkResponse.unknownFields()) && Intrinsics.areEqual(this.link_token, prepareLinkResponse.link_token) && Intrinsics.areEqual(this.expires_at, prepareLinkResponse.expires_at) && this.provider == prepareLinkResponse.provider && Intrinsics.areEqual(this.metadata, prepareLinkResponse.metadata) && Intrinsics.areEqual(this.updated_account_link_id, prepareLinkResponse.updated_account_link_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.link_token.hashCode()) * 37;
        Instant instant = this.expires_at;
        int iHashCode2 = ((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.provider.hashCode()) * 37) + this.metadata.hashCode()) * 37) + this.updated_account_link_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("link_token=" + Internal.sanitize(this.link_token));
        Instant instant = this.expires_at;
        if (instant != null) {
            arrayList.add("expires_at=" + instant);
        }
        arrayList.add("provider=" + this.provider);
        if (!this.metadata.isEmpty()) {
            arrayList.add("metadata=" + this.metadata);
        }
        arrayList.add("updated_account_link_id=" + Internal.sanitize(this.updated_account_link_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepareLinkResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PrepareLinkResponse copy$default(PrepareLinkResponse prepareLinkResponse, String str, Instant instant, Provider provider, Map map, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepareLinkResponse.link_token;
        }
        if ((i & 2) != 0) {
            instant = prepareLinkResponse.expires_at;
        }
        if ((i & 4) != 0) {
            provider = prepareLinkResponse.provider;
        }
        if ((i & 8) != 0) {
            map = prepareLinkResponse.metadata;
        }
        if ((i & 16) != 0) {
            str2 = prepareLinkResponse.updated_account_link_id;
        }
        if ((i & 32) != 0) {
            byteString = prepareLinkResponse.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return prepareLinkResponse.copy(str, instant, provider, map, str3, byteString2);
    }

    public final PrepareLinkResponse copy(String link_token, Instant expires_at, Provider provider, Map<String, String> metadata, String updated_account_link_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(link_token, "link_token");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(updated_account_link_id, "updated_account_link_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PrepareLinkResponse(link_token, expires_at, provider, metadata, updated_account_link_id, unknownFields);
    }
}
