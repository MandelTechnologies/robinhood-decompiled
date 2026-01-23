package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: StreamAgreementDisplayContentResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lgold_flow/proto/v1/StreamAgreementDisplayContentResponse;", "Lcom/squareup/wire/Message;", "", "agreement", "Lgold_flow/proto/v1/FullAgreement;", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", "disable_sparkle_button_styling", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold_flow/proto/v1/FullAgreement;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lokio/ByteString;)V", "getAgreement", "()Lgold_flow/proto/v1/FullAgreement;", "getCta", "()Lgold_flow/proto/v1/Cta;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lgold_flow/proto/v1/FullAgreement;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/StreamAgreementDisplayContentResponse;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamAgreementDisplayContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamAgreementDisplayContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.FullAgreement#ADAPTER", schemaIndex = 0, tag = 1)
    private final FullAgreement agreement;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 1, tag = 2)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableSparkleButtonStyling", schemaIndex = 2, tag = 3)
    private final Boolean disable_sparkle_button_styling;

    public StreamAgreementDisplayContentResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28187newBuilder();
    }

    public final FullAgreement getAgreement() {
        return this.agreement;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Boolean getDisable_sparkle_button_styling() {
        return this.disable_sparkle_button_styling;
    }

    public /* synthetic */ StreamAgreementDisplayContentResponse(FullAgreement fullAgreement, Cta cta, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fullAgreement, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAgreementDisplayContentResponse(FullAgreement fullAgreement, Cta cta, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.agreement = fullAgreement;
        this.cta = cta;
        this.disable_sparkle_button_styling = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28187newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamAgreementDisplayContentResponse)) {
            return false;
        }
        StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse = (StreamAgreementDisplayContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamAgreementDisplayContentResponse.unknownFields()) && Intrinsics.areEqual(this.agreement, streamAgreementDisplayContentResponse.agreement) && Intrinsics.areEqual(this.cta, streamAgreementDisplayContentResponse.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, streamAgreementDisplayContentResponse.disable_sparkle_button_styling);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FullAgreement fullAgreement = this.agreement;
        int iHashCode2 = (iHashCode + (fullAgreement != null ? fullAgreement.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode3 = (iHashCode2 + (cta != null ? cta.hashCode() : 0)) * 37;
        Boolean bool = this.disable_sparkle_button_styling;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FullAgreement fullAgreement = this.agreement;
        if (fullAgreement != null) {
            arrayList.add("agreement=" + fullAgreement);
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Boolean bool = this.disable_sparkle_button_styling;
        if (bool != null) {
            arrayList.add("disable_sparkle_button_styling=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamAgreementDisplayContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamAgreementDisplayContentResponse copy$default(StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse, FullAgreement fullAgreement, Cta cta, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            fullAgreement = streamAgreementDisplayContentResponse.agreement;
        }
        if ((i & 2) != 0) {
            cta = streamAgreementDisplayContentResponse.cta;
        }
        if ((i & 4) != 0) {
            bool = streamAgreementDisplayContentResponse.disable_sparkle_button_styling;
        }
        if ((i & 8) != 0) {
            byteString = streamAgreementDisplayContentResponse.unknownFields();
        }
        return streamAgreementDisplayContentResponse.copy(fullAgreement, cta, bool, byteString);
    }

    public final StreamAgreementDisplayContentResponse copy(FullAgreement agreement, Cta cta, Boolean disable_sparkle_button_styling, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamAgreementDisplayContentResponse(agreement, cta, disable_sparkle_button_styling, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamAgreementDisplayContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamAgreementDisplayContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamAgreementDisplayContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamAgreementDisplayContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + FullAgreement.ADAPTER.encodedSizeWithTag(1, value.getAgreement()) + Cta.ADAPTER.encodedSizeWithTag(2, value.getCta()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getDisable_sparkle_button_styling());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamAgreementDisplayContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FullAgreement.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement());
                Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getCta());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getDisable_sparkle_button_styling());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamAgreementDisplayContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getDisable_sparkle_button_styling());
                Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getCta());
                FullAgreement.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamAgreementDisplayContentResponse redact(StreamAgreementDisplayContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FullAgreement agreement = value.getAgreement();
                FullAgreement fullAgreementRedact = agreement != null ? FullAgreement.ADAPTER.redact(agreement) : null;
                Cta cta = value.getCta();
                return StreamAgreementDisplayContentResponse.copy$default(value, fullAgreementRedact, cta != null ? Cta.ADAPTER.redact(cta) : null, null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamAgreementDisplayContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FullAgreement fullAgreementDecode = null;
                Cta ctaDecode = null;
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamAgreementDisplayContentResponse(fullAgreementDecode, ctaDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fullAgreementDecode = FullAgreement.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        ctaDecode = Cta.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
