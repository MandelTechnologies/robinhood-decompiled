package search_coprocessor.p542v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import search_coprocessor.p542v1.MultiContractsHeroDetails;

/* compiled from: MultiContractsHeroDetails.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetails;", "Lcom/squareup/wire/Message;", "", "title", "", "headline", "contracts", "", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$ContractInfo;", ResourceTypes.STYLE, "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getHeadline", "getStyle", "()Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "getContracts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ContractInfo", "DisplayStyle", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class MultiContractsHeroDetails extends Message {

    @JvmField
    public static final ProtoAdapter<MultiContractsHeroDetails> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.MultiContractsHeroDetails$ContractInfo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ContractInfo> contracts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String headline;

    @WireField(adapter = "search_coprocessor.v1.MultiContractsHeroDetails$DisplayStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final DisplayStyle style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public MultiContractsHeroDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ MultiContractsHeroDetails(String str, String str2, List list, DisplayStyle displayStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? DisplayStyle.DISPLAY_STYLE_UNSPECIFIED : displayStyle, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29966newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final DisplayStyle getStyle() {
        return this.style;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiContractsHeroDetails(String title, String headline, List<ContractInfo> contracts2, DisplayStyle style, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.headline = headline;
        this.style = style;
        this.contracts = Internal.immutableCopyOf("contracts", contracts2);
    }

    public final List<ContractInfo> getContracts() {
        return this.contracts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29966newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MultiContractsHeroDetails)) {
            return false;
        }
        MultiContractsHeroDetails multiContractsHeroDetails = (MultiContractsHeroDetails) other;
        return Intrinsics.areEqual(unknownFields(), multiContractsHeroDetails.unknownFields()) && Intrinsics.areEqual(this.title, multiContractsHeroDetails.title) && Intrinsics.areEqual(this.headline, multiContractsHeroDetails.headline) && Intrinsics.areEqual(this.contracts, multiContractsHeroDetails.contracts) && this.style == multiContractsHeroDetails.style;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.headline.hashCode()) * 37) + this.contracts.hashCode()) * 37) + this.style.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("headline=" + Internal.sanitize(this.headline));
        if (!this.contracts.isEmpty()) {
            arrayList.add("contracts=" + this.contracts);
        }
        arrayList.add("style=" + this.style);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiContractsHeroDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MultiContractsHeroDetails copy$default(MultiContractsHeroDetails multiContractsHeroDetails, String str, String str2, List list, DisplayStyle displayStyle, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiContractsHeroDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = multiContractsHeroDetails.headline;
        }
        if ((i & 4) != 0) {
            list = multiContractsHeroDetails.contracts;
        }
        if ((i & 8) != 0) {
            displayStyle = multiContractsHeroDetails.style;
        }
        if ((i & 16) != 0) {
            byteString = multiContractsHeroDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return multiContractsHeroDetails.copy(str, str2, list2, displayStyle, byteString2);
    }

    public final MultiContractsHeroDetails copy(String title, String headline, List<ContractInfo> contracts2, DisplayStyle style, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MultiContractsHeroDetails(title, headline, contracts2, style, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MultiContractsHeroDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MultiContractsHeroDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.MultiContractsHeroDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MultiContractsHeroDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getHeadline(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHeadline());
                }
                int iEncodedSizeWithTag = size + MultiContractsHeroDetails.ContractInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getContracts());
                return value.getStyle() != MultiContractsHeroDetails.DisplayStyle.DISPLAY_STYLE_UNSPECIFIED ? iEncodedSizeWithTag + MultiContractsHeroDetails.DisplayStyle.ADAPTER.encodedSizeWithTag(4, value.getStyle()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MultiContractsHeroDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getHeadline(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeadline());
                }
                MultiContractsHeroDetails.ContractInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getContracts());
                if (value.getStyle() != MultiContractsHeroDetails.DisplayStyle.DISPLAY_STYLE_UNSPECIFIED) {
                    MultiContractsHeroDetails.DisplayStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MultiContractsHeroDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStyle() != MultiContractsHeroDetails.DisplayStyle.DISPLAY_STYLE_UNSPECIFIED) {
                    MultiContractsHeroDetails.DisplayStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                }
                MultiContractsHeroDetails.ContractInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getContracts());
                if (!Intrinsics.areEqual(value.getHeadline(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeadline());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiContractsHeroDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                MultiContractsHeroDetails.DisplayStyle displayStyleDecode = MultiContractsHeroDetails.DisplayStyle.DISPLAY_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                while (true) {
                    MultiContractsHeroDetails.DisplayStyle displayStyle = displayStyleDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new MultiContractsHeroDetails(strDecode, strDecode2, arrayList, displayStyle, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            arrayList.add(MultiContractsHeroDetails.ContractInfo.ADAPTER.decode(reader));
                        } else if (iNextTag == 4) {
                            try {
                                displayStyleDecode = MultiContractsHeroDetails.DisplayStyle.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiContractsHeroDetails redact(MultiContractsHeroDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MultiContractsHeroDetails.copy$default(value, null, null, Internal.m26823redactElements(value.getContracts(), MultiContractsHeroDetails.ContractInfo.ADAPTER), null, ByteString.EMPTY, 11, null);
            }
        };
    }

    /* compiled from: MultiContractsHeroDetails.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetails$ContractInfo;", "Lcom/squareup/wire/Message;", "", "id", "", "title", "display_value", "graph_relative_length", "", ResourceTypes.COLOR, "Lsearch_coprocessor/v1/CustomColor;", "highlighted", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLsearch_coprocessor/v1/CustomColor;ZLokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDisplay_value", "getGraph_relative_length", "()D", "getColor", "()Lsearch_coprocessor/v1/CustomColor;", "getHighlighted", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContractInfo extends Message {

        @JvmField
        public static final ProtoAdapter<ContractInfo> ADAPTER;

        @WireField(adapter = "search_coprocessor.v1.CustomColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final CustomColor color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String display_value;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "graphRelativeLength", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final double graph_relative_length;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final boolean highlighted;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String title;

        public ContractInfo() {
            this(null, null, null, 0.0d, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public /* synthetic */ ContractInfo(String str, String str2, String str3, double d, CustomColor customColor, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? null : customColor, (i & 32) != 0 ? false : z, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29967newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDisplay_value() {
            return this.display_value;
        }

        public final double getGraph_relative_length() {
            return this.graph_relative_length;
        }

        public final CustomColor getColor() {
            return this.color;
        }

        public final boolean getHighlighted() {
            return this.highlighted;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContractInfo(String id, String title, String display_value, double d, CustomColor customColor, boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(display_value, "display_value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.title = title;
            this.display_value = display_value;
            this.graph_relative_length = d;
            this.color = customColor;
            this.highlighted = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29967newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ContractInfo)) {
                return false;
            }
            ContractInfo contractInfo = (ContractInfo) other;
            return Intrinsics.areEqual(unknownFields(), contractInfo.unknownFields()) && Intrinsics.areEqual(this.id, contractInfo.id) && Intrinsics.areEqual(this.title, contractInfo.title) && Intrinsics.areEqual(this.display_value, contractInfo.display_value) && this.graph_relative_length == contractInfo.graph_relative_length && Intrinsics.areEqual(this.color, contractInfo.color) && this.highlighted == contractInfo.highlighted;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.display_value.hashCode()) * 37) + Double.hashCode(this.graph_relative_length)) * 37;
            CustomColor customColor = this.color;
            int iHashCode2 = ((iHashCode + (customColor != null ? customColor.hashCode() : 0)) * 37) + Boolean.hashCode(this.highlighted);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("display_value=" + Internal.sanitize(this.display_value));
            arrayList.add("graph_relative_length=" + this.graph_relative_length);
            CustomColor customColor = this.color;
            if (customColor != null) {
                arrayList.add("color=" + customColor);
            }
            arrayList.add("highlighted=" + this.highlighted);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ContractInfo{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ContractInfo copy$default(ContractInfo contractInfo, String str, String str2, String str3, double d, CustomColor customColor, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contractInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = contractInfo.title;
            }
            if ((i & 4) != 0) {
                str3 = contractInfo.display_value;
            }
            if ((i & 8) != 0) {
                d = contractInfo.graph_relative_length;
            }
            if ((i & 16) != 0) {
                customColor = contractInfo.color;
            }
            if ((i & 32) != 0) {
                z = contractInfo.highlighted;
            }
            if ((i & 64) != 0) {
                byteString = contractInfo.unknownFields();
            }
            ByteString byteString2 = byteString;
            CustomColor customColor2 = customColor;
            double d2 = d;
            String str4 = str3;
            return contractInfo.copy(str, str2, str4, d2, customColor2, z, byteString2);
        }

        public final ContractInfo copy(String id, String title, String display_value, double graph_relative_length, CustomColor color, boolean highlighted, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(display_value, "display_value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ContractInfo(id, title, display_value, graph_relative_length, color, highlighted, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractInfo.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ContractInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.MultiContractsHeroDetails$ContractInfo$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiContractsHeroDetails.ContractInfo value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_value(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisplay_value());
                    }
                    if (!Double.valueOf(value.getGraph_relative_length()).equals(Double.valueOf(0.0d))) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getGraph_relative_length()));
                    }
                    if (value.getColor() != null) {
                        size += CustomColor.ADAPTER.encodedSizeWithTag(5, value.getColor());
                    }
                    return value.getHighlighted() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getHighlighted())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MultiContractsHeroDetails.ContractInfo value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_value(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisplay_value());
                    }
                    if (!Double.valueOf(value.getGraph_relative_length()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getGraph_relative_length()));
                    }
                    if (value.getColor() != null) {
                        CustomColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getColor());
                    }
                    if (value.getHighlighted()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHighlighted()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiContractsHeroDetails.ContractInfo value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getHighlighted()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHighlighted()));
                    }
                    if (value.getColor() != null) {
                        CustomColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getColor());
                    }
                    if (!Double.valueOf(value.getGraph_relative_length()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getGraph_relative_length()));
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_value(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisplay_value());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiContractsHeroDetails.ContractInfo redact(MultiContractsHeroDetails.ContractInfo value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CustomColor color = value.getColor();
                    return MultiContractsHeroDetails.ContractInfo.copy$default(value, null, null, null, 0.0d, color != null ? CustomColor.ADAPTER.redact(color) : null, false, ByteString.EMPTY, 47, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiContractsHeroDetails.ContractInfo decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    CustomColor customColorDecode = null;
                    double dDoubleValue = 0.0d;
                    boolean zBooleanValue = false;
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
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
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 5:
                                    customColorDecode = CustomColor.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new MultiContractsHeroDetails.ContractInfo(strDecode, strDecode2, strDecode3, dDoubleValue, customColorDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultiContractsHeroDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DISPLAY_STYLE_UNSPECIFIED", "BREAKDOWN_BAR", "DISTRIBUTION_CHART", "STACKED_BARS", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisplayStyle implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayStyle[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DisplayStyle> ADAPTER;
        public static final DisplayStyle BREAKDOWN_BAR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DisplayStyle DISPLAY_STYLE_UNSPECIFIED;
        public static final DisplayStyle DISTRIBUTION_CHART;
        public static final DisplayStyle STACKED_BARS;
        private final int value;

        private static final /* synthetic */ DisplayStyle[] $values() {
            return new DisplayStyle[]{DISPLAY_STYLE_UNSPECIFIED, BREAKDOWN_BAR, DISTRIBUTION_CHART, STACKED_BARS};
        }

        @JvmStatic
        public static final DisplayStyle fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DisplayStyle> getEntries() {
            return $ENTRIES;
        }

        private DisplayStyle(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DisplayStyle displayStyle = new DisplayStyle("DISPLAY_STYLE_UNSPECIFIED", 0, 0);
            DISPLAY_STYLE_UNSPECIFIED = displayStyle;
            BREAKDOWN_BAR = new DisplayStyle("BREAKDOWN_BAR", 1, 1);
            DISTRIBUTION_CHART = new DisplayStyle("DISTRIBUTION_CHART", 2, 2);
            STACKED_BARS = new DisplayStyle("STACKED_BARS", 3, 3);
            DisplayStyle[] displayStyleArr$values = $values();
            $VALUES = displayStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(displayStyleArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisplayStyle.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DisplayStyle>(orCreateKotlinClass, syntax, displayStyle) { // from class: search_coprocessor.v1.MultiContractsHeroDetails$DisplayStyle$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MultiContractsHeroDetails.DisplayStyle fromValue(int value) {
                    return MultiContractsHeroDetails.DisplayStyle.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MultiContractsHeroDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "fromValue", "value", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DisplayStyle fromValue(int value) {
                if (value == 0) {
                    return DisplayStyle.DISPLAY_STYLE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DisplayStyle.BREAKDOWN_BAR;
                }
                if (value == 2) {
                    return DisplayStyle.DISTRIBUTION_CHART;
                }
                if (value != 3) {
                    return null;
                }
                return DisplayStyle.STACKED_BARS;
            }
        }

        public static DisplayStyle valueOf(String str) {
            return (DisplayStyle) Enum.valueOf(DisplayStyle.class, str);
        }

        public static DisplayStyle[] values() {
            return (DisplayStyle[]) $VALUES.clone();
        }
    }
}
