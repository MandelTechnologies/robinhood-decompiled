package equity_trading_tax_lots.proto.p460v1;

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
/* compiled from: SelectionStrategyDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "Lcom/robinhood/idl/EnumDto;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SELECTION_STRATEGY_UNSPECIFIED", "SELECTION_STRATEGY_FIRST_IN", "SELECTION_STRATEGY_LAST_IN", "SELECTION_STRATEGY_HIGHEST_COST", "SELECTION_STRATEGY_LOWEST_COST", "SELECTION_STRATEGY_CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class SelectionStrategyDto implements Dto2<SelectionStrategy>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectionStrategyDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<SelectionStrategyDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SelectionStrategyDto, SelectionStrategy>> binaryBase64Serializer$delegate;
    public static final SelectionStrategyDto SELECTION_STRATEGY_UNSPECIFIED = new SelectionStrategyDto("SELECTION_STRATEGY_UNSPECIFIED", 0) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto.SELECTION_STRATEGY_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SelectionStrategy toProto() {
            return SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
        }
    };
    public static final SelectionStrategyDto SELECTION_STRATEGY_FIRST_IN = new SelectionStrategyDto("SELECTION_STRATEGY_FIRST_IN", 1) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto.SELECTION_STRATEGY_FIRST_IN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SelectionStrategy toProto() {
            return SelectionStrategy.SELECTION_STRATEGY_FIRST_IN;
        }
    };
    public static final SelectionStrategyDto SELECTION_STRATEGY_LAST_IN = new SelectionStrategyDto("SELECTION_STRATEGY_LAST_IN", 2) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto.SELECTION_STRATEGY_LAST_IN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SelectionStrategy toProto() {
            return SelectionStrategy.SELECTION_STRATEGY_LAST_IN;
        }
    };
    public static final SelectionStrategyDto SELECTION_STRATEGY_HIGHEST_COST = new SelectionStrategyDto("SELECTION_STRATEGY_HIGHEST_COST", 3) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto.SELECTION_STRATEGY_HIGHEST_COST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SelectionStrategy toProto() {
            return SelectionStrategy.SELECTION_STRATEGY_HIGHEST_COST;
        }
    };
    public static final SelectionStrategyDto SELECTION_STRATEGY_LOWEST_COST = new SelectionStrategyDto("SELECTION_STRATEGY_LOWEST_COST", 4) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto.SELECTION_STRATEGY_LOWEST_COST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SelectionStrategy toProto() {
            return SelectionStrategy.SELECTION_STRATEGY_LOWEST_COST;
        }
    };
    public static final SelectionStrategyDto SELECTION_STRATEGY_CUSTOM = new SelectionStrategyDto("SELECTION_STRATEGY_CUSTOM", 5) { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto.SELECTION_STRATEGY_CUSTOM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SelectionStrategy toProto() {
            return SelectionStrategy.SELECTION_STRATEGY_CUSTOM;
        }
    };

    private static final /* synthetic */ SelectionStrategyDto[] $values() {
        return new SelectionStrategyDto[]{SELECTION_STRATEGY_UNSPECIFIED, SELECTION_STRATEGY_FIRST_IN, SELECTION_STRATEGY_LAST_IN, SELECTION_STRATEGY_HIGHEST_COST, SELECTION_STRATEGY_LOWEST_COST, SELECTION_STRATEGY_CUSTOM};
    }

    public /* synthetic */ SelectionStrategyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<SelectionStrategyDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SelectionStrategyDto(String str, int i) {
    }

    static {
        SelectionStrategyDto[] selectionStrategyDtoArr$values = $values();
        $VALUES = selectionStrategyDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(selectionStrategyDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategyDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectionStrategyDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: SelectionStrategyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<SelectionStrategyDto, SelectionStrategy> {

        /* compiled from: SelectionStrategyDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SelectionStrategy.values().length];
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_FIRST_IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_LAST_IN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_HIGHEST_COST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_LOWEST_COST.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_CUSTOM.ordinal()] = 6;
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

        public final KSerializer<SelectionStrategyDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SelectionStrategyDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SelectionStrategyDto> getBinaryBase64Serializer() {
            return (KSerializer) SelectionStrategyDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SelectionStrategy> getProtoAdapter() {
            return SelectionStrategy.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SelectionStrategyDto getZeroValue() {
            return SelectionStrategyDto.SELECTION_STRATEGY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SelectionStrategyDto fromProto(SelectionStrategy proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return SelectionStrategyDto.SELECTION_STRATEGY_UNSPECIFIED;
                case 2:
                    return SelectionStrategyDto.SELECTION_STRATEGY_FIRST_IN;
                case 3:
                    return SelectionStrategyDto.SELECTION_STRATEGY_LAST_IN;
                case 4:
                    return SelectionStrategyDto.SELECTION_STRATEGY_HIGHEST_COST;
                case 5:
                    return SelectionStrategyDto.SELECTION_STRATEGY_LOWEST_COST;
                case 6:
                    return SelectionStrategyDto.SELECTION_STRATEGY_CUSTOM;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SelectionStrategyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<SelectionStrategyDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<SelectionStrategyDto, SelectionStrategy> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/equity_trading_tax_lots.proto.v1.SelectionStrategy", SelectionStrategyDto.getEntries(), SelectionStrategyDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public SelectionStrategyDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (SelectionStrategyDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SelectionStrategyDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static SelectionStrategyDto valueOf(String str) {
        return (SelectionStrategyDto) Enum.valueOf(SelectionStrategyDto.class, str);
    }

    public static SelectionStrategyDto[] values() {
        return (SelectionStrategyDto[]) $VALUES.clone();
    }
}
