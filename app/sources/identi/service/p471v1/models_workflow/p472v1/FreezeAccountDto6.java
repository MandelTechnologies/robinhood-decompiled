package identi.service.p471v1.models_workflow.p472v1;

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
/* compiled from: FreezeAccountDto.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m3636d2 = {"identi/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "Landroid/os/Parcelable;", "", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto;", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "Serializer", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* renamed from: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class FreezeAccountDto6 implements Dto2<FreezeAccount$Callback>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FreezeAccountDto6[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FreezeAccountDto6> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FreezeAccountDto6, FreezeAccount$Callback>> binaryBase64Serializer$delegate;
    public static final FreezeAccountDto6 CALLBACK_UNSPECIFIED = new FreezeAccountDto6("CALLBACK_UNSPECIFIED", 0) { // from class: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto.CALLBACK_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FreezeAccount$Callback toProto() {
            return FreezeAccount$Callback.CALLBACK_UNSPECIFIED;
        }
    };
    public static final FreezeAccountDto6 EXIT = new FreezeAccountDto6("EXIT", 1) { // from class: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto.EXIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FreezeAccount$Callback toProto() {
            return FreezeAccount$Callback.EXIT;
        }
    };
    public static final FreezeAccountDto6 ACTION = new FreezeAccountDto6("ACTION", 2) { // from class: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto.ACTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FreezeAccount$Callback toProto() {
            return FreezeAccount$Callback.ACTION;
        }
    };

    private static final /* synthetic */ FreezeAccountDto6[] $values() {
        return new FreezeAccountDto6[]{CALLBACK_UNSPECIFIED, EXIT, ACTION};
    }

    public /* synthetic */ FreezeAccountDto6(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<FreezeAccountDto6> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FreezeAccountDto6(String str, int i) {
    }

    static {
        FreezeAccountDto6[] freezeAccountDto6Arr$values = $values();
        $VALUES = freezeAccountDto6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(freezeAccountDto6Arr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FreezeAccountDto6.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FreezeAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto;", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto2.Creator<FreezeAccountDto6, FreezeAccount$Callback> {

        /* compiled from: FreezeAccountDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto$Companion$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FreezeAccount$Callback.values().length];
                try {
                    iArr[FreezeAccount$Callback.CALLBACK_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FreezeAccount$Callback.EXIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FreezeAccount$Callback.ACTION.ordinal()] = 3;
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

        public final KSerializer<FreezeAccountDto6> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FreezeAccountDto6> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FreezeAccountDto6> getBinaryBase64Serializer() {
            return (KSerializer) FreezeAccountDto6.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FreezeAccount$Callback> getProtoAdapter() {
            return FreezeAccount$Callback.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FreezeAccountDto6 getZeroValue() {
            return FreezeAccountDto6.CALLBACK_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FreezeAccountDto6 fromProto(FreezeAccount$Callback proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return FreezeAccountDto6.CALLBACK_UNSPECIFIED;
            }
            if (i == 2) {
                return FreezeAccountDto6.EXIT;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return FreezeAccountDto6.ACTION;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FreezeAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$CallbackDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.FreezeAccountDto$CallbackDto$Serializer */
    public static final class Serializer implements KSerializer<FreezeAccountDto6> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FreezeAccountDto6, FreezeAccount$Callback> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.FreezeAccount.Callback", FreezeAccountDto6.getEntries(), FreezeAccountDto6.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FreezeAccountDto6 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FreezeAccountDto6) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FreezeAccountDto6 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FreezeAccountDto6 valueOf(String str) {
        return (FreezeAccountDto6) Enum.valueOf(FreezeAccountDto6.class, str);
    }

    public static FreezeAccountDto6[] values() {
        return (FreezeAccountDto6[]) $VALUES.clone();
    }
}
