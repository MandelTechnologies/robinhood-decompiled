package search_coprocessor.p542v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import search_coprocessor.p542v1.SportEventHeroDetails;

/* compiled from: SportEventHeroDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\bH\u0016JR\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetails;", "Lcom/squareup/wire/Message;", "", "badge", "Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;", "status", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "primary_status_text", "", "secondary_status_text", "left_side", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;", "right_side", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;Lokio/ByteString;)V", "getBadge", "()Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;", "getStatus", "()Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "getPrimary_status_text", "()Ljava/lang/String;", "getSecondary_status_text", "getLeft_side", "()Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;", "getRight_side", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EventStatus", "Badge", "EventSide", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class SportEventHeroDetails extends Message {

    @JvmField
    public static final ProtoAdapter<SportEventHeroDetails> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.SportEventHeroDetails$Badge#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Badge badge;

    @WireField(adapter = "search_coprocessor.v1.SportEventHeroDetails$EventSide#ADAPTER", jsonName = "leftSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final EventSide left_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryStatusText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_status_text;

    @WireField(adapter = "search_coprocessor.v1.SportEventHeroDetails$EventSide#ADAPTER", jsonName = "rightSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final EventSide right_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryStatusText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String secondary_status_text;

    @WireField(adapter = "search_coprocessor.v1.SportEventHeroDetails$EventStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EventStatus status;

    public SportEventHeroDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29990newBuilder();
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final EventStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ SportEventHeroDetails(Badge badge, EventStatus eventStatus, String str, String str2, EventSide eventSide, EventSide eventSide2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : badge, (i & 2) != 0 ? EventStatus.EVENT_STATUS_UNSPECIFIED : eventStatus, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : eventSide, (i & 32) != 0 ? null : eventSide2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPrimary_status_text() {
        return this.primary_status_text;
    }

    public final String getSecondary_status_text() {
        return this.secondary_status_text;
    }

    public final EventSide getLeft_side() {
        return this.left_side;
    }

    public final EventSide getRight_side() {
        return this.right_side;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportEventHeroDetails(Badge badge, EventStatus status, String primary_status_text, String secondary_status_text, EventSide eventSide, EventSide eventSide2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(primary_status_text, "primary_status_text");
        Intrinsics.checkNotNullParameter(secondary_status_text, "secondary_status_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.badge = badge;
        this.status = status;
        this.primary_status_text = primary_status_text;
        this.secondary_status_text = secondary_status_text;
        this.left_side = eventSide;
        this.right_side = eventSide2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29990newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SportEventHeroDetails)) {
            return false;
        }
        SportEventHeroDetails sportEventHeroDetails = (SportEventHeroDetails) other;
        return Intrinsics.areEqual(unknownFields(), sportEventHeroDetails.unknownFields()) && Intrinsics.areEqual(this.badge, sportEventHeroDetails.badge) && this.status == sportEventHeroDetails.status && Intrinsics.areEqual(this.primary_status_text, sportEventHeroDetails.primary_status_text) && Intrinsics.areEqual(this.secondary_status_text, sportEventHeroDetails.secondary_status_text) && Intrinsics.areEqual(this.left_side, sportEventHeroDetails.left_side) && Intrinsics.areEqual(this.right_side, sportEventHeroDetails.right_side);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Badge badge = this.badge;
        int iHashCode2 = (((((((iHashCode + (badge != null ? badge.hashCode() : 0)) * 37) + this.status.hashCode()) * 37) + this.primary_status_text.hashCode()) * 37) + this.secondary_status_text.hashCode()) * 37;
        EventSide eventSide = this.left_side;
        int iHashCode3 = (iHashCode2 + (eventSide != null ? eventSide.hashCode() : 0)) * 37;
        EventSide eventSide2 = this.right_side;
        int iHashCode4 = iHashCode3 + (eventSide2 != null ? eventSide2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Badge badge = this.badge;
        if (badge != null) {
            arrayList.add("badge=" + badge);
        }
        arrayList.add("status=" + this.status);
        arrayList.add("primary_status_text=" + Internal.sanitize(this.primary_status_text));
        arrayList.add("secondary_status_text=" + Internal.sanitize(this.secondary_status_text));
        EventSide eventSide = this.left_side;
        if (eventSide != null) {
            arrayList.add("left_side=" + eventSide);
        }
        EventSide eventSide2 = this.right_side;
        if (eventSide2 != null) {
            arrayList.add("right_side=" + eventSide2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SportEventHeroDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SportEventHeroDetails copy$default(SportEventHeroDetails sportEventHeroDetails, Badge badge, EventStatus eventStatus, String str, String str2, EventSide eventSide, EventSide eventSide2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            badge = sportEventHeroDetails.badge;
        }
        if ((i & 2) != 0) {
            eventStatus = sportEventHeroDetails.status;
        }
        if ((i & 4) != 0) {
            str = sportEventHeroDetails.primary_status_text;
        }
        if ((i & 8) != 0) {
            str2 = sportEventHeroDetails.secondary_status_text;
        }
        if ((i & 16) != 0) {
            eventSide = sportEventHeroDetails.left_side;
        }
        if ((i & 32) != 0) {
            eventSide2 = sportEventHeroDetails.right_side;
        }
        if ((i & 64) != 0) {
            byteString = sportEventHeroDetails.unknownFields();
        }
        EventSide eventSide3 = eventSide2;
        ByteString byteString2 = byteString;
        EventSide eventSide4 = eventSide;
        String str3 = str;
        return sportEventHeroDetails.copy(badge, eventStatus, str3, str2, eventSide4, eventSide3, byteString2);
    }

    public final SportEventHeroDetails copy(Badge badge, EventStatus status, String primary_status_text, String secondary_status_text, EventSide left_side, EventSide right_side, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(primary_status_text, "primary_status_text");
        Intrinsics.checkNotNullParameter(secondary_status_text, "secondary_status_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SportEventHeroDetails(badge, status, primary_status_text, secondary_status_text, left_side, right_side, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SportEventHeroDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SportEventHeroDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.SportEventHeroDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SportEventHeroDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBadge() != null) {
                    size += SportEventHeroDetails.Badge.ADAPTER.encodedSizeWithTag(1, value.getBadge());
                }
                if (value.getStatus() != SportEventHeroDetails.EventStatus.EVENT_STATUS_UNSPECIFIED) {
                    size += SportEventHeroDetails.EventStatus.ADAPTER.encodedSizeWithTag(2, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getPrimary_status_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_status_text());
                }
                if (!Intrinsics.areEqual(value.getSecondary_status_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSecondary_status_text());
                }
                if (value.getLeft_side() != null) {
                    size += SportEventHeroDetails.EventSide.ADAPTER.encodedSizeWithTag(5, value.getLeft_side());
                }
                return value.getRight_side() != null ? size + SportEventHeroDetails.EventSide.ADAPTER.encodedSizeWithTag(6, value.getRight_side()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SportEventHeroDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBadge() != null) {
                    SportEventHeroDetails.Badge.ADAPTER.encodeWithTag(writer, 1, (int) value.getBadge());
                }
                if (value.getStatus() != SportEventHeroDetails.EventStatus.EVENT_STATUS_UNSPECIFIED) {
                    SportEventHeroDetails.EventStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getPrimary_status_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_status_text());
                }
                if (!Intrinsics.areEqual(value.getSecondary_status_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_status_text());
                }
                if (value.getLeft_side() != null) {
                    SportEventHeroDetails.EventSide.ADAPTER.encodeWithTag(writer, 5, (int) value.getLeft_side());
                }
                if (value.getRight_side() != null) {
                    SportEventHeroDetails.EventSide.ADAPTER.encodeWithTag(writer, 6, (int) value.getRight_side());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SportEventHeroDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRight_side() != null) {
                    SportEventHeroDetails.EventSide.ADAPTER.encodeWithTag(writer, 6, (int) value.getRight_side());
                }
                if (value.getLeft_side() != null) {
                    SportEventHeroDetails.EventSide.ADAPTER.encodeWithTag(writer, 5, (int) value.getLeft_side());
                }
                if (!Intrinsics.areEqual(value.getSecondary_status_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_status_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_status_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_status_text());
                }
                if (value.getStatus() != SportEventHeroDetails.EventStatus.EVENT_STATUS_UNSPECIFIED) {
                    SportEventHeroDetails.EventStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (value.getBadge() != null) {
                    SportEventHeroDetails.Badge.ADAPTER.encodeWithTag(writer, 1, (int) value.getBadge());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SportEventHeroDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SportEventHeroDetails.EventStatus eventStatus = SportEventHeroDetails.EventStatus.EVENT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                SportEventHeroDetails.EventSide eventSideDecode = null;
                SportEventHeroDetails.EventSide eventSideDecode2 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                SportEventHeroDetails.EventStatus eventStatusDecode = eventStatus;
                SportEventHeroDetails.Badge badgeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                badgeDecode = SportEventHeroDetails.Badge.ADAPTER.decode(reader);
                                break;
                            case 2:
                                try {
                                    eventStatusDecode = SportEventHeroDetails.EventStatus.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                eventSideDecode = SportEventHeroDetails.EventSide.ADAPTER.decode(reader);
                                break;
                            case 6:
                                eventSideDecode2 = SportEventHeroDetails.EventSide.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SportEventHeroDetails(badgeDecode, eventStatusDecode, strDecode, strDecode2, eventSideDecode, eventSideDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SportEventHeroDetails redact(SportEventHeroDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SportEventHeroDetails.Badge badge = value.getBadge();
                SportEventHeroDetails.Badge badgeRedact = badge != null ? SportEventHeroDetails.Badge.ADAPTER.redact(badge) : null;
                SportEventHeroDetails.EventSide left_side = value.getLeft_side();
                SportEventHeroDetails.EventSide eventSideRedact = left_side != null ? SportEventHeroDetails.EventSide.ADAPTER.redact(left_side) : null;
                SportEventHeroDetails.EventSide right_side = value.getRight_side();
                return SportEventHeroDetails.copy$default(value, badgeRedact, null, null, null, eventSideRedact, right_side != null ? SportEventHeroDetails.EventSide.ADAPTER.redact(right_side) : null, ByteString.EMPTY, 14, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SportEventHeroDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_STATUS_UNSPECIFIED", "UPCOMING", "LIVE", "FINISHED", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventStatus EVENT_STATUS_UNSPECIFIED;
        public static final EventStatus FINISHED;
        public static final EventStatus LIVE;
        public static final EventStatus UPCOMING;
        private final int value;

        private static final /* synthetic */ EventStatus[] $values() {
            return new EventStatus[]{EVENT_STATUS_UNSPECIFIED, UPCOMING, LIVE, FINISHED};
        }

        @JvmStatic
        public static final EventStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventStatus> getEntries() {
            return $ENTRIES;
        }

        private EventStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventStatus eventStatus = new EventStatus("EVENT_STATUS_UNSPECIFIED", 0, 0);
            EVENT_STATUS_UNSPECIFIED = eventStatus;
            UPCOMING = new EventStatus("UPCOMING", 1, 1);
            LIVE = new EventStatus("LIVE", 2, 2);
            FINISHED = new EventStatus("FINISHED", 3, 3);
            EventStatus[] eventStatusArr$values = $values();
            $VALUES = eventStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventStatus>(orCreateKotlinClass, syntax, eventStatus) { // from class: search_coprocessor.v1.SportEventHeroDetails$EventStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SportEventHeroDetails.EventStatus fromValue(int value) {
                    return SportEventHeroDetails.EventStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SportEventHeroDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "fromValue", "value", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventStatus fromValue(int value) {
                if (value == 0) {
                    return EventStatus.EVENT_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return EventStatus.UPCOMING;
                }
                if (value == 2) {
                    return EventStatus.LIVE;
                }
                if (value != 3) {
                    return null;
                }
                return EventStatus.FINISHED;
            }
        }

        public static EventStatus valueOf(String str) {
            return (EventStatus) Enum.valueOf(EventStatus.class, str);
        }

        public static EventStatus[] values() {
            return (EventStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: SportEventHeroDetails.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;", "Lcom/squareup/wire/Message;", "", "text", "", ResourceTypes.COLOR, "Lsearch_coprocessor/v1/CustomColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/CustomColor;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getColor", "()Lsearch_coprocessor/v1/CustomColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Badge extends Message {

        @JvmField
        public static final ProtoAdapter<Badge> ADAPTER;

        @WireField(adapter = "search_coprocessor.v1.CustomColor#ADAPTER", schemaIndex = 1, tag = 2)
        private final CustomColor color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String text;

        public Badge() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29991newBuilder();
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ Badge(String str, CustomColor customColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : customColor, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final CustomColor getColor() {
            return this.color;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Badge(String text, CustomColor customColor, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.text = text;
            this.color = customColor;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29991newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.areEqual(unknownFields(), badge.unknownFields()) && Intrinsics.areEqual(this.text, badge.text) && Intrinsics.areEqual(this.color, badge.color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37;
            CustomColor customColor = this.color;
            int iHashCode2 = iHashCode + (customColor != null ? customColor.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("text=" + Internal.sanitize(this.text));
            CustomColor customColor = this.color;
            if (customColor != null) {
                arrayList.add("color=" + customColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Badge{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, CustomColor customColor, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = badge.text;
            }
            if ((i & 2) != 0) {
                customColor = badge.color;
            }
            if ((i & 4) != 0) {
                byteString = badge.unknownFields();
            }
            return badge.copy(str, customColor, byteString);
        }

        public final Badge copy(String text, CustomColor color, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Badge(text, color, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Badge.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Badge>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.SportEventHeroDetails$Badge$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SportEventHeroDetails.Badge value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getText(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                    }
                    return size + CustomColor.ADAPTER.encodedSizeWithTag(2, value.getColor());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SportEventHeroDetails.Badge value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }
                    CustomColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SportEventHeroDetails.Badge value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    CustomColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                    if (Intrinsics.areEqual(value.getText(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SportEventHeroDetails.Badge redact(SportEventHeroDetails.Badge value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CustomColor color = value.getColor();
                    return SportEventHeroDetails.Badge.copy$default(value, null, color != null ? CustomColor.ADAPTER.redact(color) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SportEventHeroDetails.Badge decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    CustomColor customColorDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new SportEventHeroDetails.Badge(strDecode, customColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            customColorDecode = CustomColor.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: SportEventHeroDetails.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006("}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;", "Lcom/squareup/wire/Message;", "", "id", "", "score", "show_indicator", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "display_price", "open_interest", "image_url", ResourceTypes.COLOR, "Lsearch_coprocessor/v1/CustomColor;", "cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/CustomColor;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getScore", "getShow_indicator", "()Z", "getDisplay_name", "getDisplay_price", "getOpen_interest", "getImage_url", "getColor", "()Lsearch_coprocessor/v1/CustomColor;", "getCta_text", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventSide extends Message {

        @JvmField
        public static final ProtoAdapter<EventSide> ADAPTER;

        @WireField(adapter = "search_coprocessor.v1.CustomColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final CustomColor color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
        private final String cta_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String display_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String display_price;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 6, tag = 7)
        private final String image_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openInterest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String open_interest;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        private final String score;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showIndicator", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean show_indicator;

        public EventSide() {
            this(null, null, false, null, null, null, null, null, null, null, 1023, null);
        }

        public /* synthetic */ EventSide(String str, String str2, boolean z, String str3, String str4, String str5, String str6, CustomColor customColor, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : customColor, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29992newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public final String getScore() {
            return this.score;
        }

        public final boolean getShow_indicator() {
            return this.show_indicator;
        }

        public final String getDisplay_name() {
            return this.display_name;
        }

        public final String getDisplay_price() {
            return this.display_price;
        }

        public final String getOpen_interest() {
            return this.open_interest;
        }

        public final String getImage_url() {
            return this.image_url;
        }

        public final CustomColor getColor() {
            return this.color;
        }

        public final String getCta_text() {
            return this.cta_text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventSide(String id, String str, boolean z, String display_name, String display_price, String open_interest, String str2, CustomColor customColor, String cta_text, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(display_price, "display_price");
            Intrinsics.checkNotNullParameter(open_interest, "open_interest");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.score = str;
            this.show_indicator = z;
            this.display_name = display_name;
            this.display_price = display_price;
            this.open_interest = open_interest;
            this.image_url = str2;
            this.color = customColor;
            this.cta_text = cta_text;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29992newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EventSide)) {
                return false;
            }
            EventSide eventSide = (EventSide) other;
            return Intrinsics.areEqual(unknownFields(), eventSide.unknownFields()) && Intrinsics.areEqual(this.id, eventSide.id) && Intrinsics.areEqual(this.score, eventSide.score) && this.show_indicator == eventSide.show_indicator && Intrinsics.areEqual(this.display_name, eventSide.display_name) && Intrinsics.areEqual(this.display_price, eventSide.display_price) && Intrinsics.areEqual(this.open_interest, eventSide.open_interest) && Intrinsics.areEqual(this.image_url, eventSide.image_url) && Intrinsics.areEqual(this.color, eventSide.color) && Intrinsics.areEqual(this.cta_text, eventSide.cta_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
            String str = this.score;
            int iHashCode2 = (((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.show_indicator)) * 37) + this.display_name.hashCode()) * 37) + this.display_price.hashCode()) * 37) + this.open_interest.hashCode()) * 37;
            String str2 = this.image_url;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            CustomColor customColor = this.color;
            int iHashCode4 = ((iHashCode3 + (customColor != null ? customColor.hashCode() : 0)) * 37) + this.cta_text.hashCode();
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            String str = this.score;
            if (str != null) {
                arrayList.add("score=" + Internal.sanitize(str));
            }
            arrayList.add("show_indicator=" + this.show_indicator);
            arrayList.add("display_name=" + Internal.sanitize(this.display_name));
            arrayList.add("display_price=" + Internal.sanitize(this.display_price));
            arrayList.add("open_interest=" + Internal.sanitize(this.open_interest));
            String str2 = this.image_url;
            if (str2 != null) {
                arrayList.add("image_url=" + Internal.sanitize(str2));
            }
            CustomColor customColor = this.color;
            if (customColor != null) {
                arrayList.add("color=" + customColor);
            }
            arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
            return CollectionsKt.joinToString$default(arrayList, ", ", "EventSide{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ EventSide copy$default(EventSide eventSide, String str, String str2, boolean z, String str3, String str4, String str5, String str6, CustomColor customColor, String str7, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eventSide.id;
            }
            if ((i & 2) != 0) {
                str2 = eventSide.score;
            }
            if ((i & 4) != 0) {
                z = eventSide.show_indicator;
            }
            if ((i & 8) != 0) {
                str3 = eventSide.display_name;
            }
            if ((i & 16) != 0) {
                str4 = eventSide.display_price;
            }
            if ((i & 32) != 0) {
                str5 = eventSide.open_interest;
            }
            if ((i & 64) != 0) {
                str6 = eventSide.image_url;
            }
            if ((i & 128) != 0) {
                customColor = eventSide.color;
            }
            if ((i & 256) != 0) {
                str7 = eventSide.cta_text;
            }
            if ((i & 512) != 0) {
                byteString = eventSide.unknownFields();
            }
            String str8 = str7;
            ByteString byteString2 = byteString;
            String str9 = str6;
            CustomColor customColor2 = customColor;
            String str10 = str4;
            String str11 = str5;
            return eventSide.copy(str, str2, z, str3, str10, str11, str9, customColor2, str8, byteString2);
        }

        public final EventSide copy(String id, String score, boolean show_indicator, String display_name, String display_price, String open_interest, String image_url, CustomColor color, String cta_text, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(display_price, "display_price");
            Intrinsics.checkNotNullParameter(open_interest, "open_interest");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new EventSide(id, score, show_indicator, display_name, display_price, open_interest, image_url, color, cta_text, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventSide.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<EventSide>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.SportEventHeroDetails$EventSide$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SportEventHeroDetails.EventSide decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    String strDecode4 = null;
                    String strDecode5 = null;
                    CustomColor customColorDecode = null;
                    boolean zBooleanValue = false;
                    String strDecode6 = strDecode3;
                    String strDecode7 = strDecode6;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 4:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode7 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    customColorDecode = CustomColor.ADAPTER.decode(reader);
                                    break;
                                case 9:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new SportEventHeroDetails.EventSide(strDecode, strDecode4, zBooleanValue, strDecode6, strDecode7, strDecode2, strDecode5, customColorDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SportEventHeroDetails.EventSide value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getScore());
                    if (value.getShow_indicator()) {
                        iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShow_indicator()));
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getDisplay_name());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_price(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getDisplay_price());
                    }
                    if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getOpen_interest());
                    }
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getImage_url());
                    if (value.getColor() != null) {
                        iEncodedSizeWithTag2 += CustomColor.ADAPTER.encodedSizeWithTag(8, value.getColor());
                    }
                    return !Intrinsics.areEqual(value.getCta_text(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(9, value.getCta_text()) : iEncodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SportEventHeroDetails.EventSide value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getScore());
                    if (value.getShow_indicator()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShow_indicator()));
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getDisplay_name());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_price(), "")) {
                        protoAdapter.encodeWithTag(writer, 5, (int) value.getDisplay_price());
                    }
                    if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
                        protoAdapter.encodeWithTag(writer, 6, (int) value.getOpen_interest());
                    }
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getImage_url());
                    if (value.getColor() != null) {
                        CustomColor.ADAPTER.encodeWithTag(writer, 8, (int) value.getColor());
                    }
                    if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                        protoAdapter.encodeWithTag(writer, 9, (int) value.getCta_text());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SportEventHeroDetails.EventSide value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCta_text());
                    }
                    if (value.getColor() != null) {
                        CustomColor.ADAPTER.encodeWithTag(writer, 8, (int) value.getColor());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getImage_url());
                    if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
                        protoAdapter.encodeWithTag(writer, 6, (int) value.getOpen_interest());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_price(), "")) {
                        protoAdapter.encodeWithTag(writer, 5, (int) value.getDisplay_price());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getDisplay_name());
                    }
                    if (value.getShow_indicator()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShow_indicator()));
                    }
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getScore());
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SportEventHeroDetails.EventSide redact(SportEventHeroDetails.EventSide value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CustomColor color = value.getColor();
                    return SportEventHeroDetails.EventSide.copy$default(value, null, null, false, null, null, null, null, color != null ? CustomColor.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 383, null);
                }
            };
        }
    }
}
