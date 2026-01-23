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

/* compiled from: ContractGroupSection.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JV\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSection;", "Lcom/squareup/wire/Message;", "", "title", "", "event_long_descriptions", "", "event_long_description_titles", "filter_set", "contract_group", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroup;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getContract_group", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroup;", "getEvent_long_descriptions", "()Ljava/util/List;", "getEvent_long_description_titles", "getFilter_set", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ContractGroupSection extends Message {

    @JvmField
    public static final ProtoAdapter<ContractGroupSection> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractGroup#ADAPTER", jsonName = "contractGroup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final ContractGroup contract_group;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventLongDescriptionTitles", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 5)
    private final List<String> event_long_description_titles;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventLongDescriptions", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> event_long_descriptions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "filterSet", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 3)
    private final List<String> filter_set;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ContractGroupSection() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23778newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ContractGroupSection(String str, List list, List list2, List list3, ContractGroup contractGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? null : contractGroup, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ContractGroup getContract_group() {
        return this.contract_group;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGroupSection(String title, List<String> event_long_descriptions, List<String> event_long_description_titles, List<String> filter_set, ContractGroup contractGroup, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(event_long_descriptions, "event_long_descriptions");
        Intrinsics.checkNotNullParameter(event_long_description_titles, "event_long_description_titles");
        Intrinsics.checkNotNullParameter(filter_set, "filter_set");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.contract_group = contractGroup;
        this.event_long_descriptions = Internal.immutableCopyOf("event_long_descriptions", event_long_descriptions);
        this.event_long_description_titles = Internal.immutableCopyOf("event_long_description_titles", event_long_description_titles);
        this.filter_set = Internal.immutableCopyOf("filter_set", filter_set);
    }

    public final List<String> getEvent_long_descriptions() {
        return this.event_long_descriptions;
    }

    public final List<String> getEvent_long_description_titles() {
        return this.event_long_description_titles;
    }

    public final List<String> getFilter_set() {
        return this.filter_set;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23778newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractGroupSection)) {
            return false;
        }
        ContractGroupSection contractGroupSection = (ContractGroupSection) other;
        return Intrinsics.areEqual(unknownFields(), contractGroupSection.unknownFields()) && Intrinsics.areEqual(this.title, contractGroupSection.title) && Intrinsics.areEqual(this.event_long_descriptions, contractGroupSection.event_long_descriptions) && Intrinsics.areEqual(this.event_long_description_titles, contractGroupSection.event_long_description_titles) && Intrinsics.areEqual(this.filter_set, contractGroupSection.filter_set) && Intrinsics.areEqual(this.contract_group, contractGroupSection.contract_group);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.event_long_descriptions.hashCode()) * 37) + this.event_long_description_titles.hashCode()) * 37) + this.filter_set.hashCode()) * 37;
        ContractGroup contractGroup = this.contract_group;
        int iHashCode2 = iHashCode + (contractGroup != null ? contractGroup.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.event_long_descriptions.isEmpty()) {
            arrayList.add("event_long_descriptions=" + Internal.sanitize(this.event_long_descriptions));
        }
        if (!this.event_long_description_titles.isEmpty()) {
            arrayList.add("event_long_description_titles=" + Internal.sanitize(this.event_long_description_titles));
        }
        if (!this.filter_set.isEmpty()) {
            arrayList.add("filter_set=" + Internal.sanitize(this.filter_set));
        }
        ContractGroup contractGroup = this.contract_group;
        if (contractGroup != null) {
            arrayList.add("contract_group=" + contractGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractGroupSection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractGroupSection copy$default(ContractGroupSection contractGroupSection, String str, List list, List list2, List list3, ContractGroup contractGroup, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGroupSection.title;
        }
        if ((i & 2) != 0) {
            list = contractGroupSection.event_long_descriptions;
        }
        if ((i & 4) != 0) {
            list2 = contractGroupSection.event_long_description_titles;
        }
        if ((i & 8) != 0) {
            list3 = contractGroupSection.filter_set;
        }
        if ((i & 16) != 0) {
            contractGroup = contractGroupSection.contract_group;
        }
        if ((i & 32) != 0) {
            byteString = contractGroupSection.unknownFields();
        }
        ContractGroup contractGroup2 = contractGroup;
        ByteString byteString2 = byteString;
        return contractGroupSection.copy(str, list, list2, list3, contractGroup2, byteString2);
    }

    public final ContractGroupSection copy(String title, List<String> event_long_descriptions, List<String> event_long_description_titles, List<String> filter_set, ContractGroup contract_group, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(event_long_descriptions, "event_long_descriptions");
        Intrinsics.checkNotNullParameter(event_long_description_titles, "event_long_description_titles");
        Intrinsics.checkNotNullParameter(filter_set, "filter_set");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractGroupSection(title, event_long_descriptions, event_long_description_titles, filter_set, contract_group, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractGroupSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractGroupSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractGroupSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getEvent_long_descriptions()) + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getEvent_long_description_titles()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getFilter_set());
                return value.getContract_group() != null ? iEncodedSizeWithTag + ContractGroup.ADAPTER.encodedSizeWithTag(4, value.getContract_group()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractGroupSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getEvent_long_descriptions());
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getEvent_long_description_titles());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getFilter_set());
                if (value.getContract_group() != null) {
                    ContractGroup.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_group());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractGroupSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContract_group() != null) {
                    ContractGroup.ADAPTER.encodeWithTag(writer, 4, (int) value.getContract_group());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getFilter_set());
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getEvent_long_description_titles());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getEvent_long_descriptions());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractGroupSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ContractGroup contractGroupDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContractGroupSection(strDecode, arrayList, arrayList2, arrayList3, contractGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList3.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 4) {
                        contractGroupDecode = ContractGroup.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractGroupSection redact(ContractGroupSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ContractGroup contract_group = value.getContract_group();
                return ContractGroupSection.copy$default(value, null, null, null, null, contract_group != null ? ContractGroup.ADAPTER.redact(contract_group) : null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
