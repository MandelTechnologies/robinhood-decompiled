package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.CashTransferDirectionDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesCashTransferDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040123B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0014Jf\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tJ\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020)H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u00064"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransferDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesCashTransfer;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Surrogate;)V", "id", "", "account_id", "rhd_account_number", "requested_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "actual_amount", "direction", "Lcom/robinhood/ceres/v1/CashTransferDirectionDto;", "initiator_id", "created_at", "updated_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/CashTransferDirectionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getRhd_account_number", "getRequested_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getActual_amount", "getDirection", "()Lcom/robinhood/ceres/v1/CashTransferDirectionDto;", "getInitiator_id", "getCreated_at", "getUpdated_at", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesCashTransferDto implements Dto3<FuturesCashTransfer>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesCashTransferDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesCashTransferDto, FuturesCashTransfer>> binaryBase64Serializer$delegate;
    private static final FuturesCashTransferDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesCashTransferDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesCashTransferDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getRhd_account_number() {
        return this.surrogate.getRhd_account_number();
    }

    public final MoneyDto getRequested_amount() {
        return this.surrogate.getRequested_amount();
    }

    public final MoneyDto getActual_amount() {
        return this.surrogate.getActual_amount();
    }

    public final CashTransferDirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final String getInitiator_id() {
        return this.surrogate.getInitiator_id();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public /* synthetic */ FuturesCashTransferDto(String str, String str2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto cashTransferDirectionDto, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) != 0 ? CashTransferDirectionDto.INSTANCE.getZeroValue() : cashTransferDirectionDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesCashTransferDto(String id, String account_id, String rhd_account_number, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto direction, String str, String created_at, String updated_at) {
        this(new Surrogate(id, account_id, rhd_account_number, moneyDto, moneyDto2, direction, str, created_at, updated_at));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
    }

    public static /* synthetic */ FuturesCashTransferDto copy$default(FuturesCashTransferDto futuresCashTransferDto, String str, String str2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto cashTransferDirectionDto, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresCashTransferDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = futuresCashTransferDto.surrogate.getAccount_id();
        }
        if ((i & 4) != 0) {
            str3 = futuresCashTransferDto.surrogate.getRhd_account_number();
        }
        if ((i & 8) != 0) {
            moneyDto = futuresCashTransferDto.surrogate.getRequested_amount();
        }
        if ((i & 16) != 0) {
            moneyDto2 = futuresCashTransferDto.surrogate.getActual_amount();
        }
        if ((i & 32) != 0) {
            cashTransferDirectionDto = futuresCashTransferDto.surrogate.getDirection();
        }
        if ((i & 64) != 0) {
            str4 = futuresCashTransferDto.surrogate.getInitiator_id();
        }
        if ((i & 128) != 0) {
            str5 = futuresCashTransferDto.surrogate.getCreated_at();
        }
        if ((i & 256) != 0) {
            str6 = futuresCashTransferDto.surrogate.getUpdated_at();
        }
        String str7 = str5;
        String str8 = str6;
        CashTransferDirectionDto cashTransferDirectionDto2 = cashTransferDirectionDto;
        String str9 = str4;
        MoneyDto moneyDto3 = moneyDto2;
        String str10 = str3;
        return futuresCashTransferDto.copy(str, str2, str10, moneyDto, moneyDto3, cashTransferDirectionDto2, str9, str7, str8);
    }

    public final FuturesCashTransferDto copy(String id, String account_id, String rhd_account_number, MoneyDto requested_amount, MoneyDto actual_amount, CashTransferDirectionDto direction, String initiator_id, String created_at, String updated_at) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        return new FuturesCashTransferDto(new Surrogate(id, account_id, rhd_account_number, requested_amount, actual_amount, direction, initiator_id, created_at, updated_at));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesCashTransfer toProto() {
        String id = this.surrogate.getId();
        String account_id = this.surrogate.getAccount_id();
        String rhd_account_number = this.surrogate.getRhd_account_number();
        MoneyDto requested_amount = this.surrogate.getRequested_amount();
        Money proto = requested_amount != null ? requested_amount.toProto() : null;
        MoneyDto actual_amount = this.surrogate.getActual_amount();
        return new FuturesCashTransfer(id, account_id, rhd_account_number, proto, actual_amount != null ? actual_amount.toProto() : null, (CashTransferDirection) this.surrogate.getDirection().toProto(), this.surrogate.getInitiator_id(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), null, 512, null);
    }

    public String toString() {
        return "[FuturesCashTransferDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesCashTransferDto) && Intrinsics.areEqual(((FuturesCashTransferDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesCashTransferDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002BCBg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003Ji\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0011HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J%\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u001fR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018¨\u0006D"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Surrogate;", "", "id", "", "account_id", "rhd_account_number", "requested_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "actual_amount", "direction", "Lcom/robinhood/ceres/v1/CashTransferDirectionDto;", "initiator_id", "created_at", "updated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/CashTransferDirectionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/CashTransferDirectionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getAccount_id$annotations", "getAccount_id", "getRhd_account_number$annotations", "getRhd_account_number", "getRequested_amount$annotations", "getRequested_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getActual_amount$annotations", "getActual_amount", "getDirection$annotations", "getDirection", "()Lcom/robinhood/ceres/v1/CashTransferDirectionDto;", "getInitiator_id$annotations", "getInitiator_id", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final MoneyDto actual_amount;
        private final String created_at;
        private final CashTransferDirectionDto direction;
        private final String id;
        private final String initiator_id;
        private final MoneyDto requested_amount;
        private final String rhd_account_number;
        private final String updated_at;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (MoneyDto) null, (MoneyDto) null, (CashTransferDirectionDto) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto cashTransferDirectionDto, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.account_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.rhd_account_number;
            }
            if ((i & 8) != 0) {
                moneyDto = surrogate.requested_amount;
            }
            if ((i & 16) != 0) {
                moneyDto2 = surrogate.actual_amount;
            }
            if ((i & 32) != 0) {
                cashTransferDirectionDto = surrogate.direction;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.initiator_id;
            }
            if ((i & 128) != 0) {
                str5 = surrogate.created_at;
            }
            if ((i & 256) != 0) {
                str6 = surrogate.updated_at;
            }
            String str7 = str5;
            String str8 = str6;
            CashTransferDirectionDto cashTransferDirectionDto2 = cashTransferDirectionDto;
            String str9 = str4;
            MoneyDto moneyDto3 = moneyDto2;
            String str10 = str3;
            return surrogate.copy(str, str2, str10, moneyDto, moneyDto3, cashTransferDirectionDto2, str9, str7, str8);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("actualAmount")
        @JsonAnnotations2(names = {"actual_amount"})
        public static /* synthetic */ void getActual_amount$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("initiatorId")
        @JsonAnnotations2(names = {"initiator_id"})
        public static /* synthetic */ void getInitiator_id$annotations() {
        }

        @SerialName("requestedAmount")
        @JsonAnnotations2(names = {"requested_amount"})
        public static /* synthetic */ void getRequested_amount$annotations() {
        }

        @SerialName("rhdAccountNumber")
        @JsonAnnotations2(names = {"rhd_account_number"})
        public static /* synthetic */ void getRhd_account_number$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhd_account_number() {
            return this.rhd_account_number;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getRequested_amount() {
            return this.requested_amount;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getActual_amount() {
            return this.actual_amount;
        }

        /* renamed from: component6, reason: from getter */
        public final CashTransferDirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component7, reason: from getter */
        public final String getInitiator_id() {
            return this.initiator_id;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component9, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final Surrogate copy(String id, String account_id, String rhd_account_number, MoneyDto requested_amount, MoneyDto actual_amount, CashTransferDirectionDto direction, String initiator_id, String created_at, String updated_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            return new Surrogate(id, account_id, rhd_account_number, requested_amount, actual_amount, direction, initiator_id, created_at, updated_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.rhd_account_number, surrogate.rhd_account_number) && Intrinsics.areEqual(this.requested_amount, surrogate.requested_amount) && Intrinsics.areEqual(this.actual_amount, surrogate.actual_amount) && this.direction == surrogate.direction && Intrinsics.areEqual(this.initiator_id, surrogate.initiator_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.rhd_account_number.hashCode()) * 31;
            MoneyDto moneyDto = this.requested_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.actual_amount;
            int iHashCode3 = (((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.direction.hashCode()) * 31;
            String str = this.initiator_id;
            return ((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", rhd_account_number=" + this.rhd_account_number + ", requested_amount=" + this.requested_amount + ", actual_amount=" + this.actual_amount + ", direction=" + this.direction + ", initiator_id=" + this.initiator_id + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
        }

        /* compiled from: FuturesCashTransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesCashTransferDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto cashTransferDirectionDto, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.rhd_account_number = "";
            } else {
                this.rhd_account_number = str3;
            }
            if ((i & 8) == 0) {
                this.requested_amount = null;
            } else {
                this.requested_amount = moneyDto;
            }
            if ((i & 16) == 0) {
                this.actual_amount = null;
            } else {
                this.actual_amount = moneyDto2;
            }
            if ((i & 32) == 0) {
                this.direction = CashTransferDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = cashTransferDirectionDto;
            }
            if ((i & 64) == 0) {
                this.initiator_id = null;
            } else {
                this.initiator_id = str4;
            }
            if ((i & 128) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str5;
            }
            if ((i & 256) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            if (!Intrinsics.areEqual(self.rhd_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.rhd_account_number);
            }
            MoneyDto moneyDto = self.requested_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.actual_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (self.direction != CashTransferDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, CashTransferDirectionDto.Serializer.INSTANCE, self.direction);
            }
            String str = self.initiator_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 7, self.created_at);
            }
            if (Intrinsics.areEqual(self.updated_at, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 8, self.updated_at);
        }

        public Surrogate(String id, String account_id, String rhd_account_number, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto direction, String str, String created_at, String updated_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            this.id = id;
            this.account_id = account_id;
            this.rhd_account_number = rhd_account_number;
            this.requested_amount = moneyDto;
            this.actual_amount = moneyDto2;
            this.direction = direction;
            this.initiator_id = str;
            this.created_at = created_at;
            this.updated_at = updated_at;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, CashTransferDirectionDto cashTransferDirectionDto, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) != 0 ? CashTransferDirectionDto.INSTANCE.getZeroValue() : cashTransferDirectionDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getRhd_account_number() {
            return this.rhd_account_number;
        }

        public final MoneyDto getRequested_amount() {
            return this.requested_amount;
        }

        public final MoneyDto getActual_amount() {
            return this.actual_amount;
        }

        public final CashTransferDirectionDto getDirection() {
            return this.direction;
        }

        public final String getInitiator_id() {
            return this.initiator_id;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }
    }

    /* compiled from: FuturesCashTransferDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesCashTransferDto;", "Lcom/robinhood/ceres/v1/FuturesCashTransfer;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesCashTransferDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesCashTransferDto, FuturesCashTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesCashTransferDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesCashTransferDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesCashTransferDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesCashTransferDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesCashTransfer> getProtoAdapter() {
            return FuturesCashTransfer.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesCashTransferDto getZeroValue() {
            return FuturesCashTransferDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesCashTransferDto fromProto(FuturesCashTransfer proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_id = proto.getAccount_id();
            String rhd_account_number = proto.getRhd_account_number();
            Money requested_amount = proto.getRequested_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = requested_amount != null ? MoneyDto.INSTANCE.fromProto(requested_amount) : null;
            Money actual_amount = proto.getActual_amount();
            return new FuturesCashTransferDto(new Surrogate(id, account_id, rhd_account_number, moneyDtoFromProto, actual_amount != null ? MoneyDto.INSTANCE.fromProto(actual_amount) : null, CashTransferDirectionDto.INSTANCE.fromProto(proto.getDirection()), proto.getInitiator_id(), proto.getCreated_at(), proto.getUpdated_at()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesCashTransferDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesCashTransferDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesCashTransferDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesCashTransferDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesCashTransferDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesCashTransferDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesCashTransferDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesCashTransfer", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesCashTransferDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesCashTransferDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesCashTransferDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesCashTransferDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesCashTransferDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesCashTransferDto";
        }
    }
}
