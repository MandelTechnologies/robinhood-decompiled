package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext;
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

/* compiled from: SupportAppointmentSettingContext.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext;", "Lcom/squareup/wire/Message;", "", "case_intent", "", "campaign_id", "scheduling_type", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "appointment_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;Ljava/lang/String;Lokio/ByteString;)V", "getCase_intent", "()Ljava/lang/String;", "getCampaign_id", "getScheduling_type", "()Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "getAppointment_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AppointmentSchedulingType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SupportAppointmentSettingContext extends Message {

    @JvmField
    public static final ProtoAdapter<SupportAppointmentSettingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appointmentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String appointment_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "campaignId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String campaign_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "caseIntent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String case_intent;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext$AppointmentSchedulingType#ADAPTER", jsonName = "schedulingType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AppointmentSchedulingType scheduling_type;

    public SupportAppointmentSettingContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ SupportAppointmentSettingContext(String str, String str2, AppointmentSchedulingType appointmentSchedulingType, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED : appointmentSchedulingType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24570newBuilder();
    }

    public final String getCase_intent() {
        return this.case_intent;
    }

    public final String getCampaign_id() {
        return this.campaign_id;
    }

    public final AppointmentSchedulingType getScheduling_type() {
        return this.scheduling_type;
    }

    public final String getAppointment_id() {
        return this.appointment_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportAppointmentSettingContext(String case_intent, String campaign_id, AppointmentSchedulingType scheduling_type, String appointment_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(case_intent, "case_intent");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(scheduling_type, "scheduling_type");
        Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.case_intent = case_intent;
        this.campaign_id = campaign_id;
        this.scheduling_type = scheduling_type;
        this.appointment_id = appointment_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24570newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SupportAppointmentSettingContext)) {
            return false;
        }
        SupportAppointmentSettingContext supportAppointmentSettingContext = (SupportAppointmentSettingContext) other;
        return Intrinsics.areEqual(unknownFields(), supportAppointmentSettingContext.unknownFields()) && Intrinsics.areEqual(this.case_intent, supportAppointmentSettingContext.case_intent) && Intrinsics.areEqual(this.campaign_id, supportAppointmentSettingContext.campaign_id) && this.scheduling_type == supportAppointmentSettingContext.scheduling_type && Intrinsics.areEqual(this.appointment_id, supportAppointmentSettingContext.appointment_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.case_intent.hashCode()) * 37) + this.campaign_id.hashCode()) * 37) + this.scheduling_type.hashCode()) * 37) + this.appointment_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("case_intent=" + Internal.sanitize(this.case_intent));
        arrayList.add("campaign_id=" + Internal.sanitize(this.campaign_id));
        arrayList.add("scheduling_type=" + this.scheduling_type);
        arrayList.add("appointment_id=" + Internal.sanitize(this.appointment_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportAppointmentSettingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SupportAppointmentSettingContext copy$default(SupportAppointmentSettingContext supportAppointmentSettingContext, String str, String str2, AppointmentSchedulingType appointmentSchedulingType, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportAppointmentSettingContext.case_intent;
        }
        if ((i & 2) != 0) {
            str2 = supportAppointmentSettingContext.campaign_id;
        }
        if ((i & 4) != 0) {
            appointmentSchedulingType = supportAppointmentSettingContext.scheduling_type;
        }
        if ((i & 8) != 0) {
            str3 = supportAppointmentSettingContext.appointment_id;
        }
        if ((i & 16) != 0) {
            byteString = supportAppointmentSettingContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        AppointmentSchedulingType appointmentSchedulingType2 = appointmentSchedulingType;
        return supportAppointmentSettingContext.copy(str, str2, appointmentSchedulingType2, str3, byteString2);
    }

    public final SupportAppointmentSettingContext copy(String case_intent, String campaign_id, AppointmentSchedulingType scheduling_type, String appointment_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(case_intent, "case_intent");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(scheduling_type, "scheduling_type");
        Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SupportAppointmentSettingContext(case_intent, campaign_id, scheduling_type, appointment_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SupportAppointmentSettingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SupportAppointmentSettingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SupportAppointmentSettingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCase_intent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCase_intent());
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCampaign_id());
                }
                if (value.getScheduling_type() != SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED) {
                    size += SupportAppointmentSettingContext.AppointmentSchedulingType.ADAPTER.encodedSizeWithTag(3, value.getScheduling_type());
                }
                return !Intrinsics.areEqual(value.getAppointment_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAppointment_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SupportAppointmentSettingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCase_intent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCase_intent());
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCampaign_id());
                }
                if (value.getScheduling_type() != SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED) {
                    SupportAppointmentSettingContext.AppointmentSchedulingType.ADAPTER.encodeWithTag(writer, 3, (int) value.getScheduling_type());
                }
                if (!Intrinsics.areEqual(value.getAppointment_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAppointment_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SupportAppointmentSettingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAppointment_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAppointment_id());
                }
                if (value.getScheduling_type() != SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED) {
                    SupportAppointmentSettingContext.AppointmentSchedulingType.ADAPTER.encodeWithTag(writer, 3, (int) value.getScheduling_type());
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCampaign_id());
                }
                if (Intrinsics.areEqual(value.getCase_intent(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCase_intent());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SupportAppointmentSettingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SupportAppointmentSettingContext.AppointmentSchedulingType appointmentSchedulingTypeDecode = SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    SupportAppointmentSettingContext.AppointmentSchedulingType appointmentSchedulingType = appointmentSchedulingTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new SupportAppointmentSettingContext(strDecode, strDecode2, appointmentSchedulingType, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                appointmentSchedulingTypeDecode = SupportAppointmentSettingContext.AppointmentSchedulingType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SupportAppointmentSettingContext redact(SupportAppointmentSettingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SupportAppointmentSettingContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SupportAppointmentSettingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED", "SCHEDULE", "RESCHEDULE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AppointmentSchedulingType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AppointmentSchedulingType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AppointmentSchedulingType> ADAPTER;
        public static final AppointmentSchedulingType APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AppointmentSchedulingType RESCHEDULE;
        public static final AppointmentSchedulingType SCHEDULE;
        private final int value;

        private static final /* synthetic */ AppointmentSchedulingType[] $values() {
            return new AppointmentSchedulingType[]{APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED, SCHEDULE, RESCHEDULE};
        }

        @JvmStatic
        public static final AppointmentSchedulingType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AppointmentSchedulingType> getEntries() {
            return $ENTRIES;
        }

        private AppointmentSchedulingType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AppointmentSchedulingType appointmentSchedulingType = new AppointmentSchedulingType("APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED", 0, 0);
            APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED = appointmentSchedulingType;
            SCHEDULE = new AppointmentSchedulingType("SCHEDULE", 1, 1);
            RESCHEDULE = new AppointmentSchedulingType("RESCHEDULE", 2, 2);
            AppointmentSchedulingType[] appointmentSchedulingTypeArr$values = $values();
            $VALUES = appointmentSchedulingTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appointmentSchedulingTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppointmentSchedulingType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AppointmentSchedulingType>(orCreateKotlinClass, syntax, appointmentSchedulingType) { // from class: com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext$AppointmentSchedulingType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SupportAppointmentSettingContext.AppointmentSchedulingType fromValue(int value) {
                    return SupportAppointmentSettingContext.AppointmentSchedulingType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SupportAppointmentSettingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AppointmentSchedulingType fromValue(int value) {
                if (value == 0) {
                    return AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AppointmentSchedulingType.SCHEDULE;
                }
                if (value != 2) {
                    return null;
                }
                return AppointmentSchedulingType.RESCHEDULE;
            }
        }

        public static AppointmentSchedulingType valueOf(String str) {
            return (AppointmentSchedulingType) Enum.valueOf(AppointmentSchedulingType.class, str);
        }

        public static AppointmentSchedulingType[] values() {
            return (AppointmentSchedulingType[]) $VALUES.clone();
        }
    }
}
