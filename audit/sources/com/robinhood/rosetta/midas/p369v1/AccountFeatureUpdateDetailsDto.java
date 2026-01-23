package com.robinhood.rosetta.midas.p369v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import rosetta.midas.p538v1.SubscriptionFeatures;
import rosetta.midas.p538v1.SubscriptionFeaturesDto;
import rosetta.midas.p538v1.UserProduct;
import rosetta.midas.p538v1.UserProductDto;

/* compiled from: AccountFeatureUpdateDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011JA\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;)V", "Lrosetta/midas/v1/SubscriptionFeaturesDto;", "account_subscription_features", "Lokio/ByteString;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "subscription_updated_at", "Lrosetta/midas/v1/UserProductDto;", "user_product", "(Lrosetta/midas/v1/SubscriptionFeaturesDto;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProductDto;)V", "copy", "(Lrosetta/midas/v1/SubscriptionFeaturesDto;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProductDto;)Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;", "getAccount_subscription_features", "()Lrosetta/midas/v1/SubscriptionFeaturesDto;", "getSubscription_id", "()Lokio/ByteString;", "getSubscription_updated_at", "()Lj$/time/Instant;", "getUser_product", "()Lrosetta/midas/v1/UserProductDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class AccountFeatureUpdateDetailsDto implements Dto3<AccountFeatureUpdateDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccountFeatureUpdateDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountFeatureUpdateDetailsDto, AccountFeatureUpdateDetails>> binaryBase64Serializer$delegate;
    private static final AccountFeatureUpdateDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AccountFeatureUpdateDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountFeatureUpdateDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SubscriptionFeaturesDto getAccount_subscription_features() {
        return this.surrogate.getAccount_subscription_features();
    }

    public final ByteString getSubscription_id() {
        return this.surrogate.getSubscription_id();
    }

    public final Instant getSubscription_updated_at() {
        return this.surrogate.getSubscription_updated_at();
    }

    public final UserProductDto getUser_product() {
        return this.surrogate.getUser_product();
    }

    public /* synthetic */ AccountFeatureUpdateDetailsDto(SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString byteString, Instant instant, UserProductDto userProductDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : subscriptionFeaturesDto, (i & 2) != 0 ? ByteString.EMPTY : byteString, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : userProductDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountFeatureUpdateDetailsDto(SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString subscription_id, Instant instant, UserProductDto userProductDto) {
        this(new Surrogate(subscriptionFeaturesDto, subscription_id, instant, userProductDto));
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
    }

    public static /* synthetic */ AccountFeatureUpdateDetailsDto copy$default(AccountFeatureUpdateDetailsDto accountFeatureUpdateDetailsDto, SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString byteString, Instant instant, UserProductDto userProductDto, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionFeaturesDto = accountFeatureUpdateDetailsDto.surrogate.getAccount_subscription_features();
        }
        if ((i & 2) != 0) {
            byteString = accountFeatureUpdateDetailsDto.surrogate.getSubscription_id();
        }
        if ((i & 4) != 0) {
            instant = accountFeatureUpdateDetailsDto.surrogate.getSubscription_updated_at();
        }
        if ((i & 8) != 0) {
            userProductDto = accountFeatureUpdateDetailsDto.surrogate.getUser_product();
        }
        return accountFeatureUpdateDetailsDto.copy(subscriptionFeaturesDto, byteString, instant, userProductDto);
    }

    public final AccountFeatureUpdateDetailsDto copy(SubscriptionFeaturesDto account_subscription_features, ByteString subscription_id, Instant subscription_updated_at, UserProductDto user_product) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        return new AccountFeatureUpdateDetailsDto(new Surrogate(account_subscription_features, subscription_id, subscription_updated_at, user_product));
    }

    @Override // com.robinhood.idl.Dto
    public AccountFeatureUpdateDetails toProto() {
        SubscriptionFeaturesDto account_subscription_features = this.surrogate.getAccount_subscription_features();
        SubscriptionFeatures proto = account_subscription_features != null ? account_subscription_features.toProto() : null;
        ByteString subscription_id = this.surrogate.getSubscription_id();
        Instant subscription_updated_at = this.surrogate.getSubscription_updated_at();
        UserProductDto user_product = this.surrogate.getUser_product();
        return new AccountFeatureUpdateDetails(proto, subscription_id, subscription_updated_at, user_product != null ? user_product.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[AccountFeatureUpdateDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AccountFeatureUpdateDetailsDto) && Intrinsics.areEqual(((AccountFeatureUpdateDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: AccountFeatureUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bh\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J6\u0010#\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&Jq\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00072.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010 R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\"RF\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010<\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010&¨\u0006A"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;", "", "Lrosetta/midas/v1/SubscriptionFeaturesDto;", "account_subscription_features", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "subscription_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "subscription_updated_at", "Lrosetta/midas/v1/UserProductDto;", "user_product", "<init>", "(Lrosetta/midas/v1/SubscriptionFeaturesDto;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProductDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/midas/v1/SubscriptionFeaturesDto;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProductDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lrosetta/midas/v1/SubscriptionFeaturesDto;", "component2", "()Lokio/ByteString;", "component3", "()Lj$/time/Instant;", "component4", "()Lrosetta/midas/v1/UserProductDto;", "copy", "(Lrosetta/midas/v1/SubscriptionFeaturesDto;Lokio/ByteString;Lj$/time/Instant;Lrosetta/midas/v1/UserProductDto;)Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/midas/v1/SubscriptionFeaturesDto;", "getAccount_subscription_features", "getAccount_subscription_features$annotations", "()V", "Lokio/ByteString;", "getSubscription_id", "getSubscription_id$annotations", "Lj$/time/Instant;", "getSubscription_updated_at", "getSubscription_updated_at$annotations", "Lrosetta/midas/v1/UserProductDto;", "getUser_product", "getUser_product$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SubscriptionFeaturesDto account_subscription_features;
        private final ByteString subscription_id;
        private final Instant subscription_updated_at;
        private final UserProductDto user_product;

        public Surrogate() {
            this((SubscriptionFeaturesDto) null, (ByteString) null, (Instant) null, (UserProductDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString byteString, Instant instant, UserProductDto userProductDto, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionFeaturesDto = surrogate.account_subscription_features;
            }
            if ((i & 2) != 0) {
                byteString = surrogate.subscription_id;
            }
            if ((i & 4) != 0) {
                instant = surrogate.subscription_updated_at;
            }
            if ((i & 8) != 0) {
                userProductDto = surrogate.user_product;
            }
            return surrogate.copy(subscriptionFeaturesDto, byteString, instant, userProductDto);
        }

        @SerialName("accountSubscriptionFeatures")
        @JsonAnnotations2(names = {"account_subscription_features"})
        public static /* synthetic */ void getAccount_subscription_features$annotations() {
        }

        @SerialName("subscriptionId")
        @JsonAnnotations2(names = {"subscription_id"})
        public static /* synthetic */ void getSubscription_id$annotations() {
        }

        @SerialName("subscriptionUpdatedAt")
        @JsonAnnotations2(names = {"subscription_updated_at"})
        public static /* synthetic */ void getSubscription_updated_at$annotations() {
        }

        @SerialName("userProduct")
        @JsonAnnotations2(names = {"user_product"})
        public static /* synthetic */ void getUser_product$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final SubscriptionFeaturesDto getAccount_subscription_features() {
            return this.account_subscription_features;
        }

        /* renamed from: component2, reason: from getter */
        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getSubscription_updated_at() {
            return this.subscription_updated_at;
        }

        /* renamed from: component4, reason: from getter */
        public final UserProductDto getUser_product() {
            return this.user_product;
        }

        public final Surrogate copy(SubscriptionFeaturesDto account_subscription_features, ByteString subscription_id, Instant subscription_updated_at, UserProductDto user_product) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            return new Surrogate(account_subscription_features, subscription_id, subscription_updated_at, user_product);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_subscription_features, surrogate.account_subscription_features) && Intrinsics.areEqual(this.subscription_id, surrogate.subscription_id) && Intrinsics.areEqual(this.subscription_updated_at, surrogate.subscription_updated_at) && Intrinsics.areEqual(this.user_product, surrogate.user_product);
        }

        public int hashCode() {
            SubscriptionFeaturesDto subscriptionFeaturesDto = this.account_subscription_features;
            int iHashCode = (((subscriptionFeaturesDto == null ? 0 : subscriptionFeaturesDto.hashCode()) * 31) + this.subscription_id.hashCode()) * 31;
            Instant instant = this.subscription_updated_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            UserProductDto userProductDto = this.user_product;
            return iHashCode2 + (userProductDto != null ? userProductDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_subscription_features=" + this.account_subscription_features + ", subscription_id=" + this.subscription_id + ", subscription_updated_at=" + this.subscription_updated_at + ", user_product=" + this.user_product + ")";
        }

        /* compiled from: AccountFeatureUpdateDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AccountFeatureUpdateDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString byteString, Instant instant, UserProductDto userProductDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_subscription_features = null;
            } else {
                this.account_subscription_features = subscriptionFeaturesDto;
            }
            if ((i & 2) == 0) {
                this.subscription_id = ByteString.EMPTY;
            } else {
                this.subscription_id = byteString;
            }
            if ((i & 4) == 0) {
                this.subscription_updated_at = null;
            } else {
                this.subscription_updated_at = instant;
            }
            if ((i & 8) == 0) {
                this.user_product = null;
            } else {
                this.user_product = userProductDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            SubscriptionFeaturesDto subscriptionFeaturesDto = self.account_subscription_features;
            if (subscriptionFeaturesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SubscriptionFeaturesDto.Serializer.INSTANCE, subscriptionFeaturesDto);
            }
            if (!Intrinsics.areEqual(self.subscription_id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 1, ByteStringSerializer.INSTANCE, self.subscription_id);
            }
            Instant instant = self.subscription_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            UserProductDto userProductDto = self.user_product;
            if (userProductDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, UserProductDto.Serializer.INSTANCE, userProductDto);
            }
        }

        public Surrogate(SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString subscription_id, Instant instant, UserProductDto userProductDto) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            this.account_subscription_features = subscriptionFeaturesDto;
            this.subscription_id = subscription_id;
            this.subscription_updated_at = instant;
            this.user_product = userProductDto;
        }

        public final SubscriptionFeaturesDto getAccount_subscription_features() {
            return this.account_subscription_features;
        }

        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        public /* synthetic */ Surrogate(SubscriptionFeaturesDto subscriptionFeaturesDto, ByteString byteString, Instant instant, UserProductDto userProductDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : subscriptionFeaturesDto, (i & 2) != 0 ? ByteString.EMPTY : byteString, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : userProductDto);
        }

        public final Instant getSubscription_updated_at() {
            return this.subscription_updated_at;
        }

        public final UserProductDto getUser_product() {
            return this.user_product;
        }
    }

    /* compiled from: AccountFeatureUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AccountFeatureUpdateDetailsDto, AccountFeatureUpdateDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountFeatureUpdateDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountFeatureUpdateDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountFeatureUpdateDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountFeatureUpdateDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountFeatureUpdateDetails> getProtoAdapter() {
            return AccountFeatureUpdateDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountFeatureUpdateDetailsDto getZeroValue() {
            return AccountFeatureUpdateDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountFeatureUpdateDetailsDto fromProto(AccountFeatureUpdateDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SubscriptionFeatures account_subscription_features = proto.getAccount_subscription_features();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SubscriptionFeaturesDto subscriptionFeaturesDtoFromProto = account_subscription_features != null ? SubscriptionFeaturesDto.INSTANCE.fromProto(account_subscription_features) : null;
            ByteString subscription_id = proto.getSubscription_id();
            Instant subscription_updated_at = proto.getSubscription_updated_at();
            UserProduct user_product = proto.getUser_product();
            return new AccountFeatureUpdateDetailsDto(new Surrogate(subscriptionFeaturesDtoFromProto, subscription_id, subscription_updated_at, user_product != null ? UserProductDto.INSTANCE.fromProto(user_product) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.AccountFeatureUpdateDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountFeatureUpdateDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AccountFeatureUpdateDetailsDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountFeatureUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AccountFeatureUpdateDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.AccountFeatureUpdateDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountFeatureUpdateDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AccountFeatureUpdateDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AccountFeatureUpdateDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AccountFeatureUpdateDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/AccountFeatureUpdateDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.AccountFeatureUpdateDetailsDto";
        }
    }
}
