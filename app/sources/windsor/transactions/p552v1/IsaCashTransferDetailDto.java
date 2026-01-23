package windsor.transactions.p552v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.models.api.ErrorResponse;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;
import windsor.transactions.p552v1.IsaCashTransferStateDto;
import windsor.transactions.p552v1.IsaTypeDto;

/* compiled from: IsaCashTransferDetailDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;:<=B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bá\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020+H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020+H\u0016¢\u0006\u0004\b4\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010&R\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0011\u0010\u001b\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u00108R\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010&¨\u0006>"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "Lcom/robinhood/idl/MessageDto;", "Lwindsor/transactions/v1/IsaCashTransferDetail;", "Landroid/os/Parcelable;", "Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;", "surrogate", "<init>", "(Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;)V", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lwindsor/transactions/v1/IsaCashTransferStateDto;", "state", ErrorResponse.ERROR_CODE, "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "estimated_transfer_value", "actual_transfer_value", "provider_name", "provider_reference", "file_name", "file_path", "provider_sort_code", "provider_account_number", "", "is_full_transfer", "requested_transfer_amount_gbp", "Lwindsor/transactions/v1/IsaTypeDto;", "type_of_isa_transferring_in", "does_partial_transfer_include_current_tax_year_contributions", "account_number", "transaction_id", "(Ljava/lang/String;Lwindsor/transactions/v1/IsaCashTransferStateDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwindsor/transactions/v1/IsaTypeDto;ZLjava/lang/String;Ljava/lang/String;)V", "toProto", "()Lwindsor/transactions/v1/IsaCashTransferDetail;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;", "getProvider_name", "getProvider_account_number", "()Z", "getRequested_transfer_amount_gbp", "Companion", "Surrogate", "Serializer", "MultibindingModule", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class IsaCashTransferDetailDto implements Dto3<IsaCashTransferDetail>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IsaCashTransferDetailDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IsaCashTransferDetailDto, IsaCashTransferDetail>> binaryBase64Serializer$delegate;
    private static final IsaCashTransferDetailDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IsaCashTransferDetailDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsaCashTransferDetailDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getProvider_name() {
        return this.surrogate.getProvider_name();
    }

    public final String getProvider_account_number() {
        return this.surrogate.getProvider_account_number();
    }

    public final boolean is_full_transfer() {
        return this.surrogate.getIs_full_transfer();
    }

    public final String getRequested_transfer_amount_gbp() {
        return this.surrogate.getRequested_transfer_amount_gbp();
    }

    public /* synthetic */ IsaCashTransferDetailDto(String str, IsaCashTransferStateDto isaCashTransferStateDto, String str2, String str3, Instant instant, Instant instant2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, IsaTypeDto isaTypeDto, boolean z2, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IsaCashTransferStateDto.INSTANCE.getZeroValue() : isaCashTransferStateDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? instant2 : null, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? IsaTypeDto.INSTANCE.getZeroValue() : isaTypeDto, (i & 131072) == 0 ? z2 : false, (i & 262144) != 0 ? "" : str13, (i & 524288) != 0 ? "" : str14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IsaCashTransferDetailDto(String transfer_id, IsaCashTransferStateDto state, String error_code, String description, Instant instant, Instant instant2, String estimated_transfer_value, String actual_transfer_value, String provider_name, String provider_reference, String file_name, String file_path, String provider_sort_code, String provider_account_number, boolean z, String requested_transfer_amount_gbp, IsaTypeDto type_of_isa_transferring_in, boolean z2, String account_number, String transaction_id) {
        this(new Surrogate(transfer_id, state, error_code, description, instant, instant2, estimated_transfer_value, actual_transfer_value, provider_name, provider_reference, file_name, file_path, provider_sort_code, provider_account_number, z, requested_transfer_amount_gbp, type_of_isa_transferring_in, z2, account_number, transaction_id));
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(estimated_transfer_value, "estimated_transfer_value");
        Intrinsics.checkNotNullParameter(actual_transfer_value, "actual_transfer_value");
        Intrinsics.checkNotNullParameter(provider_name, "provider_name");
        Intrinsics.checkNotNullParameter(provider_reference, "provider_reference");
        Intrinsics.checkNotNullParameter(file_name, "file_name");
        Intrinsics.checkNotNullParameter(file_path, "file_path");
        Intrinsics.checkNotNullParameter(provider_sort_code, "provider_sort_code");
        Intrinsics.checkNotNullParameter(provider_account_number, "provider_account_number");
        Intrinsics.checkNotNullParameter(requested_transfer_amount_gbp, "requested_transfer_amount_gbp");
        Intrinsics.checkNotNullParameter(type_of_isa_transferring_in, "type_of_isa_transferring_in");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(transaction_id, "transaction_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IsaCashTransferDetail toProto() {
        return new IsaCashTransferDetail(this.surrogate.getTransfer_id(), (IsaCashTransferState) this.surrogate.getState().toProto(), this.surrogate.getError_code(), this.surrogate.getDescription(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), this.surrogate.getEstimated_transfer_value(), this.surrogate.getActual_transfer_value(), this.surrogate.getProvider_name(), this.surrogate.getProvider_reference(), this.surrogate.getFile_name(), this.surrogate.getFile_path(), this.surrogate.getProvider_sort_code(), this.surrogate.getProvider_account_number(), this.surrogate.getIs_full_transfer(), this.surrogate.getRequested_transfer_amount_gbp(), (IsaType) this.surrogate.getType_of_isa_transferring_in().toProto(), this.surrogate.getDoes_partial_transfer_include_current_tax_year_contributions(), this.surrogate.getAccount_number(), this.surrogate.getTransaction_id(), null, 1048576, null);
    }

    public String toString() {
        return "[IsaCashTransferDetailDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IsaCashTransferDetailDto) && Intrinsics.areEqual(((IsaCashTransferDetailDto) other).surrogate, this.surrogate);
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
    /* compiled from: IsaCashTransferDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b>\b\u0083\b\u0018\u0000 g2\u00020\u0001:\u0002hgB\u009b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 Bß\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020!HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b=\u00109\u001a\u0004\b;\u0010<R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b?\u00109\u001a\u0004\b>\u00100R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\bA\u00109\u001a\u0004\b@\u00100RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bE\u00109\u001a\u0004\bC\u0010DRF\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bG\u00109\u001a\u0004\bF\u0010DR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00106\u0012\u0004\bI\u00109\u001a\u0004\bH\u00100R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00106\u0012\u0004\bK\u00109\u001a\u0004\bJ\u00100R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00106\u0012\u0004\bM\u00109\u001a\u0004\bL\u00100R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00106\u0012\u0004\bO\u00109\u001a\u0004\bN\u00100R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00106\u0012\u0004\bQ\u00109\u001a\u0004\bP\u00100R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00106\u0012\u0004\bS\u00109\u001a\u0004\bR\u00100R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00106\u0012\u0004\bU\u00109\u001a\u0004\bT\u00100R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00106\u0012\u0004\bW\u00109\u001a\u0004\bV\u00100R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010X\u0012\u0004\bZ\u00109\u001a\u0004\b\u0018\u0010YR \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00106\u0012\u0004\b\\\u00109\u001a\u0004\b[\u00100R \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010]\u0012\u0004\b`\u00109\u001a\u0004\b^\u0010_R \u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010X\u0012\u0004\bb\u00109\u001a\u0004\ba\u0010YR \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00106\u0012\u0004\bd\u00109\u001a\u0004\bc\u00100R \u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00106\u0012\u0004\bf\u00109\u001a\u0004\be\u00100¨\u0006i"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;", "", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lwindsor/transactions/v1/IsaCashTransferStateDto;", "state", ErrorResponse.ERROR_CODE, "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "estimated_transfer_value", "actual_transfer_value", "provider_name", "provider_reference", "file_name", "file_path", "provider_sort_code", "provider_account_number", "", "is_full_transfer", "requested_transfer_amount_gbp", "Lwindsor/transactions/v1/IsaTypeDto;", "type_of_isa_transferring_in", "does_partial_transfer_include_current_tax_year_contributions", "account_number", "transaction_id", "<init>", "(Ljava/lang/String;Lwindsor/transactions/v1/IsaCashTransferStateDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwindsor/transactions/v1/IsaTypeDto;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lwindsor/transactions/v1/IsaCashTransferStateDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwindsor/transactions/v1/IsaTypeDto;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$windsor_v1_transactions_externalRelease", "(Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransfer_id", "getTransfer_id$annotations", "()V", "Lwindsor/transactions/v1/IsaCashTransferStateDto;", "getState", "()Lwindsor/transactions/v1/IsaCashTransferStateDto;", "getState$annotations", "getError_code", "getError_code$annotations", "getDescription", "getDescription$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getEstimated_transfer_value", "getEstimated_transfer_value$annotations", "getActual_transfer_value", "getActual_transfer_value$annotations", "getProvider_name", "getProvider_name$annotations", "getProvider_reference", "getProvider_reference$annotations", "getFile_name", "getFile_name$annotations", "getFile_path", "getFile_path$annotations", "getProvider_sort_code", "getProvider_sort_code$annotations", "getProvider_account_number", "getProvider_account_number$annotations", "Z", "()Z", "is_full_transfer$annotations", "getRequested_transfer_amount_gbp", "getRequested_transfer_amount_gbp$annotations", "Lwindsor/transactions/v1/IsaTypeDto;", "getType_of_isa_transferring_in", "()Lwindsor/transactions/v1/IsaTypeDto;", "getType_of_isa_transferring_in$annotations", "getDoes_partial_transfer_include_current_tax_year_contributions", "getDoes_partial_transfer_include_current_tax_year_contributions$annotations", "getAccount_number", "getAccount_number$annotations", "getTransaction_id", "getTransaction_id$annotations", "Companion", "$serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final String actual_transfer_value;
        private final Instant created_at;
        private final String description;
        private final boolean does_partial_transfer_include_current_tax_year_contributions;
        private final String error_code;
        private final String estimated_transfer_value;
        private final String file_name;
        private final String file_path;
        private final boolean is_full_transfer;
        private final String provider_account_number;
        private final String provider_name;
        private final String provider_reference;
        private final String provider_sort_code;
        private final String requested_transfer_amount_gbp;
        private final IsaCashTransferStateDto state;
        private final String transaction_id;
        private final String transfer_id;
        private final IsaTypeDto type_of_isa_transferring_in;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (IsaCashTransferStateDto) null, (String) null, (String) null, (Instant) null, (Instant) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (IsaTypeDto) null, false, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && this.state == surrogate.state && Intrinsics.areEqual(this.error_code, surrogate.error_code) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.estimated_transfer_value, surrogate.estimated_transfer_value) && Intrinsics.areEqual(this.actual_transfer_value, surrogate.actual_transfer_value) && Intrinsics.areEqual(this.provider_name, surrogate.provider_name) && Intrinsics.areEqual(this.provider_reference, surrogate.provider_reference) && Intrinsics.areEqual(this.file_name, surrogate.file_name) && Intrinsics.areEqual(this.file_path, surrogate.file_path) && Intrinsics.areEqual(this.provider_sort_code, surrogate.provider_sort_code) && Intrinsics.areEqual(this.provider_account_number, surrogate.provider_account_number) && this.is_full_transfer == surrogate.is_full_transfer && Intrinsics.areEqual(this.requested_transfer_amount_gbp, surrogate.requested_transfer_amount_gbp) && this.type_of_isa_transferring_in == surrogate.type_of_isa_transferring_in && this.does_partial_transfer_include_current_tax_year_contributions == surrogate.does_partial_transfer_include_current_tax_year_contributions && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.transaction_id, surrogate.transaction_id);
        }

        public int hashCode() {
            int iHashCode = ((((((this.transfer_id.hashCode() * 31) + this.state.hashCode()) * 31) + this.error_code.hashCode()) * 31) + this.description.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            return ((((((((((((((((((((((((((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.estimated_transfer_value.hashCode()) * 31) + this.actual_transfer_value.hashCode()) * 31) + this.provider_name.hashCode()) * 31) + this.provider_reference.hashCode()) * 31) + this.file_name.hashCode()) * 31) + this.file_path.hashCode()) * 31) + this.provider_sort_code.hashCode()) * 31) + this.provider_account_number.hashCode()) * 31) + Boolean.hashCode(this.is_full_transfer)) * 31) + this.requested_transfer_amount_gbp.hashCode()) * 31) + this.type_of_isa_transferring_in.hashCode()) * 31) + Boolean.hashCode(this.does_partial_transfer_include_current_tax_year_contributions)) * 31) + this.account_number.hashCode()) * 31) + this.transaction_id.hashCode();
        }

        public String toString() {
            return "Surrogate(transfer_id=" + this.transfer_id + ", state=" + this.state + ", error_code=" + this.error_code + ", description=" + this.description + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", estimated_transfer_value=" + this.estimated_transfer_value + ", actual_transfer_value=" + this.actual_transfer_value + ", provider_name=" + this.provider_name + ", provider_reference=" + this.provider_reference + ", file_name=" + this.file_name + ", file_path=" + this.file_path + ", provider_sort_code=" + this.provider_sort_code + ", provider_account_number=" + this.provider_account_number + ", is_full_transfer=" + this.is_full_transfer + ", requested_transfer_amount_gbp=" + this.requested_transfer_amount_gbp + ", type_of_isa_transferring_in=" + this.type_of_isa_transferring_in + ", does_partial_transfer_include_current_tax_year_contributions=" + this.does_partial_transfer_include_current_tax_year_contributions + ", account_number=" + this.account_number + ", transaction_id=" + this.transaction_id + ")";
        }

        /* compiled from: IsaCashTransferDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IsaCashTransferDetailDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IsaCashTransferStateDto isaCashTransferStateDto, String str2, String str3, Instant instant, Instant instant2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, IsaTypeDto isaTypeDto, boolean z2, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.transfer_id = "";
            } else {
                this.transfer_id = str;
            }
            if ((i & 2) == 0) {
                this.state = IsaCashTransferStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = isaCashTransferStateDto;
            }
            if ((i & 4) == 0) {
                this.error_code = "";
            } else {
                this.error_code = str2;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((i & 16) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 32) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 64) == 0) {
                this.estimated_transfer_value = "";
            } else {
                this.estimated_transfer_value = str4;
            }
            if ((i & 128) == 0) {
                this.actual_transfer_value = "";
            } else {
                this.actual_transfer_value = str5;
            }
            if ((i & 256) == 0) {
                this.provider_name = "";
            } else {
                this.provider_name = str6;
            }
            if ((i & 512) == 0) {
                this.provider_reference = "";
            } else {
                this.provider_reference = str7;
            }
            if ((i & 1024) == 0) {
                this.file_name = "";
            } else {
                this.file_name = str8;
            }
            if ((i & 2048) == 0) {
                this.file_path = "";
            } else {
                this.file_path = str9;
            }
            if ((i & 4096) == 0) {
                this.provider_sort_code = "";
            } else {
                this.provider_sort_code = str10;
            }
            if ((i & 8192) == 0) {
                this.provider_account_number = "";
            } else {
                this.provider_account_number = str11;
            }
            if ((i & 16384) == 0) {
                this.is_full_transfer = false;
            } else {
                this.is_full_transfer = z;
            }
            if ((32768 & i) == 0) {
                this.requested_transfer_amount_gbp = "";
            } else {
                this.requested_transfer_amount_gbp = str12;
            }
            this.type_of_isa_transferring_in = (65536 & i) == 0 ? IsaTypeDto.INSTANCE.getZeroValue() : isaTypeDto;
            if ((131072 & i) == 0) {
                this.does_partial_transfer_include_current_tax_year_contributions = false;
            } else {
                this.does_partial_transfer_include_current_tax_year_contributions = z2;
            }
            if ((262144 & i) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str13;
            }
            if ((i & 524288) == 0) {
                this.transaction_id = "";
            } else {
                this.transaction_id = str14;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$windsor_v1_transactions_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.transfer_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.transfer_id);
            }
            if (self.state != IsaCashTransferStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, IsaCashTransferStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.error_code, "")) {
                output.encodeStringElement(serialDesc, 2, self.error_code);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 3, self.description);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.estimated_transfer_value, "")) {
                output.encodeStringElement(serialDesc, 6, self.estimated_transfer_value);
            }
            if (!Intrinsics.areEqual(self.actual_transfer_value, "")) {
                output.encodeStringElement(serialDesc, 7, self.actual_transfer_value);
            }
            if (!Intrinsics.areEqual(self.provider_name, "")) {
                output.encodeStringElement(serialDesc, 8, self.provider_name);
            }
            if (!Intrinsics.areEqual(self.provider_reference, "")) {
                output.encodeStringElement(serialDesc, 9, self.provider_reference);
            }
            if (!Intrinsics.areEqual(self.file_name, "")) {
                output.encodeStringElement(serialDesc, 10, self.file_name);
            }
            if (!Intrinsics.areEqual(self.file_path, "")) {
                output.encodeStringElement(serialDesc, 11, self.file_path);
            }
            if (!Intrinsics.areEqual(self.provider_sort_code, "")) {
                output.encodeStringElement(serialDesc, 12, self.provider_sort_code);
            }
            if (!Intrinsics.areEqual(self.provider_account_number, "")) {
                output.encodeStringElement(serialDesc, 13, self.provider_account_number);
            }
            boolean z = self.is_full_transfer;
            if (z) {
                output.encodeBooleanElement(serialDesc, 14, z);
            }
            if (!Intrinsics.areEqual(self.requested_transfer_amount_gbp, "")) {
                output.encodeStringElement(serialDesc, 15, self.requested_transfer_amount_gbp);
            }
            if (self.type_of_isa_transferring_in != IsaTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, IsaTypeDto.Serializer.INSTANCE, self.type_of_isa_transferring_in);
            }
            boolean z2 = self.does_partial_transfer_include_current_tax_year_contributions;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 17, z2);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 18, self.account_number);
            }
            if (Intrinsics.areEqual(self.transaction_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 19, self.transaction_id);
        }

        public Surrogate(String transfer_id, IsaCashTransferStateDto state, String error_code, String description, Instant instant, Instant instant2, String estimated_transfer_value, String actual_transfer_value, String provider_name, String provider_reference, String file_name, String file_path, String provider_sort_code, String provider_account_number, boolean z, String requested_transfer_amount_gbp, IsaTypeDto type_of_isa_transferring_in, boolean z2, String account_number, String transaction_id) {
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(estimated_transfer_value, "estimated_transfer_value");
            Intrinsics.checkNotNullParameter(actual_transfer_value, "actual_transfer_value");
            Intrinsics.checkNotNullParameter(provider_name, "provider_name");
            Intrinsics.checkNotNullParameter(provider_reference, "provider_reference");
            Intrinsics.checkNotNullParameter(file_name, "file_name");
            Intrinsics.checkNotNullParameter(file_path, "file_path");
            Intrinsics.checkNotNullParameter(provider_sort_code, "provider_sort_code");
            Intrinsics.checkNotNullParameter(provider_account_number, "provider_account_number");
            Intrinsics.checkNotNullParameter(requested_transfer_amount_gbp, "requested_transfer_amount_gbp");
            Intrinsics.checkNotNullParameter(type_of_isa_transferring_in, "type_of_isa_transferring_in");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(transaction_id, "transaction_id");
            this.transfer_id = transfer_id;
            this.state = state;
            this.error_code = error_code;
            this.description = description;
            this.created_at = instant;
            this.updated_at = instant2;
            this.estimated_transfer_value = estimated_transfer_value;
            this.actual_transfer_value = actual_transfer_value;
            this.provider_name = provider_name;
            this.provider_reference = provider_reference;
            this.file_name = file_name;
            this.file_path = file_path;
            this.provider_sort_code = provider_sort_code;
            this.provider_account_number = provider_account_number;
            this.is_full_transfer = z;
            this.requested_transfer_amount_gbp = requested_transfer_amount_gbp;
            this.type_of_isa_transferring_in = type_of_isa_transferring_in;
            this.does_partial_transfer_include_current_tax_year_contributions = z2;
            this.account_number = account_number;
            this.transaction_id = transaction_id;
        }

        public /* synthetic */ Surrogate(String str, IsaCashTransferStateDto isaCashTransferStateDto, String str2, String str3, Instant instant, Instant instant2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, IsaTypeDto isaTypeDto, boolean z2, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IsaCashTransferStateDto.INSTANCE.getZeroValue() : isaCashTransferStateDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? instant2 : null, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? IsaTypeDto.INSTANCE.getZeroValue() : isaTypeDto, (i & 131072) == 0 ? z2 : false, (i & 262144) != 0 ? "" : str13, (i & 524288) != 0 ? "" : str14);
        }

        public final String getTransfer_id() {
            return this.transfer_id;
        }

        public final IsaCashTransferStateDto getState() {
            return this.state;
        }

        public final String getError_code() {
            return this.error_code;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final String getEstimated_transfer_value() {
            return this.estimated_transfer_value;
        }

        public final String getActual_transfer_value() {
            return this.actual_transfer_value;
        }

        public final String getProvider_name() {
            return this.provider_name;
        }

        public final String getProvider_reference() {
            return this.provider_reference;
        }

        public final String getFile_name() {
            return this.file_name;
        }

        public final String getFile_path() {
            return this.file_path;
        }

        public final String getProvider_sort_code() {
            return this.provider_sort_code;
        }

        public final String getProvider_account_number() {
            return this.provider_account_number;
        }

        /* renamed from: is_full_transfer, reason: from getter */
        public final boolean getIs_full_transfer() {
            return this.is_full_transfer;
        }

        public final String getRequested_transfer_amount_gbp() {
            return this.requested_transfer_amount_gbp;
        }

        public final IsaTypeDto getType_of_isa_transferring_in() {
            return this.type_of_isa_transferring_in;
        }

        public final boolean getDoes_partial_transfer_include_current_tax_year_contributions() {
            return this.does_partial_transfer_include_current_tax_year_contributions;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getTransaction_id() {
            return this.transaction_id;
        }
    }

    /* compiled from: IsaCashTransferDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetailDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "Lwindsor/transactions/v1/IsaCashTransferDetail;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IsaCashTransferDetailDto, IsaCashTransferDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IsaCashTransferDetailDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaCashTransferDetailDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaCashTransferDetailDto> getBinaryBase64Serializer() {
            return (KSerializer) IsaCashTransferDetailDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IsaCashTransferDetail> getProtoAdapter() {
            return IsaCashTransferDetail.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaCashTransferDetailDto getZeroValue() {
            return IsaCashTransferDetailDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaCashTransferDetailDto fromProto(IsaCashTransferDetail proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IsaCashTransferDetailDto(new Surrogate(proto.getTransfer_id(), IsaCashTransferStateDto.INSTANCE.fromProto(proto.getState()), proto.getError_code(), proto.getDescription(), proto.getCreated_at(), proto.getUpdated_at(), proto.getEstimated_transfer_value(), proto.getActual_transfer_value(), proto.getProvider_name(), proto.getProvider_reference(), proto.getFile_name(), proto.getFile_path(), proto.getProvider_sort_code(), proto.getProvider_account_number(), proto.getIs_full_transfer(), proto.getRequested_transfer_amount_gbp(), IsaTypeDto.INSTANCE.fromProto(proto.getType_of_isa_transferring_in()), proto.getDoes_partial_transfer_include_current_tax_year_contributions(), proto.getAccount_number(), proto.getTransaction_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: windsor.transactions.v1.IsaCashTransferDetailDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaCashTransferDetailDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IsaCashTransferDetailDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IsaCashTransferDetailDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetailDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "<init>", "()V", "surrogateSerializer", "Lwindsor/transactions/v1/IsaCashTransferDetailDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IsaCashTransferDetailDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/windsor.transactions.v1.IsaCashTransferDetail", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IsaCashTransferDetailDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IsaCashTransferDetailDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IsaCashTransferDetailDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IsaCashTransferDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetailDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "windsor.transactions.v1.IsaCashTransferDetailDto";
        }
    }
}
