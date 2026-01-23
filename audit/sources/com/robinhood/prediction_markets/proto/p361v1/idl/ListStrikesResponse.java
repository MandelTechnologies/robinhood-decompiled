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

/* compiled from: ListStrikesResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponse;", "Lcom/squareup/wire/Message;", "", "contracts", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractElement;", "default_index", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;ILokio/ByteString;)V", "getDefault_index", "()I", "getContracts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ListStrikesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ListStrikesResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<ContractElement> contracts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "defaultIndex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int default_index;

    public ListStrikesResponse() {
        this(null, 0, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23834newBuilder();
    }

    public /* synthetic */ ListStrikesResponse(List list, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getDefault_index() {
        return this.default_index;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListStrikesResponse(List<ContractElement> contracts2, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.default_index = i;
        this.contracts = Internal.immutableCopyOf("contracts", contracts2);
    }

    public final List<ContractElement> getContracts() {
        return this.contracts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23834newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListStrikesResponse)) {
            return false;
        }
        ListStrikesResponse listStrikesResponse = (ListStrikesResponse) other;
        return Intrinsics.areEqual(unknownFields(), listStrikesResponse.unknownFields()) && Intrinsics.areEqual(this.contracts, listStrikesResponse.contracts) && this.default_index == listStrikesResponse.default_index;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.contracts.hashCode()) * 37) + Integer.hashCode(this.default_index);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.contracts.isEmpty()) {
            arrayList.add("contracts=" + this.contracts);
        }
        arrayList.add("default_index=" + this.default_index);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListStrikesResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListStrikesResponse copy$default(ListStrikesResponse listStrikesResponse, List list, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = listStrikesResponse.contracts;
        }
        if ((i2 & 2) != 0) {
            i = listStrikesResponse.default_index;
        }
        if ((i2 & 4) != 0) {
            byteString = listStrikesResponse.unknownFields();
        }
        return listStrikesResponse.copy(list, i, byteString);
    }

    public final ListStrikesResponse copy(List<ContractElement> contracts2, int default_index, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListStrikesResponse(contracts2, default_index, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListStrikesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListStrikesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ListStrikesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListStrikesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ContractElement.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getContracts());
                return value.getDefault_index() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getDefault_index())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListStrikesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ContractElement.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getContracts());
                if (value.getDefault_index() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getDefault_index()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListStrikesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDefault_index() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getDefault_index()));
                }
                ContractElement.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getContracts());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListStrikesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListStrikesResponse(arrayList, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ContractElement.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListStrikesResponse redact(ListStrikesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListStrikesResponse.copy$default(value, Internal.m26823redactElements(value.getContracts(), ContractElement.ADAPTER), 0, ByteString.EMPTY, 2, null);
            }
        };
    }
}
