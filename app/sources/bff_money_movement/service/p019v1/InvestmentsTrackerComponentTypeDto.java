package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
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
/* compiled from: InvestmentsTrackerComponentTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "BUTTON", "UPSELL", "CATEGORY_SECTION", "METADATA", "STOCK_CELL", "GET_STARTED", "PERFORMANCE_CHART", "MANAGE_EXTERNAL_ACCOUNTS", "CATEGORY_PERCENTAGE_CELL", "ALLOCATIONS_BAR", "UPSELL_CARD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public abstract class InvestmentsTrackerComponentTypeDto implements Dto2<InvestmentsTrackerComponentType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerComponentTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerComponentTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerComponentTypeDto, InvestmentsTrackerComponentType>> binaryBase64Serializer$delegate;
    public static final InvestmentsTrackerComponentTypeDto TYPE_UNSPECIFIED = new InvestmentsTrackerComponentTypeDto("TYPE_UNSPECIFIED", 0) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.TYPE_UNSPECIFIED;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto BUTTON = new InvestmentsTrackerComponentTypeDto("BUTTON", 1) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.BUTTON
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.BUTTON;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto UPSELL = new InvestmentsTrackerComponentTypeDto("UPSELL", 2) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.UPSELL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.UPSELL;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto CATEGORY_SECTION = new InvestmentsTrackerComponentTypeDto("CATEGORY_SECTION", 3) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.CATEGORY_SECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.CATEGORY_SECTION;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto METADATA = new InvestmentsTrackerComponentTypeDto("METADATA", 4) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.METADATA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.METADATA;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto STOCK_CELL = new InvestmentsTrackerComponentTypeDto("STOCK_CELL", 5) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.STOCK_CELL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.STOCK_CELL;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto GET_STARTED = new InvestmentsTrackerComponentTypeDto("GET_STARTED", 6) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.GET_STARTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.GET_STARTED;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto PERFORMANCE_CHART = new InvestmentsTrackerComponentTypeDto("PERFORMANCE_CHART", 7) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.PERFORMANCE_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.PERFORMANCE_CHART;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto MANAGE_EXTERNAL_ACCOUNTS = new InvestmentsTrackerComponentTypeDto("MANAGE_EXTERNAL_ACCOUNTS", 8) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.MANAGE_EXTERNAL_ACCOUNTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.MANAGE_EXTERNAL_ACCOUNTS;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto CATEGORY_PERCENTAGE_CELL = new InvestmentsTrackerComponentTypeDto("CATEGORY_PERCENTAGE_CELL", 9) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.CATEGORY_PERCENTAGE_CELL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE_CELL;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto ALLOCATIONS_BAR = new InvestmentsTrackerComponentTypeDto("ALLOCATIONS_BAR", 10) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.ALLOCATIONS_BAR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.ALLOCATIONS_BAR;
        }
    };
    public static final InvestmentsTrackerComponentTypeDto UPSELL_CARD = new InvestmentsTrackerComponentTypeDto("UPSELL_CARD", 11) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto.UPSELL_CARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerComponentType toProto() {
            return InvestmentsTrackerComponentType.UPSELL_CARD;
        }
    };

    private static final /* synthetic */ InvestmentsTrackerComponentTypeDto[] $values() {
        return new InvestmentsTrackerComponentTypeDto[]{TYPE_UNSPECIFIED, BUTTON, UPSELL, CATEGORY_SECTION, METADATA, STOCK_CELL, GET_STARTED, PERFORMANCE_CHART, MANAGE_EXTERNAL_ACCOUNTS, CATEGORY_PERCENTAGE_CELL, ALLOCATIONS_BAR, UPSELL_CARD};
    }

    public /* synthetic */ InvestmentsTrackerComponentTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<InvestmentsTrackerComponentTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerComponentTypeDto(String str, int i) {
    }

    static {
        InvestmentsTrackerComponentTypeDto[] investmentsTrackerComponentTypeDtoArr$values = $values();
        $VALUES = investmentsTrackerComponentTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerComponentTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: InvestmentsTrackerComponentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<InvestmentsTrackerComponentTypeDto, InvestmentsTrackerComponentType> {

        /* compiled from: InvestmentsTrackerComponentTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InvestmentsTrackerComponentType.values().length];
                try {
                    iArr[InvestmentsTrackerComponentType.TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.BUTTON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.UPSELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.CATEGORY_SECTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.METADATA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.STOCK_CELL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.GET_STARTED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.PERFORMANCE_CHART.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.MANAGE_EXTERNAL_ACCOUNTS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE_CELL.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.ALLOCATIONS_BAR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[InvestmentsTrackerComponentType.UPSELL_CARD.ordinal()] = 12;
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

        public final KSerializer<InvestmentsTrackerComponentTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerComponentTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponentType> getProtoAdapter() {
            return InvestmentsTrackerComponentType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentTypeDto getZeroValue() {
            return InvestmentsTrackerComponentTypeDto.TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentTypeDto fromProto(InvestmentsTrackerComponentType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return InvestmentsTrackerComponentTypeDto.TYPE_UNSPECIFIED;
                case 2:
                    return InvestmentsTrackerComponentTypeDto.BUTTON;
                case 3:
                    return InvestmentsTrackerComponentTypeDto.UPSELL;
                case 4:
                    return InvestmentsTrackerComponentTypeDto.CATEGORY_SECTION;
                case 5:
                    return InvestmentsTrackerComponentTypeDto.METADATA;
                case 6:
                    return InvestmentsTrackerComponentTypeDto.STOCK_CELL;
                case 7:
                    return InvestmentsTrackerComponentTypeDto.GET_STARTED;
                case 8:
                    return InvestmentsTrackerComponentTypeDto.PERFORMANCE_CHART;
                case 9:
                    return InvestmentsTrackerComponentTypeDto.MANAGE_EXTERNAL_ACCOUNTS;
                case 10:
                    return InvestmentsTrackerComponentTypeDto.CATEGORY_PERCENTAGE_CELL;
                case 11:
                    return InvestmentsTrackerComponentTypeDto.ALLOCATIONS_BAR;
                case 12:
                    return InvestmentsTrackerComponentTypeDto.UPSELL_CARD;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerComponentTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<InvestmentsTrackerComponentTypeDto, InvestmentsTrackerComponentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponentType", InvestmentsTrackerComponentTypeDto.getEntries(), InvestmentsTrackerComponentTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerComponentTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (InvestmentsTrackerComponentTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerComponentTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static InvestmentsTrackerComponentTypeDto valueOf(String str) {
        return (InvestmentsTrackerComponentTypeDto) Enum.valueOf(InvestmentsTrackerComponentTypeDto.class, str);
    }

    public static InvestmentsTrackerComponentTypeDto[] values() {
        return (InvestmentsTrackerComponentTypeDto[]) $VALUES.clone();
    }
}
