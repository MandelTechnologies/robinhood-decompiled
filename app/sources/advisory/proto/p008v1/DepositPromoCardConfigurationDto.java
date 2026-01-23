package advisory.proto.p008v1;

import advisory.proto.p008v1.DepositPromoCardDto;
import advisory.proto.p008v1.PromoDetailsScreenDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DepositPromoCardConfigurationDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfigurationDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/DepositPromoCardConfiguration;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;)V", "Ladvisory/proto/v1/DepositPromoCardDto;", "card", "Ladvisory/proto/v1/PromoDetailsScreenDto;", "details_screen", "", "promo_id", "(Ladvisory/proto/v1/DepositPromoCardDto;Ladvisory/proto/v1/PromoDetailsScreenDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/DepositPromoCardConfiguration;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;", "getCard", "()Ladvisory/proto/v1/DepositPromoCardDto;", "getDetails_screen", "()Ladvisory/proto/v1/PromoDetailsScreenDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class DepositPromoCardConfigurationDto implements Dto3<DepositPromoCardConfiguration>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DepositPromoCardConfigurationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DepositPromoCardConfigurationDto, DepositPromoCardConfiguration>> binaryBase64Serializer$delegate;
    private static final DepositPromoCardConfigurationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DepositPromoCardConfigurationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DepositPromoCardConfigurationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DepositPromoCardDto getCard() {
        return this.surrogate.getCard();
    }

    public final PromoDetailsScreenDto getDetails_screen() {
        return this.surrogate.getDetails_screen();
    }

    public /* synthetic */ DepositPromoCardConfigurationDto(DepositPromoCardDto depositPromoCardDto, PromoDetailsScreenDto promoDetailsScreenDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : depositPromoCardDto, (i & 2) != 0 ? null : promoDetailsScreenDto, (i & 4) != 0 ? null : str);
    }

    public DepositPromoCardConfigurationDto(DepositPromoCardDto depositPromoCardDto, PromoDetailsScreenDto promoDetailsScreenDto, String str) {
        this(new Surrogate(depositPromoCardDto, promoDetailsScreenDto, str));
    }

    @Override // com.robinhood.idl.Dto
    public DepositPromoCardConfiguration toProto() {
        DepositPromoCardDto card = this.surrogate.getCard();
        DepositPromoCard proto = card != null ? card.toProto() : null;
        PromoDetailsScreenDto details_screen = this.surrogate.getDetails_screen();
        return new DepositPromoCardConfiguration(proto, details_screen != null ? details_screen.toProto() : null, this.surrogate.getPromo_id(), null, 8, null);
    }

    public String toString() {
        return "[DepositPromoCardConfigurationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DepositPromoCardConfigurationDto) && Intrinsics.areEqual(((DepositPromoCardConfigurationDto) other).surrogate, this.surrogate);
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
    /* compiled from: DepositPromoCardConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\u0019¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;", "", "Ladvisory/proto/v1/DepositPromoCardDto;", "card", "Ladvisory/proto/v1/PromoDetailsScreenDto;", "details_screen", "", "promo_id", "<init>", "(Ladvisory/proto/v1/DepositPromoCardDto;Ladvisory/proto/v1/PromoDetailsScreenDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/DepositPromoCardDto;Ladvisory/proto/v1/PromoDetailsScreenDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/DepositPromoCardDto;", "getCard", "()Ladvisory/proto/v1/DepositPromoCardDto;", "getCard$annotations", "()V", "Ladvisory/proto/v1/PromoDetailsScreenDto;", "getDetails_screen", "()Ladvisory/proto/v1/PromoDetailsScreenDto;", "getDetails_screen$annotations", "Ljava/lang/String;", "getPromo_id", "getPromo_id$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DepositPromoCardDto card;
        private final PromoDetailsScreenDto details_screen;
        private final String promo_id;

        public Surrogate() {
            this((DepositPromoCardDto) null, (PromoDetailsScreenDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.card, surrogate.card) && Intrinsics.areEqual(this.details_screen, surrogate.details_screen) && Intrinsics.areEqual(this.promo_id, surrogate.promo_id);
        }

        public int hashCode() {
            DepositPromoCardDto depositPromoCardDto = this.card;
            int iHashCode = (depositPromoCardDto == null ? 0 : depositPromoCardDto.hashCode()) * 31;
            PromoDetailsScreenDto promoDetailsScreenDto = this.details_screen;
            int iHashCode2 = (iHashCode + (promoDetailsScreenDto == null ? 0 : promoDetailsScreenDto.hashCode())) * 31;
            String str = this.promo_id;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(card=" + this.card + ", details_screen=" + this.details_screen + ", promo_id=" + this.promo_id + ")";
        }

        /* compiled from: DepositPromoCardConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DepositPromoCardConfigurationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DepositPromoCardDto depositPromoCardDto, PromoDetailsScreenDto promoDetailsScreenDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.card = null;
            } else {
                this.card = depositPromoCardDto;
            }
            if ((i & 2) == 0) {
                this.details_screen = null;
            } else {
                this.details_screen = promoDetailsScreenDto;
            }
            if ((i & 4) == 0) {
                this.promo_id = null;
            } else {
                this.promo_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DepositPromoCardDto depositPromoCardDto = self.card;
            if (depositPromoCardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DepositPromoCardDto.Serializer.INSTANCE, depositPromoCardDto);
            }
            PromoDetailsScreenDto promoDetailsScreenDto = self.details_screen;
            if (promoDetailsScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PromoDetailsScreenDto.Serializer.INSTANCE, promoDetailsScreenDto);
            }
            String str = self.promo_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(DepositPromoCardDto depositPromoCardDto, PromoDetailsScreenDto promoDetailsScreenDto, String str) {
            this.card = depositPromoCardDto;
            this.details_screen = promoDetailsScreenDto;
            this.promo_id = str;
        }

        public /* synthetic */ Surrogate(DepositPromoCardDto depositPromoCardDto, PromoDetailsScreenDto promoDetailsScreenDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : depositPromoCardDto, (i & 2) != 0 ? null : promoDetailsScreenDto, (i & 4) != 0 ? null : str);
        }

        public final DepositPromoCardDto getCard() {
            return this.card;
        }

        public final PromoDetailsScreenDto getDetails_screen() {
            return this.details_screen;
        }

        public final String getPromo_id() {
            return this.promo_id;
        }
    }

    /* compiled from: DepositPromoCardConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/DepositPromoCardConfigurationDto;", "Ladvisory/proto/v1/DepositPromoCardConfiguration;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/DepositPromoCardConfigurationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DepositPromoCardConfigurationDto, DepositPromoCardConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositPromoCardConfigurationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DepositPromoCardConfigurationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DepositPromoCardConfigurationDto> getBinaryBase64Serializer() {
            return (KSerializer) DepositPromoCardConfigurationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DepositPromoCardConfiguration> getProtoAdapter() {
            return DepositPromoCardConfiguration.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DepositPromoCardConfigurationDto getZeroValue() {
            return DepositPromoCardConfigurationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DepositPromoCardConfigurationDto fromProto(DepositPromoCardConfiguration proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DepositPromoCard card = proto.getCard();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DepositPromoCardDto depositPromoCardDtoFromProto = card != null ? DepositPromoCardDto.INSTANCE.fromProto(card) : null;
            PromoDetailsScreen details_screen = proto.getDetails_screen();
            return new DepositPromoCardConfigurationDto(new Surrogate(depositPromoCardDtoFromProto, details_screen != null ? PromoDetailsScreenDto.INSTANCE.fromProto(details_screen) : null, proto.getPromo_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.DepositPromoCardConfigurationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositPromoCardConfigurationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DepositPromoCardConfigurationDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DepositPromoCardConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/DepositPromoCardConfigurationDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/DepositPromoCardConfigurationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DepositPromoCardConfigurationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.DepositPromoCardConfiguration", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DepositPromoCardConfigurationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DepositPromoCardConfigurationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DepositPromoCardConfigurationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DepositPromoCardConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardConfigurationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "advisory.proto.v1.DepositPromoCardConfigurationDto";
        }
    }
}
