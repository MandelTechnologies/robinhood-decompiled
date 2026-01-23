package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerGetAgreementResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "agreement_text", "primary_button_text", "agreement_type", "Lbff_money_movement/service/v1/InvestmentsTrackerAgreementType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerAgreementType;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getAgreement_text", "getPrimary_button_text", "getAgreement_type", "()Lbff_money_movement/service/v1/InvestmentsTrackerAgreementType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerGetAgreementResponse extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerGetAgreementResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String agreement_text;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAgreementType#ADAPTER", jsonName = "agreementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InvestmentsTrackerAgreementType agreement_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryButtonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public InvestmentsTrackerGetAgreementResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InvestmentsTrackerGetAgreementResponse(String str, String str2, String str3, InvestmentsTrackerAgreementType investmentsTrackerAgreementType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED : investmentsTrackerAgreementType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8473newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAgreement_text() {
        return this.agreement_text;
    }

    public final String getPrimary_button_text() {
        return this.primary_button_text;
    }

    public final InvestmentsTrackerAgreementType getAgreement_type() {
        return this.agreement_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerGetAgreementResponse(String title, String agreement_text, String primary_button_text, InvestmentsTrackerAgreementType agreement_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreement_text, "agreement_text");
        Intrinsics.checkNotNullParameter(primary_button_text, "primary_button_text");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.agreement_text = agreement_text;
        this.primary_button_text = primary_button_text;
        this.agreement_type = agreement_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8473newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerGetAgreementResponse)) {
            return false;
        }
        InvestmentsTrackerGetAgreementResponse investmentsTrackerGetAgreementResponse = (InvestmentsTrackerGetAgreementResponse) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerGetAgreementResponse.unknownFields()) && Intrinsics.areEqual(this.title, investmentsTrackerGetAgreementResponse.title) && Intrinsics.areEqual(this.agreement_text, investmentsTrackerGetAgreementResponse.agreement_text) && Intrinsics.areEqual(this.primary_button_text, investmentsTrackerGetAgreementResponse.primary_button_text) && this.agreement_type == investmentsTrackerGetAgreementResponse.agreement_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.agreement_text.hashCode()) * 37) + this.primary_button_text.hashCode()) * 37) + this.agreement_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("agreement_text=" + Internal.sanitize(this.agreement_text));
        arrayList.add("primary_button_text=" + Internal.sanitize(this.primary_button_text));
        arrayList.add("agreement_type=" + this.agreement_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerGetAgreementResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerGetAgreementResponse copy$default(InvestmentsTrackerGetAgreementResponse investmentsTrackerGetAgreementResponse, String str, String str2, String str3, InvestmentsTrackerAgreementType investmentsTrackerAgreementType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerGetAgreementResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerGetAgreementResponse.agreement_text;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerGetAgreementResponse.primary_button_text;
        }
        if ((i & 8) != 0) {
            investmentsTrackerAgreementType = investmentsTrackerGetAgreementResponse.agreement_type;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerGetAgreementResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return investmentsTrackerGetAgreementResponse.copy(str, str2, str4, investmentsTrackerAgreementType, byteString2);
    }

    public final InvestmentsTrackerGetAgreementResponse copy(String title, String agreement_text, String primary_button_text, InvestmentsTrackerAgreementType agreement_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreement_text, "agreement_text");
        Intrinsics.checkNotNullParameter(primary_button_text, "primary_button_text");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerGetAgreementResponse(title, agreement_text, primary_button_text, agreement_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerGetAgreementResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerGetAgreementResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerGetAgreementResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerGetAgreementResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getAgreement_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAgreement_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_button_text());
                }
                return value.getAgreement_type() != InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED ? size + InvestmentsTrackerAgreementType.ADAPTER.encodedSizeWithTag(4, value.getAgreement_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerGetAgreementResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getAgreement_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_button_text());
                }
                if (value.getAgreement_type() != InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED) {
                    InvestmentsTrackerAgreementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAgreement_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerGetAgreementResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAgreement_type() != InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED) {
                    InvestmentsTrackerAgreementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAgreement_type());
                }
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_button_text());
                }
                if (!Intrinsics.areEqual(value.getAgreement_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_text());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGetAgreementResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerAgreementType investmentsTrackerAgreementTypeDecode = InvestmentsTrackerAgreementType.AGREEMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    InvestmentsTrackerAgreementType investmentsTrackerAgreementType = investmentsTrackerAgreementTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InvestmentsTrackerGetAgreementResponse(strDecode, strDecode2, strDecode3, investmentsTrackerAgreementType, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                investmentsTrackerAgreementTypeDecode = InvestmentsTrackerAgreementType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGetAgreementResponse redact(InvestmentsTrackerGetAgreementResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerGetAgreementResponse.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
