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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetStrategiesValuePropsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016¨\u0006'"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponse;", "Lcom/squareup/wire/Message;", "", "video_url", "", "show_gold_pill", "", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "terms_cta_text", "continue_cta_text", "terms_sheet", "Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;", "is_gold_variant", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;ZLokio/ByteString;)V", "getVideo_url", "()Ljava/lang/String;", "getShow_gold_pill", "()Z", "getTitle", "getSubtitle", "getDisclosure", "getTerms_cta_text", "getContinue_cta_text", "getTerms_sheet", "()Ladvisory/proto/v1/StrategiesValuePropsTermsSheet;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetStrategiesValuePropsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetStrategiesValuePropsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "continueCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String continue_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isGoldVariant", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean is_gold_variant;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showGoldPill", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean show_gold_pill;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "termsCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String terms_cta_text;

    @WireField(adapter = "advisory.proto.v1.StrategiesValuePropsTermsSheet#ADAPTER", jsonName = "termsSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final StrategiesValuePropsTermsSheet terms_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "videoUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String video_url;

    public GetStrategiesValuePropsResponse() {
        this(null, false, null, null, null, null, null, null, false, null, 1023, null);
    }

    public /* synthetic */ GetStrategiesValuePropsResponse(String str, boolean z, String str2, String str3, String str4, String str5, String str6, StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : strategiesValuePropsTermsSheet, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4479newBuilder();
    }

    public final String getVideo_url() {
        return this.video_url;
    }

    public final boolean getShow_gold_pill() {
        return this.show_gold_pill;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final String getTerms_cta_text() {
        return this.terms_cta_text;
    }

    public final String getContinue_cta_text() {
        return this.continue_cta_text;
    }

    public final StrategiesValuePropsTermsSheet getTerms_sheet() {
        return this.terms_sheet;
    }

    /* renamed from: is_gold_variant, reason: from getter */
    public final boolean getIs_gold_variant() {
        return this.is_gold_variant;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStrategiesValuePropsResponse(String video_url, boolean z, String title, String subtitle, String disclosure, String terms_cta_text, String continue_cta_text, StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(terms_cta_text, "terms_cta_text");
        Intrinsics.checkNotNullParameter(continue_cta_text, "continue_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.video_url = video_url;
        this.show_gold_pill = z;
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure = disclosure;
        this.terms_cta_text = terms_cta_text;
        this.continue_cta_text = continue_cta_text;
        this.terms_sheet = strategiesValuePropsTermsSheet;
        this.is_gold_variant = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4479newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetStrategiesValuePropsResponse)) {
            return false;
        }
        GetStrategiesValuePropsResponse getStrategiesValuePropsResponse = (GetStrategiesValuePropsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getStrategiesValuePropsResponse.unknownFields()) && Intrinsics.areEqual(this.video_url, getStrategiesValuePropsResponse.video_url) && this.show_gold_pill == getStrategiesValuePropsResponse.show_gold_pill && Intrinsics.areEqual(this.title, getStrategiesValuePropsResponse.title) && Intrinsics.areEqual(this.subtitle, getStrategiesValuePropsResponse.subtitle) && Intrinsics.areEqual(this.disclosure, getStrategiesValuePropsResponse.disclosure) && Intrinsics.areEqual(this.terms_cta_text, getStrategiesValuePropsResponse.terms_cta_text) && Intrinsics.areEqual(this.continue_cta_text, getStrategiesValuePropsResponse.continue_cta_text) && Intrinsics.areEqual(this.terms_sheet, getStrategiesValuePropsResponse.terms_sheet) && this.is_gold_variant == getStrategiesValuePropsResponse.is_gold_variant;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.video_url.hashCode()) * 37) + Boolean.hashCode(this.show_gold_pill)) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.disclosure.hashCode()) * 37) + this.terms_cta_text.hashCode()) * 37) + this.continue_cta_text.hashCode()) * 37;
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet = this.terms_sheet;
        int iHashCode2 = ((iHashCode + (strategiesValuePropsTermsSheet != null ? strategiesValuePropsTermsSheet.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_gold_variant);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("video_url=" + Internal.sanitize(this.video_url));
        arrayList.add("show_gold_pill=" + this.show_gold_pill);
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        arrayList.add("terms_cta_text=" + Internal.sanitize(this.terms_cta_text));
        arrayList.add("continue_cta_text=" + Internal.sanitize(this.continue_cta_text));
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet = this.terms_sheet;
        if (strategiesValuePropsTermsSheet != null) {
            arrayList.add("terms_sheet=" + strategiesValuePropsTermsSheet);
        }
        arrayList.add("is_gold_variant=" + this.is_gold_variant);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetStrategiesValuePropsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetStrategiesValuePropsResponse copy$default(GetStrategiesValuePropsResponse getStrategiesValuePropsResponse, String str, boolean z, String str2, String str3, String str4, String str5, String str6, StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getStrategiesValuePropsResponse.video_url;
        }
        if ((i & 2) != 0) {
            z = getStrategiesValuePropsResponse.show_gold_pill;
        }
        if ((i & 4) != 0) {
            str2 = getStrategiesValuePropsResponse.title;
        }
        if ((i & 8) != 0) {
            str3 = getStrategiesValuePropsResponse.subtitle;
        }
        if ((i & 16) != 0) {
            str4 = getStrategiesValuePropsResponse.disclosure;
        }
        if ((i & 32) != 0) {
            str5 = getStrategiesValuePropsResponse.terms_cta_text;
        }
        if ((i & 64) != 0) {
            str6 = getStrategiesValuePropsResponse.continue_cta_text;
        }
        if ((i & 128) != 0) {
            strategiesValuePropsTermsSheet = getStrategiesValuePropsResponse.terms_sheet;
        }
        if ((i & 256) != 0) {
            z2 = getStrategiesValuePropsResponse.is_gold_variant;
        }
        if ((i & 512) != 0) {
            byteString = getStrategiesValuePropsResponse.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        String str7 = str6;
        StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheet2 = strategiesValuePropsTermsSheet;
        String str8 = str4;
        String str9 = str5;
        return getStrategiesValuePropsResponse.copy(str, z, str2, str3, str8, str9, str7, strategiesValuePropsTermsSheet2, z3, byteString2);
    }

    public final GetStrategiesValuePropsResponse copy(String video_url, boolean show_gold_pill, String title, String subtitle, String disclosure, String terms_cta_text, String continue_cta_text, StrategiesValuePropsTermsSheet terms_sheet, boolean is_gold_variant, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(terms_cta_text, "terms_cta_text");
        Intrinsics.checkNotNullParameter(continue_cta_text, "continue_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetStrategiesValuePropsResponse(video_url, show_gold_pill, title, subtitle, disclosure, terms_cta_text, continue_cta_text, terms_sheet, is_gold_variant, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetStrategiesValuePropsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetStrategiesValuePropsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetStrategiesValuePropsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetStrategiesValuePropsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVideo_url());
                }
                if (value.getShow_gold_pill()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getShow_gold_pill()));
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure());
                }
                if (!Intrinsics.areEqual(value.getTerms_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTerms_cta_text());
                }
                if (!Intrinsics.areEqual(value.getContinue_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getContinue_cta_text());
                }
                if (value.getTerms_sheet() != null) {
                    size += StrategiesValuePropsTermsSheet.ADAPTER.encodedSizeWithTag(8, value.getTerms_sheet());
                }
                return value.getIs_gold_variant() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getIs_gold_variant())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetStrategiesValuePropsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVideo_url());
                }
                if (value.getShow_gold_pill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShow_gold_pill()));
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure());
                }
                if (!Intrinsics.areEqual(value.getTerms_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTerms_cta_text());
                }
                if (!Intrinsics.areEqual(value.getContinue_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getContinue_cta_text());
                }
                if (value.getTerms_sheet() != null) {
                    StrategiesValuePropsTermsSheet.ADAPTER.encodeWithTag(writer, 8, (int) value.getTerms_sheet());
                }
                if (value.getIs_gold_variant()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getIs_gold_variant()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetStrategiesValuePropsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_gold_variant()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getIs_gold_variant()));
                }
                if (value.getTerms_sheet() != null) {
                    StrategiesValuePropsTermsSheet.ADAPTER.encodeWithTag(writer, 8, (int) value.getTerms_sheet());
                }
                if (!Intrinsics.areEqual(value.getContinue_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getContinue_cta_text());
                }
                if (!Intrinsics.areEqual(value.getTerms_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTerms_cta_text());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (value.getShow_gold_pill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShow_gold_pill()));
                }
                if (Intrinsics.areEqual(value.getVideo_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVideo_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetStrategiesValuePropsResponse redact(GetStrategiesValuePropsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StrategiesValuePropsTermsSheet terms_sheet = value.getTerms_sheet();
                return GetStrategiesValuePropsResponse.copy$default(value, null, false, null, null, null, null, null, terms_sheet != null ? StrategiesValuePropsTermsSheet.ADAPTER.redact(terms_sheet) : null, false, ByteString.EMPTY, 383, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetStrategiesValuePropsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                StrategiesValuePropsTermsSheet strategiesValuePropsTermsSheetDecode = null;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strategiesValuePropsTermsSheetDecode = StrategiesValuePropsTermsSheet.ADAPTER.decode(reader);
                                break;
                            case 9:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetStrategiesValuePropsResponse(strDecode, zBooleanValue, strDecode5, strDecode6, strDecode2, strDecode3, strDecode4, strategiesValuePropsTermsSheetDecode, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
