package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.directdeposit.DirectDepositConstants;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositContextDto;
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

/* compiled from: DirectDepositContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006$%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Surrogate;)V", "direct_deposit_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "deposit_amount_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "deposit_amount", "", "(Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;Ljava/lang/String;)V", "getDirect_deposit_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "getDeposit_amount_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "getDeposit_amount", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DirectDepositTypeDto", "DepositAmountTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DirectDepositContextDto implements Dto3<DirectDepositContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DirectDepositContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DirectDepositContextDto, DirectDepositContext>> binaryBase64Serializer$delegate;
    private static final DirectDepositContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DirectDepositContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DirectDepositContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DirectDepositTypeDto getDirect_deposit_type() {
        return this.surrogate.getDirect_deposit_type();
    }

    public final DepositAmountTypeDto getDeposit_amount_type() {
        return this.surrogate.getDeposit_amount_type();
    }

    public final String getDeposit_amount() {
        return this.surrogate.getDeposit_amount();
    }

    public /* synthetic */ DirectDepositContextDto(DirectDepositTypeDto directDepositTypeDto, DepositAmountTypeDto depositAmountTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DirectDepositTypeDto.INSTANCE.getZeroValue() : directDepositTypeDto, (i & 2) != 0 ? DepositAmountTypeDto.INSTANCE.getZeroValue() : depositAmountTypeDto, (i & 4) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DirectDepositContextDto(DirectDepositTypeDto direct_deposit_type, DepositAmountTypeDto deposit_amount_type, String deposit_amount) {
        this(new Surrogate(direct_deposit_type, deposit_amount_type, deposit_amount));
        Intrinsics.checkNotNullParameter(direct_deposit_type, "direct_deposit_type");
        Intrinsics.checkNotNullParameter(deposit_amount_type, "deposit_amount_type");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
    }

    public static /* synthetic */ DirectDepositContextDto copy$default(DirectDepositContextDto directDepositContextDto, DirectDepositTypeDto directDepositTypeDto, DepositAmountTypeDto depositAmountTypeDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            directDepositTypeDto = directDepositContextDto.surrogate.getDirect_deposit_type();
        }
        if ((i & 2) != 0) {
            depositAmountTypeDto = directDepositContextDto.surrogate.getDeposit_amount_type();
        }
        if ((i & 4) != 0) {
            str = directDepositContextDto.surrogate.getDeposit_amount();
        }
        return directDepositContextDto.copy(directDepositTypeDto, depositAmountTypeDto, str);
    }

    public final DirectDepositContextDto copy(DirectDepositTypeDto direct_deposit_type, DepositAmountTypeDto deposit_amount_type, String deposit_amount) {
        Intrinsics.checkNotNullParameter(direct_deposit_type, "direct_deposit_type");
        Intrinsics.checkNotNullParameter(deposit_amount_type, "deposit_amount_type");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
        return new DirectDepositContextDto(new Surrogate(direct_deposit_type, deposit_amount_type, deposit_amount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DirectDepositContext toProto() {
        return new DirectDepositContext((DirectDepositContext.DirectDepositType) this.surrogate.getDirect_deposit_type().toProto(), (DirectDepositContext.DepositAmountType) this.surrogate.getDeposit_amount_type().toProto(), this.surrogate.getDeposit_amount(), null, 8, null);
    }

    public String toString() {
        return "[DirectDepositContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DirectDepositContextDto) && Intrinsics.areEqual(((DirectDepositContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: DirectDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Surrogate;", "", "direct_deposit_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "deposit_amount_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "deposit_amount", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDirect_deposit_type$annotations", "()V", "getDirect_deposit_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "getDeposit_amount_type$annotations", "getDeposit_amount_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "getDeposit_amount$annotations", "getDeposit_amount", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String deposit_amount;
        private final DepositAmountTypeDto deposit_amount_type;
        private final DirectDepositTypeDto direct_deposit_type;

        public Surrogate() {
            this((DirectDepositTypeDto) null, (DepositAmountTypeDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DirectDepositTypeDto directDepositTypeDto, DepositAmountTypeDto depositAmountTypeDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                directDepositTypeDto = surrogate.direct_deposit_type;
            }
            if ((i & 2) != 0) {
                depositAmountTypeDto = surrogate.deposit_amount_type;
            }
            if ((i & 4) != 0) {
                str = surrogate.deposit_amount;
            }
            return surrogate.copy(directDepositTypeDto, depositAmountTypeDto, str);
        }

        @SerialName(EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT)
        @JsonAnnotations2(names = {"deposit_amount"})
        public static /* synthetic */ void getDeposit_amount$annotations() {
        }

        @SerialName("depositAmountType")
        @JsonAnnotations2(names = {"deposit_amount_type"})
        public static /* synthetic */ void getDeposit_amount_type$annotations() {
        }

        @SerialName(DirectDepositConstants.directDepositTypeResultKey)
        @JsonAnnotations2(names = {"direct_deposit_type"})
        public static /* synthetic */ void getDirect_deposit_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DirectDepositTypeDto getDirect_deposit_type() {
            return this.direct_deposit_type;
        }

        /* renamed from: component2, reason: from getter */
        public final DepositAmountTypeDto getDeposit_amount_type() {
            return this.deposit_amount_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeposit_amount() {
            return this.deposit_amount;
        }

        public final Surrogate copy(DirectDepositTypeDto direct_deposit_type, DepositAmountTypeDto deposit_amount_type, String deposit_amount) {
            Intrinsics.checkNotNullParameter(direct_deposit_type, "direct_deposit_type");
            Intrinsics.checkNotNullParameter(deposit_amount_type, "deposit_amount_type");
            Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
            return new Surrogate(direct_deposit_type, deposit_amount_type, deposit_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.direct_deposit_type == surrogate.direct_deposit_type && this.deposit_amount_type == surrogate.deposit_amount_type && Intrinsics.areEqual(this.deposit_amount, surrogate.deposit_amount);
        }

        public int hashCode() {
            return (((this.direct_deposit_type.hashCode() * 31) + this.deposit_amount_type.hashCode()) * 31) + this.deposit_amount.hashCode();
        }

        public String toString() {
            return "Surrogate(direct_deposit_type=" + this.direct_deposit_type + ", deposit_amount_type=" + this.deposit_amount_type + ", deposit_amount=" + this.deposit_amount + ")";
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DirectDepositContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DirectDepositTypeDto directDepositTypeDto, DepositAmountTypeDto depositAmountTypeDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.direct_deposit_type = (i & 1) == 0 ? DirectDepositTypeDto.INSTANCE.getZeroValue() : directDepositTypeDto;
            if ((i & 2) == 0) {
                this.deposit_amount_type = DepositAmountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.deposit_amount_type = depositAmountTypeDto;
            }
            if ((i & 4) == 0) {
                this.deposit_amount = "";
            } else {
                this.deposit_amount = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.direct_deposit_type != DirectDepositTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DirectDepositTypeDto.Serializer.INSTANCE, self.direct_deposit_type);
            }
            if (self.deposit_amount_type != DepositAmountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, DepositAmountTypeDto.Serializer.INSTANCE, self.deposit_amount_type);
            }
            if (Intrinsics.areEqual(self.deposit_amount, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.deposit_amount);
        }

        public Surrogate(DirectDepositTypeDto direct_deposit_type, DepositAmountTypeDto deposit_amount_type, String deposit_amount) {
            Intrinsics.checkNotNullParameter(direct_deposit_type, "direct_deposit_type");
            Intrinsics.checkNotNullParameter(deposit_amount_type, "deposit_amount_type");
            Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
            this.direct_deposit_type = direct_deposit_type;
            this.deposit_amount_type = deposit_amount_type;
            this.deposit_amount = deposit_amount;
        }

        public final DirectDepositTypeDto getDirect_deposit_type() {
            return this.direct_deposit_type;
        }

        public /* synthetic */ Surrogate(DirectDepositTypeDto directDepositTypeDto, DepositAmountTypeDto depositAmountTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DirectDepositTypeDto.INSTANCE.getZeroValue() : directDepositTypeDto, (i & 2) != 0 ? DepositAmountTypeDto.INSTANCE.getZeroValue() : depositAmountTypeDto, (i & 4) != 0 ? "" : str);
        }

        public final DepositAmountTypeDto getDeposit_amount_type() {
            return this.deposit_amount_type;
        }

        public final String getDeposit_amount() {
            return this.deposit_amount;
        }
    }

    /* compiled from: DirectDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DirectDepositContextDto, DirectDepositContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DirectDepositContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DirectDepositContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DirectDepositContextDto> getBinaryBase64Serializer() {
            return (KSerializer) DirectDepositContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DirectDepositContext> getProtoAdapter() {
            return DirectDepositContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DirectDepositContextDto getZeroValue() {
            return DirectDepositContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DirectDepositContextDto fromProto(DirectDepositContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DirectDepositContextDto(new Surrogate(DirectDepositTypeDto.INSTANCE.fromProto(proto.getDirect_deposit_type()), DepositAmountTypeDto.INSTANCE.fromProto(proto.getDeposit_amount_type()), proto.getDeposit_amount()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DirectDepositContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DirectDepositContextDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECT_DEPOSIT_TYPE_UNSPECIFIED", "ONLINE", "PREFILLED_FORM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectDepositTypeDto implements Dto2<DirectDepositContext.DirectDepositType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectDepositTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectDepositTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DirectDepositTypeDto DIRECT_DEPOSIT_TYPE_UNSPECIFIED = new DIRECT_DEPOSIT_TYPE_UNSPECIFIED("DIRECT_DEPOSIT_TYPE_UNSPECIFIED", 0);
        public static final DirectDepositTypeDto ONLINE = new ONLINE("ONLINE", 1);
        public static final DirectDepositTypeDto PREFILLED_FORM = new PREFILLED_FORM("PREFILLED_FORM", 2);
        private static final Lazy<BinaryBase64DtoSerializer<DirectDepositTypeDto, DirectDepositContext.DirectDepositType>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ DirectDepositTypeDto[] $values() {
            return new DirectDepositTypeDto[]{DIRECT_DEPOSIT_TYPE_UNSPECIFIED, ONLINE, PREFILLED_FORM};
        }

        public /* synthetic */ DirectDepositTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DirectDepositTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DirectDepositTypeDto(String str, int i) {
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DirectDepositTypeDto.DIRECT_DEPOSIT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECT_DEPOSIT_TYPE_UNSPECIFIED extends DirectDepositTypeDto {
            DIRECT_DEPOSIT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DirectDepositType toProto() {
                return DirectDepositContext.DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED;
            }
        }

        static {
            DirectDepositTypeDto[] directDepositTypeDtoArr$values = $values();
            $VALUES = directDepositTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directDepositTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DirectDepositContextDto$DirectDepositTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectDepositContextDto.DirectDepositTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DirectDepositTypeDto.ONLINE", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONLINE extends DirectDepositTypeDto {
            ONLINE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DirectDepositType toProto() {
                return DirectDepositContext.DirectDepositType.ONLINE;
            }
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DirectDepositTypeDto.PREFILLED_FORM", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PREFILLED_FORM extends DirectDepositTypeDto {
            PREFILLED_FORM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DirectDepositType toProto() {
                return DirectDepositContext.DirectDepositType.PREFILLED_FORM;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectDepositTypeDto, DirectDepositContext.DirectDepositType> {

            /* compiled from: DirectDepositContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DirectDepositContext.DirectDepositType.values().length];
                    try {
                        iArr[DirectDepositContext.DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DirectDepositContext.DirectDepositType.ONLINE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DirectDepositContext.DirectDepositType.PREFILLED_FORM.ordinal()] = 3;
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

            public final KSerializer<DirectDepositTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectDepositTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectDepositTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) DirectDepositTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DirectDepositContext.DirectDepositType> getProtoAdapter() {
                return DirectDepositContext.DirectDepositType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectDepositTypeDto getZeroValue() {
                return DirectDepositTypeDto.DIRECT_DEPOSIT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectDepositTypeDto fromProto(DirectDepositContext.DirectDepositType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectDepositTypeDto.DIRECT_DEPOSIT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DirectDepositTypeDto.ONLINE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DirectDepositTypeDto.PREFILLED_FORM;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DirectDepositTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DirectDepositTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectDepositTypeDto, DirectDepositContext.DirectDepositType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DirectDepositContext.DirectDepositType", DirectDepositTypeDto.getEntries(), DirectDepositTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DirectDepositTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DirectDepositTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DirectDepositTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DirectDepositTypeDto valueOf(String str) {
            return (DirectDepositTypeDto) Enum.valueOf(DirectDepositTypeDto.class, str);
        }

        public static DirectDepositTypeDto[] values() {
            return (DirectDepositTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DEPOSIT_AMOUNT_TYPE_UNSPECIFIED", "ENTIRE", "DOLLAR", "PERCENTAGE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DepositAmountTypeDto implements Dto2<DirectDepositContext.DepositAmountType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DepositAmountTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DepositAmountTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DepositAmountTypeDto, DirectDepositContext.DepositAmountType>> binaryBase64Serializer$delegate;
        public static final DepositAmountTypeDto DEPOSIT_AMOUNT_TYPE_UNSPECIFIED = new DEPOSIT_AMOUNT_TYPE_UNSPECIFIED("DEPOSIT_AMOUNT_TYPE_UNSPECIFIED", 0);
        public static final DepositAmountTypeDto ENTIRE = new ENTIRE("ENTIRE", 1);
        public static final DepositAmountTypeDto DOLLAR = new DOLLAR("DOLLAR", 2);
        public static final DepositAmountTypeDto PERCENTAGE = new PERCENTAGE("PERCENTAGE", 3);

        private static final /* synthetic */ DepositAmountTypeDto[] $values() {
            return new DepositAmountTypeDto[]{DEPOSIT_AMOUNT_TYPE_UNSPECIFIED, ENTIRE, DOLLAR, PERCENTAGE};
        }

        public /* synthetic */ DepositAmountTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DepositAmountTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DepositAmountTypeDto(String str, int i) {
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DepositAmountTypeDto.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT_AMOUNT_TYPE_UNSPECIFIED extends DepositAmountTypeDto {
            DEPOSIT_AMOUNT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DepositAmountType toProto() {
                return DirectDepositContext.DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED;
            }
        }

        static {
            DepositAmountTypeDto[] depositAmountTypeDtoArr$values = $values();
            $VALUES = depositAmountTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(depositAmountTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DirectDepositContextDto$DepositAmountTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectDepositContextDto.DepositAmountTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DepositAmountTypeDto.ENTIRE", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTIRE extends DepositAmountTypeDto {
            ENTIRE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DepositAmountType toProto() {
                return DirectDepositContext.DepositAmountType.ENTIRE;
            }
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DepositAmountTypeDto.DOLLAR", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DOLLAR extends DepositAmountTypeDto {
            DOLLAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DepositAmountType toProto() {
                return DirectDepositContext.DepositAmountType.DOLLAR;
            }
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DirectDepositContextDto.DepositAmountTypeDto.PERCENTAGE", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERCENTAGE extends DepositAmountTypeDto {
            PERCENTAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DirectDepositContext.DepositAmountType toProto() {
                return DirectDepositContext.DepositAmountType.PERCENTAGE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DepositAmountTypeDto, DirectDepositContext.DepositAmountType> {

            /* compiled from: DirectDepositContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DirectDepositContext.DepositAmountType.values().length];
                    try {
                        iArr[DirectDepositContext.DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DirectDepositContext.DepositAmountType.ENTIRE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DirectDepositContext.DepositAmountType.DOLLAR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DirectDepositContext.DepositAmountType.PERCENTAGE.ordinal()] = 4;
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

            public final KSerializer<DepositAmountTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DepositAmountTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DepositAmountTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) DepositAmountTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DirectDepositContext.DepositAmountType> getProtoAdapter() {
                return DirectDepositContext.DepositAmountType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DepositAmountTypeDto getZeroValue() {
                return DepositAmountTypeDto.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DepositAmountTypeDto fromProto(DirectDepositContext.DepositAmountType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DepositAmountTypeDto.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DepositAmountTypeDto.ENTIRE;
                }
                if (i == 3) {
                    return DepositAmountTypeDto.DOLLAR;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return DepositAmountTypeDto.PERCENTAGE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DirectDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$DepositAmountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DepositAmountTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DepositAmountTypeDto, DirectDepositContext.DepositAmountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DirectDepositContext.DepositAmountType", DepositAmountTypeDto.getEntries(), DepositAmountTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DepositAmountTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DepositAmountTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DepositAmountTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DepositAmountTypeDto valueOf(String str) {
            return (DepositAmountTypeDto) Enum.valueOf(DepositAmountTypeDto.class, str);
        }

        public static DepositAmountTypeDto[] values() {
            return (DepositAmountTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DirectDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DirectDepositContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DirectDepositContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DirectDepositContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DirectDepositContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DirectDepositContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DirectDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DirectDepositContextDto";
        }
    }
}
