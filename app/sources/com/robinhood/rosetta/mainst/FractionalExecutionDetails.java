package com.robinhood.rosetta.mainst;

import com.plaid.internal.EnumC7081g;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.Capacity;

/* compiled from: FractionalExecutionDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016JV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalExecutionDetails;", "Lcom/squareup/wire/Message;", "", "nbbo_details", "Lcom/robinhood/rosetta/mainst/NBBODetails;", "pending_execution_id", "Lcom/robinhood/rosetta/mainst/UUID;", "price_source_execution_id", "capacity", "Lrosetta/mainst/Capacity;", "is_adjustment", "Lcom/robinhood/rosetta/mainst/NullableBool;", "firm_order_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/NBBODetails;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/Capacity;Lcom/robinhood/rosetta/mainst/NullableBool;Lcom/robinhood/rosetta/mainst/UUID;Lokio/ByteString;)V", "getNbbo_details", "()Lcom/robinhood/rosetta/mainst/NBBODetails;", "getPending_execution_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getPrice_source_execution_id", "getCapacity", "()Lrosetta/mainst/Capacity;", "()Lcom/robinhood/rosetta/mainst/NullableBool;", "getFirm_order_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FractionalExecutionDetails extends Message {

    @JvmField
    public static final ProtoAdapter<FractionalExecutionDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.mainst.Capacity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Capacity capacity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "firmOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final UUID firm_order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableBool#ADAPTER", jsonName = "isAdjustment", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final NullableBool is_adjustment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NBBODetails#ADAPTER", jsonName = "nbboDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final NBBODetails nbbo_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "pendingExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID pending_execution_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "priceSourceExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final UUID price_source_execution_id;

    public FractionalExecutionDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24660newBuilder();
    }

    public final NBBODetails getNbbo_details() {
        return this.nbbo_details;
    }

    public final UUID getPending_execution_id() {
        return this.pending_execution_id;
    }

    public final UUID getPrice_source_execution_id() {
        return this.price_source_execution_id;
    }

    public final Capacity getCapacity() {
        return this.capacity;
    }

    public /* synthetic */ FractionalExecutionDetails(NBBODetails nBBODetails, UUID uuid, UUID uuid2, Capacity capacity, NullableBool nullableBool, UUID uuid3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nBBODetails, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : uuid2, (i & 8) != 0 ? Capacity.CAPACITY_UNSPECIFIED : capacity, (i & 16) != 0 ? null : nullableBool, (i & 32) != 0 ? null : uuid3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_adjustment, reason: from getter */
    public final NullableBool getIs_adjustment() {
        return this.is_adjustment;
    }

    public final UUID getFirm_order_id() {
        return this.firm_order_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FractionalExecutionDetails(NBBODetails nBBODetails, UUID uuid, UUID uuid2, Capacity capacity, NullableBool nullableBool, UUID uuid3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.nbbo_details = nBBODetails;
        this.pending_execution_id = uuid;
        this.price_source_execution_id = uuid2;
        this.capacity = capacity;
        this.is_adjustment = nullableBool;
        this.firm_order_id = uuid3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24660newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FractionalExecutionDetails)) {
            return false;
        }
        FractionalExecutionDetails fractionalExecutionDetails = (FractionalExecutionDetails) other;
        return Intrinsics.areEqual(unknownFields(), fractionalExecutionDetails.unknownFields()) && Intrinsics.areEqual(this.nbbo_details, fractionalExecutionDetails.nbbo_details) && Intrinsics.areEqual(this.pending_execution_id, fractionalExecutionDetails.pending_execution_id) && Intrinsics.areEqual(this.price_source_execution_id, fractionalExecutionDetails.price_source_execution_id) && this.capacity == fractionalExecutionDetails.capacity && Intrinsics.areEqual(this.is_adjustment, fractionalExecutionDetails.is_adjustment) && Intrinsics.areEqual(this.firm_order_id, fractionalExecutionDetails.firm_order_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        NBBODetails nBBODetails = this.nbbo_details;
        int iHashCode2 = (iHashCode + (nBBODetails != null ? nBBODetails.hashCode() : 0)) * 37;
        UUID uuid = this.pending_execution_id;
        int iHashCode3 = (iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.price_source_execution_id;
        int iHashCode4 = (((iHashCode3 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.capacity.hashCode()) * 37;
        NullableBool nullableBool = this.is_adjustment;
        int iHashCode5 = (iHashCode4 + (nullableBool != null ? nullableBool.hashCode() : 0)) * 37;
        UUID uuid3 = this.firm_order_id;
        int iHashCode6 = iHashCode5 + (uuid3 != null ? uuid3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        NBBODetails nBBODetails = this.nbbo_details;
        if (nBBODetails != null) {
            arrayList.add("nbbo_details=" + nBBODetails);
        }
        UUID uuid = this.pending_execution_id;
        if (uuid != null) {
            arrayList.add("pending_execution_id=" + uuid);
        }
        UUID uuid2 = this.price_source_execution_id;
        if (uuid2 != null) {
            arrayList.add("price_source_execution_id=" + uuid2);
        }
        arrayList.add("capacity=" + this.capacity);
        NullableBool nullableBool = this.is_adjustment;
        if (nullableBool != null) {
            arrayList.add("is_adjustment=" + nullableBool);
        }
        UUID uuid3 = this.firm_order_id;
        if (uuid3 != null) {
            arrayList.add("firm_order_id=" + uuid3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FractionalExecutionDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FractionalExecutionDetails copy$default(FractionalExecutionDetails fractionalExecutionDetails, NBBODetails nBBODetails, UUID uuid, UUID uuid2, Capacity capacity, NullableBool nullableBool, UUID uuid3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            nBBODetails = fractionalExecutionDetails.nbbo_details;
        }
        if ((i & 2) != 0) {
            uuid = fractionalExecutionDetails.pending_execution_id;
        }
        if ((i & 4) != 0) {
            uuid2 = fractionalExecutionDetails.price_source_execution_id;
        }
        if ((i & 8) != 0) {
            capacity = fractionalExecutionDetails.capacity;
        }
        if ((i & 16) != 0) {
            nullableBool = fractionalExecutionDetails.is_adjustment;
        }
        if ((i & 32) != 0) {
            uuid3 = fractionalExecutionDetails.firm_order_id;
        }
        if ((i & 64) != 0) {
            byteString = fractionalExecutionDetails.unknownFields();
        }
        UUID uuid4 = uuid3;
        ByteString byteString2 = byteString;
        NullableBool nullableBool2 = nullableBool;
        UUID uuid5 = uuid2;
        return fractionalExecutionDetails.copy(nBBODetails, uuid, uuid5, capacity, nullableBool2, uuid4, byteString2);
    }

    public final FractionalExecutionDetails copy(NBBODetails nbbo_details, UUID pending_execution_id, UUID price_source_execution_id, Capacity capacity, NullableBool is_adjustment, UUID firm_order_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FractionalExecutionDetails(nbbo_details, pending_execution_id, price_source_execution_id, capacity, is_adjustment, firm_order_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FractionalExecutionDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FractionalExecutionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.FractionalExecutionDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FractionalExecutionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNbbo_details() != null) {
                    size += NBBODetails.ADAPTER.encodedSizeWithTag(1, value.getNbbo_details());
                }
                if (value.getPending_execution_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getPending_execution_id());
                }
                if (value.getPrice_source_execution_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(3, value.getPrice_source_execution_id());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    size += Capacity.ADAPTER.encodedSizeWithTag(4, value.getCapacity());
                }
                if (value.getIs_adjustment() != null) {
                    size += NullableBool.ADAPTER.encodedSizeWithTag(5, value.getIs_adjustment());
                }
                return value.getFirm_order_id() != null ? size + UUID.ADAPTER.encodedSizeWithTag(6, value.getFirm_order_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FractionalExecutionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNbbo_details() != null) {
                    NBBODetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getNbbo_details());
                }
                if (value.getPending_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getPending_execution_id());
                }
                if (value.getPrice_source_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrice_source_execution_id());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    Capacity.ADAPTER.encodeWithTag(writer, 4, (int) value.getCapacity());
                }
                if (value.getIs_adjustment() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 5, (int) value.getIs_adjustment());
                }
                if (value.getFirm_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 6, (int) value.getFirm_order_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FractionalExecutionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFirm_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 6, (int) value.getFirm_order_id());
                }
                if (value.getIs_adjustment() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 5, (int) value.getIs_adjustment());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    Capacity.ADAPTER.encodeWithTag(writer, 4, (int) value.getCapacity());
                }
                if (value.getPrice_source_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrice_source_execution_id());
                }
                if (value.getPending_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getPending_execution_id());
                }
                if (value.getNbbo_details() != null) {
                    NBBODetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getNbbo_details());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FractionalExecutionDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Capacity capacityDecode = Capacity.CAPACITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                NBBODetails nBBODetailsDecode = null;
                UUID uuidDecode = null;
                UUID uuidDecode2 = null;
                NullableBool nullableBoolDecode = null;
                UUID uuidDecode3 = null;
                while (true) {
                    Capacity capacity = capacityDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    nBBODetailsDecode = NBBODetails.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    uuidDecode = UUID.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    uuidDecode2 = UUID.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        capacityDecode = Capacity.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 5:
                                    nullableBoolDecode = NullableBool.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    uuidDecode3 = UUID.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new FractionalExecutionDetails(nBBODetailsDecode, uuidDecode, uuidDecode2, capacity, nullableBoolDecode, uuidDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FractionalExecutionDetails redact(FractionalExecutionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                NBBODetails nbbo_details = value.getNbbo_details();
                NBBODetails nBBODetailsRedact = nbbo_details != null ? NBBODetails.ADAPTER.redact(nbbo_details) : null;
                UUID pending_execution_id = value.getPending_execution_id();
                UUID uuidRedact = pending_execution_id != null ? UUID.ADAPTER.redact(pending_execution_id) : null;
                UUID price_source_execution_id = value.getPrice_source_execution_id();
                UUID uuidRedact2 = price_source_execution_id != null ? UUID.ADAPTER.redact(price_source_execution_id) : null;
                NullableBool is_adjustment = value.getIs_adjustment();
                NullableBool nullableBoolRedact = is_adjustment != null ? NullableBool.ADAPTER.redact(is_adjustment) : null;
                UUID firm_order_id = value.getFirm_order_id();
                return FractionalExecutionDetails.copy$default(value, nBBODetailsRedact, uuidRedact, uuidRedact2, null, nullableBoolRedact, firm_order_id != null ? UUID.ADAPTER.redact(firm_order_id) : null, ByteString.EMPTY, 8, null);
            }
        };
    }
}
