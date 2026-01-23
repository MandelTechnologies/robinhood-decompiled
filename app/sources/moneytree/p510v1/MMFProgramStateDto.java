package moneytree.p510v1;

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
/* compiled from: MMFProgramStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lmoneytree/v1/MMFProgramStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lmoneytree/v1/MMFProgramState;", "Landroid/os/Parcelable;", "", "json_value", "", "db_enum", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDb_enum", "MMF_PROGRAM_STATE_UNSPECIFIED", "MMF_PROGRAM_STATE_ACTIVE", "MMF_PROGRAM_STATE_INACTIVE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public abstract class MMFProgramStateDto implements Dto2<MMFProgramState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MMFProgramStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<MMFProgramStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MMFProgramStateDto, MMFProgramState>> binaryBase64Serializer$delegate;
    private final String db_enum;
    private final String json_value;
    public static final MMFProgramStateDto MMF_PROGRAM_STATE_UNSPECIFIED = new MMFProgramStateDto("MMF_PROGRAM_STATE_UNSPECIFIED", 0) { // from class: moneytree.v1.MMFProgramStateDto.MMF_PROGRAM_STATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "";
        }

        @Override // com.robinhood.idl.Dto
        public MMFProgramState toProto() {
            return MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED;
        }
    };
    public static final MMFProgramStateDto MMF_PROGRAM_STATE_ACTIVE = new MMFProgramStateDto("MMF_PROGRAM_STATE_ACTIVE", 1) { // from class: moneytree.v1.MMFProgramStateDto.MMF_PROGRAM_STATE_ACTIVE
        {
            String str = "ACTIVE";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "ACTIVE";
        }

        @Override // com.robinhood.idl.Dto
        public MMFProgramState toProto() {
            return MMFProgramState.MMF_PROGRAM_STATE_ACTIVE;
        }
    };
    public static final MMFProgramStateDto MMF_PROGRAM_STATE_INACTIVE = new MMFProgramStateDto("MMF_PROGRAM_STATE_INACTIVE", 2) { // from class: moneytree.v1.MMFProgramStateDto.MMF_PROGRAM_STATE_INACTIVE
        {
            String str = "INACTIVE";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "INACTIVE";
        }

        @Override // com.robinhood.idl.Dto
        public MMFProgramState toProto() {
            return MMFProgramState.MMF_PROGRAM_STATE_INACTIVE;
        }
    };

    private static final /* synthetic */ MMFProgramStateDto[] $values() {
        return new MMFProgramStateDto[]{MMF_PROGRAM_STATE_UNSPECIFIED, MMF_PROGRAM_STATE_ACTIVE, MMF_PROGRAM_STATE_INACTIVE};
    }

    public /* synthetic */ MMFProgramStateDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<MMFProgramStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MMFProgramStateDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.db_enum = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        MMFProgramStateDto[] mMFProgramStateDtoArr$values = $values();
        $VALUES = mMFProgramStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(mMFProgramStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: moneytree.v1.MMFProgramStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MMFProgramStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: MMFProgramStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmoneytree/v1/MMFProgramStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmoneytree/v1/MMFProgramStateDto;", "Lmoneytree/v1/MMFProgramState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmoneytree/v1/MMFProgramStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<MMFProgramStateDto, MMFProgramState> {

        /* compiled from: MMFProgramStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MMFProgramState.values().length];
                try {
                    iArr[MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MMFProgramState.MMF_PROGRAM_STATE_ACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MMFProgramState.MMF_PROGRAM_STATE_INACTIVE.ordinal()] = 3;
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

        public final KSerializer<MMFProgramStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MMFProgramStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MMFProgramStateDto> getBinaryBase64Serializer() {
            return (KSerializer) MMFProgramStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MMFProgramState> getProtoAdapter() {
            return MMFProgramState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MMFProgramStateDto getZeroValue() {
            return MMFProgramStateDto.MMF_PROGRAM_STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MMFProgramStateDto fromProto(MMFProgramState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return MMFProgramStateDto.MMF_PROGRAM_STATE_UNSPECIFIED;
            }
            if (i == 2) {
                return MMFProgramStateDto.MMF_PROGRAM_STATE_ACTIVE;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return MMFProgramStateDto.MMF_PROGRAM_STATE_INACTIVE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MMFProgramStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmoneytree/v1/MMFProgramStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/MMFProgramStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MMFProgramStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<MMFProgramStateDto, MMFProgramState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/moneytree.v1.MMFProgramState", MMFProgramStateDto.getEntries(), MMFProgramStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public MMFProgramStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (MMFProgramStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MMFProgramStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static MMFProgramStateDto valueOf(String str) {
        return (MMFProgramStateDto) Enum.valueOf(MMFProgramStateDto.class, str);
    }

    public static MMFProgramStateDto[] values() {
        return (MMFProgramStateDto[]) $VALUES.clone();
    }
}
