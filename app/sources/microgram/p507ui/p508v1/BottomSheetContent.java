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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: BottomSheetContent.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010.\u001a\u00020\u0002H\u0017J\u0013\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020\tH\u0016J\b\u00103\u001a\u00020\fH\u0016J\u0095\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u00105R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,¨\u00067"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContent;", "Lcom/squareup/wire/Message;", "", "background", "Lmicrogram/ui/v1/BottomSheetBackground;", CarResultComposable2.BODY, "", "Lrh_server_driven_ui/v1/UIComponent;", "corner_radius", "", Footer.f10637type, "name", "", "android_can_dismiss_with_back_press", "", "cannot_passively_dismiss", "theme", "Lmicrogram/ui/v1/Theme;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "logging_context", "Lmicrogram/ui/v1/LoggingContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/BottomSheetBackground;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmicrogram/ui/v1/Theme;Lcom/robinhood/rosetta/eventlogging/Screen;Lmicrogram/ui/v1/LoggingContext;Lokio/ByteString;)V", "getBackground", "()Lmicrogram/ui/v1/BottomSheetBackground;", "getCorner_radius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getAndroid_can_dismiss_with_back_press", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCannot_passively_dismiss", "getTheme", "()Lmicrogram/ui/v1/Theme;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContext;", "getBody", "()Ljava/util/List;", "getFooter", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Lmicrogram/ui/v1/BottomSheetBackground;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmicrogram/ui/v1/Theme;Lcom/robinhood/rosetta/eventlogging/Screen;Lmicrogram/ui/v1/LoggingContext;Lokio/ByteString;)Lmicrogram/ui/v1/BottomSheetContent;", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class BottomSheetContent extends Message {

    @JvmField
    public static final ProtoAdapter<BottomSheetContent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "androidCanDismissWithBackPress", schemaIndex = 5, tag = 10)
    private final Boolean android_can_dismiss_with_back_press;

    @WireField(adapter = "microgram.ui.v1.BottomSheetBackground#ADAPTER", schemaIndex = 0, tag = 1)
    private final BottomSheetBackground background;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<UIComponent> body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cannotPassivelyDismiss", schemaIndex = 6, tag = 6)
    private final Boolean cannot_passively_dismiss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cornerRadius", schemaIndex = 2, tag = 3)
    private final Integer corner_radius;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<UIComponent> footer;

    @WireField(adapter = "microgram.ui.v1.LoggingContext#ADAPTER", jsonName = RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 9)
    private final LoggingContext logging_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final Screen screen;

    @WireField(adapter = "microgram.ui.v1.Theme#ADAPTER", schemaIndex = 7, tag = 7)
    private final Theme theme;

    public BottomSheetContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29239newBuilder();
    }

    public final BottomSheetBackground getBackground() {
        return this.background;
    }

    public /* synthetic */ BottomSheetContent(BottomSheetBackground bottomSheetBackground, List list, Integer num, List list2, String str, Boolean bool, Boolean bool2, Theme theme, Screen screen, LoggingContext loggingContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomSheetBackground, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : theme, (i & 256) != 0 ? null : screen, (i & 512) != 0 ? null : loggingContext, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Integer getCorner_radius() {
        return this.corner_radius;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getAndroid_can_dismiss_with_back_press() {
        return this.android_can_dismiss_with_back_press;
    }

    public final Boolean getCannot_passively_dismiss() {
        return this.cannot_passively_dismiss;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final LoggingContext getLogging_context() {
        return this.logging_context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContent(BottomSheetBackground bottomSheetBackground, List<UIComponent> body, Integer num, List<UIComponent> footer, String str, Boolean bool, Boolean bool2, Theme theme, Screen screen, LoggingContext loggingContext, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.background = bottomSheetBackground;
        this.corner_radius = num;
        this.name = str;
        this.android_can_dismiss_with_back_press = bool;
        this.cannot_passively_dismiss = bool2;
        this.theme = theme;
        this.screen = screen;
        this.logging_context = loggingContext;
        this.body = Internal.immutableCopyOf(CarResultComposable2.BODY, body);
        this.footer = Internal.immutableCopyOf(Footer.f10637type, footer);
    }

    public final List<UIComponent> getBody() {
        return this.body;
    }

    public final List<UIComponent> getFooter() {
        return this.footer;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29239newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BottomSheetContent)) {
            return false;
        }
        BottomSheetContent bottomSheetContent = (BottomSheetContent) other;
        return Intrinsics.areEqual(unknownFields(), bottomSheetContent.unknownFields()) && Intrinsics.areEqual(this.background, bottomSheetContent.background) && Intrinsics.areEqual(this.body, bottomSheetContent.body) && Intrinsics.areEqual(this.corner_radius, bottomSheetContent.corner_radius) && Intrinsics.areEqual(this.footer, bottomSheetContent.footer) && Intrinsics.areEqual(this.name, bottomSheetContent.name) && Intrinsics.areEqual(this.android_can_dismiss_with_back_press, bottomSheetContent.android_can_dismiss_with_back_press) && Intrinsics.areEqual(this.cannot_passively_dismiss, bottomSheetContent.cannot_passively_dismiss) && Intrinsics.areEqual(this.theme, bottomSheetContent.theme) && Intrinsics.areEqual(this.screen, bottomSheetContent.screen) && Intrinsics.areEqual(this.logging_context, bottomSheetContent.logging_context);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BottomSheetBackground bottomSheetBackground = this.background;
        int iHashCode2 = (((iHashCode + (bottomSheetBackground != null ? bottomSheetBackground.hashCode() : 0)) * 37) + this.body.hashCode()) * 37;
        Integer num = this.corner_radius;
        int iHashCode3 = (((iHashCode2 + (num != null ? num.hashCode() : 0)) * 37) + this.footer.hashCode()) * 37;
        String str = this.name;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.android_can_dismiss_with_back_press;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.cannot_passively_dismiss;
        int iHashCode6 = (iHashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Theme theme = this.theme;
        int iHashCode7 = (iHashCode6 + (theme != null ? theme.hashCode() : 0)) * 37;
        Screen screen = this.screen;
        int iHashCode8 = (iHashCode7 + (screen != null ? screen.hashCode() : 0)) * 37;
        LoggingContext loggingContext = this.logging_context;
        int iHashCode9 = iHashCode8 + (loggingContext != null ? loggingContext.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BottomSheetBackground bottomSheetBackground = this.background;
        if (bottomSheetBackground != null) {
            arrayList.add("background=" + bottomSheetBackground);
        }
        if (!this.body.isEmpty()) {
            arrayList.add("body=" + this.body);
        }
        Integer num = this.corner_radius;
        if (num != null) {
            arrayList.add("corner_radius=" + num);
        }
        if (!this.footer.isEmpty()) {
            arrayList.add("footer=" + this.footer);
        }
        String str = this.name;
        if (str != null) {
            arrayList.add("name=" + Internal.sanitize(str));
        }
        Boolean bool = this.android_can_dismiss_with_back_press;
        if (bool != null) {
            arrayList.add("android_can_dismiss_with_back_press=" + bool);
        }
        Boolean bool2 = this.cannot_passively_dismiss;
        if (bool2 != null) {
            arrayList.add("cannot_passively_dismiss=" + bool2);
        }
        Theme theme = this.theme;
        if (theme != null) {
            arrayList.add("theme=" + theme);
        }
        Screen screen = this.screen;
        if (screen != null) {
            arrayList.add("screen=" + screen);
        }
        LoggingContext loggingContext = this.logging_context;
        if (loggingContext != null) {
            arrayList.add("logging_context=" + loggingContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BottomSheetContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BottomSheetContent copy$default(BottomSheetContent bottomSheetContent, BottomSheetBackground bottomSheetBackground, List list, Integer num, List list2, String str, Boolean bool, Boolean bool2, Theme theme, Screen screen, LoggingContext loggingContext, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bottomSheetBackground = bottomSheetContent.background;
        }
        if ((i & 2) != 0) {
            list = bottomSheetContent.body;
        }
        if ((i & 4) != 0) {
            num = bottomSheetContent.corner_radius;
        }
        if ((i & 8) != 0) {
            list2 = bottomSheetContent.footer;
        }
        if ((i & 16) != 0) {
            str = bottomSheetContent.name;
        }
        if ((i & 32) != 0) {
            bool = bottomSheetContent.android_can_dismiss_with_back_press;
        }
        if ((i & 64) != 0) {
            bool2 = bottomSheetContent.cannot_passively_dismiss;
        }
        if ((i & 128) != 0) {
            theme = bottomSheetContent.theme;
        }
        if ((i & 256) != 0) {
            screen = bottomSheetContent.screen;
        }
        if ((i & 512) != 0) {
            loggingContext = bottomSheetContent.logging_context;
        }
        if ((i & 1024) != 0) {
            byteString = bottomSheetContent.unknownFields();
        }
        LoggingContext loggingContext2 = loggingContext;
        ByteString byteString2 = byteString;
        Theme theme2 = theme;
        Screen screen2 = screen;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str2 = str;
        Integer num2 = num;
        return bottomSheetContent.copy(bottomSheetBackground, list, num2, list2, str2, bool3, bool4, theme2, screen2, loggingContext2, byteString2);
    }

    public final BottomSheetContent copy(BottomSheetBackground background, List<UIComponent> body, Integer corner_radius, List<UIComponent> footer, String name, Boolean android_can_dismiss_with_back_press, Boolean cannot_passively_dismiss, Theme theme, Screen screen, LoggingContext logging_context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BottomSheetContent(background, body, corner_radius, footer, name, android_can_dismiss_with_back_press, cannot_passively_dismiss, theme, screen, logging_context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BottomSheetContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BottomSheetContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BottomSheetContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + BottomSheetBackground.ADAPTER.encodedSizeWithTag(1, value.getBackground());
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getBody()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getCorner_radius()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getFooter()) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getName());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(10, value.getAndroid_can_dismiss_with_back_press()) + protoAdapter2.encodedSizeWithTag(6, value.getCannot_passively_dismiss()) + Theme.ADAPTER.encodedSizeWithTag(7, value.getTheme());
                if (value.getScreen() != null) {
                    iEncodedSizeWithTag2 += Screen.ADAPTER.encodedSizeWithTag(8, value.getScreen());
                }
                return value.getLogging_context() != null ? iEncodedSizeWithTag2 + LoggingContext.ADAPTER.encodedSizeWithTag(9, value.getLogging_context()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BottomSheetContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetBackground.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackground());
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getBody());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getCorner_radius());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getFooter());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getAndroid_can_dismiss_with_back_press());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getCannot_passively_dismiss());
                Theme.ADAPTER.encodeWithTag(writer, 7, (int) value.getTheme());
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 8, (int) value.getScreen());
                }
                if (value.getLogging_context() != null) {
                    LoggingContext.ADAPTER.encodeWithTag(writer, 9, (int) value.getLogging_context());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BottomSheetContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLogging_context() != null) {
                    LoggingContext.ADAPTER.encodeWithTag(writer, 9, (int) value.getLogging_context());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 8, (int) value.getScreen());
                }
                Theme.ADAPTER.encodeWithTag(writer, 7, (int) value.getTheme());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getCannot_passively_dismiss());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getAndroid_can_dismiss_with_back_press());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                ProtoAdapter<UIComponent> protoAdapter2 = UIComponent.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 4, (int) value.getFooter());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getCorner_radius());
                protoAdapter2.asRepeated().encodeWithTag(writer, 2, (int) value.getBody());
                BottomSheetBackground.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackground());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                BottomSheetBackground bottomSheetBackgroundDecode = null;
                Integer numDecode = null;
                String strDecode = null;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                Theme themeDecode = null;
                Screen screenDecode = null;
                LoggingContext loggingContextDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                bottomSheetBackgroundDecode = BottomSheetBackground.ADAPTER.decode(reader);
                                break;
                            case 2:
                                arrayList.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 3:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 4:
                                arrayList2.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 7:
                                themeDecode = Theme.ADAPTER.decode(reader);
                                break;
                            case 8:
                                screenDecode = Screen.ADAPTER.decode(reader);
                                break;
                            case 9:
                                loggingContextDecode = LoggingContext.ADAPTER.decode(reader);
                                break;
                            case 10:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new BottomSheetContent(bottomSheetBackgroundDecode, arrayList, numDecode, arrayList2, strDecode, boolDecode, boolDecode2, themeDecode, screenDecode, loggingContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetContent redact(BottomSheetContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetBackground background = value.getBackground();
                BottomSheetBackground bottomSheetBackgroundRedact = background != null ? BottomSheetBackground.ADAPTER.redact(background) : null;
                List<UIComponent> body = value.getBody();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(body, protoAdapter);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getFooter(), protoAdapter);
                Theme theme = value.getTheme();
                Theme themeRedact = theme != null ? Theme.ADAPTER.redact(theme) : null;
                Screen screen = value.getScreen();
                Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                LoggingContext logging_context = value.getLogging_context();
                return BottomSheetContent.copy$default(value, bottomSheetBackgroundRedact, listM26823redactElements, null, listM26823redactElements2, null, null, null, themeRedact, screenRedact, logging_context != null ? LoggingContext.ADAPTER.redact(logging_context) : null, ByteString.EMPTY, 116, null);
            }
        };
    }
}
