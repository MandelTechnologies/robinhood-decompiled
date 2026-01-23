package microgram.p507ui.p508v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: StandardScreenContent.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00102\u001a\u00020\u0002H\u0017J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0096\u0002J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\bH\u0016J¬\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContent;", "Lcom/squareup/wire/Message;", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "logging_context", "Lmicrogram/ui/v1/LoggingContext;", "title", "", "nav_config", "Lmicrogram/ui/v1/NavigationBarConfiguration;", "theme", "Lmicrogram/ui/v1/Theme;", "header", "", "Lrh_server_driven_ui/v1/UIComponent;", CarResultComposable2.BODY, Footer.f10637type, "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "android_attributes", "Lmicrogram/ui/v1/AndroidAttributes;", "ios_attributes", "Lmicrogram/ui/v1/IosAttributes;", "name", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lmicrogram/ui/v1/LoggingContext;Ljava/lang/String;Lmicrogram/ui/v1/NavigationBarConfiguration;Lmicrogram/ui/v1/Theme;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColor;Lmicrogram/ui/v1/AndroidAttributes;Lmicrogram/ui/v1/IosAttributes;Ljava/lang/String;Lokio/ByteString;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContext;", "getTitle", "()Ljava/lang/String;", "getNav_config", "()Lmicrogram/ui/v1/NavigationBarConfiguration;", "getTheme", "()Lmicrogram/ui/v1/Theme;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getAndroid_attributes", "()Lmicrogram/ui/v1/AndroidAttributes;", "getIos_attributes", "()Lmicrogram/ui/v1/IosAttributes;", "getName", "getHeader", "()Ljava/util/List;", "getBody", "getFooter", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StandardScreenContent extends Message {

    @JvmField
    public static final ProtoAdapter<StandardScreenContent> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.AndroidAttributes#ADAPTER", jsonName = "androidAttributes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final AndroidAttributes android_attributes;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 8, tag = 9)
    private final ThemedColor background_color;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<UIComponent> body;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<UIComponent> footer;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<UIComponent> header;

    @WireField(adapter = "microgram.ui.v1.IosAttributes#ADAPTER", jsonName = "iosAttributes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final IosAttributes ios_attributes;

    @WireField(adapter = "microgram.ui.v1.LoggingContext#ADAPTER", jsonName = RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final LoggingContext logging_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    private final String name;

    @WireField(adapter = "microgram.ui.v1.NavigationBarConfiguration#ADAPTER", jsonName = "navConfig", schemaIndex = 3, tag = 4)
    private final NavigationBarConfiguration nav_config;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Screen screen;

    @WireField(adapter = "microgram.ui.v1.Theme#ADAPTER", schemaIndex = 4, tag = 5)
    private final Theme theme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String title;

    public StandardScreenContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29298newBuilder();
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

    public /* synthetic */ StandardScreenContent(Screen screen, LoggingContext loggingContext, String str, NavigationBarConfiguration navigationBarConfiguration, Theme theme, List list, List list2, List list3, ThemedColor themedColor, AndroidAttributes androidAttributes, IosAttributes iosAttributes, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : screen, (i & 2) != 0 ? null : loggingContext, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : navigationBarConfiguration, (i & 16) != 0 ? null : theme, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? null : themedColor, (i & 512) != 0 ? null : androidAttributes, (i & 1024) != 0 ? null : iosAttributes, (i & 2048) == 0 ? str2 : null, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
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
    public StandardScreenContent(Screen screen, LoggingContext loggingContext, String str, NavigationBarConfiguration navigationBarConfiguration, Theme theme, List<UIComponent> header, List<UIComponent> body, List<UIComponent> footer, ThemedColor themedColor, AndroidAttributes androidAttributes, IosAttributes iosAttributes, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen = screen;
        this.logging_context = loggingContext;
        this.title = str;
        this.nav_config = navigationBarConfiguration;
        this.theme = theme;
        this.background_color = themedColor;
        this.android_attributes = androidAttributes;
        this.ios_attributes = iosAttributes;
        this.name = str2;
        this.header = Internal.immutableCopyOf("header", header);
        this.body = Internal.immutableCopyOf(CarResultComposable2.BODY, body);
        this.footer = Internal.immutableCopyOf(Footer.f10637type, footer);
    }

    public final List<UIComponent> getHeader() {
        return this.header;
    }

    public final List<UIComponent> getBody() {
        return this.body;
    }

    public final List<UIComponent> getFooter() {
        return this.footer;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29298newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StandardScreenContent)) {
            return false;
        }
        StandardScreenContent standardScreenContent = (StandardScreenContent) other;
        return Intrinsics.areEqual(unknownFields(), standardScreenContent.unknownFields()) && Intrinsics.areEqual(this.screen, standardScreenContent.screen) && Intrinsics.areEqual(this.logging_context, standardScreenContent.logging_context) && Intrinsics.areEqual(this.title, standardScreenContent.title) && Intrinsics.areEqual(this.nav_config, standardScreenContent.nav_config) && Intrinsics.areEqual(this.theme, standardScreenContent.theme) && Intrinsics.areEqual(this.header, standardScreenContent.header) && Intrinsics.areEqual(this.body, standardScreenContent.body) && Intrinsics.areEqual(this.footer, standardScreenContent.footer) && Intrinsics.areEqual(this.background_color, standardScreenContent.background_color) && Intrinsics.areEqual(this.android_attributes, standardScreenContent.android_attributes) && Intrinsics.areEqual(this.ios_attributes, standardScreenContent.ios_attributes) && Intrinsics.areEqual(this.name, standardScreenContent.name);
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
        int iHashCode6 = (((((((iHashCode5 + (theme != null ? theme.hashCode() : 0)) * 37) + this.header.hashCode()) * 37) + this.body.hashCode()) * 37) + this.footer.hashCode()) * 37;
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
        if (!this.header.isEmpty()) {
            arrayList.add("header=" + this.header);
        }
        if (!this.body.isEmpty()) {
            arrayList.add("body=" + this.body);
        }
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "StandardScreenContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StandardScreenContent copy$default(StandardScreenContent standardScreenContent, Screen screen, LoggingContext loggingContext, String str, NavigationBarConfiguration navigationBarConfiguration, Theme theme, List list, List list2, List list3, ThemedColor themedColor, AndroidAttributes androidAttributes, IosAttributes iosAttributes, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = standardScreenContent.screen;
        }
        return standardScreenContent.copy(screen, (i & 2) != 0 ? standardScreenContent.logging_context : loggingContext, (i & 4) != 0 ? standardScreenContent.title : str, (i & 8) != 0 ? standardScreenContent.nav_config : navigationBarConfiguration, (i & 16) != 0 ? standardScreenContent.theme : theme, (i & 32) != 0 ? standardScreenContent.header : list, (i & 64) != 0 ? standardScreenContent.body : list2, (i & 128) != 0 ? standardScreenContent.footer : list3, (i & 256) != 0 ? standardScreenContent.background_color : themedColor, (i & 512) != 0 ? standardScreenContent.android_attributes : androidAttributes, (i & 1024) != 0 ? standardScreenContent.ios_attributes : iosAttributes, (i & 2048) != 0 ? standardScreenContent.name : str2, (i & 4096) != 0 ? standardScreenContent.unknownFields() : byteString);
    }

    public final StandardScreenContent copy(Screen screen, LoggingContext logging_context, String title, NavigationBarConfiguration nav_config, Theme theme, List<UIComponent> header, List<UIComponent> body, List<UIComponent> footer, ThemedColor background_color, AndroidAttributes android_attributes, IosAttributes ios_attributes, String name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StandardScreenContent(screen, logging_context, title, nav_config, theme, header, body, footer, background_color, android_attributes, ios_attributes, name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StandardScreenContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StandardScreenContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.StandardScreenContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StandardScreenContent value) {
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
                ProtoAdapter<UIComponent> protoAdapter2 = UIComponent.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(6, value.getHeader()) + protoAdapter2.asRepeated().encodedSizeWithTag(7, value.getBody()) + protoAdapter2.asRepeated().encodedSizeWithTag(8, value.getFooter()) + ThemedColor.ADAPTER.encodedSizeWithTag(9, value.getBackground_color());
                if (value.getAndroid_attributes() != null) {
                    iEncodedSizeWithTag2 += AndroidAttributes.ADAPTER.encodedSizeWithTag(10, value.getAndroid_attributes());
                }
                if (value.getIos_attributes() != null) {
                    iEncodedSizeWithTag2 += IosAttributes.ADAPTER.encodedSizeWithTag(11, value.getIos_attributes());
                }
                return iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(12, value.getName());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StandardScreenContent value) throws IOException {
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
                ProtoAdapter<UIComponent> protoAdapter2 = UIComponent.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 6, (int) value.getHeader());
                protoAdapter2.asRepeated().encodeWithTag(writer, 7, (int) value.getBody());
                protoAdapter2.asRepeated().encodeWithTag(writer, 8, (int) value.getFooter());
                ThemedColor.ADAPTER.encodeWithTag(writer, 9, (int) value.getBackground_color());
                if (value.getAndroid_attributes() != null) {
                    AndroidAttributes.ADAPTER.encodeWithTag(writer, 10, (int) value.getAndroid_attributes());
                }
                if (value.getIos_attributes() != null) {
                    IosAttributes.ADAPTER.encodeWithTag(writer, 11, (int) value.getIos_attributes());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getName());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StandardScreenContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 12, (int) value.getName());
                if (value.getIos_attributes() != null) {
                    IosAttributes.ADAPTER.encodeWithTag(writer, 11, (int) value.getIos_attributes());
                }
                if (value.getAndroid_attributes() != null) {
                    AndroidAttributes.ADAPTER.encodeWithTag(writer, 10, (int) value.getAndroid_attributes());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 9, (int) value.getBackground_color());
                ProtoAdapter<UIComponent> protoAdapter2 = UIComponent.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 8, (int) value.getFooter());
                protoAdapter2.asRepeated().encodeWithTag(writer, 7, (int) value.getBody());
                protoAdapter2.asRepeated().encodeWithTag(writer, 6, (int) value.getHeader());
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
            public StandardScreenContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Screen screenDecode = null;
                LoggingContext loggingContextDecode = null;
                String strDecode = null;
                NavigationBarConfiguration navigationBarConfigurationDecode = null;
                Theme themeDecode = null;
                ThemedColor themedColorDecode = null;
                AndroidAttributes androidAttributesDecode = null;
                IosAttributes iosAttributesDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    Screen screen = screenDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                screenDecode = Screen.ADAPTER.decode(reader);
                                continue;
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
                                arrayList.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 7:
                                arrayList2.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 8:
                                arrayList3.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 9:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 10:
                                androidAttributesDecode = AndroidAttributes.ADAPTER.decode(reader);
                                break;
                            case 11:
                                iosAttributesDecode = IosAttributes.ADAPTER.decode(reader);
                                break;
                            case 12:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        screenDecode = screen;
                    } else {
                        return new StandardScreenContent(screen, loggingContextDecode, strDecode, navigationBarConfigurationDecode, themeDecode, arrayList, arrayList2, arrayList3, themedColorDecode, androidAttributesDecode, iosAttributesDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StandardScreenContent redact(StandardScreenContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Screen screen = value.getScreen();
                Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                LoggingContext logging_context = value.getLogging_context();
                LoggingContext loggingContextRedact = logging_context != null ? LoggingContext.ADAPTER.redact(logging_context) : null;
                NavigationBarConfiguration nav_config = value.getNav_config();
                NavigationBarConfiguration navigationBarConfigurationRedact = nav_config != null ? NavigationBarConfiguration.ADAPTER.redact(nav_config) : null;
                Theme theme = value.getTheme();
                Theme themeRedact = theme != null ? Theme.ADAPTER.redact(theme) : null;
                List<UIComponent> header = value.getHeader();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(header, protoAdapter);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getBody(), protoAdapter);
                List listM26823redactElements3 = Internal.m26823redactElements(value.getFooter(), protoAdapter);
                ThemedColor background_color = value.getBackground_color();
                ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                AndroidAttributes android_attributes = value.getAndroid_attributes();
                AndroidAttributes androidAttributesRedact = android_attributes != null ? AndroidAttributes.ADAPTER.redact(android_attributes) : null;
                IosAttributes ios_attributes = value.getIos_attributes();
                return StandardScreenContent.copy$default(value, screenRedact, loggingContextRedact, null, navigationBarConfigurationRedact, themeRedact, listM26823redactElements, listM26823redactElements2, listM26823redactElements3, themedColorRedact, androidAttributesRedact, ios_attributes != null ? IosAttributes.ADAPTER.redact(ios_attributes) : null, null, ByteString.EMPTY, 2052, null);
            }
        };
    }
}
