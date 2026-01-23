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
import com.robinhood.rosetta.midas.p369v1.SubscriptionFeeActivitySnapshot;
import com.robinhood.rosetta.midas.p369v1.SubscriptionFeeActivitySnapshotDto;
import com.robinhood.rosetta.midas.p369v1.SubscriptionFeeChargedDetailsDto;
import com.robinhood.rosetta.midas.p369v1.SubscriptionFeeRefundedDetailsDto;
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

/* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006>=?@ABB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014JS\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006C"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;)V", "Lokio/ByteString;", "idempotent_id", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "activity_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;", "event_details", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;)V", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;", "getIdempotent_id", "()Lokio/ByteString;", "getActivity_type", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "getTimestamp", "()Lj$/time/Instant;", "getUser_id", "getAccount_number", "getEvent_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "getSubscription_fee_charged_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "subscription_fee_charged_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "getSubscription_fee_refunded_details", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "subscription_fee_refunded_details", "Companion", "Surrogate", "EventDetailsDto", "TypeDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SubscriptionFeeActivitySnapshotDto implements Dto3<SubscriptionFeeActivitySnapshot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionFeeActivitySnapshotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionFeeActivitySnapshotDto, SubscriptionFeeActivitySnapshot>> binaryBase64Serializer$delegate;
    private static final SubscriptionFeeActivitySnapshotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionFeeActivitySnapshotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionFeeActivitySnapshotDto(Surrogate surrogate) {
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

    public final EventDetailsDto getEvent_details() {
        if (this.surrogate.getSubscription_fee_charged_details() != null) {
            return new EventDetailsDto.SubscriptionFeeChargedDetails(this.surrogate.getSubscription_fee_charged_details());
        }
        if (this.surrogate.getSubscription_fee_refunded_details() != null) {
            return new EventDetailsDto.SubscriptionFeeRefundedDetails(this.surrogate.getSubscription_fee_refunded_details());
        }
        return null;
    }

    public final SubscriptionFeeChargedDetailsDto getSubscription_fee_charged_details() {
        return this.surrogate.getSubscription_fee_charged_details();
    }

    public final SubscriptionFeeRefundedDetailsDto getSubscription_fee_refunded_details() {
        return this.surrogate.getSubscription_fee_refunded_details();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SubscriptionFeeActivitySnapshotDto(okio.ByteString r2, com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto.TypeDto r3, p479j$.time.Instant r4, okio.ByteString r5, java.lang.String r6, com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto.EventDetailsDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            okio.ByteString r2 = okio.ByteString.EMPTY
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto$Companion r3 = com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto.TypeDto.INSTANCE
            com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto r3 = r3.getZeroValue()
        L10:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L16
            r4 = r0
        L16:
            r9 = r8 & 8
            if (r9 == 0) goto L1c
            okio.ByteString r5 = okio.ByteString.EMPTY
        L1c:
            r9 = r8 & 16
            if (r9 == 0) goto L22
            java.lang.String r6 = ""
        L22:
            r8 = r8 & 32
            if (r8 == 0) goto L2e
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L35
        L2e:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.midas.p369v1.SubscriptionFeeActivitySnapshotDto.<init>(okio.ByteString, com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto, j$.time.Instant, okio.ByteString, java.lang.String, com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$EventDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriptionFeeActivitySnapshotDto(ByteString idempotent_id, TypeDto activity_type, Instant instant, ByteString user_id, String account_number, EventDetailsDto eventDetailsDto) {
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        EventDetailsDto.SubscriptionFeeChargedDetails subscriptionFeeChargedDetails = eventDetailsDto instanceof EventDetailsDto.SubscriptionFeeChargedDetails ? (EventDetailsDto.SubscriptionFeeChargedDetails) eventDetailsDto : null;
        SubscriptionFeeChargedDetailsDto value = subscriptionFeeChargedDetails != null ? subscriptionFeeChargedDetails.getValue() : null;
        EventDetailsDto.SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails = eventDetailsDto instanceof EventDetailsDto.SubscriptionFeeRefundedDetails ? (EventDetailsDto.SubscriptionFeeRefundedDetails) eventDetailsDto : null;
        this(new Surrogate(idempotent_id, activity_type, instant, user_id, account_number, value, subscriptionFeeRefundedDetails != null ? subscriptionFeeRefundedDetails.getValue() : null));
    }

    public static /* synthetic */ SubscriptionFeeActivitySnapshotDto copy$default(SubscriptionFeeActivitySnapshotDto subscriptionFeeActivitySnapshotDto, ByteString byteString, TypeDto typeDto, Instant instant, ByteString byteString2, String str, EventDetailsDto eventDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionFeeActivitySnapshotDto.surrogate.getIdempotent_id();
        }
        if ((i & 2) != 0) {
            typeDto = subscriptionFeeActivitySnapshotDto.surrogate.getActivity_type();
        }
        if ((i & 4) != 0) {
            instant = subscriptionFeeActivitySnapshotDto.surrogate.getTimestamp();
        }
        if ((i & 8) != 0) {
            byteString2 = subscriptionFeeActivitySnapshotDto.surrogate.getUser_id();
        }
        if ((i & 16) != 0) {
            str = subscriptionFeeActivitySnapshotDto.surrogate.getAccount_number();
        }
        if ((i & 32) != 0) {
            eventDetailsDto = subscriptionFeeActivitySnapshotDto.getEvent_details();
        }
        String str2 = str;
        EventDetailsDto eventDetailsDto2 = eventDetailsDto;
        return subscriptionFeeActivitySnapshotDto.copy(byteString, typeDto, instant, byteString2, str2, eventDetailsDto2);
    }

    public final SubscriptionFeeActivitySnapshotDto copy(ByteString idempotent_id, TypeDto activity_type, Instant timestamp, ByteString user_id, String account_number, EventDetailsDto event_details) {
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(activity_type, "activity_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        EventDetailsDto.SubscriptionFeeChargedDetails subscriptionFeeChargedDetails = event_details instanceof EventDetailsDto.SubscriptionFeeChargedDetails ? (EventDetailsDto.SubscriptionFeeChargedDetails) event_details : null;
        SubscriptionFeeChargedDetailsDto value = subscriptionFeeChargedDetails != null ? subscriptionFeeChargedDetails.getValue() : null;
        EventDetailsDto.SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails = event_details instanceof EventDetailsDto.SubscriptionFeeRefundedDetails ? (EventDetailsDto.SubscriptionFeeRefundedDetails) event_details : null;
        return new SubscriptionFeeActivitySnapshotDto(new Surrogate(idempotent_id, activity_type, timestamp, user_id, account_number, value, subscriptionFeeRefundedDetails != null ? subscriptionFeeRefundedDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubscriptionFeeActivitySnapshot toProto() {
        ByteString idempotent_id = this.surrogate.getIdempotent_id();
        SubscriptionFeeActivitySnapshot.Type type2 = (SubscriptionFeeActivitySnapshot.Type) this.surrogate.getActivity_type().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        ByteString user_id = this.surrogate.getUser_id();
        String account_number = this.surrogate.getAccount_number();
        SubscriptionFeeChargedDetailsDto subscription_fee_charged_details = this.surrogate.getSubscription_fee_charged_details();
        SubscriptionFeeChargedDetails proto = subscription_fee_charged_details != null ? subscription_fee_charged_details.toProto() : null;
        SubscriptionFeeRefundedDetailsDto subscription_fee_refunded_details = this.surrogate.getSubscription_fee_refunded_details();
        return new SubscriptionFeeActivitySnapshot(idempotent_id, type2, timestamp, user_id, account_number, proto, subscription_fee_refunded_details != null ? subscription_fee_refunded_details.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[SubscriptionFeeActivitySnapshotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionFeeActivitySnapshotDto) && Intrinsics.areEqual(((SubscriptionFeeActivitySnapshotDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u0095\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Ba\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J6\u0010(\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u009e\u0001\u00101\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b3\u0010,J\u0010\u00104\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010'RF\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010A\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010)R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010%R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010,R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010I\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u0010.R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010L\u0012\u0004\bN\u0010=\u001a\u0004\bM\u00100¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "idempotent_id", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "activity_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "subscription_fee_charged_details", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "subscription_fee_refunded_details", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Ljava/lang/String;", "component6", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "component7", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getIdempotent_id", "getIdempotent_id$annotations", "()V", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "getActivity_type", "getActivity_type$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getUser_id", "getUser_id$annotations", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "getSubscription_fee_charged_details", "getSubscription_fee_charged_details$annotations", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "getSubscription_fee_refunded_details", "getSubscription_fee_refunded_details$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final TypeDto activity_type;
        private final ByteString idempotent_id;
        private final SubscriptionFeeChargedDetailsDto subscription_fee_charged_details;
        private final SubscriptionFeeRefundedDetailsDto subscription_fee_refunded_details;
        private final Instant timestamp;
        private final ByteString user_id;

        public Surrogate() {
            this((ByteString) null, (TypeDto) null, (Instant) null, (ByteString) null, (String) null, (SubscriptionFeeChargedDetailsDto) null, (SubscriptionFeeRefundedDetailsDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, TypeDto typeDto, Instant instant, ByteString byteString2, String str, SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto, SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto, int i, Object obj) {
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
                subscriptionFeeChargedDetailsDto = surrogate.subscription_fee_charged_details;
            }
            if ((i & 64) != 0) {
                subscriptionFeeRefundedDetailsDto = surrogate.subscription_fee_refunded_details;
            }
            SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto2 = subscriptionFeeChargedDetailsDto;
            SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto2 = subscriptionFeeRefundedDetailsDto;
            String str2 = str;
            Instant instant2 = instant;
            return surrogate.copy(byteString, typeDto, instant2, byteString2, str2, subscriptionFeeChargedDetailsDto2, subscriptionFeeRefundedDetailsDto2);
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

        @SerialName("subscriptionFeeChargedDetails")
        @JsonAnnotations2(names = {"subscription_fee_charged_details"})
        public static /* synthetic */ void getSubscription_fee_charged_details$annotations() {
        }

        @SerialName("subscriptionFeeRefundedDetails")
        @JsonAnnotations2(names = {"subscription_fee_refunded_details"})
        public static /* synthetic */ void getSubscription_fee_refunded_details$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getIdempotent_id() {
            return this.idempotent_id;
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
        public final SubscriptionFeeChargedDetailsDto getSubscription_fee_charged_details() {
            return this.subscription_fee_charged_details;
        }

        /* renamed from: component7, reason: from getter */
        public final SubscriptionFeeRefundedDetailsDto getSubscription_fee_refunded_details() {
            return this.subscription_fee_refunded_details;
        }

        public final Surrogate copy(ByteString idempotent_id, TypeDto activity_type, Instant timestamp, ByteString user_id, String account_number, SubscriptionFeeChargedDetailsDto subscription_fee_charged_details, SubscriptionFeeRefundedDetailsDto subscription_fee_refunded_details) {
            Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
            Intrinsics.checkNotNullParameter(activity_type, "activity_type");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            return new Surrogate(idempotent_id, activity_type, timestamp, user_id, account_number, subscription_fee_charged_details, subscription_fee_refunded_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.idempotent_id, surrogate.idempotent_id) && this.activity_type == surrogate.activity_type && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.subscription_fee_charged_details, surrogate.subscription_fee_charged_details) && Intrinsics.areEqual(this.subscription_fee_refunded_details, surrogate.subscription_fee_refunded_details);
        }

        public int hashCode() {
            int iHashCode = ((this.idempotent_id.hashCode() * 31) + this.activity_type.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.user_id.hashCode()) * 31) + this.account_number.hashCode()) * 31;
            SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto = this.subscription_fee_charged_details;
            int iHashCode3 = (iHashCode2 + (subscriptionFeeChargedDetailsDto == null ? 0 : subscriptionFeeChargedDetailsDto.hashCode())) * 31;
            SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto = this.subscription_fee_refunded_details;
            return iHashCode3 + (subscriptionFeeRefundedDetailsDto != null ? subscriptionFeeRefundedDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(idempotent_id=" + this.idempotent_id + ", activity_type=" + this.activity_type + ", timestamp=" + this.timestamp + ", user_id=" + this.user_id + ", account_number=" + this.account_number + ", subscription_fee_charged_details=" + this.subscription_fee_charged_details + ", subscription_fee_refunded_details=" + this.subscription_fee_refunded_details + ")";
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionFeeActivitySnapshotDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, TypeDto typeDto, Instant instant, ByteString byteString2, String str, SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto, SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.subscription_fee_charged_details = null;
            } else {
                this.subscription_fee_charged_details = subscriptionFeeChargedDetailsDto;
            }
            if ((i & 64) == 0) {
                this.subscription_fee_refunded_details = null;
            } else {
                this.subscription_fee_refunded_details = subscriptionFeeRefundedDetailsDto;
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
            SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto = self.subscription_fee_charged_details;
            if (subscriptionFeeChargedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SubscriptionFeeChargedDetailsDto.Serializer.INSTANCE, subscriptionFeeChargedDetailsDto);
            }
            SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto = self.subscription_fee_refunded_details;
            if (subscriptionFeeRefundedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SubscriptionFeeRefundedDetailsDto.Serializer.INSTANCE, subscriptionFeeRefundedDetailsDto);
            }
        }

        public Surrogate(ByteString idempotent_id, TypeDto activity_type, Instant instant, ByteString user_id, String account_number, SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto, SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto) {
            Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
            Intrinsics.checkNotNullParameter(activity_type, "activity_type");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.idempotent_id = idempotent_id;
            this.activity_type = activity_type;
            this.timestamp = instant;
            this.user_id = user_id;
            this.account_number = account_number;
            this.subscription_fee_charged_details = subscriptionFeeChargedDetailsDto;
            this.subscription_fee_refunded_details = subscriptionFeeRefundedDetailsDto;
        }

        public final ByteString getIdempotent_id() {
            return this.idempotent_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(okio.ByteString r2, com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto.TypeDto r3, p479j$.time.Instant r4, okio.ByteString r5, java.lang.String r6, com.robinhood.rosetta.midas.p369v1.SubscriptionFeeChargedDetailsDto r7, com.robinhood.rosetta.midas.p369v1.SubscriptionFeeRefundedDetailsDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                okio.ByteString r2 = okio.ByteString.EMPTY
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto L10
                com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto$Companion r3 = com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto.TypeDto.INSTANCE
                com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto r3 = r3.getZeroValue()
            L10:
                r10 = r9 & 4
                r0 = 0
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1c
                okio.ByteString r5 = okio.ByteString.EMPTY
            L1c:
                r10 = r9 & 16
                if (r10 == 0) goto L22
                java.lang.String r6 = ""
            L22:
                r10 = r9 & 32
                if (r10 == 0) goto L27
                r7 = r0
            L27:
                r9 = r9 & 64
                if (r9 == 0) goto L34
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3c
            L34:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3c:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.midas.p369v1.SubscriptionFeeActivitySnapshotDto.Surrogate.<init>(okio.ByteString, com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto, j$.time.Instant, okio.ByteString, java.lang.String, com.robinhood.rosetta.midas.v1.SubscriptionFeeChargedDetailsDto, com.robinhood.rosetta.midas.v1.SubscriptionFeeRefundedDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

        public final SubscriptionFeeChargedDetailsDto getSubscription_fee_charged_details() {
            return this.subscription_fee_charged_details;
        }

        public final SubscriptionFeeRefundedDetailsDto getSubscription_fee_refunded_details() {
            return this.subscription_fee_refunded_details;
        }
    }

    /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubscriptionFeeActivitySnapshotDto, SubscriptionFeeActivitySnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionFeeActivitySnapshotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeeActivitySnapshotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeeActivitySnapshotDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionFeeActivitySnapshotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionFeeActivitySnapshot> getProtoAdapter() {
            return SubscriptionFeeActivitySnapshot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeeActivitySnapshotDto getZeroValue() {
            return SubscriptionFeeActivitySnapshotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeeActivitySnapshotDto fromProto(SubscriptionFeeActivitySnapshot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString idempotent_id = proto.getIdempotent_id();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getActivity_type());
            Instant timestamp = proto.getTimestamp();
            ByteString user_id = proto.getUser_id();
            String account_number = proto.getAccount_number();
            SubscriptionFeeChargedDetails subscription_fee_charged_details = proto.getSubscription_fee_charged_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDtoFromProto = subscription_fee_charged_details != null ? SubscriptionFeeChargedDetailsDto.INSTANCE.fromProto(subscription_fee_charged_details) : null;
            SubscriptionFeeRefundedDetails subscription_fee_refunded_details = proto.getSubscription_fee_refunded_details();
            return new SubscriptionFeeActivitySnapshotDto(new Surrogate(idempotent_id, typeDtoFromProto, timestamp, user_id, account_number, subscriptionFeeChargedDetailsDtoFromProto, subscription_fee_refunded_details != null ? SubscriptionFeeRefundedDetailsDto.INSTANCE.fromProto(subscription_fee_refunded_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionFeeActivitySnapshotDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubscriptionFeeActivitySnapshotDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SubscriptionFeeChargedDetails", "SubscriptionFeeRefundedDetails", "Companion", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto$SubscriptionFeeChargedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto$SubscriptionFeeRefundedDetails;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto$SubscriptionFeeChargedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubscriptionFeeChargedDetails extends EventDetailsDto {
            private final SubscriptionFeeChargedDetailsDto value;

            public static /* synthetic */ SubscriptionFeeChargedDetails copy$default(SubscriptionFeeChargedDetails subscriptionFeeChargedDetails, SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    subscriptionFeeChargedDetailsDto = subscriptionFeeChargedDetails.value;
                }
                return subscriptionFeeChargedDetails.copy(subscriptionFeeChargedDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SubscriptionFeeChargedDetailsDto getValue() {
                return this.value;
            }

            public final SubscriptionFeeChargedDetails copy(SubscriptionFeeChargedDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SubscriptionFeeChargedDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubscriptionFeeChargedDetails) && Intrinsics.areEqual(this.value, ((SubscriptionFeeChargedDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubscriptionFeeChargedDetails(value=" + this.value + ")";
            }

            public final SubscriptionFeeChargedDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionFeeChargedDetails(SubscriptionFeeChargedDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto$SubscriptionFeeRefundedDetails;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;", "value", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubscriptionFeeRefundedDetails extends EventDetailsDto {
            private final SubscriptionFeeRefundedDetailsDto value;

            public static /* synthetic */ SubscriptionFeeRefundedDetails copy$default(SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails, SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    subscriptionFeeRefundedDetailsDto = subscriptionFeeRefundedDetails.value;
                }
                return subscriptionFeeRefundedDetails.copy(subscriptionFeeRefundedDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SubscriptionFeeRefundedDetailsDto getValue() {
                return this.value;
            }

            public final SubscriptionFeeRefundedDetails copy(SubscriptionFeeRefundedDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SubscriptionFeeRefundedDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubscriptionFeeRefundedDetails) && Intrinsics.areEqual(this.value, ((SubscriptionFeeRefundedDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubscriptionFeeRefundedDetails(value=" + this.value + ")";
            }

            public final SubscriptionFeeRefundedDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionFeeRefundedDetails(SubscriptionFeeRefundedDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$EventDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<EventDetailsDto, SubscriptionFeeActivitySnapshot> {
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
            public ProtoAdapter<SubscriptionFeeActivitySnapshot> getProtoAdapter() {
                return SubscriptionFeeActivitySnapshot.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventDetailsDto fromProto(SubscriptionFeeActivitySnapshot proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSubscription_fee_charged_details() != null) {
                    return new SubscriptionFeeChargedDetails(SubscriptionFeeChargedDetailsDto.INSTANCE.fromProto(proto.getSubscription_fee_charged_details()));
                }
                if (proto.getSubscription_fee_refunded_details() != null) {
                    return new SubscriptionFeeRefundedDetails(SubscriptionFeeRefundedDetailsDto.INSTANCE.fromProto(proto.getSubscription_fee_refunded_details()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SUBSCRIPTION_FEE_CHARGED", "SUBSCRIPTION_FEE_REFUNDED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<SubscriptionFeeActivitySnapshot.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, SubscriptionFeeActivitySnapshot.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final TypeDto SUBSCRIPTION_FEE_CHARGED = new SUBSCRIPTION_FEE_CHARGED("SUBSCRIPTION_FEE_CHARGED", 1);
        public static final TypeDto SUBSCRIPTION_FEE_REFUNDED = new SUBSCRIPTION_FEE_REFUNDED("SUBSCRIPTION_FEE_REFUNDED", 2);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{UNSPECIFIED, SUBSCRIPTION_FEE_CHARGED, SUBSCRIPTION_FEE_REFUNDED};
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

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto.TypeDto.UNSPECIFIED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends TypeDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionFeeActivitySnapshot.Type toProto() {
                return SubscriptionFeeActivitySnapshot.Type.UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptionFeeActivitySnapshotDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto.TypeDto.SUBSCRIPTION_FEE_CHARGED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBSCRIPTION_FEE_CHARGED extends TypeDto {
            SUBSCRIPTION_FEE_CHARGED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionFeeActivitySnapshot.Type toProto() {
                return SubscriptionFeeActivitySnapshot.Type.SUBSCRIPTION_FEE_CHARGED;
            }
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto.TypeDto.SUBSCRIPTION_FEE_REFUNDED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBSCRIPTION_FEE_REFUNDED extends TypeDto {
            SUBSCRIPTION_FEE_REFUNDED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionFeeActivitySnapshot.Type toProto() {
                return SubscriptionFeeActivitySnapshot.Type.SUBSCRIPTION_FEE_REFUNDED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshot$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, SubscriptionFeeActivitySnapshot.Type> {

            /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SubscriptionFeeActivitySnapshot.Type.values().length];
                    try {
                        iArr[SubscriptionFeeActivitySnapshot.Type.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SubscriptionFeeActivitySnapshot.Type.SUBSCRIPTION_FEE_CHARGED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SubscriptionFeeActivitySnapshot.Type.SUBSCRIPTION_FEE_REFUNDED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
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
            public ProtoAdapter<SubscriptionFeeActivitySnapshot.Type> getProtoAdapter() {
                return SubscriptionFeeActivitySnapshot.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(SubscriptionFeeActivitySnapshot.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TypeDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return TypeDto.SUBSCRIPTION_FEE_CHARGED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return TypeDto.SUBSCRIPTION_FEE_REFUNDED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, SubscriptionFeeActivitySnapshot.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.SubscriptionFeeActivitySnapshot.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

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

    /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionFeeActivitySnapshotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionFeeActivitySnapshot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionFeeActivitySnapshotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionFeeActivitySnapshotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionFeeActivitySnapshotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionFeeActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeActivitySnapshotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.SubscriptionFeeActivitySnapshotDto";
        }
    }
}
