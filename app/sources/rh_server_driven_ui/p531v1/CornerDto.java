package rh_server_driven_ui.p531v1;

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
/* compiled from: CornerDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/CornerDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Corner;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CORNER_UNSPECIFIED", "CORNER_MIN_X_MAX_Y", "CORNER_MIN_X_MIN_Y", "CORNER_MAX_X_MAX_Y", "CORNER_MAX_X_MIN_Y", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class CornerDto implements Dto2<Corner>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CornerDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<CornerDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CornerDto, Corner>> binaryBase64Serializer$delegate;
    public static final CornerDto CORNER_UNSPECIFIED = new CornerDto("CORNER_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.CornerDto.CORNER_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Corner toProto() {
            return Corner.CORNER_UNSPECIFIED;
        }
    };
    public static final CornerDto CORNER_MIN_X_MAX_Y = new CornerDto("CORNER_MIN_X_MAX_Y", 1) { // from class: rh_server_driven_ui.v1.CornerDto.CORNER_MIN_X_MAX_Y
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Corner toProto() {
            return Corner.CORNER_MIN_X_MAX_Y;
        }
    };
    public static final CornerDto CORNER_MIN_X_MIN_Y = new CornerDto("CORNER_MIN_X_MIN_Y", 2) { // from class: rh_server_driven_ui.v1.CornerDto.CORNER_MIN_X_MIN_Y
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Corner toProto() {
            return Corner.CORNER_MIN_X_MIN_Y;
        }
    };
    public static final CornerDto CORNER_MAX_X_MAX_Y = new CornerDto("CORNER_MAX_X_MAX_Y", 3) { // from class: rh_server_driven_ui.v1.CornerDto.CORNER_MAX_X_MAX_Y
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Corner toProto() {
            return Corner.CORNER_MAX_X_MAX_Y;
        }
    };
    public static final CornerDto CORNER_MAX_X_MIN_Y = new CornerDto("CORNER_MAX_X_MIN_Y", 4) { // from class: rh_server_driven_ui.v1.CornerDto.CORNER_MAX_X_MIN_Y
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Corner toProto() {
            return Corner.CORNER_MAX_X_MIN_Y;
        }
    };

    private static final /* synthetic */ CornerDto[] $values() {
        return new CornerDto[]{CORNER_UNSPECIFIED, CORNER_MIN_X_MAX_Y, CORNER_MIN_X_MIN_Y, CORNER_MAX_X_MAX_Y, CORNER_MAX_X_MIN_Y};
    }

    public /* synthetic */ CornerDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<CornerDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CornerDto(String str, int i) {
    }

    static {
        CornerDto[] cornerDtoArr$values = $values();
        $VALUES = cornerDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cornerDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.CornerDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CornerDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: CornerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/CornerDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/CornerDto;", "Lrh_server_driven_ui/v1/Corner;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/CornerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<CornerDto, Corner> {

        /* compiled from: CornerDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Corner.values().length];
                try {
                    iArr[Corner.CORNER_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Corner.CORNER_MIN_X_MAX_Y.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Corner.CORNER_MIN_X_MIN_Y.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Corner.CORNER_MAX_X_MAX_Y.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Corner.CORNER_MAX_X_MIN_Y.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CornerDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CornerDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CornerDto> getBinaryBase64Serializer() {
            return (KSerializer) CornerDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Corner> getProtoAdapter() {
            return Corner.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CornerDto getZeroValue() {
            return CornerDto.CORNER_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CornerDto fromProto(Corner proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return CornerDto.CORNER_UNSPECIFIED;
            }
            if (i == 2) {
                return CornerDto.CORNER_MIN_X_MAX_Y;
            }
            if (i == 3) {
                return CornerDto.CORNER_MIN_X_MIN_Y;
            }
            if (i == 4) {
                return CornerDto.CORNER_MAX_X_MAX_Y;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return CornerDto.CORNER_MAX_X_MIN_Y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CornerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/CornerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/CornerDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CornerDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<CornerDto, Corner> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Corner", CornerDto.getEntries(), CornerDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public CornerDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (CornerDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CornerDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static CornerDto valueOf(String str) {
        return (CornerDto) Enum.valueOf(CornerDto.class, str);
    }

    public static CornerDto[] values() {
        return (CornerDto[]) $VALUES.clone();
    }
}
