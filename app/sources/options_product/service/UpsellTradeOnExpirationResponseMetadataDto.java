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
import com.robinhood.utils.extensions.ResourceTypes;
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
import options_product.service.UpsellTradeOnExpirationResponseMetadata;
import options_product.service.UpsellTradeOnExpirationResponseMetadataDto;

/* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006'&()*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012¨\u0006,"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata;", "Landroid/os/Parcelable;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;)V", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", ResourceTypes.STYLE, "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "account_type_in_copy", "", "account_number", "(Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;Ljava/lang/String;)V", "toProto", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadata;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;", "getStyle", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "getAccount_number", "Companion", "Surrogate", "StyleDto", "AccountTypeInCopyDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class UpsellTradeOnExpirationResponseMetadataDto implements Dto3<UpsellTradeOnExpirationResponseMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UpsellTradeOnExpirationResponseMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UpsellTradeOnExpirationResponseMetadataDto, UpsellTradeOnExpirationResponseMetadata>> binaryBase64Serializer$delegate;
    private static final UpsellTradeOnExpirationResponseMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UpsellTradeOnExpirationResponseMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UpsellTradeOnExpirationResponseMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StyleDto getStyle() {
        return this.surrogate.getStyle();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public /* synthetic */ UpsellTradeOnExpirationResponseMetadataDto(StyleDto styleDto, AccountTypeInCopyDto accountTypeInCopyDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StyleDto.INSTANCE.getZeroValue() : styleDto, (i & 2) != 0 ? AccountTypeInCopyDto.INSTANCE.getZeroValue() : accountTypeInCopyDto, (i & 4) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpsellTradeOnExpirationResponseMetadataDto(StyleDto style, AccountTypeInCopyDto account_type_in_copy, String account_number) {
        this(new Surrogate(style, account_type_in_copy, account_number));
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UpsellTradeOnExpirationResponseMetadata toProto() {
        return new UpsellTradeOnExpirationResponseMetadata((UpsellTradeOnExpirationResponseMetadata.Style) this.surrogate.getStyle().toProto(), (UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy) this.surrogate.getAccount_type_in_copy().toProto(), this.surrogate.getAccount_number(), null, 8, null);
    }

    public String toString() {
        return "[UpsellTradeOnExpirationResponseMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UpsellTradeOnExpirationResponseMetadataDto) && Intrinsics.areEqual(((UpsellTradeOnExpirationResponseMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\u0019¨\u0006."}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;", "", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", ResourceTypes.STYLE, "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "account_type_in_copy", "", "account_number", "<init>", "(Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILoptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "getStyle", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "getStyle$annotations", "()V", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "getAccount_type_in_copy", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "getAccount_type_in_copy$annotations", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final AccountTypeInCopyDto account_type_in_copy;
        private final StyleDto style;

        public Surrogate() {
            this((StyleDto) null, (AccountTypeInCopyDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.style == surrogate.style && this.account_type_in_copy == surrogate.account_type_in_copy && Intrinsics.areEqual(this.account_number, surrogate.account_number);
        }

        public int hashCode() {
            return (((this.style.hashCode() * 31) + this.account_type_in_copy.hashCode()) * 31) + this.account_number.hashCode();
        }

        public String toString() {
            return "Surrogate(style=" + this.style + ", account_type_in_copy=" + this.account_type_in_copy + ", account_number=" + this.account_number + ")";
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UpsellTradeOnExpirationResponseMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, StyleDto styleDto, AccountTypeInCopyDto accountTypeInCopyDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.style = (i & 1) == 0 ? StyleDto.INSTANCE.getZeroValue() : styleDto;
            if ((i & 2) == 0) {
                this.account_type_in_copy = AccountTypeInCopyDto.INSTANCE.getZeroValue();
            } else {
                this.account_type_in_copy = accountTypeInCopyDto;
            }
            if ((i & 4) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.style != StyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, StyleDto.Serializer.INSTANCE, self.style);
            }
            if (self.account_type_in_copy != AccountTypeInCopyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AccountTypeInCopyDto.Serializer.INSTANCE, self.account_type_in_copy);
            }
            if (Intrinsics.areEqual(self.account_number, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.account_number);
        }

        public Surrogate(StyleDto style, AccountTypeInCopyDto account_type_in_copy, String account_number) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.style = style;
            this.account_type_in_copy = account_type_in_copy;
            this.account_number = account_number;
        }

        public final StyleDto getStyle() {
            return this.style;
        }

        public /* synthetic */ Surrogate(StyleDto styleDto, AccountTypeInCopyDto accountTypeInCopyDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? StyleDto.INSTANCE.getZeroValue() : styleDto, (i & 2) != 0 ? AccountTypeInCopyDto.INSTANCE.getZeroValue() : accountTypeInCopyDto, (i & 4) != 0 ? "" : str);
        }

        public final AccountTypeInCopyDto getAccount_type_in_copy() {
            return this.account_type_in_copy;
        }

        public final String getAccount_number() {
            return this.account_number;
        }
    }

    /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<UpsellTradeOnExpirationResponseMetadataDto, UpsellTradeOnExpirationResponseMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UpsellTradeOnExpirationResponseMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UpsellTradeOnExpirationResponseMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UpsellTradeOnExpirationResponseMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) UpsellTradeOnExpirationResponseMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UpsellTradeOnExpirationResponseMetadata> getProtoAdapter() {
            return UpsellTradeOnExpirationResponseMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UpsellTradeOnExpirationResponseMetadataDto getZeroValue() {
            return UpsellTradeOnExpirationResponseMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UpsellTradeOnExpirationResponseMetadataDto fromProto(UpsellTradeOnExpirationResponseMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new UpsellTradeOnExpirationResponseMetadataDto(new Surrogate(StyleDto.INSTANCE.fromProto(proto.getStyle()), AccountTypeInCopyDto.INSTANCE.fromProto(proto.getAccount_type_in_copy()), proto.getAccount_number()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.UpsellTradeOnExpirationResponseMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpsellTradeOnExpirationResponseMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UpsellTradeOnExpirationResponseMetadataDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$Style;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_UNSPECIFIED", "STYLE_INDIVIDUAL", "STYLE_RETIREMENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StyleDto implements Dto2<UpsellTradeOnExpirationResponseMetadata.Style>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StyleDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StyleDto, UpsellTradeOnExpirationResponseMetadata.Style>> binaryBase64Serializer$delegate;
        public static final StyleDto STYLE_UNSPECIFIED = new STYLE_UNSPECIFIED("STYLE_UNSPECIFIED", 0);
        public static final StyleDto STYLE_INDIVIDUAL = new STYLE_INDIVIDUAL("STYLE_INDIVIDUAL", 1);
        public static final StyleDto STYLE_RETIREMENT = new STYLE_RETIREMENT("STYLE_RETIREMENT", 2);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{STYLE_UNSPECIFIED, STYLE_INDIVIDUAL, STYLE_RETIREMENT};
        }

        public /* synthetic */ StyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StyleDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private StyleDto(String str, int i) {
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.StyleDto.STYLE_UNSPECIFIED", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$Style;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STYLE_UNSPECIFIED extends StyleDto {
            STYLE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.Style toProto() {
                return UpsellTradeOnExpirationResponseMetadata.Style.STYLE_UNSPECIFIED;
            }
        }

        static {
            StyleDto[] styleDtoArr$values = $values();
            $VALUES = styleDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(styleDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.UpsellTradeOnExpirationResponseMetadataDto$StyleDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UpsellTradeOnExpirationResponseMetadataDto.StyleDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.StyleDto.STYLE_INDIVIDUAL", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$Style;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STYLE_INDIVIDUAL extends StyleDto {
            STYLE_INDIVIDUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.Style toProto() {
                return UpsellTradeOnExpirationResponseMetadata.Style.STYLE_INDIVIDUAL;
            }
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.StyleDto.STYLE_RETIREMENT", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$Style;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STYLE_RETIREMENT extends StyleDto {
            STYLE_RETIREMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.Style toProto() {
                return UpsellTradeOnExpirationResponseMetadata.Style.STYLE_RETIREMENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$Style;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StyleDto, UpsellTradeOnExpirationResponseMetadata.Style> {

            /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[UpsellTradeOnExpirationResponseMetadata.Style.values().length];
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.Style.STYLE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.Style.STYLE_INDIVIDUAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.Style.STYLE_RETIREMENT.ordinal()] = 3;
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

            public final KSerializer<StyleDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StyleDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StyleDto> getBinaryBase64Serializer() {
                return (KSerializer) StyleDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<UpsellTradeOnExpirationResponseMetadata.Style> getProtoAdapter() {
                return UpsellTradeOnExpirationResponseMetadata.Style.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StyleDto getZeroValue() {
                return StyleDto.STYLE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StyleDto fromProto(UpsellTradeOnExpirationResponseMetadata.Style proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StyleDto.STYLE_UNSPECIFIED;
                }
                if (i == 2) {
                    return StyleDto.STYLE_INDIVIDUAL;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return StyleDto.STYLE_RETIREMENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$StyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<StyleDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StyleDto, UpsellTradeOnExpirationResponseMetadata.Style> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.UpsellTradeOnExpirationResponseMetadata.Style", StyleDto.getEntries(), StyleDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StyleDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StyleDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StyleDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TYPE_UNSPECIFIED", "NONE", "INDIVIDUAL", "IRA_ROTH", "IRA_TRADITIONAL", "JOINT_TENANCY_WITH_ROS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountTypeInCopyDto implements Dto2<UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountTypeInCopyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AccountTypeInCopyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountTypeInCopyDto, UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy>> binaryBase64Serializer$delegate;
        public static final AccountTypeInCopyDto ACCOUNT_TYPE_UNSPECIFIED = new ACCOUNT_TYPE_UNSPECIFIED("ACCOUNT_TYPE_UNSPECIFIED", 0);
        public static final AccountTypeInCopyDto NONE = new NONE("NONE", 1);
        public static final AccountTypeInCopyDto INDIVIDUAL = new INDIVIDUAL("INDIVIDUAL", 2);
        public static final AccountTypeInCopyDto IRA_ROTH = new IRA_ROTH("IRA_ROTH", 3);
        public static final AccountTypeInCopyDto IRA_TRADITIONAL = new IRA_TRADITIONAL("IRA_TRADITIONAL", 4);
        public static final AccountTypeInCopyDto JOINT_TENANCY_WITH_ROS = new JOINT_TENANCY_WITH_ROS("JOINT_TENANCY_WITH_ROS", 5);

        private static final /* synthetic */ AccountTypeInCopyDto[] $values() {
            return new AccountTypeInCopyDto[]{ACCOUNT_TYPE_UNSPECIFIED, NONE, INDIVIDUAL, IRA_ROTH, IRA_TRADITIONAL, JOINT_TENANCY_WITH_ROS};
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

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.ACCOUNT_TYPE_UNSPECIFIED", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_TYPE_UNSPECIFIED extends AccountTypeInCopyDto {
            ACCOUNT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy toProto() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
            }
        }

        static {
            AccountTypeInCopyDto[] accountTypeInCopyDtoArr$values = $values();
            $VALUES = accountTypeInCopyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeInCopyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.NONE", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NONE extends AccountTypeInCopyDto {
            NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy toProto() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.NONE;
            }
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.INDIVIDUAL", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDIVIDUAL extends AccountTypeInCopyDto {
            INDIVIDUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy toProto() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.INDIVIDUAL;
            }
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.IRA_ROTH", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IRA_ROTH extends AccountTypeInCopyDto {
            IRA_ROTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy toProto() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.IRA_ROTH;
            }
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.IRA_TRADITIONAL", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IRA_TRADITIONAL extends AccountTypeInCopyDto {
            IRA_TRADITIONAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy toProto() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.IRA_TRADITIONAL;
            }
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/UpsellTradeOnExpirationResponseMetadataDto.AccountTypeInCopyDto.JOINT_TENANCY_WITH_ROS", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "toProto", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JOINT_TENANCY_WITH_ROS extends AccountTypeInCopyDto {
            JOINT_TENANCY_WITH_ROS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy toProto() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.JOINT_TENANCY_WITH_ROS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata$AccountTypeInCopy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AccountTypeInCopyDto, UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy> {

            /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.values().length];
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.INDIVIDUAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.IRA_ROTH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.IRA_TRADITIONAL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
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
            public ProtoAdapter<UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy> getProtoAdapter() {
                return UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeInCopyDto getZeroValue() {
                return AccountTypeInCopyDto.ACCOUNT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeInCopyDto fromProto(UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy proto) {
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
                        return AccountTypeInCopyDto.JOINT_TENANCY_WITH_ROS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$AccountTypeInCopyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<AccountTypeInCopyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AccountTypeInCopyDto, UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.UpsellTradeOnExpirationResponseMetadata.AccountTypeInCopy", AccountTypeInCopyDto.getEntries(), AccountTypeInCopyDto.INSTANCE.getZeroValue());

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

    /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<UpsellTradeOnExpirationResponseMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.UpsellTradeOnExpirationResponseMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UpsellTradeOnExpirationResponseMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UpsellTradeOnExpirationResponseMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UpsellTradeOnExpirationResponseMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UpsellTradeOnExpirationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/UpsellTradeOnExpirationResponseMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "options_product.service.UpsellTradeOnExpirationResponseMetadataDto";
        }
    }
}
