package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import hippo.model.p469v1.OptionRatioQuantityTypeDto;
import hippo.model.p469v1.OptionTradingSessionDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: OptionOrderFormSettingsDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/OptionOrderFormSettings;", "Landroid/os/Parcelable;", "Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;)V", "Lhippo/model/v1/OptionRatioQuantityTypeDto;", "option_ratio_quantity_type", "Lhippo/model/v1/OptionTradingSessionDto;", "option_last_selected_session", "(Lhippo/model/v1/OptionRatioQuantityTypeDto;Lhippo/model/v1/OptionTradingSessionDto;)V", "toProto", "()Lhippo/model/v1/OptionOrderFormSettings;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class OptionOrderFormSettingsDto implements Dto3<OptionOrderFormSettings>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionOrderFormSettingsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionOrderFormSettingsDto, OptionOrderFormSettings>> binaryBase64Serializer$delegate;
    private static final OptionOrderFormSettingsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionOrderFormSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionOrderFormSettingsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionOrderFormSettingsDto(OptionRatioQuantityTypeDto option_ratio_quantity_type, OptionTradingSessionDto option_last_selected_session) {
        this(new Surrogate(option_ratio_quantity_type, option_last_selected_session));
        Intrinsics.checkNotNullParameter(option_ratio_quantity_type, "option_ratio_quantity_type");
        Intrinsics.checkNotNullParameter(option_last_selected_session, "option_last_selected_session");
    }

    public /* synthetic */ OptionOrderFormSettingsDto(OptionRatioQuantityTypeDto optionRatioQuantityTypeDto, OptionTradingSessionDto optionTradingSessionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OptionRatioQuantityTypeDto.INSTANCE.getZeroValue() : optionRatioQuantityTypeDto, (i & 2) != 0 ? OptionTradingSessionDto.INSTANCE.getZeroValue() : optionTradingSessionDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionOrderFormSettings toProto() {
        return new OptionOrderFormSettings((OptionRatioQuantityType) this.surrogate.getOption_ratio_quantity_type().toProto(), (OptionTradingSession) this.surrogate.getOption_last_selected_session().toProto(), null, 4, null);
    }

    public String toString() {
        return "[OptionOrderFormSettingsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionOrderFormSettingsDto) && Intrinsics.areEqual(((OptionOrderFormSettingsDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;", "", "Lhippo/model/v1/OptionRatioQuantityTypeDto;", "option_ratio_quantity_type", "Lhippo/model/v1/OptionTradingSessionDto;", "option_last_selected_session", "<init>", "(Lhippo/model/v1/OptionRatioQuantityTypeDto;Lhippo/model/v1/OptionTradingSessionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhippo/model/v1/OptionRatioQuantityTypeDto;Lhippo/model/v1/OptionTradingSessionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhippo/model/v1/OptionRatioQuantityTypeDto;", "getOption_ratio_quantity_type", "()Lhippo/model/v1/OptionRatioQuantityTypeDto;", "getOption_ratio_quantity_type$annotations", "()V", "Lhippo/model/v1/OptionTradingSessionDto;", "getOption_last_selected_session", "()Lhippo/model/v1/OptionTradingSessionDto;", "getOption_last_selected_session$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OptionTradingSessionDto option_last_selected_session;
        private final OptionRatioQuantityTypeDto option_ratio_quantity_type;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((OptionRatioQuantityTypeDto) null, (OptionTradingSessionDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.option_ratio_quantity_type == surrogate.option_ratio_quantity_type && this.option_last_selected_session == surrogate.option_last_selected_session;
        }

        public int hashCode() {
            return (this.option_ratio_quantity_type.hashCode() * 31) + this.option_last_selected_session.hashCode();
        }

        public String toString() {
            return "Surrogate(option_ratio_quantity_type=" + this.option_ratio_quantity_type + ", option_last_selected_session=" + this.option_last_selected_session + ")";
        }

        /* compiled from: OptionOrderFormSettingsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionOrderFormSettingsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OptionRatioQuantityTypeDto optionRatioQuantityTypeDto, OptionTradingSessionDto optionTradingSessionDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.option_ratio_quantity_type = (i & 1) == 0 ? OptionRatioQuantityTypeDto.INSTANCE.getZeroValue() : optionRatioQuantityTypeDto;
            if ((i & 2) == 0) {
                this.option_last_selected_session = OptionTradingSessionDto.INSTANCE.getZeroValue();
            } else {
                this.option_last_selected_session = optionTradingSessionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.option_ratio_quantity_type != OptionRatioQuantityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, OptionRatioQuantityTypeDto.Serializer.INSTANCE, self.option_ratio_quantity_type);
            }
            if (self.option_last_selected_session != OptionTradingSessionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OptionTradingSessionDto.Serializer.INSTANCE, self.option_last_selected_session);
            }
        }

        public Surrogate(OptionRatioQuantityTypeDto option_ratio_quantity_type, OptionTradingSessionDto option_last_selected_session) {
            Intrinsics.checkNotNullParameter(option_ratio_quantity_type, "option_ratio_quantity_type");
            Intrinsics.checkNotNullParameter(option_last_selected_session, "option_last_selected_session");
            this.option_ratio_quantity_type = option_ratio_quantity_type;
            this.option_last_selected_session = option_last_selected_session;
        }

        public final OptionRatioQuantityTypeDto getOption_ratio_quantity_type() {
            return this.option_ratio_quantity_type;
        }

        public /* synthetic */ Surrogate(OptionRatioQuantityTypeDto optionRatioQuantityTypeDto, OptionTradingSessionDto optionTradingSessionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OptionRatioQuantityTypeDto.INSTANCE.getZeroValue() : optionRatioQuantityTypeDto, (i & 2) != 0 ? OptionTradingSessionDto.INSTANCE.getZeroValue() : optionTradingSessionDto);
        }

        public final OptionTradingSessionDto getOption_last_selected_session() {
            return this.option_last_selected_session;
        }
    }

    /* compiled from: OptionOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/OptionOrderFormSettingsDto;", "Lhippo/model/v1/OptionOrderFormSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/OptionOrderFormSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionOrderFormSettingsDto, OptionOrderFormSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionOrderFormSettingsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderFormSettingsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderFormSettingsDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionOrderFormSettingsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionOrderFormSettings> getProtoAdapter() {
            return OptionOrderFormSettings.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderFormSettingsDto getZeroValue() {
            return OptionOrderFormSettingsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderFormSettingsDto fromProto(OptionOrderFormSettings proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionOrderFormSettingsDto(new Surrogate(OptionRatioQuantityTypeDto.INSTANCE.fromProto(proto.getOption_ratio_quantity_type()), OptionTradingSessionDto.INSTANCE.fromProto(proto.getOption_last_selected_session())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.OptionOrderFormSettingsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFormSettingsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionOrderFormSettingsDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/OptionOrderFormSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/OptionOrderFormSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OptionOrderFormSettingsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.OptionOrderFormSettings", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionOrderFormSettingsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionOrderFormSettingsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionOrderFormSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: OptionOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "hippo.model.v1.OptionOrderFormSettingsDto";
        }
    }
}
