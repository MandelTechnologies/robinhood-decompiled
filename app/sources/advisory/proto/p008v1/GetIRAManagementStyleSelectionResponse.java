package advisory.proto.p008v1;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: GetIRAManagementStyleSelectionResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016JL\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponse;", "Lcom/squareup/wire/Message;", "", "layout", "Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "title", "", "ctas", "", "Ladvisory/proto/v1/ManagementStyleSelectionCta;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "terms_sheet", "Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionLayout;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;Lokio/ByteString;)V", "getLayout", "()Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "getTitle", "()Ljava/lang/String;", "getDisclosure", "getTerms_sheet", "()Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;", "getCtas", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetIRAManagementStyleSelectionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetIRAManagementStyleSelectionResponse> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.ManagementStyleSelectionCta#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ManagementStyleSelectionCta> ctas;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String disclosure;

    @WireField(adapter = "advisory.proto.v1.ManagementStyleSelectionLayout#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ManagementStyleSelectionLayout layout;

    @WireField(adapter = "advisory.proto.v1.StrategiesValuePropsTermsSheet#ADAPTER", jsonName = "termsSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final StrategiesValuePropsTermsSheet terms_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GetIRAManagementStyleSelectionResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetIRAManagementStyleSelectionResponse(ManagementStyleSelectionLayout managementStyleSelectionLayout, String str, List list, String str2, StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : managementStyleSelectionLayout, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : strategiesValuePropsTermsSheet, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4455newBuilder();
    }

    public final ManagementStyleSelectionLayout getLayout() {
        return this.layout;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final StrategiesValuePropsTermsSheet getTerms_sheet() {
        return this.terms_sheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIRAManagementStyleSelectionResponse(ManagementStyleSelectionLayout managementStyleSelectionLayout, String title, List<ManagementStyleSelectionCta> ctas, String disclosure, StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctas, "ctas");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.layout = managementStyleSelectionLayout;
        this.title = title;
        this.disclosure = disclosure;
        this.terms_sheet = strategiesValuePropsTermsSheet;
        this.ctas = Internal.immutableCopyOf("ctas", ctas);
    }

    public final List<ManagementStyleSelectionCta> getCtas() {
        return this.ctas;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4455newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetIRAManagementStyleSelectionResponse)) {
            return false;
        }
        GetIRAManagementStyleSelectionResponse getIRAManagementStyleSelectionResponse = (GetIRAManagementStyleSelectionResponse) other;
        return Intrinsics.areEqual(unknownFields(), getIRAManagementStyleSelectionResponse.unknownFields()) && Intrinsics.areEqual(this.layout, getIRAManagementStyleSelectionResponse.layout) && Intrinsics.areEqual(this.title, getIRAManagementStyleSelectionResponse.title) && Intrinsics.areEqual(this.ctas, getIRAManagementStyleSelectionResponse.ctas) && Intrinsics.areEqual(this.disclosure, getIRAManagementStyleSelectionResponse.disclosure) && Intrinsics.areEqual(this.terms_sheet, getIRAManagementStyleSelectionResponse.terms_sheet);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ManagementStyleSelectionLayout managementStyleSelectionLayout = this.layout;
        int iHashCode2 = (((((((iHashCode + (managementStyleSelectionLayout != null ? managementStyleSelectionLayout.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.ctas.hashCode()) * 37) + this.disclosure.hashCode()) * 37;
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet = this.terms_sheet;
        int iHashCode3 = iHashCode2 + (strategiesValuePropsTermsSheet != null ? strategiesValuePropsTermsSheet.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ManagementStyleSelectionLayout managementStyleSelectionLayout = this.layout;
        if (managementStyleSelectionLayout != null) {
            arrayList.add("layout=" + managementStyleSelectionLayout);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.ctas.isEmpty()) {
            arrayList.add("ctas=" + this.ctas);
        }
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet = this.terms_sheet;
        if (strategiesValuePropsTermsSheet != null) {
            arrayList.add("terms_sheet=" + strategiesValuePropsTermsSheet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetIRAManagementStyleSelectionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetIRAManagementStyleSelectionResponse copy$default(GetIRAManagementStyleSelectionResponse getIRAManagementStyleSelectionResponse, ManagementStyleSelectionLayout managementStyleSelectionLayout, String str, List list, String str2, StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            managementStyleSelectionLayout = getIRAManagementStyleSelectionResponse.layout;
        }
        if ((i & 2) != 0) {
            str = getIRAManagementStyleSelectionResponse.title;
        }
        if ((i & 4) != 0) {
            list = getIRAManagementStyleSelectionResponse.ctas;
        }
        if ((i & 8) != 0) {
            str2 = getIRAManagementStyleSelectionResponse.disclosure;
        }
        if ((i & 16) != 0) {
            strategiesValuePropsTermsSheet = getIRAManagementStyleSelectionResponse.terms_sheet;
        }
        if ((i & 32) != 0) {
            byteString = getIRAManagementStyleSelectionResponse.unknownFields();
        }
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet2 = strategiesValuePropsTermsSheet;
        ByteString byteString2 = byteString;
        return getIRAManagementStyleSelectionResponse.copy(managementStyleSelectionLayout, str, list, str2, strategiesValuePropsTermsSheet2, byteString2);
    }

    public final GetIRAManagementStyleSelectionResponse copy(ManagementStyleSelectionLayout layout, String title, List<ManagementStyleSelectionCta> ctas, String disclosure, StrategiesValuePropsTermsSheet terms_sheet, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctas, "ctas");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetIRAManagementStyleSelectionResponse(layout, title, ctas, disclosure, terms_sheet, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetIRAManagementStyleSelectionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetIRAManagementStyleSelectionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetIRAManagementStyleSelectionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetIRAManagementStyleSelectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLayout() != null) {
                    size += ManagementStyleSelectionLayout.ADAPTER.encodedSizeWithTag(1, value.getLayout());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                int iEncodedSizeWithTag = size + ManagementStyleSelectionCta.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getCtas());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclosure());
                }
                return value.getTerms_sheet() != null ? iEncodedSizeWithTag + StrategiesValuePropsTermsSheet.ADAPTER.encodedSizeWithTag(5, value.getTerms_sheet()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetIRAManagementStyleSelectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLayout() != null) {
                    ManagementStyleSelectionLayout.ADAPTER.encodeWithTag(writer, 1, (int) value.getLayout());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ManagementStyleSelectionCta.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCtas());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure());
                }
                if (value.getTerms_sheet() != null) {
                    StrategiesValuePropsTermsSheet.ADAPTER.encodeWithTag(writer, 5, (int) value.getTerms_sheet());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetIRAManagementStyleSelectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTerms_sheet() != null) {
                    StrategiesValuePropsTermsSheet.ADAPTER.encodeWithTag(writer, 5, (int) value.getTerms_sheet());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure());
                }
                ManagementStyleSelectionCta.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCtas());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (value.getLayout() != null) {
                    ManagementStyleSelectionLayout.ADAPTER.encodeWithTag(writer, 1, (int) value.getLayout());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetIRAManagementStyleSelectionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ManagementStyleSelectionLayout managementStyleSelectionLayoutDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheetDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetIRAManagementStyleSelectionResponse(managementStyleSelectionLayoutDecode, strDecode, arrayList, strDecode2, strategiesValuePropsTermsSheetDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        managementStyleSelectionLayoutDecode = ManagementStyleSelectionLayout.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ManagementStyleSelectionCta.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strategiesValuePropsTermsSheetDecode = StrategiesValuePropsTermsSheet.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetIRAManagementStyleSelectionResponse redact(GetIRAManagementStyleSelectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementStyleSelectionLayout layout = value.getLayout();
                ManagementStyleSelectionLayout managementStyleSelectionLayoutRedact = layout != null ? ManagementStyleSelectionLayout.ADAPTER.redact(layout) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getCtas(), ManagementStyleSelectionCta.ADAPTER);
                StrategiesValuePropsTermsSheet terms_sheet = value.getTerms_sheet();
                return GetIRAManagementStyleSelectionResponse.copy$default(value, managementStyleSelectionLayoutRedact, null, listM26823redactElements, null, terms_sheet != null ? StrategiesValuePropsTermsSheet.ADAPTER.redact(terms_sheet) : null, ByteString.EMPTY, 10, null);
            }
        };
    }
}
