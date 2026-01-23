package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
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

/* compiled from: AdvisorDashboardStateNotEnrolled.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jd\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolled;", "Lcom/squareup/wire/Message;", "", "title", "", "description", Footer.f10637type, "cta_title", SduiAlert.BOTTOM_SHEET_TAG, "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardNotEnrolledBottomSheet;", "description_cta_identifier", "background_url", "loading_screen", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMatchingLandingScreen;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardNotEnrolledBottomSheet;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMatchingLandingScreen;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getFooter", "getCta_title", "getBottom_sheet", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardNotEnrolledBottomSheet;", "getDescription_cta_identifier", "getBackground_url", "getLoading_screen", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMatchingLandingScreen;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDashboardStateNotEnrolled extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDashboardStateNotEnrolled> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "backgroundUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String background_url;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardNotEnrolledBottomSheet#ADAPTER", jsonName = "bottomSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AdvisorDashboardNotEnrolledBottomSheet bottom_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String cta_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionCtaIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String description_cta_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String footer;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardMatchingLandingScreen#ADAPTER", jsonName = "loadingScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final AdvisorDashboardMatchingLandingScreen loading_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public AdvisorDashboardStateNotEnrolled() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ AdvisorDashboardStateNotEnrolled(String str, String str2, String str3, String str4, AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet, String str5, String str6, AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : advisorDashboardNotEnrolledBottomSheet, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : advisorDashboardMatchingLandingScreen, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8751newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final String getCta_title() {
        return this.cta_title;
    }

    public final AdvisorDashboardNotEnrolledBottomSheet getBottom_sheet() {
        return this.bottom_sheet;
    }

    public final String getDescription_cta_identifier() {
        return this.description_cta_identifier;
    }

    public final String getBackground_url() {
        return this.background_url;
    }

    public final AdvisorDashboardMatchingLandingScreen getLoading_screen() {
        return this.loading_screen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardStateNotEnrolled(String title, String description, String footer, String cta_title, AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet, String description_cta_identifier, String background_url, AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(description_cta_identifier, "description_cta_identifier");
        Intrinsics.checkNotNullParameter(background_url, "background_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.footer = footer;
        this.cta_title = cta_title;
        this.bottom_sheet = advisorDashboardNotEnrolledBottomSheet;
        this.description_cta_identifier = description_cta_identifier;
        this.background_url = background_url;
        this.loading_screen = advisorDashboardMatchingLandingScreen;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8751newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDashboardStateNotEnrolled)) {
            return false;
        }
        AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolled = (AdvisorDashboardStateNotEnrolled) other;
        return Intrinsics.areEqual(unknownFields(), advisorDashboardStateNotEnrolled.unknownFields()) && Intrinsics.areEqual(this.title, advisorDashboardStateNotEnrolled.title) && Intrinsics.areEqual(this.description, advisorDashboardStateNotEnrolled.description) && Intrinsics.areEqual(this.footer, advisorDashboardStateNotEnrolled.footer) && Intrinsics.areEqual(this.cta_title, advisorDashboardStateNotEnrolled.cta_title) && Intrinsics.areEqual(this.bottom_sheet, advisorDashboardStateNotEnrolled.bottom_sheet) && Intrinsics.areEqual(this.description_cta_identifier, advisorDashboardStateNotEnrolled.description_cta_identifier) && Intrinsics.areEqual(this.background_url, advisorDashboardStateNotEnrolled.background_url) && Intrinsics.areEqual(this.loading_screen, advisorDashboardStateNotEnrolled.loading_screen);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.footer.hashCode()) * 37) + this.cta_title.hashCode()) * 37;
        AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet = this.bottom_sheet;
        int iHashCode2 = (((((iHashCode + (advisorDashboardNotEnrolledBottomSheet != null ? advisorDashboardNotEnrolledBottomSheet.hashCode() : 0)) * 37) + this.description_cta_identifier.hashCode()) * 37) + this.background_url.hashCode()) * 37;
        AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen = this.loading_screen;
        int iHashCode3 = iHashCode2 + (advisorDashboardMatchingLandingScreen != null ? advisorDashboardMatchingLandingScreen.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("footer=" + Internal.sanitize(this.footer));
        arrayList.add("cta_title=" + Internal.sanitize(this.cta_title));
        AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet = this.bottom_sheet;
        if (advisorDashboardNotEnrolledBottomSheet != null) {
            arrayList.add("bottom_sheet=" + advisorDashboardNotEnrolledBottomSheet);
        }
        arrayList.add("description_cta_identifier=" + Internal.sanitize(this.description_cta_identifier));
        arrayList.add("background_url=" + Internal.sanitize(this.background_url));
        AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen = this.loading_screen;
        if (advisorDashboardMatchingLandingScreen != null) {
            arrayList.add("loading_screen=" + advisorDashboardMatchingLandingScreen);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDashboardStateNotEnrolled{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorDashboardStateNotEnrolled copy$default(AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolled, String str, String str2, String str3, String str4, AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet, String str5, String str6, AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorDashboardStateNotEnrolled.title;
        }
        if ((i & 2) != 0) {
            str2 = advisorDashboardStateNotEnrolled.description;
        }
        if ((i & 4) != 0) {
            str3 = advisorDashboardStateNotEnrolled.footer;
        }
        if ((i & 8) != 0) {
            str4 = advisorDashboardStateNotEnrolled.cta_title;
        }
        if ((i & 16) != 0) {
            advisorDashboardNotEnrolledBottomSheet = advisorDashboardStateNotEnrolled.bottom_sheet;
        }
        if ((i & 32) != 0) {
            str5 = advisorDashboardStateNotEnrolled.description_cta_identifier;
        }
        if ((i & 64) != 0) {
            str6 = advisorDashboardStateNotEnrolled.background_url;
        }
        if ((i & 128) != 0) {
            advisorDashboardMatchingLandingScreen = advisorDashboardStateNotEnrolled.loading_screen;
        }
        if ((i & 256) != 0) {
            byteString = advisorDashboardStateNotEnrolled.unknownFields();
        }
        AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreen2 = advisorDashboardMatchingLandingScreen;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet2 = advisorDashboardNotEnrolledBottomSheet;
        String str9 = str3;
        return advisorDashboardStateNotEnrolled.copy(str, str2, str9, str4, advisorDashboardNotEnrolledBottomSheet2, str7, str8, advisorDashboardMatchingLandingScreen2, byteString2);
    }

    public final AdvisorDashboardStateNotEnrolled copy(String title, String description, String footer, String cta_title, AdvisorDashboardNotEnrolledBottomSheet bottom_sheet, String description_cta_identifier, String background_url, AdvisorDashboardMatchingLandingScreen loading_screen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(description_cta_identifier, "description_cta_identifier");
        Intrinsics.checkNotNullParameter(background_url, "background_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDashboardStateNotEnrolled(title, description, footer, cta_title, bottom_sheet, description_cta_identifier, background_url, loading_screen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDashboardStateNotEnrolled.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDashboardStateNotEnrolled>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateNotEnrolled$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDashboardStateNotEnrolled value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getFooter(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getFooter());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCta_title());
                }
                if (value.getBottom_sheet() != null) {
                    size += AdvisorDashboardNotEnrolledBottomSheet.ADAPTER.encodedSizeWithTag(5, value.getBottom_sheet());
                }
                if (!Intrinsics.areEqual(value.getDescription_cta_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDescription_cta_identifier());
                }
                if (!Intrinsics.areEqual(value.getBackground_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getBackground_url());
                }
                return value.getLoading_screen() != null ? size + AdvisorDashboardMatchingLandingScreen.ADAPTER.encodedSizeWithTag(8, value.getLoading_screen()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDashboardStateNotEnrolled value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getFooter(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFooter());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_title());
                }
                if (value.getBottom_sheet() != null) {
                    AdvisorDashboardNotEnrolledBottomSheet.ADAPTER.encodeWithTag(writer, 5, (int) value.getBottom_sheet());
                }
                if (!Intrinsics.areEqual(value.getDescription_cta_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDescription_cta_identifier());
                }
                if (!Intrinsics.areEqual(value.getBackground_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getBackground_url());
                }
                if (value.getLoading_screen() != null) {
                    AdvisorDashboardMatchingLandingScreen.ADAPTER.encodeWithTag(writer, 8, (int) value.getLoading_screen());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDashboardStateNotEnrolled value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLoading_screen() != null) {
                    AdvisorDashboardMatchingLandingScreen.ADAPTER.encodeWithTag(writer, 8, (int) value.getLoading_screen());
                }
                if (!Intrinsics.areEqual(value.getBackground_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getBackground_url());
                }
                if (!Intrinsics.areEqual(value.getDescription_cta_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDescription_cta_identifier());
                }
                if (value.getBottom_sheet() != null) {
                    AdvisorDashboardNotEnrolledBottomSheet.ADAPTER.encodeWithTag(writer, 5, (int) value.getBottom_sheet());
                }
                if (!Intrinsics.areEqual(value.getCta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_title());
                }
                if (!Intrinsics.areEqual(value.getFooter(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFooter());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardStateNotEnrolled redact(AdvisorDashboardStateNotEnrolled value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorDashboardNotEnrolledBottomSheet bottom_sheet = value.getBottom_sheet();
                AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheetRedact = bottom_sheet != null ? AdvisorDashboardNotEnrolledBottomSheet.ADAPTER.redact(bottom_sheet) : null;
                AdvisorDashboardMatchingLandingScreen loading_screen = value.getLoading_screen();
                return AdvisorDashboardStateNotEnrolled.copy$default(value, null, null, null, null, advisorDashboardNotEnrolledBottomSheetRedact, null, null, loading_screen != null ? AdvisorDashboardMatchingLandingScreen.ADAPTER.redact(loading_screen) : null, ByteString.EMPTY, 111, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardStateNotEnrolled decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheetDecode = null;
                AdvisorDashboardMatchingLandingScreen advisorDashboardMatchingLandingScreenDecode = null;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                advisorDashboardNotEnrolledBottomSheetDecode = AdvisorDashboardNotEnrolledBottomSheet.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                advisorDashboardMatchingLandingScreenDecode = AdvisorDashboardMatchingLandingScreen.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisorDashboardStateNotEnrolled(strDecode, strDecode6, strDecode2, strDecode3, advisorDashboardNotEnrolledBottomSheetDecode, strDecode4, strDecode5, advisorDashboardMatchingLandingScreenDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
