package bonfire.proto.idl.equities.p034v1;

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
/* compiled from: StatusChoicesDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/equities/v1/StatusChoices;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_CHOICES_UNSPECIFIED", "STATUS_CHOICES_COMPLETED", "STATUS_CHOICES_PROCESSING", "STATUS_CHOICES_PENDING", "STATUS_CHOICES_NEW", "STATUS_CHOICES_INCONSISTENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public abstract class StatusChoicesDto implements Dto2<StatusChoices>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatusChoicesDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<StatusChoicesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StatusChoicesDto, StatusChoices>> binaryBase64Serializer$delegate;
    public static final StatusChoicesDto STATUS_CHOICES_UNSPECIFIED = new StatusChoicesDto("STATUS_CHOICES_UNSPECIFIED", 0) { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto.STATUS_CHOICES_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StatusChoices toProto() {
            return StatusChoices.STATUS_CHOICES_UNSPECIFIED;
        }
    };
    public static final StatusChoicesDto STATUS_CHOICES_COMPLETED = new StatusChoicesDto("STATUS_CHOICES_COMPLETED", 1) { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto.STATUS_CHOICES_COMPLETED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StatusChoices toProto() {
            return StatusChoices.STATUS_CHOICES_COMPLETED;
        }
    };
    public static final StatusChoicesDto STATUS_CHOICES_PROCESSING = new StatusChoicesDto("STATUS_CHOICES_PROCESSING", 2) { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto.STATUS_CHOICES_PROCESSING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StatusChoices toProto() {
            return StatusChoices.STATUS_CHOICES_PROCESSING;
        }
    };
    public static final StatusChoicesDto STATUS_CHOICES_PENDING = new StatusChoicesDto("STATUS_CHOICES_PENDING", 3) { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto.STATUS_CHOICES_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StatusChoices toProto() {
            return StatusChoices.STATUS_CHOICES_PENDING;
        }
    };
    public static final StatusChoicesDto STATUS_CHOICES_NEW = new StatusChoicesDto("STATUS_CHOICES_NEW", 4) { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto.STATUS_CHOICES_NEW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StatusChoices toProto() {
            return StatusChoices.STATUS_CHOICES_NEW;
        }
    };
    public static final StatusChoicesDto STATUS_CHOICES_INCONSISTENT = new StatusChoicesDto("STATUS_CHOICES_INCONSISTENT", 5) { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto.STATUS_CHOICES_INCONSISTENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StatusChoices toProto() {
            return StatusChoices.STATUS_CHOICES_INCONSISTENT;
        }
    };

    private static final /* synthetic */ StatusChoicesDto[] $values() {
        return new StatusChoicesDto[]{STATUS_CHOICES_UNSPECIFIED, STATUS_CHOICES_COMPLETED, STATUS_CHOICES_PROCESSING, STATUS_CHOICES_PENDING, STATUS_CHOICES_NEW, STATUS_CHOICES_INCONSISTENT};
    }

    public /* synthetic */ StatusChoicesDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<StatusChoicesDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StatusChoicesDto(String str, int i) {
    }

    static {
        StatusChoicesDto[] statusChoicesDtoArr$values = $values();
        $VALUES = statusChoicesDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(statusChoicesDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.equities.v1.StatusChoicesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StatusChoicesDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: StatusChoicesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/StatusChoicesDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "Lbonfire/proto/idl/equities/v1/StatusChoices;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<StatusChoicesDto, StatusChoices> {

        /* compiled from: StatusChoicesDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StatusChoices.values().length];
                try {
                    iArr[StatusChoices.STATUS_CHOICES_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StatusChoices.STATUS_CHOICES_COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StatusChoices.STATUS_CHOICES_PROCESSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StatusChoices.STATUS_CHOICES_PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StatusChoices.STATUS_CHOICES_NEW.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StatusChoices.STATUS_CHOICES_INCONSISTENT.ordinal()] = 6;
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

        public final KSerializer<StatusChoicesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StatusChoicesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StatusChoicesDto> getBinaryBase64Serializer() {
            return (KSerializer) StatusChoicesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StatusChoices> getProtoAdapter() {
            return StatusChoices.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StatusChoicesDto getZeroValue() {
            return StatusChoicesDto.STATUS_CHOICES_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StatusChoicesDto fromProto(StatusChoices proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return StatusChoicesDto.STATUS_CHOICES_UNSPECIFIED;
                case 2:
                    return StatusChoicesDto.STATUS_CHOICES_COMPLETED;
                case 3:
                    return StatusChoicesDto.STATUS_CHOICES_PROCESSING;
                case 4:
                    return StatusChoicesDto.STATUS_CHOICES_PENDING;
                case 5:
                    return StatusChoicesDto.STATUS_CHOICES_NEW;
                case 6:
                    return StatusChoicesDto.STATUS_CHOICES_INCONSISTENT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StatusChoicesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/StatusChoicesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StatusChoicesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<StatusChoicesDto, StatusChoices> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.equities.v1.StatusChoices", StatusChoicesDto.getEntries(), StatusChoicesDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public StatusChoicesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (StatusChoicesDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StatusChoicesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static StatusChoicesDto valueOf(String str) {
        return (StatusChoicesDto) Enum.valueOf(StatusChoicesDto.class, str);
    }

    public static StatusChoicesDto[] values() {
        return (StatusChoicesDto[]) $VALUES.clone();
    }
}
