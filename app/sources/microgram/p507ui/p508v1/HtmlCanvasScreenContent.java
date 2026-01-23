package microgram.p507ui.p508v1;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.rosetta.eventlogging.Screen;
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
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: HtmlCanvasScreenContent.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00100\u001a\u00020\u0002H\u0017J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\bH\u0016J\u0096\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006:"}, m3636d2 = {"Lmicrogram/ui/v1/HtmlCanvasScreenContent;", "Lcom/squareup/wire/Message;", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "logging_context", "Lmicrogram/ui/v1/LoggingContext;", "title", "", "nav_config", "Lmicrogram/ui/v1/NavigationBarConfiguration;", "theme", "Lmicrogram/ui/v1/Theme;", "canvas_url", Footer.f10637type, "", "Lrh_server_driven_ui/v1/UIComponent;", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "android_attributes", "Lmicrogram/ui/v1/AndroidAttributes;", "ios_attributes", "Lmicrogram/ui/v1/IosAttributes;", "name", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lmicrogram/ui/v1/LoggingContext;Ljava/lang/String;Lmicrogram/ui/v1/NavigationBarConfiguration;Lmicrogram/ui/v1/Theme;Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColor;Lmicrogram/ui/v1/AndroidAttributes;Lmicrogram/ui/v1/IosAttributes;Ljava/lang/String;Lokio/ByteString;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContext;", "getTitle", "()Ljava/lang/String;", "getNav_config", "()Lmicrogram/ui/v1/NavigationBarConfiguration;", "getTheme", "()Lmicrogram/ui/v1/Theme;", "getCanvas_url", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getAndroid_attributes", "()Lmicrogram/ui/v1/AndroidAttributes;", "getIos_attributes", "()Lmicrogram/ui/v1/IosAttributes;", "getName", "getFooter", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HtmlCanvasScreenContent extends Message {

    @JvmField
    public static final ProtoAdapter<HtmlCanvasScreenContent> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.AndroidAttributes#ADAPTER", jsonName = "androidAttributes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final AndroidAttributes android_attributes;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 7, tag = 8)
    private final ThemedColor background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "canvasUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String canvas_url;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<UIComponent> footer;

    @WireField(adapter = "microgram.ui.v1.IosAttributes#ADAPTER", jsonName = "iosAttributes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final IosAttributes ios_attributes;

    @WireField(adapter = "microgram.ui.v1.LoggingContext#ADAPTER", jsonName = RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final LoggingContext logging_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    private final String name;

    @WireField(adapter = "microgram.ui.v1.NavigationBarConfiguration#ADAPTER", jsonName = "navConfig", schemaIndex = 3, tag = 4)
    private final NavigationBarConfiguration nav_config;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Screen screen;

    @WireField(adapter = "microgram.ui.v1.Theme#ADAPTER", schemaIndex = 4, tag = 5)
    private final Theme theme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String title;

    public HtmlCanvasScreenContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29246newBuilder();
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final LoggingContext getLogging_context() {
        return this.logging_context;
    }

    public final String getTitle() {
        return this.title;
    }

    public final NavigationBarConfiguration getNav_config() {
        return this.nav_config;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final String getCanvas_url() {
        return this.canvas_url;
    }

    public /* synthetic */ HtmlCanvasScreenContent(Screen screen, LoggingContext loggingContext, String str, NavigationBarConfiguration navigationBarConfiguration, Theme theme, String str2, List list, ThemedColor themedColor, AndroidAttributes androidAttributes, IosAttributes iosAttributes, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : screen, (i & 2) != 0 ? null : loggingContext, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : navigationBarConfiguration, (i & 16) != 0 ? null : theme, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : themedColor, (i & 256) != 0 ? null : androidAttributes, (i & 512) != 0 ? null : iosAttributes, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ThemedColor getBackground_color() {
        return this.background_color;
    }

    public final AndroidAttributes getAndroid_attributes() {
        return this.android_attributes;
    }

    public final IosAttributes getIos_attributes() {
        return this.ios_attributes;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlCanvasScreenContent(Screen screen, LoggingContext loggingContext, String str, NavigationBarConfiguration navigationBarConfiguration, Theme theme, String canvas_url, List<UIComponent> footer, ThemedColor themedColor, AndroidAttributes androidAttributes, IosAttributes iosAttributes, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(canvas_url, "canvas_url");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen = screen;
        this.logging_context = loggingContext;
        this.title = str;
        this.nav_config = navigationBarConfiguration;
        this.theme = theme;
        this.canvas_url = canvas_url;
        this.background_color = themedColor;
        this.android_attributes = androidAttributes;
        this.ios_attributes = iosAttributes;
        this.name = str2;
        this.footer = Internal.immutableCopyOf(Footer.f10637type, footer);
    }

    public final List<UIComponent> getFooter() {
        return this.footer;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29246newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HtmlCanvasScreenContent)) {
            return false;
        }
        HtmlCanvasScreenContent htmlCanvasScreenContent = (HtmlCanvasScreenContent) other;
        return Intrinsics.areEqual(unknownFields(), htmlCanvasScreenContent.unknownFields()) && Intrinsics.areEqual(this.screen, htmlCanvasScreenContent.screen) && Intrinsics.areEqual(this.logging_context, htmlCanvasScreenContent.logging_context) && Intrinsics.areEqual(this.title, htmlCanvasScreenContent.title) && Intrinsics.areEqual(this.nav_config, htmlCanvasScreenContent.nav_config) && Intrinsics.areEqual(this.theme, htmlCanvasScreenContent.theme) && Intrinsics.areEqual(this.canvas_url, htmlCanvasScreenContent.canvas_url) && Intrinsics.areEqual(this.footer, htmlCanvasScreenContent.footer) && Intrinsics.areEqual(this.background_color, htmlCanvasScreenContent.background_color) && Intrinsics.areEqual(this.android_attributes, htmlCanvasScreenContent.android_attributes) && Intrinsics.areEqual(this.ios_attributes, htmlCanvasScreenContent.ios_attributes) && Intrinsics.areEqual(this.name, htmlCanvasScreenContent.name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Screen screen = this.screen;
        int iHashCode2 = (iHashCode + (screen != null ? screen.hashCode() : 0)) * 37;
        LoggingContext loggingContext = this.logging_context;
        int iHashCode3 = (iHashCode2 + (loggingContext != null ? loggingContext.hashCode() : 0)) * 37;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        NavigationBarConfiguration navigationBarConfiguration = this.nav_config;
        int iHashCode5 = (iHashCode4 + (navigationBarConfiguration != null ? navigationBarConfiguration.hashCode() : 0)) * 37;
        Theme theme = this.theme;
        int iHashCode6 = (((((iHashCode5 + (theme != null ? theme.hashCode() : 0)) * 37) + this.canvas_url.hashCode()) * 37) + this.footer.hashCode()) * 37;
        ThemedColor themedColor = this.background_color;
        int iHashCode7 = (iHashCode6 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        AndroidAttributes androidAttributes = this.android_attributes;
        int iHashCode8 = (iHashCode7 + (androidAttributes != null ? androidAttributes.hashCode() : 0)) * 37;
        IosAttributes iosAttributes = this.ios_attributes;
        int iHashCode9 = (iHashCode8 + (iosAttributes != null ? iosAttributes.hashCode() : 0)) * 37;
        String str2 = this.name;
        int iHashCode10 = iHashCode9 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Screen screen = this.screen;
        if (screen != null) {
            arrayList.add("screen=" + screen);
        }
        LoggingContext loggingContext = this.logging_context;
        if (loggingContext != null) {
            arrayList.add("logging_context=" + loggingContext);
        }
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        NavigationBarConfiguration navigationBarConfiguration = this.nav_config;
        if (navigationBarConfiguration != null) {
            arrayList.add("nav_config=" + navigationBarConfiguration);
        }
        Theme theme = this.theme;
        if (theme != null) {
            arrayList.add("theme=" + theme);
        }
        arrayList.add("canvas_url=" + Internal.sanitize(this.canvas_url));
        if (!this.footer.isEmpty()) {
            arrayList.add("footer=" + this.footer);
        }
        ThemedColor themedColor = this.background_color;
        if (themedColor != null) {
            arrayList.add("background_color=" + themedColor);
        }
        AndroidAttributes androidAttributes = this.android_attributes;
        if (androidAttributes != null) {
            arrayList.add("android_attributes=" + androidAttributes);
        }
        IosAttributes iosAttributes = this.ios_attributes;
        if (iosAttributes != null) {
            arrayList.add("ios_attributes=" + iosAttributes);
        }
        String str2 = this.name;
        if (str2 != null) {
            arrayList.add("name=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HtmlCanvasScreenContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HtmlCanvasScreenContent copy$default(HtmlCanvasScreenContent htmlCanvasScreenContent, Screen screen, LoggingContext loggingContext, String str, NavigationBarConfiguration navigationBarConfiguration, Theme theme, String str2, List list, ThemedColor themedColor, AndroidAttributes androidAttributes, IosAttributes iosAttributes, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = htmlCanvasScreenContent.screen;
        }
        if ((i & 2) != 0) {
            loggingContext = htmlCanvasScreenContent.logging_context;
        }
        if ((i & 4) != 0) {
            str = htmlCanvasScreenContent.title;
        }
        if ((i & 8) != 0) {
            navigationBarConfiguration = htmlCanvasScreenContent.nav_config;
        }
        if ((i & 16) != 0) {
            theme = htmlCanvasScreenContent.theme;
        }
        if ((i & 32) != 0) {
            str2 = htmlCanvasScreenContent.canvas_url;
        }
        if ((i & 64) != 0) {
            list = htmlCanvasScreenContent.footer;
        }
        if ((i & 128) != 0) {
            themedColor = htmlCanvasScreenContent.background_color;
        }
        if ((i & 256) != 0) {
            androidAttributes = htmlCanvasScreenContent.android_attributes;
        }
        if ((i & 512) != 0) {
            iosAttributes = htmlCanvasScreenContent.ios_attributes;
        }
        if ((i & 1024) != 0) {
            str3 = htmlCanvasScreenContent.name;
        }
        if ((i & 2048) != 0) {
            byteString = htmlCanvasScreenContent.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        AndroidAttributes androidAttributes2 = androidAttributes;
        IosAttributes iosAttributes2 = iosAttributes;
        List list2 = list;
        ThemedColor themedColor2 = themedColor;
        Theme theme2 = theme;
        String str5 = str2;
        return htmlCanvasScreenContent.copy(screen, loggingContext, str, navigationBarConfiguration, theme2, str5, list2, themedColor2, androidAttributes2, iosAttributes2, str4, byteString2);
    }

    public final HtmlCanvasScreenContent copy(Screen screen, LoggingContext logging_context, String title, NavigationBarConfiguration nav_config, Theme theme, String canvas_url, List<UIComponent> footer, ThemedColor background_color, AndroidAttributes android_attributes, IosAttributes ios_attributes, String name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(canvas_url, "canvas_url");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HtmlCanvasScreenContent(screen, logging_context, title, nav_config, theme, canvas_url, footer, background_color, android_attributes, ios_attributes, name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HtmlCanvasScreenContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HtmlCanvasScreenContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.HtmlCanvasScreenContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HtmlCanvasScreenContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getScreen() != null) {
                    size += Screen.ADAPTER.encodedSizeWithTag(1, value.getScreen());
                }
                if (value.getLogging_context() != null) {
                    size += LoggingContext.ADAPTER.encodedSizeWithTag(2, value.getLogging_context());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getTitle()) + NavigationBarConfiguration.ADAPTER.encodedSizeWithTag(4, value.getNav_config()) + Theme.ADAPTER.encodedSizeWithTag(5, value.getTheme());
                if (!Intrinsics.areEqual(value.getCanvas_url(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getCanvas_url());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + UIComponent.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getFooter()) + ThemedColor.ADAPTER.encodedSizeWithTag(8, value.getBackground_color());
                if (value.getAndroid_attributes() != null) {
                    iEncodedSizeWithTag2 += AndroidAttributes.ADAPTER.encodedSizeWithTag(9, value.getAndroid_attributes());
                }
                if (value.getIos_attributes() != null) {
                    iEncodedSizeWithTag2 += IosAttributes.ADAPTER.encodedSizeWithTag(10, value.getIos_attributes());
                }
                return iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(11, value.getName());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HtmlCanvasScreenContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
                }
                if (value.getLogging_context() != null) {
                    LoggingContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getLogging_context());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                NavigationBarConfiguration.ADAPTER.encodeWithTag(writer, 4, (int) value.getNav_config());
                Theme.ADAPTER.encodeWithTag(writer, 5, (int) value.getTheme());
                if (!Intrinsics.areEqual(value.getCanvas_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getCanvas_url());
                }
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFooter());
                ThemedColor.ADAPTER.encodeWithTag(writer, 8, (int) value.getBackground_color());
                if (value.getAndroid_attributes() != null) {
                    AndroidAttributes.ADAPTER.encodeWithTag(writer, 9, (int) value.getAndroid_attributes());
                }
                if (value.getIos_attributes() != null) {
                    IosAttributes.ADAPTER.encodeWithTag(writer, 10, (int) value.getIos_attributes());
                }
                protoAdapter.encodeWithTag(writer, 11, (int) value.getName());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HtmlCanvasScreenContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getName());
                if (value.getIos_attributes() != null) {
                    IosAttributes.ADAPTER.encodeWithTag(writer, 10, (int) value.getIos_attributes());
                }
                if (value.getAndroid_attributes() != null) {
                    AndroidAttributes.ADAPTER.encodeWithTag(writer, 9, (int) value.getAndroid_attributes());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 8, (int) value.getBackground_color());
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFooter());
                if (!Intrinsics.areEqual(value.getCanvas_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getCanvas_url());
                }
                Theme.ADAPTER.encodeWithTag(writer, 5, (int) value.getTheme());
                NavigationBarConfiguration.ADAPTER.encodeWithTag(writer, 4, (int) value.getNav_config());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                if (value.getLogging_context() != null) {
                    LoggingContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getLogging_context());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HtmlCanvasScreenContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Screen screenDecode = null;
                String strDecode = null;
                NavigationBarConfiguration navigationBarConfigurationDecode = null;
                Theme themeDecode = null;
                ThemedColor themedColorDecode = null;
                AndroidAttributes androidAttributesDecode = null;
                IosAttributes iosAttributesDecode = null;
                String strDecode2 = null;
                String strDecode3 = "";
                LoggingContext loggingContextDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                screenDecode = Screen.ADAPTER.decode(reader);
                                break;
                            case 2:
                                loggingContextDecode = LoggingContext.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                navigationBarConfigurationDecode = NavigationBarConfiguration.ADAPTER.decode(reader);
                                break;
                            case 5:
                                themeDecode = Theme.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                arrayList.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 8:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 9:
                                androidAttributesDecode = AndroidAttributes.ADAPTER.decode(reader);
                                break;
                            case 10:
                                iosAttributesDecode = IosAttributes.ADAPTER.decode(reader);
                                break;
                            case 11:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new HtmlCanvasScreenContent(screenDecode, loggingContextDecode, strDecode, navigationBarConfigurationDecode, themeDecode, strDecode3, arrayList, themedColorDecode, androidAttributesDecode, iosAttributesDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HtmlCanvasScreenContent redact(HtmlCanvasScreenContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Screen screen = value.getScreen();
                Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                LoggingContext logging_context = value.getLogging_context();
                LoggingContext loggingContextRedact = logging_context != null ? LoggingContext.ADAPTER.redact(logging_context) : null;
                NavigationBarConfiguration nav_config = value.getNav_config();
                NavigationBarConfiguration navigationBarConfigurationRedact = nav_config != null ? NavigationBarConfiguration.ADAPTER.redact(nav_config) : null;
                Theme theme = value.getTheme();
                Theme themeRedact = theme != null ? Theme.ADAPTER.redact(theme) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getFooter(), UIComponent.ADAPTER);
                ThemedColor background_color = value.getBackground_color();
                ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                AndroidAttributes android_attributes = value.getAndroid_attributes();
                AndroidAttributes androidAttributesRedact = android_attributes != null ? AndroidAttributes.ADAPTER.redact(android_attributes) : null;
                IosAttributes ios_attributes = value.getIos_attributes();
                return HtmlCanvasScreenContent.copy$default(value, screenRedact, loggingContextRedact, null, navigationBarConfigurationRedact, themeRedact, null, listM26823redactElements, themedColorRedact, androidAttributesRedact, ios_attributes != null ? IosAttributes.ADAPTER.redact(ios_attributes) : null, null, ByteString.EMPTY, 1060, null);
            }
        };
    }
}
