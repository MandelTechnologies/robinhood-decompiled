package com.robinhood.rosetta.midas.p369v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: SubscriptionCreatedDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0015J]\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010\"R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010,R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;)V", "Lokio/ByteString;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/rosetta/common/DateDto;", "billing_start", "", "free_days", "", "charged_account", "plan_id", "promotion_name", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;)V", "copy", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;)Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;", "getSubscription_id", "()Lokio/ByteString;", "getCreated_at", "()Lj$/time/Instant;", "getBilling_start", "()Lcom/robinhood/rosetta/common/DateDto;", "getFree_days", "getCharged_account", "getPlan_id", "getPromotion_name", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SubscriptionCreatedDetailsDto implements Dto3<SubscriptionCreatedDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionCreatedDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionCreatedDetailsDto, SubscriptionCreatedDetails>> binaryBase64Serializer$delegate;
    private static final SubscriptionCreatedDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionCreatedDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionCreatedDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getSubscription_id() {
        return this.surrogate.getSubscription_id();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final DateDto getBilling_start() {
        return this.surrogate.getBilling_start();
    }

    public final int getFree_days() {
        return this.surrogate.getFree_days();
    }

    public final String getCharged_account() {
        return this.surrogate.getCharged_account();
    }

    public final ByteString getPlan_id() {
        return this.surrogate.getPlan_id();
    }

    public final String getPromotion_name() {
        return this.surrogate.getPromotion_name();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SubscriptionCreatedDetailsDto(okio.ByteString r2, p479j$.time.Instant r3, com.robinhood.rosetta.common.DateDto r4, int r5, java.lang.String r6, okio.ByteString r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            okio.ByteString r2 = okio.ByteString.EMPTY
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = 0
        L16:
            r10 = r9 & 16
            java.lang.String r0 = ""
            if (r10 == 0) goto L1d
            r6 = r0
        L1d:
            r10 = r9 & 32
            if (r10 == 0) goto L23
            okio.ByteString r7 = okio.ByteString.EMPTY
        L23:
            r9 = r9 & 64
            if (r9 == 0) goto L30
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L38
        L30:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.midas.p369v1.SubscriptionCreatedDetailsDto.<init>(okio.ByteString, j$.time.Instant, com.robinhood.rosetta.common.DateDto, int, java.lang.String, okio.ByteString, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionCreatedDetailsDto(ByteString subscription_id, Instant instant, DateDto dateDto, int i, String charged_account, ByteString plan_id, String promotion_name) {
        this(new Surrogate(subscription_id, instant, dateDto, i, charged_account, plan_id, promotion_name));
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(charged_account, "charged_account");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(promotion_name, "promotion_name");
    }

    public static /* synthetic */ SubscriptionCreatedDetailsDto copy$default(SubscriptionCreatedDetailsDto subscriptionCreatedDetailsDto, ByteString byteString, Instant instant, DateDto dateDto, int i, String str, ByteString byteString2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            byteString = subscriptionCreatedDetailsDto.surrogate.getSubscription_id();
        }
        if ((i2 & 2) != 0) {
            instant = subscriptionCreatedDetailsDto.surrogate.getCreated_at();
        }
        if ((i2 & 4) != 0) {
            dateDto = subscriptionCreatedDetailsDto.surrogate.getBilling_start();
        }
        if ((i2 & 8) != 0) {
            i = subscriptionCreatedDetailsDto.surrogate.getFree_days();
        }
        if ((i2 & 16) != 0) {
            str = subscriptionCreatedDetailsDto.surrogate.getCharged_account();
        }
        if ((i2 & 32) != 0) {
            byteString2 = subscriptionCreatedDetailsDto.surrogate.getPlan_id();
        }
        if ((i2 & 64) != 0) {
            str2 = subscriptionCreatedDetailsDto.surrogate.getPromotion_name();
        }
        ByteString byteString3 = byteString2;
        String str3 = str2;
        String str4 = str;
        DateDto dateDto2 = dateDto;
        return subscriptionCreatedDetailsDto.copy(byteString, instant, dateDto2, i, str4, byteString3, str3);
    }

    public final SubscriptionCreatedDetailsDto copy(ByteString subscription_id, Instant created_at, DateDto billing_start, int free_days, String charged_account, ByteString plan_id, String promotion_name) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(charged_account, "charged_account");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(promotion_name, "promotion_name");
        return new SubscriptionCreatedDetailsDto(new Surrogate(subscription_id, created_at, billing_start, free_days, charged_account, plan_id, promotion_name));
    }

    @Override // com.robinhood.idl.Dto
    public SubscriptionCreatedDetails toProto() {
        ByteString subscription_id = this.surrogate.getSubscription_id();
        Instant created_at = this.surrogate.getCreated_at();
        DateDto billing_start = this.surrogate.getBilling_start();
        return new SubscriptionCreatedDetails(subscription_id, created_at, billing_start != null ? billing_start.toProto() : null, this.surrogate.getFree_days(), this.surrogate.getCharged_account(), this.surrogate.getPlan_id(), this.surrogate.getPromotion_name(), null, 128, null);
    }

    public String toString() {
        return "[SubscriptionCreatedDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionCreatedDetailsDto) && Intrinsics.areEqual(((SubscriptionCreatedDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubscriptionCreatedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKB¢\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015B_\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00110\r¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010,J«\u0001\u0010/\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052.\b\u0002\u0010\n\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b1\u0010,J\u0010\u00102\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b2\u0010*J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010$RF\u0010\n\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010&R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010(R/\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010*R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010D\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010,R/\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00107\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010$R \u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010D\u0012\u0004\bJ\u0010:\u001a\u0004\bI\u0010,¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "Lcom/robinhood/rosetta/common/DateDto;", "billing_start", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "free_days", "", "charged_account", "plan_id", "promotion_name", "<init>", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/common/DateDto;", "component4", "()I", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(Lokio/ByteString;Lj$/time/Instant;Lcom/robinhood/rosetta/common/DateDto;ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;)Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getSubscription_id", "getSubscription_id$annotations", "()V", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "Lcom/robinhood/rosetta/common/DateDto;", "getBilling_start", "getBilling_start$annotations", "I", "getFree_days", "getFree_days$annotations", "Ljava/lang/String;", "getCharged_account", "getCharged_account$annotations", "getPlan_id", "getPlan_id$annotations", "getPromotion_name", "getPromotion_name$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DateDto billing_start;
        private final String charged_account;
        private final Instant created_at;
        private final int free_days;
        private final ByteString plan_id;
        private final String promotion_name;
        private final ByteString subscription_id;

        public Surrogate() {
            this((ByteString) null, (Instant) null, (DateDto) null, 0, (String) null, (ByteString) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, Instant instant, DateDto dateDto, int i, String str, ByteString byteString2, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                byteString = surrogate.subscription_id;
            }
            if ((i2 & 2) != 0) {
                instant = surrogate.created_at;
            }
            if ((i2 & 4) != 0) {
                dateDto = surrogate.billing_start;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.free_days;
            }
            if ((i2 & 16) != 0) {
                str = surrogate.charged_account;
            }
            if ((i2 & 32) != 0) {
                byteString2 = surrogate.plan_id;
            }
            if ((i2 & 64) != 0) {
                str2 = surrogate.promotion_name;
            }
            ByteString byteString3 = byteString2;
            String str3 = str2;
            String str4 = str;
            DateDto dateDto2 = dateDto;
            return surrogate.copy(byteString, instant, dateDto2, i, str4, byteString3, str3);
        }

        @SerialName("billingStart")
        @JsonAnnotations2(names = {"billing_start"})
        public static /* synthetic */ void getBilling_start$annotations() {
        }

        @SerialName("chargedAccount")
        @JsonAnnotations2(names = {"charged_account"})
        public static /* synthetic */ void getCharged_account$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("freeDays")
        @JsonAnnotations2(names = {"free_days"})
        public static /* synthetic */ void getFree_days$annotations() {
        }

        @SerialName("planId")
        @JsonAnnotations2(names = {"plan_id"})
        public static /* synthetic */ void getPlan_id$annotations() {
        }

        @SerialName("promotionName")
        @JsonAnnotations2(names = {"promotion_name"})
        public static /* synthetic */ void getPromotion_name$annotations() {
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
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component3, reason: from getter */
        public final DateDto getBilling_start() {
            return this.billing_start;
        }

        /* renamed from: component4, reason: from getter */
        public final int getFree_days() {
            return this.free_days;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCharged_account() {
            return this.charged_account;
        }

        /* renamed from: component6, reason: from getter */
        public final ByteString getPlan_id() {
            return this.plan_id;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPromotion_name() {
            return this.promotion_name;
        }

        public final Surrogate copy(ByteString subscription_id, Instant created_at, DateDto billing_start, int free_days, String charged_account, ByteString plan_id, String promotion_name) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            Intrinsics.checkNotNullParameter(charged_account, "charged_account");
            Intrinsics.checkNotNullParameter(plan_id, "plan_id");
            Intrinsics.checkNotNullParameter(promotion_name, "promotion_name");
            return new Surrogate(subscription_id, created_at, billing_start, free_days, charged_account, plan_id, promotion_name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.subscription_id, surrogate.subscription_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.billing_start, surrogate.billing_start) && this.free_days == surrogate.free_days && Intrinsics.areEqual(this.charged_account, surrogate.charged_account) && Intrinsics.areEqual(this.plan_id, surrogate.plan_id) && Intrinsics.areEqual(this.promotion_name, surrogate.promotion_name);
        }

        public int hashCode() {
            int iHashCode = this.subscription_id.hashCode() * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            DateDto dateDto = this.billing_start;
            return ((((((((iHashCode2 + (dateDto != null ? dateDto.hashCode() : 0)) * 31) + Integer.hashCode(this.free_days)) * 31) + this.charged_account.hashCode()) * 31) + this.plan_id.hashCode()) * 31) + this.promotion_name.hashCode();
        }

        public String toString() {
            return "Surrogate(subscription_id=" + this.subscription_id + ", created_at=" + this.created_at + ", billing_start=" + this.billing_start + ", free_days=" + this.free_days + ", charged_account=" + this.charged_account + ", plan_id=" + this.plan_id + ", promotion_name=" + this.promotion_name + ")";
        }

        /* compiled from: SubscriptionCreatedDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionCreatedDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, Instant instant, DateDto dateDto, int i2, String str, ByteString byteString2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.subscription_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 4) == 0) {
                this.billing_start = null;
            } else {
                this.billing_start = dateDto;
            }
            if ((i & 8) == 0) {
                this.free_days = 0;
            } else {
                this.free_days = i2;
            }
            if ((i & 16) == 0) {
                this.charged_account = "";
            } else {
                this.charged_account = str;
            }
            if ((i & 32) == 0) {
                this.plan_id = ByteString.EMPTY;
            } else {
                this.plan_id = byteString2;
            }
            if ((i & 64) == 0) {
                this.promotion_name = "";
            } else {
                this.promotion_name = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.subscription_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.subscription_id);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            DateDto dateDto = self.billing_start;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DateDto.Serializer.INSTANCE, dateDto);
            }
            int i = self.free_days;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.charged_account, "")) {
                output.encodeStringElement(serialDesc, 4, self.charged_account);
            }
            if (!Intrinsics.areEqual(self.plan_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 5, ByteStringSerializer.INSTANCE, self.plan_id);
            }
            if (Intrinsics.areEqual(self.promotion_name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.promotion_name);
        }

        public Surrogate(ByteString subscription_id, Instant instant, DateDto dateDto, int i, String charged_account, ByteString plan_id, String promotion_name) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            Intrinsics.checkNotNullParameter(charged_account, "charged_account");
            Intrinsics.checkNotNullParameter(plan_id, "plan_id");
            Intrinsics.checkNotNullParameter(promotion_name, "promotion_name");
            this.subscription_id = subscription_id;
            this.created_at = instant;
            this.billing_start = dateDto;
            this.free_days = i;
            this.charged_account = charged_account;
            this.plan_id = plan_id;
            this.promotion_name = promotion_name;
        }

        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(okio.ByteString r2, p479j$.time.Instant r3, com.robinhood.rosetta.common.DateDto r4, int r5, java.lang.String r6, okio.ByteString r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                okio.ByteString r2 = okio.ByteString.EMPTY
            L6:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lc
                r3 = r0
            Lc:
                r10 = r9 & 4
                if (r10 == 0) goto L11
                r4 = r0
            L11:
                r10 = r9 & 8
                if (r10 == 0) goto L16
                r5 = 0
            L16:
                r10 = r9 & 16
                java.lang.String r0 = ""
                if (r10 == 0) goto L1d
                r6 = r0
            L1d:
                r10 = r9 & 32
                if (r10 == 0) goto L23
                okio.ByteString r7 = okio.ByteString.EMPTY
            L23:
                r9 = r9 & 64
                if (r9 == 0) goto L30
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L38
            L30:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.midas.p369v1.SubscriptionCreatedDetailsDto.Surrogate.<init>(okio.ByteString, j$.time.Instant, com.robinhood.rosetta.common.DateDto, int, java.lang.String, okio.ByteString, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final DateDto getBilling_start() {
            return this.billing_start;
        }

        public final int getFree_days() {
            return this.free_days;
        }

        public final String getCharged_account() {
            return this.charged_account;
        }

        public final ByteString getPlan_id() {
            return this.plan_id;
        }

        public final String getPromotion_name() {
            return this.promotion_name;
        }
    }

    /* compiled from: SubscriptionCreatedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubscriptionCreatedDetailsDto, SubscriptionCreatedDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionCreatedDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionCreatedDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionCreatedDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionCreatedDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionCreatedDetails> getProtoAdapter() {
            return SubscriptionCreatedDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionCreatedDetailsDto getZeroValue() {
            return SubscriptionCreatedDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionCreatedDetailsDto fromProto(SubscriptionCreatedDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString subscription_id = proto.getSubscription_id();
            Instant created_at = proto.getCreated_at();
            Date billing_start = proto.getBilling_start();
            return new SubscriptionCreatedDetailsDto(new Surrogate(subscription_id, created_at, billing_start != null ? DateDto.INSTANCE.fromProto(billing_start) : null, proto.getFree_days(), proto.getCharged_account(), proto.getPlan_id(), proto.getPromotion_name()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionCreatedDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionCreatedDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubscriptionCreatedDetailsDto(null, null, null, 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubscriptionCreatedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionCreatedDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionCreatedDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionCreatedDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionCreatedDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionCreatedDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionCreatedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionCreatedDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.SubscriptionCreatedDetailsDto";
        }
    }
}
