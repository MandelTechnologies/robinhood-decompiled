package ventures.trailer.proto.p551v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: EarlyEscapeBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0007H\u0016JR\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006#"}, m3636d2 = {"Lventures/trailer/proto/v1/EarlyEscapeBottomSheet;", "Lcom/squareup/wire/Message;", "", "header", "Lrh_server_driven_ui/v1/UIComponent;", CarResultComposable2.BODY, "primary_cta_text", "", "secondary_cta_text", "calendar_event", "Lventures/trailer/proto/v1/CalendarEvent;", "instrument_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/String;Ljava/lang/String;Lventures/trailer/proto/v1/CalendarEvent;Ljava/lang/String;Lokio/ByteString;)V", "getHeader", "()Lrh_server_driven_ui/v1/UIComponent;", "getBody", "getPrimary_cta_text", "()Ljava/lang/String;", "getSecondary_cta_text", "getCalendar_event", "()Lventures/trailer/proto/v1/CalendarEvent;", "getInstrument_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class EarlyEscapeBottomSheet extends Message {

    @JvmField
    public static final ProtoAdapter<EarlyEscapeBottomSheet> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UIComponent body;

    @WireField(adapter = "ventures.trailer.proto.v1.CalendarEvent#ADAPTER", jsonName = "calendarEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CalendarEvent calendar_event;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String secondary_cta_text;

    public EarlyEscapeBottomSheet() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ EarlyEscapeBottomSheet(UIComponent uIComponent, UIComponent uIComponent2, String str, String str2, CalendarEvent calendarEvent, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : uIComponent2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : calendarEvent, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30034newBuilder();
    }

    public final UIComponent getHeader() {
        return this.header;
    }

    public final UIComponent getBody() {
        return this.body;
    }

    public final String getPrimary_cta_text() {
        return this.primary_cta_text;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    public final CalendarEvent getCalendar_event() {
        return this.calendar_event;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarlyEscapeBottomSheet(UIComponent uIComponent, UIComponent uIComponent2, String primary_cta_text, String secondary_cta_text, CalendarEvent calendarEvent, String instrument_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = uIComponent;
        this.body = uIComponent2;
        this.primary_cta_text = primary_cta_text;
        this.secondary_cta_text = secondary_cta_text;
        this.calendar_event = calendarEvent;
        this.instrument_id = instrument_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30034newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EarlyEscapeBottomSheet)) {
            return false;
        }
        EarlyEscapeBottomSheet earlyEscapeBottomSheet = (EarlyEscapeBottomSheet) other;
        return Intrinsics.areEqual(unknownFields(), earlyEscapeBottomSheet.unknownFields()) && Intrinsics.areEqual(this.header, earlyEscapeBottomSheet.header) && Intrinsics.areEqual(this.body, earlyEscapeBottomSheet.body) && Intrinsics.areEqual(this.primary_cta_text, earlyEscapeBottomSheet.primary_cta_text) && Intrinsics.areEqual(this.secondary_cta_text, earlyEscapeBottomSheet.secondary_cta_text) && Intrinsics.areEqual(this.calendar_event, earlyEscapeBottomSheet.calendar_event) && Intrinsics.areEqual(this.instrument_id, earlyEscapeBottomSheet.instrument_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.header;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        UIComponent uIComponent2 = this.body;
        int iHashCode3 = (((((iHashCode2 + (uIComponent2 != null ? uIComponent2.hashCode() : 0)) * 37) + this.primary_cta_text.hashCode()) * 37) + this.secondary_cta_text.hashCode()) * 37;
        CalendarEvent calendarEvent = this.calendar_event;
        int iHashCode4 = ((iHashCode3 + (calendarEvent != null ? calendarEvent.hashCode() : 0)) * 37) + this.instrument_id.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.header;
        if (uIComponent != null) {
            arrayList.add("header=" + uIComponent);
        }
        UIComponent uIComponent2 = this.body;
        if (uIComponent2 != null) {
            arrayList.add("body=" + uIComponent2);
        }
        arrayList.add("primary_cta_text=" + Internal.sanitize(this.primary_cta_text));
        arrayList.add("secondary_cta_text=" + Internal.sanitize(this.secondary_cta_text));
        CalendarEvent calendarEvent = this.calendar_event;
        if (calendarEvent != null) {
            arrayList.add("calendar_event=" + calendarEvent);
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarlyEscapeBottomSheet{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EarlyEscapeBottomSheet copy$default(EarlyEscapeBottomSheet earlyEscapeBottomSheet, UIComponent uIComponent, UIComponent uIComponent2, String str, String str2, CalendarEvent calendarEvent, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = earlyEscapeBottomSheet.header;
        }
        if ((i & 2) != 0) {
            uIComponent2 = earlyEscapeBottomSheet.body;
        }
        if ((i & 4) != 0) {
            str = earlyEscapeBottomSheet.primary_cta_text;
        }
        if ((i & 8) != 0) {
            str2 = earlyEscapeBottomSheet.secondary_cta_text;
        }
        if ((i & 16) != 0) {
            calendarEvent = earlyEscapeBottomSheet.calendar_event;
        }
        if ((i & 32) != 0) {
            str3 = earlyEscapeBottomSheet.instrument_id;
        }
        if ((i & 64) != 0) {
            byteString = earlyEscapeBottomSheet.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        CalendarEvent calendarEvent2 = calendarEvent;
        String str5 = str;
        return earlyEscapeBottomSheet.copy(uIComponent, uIComponent2, str5, str2, calendarEvent2, str4, byteString2);
    }

    public final EarlyEscapeBottomSheet copy(UIComponent header, UIComponent body, String primary_cta_text, String secondary_cta_text, CalendarEvent calendar_event2, String instrument_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EarlyEscapeBottomSheet(header, body, primary_cta_text, secondary_cta_text, calendar_event2, instrument_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EarlyEscapeBottomSheet.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EarlyEscapeBottomSheet>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.EarlyEscapeBottomSheet$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EarlyEscapeBottomSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHeader() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getHeader());
                }
                if (value.getBody() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(2, value.getBody());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSecondary_cta_text());
                }
                if (value.getCalendar_event() != null) {
                    size += CalendarEvent.ADAPTER.encodedSizeWithTag(5, value.getCalendar_event());
                }
                return !Intrinsics.areEqual(value.getInstrument_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getInstrument_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EarlyEscapeBottomSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHeader() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (value.getBody() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_cta_text());
                }
                if (value.getCalendar_event() != null) {
                    CalendarEvent.ADAPTER.encodeWithTag(writer, 5, (int) value.getCalendar_event());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInstrument_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EarlyEscapeBottomSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInstrument_id());
                }
                if (value.getCalendar_event() != null) {
                    CalendarEvent.ADAPTER.encodeWithTag(writer, 5, (int) value.getCalendar_event());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                }
                if (value.getBody() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (value.getHeader() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getHeader());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EarlyEscapeBottomSheet redact(EarlyEscapeBottomSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent header = value.getHeader();
                UIComponent uIComponentRedact = header != null ? UIComponent.ADAPTER.redact(header) : null;
                UIComponent body = value.getBody();
                UIComponent uIComponentRedact2 = body != null ? UIComponent.ADAPTER.redact(body) : null;
                CalendarEvent calendar_event2 = value.getCalendar_event();
                return EarlyEscapeBottomSheet.copy$default(value, uIComponentRedact, uIComponentRedact2, null, null, calendar_event2 != null ? CalendarEvent.ADAPTER.redact(calendar_event2) : null, null, ByteString.EMPTY, 44, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EarlyEscapeBottomSheet decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                CalendarEvent calendarEventDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                UIComponent uIComponentDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                                break;
                            case 2:
                                uIComponentDecode2 = UIComponent.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                calendarEventDecode = CalendarEvent.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new EarlyEscapeBottomSheet(uIComponentDecode, uIComponentDecode2, strDecode, strDecode2, calendarEventDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
