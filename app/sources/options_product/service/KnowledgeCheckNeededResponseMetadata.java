package options_product.service;

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
import p479j$.time.Instant;

/* compiled from: KnowledgeCheckNeededResponseMetadata.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0093\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0099\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010 R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010 R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\"\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b\r\u0010%R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b\u000e\u0010%R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b\u000f\u0010%R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b.\u0010%R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b/\u0010 ¨\u00061"}, m3636d2 = {"Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "Lcom/squareup/wire/Message;", "", "", "appointment_enabled", "", "appointment_message_override", "chat_enabled", "chat_message_override", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "chat_start_time", "chat_end_time", "is_half_day", "is_weekend", "is_holiday", "chat_hidden", "disclosure_contentful_id", "Lokio/ByteString;", "unknownFields", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZZLjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZZLjava/lang/String;Lokio/ByteString;)Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "Z", "getAppointment_enabled", "()Z", "Ljava/lang/String;", "getAppointment_message_override", "getChat_enabled", "getChat_message_override", "Lj$/time/Instant;", "getChat_start_time", "()Lj$/time/Instant;", "getChat_end_time", "getChat_hidden", "getDisclosure_contentful_id", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class KnowledgeCheckNeededResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<KnowledgeCheckNeededResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "appointmentEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean appointment_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appointmentMessageOverride", schemaIndex = 1, tag = 2)
    private final String appointment_message_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chatEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean chat_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "chatEndTime", schemaIndex = 5, tag = 6)
    private final Instant chat_end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chatHidden", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean chat_hidden;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chatMessageOverride", schemaIndex = 3, tag = 4)
    private final String chat_message_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "chatStartTime", schemaIndex = 4, tag = 5)
    private final Instant chat_start_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureContentfulId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String disclosure_contentful_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHalfDay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean is_half_day;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHoliday", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean is_holiday;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isWeekend", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean is_weekend;

    public KnowledgeCheckNeededResponseMetadata() {
        this(false, null, false, null, null, null, false, false, false, false, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29510newBuilder();
    }

    public final boolean getAppointment_enabled() {
        return this.appointment_enabled;
    }

    public final String getAppointment_message_override() {
        return this.appointment_message_override;
    }

    public final boolean getChat_enabled() {
        return this.chat_enabled;
    }

    public final String getChat_message_override() {
        return this.chat_message_override;
    }

    public final Instant getChat_start_time() {
        return this.chat_start_time;
    }

    public final Instant getChat_end_time() {
        return this.chat_end_time;
    }

    /* renamed from: is_half_day, reason: from getter */
    public final boolean getIs_half_day() {
        return this.is_half_day;
    }

    /* renamed from: is_weekend, reason: from getter */
    public final boolean getIs_weekend() {
        return this.is_weekend;
    }

    /* renamed from: is_holiday, reason: from getter */
    public final boolean getIs_holiday() {
        return this.is_holiday;
    }

    public final boolean getChat_hidden() {
        return this.chat_hidden;
    }

    public final String getDisclosure_contentful_id() {
        return this.disclosure_contentful_id;
    }

    public /* synthetic */ KnowledgeCheckNeededResponseMetadata(boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? instant2 : null, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) == 0 ? z6 : false, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeCheckNeededResponseMetadata(boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String disclosure_contentful_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(disclosure_contentful_id, "disclosure_contentful_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.appointment_enabled = z;
        this.appointment_message_override = str;
        this.chat_enabled = z2;
        this.chat_message_override = str2;
        this.chat_start_time = instant;
        this.chat_end_time = instant2;
        this.is_half_day = z3;
        this.is_weekend = z4;
        this.is_holiday = z5;
        this.chat_hidden = z6;
        this.disclosure_contentful_id = disclosure_contentful_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29510newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof KnowledgeCheckNeededResponseMetadata)) {
            return false;
        }
        KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadata = (KnowledgeCheckNeededResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), knowledgeCheckNeededResponseMetadata.unknownFields()) && this.appointment_enabled == knowledgeCheckNeededResponseMetadata.appointment_enabled && Intrinsics.areEqual(this.appointment_message_override, knowledgeCheckNeededResponseMetadata.appointment_message_override) && this.chat_enabled == knowledgeCheckNeededResponseMetadata.chat_enabled && Intrinsics.areEqual(this.chat_message_override, knowledgeCheckNeededResponseMetadata.chat_message_override) && Intrinsics.areEqual(this.chat_start_time, knowledgeCheckNeededResponseMetadata.chat_start_time) && Intrinsics.areEqual(this.chat_end_time, knowledgeCheckNeededResponseMetadata.chat_end_time) && this.is_half_day == knowledgeCheckNeededResponseMetadata.is_half_day && this.is_weekend == knowledgeCheckNeededResponseMetadata.is_weekend && this.is_holiday == knowledgeCheckNeededResponseMetadata.is_holiday && this.chat_hidden == knowledgeCheckNeededResponseMetadata.chat_hidden && Intrinsics.areEqual(this.disclosure_contentful_id, knowledgeCheckNeededResponseMetadata.disclosure_contentful_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.appointment_enabled)) * 37;
        String str = this.appointment_message_override;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.chat_enabled)) * 37;
        String str2 = this.chat_message_override;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Instant instant = this.chat_start_time;
        int iHashCode4 = (iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.chat_end_time;
        int iHashCode5 = ((((((((((iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_half_day)) * 37) + Boolean.hashCode(this.is_weekend)) * 37) + Boolean.hashCode(this.is_holiday)) * 37) + Boolean.hashCode(this.chat_hidden)) * 37) + this.disclosure_contentful_id.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("appointment_enabled=" + this.appointment_enabled);
        String str = this.appointment_message_override;
        if (str != null) {
            arrayList.add("appointment_message_override=" + Internal.sanitize(str));
        }
        arrayList.add("chat_enabled=" + this.chat_enabled);
        String str2 = this.chat_message_override;
        if (str2 != null) {
            arrayList.add("chat_message_override=" + Internal.sanitize(str2));
        }
        Instant instant = this.chat_start_time;
        if (instant != null) {
            arrayList.add("chat_start_time=" + instant);
        }
        Instant instant2 = this.chat_end_time;
        if (instant2 != null) {
            arrayList.add("chat_end_time=" + instant2);
        }
        arrayList.add("is_half_day=" + this.is_half_day);
        arrayList.add("is_weekend=" + this.is_weekend);
        arrayList.add("is_holiday=" + this.is_holiday);
        arrayList.add("chat_hidden=" + this.chat_hidden);
        arrayList.add("disclosure_contentful_id=" + Internal.sanitize(this.disclosure_contentful_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "KnowledgeCheckNeededResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ KnowledgeCheckNeededResponseMetadata copy$default(KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadata, boolean z, String str, boolean z2, String str2, Instant instant, Instant instant2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = knowledgeCheckNeededResponseMetadata.appointment_enabled;
        }
        if ((i & 2) != 0) {
            str = knowledgeCheckNeededResponseMetadata.appointment_message_override;
        }
        if ((i & 4) != 0) {
            z2 = knowledgeCheckNeededResponseMetadata.chat_enabled;
        }
        if ((i & 8) != 0) {
            str2 = knowledgeCheckNeededResponseMetadata.chat_message_override;
        }
        if ((i & 16) != 0) {
            instant = knowledgeCheckNeededResponseMetadata.chat_start_time;
        }
        if ((i & 32) != 0) {
            instant2 = knowledgeCheckNeededResponseMetadata.chat_end_time;
        }
        if ((i & 64) != 0) {
            z3 = knowledgeCheckNeededResponseMetadata.is_half_day;
        }
        if ((i & 128) != 0) {
            z4 = knowledgeCheckNeededResponseMetadata.is_weekend;
        }
        if ((i & 256) != 0) {
            z5 = knowledgeCheckNeededResponseMetadata.is_holiday;
        }
        if ((i & 512) != 0) {
            z6 = knowledgeCheckNeededResponseMetadata.chat_hidden;
        }
        if ((i & 1024) != 0) {
            str3 = knowledgeCheckNeededResponseMetadata.disclosure_contentful_id;
        }
        if ((i & 2048) != 0) {
            byteString = knowledgeCheckNeededResponseMetadata.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z3;
        boolean z10 = z4;
        Instant instant3 = instant;
        Instant instant4 = instant2;
        return knowledgeCheckNeededResponseMetadata.copy(z, str, z2, str2, instant3, instant4, z9, z10, z7, z8, str4, byteString2);
    }

    public final KnowledgeCheckNeededResponseMetadata copy(boolean appointment_enabled, String appointment_message_override, boolean chat_enabled, String chat_message_override, Instant chat_start_time, Instant chat_end_time, boolean is_half_day, boolean is_weekend, boolean is_holiday, boolean chat_hidden, String disclosure_contentful_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(disclosure_contentful_id, "disclosure_contentful_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new KnowledgeCheckNeededResponseMetadata(appointment_enabled, appointment_message_override, chat_enabled, chat_message_override, chat_start_time, chat_end_time, is_half_day, is_weekend, is_holiday, chat_hidden, disclosure_contentful_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KnowledgeCheckNeededResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<KnowledgeCheckNeededResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.KnowledgeCheckNeededResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(KnowledgeCheckNeededResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAppointment_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getAppointment_enabled()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getAppointment_message_override());
                if (value.getChat_enabled()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getChat_enabled()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getChat_message_override());
                ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, value.getChat_start_time()) + protoAdapter2.encodedSizeWithTag(6, value.getChat_end_time());
                if (value.getIs_half_day()) {
                    iEncodedSizeWithTag3 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getIs_half_day()));
                }
                if (value.getIs_weekend()) {
                    iEncodedSizeWithTag3 += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_weekend()));
                }
                if (value.getIs_holiday()) {
                    iEncodedSizeWithTag3 += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getIs_holiday()));
                }
                if (value.getChat_hidden()) {
                    iEncodedSizeWithTag3 += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getChat_hidden()));
                }
                return !Intrinsics.areEqual(value.getDisclosure_contentful_id(), "") ? iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(11, value.getDisclosure_contentful_id()) : iEncodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, KnowledgeCheckNeededResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAppointment_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getAppointment_enabled()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAppointment_message_override());
                if (value.getChat_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getChat_enabled()));
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getChat_message_override());
                ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getChat_start_time());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getChat_end_time());
                if (value.getIs_half_day()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIs_half_day()));
                }
                if (value.getIs_weekend()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_weekend()));
                }
                if (value.getIs_holiday()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getIs_holiday()));
                }
                if (value.getChat_hidden()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getChat_hidden()));
                }
                if (!Intrinsics.areEqual(value.getDisclosure_contentful_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getDisclosure_contentful_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, KnowledgeCheckNeededResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDisclosure_contentful_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getDisclosure_contentful_id());
                }
                if (value.getChat_hidden()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getChat_hidden()));
                }
                if (value.getIs_holiday()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getIs_holiday()));
                }
                if (value.getIs_weekend()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_weekend()));
                }
                if (value.getIs_half_day()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIs_half_day()));
                }
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getChat_end_time());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getChat_start_time());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getChat_message_override());
                if (value.getChat_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getChat_enabled()));
                }
                protoAdapter2.encodeWithTag(writer, 2, (int) value.getAppointment_message_override());
                if (value.getAppointment_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getAppointment_enabled()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KnowledgeCheckNeededResponseMetadata redact(KnowledgeCheckNeededResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant chat_start_time = value.getChat_start_time();
                Instant instantRedact = chat_start_time != null ? ProtoAdapter.INSTANT.redact(chat_start_time) : null;
                Instant chat_end_time = value.getChat_end_time();
                return KnowledgeCheckNeededResponseMetadata.copy$default(value, false, null, false, null, instantRedact, chat_end_time != null ? ProtoAdapter.INSTANT.redact(chat_end_time) : null, false, false, false, false, null, ByteString.EMPTY, 1999, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KnowledgeCheckNeededResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                boolean zBooleanValue5 = false;
                boolean zBooleanValue6 = false;
                String strDecode2 = null;
                Instant instantDecode = null;
                String strDecode3 = "";
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 10:
                                zBooleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new KnowledgeCheckNeededResponseMetadata(zBooleanValue, strDecode, zBooleanValue2, strDecode2, instantDecode2, instantDecode, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
