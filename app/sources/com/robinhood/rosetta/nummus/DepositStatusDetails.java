package com.robinhood.rosetta.nummus;

import com.robinhood.rosetta.nummus.DepositStatusDetails;
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
import p479j$.time.Instant;

/* compiled from: DepositStatusDetails.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/DepositStatusDetails;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;", "status", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/DepositStatusDetails;", "Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;", "getStatus", "()Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Companion", "DepositStatus", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class DepositStatusDetails extends Message {

    @JvmField
    public static final ProtoAdapter<DepositStatusDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.nummus.DepositStatusDetails$DepositStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DepositStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public DepositStatusDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24733newBuilder();
    }

    public final DepositStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ DepositStatusDetails(DepositStatus depositStatus, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DepositStatus.STATUS_UNSPECIFIED : depositStatus, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositStatusDetails(DepositStatus status, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
        this.timestamp = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24733newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositStatusDetails)) {
            return false;
        }
        DepositStatusDetails depositStatusDetails = (DepositStatusDetails) other;
        return Intrinsics.areEqual(unknownFields(), depositStatusDetails.unknownFields()) && this.status == depositStatusDetails.status && Intrinsics.areEqual(this.timestamp, depositStatusDetails.timestamp);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + this.status);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositStatusDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositStatusDetails copy$default(DepositStatusDetails depositStatusDetails, DepositStatus depositStatus, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            depositStatus = depositStatusDetails.status;
        }
        if ((i & 2) != 0) {
            instant = depositStatusDetails.timestamp;
        }
        if ((i & 4) != 0) {
            byteString = depositStatusDetails.unknownFields();
        }
        return depositStatusDetails.copy(depositStatus, instant, byteString);
    }

    public final DepositStatusDetails copy(DepositStatus status, Instant timestamp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositStatusDetails(status, timestamp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositStatusDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositStatusDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.DepositStatusDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositStatusDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStatus() != DepositStatusDetails.DepositStatus.STATUS_UNSPECIFIED) {
                    size += DepositStatusDetails.DepositStatus.ADAPTER.encodedSizeWithTag(1, value.getStatus());
                }
                return value.getTimestamp() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositStatusDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStatus() != DepositStatusDetails.DepositStatus.STATUS_UNSPECIFIED) {
                    DepositStatusDetails.DepositStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositStatusDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getStatus() != DepositStatusDetails.DepositStatus.STATUS_UNSPECIFIED) {
                    DepositStatusDetails.DepositStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DepositStatusDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DepositStatusDetails.DepositStatus depositStatusDecode = DepositStatusDetails.DepositStatus.STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DepositStatusDetails(depositStatusDecode, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            depositStatusDecode = DepositStatusDetails.DepositStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositStatusDetails redact(DepositStatusDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return DepositStatusDetails.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DepositStatusDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "STATUS_ACTIVE", "STATUS_INACTIVE", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DepositStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DepositStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DepositStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DepositStatus STATUS_ACTIVE;
        public static final DepositStatus STATUS_INACTIVE;
        public static final DepositStatus STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ DepositStatus[] $values() {
            return new DepositStatus[]{STATUS_UNSPECIFIED, STATUS_ACTIVE, STATUS_INACTIVE};
        }

        @JvmStatic
        public static final DepositStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DepositStatus> getEntries() {
            return $ENTRIES;
        }

        private DepositStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DepositStatus depositStatus = new DepositStatus("STATUS_UNSPECIFIED", 0, 0);
            STATUS_UNSPECIFIED = depositStatus;
            STATUS_ACTIVE = new DepositStatus("STATUS_ACTIVE", 1, 1);
            STATUS_INACTIVE = new DepositStatus("STATUS_INACTIVE", 2, 2);
            DepositStatus[] depositStatusArr$values = $values();
            $VALUES = depositStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(depositStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DepositStatus>(orCreateKotlinClass, syntax, depositStatus) { // from class: com.robinhood.rosetta.nummus.DepositStatusDetails$DepositStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DepositStatusDetails.DepositStatus fromValue(int value) {
                    return DepositStatusDetails.DepositStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DepositStatusDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/DepositStatusDetails$DepositStatus;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DepositStatus fromValue(int value) {
                if (value == 0) {
                    return DepositStatus.STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return DepositStatus.STATUS_ACTIVE;
                }
                if (value != 2) {
                    return null;
                }
                return DepositStatus.STATUS_INACTIVE;
            }
        }

        public static DepositStatus valueOf(String str) {
            return (DepositStatus) Enum.valueOf(DepositStatus.class, str);
        }

        public static DepositStatus[] values() {
            return (DepositStatus[]) $VALUES.clone();
        }
    }
}
