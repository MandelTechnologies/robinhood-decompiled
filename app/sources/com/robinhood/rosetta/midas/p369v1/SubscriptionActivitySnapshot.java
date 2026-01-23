package com.robinhood.rosetta.midas.p369v1;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.midas.p369v1.SubscriptionActivitySnapshot;
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

/* compiled from: SubscriptionActivitySnapshot.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002EFB\u0091\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u0097\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b2\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\bD\u0010&¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "idempotent_id", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "activity_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;", "subscription_created_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "subscription_cancelled_details", "Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;", "plan_switched_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetails;", "subscription_updated_details", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "account_feature_update_details", "timezone", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetails;Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetails;Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot;", "Lokio/ByteString;", "getIdempotent_id", "()Lokio/ByteString;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "getActivity_type", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getUser_id", "Ljava/lang/String;", "getAccount_number", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;", "getSubscription_created_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "getSubscription_cancelled_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;", "getPlan_switched_details", "()Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetails;", "getSubscription_updated_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetails;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "getAccount_feature_update_details", "()Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "getTimezone", "Companion", "Type", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SubscriptionActivitySnapshot extends Message {

    @JvmField
    public static final ProtoAdapter<SubscriptionActivitySnapshot> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.AccountFeatureUpdateDetails#ADAPTER", jsonName = "accountFeatureUpdateDetails", oneofName = "event_details", schemaIndex = 9, tag = 10)
    private final AccountFeatureUpdateDetails account_feature_update_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshot$Type#ADAPTER", jsonName = "activityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Type activity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "idempotentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString idempotent_id;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.PlanSwitchedDetails#ADAPTER", jsonName = "planSwitchedDetails", oneofName = "event_details", schemaIndex = 7, tag = 8)
    private final PlanSwitchedDetails plan_switched_details;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetails#ADAPTER", jsonName = "subscriptionCancelledDetails", oneofName = "event_details", schemaIndex = 6, tag = 7)
    private final SubscriptionCancelledDetails subscription_cancelled_details;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionCreatedDetails#ADAPTER", jsonName = "subscriptionCreatedDetails", oneofName = "event_details", schemaIndex = 5, tag = 6)
    private final SubscriptionCreatedDetails subscription_created_details;

    @WireField(adapter = "com.robinhood.rosetta.midas.v1.SubscriptionUpdatedDetails#ADAPTER", jsonName = "subscriptionUpdatedDetails", oneofName = "event_details", schemaIndex = 8, tag = 9)
    private final SubscriptionUpdatedDetails subscription_updated_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String timezone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ByteString user_id;

    public SubscriptionActivitySnapshot() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24715newBuilder();
    }

    public final ByteString getIdempotent_id() {
        return this.idempotent_id;
    }

    public /* synthetic */ SubscriptionActivitySnapshot(ByteString byteString, Type type2, Instant instant, ByteString byteString2, String str, SubscriptionCreatedDetails subscriptionCreatedDetails, SubscriptionCancelledDetails subscriptionCancelledDetails, PlanSwitchedDetails planSwitchedDetails, SubscriptionUpdatedDetails subscriptionUpdatedDetails, AccountFeatureUpdateDetails accountFeatureUpdateDetails, String str2, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? Type.UNSPECIFIED : type2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : subscriptionCreatedDetails, (i & 64) != 0 ? null : subscriptionCancelledDetails, (i & 128) != 0 ? null : planSwitchedDetails, (i & 256) != 0 ? null : subscriptionUpdatedDetails, (i & 512) == 0 ? accountFeatureUpdateDetails : null, (i & 1024) == 0 ? str2 : "", (i & 2048) != 0 ? ByteString.EMPTY : byteString3);
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

    public final SubscriptionCreatedDetails getSubscription_created_details() {
        return this.subscription_created_details;
    }

    public final SubscriptionCancelledDetails getSubscription_cancelled_details() {
        return this.subscription_cancelled_details;
    }

    public final PlanSwitchedDetails getPlan_switched_details() {
        return this.plan_switched_details;
    }

    public final SubscriptionUpdatedDetails getSubscription_updated_details() {
        return this.subscription_updated_details;
    }

    public final AccountFeatureUpdateDetails getAccount_feature_update_details() {
        return this.account_feature_update_details;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionActivitySnapshot(ByteString idempotent_id, Type activity_type, Instant instant, ByteString user_id, String account_number, SubscriptionCreatedDetails subscriptionCreatedDetails, SubscriptionCancelledDetails subscriptionCancelledDetails, PlanSwitchedDetails planSwitchedDetails, SubscriptionUpdatedDetails subscriptionUpdatedDetails, AccountFeatureUpdateDetails accountFeatureUpdateDetails, String timezone, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.idempotent_id = idempotent_id;
        this.activity_type = activity_type;
        this.timestamp = instant;
        this.user_id = user_id;
        this.account_number = account_number;
        this.subscription_created_details = subscriptionCreatedDetails;
        this.subscription_cancelled_details = subscriptionCancelledDetails;
        this.plan_switched_details = planSwitchedDetails;
        this.subscription_updated_details = subscriptionUpdatedDetails;
        this.account_feature_update_details = accountFeatureUpdateDetails;
        this.timezone = timezone;
        if (Internal.countNonNull(subscriptionCreatedDetails, subscriptionCancelledDetails, planSwitchedDetails, subscriptionUpdatedDetails, accountFeatureUpdateDetails) > 1) {
            throw new IllegalArgumentException("At most one of subscription_created_details, subscription_cancelled_details, plan_switched_details, subscription_updated_details, account_feature_update_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24715newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriptionActivitySnapshot)) {
            return false;
        }
        SubscriptionActivitySnapshot subscriptionActivitySnapshot = (SubscriptionActivitySnapshot) other;
        return Intrinsics.areEqual(unknownFields(), subscriptionActivitySnapshot.unknownFields()) && Intrinsics.areEqual(this.idempotent_id, subscriptionActivitySnapshot.idempotent_id) && this.activity_type == subscriptionActivitySnapshot.activity_type && Intrinsics.areEqual(this.timestamp, subscriptionActivitySnapshot.timestamp) && Intrinsics.areEqual(this.user_id, subscriptionActivitySnapshot.user_id) && Intrinsics.areEqual(this.account_number, subscriptionActivitySnapshot.account_number) && Intrinsics.areEqual(this.subscription_created_details, subscriptionActivitySnapshot.subscription_created_details) && Intrinsics.areEqual(this.subscription_cancelled_details, subscriptionActivitySnapshot.subscription_cancelled_details) && Intrinsics.areEqual(this.plan_switched_details, subscriptionActivitySnapshot.plan_switched_details) && Intrinsics.areEqual(this.subscription_updated_details, subscriptionActivitySnapshot.subscription_updated_details) && Intrinsics.areEqual(this.account_feature_update_details, subscriptionActivitySnapshot.account_feature_update_details) && Intrinsics.areEqual(this.timezone, subscriptionActivitySnapshot.timezone);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.idempotent_id.hashCode()) * 37) + this.activity_type.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.user_id.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        SubscriptionCreatedDetails subscriptionCreatedDetails = this.subscription_created_details;
        int iHashCode3 = (iHashCode2 + (subscriptionCreatedDetails != null ? subscriptionCreatedDetails.hashCode() : 0)) * 37;
        SubscriptionCancelledDetails subscriptionCancelledDetails = this.subscription_cancelled_details;
        int iHashCode4 = (iHashCode3 + (subscriptionCancelledDetails != null ? subscriptionCancelledDetails.hashCode() : 0)) * 37;
        PlanSwitchedDetails planSwitchedDetails = this.plan_switched_details;
        int iHashCode5 = (iHashCode4 + (planSwitchedDetails != null ? planSwitchedDetails.hashCode() : 0)) * 37;
        SubscriptionUpdatedDetails subscriptionUpdatedDetails = this.subscription_updated_details;
        int iHashCode6 = (iHashCode5 + (subscriptionUpdatedDetails != null ? subscriptionUpdatedDetails.hashCode() : 0)) * 37;
        AccountFeatureUpdateDetails accountFeatureUpdateDetails = this.account_feature_update_details;
        int iHashCode7 = ((iHashCode6 + (accountFeatureUpdateDetails != null ? accountFeatureUpdateDetails.hashCode() : 0)) * 37) + this.timezone.hashCode();
        this.hashCode = iHashCode7;
        return iHashCode7;
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
        SubscriptionCreatedDetails subscriptionCreatedDetails = this.subscription_created_details;
        if (subscriptionCreatedDetails != null) {
            arrayList.add("subscription_created_details=" + subscriptionCreatedDetails);
        }
        SubscriptionCancelledDetails subscriptionCancelledDetails = this.subscription_cancelled_details;
        if (subscriptionCancelledDetails != null) {
            arrayList.add("subscription_cancelled_details=" + subscriptionCancelledDetails);
        }
        PlanSwitchedDetails planSwitchedDetails = this.plan_switched_details;
        if (planSwitchedDetails != null) {
            arrayList.add("plan_switched_details=" + planSwitchedDetails);
        }
        SubscriptionUpdatedDetails subscriptionUpdatedDetails = this.subscription_updated_details;
        if (subscriptionUpdatedDetails != null) {
            arrayList.add("subscription_updated_details=" + subscriptionUpdatedDetails);
        }
        AccountFeatureUpdateDetails accountFeatureUpdateDetails = this.account_feature_update_details;
        if (accountFeatureUpdateDetails != null) {
            arrayList.add("account_feature_update_details=" + accountFeatureUpdateDetails);
        }
        arrayList.add("timezone=" + Internal.sanitize(this.timezone));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscriptionActivitySnapshot{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubscriptionActivitySnapshot copy$default(SubscriptionActivitySnapshot subscriptionActivitySnapshot, ByteString byteString, Type type2, Instant instant, ByteString byteString2, String str, SubscriptionCreatedDetails subscriptionCreatedDetails, SubscriptionCancelledDetails subscriptionCancelledDetails, PlanSwitchedDetails planSwitchedDetails, SubscriptionUpdatedDetails subscriptionUpdatedDetails, AccountFeatureUpdateDetails accountFeatureUpdateDetails, String str2, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionActivitySnapshot.idempotent_id;
        }
        if ((i & 2) != 0) {
            type2 = subscriptionActivitySnapshot.activity_type;
        }
        if ((i & 4) != 0) {
            instant = subscriptionActivitySnapshot.timestamp;
        }
        if ((i & 8) != 0) {
            byteString2 = subscriptionActivitySnapshot.user_id;
        }
        if ((i & 16) != 0) {
            str = subscriptionActivitySnapshot.account_number;
        }
        if ((i & 32) != 0) {
            subscriptionCreatedDetails = subscriptionActivitySnapshot.subscription_created_details;
        }
        if ((i & 64) != 0) {
            subscriptionCancelledDetails = subscriptionActivitySnapshot.subscription_cancelled_details;
        }
        if ((i & 128) != 0) {
            planSwitchedDetails = subscriptionActivitySnapshot.plan_switched_details;
        }
        if ((i & 256) != 0) {
            subscriptionUpdatedDetails = subscriptionActivitySnapshot.subscription_updated_details;
        }
        if ((i & 512) != 0) {
            accountFeatureUpdateDetails = subscriptionActivitySnapshot.account_feature_update_details;
        }
        if ((i & 1024) != 0) {
            str2 = subscriptionActivitySnapshot.timezone;
        }
        if ((i & 2048) != 0) {
            byteString3 = subscriptionActivitySnapshot.unknownFields();
        }
        String str3 = str2;
        ByteString byteString4 = byteString3;
        SubscriptionUpdatedDetails subscriptionUpdatedDetails2 = subscriptionUpdatedDetails;
        AccountFeatureUpdateDetails accountFeatureUpdateDetails2 = accountFeatureUpdateDetails;
        SubscriptionCancelledDetails subscriptionCancelledDetails2 = subscriptionCancelledDetails;
        PlanSwitchedDetails planSwitchedDetails2 = planSwitchedDetails;
        String str4 = str;
        SubscriptionCreatedDetails subscriptionCreatedDetails2 = subscriptionCreatedDetails;
        return subscriptionActivitySnapshot.copy(byteString, type2, instant, byteString2, str4, subscriptionCreatedDetails2, subscriptionCancelledDetails2, planSwitchedDetails2, subscriptionUpdatedDetails2, accountFeatureUpdateDetails2, str3, byteString4);
    }

    public final SubscriptionActivitySnapshot copy(ByteString idempotent_id, Type activity_type, Instant timestamp, ByteString user_id, String account_number, SubscriptionCreatedDetails subscription_created_details, SubscriptionCancelledDetails subscription_cancelled_details, PlanSwitchedDetails plan_switched_details, SubscriptionUpdatedDetails subscription_updated_details, AccountFeatureUpdateDetails account_feature_update_details, String timezone, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubscriptionActivitySnapshot(idempotent_id, activity_type, timestamp, user_id, account_number, subscription_created_details, subscription_cancelled_details, plan_switched_details, subscription_updated_details, account_feature_update_details, timezone, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionActivitySnapshot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubscriptionActivitySnapshot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubscriptionActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString idempotent_id = value.getIdempotent_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(idempotent_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getIdempotent_id());
                }
                if (value.getActivity_type() != SubscriptionActivitySnapshot.Type.UNSPECIFIED) {
                    size += SubscriptionActivitySnapshot.Type.ADAPTER.encodedSizeWithTag(2, value.getActivity_type());
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
                int iEncodedSizeWithTag = size + SubscriptionCreatedDetails.ADAPTER.encodedSizeWithTag(6, value.getSubscription_created_details()) + SubscriptionCancelledDetails.ADAPTER.encodedSizeWithTag(7, value.getSubscription_cancelled_details()) + PlanSwitchedDetails.ADAPTER.encodedSizeWithTag(8, value.getPlan_switched_details()) + SubscriptionUpdatedDetails.ADAPTER.encodedSizeWithTag(9, value.getSubscription_updated_details()) + AccountFeatureUpdateDetails.ADAPTER.encodedSizeWithTag(10, value.getAccount_feature_update_details());
                return !Intrinsics.areEqual(value.getTimezone(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(11, value.getTimezone()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubscriptionActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString idempotent_id = value.getIdempotent_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(idempotent_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getIdempotent_id());
                }
                if (value.getActivity_type() != SubscriptionActivitySnapshot.Type.UNSPECIFIED) {
                    SubscriptionActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getActivity_type());
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
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getTimezone());
                }
                SubscriptionCreatedDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubscription_created_details());
                SubscriptionCancelledDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getSubscription_cancelled_details());
                PlanSwitchedDetails.ADAPTER.encodeWithTag(writer, 8, (int) value.getPlan_switched_details());
                SubscriptionUpdatedDetails.ADAPTER.encodeWithTag(writer, 9, (int) value.getSubscription_updated_details());
                AccountFeatureUpdateDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getAccount_feature_update_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubscriptionActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AccountFeatureUpdateDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getAccount_feature_update_details());
                SubscriptionUpdatedDetails.ADAPTER.encodeWithTag(writer, 9, (int) value.getSubscription_updated_details());
                PlanSwitchedDetails.ADAPTER.encodeWithTag(writer, 8, (int) value.getPlan_switched_details());
                SubscriptionCancelledDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getSubscription_cancelled_details());
                SubscriptionCreatedDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubscription_created_details());
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getTimezone());
                }
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
                if (value.getActivity_type() != SubscriptionActivitySnapshot.Type.UNSPECIFIED) {
                    SubscriptionActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getActivity_type());
                }
                if (Intrinsics.areEqual(value.getIdempotent_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getIdempotent_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionActivitySnapshot decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                ByteString byteString2;
                SubscriptionActivitySnapshot.Type type2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString3 = ByteString.EMPTY;
                SubscriptionActivitySnapshot.Type type3 = SubscriptionActivitySnapshot.Type.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                SubscriptionCreatedDetails subscriptionCreatedDetailsDecode = null;
                SubscriptionCancelledDetails subscriptionCancelledDetailsDecode = null;
                PlanSwitchedDetails planSwitchedDetailsDecode = null;
                SubscriptionUpdatedDetails subscriptionUpdatedDetailsDecode = null;
                AccountFeatureUpdateDetails accountFeatureUpdateDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                ByteString byteStringDecode = byteString3;
                SubscriptionActivitySnapshot.Type typeDecode = type3;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 2:
                                try {
                                    typeDecode = SubscriptionActivitySnapshot.Type.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    byteString = byteStringDecode2;
                                    byteString2 = byteStringDecode;
                                    type2 = typeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 4:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                subscriptionCreatedDetailsDecode = SubscriptionCreatedDetails.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                subscriptionCancelledDetailsDecode = SubscriptionCancelledDetails.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                planSwitchedDetailsDecode = PlanSwitchedDetails.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                subscriptionUpdatedDetailsDecode = SubscriptionUpdatedDetails.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                accountFeatureUpdateDetailsDecode = AccountFeatureUpdateDetails.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode;
                                type2 = typeDecode;
                                break;
                        }
                        byteStringDecode2 = byteString;
                        byteStringDecode = byteString2;
                        typeDecode = type2;
                    } else {
                        return new SubscriptionActivitySnapshot(byteStringDecode2, typeDecode, instantDecode, byteStringDecode, strDecode, subscriptionCreatedDetailsDecode, subscriptionCancelledDetailsDecode, planSwitchedDetailsDecode, subscriptionUpdatedDetailsDecode, accountFeatureUpdateDetailsDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionActivitySnapshot redact(SubscriptionActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                SubscriptionCreatedDetails subscription_created_details = value.getSubscription_created_details();
                SubscriptionCreatedDetails subscriptionCreatedDetailsRedact = subscription_created_details != null ? SubscriptionCreatedDetails.ADAPTER.redact(subscription_created_details) : null;
                SubscriptionCancelledDetails subscription_cancelled_details = value.getSubscription_cancelled_details();
                SubscriptionCancelledDetails subscriptionCancelledDetailsRedact = subscription_cancelled_details != null ? SubscriptionCancelledDetails.ADAPTER.redact(subscription_cancelled_details) : null;
                PlanSwitchedDetails plan_switched_details = value.getPlan_switched_details();
                PlanSwitchedDetails planSwitchedDetailsRedact = plan_switched_details != null ? PlanSwitchedDetails.ADAPTER.redact(plan_switched_details) : null;
                SubscriptionUpdatedDetails subscription_updated_details = value.getSubscription_updated_details();
                SubscriptionUpdatedDetails subscriptionUpdatedDetailsRedact = subscription_updated_details != null ? SubscriptionUpdatedDetails.ADAPTER.redact(subscription_updated_details) : null;
                AccountFeatureUpdateDetails account_feature_update_details = value.getAccount_feature_update_details();
                return SubscriptionActivitySnapshot.copy$default(value, null, null, instantRedact, null, null, subscriptionCreatedDetailsRedact, subscriptionCancelledDetailsRedact, planSwitchedDetailsRedact, subscriptionUpdatedDetailsRedact, account_feature_update_details != null ? AccountFeatureUpdateDetails.ADAPTER.redact(account_feature_update_details) : null, null, ByteString.EMPTY, 1051, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionActivitySnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SUBSCRIPTION_CREATED", "SUBSCRIPTION_CANCELLED", "PLAN_SWITCHED", "SUBSCRIPTION_UPDATED", "ACCOUNT_FEATURE_UPDATE", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACCOUNT_FEATURE_UPDATE;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type PLAN_SWITCHED;
        public static final Type SUBSCRIPTION_CANCELLED;
        public static final Type SUBSCRIPTION_CREATED;
        public static final Type SUBSCRIPTION_UPDATED;
        public static final Type UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UNSPECIFIED, SUBSCRIPTION_CREATED, SUBSCRIPTION_CANCELLED, PLAN_SWITCHED, SUBSCRIPTION_UPDATED, ACCOUNT_FEATURE_UPDATE};
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
            SUBSCRIPTION_CREATED = new Type("SUBSCRIPTION_CREATED", 1, 1);
            SUBSCRIPTION_CANCELLED = new Type("SUBSCRIPTION_CANCELLED", 2, 2);
            PLAN_SWITCHED = new Type("PLAN_SWITCHED", 3, 3);
            SUBSCRIPTION_UPDATED = new Type("SUBSCRIPTION_UPDATED", 4, 4);
            ACCOUNT_FEATURE_UPDATE = new Type("ACCOUNT_FEATURE_UPDATE", 5, 5);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshot$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SubscriptionActivitySnapshot.Type fromValue(int value) {
                    return SubscriptionActivitySnapshot.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SubscriptionActivitySnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return Type.SUBSCRIPTION_CREATED;
                }
                if (value == 2) {
                    return Type.SUBSCRIPTION_CANCELLED;
                }
                if (value == 3) {
                    return Type.PLAN_SWITCHED;
                }
                if (value == 4) {
                    return Type.SUBSCRIPTION_UPDATED;
                }
                if (value != 5) {
                    return null;
                }
                return Type.ACCOUNT_FEATURE_UPDATE;
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
