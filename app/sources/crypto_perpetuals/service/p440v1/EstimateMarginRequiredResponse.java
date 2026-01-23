package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.MarginRequired;
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

/* compiled from: EstimateMarginRequiredResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/EstimateMarginRequiredResponse;", "Lcom/squareup/wire/Message;", "", "margin_required", "Lcrypto_perpetuals/common/v1/MarginRequired;", "collar_rate", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/MarginRequired;Ljava/lang/String;Lokio/ByteString;)V", "getMargin_required", "()Lcrypto_perpetuals/common/v1/MarginRequired;", "getCollar_rate", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class EstimateMarginRequiredResponse extends Message {

    @JvmField
    public static final ProtoAdapter<EstimateMarginRequiredResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "collarRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String collar_rate;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginRequired#ADAPTER", jsonName = "marginRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MarginRequired margin_required;

    public EstimateMarginRequiredResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27861newBuilder();
    }

    public final MarginRequired getMargin_required() {
        return this.margin_required;
    }

    public final String getCollar_rate() {
        return this.collar_rate;
    }

    public /* synthetic */ EstimateMarginRequiredResponse(MarginRequired marginRequired, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marginRequired, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EstimateMarginRequiredResponse(MarginRequired marginRequired, String collar_rate, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(collar_rate, "collar_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.margin_required = marginRequired;
        this.collar_rate = collar_rate;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27861newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EstimateMarginRequiredResponse)) {
            return false;
        }
        EstimateMarginRequiredResponse estimateMarginRequiredResponse = (EstimateMarginRequiredResponse) other;
        return Intrinsics.areEqual(unknownFields(), estimateMarginRequiredResponse.unknownFields()) && Intrinsics.areEqual(this.margin_required, estimateMarginRequiredResponse.margin_required) && Intrinsics.areEqual(this.collar_rate, estimateMarginRequiredResponse.collar_rate);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MarginRequired marginRequired = this.margin_required;
        int iHashCode2 = ((iHashCode + (marginRequired != null ? marginRequired.hashCode() : 0)) * 37) + this.collar_rate.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MarginRequired marginRequired = this.margin_required;
        if (marginRequired != null) {
            arrayList.add("margin_required=" + marginRequired);
        }
        arrayList.add("collar_rate=" + Internal.sanitize(this.collar_rate));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EstimateMarginRequiredResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EstimateMarginRequiredResponse copy$default(EstimateMarginRequiredResponse estimateMarginRequiredResponse, MarginRequired marginRequired, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            marginRequired = estimateMarginRequiredResponse.margin_required;
        }
        if ((i & 2) != 0) {
            str = estimateMarginRequiredResponse.collar_rate;
        }
        if ((i & 4) != 0) {
            byteString = estimateMarginRequiredResponse.unknownFields();
        }
        return estimateMarginRequiredResponse.copy(marginRequired, str, byteString);
    }

    public final EstimateMarginRequiredResponse copy(MarginRequired margin_required, String collar_rate, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(collar_rate, "collar_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EstimateMarginRequiredResponse(margin_required, collar_rate, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimateMarginRequiredResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EstimateMarginRequiredResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.EstimateMarginRequiredResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EstimateMarginRequiredResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMargin_required() != null) {
                    size += MarginRequired.ADAPTER.encodedSizeWithTag(1, value.getMargin_required());
                }
                return !Intrinsics.areEqual(value.getCollar_rate(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCollar_rate()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EstimateMarginRequiredResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMargin_required() != null) {
                    MarginRequired.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_required());
                }
                if (!Intrinsics.areEqual(value.getCollar_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCollar_rate());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EstimateMarginRequiredResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCollar_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCollar_rate());
                }
                if (value.getMargin_required() != null) {
                    MarginRequired.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_required());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EstimateMarginRequiredResponse redact(EstimateMarginRequiredResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MarginRequired margin_required = value.getMargin_required();
                return EstimateMarginRequiredResponse.copy$default(value, margin_required != null ? MarginRequired.ADAPTER.redact(margin_required) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EstimateMarginRequiredResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                MarginRequired marginRequiredDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EstimateMarginRequiredResponse(marginRequiredDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        marginRequiredDecode = MarginRequired.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
