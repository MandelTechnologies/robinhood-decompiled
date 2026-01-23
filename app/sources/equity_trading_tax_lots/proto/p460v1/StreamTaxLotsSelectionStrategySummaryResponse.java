package equity_trading_tax_lots.proto.p460v1;

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

/* compiled from: StreamTaxLotsSelectionStrategySummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;", "Lcom/squareup/wire/Message;", "", "maximum_number_of_lots", "", "selection_strategies", "", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getMaximum_number_of_lots", "()Ljava/lang/String;", "getSelection_strategies", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamTaxLotsSelectionStrategySummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotsSelectionStrategySummaryResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maximumNumberOfLots", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String maximum_number_of_lots;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionStrategySummary#ADAPTER", jsonName = "selectionStrategies", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<SelectionStrategySummary> selection_strategies;

    public StreamTaxLotsSelectionStrategySummaryResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28068newBuilder();
    }

    public final String getMaximum_number_of_lots() {
        return this.maximum_number_of_lots;
    }

    public /* synthetic */ StreamTaxLotsSelectionStrategySummaryResponse(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsSelectionStrategySummaryResponse(String maximum_number_of_lots, List<SelectionStrategySummary> selection_strategies, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(maximum_number_of_lots, "maximum_number_of_lots");
        Intrinsics.checkNotNullParameter(selection_strategies, "selection_strategies");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.maximum_number_of_lots = maximum_number_of_lots;
        this.selection_strategies = Internal.immutableCopyOf("selection_strategies", selection_strategies);
    }

    public final List<SelectionStrategySummary> getSelection_strategies() {
        return this.selection_strategies;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28068newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotsSelectionStrategySummaryResponse)) {
            return false;
        }
        StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = (StreamTaxLotsSelectionStrategySummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotsSelectionStrategySummaryResponse.unknownFields()) && Intrinsics.areEqual(this.maximum_number_of_lots, streamTaxLotsSelectionStrategySummaryResponse.maximum_number_of_lots) && Intrinsics.areEqual(this.selection_strategies, streamTaxLotsSelectionStrategySummaryResponse.selection_strategies);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.maximum_number_of_lots.hashCode()) * 37) + this.selection_strategies.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("maximum_number_of_lots=" + Internal.sanitize(this.maximum_number_of_lots));
        if (!this.selection_strategies.isEmpty()) {
            arrayList.add("selection_strategies=" + this.selection_strategies);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotsSelectionStrategySummaryResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamTaxLotsSelectionStrategySummaryResponse copy$default(StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamTaxLotsSelectionStrategySummaryResponse.maximum_number_of_lots;
        }
        if ((i & 2) != 0) {
            list = streamTaxLotsSelectionStrategySummaryResponse.selection_strategies;
        }
        if ((i & 4) != 0) {
            byteString = streamTaxLotsSelectionStrategySummaryResponse.unknownFields();
        }
        return streamTaxLotsSelectionStrategySummaryResponse.copy(str, list, byteString);
    }

    public final StreamTaxLotsSelectionStrategySummaryResponse copy(String maximum_number_of_lots, List<SelectionStrategySummary> selection_strategies, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(maximum_number_of_lots, "maximum_number_of_lots");
        Intrinsics.checkNotNullParameter(selection_strategies, "selection_strategies");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotsSelectionStrategySummaryResponse(maximum_number_of_lots, selection_strategies, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotsSelectionStrategySummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotsSelectionStrategySummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsSelectionStrategySummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotsSelectionStrategySummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMaximum_number_of_lots(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMaximum_number_of_lots());
                }
                return size + SelectionStrategySummary.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSelection_strategies());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotsSelectionStrategySummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMaximum_number_of_lots(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMaximum_number_of_lots());
                }
                SelectionStrategySummary.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSelection_strategies());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotsSelectionStrategySummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SelectionStrategySummary.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSelection_strategies());
                if (Intrinsics.areEqual(value.getMaximum_number_of_lots(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMaximum_number_of_lots());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsSelectionStrategySummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamTaxLotsSelectionStrategySummaryResponse(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(SelectionStrategySummary.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsSelectionStrategySummaryResponse redact(StreamTaxLotsSelectionStrategySummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamTaxLotsSelectionStrategySummaryResponse.copy$default(value, null, Internal.m26823redactElements(value.getSelection_strategies(), SelectionStrategySummary.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
