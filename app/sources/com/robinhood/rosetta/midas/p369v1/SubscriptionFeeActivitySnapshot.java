package com.robinhood.rosetta.midas.p369v1;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.midas.p369v1.SubscriptionFeeActivitySnapshot;
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
import p479j$.time.Instant;

/* compiled from: SubscriptionFeeActivitySnapshot.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000245Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b+\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "idempotent_id", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "activity_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "subscription_fee_charged_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "subscription_fee_refunded_details", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot;", "Lokio/ByteString;", "getIdempotent_id", "()Lokio/ByteString;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "getActivity_type", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getUser_id", "Ljava/lang/String;", "getAccount_number", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "getSubscription_fee_charged_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "getSubscription_fee_refunded_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "Companion", "Type", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SubscriptionFeeActivitySnapshot extends Message {

    @JvmField
    public static final ProtoAdapter<SubscriptionFeeActivitySnapshot> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshot$Type#ADAPTER", jsonName = "activityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Type activity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "idempotentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString idempotent_id;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionFeeChargedDetails#ADAPTER", jsonName = "subscriptionFeeChargedDetails", oneofName = "event_details", schemaIndex = 5, tag = 6)
    private final SubscriptionFeeChargedDetails subscription_fee_charged_details;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionFeeRefundedDetails#ADAPTER", jsonName = "subscriptionFeeRefundedDetails", oneofName = "event_details", schemaIndex = 6, tag = 7)
    private final SubscriptionFeeRefundedDetails subscription_fee_refunded_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ByteString user_id;

    public SubscriptionFeeActivitySnapshot() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24720newBuilder();
    }

    public final ByteString getIdempotent_id() {
        return this.idempotent_id;
    }

    public /* synthetic */ SubscriptionFeeActivitySnapshot(ByteString byteString, Type type2, Instant instant, ByteString byteString2, String str, SubscriptionFeeChargedDetails subscriptionFeeChargedDetails, SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? Type.UNSPECIFIED : type2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : subscriptionFeeChargedDetails, (i & 64) != 0 ? null : subscriptionFeeRefundedDetails, (i & 128) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final Type getActivity_type() {
        return this.activity_type;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final ByteString getUser_id() {
        return this.user_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final SubscriptionFeeChargedDetails getSubscription_fee_charged_details() {
        return this.subscription_fee_charged_details;
    }

    public final SubscriptionFeeRefundedDetails getSubscription_fee_refunded_details() {
        return this.subscription_fee_refunded_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeeActivitySnapshot(ByteString idempotent_id, Type activity_type, Instant instant, ByteString user_id, String account_number, SubscriptionFeeChargedDetails subscriptionFeeChargedDetails, SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.idempotent_id = idempotent_id;
        this.activity_type = activity_type;
        this.timestamp = instant;
        this.user_id = user_id;
        this.account_number = account_number;
        this.subscription_fee_charged_details = subscriptionFeeChargedDetails;
        this.subscription_fee_refunded_details = subscriptionFeeRefundedDetails;
        if (Internal.countNonNull(subscriptionFeeChargedDetails, subscriptionFeeRefundedDetails) > 1) {
            throw new IllegalArgumentException("At most one of subscription_fee_charged_details, subscription_fee_refunded_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24720newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriptionFeeActivitySnapshot)) {
            return false;
        }
        SubscriptionFeeActivitySnapshot subscriptionFeeActivitySnapshot = (SubscriptionFeeActivitySnapshot) other;
        return Intrinsics.areEqual(unknownFields(), subscriptionFeeActivitySnapshot.unknownFields()) && Intrinsics.areEqual(this.idempotent_id, subscriptionFeeActivitySnapshot.idempotent_id) && this.activity_type == subscriptionFeeActivitySnapshot.activity_type && Intrinsics.areEqual(this.timestamp, subscriptionFeeActivitySnapshot.timestamp) && Intrinsics.areEqual(this.user_id, subscriptionFeeActivitySnapshot.user_id) && Intrinsics.areEqual(this.account_number, subscriptionFeeActivitySnapshot.account_number) && Intrinsics.areEqual(this.subscription_fee_charged_details, subscriptionFeeActivitySnapshot.subscription_fee_charged_details) && Intrinsics.areEqual(this.subscription_fee_refunded_details, subscriptionFeeActivitySnapshot.subscription_fee_refunded_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.idempotent_id.hashCode()) * 37) + this.activity_type.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.user_id.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        SubscriptionFeeChargedDetails subscriptionFeeChargedDetails = this.subscription_fee_charged_details;
        int iHashCode3 = (iHashCode2 + (subscriptionFeeChargedDetails != null ? subscriptionFeeChargedDetails.hashCode() : 0)) * 37;
        SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails = this.subscription_fee_refunded_details;
        int iHashCode4 = iHashCode3 + (subscriptionFeeRefundedDetails != null ? subscriptionFeeRefundedDetails.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("idempotent_id=" + this.idempotent_id);
        arrayList.add("activity_type=" + this.activity_type);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("user_id=" + this.user_id);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        SubscriptionFeeChargedDetails subscriptionFeeChargedDetails = this.subscription_fee_charged_details;
        if (subscriptionFeeChargedDetails != null) {
            arrayList.add("subscription_fee_charged_details=" + subscriptionFeeChargedDetails);
        }
        SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails = this.subscription_fee_refunded_details;
        if (subscriptionFeeRefundedDetails != null) {
            arrayList.add("subscription_fee_refunded_details=" + subscriptionFeeRefundedDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscriptionFeeActivitySnapshot{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubscriptionFeeActivitySnapshot copy$default(SubscriptionFeeActivitySnapshot subscriptionFeeActivitySnapshot, ByteString byteString, Type type2, Instant instant, ByteString byteString2, String str, SubscriptionFeeChargedDetails subscriptionFeeChargedDetails, SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionFeeActivitySnapshot.idempotent_id;
        }
        if ((i & 2) != 0) {
            type2 = subscriptionFeeActivitySnapshot.activity_type;
        }
        if ((i & 4) != 0) {
            instant = subscriptionFeeActivitySnapshot.timestamp;
        }
        if ((i & 8) != 0) {
            byteString2 = subscriptionFeeActivitySnapshot.user_id;
        }
        if ((i & 16) != 0) {
            str = subscriptionFeeActivitySnapshot.account_number;
        }
        if ((i & 32) != 0) {
            subscriptionFeeChargedDetails = subscriptionFeeActivitySnapshot.subscription_fee_charged_details;
        }
        if ((i & 64) != 0) {
            subscriptionFeeRefundedDetails = subscriptionFeeActivitySnapshot.subscription_fee_refunded_details;
        }
        if ((i & 128) != 0) {
            byteString3 = subscriptionFeeActivitySnapshot.unknownFields();
        }
        SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails2 = subscriptionFeeRefundedDetails;
        ByteString byteString4 = byteString3;
        String str2 = str;
        SubscriptionFeeChargedDetails subscriptionFeeChargedDetails2 = subscriptionFeeChargedDetails;
        return subscriptionFeeActivitySnapshot.copy(byteString, type2, instant, byteString2, str2, subscriptionFeeChargedDetails2, subscriptionFeeRefundedDetails2, byteString4);
    }

    public final SubscriptionFeeActivitySnapshot copy(ByteString idempotent_id, Type activity_type, Instant timestamp, ByteString user_id, String account_number, SubscriptionFeeChargedDetails subscription_fee_charged_details, SubscriptionFeeRefundedDetails subscription_fee_refunded_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubscriptionFeeActivitySnapshot(idempotent_id, activity_type, timestamp, user_id, account_number, subscription_fee_charged_details, subscription_fee_refunded_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionFeeActivitySnapshot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubscriptionFeeActivitySnapshot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubscriptionFeeActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString idempotent_id = value.getIdempotent_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(idempotent_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getIdempotent_id());
                }
                if (value.getActivity_type() != SubscriptionFeeActivitySnapshot.Type.UNSPECIFIED) {
                    size += SubscriptionFeeActivitySnapshot.Type.ADAPTER.encodedSizeWithTag(2, value.getActivity_type());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAccount_number());
                }
                return size + SubscriptionFeeChargedDetails.ADAPTER.encodedSizeWithTag(6, value.getSubscription_fee_charged_details()) + SubscriptionFeeRefundedDetails.ADAPTER.encodedSizeWithTag(7, value.getSubscription_fee_refunded_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubscriptionFeeActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString idempotent_id = value.getIdempotent_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(idempotent_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getIdempotent_id());
                }
                if (value.getActivity_type() != SubscriptionFeeActivitySnapshot.Type.UNSPECIFIED) {
                    SubscriptionFeeActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getActivity_type());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 4, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                SubscriptionFeeChargedDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubscription_fee_charged_details());
                SubscriptionFeeRefundedDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getSubscription_fee_refunded_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubscriptionFeeActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SubscriptionFeeRefundedDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getSubscription_fee_refunded_details());
                SubscriptionFeeChargedDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubscription_fee_charged_details());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                ByteString user_id = value.getUser_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(user_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 4, (int) value.getUser_id());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (value.getActivity_type() != SubscriptionFeeActivitySnapshot.Type.UNSPECIFIED) {
                    SubscriptionFeeActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getActivity_type());
                }
                if (Intrinsics.areEqual(value.getIdempotent_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getIdempotent_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeeActivitySnapshot decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString = ByteString.EMPTY;
                SubscriptionFeeActivitySnapshot.Type type2 = SubscriptionFeeActivitySnapshot.Type.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                SubscriptionFeeChargedDetails subscriptionFeeChargedDetailsDecode = null;
                SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetailsDecode = null;
                String strDecode = "";
                ByteString byteStringDecode = byteString;
                SubscriptionFeeActivitySnapshot.Type typeDecode = type2;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 2:
                                try {
                                    typeDecode = SubscriptionFeeActivitySnapshot.Type.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                subscriptionFeeChargedDetailsDecode = SubscriptionFeeChargedDetails.ADAPTER.decode(reader);
                                break;
                            case 7:
                                subscriptionFeeRefundedDetailsDecode = SubscriptionFeeRefundedDetails.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SubscriptionFeeActivitySnapshot(byteStringDecode2, typeDecode, instantDecode, byteStringDecode, strDecode, subscriptionFeeChargedDetailsDecode, subscriptionFeeRefundedDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeeActivitySnapshot redact(SubscriptionFeeActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                SubscriptionFeeChargedDetails subscription_fee_charged_details = value.getSubscription_fee_charged_details();
                SubscriptionFeeChargedDetails subscriptionFeeChargedDetailsRedact = subscription_fee_charged_details != null ? SubscriptionFeeChargedDetails.ADAPTER.redact(subscription_fee_charged_details) : null;
                SubscriptionFeeRefundedDetails subscription_fee_refunded_details = value.getSubscription_fee_refunded_details();
                return SubscriptionFeeActivitySnapshot.copy$default(value, null, null, instantRedact, null, null, subscriptionFeeChargedDetailsRedact, subscription_fee_refunded_details != null ? SubscriptionFeeRefundedDetails.ADAPTER.redact(subscription_fee_refunded_details) : null, ByteString.EMPTY, 27, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionFeeActivitySnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SUBSCRIPTION_FEE_CHARGED", "SUBSCRIPTION_FEE_REFUNDED", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type SUBSCRIPTION_FEE_CHARGED;
        public static final Type SUBSCRIPTION_FEE_REFUNDED;
        public static final Type UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UNSPECIFIED, SUBSCRIPTION_FEE_CHARGED, SUBSCRIPTION_FEE_REFUNDED};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = type2;
            SUBSCRIPTION_FEE_CHARGED = new Type("SUBSCRIPTION_FEE_CHARGED", 1, 1);
            SUBSCRIPTION_FEE_REFUNDED = new Type("SUBSCRIPTION_FEE_REFUNDED", 2, 2);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshot$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SubscriptionFeeActivitySnapshot.Type fromValue(int value) {
                    return SubscriptionFeeActivitySnapshot.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SubscriptionFeeActivitySnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                if (value == 0) {
                    return Type.UNSPECIFIED;
                }
                if (value == 1) {
                    return Type.SUBSCRIPTION_FEE_CHARGED;
                }
                if (value != 2) {
                    return null;
                }
                return Type.SUBSCRIPTION_FEE_REFUNDED;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
