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
import microgram.p507ui.p508v1.ProgressBar;
import okio.ByteString;

/* compiled from: StreamMultiAgreementsContentResponse.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B±\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00100\u001a\u00020\u0002H\u0017J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0004H\u0016Jµ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u00108R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u0014\u0010#R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006:"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "options", "", "Lgold_flow/proto/v1/MultiAgreementsOption;", "disclaimer_markdown", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", "disable_sparkle_button_styling", "", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "force_dark_mode", "backup_payment_instrument", "Lgold_flow/proto/v1/GoldPaymentInstrument;", "progress_bar", "Lmicrogram/ui/v1/ProgressBar;", "is_header_centered", "navigation_bar_title", "web_sidebar_content", "Lgold_flow/proto/v1/WebSidebarContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrument;Lmicrogram/ui/v1/ProgressBar;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getDisclaimer_markdown", "getCta", "()Lgold_flow/proto/v1/Cta;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSecondary_cta", "getForce_dark_mode", "getBackup_payment_instrument", "()Lgold_flow/proto/v1/GoldPaymentInstrument;", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBar;", "getNavigation_bar_title", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContent;", "getOptions", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrument;Lmicrogram/ui/v1/ProgressBar;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)Lgold_flow/proto/v1/StreamMultiAgreementsContentResponse;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamMultiAgreementsContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamMultiAgreementsContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.GoldPaymentInstrument#ADAPTER", jsonName = "backupPaymentInstrument", schemaIndex = 8, tag = 12)
    private final GoldPaymentInstrument backup_payment_instrument;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 4, tag = 5)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableSparkleButtonStyling", schemaIndex = 5, tag = 6)
    private final Boolean disable_sparkle_button_styling;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclaimerMarkdown", schemaIndex = 3, tag = 4)
    private final String disclaimer_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forceDarkMode", schemaIndex = 7, tag = 11)
    private final Boolean force_dark_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHeaderCentered", schemaIndex = 10, tag = 14)
    private final Boolean is_header_centered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigationBarTitle", schemaIndex = 11, tag = 15)
    private final String navigation_bar_title;

    @WireField(adapter = "gold_flow.proto.v1.MultiAgreementsOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<MultiAgreementsOption> options;

    @WireField(adapter = "microgram.ui.v1.ProgressBar#ADAPTER", jsonName = "progressBar", schemaIndex = 9, tag = 13)
    private final ProgressBar progress_bar;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 6, tag = 7)
    private final Cta secondary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "gold_flow.proto.v1.WebSidebarContent#ADAPTER", jsonName = "webSidebarContent", schemaIndex = 12, tag = 16)
    private final WebSidebarContent web_sidebar_content;

    public StreamMultiAgreementsContentResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28192newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public /* synthetic */ StreamMultiAgreementsContentResponse(String str, String str2, List list, String str3, Cta cta, Boolean bool, Cta cta2, Boolean bool2, GoldPaymentInstrument goldPaymentInstrument, ProgressBar progressBar, Boolean bool3, String str4, WebSidebarContent webSidebarContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : cta, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : cta2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : goldPaymentInstrument, (i & 512) != 0 ? null : progressBar, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : str4, (i & 4096) == 0 ? webSidebarContent : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getDisclaimer_markdown() {
        return this.disclaimer_markdown;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Boolean getDisable_sparkle_button_styling() {
        return this.disable_sparkle_button_styling;
    }

    public final Cta getSecondary_cta() {
        return this.secondary_cta;
    }

    public final Boolean getForce_dark_mode() {
        return this.force_dark_mode;
    }

    public final GoldPaymentInstrument getBackup_payment_instrument() {
        return this.backup_payment_instrument;
    }

    public final ProgressBar getProgress_bar() {
        return this.progress_bar;
    }

    /* renamed from: is_header_centered, reason: from getter */
    public final Boolean getIs_header_centered() {
        return this.is_header_centered;
    }

    public final String getNavigation_bar_title() {
        return this.navigation_bar_title;
    }

    public final WebSidebarContent getWeb_sidebar_content() {
        return this.web_sidebar_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamMultiAgreementsContentResponse(String str, String str2, List<MultiAgreementsOption> options, String str3, Cta cta, Boolean bool, Cta cta2, Boolean bool2, GoldPaymentInstrument goldPaymentInstrument, ProgressBar progressBar, Boolean bool3, String str4, WebSidebarContent webSidebarContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.description = str2;
        this.disclaimer_markdown = str3;
        this.cta = cta;
        this.disable_sparkle_button_styling = bool;
        this.secondary_cta = cta2;
        this.force_dark_mode = bool2;
        this.backup_payment_instrument = goldPaymentInstrument;
        this.progress_bar = progressBar;
        this.is_header_centered = bool3;
        this.navigation_bar_title = str4;
        this.web_sidebar_content = webSidebarContent;
        this.options = Internal.immutableCopyOf("options", options);
    }

    public final List<MultiAgreementsOption> getOptions() {
        return this.options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28192newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamMultiAgreementsContentResponse)) {
            return false;
        }
        StreamMultiAgreementsContentResponse streamMultiAgreementsContentResponse = (StreamMultiAgreementsContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamMultiAgreementsContentResponse.unknownFields()) && Intrinsics.areEqual(this.title, streamMultiAgreementsContentResponse.title) && Intrinsics.areEqual(this.description, streamMultiAgreementsContentResponse.description) && Intrinsics.areEqual(this.options, streamMultiAgreementsContentResponse.options) && Intrinsics.areEqual(this.disclaimer_markdown, streamMultiAgreementsContentResponse.disclaimer_markdown) && Intrinsics.areEqual(this.cta, streamMultiAgreementsContentResponse.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, streamMultiAgreementsContentResponse.disable_sparkle_button_styling) && Intrinsics.areEqual(this.secondary_cta, streamMultiAgreementsContentResponse.secondary_cta) && Intrinsics.areEqual(this.force_dark_mode, streamMultiAgreementsContentResponse.force_dark_mode) && Intrinsics.areEqual(this.backup_payment_instrument, streamMultiAgreementsContentResponse.backup_payment_instrument) && Intrinsics.areEqual(this.progress_bar, streamMultiAgreementsContentResponse.progress_bar) && Intrinsics.areEqual(this.is_header_centered, streamMultiAgreementsContentResponse.is_header_centered) && Intrinsics.areEqual(this.navigation_bar_title, streamMultiAgreementsContentResponse.navigation_bar_title) && Intrinsics.areEqual(this.web_sidebar_content, streamMultiAgreementsContentResponse.web_sidebar_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.options.hashCode()) * 37;
        String str3 = this.disclaimer_markdown;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode5 = (iHashCode4 + (cta != null ? cta.hashCode() : 0)) * 37;
        Boolean bool = this.disable_sparkle_button_styling;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Cta cta2 = this.secondary_cta;
        int iHashCode7 = (iHashCode6 + (cta2 != null ? cta2.hashCode() : 0)) * 37;
        Boolean bool2 = this.force_dark_mode;
        int iHashCode8 = (iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        GoldPaymentInstrument goldPaymentInstrument = this.backup_payment_instrument;
        int iHashCode9 = (iHashCode8 + (goldPaymentInstrument != null ? goldPaymentInstrument.hashCode() : 0)) * 37;
        ProgressBar progressBar = this.progress_bar;
        int iHashCode10 = (iHashCode9 + (progressBar != null ? progressBar.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_header_centered;
        int iHashCode11 = (iHashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        String str4 = this.navigation_bar_title;
        int iHashCode12 = (iHashCode11 + (str4 != null ? str4.hashCode() : 0)) * 37;
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        int iHashCode13 = iHashCode12 + (webSidebarContent != null ? webSidebarContent.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.description;
        if (str2 != null) {
            arrayList.add("description=" + Internal.sanitize(str2));
        }
        if (!this.options.isEmpty()) {
            arrayList.add("options=" + this.options);
        }
        String str3 = this.disclaimer_markdown;
        if (str3 != null) {
            arrayList.add("disclaimer_markdown=" + Internal.sanitize(str3));
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Boolean bool = this.disable_sparkle_button_styling;
        if (bool != null) {
            arrayList.add("disable_sparkle_button_styling=" + bool);
        }
        Cta cta2 = this.secondary_cta;
        if (cta2 != null) {
            arrayList.add("secondary_cta=" + cta2);
        }
        Boolean bool2 = this.force_dark_mode;
        if (bool2 != null) {
            arrayList.add("force_dark_mode=" + bool2);
        }
        GoldPaymentInstrument goldPaymentInstrument = this.backup_payment_instrument;
        if (goldPaymentInstrument != null) {
            arrayList.add("backup_payment_instrument=" + goldPaymentInstrument);
        }
        ProgressBar progressBar = this.progress_bar;
        if (progressBar != null) {
            arrayList.add("progress_bar=" + progressBar);
        }
        Boolean bool3 = this.is_header_centered;
        if (bool3 != null) {
            arrayList.add("is_header_centered=" + bool3);
        }
        String str4 = this.navigation_bar_title;
        if (str4 != null) {
            arrayList.add("navigation_bar_title=" + Internal.sanitize(str4));
        }
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        if (webSidebarContent != null) {
            arrayList.add("web_sidebar_content=" + webSidebarContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamMultiAgreementsContentResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamMultiAgreementsContentResponse copy(String title, String description, List<MultiAgreementsOption> options, String disclaimer_markdown, Cta cta, Boolean disable_sparkle_button_styling, Cta secondary_cta, Boolean force_dark_mode, GoldPaymentInstrument backup_payment_instrument, ProgressBar progress_bar, Boolean is_header_centered, String navigation_bar_title, WebSidebarContent web_sidebar_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamMultiAgreementsContentResponse(title, description, options, disclaimer_markdown, cta, disable_sparkle_button_styling, secondary_cta, force_dark_mode, backup_payment_instrument, progress_bar, is_header_centered, navigation_bar_title, web_sidebar_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamMultiAgreementsContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamMultiAgreementsContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamMultiAgreementsContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamMultiAgreementsContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + protoAdapter.encodedSizeWithTag(2, value.getDescription()) + MultiAgreementsOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOptions()) + protoAdapter.encodedSizeWithTag(4, value.getDisclaimer_markdown());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, value.getCta());
                ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
                return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, value.getDisable_sparkle_button_styling()) + protoAdapter2.encodedSizeWithTag(7, value.getSecondary_cta()) + protoAdapter3.encodedSizeWithTag(11, value.getForce_dark_mode()) + GoldPaymentInstrument.ADAPTER.encodedSizeWithTag(12, value.getBackup_payment_instrument()) + ProgressBar.ADAPTER.encodedSizeWithTag(13, value.getProgress_bar()) + protoAdapter3.encodedSizeWithTag(14, value.getIs_header_centered()) + protoAdapter.encodedSizeWithTag(15, value.getNavigation_bar_title()) + WebSidebarContent.ADAPTER.encodedSizeWithTag(16, value.getWeb_sidebar_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamMultiAgreementsContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                MultiAgreementsOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclaimer_markdown());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getCta());
                ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 6, (int) value.getDisable_sparkle_button_styling());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getSecondary_cta());
                protoAdapter3.encodeWithTag(writer, 11, (int) value.getForce_dark_mode());
                GoldPaymentInstrument.ADAPTER.encodeWithTag(writer, 12, (int) value.getBackup_payment_instrument());
                ProgressBar.ADAPTER.encodeWithTag(writer, 13, (int) value.getProgress_bar());
                protoAdapter3.encodeWithTag(writer, 14, (int) value.getIs_header_centered());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getNavigation_bar_title());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 16, (int) value.getWeb_sidebar_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamMultiAgreementsContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 16, (int) value.getWeb_sidebar_content());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getNavigation_bar_title());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 14, (int) value.getIs_header_centered());
                ProgressBar.ADAPTER.encodeWithTag(writer, 13, (int) value.getProgress_bar());
                GoldPaymentInstrument.ADAPTER.encodeWithTag(writer, 12, (int) value.getBackup_payment_instrument());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getForce_dark_mode());
                ProtoAdapter<Cta> protoAdapter3 = Cta.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 7, (int) value.getSecondary_cta());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getDisable_sparkle_button_styling());
                protoAdapter3.encodeWithTag(writer, 5, (int) value.getCta());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclaimer_markdown());
                MultiAgreementsOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamMultiAgreementsContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                Cta ctaDecode = null;
                Boolean boolDecode = null;
                Cta ctaDecode2 = null;
                Boolean boolDecode2 = null;
                GoldPaymentInstrument goldPaymentInstrumentDecode = null;
                ProgressBar progressBarDecode = null;
                Boolean boolDecode3 = null;
                String strDecode3 = null;
                WebSidebarContent webSidebarContentDecode = null;
                String strDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                arrayList.add(MultiAgreementsOption.ADAPTER.decode(reader));
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 6:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 7:
                                ctaDecode2 = Cta.ADAPTER.decode(reader);
                                break;
                            case 8:
                            case 9:
                            case 10:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 11:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 12:
                                goldPaymentInstrumentDecode = GoldPaymentInstrument.ADAPTER.decode(reader);
                                break;
                            case 13:
                                progressBarDecode = ProgressBar.ADAPTER.decode(reader);
                                break;
                            case 14:
                                boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 15:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                webSidebarContentDecode = WebSidebarContent.ADAPTER.decode(reader);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new StreamMultiAgreementsContentResponse(strDecode4, str, arrayList, strDecode2, ctaDecode, boolDecode, ctaDecode2, boolDecode2, goldPaymentInstrumentDecode, progressBarDecode, boolDecode3, strDecode3, webSidebarContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamMultiAgreementsContentResponse redact(StreamMultiAgreementsContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getOptions(), MultiAgreementsOption.ADAPTER);
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                Cta secondary_cta = value.getSecondary_cta();
                Cta ctaRedact2 = secondary_cta != null ? Cta.ADAPTER.redact(secondary_cta) : null;
                GoldPaymentInstrument backup_payment_instrument = value.getBackup_payment_instrument();
                GoldPaymentInstrument goldPaymentInstrumentRedact = backup_payment_instrument != null ? GoldPaymentInstrument.ADAPTER.redact(backup_payment_instrument) : null;
                ProgressBar progress_bar = value.getProgress_bar();
                ProgressBar progressBarRedact = progress_bar != null ? ProgressBar.ADAPTER.redact(progress_bar) : null;
                WebSidebarContent web_sidebar_content = value.getWeb_sidebar_content();
                return value.copy((3243 & 1) != 0 ? value.title : null, (3243 & 2) != 0 ? value.description : null, (3243 & 4) != 0 ? value.options : listM26823redactElements, (3243 & 8) != 0 ? value.disclaimer_markdown : null, (3243 & 16) != 0 ? value.cta : ctaRedact, (3243 & 32) != 0 ? value.disable_sparkle_button_styling : null, (3243 & 64) != 0 ? value.secondary_cta : ctaRedact2, (3243 & 128) != 0 ? value.force_dark_mode : null, (3243 & 256) != 0 ? value.backup_payment_instrument : goldPaymentInstrumentRedact, (3243 & 512) != 0 ? value.progress_bar : progressBarRedact, (3243 & 1024) != 0 ? value.is_header_centered : null, (3243 & 2048) != 0 ? value.navigation_bar_title : null, (3243 & 4096) != 0 ? value.web_sidebar_content : web_sidebar_content != null ? WebSidebarContent.ADAPTER.redact(web_sidebar_content) : null, (3243 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
