package com.robinhood.ceres.p284v1;

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

/* compiled from: CashSettlementEvent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementEvent;", "Lcom/squareup/wire/Message;", "", "id", "", "contract_id", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegion;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumber;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getContract_id", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegion;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumber;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CashSettlementEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CashSettlementEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardNumber#ADAPTER", jsonName = "shardNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ShardNumber shard_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardRegion#ADAPTER", jsonName = "shardRegion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ShardRegion shard_region;

    public CashSettlementEvent() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ CashSettlementEvent(String str, String str2, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ShardRegion.SHARD_REGION_UNSPECIFIED : shardRegion, (i & 8) != 0 ? ShardNumber.SHARD_NUMBER_UNSPECIFIED : shardNumber, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20276newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final ShardRegion getShard_region() {
        return this.shard_region;
    }

    public final ShardNumber getShard_number() {
        return this.shard_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashSettlementEvent(String id, String contract_id, ShardRegion shard_region, ShardNumber shard_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(shard_region, "shard_region");
        Intrinsics.checkNotNullParameter(shard_number, "shard_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.contract_id = contract_id;
        this.shard_region = shard_region;
        this.shard_number = shard_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20276newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashSettlementEvent)) {
            return false;
        }
        CashSettlementEvent cashSettlementEvent = (CashSettlementEvent) other;
        return Intrinsics.areEqual(unknownFields(), cashSettlementEvent.unknownFields()) && Intrinsics.areEqual(this.id, cashSettlementEvent.id) && Intrinsics.areEqual(this.contract_id, cashSettlementEvent.contract_id) && this.shard_region == cashSettlementEvent.shard_region && this.shard_number == cashSettlementEvent.shard_number;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.shard_region.hashCode()) * 37) + this.shard_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("shard_region=" + this.shard_region);
        arrayList.add("shard_number=" + this.shard_number);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashSettlementEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashSettlementEvent copy$default(CashSettlementEvent cashSettlementEvent, String str, String str2, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashSettlementEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = cashSettlementEvent.contract_id;
        }
        if ((i & 4) != 0) {
            shardRegion = cashSettlementEvent.shard_region;
        }
        if ((i & 8) != 0) {
            shardNumber = cashSettlementEvent.shard_number;
        }
        if ((i & 16) != 0) {
            byteString = cashSettlementEvent.unknownFields();
        }
        ByteString byteString2 = byteString;
        ShardRegion shardRegion2 = shardRegion;
        return cashSettlementEvent.copy(str, str2, shardRegion2, shardNumber, byteString2);
    }

    public final CashSettlementEvent copy(String id, String contract_id, ShardRegion shard_region, ShardNumber shard_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(shard_region, "shard_region");
        Intrinsics.checkNotNullParameter(shard_number, "shard_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashSettlementEvent(id, contract_id, shard_region, shard_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashSettlementEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashSettlementEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CashSettlementEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashSettlementEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                }
                if (value.getShard_region() != ShardRegion.SHARD_REGION_UNSPECIFIED) {
                    size += ShardRegion.ADAPTER.encodedSizeWithTag(3, value.getShard_region());
                }
                return value.getShard_number() != ShardNumber.SHARD_NUMBER_UNSPECIFIED ? size + ShardNumber.ADAPTER.encodedSizeWithTag(4, value.getShard_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashSettlementEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (value.getShard_region() != ShardRegion.SHARD_REGION_UNSPECIFIED) {
                    ShardRegion.ADAPTER.encodeWithTag(writer, 3, (int) value.getShard_region());
                }
                if (value.getShard_number() != ShardNumber.SHARD_NUMBER_UNSPECIFIED) {
                    ShardNumber.ADAPTER.encodeWithTag(writer, 4, (int) value.getShard_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashSettlementEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShard_number() != ShardNumber.SHARD_NUMBER_UNSPECIFIED) {
                    ShardNumber.ADAPTER.encodeWithTag(writer, 4, (int) value.getShard_number());
                }
                if (value.getShard_region() != ShardRegion.SHARD_REGION_UNSPECIFIED) {
                    ShardRegion.ADAPTER.encodeWithTag(writer, 3, (int) value.getShard_region());
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
            public CashSettlementEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ShardRegion shardRegionDecode = ShardRegion.SHARD_REGION_UNSPECIFIED;
                ShardNumber shardNumber = ShardNumber.SHARD_NUMBER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                ShardNumber shardNumberDecode = shardNumber;
                while (true) {
                    ShardRegion shardRegion = shardRegionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CashSettlementEvent(strDecode, strDecode2, shardRegion, shardNumberDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                shardRegionDecode = ShardRegion.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                shardNumberDecode = ShardNumber.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashSettlementEvent redact(CashSettlementEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CashSettlementEvent.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
