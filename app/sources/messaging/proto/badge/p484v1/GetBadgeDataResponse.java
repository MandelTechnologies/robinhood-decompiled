package messaging.proto.badge.p484v1;

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
import messaging.proto.badge.p484v1.GetBadgeDataResponse;
import okio.ByteString;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.LinearGradientColor;
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: GetBadgeDataResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u001d\u001e\u001f !\"B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "Lcom/squareup/wire/Message;", "", "no_badge", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;", "countdown_badge", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "text_badge", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;Lokio/ByteString;)V", "getNo_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;", "getCountdown_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "getText_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "HiddenBadgeData", "CountdownBadgeData", "TextBadgeData", "CustomStyleParams", "BadgeVisualStyle", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetBadgeDataResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetBadgeDataResponse> ADAPTER;

    @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$CountdownBadgeData#ADAPTER", jsonName = "countdownBadge", oneofName = "badge_data", schemaIndex = 1, tag = 2)
    private final CountdownBadgeData countdown_badge;

    @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$HiddenBadgeData#ADAPTER", jsonName = "noBadge", oneofName = "badge_data", schemaIndex = 0, tag = 1)
    private final HiddenBadgeData no_badge;

    @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$TextBadgeData#ADAPTER", jsonName = "textBadge", oneofName = "badge_data", schemaIndex = 2, tag = 3)
    private final TextBadgeData text_badge;

    public GetBadgeDataResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28931newBuilder();
    }

    public final HiddenBadgeData getNo_badge() {
        return this.no_badge;
    }

    public final CountdownBadgeData getCountdown_badge() {
        return this.countdown_badge;
    }

    public final TextBadgeData getText_badge() {
        return this.text_badge;
    }

    public /* synthetic */ GetBadgeDataResponse(HiddenBadgeData hiddenBadgeData, CountdownBadgeData countdownBadgeData, TextBadgeData textBadgeData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hiddenBadgeData, (i & 2) != 0 ? null : countdownBadgeData, (i & 4) != 0 ? null : textBadgeData, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBadgeDataResponse(HiddenBadgeData hiddenBadgeData, CountdownBadgeData countdownBadgeData, TextBadgeData textBadgeData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.no_badge = hiddenBadgeData;
        this.countdown_badge = countdownBadgeData;
        this.text_badge = textBadgeData;
        if (Internal.countNonNull(hiddenBadgeData, countdownBadgeData, textBadgeData) > 1) {
            throw new IllegalArgumentException("At most one of no_badge, countdown_badge, text_badge may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28931newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetBadgeDataResponse)) {
            return false;
        }
        GetBadgeDataResponse getBadgeDataResponse = (GetBadgeDataResponse) other;
        return Intrinsics.areEqual(unknownFields(), getBadgeDataResponse.unknownFields()) && Intrinsics.areEqual(this.no_badge, getBadgeDataResponse.no_badge) && Intrinsics.areEqual(this.countdown_badge, getBadgeDataResponse.countdown_badge) && Intrinsics.areEqual(this.text_badge, getBadgeDataResponse.text_badge);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        HiddenBadgeData hiddenBadgeData = this.no_badge;
        int iHashCode2 = (iHashCode + (hiddenBadgeData != null ? hiddenBadgeData.hashCode() : 0)) * 37;
        CountdownBadgeData countdownBadgeData = this.countdown_badge;
        int iHashCode3 = (iHashCode2 + (countdownBadgeData != null ? countdownBadgeData.hashCode() : 0)) * 37;
        TextBadgeData textBadgeData = this.text_badge;
        int iHashCode4 = iHashCode3 + (textBadgeData != null ? textBadgeData.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        HiddenBadgeData hiddenBadgeData = this.no_badge;
        if (hiddenBadgeData != null) {
            arrayList.add("no_badge=" + hiddenBadgeData);
        }
        CountdownBadgeData countdownBadgeData = this.countdown_badge;
        if (countdownBadgeData != null) {
            arrayList.add("countdown_badge=" + countdownBadgeData);
        }
        TextBadgeData textBadgeData = this.text_badge;
        if (textBadgeData != null) {
            arrayList.add("text_badge=" + textBadgeData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBadgeDataResponse{", "}", 0, null, null, 56, null);
    }

    public final GetBadgeDataResponse copy(HiddenBadgeData no_badge, CountdownBadgeData countdown_badge, TextBadgeData text_badge, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetBadgeDataResponse(no_badge, countdown_badge, text_badge, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetBadgeDataResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetBadgeDataResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: messaging.proto.badge.v1.GetBadgeDataResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetBadgeDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + GetBadgeDataResponse.HiddenBadgeData.ADAPTER.encodedSizeWithTag(1, value.getNo_badge()) + GetBadgeDataResponse.CountdownBadgeData.ADAPTER.encodedSizeWithTag(2, value.getCountdown_badge()) + GetBadgeDataResponse.TextBadgeData.ADAPTER.encodedSizeWithTag(3, value.getText_badge());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetBadgeDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetBadgeDataResponse.HiddenBadgeData.ADAPTER.encodeWithTag(writer, 1, (int) value.getNo_badge());
                GetBadgeDataResponse.CountdownBadgeData.ADAPTER.encodeWithTag(writer, 2, (int) value.getCountdown_badge());
                GetBadgeDataResponse.TextBadgeData.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_badge());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetBadgeDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetBadgeDataResponse.TextBadgeData.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_badge());
                GetBadgeDataResponse.CountdownBadgeData.ADAPTER.encodeWithTag(writer, 2, (int) value.getCountdown_badge());
                GetBadgeDataResponse.HiddenBadgeData.ADAPTER.encodeWithTag(writer, 1, (int) value.getNo_badge());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBadgeDataResponse redact(GetBadgeDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetBadgeDataResponse.HiddenBadgeData no_badge = value.getNo_badge();
                GetBadgeDataResponse.HiddenBadgeData hiddenBadgeDataRedact = no_badge != null ? GetBadgeDataResponse.HiddenBadgeData.ADAPTER.redact(no_badge) : null;
                GetBadgeDataResponse.CountdownBadgeData countdown_badge = value.getCountdown_badge();
                GetBadgeDataResponse.CountdownBadgeData countdownBadgeDataRedact = countdown_badge != null ? GetBadgeDataResponse.CountdownBadgeData.ADAPTER.redact(countdown_badge) : null;
                GetBadgeDataResponse.TextBadgeData text_badge = value.getText_badge();
                return value.copy(hiddenBadgeDataRedact, countdownBadgeDataRedact, text_badge != null ? GetBadgeDataResponse.TextBadgeData.ADAPTER.redact(text_badge) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBadgeDataResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GetBadgeDataResponse.HiddenBadgeData hiddenBadgeDataDecode = null;
                GetBadgeDataResponse.CountdownBadgeData countdownBadgeDataDecode = null;
                GetBadgeDataResponse.TextBadgeData textBadgeDataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetBadgeDataResponse(hiddenBadgeDataDecode, countdownBadgeDataDecode, textBadgeDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        hiddenBadgeDataDecode = GetBadgeDataResponse.HiddenBadgeData.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        countdownBadgeDataDecode = GetBadgeDataResponse.CountdownBadgeData.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        textBadgeDataDecode = GetBadgeDataResponse.TextBadgeData.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: GetBadgeDataResponse.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;", "Lcom/squareup/wire/Message;", "", "placeholder", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "getPlaceholder", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HiddenBadgeData extends Message {

        @JvmField
        public static final ProtoAdapter<HiddenBadgeData> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean placeholder;

        /* JADX WARN: Multi-variable type inference failed */
        public HiddenBadgeData() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28934newBuilder();
        }

        public final boolean getPlaceholder() {
            return this.placeholder;
        }

        public /* synthetic */ HiddenBadgeData(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HiddenBadgeData(boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.placeholder = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28934newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HiddenBadgeData)) {
                return false;
            }
            HiddenBadgeData hiddenBadgeData = (HiddenBadgeData) other;
            return Intrinsics.areEqual(unknownFields(), hiddenBadgeData.unknownFields()) && this.placeholder == hiddenBadgeData.placeholder;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.placeholder);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("placeholder=" + this.placeholder);
            return CollectionsKt.joinToString$default(arrayList, ", ", "HiddenBadgeData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ HiddenBadgeData copy$default(HiddenBadgeData hiddenBadgeData, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hiddenBadgeData.placeholder;
            }
            if ((i & 2) != 0) {
                byteString = hiddenBadgeData.unknownFields();
            }
            return hiddenBadgeData.copy(z, byteString);
        }

        public final HiddenBadgeData copy(boolean placeholder, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new HiddenBadgeData(placeholder, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HiddenBadgeData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<HiddenBadgeData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: messaging.proto.badge.v1.GetBadgeDataResponse$HiddenBadgeData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetBadgeDataResponse.HiddenBadgeData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getPlaceholder() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getPlaceholder())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetBadgeDataResponse.HiddenBadgeData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getPlaceholder()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getPlaceholder()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetBadgeDataResponse.HiddenBadgeData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getPlaceholder()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getPlaceholder()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.HiddenBadgeData redact(GetBadgeDataResponse.HiddenBadgeData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetBadgeDataResponse.HiddenBadgeData.copy$default(value, false, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.HiddenBadgeData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    boolean zBooleanValue = false;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetBadgeDataResponse.HiddenBadgeData(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: GetBadgeDataResponse.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBÑ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J×\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b\t\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b4\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b5\u0010'R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b6\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b7\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b8\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b9\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b:\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b;\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b?\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b@\u0010'R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "Lcom/squareup/wire/Message;", "", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", ResourceTypes.STYLE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "target_timestamp", "", "is_pulsing", "", "lottie_url_light", "lottie_url_dark", "action_url", "icon_name", "bg_lottie_url_light", "bg_lottie_url_dark", "border_lottie_url_light", "border_lottie_url_dark", "logging_identifier", "use_inline_loading", "completion_text", "completion_icon", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "custom_style_params", "Lokio/ByteString;", "unknownFields", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;Lokio/ByteString;)Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "getStyle", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "Lj$/time/Instant;", "getTarget_timestamp", "()Lj$/time/Instant;", "Z", "()Z", "Ljava/lang/String;", "getLottie_url_light", "getLottie_url_dark", "getAction_url", "getIcon_name", "getBg_lottie_url_light", "getBg_lottie_url_dark", "getBorder_lottie_url_light", "getBorder_lottie_url_dark", "getLogging_identifier", "Ljava/lang/Boolean;", "getUse_inline_loading", "()Ljava/lang/Boolean;", "getCompletion_text", "getCompletion_icon", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "getCustom_style_params", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "Companion", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CountdownBadgeData extends Message {

        @JvmField
        public static final ProtoAdapter<CountdownBadgeData> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionUrl", schemaIndex = 5, tag = 6)
        private final String action_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bgLottieUrlDark", schemaIndex = 8, tag = 9)
        private final String bg_lottie_url_dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bgLottieUrlLight", schemaIndex = 7, tag = 8)
        private final String bg_lottie_url_light;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "borderLottieUrlDark", schemaIndex = 10, tag = 11)
        private final String border_lottie_url_dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "borderLottieUrlLight", schemaIndex = 9, tag = 10)
        private final String border_lottie_url_light;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "completionIcon", schemaIndex = 14, tag = 15)
        private final String completion_icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "completionText", schemaIndex = 13, tag = 14)
        private final String completion_text;

        @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$CustomStyleParams#ADAPTER", jsonName = "customStyleParams", schemaIndex = 15, tag = 16)
        private final CustomStyleParams custom_style_params;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "iconName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final String icon_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPulsing", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean is_pulsing;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 11, tag = 12)
        private final String logging_identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlDark", schemaIndex = 4, tag = 5)
        private final String lottie_url_dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlLight", schemaIndex = 3, tag = 4)
        private final String lottie_url_light;

        @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$BadgeVisualStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final BadgeVisualStyle style;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "targetTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Instant target_timestamp;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useInlineLoading", schemaIndex = 12, tag = 13)
        private final Boolean use_inline_loading;

        public CountdownBadgeData() {
            this(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28932newBuilder();
        }

        public final BadgeVisualStyle getStyle() {
            return this.style;
        }

        public /* synthetic */ CountdownBadgeData(BadgeVisualStyle badgeVisualStyle, Instant instant, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, CustomStyleParams customStyleParams, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BadgeVisualStyle.STYLE_UNSPECIFIED : badgeVisualStyle, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : customStyleParams, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Instant getTarget_timestamp() {
            return this.target_timestamp;
        }

        /* renamed from: is_pulsing, reason: from getter */
        public final boolean getIs_pulsing() {
            return this.is_pulsing;
        }

        public final String getLottie_url_light() {
            return this.lottie_url_light;
        }

        public final String getLottie_url_dark() {
            return this.lottie_url_dark;
        }

        public final String getAction_url() {
            return this.action_url;
        }

        public final String getIcon_name() {
            return this.icon_name;
        }

        public final String getBg_lottie_url_light() {
            return this.bg_lottie_url_light;
        }

        public final String getBg_lottie_url_dark() {
            return this.bg_lottie_url_dark;
        }

        public final String getBorder_lottie_url_light() {
            return this.border_lottie_url_light;
        }

        public final String getBorder_lottie_url_dark() {
            return this.border_lottie_url_dark;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final Boolean getUse_inline_loading() {
            return this.use_inline_loading;
        }

        public final String getCompletion_text() {
            return this.completion_text;
        }

        public final String getCompletion_icon() {
            return this.completion_icon;
        }

        public final CustomStyleParams getCustom_style_params() {
            return this.custom_style_params;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountdownBadgeData(BadgeVisualStyle style, Instant instant, boolean z, String str, String str2, String str3, String icon_name, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, CustomStyleParams customStyleParams, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(icon_name, "icon_name");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.style = style;
            this.target_timestamp = instant;
            this.is_pulsing = z;
            this.lottie_url_light = str;
            this.lottie_url_dark = str2;
            this.action_url = str3;
            this.icon_name = icon_name;
            this.bg_lottie_url_light = str4;
            this.bg_lottie_url_dark = str5;
            this.border_lottie_url_light = str6;
            this.border_lottie_url_dark = str7;
            this.logging_identifier = str8;
            this.use_inline_loading = bool;
            this.completion_text = str9;
            this.completion_icon = str10;
            this.custom_style_params = customStyleParams;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28932newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CountdownBadgeData)) {
                return false;
            }
            CountdownBadgeData countdownBadgeData = (CountdownBadgeData) other;
            return Intrinsics.areEqual(unknownFields(), countdownBadgeData.unknownFields()) && this.style == countdownBadgeData.style && Intrinsics.areEqual(this.target_timestamp, countdownBadgeData.target_timestamp) && this.is_pulsing == countdownBadgeData.is_pulsing && Intrinsics.areEqual(this.lottie_url_light, countdownBadgeData.lottie_url_light) && Intrinsics.areEqual(this.lottie_url_dark, countdownBadgeData.lottie_url_dark) && Intrinsics.areEqual(this.action_url, countdownBadgeData.action_url) && Intrinsics.areEqual(this.icon_name, countdownBadgeData.icon_name) && Intrinsics.areEqual(this.bg_lottie_url_light, countdownBadgeData.bg_lottie_url_light) && Intrinsics.areEqual(this.bg_lottie_url_dark, countdownBadgeData.bg_lottie_url_dark) && Intrinsics.areEqual(this.border_lottie_url_light, countdownBadgeData.border_lottie_url_light) && Intrinsics.areEqual(this.border_lottie_url_dark, countdownBadgeData.border_lottie_url_dark) && Intrinsics.areEqual(this.logging_identifier, countdownBadgeData.logging_identifier) && Intrinsics.areEqual(this.use_inline_loading, countdownBadgeData.use_inline_loading) && Intrinsics.areEqual(this.completion_text, countdownBadgeData.completion_text) && Intrinsics.areEqual(this.completion_icon, countdownBadgeData.completion_icon) && Intrinsics.areEqual(this.custom_style_params, countdownBadgeData.custom_style_params);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.style.hashCode()) * 37;
            Instant instant = this.target_timestamp;
            int iHashCode2 = (((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_pulsing)) * 37;
            String str = this.lottie_url_light;
            int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.lottie_url_dark;
            int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.action_url;
            int iHashCode5 = (((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.icon_name.hashCode()) * 37;
            String str4 = this.bg_lottie_url_light;
            int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.bg_lottie_url_dark;
            int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.border_lottie_url_light;
            int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.border_lottie_url_dark;
            int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.logging_identifier;
            int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
            Boolean bool = this.use_inline_loading;
            int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 37;
            String str9 = this.completion_text;
            int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 37;
            String str10 = this.completion_icon;
            int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 37;
            CustomStyleParams customStyleParams = this.custom_style_params;
            int iHashCode14 = iHashCode13 + (customStyleParams != null ? customStyleParams.hashCode() : 0);
            this.hashCode = iHashCode14;
            return iHashCode14;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("style=" + this.style);
            Instant instant = this.target_timestamp;
            if (instant != null) {
                arrayList.add("target_timestamp=" + instant);
            }
            arrayList.add("is_pulsing=" + this.is_pulsing);
            String str = this.lottie_url_light;
            if (str != null) {
                arrayList.add("lottie_url_light=" + Internal.sanitize(str));
            }
            String str2 = this.lottie_url_dark;
            if (str2 != null) {
                arrayList.add("lottie_url_dark=" + Internal.sanitize(str2));
            }
            String str3 = this.action_url;
            if (str3 != null) {
                arrayList.add("action_url=" + Internal.sanitize(str3));
            }
            arrayList.add("icon_name=" + Internal.sanitize(this.icon_name));
            String str4 = this.bg_lottie_url_light;
            if (str4 != null) {
                arrayList.add("bg_lottie_url_light=" + Internal.sanitize(str4));
            }
            String str5 = this.bg_lottie_url_dark;
            if (str5 != null) {
                arrayList.add("bg_lottie_url_dark=" + Internal.sanitize(str5));
            }
            String str6 = this.border_lottie_url_light;
            if (str6 != null) {
                arrayList.add("border_lottie_url_light=" + Internal.sanitize(str6));
            }
            String str7 = this.border_lottie_url_dark;
            if (str7 != null) {
                arrayList.add("border_lottie_url_dark=" + Internal.sanitize(str7));
            }
            String str8 = this.logging_identifier;
            if (str8 != null) {
                arrayList.add("logging_identifier=" + Internal.sanitize(str8));
            }
            Boolean bool = this.use_inline_loading;
            if (bool != null) {
                arrayList.add("use_inline_loading=" + bool);
            }
            String str9 = this.completion_text;
            if (str9 != null) {
                arrayList.add("completion_text=" + Internal.sanitize(str9));
            }
            String str10 = this.completion_icon;
            if (str10 != null) {
                arrayList.add("completion_icon=" + Internal.sanitize(str10));
            }
            CustomStyleParams customStyleParams = this.custom_style_params;
            if (customStyleParams != null) {
                arrayList.add("custom_style_params=" + customStyleParams);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CountdownBadgeData{", "}", 0, null, null, 56, null);
        }

        public final CountdownBadgeData copy(BadgeVisualStyle style, Instant target_timestamp, boolean is_pulsing, String lottie_url_light, String lottie_url_dark, String action_url, String icon_name, String bg_lottie_url_light, String bg_lottie_url_dark, String border_lottie_url_light, String border_lottie_url_dark, String logging_identifier, Boolean use_inline_loading, String completion_text, String completion_icon, CustomStyleParams custom_style_params, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(icon_name, "icon_name");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CountdownBadgeData(style, target_timestamp, is_pulsing, lottie_url_light, lottie_url_dark, action_url, icon_name, bg_lottie_url_light, bg_lottie_url_dark, border_lottie_url_light, border_lottie_url_dark, logging_identifier, use_inline_loading, completion_text, completion_icon, custom_style_params, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CountdownBadgeData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CountdownBadgeData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: messaging.proto.badge.v1.GetBadgeDataResponse$CountdownBadgeData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetBadgeDataResponse.CountdownBadgeData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getStyle() != GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED) {
                        size += GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.encodedSizeWithTag(1, value.getStyle());
                    }
                    if (value.getTarget_timestamp() != null) {
                        size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTarget_timestamp());
                    }
                    if (value.getIs_pulsing()) {
                        size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_pulsing()));
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getLottie_url_light()) + protoAdapter.encodedSizeWithTag(5, value.getLottie_url_dark()) + protoAdapter.encodedSizeWithTag(6, value.getAction_url());
                    if (!Intrinsics.areEqual(value.getIcon_name(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getIcon_name());
                    }
                    return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(8, value.getBg_lottie_url_light()) + protoAdapter.encodedSizeWithTag(9, value.getBg_lottie_url_dark()) + protoAdapter.encodedSizeWithTag(10, value.getBorder_lottie_url_light()) + protoAdapter.encodedSizeWithTag(11, value.getBorder_lottie_url_dark()) + protoAdapter.encodedSizeWithTag(12, value.getLogging_identifier()) + ProtoAdapter.BOOL.encodedSizeWithTag(13, value.getUse_inline_loading()) + protoAdapter.encodedSizeWithTag(14, value.getCompletion_text()) + protoAdapter.encodedSizeWithTag(15, value.getCompletion_icon()) + GetBadgeDataResponse.CustomStyleParams.ADAPTER.encodedSizeWithTag(16, value.getCustom_style_params());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetBadgeDataResponse.CountdownBadgeData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getStyle() != GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED) {
                        GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                    }
                    if (value.getTarget_timestamp() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTarget_timestamp());
                    }
                    if (value.getIs_pulsing()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_pulsing()));
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getLottie_url_light());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getAction_url());
                    if (!Intrinsics.areEqual(value.getIcon_name(), "")) {
                        protoAdapter.encodeWithTag(writer, 7, (int) value.getIcon_name());
                    }
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getBg_lottie_url_light());
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getBg_lottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getBorder_lottie_url_light());
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getBorder_lottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getLogging_identifier());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) value.getUse_inline_loading());
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getCompletion_text());
                    protoAdapter.encodeWithTag(writer, 15, (int) value.getCompletion_icon());
                    GetBadgeDataResponse.CustomStyleParams.ADAPTER.encodeWithTag(writer, 16, (int) value.getCustom_style_params());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetBadgeDataResponse.CountdownBadgeData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    GetBadgeDataResponse.CustomStyleParams.ADAPTER.encodeWithTag(writer, 16, (int) value.getCustom_style_params());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 15, (int) value.getCompletion_icon());
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getCompletion_text());
                    ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                    protoAdapter2.encodeWithTag(writer, 13, (int) value.getUse_inline_loading());
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getLogging_identifier());
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getBorder_lottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getBorder_lottie_url_light());
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getBg_lottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getBg_lottie_url_light());
                    if (!Intrinsics.areEqual(value.getIcon_name(), "")) {
                        protoAdapter.encodeWithTag(writer, 7, (int) value.getIcon_name());
                    }
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getAction_url());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getLottie_url_light());
                    if (value.getIs_pulsing()) {
                        protoAdapter2.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_pulsing()));
                    }
                    if (value.getTarget_timestamp() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTarget_timestamp());
                    }
                    if (value.getStyle() != GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED) {
                        GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.CountdownBadgeData decode(ProtoReader reader) throws IOException {
                    Instant instant;
                    String str;
                    String str2;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    GetBadgeDataResponse.BadgeVisualStyle badgeVisualStyle = GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    GetBadgeDataResponse.BadgeVisualStyle badgeVisualStyleDecode = badgeVisualStyle;
                    String strDecode = null;
                    String strDecode2 = null;
                    String strDecode3 = null;
                    String strDecode4 = null;
                    String strDecode5 = null;
                    String strDecode6 = null;
                    String strDecode7 = null;
                    Boolean boolDecode = null;
                    String strDecode8 = null;
                    String strDecode9 = null;
                    GetBadgeDataResponse.CustomStyleParams customStyleParamsDecode = null;
                    boolean zBooleanValue = false;
                    String strDecode10 = "";
                    Instant instantDecode = null;
                    String strDecode11 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        badgeVisualStyleDecode = GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.decode(reader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        instant = instantDecode;
                                        str = strDecode11;
                                        str2 = strDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    continue;
                                case 3:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    continue;
                                case 4:
                                    strDecode11 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 5:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 7:
                                    strDecode10 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 8:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 9:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 10:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 11:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 12:
                                    strDecode7 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 13:
                                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 14:
                                    strDecode8 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 15:
                                    strDecode9 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 16:
                                    customStyleParamsDecode = GetBadgeDataResponse.CustomStyleParams.ADAPTER.decode(reader);
                                    continue;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    instant = instantDecode;
                                    str = strDecode11;
                                    str2 = strDecode;
                                    break;
                            }
                            instantDecode = instant;
                            strDecode = str2;
                            strDecode11 = str;
                        } else {
                            return new GetBadgeDataResponse.CountdownBadgeData(badgeVisualStyleDecode, instantDecode, zBooleanValue, strDecode11, strDecode, strDecode2, strDecode10, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, boolDecode, strDecode8, strDecode9, customStyleParamsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.CountdownBadgeData redact(GetBadgeDataResponse.CountdownBadgeData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Instant target_timestamp = value.getTarget_timestamp();
                    Instant instantRedact = target_timestamp != null ? ProtoAdapter.INSTANT.redact(target_timestamp) : null;
                    GetBadgeDataResponse.CustomStyleParams custom_style_params = value.getCustom_style_params();
                    return value.copy((32765 & 1) != 0 ? value.style : null, (32765 & 2) != 0 ? value.target_timestamp : instantRedact, (32765 & 4) != 0 ? value.is_pulsing : false, (32765 & 8) != 0 ? value.lottie_url_light : null, (32765 & 16) != 0 ? value.lottie_url_dark : null, (32765 & 32) != 0 ? value.action_url : null, (32765 & 64) != 0 ? value.icon_name : null, (32765 & 128) != 0 ? value.bg_lottie_url_light : null, (32765 & 256) != 0 ? value.bg_lottie_url_dark : null, (32765 & 512) != 0 ? value.border_lottie_url_light : null, (32765 & 1024) != 0 ? value.border_lottie_url_dark : null, (32765 & 2048) != 0 ? value.logging_identifier : null, (32765 & 4096) != 0 ? value.use_inline_loading : null, (32765 & 8192) != 0 ? value.completion_text : null, (32765 & 16384) != 0 ? value.completion_icon : null, (32765 & 32768) != 0 ? value.custom_style_params : custom_style_params != null ? GetBadgeDataResponse.CustomStyleParams.ADAPTER.redact(custom_style_params) : null, (32765 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: GetBadgeDataResponse.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00018BÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0006H\u0016JÍ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u00107R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\u0014\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u00069"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "Lcom/squareup/wire/Message;", "", ResourceTypes.STYLE, "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "content", "", "icon_name", "lottie_url_light", "lottie_url_dark", "action_url", "is_pulsing", "", "bg_lottie_url_light", "bg_lottie_url_dark", "border_lottie_url_light", "border_lottie_url_dark", "logging_identifier", "use_inline_loading", "badge_identifier", "is_notification_dot_visible", "custom_style_params", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;Lokio/ByteString;)V", "getStyle", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "getContent", "()Ljava/lang/String;", "getIcon_name", "getLottie_url_light", "getLottie_url_dark", "getAction_url", "()Z", "getBg_lottie_url_light", "getBg_lottie_url_dark", "getBorder_lottie_url_light", "getBorder_lottie_url_dark", "getLogging_identifier", "getUse_inline_loading", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBadge_identifier", "getCustom_style_params", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;Lokio/ByteString;)Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "Companion", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TextBadgeData extends Message {

        @JvmField
        public static final ProtoAdapter<TextBadgeData> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionUrl", schemaIndex = 5, tag = 6)
        private final String action_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "badgeIdentifier", schemaIndex = 13, tag = 14)
        private final String badge_identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bgLottieUrlDark", schemaIndex = 8, tag = 9)
        private final String bg_lottie_url_dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bgLottieUrlLight", schemaIndex = 7, tag = 8)
        private final String bg_lottie_url_light;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "borderLottieUrlDark", schemaIndex = 10, tag = 11)
        private final String border_lottie_url_dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "borderLottieUrlLight", schemaIndex = 9, tag = 10)
        private final String border_lottie_url_light;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String content;

        @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$CustomStyleParams#ADAPTER", jsonName = "customStyleParams", schemaIndex = 15, tag = 16)
        private final CustomStyleParams custom_style_params;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "iconName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String icon_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isNotificationDotVisible", schemaIndex = 14, tag = 15)
        private final Boolean is_notification_dot_visible;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPulsing", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final boolean is_pulsing;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 11, tag = 12)
        private final String logging_identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlDark", schemaIndex = 4, tag = 5)
        private final String lottie_url_dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlLight", schemaIndex = 3, tag = 4)
        private final String lottie_url_light;

        @WireField(adapter = "messaging.proto.badge.v1.GetBadgeDataResponse$BadgeVisualStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final BadgeVisualStyle style;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useInlineLoading", schemaIndex = 12, tag = 13)
        private final Boolean use_inline_loading;

        public TextBadgeData() {
            this(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28935newBuilder();
        }

        public final BadgeVisualStyle getStyle() {
            return this.style;
        }

        public /* synthetic */ TextBadgeData(BadgeVisualStyle badgeVisualStyle, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, CustomStyleParams customStyleParams, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BadgeVisualStyle.STYLE_UNSPECIFIED : badgeVisualStyle, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : customStyleParams, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getContent() {
            return this.content;
        }

        public final String getIcon_name() {
            return this.icon_name;
        }

        public final String getLottie_url_light() {
            return this.lottie_url_light;
        }

        public final String getLottie_url_dark() {
            return this.lottie_url_dark;
        }

        public final String getAction_url() {
            return this.action_url;
        }

        /* renamed from: is_pulsing, reason: from getter */
        public final boolean getIs_pulsing() {
            return this.is_pulsing;
        }

        public final String getBg_lottie_url_light() {
            return this.bg_lottie_url_light;
        }

        public final String getBg_lottie_url_dark() {
            return this.bg_lottie_url_dark;
        }

        public final String getBorder_lottie_url_light() {
            return this.border_lottie_url_light;
        }

        public final String getBorder_lottie_url_dark() {
            return this.border_lottie_url_dark;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final Boolean getUse_inline_loading() {
            return this.use_inline_loading;
        }

        public final String getBadge_identifier() {
            return this.badge_identifier;
        }

        /* renamed from: is_notification_dot_visible, reason: from getter */
        public final Boolean getIs_notification_dot_visible() {
            return this.is_notification_dot_visible;
        }

        public final CustomStyleParams getCustom_style_params() {
            return this.custom_style_params;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextBadgeData(BadgeVisualStyle style, String content, String icon_name, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, Boolean bool2, CustomStyleParams customStyleParams, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(icon_name, "icon_name");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.style = style;
            this.content = content;
            this.icon_name = icon_name;
            this.lottie_url_light = str;
            this.lottie_url_dark = str2;
            this.action_url = str3;
            this.is_pulsing = z;
            this.bg_lottie_url_light = str4;
            this.bg_lottie_url_dark = str5;
            this.border_lottie_url_light = str6;
            this.border_lottie_url_dark = str7;
            this.logging_identifier = str8;
            this.use_inline_loading = bool;
            this.badge_identifier = str9;
            this.is_notification_dot_visible = bool2;
            this.custom_style_params = customStyleParams;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28935newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TextBadgeData)) {
                return false;
            }
            TextBadgeData textBadgeData = (TextBadgeData) other;
            return Intrinsics.areEqual(unknownFields(), textBadgeData.unknownFields()) && this.style == textBadgeData.style && Intrinsics.areEqual(this.content, textBadgeData.content) && Intrinsics.areEqual(this.icon_name, textBadgeData.icon_name) && Intrinsics.areEqual(this.lottie_url_light, textBadgeData.lottie_url_light) && Intrinsics.areEqual(this.lottie_url_dark, textBadgeData.lottie_url_dark) && Intrinsics.areEqual(this.action_url, textBadgeData.action_url) && this.is_pulsing == textBadgeData.is_pulsing && Intrinsics.areEqual(this.bg_lottie_url_light, textBadgeData.bg_lottie_url_light) && Intrinsics.areEqual(this.bg_lottie_url_dark, textBadgeData.bg_lottie_url_dark) && Intrinsics.areEqual(this.border_lottie_url_light, textBadgeData.border_lottie_url_light) && Intrinsics.areEqual(this.border_lottie_url_dark, textBadgeData.border_lottie_url_dark) && Intrinsics.areEqual(this.logging_identifier, textBadgeData.logging_identifier) && Intrinsics.areEqual(this.use_inline_loading, textBadgeData.use_inline_loading) && Intrinsics.areEqual(this.badge_identifier, textBadgeData.badge_identifier) && Intrinsics.areEqual(this.is_notification_dot_visible, textBadgeData.is_notification_dot_visible) && Intrinsics.areEqual(this.custom_style_params, textBadgeData.custom_style_params);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((((unknownFields().hashCode() * 37) + this.style.hashCode()) * 37) + this.content.hashCode()) * 37) + this.icon_name.hashCode()) * 37;
            String str = this.lottie_url_light;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.lottie_url_dark;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.action_url;
            int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_pulsing)) * 37;
            String str4 = this.bg_lottie_url_light;
            int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.bg_lottie_url_dark;
            int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.border_lottie_url_light;
            int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.border_lottie_url_dark;
            int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.logging_identifier;
            int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
            Boolean bool = this.use_inline_loading;
            int iHashCode10 = (iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 37;
            String str9 = this.badge_identifier;
            int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
            Boolean bool2 = this.is_notification_dot_visible;
            int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            CustomStyleParams customStyleParams = this.custom_style_params;
            int iHashCode13 = iHashCode12 + (customStyleParams != null ? customStyleParams.hashCode() : 0);
            this.hashCode = iHashCode13;
            return iHashCode13;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("style=" + this.style);
            arrayList.add("content=" + Internal.sanitize(this.content));
            arrayList.add("icon_name=" + Internal.sanitize(this.icon_name));
            String str = this.lottie_url_light;
            if (str != null) {
                arrayList.add("lottie_url_light=" + Internal.sanitize(str));
            }
            String str2 = this.lottie_url_dark;
            if (str2 != null) {
                arrayList.add("lottie_url_dark=" + Internal.sanitize(str2));
            }
            String str3 = this.action_url;
            if (str3 != null) {
                arrayList.add("action_url=" + Internal.sanitize(str3));
            }
            arrayList.add("is_pulsing=" + this.is_pulsing);
            String str4 = this.bg_lottie_url_light;
            if (str4 != null) {
                arrayList.add("bg_lottie_url_light=" + Internal.sanitize(str4));
            }
            String str5 = this.bg_lottie_url_dark;
            if (str5 != null) {
                arrayList.add("bg_lottie_url_dark=" + Internal.sanitize(str5));
            }
            String str6 = this.border_lottie_url_light;
            if (str6 != null) {
                arrayList.add("border_lottie_url_light=" + Internal.sanitize(str6));
            }
            String str7 = this.border_lottie_url_dark;
            if (str7 != null) {
                arrayList.add("border_lottie_url_dark=" + Internal.sanitize(str7));
            }
            String str8 = this.logging_identifier;
            if (str8 != null) {
                arrayList.add("logging_identifier=" + Internal.sanitize(str8));
            }
            Boolean bool = this.use_inline_loading;
            if (bool != null) {
                arrayList.add("use_inline_loading=" + bool);
            }
            String str9 = this.badge_identifier;
            if (str9 != null) {
                arrayList.add("badge_identifier=" + Internal.sanitize(str9));
            }
            Boolean bool2 = this.is_notification_dot_visible;
            if (bool2 != null) {
                arrayList.add("is_notification_dot_visible=" + bool2);
            }
            CustomStyleParams customStyleParams = this.custom_style_params;
            if (customStyleParams != null) {
                arrayList.add("custom_style_params=" + customStyleParams);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextBadgeData{", "}", 0, null, null, 56, null);
        }

        public final TextBadgeData copy(BadgeVisualStyle style, String content, String icon_name, String lottie_url_light, String lottie_url_dark, String action_url, boolean is_pulsing, String bg_lottie_url_light, String bg_lottie_url_dark, String border_lottie_url_light, String border_lottie_url_dark, String logging_identifier, Boolean use_inline_loading, String badge_identifier, Boolean is_notification_dot_visible, CustomStyleParams custom_style_params, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(icon_name, "icon_name");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TextBadgeData(style, content, icon_name, lottie_url_light, lottie_url_dark, action_url, is_pulsing, bg_lottie_url_light, bg_lottie_url_dark, border_lottie_url_light, border_lottie_url_dark, logging_identifier, use_inline_loading, badge_identifier, is_notification_dot_visible, custom_style_params, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextBadgeData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TextBadgeData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: messaging.proto.badge.v1.GetBadgeDataResponse$TextBadgeData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetBadgeDataResponse.TextBadgeData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getStyle() != GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED) {
                        size += GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.encodedSizeWithTag(1, value.getStyle());
                    }
                    if (!Intrinsics.areEqual(value.getContent(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContent());
                    }
                    if (!Intrinsics.areEqual(value.getIcon_name(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIcon_name());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getLottie_url_light()) + protoAdapter.encodedSizeWithTag(5, value.getLottie_url_dark()) + protoAdapter.encodedSizeWithTag(6, value.getAction_url());
                    if (value.getIs_pulsing()) {
                        iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getIs_pulsing()));
                    }
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(8, value.getBg_lottie_url_light()) + protoAdapter.encodedSizeWithTag(9, value.getBg_lottie_url_dark()) + protoAdapter.encodedSizeWithTag(10, value.getBorder_lottie_url_light()) + protoAdapter.encodedSizeWithTag(11, value.getBorder_lottie_url_dark()) + protoAdapter.encodedSizeWithTag(12, value.getLogging_identifier());
                    ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                    return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(13, value.getUse_inline_loading()) + protoAdapter.encodedSizeWithTag(14, value.getBadge_identifier()) + protoAdapter2.encodedSizeWithTag(15, value.getIs_notification_dot_visible()) + GetBadgeDataResponse.CustomStyleParams.ADAPTER.encodedSizeWithTag(16, value.getCustom_style_params());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetBadgeDataResponse.TextBadgeData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getStyle() != GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED) {
                        GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                    }
                    if (!Intrinsics.areEqual(value.getContent(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContent());
                    }
                    if (!Intrinsics.areEqual(value.getIcon_name(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIcon_name());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getLottie_url_light());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getAction_url());
                    if (value.getIs_pulsing()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIs_pulsing()));
                    }
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getBg_lottie_url_light());
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getBg_lottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getBorder_lottie_url_light());
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getBorder_lottie_url_dark());
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getLogging_identifier());
                    ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                    protoAdapter2.encodeWithTag(writer, 13, (int) value.getUse_inline_loading());
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getBadge_identifier());
                    protoAdapter2.encodeWithTag(writer, 15, (int) value.getIs_notification_dot_visible());
                    GetBadgeDataResponse.CustomStyleParams.ADAPTER.encodeWithTag(writer, 16, (int) value.getCustom_style_params());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetBadgeDataResponse.TextBadgeData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    GetBadgeDataResponse.CustomStyleParams.ADAPTER.encodeWithTag(writer, 16, (int) value.getCustom_style_params());
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    protoAdapter.encodeWithTag(writer, 15, (int) value.getIs_notification_dot_visible());
                    ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 14, (int) value.getBadge_identifier());
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getUse_inline_loading());
                    protoAdapter2.encodeWithTag(writer, 12, (int) value.getLogging_identifier());
                    protoAdapter2.encodeWithTag(writer, 11, (int) value.getBorder_lottie_url_dark());
                    protoAdapter2.encodeWithTag(writer, 10, (int) value.getBorder_lottie_url_light());
                    protoAdapter2.encodeWithTag(writer, 9, (int) value.getBg_lottie_url_dark());
                    protoAdapter2.encodeWithTag(writer, 8, (int) value.getBg_lottie_url_light());
                    if (value.getIs_pulsing()) {
                        protoAdapter.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIs_pulsing()));
                    }
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getAction_url());
                    protoAdapter2.encodeWithTag(writer, 5, (int) value.getLottie_url_dark());
                    protoAdapter2.encodeWithTag(writer, 4, (int) value.getLottie_url_light());
                    if (!Intrinsics.areEqual(value.getIcon_name(), "")) {
                        protoAdapter2.encodeWithTag(writer, 3, (int) value.getIcon_name());
                    }
                    if (!Intrinsics.areEqual(value.getContent(), "")) {
                        protoAdapter2.encodeWithTag(writer, 2, (int) value.getContent());
                    }
                    if (value.getStyle() != GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED) {
                        GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.TextBadgeData decode(ProtoReader reader) throws IOException {
                    String str;
                    String str2;
                    String str3;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    GetBadgeDataResponse.BadgeVisualStyle badgeVisualStyle = GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    GetBadgeDataResponse.BadgeVisualStyle badgeVisualStyleDecode = badgeVisualStyle;
                    String strDecode = null;
                    String strDecode2 = null;
                    String strDecode3 = null;
                    String strDecode4 = null;
                    String strDecode5 = null;
                    String strDecode6 = null;
                    String strDecode7 = null;
                    String strDecode8 = null;
                    Boolean boolDecode = null;
                    String strDecode9 = null;
                    Boolean boolDecode2 = null;
                    GetBadgeDataResponse.CustomStyleParams customStyleParamsDecode = null;
                    boolean zBooleanValue = false;
                    String strDecode10 = "";
                    String strDecode11 = strDecode10;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        badgeVisualStyleDecode = GetBadgeDataResponse.BadgeVisualStyle.ADAPTER.decode(reader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        str = strDecode10;
                                        str2 = strDecode11;
                                        str3 = strDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode10 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 3:
                                    strDecode11 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 6:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 7:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    continue;
                                case 8:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 9:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 10:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 11:
                                    strDecode7 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 12:
                                    strDecode8 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 13:
                                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 14:
                                    strDecode9 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 15:
                                    boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                    continue;
                                case 16:
                                    customStyleParamsDecode = GetBadgeDataResponse.CustomStyleParams.ADAPTER.decode(reader);
                                    continue;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    str = strDecode10;
                                    str2 = strDecode11;
                                    str3 = strDecode;
                                    break;
                            }
                            strDecode10 = str;
                            strDecode = str3;
                            strDecode11 = str2;
                        } else {
                            return new GetBadgeDataResponse.TextBadgeData(badgeVisualStyleDecode, strDecode10, strDecode11, strDecode, strDecode2, strDecode3, zBooleanValue, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, boolDecode, strDecode9, boolDecode2, customStyleParamsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.TextBadgeData redact(GetBadgeDataResponse.TextBadgeData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    GetBadgeDataResponse.CustomStyleParams custom_style_params = value.getCustom_style_params();
                    return value.copy((32767 & 1) != 0 ? value.style : null, (32767 & 2) != 0 ? value.content : null, (32767 & 4) != 0 ? value.icon_name : null, (32767 & 8) != 0 ? value.lottie_url_light : null, (32767 & 16) != 0 ? value.lottie_url_dark : null, (32767 & 32) != 0 ? value.action_url : null, (32767 & 64) != 0 ? value.is_pulsing : false, (32767 & 128) != 0 ? value.bg_lottie_url_light : null, (32767 & 256) != 0 ? value.bg_lottie_url_dark : null, (32767 & 512) != 0 ? value.border_lottie_url_light : null, (32767 & 1024) != 0 ? value.border_lottie_url_dark : null, (32767 & 2048) != 0 ? value.logging_identifier : null, (32767 & 4096) != 0 ? value.use_inline_loading : null, (32767 & 8192) != 0 ? value.badge_identifier : null, (32767 & 16384) != 0 ? value.is_notification_dot_visible : null, (32767 & 32768) != 0 ? value.custom_style_params : custom_style_params != null ? GetBadgeDataResponse.CustomStyleParams.ADAPTER.redact(custom_style_params) : null, (32767 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: GetBadgeDataResponse.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\u0081\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010,R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u0006."}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "Lcom/squareup/wire/Message;", "", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "border_color", "pulsating_color", "notification_dot_color", "should_shimmer", "", "background_gradient", "Lrh_server_driven_ui/v1/LinearGradientColor;", "text_gradient", "border_opacity", "", "text_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Boolean;Lrh_server_driven_ui/v1/LinearGradientColor;Lrh_server_driven_ui/v1/LinearGradientColor;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBorder_color", "getPulsating_color", "getNotification_dot_color", "getShould_shimmer", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackground_gradient", "()Lrh_server_driven_ui/v1/LinearGradientColor;", "getText_gradient", "getBorder_opacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getText_color", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Boolean;Lrh_server_driven_ui/v1/LinearGradientColor;Lrh_server_driven_ui/v1/LinearGradientColor;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "Companion", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomStyleParams extends Message {

        @JvmField
        public static final ProtoAdapter<CustomStyleParams> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 0, tag = 1)
        private final ThemedColor background_color;

        @WireField(adapter = "rh_server_driven_ui.v1.LinearGradientColor#ADAPTER", jsonName = "backgroundGradient", schemaIndex = 5, tag = 6)
        private final LinearGradientColor background_gradient;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "borderColor", schemaIndex = 1, tag = 2)
        private final ThemedColor border_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "borderOpacity", schemaIndex = 7, tag = 8)
        private final Float border_opacity;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "notificationDotColor", schemaIndex = 3, tag = 4)
        private final ThemedColor notification_dot_color;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "pulsatingColor", schemaIndex = 2, tag = 3)
        private final ThemedColor pulsating_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldShimmer", schemaIndex = 4, tag = 5)
        private final Boolean should_shimmer;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColor", schemaIndex = 8, tag = 9)
        private final ThemedColor text_color;

        @WireField(adapter = "rh_server_driven_ui.v1.LinearGradientColor#ADAPTER", jsonName = "textGradient", schemaIndex = 6, tag = 7)
        private final LinearGradientColor text_gradient;

        public CustomStyleParams() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28933newBuilder();
        }

        public final ThemedColor getBackground_color() {
            return this.background_color;
        }

        public final ThemedColor getBorder_color() {
            return this.border_color;
        }

        public final ThemedColor getPulsating_color() {
            return this.pulsating_color;
        }

        public final ThemedColor getNotification_dot_color() {
            return this.notification_dot_color;
        }

        public final Boolean getShould_shimmer() {
            return this.should_shimmer;
        }

        public final LinearGradientColor getBackground_gradient() {
            return this.background_gradient;
        }

        public final LinearGradientColor getText_gradient() {
            return this.text_gradient;
        }

        public final Float getBorder_opacity() {
            return this.border_opacity;
        }

        public final ThemedColor getText_color() {
            return this.text_color;
        }

        public /* synthetic */ CustomStyleParams(ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, Boolean bool, LinearGradientColor linearGradientColor, LinearGradientColor linearGradientColor2, Float f, ThemedColor themedColor5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedColor2, (i & 4) != 0 ? null : themedColor3, (i & 8) != 0 ? null : themedColor4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : linearGradientColor, (i & 64) != 0 ? null : linearGradientColor2, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : themedColor5, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomStyleParams(ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, Boolean bool, LinearGradientColor linearGradientColor, LinearGradientColor linearGradientColor2, Float f, ThemedColor themedColor5, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.background_color = themedColor;
            this.border_color = themedColor2;
            this.pulsating_color = themedColor3;
            this.notification_dot_color = themedColor4;
            this.should_shimmer = bool;
            this.background_gradient = linearGradientColor;
            this.text_gradient = linearGradientColor2;
            this.border_opacity = f;
            this.text_color = themedColor5;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28933newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CustomStyleParams)) {
                return false;
            }
            CustomStyleParams customStyleParams = (CustomStyleParams) other;
            return Intrinsics.areEqual(unknownFields(), customStyleParams.unknownFields()) && Intrinsics.areEqual(this.background_color, customStyleParams.background_color) && Intrinsics.areEqual(this.border_color, customStyleParams.border_color) && Intrinsics.areEqual(this.pulsating_color, customStyleParams.pulsating_color) && Intrinsics.areEqual(this.notification_dot_color, customStyleParams.notification_dot_color) && Intrinsics.areEqual(this.should_shimmer, customStyleParams.should_shimmer) && Intrinsics.areEqual(this.background_gradient, customStyleParams.background_gradient) && Intrinsics.areEqual(this.text_gradient, customStyleParams.text_gradient) && Intrinsics.areEqual(this.border_opacity, customStyleParams.border_opacity) && Intrinsics.areEqual(this.text_color, customStyleParams.text_color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ThemedColor themedColor = this.background_color;
            int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
            ThemedColor themedColor2 = this.border_color;
            int iHashCode3 = (iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
            ThemedColor themedColor3 = this.pulsating_color;
            int iHashCode4 = (iHashCode3 + (themedColor3 != null ? themedColor3.hashCode() : 0)) * 37;
            ThemedColor themedColor4 = this.notification_dot_color;
            int iHashCode5 = (iHashCode4 + (themedColor4 != null ? themedColor4.hashCode() : 0)) * 37;
            Boolean bool = this.should_shimmer;
            int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
            LinearGradientColor linearGradientColor = this.background_gradient;
            int iHashCode7 = (iHashCode6 + (linearGradientColor != null ? linearGradientColor.hashCode() : 0)) * 37;
            LinearGradientColor linearGradientColor2 = this.text_gradient;
            int iHashCode8 = (iHashCode7 + (linearGradientColor2 != null ? linearGradientColor2.hashCode() : 0)) * 37;
            Float f = this.border_opacity;
            int iHashCode9 = (iHashCode8 + (f != null ? f.hashCode() : 0)) * 37;
            ThemedColor themedColor5 = this.text_color;
            int iHashCode10 = iHashCode9 + (themedColor5 != null ? themedColor5.hashCode() : 0);
            this.hashCode = iHashCode10;
            return iHashCode10;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ThemedColor themedColor = this.background_color;
            if (themedColor != null) {
                arrayList.add("background_color=" + themedColor);
            }
            ThemedColor themedColor2 = this.border_color;
            if (themedColor2 != null) {
                arrayList.add("border_color=" + themedColor2);
            }
            ThemedColor themedColor3 = this.pulsating_color;
            if (themedColor3 != null) {
                arrayList.add("pulsating_color=" + themedColor3);
            }
            ThemedColor themedColor4 = this.notification_dot_color;
            if (themedColor4 != null) {
                arrayList.add("notification_dot_color=" + themedColor4);
            }
            Boolean bool = this.should_shimmer;
            if (bool != null) {
                arrayList.add("should_shimmer=" + bool);
            }
            LinearGradientColor linearGradientColor = this.background_gradient;
            if (linearGradientColor != null) {
                arrayList.add("background_gradient=" + linearGradientColor);
            }
            LinearGradientColor linearGradientColor2 = this.text_gradient;
            if (linearGradientColor2 != null) {
                arrayList.add("text_gradient=" + linearGradientColor2);
            }
            Float f = this.border_opacity;
            if (f != null) {
                arrayList.add("border_opacity=" + f);
            }
            ThemedColor themedColor5 = this.text_color;
            if (themedColor5 != null) {
                arrayList.add("text_color=" + themedColor5);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomStyleParams{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CustomStyleParams copy$default(CustomStyleParams customStyleParams, ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, Boolean bool, LinearGradientColor linearGradientColor, LinearGradientColor linearGradientColor2, Float f, ThemedColor themedColor5, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                themedColor = customStyleParams.background_color;
            }
            if ((i & 2) != 0) {
                themedColor2 = customStyleParams.border_color;
            }
            if ((i & 4) != 0) {
                themedColor3 = customStyleParams.pulsating_color;
            }
            if ((i & 8) != 0) {
                themedColor4 = customStyleParams.notification_dot_color;
            }
            if ((i & 16) != 0) {
                bool = customStyleParams.should_shimmer;
            }
            if ((i & 32) != 0) {
                linearGradientColor = customStyleParams.background_gradient;
            }
            if ((i & 64) != 0) {
                linearGradientColor2 = customStyleParams.text_gradient;
            }
            if ((i & 128) != 0) {
                f = customStyleParams.border_opacity;
            }
            if ((i & 256) != 0) {
                themedColor5 = customStyleParams.text_color;
            }
            if ((i & 512) != 0) {
                byteString = customStyleParams.unknownFields();
            }
            ThemedColor themedColor6 = themedColor5;
            ByteString byteString2 = byteString;
            LinearGradientColor linearGradientColor3 = linearGradientColor2;
            Float f2 = f;
            Boolean bool2 = bool;
            LinearGradientColor linearGradientColor4 = linearGradientColor;
            return customStyleParams.copy(themedColor, themedColor2, themedColor3, themedColor4, bool2, linearGradientColor4, linearGradientColor3, f2, themedColor6, byteString2);
        }

        public final CustomStyleParams copy(ThemedColor background_color, ThemedColor border_color, ThemedColor pulsating_color, ThemedColor notification_dot_color, Boolean should_shimmer, LinearGradientColor background_gradient, LinearGradientColor text_gradient, Float border_opacity, ThemedColor text_color, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CustomStyleParams(background_color, border_color, pulsating_color, notification_dot_color, should_shimmer, background_gradient, text_gradient, border_opacity, text_color, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomStyleParams.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CustomStyleParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: messaging.proto.badge.v1.GetBadgeDataResponse$CustomStyleParams$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.CustomStyleParams decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ThemedColor themedColorDecode = null;
                    ThemedColor themedColorDecode2 = null;
                    ThemedColor themedColorDecode3 = null;
                    ThemedColor themedColorDecode4 = null;
                    Boolean boolDecode = null;
                    LinearGradientColor linearGradientColorDecode = null;
                    LinearGradientColor linearGradientColorDecode2 = null;
                    Float fDecode = null;
                    ThemedColor themedColorDecode5 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    themedColorDecode3 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    themedColorDecode4 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 6:
                                    linearGradientColorDecode = LinearGradientColor.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    linearGradientColorDecode2 = LinearGradientColor.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 9:
                                    themedColorDecode5 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new GetBadgeDataResponse.CustomStyleParams(themedColorDecode, themedColorDecode2, themedColorDecode3, themedColorDecode4, boolDecode, linearGradientColorDecode, linearGradientColorDecode2, fDecode, themedColorDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetBadgeDataResponse.CustomStyleParams value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getBackground_color()) + protoAdapter.encodedSizeWithTag(2, value.getBorder_color()) + protoAdapter.encodedSizeWithTag(3, value.getPulsating_color()) + protoAdapter.encodedSizeWithTag(4, value.getNotification_dot_color()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getShould_shimmer());
                    ProtoAdapter<LinearGradientColor> protoAdapter2 = LinearGradientColor.ADAPTER;
                    return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, value.getBackground_gradient()) + protoAdapter2.encodedSizeWithTag(7, value.getText_gradient()) + ProtoAdapter.FLOAT.encodedSizeWithTag(8, value.getBorder_opacity()) + protoAdapter.encodedSizeWithTag(9, value.getText_color());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetBadgeDataResponse.CustomStyleParams value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getBackground_color());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBorder_color());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPulsating_color());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getNotification_dot_color());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getShould_shimmer());
                    ProtoAdapter<LinearGradientColor> protoAdapter2 = LinearGradientColor.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getBackground_gradient());
                    protoAdapter2.encodeWithTag(writer, 7, (int) value.getText_gradient());
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 8, (int) value.getBorder_opacity());
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getText_color());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetBadgeDataResponse.CustomStyleParams value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getText_color());
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 8, (int) value.getBorder_opacity());
                    ProtoAdapter<LinearGradientColor> protoAdapter2 = LinearGradientColor.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 7, (int) value.getText_gradient());
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getBackground_gradient());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getShould_shimmer());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getNotification_dot_color());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPulsating_color());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBorder_color());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getBackground_color());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetBadgeDataResponse.CustomStyleParams redact(GetBadgeDataResponse.CustomStyleParams value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ThemedColor background_color = value.getBackground_color();
                    ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                    ThemedColor border_color = value.getBorder_color();
                    ThemedColor themedColorRedact2 = border_color != null ? ThemedColor.ADAPTER.redact(border_color) : null;
                    ThemedColor pulsating_color = value.getPulsating_color();
                    ThemedColor themedColorRedact3 = pulsating_color != null ? ThemedColor.ADAPTER.redact(pulsating_color) : null;
                    ThemedColor notification_dot_color = value.getNotification_dot_color();
                    ThemedColor themedColorRedact4 = notification_dot_color != null ? ThemedColor.ADAPTER.redact(notification_dot_color) : null;
                    LinearGradientColor background_gradient = value.getBackground_gradient();
                    LinearGradientColor linearGradientColorRedact = background_gradient != null ? LinearGradientColor.ADAPTER.redact(background_gradient) : null;
                    LinearGradientColor text_gradient = value.getText_gradient();
                    LinearGradientColor linearGradientColorRedact2 = text_gradient != null ? LinearGradientColor.ADAPTER.redact(text_gradient) : null;
                    ThemedColor text_color = value.getText_color();
                    return GetBadgeDataResponse.CustomStyleParams.copy$default(value, themedColorRedact, themedColorRedact2, themedColorRedact3, themedColorRedact4, null, linearGradientColorRedact, linearGradientColorRedact2, null, text_color != null ? ThemedColor.ADAPTER.redact(text_color) : null, ByteString.EMPTY, 144, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetBadgeDataResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STYLE_UNSPECIFIED", "STANDARD", "GOLD", "CRYPTO", "CRYPTO_LIVE", "MARKET", "CUSTOM", "Companion", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BadgeVisualStyle implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BadgeVisualStyle[] $VALUES;

        @JvmField
        public static final ProtoAdapter<BadgeVisualStyle> ADAPTER;
        public static final BadgeVisualStyle CRYPTO;
        public static final BadgeVisualStyle CRYPTO_LIVE;
        public static final BadgeVisualStyle CUSTOM;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final BadgeVisualStyle GOLD;
        public static final BadgeVisualStyle MARKET;
        public static final BadgeVisualStyle STANDARD;
        public static final BadgeVisualStyle STYLE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ BadgeVisualStyle[] $values() {
            return new BadgeVisualStyle[]{STYLE_UNSPECIFIED, STANDARD, GOLD, CRYPTO, CRYPTO_LIVE, MARKET, CUSTOM};
        }

        @JvmStatic
        public static final BadgeVisualStyle fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<BadgeVisualStyle> getEntries() {
            return $ENTRIES;
        }

        private BadgeVisualStyle(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final BadgeVisualStyle badgeVisualStyle = new BadgeVisualStyle("STYLE_UNSPECIFIED", 0, 0);
            STYLE_UNSPECIFIED = badgeVisualStyle;
            STANDARD = new BadgeVisualStyle("STANDARD", 1, 1);
            GOLD = new BadgeVisualStyle("GOLD", 2, 2);
            CRYPTO = new BadgeVisualStyle("CRYPTO", 3, 3);
            CRYPTO_LIVE = new BadgeVisualStyle("CRYPTO_LIVE", 4, 4);
            MARKET = new BadgeVisualStyle("MARKET", 5, 5);
            CUSTOM = new BadgeVisualStyle("CUSTOM", 6, 6);
            BadgeVisualStyle[] badgeVisualStyleArr$values = $values();
            $VALUES = badgeVisualStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(badgeVisualStyleArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BadgeVisualStyle.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<BadgeVisualStyle>(orCreateKotlinClass, syntax, badgeVisualStyle) { // from class: messaging.proto.badge.v1.GetBadgeDataResponse$BadgeVisualStyle$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GetBadgeDataResponse.BadgeVisualStyle fromValue(int value) {
                    return GetBadgeDataResponse.BadgeVisualStyle.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GetBadgeDataResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "fromValue", "value", "", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final BadgeVisualStyle fromValue(int value) {
                switch (value) {
                    case 0:
                        return BadgeVisualStyle.STYLE_UNSPECIFIED;
                    case 1:
                        return BadgeVisualStyle.STANDARD;
                    case 2:
                        return BadgeVisualStyle.GOLD;
                    case 3:
                        return BadgeVisualStyle.CRYPTO;
                    case 4:
                        return BadgeVisualStyle.CRYPTO_LIVE;
                    case 5:
                        return BadgeVisualStyle.MARKET;
                    case 6:
                        return BadgeVisualStyle.CUSTOM;
                    default:
                        return null;
                }
            }
        }

        public static BadgeVisualStyle valueOf(String str) {
            return (BadgeVisualStyle) Enum.valueOf(BadgeVisualStyle.class, str);
        }

        public static BadgeVisualStyle[] values() {
            return (BadgeVisualStyle[]) $VALUES.clone();
        }
    }
}
