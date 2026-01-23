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

/* compiled from: ContractElement.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractElement;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "contract_display_text", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "disable_contract_element", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;ZLokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getContract_display_text", "getYes_no", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "getDisable_contract_element", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ContractElement extends Message {

    @JvmField
    public static final ProtoAdapter<ContractElement> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractDisplayText", schemaIndex = 1, tag = 2)
    private final String contract_display_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableContractElement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean disable_contract_element;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.YesNo#ADAPTER", jsonName = "yesNo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final YesNo yes_no;

    public ContractElement() {
        this(null, null, null, false, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23774newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public /* synthetic */ ContractElement(String str, String str2, YesNo yesNo, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? YesNo.YESNO_UNSPECIFIED : yesNo, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getContract_display_text() {
        return this.contract_display_text;
    }

    public final YesNo getYes_no() {
        return this.yes_no;
    }

    public final boolean getDisable_contract_element() {
        return this.disable_contract_element;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractElement(String contract_id, String str, YesNo yes_no, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.contract_display_text = str;
        this.yes_no = yes_no;
        this.disable_contract_element = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23774newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractElement)) {
            return false;
        }
        ContractElement contractElement = (ContractElement) other;
        return Intrinsics.areEqual(unknownFields(), contractElement.unknownFields()) && Intrinsics.areEqual(this.contract_id, contractElement.contract_id) && Intrinsics.areEqual(this.contract_display_text, contractElement.contract_display_text) && this.yes_no == contractElement.yes_no && this.disable_contract_element == contractElement.disable_contract_element;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37;
        String str = this.contract_display_text;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.yes_no.hashCode()) * 37) + Boolean.hashCode(this.disable_contract_element);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        String str = this.contract_display_text;
        if (str != null) {
            arrayList.add("contract_display_text=" + Internal.sanitize(str));
        }
        arrayList.add("yes_no=" + this.yes_no);
        arrayList.add("disable_contract_element=" + this.disable_contract_element);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractElement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractElement copy$default(ContractElement contractElement, String str, String str2, YesNo yesNo, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractElement.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = contractElement.contract_display_text;
        }
        if ((i & 4) != 0) {
            yesNo = contractElement.yes_no;
        }
        if ((i & 8) != 0) {
            z = contractElement.disable_contract_element;
        }
        if ((i & 16) != 0) {
            byteString = contractElement.unknownFields();
        }
        ByteString byteString2 = byteString;
        YesNo yesNo2 = yesNo;
        return contractElement.copy(str, str2, yesNo2, z, byteString2);
    }

    public final ContractElement copy(String contract_id, String contract_display_text, YesNo yes_no, boolean disable_contract_element, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractElement(contract_id, contract_display_text, yes_no, disable_contract_element, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractElement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractElement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractElement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_display_text());
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    iEncodedSizeWithTag += YesNo.ADAPTER.encodedSizeWithTag(3, value.getYes_no());
                }
                return value.getDisable_contract_element() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getDisable_contract_element())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_display_text());
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 3, (int) value.getYes_no());
                }
                if (value.getDisable_contract_element()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getDisable_contract_element()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDisable_contract_element()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getDisable_contract_element()));
                }
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 3, (int) value.getYes_no());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getContract_display_text());
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractElement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                YesNo yesNoDecode = YesNo.YESNO_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = null;
                String strDecode2 = "";
                while (true) {
                    YesNo yesNo = yesNoDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ContractElement(strDecode2, strDecode, yesNo, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                yesNoDecode = YesNo.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractElement redact(ContractElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ContractElement.copy$default(value, null, null, null, false, ByteString.EMPTY, 15, null);
            }
        };
    }
}
