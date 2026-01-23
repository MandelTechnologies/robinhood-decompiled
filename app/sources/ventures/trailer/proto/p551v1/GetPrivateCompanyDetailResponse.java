package ventures.trailer.proto.p551v1;

import com.plaid.internal.EnumC7081g;
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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: GetPrivateCompanyDetailResponse.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JT\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lventures/trailer/proto/v1/GetPrivateCompanyDetailResponse;", "Lcom/squareup/wire/Message;", "", "id", "", "parent_id", "valuation_chart_section", "Lventures/trailer/proto/v1/PrivateCompanyValuationChartSection;", "about_section", "Lventures/trailer/proto/v1/PrivateCompanyAboutSection;", "funding_section", "Lventures/trailer/proto/v1/PrivateCompanyFundingSection;", "disclosure_component", "Lrh_server_driven_ui/v1/UIComponent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lventures/trailer/proto/v1/PrivateCompanyValuationChartSection;Lventures/trailer/proto/v1/PrivateCompanyAboutSection;Lventures/trailer/proto/v1/PrivateCompanyFundingSection;Lrh_server_driven_ui/v1/UIComponent;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getParent_id", "getValuation_chart_section", "()Lventures/trailer/proto/v1/PrivateCompanyValuationChartSection;", "getAbout_section", "()Lventures/trailer/proto/v1/PrivateCompanyAboutSection;", "getFunding_section", "()Lventures/trailer/proto/v1/PrivateCompanyFundingSection;", "getDisclosure_component", "()Lrh_server_driven_ui/v1/UIComponent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GetPrivateCompanyDetailResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPrivateCompanyDetailResponse> ADAPTER;

    @WireField(adapter = "ventures.trailer.proto.v1.PrivateCompanyAboutSection#ADAPTER", jsonName = "aboutSection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PrivateCompanyAboutSection about_section;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "disclosureComponent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final UIComponent disclosure_component;

    @WireField(adapter = "ventures.trailer.proto.v1.PrivateCompanyFundingSection#ADAPTER", jsonName = "fundingSection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final PrivateCompanyFundingSection funding_section;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String parent_id;

    @WireField(adapter = "ventures.trailer.proto.v1.PrivateCompanyValuationChartSection#ADAPTER", jsonName = "valuationChartSection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PrivateCompanyValuationChartSection valuation_chart_section;

    public GetPrivateCompanyDetailResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetPrivateCompanyDetailResponse(String str, String str2, PrivateCompanyValuationChartSection privateCompanyValuationChartSection, PrivateCompanyAboutSection privateCompanyAboutSection, PrivateCompanyFundingSection privateCompanyFundingSection, UIComponent uIComponent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : privateCompanyValuationChartSection, (i & 8) != 0 ? null : privateCompanyAboutSection, (i & 16) != 0 ? null : privateCompanyFundingSection, (i & 32) != 0 ? null : uIComponent, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30036newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final PrivateCompanyValuationChartSection getValuation_chart_section() {
        return this.valuation_chart_section;
    }

    public final PrivateCompanyAboutSection getAbout_section() {
        return this.about_section;
    }

    public final PrivateCompanyFundingSection getFunding_section() {
        return this.funding_section;
    }

    public final UIComponent getDisclosure_component() {
        return this.disclosure_component;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPrivateCompanyDetailResponse(String id, String parent_id, PrivateCompanyValuationChartSection privateCompanyValuationChartSection, PrivateCompanyAboutSection privateCompanyAboutSection, PrivateCompanyFundingSection privateCompanyFundingSection, UIComponent uIComponent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.parent_id = parent_id;
        this.valuation_chart_section = privateCompanyValuationChartSection;
        this.about_section = privateCompanyAboutSection;
        this.funding_section = privateCompanyFundingSection;
        this.disclosure_component = uIComponent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30036newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPrivateCompanyDetailResponse)) {
            return false;
        }
        GetPrivateCompanyDetailResponse getPrivateCompanyDetailResponse = (GetPrivateCompanyDetailResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPrivateCompanyDetailResponse.unknownFields()) && Intrinsics.areEqual(this.id, getPrivateCompanyDetailResponse.id) && Intrinsics.areEqual(this.parent_id, getPrivateCompanyDetailResponse.parent_id) && Intrinsics.areEqual(this.valuation_chart_section, getPrivateCompanyDetailResponse.valuation_chart_section) && Intrinsics.areEqual(this.about_section, getPrivateCompanyDetailResponse.about_section) && Intrinsics.areEqual(this.funding_section, getPrivateCompanyDetailResponse.funding_section) && Intrinsics.areEqual(this.disclosure_component, getPrivateCompanyDetailResponse.disclosure_component);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.parent_id.hashCode()) * 37;
        PrivateCompanyValuationChartSection privateCompanyValuationChartSection = this.valuation_chart_section;
        int iHashCode2 = (iHashCode + (privateCompanyValuationChartSection != null ? privateCompanyValuationChartSection.hashCode() : 0)) * 37;
        PrivateCompanyAboutSection privateCompanyAboutSection = this.about_section;
        int iHashCode3 = (iHashCode2 + (privateCompanyAboutSection != null ? privateCompanyAboutSection.hashCode() : 0)) * 37;
        PrivateCompanyFundingSection privateCompanyFundingSection = this.funding_section;
        int iHashCode4 = (iHashCode3 + (privateCompanyFundingSection != null ? privateCompanyFundingSection.hashCode() : 0)) * 37;
        UIComponent uIComponent = this.disclosure_component;
        int iHashCode5 = iHashCode4 + (uIComponent != null ? uIComponent.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("parent_id=" + Internal.sanitize(this.parent_id));
        PrivateCompanyValuationChartSection privateCompanyValuationChartSection = this.valuation_chart_section;
        if (privateCompanyValuationChartSection != null) {
            arrayList.add("valuation_chart_section=" + privateCompanyValuationChartSection);
        }
        PrivateCompanyAboutSection privateCompanyAboutSection = this.about_section;
        if (privateCompanyAboutSection != null) {
            arrayList.add("about_section=" + privateCompanyAboutSection);
        }
        PrivateCompanyFundingSection privateCompanyFundingSection = this.funding_section;
        if (privateCompanyFundingSection != null) {
            arrayList.add("funding_section=" + privateCompanyFundingSection);
        }
        UIComponent uIComponent = this.disclosure_component;
        if (uIComponent != null) {
            arrayList.add("disclosure_component=" + uIComponent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPrivateCompanyDetailResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPrivateCompanyDetailResponse copy$default(GetPrivateCompanyDetailResponse getPrivateCompanyDetailResponse, String str, String str2, PrivateCompanyValuationChartSection privateCompanyValuationChartSection, PrivateCompanyAboutSection privateCompanyAboutSection, PrivateCompanyFundingSection privateCompanyFundingSection, UIComponent uIComponent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPrivateCompanyDetailResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = getPrivateCompanyDetailResponse.parent_id;
        }
        if ((i & 4) != 0) {
            privateCompanyValuationChartSection = getPrivateCompanyDetailResponse.valuation_chart_section;
        }
        if ((i & 8) != 0) {
            privateCompanyAboutSection = getPrivateCompanyDetailResponse.about_section;
        }
        if ((i & 16) != 0) {
            privateCompanyFundingSection = getPrivateCompanyDetailResponse.funding_section;
        }
        if ((i & 32) != 0) {
            uIComponent = getPrivateCompanyDetailResponse.disclosure_component;
        }
        if ((i & 64) != 0) {
            byteString = getPrivateCompanyDetailResponse.unknownFields();
        }
        UIComponent uIComponent2 = uIComponent;
        ByteString byteString2 = byteString;
        PrivateCompanyFundingSection privateCompanyFundingSection2 = privateCompanyFundingSection;
        PrivateCompanyValuationChartSection privateCompanyValuationChartSection2 = privateCompanyValuationChartSection;
        return getPrivateCompanyDetailResponse.copy(str, str2, privateCompanyValuationChartSection2, privateCompanyAboutSection, privateCompanyFundingSection2, uIComponent2, byteString2);
    }

    public final GetPrivateCompanyDetailResponse copy(String id, String parent_id, PrivateCompanyValuationChartSection valuation_chart_section, PrivateCompanyAboutSection about_section, PrivateCompanyFundingSection funding_section, UIComponent disclosure_component, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPrivateCompanyDetailResponse(id, parent_id, valuation_chart_section, about_section, funding_section, disclosure_component, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPrivateCompanyDetailResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPrivateCompanyDetailResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.GetPrivateCompanyDetailResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPrivateCompanyDetailResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getParent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getParent_id());
                }
                if (value.getValuation_chart_section() != null) {
                    size += PrivateCompanyValuationChartSection.ADAPTER.encodedSizeWithTag(3, value.getValuation_chart_section());
                }
                if (value.getAbout_section() != null) {
                    size += PrivateCompanyAboutSection.ADAPTER.encodedSizeWithTag(4, value.getAbout_section());
                }
                if (value.getFunding_section() != null) {
                    size += PrivateCompanyFundingSection.ADAPTER.encodedSizeWithTag(5, value.getFunding_section());
                }
                return value.getDisclosure_component() != null ? size + UIComponent.ADAPTER.encodedSizeWithTag(6, value.getDisclosure_component()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPrivateCompanyDetailResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getParent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getParent_id());
                }
                if (value.getValuation_chart_section() != null) {
                    PrivateCompanyValuationChartSection.ADAPTER.encodeWithTag(writer, 3, (int) value.getValuation_chart_section());
                }
                if (value.getAbout_section() != null) {
                    PrivateCompanyAboutSection.ADAPTER.encodeWithTag(writer, 4, (int) value.getAbout_section());
                }
                if (value.getFunding_section() != null) {
                    PrivateCompanyFundingSection.ADAPTER.encodeWithTag(writer, 5, (int) value.getFunding_section());
                }
                if (value.getDisclosure_component() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 6, (int) value.getDisclosure_component());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPrivateCompanyDetailResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDisclosure_component() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 6, (int) value.getDisclosure_component());
                }
                if (value.getFunding_section() != null) {
                    PrivateCompanyFundingSection.ADAPTER.encodeWithTag(writer, 5, (int) value.getFunding_section());
                }
                if (value.getAbout_section() != null) {
                    PrivateCompanyAboutSection.ADAPTER.encodeWithTag(writer, 4, (int) value.getAbout_section());
                }
                if (value.getValuation_chart_section() != null) {
                    PrivateCompanyValuationChartSection.ADAPTER.encodeWithTag(writer, 3, (int) value.getValuation_chart_section());
                }
                if (!Intrinsics.areEqual(value.getParent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getParent_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPrivateCompanyDetailResponse redact(GetPrivateCompanyDetailResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PrivateCompanyValuationChartSection valuation_chart_section = value.getValuation_chart_section();
                PrivateCompanyValuationChartSection privateCompanyValuationChartSectionRedact = valuation_chart_section != null ? PrivateCompanyValuationChartSection.ADAPTER.redact(valuation_chart_section) : null;
                PrivateCompanyAboutSection about_section = value.getAbout_section();
                PrivateCompanyAboutSection privateCompanyAboutSectionRedact = about_section != null ? PrivateCompanyAboutSection.ADAPTER.redact(about_section) : null;
                PrivateCompanyFundingSection funding_section = value.getFunding_section();
                PrivateCompanyFundingSection privateCompanyFundingSectionRedact = funding_section != null ? PrivateCompanyFundingSection.ADAPTER.redact(funding_section) : null;
                UIComponent disclosure_component = value.getDisclosure_component();
                return GetPrivateCompanyDetailResponse.copy$default(value, null, null, privateCompanyValuationChartSectionRedact, privateCompanyAboutSectionRedact, privateCompanyFundingSectionRedact, disclosure_component != null ? UIComponent.ADAPTER.redact(disclosure_component) : null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPrivateCompanyDetailResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                PrivateCompanyValuationChartSection privateCompanyValuationChartSectionDecode = null;
                PrivateCompanyAboutSection privateCompanyAboutSectionDecode = null;
                PrivateCompanyFundingSection privateCompanyFundingSectionDecode = null;
                UIComponent uIComponentDecode = null;
                String strDecode2 = "";
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
                                privateCompanyValuationChartSectionDecode = PrivateCompanyValuationChartSection.ADAPTER.decode(reader);
                                break;
                            case 4:
                                privateCompanyAboutSectionDecode = PrivateCompanyAboutSection.ADAPTER.decode(reader);
                                break;
                            case 5:
                                privateCompanyFundingSectionDecode = PrivateCompanyFundingSection.ADAPTER.decode(reader);
                                break;
                            case 6:
                                uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetPrivateCompanyDetailResponse(strDecode, strDecode2, privateCompanyValuationChartSectionDecode, privateCompanyAboutSectionDecode, privateCompanyFundingSectionDecode, uIComponentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
