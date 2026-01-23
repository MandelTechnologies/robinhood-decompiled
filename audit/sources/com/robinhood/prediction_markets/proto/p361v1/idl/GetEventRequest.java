package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetEventRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequest;", "Lcom/squareup/wire/Message;", "", "id", "", "include_nondiscoverable_contracts", "", "hydrate_contract_groups", "url_slug", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getInclude_nondiscoverable_contracts", "()Z", "getHydrate_contract_groups", "getUrl_slug", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetEventRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetEventRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hydrateContractGroups", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean hydrate_contract_groups;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "includeNondiscoverableContracts", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean include_nondiscoverable_contracts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "urlSlug", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String url_slug;

    public GetEventRequest() {
        this(null, false, false, null, null, 31, null);
    }

    public /* synthetic */ GetEventRequest(String str, boolean z, boolean z2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23802newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInclude_nondiscoverable_contracts() {
        return this.include_nondiscoverable_contracts;
    }

    public final boolean getHydrate_contract_groups() {
        return this.hydrate_contract_groups;
    }

    public final String getUrl_slug() {
        return this.url_slug;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEventRequest(String id, boolean z, boolean z2, String url_slug, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url_slug, "url_slug");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.include_nondiscoverable_contracts = z;
        this.hydrate_contract_groups = z2;
        this.url_slug = url_slug;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23802newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetEventRequest)) {
            return false;
        }
        GetEventRequest getEventRequest = (GetEventRequest) other;
        return Intrinsics.areEqual(unknownFields(), getEventRequest.unknownFields()) && Intrinsics.areEqual(this.id, getEventRequest.id) && this.include_nondiscoverable_contracts == getEventRequest.include_nondiscoverable_contracts && this.hydrate_contract_groups == getEventRequest.hydrate_contract_groups && Intrinsics.areEqual(this.url_slug, getEventRequest.url_slug);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + Boolean.hashCode(this.include_nondiscoverable_contracts)) * 37) + Boolean.hashCode(this.hydrate_contract_groups)) * 37) + this.url_slug.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("include_nondiscoverable_contracts=" + this.include_nondiscoverable_contracts);
        arrayList.add("hydrate_contract_groups=" + this.hydrate_contract_groups);
        arrayList.add("url_slug=" + Internal.sanitize(this.url_slug));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEventRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetEventRequest copy$default(GetEventRequest getEventRequest, String str, boolean z, boolean z2, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getEventRequest.id;
        }
        if ((i & 2) != 0) {
            z = getEventRequest.include_nondiscoverable_contracts;
        }
        if ((i & 4) != 0) {
            z2 = getEventRequest.hydrate_contract_groups;
        }
        if ((i & 8) != 0) {
            str2 = getEventRequest.url_slug;
        }
        if ((i & 16) != 0) {
            byteString = getEventRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z3 = z2;
        return getEventRequest.copy(str, z, z3, str2, byteString2);
    }

    public final GetEventRequest copy(String id, boolean include_nondiscoverable_contracts, boolean hydrate_contract_groups, String url_slug, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url_slug, "url_slug");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetEventRequest(id, include_nondiscoverable_contracts, hydrate_contract_groups, url_slug, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetEventRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetEventRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetEventRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getInclude_nondiscoverable_contracts()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getInclude_nondiscoverable_contracts()));
                }
                if (value.getHydrate_contract_groups()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getHydrate_contract_groups()));
                }
                return !Intrinsics.areEqual(value.getUrl_slug(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUrl_slug()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetEventRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getInclude_nondiscoverable_contracts()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getInclude_nondiscoverable_contracts()));
                }
                if (value.getHydrate_contract_groups()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHydrate_contract_groups()));
                }
                if (!Intrinsics.areEqual(value.getUrl_slug(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl_slug());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetEventRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUrl_slug(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl_slug());
                }
                if (value.getHydrate_contract_groups()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHydrate_contract_groups()));
                }
                if (value.getInclude_nondiscoverable_contracts()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getInclude_nondiscoverable_contracts()));
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetEventRequest redact(GetEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetEventRequest.copy$default(value, null, false, false, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetEventRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetEventRequest(strDecode, zBooleanValue, zBooleanValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
