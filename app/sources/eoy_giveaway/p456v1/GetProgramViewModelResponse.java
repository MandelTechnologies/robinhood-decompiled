package eoy_giveaway.p456v1;

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
import eoy_giveaway.p456v1.GetProgramViewModelResponse;
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

/* compiled from: GetProgramViewModelResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006!"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponse;", "Lcom/squareup/wire/Message;", "", "canvas_url", "", "show_overlay", "", "close_button_location", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "calendar_button_location", "show_pending_gift_indicator", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLeoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;ZLokio/ByteString;)V", "getCanvas_url", "()Ljava/lang/String;", "getShow_overlay", "()Z", "getClose_button_location", "()Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "getCalendar_button_location", "getShow_pending_gift_indicator", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "CloseButtonLocation", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetProgramViewModelResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetProgramViewModelResponse> ADAPTER;

    @WireField(adapter = "eoy_giveaway.v1.GetProgramViewModelResponse$CloseButtonLocation#ADAPTER", jsonName = "calendarButtonLocation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CloseButtonLocation calendar_button_location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "canvasUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String canvas_url;

    @WireField(adapter = "eoy_giveaway.v1.GetProgramViewModelResponse$CloseButtonLocation#ADAPTER", jsonName = "closeButtonLocation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CloseButtonLocation close_button_location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOverlay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean show_overlay;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showPendingGiftIndicator", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean show_pending_gift_indicator;

    public GetProgramViewModelResponse() {
        this(null, false, null, null, false, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27974newBuilder();
    }

    public final String getCanvas_url() {
        return this.canvas_url;
    }

    public /* synthetic */ GetProgramViewModelResponse(String str, boolean z, CloseButtonLocation closeButtonLocation, CloseButtonLocation closeButtonLocation2, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CloseButtonLocation.LOCATION_UNSPECIFIED : closeButtonLocation, (i & 8) != 0 ? CloseButtonLocation.LOCATION_UNSPECIFIED : closeButtonLocation2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getShow_overlay() {
        return this.show_overlay;
    }

    public final CloseButtonLocation getClose_button_location() {
        return this.close_button_location;
    }

    public final CloseButtonLocation getCalendar_button_location() {
        return this.calendar_button_location;
    }

    public final boolean getShow_pending_gift_indicator() {
        return this.show_pending_gift_indicator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProgramViewModelResponse(String canvas_url, boolean z, CloseButtonLocation close_button_location, CloseButtonLocation calendar_button_location, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(canvas_url, "canvas_url");
        Intrinsics.checkNotNullParameter(close_button_location, "close_button_location");
        Intrinsics.checkNotNullParameter(calendar_button_location, "calendar_button_location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.canvas_url = canvas_url;
        this.show_overlay = z;
        this.close_button_location = close_button_location;
        this.calendar_button_location = calendar_button_location;
        this.show_pending_gift_indicator = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27974newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetProgramViewModelResponse)) {
            return false;
        }
        GetProgramViewModelResponse getProgramViewModelResponse = (GetProgramViewModelResponse) other;
        return Intrinsics.areEqual(unknownFields(), getProgramViewModelResponse.unknownFields()) && Intrinsics.areEqual(this.canvas_url, getProgramViewModelResponse.canvas_url) && this.show_overlay == getProgramViewModelResponse.show_overlay && this.close_button_location == getProgramViewModelResponse.close_button_location && this.calendar_button_location == getProgramViewModelResponse.calendar_button_location && this.show_pending_gift_indicator == getProgramViewModelResponse.show_pending_gift_indicator;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.canvas_url.hashCode()) * 37) + Boolean.hashCode(this.show_overlay)) * 37) + this.close_button_location.hashCode()) * 37) + this.calendar_button_location.hashCode()) * 37) + Boolean.hashCode(this.show_pending_gift_indicator);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("canvas_url=" + Internal.sanitize(this.canvas_url));
        arrayList.add("show_overlay=" + this.show_overlay);
        arrayList.add("close_button_location=" + this.close_button_location);
        arrayList.add("calendar_button_location=" + this.calendar_button_location);
        arrayList.add("show_pending_gift_indicator=" + this.show_pending_gift_indicator);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetProgramViewModelResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetProgramViewModelResponse copy$default(GetProgramViewModelResponse getProgramViewModelResponse, String str, boolean z, CloseButtonLocation closeButtonLocation, CloseButtonLocation closeButtonLocation2, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getProgramViewModelResponse.canvas_url;
        }
        if ((i & 2) != 0) {
            z = getProgramViewModelResponse.show_overlay;
        }
        if ((i & 4) != 0) {
            closeButtonLocation = getProgramViewModelResponse.close_button_location;
        }
        if ((i & 8) != 0) {
            closeButtonLocation2 = getProgramViewModelResponse.calendar_button_location;
        }
        if ((i & 16) != 0) {
            z2 = getProgramViewModelResponse.show_pending_gift_indicator;
        }
        if ((i & 32) != 0) {
            byteString = getProgramViewModelResponse.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        return getProgramViewModelResponse.copy(str, z, closeButtonLocation, closeButtonLocation2, z3, byteString2);
    }

    public final GetProgramViewModelResponse copy(String canvas_url, boolean show_overlay, CloseButtonLocation close_button_location, CloseButtonLocation calendar_button_location, boolean show_pending_gift_indicator, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(canvas_url, "canvas_url");
        Intrinsics.checkNotNullParameter(close_button_location, "close_button_location");
        Intrinsics.checkNotNullParameter(calendar_button_location, "calendar_button_location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetProgramViewModelResponse(canvas_url, show_overlay, close_button_location, calendar_button_location, show_pending_gift_indicator, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetProgramViewModelResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetProgramViewModelResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: eoy_giveaway.v1.GetProgramViewModelResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetProgramViewModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCanvas_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCanvas_url());
                }
                if (value.getShow_overlay()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getShow_overlay()));
                }
                GetProgramViewModelResponse.CloseButtonLocation close_button_location = value.getClose_button_location();
                GetProgramViewModelResponse.CloseButtonLocation closeButtonLocation = GetProgramViewModelResponse.CloseButtonLocation.LOCATION_UNSPECIFIED;
                if (close_button_location != closeButtonLocation) {
                    size += GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.encodedSizeWithTag(3, value.getClose_button_location());
                }
                if (value.getCalendar_button_location() != closeButtonLocation) {
                    size += GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.encodedSizeWithTag(4, value.getCalendar_button_location());
                }
                return value.getShow_pending_gift_indicator() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getShow_pending_gift_indicator())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetProgramViewModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCanvas_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCanvas_url());
                }
                if (value.getShow_overlay()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShow_overlay()));
                }
                GetProgramViewModelResponse.CloseButtonLocation close_button_location = value.getClose_button_location();
                GetProgramViewModelResponse.CloseButtonLocation closeButtonLocation = GetProgramViewModelResponse.CloseButtonLocation.LOCATION_UNSPECIFIED;
                if (close_button_location != closeButtonLocation) {
                    GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.encodeWithTag(writer, 3, (int) value.getClose_button_location());
                }
                if (value.getCalendar_button_location() != closeButtonLocation) {
                    GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.encodeWithTag(writer, 4, (int) value.getCalendar_button_location());
                }
                if (value.getShow_pending_gift_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getShow_pending_gift_indicator()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetProgramViewModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShow_pending_gift_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getShow_pending_gift_indicator()));
                }
                GetProgramViewModelResponse.CloseButtonLocation calendar_button_location = value.getCalendar_button_location();
                GetProgramViewModelResponse.CloseButtonLocation closeButtonLocation = GetProgramViewModelResponse.CloseButtonLocation.LOCATION_UNSPECIFIED;
                if (calendar_button_location != closeButtonLocation) {
                    GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.encodeWithTag(writer, 4, (int) value.getCalendar_button_location());
                }
                if (value.getClose_button_location() != closeButtonLocation) {
                    GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.encodeWithTag(writer, 3, (int) value.getClose_button_location());
                }
                if (value.getShow_overlay()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShow_overlay()));
                }
                if (Intrinsics.areEqual(value.getCanvas_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCanvas_url());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetProgramViewModelResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GetProgramViewModelResponse.CloseButtonLocation closeButtonLocation = GetProgramViewModelResponse.CloseButtonLocation.LOCATION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                GetProgramViewModelResponse.CloseButtonLocation closeButtonLocationDecode = closeButtonLocation;
                GetProgramViewModelResponse.CloseButtonLocation closeButtonLocationDecode2 = closeButtonLocationDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetProgramViewModelResponse(strDecode, zBooleanValue, closeButtonLocationDecode, closeButtonLocationDecode2, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        try {
                            closeButtonLocationDecode = GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        try {
                            closeButtonLocationDecode2 = GetProgramViewModelResponse.CloseButtonLocation.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 5) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetProgramViewModelResponse redact(GetProgramViewModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetProgramViewModelResponse.copy$default(value, null, false, null, null, false, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetProgramViewModelResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCATION_UNSPECIFIED", "HIDDEN", "LEFT", "RIGHT", "Companion", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class CloseButtonLocation implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CloseButtonLocation[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CloseButtonLocation> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CloseButtonLocation HIDDEN;
        public static final CloseButtonLocation LEFT;
        public static final CloseButtonLocation LOCATION_UNSPECIFIED;
        public static final CloseButtonLocation RIGHT;
        private final int value;

        private static final /* synthetic */ CloseButtonLocation[] $values() {
            return new CloseButtonLocation[]{LOCATION_UNSPECIFIED, HIDDEN, LEFT, RIGHT};
        }

        @JvmStatic
        public static final CloseButtonLocation fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CloseButtonLocation> getEntries() {
            return $ENTRIES;
        }

        private CloseButtonLocation(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CloseButtonLocation closeButtonLocation = new CloseButtonLocation("LOCATION_UNSPECIFIED", 0, 0);
            LOCATION_UNSPECIFIED = closeButtonLocation;
            HIDDEN = new CloseButtonLocation("HIDDEN", 1, 1);
            LEFT = new CloseButtonLocation("LEFT", 2, 2);
            RIGHT = new CloseButtonLocation("RIGHT", 3, 3);
            CloseButtonLocation[] closeButtonLocationArr$values = $values();
            $VALUES = closeButtonLocationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(closeButtonLocationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CloseButtonLocation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CloseButtonLocation>(orCreateKotlinClass, syntax, closeButtonLocation) { // from class: eoy_giveaway.v1.GetProgramViewModelResponse$CloseButtonLocation$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GetProgramViewModelResponse.CloseButtonLocation fromValue(int value) {
                    return GetProgramViewModelResponse.CloseButtonLocation.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GetProgramViewModelResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Leoy_giveaway/v1/GetProgramViewModelResponse$CloseButtonLocation;", "fromValue", "value", "", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CloseButtonLocation fromValue(int value) {
                if (value == 0) {
                    return CloseButtonLocation.LOCATION_UNSPECIFIED;
                }
                if (value == 1) {
                    return CloseButtonLocation.HIDDEN;
                }
                if (value == 2) {
                    return CloseButtonLocation.LEFT;
                }
                if (value != 3) {
                    return null;
                }
                return CloseButtonLocation.RIGHT;
            }
        }

        public static CloseButtonLocation valueOf(String str) {
            return (CloseButtonLocation) Enum.valueOf(CloseButtonLocation.class, str);
        }

        public static CloseButtonLocation[] values() {
            return (CloseButtonLocation[]) $VALUES.clone();
        }
    }
}
