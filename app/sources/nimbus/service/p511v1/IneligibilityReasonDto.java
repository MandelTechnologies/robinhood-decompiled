package nimbus.service.p511v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IneligibilityReasonDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\"#B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006$"}, m3636d2 = {"Lnimbus/service/v1/IneligibilityReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lnimbus/service/v1/IneligibilityReason;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "INELIGIBILITY_REASON_UNSPECIFIED", "INELIGIBILITY_REASON_NONE", "INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", "INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED", "INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", "INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED", "INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED", "INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", "INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", "INELIGIBILITY_REASON_INSTANT_CHECK_FAILED", "INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED", "INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", "INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE", "INELIGIBILITY_REASON_EMPTY_TRANSFER", "INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", "INELIGIBILITY_REASON_OTHER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class IneligibilityReasonDto implements Dto2<IneligibilityReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IneligibilityReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<IneligibilityReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IneligibilityReasonDto, IneligibilityReason>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_UNSPECIFIED = new IneligibilityReasonDto("INELIGIBILITY_REASON_UNSPECIFIED", 0) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_NONE = new IneligibilityReasonDto("INELIGIBILITY_REASON_NONE", 1) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_NONE
        {
            String str = ApiRenderablePlatforms.VERSIONS_NONE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_NONE;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", 2) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED
        {
            String str = "2k_minimum_equity_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED", 3) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED
        {
            String str = "pdt_25k_minimum_equity_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", 4) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED
        {
            String str = "maintenance_excess_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED", 5) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED
        {
            String str = "borrowing_limit_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED", 6) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED
        {
            String str = "transfer_limit_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", 7) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED
        {
            String str = "unsettled_positions_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE = new IneligibilityReasonDto("INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", 8) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE
        {
            String str = "negative_transfer_market_value";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_INSTANT_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_INSTANT_CHECK_FAILED", 9) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_INSTANT_CHECK_FAILED
        {
            String str = "instant_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_INSTANT_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED = new IneligibilityReasonDto("INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED", 10) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED
        {
            String str = "transfer_count_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED = new IneligibilityReasonDto("INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", 11) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED
        {
            String str = "managed_account_instrument_not_allowed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE = new IneligibilityReasonDto("INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE", 12) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE
        {
            String str = "instrument_not_transferable";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_EMPTY_TRANSFER = new IneligibilityReasonDto("INELIGIBILITY_REASON_EMPTY_TRANSFER", 13) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_EMPTY_TRANSFER
        {
            String str = "empty_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_EMPTY_TRANSFER;
        }
    };

    /* renamed from: INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED */
    public static final IneligibilityReasonDto f7135x994b2b1e = new IneligibilityReasonDto("INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", 14) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED
        {
            String str = "managed_account_funding_transfer_value_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.f7134x994b2b1e;
        }
    };
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_OTHER = new IneligibilityReasonDto("INELIGIBILITY_REASON_OTHER", 15) { // from class: nimbus.service.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_OTHER
        {
            String str = "other";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_OTHER;
        }
    };

    private static final /* synthetic */ IneligibilityReasonDto[] $values() {
        return new IneligibilityReasonDto[]{INELIGIBILITY_REASON_UNSPECIFIED, INELIGIBILITY_REASON_NONE, INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED, INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED, INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED, INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED, INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED, INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED, INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE, INELIGIBILITY_REASON_INSTANT_CHECK_FAILED, INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED, INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED, INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE, INELIGIBILITY_REASON_EMPTY_TRANSFER, f7135x994b2b1e, INELIGIBILITY_REASON_OTHER};
    }

    public /* synthetic */ IneligibilityReasonDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<IneligibilityReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IneligibilityReasonDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        IneligibilityReasonDto[] ineligibilityReasonDtoArr$values = $values();
        $VALUES = ineligibilityReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ineligibilityReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.IneligibilityReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IneligibilityReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: IneligibilityReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/IneligibilityReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnimbus/service/v1/IneligibilityReasonDto;", "Lnimbus/service/v1/IneligibilityReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/IneligibilityReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<IneligibilityReasonDto, IneligibilityReason> {

        /* compiled from: IneligibilityReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IneligibilityReason.values().length];
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_NONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_INSTANT_CHECK_FAILED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_EMPTY_TRANSFER.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[IneligibilityReason.f7134x994b2b1e.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_OTHER.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IneligibilityReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IneligibilityReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IneligibilityReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) IneligibilityReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IneligibilityReason> getProtoAdapter() {
            return IneligibilityReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IneligibilityReasonDto getZeroValue() {
            return IneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IneligibilityReasonDto fromProto(IneligibilityReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED;
                case 2:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_NONE;
                case 3:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
                case 4:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED;
                case 5:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;
                case 6:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED;
                case 7:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED;
                case 8:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
                case 9:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
                case 10:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_INSTANT_CHECK_FAILED;
                case 11:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED;
                case 12:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
                case 13:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE;
                case 14:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_EMPTY_TRANSFER;
                case 15:
                    return IneligibilityReasonDto.f7135x994b2b1e;
                case 16:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_OTHER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IneligibilityReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnimbus/service/v1/IneligibilityReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/IneligibilityReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<IneligibilityReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<IneligibilityReasonDto, IneligibilityReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nimbus.service.v1.IneligibilityReason", IneligibilityReasonDto.getEntries(), IneligibilityReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public IneligibilityReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (IneligibilityReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IneligibilityReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static IneligibilityReasonDto valueOf(String str) {
        return (IneligibilityReasonDto) Enum.valueOf(IneligibilityReasonDto.class, str);
    }

    public static IneligibilityReasonDto[] values() {
        return (IneligibilityReasonDto[]) $VALUES.clone();
    }
}
