package com.robinhood.rosetta.midas.p369v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.midas.p369v1.SubscriptionCancelledDetails;
import com.robinhood.rosetta.midas.p369v1.SubscriptionCancelledDetailsDto;
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

/* compiled from: SubscriptionCancelledDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005.-/01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;)V", "Lokio/ByteString;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "ended_at", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "downgrade_reason", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;)V", "copy", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;", "getSubscription_id", "()Lokio/ByteString;", "getEnded_at", "()Lj$/time/Instant;", "getDowngrade_reason", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "Companion", "Surrogate", "DowngradeReasonDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SubscriptionCancelledDetailsDto implements Dto3<SubscriptionCancelledDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionCancelledDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionCancelledDetailsDto, SubscriptionCancelledDetails>> binaryBase64Serializer$delegate;
    private static final SubscriptionCancelledDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionCancelledDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionCancelledDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getSubscription_id() {
        return this.surrogate.getSubscription_id();
    }

    public final Instant getEnded_at() {
        return this.surrogate.getEnded_at();
    }

    public final DowngradeReasonDto getDowngrade_reason() {
        return this.surrogate.getDowngrade_reason();
    }

    public /* synthetic */ SubscriptionCancelledDetailsDto(ByteString byteString, Instant instant, DowngradeReasonDto downgradeReasonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? DowngradeReasonDto.INSTANCE.getZeroValue() : downgradeReasonDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionCancelledDetailsDto(ByteString subscription_id, Instant instant, DowngradeReasonDto downgrade_reason) {
        this(new Surrogate(subscription_id, instant, downgrade_reason));
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(downgrade_reason, "downgrade_reason");
    }

    public static /* synthetic */ SubscriptionCancelledDetailsDto copy$default(SubscriptionCancelledDetailsDto subscriptionCancelledDetailsDto, ByteString byteString, Instant instant, DowngradeReasonDto downgradeReasonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionCancelledDetailsDto.surrogate.getSubscription_id();
        }
        if ((i & 2) != 0) {
            instant = subscriptionCancelledDetailsDto.surrogate.getEnded_at();
        }
        if ((i & 4) != 0) {
            downgradeReasonDto = subscriptionCancelledDetailsDto.surrogate.getDowngrade_reason();
        }
        return subscriptionCancelledDetailsDto.copy(byteString, instant, downgradeReasonDto);
    }

    public final SubscriptionCancelledDetailsDto copy(ByteString subscription_id, Instant ended_at, DowngradeReasonDto downgrade_reason) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(downgrade_reason, "downgrade_reason");
        return new SubscriptionCancelledDetailsDto(new Surrogate(subscription_id, ended_at, downgrade_reason));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubscriptionCancelledDetails toProto() {
        return new SubscriptionCancelledDetails(this.surrogate.getSubscription_id(), this.surrogate.getEnded_at(), (SubscriptionCancelledDetails.DowngradeReason) this.surrogate.getDowngrade_reason().toProto(), null, 8, null);
    }

    public String toString() {
        return "[SubscriptionCancelledDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionCancelledDetailsDto) && Intrinsics.areEqual(((SubscriptionCancelledDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubscriptionCancelledDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BZ\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB9\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"Jc\u0010#\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052.\b\u0002\u0010\n\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001eRF\u0010\n\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010 R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\"¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "ended_at", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "downgrade_reason", "<init>", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "copy", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getSubscription_id", "getSubscription_id$annotations", "()V", "Lj$/time/Instant;", "getEnded_at", "getEnded_at$annotations", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "getDowngrade_reason", "getDowngrade_reason$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DowngradeReasonDto downgrade_reason;
        private final Instant ended_at;
        private final ByteString subscription_id;

        public Surrogate() {
            this((ByteString) null, (Instant) null, (DowngradeReasonDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, Instant instant, DowngradeReasonDto downgradeReasonDto, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.subscription_id;
            }
            if ((i & 2) != 0) {
                instant = surrogate.ended_at;
            }
            if ((i & 4) != 0) {
                downgradeReasonDto = surrogate.downgrade_reason;
            }
            return surrogate.copy(byteString, instant, downgradeReasonDto);
        }

        @SerialName("downgradeReason")
        @JsonAnnotations2(names = {"downgrade_reason"})
        public static /* synthetic */ void getDowngrade_reason$annotations() {
        }

        @SerialName("endedAt")
        @JsonAnnotations2(names = {"ended_at"})
        public static /* synthetic */ void getEnded_at$annotations() {
        }

        @SerialName("subscriptionId")
        @JsonAnnotations2(names = {"subscription_id"})
        public static /* synthetic */ void getSubscription_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getEnded_at() {
            return this.ended_at;
        }

        /* renamed from: component3, reason: from getter */
        public final DowngradeReasonDto getDowngrade_reason() {
            return this.downgrade_reason;
        }

        public final Surrogate copy(ByteString subscription_id, Instant ended_at, DowngradeReasonDto downgrade_reason) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            Intrinsics.checkNotNullParameter(downgrade_reason, "downgrade_reason");
            return new Surrogate(subscription_id, ended_at, downgrade_reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.subscription_id, surrogate.subscription_id) && Intrinsics.areEqual(this.ended_at, surrogate.ended_at) && this.downgrade_reason == surrogate.downgrade_reason;
        }

        public int hashCode() {
            int iHashCode = this.subscription_id.hashCode() * 31;
            Instant instant = this.ended_at;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.downgrade_reason.hashCode();
        }

        public String toString() {
            return "Surrogate(subscription_id=" + this.subscription_id + ", ended_at=" + this.ended_at + ", downgrade_reason=" + this.downgrade_reason + ")";
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionCancelledDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, Instant instant, DowngradeReasonDto downgradeReasonDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.subscription_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.ended_at = null;
            } else {
                this.ended_at = instant;
            }
            if ((i & 4) == 0) {
                this.downgrade_reason = DowngradeReasonDto.INSTANCE.getZeroValue();
            } else {
                this.downgrade_reason = downgradeReasonDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.subscription_id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.subscription_id);
            }
            Instant instant = self.ended_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.downgrade_reason != DowngradeReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, DowngradeReasonDto.Serializer.INSTANCE, self.downgrade_reason);
            }
        }

        public Surrogate(ByteString subscription_id, Instant instant, DowngradeReasonDto downgrade_reason) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            Intrinsics.checkNotNullParameter(downgrade_reason, "downgrade_reason");
            this.subscription_id = subscription_id;
            this.ended_at = instant;
            this.downgrade_reason = downgrade_reason;
        }

        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, Instant instant, DowngradeReasonDto downgradeReasonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? DowngradeReasonDto.INSTANCE.getZeroValue() : downgradeReasonDto);
        }

        public final Instant getEnded_at() {
            return this.ended_at;
        }

        public final DowngradeReasonDto getDowngrade_reason() {
            return this.downgrade_reason;
        }
    }

    /* compiled from: SubscriptionCancelledDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SubscriptionCancelledDetailsDto, SubscriptionCancelledDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionCancelledDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionCancelledDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionCancelledDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionCancelledDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionCancelledDetails> getProtoAdapter() {
            return SubscriptionCancelledDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionCancelledDetailsDto getZeroValue() {
            return SubscriptionCancelledDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionCancelledDetailsDto fromProto(SubscriptionCancelledDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SubscriptionCancelledDetailsDto(new Surrogate(proto.getSubscription_id(), proto.getEnded_at(), DowngradeReasonDto.INSTANCE.fromProto(proto.getDowngrade_reason())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionCancelledDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubscriptionCancelledDetailsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionCancelledDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "USER_INITIATED", "AUTO_DOWNGRADED", "AGENT_INITIATED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DowngradeReasonDto implements Dto2<SubscriptionCancelledDetails.DowngradeReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DowngradeReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DowngradeReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DowngradeReasonDto, SubscriptionCancelledDetails.DowngradeReason>> binaryBase64Serializer$delegate;
        public static final DowngradeReasonDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final DowngradeReasonDto USER_INITIATED = new USER_INITIATED("USER_INITIATED", 1);
        public static final DowngradeReasonDto AUTO_DOWNGRADED = new AUTO_DOWNGRADED("AUTO_DOWNGRADED", 2);
        public static final DowngradeReasonDto AGENT_INITIATED = new AGENT_INITIATED("AGENT_INITIATED", 3);

        private static final /* synthetic */ DowngradeReasonDto[] $values() {
            return new DowngradeReasonDto[]{UNSPECIFIED, USER_INITIATED, AUTO_DOWNGRADED, AGENT_INITIATED};
        }

        public /* synthetic */ DowngradeReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DowngradeReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DowngradeReasonDto(String str, int i) {
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto.DowngradeReasonDto.UNSPECIFIED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends DowngradeReasonDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionCancelledDetails.DowngradeReason toProto() {
                return SubscriptionCancelledDetails.DowngradeReason.UNSPECIFIED;
            }
        }

        static {
            DowngradeReasonDto[] downgradeReasonDtoArr$values = $values();
            $VALUES = downgradeReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(downgradeReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetailsDto$DowngradeReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptionCancelledDetailsDto.DowngradeReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto.DowngradeReasonDto.USER_INITIATED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER_INITIATED extends DowngradeReasonDto {
            USER_INITIATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionCancelledDetails.DowngradeReason toProto() {
                return SubscriptionCancelledDetails.DowngradeReason.USER_INITIATED;
            }
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto.DowngradeReasonDto.AUTO_DOWNGRADED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTO_DOWNGRADED extends DowngradeReasonDto {
            AUTO_DOWNGRADED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionCancelledDetails.DowngradeReason toProto() {
                return SubscriptionCancelledDetails.DowngradeReason.AUTO_DOWNGRADED;
            }
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto.DowngradeReasonDto.AGENT_INITIATED", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "toProto", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AGENT_INITIATED extends DowngradeReasonDto {
            AGENT_INITIATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SubscriptionCancelledDetails.DowngradeReason toProto() {
                return SubscriptionCancelledDetails.DowngradeReason.AGENT_INITIATED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetails$DowngradeReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DowngradeReasonDto, SubscriptionCancelledDetails.DowngradeReason> {

            /* compiled from: SubscriptionCancelledDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SubscriptionCancelledDetails.DowngradeReason.values().length];
                    try {
                        iArr[SubscriptionCancelledDetails.DowngradeReason.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SubscriptionCancelledDetails.DowngradeReason.USER_INITIATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SubscriptionCancelledDetails.DowngradeReason.AUTO_DOWNGRADED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SubscriptionCancelledDetails.DowngradeReason.AGENT_INITIATED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DowngradeReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DowngradeReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DowngradeReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) DowngradeReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SubscriptionCancelledDetails.DowngradeReason> getProtoAdapter() {
                return SubscriptionCancelledDetails.DowngradeReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DowngradeReasonDto getZeroValue() {
                return DowngradeReasonDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DowngradeReasonDto fromProto(SubscriptionCancelledDetails.DowngradeReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DowngradeReasonDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return DowngradeReasonDto.USER_INITIATED;
                }
                if (i == 3) {
                    return DowngradeReasonDto.AUTO_DOWNGRADED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return DowngradeReasonDto.AGENT_INITIATED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SubscriptionCancelledDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$DowngradeReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<DowngradeReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DowngradeReasonDto, SubscriptionCancelledDetails.DowngradeReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.SubscriptionCancelledDetails.DowngradeReason", DowngradeReasonDto.getEntries(), DowngradeReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DowngradeReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DowngradeReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DowngradeReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DowngradeReasonDto valueOf(String str) {
            return (DowngradeReasonDto) Enum.valueOf(DowngradeReasonDto.class, str);
        }

        public static DowngradeReasonDto[] values() {
            return (DowngradeReasonDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SubscriptionCancelledDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionCancelledDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionCancelledDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionCancelledDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionCancelledDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionCancelledDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionCancelledDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCancelledDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.SubscriptionCancelledDetailsDto";
        }
    }
}
