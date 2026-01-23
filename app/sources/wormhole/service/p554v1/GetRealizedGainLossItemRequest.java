package wormhole.service.p554v1;

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

/* compiled from: GetRealizedGainLossItemRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemRequest;", "Lcom/squareup/wire/Message;", "", "id", "", "asset_class", "Lwormhole/service/v1/AssetClass;", "account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/AssetClass;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAsset_class", "()Lwormhole/service/v1/AssetClass;", "getAccount_number", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedGainLossItemRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedGainLossItemRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "wormhole.service.v1.AssetClass#ADAPTER", jsonName = "assetClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AssetClass asset_class;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    public GetRealizedGainLossItemRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetRealizedGainLossItemRequest(String str, AssetClass assetClass, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetClass.ASSET_CLASS_UNSPECIFIED : assetClass, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30057newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final AssetClass getAsset_class() {
        return this.asset_class;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossItemRequest(String id, AssetClass asset_class, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.asset_class = asset_class;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30057newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedGainLossItemRequest)) {
            return false;
        }
        GetRealizedGainLossItemRequest getRealizedGainLossItemRequest = (GetRealizedGainLossItemRequest) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedGainLossItemRequest.unknownFields()) && Intrinsics.areEqual(this.id, getRealizedGainLossItemRequest.id) && this.asset_class == getRealizedGainLossItemRequest.asset_class && Intrinsics.areEqual(this.account_number, getRealizedGainLossItemRequest.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.asset_class.hashCode()) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("asset_class=" + this.asset_class);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedGainLossItemRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRealizedGainLossItemRequest copy$default(GetRealizedGainLossItemRequest getRealizedGainLossItemRequest, String str, AssetClass assetClass, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRealizedGainLossItemRequest.id;
        }
        if ((i & 2) != 0) {
            assetClass = getRealizedGainLossItemRequest.asset_class;
        }
        if ((i & 4) != 0) {
            str2 = getRealizedGainLossItemRequest.account_number;
        }
        if ((i & 8) != 0) {
            byteString = getRealizedGainLossItemRequest.unknownFields();
        }
        return getRealizedGainLossItemRequest.copy(str, assetClass, str2, byteString);
    }

    public final GetRealizedGainLossItemRequest copy(String id, AssetClass asset_class, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedGainLossItemRequest(id, asset_class, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedGainLossItemRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedGainLossItemRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.GetRealizedGainLossItemRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedGainLossItemRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    size += AssetClass.ADAPTER.encodedSizeWithTag(2, value.getAsset_class());
                }
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedGainLossItemRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedGainLossItemRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_class());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AssetClass assetClassDecode = AssetClass.ASSET_CLASS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedGainLossItemRequest(strDecode, assetClassDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            assetClassDecode = AssetClass.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemRequest redact(GetRealizedGainLossItemRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedGainLossItemRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
