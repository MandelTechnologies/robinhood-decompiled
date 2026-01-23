package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
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
import rh_server_driven_ui.p531v1.AlertAction;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.DataRowStacked;
import rh_server_driven_ui.p531v1.InfoBanner;
import rh_server_driven_ui.p531v1.TextButton;
import rh_server_driven_ui.p531v1.Timeline;

/* compiled from: CryptoMigrationsDetailResponse.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010*\u001a\u00020\u0002H\u0017J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\u008e\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'¨\u00064"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponse;", "Lcom/squareup/wire/Message;", "", "id", "", "title", "subtitle", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lrh_server_driven_ui/v1/InfoBanner;", "timeline", "Lrh_server_driven_ui/v1/Timeline;", "detail_rows", "", "Lrh_server_driven_ui/v1/DataRowStacked;", "footer_buttons", "Lrh_server_driven_ui/v1/Button;", "help_alert_sheet", "Lrh_server_driven_ui/v1/AlertAction;", "assets_detail", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponse;", "footer_text_buttons", "Lrh_server_driven_ui/v1/TextButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/InfoBanner;Lrh_server_driven_ui/v1/Timeline;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/AlertAction;Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponse;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getBanner", "()Lrh_server_driven_ui/v1/InfoBanner;", "getTimeline", "()Lrh_server_driven_ui/v1/Timeline;", "getHelp_alert_sheet", "()Lrh_server_driven_ui/v1/AlertAction;", "getAssets_detail", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponse;", "getDetail_rows", "()Ljava/util/List;", "getFooter_buttons", "getFooter_text_buttons", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CryptoMigrationsDetailResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoMigrationsDetailResponse> ADAPTER;

    @WireField(adapter = "bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailAssetsResponse#ADAPTER", jsonName = "assetsDetail", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final CryptoMigrationsDetailAssetsResponse assets_detail;

    @WireField(adapter = "rh_server_driven_ui.v1.InfoBanner#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InfoBanner banner;

    @WireField(adapter = "rh_server_driven_ui.v1.DataRowStacked#ADAPTER", jsonName = "detailRows", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<DataRowStacked> detail_rows;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", jsonName = "footerButtons", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<Button> footer_buttons;

    @WireField(adapter = "rh_server_driven_ui.v1.TextButton#ADAPTER", jsonName = "footerTextButtons", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<TextButton> footer_text_buttons;

    @WireField(adapter = "rh_server_driven_ui.v1.AlertAction#ADAPTER", jsonName = "helpAlertSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final AlertAction help_alert_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "rh_server_driven_ui.v1.Timeline#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Timeline timeline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public CryptoMigrationsDetailResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ CryptoMigrationsDetailResponse(String str, String str2, String str3, InfoBanner infoBanner, Timeline timeline, List list, List list2, AlertAction alertAction, CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : infoBanner, (i & 16) != 0 ? null : timeline, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : alertAction, (i & 256) != 0 ? null : cryptoMigrationsDetailAssetsResponse, (i & 512) != 0 ? CollectionsKt.emptyList() : list3, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9070newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final InfoBanner getBanner() {
        return this.banner;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final AlertAction getHelp_alert_sheet() {
        return this.help_alert_sheet;
    }

    public final CryptoMigrationsDetailAssetsResponse getAssets_detail() {
        return this.assets_detail;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoMigrationsDetailResponse(String id, String title, String subtitle, InfoBanner infoBanner, Timeline timeline, List<DataRowStacked> detail_rows, List<Button> footer_buttons, AlertAction alertAction, CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse, List<TextButton> footer_text_buttons, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(detail_rows, "detail_rows");
        Intrinsics.checkNotNullParameter(footer_buttons, "footer_buttons");
        Intrinsics.checkNotNullParameter(footer_text_buttons, "footer_text_buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.banner = infoBanner;
        this.timeline = timeline;
        this.help_alert_sheet = alertAction;
        this.assets_detail = cryptoMigrationsDetailAssetsResponse;
        this.detail_rows = Internal.immutableCopyOf("detail_rows", detail_rows);
        this.footer_buttons = Internal.immutableCopyOf("footer_buttons", footer_buttons);
        this.footer_text_buttons = Internal.immutableCopyOf("footer_text_buttons", footer_text_buttons);
    }

    public final List<DataRowStacked> getDetail_rows() {
        return this.detail_rows;
    }

    public final List<Button> getFooter_buttons() {
        return this.footer_buttons;
    }

    public final List<TextButton> getFooter_text_buttons() {
        return this.footer_text_buttons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9070newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoMigrationsDetailResponse)) {
            return false;
        }
        CryptoMigrationsDetailResponse cryptoMigrationsDetailResponse = (CryptoMigrationsDetailResponse) other;
        return Intrinsics.areEqual(unknownFields(), cryptoMigrationsDetailResponse.unknownFields()) && Intrinsics.areEqual(this.id, cryptoMigrationsDetailResponse.id) && Intrinsics.areEqual(this.title, cryptoMigrationsDetailResponse.title) && Intrinsics.areEqual(this.subtitle, cryptoMigrationsDetailResponse.subtitle) && Intrinsics.areEqual(this.banner, cryptoMigrationsDetailResponse.banner) && Intrinsics.areEqual(this.timeline, cryptoMigrationsDetailResponse.timeline) && Intrinsics.areEqual(this.detail_rows, cryptoMigrationsDetailResponse.detail_rows) && Intrinsics.areEqual(this.footer_buttons, cryptoMigrationsDetailResponse.footer_buttons) && Intrinsics.areEqual(this.help_alert_sheet, cryptoMigrationsDetailResponse.help_alert_sheet) && Intrinsics.areEqual(this.assets_detail, cryptoMigrationsDetailResponse.assets_detail) && Intrinsics.areEqual(this.footer_text_buttons, cryptoMigrationsDetailResponse.footer_text_buttons);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37;
        InfoBanner infoBanner = this.banner;
        int iHashCode2 = (iHashCode + (infoBanner != null ? infoBanner.hashCode() : 0)) * 37;
        Timeline timeline = this.timeline;
        int iHashCode3 = (((((iHashCode2 + (timeline != null ? timeline.hashCode() : 0)) * 37) + this.detail_rows.hashCode()) * 37) + this.footer_buttons.hashCode()) * 37;
        AlertAction alertAction = this.help_alert_sheet;
        int iHashCode4 = (iHashCode3 + (alertAction != null ? alertAction.hashCode() : 0)) * 37;
        CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse = this.assets_detail;
        int iHashCode5 = ((iHashCode4 + (cryptoMigrationsDetailAssetsResponse != null ? cryptoMigrationsDetailAssetsResponse.hashCode() : 0)) * 37) + this.footer_text_buttons.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        InfoBanner infoBanner = this.banner;
        if (infoBanner != null) {
            arrayList.add("banner=" + infoBanner);
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        if (!this.detail_rows.isEmpty()) {
            arrayList.add("detail_rows=" + this.detail_rows);
        }
        if (!this.footer_buttons.isEmpty()) {
            arrayList.add("footer_buttons=" + this.footer_buttons);
        }
        AlertAction alertAction = this.help_alert_sheet;
        if (alertAction != null) {
            arrayList.add("help_alert_sheet=" + alertAction);
        }
        CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse = this.assets_detail;
        if (cryptoMigrationsDetailAssetsResponse != null) {
            arrayList.add("assets_detail=" + cryptoMigrationsDetailAssetsResponse);
        }
        if (!this.footer_text_buttons.isEmpty()) {
            arrayList.add("footer_text_buttons=" + this.footer_text_buttons);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoMigrationsDetailResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoMigrationsDetailResponse copy$default(CryptoMigrationsDetailResponse cryptoMigrationsDetailResponse, String str, String str2, String str3, InfoBanner infoBanner, Timeline timeline, List list, List list2, AlertAction alertAction, CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoMigrationsDetailResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoMigrationsDetailResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = cryptoMigrationsDetailResponse.subtitle;
        }
        if ((i & 8) != 0) {
            infoBanner = cryptoMigrationsDetailResponse.banner;
        }
        if ((i & 16) != 0) {
            timeline = cryptoMigrationsDetailResponse.timeline;
        }
        if ((i & 32) != 0) {
            list = cryptoMigrationsDetailResponse.detail_rows;
        }
        if ((i & 64) != 0) {
            list2 = cryptoMigrationsDetailResponse.footer_buttons;
        }
        if ((i & 128) != 0) {
            alertAction = cryptoMigrationsDetailResponse.help_alert_sheet;
        }
        if ((i & 256) != 0) {
            cryptoMigrationsDetailAssetsResponse = cryptoMigrationsDetailResponse.assets_detail;
        }
        if ((i & 512) != 0) {
            list3 = cryptoMigrationsDetailResponse.footer_text_buttons;
        }
        if ((i & 1024) != 0) {
            byteString = cryptoMigrationsDetailResponse.unknownFields();
        }
        List list4 = list3;
        ByteString byteString2 = byteString;
        AlertAction alertAction2 = alertAction;
        CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse2 = cryptoMigrationsDetailAssetsResponse;
        List list5 = list;
        List list6 = list2;
        Timeline timeline2 = timeline;
        String str4 = str3;
        return cryptoMigrationsDetailResponse.copy(str, str2, str4, infoBanner, timeline2, list5, list6, alertAction2, cryptoMigrationsDetailAssetsResponse2, list4, byteString2);
    }

    public final CryptoMigrationsDetailResponse copy(String id, String title, String subtitle, InfoBanner banner, Timeline timeline, List<DataRowStacked> detail_rows, List<Button> footer_buttons, AlertAction help_alert_sheet, CryptoMigrationsDetailAssetsResponse assets_detail, List<TextButton> footer_text_buttons, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(detail_rows, "detail_rows");
        Intrinsics.checkNotNullParameter(footer_buttons, "footer_buttons");
        Intrinsics.checkNotNullParameter(footer_text_buttons, "footer_text_buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoMigrationsDetailResponse(id, title, subtitle, banner, timeline, detail_rows, footer_buttons, help_alert_sheet, assets_detail, footer_text_buttons, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoMigrationsDetailResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoMigrationsDetailResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoMigrationsDetailResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                if (value.getBanner() != null) {
                    size += InfoBanner.ADAPTER.encodedSizeWithTag(4, value.getBanner());
                }
                if (value.getTimeline() != null) {
                    size += Timeline.ADAPTER.encodedSizeWithTag(5, value.getTimeline());
                }
                int iEncodedSizeWithTag = size + DataRowStacked.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getDetail_rows()) + Button.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getFooter_buttons());
                if (value.getHelp_alert_sheet() != null) {
                    iEncodedSizeWithTag += AlertAction.ADAPTER.encodedSizeWithTag(8, value.getHelp_alert_sheet());
                }
                if (value.getAssets_detail() != null) {
                    iEncodedSizeWithTag += CryptoMigrationsDetailAssetsResponse.ADAPTER.encodedSizeWithTag(9, value.getAssets_detail());
                }
                return iEncodedSizeWithTag + TextButton.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getFooter_text_buttons());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoMigrationsDetailResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (value.getBanner() != null) {
                    InfoBanner.ADAPTER.encodeWithTag(writer, 4, (int) value.getBanner());
                }
                if (value.getTimeline() != null) {
                    Timeline.ADAPTER.encodeWithTag(writer, 5, (int) value.getTimeline());
                }
                DataRowStacked.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getDetail_rows());
                Button.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFooter_buttons());
                if (value.getHelp_alert_sheet() != null) {
                    AlertAction.ADAPTER.encodeWithTag(writer, 8, (int) value.getHelp_alert_sheet());
                }
                if (value.getAssets_detail() != null) {
                    CryptoMigrationsDetailAssetsResponse.ADAPTER.encodeWithTag(writer, 9, (int) value.getAssets_detail());
                }
                TextButton.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getFooter_text_buttons());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoMigrationsDetailResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TextButton.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getFooter_text_buttons());
                if (value.getAssets_detail() != null) {
                    CryptoMigrationsDetailAssetsResponse.ADAPTER.encodeWithTag(writer, 9, (int) value.getAssets_detail());
                }
                if (value.getHelp_alert_sheet() != null) {
                    AlertAction.ADAPTER.encodeWithTag(writer, 8, (int) value.getHelp_alert_sheet());
                }
                Button.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFooter_buttons());
                DataRowStacked.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getDetail_rows());
                if (value.getTimeline() != null) {
                    Timeline.ADAPTER.encodeWithTag(writer, 5, (int) value.getTimeline());
                }
                if (value.getBanner() != null) {
                    InfoBanner.ADAPTER.encodeWithTag(writer, 4, (int) value.getBanner());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationsDetailResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                InfoBanner infoBannerDecode = null;
                Timeline timelineDecode = null;
                AlertAction alertActionDecode = null;
                CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponseDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                infoBannerDecode = InfoBanner.ADAPTER.decode(reader);
                                break;
                            case 5:
                                timelineDecode = Timeline.ADAPTER.decode(reader);
                                break;
                            case 6:
                                arrayList.add(DataRowStacked.ADAPTER.decode(reader));
                                break;
                            case 7:
                                arrayList2.add(Button.ADAPTER.decode(reader));
                                break;
                            case 8:
                                alertActionDecode = AlertAction.ADAPTER.decode(reader);
                                break;
                            case 9:
                                cryptoMigrationsDetailAssetsResponseDecode = CryptoMigrationsDetailAssetsResponse.ADAPTER.decode(reader);
                                break;
                            case 10:
                                arrayList3.add(TextButton.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CryptoMigrationsDetailResponse(strDecode, strDecode3, strDecode2, infoBannerDecode, timelineDecode, arrayList, arrayList2, alertActionDecode, cryptoMigrationsDetailAssetsResponseDecode, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationsDetailResponse redact(CryptoMigrationsDetailResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InfoBanner banner = value.getBanner();
                InfoBanner infoBannerRedact = banner != null ? InfoBanner.ADAPTER.redact(banner) : null;
                Timeline timeline = value.getTimeline();
                Timeline timelineRedact = timeline != null ? Timeline.ADAPTER.redact(timeline) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getDetail_rows(), DataRowStacked.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getFooter_buttons(), Button.ADAPTER);
                AlertAction help_alert_sheet = value.getHelp_alert_sheet();
                AlertAction alertActionRedact = help_alert_sheet != null ? AlertAction.ADAPTER.redact(help_alert_sheet) : null;
                CryptoMigrationsDetailAssetsResponse assets_detail = value.getAssets_detail();
                return CryptoMigrationsDetailResponse.copy$default(value, null, null, null, infoBannerRedact, timelineRedact, listM26823redactElements, listM26823redactElements2, alertActionRedact, assets_detail != null ? CryptoMigrationsDetailAssetsResponse.ADAPTER.redact(assets_detail) : null, Internal.m26823redactElements(value.getFooter_text_buttons(), TextButton.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }
}
