package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: StreamSageStartApplicationContentResponse.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u0090\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u00062"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "description_markdown", "options", "", "Lgold_flow/proto/v1/GoldSageMortgageOption;", "cta_disclosure", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "agreement_type", "cta_icon", "Lrh_server_driven_ui/v1/Icon;", "selected_mortgage_type", "Lgold_flow/proto/v1/GoldSageMortgageType;", "web_sidebar_content", "Lgold_flow/proto/v1/WebSidebarContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/Cta;Ljava/util/List;Lrh_server_driven_ui/v1/Icon;Lgold_flow/proto/v1/GoldSageMortgageType;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getCta_disclosure", "getCta", "()Lgold_flow/proto/v1/Cta;", "getSecondary_cta", "getCta_icon", "()Lrh_server_driven_ui/v1/Icon;", "getSelected_mortgage_type", "()Lgold_flow/proto/v1/GoldSageMortgageType;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContent;", "getOptions", "()Ljava/util/List;", "getAgreement_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamSageStartApplicationContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSageStartApplicationContentResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementType", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> agreement_type;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 4, tag = 5)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosure", schemaIndex = 3, tag = 4)
    private final String cta_disclosure;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "ctaIcon", schemaIndex = 7, tag = 8)
    private final Icon cta_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", schemaIndex = 1, tag = 2)
    private final String description_markdown;

    @WireField(adapter = "gold_flow.proto.v1.GoldSageMortgageOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<GoldSageMortgageOption> options;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 5, tag = 6)
    private final Cta secondary_cta;

    @WireField(adapter = "gold_flow.proto.v1.GoldSageMortgageType#ADAPTER", jsonName = "selectedMortgageType", schemaIndex = 8, tag = 9)
    private final GoldSageMortgageType selected_mortgage_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "gold_flow.proto.v1.WebSidebarContent#ADAPTER", jsonName = "webSidebarContent", schemaIndex = 9, tag = 10)
    private final WebSidebarContent web_sidebar_content;

    public StreamSageStartApplicationContentResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28206newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public /* synthetic */ StreamSageStartApplicationContentResponse(String str, String str2, List list, String str3, Cta cta, Cta cta2, List list2, Icon icon, GoldSageMortgageType goldSageMortgageType, WebSidebarContent webSidebarContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : cta, (i & 32) != 0 ? null : cta2, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : icon, (i & 256) != 0 ? null : goldSageMortgageType, (i & 512) != 0 ? null : webSidebarContent, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCta_disclosure() {
        return this.cta_disclosure;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Cta getSecondary_cta() {
        return this.secondary_cta;
    }

    public final Icon getCta_icon() {
        return this.cta_icon;
    }

    public final GoldSageMortgageType getSelected_mortgage_type() {
        return this.selected_mortgage_type;
    }

    public final WebSidebarContent getWeb_sidebar_content() {
        return this.web_sidebar_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSageStartApplicationContentResponse(String str, String str2, List<GoldSageMortgageOption> options, String str3, Cta cta, Cta cta2, List<String> agreement_type, Icon icon, GoldSageMortgageType goldSageMortgageType, WebSidebarContent webSidebarContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.description_markdown = str2;
        this.cta_disclosure = str3;
        this.cta = cta;
        this.secondary_cta = cta2;
        this.cta_icon = icon;
        this.selected_mortgage_type = goldSageMortgageType;
        this.web_sidebar_content = webSidebarContent;
        this.options = Internal.immutableCopyOf("options", options);
        this.agreement_type = Internal.immutableCopyOf("agreement_type", agreement_type);
    }

    public final List<GoldSageMortgageOption> getOptions() {
        return this.options;
    }

    public final List<String> getAgreement_type() {
        return this.agreement_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28206newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSageStartApplicationContentResponse)) {
            return false;
        }
        StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse = (StreamSageStartApplicationContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSageStartApplicationContentResponse.unknownFields()) && Intrinsics.areEqual(this.title, streamSageStartApplicationContentResponse.title) && Intrinsics.areEqual(this.description_markdown, streamSageStartApplicationContentResponse.description_markdown) && Intrinsics.areEqual(this.options, streamSageStartApplicationContentResponse.options) && Intrinsics.areEqual(this.cta_disclosure, streamSageStartApplicationContentResponse.cta_disclosure) && Intrinsics.areEqual(this.cta, streamSageStartApplicationContentResponse.cta) && Intrinsics.areEqual(this.secondary_cta, streamSageStartApplicationContentResponse.secondary_cta) && Intrinsics.areEqual(this.agreement_type, streamSageStartApplicationContentResponse.agreement_type) && this.cta_icon == streamSageStartApplicationContentResponse.cta_icon && this.selected_mortgage_type == streamSageStartApplicationContentResponse.selected_mortgage_type && Intrinsics.areEqual(this.web_sidebar_content, streamSageStartApplicationContentResponse.web_sidebar_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description_markdown;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.options.hashCode()) * 37;
        String str3 = this.cta_disclosure;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode5 = (iHashCode4 + (cta != null ? cta.hashCode() : 0)) * 37;
        Cta cta2 = this.secondary_cta;
        int iHashCode6 = (((iHashCode5 + (cta2 != null ? cta2.hashCode() : 0)) * 37) + this.agreement_type.hashCode()) * 37;
        Icon icon = this.cta_icon;
        int iHashCode7 = (iHashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
        GoldSageMortgageType goldSageMortgageType = this.selected_mortgage_type;
        int iHashCode8 = (iHashCode7 + (goldSageMortgageType != null ? goldSageMortgageType.hashCode() : 0)) * 37;
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        int iHashCode9 = iHashCode8 + (webSidebarContent != null ? webSidebarContent.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.description_markdown;
        if (str2 != null) {
            arrayList.add("description_markdown=" + Internal.sanitize(str2));
        }
        if (!this.options.isEmpty()) {
            arrayList.add("options=" + this.options);
        }
        String str3 = this.cta_disclosure;
        if (str3 != null) {
            arrayList.add("cta_disclosure=" + Internal.sanitize(str3));
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Cta cta2 = this.secondary_cta;
        if (cta2 != null) {
            arrayList.add("secondary_cta=" + cta2);
        }
        if (!this.agreement_type.isEmpty()) {
            arrayList.add("agreement_type=" + Internal.sanitize(this.agreement_type));
        }
        Icon icon = this.cta_icon;
        if (icon != null) {
            arrayList.add("cta_icon=" + icon);
        }
        GoldSageMortgageType goldSageMortgageType = this.selected_mortgage_type;
        if (goldSageMortgageType != null) {
            arrayList.add("selected_mortgage_type=" + goldSageMortgageType);
        }
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        if (webSidebarContent != null) {
            arrayList.add("web_sidebar_content=" + webSidebarContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSageStartApplicationContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSageStartApplicationContentResponse copy$default(StreamSageStartApplicationContentResponse streamSageStartApplicationContentResponse, String str, String str2, List list, String str3, Cta cta, Cta cta2, List list2, Icon icon, GoldSageMortgageType goldSageMortgageType, WebSidebarContent webSidebarContent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamSageStartApplicationContentResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = streamSageStartApplicationContentResponse.description_markdown;
        }
        if ((i & 4) != 0) {
            list = streamSageStartApplicationContentResponse.options;
        }
        if ((i & 8) != 0) {
            str3 = streamSageStartApplicationContentResponse.cta_disclosure;
        }
        if ((i & 16) != 0) {
            cta = streamSageStartApplicationContentResponse.cta;
        }
        if ((i & 32) != 0) {
            cta2 = streamSageStartApplicationContentResponse.secondary_cta;
        }
        if ((i & 64) != 0) {
            list2 = streamSageStartApplicationContentResponse.agreement_type;
        }
        if ((i & 128) != 0) {
            icon = streamSageStartApplicationContentResponse.cta_icon;
        }
        if ((i & 256) != 0) {
            goldSageMortgageType = streamSageStartApplicationContentResponse.selected_mortgage_type;
        }
        if ((i & 512) != 0) {
            webSidebarContent = streamSageStartApplicationContentResponse.web_sidebar_content;
        }
        if ((i & 1024) != 0) {
            byteString = streamSageStartApplicationContentResponse.unknownFields();
        }
        WebSidebarContent webSidebarContent2 = webSidebarContent;
        ByteString byteString2 = byteString;
        Icon icon2 = icon;
        GoldSageMortgageType goldSageMortgageType2 = goldSageMortgageType;
        Cta cta3 = cta2;
        List list3 = list2;
        Cta cta4 = cta;
        List list4 = list;
        return streamSageStartApplicationContentResponse.copy(str, str2, list4, str3, cta4, cta3, list3, icon2, goldSageMortgageType2, webSidebarContent2, byteString2);
    }

    public final StreamSageStartApplicationContentResponse copy(String title, String description_markdown, List<GoldSageMortgageOption> options, String cta_disclosure, Cta cta, Cta secondary_cta, List<String> agreement_type, Icon cta_icon, GoldSageMortgageType selected_mortgage_type, WebSidebarContent web_sidebar_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSageStartApplicationContentResponse(title, description_markdown, options, cta_disclosure, cta, secondary_cta, agreement_type, cta_icon, selected_mortgage_type, web_sidebar_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSageStartApplicationContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSageStartApplicationContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamSageStartApplicationContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSageStartApplicationContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + protoAdapter.encodedSizeWithTag(2, value.getDescription_markdown()) + GoldSageMortgageOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOptions()) + protoAdapter.encodedSizeWithTag(4, value.getCta_disclosure());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, value.getCta()) + protoAdapter2.encodedSizeWithTag(6, value.getSecondary_cta()) + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getAgreement_type()) + Icon.ADAPTER.encodedSizeWithTag(8, value.getCta_icon()) + GoldSageMortgageType.ADAPTER.encodedSizeWithTag(9, value.getSelected_mortgage_type()) + WebSidebarContent.ADAPTER.encodedSizeWithTag(10, value.getWeb_sidebar_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSageStartApplicationContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                GoldSageMortgageOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_disclosure());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getCta());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_cta());
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getAgreement_type());
                Icon.ADAPTER.encodeWithTag(writer, 8, (int) value.getCta_icon());
                GoldSageMortgageType.ADAPTER.encodeWithTag(writer, 9, (int) value.getSelected_mortgage_type());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 10, (int) value.getWeb_sidebar_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSageStartApplicationContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 10, (int) value.getWeb_sidebar_content());
                GoldSageMortgageType.ADAPTER.encodeWithTag(writer, 9, (int) value.getSelected_mortgage_type());
                Icon.ADAPTER.encodeWithTag(writer, 8, (int) value.getCta_icon());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getAgreement_type());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_cta());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getCta());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_disclosure());
                GoldSageMortgageOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamSageStartApplicationContentResponse decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                Cta ctaDecode = null;
                Cta ctaDecode2 = null;
                Icon iconDecode = null;
                GoldSageMortgageType goldSageMortgageTypeDecode = null;
                WebSidebarContent webSidebarContentDecode = null;
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
                                str = strDecode;
                                str2 = strDecode2;
                                str3 = strDecode3;
                                arrayList.add(GoldSageMortgageOption.ADAPTER.decode(reader));
                                strDecode3 = str3;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 6:
                                ctaDecode2 = Cta.ADAPTER.decode(reader);
                                break;
                            case 7:
                                str = strDecode;
                                str2 = strDecode2;
                                str3 = strDecode3;
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                strDecode3 = str3;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 8:
                                str = strDecode;
                                str2 = strDecode2;
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str3 = strDecode3;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                            case 9:
                                try {
                                    goldSageMortgageTypeDecode = GoldSageMortgageType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    str = strDecode;
                                    str2 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 10:
                                webSidebarContentDecode = WebSidebarContent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode;
                                str2 = strDecode2;
                                str3 = strDecode3;
                                strDecode3 = str3;
                                strDecode = str;
                                strDecode2 = str2;
                                break;
                        }
                    } else {
                        return new StreamSageStartApplicationContentResponse(strDecode, strDecode2, arrayList, strDecode3, ctaDecode, ctaDecode2, arrayList2, iconDecode, goldSageMortgageTypeDecode, webSidebarContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSageStartApplicationContentResponse redact(StreamSageStartApplicationContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getOptions(), GoldSageMortgageOption.ADAPTER);
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                Cta secondary_cta = value.getSecondary_cta();
                Cta ctaRedact2 = secondary_cta != null ? Cta.ADAPTER.redact(secondary_cta) : null;
                WebSidebarContent web_sidebar_content = value.getWeb_sidebar_content();
                return StreamSageStartApplicationContentResponse.copy$default(value, null, null, listM26823redactElements, null, ctaRedact, ctaRedact2, null, null, null, web_sidebar_content != null ? WebSidebarContent.ADAPTER.redact(web_sidebar_content) : null, ByteString.EMPTY, 459, null);
            }
        };
    }
}
