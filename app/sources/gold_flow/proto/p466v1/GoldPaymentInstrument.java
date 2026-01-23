package gold_flow.proto.p466v1;

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
import rosetta.identi.agreements.AgreementType;

/* compiled from: GoldPaymentInstrument.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JL\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPaymentInstrument;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "instrument_type", "agreement_type", "Lrosetta/identi/agreements/AgreementType;", "bank_account_nickname", "last_four_digits", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getInstrument_type", "getAgreement_type", "()Lrosetta/identi/agreements/AgreementType;", "getBank_account_nickname", "getLast_four_digits", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GoldPaymentInstrument extends Message {

    @JvmField
    public static final ProtoAdapter<GoldPaymentInstrument> ADAPTER;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", jsonName = "agreementType", schemaIndex = 2, tag = 3)
    private final AgreementType agreement_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountNickname", schemaIndex = 3, tag = 4)
    private final String bank_account_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentType", schemaIndex = 1, tag = 2)
    private final String instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastFourDigits", schemaIndex = 4, tag = 5)
    private final String last_four_digits;

    public GoldPaymentInstrument() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28159newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final AgreementType getAgreement_type() {
        return this.agreement_type;
    }

    public final String getBank_account_nickname() {
        return this.bank_account_nickname;
    }

    public final String getLast_four_digits() {
        return this.last_four_digits;
    }

    public /* synthetic */ GoldPaymentInstrument(String str, String str2, AgreementType agreementType, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : agreementType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPaymentInstrument(String str, String str2, AgreementType agreementType, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = str;
        this.instrument_type = str2;
        this.agreement_type = agreementType;
        this.bank_account_nickname = str3;
        this.last_four_digits = str4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28159newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldPaymentInstrument)) {
            return false;
        }
        GoldPaymentInstrument goldPaymentInstrument = (GoldPaymentInstrument) other;
        return Intrinsics.areEqual(unknownFields(), goldPaymentInstrument.unknownFields()) && Intrinsics.areEqual(this.instrument_id, goldPaymentInstrument.instrument_id) && Intrinsics.areEqual(this.instrument_type, goldPaymentInstrument.instrument_type) && this.agreement_type == goldPaymentInstrument.agreement_type && Intrinsics.areEqual(this.bank_account_nickname, goldPaymentInstrument.bank_account_nickname) && Intrinsics.areEqual(this.last_four_digits, goldPaymentInstrument.last_four_digits);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.instrument_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AgreementType agreementType = this.agreement_type;
        int iHashCode4 = (iHashCode3 + (agreementType != null ? agreementType.hashCode() : 0)) * 37;
        String str3 = this.bank_account_nickname;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.last_four_digits;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.instrument_id;
        if (str != null) {
            arrayList.add("instrument_id=" + Internal.sanitize(str));
        }
        String str2 = this.instrument_type;
        if (str2 != null) {
            arrayList.add("instrument_type=" + Internal.sanitize(str2));
        }
        AgreementType agreementType = this.agreement_type;
        if (agreementType != null) {
            arrayList.add("agreement_type=" + agreementType);
        }
        String str3 = this.bank_account_nickname;
        if (str3 != null) {
            arrayList.add("bank_account_nickname=" + Internal.sanitize(str3));
        }
        String str4 = this.last_four_digits;
        if (str4 != null) {
            arrayList.add("last_four_digits=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldPaymentInstrument{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldPaymentInstrument copy$default(GoldPaymentInstrument goldPaymentInstrument, String str, String str2, AgreementType agreementType, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldPaymentInstrument.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = goldPaymentInstrument.instrument_type;
        }
        if ((i & 4) != 0) {
            agreementType = goldPaymentInstrument.agreement_type;
        }
        if ((i & 8) != 0) {
            str3 = goldPaymentInstrument.bank_account_nickname;
        }
        if ((i & 16) != 0) {
            str4 = goldPaymentInstrument.last_four_digits;
        }
        if ((i & 32) != 0) {
            byteString = goldPaymentInstrument.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return goldPaymentInstrument.copy(str, str2, agreementType, str3, str5, byteString2);
    }

    public final GoldPaymentInstrument copy(String instrument_id, String instrument_type, AgreementType agreement_type, String bank_account_nickname, String last_four_digits, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldPaymentInstrument(instrument_id, instrument_type, agreement_type, bank_account_nickname, last_four_digits, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldPaymentInstrument.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldPaymentInstrument>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.GoldPaymentInstrument$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldPaymentInstrument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getInstrument_id()) + protoAdapter.encodedSizeWithTag(2, value.getInstrument_type()) + AgreementType.ADAPTER.encodedSizeWithTag(3, value.getAgreement_type()) + protoAdapter.encodedSizeWithTag(4, value.getBank_account_nickname()) + protoAdapter.encodedSizeWithTag(5, value.getLast_four_digits());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldPaymentInstrument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                AgreementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAgreement_type());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBank_account_nickname());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getLast_four_digits());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldPaymentInstrument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getLast_four_digits());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBank_account_nickname());
                AgreementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAgreement_type());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldPaymentInstrument redact(GoldPaymentInstrument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldPaymentInstrument.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldPaymentInstrument decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                AgreementType agreementTypeDecode = null;
                String strDecode3 = null;
                String strDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldPaymentInstrument(strDecode, strDecode2, agreementTypeDecode, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            agreementTypeDecode = AgreementType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
