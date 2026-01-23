package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferContextDto;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CryptoTransferContextDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005:;<=>B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0019J\u008a\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\tJ\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\tH\u0016J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001b¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Surrogate;)V", "currency_id", "", "session_id", "withdrawal_id", "amount", "", ErrorResponse.ERROR_CODE, "title", "completed_kyc", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "completed_mfa", "security_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "party_selection", "wallet_selection", "error_message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency_id", "()Ljava/lang/String;", "getSession_id", "getWithdrawal_id", "getAmount", "()D", "getError_code", "getTitle", "getCompleted_kyc", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getCompleted_mfa", "getSecurity_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", "getTransfer_id", "getParty_selection", "getWallet_selection", "getError_message", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SecurityContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoTransferContextDto implements Dto3<CryptoTransferContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoTransferContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoTransferContextDto, CryptoTransferContext>> binaryBase64Serializer$delegate;
    private static final CryptoTransferContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoTransferContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoTransferContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCurrency_id() {
        return this.surrogate.getCurrency_id();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final String getWithdrawal_id() {
        return this.surrogate.getWithdrawal_id();
    }

    public final double getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getError_code() {
        return this.surrogate.getError_code();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final BooleanDto getCompleted_kyc() {
        return this.surrogate.getCompleted_kyc();
    }

    public final BooleanDto getCompleted_mfa() {
        return this.surrogate.getCompleted_mfa();
    }

    public final SecurityContextDto getSecurity_context() {
        return this.surrogate.getSecurity_context();
    }

    public final String getTransfer_id() {
        return this.surrogate.getTransfer_id();
    }

    public final String getParty_selection() {
        return this.surrogate.getParty_selection();
    }

    public final String getWallet_selection() {
        return this.surrogate.getWallet_selection();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public /* synthetic */ CryptoTransferContextDto(String str, String str2, String str3, double d, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, SecurityContextDto securityContextDto, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 128) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 256) != 0 ? null : securityContextDto, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoTransferContextDto(String currency_id, String session_id, String withdrawal_id, double d, String error_code, String title, BooleanDto completed_kyc, BooleanDto completed_mfa, SecurityContextDto securityContextDto, String transfer_id, String party_selection, String wallet_selection, String error_message) {
        this(new Surrogate(currency_id, session_id, withdrawal_id, d, error_code, title, completed_kyc, completed_mfa, securityContextDto, transfer_id, party_selection, wallet_selection, error_message));
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(withdrawal_id, "withdrawal_id");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(completed_kyc, "completed_kyc");
        Intrinsics.checkNotNullParameter(completed_mfa, "completed_mfa");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(party_selection, "party_selection");
        Intrinsics.checkNotNullParameter(wallet_selection, "wallet_selection");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
    }

    public final CryptoTransferContextDto copy(String currency_id, String session_id, String withdrawal_id, double amount, String error_code, String title, BooleanDto completed_kyc, BooleanDto completed_mfa, SecurityContextDto security_context, String transfer_id, String party_selection, String wallet_selection, String error_message) {
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(withdrawal_id, "withdrawal_id");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(completed_kyc, "completed_kyc");
        Intrinsics.checkNotNullParameter(completed_mfa, "completed_mfa");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(party_selection, "party_selection");
        Intrinsics.checkNotNullParameter(wallet_selection, "wallet_selection");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        return new CryptoTransferContextDto(new Surrogate(currency_id, session_id, withdrawal_id, amount, error_code, title, completed_kyc, completed_mfa, security_context, transfer_id, party_selection, wallet_selection, error_message));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoTransferContext toProto() {
        String currency_id = this.surrogate.getCurrency_id();
        String session_id = this.surrogate.getSession_id();
        String withdrawal_id = this.surrogate.getWithdrawal_id();
        double amount = this.surrogate.getAmount();
        String error_code = this.surrogate.getError_code();
        String title = this.surrogate.getTitle();
        Boolean r9 = (Boolean) this.surrogate.getCompleted_kyc().toProto();
        Boolean r10 = (Boolean) this.surrogate.getCompleted_mfa().toProto();
        SecurityContextDto security_context = this.surrogate.getSecurity_context();
        return new CryptoTransferContext(currency_id, session_id, withdrawal_id, amount, error_code, title, r9, r10, security_context != null ? security_context.toProto() : null, this.surrogate.getTransfer_id(), this.surrogate.getParty_selection(), this.surrogate.getWallet_selection(), this.surrogate.getError_message(), null, 8192, null);
    }

    public String toString() {
        return "[CryptoTransferContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoTransferContextDto) && Intrinsics.areEqual(((CryptoTransferContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 X2\u00020\u0001:\u0002WXB\u009a\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0016\u0010\u001cJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0018\u0010?\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u009c\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0019HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J%\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0001¢\u0006\u0002\bVR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001e\u001a\u0004\b2\u00103R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010 R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010 ¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Surrogate;", "", "currency_id", "", "session_id", "withdrawal_id", "amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", ErrorResponse.ERROR_CODE, "title", "completed_kyc", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "completed_mfa", "security_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "party_selection", "wallet_selection", "error_message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCurrency_id$annotations", "()V", "getCurrency_id", "()Ljava/lang/String;", "getSession_id$annotations", "getSession_id", "getWithdrawal_id$annotations", "getWithdrawal_id", "getAmount$annotations", "getAmount", "()D", "getError_code$annotations", "getError_code", "getTitle$annotations", "getTitle", "getCompleted_kyc$annotations", "getCompleted_kyc", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getCompleted_mfa$annotations", "getCompleted_mfa", "getSecurity_context$annotations", "getSecurity_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", "getTransfer_id$annotations", "getTransfer_id", "getParty_selection$annotations", "getParty_selection", "getWallet_selection$annotations", "getWallet_selection", "getError_message$annotations", "getError_message", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double amount;
        private final BooleanDto completed_kyc;
        private final BooleanDto completed_mfa;
        private final String currency_id;
        private final String error_code;
        private final String error_message;
        private final String party_selection;
        private final SecurityContextDto security_context;
        private final String session_id;
        private final String title;
        private final String transfer_id;
        private final String wallet_selection;
        private final String withdrawal_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (BooleanDto) null, (BooleanDto) null, (SecurityContextDto) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("completedKyc")
        @JsonAnnotations2(names = {"completed_kyc"})
        public static /* synthetic */ void getCompleted_kyc$annotations() {
        }

        @SerialName("completedMfa")
        @JsonAnnotations2(names = {"completed_mfa"})
        public static /* synthetic */ void getCompleted_mfa$annotations() {
        }

        @SerialName("currencyId")
        @JsonAnnotations2(names = {"currency_id"})
        public static /* synthetic */ void getCurrency_id$annotations() {
        }

        @SerialName("errorCode")
        @JsonAnnotations2(names = {ErrorResponse.ERROR_CODE})
        public static /* synthetic */ void getError_code$annotations() {
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("partySelection")
        @JsonAnnotations2(names = {"party_selection"})
        public static /* synthetic */ void getParty_selection$annotations() {
        }

        @SerialName("securityContext")
        @JsonAnnotations2(names = {"security_context"})
        public static /* synthetic */ void getSecurity_context$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("transferId")
        @JsonAnnotations2(names = {MatchSelectionActivity.TRANSFER_ID_EXTRA})
        public static /* synthetic */ void getTransfer_id$annotations() {
        }

        @SerialName("walletSelection")
        @JsonAnnotations2(names = {"wallet_selection"})
        public static /* synthetic */ void getWallet_selection$annotations() {
        }

        @SerialName("withdrawalId")
        @JsonAnnotations2(names = {"withdrawal_id"})
        public static /* synthetic */ void getWithdrawal_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrency_id() {
            return this.currency_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransfer_id() {
            return this.transfer_id;
        }

        /* renamed from: component11, reason: from getter */
        public final String getParty_selection() {
            return this.party_selection;
        }

        /* renamed from: component12, reason: from getter */
        public final String getWallet_selection() {
            return this.wallet_selection;
        }

        /* renamed from: component13, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getWithdrawal_id() {
            return this.withdrawal_id;
        }

        /* renamed from: component4, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getError_code() {
            return this.error_code;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component7, reason: from getter */
        public final BooleanDto getCompleted_kyc() {
            return this.completed_kyc;
        }

        /* renamed from: component8, reason: from getter */
        public final BooleanDto getCompleted_mfa() {
            return this.completed_mfa;
        }

        /* renamed from: component9, reason: from getter */
        public final SecurityContextDto getSecurity_context() {
            return this.security_context;
        }

        public final Surrogate copy(String currency_id, String session_id, String withdrawal_id, double amount, String error_code, String title, BooleanDto completed_kyc, BooleanDto completed_mfa, SecurityContextDto security_context, String transfer_id, String party_selection, String wallet_selection, String error_message) {
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(withdrawal_id, "withdrawal_id");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(completed_kyc, "completed_kyc");
            Intrinsics.checkNotNullParameter(completed_mfa, "completed_mfa");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(party_selection, "party_selection");
            Intrinsics.checkNotNullParameter(wallet_selection, "wallet_selection");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            return new Surrogate(currency_id, session_id, withdrawal_id, amount, error_code, title, completed_kyc, completed_mfa, security_context, transfer_id, party_selection, wallet_selection, error_message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_id, surrogate.currency_id) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.withdrawal_id, surrogate.withdrawal_id) && Double.compare(this.amount, surrogate.amount) == 0 && Intrinsics.areEqual(this.error_code, surrogate.error_code) && Intrinsics.areEqual(this.title, surrogate.title) && this.completed_kyc == surrogate.completed_kyc && this.completed_mfa == surrogate.completed_mfa && Intrinsics.areEqual(this.security_context, surrogate.security_context) && Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && Intrinsics.areEqual(this.party_selection, surrogate.party_selection) && Intrinsics.areEqual(this.wallet_selection, surrogate.wallet_selection) && Intrinsics.areEqual(this.error_message, surrogate.error_message);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.currency_id.hashCode() * 31) + this.session_id.hashCode()) * 31) + this.withdrawal_id.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.error_code.hashCode()) * 31) + this.title.hashCode()) * 31) + this.completed_kyc.hashCode()) * 31) + this.completed_mfa.hashCode()) * 31;
            SecurityContextDto securityContextDto = this.security_context;
            return ((((((((iHashCode + (securityContextDto == null ? 0 : securityContextDto.hashCode())) * 31) + this.transfer_id.hashCode()) * 31) + this.party_selection.hashCode()) * 31) + this.wallet_selection.hashCode()) * 31) + this.error_message.hashCode();
        }

        public String toString() {
            return "Surrogate(currency_id=" + this.currency_id + ", session_id=" + this.session_id + ", withdrawal_id=" + this.withdrawal_id + ", amount=" + this.amount + ", error_code=" + this.error_code + ", title=" + this.title + ", completed_kyc=" + this.completed_kyc + ", completed_mfa=" + this.completed_mfa + ", security_context=" + this.security_context + ", transfer_id=" + this.transfer_id + ", party_selection=" + this.party_selection + ", wallet_selection=" + this.wallet_selection + ", error_message=" + this.error_message + ")";
        }

        /* compiled from: CryptoTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoTransferContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, double d, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, SecurityContextDto securityContextDto, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.currency_id = "";
            } else {
                this.currency_id = str;
            }
            if ((i & 2) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            if ((i & 4) == 0) {
                this.withdrawal_id = "";
            } else {
                this.withdrawal_id = str3;
            }
            if ((i & 8) == 0) {
                this.amount = 0.0d;
            } else {
                this.amount = d;
            }
            if ((i & 16) == 0) {
                this.error_code = "";
            } else {
                this.error_code = str4;
            }
            if ((i & 32) == 0) {
                this.title = "";
            } else {
                this.title = str5;
            }
            if ((i & 64) == 0) {
                this.completed_kyc = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.completed_kyc = booleanDto;
            }
            if ((i & 128) == 0) {
                this.completed_mfa = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.completed_mfa = booleanDto2;
            }
            if ((i & 256) == 0) {
                this.security_context = null;
            } else {
                this.security_context = securityContextDto;
            }
            if ((i & 512) == 0) {
                this.transfer_id = "";
            } else {
                this.transfer_id = str6;
            }
            if ((i & 1024) == 0) {
                this.party_selection = "";
            } else {
                this.party_selection = str7;
            }
            if ((i & 2048) == 0) {
                this.wallet_selection = "";
            } else {
                this.wallet_selection = str8;
            }
            if ((i & 4096) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.currency_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.currency_id);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.session_id);
            }
            if (!Intrinsics.areEqual(self.withdrawal_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.withdrawal_id);
            }
            if (Double.compare(self.amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount));
            }
            if (!Intrinsics.areEqual(self.error_code, "")) {
                output.encodeStringElement(serialDesc, 4, self.error_code);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 5, self.title);
            }
            BooleanDto booleanDto = self.completed_kyc;
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            if (booleanDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BooleanDto.Serializer.INSTANCE, self.completed_kyc);
            }
            if (self.completed_mfa != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, BooleanDto.Serializer.INSTANCE, self.completed_mfa);
            }
            SecurityContextDto securityContextDto = self.security_context;
            if (securityContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SecurityContextDto.Serializer.INSTANCE, securityContextDto);
            }
            if (!Intrinsics.areEqual(self.transfer_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.transfer_id);
            }
            if (!Intrinsics.areEqual(self.party_selection, "")) {
                output.encodeStringElement(serialDesc, 10, self.party_selection);
            }
            if (!Intrinsics.areEqual(self.wallet_selection, "")) {
                output.encodeStringElement(serialDesc, 11, self.wallet_selection);
            }
            if (Intrinsics.areEqual(self.error_message, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.error_message);
        }

        public Surrogate(String currency_id, String session_id, String withdrawal_id, double d, String error_code, String title, BooleanDto completed_kyc, BooleanDto completed_mfa, SecurityContextDto securityContextDto, String transfer_id, String party_selection, String wallet_selection, String error_message) {
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(withdrawal_id, "withdrawal_id");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(completed_kyc, "completed_kyc");
            Intrinsics.checkNotNullParameter(completed_mfa, "completed_mfa");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(party_selection, "party_selection");
            Intrinsics.checkNotNullParameter(wallet_selection, "wallet_selection");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            this.currency_id = currency_id;
            this.session_id = session_id;
            this.withdrawal_id = withdrawal_id;
            this.amount = d;
            this.error_code = error_code;
            this.title = title;
            this.completed_kyc = completed_kyc;
            this.completed_mfa = completed_mfa;
            this.security_context = securityContextDto;
            this.transfer_id = transfer_id;
            this.party_selection = party_selection;
            this.wallet_selection = wallet_selection;
            this.error_message = error_message;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, double d, String str4, String str5, BooleanDto booleanDto, BooleanDto booleanDto2, SecurityContextDto securityContextDto, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 128) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 256) != 0 ? null : securityContextDto, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9);
        }

        public final String getCurrency_id() {
            return this.currency_id;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final String getWithdrawal_id() {
            return this.withdrawal_id;
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getError_code() {
            return this.error_code;
        }

        public final String getTitle() {
            return this.title;
        }

        public final BooleanDto getCompleted_kyc() {
            return this.completed_kyc;
        }

        public final BooleanDto getCompleted_mfa() {
            return this.completed_mfa;
        }

        public final SecurityContextDto getSecurity_context() {
            return this.security_context;
        }

        public final String getTransfer_id() {
            return this.transfer_id;
        }

        public final String getParty_selection() {
            return this.party_selection;
        }

        public final String getWallet_selection() {
            return this.wallet_selection;
        }

        public final String getError_message() {
            return this.error_message;
        }
    }

    /* compiled from: CryptoTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoTransferContextDto, CryptoTransferContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoTransferContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTransferContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTransferContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoTransferContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoTransferContext> getProtoAdapter() {
            return CryptoTransferContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTransferContextDto getZeroValue() {
            return CryptoTransferContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTransferContextDto fromProto(CryptoTransferContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String currency_id = proto.getCurrency_id();
            String session_id = proto.getSession_id();
            String withdrawal_id = proto.getWithdrawal_id();
            double amount = proto.getAmount();
            String error_code = proto.getError_code();
            String title = proto.getTitle();
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            BooleanDto booleanDtoFromProto = companion.fromProto(proto.getCompleted_kyc());
            BooleanDto booleanDtoFromProto2 = companion.fromProto(proto.getCompleted_mfa());
            CryptoTransferContext.SecurityContext security_context = proto.getSecurity_context();
            return new CryptoTransferContextDto(new Surrogate(currency_id, session_id, withdrawal_id, amount, error_code, title, booleanDtoFromProto, booleanDtoFromProto2, security_context != null ? SecurityContextDto.INSTANCE.fromProto(security_context) : null, proto.getTransfer_id(), proto.getParty_selection(), proto.getWallet_selection(), proto.getError_message()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransferContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTransferContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoTransferContextDto(null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext$SecurityContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Surrogate;)V", "phone_number_verified", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "auth_app_setup", "email_verified", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getPhone_number_verified", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getAuth_app_setup", "getEmail_verified", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SecurityContextDto implements Dto3<CryptoTransferContext.SecurityContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<SecurityContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SecurityContextDto, CryptoTransferContext.SecurityContext>> binaryBase64Serializer$delegate;
        private static final SecurityContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ SecurityContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SecurityContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final BooleanDto getPhone_number_verified() {
            return this.surrogate.getPhone_number_verified();
        }

        public final BooleanDto getAuth_app_setup() {
            return this.surrogate.getAuth_app_setup();
        }

        public final BooleanDto getEmail_verified() {
            return this.surrogate.getEmail_verified();
        }

        public /* synthetic */ SecurityContextDto(BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SecurityContextDto(BooleanDto phone_number_verified, BooleanDto auth_app_setup, BooleanDto email_verified) {
            this(new Surrogate(phone_number_verified, auth_app_setup, email_verified));
            Intrinsics.checkNotNullParameter(phone_number_verified, "phone_number_verified");
            Intrinsics.checkNotNullParameter(auth_app_setup, "auth_app_setup");
            Intrinsics.checkNotNullParameter(email_verified, "email_verified");
        }

        public static /* synthetic */ SecurityContextDto copy$default(SecurityContextDto securityContextDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                booleanDto = securityContextDto.surrogate.getPhone_number_verified();
            }
            if ((i & 2) != 0) {
                booleanDto2 = securityContextDto.surrogate.getAuth_app_setup();
            }
            if ((i & 4) != 0) {
                booleanDto3 = securityContextDto.surrogate.getEmail_verified();
            }
            return securityContextDto.copy(booleanDto, booleanDto2, booleanDto3);
        }

        public final SecurityContextDto copy(BooleanDto phone_number_verified, BooleanDto auth_app_setup, BooleanDto email_verified) {
            Intrinsics.checkNotNullParameter(phone_number_verified, "phone_number_verified");
            Intrinsics.checkNotNullParameter(auth_app_setup, "auth_app_setup");
            Intrinsics.checkNotNullParameter(email_verified, "email_verified");
            return new SecurityContextDto(new Surrogate(phone_number_verified, auth_app_setup, email_verified));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public CryptoTransferContext.SecurityContext toProto() {
            return new CryptoTransferContext.SecurityContext((Boolean) this.surrogate.getPhone_number_verified().toProto(), (Boolean) this.surrogate.getAuth_app_setup().toProto(), (Boolean) this.surrogate.getEmail_verified().toProto(), null, 8, null);
        }

        public String toString() {
            return "[SecurityContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof SecurityContextDto) && Intrinsics.areEqual(((SecurityContextDto) other).surrogate, this.surrogate);
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
        /* compiled from: CryptoTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002'(B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Surrogate;", "", "phone_number_verified", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "auth_app_setup", "email_verified", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPhone_number_verified$annotations", "()V", "getPhone_number_verified", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getAuth_app_setup$annotations", "getAuth_app_setup", "getEmail_verified$annotations", "getEmail_verified", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BooleanDto auth_app_setup;
            private final BooleanDto email_verified;
            private final BooleanDto phone_number_verified;

            public Surrogate() {
                this((BooleanDto) null, (BooleanDto) null, (BooleanDto) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, Object obj) {
                if ((i & 1) != 0) {
                    booleanDto = surrogate.phone_number_verified;
                }
                if ((i & 2) != 0) {
                    booleanDto2 = surrogate.auth_app_setup;
                }
                if ((i & 4) != 0) {
                    booleanDto3 = surrogate.email_verified;
                }
                return surrogate.copy(booleanDto, booleanDto2, booleanDto3);
            }

            @SerialName("authAppSetup")
            @JsonAnnotations2(names = {"auth_app_setup"})
            public static /* synthetic */ void getAuth_app_setup$annotations() {
            }

            @SerialName("emailVerified")
            @JsonAnnotations2(names = {"email_verified"})
            public static /* synthetic */ void getEmail_verified$annotations() {
            }

            @SerialName("phoneNumberVerified")
            @JsonAnnotations2(names = {"phone_number_verified"})
            public static /* synthetic */ void getPhone_number_verified$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final BooleanDto getPhone_number_verified() {
                return this.phone_number_verified;
            }

            /* renamed from: component2, reason: from getter */
            public final BooleanDto getAuth_app_setup() {
                return this.auth_app_setup;
            }

            /* renamed from: component3, reason: from getter */
            public final BooleanDto getEmail_verified() {
                return this.email_verified;
            }

            public final Surrogate copy(BooleanDto phone_number_verified, BooleanDto auth_app_setup, BooleanDto email_verified) {
                Intrinsics.checkNotNullParameter(phone_number_verified, "phone_number_verified");
                Intrinsics.checkNotNullParameter(auth_app_setup, "auth_app_setup");
                Intrinsics.checkNotNullParameter(email_verified, "email_verified");
                return new Surrogate(phone_number_verified, auth_app_setup, email_verified);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.phone_number_verified == surrogate.phone_number_verified && this.auth_app_setup == surrogate.auth_app_setup && this.email_verified == surrogate.email_verified;
            }

            public int hashCode() {
                return (((this.phone_number_verified.hashCode() * 31) + this.auth_app_setup.hashCode()) * 31) + this.email_verified.hashCode();
            }

            public String toString() {
                return "Surrogate(phone_number_verified=" + this.phone_number_verified + ", auth_app_setup=" + this.auth_app_setup + ", email_verified=" + this.email_verified + ")";
            }

            /* compiled from: CryptoTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CryptoTransferContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, SerializationConstructorMarker serializationConstructorMarker) {
                this.phone_number_verified = (i & 1) == 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto;
                if ((i & 2) == 0) {
                    this.auth_app_setup = BooleanDto.INSTANCE.getZeroValue();
                } else {
                    this.auth_app_setup = booleanDto2;
                }
                if ((i & 4) == 0) {
                    this.email_verified = BooleanDto.INSTANCE.getZeroValue();
                } else {
                    this.email_verified = booleanDto3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                BooleanDto booleanDto = self.phone_number_verified;
                BooleanDto.Companion companion = BooleanDto.INSTANCE;
                if (booleanDto != companion.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, BooleanDto.Serializer.INSTANCE, self.phone_number_verified);
                }
                if (self.auth_app_setup != companion.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, BooleanDto.Serializer.INSTANCE, self.auth_app_setup);
                }
                if (self.email_verified != companion.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.email_verified);
                }
            }

            public Surrogate(BooleanDto phone_number_verified, BooleanDto auth_app_setup, BooleanDto email_verified) {
                Intrinsics.checkNotNullParameter(phone_number_verified, "phone_number_verified");
                Intrinsics.checkNotNullParameter(auth_app_setup, "auth_app_setup");
                Intrinsics.checkNotNullParameter(email_verified, "email_verified");
                this.phone_number_verified = phone_number_verified;
                this.auth_app_setup = auth_app_setup;
                this.email_verified = email_verified;
            }

            public final BooleanDto getPhone_number_verified() {
                return this.phone_number_verified;
            }

            public /* synthetic */ Surrogate(BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3);
            }

            public final BooleanDto getAuth_app_setup() {
                return this.auth_app_setup;
            }

            public final BooleanDto getEmail_verified() {
                return this.email_verified;
            }
        }

        /* compiled from: CryptoTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext$SecurityContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<SecurityContextDto, CryptoTransferContext.SecurityContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SecurityContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SecurityContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SecurityContextDto> getBinaryBase64Serializer() {
                return (KSerializer) SecurityContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransferContext.SecurityContext> getProtoAdapter() {
                return CryptoTransferContext.SecurityContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SecurityContextDto getZeroValue() {
                return SecurityContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SecurityContextDto fromProto(CryptoTransferContext.SecurityContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                BooleanDto.Companion companion = BooleanDto.INSTANCE;
                return new SecurityContextDto(new Surrogate(companion.fromProto(proto.getPhone_number_verified()), companion.fromProto(proto.getAuth_app_setup()), companion.fromProto(proto.getEmail_verified())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransferContextDto$SecurityContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransferContextDto.SecurityContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new SecurityContextDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SecurityContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransferContext.SecurityContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SecurityContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public SecurityContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new SecurityContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CryptoTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$SecurityContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CryptoTransferContextDto$SecurityContextDto";
            }
        }
    }

    /* compiled from: CryptoTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoTransferContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransferContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoTransferContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoTransferContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoTransferContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoTransferContextDto";
        }
    }
}
