package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PersonaInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PersonaInfo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PersonaInfo;", "Lcom/squareup/wire/Message;", "", "status", "Lcom/robinhood/rosetta/eventlogging/PersonaInfo$PersonaStatus;", "action_description", "", "attributes", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PersonaInfo$PersonaStatus;Ljava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PersonaInfo$PersonaStatus;", "getAction_description", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "PersonaStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PersonaInfo extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String action_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final Map<String, String> attributes;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PersonaInfo$PersonaStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PersonaStatus status;

    @JvmField
    public static final ProtoAdapter<PersonaInfo> ADAPTER = new PersonaInfo2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(PersonaInfo.class), Syntax.PROTO_3);

    public PersonaInfo() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24499newBuilder();
    }

    public final PersonaStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ PersonaInfo(PersonaStatus personaStatus, String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PersonaStatus.PERSONA_STATUS_UNSPECIFIED : personaStatus, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAction_description() {
        return this.action_description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaInfo(PersonaStatus status, String action_description, Map<String, String> attributes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(action_description, "action_description");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
        this.action_description = action_description;
        this.attributes = Internal.immutableCopyOf("attributes", attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24499newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PersonaInfo)) {
            return false;
        }
        PersonaInfo personaInfo = (PersonaInfo) other;
        return Intrinsics.areEqual(unknownFields(), personaInfo.unknownFields()) && this.status == personaInfo.status && Intrinsics.areEqual(this.action_description, personaInfo.action_description) && Intrinsics.areEqual(this.attributes, personaInfo.attributes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37) + this.action_description.hashCode()) * 37) + this.attributes.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + this.status);
        arrayList.add("action_description=" + Internal.sanitize(this.action_description));
        if (!this.attributes.isEmpty()) {
            arrayList.add("attributes=" + this.attributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonaInfo{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonaInfo copy$default(PersonaInfo personaInfo, PersonaStatus personaStatus, String str, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            personaStatus = personaInfo.status;
        }
        if ((i & 2) != 0) {
            str = personaInfo.action_description;
        }
        if ((i & 4) != 0) {
            map = personaInfo.attributes;
        }
        if ((i & 8) != 0) {
            byteString = personaInfo.unknownFields();
        }
        return personaInfo.copy(personaStatus, str, map, byteString);
    }

    public final PersonaInfo copy(PersonaStatus status, String action_description, Map<String, String> attributes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(action_description, "action_description");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PersonaInfo(status, action_description, attributes, unknownFields);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PersonaInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PersonaInfo$PersonaStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PERSONA_STATUS_UNSPECIFIED", "PERSONA_STARTED", "PERSONA_COMPLETED", "PERSONA_FAILED", "PERSONA_CANCELLED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PersonaStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PersonaStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<PersonaStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PersonaStatus PERSONA_CANCELLED;
        public static final PersonaStatus PERSONA_COMPLETED;
        public static final PersonaStatus PERSONA_FAILED;
        public static final PersonaStatus PERSONA_STARTED;
        public static final PersonaStatus PERSONA_STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ PersonaStatus[] $values() {
            return new PersonaStatus[]{PERSONA_STATUS_UNSPECIFIED, PERSONA_STARTED, PERSONA_COMPLETED, PERSONA_FAILED, PERSONA_CANCELLED};
        }

        @JvmStatic
        public static final PersonaStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PersonaStatus> getEntries() {
            return $ENTRIES;
        }

        private PersonaStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PersonaStatus personaStatus = new PersonaStatus("PERSONA_STATUS_UNSPECIFIED", 0, 0);
            PERSONA_STATUS_UNSPECIFIED = personaStatus;
            PERSONA_STARTED = new PersonaStatus("PERSONA_STARTED", 1, 1);
            PERSONA_COMPLETED = new PersonaStatus("PERSONA_COMPLETED", 2, 2);
            PERSONA_FAILED = new PersonaStatus("PERSONA_FAILED", 3, 3);
            PERSONA_CANCELLED = new PersonaStatus("PERSONA_CANCELLED", 4, 4);
            PersonaStatus[] personaStatusArr$values = $values();
            $VALUES = personaStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(personaStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PersonaStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PersonaStatus>(orCreateKotlinClass, syntax, personaStatus) { // from class: com.robinhood.rosetta.eventlogging.PersonaInfo$PersonaStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PersonaInfo.PersonaStatus fromValue(int value) {
                    return PersonaInfo.PersonaStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PersonaInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PersonaInfo$PersonaStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PersonaInfo$PersonaStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PersonaStatus fromValue(int value) {
                if (value == 0) {
                    return PersonaStatus.PERSONA_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return PersonaStatus.PERSONA_STARTED;
                }
                if (value == 2) {
                    return PersonaStatus.PERSONA_COMPLETED;
                }
                if (value == 3) {
                    return PersonaStatus.PERSONA_FAILED;
                }
                if (value != 4) {
                    return null;
                }
                return PersonaStatus.PERSONA_CANCELLED;
            }
        }

        public static PersonaStatus valueOf(String str) {
            return (PersonaStatus) Enum.valueOf(PersonaStatus.class, str);
        }

        public static PersonaStatus[] values() {
            return (PersonaStatus[]) $VALUES.clone();
        }
    }
}
