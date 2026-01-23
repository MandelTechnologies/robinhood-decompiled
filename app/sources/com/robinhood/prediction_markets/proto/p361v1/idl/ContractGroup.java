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

/* compiled from: ContractGroup.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroup;", "Lcom/squareup/wire/Message;", "", "title", "", "contract_columns", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumn;", "row_names", "filterable_sets_by_row", "Lcom/robinhood/prediction_markets/proto/v1/idl/FilterableSet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getContract_columns", "()Ljava/util/List;", "getRow_names", "getFilterable_sets_by_row", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ContractGroup extends Message {

    @JvmField
    public static final ProtoAdapter<ContractGroup> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractColumn#ADAPTER", jsonName = "contractColumns", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ContractColumn> contract_columns;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.FilterableSet#ADAPTER", jsonName = "filterableSetsByRow", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<FilterableSet> filterable_sets_by_row;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowNames", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> row_names;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ContractGroup() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23775newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ContractGroup(String str, List list, List list2, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGroup(String title, List<ContractColumn> contract_columns, List<String> row_names, List<FilterableSet> filterable_sets_by_row, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contract_columns, "contract_columns");
        Intrinsics.checkNotNullParameter(row_names, "row_names");
        Intrinsics.checkNotNullParameter(filterable_sets_by_row, "filterable_sets_by_row");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.contract_columns = Internal.immutableCopyOf("contract_columns", contract_columns);
        this.row_names = Internal.immutableCopyOf("row_names", row_names);
        this.filterable_sets_by_row = Internal.immutableCopyOf("filterable_sets_by_row", filterable_sets_by_row);
    }

    public final List<ContractColumn> getContract_columns() {
        return this.contract_columns;
    }

    public final List<String> getRow_names() {
        return this.row_names;
    }

    public final List<FilterableSet> getFilterable_sets_by_row() {
        return this.filterable_sets_by_row;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23775newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractGroup)) {
            return false;
        }
        ContractGroup contractGroup = (ContractGroup) other;
        return Intrinsics.areEqual(unknownFields(), contractGroup.unknownFields()) && Intrinsics.areEqual(this.title, contractGroup.title) && Intrinsics.areEqual(this.contract_columns, contractGroup.contract_columns) && Intrinsics.areEqual(this.row_names, contractGroup.row_names) && Intrinsics.areEqual(this.filterable_sets_by_row, contractGroup.filterable_sets_by_row);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.contract_columns.hashCode()) * 37) + this.row_names.hashCode()) * 37) + this.filterable_sets_by_row.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.contract_columns.isEmpty()) {
            arrayList.add("contract_columns=" + this.contract_columns);
        }
        if (!this.row_names.isEmpty()) {
            arrayList.add("row_names=" + Internal.sanitize(this.row_names));
        }
        if (!this.filterable_sets_by_row.isEmpty()) {
            arrayList.add("filterable_sets_by_row=" + this.filterable_sets_by_row);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractGroup{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractGroup copy$default(ContractGroup contractGroup, String str, List list, List list2, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGroup.title;
        }
        if ((i & 2) != 0) {
            list = contractGroup.contract_columns;
        }
        if ((i & 4) != 0) {
            list2 = contractGroup.row_names;
        }
        if ((i & 8) != 0) {
            list3 = contractGroup.filterable_sets_by_row;
        }
        if ((i & 16) != 0) {
            byteString = contractGroup.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list4 = list2;
        return contractGroup.copy(str, list, list4, list3, byteString2);
    }

    public final ContractGroup copy(String title, List<ContractColumn> contract_columns, List<String> row_names, List<FilterableSet> filterable_sets_by_row, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contract_columns, "contract_columns");
        Intrinsics.checkNotNullParameter(row_names, "row_names");
        Intrinsics.checkNotNullParameter(filterable_sets_by_row, "filterable_sets_by_row");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractGroup(title, contract_columns, row_names, filterable_sets_by_row, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractGroup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return size + ContractColumn.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getContract_columns()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.getRow_names()) + FilterableSet.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getFilterable_sets_by_row());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ContractColumn.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_columns());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, (int) value.getRow_names());
                FilterableSet.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFilterable_sets_by_row());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FilterableSet.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFilterable_sets_by_row());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getRow_names());
                ContractColumn.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_columns());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractGroup decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContractGroup(strDecode, arrayList, arrayList2, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ContractColumn.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList3.add(FilterableSet.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractGroup redact(ContractGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ContractGroup.copy$default(value, null, Internal.m26823redactElements(value.getContract_columns(), ContractColumn.ADAPTER), null, Internal.m26823redactElements(value.getFilterable_sets_by_row(), FilterableSet.ADAPTER), ByteString.EMPTY, 5, null);
            }
        };
    }
}
