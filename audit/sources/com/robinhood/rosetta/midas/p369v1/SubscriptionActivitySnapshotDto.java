package com.robinhood.rosetta.midas.p369v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.midas.p369v1.AccountFeatureUpdateDetailsDto;
import com.robinhood.rosetta.midas.p369v1.PlanSwitchedDetailsDto;
import com.robinhood.rosetta.midas.p369v1.SubscriptionActivitySnapshot;
import com.robinhood.rosetta.midas.p369v1.SubscriptionActivitySnapshotDto;
import com.robinhood.rosetta.midas.p369v1.SubscriptionCancelledDetailsDto;
import com.robinhood.rosetta.midas.p369v1.SubscriptionCreatedDetailsDto;
import com.robinhood.rosetta.midas.p369v1.SubscriptionUpdatedDetailsDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: SubscriptionActivitySnapshotDto.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006LKMNOPB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J]\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010-R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b3\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010:\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010>\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010B\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010F\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010J\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;)V", "Lokio/ByteString;", "idempotent_id", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "activity_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "timezone", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "event_details", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;)V", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;", "getIdempotent_id", "()Lokio/ByteString;", "getActivity_type", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "getTimestamp", "()Lj$/time/Instant;", "getUser_id", "getAccount_number", "getTimezone", "getEvent_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "getSubscription_created_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "subscription_created_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "getSubscription_cancelled_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "subscription_cancelled_details", "Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "getPlan_switched_details", "()Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "plan_switched_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "getSubscription_updated_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "subscription_updated_details", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "getAccount_feature_update_details", "()Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "account_feature_update_details", "Companion", "Surrogate", "EventDetailsDto", "TypeDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SubscriptionActivitySnapshotDto implements Dto3<SubscriptionActivitySnapshot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionActivitySnapshotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionActivitySnapshotDto, SubscriptionActivitySnapshot>> binaryBase64Serializer$delegate;
    private static final SubscriptionActivitySnapshotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionActivitySnapshotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionActivitySnapshotDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getIdempotent_id() {
        return this.surrogate.getIdempotent_id();
    }

    public final TypeDto getActivity_type() {
        return this.surrogate.getActivity_type();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final ByteString getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getTimezone() {
        return this.surrogate.getTimezone();
    }

    public final EventDetailsDto getEvent_details() {
        if (this.surrogate.getSubscription_created_details() != null) {
            return new EventDetailsDto.SubscriptionCreatedDetails(this.surrogate.getSubscription_created_details());
        }
        if (this.surrogate.getSubscription_cancelled_details() != null) {
            return new EventDetailsDto.SubscriptionCancelledDetails(this.surrogate.getSubscription_cancelled_details());
        }
        if (this.surrogate.getPlan_switched_details() != null) {
            return new EventDetailsDto.PlanSwitchedDetails(this.surrogate.getPlan_switched_details());
        }
        if (this.surrogate.getSubscription_updated_details() != null) {
            return new EventDetailsDto.SubscriptionUpdatedDetails(this.surrogate.getSubscription_updated_details());
        }
        if (this.surrogate.getAccount_feature_update_details() != null) {
            return new EventDetailsDto.AccountFeatureUpdateDetails(this.surrogate.getAccount_feature_update_details());
        }
        return null;
    }

    public final SubscriptionCreatedDetailsDto getSubscription_created_details() {
        return this.surrogate.getSubscription_created_details();
    }

    public final SubscriptionCancelledDetailsDto getSubscription_cancelled_details() {
        return this.surrogate.getSubscription_cancelled_details();
    }

    public final PlanSwitchedDetailsDto getPlan_switched_details() {
        return this.surrogate.getPlan_switched_details();
    }

    public final SubscriptionUpdatedDetailsDto getSubscription_updated_details() {
        return this.surrogate.getSubscription_updated_details();
    }

    public final AccountFeatureUpdateDetailsDto getAccount_feature_update_details() {
        return this.surrogate.getAccount_feature_update_details();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SubscriptionActivitySnapshotDto(okio.ByteString r3, com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto.TypeDto r4, p479j$.time.Instant r5, okio.ByteString r6, java.lang.String r7, java.lang.String r8, com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto.EventDetailsDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            okio.ByteString r3 = okio.ByteString.EMPTY
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto$Companion r4 = com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto.TypeDto.INSTANCE
            com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto r4 = r4.getZeroValue()
        L10:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 8
            if (r11 == 0) goto L1c
            okio.ByteString r6 = okio.ByteString.EMPTY
        L1c:
            r11 = r10 & 16
            java.lang.String r1 = ""
            if (r11 == 0) goto L23
            r7 = r1
        L23:
            r11 = r10 & 32
            if (r11 == 0) goto L28
            r8 = r1
        L28:
            r10 = r10 & 64
            if (r10 == 0) goto L35
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L3d
        L35:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L3d:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.midas.p369v1.SubscriptionActivitySnapshotDto.<init>(okio.ByteString, com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto, j$.time.Instant, okio.ByteString, java.lang.String, java.lang.String, com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$EventDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriptionActivitySnapshotDto(ByteString idempotent_id, TypeDto activity_type, Instant instant, ByteString user_id, String account_number, String timezone, EventDetailsDto eventDetailsDto) {
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        EventDetailsDto.SubscriptionCreatedDetails subscriptionCreatedDetails = eventDetailsDto instanceof EventDetailsDto.SubscriptionCreatedDetails ? (EventDetailsDto.SubscriptionCreatedDetails) eventDetailsDto : null;
        SubscriptionCreatedDetailsDto value = subscriptionCreatedDetails != null ? subscriptionCreatedDetails.getValue() : null;
        EventDetailsDto.SubscriptionCancelledDetails subscriptionCancelledDetails = eventDetailsDto instanceof EventDetailsDto.SubscriptionCancelledDetails ? (EventDetailsDto.SubscriptionCancelledDetails) eventDetailsDto : null;
        SubscriptionCancelledDetailsDto value2 = subscriptionCancelledDetails != null ? subscriptionCancelledDetails.getValue() : null;
        EventDetailsDto.PlanSwitchedDetails planSwitchedDetails = eventDetailsDto instanceof EventDetailsDto.PlanSwitchedDetails ? (EventDetailsDto.PlanSwitchedDetails) eventDetailsDto : null;
        PlanSwitchedDetailsDto value3 = planSwitchedDetails != null ? planSwitchedDetails.getValue() : null;
        EventDetailsDto.SubscriptionUpdatedDetails subscriptionUpdatedDetails = eventDetailsDto instanceof EventDetailsDto.SubscriptionUpdatedDetails ? (EventDetailsDto.SubscriptionUpdatedDetails) eventDetailsDto : null;
        SubscriptionUpdatedDetailsDto value4 = subscriptionUpdatedDetails != null ? subscriptionUpdatedDetails.getValue() : null;
        EventDetailsDto.AccountFeatureUpdateDetails accountFeatureUpdateDetails = eventDetailsDto instanceof EventDetailsDto.AccountFeatureUpdateDetails ? (EventDetailsDto.AccountFeatureUpdateDetails) eventDetailsDto : null;
        this(new Surrogate(idempotent_id, activity_type, instant, user_id, account_number, timezone, value, value2, value3, value4, accountFeatureUpdateDetails != null ? accountFeatureUpdateDetails.getValue() : null));
    }

    public static /* synthetic */ SubscriptionActivitySnapshotDto copy$default(SubscriptionActivitySnapshotDto subscriptionActivitySnapshotDto, ByteString byteString, TypeDto typeDto, Instant instant, ByteString byteString2, String str, String str2, EventDetailsDto eventDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionActivitySnapshotDto.surrogate.getIdempotent_id();
        }
        if ((i & 2) != 0) {
            typeDto = subscriptionActivitySnapshotDto.surrogate.getActivity_type();
        }
        if ((i & 4) != 0) {
            instant = subscriptionActivitySnapshotDto.surrogate.getTimestamp();
        }
        if ((i & 8) != 0) {
            byteString2 = subscriptionActivitySnapshotDto.surrogate.getUser_id();
        }
        if ((i & 16) != 0) {
            str = subscriptionActivitySnapshotDto.surrogate.getAccount_number();
        }
        if ((i & 32) != 0) {
            str2 = subscriptionActivitySnapshotDto.surrogate.getTimezone();
        }
        if ((i & 64) != 0) {
            eventDetailsDto = subscriptionActivitySnapshotDto.getEvent_details();
        }
        String str3 = str2;
        EventDetailsDto eventDetailsDto2 = eventDetailsDto;
        String str4 = str;
        Instant instant2 = instant;
        return subscriptionActivitySnapshotDto.copy(byteString, typeDto, instant2, byteString2, str4, str3, eventDetailsDto2);
    }

    public final SubscriptionActivitySnapshotDto copy(ByteString idempotent_id, TypeDto activity_type, Instant timestamp, ByteString user_id, String account_number, String timezone, EventDetailsDto event_details) {
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        EventDetailsDto.SubscriptionCreatedDetails subscriptionCreatedDetails = event_details instanceof EventDetailsDto.SubscriptionCreatedDetails ? (EventDetailsDto.SubscriptionCreatedDetails) event_details : null;
        SubscriptionCreatedDetailsDto value = subscriptionCreatedDetails != null ? subscriptionCreatedDetails.getValue() : null;
        EventDetailsDto.SubscriptionCancelledDetails subscriptionCancelledDetails = event_details instanceof EventDetailsDto.SubscriptionCancelledDetails ? (EventDetailsDto.SubscriptionCancelledDetails) event_details : null;
        SubscriptionCancelledDetailsDto value2 = subscriptionCancelledDetails != null ? subscriptionCancelledDetails.getValue() : null;
        EventDetailsDto.PlanSwitchedDetails planSwitchedDetails = event_details instanceof EventDetailsDto.PlanSwitchedDetails ? (EventDetailsDto.PlanSwitchedDetails) event_details : null;
        PlanSwitchedDetailsDto value3 = planSwitchedDetails != null ? planSwitchedDetails.getValue() : null;
        EventDetailsDto.SubscriptionUpdatedDetails subscriptionUpdatedDetails = event_details instanceof EventDetailsDto.SubscriptionUpdatedDetails ? (EventDetailsDto.SubscriptionUpdatedDetails) event_details : null;
        SubscriptionUpdatedDetailsDto value4 = subscriptionUpdatedDetails != null ? subscriptionUpdatedDetails.getValue() : null;
        EventDetailsDto.AccountFeatureUpdateDetails accountFeatureUpdateDetails = event_details instanceof EventDetailsDto.AccountFeatureUpdateDetails ? (EventDetailsDto.AccountFeatureUpdateDetails) event_details : null;
        return new SubscriptionActivitySnapshotDto(new Surrogate(idempotent_id, activity_type, timestamp, user_id, account_number, timezone, value, value2, value3, value4, accountFeatureUpdateDetails != null ? accountFeatureUpdateDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubscriptionActivitySnapshot toProto() {
        ByteString idempotent_id = this.surrogate.getIdempotent_id();
        SubscriptionActivitySnapshot.Type type2 = (SubscriptionActivitySnapshot.Type) this.surrogate.getActivity_type().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        ByteString user_id = this.surrogate.getUser_id();
        String account_number = this.surrogate.getAccount_number();
        String timezone = this.surrogate.getTimezone();
        SubscriptionCreatedDetailsDto subscription_created_details = this.surrogate.getSubscription_created_details();
        SubscriptionCreatedDetails proto = subscription_created_details != null ? subscription_created_details.toProto() : null;
        SubscriptionCancelledDetailsDto subscription_cancelled_details = this.surrogate.getSubscription_cancelled_details();
        SubscriptionCancelledDetails proto2 = subscription_cancelled_details != null ? subscription_cancelled_details.toProto() : null;
        PlanSwitchedDetailsDto plan_switched_details = this.surrogate.getPlan_switched_details();
        PlanSwitchedDetails proto3 = plan_switched_details != null ? plan_switched_details.toProto() : null;
        SubscriptionUpdatedDetailsDto subscription_updated_details = this.surrogate.getSubscription_updated_details();
        SubscriptionUpdatedDetails proto4 = subscription_updated_details != null ? subscription_updated_details.toProto() : null;
        AccountFeatureUpdateDetailsDto account_feature_update_details = this.surrogate.getAccount_feature_update_details();
        return new SubscriptionActivitySnapshot(idempotent_id, type2, timestamp, user_id, account_number, proto, proto2, proto3, proto4, account_feature_update_details != null ? account_feature_update_details.toProto() : null, timezone, null, 2048, null);
    }

    public String toString() {
        return "[SubscriptionActivitySnapshotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionActivitySnapshotDto) && Intrinsics.areEqual(((SubscriptionActivitySnapshotDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubscriptionActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 h2\u00020\u0001:\u0002ihBÃ\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0089\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J6\u0010/\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0010\u00102\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b=\u0010>JÌ\u0001\u0010?\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bA\u00103J\u0010\u0010B\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010H\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010,R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010L\u0012\u0004\bN\u0010K\u001a\u0004\bM\u0010.RF\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010O\u0012\u0004\bQ\u0010K\u001a\u0004\bP\u00100R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010H\u0012\u0004\bS\u0010K\u001a\u0004\bR\u0010,R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010T\u0012\u0004\bV\u0010K\u001a\u0004\bU\u00103R \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010T\u0012\u0004\bX\u0010K\u001a\u0004\bW\u00103R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Y\u0012\u0004\b[\u0010K\u001a\u0004\bZ\u00106R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\\\u0012\u0004\b^\u0010K\u001a\u0004\b]\u00108R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010_\u0012\u0004\ba\u0010K\u001a\u0004\b`\u0010:R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010b\u0012\u0004\bd\u0010K\u001a\u0004\bc\u0010<R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010e\u0012\u0004\bg\u0010K\u001a\u0004\bf\u0010>¨\u0006j"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "idempotent_id", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "activity_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "timezone", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "subscription_created_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "subscription_cancelled_details", "Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "plan_switched_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "subscription_updated_details", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "account_feature_update_details", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "component8", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "component9", "()Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "component10", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "component11", "()Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getIdempotent_id", "getIdempotent_id$annotations", "()V", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "getActivity_type", "getActivity_type$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getUser_id", "getUser_id$annotations", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "getTimezone", "getTimezone$annotations", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "getSubscription_created_details", "getSubscription_created_details$annotations", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "getSubscription_cancelled_details", "getSubscription_cancelled_details$annotations", "Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "getPlan_switched_details", "getPlan_switched_details$annotations", "Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "getSubscription_updated_details", "getSubscription_updated_details$annotations", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "getAccount_feature_update_details", "getAccount_feature_update_details$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountFeatureUpdateDetailsDto account_feature_update_details;
        private final String account_number;
        private final TypeDto activity_type;
        private final ByteString idempotent_id;
        private final PlanSwitchedDetailsDto plan_switched_details;
        private final SubscriptionCancelledDetailsDto subscription_cancelled_details;
        private final SubscriptionCreatedDetailsDto subscription_created_details;
        private final SubscriptionUpdatedDetailsDto subscription_updated_details;
        private final Instant timestamp;
        private final String timezone;
        private final ByteString user_id;

        public Surrogate() {
            this((ByteString) null, (TypeDto) null, (Instant) null, (ByteString) null, (String) null, (String) null, (SubscriptionCreatedDetailsDto) null, (SubscriptionCancelledDetailsDto) null, (PlanSwitchedDetailsDto) null, (SubscriptionUpdatedDetailsDto) null, (AccountFeatureUpdateDetailsDto) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, TypeDto typeDto, Instant instant, ByteString byteString2, String str, String str2, SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto, SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto, PlanSwitchedDetailsDto planSwitchedDetailsDto, SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto, AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.idempotent_id;
            }
            if ((i & 2) != 0) {
                typeDto = surrogate.activity_type;
            }
            if ((i & 4) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 8) != 0) {
                byteString2 = surrogate.user_id;
            }
            if ((i & 16) != 0) {
                str = surrogate.account_number;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.timezone;
            }
            if ((i & 64) != 0) {
                subscriptionCreatedDetailsDto = surrogate.subscription_created_details;
            }
            if ((i & 128) != 0) {
                subscriptionCancelledDetailsDto = surrogate.subscription_cancelled_details;
            }
            if ((i & 256) != 0) {
                planSwitchedDetailsDto = surrogate.plan_switched_details;
            }
            if ((i & 512) != 0) {
                subscriptionUpdatedDetailsDto = surrogate.subscription_updated_details;
            }
            if ((i & 1024) != 0) {
                accountFeatureUpdateDetailsDto = surrogate.account_feature_update_details;
            }
            SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto2 = subscriptionUpdatedDetailsDto;
            AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto2 = accountFeatureUpdateDetailsDto;
            SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto2 = subscriptionCancelledDetailsDto;
            PlanSwitchedDetailsDto planSwitchedDetailsDto2 = planSwitchedDetailsDto;
            String str3 = str2;
            SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto2 = subscriptionCreatedDetailsDto;
            String str4 = str;
            Instant instant2 = instant;
            return surrogate.copy(byteString, typeDto, instant2, byteString2, str4, str3, subscriptionCreatedDetailsDto2, subscriptionCancelledDetailsDto2, planSwitchedDetailsDto2, subscriptionUpdatedDetailsDto2, accountFeatureUpdateDetailsDto2);
        }

        @SerialName("accountFeatureUpdateDetails")
        @JsonAnnotations2(names = {"account_feature_update_details"})
        public static /* synthetic */ void getAccount_feature_update_details$annotations() {
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("activityType")
        @JsonAnnotations2(names = {"activity_type"})
        public static /* synthetic */ void getActivity_type$annotations() {
        }

        @SerialName("idempotentId")
        @JsonAnnotations2(names = {"idempotent_id"})
        public static /* synthetic */ void getIdempotent_id$annotations() {
        }

        @SerialName("planSwitchedDetails")
        @JsonAnnotations2(names = {"plan_switched_details"})
        public static /* synthetic */ void getPlan_switched_details$annotations() {
        }

        @SerialName("subscriptionCancelledDetails")
        @JsonAnnotations2(names = {"subscription_cancelled_details"})
        public static /* synthetic */ void getSubscription_cancelled_details$annotations() {
        }

        @SerialName("subscriptionCreatedDetails")
        @JsonAnnotations2(names = {"subscription_created_details"})
        public static /* synthetic */ void getSubscription_created_details$annotations() {
        }

        @SerialName("subscriptionUpdatedDetails")
        @JsonAnnotations2(names = {"subscription_updated_details"})
        public static /* synthetic */ void getSubscription_updated_details$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("timezone")
        @JsonAnnotations2(names = {"timezone"})
        public static /* synthetic */ void getTimezone$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getIdempotent_id() {
            return this.idempotent_id;
        }

        /* renamed from: component10, reason: from getter */
        public final SubscriptionUpdatedDetailsDto getSubscription_updated_details() {
            return this.subscription_updated_details;
        }

        /* renamed from: component11, reason: from getter */
        public final AccountFeatureUpdateDetailsDto getAccount_feature_update_details() {
            return this.account_feature_update_details;
        }

        /* renamed from: component2, reason: from getter */
        public final TypeDto getActivity_type() {
            return this.activity_type;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final ByteString getUser_id() {
            return this.user_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        /* renamed from: component7, reason: from getter */
        public final SubscriptionCreatedDetailsDto getSubscription_created_details() {
            return this.subscription_created_details;
        }

        /* renamed from: component8, reason: from getter */
        public final SubscriptionCancelledDetailsDto getSubscription_cancelled_details() {
            return this.subscription_cancelled_details;
        }

        /* renamed from: component9, reason: from getter */
        public final PlanSwitchedDetailsDto getPlan_switched_details() {
            return this.plan_switched_details;
        }

        public final Surrogate copy(ByteString idempotent_id, TypeDto activity_type, Instant timestamp, ByteString user_id, String account_number, String timezone, SubscriptionCreatedDetailsDto subscription_created_details, SubscriptionCancelledDetailsDto subscription_cancelled_details, PlanSwitchedDetailsDto plan_switched_details, SubscriptionUpdatedDetailsDto subscription_updated_details, AccountFeatureUpdateDetailsDto account_feature_update_details) {
            Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
            Intrinsics.checkNotNullParameter(activity_type, "activity_type");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            return new Surrogate(idempotent_id, activity_type, timestamp, user_id, account_number, timezone, subscription_created_details, subscription_cancelled_details, plan_switched_details, subscription_updated_details, account_feature_update_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.idempotent_id, surrogate.idempotent_id) && this.activity_type == surrogate.activity_type && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.timezone, surrogate.timezone) && Intrinsics.areEqual(this.subscription_created_details, surrogate.subscription_created_details) && Intrinsics.areEqual(this.subscription_cancelled_details, surrogate.subscription_cancelled_details) && Intrinsics.areEqual(this.plan_switched_details, surrogate.plan_switched_details) && Intrinsics.areEqual(this.subscription_updated_details, surrogate.subscription_updated_details) && Intrinsics.areEqual(this.account_feature_update_details, surrogate.account_feature_update_details);
        }

        public int hashCode() {
            int iHashCode = ((this.idempotent_id.hashCode() * 31) + this.activity_type.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.user_id.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.timezone.hashCode()) * 31;
            SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto = this.subscription_created_details;
            int iHashCode3 = (iHashCode2 + (subscriptionCreatedDetailsDto == null ? 0 : subscriptionCreatedDetailsDto.hashCode())) * 31;
            SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto = this.subscription_cancelled_details;
            int iHashCode4 = (iHashCode3 + (subscriptionCancelledDetailsDto == null ? 0 : subscriptionCancelledDetailsDto.hashCode())) * 31;
            PlanSwitchedDetailsDto planSwitchedDetailsDto = this.plan_switched_details;
            int iHashCode5 = (iHashCode4 + (planSwitchedDetailsDto == null ? 0 : planSwitchedDetailsDto.hashCode())) * 31;
            SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto = this.subscription_updated_details;
            int iHashCode6 = (iHashCode5 + (subscriptionUpdatedDetailsDto == null ? 0 : subscriptionUpdatedDetailsDto.hashCode())) * 31;
            AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto = this.account_feature_update_details;
            return iHashCode6 + (accountFeatureUpdateDetailsDto != null ? accountFeatureUpdateDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(idempotent_id=" + this.idempotent_id + ", activity_type=" + this.activity_type + ", timestamp=" + this.timestamp + ", user_id=" + this.user_id + ", account_number=" + this.account_number + ", timezone=" + this.timezone + ", subscription_created_details=" + this.subscription_created_details + ", subscription_cancelled_details=" + this.subscription_cancelled_details + ", plan_switched_details=" + this.plan_switched_details + ", subscription_updated_details=" + this.subscription_updated_details + ", account_feature_update_details=" + this.account_feature_update_details + ")";
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionActivitySnapshotDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, TypeDto typeDto, Instant instant, ByteString byteString2, String str, String str2, SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto, SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto, PlanSwitchedDetailsDto planSwitchedDetailsDto, SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto, AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.idempotent_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.activity_type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.activity_type = typeDto;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 8) == 0) {
                this.user_id = ByteString.EMPTY;
            } else {
                this.user_id = byteString2;
            }
            if ((i & 16) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 32) == 0) {
                this.timezone = "";
            } else {
                this.timezone = str2;
            }
            if ((i & 64) == 0) {
                this.subscription_created_details = null;
            } else {
                this.subscription_created_details = subscriptionCreatedDetailsDto;
            }
            if ((i & 128) == 0) {
                this.subscription_cancelled_details = null;
            } else {
                this.subscription_cancelled_details = subscriptionCancelledDetailsDto;
            }
            if ((i & 256) == 0) {
                this.plan_switched_details = null;
            } else {
                this.plan_switched_details = planSwitchedDetailsDto;
            }
            if ((i & 512) == 0) {
                this.subscription_updated_details = null;
            } else {
                this.subscription_updated_details = subscriptionUpdatedDetailsDto;
            }
            if ((i & 1024) == 0) {
                this.account_feature_update_details = null;
            } else {
                this.account_feature_update_details = accountFeatureUpdateDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.idempotent_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.idempotent_id);
            }
            if (self.activity_type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TypeDto.Serializer.INSTANCE, self.activity_type);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.user_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 3, ByteStringSerializer.INSTANCE, self.user_id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 4, self.account_number);
            }
            if (!Intrinsics.areEqual(self.timezone, "")) {
                output.encodeStringElement(serialDesc, 5, self.timezone);
            }
            SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto = self.subscription_created_details;
            if (subscriptionCreatedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SubscriptionCreatedDetailsDto.Serializer.INSTANCE, subscriptionCreatedDetailsDto);
            }
            SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto = self.subscription_cancelled_details;
            if (subscriptionCancelledDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SubscriptionCancelledDetailsDto.Serializer.INSTANCE, subscriptionCancelledDetailsDto);
            }
            PlanSwitchedDetailsDto planSwitchedDetailsDto = self.plan_switched_details;
            if (planSwitchedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, PlanSwitchedDetailsDto.Serializer.INSTANCE, planSwitchedDetailsDto);
            }
            SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto = self.subscription_updated_details;
            if (subscriptionUpdatedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, SubscriptionUpdatedDetailsDto.Serializer.INSTANCE, subscriptionUpdatedDetailsDto);
            }
            AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto = self.account_feature_update_details;
            if (accountFeatureUpdateDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, AccountFeatureUpdateDetailsDto.Serializer.INSTANCE, accountFeatureUpdateDetailsDto);
            }
        }

        public Surrogate(ByteString idempotent_id, TypeDto activity_type, Instant instant, ByteString user_id, String account_number, String timezone, SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto, SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto, PlanSwitchedDetailsDto planSwitchedDetailsDto, SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto, AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto) {
            Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
            Intrinsics.checkNotNullParameter(activity_type, "activity_type");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            this.idempotent_id = idempotent_id;
            this.activity_type = activity_type;
            this.timestamp = instant;
            this.user_id = user_id;
            this.account_number = account_number;
            this.timezone = timezone;
            this.subscription_created_details = subscriptionCreatedDetailsDto;
            this.subscription_cancelled_details = subscriptionCancelledDetailsDto;
            this.plan_switched_details = planSwitchedDetailsDto;
            this.subscription_updated_details = subscriptionUpdatedDetailsDto;
            this.account_feature_update_details = accountFeatureUpdateDetailsDto;
        }

        public final ByteString getIdempotent_id() {
            return this.idempotent_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(okio.ByteString r3, com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto.TypeDto r4, p479j$.time.Instant r5, okio.ByteString r6, java.lang.String r7, java.lang.String r8, com.robinhood.rosetta.midas.p369v1.SubscriptionCreatedDetailsDto r9, com.robinhood.rosetta.midas.p369v1.SubscriptionCancelledDetailsDto r10, com.robinhood.rosetta.midas.p369v1.PlanSwitchedDetailsDto r11, com.robinhood.rosetta.midas.p369v1.SubscriptionUpdatedDetailsDto r12, com.robinhood.rosetta.midas.p369v1.AccountFeatureUpdateDetailsDto r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r2 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                okio.ByteString r3 = okio.ByteString.EMPTY
            L6:
                r15 = r14 & 2
                if (r15 == 0) goto L10
                com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto$Companion r4 = com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto.TypeDto.INSTANCE
                com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto r4 = r4.getZeroValue()
            L10:
                r15 = r14 & 4
                r0 = 0
                if (r15 == 0) goto L16
                r5 = r0
            L16:
                r15 = r14 & 8
                if (r15 == 0) goto L1c
                okio.ByteString r6 = okio.ByteString.EMPTY
            L1c:
                r15 = r14 & 16
                java.lang.String r1 = ""
                if (r15 == 0) goto L23
                r7 = r1
            L23:
                r15 = r14 & 32
                if (r15 == 0) goto L28
                r8 = r1
            L28:
                r15 = r14 & 64
                if (r15 == 0) goto L2d
                r9 = r0
            L2d:
                r15 = r14 & 128(0x80, float:1.794E-43)
                if (r15 == 0) goto L32
                r10 = r0
            L32:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L37
                r11 = r0
            L37:
                r15 = r14 & 512(0x200, float:7.175E-43)
                if (r15 == 0) goto L3c
                r12 = r0
            L3c:
                r14 = r14 & 1024(0x400, float:1.435E-42)
                if (r14 == 0) goto L4d
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L59
            L4d:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L59:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.midas.p369v1.SubscriptionActivitySnapshotDto.Surrogate.<init>(okio.ByteString, com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto, j$.time.Instant, okio.ByteString, java.lang.String, java.lang.String, com.robinhood.rosetta.midas.v1.SubscriptionCreatedDetailsDto, com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetailsDto, com.robinhood.rosetta.midas.v1.PlanSwitchedDetailsDto, com.robinhood.rosetta.midas.v1.SubscriptionUpdatedDetailsDto, com.robinhood.rosetta.midas.v1.AccountFeatureUpdateDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final TypeDto getActivity_type() {
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

        public final String getTimezone() {
            return this.timezone;
        }

        public final SubscriptionCreatedDetailsDto getSubscription_created_details() {
            return this.subscription_created_details;
        }

        public final SubscriptionCancelledDetailsDto getSubscription_cancelled_details() {
            return this.subscription_cancelled_details;
        }

        public final PlanSwitchedDetailsDto getPlan_switched_details() {
            return this.plan_switched_details;
        }

        public final SubscriptionUpdatedDetailsDto getSubscription_updated_details() {
            return this.subscription_updated_details;
        }

        public final AccountFeatureUpdateDetailsDto getAccount_feature_update_details() {
            return this.account_feature_update_details;
        }
    }

    /* compiled from: SubscriptionActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubscriptionActivitySnapshotDto, SubscriptionActivitySnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionActivitySnapshotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionActivitySnapshotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionActivitySnapshotDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionActivitySnapshotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionActivitySnapshot> getProtoAdapter() {
            return SubscriptionActivitySnapshot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionActivitySnapshotDto getZeroValue() {
            return SubscriptionActivitySnapshotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionActivitySnapshotDto fromProto(SubscriptionActivitySnapshot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString idempotent_id = proto.getIdempotent_id();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getActivity_type());
            Instant timestamp = proto.getTimestamp();
            ByteString user_id = proto.getUser_id();
            String account_number = proto.getAccount_number();
            String timezone = proto.getTimezone();
            SubscriptionCreatedDetails subscription_created_details = proto.getSubscription_created_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDtoFromProto = subscription_created_details != null ? SubscriptionCreatedDetailsDto.INSTANCE.fromProto(subscription_created_details) : null;
            SubscriptionCancelledDetails subscription_cancelled_details = proto.getSubscription_cancelled_details();
            SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDtoFromProto = subscription_cancelled_details != null ? SubscriptionCancelledDetailsDto.INSTANCE.fromProto(subscription_cancelled_details) : null;
            PlanSwitchedDetails plan_switched_details = proto.getPlan_switched_details();
            PlanSwitchedDetailsDto planSwitchedDetailsDtoFromProto = plan_switched_details != null ? PlanSwitchedDetailsDto.INSTANCE.fromProto(plan_switched_details) : null;
            SubscriptionUpdatedDetails subscription_updated_details = proto.getSubscription_updated_details();
            SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDtoFromProto = subscription_updated_details != null ? SubscriptionUpdatedDetailsDto.INSTANCE.fromProto(subscription_updated_details) : null;
            AccountFeatureUpdateDetails account_feature_update_details = proto.getAccount_feature_update_details();
            return new SubscriptionActivitySnapshotDto(new Surrogate(idempotent_id, typeDtoFromProto, timestamp, user_id, account_number, timezone, subscriptionCreatedDetailsDtoFromProto, subscriptionCancelledDetailsDtoFromProto, planSwitchedDetailsDtoFromProto, subscriptionUpdatedDetailsDtoFromProto, account_feature_update_details != null ? AccountFeatureUpdateDetailsDto.INSTANCE.fromProto(account_feature_update_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionActivitySnapshotDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubscriptionActivitySnapshotDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubscriptionActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SubscriptionCreatedDetails", "SubscriptionCancelledDetails", "PlanSwitchedDetails", "SubscriptionUpdatedDetails", "AccountFeatureUpdateDetails", "Companion", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$AccountFeatureUpdateDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$PlanSwitchedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$SubscriptionCancelledDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$SubscriptionCreatedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$SubscriptionUpdatedDetails;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class EventDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ EventDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EventDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$SubscriptionCreatedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubscriptionCreatedDetails extends EventDetailsDto {
            private final SubscriptionCreatedDetailsDto value;

            public static /* synthetic */ SubscriptionCreatedDetails copy$default(SubscriptionCreatedDetails subscriptionCreatedDetails, SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    subscriptionCreatedDetailsDto = subscriptionCreatedDetails.value;
                }
                return subscriptionCreatedDetails.copy(subscriptionCreatedDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SubscriptionCreatedDetailsDto getValue() {
                return this.value;
            }

            public final SubscriptionCreatedDetails copy(SubscriptionCreatedDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SubscriptionCreatedDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubscriptionCreatedDetails) && Intrinsics.areEqual(this.value, ((SubscriptionCreatedDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubscriptionCreatedDetails(value=" + this.value + ")";
            }

            public final SubscriptionCreatedDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionCreatedDetails(SubscriptionCreatedDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$SubscriptionCancelledDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubscriptionCancelledDetails extends EventDetailsDto {
            private final SubscriptionCancelledDetailsDto value;

            public static /* synthetic */ SubscriptionCancelledDetails copy$default(SubscriptionCancelledDetails subscriptionCancelledDetails, SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    subscriptionCancelledDetailsDto = subscriptionCancelledDetails.value;
                }
                return subscriptionCancelledDetails.copy(subscriptionCancelledDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SubscriptionCancelledDetailsDto getValue() {
                return this.value;
            }

            public final SubscriptionCancelledDetails copy(SubscriptionCancelledDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SubscriptionCancelledDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubscriptionCancelledDetails) && Intrinsics.areEqual(this.value, ((SubscriptionCancelledDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubscriptionCancelledDetails(value=" + this.value + ")";
            }

            public final SubscriptionCancelledDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionCancelledDetails(SubscriptionCancelledDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$PlanSwitchedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/PlanSwitchedDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlanSwitchedDetails extends EventDetailsDto {
            private final PlanSwitchedDetailsDto value;

            public static /* synthetic */ PlanSwitchedDetails copy$default(PlanSwitchedDetails planSwitchedDetails, PlanSwitchedDetailsDto planSwitchedDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    planSwitchedDetailsDto = planSwitchedDetails.value;
                }
                return planSwitchedDetails.copy(planSwitchedDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final PlanSwitchedDetailsDto getValue() {
                return this.value;
            }

            public final PlanSwitchedDetails copy(PlanSwitchedDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new PlanSwitchedDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlanSwitchedDetails) && Intrinsics.areEqual(this.value, ((PlanSwitchedDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlanSwitchedDetails(value=" + this.value + ")";
            }

            public final PlanSwitchedDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlanSwitchedDetails(PlanSwitchedDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$SubscriptionUpdatedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionUpdatedDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubscriptionUpdatedDetails extends EventDetailsDto {
            private final SubscriptionUpdatedDetailsDto value;

            public static /* synthetic */ SubscriptionUpdatedDetails copy$default(SubscriptionUpdatedDetails subscriptionUpdatedDetails, SubscriptionUpdatedDetailsDto subscriptionUpdatedDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    subscriptionUpdatedDetailsDto = subscriptionUpdatedDetails.value;
                }
                return subscriptionUpdatedDetails.copy(subscriptionUpdatedDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SubscriptionUpdatedDetailsDto getValue() {
                return this.value;
            }

            public final SubscriptionUpdatedDetails copy(SubscriptionUpdatedDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SubscriptionUpdatedDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubscriptionUpdatedDetails) && Intrinsics.areEqual(this.value, ((SubscriptionUpdatedDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubscriptionUpdatedDetails(value=" + this.value + ")";
            }

            public final SubscriptionUpdatedDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionUpdatedDetails(SubscriptionUpdatedDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$AccountFeatureUpdateDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountFeatureUpdateDetails extends EventDetailsDto {
            private final AccountFeatureUpdateDetailsDto value;

            public static /* synthetic */ AccountFeatureUpdateDetails copy$default(AccountFeatureUpdateDetails accountFeatureUpdateDetails, AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    accountFeatureUpdateDetailsDto = accountFeatureUpdateDetails.value;
                }
                return accountFeatureUpdateDetails.copy(accountFeatureUpdateDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final AccountFeatureUpdateDetailsDto getValue() {
                return this.value;
            }

            public final AccountFeatureUpdateDetails copy(AccountFeatureUpdateDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AccountFeatureUpdateDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountFeatureUpdateDetails) && Intrinsics.areEqual(this.value, ((AccountFeatureUpdateDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AccountFeatureUpdateDetails(value=" + this.value + ")";
            }

            public final AccountFeatureUpdateDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountFeatureUpdateDetails(AccountFeatureUpdateDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$EventDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<EventDetailsDto, SubscriptionActivitySnapshot> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SubscriptionActivitySnapshot> getProtoAdapter() {
                return SubscriptionActivitySnapshot.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventDetailsDto fromProto(SubscriptionActivitySnapshot proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSubscription_created_details() != null) {
                    return new SubscriptionCreatedDetails(SubscriptionCreatedDetailsDto.INSTANCE.fromProto(proto.getSubscription_created_details()));
                }
                if (proto.getSubscription_cancelled_details() != null) {
                    return new SubscriptionCancelledDetails(SubscriptionCancelledDetailsDto.INSTANCE.fromProto(proto.getSubscription_cancelled_details()));
                }
                if (proto.getPlan_switched_details() != null) {
                    return new PlanSwitchedDetails(PlanSwitchedDetailsDto.INSTANCE.fromProto(proto.getPlan_switched_details()));
                }
                if (proto.getSubscription_updated_details() != null) {
                    return new SubscriptionUpdatedDetails(SubscriptionUpdatedDetailsDto.INSTANCE.fromProto(proto.getSubscription_updated_details()));
                }
                if (proto.getAccount_feature_update_details() != null) {
                    return new AccountFeatureUpdateDetails(AccountFeatureUpdateDetailsDto.INSTANCE.fromProto(proto.getAccount_feature_update_details()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SUBSCRIPTION_CREATED", "SUBSCRIPTION_CANCELLED", "PLAN_SWITCHED", "SUBSCRIPTION_UPDATED", "ACCOUNT_FEATURE_UPDATE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<SubscriptionActivitySnapshot.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, SubscriptionActivitySnapshot.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final TypeDto SUBSCRIPTION_CREATED = new SUBSCRIPTION_CREATED("SUBSCRIPTION_CREATED", 1);
        public static final TypeDto SUBSCRIPTION_CANCELLED = new SUBSCRIPTION_CANCELLED("SUBSCRIPTION_CANCELLED", 2);
        public static final TypeDto PLAN_SWITCHED = new PLAN_SWITCHED("PLAN_SWITCHED", 3);
        public static final TypeDto SUBSCRIPTION_UPDATED = new SUBSCRIPTION_UPDATED("SUBSCRIPTION_UPDATED", 4);
        public static final TypeDto ACCOUNT_FEATURE_UPDATE = new ACCOUNT_FEATURE_UPDATE("ACCOUNT_FEATURE_UPDATE", 5);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{UNSPECIFIED, SUBSCRIPTION_CREATED, SUBSCRIPTION_CANCELLED, PLAN_SWITCHED, SUBSCRIPTION_UPDATED, ACCOUNT_FEATURE_UPDATE};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto.TypeDto.UNSPECIFIED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends TypeDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionActivitySnapshot.Type toProto() {
                return SubscriptionActivitySnapshot.Type.UNSPECIFIED;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptionActivitySnapshotDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto.TypeDto.SUBSCRIPTION_CREATED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBSCRIPTION_CREATED extends TypeDto {
            SUBSCRIPTION_CREATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionActivitySnapshot.Type toProto() {
                return SubscriptionActivitySnapshot.Type.SUBSCRIPTION_CREATED;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto.TypeDto.SUBSCRIPTION_CANCELLED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBSCRIPTION_CANCELLED extends TypeDto {
            SUBSCRIPTION_CANCELLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionActivitySnapshot.Type toProto() {
                return SubscriptionActivitySnapshot.Type.SUBSCRIPTION_CANCELLED;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto.TypeDto.PLAN_SWITCHED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAN_SWITCHED extends TypeDto {
            PLAN_SWITCHED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionActivitySnapshot.Type toProto() {
                return SubscriptionActivitySnapshot.Type.PLAN_SWITCHED;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto.TypeDto.SUBSCRIPTION_UPDATED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBSCRIPTION_UPDATED extends TypeDto {
            SUBSCRIPTION_UPDATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionActivitySnapshot.Type toProto() {
                return SubscriptionActivitySnapshot.Type.SUBSCRIPTION_UPDATED;
            }
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto.TypeDto.ACCOUNT_FEATURE_UPDATE", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_FEATURE_UPDATE extends TypeDto {
            ACCOUNT_FEATURE_UPDATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionActivitySnapshot.Type toProto() {
                return SubscriptionActivitySnapshot.Type.ACCOUNT_FEATURE_UPDATE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshot$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, SubscriptionActivitySnapshot.Type> {

            /* compiled from: SubscriptionActivitySnapshotDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SubscriptionActivitySnapshot.Type.values().length];
                    try {
                        iArr[SubscriptionActivitySnapshot.Type.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SubscriptionActivitySnapshot.Type.SUBSCRIPTION_CREATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SubscriptionActivitySnapshot.Type.SUBSCRIPTION_CANCELLED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SubscriptionActivitySnapshot.Type.PLAN_SWITCHED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SubscriptionActivitySnapshot.Type.SUBSCRIPTION_UPDATED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SubscriptionActivitySnapshot.Type.ACCOUNT_FEATURE_UPDATE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SubscriptionActivitySnapshot.Type> getProtoAdapter() {
                return SubscriptionActivitySnapshot.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(SubscriptionActivitySnapshot.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TypeDto.UNSPECIFIED;
                    case 2:
                        return TypeDto.SUBSCRIPTION_CREATED;
                    case 3:
                        return TypeDto.SUBSCRIPTION_CANCELLED;
                    case 4:
                        return TypeDto.PLAN_SWITCHED;
                    case 5:
                        return TypeDto.SUBSCRIPTION_UPDATED;
                    case 6:
                        return TypeDto.ACCOUNT_FEATURE_UPDATE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SubscriptionActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, SubscriptionActivitySnapshot.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.SubscriptionActivitySnapshot.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SubscriptionActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionActivitySnapshotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionActivitySnapshot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionActivitySnapshotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionActivitySnapshotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionActivitySnapshotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionActivitySnapshotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.SubscriptionActivitySnapshotDto";
        }
    }
}
