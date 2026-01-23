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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetCryptoExploreStateLoggedOutRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequest;", "Lcom/squareup/wire/Message;", "", "region", "", "asset_type", "Lbff_crypto_trading/service/v1/CryptoAssetType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_crypto_trading/service/v1/CryptoAssetType;Lokio/ByteString;)V", "getRegion", "()Ljava/lang/String;", "getAsset_type", "()Lbff_crypto_trading/service/v1/CryptoAssetType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetCryptoExploreStateLoggedOutRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoExploreStateLoggedOutRequest> ADAPTER;

    @WireField(adapter = "bff_crypto_trading.service.v1.CryptoAssetType#ADAPTER", jsonName = "assetType", schemaIndex = 1, tag = 2)
    private final CryptoAssetType asset_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String region;

    public GetCryptoExploreStateLoggedOutRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8373newBuilder();
    }

    public final String getRegion() {
        return this.region;
    }

    public /* synthetic */ GetCryptoExploreStateLoggedOutRequest(String str, CryptoAssetType cryptoAssetType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cryptoAssetType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CryptoAssetType getAsset_type() {
        return this.asset_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoExploreStateLoggedOutRequest(String region, CryptoAssetType cryptoAssetType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.region = region;
        this.asset_type = cryptoAssetType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8373newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoExploreStateLoggedOutRequest)) {
            return false;
        }
        GetCryptoExploreStateLoggedOutRequest getCryptoExploreStateLoggedOutRequest = (GetCryptoExploreStateLoggedOutRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoExploreStateLoggedOutRequest.unknownFields()) && Intrinsics.areEqual(this.region, getCryptoExploreStateLoggedOutRequest.region) && this.asset_type == getCryptoExploreStateLoggedOutRequest.asset_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.region.hashCode()) * 37;
        CryptoAssetType cryptoAssetType = this.asset_type;
        int iHashCode2 = iHashCode + (cryptoAssetType != null ? cryptoAssetType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("region=" + Internal.sanitize(this.region));
        CryptoAssetType cryptoAssetType = this.asset_type;
        if (cryptoAssetType != null) {
            arrayList.add("asset_type=" + cryptoAssetType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoExploreStateLoggedOutRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCryptoExploreStateLoggedOutRequest copy$default(GetCryptoExploreStateLoggedOutRequest getCryptoExploreStateLoggedOutRequest, String str, CryptoAssetType cryptoAssetType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCryptoExploreStateLoggedOutRequest.region;
        }
        if ((i & 2) != 0) {
            cryptoAssetType = getCryptoExploreStateLoggedOutRequest.asset_type;
        }
        if ((i & 4) != 0) {
            byteString = getCryptoExploreStateLoggedOutRequest.unknownFields();
        }
        return getCryptoExploreStateLoggedOutRequest.copy(str, cryptoAssetType, byteString);
    }

    public final GetCryptoExploreStateLoggedOutRequest copy(String region, CryptoAssetType asset_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoExploreStateLoggedOutRequest(region, asset_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoExploreStateLoggedOutRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoExploreStateLoggedOutRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_crypto_trading.service.v1.GetCryptoExploreStateLoggedOutRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoExploreStateLoggedOutRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRegion(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRegion());
                }
                return size + CryptoAssetType.ADAPTER.encodedSizeWithTag(2, value.getAsset_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoExploreStateLoggedOutRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRegion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRegion());
                }
                CryptoAssetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoExploreStateLoggedOutRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CryptoAssetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_type());
                if (Intrinsics.areEqual(value.getRegion(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRegion());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoExploreStateLoggedOutRequest redact(GetCryptoExploreStateLoggedOutRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCryptoExploreStateLoggedOutRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoExploreStateLoggedOutRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                CryptoAssetType cryptoAssetTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoExploreStateLoggedOutRequest(strDecode, cryptoAssetTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            cryptoAssetTypeDecode = CryptoAssetType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
