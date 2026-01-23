package advisory.proto.p008v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetDepositPromoDetailsResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Ladvisory/proto/v1/GetDepositPromoDetailsResponse;", "Lcom/squareup/wire/Message;", "", "details_screen", "Ladvisory/proto/v1/PromoDetailsScreen;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/PromoDetailsScreen;Lokio/ByteString;)V", "getDetails_screen", "()Ladvisory/proto/v1/PromoDetailsScreen;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetDepositPromoDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetDepositPromoDetailsResponse> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.PromoDetailsScreen#ADAPTER", jsonName = "detailsScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PromoDetailsScreen details_screen;

    /* JADX WARN: Multi-variable type inference failed */
    public GetDepositPromoDetailsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4444newBuilder();
    }

    public final PromoDetailsScreen getDetails_screen() {
        return this.details_screen;
    }

    public /* synthetic */ GetDepositPromoDetailsResponse(PromoDetailsScreen promoDetailsScreen, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : promoDetailsScreen, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDepositPromoDetailsResponse(PromoDetailsScreen promoDetailsScreen, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.details_screen = promoDetailsScreen;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4444newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetDepositPromoDetailsResponse)) {
            return false;
        }
        GetDepositPromoDetailsResponse getDepositPromoDetailsResponse = (GetDepositPromoDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getDepositPromoDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.details_screen, getDepositPromoDetailsResponse.details_screen);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PromoDetailsScreen promoDetailsScreen = this.details_screen;
        int iHashCode2 = iHashCode + (promoDetailsScreen != null ? promoDetailsScreen.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PromoDetailsScreen promoDetailsScreen = this.details_screen;
        if (promoDetailsScreen != null) {
            arrayList.add("details_screen=" + promoDetailsScreen);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDepositPromoDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetDepositPromoDetailsResponse copy(PromoDetailsScreen details_screen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetDepositPromoDetailsResponse(details_screen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetDepositPromoDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetDepositPromoDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetDepositPromoDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetDepositPromoDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getDetails_screen() != null ? size + PromoDetailsScreen.ADAPTER.encodedSizeWithTag(1, value.getDetails_screen()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetDepositPromoDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDetails_screen() != null) {
                    PromoDetailsScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getDetails_screen());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetDepositPromoDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDetails_screen() != null) {
                    PromoDetailsScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getDetails_screen());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetDepositPromoDetailsResponse redact(GetDepositPromoDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PromoDetailsScreen details_screen = value.getDetails_screen();
                return value.copy(details_screen != null ? PromoDetailsScreen.ADAPTER.redact(details_screen) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetDepositPromoDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PromoDetailsScreen promoDetailsScreenDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetDepositPromoDetailsResponse(promoDetailsScreenDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        promoDetailsScreenDecode = PromoDetailsScreen.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
