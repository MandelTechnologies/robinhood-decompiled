package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: MarginUpgradeContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Surrogate;)V", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "spending_product", "is_gold", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getAccount_type", "()Ljava/lang/String;", "getSpending_product", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class MarginUpgradeContextDto implements Dto3<MarginUpgradeContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginUpgradeContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginUpgradeContextDto, MarginUpgradeContext>> binaryBase64Serializer$delegate;
    private static final MarginUpgradeContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginUpgradeContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginUpgradeContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getSpending_product() {
        return this.surrogate.getSpending_product();
    }

    public final BooleanDto is_gold() {
        return this.surrogate.is_gold();
    }

    public /* synthetic */ MarginUpgradeContextDto(String str, String str2, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeContextDto(String account_type, String spending_product, BooleanDto is_gold) {
        this(new Surrogate(account_type, spending_product, is_gold));
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(spending_product, "spending_product");
        Intrinsics.checkNotNullParameter(is_gold, "is_gold");
    }

    public static /* synthetic */ MarginUpgradeContextDto copy$default(MarginUpgradeContextDto marginUpgradeContextDto, String str, String str2, BooleanDto booleanDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginUpgradeContextDto.surrogate.getAccount_type();
        }
        if ((i & 2) != 0) {
            str2 = marginUpgradeContextDto.surrogate.getSpending_product();
        }
        if ((i & 4) != 0) {
            booleanDto = marginUpgradeContextDto.surrogate.is_gold();
        }
        return marginUpgradeContextDto.copy(str, str2, booleanDto);
    }

    public final MarginUpgradeContextDto copy(String account_type, String spending_product, BooleanDto is_gold) {
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(spending_product, "spending_product");
        Intrinsics.checkNotNullParameter(is_gold, "is_gold");
        return new MarginUpgradeContextDto(new Surrogate(account_type, spending_product, is_gold));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MarginUpgradeContext toProto() {
        return new MarginUpgradeContext(this.surrogate.getAccount_type(), this.surrogate.getSpending_product(), (Boolean) this.surrogate.is_gold().toProto(), null, 8, null);
    }

    public String toString() {
        return "[MarginUpgradeContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginUpgradeContextDto) && Intrinsics.areEqual(((MarginUpgradeContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginUpgradeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002'(B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0005\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Surrogate;", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "spending_product", "is_gold", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_type$annotations", "()V", "getAccount_type", "()Ljava/lang/String;", "getSpending_product$annotations", "getSpending_product", "is_gold$annotations", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_type;
        private final BooleanDto is_gold;
        private final String spending_product;

        public Surrogate() {
            this((String) null, (String) null, (BooleanDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, BooleanDto booleanDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_type;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.spending_product;
            }
            if ((i & 4) != 0) {
                booleanDto = surrogate.is_gold;
            }
            return surrogate.copy(str, str2, booleanDto);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("spendingProduct")
        @JsonAnnotations2(names = {"spending_product"})
        public static /* synthetic */ void getSpending_product$annotations() {
        }

        @SerialName("isGold")
        @JsonAnnotations2(names = {"is_gold"})
        public static /* synthetic */ void is_gold$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSpending_product() {
            return this.spending_product;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanDto getIs_gold() {
            return this.is_gold;
        }

        public final Surrogate copy(String account_type, String spending_product, BooleanDto is_gold) {
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(spending_product, "spending_product");
            Intrinsics.checkNotNullParameter(is_gold, "is_gold");
            return new Surrogate(account_type, spending_product, is_gold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_type, surrogate.account_type) && Intrinsics.areEqual(this.spending_product, surrogate.spending_product) && this.is_gold == surrogate.is_gold;
        }

        public int hashCode() {
            return (((this.account_type.hashCode() * 31) + this.spending_product.hashCode()) * 31) + this.is_gold.hashCode();
        }

        public String toString() {
            return "Surrogate(account_type=" + this.account_type + ", spending_product=" + this.spending_product + ", is_gold=" + this.is_gold + ")";
        }

        /* compiled from: MarginUpgradeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginUpgradeContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str;
            }
            if ((i & 2) == 0) {
                this.spending_product = "";
            } else {
                this.spending_product = str2;
            }
            if ((i & 4) == 0) {
                this.is_gold = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_gold = booleanDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_type, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_type);
            }
            if (!Intrinsics.areEqual(self.spending_product, "")) {
                output.encodeStringElement(serialDesc, 1, self.spending_product);
            }
            if (self.is_gold != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.is_gold);
            }
        }

        public Surrogate(String account_type, String spending_product, BooleanDto is_gold) {
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(spending_product, "spending_product");
            Intrinsics.checkNotNullParameter(is_gold, "is_gold");
            this.account_type = account_type;
            this.spending_product = spending_product;
            this.is_gold = is_gold;
        }

        public /* synthetic */ Surrogate(String str, String str2, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }

        public final String getAccount_type() {
            return this.account_type;
        }

        public final String getSpending_product() {
            return this.spending_product;
        }

        public final BooleanDto is_gold() {
            return this.is_gold;
        }
    }

    /* compiled from: MarginUpgradeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto;", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MarginUpgradeContextDto, MarginUpgradeContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginUpgradeContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginUpgradeContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginUpgradeContextDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginUpgradeContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginUpgradeContext> getProtoAdapter() {
            return MarginUpgradeContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginUpgradeContextDto getZeroValue() {
            return MarginUpgradeContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginUpgradeContextDto fromProto(MarginUpgradeContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MarginUpgradeContextDto(new Surrogate(proto.getAccount_type(), proto.getSpending_product(), BooleanDto.INSTANCE.fromProto(proto.getIs_gold())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MarginUpgradeContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginUpgradeContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginUpgradeContextDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginUpgradeContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MarginUpgradeContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MarginUpgradeContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginUpgradeContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginUpgradeContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginUpgradeContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginUpgradeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginUpgradeContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MarginUpgradeContextDto";
        }
    }
}
