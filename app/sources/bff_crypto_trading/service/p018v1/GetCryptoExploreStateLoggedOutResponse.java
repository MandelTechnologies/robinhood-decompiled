package bff_crypto_trading.service.p018v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetCryptoExploreStateLoggedOutResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutResponse;", "Lcom/squareup/wire/Message;", "", "ordering", "", "Lbff_crypto_trading/service/v1/CryptoExploreState;", "asset_type", "Lbff_crypto_trading/service/v1/CryptoAssetType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lbff_crypto_trading/service/v1/CryptoAssetType;Lokio/ByteString;)V", "getAsset_type", "()Lbff_crypto_trading/service/v1/CryptoAssetType;", "getOrdering", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetCryptoExploreStateLoggedOutResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoExploreStateLoggedOutResponse> ADAPTER;

    @WireField(adapter = "bff_crypto_trading.service.v1.CryptoAssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CryptoAssetType asset_type;

    @WireField(adapter = "bff_crypto_trading.service.v1.CryptoExploreState#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<CryptoExploreState> ordering;

    public GetCryptoExploreStateLoggedOutResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8374newBuilder();
    }

    public /* synthetic */ GetCryptoExploreStateLoggedOutResponse(List list, CryptoAssetType cryptoAssetType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CryptoAssetType.CRYPTO_ASSET_TYPE_UNSPECIFIED : cryptoAssetType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CryptoAssetType getAsset_type() {
        return this.asset_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoExploreStateLoggedOutResponse(List<? extends CryptoExploreState> ordering, CryptoAssetType asset_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ordering, "ordering");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_type = asset_type;
        this.ordering = Internal.immutableCopyOf("ordering", ordering);
    }

    public final List<CryptoExploreState> getOrdering() {
        return this.ordering;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8374newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoExploreStateLoggedOutResponse)) {
            return false;
        }
        GetCryptoExploreStateLoggedOutResponse getCryptoExploreStateLoggedOutResponse = (GetCryptoExploreStateLoggedOutResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoExploreStateLoggedOutResponse.unknownFields()) && Intrinsics.areEqual(this.ordering, getCryptoExploreStateLoggedOutResponse.ordering) && this.asset_type == getCryptoExploreStateLoggedOutResponse.asset_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.ordering.hashCode()) * 37) + this.asset_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.ordering.isEmpty()) {
            arrayList.add("ordering=" + this.ordering);
        }
        arrayList.add("asset_type=" + this.asset_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoExploreStateLoggedOutResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCryptoExploreStateLoggedOutResponse copy$default(GetCryptoExploreStateLoggedOutResponse getCryptoExploreStateLoggedOutResponse, List list, CryptoAssetType cryptoAssetType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getCryptoExploreStateLoggedOutResponse.ordering;
        }
        if ((i & 2) != 0) {
            cryptoAssetType = getCryptoExploreStateLoggedOutResponse.asset_type;
        }
        if ((i & 4) != 0) {
            byteString = getCryptoExploreStateLoggedOutResponse.unknownFields();
        }
        return getCryptoExploreStateLoggedOutResponse.copy(list, cryptoAssetType, byteString);
    }

    public final GetCryptoExploreStateLoggedOutResponse copy(List<? extends CryptoExploreState> ordering, CryptoAssetType asset_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ordering, "ordering");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoExploreStateLoggedOutResponse(ordering, asset_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoExploreStateLoggedOutResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoExploreStateLoggedOutResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_crypto_trading.service.v1.GetCryptoExploreStateLoggedOutResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoExploreStateLoggedOutResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + CryptoExploreState.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getOrdering());
                return value.getAsset_type() != CryptoAssetType.CRYPTO_ASSET_TYPE_UNSPECIFIED ? size + CryptoAssetType.ADAPTER.encodedSizeWithTag(2, value.getAsset_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoExploreStateLoggedOutResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoExploreState.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getOrdering());
                if (value.getAsset_type() != CryptoAssetType.CRYPTO_ASSET_TYPE_UNSPECIFIED) {
                    CryptoAssetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoExploreStateLoggedOutResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAsset_type() != CryptoAssetType.CRYPTO_ASSET_TYPE_UNSPECIFIED) {
                    CryptoAssetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_type());
                }
                CryptoExploreState.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getOrdering());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoExploreStateLoggedOutResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                CryptoAssetType cryptoAssetTypeDecode = CryptoAssetType.CRYPTO_ASSET_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoExploreStateLoggedOutResponse(arrayList, cryptoAssetTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            CryptoExploreState.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            cryptoAssetTypeDecode = CryptoAssetType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoExploreStateLoggedOutResponse redact(GetCryptoExploreStateLoggedOutResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCryptoExploreStateLoggedOutResponse.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
