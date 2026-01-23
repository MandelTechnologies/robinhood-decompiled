package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.CopilotStatusDto;
import com.robinhood.copilot.proto.p286v1.DigestV2Dto;
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
import p479j$.time.Instant;

/* compiled from: BatchGetLatestCryptoDigestInternalResponseItemDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0013JS\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0019¨\u00067"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItem;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;)V", "", "crypto_currency_id", "Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "digest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copilot_status", ErrorResponse.ERROR_CODE, "error_message", "(Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItem;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;", "getCrypto_currency_id", "getDigest", "()Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "getLast_updated_at", "()Lj$/time/Instant;", "getCopilot_status", "()Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "getError_code", "getError_message", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class BatchGetLatestCryptoDigestInternalResponseItemDto implements Dto3<BatchGetLatestCryptoDigestInternalResponseItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BatchGetLatestCryptoDigestInternalResponseItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BatchGetLatestCryptoDigestInternalResponseItemDto, BatchGetLatestCryptoDigestInternalResponseItem>> binaryBase64Serializer$delegate;
    private static final BatchGetLatestCryptoDigestInternalResponseItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BatchGetLatestCryptoDigestInternalResponseItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BatchGetLatestCryptoDigestInternalResponseItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCrypto_currency_id() {
        return this.surrogate.getCrypto_currency_id();
    }

    public final DigestV2Dto getDigest() {
        return this.surrogate.getDigest();
    }

    public final Instant getLast_updated_at() {
        return this.surrogate.getLast_updated_at();
    }

    public final CopilotStatusDto getCopilot_status() {
        return this.surrogate.getCopilot_status();
    }

    public final String getError_code() {
        return this.surrogate.getError_code();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public /* synthetic */ BatchGetLatestCryptoDigestInternalResponseItemDto(String str, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : digestV2Dto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? CopilotStatusDto.INSTANCE.getZeroValue() : copilotStatusDto, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatchGetLatestCryptoDigestInternalResponseItemDto(String crypto_currency_id, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilot_status, String error_code, String error_message) {
        this(new Surrogate(crypto_currency_id, digestV2Dto, instant, copilot_status, error_code, error_message));
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
    }

    public static /* synthetic */ BatchGetLatestCryptoDigestInternalResponseItemDto copy$default(BatchGetLatestCryptoDigestInternalResponseItemDto batchGetLatestCryptoDigestInternalResponseItemDto, String str, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchGetLatestCryptoDigestInternalResponseItemDto.surrogate.getCrypto_currency_id();
        }
        if ((i & 2) != 0) {
            digestV2Dto = batchGetLatestCryptoDigestInternalResponseItemDto.surrogate.getDigest();
        }
        if ((i & 4) != 0) {
            instant = batchGetLatestCryptoDigestInternalResponseItemDto.surrogate.getLast_updated_at();
        }
        if ((i & 8) != 0) {
            copilotStatusDto = batchGetLatestCryptoDigestInternalResponseItemDto.surrogate.getCopilot_status();
        }
        if ((i & 16) != 0) {
            str2 = batchGetLatestCryptoDigestInternalResponseItemDto.surrogate.getError_code();
        }
        if ((i & 32) != 0) {
            str3 = batchGetLatestCryptoDigestInternalResponseItemDto.surrogate.getError_message();
        }
        String str4 = str2;
        String str5 = str3;
        return batchGetLatestCryptoDigestInternalResponseItemDto.copy(str, digestV2Dto, instant, copilotStatusDto, str4, str5);
    }

    public final BatchGetLatestCryptoDigestInternalResponseItemDto copy(String crypto_currency_id, DigestV2Dto digest, Instant last_updated_at, CopilotStatusDto copilot_status, String error_code, String error_message) {
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        return new BatchGetLatestCryptoDigestInternalResponseItemDto(new Surrogate(crypto_currency_id, digest, last_updated_at, copilot_status, error_code, error_message));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BatchGetLatestCryptoDigestInternalResponseItem toProto() {
        String crypto_currency_id = this.surrogate.getCrypto_currency_id();
        DigestV2Dto digest = this.surrogate.getDigest();
        return new BatchGetLatestCryptoDigestInternalResponseItem(crypto_currency_id, digest != null ? digest.toProto() : null, this.surrogate.getLast_updated_at(), (CopilotStatus) this.surrogate.getCopilot_status().toProto(), this.surrogate.getError_code(), this.surrogate.getError_message(), null, 64, null);
    }

    public String toString() {
        return "[BatchGetLatestCryptoDigestInternalResponseItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BatchGetLatestCryptoDigestInternalResponseItemDto) && Intrinsics.areEqual(((BatchGetLatestCryptoDigestInternalResponseItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: BatchGetLatestCryptoDigestInternalResponseItemDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!Jt\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010#RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010%R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010'R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00103\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010!R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00103\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010!¨\u0006F"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;", "", "", "crypto_currency_id", "Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "digest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copilot_status", ErrorResponse.ERROR_CODE, "error_message", "<init>", "(Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCrypto_currency_id", "getCrypto_currency_id$annotations", "()V", "Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "getDigest", "getDigest$annotations", "Lj$/time/Instant;", "getLast_updated_at", "getLast_updated_at$annotations", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "getCopilot_status", "getCopilot_status$annotations", "getError_code", "getError_code$annotations", "getError_message", "getError_message$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CopilotStatusDto copilot_status;
        private final String crypto_currency_id;
        private final DigestV2Dto digest;
        private final String error_code;
        private final String error_message;
        private final Instant last_updated_at;

        public Surrogate() {
            this((String) null, (DigestV2Dto) null, (Instant) null, (CopilotStatusDto) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.crypto_currency_id;
            }
            if ((i & 2) != 0) {
                digestV2Dto = surrogate.digest;
            }
            if ((i & 4) != 0) {
                instant = surrogate.last_updated_at;
            }
            if ((i & 8) != 0) {
                copilotStatusDto = surrogate.copilot_status;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.error_code;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.error_message;
            }
            String str4 = str2;
            String str5 = str3;
            return surrogate.copy(str, digestV2Dto, instant, copilotStatusDto, str4, str5);
        }

        @SerialName("copilotStatus")
        @JsonAnnotations2(names = {"copilot_status"})
        public static /* synthetic */ void getCopilot_status$annotations() {
        }

        @SerialName("cryptoCurrencyId")
        @JsonAnnotations2(names = {"crypto_currency_id"})
        public static /* synthetic */ void getCrypto_currency_id$annotations() {
        }

        @SerialName("digest")
        @JsonAnnotations2(names = {"digest"})
        public static /* synthetic */ void getDigest$annotations() {
        }

        @SerialName("errorCode")
        @JsonAnnotations2(names = {ErrorResponse.ERROR_CODE})
        public static /* synthetic */ void getError_code$annotations() {
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("lastUpdatedAt")
        @JsonAnnotations2(names = {"last_updated_at"})
        public static /* synthetic */ void getLast_updated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCrypto_currency_id() {
            return this.crypto_currency_id;
        }

        /* renamed from: component2, reason: from getter */
        public final DigestV2Dto getDigest() {
            return this.digest;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        /* renamed from: component4, reason: from getter */
        public final CopilotStatusDto getCopilot_status() {
            return this.copilot_status;
        }

        /* renamed from: component5, reason: from getter */
        public final String getError_code() {
            return this.error_code;
        }

        /* renamed from: component6, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        public final Surrogate copy(String crypto_currency_id, DigestV2Dto digest, Instant last_updated_at, CopilotStatusDto copilot_status, String error_code, String error_message) {
            Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
            Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            return new Surrogate(crypto_currency_id, digest, last_updated_at, copilot_status, error_code, error_message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.crypto_currency_id, surrogate.crypto_currency_id) && Intrinsics.areEqual(this.digest, surrogate.digest) && Intrinsics.areEqual(this.last_updated_at, surrogate.last_updated_at) && this.copilot_status == surrogate.copilot_status && Intrinsics.areEqual(this.error_code, surrogate.error_code) && Intrinsics.areEqual(this.error_message, surrogate.error_message);
        }

        public int hashCode() {
            int iHashCode = this.crypto_currency_id.hashCode() * 31;
            DigestV2Dto digestV2Dto = this.digest;
            int iHashCode2 = (iHashCode + (digestV2Dto == null ? 0 : digestV2Dto.hashCode())) * 31;
            Instant instant = this.last_updated_at;
            return ((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.copilot_status.hashCode()) * 31) + this.error_code.hashCode()) * 31) + this.error_message.hashCode();
        }

        public String toString() {
            return "Surrogate(crypto_currency_id=" + this.crypto_currency_id + ", digest=" + this.digest + ", last_updated_at=" + this.last_updated_at + ", copilot_status=" + this.copilot_status + ", error_code=" + this.error_code + ", error_message=" + this.error_message + ")";
        }

        /* compiled from: BatchGetLatestCryptoDigestInternalResponseItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BatchGetLatestCryptoDigestInternalResponseItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.crypto_currency_id = "";
            } else {
                this.crypto_currency_id = str;
            }
            if ((i & 2) == 0) {
                this.digest = null;
            } else {
                this.digest = digestV2Dto;
            }
            if ((i & 4) == 0) {
                this.last_updated_at = null;
            } else {
                this.last_updated_at = instant;
            }
            if ((i & 8) == 0) {
                this.copilot_status = CopilotStatusDto.INSTANCE.getZeroValue();
            } else {
                this.copilot_status = copilotStatusDto;
            }
            if ((i & 16) == 0) {
                this.error_code = "";
            } else {
                this.error_code = str2;
            }
            if ((i & 32) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.crypto_currency_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.crypto_currency_id);
            }
            DigestV2Dto digestV2Dto = self.digest;
            if (digestV2Dto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DigestV2Dto.Serializer.INSTANCE, digestV2Dto);
            }
            Instant instant = self.last_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.copilot_status != CopilotStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CopilotStatusDto.Serializer.INSTANCE, self.copilot_status);
            }
            if (!Intrinsics.areEqual(self.error_code, "")) {
                output.encodeStringElement(serialDesc, 4, self.error_code);
            }
            if (Intrinsics.areEqual(self.error_message, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.error_message);
        }

        public Surrogate(String crypto_currency_id, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilot_status, String error_code, String error_message) {
            Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
            Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            this.crypto_currency_id = crypto_currency_id;
            this.digest = digestV2Dto;
            this.last_updated_at = instant;
            this.copilot_status = copilot_status;
            this.error_code = error_code;
            this.error_message = error_message;
        }

        public /* synthetic */ Surrogate(String str, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : digestV2Dto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? CopilotStatusDto.INSTANCE.getZeroValue() : copilotStatusDto, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
        }

        public final String getCrypto_currency_id() {
            return this.crypto_currency_id;
        }

        public final DigestV2Dto getDigest() {
            return this.digest;
        }

        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        public final CopilotStatusDto getCopilot_status() {
            return this.copilot_status;
        }

        public final String getError_code() {
            return this.error_code;
        }

        public final String getError_message() {
            return this.error_message;
        }
    }

    /* compiled from: BatchGetLatestCryptoDigestInternalResponseItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BatchGetLatestCryptoDigestInternalResponseItemDto, BatchGetLatestCryptoDigestInternalResponseItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BatchGetLatestCryptoDigestInternalResponseItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BatchGetLatestCryptoDigestInternalResponseItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BatchGetLatestCryptoDigestInternalResponseItemDto> getBinaryBase64Serializer() {
            return (KSerializer) BatchGetLatestCryptoDigestInternalResponseItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BatchGetLatestCryptoDigestInternalResponseItem> getProtoAdapter() {
            return BatchGetLatestCryptoDigestInternalResponseItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BatchGetLatestCryptoDigestInternalResponseItemDto getZeroValue() {
            return BatchGetLatestCryptoDigestInternalResponseItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BatchGetLatestCryptoDigestInternalResponseItemDto fromProto(BatchGetLatestCryptoDigestInternalResponseItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String crypto_currency_id = proto.getCrypto_currency_id();
            DigestV2 digest = proto.getDigest();
            return new BatchGetLatestCryptoDigestInternalResponseItemDto(new Surrogate(crypto_currency_id, digest != null ? DigestV2Dto.INSTANCE.fromProto(digest) : null, proto.getLast_updated_at(), CopilotStatusDto.INSTANCE.fromProto(proto.getCopilot_status()), proto.getError_code(), proto.getError_message()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalResponseItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BatchGetLatestCryptoDigestInternalResponseItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BatchGetLatestCryptoDigestInternalResponseItemDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BatchGetLatestCryptoDigestInternalResponseItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BatchGetLatestCryptoDigestInternalResponseItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.BatchGetLatestCryptoDigestInternalResponseItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BatchGetLatestCryptoDigestInternalResponseItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BatchGetLatestCryptoDigestInternalResponseItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BatchGetLatestCryptoDigestInternalResponseItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BatchGetLatestCryptoDigestInternalResponseItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalResponseItemDto";
        }
    }
}
