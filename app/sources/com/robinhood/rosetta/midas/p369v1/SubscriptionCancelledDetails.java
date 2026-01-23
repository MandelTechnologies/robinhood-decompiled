package com.robinhood.rosetta.midas.p369v1;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.midas.p369v1.SubscriptionCancelledDetails;
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

/* compiled from: SubscriptionCancelledDetails.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "ended_at", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "downgrade_reason", "unknownFields", "<init>", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "Lokio/ByteString;", "getSubscription_id", "()Lokio/ByteString;", "Lj$/time/Instant;", "getEnded_at", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "getDowngrade_reason", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "Companion", "DowngradeReason", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SubscriptionCancelledDetails extends Message {

    @JvmField
    public static final ProtoAdapter<SubscriptionCancelledDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetails$DowngradeReason#ADAPTER", jsonName = "downgradeReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DowngradeReason downgrade_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "endedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant ended_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "subscriptionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString subscription_id;

    public SubscriptionCancelledDetails() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24716newBuilder();
    }

    public final ByteString getSubscription_id() {
        return this.subscription_id;
    }

    public /* synthetic */ SubscriptionCancelledDetails(ByteString byteString, Instant instant, DowngradeReason downgradeReason, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? DowngradeReason.UNSPECIFIED : downgradeReason, (i & 8) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final Instant getEnded_at() {
        return this.ended_at;
    }

    public final DowngradeReason getDowngrade_reason() {
        return this.downgrade_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionCancelledDetails(ByteString subscription_id, Instant instant, DowngradeReason downgrade_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(downgrade_reason, "downgrade_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.subscription_id = subscription_id;
        this.ended_at = instant;
        this.downgrade_reason = downgrade_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24716newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriptionCancelledDetails)) {
            return false;
        }
        SubscriptionCancelledDetails subscriptionCancelledDetails = (SubscriptionCancelledDetails) other;
        return Intrinsics.areEqual(unknownFields(), subscriptionCancelledDetails.unknownFields()) && Intrinsics.areEqual(this.subscription_id, subscriptionCancelledDetails.subscription_id) && Intrinsics.areEqual(this.ended_at, subscriptionCancelledDetails.ended_at) && this.downgrade_reason == subscriptionCancelledDetails.downgrade_reason;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.subscription_id.hashCode()) * 37;
        Instant instant = this.ended_at;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.downgrade_reason.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("subscription_id=" + this.subscription_id);
        Instant instant = this.ended_at;
        if (instant != null) {
            arrayList.add("ended_at=" + instant);
        }
        arrayList.add("downgrade_reason=" + this.downgrade_reason);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscriptionCancelledDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubscriptionCancelledDetails copy$default(SubscriptionCancelledDetails subscriptionCancelledDetails, ByteString byteString, Instant instant, DowngradeReason downgradeReason, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionCancelledDetails.subscription_id;
        }
        if ((i & 2) != 0) {
            instant = subscriptionCancelledDetails.ended_at;
        }
        if ((i & 4) != 0) {
            downgradeReason = subscriptionCancelledDetails.downgrade_reason;
        }
        if ((i & 8) != 0) {
            byteString2 = subscriptionCancelledDetails.unknownFields();
        }
        return subscriptionCancelledDetails.copy(byteString, instant, downgradeReason, byteString2);
    }

    public final SubscriptionCancelledDetails copy(ByteString subscription_id, Instant ended_at, DowngradeReason downgrade_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(downgrade_reason, "downgrade_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubscriptionCancelledDetails(subscription_id, ended_at, downgrade_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionCancelledDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubscriptionCancelledDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubscriptionCancelledDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSubscription_id(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSubscription_id());
                }
                if (value.getEnded_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getEnded_at());
                }
                return value.getDowngrade_reason() != SubscriptionCancelledDetails.DowngradeReason.UNSPECIFIED ? size + SubscriptionCancelledDetails.DowngradeReason.ADAPTER.encodedSizeWithTag(3, value.getDowngrade_reason()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubscriptionCancelledDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSubscription_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSubscription_id());
                }
                if (value.getEnded_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getEnded_at());
                }
                if (value.getDowngrade_reason() != SubscriptionCancelledDetails.DowngradeReason.UNSPECIFIED) {
                    SubscriptionCancelledDetails.DowngradeReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getDowngrade_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubscriptionCancelledDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDowngrade_reason() != SubscriptionCancelledDetails.DowngradeReason.UNSPECIFIED) {
                    SubscriptionCancelledDetails.DowngradeReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getDowngrade_reason());
                }
                if (value.getEnded_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getEnded_at());
                }
                if (Intrinsics.areEqual(value.getSubscription_id(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSubscription_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionCancelledDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                SubscriptionCancelledDetails.DowngradeReason downgradeReasonDecode = SubscriptionCancelledDetails.DowngradeReason.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SubscriptionCancelledDetails(byteStringDecode, instantDecode, downgradeReasonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            downgradeReasonDecode = SubscriptionCancelledDetails.DowngradeReason.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionCancelledDetails redact(SubscriptionCancelledDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant ended_at = value.getEnded_at();
                return SubscriptionCancelledDetails.copy$default(value, null, ended_at != null ? ProtoAdapter.INSTANT.redact(ended_at) : null, null, ByteString.EMPTY, 5, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionCancelledDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "USER_INITIATED", "AUTO_DOWNGRADED", "AGENT_INITIATED", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DowngradeReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DowngradeReason[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DowngradeReason> ADAPTER;
        public static final DowngradeReason AGENT_INITIATED;
        public static final DowngradeReason AUTO_DOWNGRADED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DowngradeReason UNSPECIFIED;
        public static final DowngradeReason USER_INITIATED;
        private final int value;

        private static final /* synthetic */ DowngradeReason[] $values() {
            return new DowngradeReason[]{UNSPECIFIED, USER_INITIATED, AUTO_DOWNGRADED, AGENT_INITIATED};
        }

        @JvmStatic
        public static final DowngradeReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DowngradeReason> getEntries() {
            return $ENTRIES;
        }

        private DowngradeReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DowngradeReason downgradeReason = new DowngradeReason(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = downgradeReason;
            USER_INITIATED = new DowngradeReason("USER_INITIATED", 1, 1);
            AUTO_DOWNGRADED = new DowngradeReason("AUTO_DOWNGRADED", 2, 2);
            AGENT_INITIATED = new DowngradeReason("AGENT_INITIATED", 3, 3);
            DowngradeReason[] downgradeReasonArr$values = $values();
            $VALUES = downgradeReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(downgradeReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DowngradeReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DowngradeReason>(orCreateKotlinClass, syntax, downgradeReason) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetails$DowngradeReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SubscriptionCancelledDetails.DowngradeReason fromValue(int value) {
                    return SubscriptionCancelledDetails.DowngradeReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SubscriptionCancelledDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DowngradeReason fromValue(int value) {
                if (value == 0) {
                    return DowngradeReason.UNSPECIFIED;
                }
                if (value == 1) {
                    return DowngradeReason.USER_INITIATED;
                }
                if (value == 2) {
                    return DowngradeReason.AUTO_DOWNGRADED;
                }
                if (value != 3) {
                    return null;
                }
                return DowngradeReason.AGENT_INITIATED;
            }
        }

        public static DowngradeReason valueOf(String str) {
            return (DowngradeReason) Enum.valueOf(DowngradeReason.class, str);
        }

        public static DowngradeReason[] values() {
            return (DowngradeReason[]) $VALUES.clone();
        }
    }
}
