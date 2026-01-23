package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
/* compiled from: CorpActionPaymentStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CorpActionPaymentStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lnummus/v1/CorpActionPaymentState;", "Landroid/os/Parcelable;", "", "json_value", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDisplay_name", "CORP_ACTION_PAYMENT_STATE_UNSPECIFIED", "CORP_ACTION_PAYMENT_STATE_PENDING", "CORP_ACTION_PAYMENT_STATE_PAID", "CORP_ACTION_PAYMENT_STATE_VOID", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class CorpActionPaymentStateDto implements Dto2<CorpActionPaymentState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CorpActionPaymentStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<CorpActionPaymentStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CorpActionPaymentStateDto, CorpActionPaymentState>> binaryBase64Serializer$delegate;
    private final String display_name;
    private final String json_value;
    public static final CorpActionPaymentStateDto CORP_ACTION_PAYMENT_STATE_UNSPECIFIED = new CorpActionPaymentStateDto("CORP_ACTION_PAYMENT_STATE_UNSPECIFIED", 0) { // from class: nummus.v1.CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED
        {
            String str = "Unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "unspecified";
        }

        @Override // com.robinhood.idl.Dto
        public CorpActionPaymentState toProto() {
            return CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED;
        }
    };
    public static final CorpActionPaymentStateDto CORP_ACTION_PAYMENT_STATE_PENDING = new CorpActionPaymentStateDto("CORP_ACTION_PAYMENT_STATE_PENDING", 1) { // from class: nummus.v1.CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_PENDING
        {
            String str = "Pending";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "pending";
        }

        @Override // com.robinhood.idl.Dto
        public CorpActionPaymentState toProto() {
            return CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_PENDING;
        }
    };
    public static final CorpActionPaymentStateDto CORP_ACTION_PAYMENT_STATE_PAID = new CorpActionPaymentStateDto("CORP_ACTION_PAYMENT_STATE_PAID", 2) { // from class: nummus.v1.CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_PAID
        {
            String str = "Paid";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "paid";
        }

        @Override // com.robinhood.idl.Dto
        public CorpActionPaymentState toProto() {
            return CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_PAID;
        }
    };
    public static final CorpActionPaymentStateDto CORP_ACTION_PAYMENT_STATE_VOID = new CorpActionPaymentStateDto("CORP_ACTION_PAYMENT_STATE_VOID", 3) { // from class: nummus.v1.CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_VOID
        {
            String str = "Void";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "void";
        }

        @Override // com.robinhood.idl.Dto
        public CorpActionPaymentState toProto() {
            return CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_VOID;
        }
    };

    private static final /* synthetic */ CorpActionPaymentStateDto[] $values() {
        return new CorpActionPaymentStateDto[]{CORP_ACTION_PAYMENT_STATE_UNSPECIFIED, CORP_ACTION_PAYMENT_STATE_PENDING, CORP_ACTION_PAYMENT_STATE_PAID, CORP_ACTION_PAYMENT_STATE_VOID};
    }

    public /* synthetic */ CorpActionPaymentStateDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<CorpActionPaymentStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CorpActionPaymentStateDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.display_name = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    static {
        CorpActionPaymentStateDto[] corpActionPaymentStateDtoArr$values = $values();
        $VALUES = corpActionPaymentStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(corpActionPaymentStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CorpActionPaymentStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CorpActionPaymentStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: CorpActionPaymentStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CorpActionPaymentStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnummus/v1/CorpActionPaymentStateDto;", "Lnummus/v1/CorpActionPaymentState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CorpActionPaymentStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<CorpActionPaymentStateDto, CorpActionPaymentState> {

        /* compiled from: CorpActionPaymentStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CorpActionPaymentState.values().length];
                try {
                    iArr[CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_PENDING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_PAID.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_VOID.ordinal()] = 4;
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

        public final KSerializer<CorpActionPaymentStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionPaymentStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionPaymentStateDto> getBinaryBase64Serializer() {
            return (KSerializer) CorpActionPaymentStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CorpActionPaymentState> getProtoAdapter() {
            return CorpActionPaymentState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionPaymentStateDto getZeroValue() {
            return CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionPaymentStateDto fromProto(CorpActionPaymentState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED;
            }
            if (i == 2) {
                return CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_PENDING;
            }
            if (i == 3) {
                return CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_PAID;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return CorpActionPaymentStateDto.CORP_ACTION_PAYMENT_STATE_VOID;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CorpActionPaymentStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnummus/v1/CorpActionPaymentStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionPaymentStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CorpActionPaymentStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<CorpActionPaymentStateDto, CorpActionPaymentState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nummus.v1.CorpActionPaymentState", CorpActionPaymentStateDto.getEntries(), CorpActionPaymentStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public CorpActionPaymentStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (CorpActionPaymentStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CorpActionPaymentStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static CorpActionPaymentStateDto valueOf(String str) {
        return (CorpActionPaymentStateDto) Enum.valueOf(CorpActionPaymentStateDto.class, str);
    }

    public static CorpActionPaymentStateDto[] values() {
        return (CorpActionPaymentStateDto[]) $VALUES.clone();
    }
}
