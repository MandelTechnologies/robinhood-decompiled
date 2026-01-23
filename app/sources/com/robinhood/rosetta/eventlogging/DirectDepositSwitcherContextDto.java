package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContextDto;
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

/* compiled from: DirectDepositSwitcherContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Surrogate;)V", "payroll_provider", "", "close_reason", "distribution_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "distribution_amount", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;D)V", "getPayroll_provider", "()Ljava/lang/String;", "getClose_reason", "getDistribution_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "getDistribution_amount", "()D", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DistributionTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DirectDepositSwitcherContextDto implements Dto3<DirectDepositSwitcherContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DirectDepositSwitcherContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DirectDepositSwitcherContextDto, DirectDepositSwitcherContext>> binaryBase64Serializer$delegate;
    private static final DirectDepositSwitcherContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DirectDepositSwitcherContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DirectDepositSwitcherContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPayroll_provider() {
        return this.surrogate.getPayroll_provider();
    }

    public final String getClose_reason() {
        return this.surrogate.getClose_reason();
    }

    public final DistributionTypeDto getDistribution_type() {
        return this.surrogate.getDistribution_type();
    }

    public final double getDistribution_amount() {
        return this.surrogate.getDistribution_amount();
    }

    public /* synthetic */ DirectDepositSwitcherContextDto(String str, String str2, DistributionTypeDto distributionTypeDto, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DistributionTypeDto.INSTANCE.getZeroValue() : distributionTypeDto, (i & 8) != 0 ? 0.0d : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DirectDepositSwitcherContextDto(String payroll_provider, String close_reason, DistributionTypeDto distribution_type, double d) {
        this(new Surrogate(payroll_provider, close_reason, distribution_type, d));
        Intrinsics.checkNotNullParameter(payroll_provider, "payroll_provider");
        Intrinsics.checkNotNullParameter(close_reason, "close_reason");
        Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
    }

    public static /* synthetic */ DirectDepositSwitcherContextDto copy$default(DirectDepositSwitcherContextDto directDepositSwitcherContextDto, String str, String str2, DistributionTypeDto distributionTypeDto, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directDepositSwitcherContextDto.surrogate.getPayroll_provider();
        }
        if ((i & 2) != 0) {
            str2 = directDepositSwitcherContextDto.surrogate.getClose_reason();
        }
        if ((i & 4) != 0) {
            distributionTypeDto = directDepositSwitcherContextDto.surrogate.getDistribution_type();
        }
        if ((i & 8) != 0) {
            d = directDepositSwitcherContextDto.surrogate.getDistribution_amount();
        }
        DistributionTypeDto distributionTypeDto2 = distributionTypeDto;
        return directDepositSwitcherContextDto.copy(str, str2, distributionTypeDto2, d);
    }

    public final DirectDepositSwitcherContextDto copy(String payroll_provider, String close_reason, DistributionTypeDto distribution_type, double distribution_amount) {
        Intrinsics.checkNotNullParameter(payroll_provider, "payroll_provider");
        Intrinsics.checkNotNullParameter(close_reason, "close_reason");
        Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
        return new DirectDepositSwitcherContextDto(new Surrogate(payroll_provider, close_reason, distribution_type, distribution_amount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DirectDepositSwitcherContext toProto() {
        return new DirectDepositSwitcherContext(this.surrogate.getPayroll_provider(), this.surrogate.getClose_reason(), (DirectDepositSwitcherContext.DistributionType) this.surrogate.getDistribution_type().toProto(), this.surrogate.getDistribution_amount(), null, 16, null);
    }

    public String toString() {
        return "[DirectDepositSwitcherContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DirectDepositSwitcherContextDto) && Intrinsics.areEqual(((DirectDepositSwitcherContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: DirectDepositSwitcherContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\f\u0010\rBA\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u0018\u0010\"\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Surrogate;", "", "payroll_provider", "", "close_reason", "distribution_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "distribution_amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPayroll_provider$annotations", "()V", "getPayroll_provider", "()Ljava/lang/String;", "getClose_reason$annotations", "getClose_reason", "getDistribution_type$annotations", "getDistribution_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "getDistribution_amount$annotations", "getDistribution_amount", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String close_reason;
        private final double distribution_amount;
        private final DistributionTypeDto distribution_type;
        private final String payroll_provider;

        public Surrogate() {
            this((String) null, (String) null, (DistributionTypeDto) null, 0.0d, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, DistributionTypeDto distributionTypeDto, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.payroll_provider;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.close_reason;
            }
            if ((i & 4) != 0) {
                distributionTypeDto = surrogate.distribution_type;
            }
            if ((i & 8) != 0) {
                d = surrogate.distribution_amount;
            }
            DistributionTypeDto distributionTypeDto2 = distributionTypeDto;
            return surrogate.copy(str, str2, distributionTypeDto2, d);
        }

        @SerialName("closeReason")
        @JsonAnnotations2(names = {"close_reason"})
        public static /* synthetic */ void getClose_reason$annotations() {
        }

        @SerialName("distributionAmount")
        @JsonAnnotations2(names = {"distribution_amount"})
        public static /* synthetic */ void getDistribution_amount$annotations() {
        }

        @SerialName("distributionType")
        @JsonAnnotations2(names = {"distribution_type"})
        public static /* synthetic */ void getDistribution_type$annotations() {
        }

        @SerialName("payrollProvider")
        @JsonAnnotations2(names = {"payroll_provider"})
        public static /* synthetic */ void getPayroll_provider$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPayroll_provider() {
            return this.payroll_provider;
        }

        /* renamed from: component2, reason: from getter */
        public final String getClose_reason() {
            return this.close_reason;
        }

        /* renamed from: component3, reason: from getter */
        public final DistributionTypeDto getDistribution_type() {
            return this.distribution_type;
        }

        /* renamed from: component4, reason: from getter */
        public final double getDistribution_amount() {
            return this.distribution_amount;
        }

        public final Surrogate copy(String payroll_provider, String close_reason, DistributionTypeDto distribution_type, double distribution_amount) {
            Intrinsics.checkNotNullParameter(payroll_provider, "payroll_provider");
            Intrinsics.checkNotNullParameter(close_reason, "close_reason");
            Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
            return new Surrogate(payroll_provider, close_reason, distribution_type, distribution_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.payroll_provider, surrogate.payroll_provider) && Intrinsics.areEqual(this.close_reason, surrogate.close_reason) && this.distribution_type == surrogate.distribution_type && Double.compare(this.distribution_amount, surrogate.distribution_amount) == 0;
        }

        public int hashCode() {
            return (((((this.payroll_provider.hashCode() * 31) + this.close_reason.hashCode()) * 31) + this.distribution_type.hashCode()) * 31) + Double.hashCode(this.distribution_amount);
        }

        public String toString() {
            return "Surrogate(payroll_provider=" + this.payroll_provider + ", close_reason=" + this.close_reason + ", distribution_type=" + this.distribution_type + ", distribution_amount=" + this.distribution_amount + ")";
        }

        /* compiled from: DirectDepositSwitcherContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DirectDepositSwitcherContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, DistributionTypeDto distributionTypeDto, double d, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.payroll_provider = "";
            } else {
                this.payroll_provider = str;
            }
            if ((i & 2) == 0) {
                this.close_reason = "";
            } else {
                this.close_reason = str2;
            }
            if ((i & 4) == 0) {
                this.distribution_type = DistributionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.distribution_type = distributionTypeDto;
            }
            if ((i & 8) == 0) {
                this.distribution_amount = 0.0d;
            } else {
                this.distribution_amount = d;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.payroll_provider, "")) {
                output.encodeStringElement(serialDesc, 0, self.payroll_provider);
            }
            if (!Intrinsics.areEqual(self.close_reason, "")) {
                output.encodeStringElement(serialDesc, 1, self.close_reason);
            }
            if (self.distribution_type != DistributionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, DistributionTypeDto.Serializer.INSTANCE, self.distribution_type);
            }
            if (Double.compare(self.distribution_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.distribution_amount));
            }
        }

        public Surrogate(String payroll_provider, String close_reason, DistributionTypeDto distribution_type, double d) {
            Intrinsics.checkNotNullParameter(payroll_provider, "payroll_provider");
            Intrinsics.checkNotNullParameter(close_reason, "close_reason");
            Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
            this.payroll_provider = payroll_provider;
            this.close_reason = close_reason;
            this.distribution_type = distribution_type;
            this.distribution_amount = d;
        }

        public /* synthetic */ Surrogate(String str, String str2, DistributionTypeDto distributionTypeDto, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DistributionTypeDto.INSTANCE.getZeroValue() : distributionTypeDto, (i & 8) != 0 ? 0.0d : d);
        }

        public final String getPayroll_provider() {
            return this.payroll_provider;
        }

        public final String getClose_reason() {
            return this.close_reason;
        }

        public final DistributionTypeDto getDistribution_type() {
            return this.distribution_type;
        }

        public final double getDistribution_amount() {
            return this.distribution_amount;
        }
    }

    /* compiled from: DirectDepositSwitcherContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DirectDepositSwitcherContextDto, DirectDepositSwitcherContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DirectDepositSwitcherContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DirectDepositSwitcherContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DirectDepositSwitcherContextDto> getBinaryBase64Serializer() {
            return (KSerializer) DirectDepositSwitcherContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DirectDepositSwitcherContext> getProtoAdapter() {
            return DirectDepositSwitcherContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DirectDepositSwitcherContextDto getZeroValue() {
            return DirectDepositSwitcherContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DirectDepositSwitcherContextDto fromProto(DirectDepositSwitcherContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DirectDepositSwitcherContextDto(new Surrogate(proto.getPayroll_provider(), proto.getClose_reason(), DistributionTypeDto.INSTANCE.fromProto(proto.getDistribution_type()), proto.getDistribution_amount()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositSwitcherContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DirectDepositSwitcherContextDto(null, null, null, 0.0d, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositSwitcherContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DISTRIBUTION_TYPE_UNSPECIFIED", "PERCENT", "FIXED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DistributionTypeDto implements Dto2<DirectDepositSwitcherContext.DistributionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DistributionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DistributionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DistributionTypeDto, DirectDepositSwitcherContext.DistributionType>> binaryBase64Serializer$delegate;
        public static final DistributionTypeDto DISTRIBUTION_TYPE_UNSPECIFIED = new DISTRIBUTION_TYPE_UNSPECIFIED("DISTRIBUTION_TYPE_UNSPECIFIED", 0);
        public static final DistributionTypeDto PERCENT = new PERCENT("PERCENT", 1);
        public static final DistributionTypeDto FIXED = new FIXED("FIXED", 2);

        private static final /* synthetic */ DistributionTypeDto[] $values() {
            return new DistributionTypeDto[]{DISTRIBUTION_TYPE_UNSPECIFIED, PERCENT, FIXED};
        }

        public /* synthetic */ DistributionTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DistributionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DistributionTypeDto(String str, int i) {
        }

        /* compiled from: DirectDepositSwitcherContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto.DistributionTypeDto.DISTRIBUTION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISTRIBUTION_TYPE_UNSPECIFIED extends DistributionTypeDto {
            DISTRIBUTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositSwitcherContext.DistributionType toProto() {
                return DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED;
            }
        }

        static {
            DistributionTypeDto[] distributionTypeDtoArr$values = $values();
            $VALUES = distributionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(distributionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContextDto$DistributionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectDepositSwitcherContextDto.DistributionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DirectDepositSwitcherContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto.DistributionTypeDto.PERCENT", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERCENT extends DistributionTypeDto {
            PERCENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositSwitcherContext.DistributionType toProto() {
                return DirectDepositSwitcherContext.DistributionType.PERCENT;
            }
        }

        /* compiled from: DirectDepositSwitcherContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto.DistributionTypeDto.FIXED", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIXED extends DistributionTypeDto {
            FIXED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositSwitcherContext.DistributionType toProto() {
                return DirectDepositSwitcherContext.DistributionType.FIXED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DirectDepositSwitcherContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DistributionTypeDto, DirectDepositSwitcherContext.DistributionType> {

            /* compiled from: DirectDepositSwitcherContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DirectDepositSwitcherContext.DistributionType.values().length];
                    try {
                        iArr[DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DirectDepositSwitcherContext.DistributionType.PERCENT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DirectDepositSwitcherContext.DistributionType.FIXED.ordinal()] = 3;
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

            public final KSerializer<DistributionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DistributionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DistributionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) DistributionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DirectDepositSwitcherContext.DistributionType> getProtoAdapter() {
                return DirectDepositSwitcherContext.DistributionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DistributionTypeDto getZeroValue() {
                return DistributionTypeDto.DISTRIBUTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DistributionTypeDto fromProto(DirectDepositSwitcherContext.DistributionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DistributionTypeDto.DISTRIBUTION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DistributionTypeDto.PERCENT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DistributionTypeDto.FIXED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DirectDepositSwitcherContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$DistributionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DistributionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DistributionTypeDto, DirectDepositSwitcherContext.DistributionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DirectDepositSwitcherContext.DistributionType", DistributionTypeDto.getEntries(), DistributionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DistributionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DistributionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DistributionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DistributionTypeDto valueOf(String str) {
            return (DistributionTypeDto) Enum.valueOf(DistributionTypeDto.class, str);
        }

        public static DistributionTypeDto[] values() {
            return (DistributionTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DirectDepositSwitcherContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DirectDepositSwitcherContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DirectDepositSwitcherContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DirectDepositSwitcherContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DirectDepositSwitcherContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DirectDepositSwitcherContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DirectDepositSwitcherContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContextDto";
        }
    }
}
