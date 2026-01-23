package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RHYContextDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: RHYContextDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RHYContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Surrogate;)V", "product_area", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "product_tag", "", "entry_point", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "has_direct_deposit", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getProduct_area", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "getProduct_tag", "()Ljava/lang/String;", "getEntry_point", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "getHas_direct_deposit", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ProductAreaDto", "AccountTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RHYContextDto implements Dto3<RHYContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RHYContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RHYContextDto, RHYContext>> binaryBase64Serializer$delegate;
    private static final RHYContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RHYContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RHYContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ProductAreaDto getProduct_area() {
        return this.surrogate.getProduct_area();
    }

    public final String getProduct_tag() {
        return this.surrogate.getProduct_tag();
    }

    public final String getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final BooleanDto getHas_direct_deposit() {
        return this.surrogate.getHas_direct_deposit();
    }

    public /* synthetic */ RHYContextDto(ProductAreaDto productAreaDto, String str, String str2, AccountTypeDto accountTypeDto, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProductAreaDto.INSTANCE.getZeroValue() : productAreaDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RHYContextDto(ProductAreaDto product_area, String product_tag, String entry_point, AccountTypeDto account_type, BooleanDto has_direct_deposit) {
        this(new Surrogate(product_area, product_tag, entry_point, account_type, has_direct_deposit));
        Intrinsics.checkNotNullParameter(product_area, "product_area");
        Intrinsics.checkNotNullParameter(product_tag, "product_tag");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(has_direct_deposit, "has_direct_deposit");
    }

    public static /* synthetic */ RHYContextDto copy$default(RHYContextDto rHYContextDto, ProductAreaDto productAreaDto, String str, String str2, AccountTypeDto accountTypeDto, BooleanDto booleanDto, int i, Object obj) {
        if ((i & 1) != 0) {
            productAreaDto = rHYContextDto.surrogate.getProduct_area();
        }
        if ((i & 2) != 0) {
            str = rHYContextDto.surrogate.getProduct_tag();
        }
        if ((i & 4) != 0) {
            str2 = rHYContextDto.surrogate.getEntry_point();
        }
        if ((i & 8) != 0) {
            accountTypeDto = rHYContextDto.surrogate.getAccount_type();
        }
        if ((i & 16) != 0) {
            booleanDto = rHYContextDto.surrogate.getHas_direct_deposit();
        }
        BooleanDto booleanDto2 = booleanDto;
        String str3 = str2;
        return rHYContextDto.copy(productAreaDto, str, str3, accountTypeDto, booleanDto2);
    }

    public final RHYContextDto copy(ProductAreaDto product_area, String product_tag, String entry_point, AccountTypeDto account_type, BooleanDto has_direct_deposit) {
        Intrinsics.checkNotNullParameter(product_area, "product_area");
        Intrinsics.checkNotNullParameter(product_tag, "product_tag");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(has_direct_deposit, "has_direct_deposit");
        return new RHYContextDto(new Surrogate(product_area, product_tag, entry_point, account_type, has_direct_deposit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RHYContext toProto() {
        return new RHYContext((RHYContext.ProductArea) this.surrogate.getProduct_area().toProto(), this.surrogate.getProduct_tag(), this.surrogate.getEntry_point(), (RHYContext.AccountType) this.surrogate.getAccount_type().toProto(), (Boolean) this.surrogate.getHas_direct_deposit().toProto(), null, 32, null);
    }

    public String toString() {
        return "[RHYContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RHYContextDto) && Intrinsics.areEqual(((RHYContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: RHYContextDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 ¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Surrogate;", "", "product_area", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "product_tag", "", "entry_point", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "has_direct_deposit", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getProduct_area$annotations", "()V", "getProduct_area", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "getProduct_tag$annotations", "getProduct_tag", "()Ljava/lang/String;", "getEntry_point$annotations", "getEntry_point", "getAccount_type$annotations", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "getHas_direct_deposit$annotations", "getHas_direct_deposit", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountTypeDto account_type;
        private final String entry_point;
        private final BooleanDto has_direct_deposit;
        private final ProductAreaDto product_area;
        private final String product_tag;

        public Surrogate() {
            this((ProductAreaDto) null, (String) null, (String) null, (AccountTypeDto) null, (BooleanDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ProductAreaDto productAreaDto, String str, String str2, AccountTypeDto accountTypeDto, BooleanDto booleanDto, int i, Object obj) {
            if ((i & 1) != 0) {
                productAreaDto = surrogate.product_area;
            }
            if ((i & 2) != 0) {
                str = surrogate.product_tag;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.entry_point;
            }
            if ((i & 8) != 0) {
                accountTypeDto = surrogate.account_type;
            }
            if ((i & 16) != 0) {
                booleanDto = surrogate.has_direct_deposit;
            }
            BooleanDto booleanDto2 = booleanDto;
            String str3 = str2;
            return surrogate.copy(productAreaDto, str, str3, accountTypeDto, booleanDto2);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("hasDirectDeposit")
        @JsonAnnotations2(names = {"has_direct_deposit"})
        public static /* synthetic */ void getHas_direct_deposit$annotations() {
        }

        @SerialName("productArea")
        @JsonAnnotations2(names = {"product_area"})
        public static /* synthetic */ void getProduct_area$annotations() {
        }

        @SerialName("productTag")
        @JsonAnnotations2(names = {"product_tag"})
        public static /* synthetic */ void getProduct_tag$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ProductAreaDto getProduct_area() {
            return this.product_area;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProduct_tag() {
            return this.product_tag;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component4, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component5, reason: from getter */
        public final BooleanDto getHas_direct_deposit() {
            return this.has_direct_deposit;
        }

        public final Surrogate copy(ProductAreaDto product_area, String product_tag, String entry_point, AccountTypeDto account_type, BooleanDto has_direct_deposit) {
            Intrinsics.checkNotNullParameter(product_area, "product_area");
            Intrinsics.checkNotNullParameter(product_tag, "product_tag");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(has_direct_deposit, "has_direct_deposit");
            return new Surrogate(product_area, product_tag, entry_point, account_type, has_direct_deposit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.product_area == surrogate.product_area && Intrinsics.areEqual(this.product_tag, surrogate.product_tag) && Intrinsics.areEqual(this.entry_point, surrogate.entry_point) && this.account_type == surrogate.account_type && this.has_direct_deposit == surrogate.has_direct_deposit;
        }

        public int hashCode() {
            return (((((((this.product_area.hashCode() * 31) + this.product_tag.hashCode()) * 31) + this.entry_point.hashCode()) * 31) + this.account_type.hashCode()) * 31) + this.has_direct_deposit.hashCode();
        }

        public String toString() {
            return "Surrogate(product_area=" + this.product_area + ", product_tag=" + this.product_tag + ", entry_point=" + this.entry_point + ", account_type=" + this.account_type + ", has_direct_deposit=" + this.has_direct_deposit + ")";
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RHYContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ProductAreaDto productAreaDto, String str, String str2, AccountTypeDto accountTypeDto, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.product_area = (i & 1) == 0 ? ProductAreaDto.INSTANCE.getZeroValue() : productAreaDto;
            if ((i & 2) == 0) {
                this.product_tag = "";
            } else {
                this.product_tag = str;
            }
            if ((i & 4) == 0) {
                this.entry_point = "";
            } else {
                this.entry_point = str2;
            }
            if ((i & 8) == 0) {
                this.account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = accountTypeDto;
            }
            if ((i & 16) == 0) {
                this.has_direct_deposit = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_direct_deposit = booleanDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.product_area != ProductAreaDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ProductAreaDto.Serializer.INSTANCE, self.product_area);
            }
            if (!Intrinsics.areEqual(self.product_tag, "")) {
                output.encodeStringElement(serialDesc, 1, self.product_tag);
            }
            if (!Intrinsics.areEqual(self.entry_point, "")) {
                output.encodeStringElement(serialDesc, 2, self.entry_point);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (self.has_direct_deposit != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BooleanDto.Serializer.INSTANCE, self.has_direct_deposit);
            }
        }

        public Surrogate(ProductAreaDto product_area, String product_tag, String entry_point, AccountTypeDto account_type, BooleanDto has_direct_deposit) {
            Intrinsics.checkNotNullParameter(product_area, "product_area");
            Intrinsics.checkNotNullParameter(product_tag, "product_tag");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(has_direct_deposit, "has_direct_deposit");
            this.product_area = product_area;
            this.product_tag = product_tag;
            this.entry_point = entry_point;
            this.account_type = account_type;
            this.has_direct_deposit = has_direct_deposit;
        }

        public final ProductAreaDto getProduct_area() {
            return this.product_area;
        }

        public /* synthetic */ Surrogate(ProductAreaDto productAreaDto, String str, String str2, AccountTypeDto accountTypeDto, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ProductAreaDto.INSTANCE.getZeroValue() : productAreaDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }

        public final String getProduct_tag() {
            return this.product_tag;
        }

        public final String getEntry_point() {
            return this.entry_point;
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final BooleanDto getHas_direct_deposit() {
            return this.has_direct_deposit;
        }
    }

    /* compiled from: RHYContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto;", "Lcom/robinhood/rosetta/eventlogging/RHYContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RHYContextDto, RHYContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RHYContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RHYContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RHYContextDto> getBinaryBase64Serializer() {
            return (KSerializer) RHYContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RHYContext> getProtoAdapter() {
            return RHYContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RHYContextDto getZeroValue() {
            return RHYContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RHYContextDto fromProto(RHYContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RHYContextDto(new Surrogate(ProductAreaDto.INSTANCE.fromProto(proto.getProduct_area()), proto.getProduct_tag(), proto.getEntry_point(), AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type()), BooleanDto.INSTANCE.fromProto(proto.getHas_direct_deposit())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RHYContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RHYContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RHYContextDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RHYContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT_AREA_UNSPECIFIED", "SPENDING", "REWARDS", "BALANCE", "TRANSFER", "RHY_ONBOARDING", "CASH_ACCOUNTS", "REFERRALS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ProductAreaDto implements Dto2<RHYContext.ProductArea>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProductAreaDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ProductAreaDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ProductAreaDto, RHYContext.ProductArea>> binaryBase64Serializer$delegate;
        public static final ProductAreaDto PRODUCT_AREA_UNSPECIFIED = new PRODUCT_AREA_UNSPECIFIED("PRODUCT_AREA_UNSPECIFIED", 0);
        public static final ProductAreaDto SPENDING = new SPENDING("SPENDING", 1);
        public static final ProductAreaDto REWARDS = new REWARDS("REWARDS", 2);
        public static final ProductAreaDto BALANCE = new BALANCE("BALANCE", 3);
        public static final ProductAreaDto TRANSFER = new TRANSFER("TRANSFER", 4);
        public static final ProductAreaDto RHY_ONBOARDING = new RHY_ONBOARDING("RHY_ONBOARDING", 5);
        public static final ProductAreaDto CASH_ACCOUNTS = new CASH_ACCOUNTS("CASH_ACCOUNTS", 6);
        public static final ProductAreaDto REFERRALS = new REFERRALS("REFERRALS", 7);

        private static final /* synthetic */ ProductAreaDto[] $values() {
            return new ProductAreaDto[]{PRODUCT_AREA_UNSPECIFIED, SPENDING, REWARDS, BALANCE, TRANSFER, RHY_ONBOARDING, CASH_ACCOUNTS, REFERRALS};
        }

        public /* synthetic */ ProductAreaDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ProductAreaDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.PRODUCT_AREA_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRODUCT_AREA_UNSPECIFIED extends ProductAreaDto {
            PRODUCT_AREA_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED;
            }
        }

        private ProductAreaDto(String str, int i) {
        }

        static {
            ProductAreaDto[] productAreaDtoArr$values = $values();
            $VALUES = productAreaDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(productAreaDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RHYContextDto$ProductAreaDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RHYContextDto.ProductAreaDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.SPENDING", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPENDING extends ProductAreaDto {
            SPENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.SPENDING;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.REWARDS", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REWARDS extends ProductAreaDto {
            REWARDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.REWARDS;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.BALANCE", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BALANCE extends ProductAreaDto {
            BALANCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.BALANCE;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.TRANSFER", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER extends ProductAreaDto {
            TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.TRANSFER;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.RHY_ONBOARDING", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_ONBOARDING extends ProductAreaDto {
            RHY_ONBOARDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.RHY_ONBOARDING;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.CASH_ACCOUNTS", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASH_ACCOUNTS extends ProductAreaDto {
            CASH_ACCOUNTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.CASH_ACCOUNTS;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.ProductAreaDto.REFERRALS", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REFERRALS extends ProductAreaDto {
            REFERRALS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.ProductArea toProto() {
                return RHYContext.ProductArea.REFERRALS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "Lcom/robinhood/rosetta/eventlogging/RHYContext$ProductArea;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ProductAreaDto, RHYContext.ProductArea> {

            /* compiled from: RHYContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RHYContext.ProductArea.values().length];
                    try {
                        iArr[RHYContext.ProductArea.PRODUCT_AREA_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.SPENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.REWARDS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.BALANCE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.TRANSFER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.RHY_ONBOARDING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.CASH_ACCOUNTS.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[RHYContext.ProductArea.REFERRALS.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProductAreaDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ProductAreaDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ProductAreaDto> getBinaryBase64Serializer() {
                return (KSerializer) ProductAreaDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RHYContext.ProductArea> getProtoAdapter() {
                return RHYContext.ProductArea.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProductAreaDto getZeroValue() {
                return ProductAreaDto.PRODUCT_AREA_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProductAreaDto fromProto(RHYContext.ProductArea proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ProductAreaDto.PRODUCT_AREA_UNSPECIFIED;
                    case 2:
                        return ProductAreaDto.SPENDING;
                    case 3:
                        return ProductAreaDto.REWARDS;
                    case 4:
                        return ProductAreaDto.BALANCE;
                    case 5:
                        return ProductAreaDto.TRANSFER;
                    case 6:
                        return ProductAreaDto.RHY_ONBOARDING;
                    case 7:
                        return ProductAreaDto.CASH_ACCOUNTS;
                    case 8:
                        return ProductAreaDto.REFERRALS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$ProductAreaDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ProductAreaDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ProductAreaDto, RHYContext.ProductArea> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RHYContext.ProductArea", ProductAreaDto.getEntries(), ProductAreaDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ProductAreaDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ProductAreaDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ProductAreaDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ProductAreaDto valueOf(String str) {
            return (ProductAreaDto) Enum.valueOf(ProductAreaDto.class, str);
        }

        public static ProductAreaDto[] values() {
            return (ProductAreaDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RHYContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TYPE_UNSPECIFIED", "RHS_ONLY", "RHY_ONLY", "RHS_RHY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountTypeDto implements Dto2<RHYContext.AccountType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AccountTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountTypeDto, RHYContext.AccountType>> binaryBase64Serializer$delegate;
        public static final AccountTypeDto ACCOUNT_TYPE_UNSPECIFIED = new ACCOUNT_TYPE_UNSPECIFIED("ACCOUNT_TYPE_UNSPECIFIED", 0);
        public static final AccountTypeDto RHS_ONLY = new RHS_ONLY("RHS_ONLY", 1);
        public static final AccountTypeDto RHY_ONLY = new RHY_ONLY("RHY_ONLY", 2);
        public static final AccountTypeDto RHS_RHY = new RHS_RHY("RHS_RHY", 3);

        private static final /* synthetic */ AccountTypeDto[] $values() {
            return new AccountTypeDto[]{ACCOUNT_TYPE_UNSPECIFIED, RHS_ONLY, RHY_ONLY, RHS_RHY};
        }

        public /* synthetic */ AccountTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AccountTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_TYPE_UNSPECIFIED extends AccountTypeDto {
            ACCOUNT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.AccountType toProto() {
                return RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED;
            }
        }

        private AccountTypeDto(String str, int i) {
        }

        static {
            AccountTypeDto[] accountTypeDtoArr$values = $values();
            $VALUES = accountTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RHYContextDto$AccountTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RHYContextDto.AccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.AccountTypeDto.RHS_ONLY", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHS_ONLY extends AccountTypeDto {
            RHS_ONLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.AccountType toProto() {
                return RHYContext.AccountType.RHS_ONLY;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.AccountTypeDto.RHY_ONLY", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_ONLY extends AccountTypeDto {
            RHY_ONLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.AccountType toProto() {
                return RHYContext.AccountType.RHY_ONLY;
            }
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RHYContextDto.AccountTypeDto.RHS_RHY", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHS_RHY extends AccountTypeDto {
            RHS_RHY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RHYContext.AccountType toProto() {
                return RHYContext.AccountType.RHS_RHY;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AccountTypeDto, RHYContext.AccountType> {

            /* compiled from: RHYContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RHYContext.AccountType.values().length];
                    try {
                        iArr[RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RHYContext.AccountType.RHS_ONLY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RHYContext.AccountType.RHY_ONLY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RHYContext.AccountType.RHS_RHY.ordinal()] = 4;
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

            public final KSerializer<AccountTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AccountTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RHYContext.AccountType> getProtoAdapter() {
                return RHYContext.AccountType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeDto getZeroValue() {
                return AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountTypeDto fromProto(RHYContext.AccountType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AccountTypeDto.RHS_ONLY;
                }
                if (i == 3) {
                    return AccountTypeDto.RHY_ONLY;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AccountTypeDto.RHS_RHY;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RHYContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$AccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AccountTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AccountTypeDto, RHYContext.AccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RHYContext.AccountType", AccountTypeDto.getEntries(), AccountTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AccountTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AccountTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AccountTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AccountTypeDto valueOf(String str) {
            return (AccountTypeDto) Enum.valueOf(AccountTypeDto.class, str);
        }

        public static AccountTypeDto[] values() {
            return (AccountTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: RHYContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RHYContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RHYContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RHYContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RHYContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RHYContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RHYContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RHYContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RHYContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RHYContextDto";
        }
    }
}
