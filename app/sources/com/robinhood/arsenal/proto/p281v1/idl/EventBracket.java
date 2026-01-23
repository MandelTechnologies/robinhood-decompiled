package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
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
import p479j$.time.Instant;

/* compiled from: EventBracket.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013Bw\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ}\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u001fR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b'\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b,\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "Lcom/squareup/wire/Message;", "", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "end_time", "name", "background_image_url", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButton;", "trade_button_metadata", "", "event_ids", "banner_text", "", "default_round_index", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButton;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButton;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "Ljava/lang/String;", "getId", "Lj$/time/Instant;", "getEnd_time", "()Lj$/time/Instant;", "getName", "getBackground_image_url", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButton;", "getTrade_button_metadata", "()Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButton;", "getBanner_text", "Ljava/lang/Integer;", "getDefault_round_index", "()Ljava/lang/Integer;", "Ljava/util/List;", "getEvent_ids", "()Ljava/util/List;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EventBracket extends Message {

    @JvmField
    public static final ProtoAdapter<EventBracket> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "backgroundImageUrl", schemaIndex = 3, tag = 4)
    private final String background_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerText", schemaIndex = 6, tag = 8)
    private final String banner_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "defaultRoundIndex", schemaIndex = 7, tag = 9)
    private final Integer default_round_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventIds", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 7)
    private final List<String> event_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventBracketTradeButton#ADAPTER", jsonName = "tradeButtonMetadata", schemaIndex = 4, tag = 6)
    private final EventBracketTradeButton trade_button_metadata;

    public EventBracket() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ EventBracket(String str, Instant instant, String str2, String str3, EventBracketTradeButton eventBracketTradeButton, List list, String str4, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : eventBracketTradeButton, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20125newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Instant getEnd_time() {
        return this.end_time;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBackground_image_url() {
        return this.background_image_url;
    }

    public final EventBracketTradeButton getTrade_button_metadata() {
        return this.trade_button_metadata;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final Integer getDefault_round_index() {
        return this.default_round_index;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventBracket(String id, Instant instant, String name, String str, EventBracketTradeButton eventBracketTradeButton, List<String> event_ids, String str2, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.end_time = instant;
        this.name = name;
        this.background_image_url = str;
        this.trade_button_metadata = eventBracketTradeButton;
        this.banner_text = str2;
        this.default_round_index = num;
        this.event_ids = Internal.immutableCopyOf("event_ids", event_ids);
    }

    public final List<String> getEvent_ids() {
        return this.event_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20125newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventBracket)) {
            return false;
        }
        EventBracket eventBracket = (EventBracket) other;
        return Intrinsics.areEqual(unknownFields(), eventBracket.unknownFields()) && Intrinsics.areEqual(this.id, eventBracket.id) && Intrinsics.areEqual(this.end_time, eventBracket.end_time) && Intrinsics.areEqual(this.name, eventBracket.name) && Intrinsics.areEqual(this.background_image_url, eventBracket.background_image_url) && Intrinsics.areEqual(this.trade_button_metadata, eventBracket.trade_button_metadata) && Intrinsics.areEqual(this.event_ids, eventBracket.event_ids) && Intrinsics.areEqual(this.banner_text, eventBracket.banner_text) && Intrinsics.areEqual(this.default_round_index, eventBracket.default_round_index);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Instant instant = this.end_time;
        int iHashCode2 = (((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.name.hashCode()) * 37;
        String str = this.background_image_url;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        EventBracketTradeButton eventBracketTradeButton = this.trade_button_metadata;
        int iHashCode4 = (((iHashCode3 + (eventBracketTradeButton != null ? eventBracketTradeButton.hashCode() : 0)) * 37) + this.event_ids.hashCode()) * 37;
        String str2 = this.banner_text;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.default_round_index;
        int iHashCode6 = iHashCode5 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Instant instant = this.end_time;
        if (instant != null) {
            arrayList.add("end_time=" + instant);
        }
        arrayList.add("name=" + Internal.sanitize(this.name));
        String str = this.background_image_url;
        if (str != null) {
            arrayList.add("background_image_url=" + Internal.sanitize(str));
        }
        EventBracketTradeButton eventBracketTradeButton = this.trade_button_metadata;
        if (eventBracketTradeButton != null) {
            arrayList.add("trade_button_metadata=" + eventBracketTradeButton);
        }
        if (!this.event_ids.isEmpty()) {
            arrayList.add("event_ids=" + Internal.sanitize(this.event_ids));
        }
        String str2 = this.banner_text;
        if (str2 != null) {
            arrayList.add("banner_text=" + Internal.sanitize(str2));
        }
        Integer num = this.default_round_index;
        if (num != null) {
            arrayList.add("default_round_index=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventBracket{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventBracket copy$default(EventBracket eventBracket, String str, Instant instant, String str2, String str3, EventBracketTradeButton eventBracketTradeButton, List list, String str4, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventBracket.id;
        }
        if ((i & 2) != 0) {
            instant = eventBracket.end_time;
        }
        if ((i & 4) != 0) {
            str2 = eventBracket.name;
        }
        if ((i & 8) != 0) {
            str3 = eventBracket.background_image_url;
        }
        if ((i & 16) != 0) {
            eventBracketTradeButton = eventBracket.trade_button_metadata;
        }
        if ((i & 32) != 0) {
            list = eventBracket.event_ids;
        }
        if ((i & 64) != 0) {
            str4 = eventBracket.banner_text;
        }
        if ((i & 128) != 0) {
            num = eventBracket.default_round_index;
        }
        if ((i & 256) != 0) {
            byteString = eventBracket.unknownFields();
        }
        Integer num2 = num;
        ByteString byteString2 = byteString;
        List list2 = list;
        String str5 = str4;
        EventBracketTradeButton eventBracketTradeButton2 = eventBracketTradeButton;
        String str6 = str2;
        return eventBracket.copy(str, instant, str6, str3, eventBracketTradeButton2, list2, str5, num2, byteString2);
    }

    public final EventBracket copy(String id, Instant end_time, String name, String background_image_url, EventBracketTradeButton trade_button_metadata, List<String> event_ids, String banner_text, Integer default_round_index, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventBracket(id, end_time, name, background_image_url, trade_button_metadata, event_ids, banner_text, default_round_index, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventBracket.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventBracket>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.EventBracket$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventBracket value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getEnd_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(4, value.getBackground_image_url()) + EventBracketTradeButton.ADAPTER.encodedSizeWithTag(6, value.getTrade_button_metadata()) + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getEvent_ids()) + protoAdapter.encodedSizeWithTag(8, value.getBanner_text()) + ProtoAdapter.INT32.encodedSizeWithTag(9, value.getDefault_round_index());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventBracket value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getEnd_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_image_url());
                EventBracketTradeButton.ADAPTER.encodeWithTag(writer, 6, (int) value.getTrade_button_metadata());
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getEvent_ids());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getBanner_text());
                ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) value.getDefault_round_index());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventBracket value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) value.getDefault_round_index());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getBanner_text());
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getEvent_ids());
                EventBracketTradeButton.ADAPTER.encodeWithTag(writer, 6, (int) value.getTrade_button_metadata());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_image_url());
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (value.getEnd_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getEnd_time());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventBracket decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                String strDecode2 = null;
                EventBracketTradeButton eventBracketTradeButtonDecode = null;
                String strDecode3 = null;
                Integer numDecode = null;
                String strDecode4 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 6:
                                eventBracketTradeButtonDecode = EventBracketTradeButton.ADAPTER.decode(reader);
                                break;
                            case 7:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                        }
                    } else {
                        return new EventBracket(strDecode, instantDecode, strDecode4, strDecode2, eventBracketTradeButtonDecode, arrayList, strDecode3, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventBracket redact(EventBracket value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant end_time = value.getEnd_time();
                Instant instantRedact = end_time != null ? ProtoAdapter.INSTANT.redact(end_time) : null;
                EventBracketTradeButton trade_button_metadata = value.getTrade_button_metadata();
                return EventBracket.copy$default(value, null, instantRedact, null, null, trade_button_metadata != null ? EventBracketTradeButton.ADAPTER.redact(trade_button_metadata) : null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, null);
            }
        };
    }
}
