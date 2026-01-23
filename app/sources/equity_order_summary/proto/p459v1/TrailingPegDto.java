package equity_order_summary.proto.p459v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.order.PegType;
import rosetta.order.PegTypeDto;

/* compiled from: TrailingPegDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPegDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_order_summary/proto/v1/TrailingPeg;", "Landroid/os/Parcelable;", "Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;", "surrogate", "<init>", "(Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;)V", "", "percentage", "Lcom/robinhood/idl/IdlDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lrosetta/order/PegTypeDto;", "peg_type", "(Ljava/lang/Integer;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PegTypeDto;)V", "toProto", "()Lequity_order_summary/proto/v1/TrailingPeg;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class TrailingPegDto implements Dto3<TrailingPeg>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TrailingPegDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TrailingPegDto, TrailingPeg>> binaryBase64Serializer$delegate;
    private static final TrailingPegDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TrailingPegDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TrailingPegDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TrailingPegDto(Integer num, IdlDecimal idlDecimal, PegTypeDto pegTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : idlDecimal, (i & 4) != 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrailingPegDto(Integer num, IdlDecimal idlDecimal, PegTypeDto peg_type) {
        this(new Surrogate(num, idlDecimal, peg_type));
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TrailingPeg toProto() {
        Integer percentage = this.surrogate.getPercentage();
        IdlDecimal price = this.surrogate.getPrice();
        return new TrailingPeg(percentage, price != null ? price.getStringValue() : null, (PegType) this.surrogate.getPeg_type().toProto(), null, 8, null);
    }

    public String toString() {
        return "[TrailingPegDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TrailingPegDto) && Intrinsics.areEqual(((TrailingPegDto) other).surrogate, this.surrogate);
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
    /* compiled from: TrailingPegDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221BG\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R1\u0010\t\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "percentage", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lrosetta/order/PegTypeDto;", "peg_type", "<init>", "(Ljava/lang/Integer;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PegTypeDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PegTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_order_summary_proto_v1_externalRelease", "(Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPercentage", "()Ljava/lang/Integer;", "getPercentage$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getPrice", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice$annotations", "Lrosetta/order/PegTypeDto;", "getPeg_type", "()Lrosetta/order/PegTypeDto;", "getPeg_type$annotations", "Companion", "$serializer", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PegTypeDto peg_type;
        private final Integer percentage;
        private final IdlDecimal price;

        public Surrogate() {
            this((Integer) null, (IdlDecimal) null, (PegTypeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.percentage, surrogate.percentage) && Intrinsics.areEqual(this.price, surrogate.price) && this.peg_type == surrogate.peg_type;
        }

        public int hashCode() {
            Integer num = this.percentage;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            IdlDecimal idlDecimal = this.price;
            return ((iHashCode + (idlDecimal != null ? idlDecimal.hashCode() : 0)) * 31) + this.peg_type.hashCode();
        }

        public String toString() {
            return "Surrogate(percentage=" + this.percentage + ", price=" + this.price + ", peg_type=" + this.peg_type + ")";
        }

        /* compiled from: TrailingPegDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TrailingPegDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Integer num, IdlDecimal idlDecimal, PegTypeDto pegTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.percentage = null;
            } else {
                this.percentage = num;
            }
            if ((i & 2) == 0) {
                this.price = null;
            } else {
                this.price = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.peg_type = PegTypeDto.INSTANCE.getZeroValue();
            } else {
                this.peg_type = pegTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_order_summary_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Integer num = self.percentage;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            IdlDecimal idlDecimal = self.price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (self.peg_type != PegTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PegTypeDto.Serializer.INSTANCE, self.peg_type);
            }
        }

        public Surrogate(Integer num, IdlDecimal idlDecimal, PegTypeDto peg_type) {
            Intrinsics.checkNotNullParameter(peg_type, "peg_type");
            this.percentage = num;
            this.price = idlDecimal;
            this.peg_type = peg_type;
        }

        public final Integer getPercentage() {
            return this.percentage;
        }

        public final IdlDecimal getPrice() {
            return this.price;
        }

        public final PegTypeDto getPeg_type() {
            return this.peg_type;
        }

        public /* synthetic */ Surrogate(Integer num, IdlDecimal idlDecimal, PegTypeDto pegTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : idlDecimal, (i & 4) != 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto);
        }
    }

    /* compiled from: TrailingPegDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPegDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_order_summary/proto/v1/TrailingPegDto;", "Lequity_order_summary/proto/v1/TrailingPeg;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_order_summary/proto/v1/TrailingPegDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TrailingPegDto, TrailingPeg> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrailingPegDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailingPegDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailingPegDto> getBinaryBase64Serializer() {
            return (KSerializer) TrailingPegDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TrailingPeg> getProtoAdapter() {
            return TrailingPeg.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailingPegDto getZeroValue() {
            return TrailingPegDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailingPegDto fromProto(TrailingPeg proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Integer percentage = proto.getPercentage();
            String price = proto.getPrice();
            return new TrailingPegDto(new Surrogate(percentage, price != null ? new IdlDecimal(price) : null, PegTypeDto.INSTANCE.fromProto(proto.getPeg_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_order_summary.proto.v1.TrailingPegDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrailingPegDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TrailingPegDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TrailingPegDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPegDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_order_summary/proto/v1/TrailingPegDto;", "<init>", "()V", "surrogateSerializer", "Lequity_order_summary/proto/v1/TrailingPegDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<TrailingPegDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_order_summary.proto.v1.TrailingPeg", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TrailingPegDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TrailingPegDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TrailingPegDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TrailingPegDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPegDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "equity_order_summary.proto.v1.TrailingPegDto";
        }
    }
}
