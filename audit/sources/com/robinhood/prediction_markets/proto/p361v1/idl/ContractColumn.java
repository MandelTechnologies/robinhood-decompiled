package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ContractColumn.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumn;", "Lcom/squareup/wire/Message;", "", "name", "", "contract_column_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnType;", "associated_contract_ids", "", "contract_elements", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractElement;", "event_long_description", "has_no_contracts", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnType;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getContract_column_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnType;", "getEvent_long_description", "getHas_no_contracts", "()Z", "getAssociated_contract_ids", "()Ljava/util/List;", "getContract_elements", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ContractColumn extends Message {

    @JvmField
    public static final ProtoAdapter<ContractColumn> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "associatedContractIds", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> associated_contract_ids;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractColumnType#ADAPTER", jsonName = "contractColumnType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ContractColumnType contract_column_type;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractElement#ADAPTER", jsonName = "contractElements", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<ContractElement> contract_elements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventLongDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String event_long_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasNoContracts", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean has_no_contracts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    public ContractColumn() {
        this(null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ContractColumn(String str, ContractColumnType contractColumnType, List list, List list2, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ContractColumnType.CONTRACT_COLUMN_TYPE_UNSPECIFIED : contractColumnType, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23772newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public final ContractColumnType getContract_column_type() {
        return this.contract_column_type;
    }

    public final String getEvent_long_description() {
        return this.event_long_description;
    }

    public final boolean getHas_no_contracts() {
        return this.has_no_contracts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractColumn(String name, ContractColumnType contract_column_type, List<String> associated_contract_ids, List<ContractElement> contract_elements, String event_long_description, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contract_column_type, "contract_column_type");
        Intrinsics.checkNotNullParameter(associated_contract_ids, "associated_contract_ids");
        Intrinsics.checkNotNullParameter(contract_elements, "contract_elements");
        Intrinsics.checkNotNullParameter(event_long_description, "event_long_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.contract_column_type = contract_column_type;
        this.event_long_description = event_long_description;
        this.has_no_contracts = z;
        this.associated_contract_ids = Internal.immutableCopyOf("associated_contract_ids", associated_contract_ids);
        this.contract_elements = Internal.immutableCopyOf("contract_elements", contract_elements);
    }

    public final List<String> getAssociated_contract_ids() {
        return this.associated_contract_ids;
    }

    public final List<ContractElement> getContract_elements() {
        return this.contract_elements;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23772newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractColumn)) {
            return false;
        }
        ContractColumn contractColumn = (ContractColumn) other;
        return Intrinsics.areEqual(unknownFields(), contractColumn.unknownFields()) && Intrinsics.areEqual(this.name, contractColumn.name) && this.contract_column_type == contractColumn.contract_column_type && Intrinsics.areEqual(this.associated_contract_ids, contractColumn.associated_contract_ids) && Intrinsics.areEqual(this.contract_elements, contractColumn.contract_elements) && Intrinsics.areEqual(this.event_long_description, contractColumn.event_long_description) && this.has_no_contracts == contractColumn.has_no_contracts;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.contract_column_type.hashCode()) * 37) + this.associated_contract_ids.hashCode()) * 37) + this.contract_elements.hashCode()) * 37) + this.event_long_description.hashCode()) * 37) + Boolean.hashCode(this.has_no_contracts);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("contract_column_type=" + this.contract_column_type);
        if (!this.associated_contract_ids.isEmpty()) {
            arrayList.add("associated_contract_ids=" + Internal.sanitize(this.associated_contract_ids));
        }
        if (!this.contract_elements.isEmpty()) {
            arrayList.add("contract_elements=" + this.contract_elements);
        }
        arrayList.add("event_long_description=" + Internal.sanitize(this.event_long_description));
        arrayList.add("has_no_contracts=" + this.has_no_contracts);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractColumn{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractColumn copy$default(ContractColumn contractColumn, String str, ContractColumnType contractColumnType, List list, List list2, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractColumn.name;
        }
        if ((i & 2) != 0) {
            contractColumnType = contractColumn.contract_column_type;
        }
        if ((i & 4) != 0) {
            list = contractColumn.associated_contract_ids;
        }
        if ((i & 8) != 0) {
            list2 = contractColumn.contract_elements;
        }
        if ((i & 16) != 0) {
            str2 = contractColumn.event_long_description;
        }
        if ((i & 32) != 0) {
            z = contractColumn.has_no_contracts;
        }
        if ((i & 64) != 0) {
            byteString = contractColumn.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        String str3 = str2;
        List list3 = list;
        return contractColumn.copy(str, contractColumnType, list3, list2, str3, z2, byteString2);
    }

    public final ContractColumn copy(String name, ContractColumnType contract_column_type, List<String> associated_contract_ids, List<ContractElement> contract_elements, String event_long_description, boolean has_no_contracts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contract_column_type, "contract_column_type");
        Intrinsics.checkNotNullParameter(associated_contract_ids, "associated_contract_ids");
        Intrinsics.checkNotNullParameter(contract_elements, "contract_elements");
        Intrinsics.checkNotNullParameter(event_long_description, "event_long_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractColumn(name, contract_column_type, associated_contract_ids, contract_elements, event_long_description, has_no_contracts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractColumn.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractColumn>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractColumn$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractColumn value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (value.getContract_column_type() != ContractColumnType.CONTRACT_COLUMN_TYPE_UNSPECIFIED) {
                    size += ContractColumnType.ADAPTER.encodedSizeWithTag(2, value.getContract_column_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getAssociated_contract_ids()) + ContractElement.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getContract_elements());
                if (!Intrinsics.areEqual(value.getEvent_long_description(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getEvent_long_description());
                }
                return value.getHas_no_contracts() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getHas_no_contracts())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractColumn value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (value.getContract_column_type() != ContractColumnType.CONTRACT_COLUMN_TYPE_UNSPECIFIED) {
                    ContractColumnType.ADAPTER.encodeWithTag(writer, 2, (int) value.getContract_column_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getAssociated_contract_ids());
                ContractElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getContract_elements());
                if (!Intrinsics.areEqual(value.getEvent_long_description(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getEvent_long_description());
                }
                if (value.getHas_no_contracts()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHas_no_contracts()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractColumn value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_no_contracts()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHas_no_contracts()));
                }
                if (!Intrinsics.areEqual(value.getEvent_long_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEvent_long_description());
                }
                ContractElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getContract_elements());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getAssociated_contract_ids());
                if (value.getContract_column_type() != ContractColumnType.CONTRACT_COLUMN_TYPE_UNSPECIFIED) {
                    ContractColumnType.ADAPTER.encodeWithTag(writer, 2, (int) value.getContract_column_type());
                }
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getName());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractColumn decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ContractColumnType contractColumnType = ContractColumnType.CONTRACT_COLUMN_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                ContractColumnType contractColumnTypeDecode = contractColumnType;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    contractColumnTypeDecode = ContractColumnType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 4:
                                arrayList2.add(ContractElement.ADAPTER.decode(reader));
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ContractColumn(strDecode2, contractColumnTypeDecode, arrayList, arrayList2, strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractColumn redact(ContractColumn value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ContractColumn.copy$default(value, null, null, null, Internal.m26823redactElements(value.getContract_elements(), ContractElement.ADAPTER), null, false, ByteString.EMPTY, 55, null);
            }
        };
    }
}
