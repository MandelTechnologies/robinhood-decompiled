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

/* compiled from: CashSettlement.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlement;", "Lcom/squareup/wire/Message;", "", "id", "", "contract_id", "ref_id", "settlement_price", "status", "Lcom/robinhood/ceres/v1/CashSettlementStatus;", "initiated_by_alias", "created_at", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/CashSettlementStatus;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getContract_id", "getRef_id", "getSettlement_price", "getStatus", "()Lcom/robinhood/ceres/v1/CashSettlementStatus;", "getInitiated_by_alias", "getCreated_at", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CashSettlement extends Message {

    @JvmField
    public static final ProtoAdapter<CashSettlement> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initiatedByAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String initiated_by_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "settlementPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String settlement_price;

    @WireField(adapter = "com.robinhood.ceres.v1.CashSettlementStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CashSettlementStatus status;

    public CashSettlement() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ CashSettlement(String str, String str2, String str3, String str4, CashSettlementStatus cashSettlementStatus, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CashSettlementStatus.CASH_SETTLEMENT_STATUS_UNSPECIFIED : cashSettlementStatus, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20274newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getSettlement_price() {
        return this.settlement_price;
    }

    public final CashSettlementStatus getStatus() {
        return this.status;
    }

    public final String getInitiated_by_alias() {
        return this.initiated_by_alias;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashSettlement(String id, String contract_id, String ref_id, String settlement_price, CashSettlementStatus status, String initiated_by_alias, String created_at, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(settlement_price, "settlement_price");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.contract_id = contract_id;
        this.ref_id = ref_id;
        this.settlement_price = settlement_price;
        this.status = status;
        this.initiated_by_alias = initiated_by_alias;
        this.created_at = created_at;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20274newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashSettlement)) {
            return false;
        }
        CashSettlement cashSettlement = (CashSettlement) other;
        return Intrinsics.areEqual(unknownFields(), cashSettlement.unknownFields()) && Intrinsics.areEqual(this.id, cashSettlement.id) && Intrinsics.areEqual(this.contract_id, cashSettlement.contract_id) && Intrinsics.areEqual(this.ref_id, cashSettlement.ref_id) && Intrinsics.areEqual(this.settlement_price, cashSettlement.settlement_price) && this.status == cashSettlement.status && Intrinsics.areEqual(this.initiated_by_alias, cashSettlement.initiated_by_alias) && Intrinsics.areEqual(this.created_at, cashSettlement.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + this.settlement_price.hashCode()) * 37) + this.status.hashCode()) * 37) + this.initiated_by_alias.hashCode()) * 37) + this.created_at.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("settlement_price=" + Internal.sanitize(this.settlement_price));
        arrayList.add("status=" + this.status);
        arrayList.add("initiated_by_alias=" + Internal.sanitize(this.initiated_by_alias));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashSettlement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashSettlement copy$default(CashSettlement cashSettlement, String str, String str2, String str3, String str4, CashSettlementStatus cashSettlementStatus, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashSettlement.id;
        }
        if ((i & 2) != 0) {
            str2 = cashSettlement.contract_id;
        }
        if ((i & 4) != 0) {
            str3 = cashSettlement.ref_id;
        }
        if ((i & 8) != 0) {
            str4 = cashSettlement.settlement_price;
        }
        if ((i & 16) != 0) {
            cashSettlementStatus = cashSettlement.status;
        }
        if ((i & 32) != 0) {
            str5 = cashSettlement.initiated_by_alias;
        }
        if ((i & 64) != 0) {
            str6 = cashSettlement.created_at;
        }
        if ((i & 128) != 0) {
            byteString = cashSettlement.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        CashSettlementStatus cashSettlementStatus2 = cashSettlementStatus;
        String str8 = str5;
        return cashSettlement.copy(str, str2, str3, str4, cashSettlementStatus2, str8, str7, byteString2);
    }

    public final CashSettlement copy(String id, String contract_id, String ref_id, String settlement_price, CashSettlementStatus status, String initiated_by_alias, String created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(settlement_price, "settlement_price");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashSettlement(id, contract_id, ref_id, settlement_price, status, initiated_by_alias, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashSettlement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashSettlement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CashSettlement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashSettlement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getSettlement_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSettlement_price());
                }
                if (value.getStatus() != CashSettlementStatus.CASH_SETTLEMENT_STATUS_UNSPECIFIED) {
                    size += CashSettlementStatus.ADAPTER.encodedSizeWithTag(5, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getInitiated_by_alias(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getInitiated_by_alias());
                }
                return !Intrinsics.areEqual(value.getCreated_at(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCreated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashSettlement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getSettlement_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSettlement_price());
                }
                if (value.getStatus() != CashSettlementStatus.CASH_SETTLEMENT_STATUS_UNSPECIFIED) {
                    CashSettlementStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getInitiated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInitiated_by_alias());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashSettlement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getInitiated_by_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInitiated_by_alias());
                }
                if (value.getStatus() != CashSettlementStatus.CASH_SETTLEMENT_STATUS_UNSPECIFIED) {
                    CashSettlementStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getSettlement_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSettlement_price());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CashSettlement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CashSettlementStatus cashSettlementStatusDecode = CashSettlementStatus.CASH_SETTLEMENT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    CashSettlementStatus cashSettlementStatus = cashSettlementStatusDecode;
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
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        cashSettlementStatusDecode = CashSettlementStatus.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new CashSettlement(strDecode, strDecode2, strDecode3, strDecode4, cashSettlementStatus, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashSettlement redact(CashSettlement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CashSettlement.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
