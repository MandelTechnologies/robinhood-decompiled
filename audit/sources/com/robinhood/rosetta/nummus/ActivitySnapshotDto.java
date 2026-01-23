package com.robinhood.rosetta.nummus;

import android.os.Parcel;
import android.os.Parcelable;
import cbc.service.p048v1.CbcTaxLotUpdateEvent;
import cbc.service.p048v1.CbcTaxLotUpdateEventDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.cbc.service.tax_lot.p283v1.OrderEarmarkRequest;
import com.robinhood.cbc.service.tax_lot.p283v1.OrderEarmarkRequestDto;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.common.RequestContext;
import com.robinhood.rosetta.common.RequestContextDto;
import com.robinhood.rosetta.nummus.ActivitySnapshot;
import com.robinhood.rosetta.nummus.ActivitySnapshotDto;
import com.robinhood.rosetta.nummus.AssetMigrationDetailsDto;
import com.robinhood.rosetta.nummus.CryptoOrderDetailsDto;
import com.robinhood.rosetta.nummus.CurrencyMovementDto;
import com.robinhood.rosetta.nummus.CurrencyPairDetailsDto;
import com.robinhood.rosetta.nummus.DepositStatusDetailsDto;
import com.robinhood.rosetta.nummus.NewAccountDetailsDto;
import com.robinhood.rosetta.nummus.PlaceCryptoOrderErrorDetailsDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;
import rosetta.nummus.AccountType;
import rosetta.nummus.AccountTypeDto;

/* compiled from: ActivitySnapshotDto.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 l2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007mlnopqrB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0006\u0010 J\u0097\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u00108R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0019\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b@\u0010&R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010\u001b\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010O\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010S\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010W\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0013\u0010[\u001a\u0004\u0018\u00010X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010_\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010c\u001a\u0004\u0018\u00010`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u0010g\u001a\u0004\u0018\u00010d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010k\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006s"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;)V", "Lokio/ByteString;", "object_id", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "context", "ordering_id", "", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "currency_movements", "Lcom/robinhood/rosetta/common/RequestContextDto;", "request_context", "Lrosetta/nummus/AccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "region", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Lokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContextDto;Lrosetta/nummus/AccountTypeDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;)V", "copy", "(Lokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContextDto;Lrosetta/nummus/AccountTypeDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;)Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto;", "toProto", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshot;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;", "getObject_id", "()Lokio/ByteString;", "getUser_id", "getAccount_number", "()J", "getType", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "getTimestamp", "()Lj$/time/Instant;", "getContext", "getOrdering_id", "getCurrency_movements", "()Ljava/util/List;", "getRequest_context", "()Lcom/robinhood/rosetta/common/RequestContextDto;", "getAccount_type", "()Lrosetta/nummus/AccountTypeDto;", "getRegion", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "getDetails", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "getCrypto_order_details", "()Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "crypto_order_details", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "currency_pair_details", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "getTax_lot_earmark_request", "()Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "tax_lot_earmark_request", "Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "getCbc_tax_lot_update_event", "()Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "cbc_tax_lot_update_event", "Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "getNew_account_details", "()Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "new_account_details", "Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "getDeposit_status_details", "()Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "deposit_status_details", "Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "getAsset_migration_details", "()Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "asset_migration_details", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "getPlace_crypto_order_error_details", "()Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "place_crypto_order_error_details", "Companion", "Surrogate", "DetailsDto", "TypeDto", "RegionDto", "Serializer", "MultibindingModule", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ActivitySnapshotDto implements Dto3<ActivitySnapshot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActivitySnapshotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActivitySnapshotDto, ActivitySnapshot>> binaryBase64Serializer$delegate;
    private static final ActivitySnapshotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActivitySnapshotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActivitySnapshotDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getObject_id() {
        return this.surrogate.getObject_id();
    }

    public final ByteString getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final long getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final TypeDto getType() {
        return this.surrogate.getType();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getContext() {
        return this.surrogate.getContext();
    }

    public final long getOrdering_id() {
        return this.surrogate.getOrdering_id();
    }

    public final List<CurrencyMovementDto> getCurrency_movements() {
        return this.surrogate.getCurrency_movements();
    }

    public final RequestContextDto getRequest_context() {
        return this.surrogate.getRequest_context();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final RegionDto getRegion() {
        return this.surrogate.getRegion();
    }

    public final DetailsDto getDetails() {
        if (this.surrogate.getCrypto_order_details() != null) {
            return new DetailsDto.CryptoOrderDetails(this.surrogate.getCrypto_order_details());
        }
        if (this.surrogate.getCurrency_pair_details() != null) {
            return new DetailsDto.CurrencyPairDetails(this.surrogate.getCurrency_pair_details());
        }
        if (this.surrogate.getTax_lot_earmark_request() != null) {
            return new DetailsDto.TaxLotEarmarkRequest(this.surrogate.getTax_lot_earmark_request());
        }
        if (this.surrogate.getCbc_tax_lot_update_event() != null) {
            return new DetailsDto.CbcTaxLotUpdateEvent(this.surrogate.getCbc_tax_lot_update_event());
        }
        if (this.surrogate.getNew_account_details() != null) {
            return new DetailsDto.NewAccountDetails(this.surrogate.getNew_account_details());
        }
        if (this.surrogate.getDeposit_status_details() != null) {
            return new DetailsDto.DepositStatusDetails(this.surrogate.getDeposit_status_details());
        }
        if (this.surrogate.getAsset_migration_details() != null) {
            return new DetailsDto.AssetMigrationDetails(this.surrogate.getAsset_migration_details());
        }
        if (this.surrogate.getPlace_crypto_order_error_details() != null) {
            return new DetailsDto.PlaceCryptoOrderErrorDetails(this.surrogate.getPlace_crypto_order_error_details());
        }
        return null;
    }

    public final CryptoOrderDetailsDto getCrypto_order_details() {
        return this.surrogate.getCrypto_order_details();
    }

    public final CurrencyPairDetailsDto getCurrency_pair_details() {
        return this.surrogate.getCurrency_pair_details();
    }

    public final OrderEarmarkRequestDto getTax_lot_earmark_request() {
        return this.surrogate.getTax_lot_earmark_request();
    }

    public final CbcTaxLotUpdateEventDto getCbc_tax_lot_update_event() {
        return this.surrogate.getCbc_tax_lot_update_event();
    }

    public final NewAccountDetailsDto getNew_account_details() {
        return this.surrogate.getNew_account_details();
    }

    public final DepositStatusDetailsDto getDeposit_status_details() {
        return this.surrogate.getDeposit_status_details();
    }

    public final AssetMigrationDetailsDto getAsset_migration_details() {
        return this.surrogate.getAsset_migration_details();
    }

    public final PlaceCryptoOrderErrorDetailsDto getPlace_crypto_order_error_details() {
        return this.surrogate.getPlace_crypto_order_error_details();
    }

    public /* synthetic */ ActivitySnapshotDto(ByteString byteString, ByteString byteString2, long j, TypeDto typeDto, Instant instant, String str, long j2, List list, RequestContextDto requestContextDto, AccountTypeDto accountTypeDto, RegionDto regionDto, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : requestContextDto, (i & 512) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 1024) != 0 ? RegionDto.INSTANCE.getZeroValue() : regionDto, (i & 2048) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySnapshotDto(ByteString object_id, ByteString user_id, long j, TypeDto type2, Instant instant, String context, long j2, List<CurrencyMovementDto> currency_movements, RequestContextDto requestContextDto, AccountTypeDto account_type, RegionDto region, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency_movements, "currency_movements");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(region, "region");
        DetailsDto.CryptoOrderDetails cryptoOrderDetails = detailsDto instanceof DetailsDto.CryptoOrderDetails ? (DetailsDto.CryptoOrderDetails) detailsDto : null;
        CryptoOrderDetailsDto value = cryptoOrderDetails != null ? cryptoOrderDetails.getValue() : null;
        DetailsDto.CurrencyPairDetails currencyPairDetails = detailsDto instanceof DetailsDto.CurrencyPairDetails ? (DetailsDto.CurrencyPairDetails) detailsDto : null;
        CurrencyPairDetailsDto value2 = currencyPairDetails != null ? currencyPairDetails.getValue() : null;
        DetailsDto.TaxLotEarmarkRequest taxLotEarmarkRequest = detailsDto instanceof DetailsDto.TaxLotEarmarkRequest ? (DetailsDto.TaxLotEarmarkRequest) detailsDto : null;
        OrderEarmarkRequestDto value3 = taxLotEarmarkRequest != null ? taxLotEarmarkRequest.getValue() : null;
        DetailsDto.CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent = detailsDto instanceof DetailsDto.CbcTaxLotUpdateEvent ? (DetailsDto.CbcTaxLotUpdateEvent) detailsDto : null;
        CbcTaxLotUpdateEventDto value4 = cbcTaxLotUpdateEvent != null ? cbcTaxLotUpdateEvent.getValue() : null;
        DetailsDto.NewAccountDetails newAccountDetails = detailsDto instanceof DetailsDto.NewAccountDetails ? (DetailsDto.NewAccountDetails) detailsDto : null;
        NewAccountDetailsDto value5 = newAccountDetails != null ? newAccountDetails.getValue() : null;
        DetailsDto.DepositStatusDetails depositStatusDetails = detailsDto instanceof DetailsDto.DepositStatusDetails ? (DetailsDto.DepositStatusDetails) detailsDto : null;
        DepositStatusDetailsDto value6 = depositStatusDetails != null ? depositStatusDetails.getValue() : null;
        DetailsDto.AssetMigrationDetails assetMigrationDetails = detailsDto instanceof DetailsDto.AssetMigrationDetails ? (DetailsDto.AssetMigrationDetails) detailsDto : null;
        AssetMigrationDetailsDto value7 = assetMigrationDetails != null ? assetMigrationDetails.getValue() : null;
        DetailsDto.PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails = detailsDto instanceof DetailsDto.PlaceCryptoOrderErrorDetails ? (DetailsDto.PlaceCryptoOrderErrorDetails) detailsDto : null;
        this(new Surrogate(object_id, user_id, j, type2, instant, context, j2, currency_movements, requestContextDto, account_type, region, value, value2, value3, value4, value5, value6, value7, placeCryptoOrderErrorDetails != null ? placeCryptoOrderErrorDetails.getValue() : null));
    }

    public final ActivitySnapshotDto copy(ByteString object_id, ByteString user_id, long account_number, TypeDto type2, Instant timestamp, String context, long ordering_id, List<CurrencyMovementDto> currency_movements, RequestContextDto request_context, AccountTypeDto account_type, RegionDto region, DetailsDto details) {
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency_movements, "currency_movements");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(region, "region");
        DetailsDto.CryptoOrderDetails cryptoOrderDetails = details instanceof DetailsDto.CryptoOrderDetails ? (DetailsDto.CryptoOrderDetails) details : null;
        CryptoOrderDetailsDto value = cryptoOrderDetails != null ? cryptoOrderDetails.getValue() : null;
        DetailsDto.CurrencyPairDetails currencyPairDetails = details instanceof DetailsDto.CurrencyPairDetails ? (DetailsDto.CurrencyPairDetails) details : null;
        CurrencyPairDetailsDto value2 = currencyPairDetails != null ? currencyPairDetails.getValue() : null;
        DetailsDto.TaxLotEarmarkRequest taxLotEarmarkRequest = details instanceof DetailsDto.TaxLotEarmarkRequest ? (DetailsDto.TaxLotEarmarkRequest) details : null;
        OrderEarmarkRequestDto value3 = taxLotEarmarkRequest != null ? taxLotEarmarkRequest.getValue() : null;
        DetailsDto.CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent = details instanceof DetailsDto.CbcTaxLotUpdateEvent ? (DetailsDto.CbcTaxLotUpdateEvent) details : null;
        CbcTaxLotUpdateEventDto value4 = cbcTaxLotUpdateEvent != null ? cbcTaxLotUpdateEvent.getValue() : null;
        DetailsDto.NewAccountDetails newAccountDetails = details instanceof DetailsDto.NewAccountDetails ? (DetailsDto.NewAccountDetails) details : null;
        NewAccountDetailsDto value5 = newAccountDetails != null ? newAccountDetails.getValue() : null;
        DetailsDto.DepositStatusDetails depositStatusDetails = details instanceof DetailsDto.DepositStatusDetails ? (DetailsDto.DepositStatusDetails) details : null;
        DepositStatusDetailsDto value6 = depositStatusDetails != null ? depositStatusDetails.getValue() : null;
        DetailsDto.AssetMigrationDetails assetMigrationDetails = details instanceof DetailsDto.AssetMigrationDetails ? (DetailsDto.AssetMigrationDetails) details : null;
        AssetMigrationDetailsDto value7 = assetMigrationDetails != null ? assetMigrationDetails.getValue() : null;
        DetailsDto.PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails = details instanceof DetailsDto.PlaceCryptoOrderErrorDetails ? (DetailsDto.PlaceCryptoOrderErrorDetails) details : null;
        return new ActivitySnapshotDto(new Surrogate(object_id, user_id, account_number, type2, timestamp, context, ordering_id, currency_movements, request_context, account_type, region, value, value2, value3, value4, value5, value6, value7, placeCryptoOrderErrorDetails != null ? placeCryptoOrderErrorDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ActivitySnapshot toProto() {
        ByteString object_id = this.surrogate.getObject_id();
        ByteString user_id = this.surrogate.getUser_id();
        long account_number = this.surrogate.getAccount_number();
        ActivitySnapshot.Type type2 = (ActivitySnapshot.Type) this.surrogate.getType().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        String context = this.surrogate.getContext();
        long ordering_id = this.surrogate.getOrdering_id();
        List<CurrencyMovementDto> currency_movements = this.surrogate.getCurrency_movements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currency_movements, 10));
        Iterator<T> it = currency_movements.iterator();
        while (it.hasNext()) {
            arrayList.add(((CurrencyMovementDto) it.next()).toProto());
        }
        RequestContextDto request_context = this.surrogate.getRequest_context();
        RequestContext proto = request_context != null ? request_context.toProto() : null;
        AccountType accountType = (AccountType) this.surrogate.getAccount_type().toProto();
        ActivitySnapshot.Region region = (ActivitySnapshot.Region) this.surrogate.getRegion().toProto();
        CryptoOrderDetailsDto crypto_order_details = this.surrogate.getCrypto_order_details();
        CryptoOrderDetails proto2 = crypto_order_details != null ? crypto_order_details.toProto() : null;
        CurrencyPairDetailsDto currency_pair_details = this.surrogate.getCurrency_pair_details();
        CurrencyPairDetails proto3 = currency_pair_details != null ? currency_pair_details.toProto() : null;
        OrderEarmarkRequestDto tax_lot_earmark_request = this.surrogate.getTax_lot_earmark_request();
        OrderEarmarkRequest proto4 = tax_lot_earmark_request != null ? tax_lot_earmark_request.toProto() : null;
        CbcTaxLotUpdateEventDto cbc_tax_lot_update_event = this.surrogate.getCbc_tax_lot_update_event();
        CbcTaxLotUpdateEvent proto5 = cbc_tax_lot_update_event != null ? cbc_tax_lot_update_event.toProto() : null;
        NewAccountDetailsDto new_account_details = this.surrogate.getNew_account_details();
        NewAccountDetails proto6 = new_account_details != null ? new_account_details.toProto() : null;
        DepositStatusDetailsDto deposit_status_details = this.surrogate.getDeposit_status_details();
        DepositStatusDetails proto7 = deposit_status_details != null ? deposit_status_details.toProto() : null;
        AssetMigrationDetailsDto asset_migration_details = this.surrogate.getAsset_migration_details();
        AssetMigrationDetails proto8 = asset_migration_details != null ? asset_migration_details.toProto() : null;
        PlaceCryptoOrderErrorDetailsDto place_crypto_order_error_details = this.surrogate.getPlace_crypto_order_error_details();
        return new ActivitySnapshot(object_id, user_id, account_number, type2, timestamp, context, ordering_id, arrayList, proto, accountType, proto2, proto3, proto4, proto5, proto6, proto7, proto8, place_crypto_order_error_details != null ? place_crypto_order_error_details.toProto() : null, region, null, 524288, null);
    }

    public String toString() {
        return "[ActivitySnapshotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActivitySnapshotDto) && Intrinsics.areEqual(((ActivitySnapshotDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b=\b\u0083\b\u0018\u0000 ¢\u00012\u00020\u0001:\u0004£\u0001¢\u0001B¿\u0002\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\n\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.BÛ\u0001\b\u0010\u0012\u0006\u00100\u001a\u00020/\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b-\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b?\u0010>J\u001f\u0010@\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bB\u0010CJ6\u0010D\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\bH\u0010AJ\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\b_\u0010`JÈ\u0002\u0010a\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\u0017\b\u0002\u0010\n\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2.\b\u0002\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\b\u0002\u0010\u0013\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+HÆ\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bc\u0010GJ\u0010\u0010d\u001a\u00020/HÖ\u0001¢\u0006\u0004\bd\u0010eJ\u001a\u0010h\u001a\u00020g2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bh\u0010iR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010j\u0012\u0004\bl\u0010m\u001a\u0004\bk\u0010>R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010j\u0012\u0004\bo\u0010m\u001a\u0004\bn\u0010>R/\u0010\n\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010p\u0012\u0004\br\u0010m\u001a\u0004\bq\u0010AR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010s\u0012\u0004\bu\u0010m\u001a\u0004\bt\u0010CRF\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010v\u0012\u0004\bx\u0010m\u001a\u0004\bw\u0010ER \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010y\u0012\u0004\b{\u0010m\u001a\u0004\bz\u0010GR/\u0010\u0013\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010p\u0012\u0004\b}\u0010m\u001a\u0004\b|\u0010AR'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u0016\u0010~\u0012\u0005\b\u0080\u0001\u0010m\u001a\u0004\b\u007f\u0010JR%\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0082\u0001\u0010LR#\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0084\u0001\u0012\u0005\b\u0086\u0001\u0010m\u001a\u0005\b\u0085\u0001\u0010NR#\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001c\u0010\u0087\u0001\u0012\u0005\b\u0089\u0001\u0010m\u001a\u0005\b\u0088\u0001\u0010PR%\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u008a\u0001\u0012\u0005\b\u008c\u0001\u0010m\u001a\u0005\b\u008b\u0001\u0010RR%\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0010\u008d\u0001\u0012\u0005\b\u008f\u0001\u0010m\u001a\u0005\b\u008e\u0001\u0010TR%\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0090\u0001\u0012\u0005\b\u0092\u0001\u0010m\u001a\u0005\b\u0091\u0001\u0010VR%\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b$\u0010\u0093\u0001\u0012\u0005\b\u0095\u0001\u0010m\u001a\u0005\b\u0094\u0001\u0010XR%\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b&\u0010\u0096\u0001\u0012\u0005\b\u0098\u0001\u0010m\u001a\u0005\b\u0097\u0001\u0010ZR%\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b(\u0010\u0099\u0001\u0012\u0005\b\u009b\u0001\u0010m\u001a\u0005\b\u009a\u0001\u0010\\R%\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b*\u0010\u009c\u0001\u0012\u0005\b\u009e\u0001\u0010m\u001a\u0005\b\u009d\u0001\u0010^R%\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b,\u0010\u009f\u0001\u0012\u0005\b¡\u0001\u0010m\u001a\u0005\b \u0001\u0010`¨\u0006¤\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "object_id", MatchaQrCodeDuxo6.USER_ID_KEY, "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "account_number", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "context", "ordering_id", "", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "currency_movements", "Lcom/robinhood/rosetta/common/RequestContextDto;", "request_context", "Lrosetta/nummus/AccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "region", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "crypto_order_details", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "currency_pair_details", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "tax_lot_earmark_request", "Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "cbc_tax_lot_update_event", "Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "new_account_details", "Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "deposit_status_details", "Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "asset_migration_details", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "place_crypto_order_error_details", "<init>", "(Lokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContextDto;Lrosetta/nummus/AccountTypeDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;Lcbc/service/v1/CbcTaxLotUpdateEventDto;Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContextDto;Lrosetta/nummus/AccountTypeDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;Lcbc/service/v1/CbcTaxLotUpdateEventDto;Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_nummus_nummus_externalRelease", "(Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "component3", "()J", "component4", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "component5", "()Lj$/time/Instant;", "component6", "()Ljava/lang/String;", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/robinhood/rosetta/common/RequestContextDto;", "component10", "()Lrosetta/nummus/AccountTypeDto;", "component11", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "component12", "()Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "component13", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "component14", "()Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "component15", "()Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "component16", "()Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "component17", "()Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "component18", "()Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "component19", "()Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "copy", "(Lokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContextDto;Lrosetta/nummus/AccountTypeDto;Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;Lcbc/service/v1/CbcTaxLotUpdateEventDto;Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;)Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getObject_id", "getObject_id$annotations", "()V", "getUser_id", "getUser_id$annotations", "J", "getAccount_number", "getAccount_number$annotations", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "getType", "getType$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getContext", "getContext$annotations", "getOrdering_id", "getOrdering_id$annotations", "Ljava/util/List;", "getCurrency_movements", "getCurrency_movements$annotations", "Lcom/robinhood/rosetta/common/RequestContextDto;", "getRequest_context", "getRequest_context$annotations", "Lrosetta/nummus/AccountTypeDto;", "getAccount_type", "getAccount_type$annotations", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "getRegion", "getRegion$annotations", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "getCrypto_order_details", "getCrypto_order_details$annotations", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "getCurrency_pair_details", "getCurrency_pair_details$annotations", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "getTax_lot_earmark_request", "getTax_lot_earmark_request$annotations", "Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "getCbc_tax_lot_update_event", "getCbc_tax_lot_update_event$annotations", "Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "getNew_account_details", "getNew_account_details$annotations", "Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "getDeposit_status_details", "getDeposit_status_details$annotations", "Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "getAsset_migration_details", "getAsset_migration_details$annotations", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "getPlace_crypto_order_error_details", "getPlace_crypto_order_error_details$annotations", "Companion", "$serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final long account_number;
        private final AccountTypeDto account_type;
        private final AssetMigrationDetailsDto asset_migration_details;
        private final CbcTaxLotUpdateEventDto cbc_tax_lot_update_event;
        private final String context;
        private final CryptoOrderDetailsDto crypto_order_details;
        private final List<CurrencyMovementDto> currency_movements;
        private final CurrencyPairDetailsDto currency_pair_details;
        private final DepositStatusDetailsDto deposit_status_details;
        private final NewAccountDetailsDto new_account_details;
        private final ByteString object_id;
        private final long ordering_id;
        private final PlaceCryptoOrderErrorDetailsDto place_crypto_order_error_details;
        private final RegionDto region;
        private final RequestContextDto request_context;
        private final OrderEarmarkRequestDto tax_lot_earmark_request;
        private final Instant timestamp;
        private final TypeDto type;
        private final ByteString user_id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.nummus.ActivitySnapshotDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivitySnapshotDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((ByteString) null, (ByteString) null, 0L, (TypeDto) null, (Instant) null, (String) null, 0L, (List) null, (RequestContextDto) null, (AccountTypeDto) null, (RegionDto) null, (CryptoOrderDetailsDto) null, (CurrencyPairDetailsDto) null, (OrderEarmarkRequestDto) null, (CbcTaxLotUpdateEventDto) null, (NewAccountDetailsDto) null, (DepositStatusDetailsDto) null, (AssetMigrationDetailsDto) null, (PlaceCryptoOrderErrorDetailsDto) null, 524287, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CurrencyMovementDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, ByteString byteString2, long j, TypeDto typeDto, Instant instant, String str, long j2, List list, RequestContextDto requestContextDto, AccountTypeDto accountTypeDto, RegionDto regionDto, CryptoOrderDetailsDto cryptoOrderDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, OrderEarmarkRequestDto orderEarmarkRequestDto, CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto, NewAccountDetailsDto newAccountDetailsDto, DepositStatusDetailsDto depositStatusDetailsDto, AssetMigrationDetailsDto assetMigrationDetailsDto, PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto, int i, Object obj) {
            PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto2;
            AssetMigrationDetailsDto assetMigrationDetailsDto2;
            ByteString byteString3 = (i & 1) != 0 ? surrogate.object_id : byteString;
            ByteString byteString4 = (i & 2) != 0 ? surrogate.user_id : byteString2;
            long j3 = (i & 4) != 0 ? surrogate.account_number : j;
            TypeDto typeDto2 = (i & 8) != 0 ? surrogate.type : typeDto;
            Instant instant2 = (i & 16) != 0 ? surrogate.timestamp : instant;
            String str2 = (i & 32) != 0 ? surrogate.context : str;
            long j4 = (i & 64) != 0 ? surrogate.ordering_id : j2;
            List list2 = (i & 128) != 0 ? surrogate.currency_movements : list;
            RequestContextDto requestContextDto2 = (i & 256) != 0 ? surrogate.request_context : requestContextDto;
            AccountTypeDto accountTypeDto2 = (i & 512) != 0 ? surrogate.account_type : accountTypeDto;
            RegionDto regionDto2 = (i & 1024) != 0 ? surrogate.region : regionDto;
            CryptoOrderDetailsDto cryptoOrderDetailsDto2 = (i & 2048) != 0 ? surrogate.crypto_order_details : cryptoOrderDetailsDto;
            ByteString byteString5 = byteString3;
            CurrencyPairDetailsDto currencyPairDetailsDto2 = (i & 4096) != 0 ? surrogate.currency_pair_details : currencyPairDetailsDto;
            OrderEarmarkRequestDto orderEarmarkRequestDto2 = (i & 8192) != 0 ? surrogate.tax_lot_earmark_request : orderEarmarkRequestDto;
            CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto2 = (i & 16384) != 0 ? surrogate.cbc_tax_lot_update_event : cbcTaxLotUpdateEventDto;
            NewAccountDetailsDto newAccountDetailsDto2 = (i & 32768) != 0 ? surrogate.new_account_details : newAccountDetailsDto;
            DepositStatusDetailsDto depositStatusDetailsDto2 = (i & 65536) != 0 ? surrogate.deposit_status_details : depositStatusDetailsDto;
            AssetMigrationDetailsDto assetMigrationDetailsDto3 = (i & 131072) != 0 ? surrogate.asset_migration_details : assetMigrationDetailsDto;
            if ((i & 262144) != 0) {
                assetMigrationDetailsDto2 = assetMigrationDetailsDto3;
                placeCryptoOrderErrorDetailsDto2 = surrogate.place_crypto_order_error_details;
            } else {
                placeCryptoOrderErrorDetailsDto2 = placeCryptoOrderErrorDetailsDto;
                assetMigrationDetailsDto2 = assetMigrationDetailsDto3;
            }
            return surrogate.copy(byteString5, byteString4, j3, typeDto2, instant2, str2, j4, list2, requestContextDto2, accountTypeDto2, regionDto2, cryptoOrderDetailsDto2, currencyPairDetailsDto2, orderEarmarkRequestDto2, cbcTaxLotUpdateEventDto2, newAccountDetailsDto2, depositStatusDetailsDto2, assetMigrationDetailsDto2, placeCryptoOrderErrorDetailsDto2);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("assetMigrationDetails")
        @JsonAnnotations2(names = {"asset_migration_details"})
        public static /* synthetic */ void getAsset_migration_details$annotations() {
        }

        @SerialName("cbcTaxLotUpdateEvent")
        @JsonAnnotations2(names = {"cbc_tax_lot_update_event"})
        public static /* synthetic */ void getCbc_tax_lot_update_event$annotations() {
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName("cryptoOrderDetails")
        @JsonAnnotations2(names = {"crypto_order_details"})
        public static /* synthetic */ void getCrypto_order_details$annotations() {
        }

        @SerialName("currencyMovements")
        @JsonAnnotations2(names = {"currency_movements"})
        public static /* synthetic */ void getCurrency_movements$annotations() {
        }

        @SerialName("currencyPairDetails")
        @JsonAnnotations2(names = {"currency_pair_details"})
        public static /* synthetic */ void getCurrency_pair_details$annotations() {
        }

        @SerialName("depositStatusDetails")
        @JsonAnnotations2(names = {"deposit_status_details"})
        public static /* synthetic */ void getDeposit_status_details$annotations() {
        }

        @SerialName("newAccountDetails")
        @JsonAnnotations2(names = {"new_account_details"})
        public static /* synthetic */ void getNew_account_details$annotations() {
        }

        @SerialName("objectId")
        @JsonAnnotations2(names = {"object_id"})
        public static /* synthetic */ void getObject_id$annotations() {
        }

        @SerialName("orderingId")
        @JsonAnnotations2(names = {"ordering_id"})
        public static /* synthetic */ void getOrdering_id$annotations() {
        }

        @SerialName("placeCryptoOrderErrorDetails")
        @JsonAnnotations2(names = {"place_crypto_order_error_details"})
        public static /* synthetic */ void getPlace_crypto_order_error_details$annotations() {
        }

        @SerialName("region")
        @JsonAnnotations2(names = {"region"})
        public static /* synthetic */ void getRegion$annotations() {
        }

        @SerialName("requestContext")
        @JsonAnnotations2(names = {"request_context"})
        public static /* synthetic */ void getRequest_context$annotations() {
        }

        @SerialName("taxLotEarmarkRequest")
        @JsonAnnotations2(names = {"tax_lot_earmark_request"})
        public static /* synthetic */ void getTax_lot_earmark_request$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getObject_id() {
            return this.object_id;
        }

        /* renamed from: component10, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component11, reason: from getter */
        public final RegionDto getRegion() {
            return this.region;
        }

        /* renamed from: component12, reason: from getter */
        public final CryptoOrderDetailsDto getCrypto_order_details() {
            return this.crypto_order_details;
        }

        /* renamed from: component13, reason: from getter */
        public final CurrencyPairDetailsDto getCurrency_pair_details() {
            return this.currency_pair_details;
        }

        /* renamed from: component14, reason: from getter */
        public final OrderEarmarkRequestDto getTax_lot_earmark_request() {
            return this.tax_lot_earmark_request;
        }

        /* renamed from: component15, reason: from getter */
        public final CbcTaxLotUpdateEventDto getCbc_tax_lot_update_event() {
            return this.cbc_tax_lot_update_event;
        }

        /* renamed from: component16, reason: from getter */
        public final NewAccountDetailsDto getNew_account_details() {
            return this.new_account_details;
        }

        /* renamed from: component17, reason: from getter */
        public final DepositStatusDetailsDto getDeposit_status_details() {
            return this.deposit_status_details;
        }

        /* renamed from: component18, reason: from getter */
        public final AssetMigrationDetailsDto getAsset_migration_details() {
            return this.asset_migration_details;
        }

        /* renamed from: component19, reason: from getter */
        public final PlaceCryptoOrderErrorDetailsDto getPlace_crypto_order_error_details() {
            return this.place_crypto_order_error_details;
        }

        /* renamed from: component2, reason: from getter */
        public final ByteString getUser_id() {
            return this.user_id;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component4, reason: from getter */
        public final TypeDto getType() {
            return this.type;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component7, reason: from getter */
        public final long getOrdering_id() {
            return this.ordering_id;
        }

        public final List<CurrencyMovementDto> component8() {
            return this.currency_movements;
        }

        /* renamed from: component9, reason: from getter */
        public final RequestContextDto getRequest_context() {
            return this.request_context;
        }

        public final Surrogate copy(ByteString object_id, ByteString user_id, long account_number, TypeDto type2, Instant timestamp, String context, long ordering_id, List<CurrencyMovementDto> currency_movements, RequestContextDto request_context, AccountTypeDto account_type, RegionDto region, CryptoOrderDetailsDto crypto_order_details, CurrencyPairDetailsDto currency_pair_details, OrderEarmarkRequestDto tax_lot_earmark_request, CbcTaxLotUpdateEventDto cbc_tax_lot_update_event, NewAccountDetailsDto new_account_details, DepositStatusDetailsDto deposit_status_details, AssetMigrationDetailsDto asset_migration_details, PlaceCryptoOrderErrorDetailsDto place_crypto_order_error_details) {
            Intrinsics.checkNotNullParameter(object_id, "object_id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(currency_movements, "currency_movements");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(region, "region");
            return new Surrogate(object_id, user_id, account_number, type2, timestamp, context, ordering_id, currency_movements, request_context, account_type, region, crypto_order_details, currency_pair_details, tax_lot_earmark_request, cbc_tax_lot_update_event, new_account_details, deposit_status_details, asset_migration_details, place_crypto_order_error_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.object_id, surrogate.object_id) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && this.account_number == surrogate.account_number && this.type == surrogate.type && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.context, surrogate.context) && this.ordering_id == surrogate.ordering_id && Intrinsics.areEqual(this.currency_movements, surrogate.currency_movements) && Intrinsics.areEqual(this.request_context, surrogate.request_context) && this.account_type == surrogate.account_type && this.region == surrogate.region && Intrinsics.areEqual(this.crypto_order_details, surrogate.crypto_order_details) && Intrinsics.areEqual(this.currency_pair_details, surrogate.currency_pair_details) && Intrinsics.areEqual(this.tax_lot_earmark_request, surrogate.tax_lot_earmark_request) && Intrinsics.areEqual(this.cbc_tax_lot_update_event, surrogate.cbc_tax_lot_update_event) && Intrinsics.areEqual(this.new_account_details, surrogate.new_account_details) && Intrinsics.areEqual(this.deposit_status_details, surrogate.deposit_status_details) && Intrinsics.areEqual(this.asset_migration_details, surrogate.asset_migration_details) && Intrinsics.areEqual(this.place_crypto_order_error_details, surrogate.place_crypto_order_error_details);
        }

        public int hashCode() {
            int iHashCode = ((((((this.object_id.hashCode() * 31) + this.user_id.hashCode()) * 31) + Long.hashCode(this.account_number)) * 31) + this.type.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.context.hashCode()) * 31) + Long.hashCode(this.ordering_id)) * 31) + this.currency_movements.hashCode()) * 31;
            RequestContextDto requestContextDto = this.request_context;
            int iHashCode3 = (((((iHashCode2 + (requestContextDto == null ? 0 : requestContextDto.hashCode())) * 31) + this.account_type.hashCode()) * 31) + this.region.hashCode()) * 31;
            CryptoOrderDetailsDto cryptoOrderDetailsDto = this.crypto_order_details;
            int iHashCode4 = (iHashCode3 + (cryptoOrderDetailsDto == null ? 0 : cryptoOrderDetailsDto.hashCode())) * 31;
            CurrencyPairDetailsDto currencyPairDetailsDto = this.currency_pair_details;
            int iHashCode5 = (iHashCode4 + (currencyPairDetailsDto == null ? 0 : currencyPairDetailsDto.hashCode())) * 31;
            OrderEarmarkRequestDto orderEarmarkRequestDto = this.tax_lot_earmark_request;
            int iHashCode6 = (iHashCode5 + (orderEarmarkRequestDto == null ? 0 : orderEarmarkRequestDto.hashCode())) * 31;
            CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto = this.cbc_tax_lot_update_event;
            int iHashCode7 = (iHashCode6 + (cbcTaxLotUpdateEventDto == null ? 0 : cbcTaxLotUpdateEventDto.hashCode())) * 31;
            NewAccountDetailsDto newAccountDetailsDto = this.new_account_details;
            int iHashCode8 = (iHashCode7 + (newAccountDetailsDto == null ? 0 : newAccountDetailsDto.hashCode())) * 31;
            DepositStatusDetailsDto depositStatusDetailsDto = this.deposit_status_details;
            int iHashCode9 = (iHashCode8 + (depositStatusDetailsDto == null ? 0 : depositStatusDetailsDto.hashCode())) * 31;
            AssetMigrationDetailsDto assetMigrationDetailsDto = this.asset_migration_details;
            int iHashCode10 = (iHashCode9 + (assetMigrationDetailsDto == null ? 0 : assetMigrationDetailsDto.hashCode())) * 31;
            PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto = this.place_crypto_order_error_details;
            return iHashCode10 + (placeCryptoOrderErrorDetailsDto != null ? placeCryptoOrderErrorDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(object_id=" + this.object_id + ", user_id=" + this.user_id + ", account_number=" + this.account_number + ", type=" + this.type + ", timestamp=" + this.timestamp + ", context=" + this.context + ", ordering_id=" + this.ordering_id + ", currency_movements=" + this.currency_movements + ", request_context=" + this.request_context + ", account_type=" + this.account_type + ", region=" + this.region + ", crypto_order_details=" + this.crypto_order_details + ", currency_pair_details=" + this.currency_pair_details + ", tax_lot_earmark_request=" + this.tax_lot_earmark_request + ", cbc_tax_lot_update_event=" + this.cbc_tax_lot_update_event + ", new_account_details=" + this.new_account_details + ", deposit_status_details=" + this.deposit_status_details + ", asset_migration_details=" + this.asset_migration_details + ", place_crypto_order_error_details=" + this.place_crypto_order_error_details + ")";
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActivitySnapshotDto6.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, ByteString byteString2, long j, TypeDto typeDto, Instant instant, String str, long j2, List list, RequestContextDto requestContextDto, AccountTypeDto accountTypeDto, RegionDto regionDto, CryptoOrderDetailsDto cryptoOrderDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, OrderEarmarkRequestDto orderEarmarkRequestDto, CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto, NewAccountDetailsDto newAccountDetailsDto, DepositStatusDetailsDto depositStatusDetailsDto, AssetMigrationDetailsDto assetMigrationDetailsDto, PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.object_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.user_id = ByteString.EMPTY;
            } else {
                this.user_id = byteString2;
            }
            if ((i & 4) == 0) {
                this.account_number = 0L;
            } else {
                this.account_number = j;
            }
            if ((i & 8) == 0) {
                this.type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = typeDto;
            }
            if ((i & 16) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 32) == 0) {
                this.context = "";
            } else {
                this.context = str;
            }
            if ((i & 64) == 0) {
                this.ordering_id = 0L;
            } else {
                this.ordering_id = j2;
            }
            if ((i & 128) == 0) {
                this.currency_movements = CollectionsKt.emptyList();
            } else {
                this.currency_movements = list;
            }
            if ((i & 256) == 0) {
                this.request_context = null;
            } else {
                this.request_context = requestContextDto;
            }
            if ((i & 512) == 0) {
                this.account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = accountTypeDto;
            }
            this.region = (i & 1024) == 0 ? RegionDto.INSTANCE.getZeroValue() : regionDto;
            if ((i & 2048) == 0) {
                this.crypto_order_details = null;
            } else {
                this.crypto_order_details = cryptoOrderDetailsDto;
            }
            if ((i & 4096) == 0) {
                this.currency_pair_details = null;
            } else {
                this.currency_pair_details = currencyPairDetailsDto;
            }
            if ((i & 8192) == 0) {
                this.tax_lot_earmark_request = null;
            } else {
                this.tax_lot_earmark_request = orderEarmarkRequestDto;
            }
            if ((i & 16384) == 0) {
                this.cbc_tax_lot_update_event = null;
            } else {
                this.cbc_tax_lot_update_event = cbcTaxLotUpdateEventDto;
            }
            if ((32768 & i) == 0) {
                this.new_account_details = null;
            } else {
                this.new_account_details = newAccountDetailsDto;
            }
            if ((65536 & i) == 0) {
                this.deposit_status_details = null;
            } else {
                this.deposit_status_details = depositStatusDetailsDto;
            }
            if ((131072 & i) == 0) {
                this.asset_migration_details = null;
            } else {
                this.asset_migration_details = assetMigrationDetailsDto;
            }
            if ((i & 262144) == 0) {
                this.place_crypto_order_error_details = null;
            } else {
                this.place_crypto_order_error_details = placeCryptoOrderErrorDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_nummus_nummus_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            ByteString byteString = self.object_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.object_id);
            }
            if (!Intrinsics.areEqual(self.user_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 1, ByteStringSerializer.INSTANCE, self.user_id);
            }
            long j = self.account_number;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TypeDto.Serializer.INSTANCE, self.type);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.context, "")) {
                output.encodeStringElement(serialDesc, 5, self.context);
            }
            long j2 = self.ordering_id;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            if (!Intrinsics.areEqual(self.currency_movements, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.currency_movements);
            }
            RequestContextDto requestContextDto = self.request_context;
            if (requestContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, RequestContextDto.Serializer.INSTANCE, requestContextDto);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (self.region != RegionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, RegionDto.Serializer.INSTANCE, self.region);
            }
            CryptoOrderDetailsDto cryptoOrderDetailsDto = self.crypto_order_details;
            if (cryptoOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, CryptoOrderDetailsDto.Serializer.INSTANCE, cryptoOrderDetailsDto);
            }
            CurrencyPairDetailsDto currencyPairDetailsDto = self.currency_pair_details;
            if (currencyPairDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, CurrencyPairDetailsDto.Serializer.INSTANCE, currencyPairDetailsDto);
            }
            OrderEarmarkRequestDto orderEarmarkRequestDto = self.tax_lot_earmark_request;
            if (orderEarmarkRequestDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, OrderEarmarkRequestDto.Serializer.INSTANCE, orderEarmarkRequestDto);
            }
            CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto = self.cbc_tax_lot_update_event;
            if (cbcTaxLotUpdateEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, CbcTaxLotUpdateEventDto.Serializer.INSTANCE, cbcTaxLotUpdateEventDto);
            }
            NewAccountDetailsDto newAccountDetailsDto = self.new_account_details;
            if (newAccountDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, NewAccountDetailsDto.Serializer.INSTANCE, newAccountDetailsDto);
            }
            DepositStatusDetailsDto depositStatusDetailsDto = self.deposit_status_details;
            if (depositStatusDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, DepositStatusDetailsDto.Serializer.INSTANCE, depositStatusDetailsDto);
            }
            AssetMigrationDetailsDto assetMigrationDetailsDto = self.asset_migration_details;
            if (assetMigrationDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, AssetMigrationDetailsDto.Serializer.INSTANCE, assetMigrationDetailsDto);
            }
            PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto = self.place_crypto_order_error_details;
            if (placeCryptoOrderErrorDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, PlaceCryptoOrderErrorDetailsDto.Serializer.INSTANCE, placeCryptoOrderErrorDetailsDto);
            }
        }

        public Surrogate(ByteString object_id, ByteString user_id, long j, TypeDto type2, Instant instant, String context, long j2, List<CurrencyMovementDto> currency_movements, RequestContextDto requestContextDto, AccountTypeDto account_type, RegionDto region, CryptoOrderDetailsDto cryptoOrderDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, OrderEarmarkRequestDto orderEarmarkRequestDto, CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto, NewAccountDetailsDto newAccountDetailsDto, DepositStatusDetailsDto depositStatusDetailsDto, AssetMigrationDetailsDto assetMigrationDetailsDto, PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto) {
            Intrinsics.checkNotNullParameter(object_id, "object_id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(currency_movements, "currency_movements");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(region, "region");
            this.object_id = object_id;
            this.user_id = user_id;
            this.account_number = j;
            this.type = type2;
            this.timestamp = instant;
            this.context = context;
            this.ordering_id = j2;
            this.currency_movements = currency_movements;
            this.request_context = requestContextDto;
            this.account_type = account_type;
            this.region = region;
            this.crypto_order_details = cryptoOrderDetailsDto;
            this.currency_pair_details = currencyPairDetailsDto;
            this.tax_lot_earmark_request = orderEarmarkRequestDto;
            this.cbc_tax_lot_update_event = cbcTaxLotUpdateEventDto;
            this.new_account_details = newAccountDetailsDto;
            this.deposit_status_details = depositStatusDetailsDto;
            this.asset_migration_details = assetMigrationDetailsDto;
            this.place_crypto_order_error_details = placeCryptoOrderErrorDetailsDto;
        }

        public final ByteString getObject_id() {
            return this.object_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, ByteString byteString2, long j, TypeDto typeDto, Instant instant, String str, long j2, List list, RequestContextDto requestContextDto, AccountTypeDto accountTypeDto, RegionDto regionDto, CryptoOrderDetailsDto cryptoOrderDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, OrderEarmarkRequestDto orderEarmarkRequestDto, CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto, NewAccountDetailsDto newAccountDetailsDto, DepositStatusDetailsDto depositStatusDetailsDto, AssetMigrationDetailsDto assetMigrationDetailsDto, PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : requestContextDto, (i & 512) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 1024) != 0 ? RegionDto.INSTANCE.getZeroValue() : regionDto, (i & 2048) != 0 ? null : cryptoOrderDetailsDto, (i & 4096) != 0 ? null : currencyPairDetailsDto, (i & 8192) != 0 ? null : orderEarmarkRequestDto, (i & 16384) != 0 ? null : cbcTaxLotUpdateEventDto, (i & 32768) != 0 ? null : newAccountDetailsDto, (i & 65536) != 0 ? null : depositStatusDetailsDto, (i & 131072) != 0 ? null : assetMigrationDetailsDto, (i & 262144) != 0 ? null : placeCryptoOrderErrorDetailsDto);
        }

        public final ByteString getUser_id() {
            return this.user_id;
        }

        public final long getAccount_number() {
            return this.account_number;
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getContext() {
            return this.context;
        }

        public final long getOrdering_id() {
            return this.ordering_id;
        }

        public final List<CurrencyMovementDto> getCurrency_movements() {
            return this.currency_movements;
        }

        public final RequestContextDto getRequest_context() {
            return this.request_context;
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final RegionDto getRegion() {
            return this.region;
        }

        public final CryptoOrderDetailsDto getCrypto_order_details() {
            return this.crypto_order_details;
        }

        public final CurrencyPairDetailsDto getCurrency_pair_details() {
            return this.currency_pair_details;
        }

        public final OrderEarmarkRequestDto getTax_lot_earmark_request() {
            return this.tax_lot_earmark_request;
        }

        public final CbcTaxLotUpdateEventDto getCbc_tax_lot_update_event() {
            return this.cbc_tax_lot_update_event;
        }

        public final NewAccountDetailsDto getNew_account_details() {
            return this.new_account_details;
        }

        public final DepositStatusDetailsDto getDeposit_status_details() {
            return this.deposit_status_details;
        }

        public final AssetMigrationDetailsDto getAsset_migration_details() {
            return this.asset_migration_details;
        }

        public final PlaceCryptoOrderErrorDetailsDto getPlace_crypto_order_error_details() {
            return this.place_crypto_order_error_details;
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActivitySnapshotDto, ActivitySnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActivitySnapshotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotDto> getBinaryBase64Serializer() {
            return (KSerializer) ActivitySnapshotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActivitySnapshot> getProtoAdapter() {
            return ActivitySnapshot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotDto getZeroValue() {
            return ActivitySnapshotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotDto fromProto(ActivitySnapshot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString object_id = proto.getObject_id();
            ByteString user_id = proto.getUser_id();
            long account_number = proto.getAccount_number();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getType());
            Instant timestamp = proto.getTimestamp();
            String context = proto.getContext();
            long ordering_id = proto.getOrdering_id();
            List<CurrencyMovement> currency_movements = proto.getCurrency_movements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currency_movements, 10));
            Iterator<T> it = currency_movements.iterator();
            while (it.hasNext()) {
                arrayList.add(CurrencyMovementDto.INSTANCE.fromProto((CurrencyMovement) it.next()));
            }
            RequestContext request_context = proto.getRequest_context();
            RequestContextDto requestContextDtoFromProto = request_context != null ? RequestContextDto.INSTANCE.fromProto(request_context) : null;
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
            RegionDto regionDtoFromProto = RegionDto.INSTANCE.fromProto(proto.getRegion());
            CryptoOrderDetails crypto_order_details = proto.getCrypto_order_details();
            CryptoOrderDetailsDto cryptoOrderDetailsDtoFromProto = crypto_order_details != null ? CryptoOrderDetailsDto.INSTANCE.fromProto(crypto_order_details) : null;
            CurrencyPairDetails currency_pair_details = proto.getCurrency_pair_details();
            RequestContextDto requestContextDto = requestContextDtoFromProto;
            CurrencyPairDetailsDto currencyPairDetailsDtoFromProto = currency_pair_details != null ? CurrencyPairDetailsDto.INSTANCE.fromProto(currency_pair_details) : null;
            OrderEarmarkRequest tax_lot_earmark_request = proto.getTax_lot_earmark_request();
            CurrencyPairDetailsDto currencyPairDetailsDto = currencyPairDetailsDtoFromProto;
            OrderEarmarkRequestDto orderEarmarkRequestDtoFromProto = tax_lot_earmark_request != null ? OrderEarmarkRequestDto.INSTANCE.fromProto(tax_lot_earmark_request) : null;
            CbcTaxLotUpdateEvent cbc_tax_lot_update_event = proto.getCbc_tax_lot_update_event();
            OrderEarmarkRequestDto orderEarmarkRequestDto = orderEarmarkRequestDtoFromProto;
            CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDtoFromProto = cbc_tax_lot_update_event != null ? CbcTaxLotUpdateEventDto.INSTANCE.fromProto(cbc_tax_lot_update_event) : null;
            NewAccountDetails new_account_details = proto.getNew_account_details();
            CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto = cbcTaxLotUpdateEventDtoFromProto;
            NewAccountDetailsDto newAccountDetailsDtoFromProto = new_account_details != null ? NewAccountDetailsDto.INSTANCE.fromProto(new_account_details) : null;
            DepositStatusDetails deposit_status_details = proto.getDeposit_status_details();
            NewAccountDetailsDto newAccountDetailsDto = newAccountDetailsDtoFromProto;
            DepositStatusDetailsDto depositStatusDetailsDtoFromProto = deposit_status_details != null ? DepositStatusDetailsDto.INSTANCE.fromProto(deposit_status_details) : null;
            AssetMigrationDetails asset_migration_details = proto.getAsset_migration_details();
            DepositStatusDetailsDto depositStatusDetailsDto = depositStatusDetailsDtoFromProto;
            AssetMigrationDetailsDto assetMigrationDetailsDtoFromProto = asset_migration_details != null ? AssetMigrationDetailsDto.INSTANCE.fromProto(asset_migration_details) : null;
            PlaceCryptoOrderErrorDetails place_crypto_order_error_details = proto.getPlace_crypto_order_error_details();
            return new ActivitySnapshotDto(new Surrogate(object_id, user_id, account_number, typeDtoFromProto, timestamp, context, ordering_id, arrayList, requestContextDto, accountTypeDtoFromProto, regionDtoFromProto, cryptoOrderDetailsDtoFromProto, currencyPairDetailsDto, orderEarmarkRequestDto, cbcTaxLotUpdateEventDto, newAccountDetailsDto, depositStatusDetailsDto, assetMigrationDetailsDtoFromProto, place_crypto_order_error_details != null ? PlaceCryptoOrderErrorDetailsDto.INSTANCE.fromProto(place_crypto_order_error_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.ActivitySnapshotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivitySnapshotDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ActivitySnapshotDto(null, null, 0L, null, null, null, 0L, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "CryptoOrderDetails", "CurrencyPairDetails", "TaxLotEarmarkRequest", "CbcTaxLotUpdateEvent", "NewAccountDetails", "DepositStatusDetails", "AssetMigrationDetails", "PlaceCryptoOrderErrorDetails", "Companion", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$AssetMigrationDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$CbcTaxLotUpdateEvent;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$CryptoOrderDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$CurrencyPairDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$DepositStatusDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$NewAccountDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$PlaceCryptoOrderErrorDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$TaxLotEarmarkRequest;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$CryptoOrderDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoOrderDetails extends DetailsDto {
            private final CryptoOrderDetailsDto value;

            public static /* synthetic */ CryptoOrderDetails copy$default(CryptoOrderDetails cryptoOrderDetails, CryptoOrderDetailsDto cryptoOrderDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoOrderDetailsDto = cryptoOrderDetails.value;
                }
                return cryptoOrderDetails.copy(cryptoOrderDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoOrderDetailsDto getValue() {
                return this.value;
            }

            public final CryptoOrderDetails copy(CryptoOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CryptoOrderDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CryptoOrderDetails) && Intrinsics.areEqual(this.value, ((CryptoOrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CryptoOrderDetails(value=" + this.value + ")";
            }

            public final CryptoOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoOrderDetails(CryptoOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$CurrencyPairDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CurrencyPairDetails extends DetailsDto {
            private final CurrencyPairDetailsDto value;

            public static /* synthetic */ CurrencyPairDetails copy$default(CurrencyPairDetails currencyPairDetails, CurrencyPairDetailsDto currencyPairDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    currencyPairDetailsDto = currencyPairDetails.value;
                }
                return currencyPairDetails.copy(currencyPairDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CurrencyPairDetailsDto getValue() {
                return this.value;
            }

            public final CurrencyPairDetails copy(CurrencyPairDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CurrencyPairDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CurrencyPairDetails) && Intrinsics.areEqual(this.value, ((CurrencyPairDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CurrencyPairDetails(value=" + this.value + ")";
            }

            public final CurrencyPairDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CurrencyPairDetails(CurrencyPairDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$TaxLotEarmarkRequest;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "<init>", "(Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;)V", "getValue", "()Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotEarmarkRequest extends DetailsDto {
            private final OrderEarmarkRequestDto value;

            public static /* synthetic */ TaxLotEarmarkRequest copy$default(TaxLotEarmarkRequest taxLotEarmarkRequest, OrderEarmarkRequestDto orderEarmarkRequestDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderEarmarkRequestDto = taxLotEarmarkRequest.value;
                }
                return taxLotEarmarkRequest.copy(orderEarmarkRequestDto);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderEarmarkRequestDto getValue() {
                return this.value;
            }

            public final TaxLotEarmarkRequest copy(OrderEarmarkRequestDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new TaxLotEarmarkRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TaxLotEarmarkRequest) && Intrinsics.areEqual(this.value, ((TaxLotEarmarkRequest) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TaxLotEarmarkRequest(value=" + this.value + ")";
            }

            public final OrderEarmarkRequestDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotEarmarkRequest(OrderEarmarkRequestDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$CbcTaxLotUpdateEvent;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "<init>", "(Lcbc/service/v1/CbcTaxLotUpdateEventDto;)V", "getValue", "()Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final /* data */ class CbcTaxLotUpdateEvent extends DetailsDto {
            private final CbcTaxLotUpdateEventDto value;

            public static /* synthetic */ CbcTaxLotUpdateEvent copy$default(CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent, CbcTaxLotUpdateEventDto cbcTaxLotUpdateEventDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    cbcTaxLotUpdateEventDto = cbcTaxLotUpdateEvent.value;
                }
                return cbcTaxLotUpdateEvent.copy(cbcTaxLotUpdateEventDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CbcTaxLotUpdateEventDto getValue() {
                return this.value;
            }

            public final CbcTaxLotUpdateEvent copy(CbcTaxLotUpdateEventDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CbcTaxLotUpdateEvent(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CbcTaxLotUpdateEvent) && Intrinsics.areEqual(this.value, ((CbcTaxLotUpdateEvent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CbcTaxLotUpdateEvent(value=" + this.value + ")";
            }

            public final CbcTaxLotUpdateEventDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CbcTaxLotUpdateEvent(CbcTaxLotUpdateEventDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$NewAccountDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/nummus/NewAccountDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final /* data */ class NewAccountDetails extends DetailsDto {
            private final NewAccountDetailsDto value;

            public static /* synthetic */ NewAccountDetails copy$default(NewAccountDetails newAccountDetails, NewAccountDetailsDto newAccountDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    newAccountDetailsDto = newAccountDetails.value;
                }
                return newAccountDetails.copy(newAccountDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final NewAccountDetailsDto getValue() {
                return this.value;
            }

            public final NewAccountDetails copy(NewAccountDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new NewAccountDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NewAccountDetails) && Intrinsics.areEqual(this.value, ((NewAccountDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NewAccountDetails(value=" + this.value + ")";
            }

            public final NewAccountDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewAccountDetails(NewAccountDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$DepositStatusDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/nummus/DepositStatusDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final /* data */ class DepositStatusDetails extends DetailsDto {
            private final DepositStatusDetailsDto value;

            public static /* synthetic */ DepositStatusDetails copy$default(DepositStatusDetails depositStatusDetails, DepositStatusDetailsDto depositStatusDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    depositStatusDetailsDto = depositStatusDetails.value;
                }
                return depositStatusDetails.copy(depositStatusDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final DepositStatusDetailsDto getValue() {
                return this.value;
            }

            public final DepositStatusDetails copy(DepositStatusDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new DepositStatusDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DepositStatusDetails) && Intrinsics.areEqual(this.value, ((DepositStatusDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DepositStatusDetails(value=" + this.value + ")";
            }

            public final DepositStatusDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DepositStatusDetails(DepositStatusDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$AssetMigrationDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/nummus/AssetMigrationDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final /* data */ class AssetMigrationDetails extends DetailsDto {
            private final AssetMigrationDetailsDto value;

            public static /* synthetic */ AssetMigrationDetails copy$default(AssetMigrationDetails assetMigrationDetails, AssetMigrationDetailsDto assetMigrationDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    assetMigrationDetailsDto = assetMigrationDetails.value;
                }
                return assetMigrationDetails.copy(assetMigrationDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final AssetMigrationDetailsDto getValue() {
                return this.value;
            }

            public final AssetMigrationDetails copy(AssetMigrationDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AssetMigrationDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AssetMigrationDetails) && Intrinsics.areEqual(this.value, ((AssetMigrationDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AssetMigrationDetails(value=" + this.value + ")";
            }

            public final AssetMigrationDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AssetMigrationDetails(AssetMigrationDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$PlaceCryptoOrderErrorDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final /* data */ class PlaceCryptoOrderErrorDetails extends DetailsDto {
            private final PlaceCryptoOrderErrorDetailsDto value;

            public static /* synthetic */ PlaceCryptoOrderErrorDetails copy$default(PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails, PlaceCryptoOrderErrorDetailsDto placeCryptoOrderErrorDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    placeCryptoOrderErrorDetailsDto = placeCryptoOrderErrorDetails.value;
                }
                return placeCryptoOrderErrorDetails.copy(placeCryptoOrderErrorDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final PlaceCryptoOrderErrorDetailsDto getValue() {
                return this.value;
            }

            public final PlaceCryptoOrderErrorDetails copy(PlaceCryptoOrderErrorDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new PlaceCryptoOrderErrorDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaceCryptoOrderErrorDetails) && Intrinsics.areEqual(this.value, ((PlaceCryptoOrderErrorDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaceCryptoOrderErrorDetails(value=" + this.value + ")";
            }

            public final PlaceCryptoOrderErrorDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaceCryptoOrderErrorDetails(PlaceCryptoOrderErrorDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Companion implements Dto4.Creator<DetailsDto, ActivitySnapshot> {
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
            public ProtoAdapter<ActivitySnapshot> getProtoAdapter() {
                return ActivitySnapshot.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(ActivitySnapshot proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getCrypto_order_details() != null) {
                    return new CryptoOrderDetails(CryptoOrderDetailsDto.INSTANCE.fromProto(proto.getCrypto_order_details()));
                }
                if (proto.getCurrency_pair_details() != null) {
                    return new CurrencyPairDetails(CurrencyPairDetailsDto.INSTANCE.fromProto(proto.getCurrency_pair_details()));
                }
                if (proto.getTax_lot_earmark_request() != null) {
                    return new TaxLotEarmarkRequest(OrderEarmarkRequestDto.INSTANCE.fromProto(proto.getTax_lot_earmark_request()));
                }
                if (proto.getCbc_tax_lot_update_event() != null) {
                    return new CbcTaxLotUpdateEvent(CbcTaxLotUpdateEventDto.INSTANCE.fromProto(proto.getCbc_tax_lot_update_event()));
                }
                if (proto.getNew_account_details() != null) {
                    return new NewAccountDetails(NewAccountDetailsDto.INSTANCE.fromProto(proto.getNew_account_details()));
                }
                if (proto.getDeposit_status_details() != null) {
                    return new DepositStatusDetails(DepositStatusDetailsDto.INSTANCE.fromProto(proto.getDeposit_status_details()));
                }
                if (proto.getAsset_migration_details() != null) {
                    return new AssetMigrationDetails(AssetMigrationDetailsDto.INSTANCE.fromProto(proto.getAsset_migration_details()));
                }
                if (proto.getPlace_crypto_order_error_details() != null) {
                    return new PlaceCryptoOrderErrorDetails(PlaceCryptoOrderErrorDetailsDto.INSTANCE.fromProto(proto.getPlace_crypto_order_error_details()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "CRYPTO_ORDER", "HOLDING_ADJUSTMENT", "CURRENCY_PAIR_UPDATE", "NEW_CRYPTO_ACCOUNT", "CRYPTO_FIRM_ORDER", "TAX_LOT_EARMARK_REQUEST", "TAX_LOT_UPDATE_EVENT", "TAX_LOT_CLEANUP", "DEPOSIT_STATUS_UPDATE", "ASSET_MIGRATION_UPDATE", "PLACE_CRYPTO_ORDER_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<ActivitySnapshot.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, ActivitySnapshot.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final TypeDto CRYPTO_ORDER = new CRYPTO_ORDER("CRYPTO_ORDER", 1);
        public static final TypeDto HOLDING_ADJUSTMENT = new HOLDING_ADJUSTMENT("HOLDING_ADJUSTMENT", 2);
        public static final TypeDto CURRENCY_PAIR_UPDATE = new CURRENCY_PAIR_UPDATE("CURRENCY_PAIR_UPDATE", 3);
        public static final TypeDto NEW_CRYPTO_ACCOUNT = new NEW_CRYPTO_ACCOUNT("NEW_CRYPTO_ACCOUNT", 4);
        public static final TypeDto CRYPTO_FIRM_ORDER = new CRYPTO_FIRM_ORDER("CRYPTO_FIRM_ORDER", 5);
        public static final TypeDto TAX_LOT_EARMARK_REQUEST = new TAX_LOT_EARMARK_REQUEST("TAX_LOT_EARMARK_REQUEST", 6);
        public static final TypeDto TAX_LOT_UPDATE_EVENT = new TAX_LOT_UPDATE_EVENT("TAX_LOT_UPDATE_EVENT", 7);
        public static final TypeDto TAX_LOT_CLEANUP = new TAX_LOT_CLEANUP("TAX_LOT_CLEANUP", 8);
        public static final TypeDto DEPOSIT_STATUS_UPDATE = new DEPOSIT_STATUS_UPDATE("DEPOSIT_STATUS_UPDATE", 9);
        public static final TypeDto ASSET_MIGRATION_UPDATE = new ASSET_MIGRATION_UPDATE("ASSET_MIGRATION_UPDATE", 10);
        public static final TypeDto PLACE_CRYPTO_ORDER_ERROR = new PLACE_CRYPTO_ORDER_ERROR("PLACE_CRYPTO_ORDER_ERROR", 11);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{TYPE_UNSPECIFIED, CRYPTO_ORDER, HOLDING_ADJUSTMENT, CURRENCY_PAIR_UPDATE, NEW_CRYPTO_ACCOUNT, CRYPTO_FIRM_ORDER, TAX_LOT_EARMARK_REQUEST, TAX_LOT_UPDATE_EVENT, TAX_LOT_CLEANUP, DEPOSIT_STATUS_UPDATE, ASSET_MIGRATION_UPDATE, PLACE_CRYPTO_ORDER_ERROR};
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

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends TypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.ActivitySnapshotDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ActivitySnapshotDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.CRYPTO_ORDER", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_ORDER extends TypeDto {
            CRYPTO_ORDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CRYPTO_ORDER;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.HOLDING_ADJUSTMENT", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOLDING_ADJUSTMENT extends TypeDto {
            HOLDING_ADJUSTMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.HOLDING_ADJUSTMENT;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.CURRENCY_PAIR_UPDATE", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_UPDATE extends TypeDto {
            CURRENCY_PAIR_UPDATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CURRENCY_PAIR_UPDATE;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.NEW_CRYPTO_ACCOUNT", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW_CRYPTO_ACCOUNT extends TypeDto {
            NEW_CRYPTO_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.NEW_CRYPTO_ACCOUNT;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.CRYPTO_FIRM_ORDER", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_FIRM_ORDER extends TypeDto {
            CRYPTO_FIRM_ORDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CRYPTO_FIRM_ORDER;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.TAX_LOT_EARMARK_REQUEST", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TAX_LOT_EARMARK_REQUEST extends TypeDto {
            TAX_LOT_EARMARK_REQUEST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.TAX_LOT_EARMARK_REQUEST;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.TAX_LOT_UPDATE_EVENT", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class TAX_LOT_UPDATE_EVENT extends TypeDto {
            TAX_LOT_UPDATE_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.TAX_LOT_UPDATE_EVENT;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.TAX_LOT_CLEANUP", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class TAX_LOT_CLEANUP extends TypeDto {
            TAX_LOT_CLEANUP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.TAX_LOT_CLEANUP;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.DEPOSIT_STATUS_UPDATE", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class DEPOSIT_STATUS_UPDATE extends TypeDto {
            DEPOSIT_STATUS_UPDATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.DEPOSIT_STATUS_UPDATE;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.ASSET_MIGRATION_UPDATE", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ASSET_MIGRATION_UPDATE extends TypeDto {
            ASSET_MIGRATION_UPDATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ASSET_MIGRATION_UPDATE;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.TypeDto.PLACE_CRYPTO_ORDER_ERROR", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PLACE_CRYPTO_ORDER_ERROR extends TypeDto {
            PLACE_CRYPTO_ORDER_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.PLACE_CRYPTO_ORDER_ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, ActivitySnapshot.Type> {

            /* compiled from: ActivitySnapshotDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ActivitySnapshot.Type.values().length];
                    try {
                        iArr[ActivitySnapshot.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CRYPTO_ORDER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.HOLDING_ADJUSTMENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CURRENCY_PAIR_UPDATE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.NEW_CRYPTO_ACCOUNT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CRYPTO_FIRM_ORDER.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.TAX_LOT_EARMARK_REQUEST.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.TAX_LOT_UPDATE_EVENT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.TAX_LOT_CLEANUP.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.DEPOSIT_STATUS_UPDATE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ASSET_MIGRATION_UPDATE.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.PLACE_CRYPTO_ORDER_ERROR.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
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
            public ProtoAdapter<ActivitySnapshot.Type> getProtoAdapter() {
                return ActivitySnapshot.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(ActivitySnapshot.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TypeDto.TYPE_UNSPECIFIED;
                    case 2:
                        return TypeDto.CRYPTO_ORDER;
                    case 3:
                        return TypeDto.HOLDING_ADJUSTMENT;
                    case 4:
                        return TypeDto.CURRENCY_PAIR_UPDATE;
                    case 5:
                        return TypeDto.NEW_CRYPTO_ACCOUNT;
                    case 6:
                        return TypeDto.CRYPTO_FIRM_ORDER;
                    case 7:
                        return TypeDto.TAX_LOT_EARMARK_REQUEST;
                    case 8:
                        return TypeDto.TAX_LOT_UPDATE_EVENT;
                    case 9:
                        return TypeDto.TAX_LOT_CLEANUP;
                    case 10:
                        return TypeDto.DEPOSIT_STATUS_UPDATE;
                    case 11:
                        return TypeDto.ASSET_MIGRATION_UPDATE;
                    case 12:
                        return TypeDto.PLACE_CRYPTO_ORDER_ERROR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, ActivitySnapshot.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.ActivitySnapshot.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "REGION_UNSPECIFIED", CountryCode.COUNTRY_CODE_US, "EU", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class RegionDto implements Dto2<ActivitySnapshot.Region>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RegionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RegionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RegionDto, ActivitySnapshot.Region>> binaryBase64Serializer$delegate;
        public static final RegionDto REGION_UNSPECIFIED = new REGION_UNSPECIFIED("REGION_UNSPECIFIED", 0);

        /* renamed from: US */
        public static final RegionDto f6185US = new C37260US(CountryCode.COUNTRY_CODE_US, 1);

        /* renamed from: EU */
        public static final RegionDto f6184EU = new C37259EU("EU", 2);

        private static final /* synthetic */ RegionDto[] $values() {
            return new RegionDto[]{REGION_UNSPECIFIED, f6185US, f6184EU};
        }

        public /* synthetic */ RegionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RegionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.RegionDto.REGION_UNSPECIFIED", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REGION_UNSPECIFIED extends RegionDto {
            REGION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Region toProto() {
                return ActivitySnapshot.Region.REGION_UNSPECIFIED;
            }
        }

        private RegionDto(String str, int i) {
        }

        static {
            RegionDto[] regionDtoArr$values = $values();
            $VALUES = regionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(regionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.ActivitySnapshotDto$RegionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ActivitySnapshotDto.RegionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.RegionDto.US", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.nummus.ActivitySnapshotDto$RegionDto$US */
        static final class C37260US extends RegionDto {
            C37260US(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Region toProto() {
                return ActivitySnapshot.Region.f6183US;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/ActivitySnapshotDto.RegionDto.EU", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "toProto", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.nummus.ActivitySnapshotDto$RegionDto$EU */
        static final class C37259EU extends RegionDto {
            C37259EU(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Region toProto() {
                return ActivitySnapshot.Region.f6182EU;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RegionDto, ActivitySnapshot.Region> {

            /* compiled from: ActivitySnapshotDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ActivitySnapshot.Region.values().length];
                    try {
                        iArr[ActivitySnapshot.Region.REGION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ActivitySnapshot.Region.f6183US.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ActivitySnapshot.Region.f6182EU.ordinal()] = 3;
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

            public final KSerializer<RegionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RegionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RegionDto> getBinaryBase64Serializer() {
                return (KSerializer) RegionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ActivitySnapshot.Region> getProtoAdapter() {
                return ActivitySnapshot.Region.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RegionDto getZeroValue() {
                return RegionDto.REGION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RegionDto fromProto(ActivitySnapshot.Region proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RegionDto.REGION_UNSPECIFIED;
                }
                if (i == 2) {
                    return RegionDto.f6185US;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return RegionDto.f6184EU;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$RegionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<RegionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RegionDto, ActivitySnapshot.Region> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.ActivitySnapshot.Region", RegionDto.getEntries(), RegionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RegionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RegionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RegionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RegionDto valueOf(String str) {
            return (RegionDto) Enum.valueOf(RegionDto.class, str);
        }

        public static RegionDto[] values() {
            return (RegionDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ActivitySnapshotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.nummus.ActivitySnapshot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActivitySnapshotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActivitySnapshotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActivitySnapshotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.nummus.ActivitySnapshotDto";
        }
    }
}
