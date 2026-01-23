package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
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
import options_product.service.ApprovedTradesResponseMetadata;
import options_product.service.ApprovedTradesResponseMetadataDto;

/* compiled from: ApprovedTradesResponseMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007+*,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014¨\u00061"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/ApprovedTradesResponseMetadata;", "Landroid/os/Parcelable;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;)V", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "account_type_in_copy", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "option_level", "", "account_number", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "graphic_type", "(Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;Ljava/lang/String;Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;)V", "toProto", "()Loptions_product/service/ApprovedTradesResponseMetadata;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;", "getAccount_type_in_copy", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "getOption_level", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "getAccount_number", "Companion", "Surrogate", "AccountTypeInCopyDto", "OptionLevelDto", "GraphicTypeDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class ApprovedTradesResponseMetadataDto implements Dto3<ApprovedTradesResponseMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ApprovedTradesResponseMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ApprovedTradesResponseMetadataDto, ApprovedTradesResponseMetadata>> binaryBase64Serializer$delegate;
    private static final ApprovedTradesResponseMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ApprovedTradesResponseMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ApprovedTradesResponseMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AccountTypeInCopyDto getAccount_type_in_copy() {
        return this.surrogate.getAccount_type_in_copy();
    }

    public final OptionLevelDto getOption_level() {
        return this.surrogate.getOption_level();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public /* synthetic */ ApprovedTradesResponseMetadataDto(AccountTypeInCopyDto accountTypeInCopyDto, OptionLevelDto optionLevelDto, String str, GraphicTypeDto graphicTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AccountTypeInCopyDto.INSTANCE.getZeroValue() : accountTypeInCopyDto, (i & 2) != 0 ? OptionLevelDto.INSTANCE.getZeroValue() : optionLevelDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? GraphicTypeDto.INSTANCE.getZeroValue() : graphicTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApprovedTradesResponseMetadataDto(AccountTypeInCopyDto account_type_in_copy, OptionLevelDto option_level, String account_number, GraphicTypeDto graphic_type) {
        this(new Surrogate(account_type_in_copy, option_level, account_number, graphic_type));
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(option_level, "option_level");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ApprovedTradesResponseMetadata toProto() {
        return new ApprovedTradesResponseMetadata((ApprovedTradesResponseMetadata.AccountTypeInCopy) this.surrogate.getAccount_type_in_copy().toProto(), (ApprovedTradesResponseMetadata.OptionLevel) this.surrogate.getOption_level().toProto(), this.surrogate.getAccount_number(), (ApprovedTradesResponseMetadata.GraphicType) this.surrogate.getGraphic_type().toProto(), null, 16, null);
    }

    public String toString() {
        return "[ApprovedTradesResponseMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ApprovedTradesResponseMetadataDto) && Intrinsics.areEqual(((ApprovedTradesResponseMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;", "", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "account_type_in_copy", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "option_level", "", "account_number", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "graphic_type", "<init>", "(Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;Ljava/lang/String;Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILoptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;Ljava/lang/String;Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "getAccount_type_in_copy", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "getAccount_type_in_copy$annotations", "()V", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "getOption_level", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "getOption_level$annotations", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "getGraphic_type", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "getGraphic_type$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final AccountTypeInCopyDto account_type_in_copy;
        private final GraphicTypeDto graphic_type;
        private final OptionLevelDto option_level;

        public Surrogate() {
            this((AccountTypeInCopyDto) null, (OptionLevelDto) null, (String) null, (GraphicTypeDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.account_type_in_copy == surrogate.account_type_in_copy && this.option_level == surrogate.option_level && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.graphic_type == surrogate.graphic_type;
        }

        public int hashCode() {
            return (((((this.account_type_in_copy.hashCode() * 31) + this.option_level.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.graphic_type.hashCode();
        }

        public String toString() {
            return "Surrogate(account_type_in_copy=" + this.account_type_in_copy + ", option_level=" + this.option_level + ", account_number=" + this.account_number + ", graphic_type=" + this.graphic_type + ")";
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ApprovedTradesResponseMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AccountTypeInCopyDto accountTypeInCopyDto, OptionLevelDto optionLevelDto, String str, GraphicTypeDto graphicTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_type_in_copy = (i & 1) == 0 ? AccountTypeInCopyDto.INSTANCE.getZeroValue() : accountTypeInCopyDto;
            if ((i & 2) == 0) {
                this.option_level = OptionLevelDto.INSTANCE.getZeroValue();
            } else {
                this.option_level = optionLevelDto;
            }
            if ((i & 4) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 8) == 0) {
                this.graphic_type = GraphicTypeDto.INSTANCE.getZeroValue();
            } else {
                this.graphic_type = graphicTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.account_type_in_copy != AccountTypeInCopyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AccountTypeInCopyDto.Serializer.INSTANCE, self.account_type_in_copy);
            }
            if (self.option_level != OptionLevelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OptionLevelDto.Serializer.INSTANCE, self.option_level);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_number);
            }
            if (self.graphic_type != GraphicTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, GraphicTypeDto.Serializer.INSTANCE, self.graphic_type);
            }
        }

        public Surrogate(AccountTypeInCopyDto account_type_in_copy, OptionLevelDto option_level, String account_number, GraphicTypeDto graphic_type) {
            Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
            Intrinsics.checkNotNullParameter(option_level, "option_level");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
            this.account_type_in_copy = account_type_in_copy;
            this.option_level = option_level;
            this.account_number = account_number;
            this.graphic_type = graphic_type;
        }

        public final AccountTypeInCopyDto getAccount_type_in_copy() {
            return this.account_type_in_copy;
        }

        public /* synthetic */ Surrogate(AccountTypeInCopyDto accountTypeInCopyDto, OptionLevelDto optionLevelDto, String str, GraphicTypeDto graphicTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AccountTypeInCopyDto.INSTANCE.getZeroValue() : accountTypeInCopyDto, (i & 2) != 0 ? OptionLevelDto.INSTANCE.getZeroValue() : optionLevelDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? GraphicTypeDto.INSTANCE.getZeroValue() : graphicTypeDto);
        }

        public final OptionLevelDto getOption_level() {
            return this.option_level;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final GraphicTypeDto getGraphic_type() {
            return this.graphic_type;
        }
    }

    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/ApprovedTradesResponseMetadataDto;", "Loptions_product/service/ApprovedTradesResponseMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/ApprovedTradesResponseMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ApprovedTradesResponseMetadataDto, ApprovedTradesResponseMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ApprovedTradesResponseMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ApprovedTradesResponseMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ApprovedTradesResponseMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) ApprovedTradesResponseMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ApprovedTradesResponseMetadata> getProtoAdapter() {
            return ApprovedTradesResponseMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ApprovedTradesResponseMetadataDto getZeroValue() {
            return ApprovedTradesResponseMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ApprovedTradesResponseMetadataDto fromProto(ApprovedTradesResponseMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ApprovedTradesResponseMetadataDto(new Surrogate(AccountTypeInCopyDto.INSTANCE.fromProto(proto.getAccount_type_in_copy()), OptionLevelDto.INSTANCE.fromProto(proto.getOption_level()), proto.getAccount_number(), GraphicTypeDto.INSTANCE.fromProto(proto.getGraphic_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.ApprovedTradesResponseMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApprovedTradesResponseMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ApprovedTradesResponseMetadataDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TYPE_UNSPECIFIED", "NONE", "INDIVIDUAL", "IRA_ROTH", "IRA_TRADITIONAL", "JOINT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountTypeInCopyDto implements Dto2<ApprovedTradesResponseMetadata.AccountTypeInCopy>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountTypeInCopyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AccountTypeInCopyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountTypeInCopyDto, ApprovedTradesResponseMetadata.AccountTypeInCopy>> binaryBase64Serializer$delegate;
        public static final AccountTypeInCopyDto ACCOUNT_TYPE_UNSPECIFIED = new ACCOUNT_TYPE_UNSPECIFIED("ACCOUNT_TYPE_UNSPECIFIED", 0);
        public static final AccountTypeInCopyDto NONE = new NONE("NONE", 1);
        public static final AccountTypeInCopyDto INDIVIDUAL = new INDIVIDUAL("INDIVIDUAL", 2);
        public static final AccountTypeInCopyDto IRA_ROTH = new IRA_ROTH("IRA_ROTH", 3);
        public static final AccountTypeInCopyDto IRA_TRADITIONAL = new IRA_TRADITIONAL("IRA_TRADITIONAL", 4);
        public static final AccountTypeInCopyDto JOINT = new JOINT("JOINT", 5);

        private static final /* synthetic */ AccountTypeInCopyDto[] $values() {
            return new AccountTypeInCopyDto[]{ACCOUNT_TYPE_UNSPECIFIED, NONE, INDIVIDUAL, IRA_ROTH, IRA_TRADITIONAL, JOINT};
        }

        public /* synthetic */ AccountTypeInCopyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AccountTypeInCopyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AccountTypeInCopyDto(String str, int i) {
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.ACCOUNT_TYPE_UNSPECIFIED", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_TYPE_UNSPECIFIED extends AccountTypeInCopyDto {
            ACCOUNT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.AccountTypeInCopy toProto() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
            }
        }

        static {
            AccountTypeInCopyDto[] accountTypeInCopyDtoArr$values = $values();
            $VALUES = accountTypeInCopyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeInCopyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.NONE", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NONE extends AccountTypeInCopyDto {
            NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.AccountTypeInCopy toProto() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.NONE;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.INDIVIDUAL", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDIVIDUAL extends AccountTypeInCopyDto {
            INDIVIDUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.AccountTypeInCopy toProto() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.INDIVIDUAL;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.IRA_ROTH", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IRA_ROTH extends AccountTypeInCopyDto {
            IRA_ROTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.AccountTypeInCopy toProto() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.IRA_ROTH;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.IRA_TRADITIONAL", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IRA_TRADITIONAL extends AccountTypeInCopyDto {
            IRA_TRADITIONAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.AccountTypeInCopy toProto() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.IRA_TRADITIONAL;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.JOINT", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class JOINT extends AccountTypeInCopyDto {
            JOINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.AccountTypeInCopy toProto() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.JOINT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "Loptions_product/service/ApprovedTradesResponseMetadata$AccountTypeInCopy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AccountTypeInCopyDto, ApprovedTradesResponseMetadata.AccountTypeInCopy> {

            /* compiled from: ApprovedTradesResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApprovedTradesResponseMetadata.AccountTypeInCopy.values().length];
                    try {
                        iArr[ApprovedTradesResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.AccountTypeInCopy.NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.AccountTypeInCopy.INDIVIDUAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.AccountTypeInCopy.IRA_ROTH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.AccountTypeInCopy.IRA_TRADITIONAL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.AccountTypeInCopy.JOINT.ordinal()] = 6;
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

            public final KSerializer<AccountTypeInCopyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountTypeInCopyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountTypeInCopyDto> getBinaryBase64Serializer() {
                return (KSerializer) AccountTypeInCopyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ApprovedTradesResponseMetadata.AccountTypeInCopy> getProtoAdapter() {
                return ApprovedTradesResponseMetadata.AccountTypeInCopy.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeInCopyDto getZeroValue() {
                return AccountTypeInCopyDto.ACCOUNT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeInCopyDto fromProto(ApprovedTradesResponseMetadata.AccountTypeInCopy proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return AccountTypeInCopyDto.ACCOUNT_TYPE_UNSPECIFIED;
                    case 2:
                        return AccountTypeInCopyDto.NONE;
                    case 3:
                        return AccountTypeInCopyDto.INDIVIDUAL;
                    case 4:
                        return AccountTypeInCopyDto.IRA_ROTH;
                    case 5:
                        return AccountTypeInCopyDto.IRA_TRADITIONAL;
                    case 6:
                        return AccountTypeInCopyDto.JOINT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<AccountTypeInCopyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AccountTypeInCopyDto, ApprovedTradesResponseMetadata.AccountTypeInCopy> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.ApprovedTradesResponseMetadata.AccountTypeInCopy", AccountTypeInCopyDto.getEntries(), AccountTypeInCopyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AccountTypeInCopyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AccountTypeInCopyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AccountTypeInCopyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AccountTypeInCopyDto valueOf(String str) {
            return (AccountTypeInCopyDto) Enum.valueOf(AccountTypeInCopyDto.class, str);
        }

        public static AccountTypeInCopyDto[] values() {
            return (AccountTypeInCopyDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OPTION_LEVEL_UNSPECIFIED", "L2", "L3", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OptionLevelDto implements Dto2<ApprovedTradesResponseMetadata.OptionLevel>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionLevelDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OptionLevelDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OptionLevelDto, ApprovedTradesResponseMetadata.OptionLevel>> binaryBase64Serializer$delegate;
        public static final OptionLevelDto OPTION_LEVEL_UNSPECIFIED = new OPTION_LEVEL_UNSPECIFIED("OPTION_LEVEL_UNSPECIFIED", 0);

        /* renamed from: L2 */
        public static final OptionLevelDto f7151L2 = new C47397L2("L2", 1);

        /* renamed from: L3 */
        public static final OptionLevelDto f7152L3 = new C47398L3("L3", 2);

        private static final /* synthetic */ OptionLevelDto[] $values() {
            return new OptionLevelDto[]{OPTION_LEVEL_UNSPECIFIED, f7151L2, f7152L3};
        }

        public /* synthetic */ OptionLevelDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OptionLevelDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OptionLevelDto(String str, int i) {
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.OptionLevelDto.OPTION_LEVEL_UNSPECIFIED", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_LEVEL_UNSPECIFIED extends OptionLevelDto {
            OPTION_LEVEL_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.OptionLevel toProto() {
                return ApprovedTradesResponseMetadata.OptionLevel.OPTION_LEVEL_UNSPECIFIED;
            }
        }

        static {
            OptionLevelDto[] optionLevelDtoArr$values = $values();
            $VALUES = optionLevelDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionLevelDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.ApprovedTradesResponseMetadataDto$OptionLevelDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ApprovedTradesResponseMetadataDto.OptionLevelDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.OptionLevelDto.L2", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: options_product.service.ApprovedTradesResponseMetadataDto$OptionLevelDto$L2 */
        static final class C47397L2 extends OptionLevelDto {
            C47397L2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.OptionLevel toProto() {
                return ApprovedTradesResponseMetadata.OptionLevel.f7149L2;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.OptionLevelDto.L3", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: options_product.service.ApprovedTradesResponseMetadataDto$OptionLevelDto$L3 */
        static final class C47398L3 extends OptionLevelDto {
            C47398L3(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.OptionLevel toProto() {
                return ApprovedTradesResponseMetadata.OptionLevel.f7150L3;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "Loptions_product/service/ApprovedTradesResponseMetadata$OptionLevel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OptionLevelDto, ApprovedTradesResponseMetadata.OptionLevel> {

            /* compiled from: ApprovedTradesResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApprovedTradesResponseMetadata.OptionLevel.values().length];
                    try {
                        iArr[ApprovedTradesResponseMetadata.OptionLevel.OPTION_LEVEL_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.OptionLevel.f7149L2.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.OptionLevel.f7150L3.ordinal()] = 3;
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

            public final KSerializer<OptionLevelDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionLevelDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionLevelDto> getBinaryBase64Serializer() {
                return (KSerializer) OptionLevelDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ApprovedTradesResponseMetadata.OptionLevel> getProtoAdapter() {
                return ApprovedTradesResponseMetadata.OptionLevel.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionLevelDto getZeroValue() {
                return OptionLevelDto.OPTION_LEVEL_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionLevelDto fromProto(ApprovedTradesResponseMetadata.OptionLevel proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OptionLevelDto.OPTION_LEVEL_UNSPECIFIED;
                }
                if (i == 2) {
                    return OptionLevelDto.f7151L2;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OptionLevelDto.f7152L3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<OptionLevelDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OptionLevelDto, ApprovedTradesResponseMetadata.OptionLevel> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.ApprovedTradesResponseMetadata.OptionLevel", OptionLevelDto.getEntries(), OptionLevelDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OptionLevelDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OptionLevelDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OptionLevelDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OptionLevelDto valueOf(String str) {
            return (OptionLevelDto) Enum.valueOf(OptionLevelDto.class, str);
        }

        public static OptionLevelDto[] values() {
            return (OptionLevelDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "GRAPHIC_TYPE_JOINT_ACCOUNT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static final class GraphicTypeDto implements Dto2<ApprovedTradesResponseMetadata.GraphicType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphicTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<GraphicTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<GraphicTypeDto, ApprovedTradesResponseMetadata.GraphicType>> binaryBase64Serializer$delegate;
        public static final GraphicTypeDto GRAPHIC_TYPE_UNSPECIFIED = new GRAPHIC_TYPE_UNSPECIFIED("GRAPHIC_TYPE_UNSPECIFIED", 0);
        public static final GraphicTypeDto GRAPHIC_TYPE_INDIVIDUAL = new GRAPHIC_TYPE_INDIVIDUAL("GRAPHIC_TYPE_INDIVIDUAL", 1);
        public static final GraphicTypeDto GRAPHIC_TYPE_RETIREMENT = new GRAPHIC_TYPE_RETIREMENT("GRAPHIC_TYPE_RETIREMENT", 2);
        public static final GraphicTypeDto GRAPHIC_TYPE_JOINT_ACCOUNT = new GRAPHIC_TYPE_JOINT_ACCOUNT("GRAPHIC_TYPE_JOINT_ACCOUNT", 3);

        private static final /* synthetic */ GraphicTypeDto[] $values() {
            return new GraphicTypeDto[]{GRAPHIC_TYPE_UNSPECIFIED, GRAPHIC_TYPE_INDIVIDUAL, GRAPHIC_TYPE_RETIREMENT, GRAPHIC_TYPE_JOINT_ACCOUNT};
        }

        public /* synthetic */ GraphicTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<GraphicTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private GraphicTypeDto(String str, int i) {
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_UNSPECIFIED", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_UNSPECIFIED extends GraphicTypeDto {
            GRAPHIC_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.GraphicType toProto() {
                return ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
            }
        }

        static {
            GraphicTypeDto[] graphicTypeDtoArr$values = $values();
            $VALUES = graphicTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphicTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.ApprovedTradesResponseMetadataDto$GraphicTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ApprovedTradesResponseMetadataDto.GraphicTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_INDIVIDUAL", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_INDIVIDUAL extends GraphicTypeDto {
            GRAPHIC_TYPE_INDIVIDUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.GraphicType toProto() {
                return ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_INDIVIDUAL;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_RETIREMENT", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_RETIREMENT extends GraphicTypeDto {
            GRAPHIC_TYPE_RETIREMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.GraphicType toProto() {
                return ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_RETIREMENT;
            }
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/ApprovedTradesResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_JOINT_ACCOUNT", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_JOINT_ACCOUNT extends GraphicTypeDto {
            GRAPHIC_TYPE_JOINT_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ApprovedTradesResponseMetadata.GraphicType toProto() {
                return ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_JOINT_ACCOUNT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "Loptions_product/service/ApprovedTradesResponseMetadata$GraphicType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<GraphicTypeDto, ApprovedTradesResponseMetadata.GraphicType> {

            /* compiled from: ApprovedTradesResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApprovedTradesResponseMetadata.GraphicType.values().length];
                    try {
                        iArr[ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_INDIVIDUAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_RETIREMENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApprovedTradesResponseMetadata.GraphicType.GRAPHIC_TYPE_JOINT_ACCOUNT.ordinal()] = 4;
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

            public final KSerializer<GraphicTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GraphicTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GraphicTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) GraphicTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ApprovedTradesResponseMetadata.GraphicType> getProtoAdapter() {
                return ApprovedTradesResponseMetadata.GraphicType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GraphicTypeDto getZeroValue() {
                return GraphicTypeDto.GRAPHIC_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GraphicTypeDto fromProto(ApprovedTradesResponseMetadata.GraphicType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return GraphicTypeDto.GRAPHIC_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return GraphicTypeDto.GRAPHIC_TYPE_INDIVIDUAL;
                }
                if (i == 3) {
                    return GraphicTypeDto.GRAPHIC_TYPE_RETIREMENT;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return GraphicTypeDto.GRAPHIC_TYPE_JOINT_ACCOUNT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ApprovedTradesResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/ApprovedTradesResponseMetadataDto$GraphicTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<GraphicTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<GraphicTypeDto, ApprovedTradesResponseMetadata.GraphicType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.ApprovedTradesResponseMetadata.GraphicType", GraphicTypeDto.getEntries(), GraphicTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public GraphicTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (GraphicTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, GraphicTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static GraphicTypeDto valueOf(String str) {
            return (GraphicTypeDto) Enum.valueOf(GraphicTypeDto.class, str);
        }

        public static GraphicTypeDto[] values() {
            return (GraphicTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/ApprovedTradesResponseMetadataDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/ApprovedTradesResponseMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<ApprovedTradesResponseMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.ApprovedTradesResponseMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ApprovedTradesResponseMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ApprovedTradesResponseMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ApprovedTradesResponseMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ApprovedTradesResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/ApprovedTradesResponseMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "options_product.service.ApprovedTradesResponseMetadataDto";
        }
    }
}
