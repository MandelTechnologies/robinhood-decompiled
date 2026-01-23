package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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
import microgram.p507ui.p508v1.ProgressBar;
import okio.ByteString;

/* compiled from: StreamPlanSelectionContentResponse.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010$\u001a\u00020\u0002H\u0017J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\u0085\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010,R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u0011\u0010\u001dR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006."}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "plans", "", "Lgold_flow/proto/v1/GoldPlanSelectionOption;", "disclosure_markdown", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", "disable_sparkle_button_styling", "", "progress_bar", "Lmicrogram/ui/v1/ProgressBar;", "navigation_bar_title", "is_header_centered", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lmicrogram/ui/v1/ProgressBar;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclosure_markdown", "getCta", "()Lgold_flow/proto/v1/Cta;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBar;", "getNavigation_bar_title", "getPlans", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lmicrogram/ui/v1/ProgressBar;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamPlanSelectionContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamPlanSelectionContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 4, tag = 5)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableSparkleButtonStyling", schemaIndex = 5, tag = 6)
    private final Boolean disable_sparkle_button_styling;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 3, tag = 4)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHeaderCentered", schemaIndex = 8, tag = 9)
    private final Boolean is_header_centered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigationBarTitle", schemaIndex = 7, tag = 8)
    private final String navigation_bar_title;

    @WireField(adapter = "gold_flow.proto.v1.GoldPlanSelectionOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<GoldPlanSelectionOption> plans;

    @WireField(adapter = "microgram.ui.v1.ProgressBar#ADAPTER", jsonName = "progressBar", schemaIndex = 6, tag = 7)
    private final ProgressBar progress_bar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public StreamPlanSelectionContentResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28195newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public /* synthetic */ StreamPlanSelectionContentResponse(String str, String str2, List list, String str3, Cta cta, Boolean bool, ProgressBar progressBar, String str4, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : cta, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : progressBar, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Boolean getDisable_sparkle_button_styling() {
        return this.disable_sparkle_button_styling;
    }

    public final ProgressBar getProgress_bar() {
        return this.progress_bar;
    }

    public final String getNavigation_bar_title() {
        return this.navigation_bar_title;
    }

    /* renamed from: is_header_centered, reason: from getter */
    public final Boolean getIs_header_centered() {
        return this.is_header_centered;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamPlanSelectionContentResponse(String str, String str2, List<GoldPlanSelectionOption> plans, String str3, Cta cta, Boolean bool, ProgressBar progressBar, String str4, Boolean bool2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.subtitle = str2;
        this.disclosure_markdown = str3;
        this.cta = cta;
        this.disable_sparkle_button_styling = bool;
        this.progress_bar = progressBar;
        this.navigation_bar_title = str4;
        this.is_header_centered = bool2;
        this.plans = Internal.immutableCopyOf("plans", plans);
    }

    public final List<GoldPlanSelectionOption> getPlans() {
        return this.plans;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28195newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamPlanSelectionContentResponse)) {
            return false;
        }
        StreamPlanSelectionContentResponse streamPlanSelectionContentResponse = (StreamPlanSelectionContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamPlanSelectionContentResponse.unknownFields()) && Intrinsics.areEqual(this.title, streamPlanSelectionContentResponse.title) && Intrinsics.areEqual(this.subtitle, streamPlanSelectionContentResponse.subtitle) && Intrinsics.areEqual(this.plans, streamPlanSelectionContentResponse.plans) && Intrinsics.areEqual(this.disclosure_markdown, streamPlanSelectionContentResponse.disclosure_markdown) && Intrinsics.areEqual(this.cta, streamPlanSelectionContentResponse.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, streamPlanSelectionContentResponse.disable_sparkle_button_styling) && Intrinsics.areEqual(this.progress_bar, streamPlanSelectionContentResponse.progress_bar) && Intrinsics.areEqual(this.navigation_bar_title, streamPlanSelectionContentResponse.navigation_bar_title) && Intrinsics.areEqual(this.is_header_centered, streamPlanSelectionContentResponse.is_header_centered);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.plans.hashCode()) * 37;
        String str3 = this.disclosure_markdown;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode5 = (iHashCode4 + (cta != null ? cta.hashCode() : 0)) * 37;
        Boolean bool = this.disable_sparkle_button_styling;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        ProgressBar progressBar = this.progress_bar;
        int iHashCode7 = (iHashCode6 + (progressBar != null ? progressBar.hashCode() : 0)) * 37;
        String str4 = this.navigation_bar_title;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_header_centered;
        int iHashCode9 = iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
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
        String str2 = this.subtitle;
        if (str2 != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str2));
        }
        if (!this.plans.isEmpty()) {
            arrayList.add("plans=" + this.plans);
        }
        String str3 = this.disclosure_markdown;
        if (str3 != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str3));
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Boolean bool = this.disable_sparkle_button_styling;
        if (bool != null) {
            arrayList.add("disable_sparkle_button_styling=" + bool);
        }
        ProgressBar progressBar = this.progress_bar;
        if (progressBar != null) {
            arrayList.add("progress_bar=" + progressBar);
        }
        String str4 = this.navigation_bar_title;
        if (str4 != null) {
            arrayList.add("navigation_bar_title=" + Internal.sanitize(str4));
        }
        Boolean bool2 = this.is_header_centered;
        if (bool2 != null) {
            arrayList.add("is_header_centered=" + bool2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamPlanSelectionContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamPlanSelectionContentResponse copy$default(StreamPlanSelectionContentResponse streamPlanSelectionContentResponse, String str, String str2, List list, String str3, Cta cta, Boolean bool, ProgressBar progressBar, String str4, Boolean bool2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamPlanSelectionContentResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = streamPlanSelectionContentResponse.subtitle;
        }
        if ((i & 4) != 0) {
            list = streamPlanSelectionContentResponse.plans;
        }
        if ((i & 8) != 0) {
            str3 = streamPlanSelectionContentResponse.disclosure_markdown;
        }
        if ((i & 16) != 0) {
            cta = streamPlanSelectionContentResponse.cta;
        }
        if ((i & 32) != 0) {
            bool = streamPlanSelectionContentResponse.disable_sparkle_button_styling;
        }
        if ((i & 64) != 0) {
            progressBar = streamPlanSelectionContentResponse.progress_bar;
        }
        if ((i & 128) != 0) {
            str4 = streamPlanSelectionContentResponse.navigation_bar_title;
        }
        if ((i & 256) != 0) {
            bool2 = streamPlanSelectionContentResponse.is_header_centered;
        }
        if ((i & 512) != 0) {
            byteString = streamPlanSelectionContentResponse.unknownFields();
        }
        Boolean bool3 = bool2;
        ByteString byteString2 = byteString;
        ProgressBar progressBar2 = progressBar;
        String str5 = str4;
        Cta cta2 = cta;
        Boolean bool4 = bool;
        return streamPlanSelectionContentResponse.copy(str, str2, list, str3, cta2, bool4, progressBar2, str5, bool3, byteString2);
    }

    public final StreamPlanSelectionContentResponse copy(String title, String subtitle, List<GoldPlanSelectionOption> plans, String disclosure_markdown, Cta cta, Boolean disable_sparkle_button_styling, ProgressBar progress_bar, String navigation_bar_title, Boolean is_header_centered, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamPlanSelectionContentResponse(title, subtitle, plans, disclosure_markdown, cta, disable_sparkle_button_styling, progress_bar, navigation_bar_title, is_header_centered, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamPlanSelectionContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamPlanSelectionContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamPlanSelectionContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamPlanSelectionContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + protoAdapter.encodedSizeWithTag(2, value.getSubtitle()) + GoldPlanSelectionOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getPlans()) + protoAdapter.encodedSizeWithTag(4, value.getDisclosure_markdown()) + Cta.ADAPTER.encodedSizeWithTag(5, value.getCta());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, value.getDisable_sparkle_button_styling()) + ProgressBar.ADAPTER.encodedSizeWithTag(7, value.getProgress_bar()) + protoAdapter.encodedSizeWithTag(8, value.getNavigation_bar_title()) + protoAdapter2.encodedSizeWithTag(9, value.getIs_header_centered());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamPlanSelectionContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                GoldPlanSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPlans());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                Cta.ADAPTER.encodeWithTag(writer, 5, (int) value.getCta());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getDisable_sparkle_button_styling());
                ProgressBar.ADAPTER.encodeWithTag(writer, 7, (int) value.getProgress_bar());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getNavigation_bar_title());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getIs_header_centered());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamPlanSelectionContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getIs_header_centered());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getNavigation_bar_title());
                ProgressBar.ADAPTER.encodeWithTag(writer, 7, (int) value.getProgress_bar());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDisable_sparkle_button_styling());
                Cta.ADAPTER.encodeWithTag(writer, 5, (int) value.getCta());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                GoldPlanSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPlans());
                protoAdapter2.encodeWithTag(writer, 2, (int) value.getSubtitle());
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamPlanSelectionContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                Cta ctaDecode = null;
                Boolean boolDecode = null;
                ProgressBar progressBarDecode = null;
                String strDecode4 = null;
                Boolean boolDecode2 = null;
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
                                arrayList.add(GoldPlanSelectionOption.ADAPTER.decode(reader));
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 6:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 7:
                                progressBarDecode = ProgressBar.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StreamPlanSelectionContentResponse(strDecode, strDecode2, arrayList, strDecode3, ctaDecode, boolDecode, progressBarDecode, strDecode4, boolDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamPlanSelectionContentResponse redact(StreamPlanSelectionContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getPlans(), GoldPlanSelectionOption.ADAPTER);
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                ProgressBar progress_bar = value.getProgress_bar();
                return StreamPlanSelectionContentResponse.copy$default(value, null, null, listM26823redactElements, null, ctaRedact, null, progress_bar != null ? ProgressBar.ADAPTER.redact(progress_bar) : null, null, null, ByteString.EMPTY, 427, null);
            }
        };
    }
}
