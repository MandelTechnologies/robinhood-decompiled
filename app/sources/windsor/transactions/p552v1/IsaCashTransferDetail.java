package windsor.transactions.p552v1;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.api.ErrorResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: IsaCashTransferDetail.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JBé\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+Jï\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010+R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010+R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\"\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u00107R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b9\u0010+R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b:\u0010+R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b;\u0010+R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b<\u0010+R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b=\u0010+R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b>\u0010+R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b?\u0010+R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b@\u0010+R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\b\u0016\u0010BR\u001a\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\bC\u0010+R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\bG\u0010BR\u001a\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\bH\u0010+R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\bI\u0010+¨\u0006K"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferDetail;", "Lcom/squareup/wire/Message;", "", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lwindsor/transactions/v1/IsaCashTransferState;", "state", ErrorResponse.ERROR_CODE, "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "estimated_transfer_value", "actual_transfer_value", "provider_name", "provider_reference", "file_name", "file_path", "provider_sort_code", "provider_account_number", "", "is_full_transfer", "requested_transfer_amount_gbp", "Lwindsor/transactions/v1/IsaType;", "type_of_isa_transferring_in", "does_partial_transfer_include_current_tax_year_contributions", "account_number", "transaction_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lwindsor/transactions/v1/IsaCashTransferState;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwindsor/transactions/v1/IsaType;ZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lwindsor/transactions/v1/IsaCashTransferState;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwindsor/transactions/v1/IsaType;ZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lwindsor/transactions/v1/IsaCashTransferDetail;", "Ljava/lang/String;", "getTransfer_id", "Lwindsor/transactions/v1/IsaCashTransferState;", "getState", "()Lwindsor/transactions/v1/IsaCashTransferState;", "getError_code", "getDescription", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getEstimated_transfer_value", "getActual_transfer_value", "getProvider_name", "getProvider_reference", "getFile_name", "getFile_path", "getProvider_sort_code", "getProvider_account_number", "Z", "()Z", "getRequested_transfer_amount_gbp", "Lwindsor/transactions/v1/IsaType;", "getType_of_isa_transferring_in", "()Lwindsor/transactions/v1/IsaType;", "getDoes_partial_transfer_include_current_tax_year_contributions", "getAccount_number", "getTransaction_id", "Companion", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class IsaCashTransferDetail extends Message {

    @JvmField
    public static final ProtoAdapter<IsaCashTransferDetail> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actualTransferValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final String actual_transfer_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doesPartialTransferIncludeCurrentTaxYearContributions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final boolean does_partial_transfer_include_current_tax_year_contributions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedTransferValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final String estimated_transfer_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fileName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final String file_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "filePath", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 13)
    private final String file_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFullTransfer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 16)
    private final boolean is_full_transfer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "providerAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 15)
    private final String provider_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "providerName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final String provider_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "providerReference", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final String provider_reference;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "providerSortCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final String provider_sort_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestedTransferAmountGbp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final String requested_transfer_amount_gbp;

    @WireField(adapter = "windsor.transactions.v1.IsaCashTransferState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final IsaCashTransferState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String transaction_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String transfer_id;

    @WireField(adapter = "windsor.transactions.v1.IsaType#ADAPTER", jsonName = "typeOfIsaTransferringIn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final IsaType type_of_isa_transferring_in;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final Instant updated_at;

    public IsaCashTransferDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, 2097151, null);
    }

    public /* synthetic */ IsaCashTransferDetail(String str, IsaCashTransferState isaCashTransferState, String str2, String str3, Instant instant, Instant instant2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, IsaType isaType, boolean z2, String str13, String str14, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IsaCashTransferState.ISA_STATUS_UNSPECIFIED : isaCashTransferState, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? instant2 : null, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? IsaType.ISA_TYPE_UNSPECIFIED : isaType, (i & 131072) == 0 ? z2 : false, (i & 262144) != 0 ? "" : str13, (i & 524288) == 0 ? str14 : "", (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30051newBuilder();
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final IsaCashTransferState getState() {
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

    public final IsaType getType_of_isa_transferring_in() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaCashTransferDetail(String transfer_id, IsaCashTransferState state, String error_code, String description, Instant instant, Instant instant2, String estimated_transfer_value, String actual_transfer_value, String provider_name, String provider_reference, String file_name, String file_path, String provider_sort_code, String provider_account_number, boolean z, String requested_transfer_amount_gbp, IsaType type_of_isa_transferring_in, boolean z2, String account_number, String transaction_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
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

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30051newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IsaCashTransferDetail)) {
            return false;
        }
        IsaCashTransferDetail isaCashTransferDetail = (IsaCashTransferDetail) other;
        return Intrinsics.areEqual(unknownFields(), isaCashTransferDetail.unknownFields()) && Intrinsics.areEqual(this.transfer_id, isaCashTransferDetail.transfer_id) && this.state == isaCashTransferDetail.state && Intrinsics.areEqual(this.error_code, isaCashTransferDetail.error_code) && Intrinsics.areEqual(this.description, isaCashTransferDetail.description) && Intrinsics.areEqual(this.created_at, isaCashTransferDetail.created_at) && Intrinsics.areEqual(this.updated_at, isaCashTransferDetail.updated_at) && Intrinsics.areEqual(this.estimated_transfer_value, isaCashTransferDetail.estimated_transfer_value) && Intrinsics.areEqual(this.actual_transfer_value, isaCashTransferDetail.actual_transfer_value) && Intrinsics.areEqual(this.provider_name, isaCashTransferDetail.provider_name) && Intrinsics.areEqual(this.provider_reference, isaCashTransferDetail.provider_reference) && Intrinsics.areEqual(this.file_name, isaCashTransferDetail.file_name) && Intrinsics.areEqual(this.file_path, isaCashTransferDetail.file_path) && Intrinsics.areEqual(this.provider_sort_code, isaCashTransferDetail.provider_sort_code) && Intrinsics.areEqual(this.provider_account_number, isaCashTransferDetail.provider_account_number) && this.is_full_transfer == isaCashTransferDetail.is_full_transfer && Intrinsics.areEqual(this.requested_transfer_amount_gbp, isaCashTransferDetail.requested_transfer_amount_gbp) && this.type_of_isa_transferring_in == isaCashTransferDetail.type_of_isa_transferring_in && this.does_partial_transfer_include_current_tax_year_contributions == isaCashTransferDetail.does_partial_transfer_include_current_tax_year_contributions && Intrinsics.areEqual(this.account_number, isaCashTransferDetail.account_number) && Intrinsics.areEqual(this.transaction_id, isaCashTransferDetail.transaction_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.transfer_id.hashCode()) * 37) + this.state.hashCode()) * 37) + this.error_code.hashCode()) * 37) + this.description.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode3 = ((((((((((((((((((((((((((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.estimated_transfer_value.hashCode()) * 37) + this.actual_transfer_value.hashCode()) * 37) + this.provider_name.hashCode()) * 37) + this.provider_reference.hashCode()) * 37) + this.file_name.hashCode()) * 37) + this.file_path.hashCode()) * 37) + this.provider_sort_code.hashCode()) * 37) + this.provider_account_number.hashCode()) * 37) + Boolean.hashCode(this.is_full_transfer)) * 37) + this.requested_transfer_amount_gbp.hashCode()) * 37) + this.type_of_isa_transferring_in.hashCode()) * 37) + Boolean.hashCode(this.does_partial_transfer_include_current_tax_year_contributions)) * 37) + this.account_number.hashCode()) * 37) + this.transaction_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        arrayList.add("state=" + this.state);
        arrayList.add("error_code=" + Internal.sanitize(this.error_code));
        arrayList.add("description=" + Internal.sanitize(this.description));
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        arrayList.add("estimated_transfer_value=" + Internal.sanitize(this.estimated_transfer_value));
        arrayList.add("actual_transfer_value=" + Internal.sanitize(this.actual_transfer_value));
        arrayList.add("provider_name=" + Internal.sanitize(this.provider_name));
        arrayList.add("provider_reference=" + Internal.sanitize(this.provider_reference));
        arrayList.add("file_name=" + Internal.sanitize(this.file_name));
        arrayList.add("file_path=" + Internal.sanitize(this.file_path));
        arrayList.add("provider_sort_code=" + Internal.sanitize(this.provider_sort_code));
        arrayList.add("provider_account_number=" + Internal.sanitize(this.provider_account_number));
        arrayList.add("is_full_transfer=" + this.is_full_transfer);
        arrayList.add("requested_transfer_amount_gbp=" + Internal.sanitize(this.requested_transfer_amount_gbp));
        arrayList.add("type_of_isa_transferring_in=" + this.type_of_isa_transferring_in);
        arrayList.add("does_partial_transfer_include_current_tax_year_contributions=" + this.does_partial_transfer_include_current_tax_year_contributions);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("transaction_id=" + Internal.sanitize(this.transaction_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "IsaCashTransferDetail{", "}", 0, null, null, 56, null);
    }

    public final IsaCashTransferDetail copy(String transfer_id, IsaCashTransferState state, String error_code, String description, Instant created_at, Instant updated_at, String estimated_transfer_value, String actual_transfer_value, String provider_name, String provider_reference, String file_name, String file_path, String provider_sort_code, String provider_account_number, boolean is_full_transfer, String requested_transfer_amount_gbp, IsaType type_of_isa_transferring_in, boolean does_partial_transfer_include_current_tax_year_contributions, String account_number, String transaction_id, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IsaCashTransferDetail(transfer_id, state, error_code, description, created_at, updated_at, estimated_transfer_value, actual_transfer_value, provider_name, provider_reference, file_name, file_path, provider_sort_code, provider_account_number, is_full_transfer, requested_transfer_amount_gbp, type_of_isa_transferring_in, does_partial_transfer_include_current_tax_year_contributions, account_number, transaction_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IsaCashTransferDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IsaCashTransferDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: windsor.transactions.v1.IsaCashTransferDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IsaCashTransferDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTransfer_id());
                }
                if (value.getState() != IsaCashTransferState.ISA_STATUS_UNSPECIFIED) {
                    size += IsaCashTransferState.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDescription());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getEstimated_transfer_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getEstimated_transfer_value());
                }
                if (!Intrinsics.areEqual(value.getActual_transfer_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getActual_transfer_value());
                }
                if (!Intrinsics.areEqual(value.getProvider_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getProvider_name());
                }
                if (!Intrinsics.areEqual(value.getProvider_reference(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getProvider_reference());
                }
                if (!Intrinsics.areEqual(value.getFile_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getFile_name());
                }
                if (!Intrinsics.areEqual(value.getFile_path(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getFile_path());
                }
                if (!Intrinsics.areEqual(value.getProvider_sort_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getProvider_sort_code());
                }
                if (!Intrinsics.areEqual(value.getProvider_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getProvider_account_number());
                }
                if (value.getIs_full_transfer()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getIs_full_transfer()));
                }
                if (!Intrinsics.areEqual(value.getRequested_transfer_amount_gbp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getRequested_transfer_amount_gbp());
                }
                if (value.getType_of_isa_transferring_in() != IsaType.ISA_TYPE_UNSPECIFIED) {
                    size += IsaType.ADAPTER.encodedSizeWithTag(18, value.getType_of_isa_transferring_in());
                }
                if (value.getDoes_partial_transfer_include_current_tax_year_contributions()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(19, Boolean.valueOf(value.getDoes_partial_transfer_include_current_tax_year_contributions()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getAccount_number());
                }
                return !Intrinsics.areEqual(value.getTransaction_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(21, value.getTransaction_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IsaCashTransferDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTransfer_id());
                }
                if (value.getState() != IsaCashTransferState.ISA_STATUS_UNSPECIFIED) {
                    IsaCashTransferState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getEstimated_transfer_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getEstimated_transfer_value());
                }
                if (!Intrinsics.areEqual(value.getActual_transfer_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getActual_transfer_value());
                }
                if (!Intrinsics.areEqual(value.getProvider_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getProvider_name());
                }
                if (!Intrinsics.areEqual(value.getProvider_reference(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getProvider_reference());
                }
                if (!Intrinsics.areEqual(value.getFile_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getFile_name());
                }
                if (!Intrinsics.areEqual(value.getFile_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getFile_path());
                }
                if (!Intrinsics.areEqual(value.getProvider_sort_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getProvider_sort_code());
                }
                if (!Intrinsics.areEqual(value.getProvider_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getProvider_account_number());
                }
                if (value.getIs_full_transfer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getIs_full_transfer()));
                }
                if (!Intrinsics.areEqual(value.getRequested_transfer_amount_gbp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getRequested_transfer_amount_gbp());
                }
                if (value.getType_of_isa_transferring_in() != IsaType.ISA_TYPE_UNSPECIFIED) {
                    IsaType.ADAPTER.encodeWithTag(writer, 18, (int) value.getType_of_isa_transferring_in());
                }
                if (value.getDoes_partial_transfer_include_current_tax_year_contributions()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getDoes_partial_transfer_include_current_tax_year_contributions()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTransaction_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getTransaction_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IsaCashTransferDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTransaction_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getTransaction_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAccount_number());
                }
                if (value.getDoes_partial_transfer_include_current_tax_year_contributions()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getDoes_partial_transfer_include_current_tax_year_contributions()));
                }
                if (value.getType_of_isa_transferring_in() != IsaType.ISA_TYPE_UNSPECIFIED) {
                    IsaType.ADAPTER.encodeWithTag(writer, 18, (int) value.getType_of_isa_transferring_in());
                }
                if (!Intrinsics.areEqual(value.getRequested_transfer_amount_gbp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getRequested_transfer_amount_gbp());
                }
                if (value.getIs_full_transfer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getIs_full_transfer()));
                }
                if (!Intrinsics.areEqual(value.getProvider_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getProvider_account_number());
                }
                if (!Intrinsics.areEqual(value.getProvider_sort_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getProvider_sort_code());
                }
                if (!Intrinsics.areEqual(value.getFile_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getFile_path());
                }
                if (!Intrinsics.areEqual(value.getFile_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getFile_name());
                }
                if (!Intrinsics.areEqual(value.getProvider_reference(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getProvider_reference());
                }
                if (!Intrinsics.areEqual(value.getProvider_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getProvider_name());
                }
                if (!Intrinsics.areEqual(value.getActual_transfer_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getActual_transfer_value());
                }
                if (!Intrinsics.areEqual(value.getEstimated_transfer_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getEstimated_transfer_value());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_code());
                }
                if (value.getState() != IsaCashTransferState.ISA_STATUS_UNSPECIFIED) {
                    IsaCashTransferState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTransfer_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IsaCashTransferDetail decode(ProtoReader reader) throws IOException {
                IsaType isaType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                IsaCashTransferState isaCashTransferState = IsaCashTransferState.ISA_STATUS_UNSPECIFIED;
                IsaType isaType2 = IsaType.ISA_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                IsaCashTransferState isaCashTransferStateDecode = isaCashTransferState;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                IsaType isaTypeDecode = isaType2;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                            default:
                                reader.readUnknownField(iNextTag);
                                isaType = isaTypeDecode;
                                str = strDecode13;
                                str2 = strDecode14;
                                break;
                            case 3:
                                isaType = isaTypeDecode;
                                str = strDecode13;
                                str2 = strDecode14;
                                try {
                                    isaCashTransferStateDecode = IsaCashTransferState.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 7:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 17:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 18:
                                try {
                                    isaTypeDecode = IsaType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    isaType = isaTypeDecode;
                                    str = strDecode13;
                                    str2 = strDecode14;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 19:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 20:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 21:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                        }
                        isaTypeDecode = isaType;
                        strDecode13 = str;
                        strDecode14 = str2;
                    } else {
                        return new IsaCashTransferDetail(strDecode13, isaCashTransferStateDecode, strDecode14, strDecode, instantDecode, instantDecode2, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, zBooleanValue, strDecode10, isaTypeDecode, zBooleanValue2, strDecode11, strDecode12, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IsaCashTransferDetail redact(IsaCashTransferDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return value.copy((1048527 & 1) != 0 ? value.transfer_id : null, (1048527 & 2) != 0 ? value.state : null, (1048527 & 4) != 0 ? value.error_code : null, (1048527 & 8) != 0 ? value.description : null, (1048527 & 16) != 0 ? value.created_at : instantRedact, (1048527 & 32) != 0 ? value.updated_at : updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, (1048527 & 64) != 0 ? value.estimated_transfer_value : null, (1048527 & 128) != 0 ? value.actual_transfer_value : null, (1048527 & 256) != 0 ? value.provider_name : null, (1048527 & 512) != 0 ? value.provider_reference : null, (1048527 & 1024) != 0 ? value.file_name : null, (1048527 & 2048) != 0 ? value.file_path : null, (1048527 & 4096) != 0 ? value.provider_sort_code : null, (1048527 & 8192) != 0 ? value.provider_account_number : null, (1048527 & 16384) != 0 ? value.is_full_transfer : false, (1048527 & 32768) != 0 ? value.requested_transfer_amount_gbp : null, (1048527 & 65536) != 0 ? value.type_of_isa_transferring_in : null, (1048527 & 131072) != 0 ? value.does_partial_transfer_include_current_tax_year_contributions : false, (1048527 & 262144) != 0 ? value.account_number : null, (1048527 & 524288) != 0 ? value.transaction_id : null, (1048527 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
