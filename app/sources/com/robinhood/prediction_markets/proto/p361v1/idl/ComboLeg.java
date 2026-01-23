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

/* compiled from: ComboLeg.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComboLeg;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getYes_no", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ComboLeg extends Message {

    @JvmField
    public static final ProtoAdapter<ComboLeg> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.YesNo#ADAPTER", jsonName = "yesNo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final YesNo yes_no;

    public ComboLeg() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23766newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ ComboLeg(String str, YesNo yesNo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? YesNo.YESNO_UNSPECIFIED : yesNo, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final YesNo getYes_no() {
        return this.yes_no;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboLeg(String contract_id, YesNo yes_no, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.yes_no = yes_no;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23766newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ComboLeg)) {
            return false;
        }
        ComboLeg comboLeg = (ComboLeg) other;
        return Intrinsics.areEqual(unknownFields(), comboLeg.unknownFields()) && Intrinsics.areEqual(this.contract_id, comboLeg.contract_id) && this.yes_no == comboLeg.yes_no;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.yes_no.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("yes_no=" + this.yes_no);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComboLeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ComboLeg copy$default(ComboLeg comboLeg, String str, YesNo yesNo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comboLeg.contract_id;
        }
        if ((i & 2) != 0) {
            yesNo = comboLeg.yes_no;
        }
        if ((i & 4) != 0) {
            byteString = comboLeg.unknownFields();
        }
        return comboLeg.copy(str, yesNo, byteString);
    }

    public final ComboLeg copy(String contract_id, YesNo yes_no, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ComboLeg(contract_id, yes_no, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComboLeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ComboLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ComboLeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ComboLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                return value.getYes_no() != YesNo.YESNO_UNSPECIFIED ? size + YesNo.ADAPTER.encodedSizeWithTag(2, value.getYes_no()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ComboLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 2, (int) value.getYes_no());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ComboLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 2, (int) value.getYes_no());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ComboLeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                YesNo yesNoDecode = YesNo.YESNO_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ComboLeg(strDecode, yesNoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            yesNoDecode = YesNo.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ComboLeg redact(ComboLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ComboLeg.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
