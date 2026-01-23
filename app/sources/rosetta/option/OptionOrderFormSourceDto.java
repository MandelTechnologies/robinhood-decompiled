package rosetta.option;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.equities.contracts.ScreenerTableKeys2;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
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
/* compiled from: OptionOrderFormSourceDto.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002&'B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006("}, m3636d2 = {"Lrosetta/option/OptionOrderFormSourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/option/OptionOrderFormSource;", "Landroid/os/Parcelable;", "", "auto_values", "", "db_enum", "", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;)V", "getAuto_values", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDb_enum", "()Ljava/lang/String;", "OPTION_ORDER_FORM_SOURCE_UNSPECIFIED", "OPTION_CHAIN", "INSTRUMENT_DETAIL", "AGGREGATE_POSITION_DETAIL", "STRATEGY_DETAIL", "ORDER_DETAIL", "ACTIVITY_ITEM", "STRATEGY_ROLL", "STRATEGY_CHAIN", "SIMULATED_RETURNS", "HOME_TAB", "ASSET_HOME", "RETIREMENT_HOME", "ORDER_FORM_FLYOVER", "SOCIAL_POST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class OptionOrderFormSourceDto implements Dto2<OptionOrderFormSource>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOrderFormSourceDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OptionOrderFormSourceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionOrderFormSourceDto, OptionOrderFormSource>> binaryBase64Serializer$delegate;
    private final Boolean auto_values;
    private final String db_enum;
    public static final OptionOrderFormSourceDto OPTION_ORDER_FORM_SOURCE_UNSPECIFIED = new OptionOrderFormSourceDto("OPTION_ORDER_FORM_SOURCE_UNSPECIFIED", 0) { // from class: rosetta.option.OptionOrderFormSourceDto.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED
        {
            Boolean bool = Boolean.FALSE;
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
        }
    };
    public static final OptionOrderFormSourceDto OPTION_CHAIN = new OptionOrderFormSourceDto("OPTION_CHAIN", 1) { // from class: rosetta.option.OptionOrderFormSourceDto.OPTION_CHAIN
        {
            Boolean bool = Boolean.TRUE;
            String str = "option_chain";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.OPTION_CHAIN;
        }
    };
    public static final OptionOrderFormSourceDto INSTRUMENT_DETAIL = new OptionOrderFormSourceDto("INSTRUMENT_DETAIL", 2) { // from class: rosetta.option.OptionOrderFormSourceDto.INSTRUMENT_DETAIL
        {
            Boolean bool = Boolean.TRUE;
            String str = "instrument_detail";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.INSTRUMENT_DETAIL;
        }
    };
    public static final OptionOrderFormSourceDto AGGREGATE_POSITION_DETAIL = new OptionOrderFormSourceDto("AGGREGATE_POSITION_DETAIL", 3) { // from class: rosetta.option.OptionOrderFormSourceDto.AGGREGATE_POSITION_DETAIL
        {
            Boolean bool = Boolean.TRUE;
            String str = "aggregate_position_detail";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.AGGREGATE_POSITION_DETAIL;
        }
    };
    public static final OptionOrderFormSourceDto STRATEGY_DETAIL = new OptionOrderFormSourceDto("STRATEGY_DETAIL", 4) { // from class: rosetta.option.OptionOrderFormSourceDto.STRATEGY_DETAIL
        {
            Boolean bool = Boolean.TRUE;
            String str = "strategy_detail";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.STRATEGY_DETAIL;
        }
    };
    public static final OptionOrderFormSourceDto ORDER_DETAIL = new OptionOrderFormSourceDto("ORDER_DETAIL", 5) { // from class: rosetta.option.OptionOrderFormSourceDto.ORDER_DETAIL
        {
            Boolean bool = Boolean.TRUE;
            String str = CryptoDetailSource.ORDER_DETAIL;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.ORDER_DETAIL;
        }
    };
    public static final OptionOrderFormSourceDto ACTIVITY_ITEM = new OptionOrderFormSourceDto("ACTIVITY_ITEM", 6) { // from class: rosetta.option.OptionOrderFormSourceDto.ACTIVITY_ITEM
        {
            Boolean bool = Boolean.TRUE;
            String str = "activity_item";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.ACTIVITY_ITEM;
        }
    };
    public static final OptionOrderFormSourceDto STRATEGY_ROLL = new OptionOrderFormSourceDto("STRATEGY_ROLL", 7) { // from class: rosetta.option.OptionOrderFormSourceDto.STRATEGY_ROLL
        {
            Boolean bool = Boolean.TRUE;
            String str = "strategy_roll";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.STRATEGY_ROLL;
        }
    };
    public static final OptionOrderFormSourceDto STRATEGY_CHAIN = new OptionOrderFormSourceDto("STRATEGY_CHAIN", 8) { // from class: rosetta.option.OptionOrderFormSourceDto.STRATEGY_CHAIN
        {
            Boolean bool = Boolean.TRUE;
            String str = "strategy_chain";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.STRATEGY_CHAIN;
        }
    };
    public static final OptionOrderFormSourceDto SIMULATED_RETURNS = new OptionOrderFormSourceDto("SIMULATED_RETURNS", 9) { // from class: rosetta.option.OptionOrderFormSourceDto.SIMULATED_RETURNS
        {
            Boolean bool = Boolean.TRUE;
            String str = "simulated_returns";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.SIMULATED_RETURNS;
        }
    };
    public static final OptionOrderFormSourceDto HOME_TAB = new OptionOrderFormSourceDto("HOME_TAB", 10) { // from class: rosetta.option.OptionOrderFormSourceDto.HOME_TAB
        {
            Boolean bool = Boolean.TRUE;
            String str = "home_tab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.HOME_TAB;
        }
    };
    public static final OptionOrderFormSourceDto ASSET_HOME = new OptionOrderFormSourceDto("ASSET_HOME", 11) { // from class: rosetta.option.OptionOrderFormSourceDto.ASSET_HOME
        {
            Boolean bool = Boolean.TRUE;
            String str = ScreenerTableKeys2.AssetHome;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.ASSET_HOME;
        }
    };
    public static final OptionOrderFormSourceDto RETIREMENT_HOME = new OptionOrderFormSourceDto("RETIREMENT_HOME", 12) { // from class: rosetta.option.OptionOrderFormSourceDto.RETIREMENT_HOME
        {
            Boolean bool = Boolean.TRUE;
            String str = "retirement_home";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.RETIREMENT_HOME;
        }
    };
    public static final OptionOrderFormSourceDto ORDER_FORM_FLYOVER = new OptionOrderFormSourceDto("ORDER_FORM_FLYOVER", 13) { // from class: rosetta.option.OptionOrderFormSourceDto.ORDER_FORM_FLYOVER
        {
            Boolean bool = Boolean.TRUE;
            String str = "order_form_flyover";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.ORDER_FORM_FLYOVER;
        }
    };
    public static final OptionOrderFormSourceDto SOCIAL_POST = new OptionOrderFormSourceDto("SOCIAL_POST", 14) { // from class: rosetta.option.OptionOrderFormSourceDto.SOCIAL_POST
        {
            Boolean bool = Boolean.TRUE;
            String str = "social_post";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionOrderFormSource toProto() {
            return OptionOrderFormSource.SOCIAL_POST;
        }
    };

    private static final /* synthetic */ OptionOrderFormSourceDto[] $values() {
        return new OptionOrderFormSourceDto[]{OPTION_ORDER_FORM_SOURCE_UNSPECIFIED, OPTION_CHAIN, INSTRUMENT_DETAIL, AGGREGATE_POSITION_DETAIL, STRATEGY_DETAIL, ORDER_DETAIL, ACTIVITY_ITEM, STRATEGY_ROLL, STRATEGY_CHAIN, SIMULATED_RETURNS, HOME_TAB, ASSET_HOME, RETIREMENT_HOME, ORDER_FORM_FLYOVER, SOCIAL_POST};
    }

    public /* synthetic */ OptionOrderFormSourceDto(String str, int i, Boolean bool, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, bool, str2);
    }

    public static EnumEntries<OptionOrderFormSourceDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionOrderFormSourceDto(String str, int i, Boolean bool, String str2) {
        this.auto_values = bool;
        this.db_enum = str2;
    }

    public final Boolean getAuto_values() {
        return this.auto_values;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        OptionOrderFormSourceDto[] optionOrderFormSourceDtoArr$values = $values();
        $VALUES = optionOrderFormSourceDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOrderFormSourceDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.option.OptionOrderFormSourceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFormSourceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OptionOrderFormSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/option/OptionOrderFormSourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/option/OptionOrderFormSourceDto;", "Lrosetta/option/OptionOrderFormSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/option/OptionOrderFormSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OptionOrderFormSourceDto, OptionOrderFormSource> {

        /* compiled from: OptionOrderFormSourceDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionOrderFormSource.values().length];
                try {
                    iArr[OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionOrderFormSource.OPTION_CHAIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OptionOrderFormSource.INSTRUMENT_DETAIL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OptionOrderFormSource.AGGREGATE_POSITION_DETAIL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OptionOrderFormSource.STRATEGY_DETAIL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OptionOrderFormSource.ORDER_DETAIL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OptionOrderFormSource.ACTIVITY_ITEM.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OptionOrderFormSource.STRATEGY_ROLL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OptionOrderFormSource.STRATEGY_CHAIN.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[OptionOrderFormSource.SIMULATED_RETURNS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[OptionOrderFormSource.HOME_TAB.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[OptionOrderFormSource.ASSET_HOME.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[OptionOrderFormSource.RETIREMENT_HOME.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[OptionOrderFormSource.ORDER_FORM_FLYOVER.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[OptionOrderFormSource.SOCIAL_POST.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionOrderFormSourceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderFormSourceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderFormSourceDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionOrderFormSourceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionOrderFormSource> getProtoAdapter() {
            return OptionOrderFormSource.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderFormSourceDto getZeroValue() {
            return OptionOrderFormSourceDto.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderFormSourceDto fromProto(OptionOrderFormSource proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return OptionOrderFormSourceDto.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
                case 2:
                    return OptionOrderFormSourceDto.OPTION_CHAIN;
                case 3:
                    return OptionOrderFormSourceDto.INSTRUMENT_DETAIL;
                case 4:
                    return OptionOrderFormSourceDto.AGGREGATE_POSITION_DETAIL;
                case 5:
                    return OptionOrderFormSourceDto.STRATEGY_DETAIL;
                case 6:
                    return OptionOrderFormSourceDto.ORDER_DETAIL;
                case 7:
                    return OptionOrderFormSourceDto.ACTIVITY_ITEM;
                case 8:
                    return OptionOrderFormSourceDto.STRATEGY_ROLL;
                case 9:
                    return OptionOrderFormSourceDto.STRATEGY_CHAIN;
                case 10:
                    return OptionOrderFormSourceDto.SIMULATED_RETURNS;
                case 11:
                    return OptionOrderFormSourceDto.HOME_TAB;
                case 12:
                    return OptionOrderFormSourceDto.ASSET_HOME;
                case 13:
                    return OptionOrderFormSourceDto.RETIREMENT_HOME;
                case 14:
                    return OptionOrderFormSourceDto.ORDER_FORM_FLYOVER;
                case 15:
                    return OptionOrderFormSourceDto.SOCIAL_POST;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionOrderFormSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/option/OptionOrderFormSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/option/OptionOrderFormSourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<OptionOrderFormSourceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OptionOrderFormSourceDto, OptionOrderFormSource> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.option.OptionOrderFormSource", OptionOrderFormSourceDto.getEntries(), OptionOrderFormSourceDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OptionOrderFormSourceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OptionOrderFormSourceDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionOrderFormSourceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OptionOrderFormSourceDto valueOf(String str) {
        return (OptionOrderFormSourceDto) Enum.valueOf(OptionOrderFormSourceDto.class, str);
    }

    public static OptionOrderFormSourceDto[] values() {
        return (OptionOrderFormSourceDto[]) $VALUES.clone();
    }
}
