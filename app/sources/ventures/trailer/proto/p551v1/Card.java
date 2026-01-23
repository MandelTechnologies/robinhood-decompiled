package ventures.trailer.proto.p551v1;

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

/* compiled from: Card.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lventures/trailer/proto/v1/Card;", "Lcom/squareup/wire/Message;", "", "background_image_url", "", CarResultComposable2.BODY, "Lrh_server_driven_ui/v1/UIComponent;", "cta_text", "calendar_event", "Lventures/trailer/proto/v1/CalendarEvent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/String;Lventures/trailer/proto/v1/CalendarEvent;Lokio/ByteString;)V", "getBackground_image_url", "()Ljava/lang/String;", "getBody", "()Lrh_server_driven_ui/v1/UIComponent;", "getCta_text", "getCalendar_event", "()Lventures/trailer/proto/v1/CalendarEvent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class Card extends Message {

    @JvmField
    public static final ProtoAdapter<Card> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "backgroundImageUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String background_image_url;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UIComponent body;

    @WireField(adapter = "ventures.trailer.proto.v1.CalendarEvent#ADAPTER", jsonName = "calendarEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CalendarEvent calendar_event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cta_text;

    public Card() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ Card(String str, UIComponent uIComponent, String str2, CalendarEvent calendarEvent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : uIComponent, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : calendarEvent, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30032newBuilder();
    }

    public final String getBackground_image_url() {
        return this.background_image_url;
    }

    public final UIComponent getBody() {
        return this.body;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final CalendarEvent getCalendar_event() {
        return this.calendar_event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(String background_image_url, UIComponent uIComponent, String cta_text, CalendarEvent calendarEvent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(background_image_url, "background_image_url");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.background_image_url = background_image_url;
        this.body = uIComponent;
        this.cta_text = cta_text;
        this.calendar_event = calendarEvent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30032newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.background_image_url, card.background_image_url) && Intrinsics.areEqual(this.body, card.body) && Intrinsics.areEqual(this.cta_text, card.cta_text) && Intrinsics.areEqual(this.calendar_event, card.calendar_event);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.background_image_url.hashCode()) * 37;
        UIComponent uIComponent = this.body;
        int iHashCode2 = (((iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37) + this.cta_text.hashCode()) * 37;
        CalendarEvent calendarEvent = this.calendar_event;
        int iHashCode3 = iHashCode2 + (calendarEvent != null ? calendarEvent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("background_image_url=" + Internal.sanitize(this.background_image_url));
        UIComponent uIComponent = this.body;
        if (uIComponent != null) {
            arrayList.add("body=" + uIComponent);
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        CalendarEvent calendarEvent = this.calendar_event;
        if (calendarEvent != null) {
            arrayList.add("calendar_event=" + calendarEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Card copy$default(Card card, String str, UIComponent uIComponent, String str2, CalendarEvent calendarEvent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card.background_image_url;
        }
        if ((i & 2) != 0) {
            uIComponent = card.body;
        }
        if ((i & 4) != 0) {
            str2 = card.cta_text;
        }
        if ((i & 8) != 0) {
            calendarEvent = card.calendar_event;
        }
        if ((i & 16) != 0) {
            byteString = card.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return card.copy(str, uIComponent, str3, calendarEvent, byteString2);
    }

    public final Card copy(String background_image_url, UIComponent body, String cta_text, CalendarEvent calendar_event2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(background_image_url, "background_image_url");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Card(background_image_url, body, cta_text, calendar_event2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Card.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Card>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.Card$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Card value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBackground_image_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBackground_image_url());
                }
                if (value.getBody() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(2, value.getBody());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCta_text());
                }
                return value.getCalendar_event() != null ? size + CalendarEvent.ADAPTER.encodedSizeWithTag(4, value.getCalendar_event()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Card value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBackground_image_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBackground_image_url());
                }
                if (value.getBody() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCta_text());
                }
                if (value.getCalendar_event() != null) {
                    CalendarEvent.ADAPTER.encodeWithTag(writer, 4, (int) value.getCalendar_event());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Card value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCalendar_event() != null) {
                    CalendarEvent.ADAPTER.encodeWithTag(writer, 4, (int) value.getCalendar_event());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCta_text());
                }
                if (value.getBody() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (Intrinsics.areEqual(value.getBackground_image_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBackground_image_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Card redact(Card value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent body = value.getBody();
                UIComponent uIComponentRedact = body != null ? UIComponent.ADAPTER.redact(body) : null;
                CalendarEvent calendar_event2 = value.getCalendar_event();
                return Card.copy$default(value, null, uIComponentRedact, null, calendar_event2 != null ? CalendarEvent.ADAPTER.redact(calendar_event2) : null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Card decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                UIComponent uIComponentDecode = null;
                CalendarEvent calendarEventDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Card(strDecode, uIComponentDecode, strDecode2, calendarEventDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        calendarEventDecode = CalendarEvent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
