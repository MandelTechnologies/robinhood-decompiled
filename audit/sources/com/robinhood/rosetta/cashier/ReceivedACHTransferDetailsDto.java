package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.cashier.ReceivedACHTransferDetails;
import com.robinhood.rosetta.cashier.ReceivedACHTransferDetailsDto;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: ReceivedACHTransferDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\b\u0007\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006XWYZ[\\B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bë\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!\u0012\u0010\b\u0002\u0010#\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\b\b\u0002\u0010%\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010&Jï\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u0010\b\u0002\u0010#\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000201H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000201H\u0016¢\u0006\u0004\b:\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bB\u0010,R\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bC\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bF\u0010ER\u0011\u0010\u0014\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bG\u0010,R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010KR\u0011\u0010\u001b\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bN\u0010KR\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bO\u0010,R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bP\u0010,R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bQ\u0010ER\u0019\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0019\u0010#\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8F¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0011\u0010$\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bU\u0010,R\u0011\u0010%\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bV\u0010,¨\u0006]"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;)V", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "direction", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "", "originator_name", "description", "Lcom/robinhood/rosetta/common/DateDto;", "received_date", "effective_date", "receiver_rh_account_type", "Lokio/ByteString;", "dd_relationship_id", "grant_date", "", "is_redirected", "", "number_of_days_since_rhy_migration", "has_noc", "rejected_reason", "name_at_originator", "returned_date", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "settled_at", "created_at", "receiving_account_id", "originating_account_id", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;", "getDirection", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "getState", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getOriginator_name", "getDescription", "getReceived_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getEffective_date", "getReceiver_rh_account_type", "getDd_relationship_id", "()Lokio/ByteString;", "getGrant_date", "()Z", "getNumber_of_days_since_rhy_migration", "()J", "getHas_noc", "getRejected_reason", "getName_at_originator", "getReturned_date", "getSettled_at", "()Lj$/time/Instant;", "getCreated_at", "getReceiving_account_id", "getOriginating_account_id", "Companion", "Surrogate", "DirectionDto", "StateDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ReceivedACHTransferDetailsDto implements Dto3<ReceivedACHTransferDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReceivedACHTransferDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReceivedACHTransferDetailsDto, ReceivedACHTransferDetails>> binaryBase64Serializer$delegate;
    private static final ReceivedACHTransferDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReceivedACHTransferDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReceivedACHTransferDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getOriginator_name() {
        return this.surrogate.getOriginator_name();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final DateDto getReceived_date() {
        return this.surrogate.getReceived_date();
    }

    public final DateDto getEffective_date() {
        return this.surrogate.getEffective_date();
    }

    public final String getReceiver_rh_account_type() {
        return this.surrogate.getReceiver_rh_account_type();
    }

    public final ByteString getDd_relationship_id() {
        return this.surrogate.getDd_relationship_id();
    }

    public final DateDto getGrant_date() {
        return this.surrogate.getGrant_date();
    }

    public final boolean is_redirected() {
        return this.surrogate.is_redirected();
    }

    public final long getNumber_of_days_since_rhy_migration() {
        return this.surrogate.getNumber_of_days_since_rhy_migration();
    }

    public final boolean getHas_noc() {
        return this.surrogate.getHas_noc();
    }

    public final String getRejected_reason() {
        return this.surrogate.getRejected_reason();
    }

    public final String getName_at_originator() {
        return this.surrogate.getName_at_originator();
    }

    public final DateDto getReturned_date() {
        return this.surrogate.getReturned_date();
    }

    public final Instant getSettled_at() {
        return this.surrogate.getSettled_at();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getReceiving_account_id() {
        return this.surrogate.getReceiving_account_id();
    }

    public final String getOriginating_account_id() {
        return this.surrogate.getOriginating_account_id();
    }

    public /* synthetic */ ReceivedACHTransferDetailsDto(DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, String str, String str2, DateDto dateDto, DateDto dateDto2, String str3, ByteString byteString, DateDto dateDto3, boolean z, long j, boolean z2, String str4, String str5, DateDto dateDto4, Instant instant, Instant instant2, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 2) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : dateDto, (i & 64) != 0 ? null : dateDto2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? ByteString.EMPTY : byteString, (i & 512) != 0 ? null : dateDto3, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? 0L : j, (i & 4096) == 0 ? z2 : false, (i & 8192) != 0 ? "" : str4, (i & 16384) != 0 ? "" : str5, (i & 32768) != 0 ? null : dateDto4, (i & 65536) != 0 ? null : instant, (i & 131072) != 0 ? null : instant2, (i & 262144) != 0 ? "" : str6, (i & 524288) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReceivedACHTransferDetailsDto(DirectionDto direction, StateDto state, MoneyDto moneyDto, String originator_name, String description, DateDto dateDto, DateDto dateDto2, String receiver_rh_account_type, ByteString dd_relationship_id, DateDto dateDto3, boolean z, long j, boolean z2, String rejected_reason, String name_at_originator, DateDto dateDto4, Instant instant, Instant instant2, String receiving_account_id, String originating_account_id) {
        this(new Surrogate(direction, state, moneyDto, originator_name, description, dateDto, dateDto2, receiver_rh_account_type, dd_relationship_id, dateDto3, z, j, z2, rejected_reason, name_at_originator, dateDto4, instant, instant2, receiving_account_id, originating_account_id));
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(originator_name, "originator_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(receiver_rh_account_type, "receiver_rh_account_type");
        Intrinsics.checkNotNullParameter(dd_relationship_id, "dd_relationship_id");
        Intrinsics.checkNotNullParameter(rejected_reason, "rejected_reason");
        Intrinsics.checkNotNullParameter(name_at_originator, "name_at_originator");
        Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
        Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
    }

    public static /* synthetic */ ReceivedACHTransferDetailsDto copy$default(ReceivedACHTransferDetailsDto receivedACHTransferDetailsDto, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, String str, String str2, DateDto dateDto, DateDto dateDto2, String str3, ByteString byteString, DateDto dateDto3, boolean z, long j, boolean z2, String str4, String str5, DateDto dateDto4, Instant instant, Instant instant2, String str6, String str7, int i, Object obj) {
        String originating_account_id;
        String str8;
        DirectionDto direction = (i & 1) != 0 ? receivedACHTransferDetailsDto.surrogate.getDirection() : directionDto;
        StateDto state = (i & 2) != 0 ? receivedACHTransferDetailsDto.surrogate.getState() : stateDto;
        MoneyDto amount = (i & 4) != 0 ? receivedACHTransferDetailsDto.surrogate.getAmount() : moneyDto;
        String originator_name = (i & 8) != 0 ? receivedACHTransferDetailsDto.surrogate.getOriginator_name() : str;
        String description = (i & 16) != 0 ? receivedACHTransferDetailsDto.surrogate.getDescription() : str2;
        DateDto received_date = (i & 32) != 0 ? receivedACHTransferDetailsDto.surrogate.getReceived_date() : dateDto;
        DateDto effective_date = (i & 64) != 0 ? receivedACHTransferDetailsDto.surrogate.getEffective_date() : dateDto2;
        String receiver_rh_account_type = (i & 128) != 0 ? receivedACHTransferDetailsDto.surrogate.getReceiver_rh_account_type() : str3;
        ByteString dd_relationship_id = (i & 256) != 0 ? receivedACHTransferDetailsDto.surrogate.getDd_relationship_id() : byteString;
        DateDto grant_date = (i & 512) != 0 ? receivedACHTransferDetailsDto.surrogate.getGrant_date() : dateDto3;
        boolean zIs_redirected = (i & 1024) != 0 ? receivedACHTransferDetailsDto.surrogate.is_redirected() : z;
        long number_of_days_since_rhy_migration = (i & 2048) != 0 ? receivedACHTransferDetailsDto.surrogate.getNumber_of_days_since_rhy_migration() : j;
        boolean has_noc = (i & 4096) != 0 ? receivedACHTransferDetailsDto.surrogate.getHas_noc() : z2;
        DirectionDto directionDto2 = direction;
        String rejected_reason = (i & 8192) != 0 ? receivedACHTransferDetailsDto.surrogate.getRejected_reason() : str4;
        String name_at_originator = (i & 16384) != 0 ? receivedACHTransferDetailsDto.surrogate.getName_at_originator() : str5;
        DateDto returned_date = (i & 32768) != 0 ? receivedACHTransferDetailsDto.surrogate.getReturned_date() : dateDto4;
        Instant settled_at = (i & 65536) != 0 ? receivedACHTransferDetailsDto.surrogate.getSettled_at() : instant;
        Instant created_at = (i & 131072) != 0 ? receivedACHTransferDetailsDto.surrogate.getCreated_at() : instant2;
        String receiving_account_id = (i & 262144) != 0 ? receivedACHTransferDetailsDto.surrogate.getReceiving_account_id() : str6;
        if ((i & 524288) != 0) {
            str8 = receiving_account_id;
            originating_account_id = receivedACHTransferDetailsDto.surrogate.getOriginating_account_id();
        } else {
            originating_account_id = str7;
            str8 = receiving_account_id;
        }
        return receivedACHTransferDetailsDto.copy(directionDto2, state, amount, originator_name, description, received_date, effective_date, receiver_rh_account_type, dd_relationship_id, grant_date, zIs_redirected, number_of_days_since_rhy_migration, has_noc, rejected_reason, name_at_originator, returned_date, settled_at, created_at, str8, originating_account_id);
    }

    public final ReceivedACHTransferDetailsDto copy(DirectionDto direction, StateDto state, MoneyDto amount, String originator_name, String description, DateDto received_date, DateDto effective_date, String receiver_rh_account_type, ByteString dd_relationship_id, DateDto grant_date, boolean is_redirected, long number_of_days_since_rhy_migration, boolean has_noc, String rejected_reason, String name_at_originator, DateDto returned_date, Instant settled_at, Instant created_at, String receiving_account_id, String originating_account_id) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(originator_name, "originator_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(receiver_rh_account_type, "receiver_rh_account_type");
        Intrinsics.checkNotNullParameter(dd_relationship_id, "dd_relationship_id");
        Intrinsics.checkNotNullParameter(rejected_reason, "rejected_reason");
        Intrinsics.checkNotNullParameter(name_at_originator, "name_at_originator");
        Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
        Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
        return new ReceivedACHTransferDetailsDto(new Surrogate(direction, state, amount, originator_name, description, received_date, effective_date, receiver_rh_account_type, dd_relationship_id, grant_date, is_redirected, number_of_days_since_rhy_migration, has_noc, rejected_reason, name_at_originator, returned_date, settled_at, created_at, receiving_account_id, originating_account_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ReceivedACHTransferDetails toProto() {
        ReceivedACHTransferDetails.Direction direction = (ReceivedACHTransferDetails.Direction) this.surrogate.getDirection().toProto();
        ReceivedACHTransferDetails.State state = (ReceivedACHTransferDetails.State) this.surrogate.getState().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        String originator_name = this.surrogate.getOriginator_name();
        String description = this.surrogate.getDescription();
        DateDto received_date = this.surrogate.getReceived_date();
        Date proto2 = received_date != null ? received_date.toProto() : null;
        DateDto effective_date = this.surrogate.getEffective_date();
        Date proto3 = effective_date != null ? effective_date.toProto() : null;
        String receiver_rh_account_type = this.surrogate.getReceiver_rh_account_type();
        ByteString dd_relationship_id = this.surrogate.getDd_relationship_id();
        DateDto grant_date = this.surrogate.getGrant_date();
        Date proto4 = grant_date != null ? grant_date.toProto() : null;
        boolean zIs_redirected = this.surrogate.is_redirected();
        long number_of_days_since_rhy_migration = this.surrogate.getNumber_of_days_since_rhy_migration();
        boolean has_noc = this.surrogate.getHas_noc();
        String rejected_reason = this.surrogate.getRejected_reason();
        String name_at_originator = this.surrogate.getName_at_originator();
        DateDto returned_date = this.surrogate.getReturned_date();
        return new ReceivedACHTransferDetails(direction, state, proto, originator_name, description, proto2, proto3, receiver_rh_account_type, dd_relationship_id, proto4, zIs_redirected, number_of_days_since_rhy_migration, has_noc, rejected_reason, name_at_originator, returned_date != null ? returned_date.toProto() : null, this.surrogate.getSettled_at(), this.surrogate.getCreated_at(), this.surrogate.getReceiving_account_id(), this.surrogate.getOriginating_account_id(), null, 1048576, null);
    }

    public String toString() {
        return "[ReceivedACHTransferDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReceivedACHTransferDetailsDto) && Intrinsics.areEqual(((ReceivedACHTransferDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReceivedACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\\\b\u0083\b\u0018\u0000 \u008b\u00012\u00020\u0001:\u0004\u008c\u0001\u008b\u0001BÃ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0017¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012.\b\u0002\u0010!\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 \u0012.\b\u0002\u0010\"\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 \u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&BÝ\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b=\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bA\u0010<J\u001f\u0010B\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bD\u0010?J\u0010\u0010E\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00110\u0017¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0018HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bI\u0010FJ\u0010\u0010J\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bJ\u0010<J\u0010\u0010K\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bK\u0010<J\u0012\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bL\u0010?J6\u0010M\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 HÆ\u0003¢\u0006\u0004\bM\u0010NJ6\u0010O\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 HÆ\u0003¢\u0006\u0004\bO\u0010NJ\u0010\u0010P\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bP\u0010<J\u0010\u0010Q\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bQ\u0010<JÌ\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0017\b\u0002\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\b\u0002\u0010\u0019\u001a\u00110\u0017¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2.\b\u0002\u0010!\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 2.\b\u0002\u0010\"\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\bHÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bT\u0010<J\u0010\u0010U\u001a\u00020'HÖ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010X\u001a\u00020\u00152\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bX\u0010YR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010Z\u0012\u0004\b\\\u0010]\u001a\u0004\b[\u00106R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010^\u0012\u0004\b`\u0010]\u001a\u0004\b_\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010a\u0012\u0004\bc\u0010]\u001a\u0004\bb\u0010:R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010d\u0012\u0004\bf\u0010]\u001a\u0004\be\u0010<R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010d\u0012\u0004\bh\u0010]\u001a\u0004\bg\u0010<R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010i\u0012\u0004\bk\u0010]\u001a\u0004\bj\u0010?R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010i\u0012\u0004\bm\u0010]\u001a\u0004\bl\u0010?R \u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010d\u0012\u0004\bo\u0010]\u001a\u0004\bn\u0010<R/\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010p\u0012\u0004\br\u0010]\u001a\u0004\bq\u0010CR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010i\u0012\u0004\bt\u0010]\u001a\u0004\bs\u0010?R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010u\u0012\u0004\bv\u0010]\u001a\u0004\b\u0016\u0010FR/\u0010\u0019\u001a\u00110\u0017¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010w\u0012\u0004\by\u0010]\u001a\u0004\bx\u0010HR \u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010u\u0012\u0004\b{\u0010]\u001a\u0004\bz\u0010FR \u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010d\u0012\u0004\b}\u0010]\u001a\u0004\b|\u0010<R \u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010d\u0012\u0004\b\u007f\u0010]\u001a\u0004\b~\u0010<R$\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010i\u0012\u0005\b\u0081\u0001\u0010]\u001a\u0005\b\u0080\u0001\u0010?RI\u0010!\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b!\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010]\u001a\u0005\b\u0083\u0001\u0010NRI\u0010\"\u001a(\u0018\u00010\u001ej\u0013\u0018\u0001`\u001f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0 8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0082\u0001\u0012\u0005\b\u0086\u0001\u0010]\u001a\u0005\b\u0085\u0001\u0010NR\"\u0010#\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b#\u0010d\u0012\u0005\b\u0088\u0001\u0010]\u001a\u0005\b\u0087\u0001\u0010<R\"\u0010$\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010d\u0012\u0005\b\u008a\u0001\u0010]\u001a\u0005\b\u0089\u0001\u0010<¨\u0006\u008d\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;", "", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "direction", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "", "originator_name", "description", "Lcom/robinhood/rosetta/common/DateDto;", "received_date", "effective_date", "receiver_rh_account_type", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "dd_relationship_id", "grant_date", "", "is_redirected", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "number_of_days_since_rhy_migration", "has_noc", "rejected_reason", "name_at_originator", "returned_date", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "settled_at", "created_at", "receiving_account_id", "originating_account_id", "<init>", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "component2", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "component3", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/robinhood/rosetta/common/DateDto;", "component7", "component8", "component9", "()Lokio/ByteString;", "component10", "component11", "()Z", "component12", "()J", "component13", "component14", "component15", "component16", "component17", "()Lj$/time/Instant;", "component18", "component19", "component20", "copy", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "getDirection", "getDirection$annotations", "()V", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "getState", "getState$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "getAmount$annotations", "Ljava/lang/String;", "getOriginator_name", "getOriginator_name$annotations", "getDescription", "getDescription$annotations", "Lcom/robinhood/rosetta/common/DateDto;", "getReceived_date", "getReceived_date$annotations", "getEffective_date", "getEffective_date$annotations", "getReceiver_rh_account_type", "getReceiver_rh_account_type$annotations", "Lokio/ByteString;", "getDd_relationship_id", "getDd_relationship_id$annotations", "getGrant_date", "getGrant_date$annotations", "Z", "is_redirected$annotations", "J", "getNumber_of_days_since_rhy_migration", "getNumber_of_days_since_rhy_migration$annotations", "getHas_noc", "getHas_noc$annotations", "getRejected_reason", "getRejected_reason$annotations", "getName_at_originator", "getName_at_originator$annotations", "getReturned_date", "getReturned_date$annotations", "Lj$/time/Instant;", "getSettled_at", "getSettled_at$annotations", "getCreated_at", "getCreated_at$annotations", "getReceiving_account_id", "getReceiving_account_id$annotations", "getOriginating_account_id", "getOriginating_account_id$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final Instant created_at;
        private final ByteString dd_relationship_id;
        private final String description;
        private final DirectionDto direction;
        private final DateDto effective_date;
        private final DateDto grant_date;
        private final boolean has_noc;
        private final boolean is_redirected;
        private final String name_at_originator;
        private final long number_of_days_since_rhy_migration;
        private final String originating_account_id;
        private final String originator_name;
        private final DateDto received_date;
        private final String receiver_rh_account_type;
        private final String receiving_account_id;
        private final String rejected_reason;
        private final DateDto returned_date;
        private final Instant settled_at;
        private final StateDto state;

        public Surrogate() {
            this((DirectionDto) null, (StateDto) null, (MoneyDto) null, (String) null, (String) null, (DateDto) null, (DateDto) null, (String) null, (ByteString) null, (DateDto) null, false, 0L, false, (String) null, (String) null, (DateDto) null, (Instant) null, (Instant) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, String str, String str2, DateDto dateDto, DateDto dateDto2, String str3, ByteString byteString, DateDto dateDto3, boolean z, long j, boolean z2, String str4, String str5, DateDto dateDto4, Instant instant, Instant instant2, String str6, String str7, int i, Object obj) {
            String str8;
            String str9;
            DirectionDto directionDto2 = (i & 1) != 0 ? surrogate.direction : directionDto;
            StateDto stateDto2 = (i & 2) != 0 ? surrogate.state : stateDto;
            MoneyDto moneyDto2 = (i & 4) != 0 ? surrogate.amount : moneyDto;
            String str10 = (i & 8) != 0 ? surrogate.originator_name : str;
            String str11 = (i & 16) != 0 ? surrogate.description : str2;
            DateDto dateDto5 = (i & 32) != 0 ? surrogate.received_date : dateDto;
            DateDto dateDto6 = (i & 64) != 0 ? surrogate.effective_date : dateDto2;
            String str12 = (i & 128) != 0 ? surrogate.receiver_rh_account_type : str3;
            ByteString byteString2 = (i & 256) != 0 ? surrogate.dd_relationship_id : byteString;
            DateDto dateDto7 = (i & 512) != 0 ? surrogate.grant_date : dateDto3;
            boolean z3 = (i & 1024) != 0 ? surrogate.is_redirected : z;
            long j2 = (i & 2048) != 0 ? surrogate.number_of_days_since_rhy_migration : j;
            boolean z4 = (i & 4096) != 0 ? surrogate.has_noc : z2;
            DirectionDto directionDto3 = directionDto2;
            String str13 = (i & 8192) != 0 ? surrogate.rejected_reason : str4;
            String str14 = (i & 16384) != 0 ? surrogate.name_at_originator : str5;
            DateDto dateDto8 = (i & 32768) != 0 ? surrogate.returned_date : dateDto4;
            Instant instant3 = (i & 65536) != 0 ? surrogate.settled_at : instant;
            Instant instant4 = (i & 131072) != 0 ? surrogate.created_at : instant2;
            String str15 = (i & 262144) != 0 ? surrogate.receiving_account_id : str6;
            if ((i & 524288) != 0) {
                str9 = str15;
                str8 = surrogate.originating_account_id;
            } else {
                str8 = str7;
                str9 = str15;
            }
            return surrogate.copy(directionDto3, stateDto2, moneyDto2, str10, str11, dateDto5, dateDto6, str12, byteString2, dateDto7, z3, j2, z4, str13, str14, dateDto8, instant3, instant4, str9, str8);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("ddRelationshipId")
        @JsonAnnotations2(names = {"dd_relationship_id"})
        public static /* synthetic */ void getDd_relationship_id$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("effectiveDate")
        @JsonAnnotations2(names = {"effective_date"})
        public static /* synthetic */ void getEffective_date$annotations() {
        }

        @SerialName("grantDate")
        @JsonAnnotations2(names = {"grant_date"})
        public static /* synthetic */ void getGrant_date$annotations() {
        }

        @SerialName("hasNoc")
        @JsonAnnotations2(names = {"has_noc"})
        public static /* synthetic */ void getHas_noc$annotations() {
        }

        @SerialName("nameAtOriginator")
        @JsonAnnotations2(names = {"name_at_originator"})
        public static /* synthetic */ void getName_at_originator$annotations() {
        }

        @SerialName("numberOfDaysSinceRhyMigration")
        @JsonAnnotations2(names = {"number_of_days_since_rhy_migration"})
        public static /* synthetic */ void getNumber_of_days_since_rhy_migration$annotations() {
        }

        @SerialName("originatingAccountId")
        @JsonAnnotations2(names = {"originating_account_id"})
        public static /* synthetic */ void getOriginating_account_id$annotations() {
        }

        @SerialName("originatorName")
        @JsonAnnotations2(names = {"originator_name"})
        public static /* synthetic */ void getOriginator_name$annotations() {
        }

        @SerialName("receivedDate")
        @JsonAnnotations2(names = {"received_date"})
        public static /* synthetic */ void getReceived_date$annotations() {
        }

        @SerialName("receiverRhAccountType")
        @JsonAnnotations2(names = {"receiver_rh_account_type"})
        public static /* synthetic */ void getReceiver_rh_account_type$annotations() {
        }

        @SerialName("receivingAccountId")
        @JsonAnnotations2(names = {"receiving_account_id"})
        public static /* synthetic */ void getReceiving_account_id$annotations() {
        }

        @SerialName("rejectedReason")
        @JsonAnnotations2(names = {"rejected_reason"})
        public static /* synthetic */ void getRejected_reason$annotations() {
        }

        @SerialName("returnedDate")
        @JsonAnnotations2(names = {"returned_date"})
        public static /* synthetic */ void getReturned_date$annotations() {
        }

        @SerialName("settledAt")
        @JsonAnnotations2(names = {"settled_at"})
        public static /* synthetic */ void getSettled_at$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("isRedirected")
        @JsonAnnotations2(names = {"is_redirected"})
        public static /* synthetic */ void is_redirected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component10, reason: from getter */
        public final DateDto getGrant_date() {
            return this.grant_date;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIs_redirected() {
            return this.is_redirected;
        }

        /* renamed from: component12, reason: from getter */
        public final long getNumber_of_days_since_rhy_migration() {
            return this.number_of_days_since_rhy_migration;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getHas_noc() {
            return this.has_noc;
        }

        /* renamed from: component14, reason: from getter */
        public final String getRejected_reason() {
            return this.rejected_reason;
        }

        /* renamed from: component15, reason: from getter */
        public final String getName_at_originator() {
            return this.name_at_originator;
        }

        /* renamed from: component16, reason: from getter */
        public final DateDto getReturned_date() {
            return this.returned_date;
        }

        /* renamed from: component17, reason: from getter */
        public final Instant getSettled_at() {
            return this.settled_at;
        }

        /* renamed from: component18, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component19, reason: from getter */
        public final String getReceiving_account_id() {
            return this.receiving_account_id;
        }

        /* renamed from: component2, reason: from getter */
        public final StateDto getState() {
            return this.state;
        }

        /* renamed from: component20, reason: from getter */
        public final String getOriginating_account_id() {
            return this.originating_account_id;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOriginator_name() {
            return this.originator_name;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final DateDto getReceived_date() {
            return this.received_date;
        }

        /* renamed from: component7, reason: from getter */
        public final DateDto getEffective_date() {
            return this.effective_date;
        }

        /* renamed from: component8, reason: from getter */
        public final String getReceiver_rh_account_type() {
            return this.receiver_rh_account_type;
        }

        /* renamed from: component9, reason: from getter */
        public final ByteString getDd_relationship_id() {
            return this.dd_relationship_id;
        }

        public final Surrogate copy(DirectionDto direction, StateDto state, MoneyDto amount, String originator_name, String description, DateDto received_date, DateDto effective_date, String receiver_rh_account_type, ByteString dd_relationship_id, DateDto grant_date, boolean is_redirected, long number_of_days_since_rhy_migration, boolean has_noc, String rejected_reason, String name_at_originator, DateDto returned_date, Instant settled_at, Instant created_at, String receiving_account_id, String originating_account_id) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(originator_name, "originator_name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(receiver_rh_account_type, "receiver_rh_account_type");
            Intrinsics.checkNotNullParameter(dd_relationship_id, "dd_relationship_id");
            Intrinsics.checkNotNullParameter(rejected_reason, "rejected_reason");
            Intrinsics.checkNotNullParameter(name_at_originator, "name_at_originator");
            Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
            Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
            return new Surrogate(direction, state, amount, originator_name, description, received_date, effective_date, receiver_rh_account_type, dd_relationship_id, grant_date, is_redirected, number_of_days_since_rhy_migration, has_noc, rejected_reason, name_at_originator, returned_date, settled_at, created_at, receiving_account_id, originating_account_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.direction == surrogate.direction && this.state == surrogate.state && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.originator_name, surrogate.originator_name) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.received_date, surrogate.received_date) && Intrinsics.areEqual(this.effective_date, surrogate.effective_date) && Intrinsics.areEqual(this.receiver_rh_account_type, surrogate.receiver_rh_account_type) && Intrinsics.areEqual(this.dd_relationship_id, surrogate.dd_relationship_id) && Intrinsics.areEqual(this.grant_date, surrogate.grant_date) && this.is_redirected == surrogate.is_redirected && this.number_of_days_since_rhy_migration == surrogate.number_of_days_since_rhy_migration && this.has_noc == surrogate.has_noc && Intrinsics.areEqual(this.rejected_reason, surrogate.rejected_reason) && Intrinsics.areEqual(this.name_at_originator, surrogate.name_at_originator) && Intrinsics.areEqual(this.returned_date, surrogate.returned_date) && Intrinsics.areEqual(this.settled_at, surrogate.settled_at) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.receiving_account_id, surrogate.receiving_account_id) && Intrinsics.areEqual(this.originating_account_id, surrogate.originating_account_id);
        }

        public int hashCode() {
            int iHashCode = ((this.direction.hashCode() * 31) + this.state.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.originator_name.hashCode()) * 31) + this.description.hashCode()) * 31;
            DateDto dateDto = this.received_date;
            int iHashCode3 = (iHashCode2 + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            DateDto dateDto2 = this.effective_date;
            int iHashCode4 = (((((iHashCode3 + (dateDto2 == null ? 0 : dateDto2.hashCode())) * 31) + this.receiver_rh_account_type.hashCode()) * 31) + this.dd_relationship_id.hashCode()) * 31;
            DateDto dateDto3 = this.grant_date;
            int iHashCode5 = (((((((((((iHashCode4 + (dateDto3 == null ? 0 : dateDto3.hashCode())) * 31) + Boolean.hashCode(this.is_redirected)) * 31) + Long.hashCode(this.number_of_days_since_rhy_migration)) * 31) + Boolean.hashCode(this.has_noc)) * 31) + this.rejected_reason.hashCode()) * 31) + this.name_at_originator.hashCode()) * 31;
            DateDto dateDto4 = this.returned_date;
            int iHashCode6 = (iHashCode5 + (dateDto4 == null ? 0 : dateDto4.hashCode())) * 31;
            Instant instant = this.settled_at;
            int iHashCode7 = (iHashCode6 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.created_at;
            return ((((iHashCode7 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.receiving_account_id.hashCode()) * 31) + this.originating_account_id.hashCode();
        }

        public String toString() {
            return "Surrogate(direction=" + this.direction + ", state=" + this.state + ", amount=" + this.amount + ", originator_name=" + this.originator_name + ", description=" + this.description + ", received_date=" + this.received_date + ", effective_date=" + this.effective_date + ", receiver_rh_account_type=" + this.receiver_rh_account_type + ", dd_relationship_id=" + this.dd_relationship_id + ", grant_date=" + this.grant_date + ", is_redirected=" + this.is_redirected + ", number_of_days_since_rhy_migration=" + this.number_of_days_since_rhy_migration + ", has_noc=" + this.has_noc + ", rejected_reason=" + this.rejected_reason + ", name_at_originator=" + this.name_at_originator + ", returned_date=" + this.returned_date + ", settled_at=" + this.settled_at + ", created_at=" + this.created_at + ", receiving_account_id=" + this.receiving_account_id + ", originating_account_id=" + this.originating_account_id + ")";
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReceivedACHTransferDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, String str, String str2, DateDto dateDto, DateDto dateDto2, String str3, ByteString byteString, DateDto dateDto3, boolean z, long j, boolean z2, String str4, String str5, DateDto dateDto4, Instant instant, Instant instant2, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            this.direction = (i & 1) == 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto;
            if ((i & 2) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.originator_name = "";
            } else {
                this.originator_name = str;
            }
            if ((i & 16) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 32) == 0) {
                this.received_date = null;
            } else {
                this.received_date = dateDto;
            }
            if ((i & 64) == 0) {
                this.effective_date = null;
            } else {
                this.effective_date = dateDto2;
            }
            if ((i & 128) == 0) {
                this.receiver_rh_account_type = "";
            } else {
                this.receiver_rh_account_type = str3;
            }
            if ((i & 256) == 0) {
                this.dd_relationship_id = ByteString.EMPTY;
            } else {
                this.dd_relationship_id = byteString;
            }
            if ((i & 512) == 0) {
                this.grant_date = null;
            } else {
                this.grant_date = dateDto3;
            }
            if ((i & 1024) == 0) {
                this.is_redirected = false;
            } else {
                this.is_redirected = z;
            }
            if ((i & 2048) == 0) {
                this.number_of_days_since_rhy_migration = 0L;
            } else {
                this.number_of_days_since_rhy_migration = j;
            }
            if ((i & 4096) == 0) {
                this.has_noc = false;
            } else {
                this.has_noc = z2;
            }
            if ((i & 8192) == 0) {
                this.rejected_reason = "";
            } else {
                this.rejected_reason = str4;
            }
            if ((i & 16384) == 0) {
                this.name_at_originator = "";
            } else {
                this.name_at_originator = str5;
            }
            if ((32768 & i) == 0) {
                this.returned_date = null;
            } else {
                this.returned_date = dateDto4;
            }
            if ((65536 & i) == 0) {
                this.settled_at = null;
            } else {
                this.settled_at = instant;
            }
            if ((131072 & i) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant2;
            }
            if ((262144 & i) == 0) {
                this.receiving_account_id = "";
            } else {
                this.receiving_account_id = str6;
            }
            if ((i & 524288) == 0) {
                this.originating_account_id = "";
            } else {
                this.originating_account_id = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, StateDto.Serializer.INSTANCE, self.state);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.originator_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.originator_name);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 4, self.description);
            }
            DateDto dateDto = self.received_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, DateDto.Serializer.INSTANCE, dateDto);
            }
            DateDto dateDto2 = self.effective_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DateDto.Serializer.INSTANCE, dateDto2);
            }
            if (!Intrinsics.areEqual(self.receiver_rh_account_type, "")) {
                output.encodeStringElement(serialDesc, 7, self.receiver_rh_account_type);
            }
            if (!Intrinsics.areEqual(self.dd_relationship_id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 8, ByteStringSerializer.INSTANCE, self.dd_relationship_id);
            }
            DateDto dateDto3 = self.grant_date;
            if (dateDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DateDto.Serializer.INSTANCE, dateDto3);
            }
            boolean z = self.is_redirected;
            if (z) {
                output.encodeBooleanElement(serialDesc, 10, z);
            }
            long j = self.number_of_days_since_rhy_migration;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 11, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            boolean z2 = self.has_noc;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 12, z2);
            }
            if (!Intrinsics.areEqual(self.rejected_reason, "")) {
                output.encodeStringElement(serialDesc, 13, self.rejected_reason);
            }
            if (!Intrinsics.areEqual(self.name_at_originator, "")) {
                output.encodeStringElement(serialDesc, 14, self.name_at_originator);
            }
            DateDto dateDto4 = self.returned_date;
            if (dateDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, DateDto.Serializer.INSTANCE, dateDto4);
            }
            Instant instant = self.settled_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.created_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.receiving_account_id, "")) {
                output.encodeStringElement(serialDesc, 18, self.receiving_account_id);
            }
            if (Intrinsics.areEqual(self.originating_account_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 19, self.originating_account_id);
        }

        public Surrogate(DirectionDto direction, StateDto state, MoneyDto moneyDto, String originator_name, String description, DateDto dateDto, DateDto dateDto2, String receiver_rh_account_type, ByteString dd_relationship_id, DateDto dateDto3, boolean z, long j, boolean z2, String rejected_reason, String name_at_originator, DateDto dateDto4, Instant instant, Instant instant2, String receiving_account_id, String originating_account_id) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(originator_name, "originator_name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(receiver_rh_account_type, "receiver_rh_account_type");
            Intrinsics.checkNotNullParameter(dd_relationship_id, "dd_relationship_id");
            Intrinsics.checkNotNullParameter(rejected_reason, "rejected_reason");
            Intrinsics.checkNotNullParameter(name_at_originator, "name_at_originator");
            Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
            Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
            this.direction = direction;
            this.state = state;
            this.amount = moneyDto;
            this.originator_name = originator_name;
            this.description = description;
            this.received_date = dateDto;
            this.effective_date = dateDto2;
            this.receiver_rh_account_type = receiver_rh_account_type;
            this.dd_relationship_id = dd_relationship_id;
            this.grant_date = dateDto3;
            this.is_redirected = z;
            this.number_of_days_since_rhy_migration = j;
            this.has_noc = z2;
            this.rejected_reason = rejected_reason;
            this.name_at_originator = name_at_originator;
            this.returned_date = dateDto4;
            this.settled_at = instant;
            this.created_at = instant2;
            this.receiving_account_id = receiving_account_id;
            this.originating_account_id = originating_account_id;
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public /* synthetic */ Surrogate(DirectionDto directionDto, StateDto stateDto, MoneyDto moneyDto, String str, String str2, DateDto dateDto, DateDto dateDto2, String str3, ByteString byteString, DateDto dateDto3, boolean z, long j, boolean z2, String str4, String str5, DateDto dateDto4, Instant instant, Instant instant2, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 2) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : dateDto, (i & 64) != 0 ? null : dateDto2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? ByteString.EMPTY : byteString, (i & 512) != 0 ? null : dateDto3, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? 0L : j, (i & 4096) == 0 ? z2 : false, (i & 8192) != 0 ? "" : str4, (i & 16384) != 0 ? "" : str5, (i & 32768) != 0 ? null : dateDto4, (i & 65536) != 0 ? null : instant, (i & 131072) != 0 ? null : instant2, (i & 262144) != 0 ? "" : str6, (i & 524288) != 0 ? "" : str7);
        }

        public final StateDto getState() {
            return this.state;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final String getOriginator_name() {
            return this.originator_name;
        }

        public final String getDescription() {
            return this.description;
        }

        public final DateDto getReceived_date() {
            return this.received_date;
        }

        public final DateDto getEffective_date() {
            return this.effective_date;
        }

        public final String getReceiver_rh_account_type() {
            return this.receiver_rh_account_type;
        }

        public final ByteString getDd_relationship_id() {
            return this.dd_relationship_id;
        }

        public final DateDto getGrant_date() {
            return this.grant_date;
        }

        public final boolean is_redirected() {
            return this.is_redirected;
        }

        public final long getNumber_of_days_since_rhy_migration() {
            return this.number_of_days_since_rhy_migration;
        }

        public final boolean getHas_noc() {
            return this.has_noc;
        }

        public final String getRejected_reason() {
            return this.rejected_reason;
        }

        public final String getName_at_originator() {
            return this.name_at_originator;
        }

        public final DateDto getReturned_date() {
            return this.returned_date;
        }

        public final Instant getSettled_at() {
            return this.settled_at;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final String getReceiving_account_id() {
            return this.receiving_account_id;
        }

        public final String getOriginating_account_id() {
            return this.originating_account_id;
        }
    }

    /* compiled from: ReceivedACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ReceivedACHTransferDetailsDto, ReceivedACHTransferDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReceivedACHTransferDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReceivedACHTransferDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReceivedACHTransferDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ReceivedACHTransferDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReceivedACHTransferDetails> getProtoAdapter() {
            return ReceivedACHTransferDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReceivedACHTransferDetailsDto getZeroValue() {
            return ReceivedACHTransferDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReceivedACHTransferDetailsDto fromProto(ReceivedACHTransferDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DirectionDto directionDtoFromProto = DirectionDto.INSTANCE.fromProto(proto.getDirection());
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            String originator_name = proto.getOriginator_name();
            String description = proto.getDescription();
            Date received_date = proto.getReceived_date();
            DateDto dateDtoFromProto = received_date != null ? DateDto.INSTANCE.fromProto(received_date) : null;
            Date effective_date = proto.getEffective_date();
            DateDto dateDtoFromProto2 = effective_date != null ? DateDto.INSTANCE.fromProto(effective_date) : null;
            String receiver_rh_account_type = proto.getReceiver_rh_account_type();
            ByteString dd_relationship_id = proto.getDd_relationship_id();
            Date grant_date = proto.getGrant_date();
            DateDto dateDtoFromProto3 = grant_date != null ? DateDto.INSTANCE.fromProto(grant_date) : null;
            boolean is_redirected = proto.getIs_redirected();
            long number_of_days_since_rhy_migration = proto.getNumber_of_days_since_rhy_migration();
            boolean has_noc = proto.getHas_noc();
            String rejected_reason = proto.getRejected_reason();
            String name_at_originator = proto.getName_at_originator();
            Date returned_date = proto.getReturned_date();
            return new ReceivedACHTransferDetailsDto(new Surrogate(directionDtoFromProto, stateDtoFromProto, moneyDtoFromProto, originator_name, description, dateDtoFromProto, dateDtoFromProto2, receiver_rh_account_type, dd_relationship_id, dateDtoFromProto3, is_redirected, number_of_days_since_rhy_migration, has_noc, rejected_reason, name_at_originator, returned_date != null ? DateDto.INSTANCE.fromProto(returned_date) : null, proto.getSettled_at(), proto.getCreated_at(), proto.getReceiving_account_id(), proto.getOriginating_account_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ReceivedACHTransferDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReceivedACHTransferDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ReceivedACHTransferDetailsDto(null, null, null, null, null, null, null, null, null, null, false, 0L, false, null, null, null, null, null, null, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_UNSPECIFIED", "CREDIT", "DEBIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectionDto implements Dto2<ReceivedACHTransferDetails.Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DirectionDto, ReceivedACHTransferDetails.Direction>> binaryBase64Serializer$delegate;
        public static final DirectionDto DIRECTION_UNSPECIFIED = new DIRECTION_UNSPECIFIED("DIRECTION_UNSPECIFIED", 0);
        public static final DirectionDto CREDIT = new CREDIT("CREDIT", 1);
        public static final DirectionDto DEBIT = new DEBIT("DEBIT", 2);

        private static final /* synthetic */ DirectionDto[] $values() {
            return new DirectionDto[]{DIRECTION_UNSPECIFIED, CREDIT, DEBIT};
        }

        public /* synthetic */ DirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DirectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.DirectionDto.DIRECTION_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECTION_UNSPECIFIED extends DirectionDto {
            DIRECTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.Direction toProto() {
                return ReceivedACHTransferDetails.Direction.DIRECTION_UNSPECIFIED;
            }
        }

        private DirectionDto(String str, int i) {
        }

        static {
            DirectionDto[] directionDtoArr$values = $values();
            $VALUES = directionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ReceivedACHTransferDetailsDto$DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReceivedACHTransferDetailsDto.DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.DirectionDto.CREDIT", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREDIT extends DirectionDto {
            CREDIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.Direction toProto() {
                return ReceivedACHTransferDetails.Direction.CREDIT;
            }
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.DirectionDto.DEBIT", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEBIT extends DirectionDto {
            DEBIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.Direction toProto() {
                return ReceivedACHTransferDetails.Direction.DEBIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectionDto, ReceivedACHTransferDetails.Direction> {

            /* compiled from: ReceivedACHTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ReceivedACHTransferDetails.Direction.values().length];
                    try {
                        iArr[ReceivedACHTransferDetails.Direction.DIRECTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.Direction.CREDIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.Direction.DEBIT.ordinal()] = 3;
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

            public final KSerializer<DirectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getBinaryBase64Serializer() {
                return (KSerializer) DirectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ReceivedACHTransferDetails.Direction> getProtoAdapter() {
                return ReceivedACHTransferDetails.Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto getZeroValue() {
                return DirectionDto.DIRECTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto fromProto(ReceivedACHTransferDetails.Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectionDto.DIRECTION_UNSPECIFIED;
                }
                if (i == 2) {
                    return DirectionDto.CREDIT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DirectionDto.DEBIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectionDto, ReceivedACHTransferDetails.Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ReceivedACHTransferDetails.Direction", DirectionDto.getEntries(), DirectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DirectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DirectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DirectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "RECEIVED", "REJECTED", "GRANTED", "SETTLED", "RETURNED", "REVERSED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<ReceivedACHTransferDetails.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, ReceivedACHTransferDetails.State>> binaryBase64Serializer$delegate;
        public static final StateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final StateDto RECEIVED = new RECEIVED("RECEIVED", 1);
        public static final StateDto REJECTED = new REJECTED("REJECTED", 2);
        public static final StateDto GRANTED = new GRANTED("GRANTED", 3);
        public static final StateDto SETTLED = new SETTLED("SETTLED", 4);
        public static final StateDto RETURNED = new RETURNED("RETURNED", 5);
        public static final StateDto REVERSED = new REVERSED("REVERSED", 6);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{STATE_UNSPECIFIED, RECEIVED, REJECTED, GRANTED, SETTLED, RETURNED, REVERSED};
        }

        public /* synthetic */ StateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends StateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.STATE_UNSPECIFIED;
            }
        }

        private StateDto(String str, int i) {
        }

        static {
            StateDto[] stateDtoArr$values = $values();
            $VALUES = stateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.ReceivedACHTransferDetailsDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReceivedACHTransferDetailsDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.RECEIVED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECEIVED extends StateDto {
            RECEIVED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.RECEIVED;
            }
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.REJECTED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends StateDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.REJECTED;
            }
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.GRANTED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRANTED extends StateDto {
            GRANTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.GRANTED;
            }
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.SETTLED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SETTLED extends StateDto {
            SETTLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.SETTLED;
            }
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.RETURNED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETURNED extends StateDto {
            RETURNED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.RETURNED;
            }
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto.StateDto.REVERSED", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVERSED extends StateDto {
            REVERSED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ReceivedACHTransferDetails.State toProto() {
                return ReceivedACHTransferDetails.State.REVERSED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, ReceivedACHTransferDetails.State> {

            /* compiled from: ReceivedACHTransferDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ReceivedACHTransferDetails.State.values().length];
                    try {
                        iArr[ReceivedACHTransferDetails.State.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.State.RECEIVED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.State.REJECTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.State.GRANTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.State.SETTLED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.State.RETURNED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ReceivedACHTransferDetails.State.REVERSED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getBinaryBase64Serializer() {
                return (KSerializer) StateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ReceivedACHTransferDetails.State> getProtoAdapter() {
                return ReceivedACHTransferDetails.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(ReceivedACHTransferDetails.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return StateDto.STATE_UNSPECIFIED;
                    case 2:
                        return StateDto.RECEIVED;
                    case 3:
                        return StateDto.REJECTED;
                    case 4:
                        return StateDto.GRANTED;
                    case 5:
                        return StateDto.SETTLED;
                    case 6:
                        return StateDto.RETURNED;
                    case 7:
                        return StateDto.REVERSED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ReceivedACHTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, ReceivedACHTransferDetails.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.ReceivedACHTransferDetails.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ReceivedACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ReceivedACHTransferDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.ReceivedACHTransferDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReceivedACHTransferDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReceivedACHTransferDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReceivedACHTransferDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReceivedACHTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.ReceivedACHTransferDetailsDto";
        }
    }
}
