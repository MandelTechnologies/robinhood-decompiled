package com.robinhood.rosetta.cashier;

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
import com.robinhood.rosetta.cashier.BankBalanceDetails;
import com.robinhood.rosetta.cashier.BankBalanceDetailsDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.common.RHEntity;
import com.robinhood.rosetta.common.RHEntityDto;
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
import kotlin.jvm.internal.SourceDebugExtension;
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

/* compiled from: BankBalanceDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0012JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Surrogate;)V", "ach_relationship_id", "", "available_balance", "Lcom/robinhood/rosetta/common/MoneyDto;", "present_balance", "ach_transfer_id", "source", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "entity", "Lcom/robinhood/rosetta/common/RHEntityDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;Lcom/robinhood/rosetta/common/RHEntityDto;)V", "getAch_relationship_id", "()Ljava/lang/String;", "getAvailable_balance", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getPresent_balance", "getAch_transfer_id", "getSource", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "getEntity", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SourceDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class BankBalanceDetailsDto implements Dto3<BankBalanceDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BankBalanceDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BankBalanceDetailsDto, BankBalanceDetails>> binaryBase64Serializer$delegate;
    private static final BankBalanceDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BankBalanceDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BankBalanceDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAch_relationship_id() {
        return this.surrogate.getAch_relationship_id();
    }

    public final MoneyDto getAvailable_balance() {
        return this.surrogate.getAvailable_balance();
    }

    public final MoneyDto getPresent_balance() {
        return this.surrogate.getPresent_balance();
    }

    public final String getAch_transfer_id() {
        return this.surrogate.getAch_transfer_id();
    }

    public final SourceDto getSource() {
        return this.surrogate.getSource();
    }

    public final RHEntityDto getEntity() {
        return this.surrogate.getEntity();
    }

    public /* synthetic */ BankBalanceDetailsDto(String str, MoneyDto moneyDto, MoneyDto moneyDto2, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i & 32) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankBalanceDetailsDto(String ach_relationship_id, MoneyDto moneyDto, MoneyDto moneyDto2, String ach_transfer_id, SourceDto source, RHEntityDto entity) {
        this(new Surrogate(ach_relationship_id, moneyDto, moneyDto2, ach_transfer_id, source, entity));
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
    }

    public static /* synthetic */ BankBalanceDetailsDto copy$default(BankBalanceDetailsDto bankBalanceDetailsDto, String str, MoneyDto moneyDto, MoneyDto moneyDto2, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankBalanceDetailsDto.surrogate.getAch_relationship_id();
        }
        if ((i & 2) != 0) {
            moneyDto = bankBalanceDetailsDto.surrogate.getAvailable_balance();
        }
        if ((i & 4) != 0) {
            moneyDto2 = bankBalanceDetailsDto.surrogate.getPresent_balance();
        }
        if ((i & 8) != 0) {
            str2 = bankBalanceDetailsDto.surrogate.getAch_transfer_id();
        }
        if ((i & 16) != 0) {
            sourceDto = bankBalanceDetailsDto.surrogate.getSource();
        }
        if ((i & 32) != 0) {
            rHEntityDto = bankBalanceDetailsDto.surrogate.getEntity();
        }
        SourceDto sourceDto2 = sourceDto;
        RHEntityDto rHEntityDto2 = rHEntityDto;
        return bankBalanceDetailsDto.copy(str, moneyDto, moneyDto2, str2, sourceDto2, rHEntityDto2);
    }

    public final BankBalanceDetailsDto copy(String ach_relationship_id, MoneyDto available_balance, MoneyDto present_balance, String ach_transfer_id, SourceDto source, RHEntityDto entity) {
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new BankBalanceDetailsDto(new Surrogate(ach_relationship_id, available_balance, present_balance, ach_transfer_id, source, entity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BankBalanceDetails toProto() {
        String ach_relationship_id = this.surrogate.getAch_relationship_id();
        MoneyDto available_balance = this.surrogate.getAvailable_balance();
        Money proto = available_balance != null ? available_balance.toProto() : null;
        MoneyDto present_balance = this.surrogate.getPresent_balance();
        return new BankBalanceDetails(ach_relationship_id, proto, present_balance != null ? present_balance.toProto() : null, this.surrogate.getAch_transfer_id(), (BankBalanceDetails.Source) this.surrogate.getSource().toProto(), (RHEntity) this.surrogate.getEntity().toProto(), null, 64, null);
    }

    public String toString() {
        return "[BankBalanceDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BankBalanceDetailsDto) && Intrinsics.areEqual(((BankBalanceDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: BankBalanceDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003JI\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Surrogate;", "", "ach_relationship_id", "", "available_balance", "Lcom/robinhood/rosetta/common/MoneyDto;", "present_balance", "ach_transfer_id", "source", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "entity", "Lcom/robinhood/rosetta/common/RHEntityDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;Lcom/robinhood/rosetta/common/RHEntityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;Lcom/robinhood/rosetta/common/RHEntityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAch_relationship_id$annotations", "()V", "getAch_relationship_id", "()Ljava/lang/String;", "getAvailable_balance$annotations", "getAvailable_balance", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getPresent_balance$annotations", "getPresent_balance", "getAch_transfer_id$annotations", "getAch_transfer_id", "getSource$annotations", "getSource", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "getEntity$annotations", "getEntity", "()Lcom/robinhood/rosetta/common/RHEntityDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String ach_relationship_id;
        private final String ach_transfer_id;
        private final MoneyDto available_balance;
        private final RHEntityDto entity;
        private final MoneyDto present_balance;
        private final SourceDto source;

        public Surrogate() {
            this((String) null, (MoneyDto) null, (MoneyDto) null, (String) null, (SourceDto) null, (RHEntityDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MoneyDto moneyDto, MoneyDto moneyDto2, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ach_relationship_id;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.available_balance;
            }
            if ((i & 4) != 0) {
                moneyDto2 = surrogate.present_balance;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.ach_transfer_id;
            }
            if ((i & 16) != 0) {
                sourceDto = surrogate.source;
            }
            if ((i & 32) != 0) {
                rHEntityDto = surrogate.entity;
            }
            SourceDto sourceDto2 = sourceDto;
            RHEntityDto rHEntityDto2 = rHEntityDto;
            return surrogate.copy(str, moneyDto, moneyDto2, str2, sourceDto2, rHEntityDto2);
        }

        @SerialName("achRelationshipId")
        @JsonAnnotations2(names = {"ach_relationship_id"})
        public static /* synthetic */ void getAch_relationship_id$annotations() {
        }

        @SerialName("achTransferId")
        @JsonAnnotations2(names = {"ach_transfer_id"})
        public static /* synthetic */ void getAch_transfer_id$annotations() {
        }

        @SerialName("availableBalance")
        @JsonAnnotations2(names = {"available_balance"})
        public static /* synthetic */ void getAvailable_balance$annotations() {
        }

        @SerialName("entity")
        @JsonAnnotations2(names = {"entity"})
        public static /* synthetic */ void getEntity$annotations() {
        }

        @SerialName("presentBalance")
        @JsonAnnotations2(names = {"present_balance"})
        public static /* synthetic */ void getPresent_balance$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAch_relationship_id() {
            return this.ach_relationship_id;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getAvailable_balance() {
            return this.available_balance;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getPresent_balance() {
            return this.present_balance;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAch_transfer_id() {
            return this.ach_transfer_id;
        }

        /* renamed from: component5, reason: from getter */
        public final SourceDto getSource() {
            return this.source;
        }

        /* renamed from: component6, reason: from getter */
        public final RHEntityDto getEntity() {
            return this.entity;
        }

        public final Surrogate copy(String ach_relationship_id, MoneyDto available_balance, MoneyDto present_balance, String ach_transfer_id, SourceDto source, RHEntityDto entity) {
            Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
            Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(entity, "entity");
            return new Surrogate(ach_relationship_id, available_balance, present_balance, ach_transfer_id, source, entity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ach_relationship_id, surrogate.ach_relationship_id) && Intrinsics.areEqual(this.available_balance, surrogate.available_balance) && Intrinsics.areEqual(this.present_balance, surrogate.present_balance) && Intrinsics.areEqual(this.ach_transfer_id, surrogate.ach_transfer_id) && this.source == surrogate.source && this.entity == surrogate.entity;
        }

        public int hashCode() {
            int iHashCode = this.ach_relationship_id.hashCode() * 31;
            MoneyDto moneyDto = this.available_balance;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.present_balance;
            return ((((((iHashCode2 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.ach_transfer_id.hashCode()) * 31) + this.source.hashCode()) * 31) + this.entity.hashCode();
        }

        public String toString() {
            return "Surrogate(ach_relationship_id=" + this.ach_relationship_id + ", available_balance=" + this.available_balance + ", present_balance=" + this.present_balance + ", ach_transfer_id=" + this.ach_transfer_id + ", source=" + this.source + ", entity=" + this.entity + ")";
        }

        /* compiled from: BankBalanceDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BankBalanceDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, MoneyDto moneyDto2, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ach_relationship_id = "";
            } else {
                this.ach_relationship_id = str;
            }
            if ((i & 2) == 0) {
                this.available_balance = null;
            } else {
                this.available_balance = moneyDto;
            }
            if ((i & 4) == 0) {
                this.present_balance = null;
            } else {
                this.present_balance = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.ach_transfer_id = "";
            } else {
                this.ach_transfer_id = str2;
            }
            if ((i & 16) == 0) {
                this.source = SourceDto.INSTANCE.getZeroValue();
            } else {
                this.source = sourceDto;
            }
            if ((i & 32) == 0) {
                this.entity = RHEntityDto.INSTANCE.getZeroValue();
            } else {
                this.entity = rHEntityDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ach_relationship_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ach_relationship_id);
            }
            MoneyDto moneyDto = self.available_balance;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.present_balance;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.ach_transfer_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.ach_transfer_id);
            }
            if (self.source != SourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, SourceDto.Serializer.INSTANCE, self.source);
            }
            if (self.entity != RHEntityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, RHEntityDto.Serializer.INSTANCE, self.entity);
            }
        }

        public Surrogate(String ach_relationship_id, MoneyDto moneyDto, MoneyDto moneyDto2, String ach_transfer_id, SourceDto source, RHEntityDto entity) {
            Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
            Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.ach_relationship_id = ach_relationship_id;
            this.available_balance = moneyDto;
            this.present_balance = moneyDto2;
            this.ach_transfer_id = ach_transfer_id;
            this.source = source;
            this.entity = entity;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, MoneyDto moneyDto2, String str2, SourceDto sourceDto, RHEntityDto rHEntityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i & 32) != 0 ? RHEntityDto.INSTANCE.getZeroValue() : rHEntityDto);
        }

        public final String getAch_relationship_id() {
            return this.ach_relationship_id;
        }

        public final MoneyDto getAvailable_balance() {
            return this.available_balance;
        }

        public final MoneyDto getPresent_balance() {
            return this.present_balance;
        }

        public final String getAch_transfer_id() {
            return this.ach_transfer_id;
        }

        public final SourceDto getSource() {
            return this.source;
        }

        public final RHEntityDto getEntity() {
            return this.entity;
        }
    }

    /* compiled from: BankBalanceDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BankBalanceDetailsDto, BankBalanceDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BankBalanceDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BankBalanceDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BankBalanceDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) BankBalanceDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BankBalanceDetails> getProtoAdapter() {
            return BankBalanceDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BankBalanceDetailsDto getZeroValue() {
            return BankBalanceDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BankBalanceDetailsDto fromProto(BankBalanceDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ach_relationship_id = proto.getAch_relationship_id();
            Money available_balance = proto.getAvailable_balance();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = available_balance != null ? MoneyDto.INSTANCE.fromProto(available_balance) : null;
            Money present_balance = proto.getPresent_balance();
            return new BankBalanceDetailsDto(new Surrogate(ach_relationship_id, moneyDtoFromProto, present_balance != null ? MoneyDto.INSTANCE.fromProto(present_balance) : null, proto.getAch_transfer_id(), SourceDto.INSTANCE.fromProto(proto.getSource()), RHEntityDto.INSTANCE.fromProto(proto.getEntity())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.BankBalanceDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BankBalanceDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BankBalanceDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BankBalanceDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OTHER", "ASYNC_RUNNER", "BANK_LINK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceDto implements Dto2<BankBalanceDetails.Source>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceDto, BankBalanceDetails.Source>> binaryBase64Serializer$delegate;
        public static final SourceDto OTHER = new OTHER("OTHER", 0);
        public static final SourceDto ASYNC_RUNNER = new ASYNC_RUNNER("ASYNC_RUNNER", 1);
        public static final SourceDto BANK_LINK = new BANK_LINK("BANK_LINK", 2);

        private static final /* synthetic */ SourceDto[] $values() {
            return new SourceDto[]{OTHER, ASYNC_RUNNER, BANK_LINK};
        }

        public /* synthetic */ SourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: BankBalanceDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/BankBalanceDetailsDto.SourceDto.OTHER", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OTHER extends SourceDto {
            OTHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public BankBalanceDetails.Source toProto() {
                return BankBalanceDetails.Source.OTHER;
            }
        }

        private SourceDto(String str, int i) {
        }

        static {
            SourceDto[] sourceDtoArr$values = $values();
            $VALUES = sourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.BankBalanceDetailsDto$SourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BankBalanceDetailsDto.SourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: BankBalanceDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/BankBalanceDetailsDto.SourceDto.ASYNC_RUNNER", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASYNC_RUNNER extends SourceDto {
            ASYNC_RUNNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public BankBalanceDetails.Source toProto() {
                return BankBalanceDetails.Source.ASYNC_RUNNER;
            }
        }

        /* compiled from: BankBalanceDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/BankBalanceDetailsDto.SourceDto.BANK_LINK", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BANK_LINK extends SourceDto {
            BANK_LINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public BankBalanceDetails.Source toProto() {
                return BankBalanceDetails.Source.BANK_LINK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: BankBalanceDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceDto, BankBalanceDetails.Source> {

            /* compiled from: BankBalanceDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BankBalanceDetails.Source.values().length];
                    try {
                        iArr[BankBalanceDetails.Source.OTHER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BankBalanceDetails.Source.ASYNC_RUNNER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BankBalanceDetails.Source.BANK_LINK.ordinal()] = 3;
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

            public final KSerializer<SourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getBinaryBase64Serializer() {
                return (KSerializer) SourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BankBalanceDetails.Source> getProtoAdapter() {
                return BankBalanceDetails.Source.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto getZeroValue() {
                return SourceDto.OTHER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto fromProto(BankBalanceDetails.Source proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SourceDto.OTHER;
                }
                if (i == 2) {
                    return SourceDto.ASYNC_RUNNER;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return SourceDto.BANK_LINK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BankBalanceDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$SourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceDto, BankBalanceDetails.Source> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.BankBalanceDetails.Source", SourceDto.getEntries(), SourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
        }
    }

    /* compiled from: BankBalanceDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BankBalanceDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.BankBalanceDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BankBalanceDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BankBalanceDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BankBalanceDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BankBalanceDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.BankBalanceDetailsDto";
        }
    }
}
