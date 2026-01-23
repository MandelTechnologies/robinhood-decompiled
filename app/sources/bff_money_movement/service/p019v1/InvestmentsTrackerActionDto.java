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
/* compiled from: InvestmentsTrackerActionDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_UNSPECIFIED", "TRANSFER_BUTTON", "UPSELL_RETIREMENT", "ACCOUNT_CLICKED", "GET_STARTED_ACTION", "CONNECT_ROW_CLICKED", "CONNECT_ROW_CLICKED_BANK_ACCOUNT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public abstract class InvestmentsTrackerActionDto implements Dto2<InvestmentsTrackerAction>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerActionDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerActionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerActionDto, InvestmentsTrackerAction>> binaryBase64Serializer$delegate;
    public static final InvestmentsTrackerActionDto ACTION_UNSPECIFIED = new InvestmentsTrackerActionDto("ACTION_UNSPECIFIED", 0) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.ACTION_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.ACTION_UNSPECIFIED;
        }
    };
    public static final InvestmentsTrackerActionDto TRANSFER_BUTTON = new InvestmentsTrackerActionDto("TRANSFER_BUTTON", 1) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.TRANSFER_BUTTON
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.TRANSFER_BUTTON;
        }
    };
    public static final InvestmentsTrackerActionDto UPSELL_RETIREMENT = new InvestmentsTrackerActionDto("UPSELL_RETIREMENT", 2) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.UPSELL_RETIREMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.UPSELL_RETIREMENT;
        }
    };
    public static final InvestmentsTrackerActionDto ACCOUNT_CLICKED = new InvestmentsTrackerActionDto("ACCOUNT_CLICKED", 3) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.ACCOUNT_CLICKED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.ACCOUNT_CLICKED;
        }
    };
    public static final InvestmentsTrackerActionDto GET_STARTED_ACTION = new InvestmentsTrackerActionDto("GET_STARTED_ACTION", 4) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.GET_STARTED_ACTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.GET_STARTED_ACTION;
        }
    };
    public static final InvestmentsTrackerActionDto CONNECT_ROW_CLICKED = new InvestmentsTrackerActionDto("CONNECT_ROW_CLICKED", 5) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.CONNECT_ROW_CLICKED;
        }
    };
    public static final InvestmentsTrackerActionDto CONNECT_ROW_CLICKED_BANK_ACCOUNT = new InvestmentsTrackerActionDto("CONNECT_ROW_CLICKED_BANK_ACCOUNT", 6) { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED_BANK_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InvestmentsTrackerAction toProto() {
            return InvestmentsTrackerAction.CONNECT_ROW_CLICKED_BANK_ACCOUNT;
        }
    };

    private static final /* synthetic */ InvestmentsTrackerActionDto[] $values() {
        return new InvestmentsTrackerActionDto[]{ACTION_UNSPECIFIED, TRANSFER_BUTTON, UPSELL_RETIREMENT, ACCOUNT_CLICKED, GET_STARTED_ACTION, CONNECT_ROW_CLICKED, CONNECT_ROW_CLICKED_BANK_ACCOUNT};
    }

    public /* synthetic */ InvestmentsTrackerActionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<InvestmentsTrackerActionDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerActionDto(String str, int i) {
    }

    static {
        InvestmentsTrackerActionDto[] investmentsTrackerActionDtoArr$values = $values();
        $VALUES = investmentsTrackerActionDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerActionDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerActionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerActionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: InvestmentsTrackerActionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerActionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<InvestmentsTrackerActionDto, InvestmentsTrackerAction> {

        /* compiled from: InvestmentsTrackerActionDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InvestmentsTrackerAction.values().length];
                try {
                    iArr[InvestmentsTrackerAction.ACTION_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InvestmentsTrackerAction.TRANSFER_BUTTON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InvestmentsTrackerAction.UPSELL_RETIREMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InvestmentsTrackerAction.ACCOUNT_CLICKED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InvestmentsTrackerAction.GET_STARTED_ACTION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InvestmentsTrackerAction.CONNECT_ROW_CLICKED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[InvestmentsTrackerAction.CONNECT_ROW_CLICKED_BANK_ACCOUNT.ordinal()] = 7;
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

        public final KSerializer<InvestmentsTrackerActionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerActionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerActionDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerActionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerAction> getProtoAdapter() {
            return InvestmentsTrackerAction.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerActionDto getZeroValue() {
            return InvestmentsTrackerActionDto.ACTION_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerActionDto fromProto(InvestmentsTrackerAction proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return InvestmentsTrackerActionDto.ACTION_UNSPECIFIED;
                case 2:
                    return InvestmentsTrackerActionDto.TRANSFER_BUTTON;
                case 3:
                    return InvestmentsTrackerActionDto.UPSELL_RETIREMENT;
                case 4:
                    return InvestmentsTrackerActionDto.ACCOUNT_CLICKED;
                case 5:
                    return InvestmentsTrackerActionDto.GET_STARTED_ACTION;
                case 6:
                    return InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED;
                case 7:
                    return InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED_BANK_ACCOUNT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerActionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerActionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<InvestmentsTrackerActionDto, InvestmentsTrackerAction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerAction", InvestmentsTrackerActionDto.getEntries(), InvestmentsTrackerActionDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerActionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (InvestmentsTrackerActionDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerActionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static InvestmentsTrackerActionDto valueOf(String str) {
        return (InvestmentsTrackerActionDto) Enum.valueOf(InvestmentsTrackerActionDto.class, str);
    }

    public static InvestmentsTrackerActionDto[] values() {
        return (InvestmentsTrackerActionDto[]) $VALUES.clone();
    }
}
