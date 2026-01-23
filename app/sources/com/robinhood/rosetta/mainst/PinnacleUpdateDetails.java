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

/* compiled from: PinnacleUpdateDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetails;", "Lcom/squareup/wire/Message;", "", "order_details", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetails;", "execution_event_details", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/PinnacleOrderDetails;Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetails;Lokio/ByteString;)V", "getOrder_details", "()Lcom/robinhood/rosetta/mainst/PinnacleOrderDetails;", "getExecution_event_details", "()Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinnacleUpdateDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PinnacleUpdateDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.PinnacleExecutionDetails#ADAPTER", jsonName = "executionEventDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PinnacleExecutionDetails execution_event_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.PinnacleOrderDetails#ADAPTER", jsonName = "orderDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PinnacleOrderDetails order_details;

    public PinnacleUpdateDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24701newBuilder();
    }

    public final PinnacleOrderDetails getOrder_details() {
        return this.order_details;
    }

    public final PinnacleExecutionDetails getExecution_event_details() {
        return this.execution_event_details;
    }

    public /* synthetic */ PinnacleUpdateDetails(PinnacleOrderDetails pinnacleOrderDetails, PinnacleExecutionDetails pinnacleExecutionDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pinnacleOrderDetails, (i & 2) != 0 ? null : pinnacleExecutionDetails, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnacleUpdateDetails(PinnacleOrderDetails pinnacleOrderDetails, PinnacleExecutionDetails pinnacleExecutionDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_details = pinnacleOrderDetails;
        this.execution_event_details = pinnacleExecutionDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24701newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PinnacleUpdateDetails)) {
            return false;
        }
        PinnacleUpdateDetails pinnacleUpdateDetails = (PinnacleUpdateDetails) other;
        return Intrinsics.areEqual(unknownFields(), pinnacleUpdateDetails.unknownFields()) && Intrinsics.areEqual(this.order_details, pinnacleUpdateDetails.order_details) && Intrinsics.areEqual(this.execution_event_details, pinnacleUpdateDetails.execution_event_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PinnacleOrderDetails pinnacleOrderDetails = this.order_details;
        int iHashCode2 = (iHashCode + (pinnacleOrderDetails != null ? pinnacleOrderDetails.hashCode() : 0)) * 37;
        PinnacleExecutionDetails pinnacleExecutionDetails = this.execution_event_details;
        int iHashCode3 = iHashCode2 + (pinnacleExecutionDetails != null ? pinnacleExecutionDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PinnacleOrderDetails pinnacleOrderDetails = this.order_details;
        if (pinnacleOrderDetails != null) {
            arrayList.add("order_details=" + pinnacleOrderDetails);
        }
        PinnacleExecutionDetails pinnacleExecutionDetails = this.execution_event_details;
        if (pinnacleExecutionDetails != null) {
            arrayList.add("execution_event_details=" + pinnacleExecutionDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PinnacleUpdateDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PinnacleUpdateDetails copy$default(PinnacleUpdateDetails pinnacleUpdateDetails, PinnacleOrderDetails pinnacleOrderDetails, PinnacleExecutionDetails pinnacleExecutionDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            pinnacleOrderDetails = pinnacleUpdateDetails.order_details;
        }
        if ((i & 2) != 0) {
            pinnacleExecutionDetails = pinnacleUpdateDetails.execution_event_details;
        }
        if ((i & 4) != 0) {
            byteString = pinnacleUpdateDetails.unknownFields();
        }
        return pinnacleUpdateDetails.copy(pinnacleOrderDetails, pinnacleExecutionDetails, byteString);
    }

    public final PinnacleUpdateDetails copy(PinnacleOrderDetails order_details, PinnacleExecutionDetails execution_event_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PinnacleUpdateDetails(order_details, execution_event_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PinnacleUpdateDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PinnacleUpdateDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.PinnacleUpdateDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PinnacleUpdateDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_details() != null) {
                    size += PinnacleOrderDetails.ADAPTER.encodedSizeWithTag(1, value.getOrder_details());
                }
                return value.getExecution_event_details() != null ? size + PinnacleExecutionDetails.ADAPTER.encodedSizeWithTag(2, value.getExecution_event_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PinnacleUpdateDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_details() != null) {
                    PinnacleOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_details());
                }
                if (value.getExecution_event_details() != null) {
                    PinnacleExecutionDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getExecution_event_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PinnacleUpdateDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExecution_event_details() != null) {
                    PinnacleExecutionDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getExecution_event_details());
                }
                if (value.getOrder_details() != null) {
                    PinnacleOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_details());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleUpdateDetails redact(PinnacleUpdateDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PinnacleOrderDetails order_details = value.getOrder_details();
                PinnacleOrderDetails pinnacleOrderDetailsRedact = order_details != null ? PinnacleOrderDetails.ADAPTER.redact(order_details) : null;
                PinnacleExecutionDetails execution_event_details = value.getExecution_event_details();
                return value.copy(pinnacleOrderDetailsRedact, execution_event_details != null ? PinnacleExecutionDetails.ADAPTER.redact(execution_event_details) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleUpdateDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PinnacleOrderDetails pinnacleOrderDetailsDecode = null;
                PinnacleExecutionDetails pinnacleExecutionDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PinnacleUpdateDetails(pinnacleOrderDetailsDecode, pinnacleExecutionDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        pinnacleOrderDetailsDecode = PinnacleOrderDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        pinnacleExecutionDetailsDecode = PinnacleExecutionDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
