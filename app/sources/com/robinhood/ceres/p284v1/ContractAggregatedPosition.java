package com.robinhood.ceres.p284v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ContractAggregatedPosition.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPosition;", "Lcom/squareup/wire/Message;", "", "id", "", "symbol", "description", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "total_yes_quantity", "total_no_quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getDescription", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getTotal_yes_quantity", "getTotal_no_quantity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ContractAggregatedPosition extends Message {

    @JvmField
    public static final ProtoAdapter<ContractAggregatedPosition> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalNoQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String total_no_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalYesQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String total_yes_quantity;

    public ContractAggregatedPosition() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ContractAggregatedPosition(String str, String str2, String str3, FuturesContractType futuresContractType, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED : futuresContractType, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20282newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDescription() {
        return this.description;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final String getTotal_yes_quantity() {
        return this.total_yes_quantity;
    }

    public final String getTotal_no_quantity() {
        return this.total_no_quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractAggregatedPosition(String id, String symbol, String description, FuturesContractType contract_type, String total_yes_quantity, String total_no_quantity, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(total_yes_quantity, "total_yes_quantity");
        Intrinsics.checkNotNullParameter(total_no_quantity, "total_no_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.symbol = symbol;
        this.description = description;
        this.contract_type = contract_type;
        this.total_yes_quantity = total_yes_quantity;
        this.total_no_quantity = total_no_quantity;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20282newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractAggregatedPosition)) {
            return false;
        }
        ContractAggregatedPosition contractAggregatedPosition = (ContractAggregatedPosition) other;
        return Intrinsics.areEqual(unknownFields(), contractAggregatedPosition.unknownFields()) && Intrinsics.areEqual(this.id, contractAggregatedPosition.id) && Intrinsics.areEqual(this.symbol, contractAggregatedPosition.symbol) && Intrinsics.areEqual(this.description, contractAggregatedPosition.description) && this.contract_type == contractAggregatedPosition.contract_type && Intrinsics.areEqual(this.total_yes_quantity, contractAggregatedPosition.total_yes_quantity) && Intrinsics.areEqual(this.total_no_quantity, contractAggregatedPosition.total_no_quantity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.description.hashCode()) * 37) + this.contract_type.hashCode()) * 37) + this.total_yes_quantity.hashCode()) * 37) + this.total_no_quantity.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("contract_type=" + this.contract_type);
        arrayList.add("total_yes_quantity=" + Internal.sanitize(this.total_yes_quantity));
        arrayList.add("total_no_quantity=" + Internal.sanitize(this.total_no_quantity));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractAggregatedPosition{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractAggregatedPosition copy$default(ContractAggregatedPosition contractAggregatedPosition, String str, String str2, String str3, FuturesContractType futuresContractType, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractAggregatedPosition.id;
        }
        if ((i & 2) != 0) {
            str2 = contractAggregatedPosition.symbol;
        }
        if ((i & 4) != 0) {
            str3 = contractAggregatedPosition.description;
        }
        if ((i & 8) != 0) {
            futuresContractType = contractAggregatedPosition.contract_type;
        }
        if ((i & 16) != 0) {
            str4 = contractAggregatedPosition.total_yes_quantity;
        }
        if ((i & 32) != 0) {
            str5 = contractAggregatedPosition.total_no_quantity;
        }
        if ((i & 64) != 0) {
            byteString = contractAggregatedPosition.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str3;
        return contractAggregatedPosition.copy(str, str2, str8, futuresContractType, str7, str6, byteString2);
    }

    public final ContractAggregatedPosition copy(String id, String symbol, String description, FuturesContractType contract_type, String total_yes_quantity, String total_no_quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(total_yes_quantity, "total_yes_quantity");
        Intrinsics.checkNotNullParameter(total_no_quantity, "total_no_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractAggregatedPosition(id, symbol, description, contract_type, total_yes_quantity, total_no_quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractAggregatedPosition.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractAggregatedPosition>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ContractAggregatedPosition$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractAggregatedPosition value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    size += FuturesContractType.ADAPTER.encodedSizeWithTag(4, value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getTotal_yes_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTotal_yes_quantity());
                }
                return !Intrinsics.areEqual(value.getTotal_no_quantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTotal_no_quantity()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractAggregatedPosition value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getTotal_yes_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTotal_yes_quantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_no_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_no_quantity());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractAggregatedPosition value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTotal_no_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_no_quantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_yes_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTotal_yes_quantity());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractAggregatedPosition decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesContractType futuresContractTypeDecode = FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    FuturesContractType futuresContractType = futuresContractTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 5:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ContractAggregatedPosition(strDecode, strDecode2, strDecode3, futuresContractType, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractAggregatedPosition redact(ContractAggregatedPosition value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ContractAggregatedPosition.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
