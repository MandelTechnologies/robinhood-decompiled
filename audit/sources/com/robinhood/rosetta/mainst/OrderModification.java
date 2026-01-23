package com.robinhood.rosetta.mainst;

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
import rosetta.mainst.ModificationRequestState;

/* compiled from: OrderModification.kt */
@kotlin.Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JH\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderModification;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "processed_at", "state", "Lrosetta/mainst/ModificationRequestState;", "seq_no", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/ModificationRequestState;ILokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getProcessed_at", "getState", "()Lrosetta/mainst/ModificationRequestState;", "getSeq_no", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderModification extends Message {

    @JvmField
    public static final ProtoAdapter<OrderModification> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Time created_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "processedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Time processed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seqNo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int seq_no;

    @WireField(adapter = "rosetta.mainst.ModificationRequestState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ModificationRequestState state;

    public OrderModification() {
        this(null, null, null, null, 0, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24691newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getProcessed_at() {
        return this.processed_at;
    }

    public final ModificationRequestState getState() {
        return this.state;
    }

    public /* synthetic */ OrderModification(UUID uuid, Time time, Time time2, ModificationRequestState modificationRequestState, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? null : time, (i2 & 4) != 0 ? null : time2, (i2 & 8) != 0 ? ModificationRequestState.MODIFICATION_REQUEST_STATE_UNSPECIFIED : modificationRequestState, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getSeq_no() {
        return this.seq_no;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderModification(UUID uuid, Time time, Time time2, ModificationRequestState state, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.created_at = time;
        this.processed_at = time2;
        this.state = state;
        this.seq_no = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24691newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderModification)) {
            return false;
        }
        OrderModification orderModification = (OrderModification) other;
        return Intrinsics.areEqual(unknownFields(), orderModification.unknownFields()) && Intrinsics.areEqual(this.id, orderModification.id) && Intrinsics.areEqual(this.created_at, orderModification.created_at) && Intrinsics.areEqual(this.processed_at, orderModification.processed_at) && this.state == orderModification.state && this.seq_no == orderModification.seq_no;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        Time time = this.created_at;
        int iHashCode3 = (iHashCode2 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.processed_at;
        int iHashCode4 = ((((iHashCode3 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + Integer.hashCode(this.seq_no);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.processed_at;
        if (time2 != null) {
            arrayList.add("processed_at=" + time2);
        }
        arrayList.add("state=" + this.state);
        arrayList.add("seq_no=" + this.seq_no);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderModification{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderModification copy$default(OrderModification orderModification, UUID uuid, Time time, Time time2, ModificationRequestState modificationRequestState, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = orderModification.id;
        }
        if ((i2 & 2) != 0) {
            time = orderModification.created_at;
        }
        if ((i2 & 4) != 0) {
            time2 = orderModification.processed_at;
        }
        if ((i2 & 8) != 0) {
            modificationRequestState = orderModification.state;
        }
        if ((i2 & 16) != 0) {
            i = orderModification.seq_no;
        }
        if ((i2 & 32) != 0) {
            byteString = orderModification.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        return orderModification.copy(uuid, time, time2, modificationRequestState, i3, byteString2);
    }

    public final OrderModification copy(UUID id, Time created_at, Time processed_at, ModificationRequestState state, int seq_no, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderModification(id, created_at, processed_at, state, seq_no, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderModification.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderModification>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OrderModification$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderModification value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getCreated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(2, value.getCreated_at());
                }
                if (value.getProcessed_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(3, value.getProcessed_at());
                }
                if (value.getState() != ModificationRequestState.MODIFICATION_REQUEST_STATE_UNSPECIFIED) {
                    size += ModificationRequestState.ADAPTER.encodedSizeWithTag(4, value.getState());
                }
                return value.getSeq_no() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getSeq_no())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderModification value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (value.getProcessed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 3, (int) value.getProcessed_at());
                }
                if (value.getState() != ModificationRequestState.MODIFICATION_REQUEST_STATE_UNSPECIFIED) {
                    ModificationRequestState.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getSeq_no() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getSeq_no()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderModification value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSeq_no() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getSeq_no()));
                }
                if (value.getState() != ModificationRequestState.MODIFICATION_REQUEST_STATE_UNSPECIFIED) {
                    ModificationRequestState.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getProcessed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 3, (int) value.getProcessed_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderModification decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ModificationRequestState modificationRequestState = ModificationRequestState.MODIFICATION_REQUEST_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Time timeDecode = null;
                Time timeDecode2 = null;
                int iIntValue = 0;
                ModificationRequestState modificationRequestStateDecode = modificationRequestState;
                UUID uuidDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderModification(uuidDecode, timeDecode, timeDecode2, modificationRequestStateDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uuidDecode = UUID.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        timeDecode = Time.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        timeDecode2 = Time.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            modificationRequestStateDecode = ModificationRequestState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 5) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderModification redact(OrderModification value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                Time created_at = value.getCreated_at();
                Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time processed_at = value.getProcessed_at();
                return OrderModification.copy$default(value, uuidRedact, timeRedact, processed_at != null ? Time.ADAPTER.redact(processed_at) : null, null, 0, ByteString.EMPTY, 24, null);
            }
        };
    }
}
