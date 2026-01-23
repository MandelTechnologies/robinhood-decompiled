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
import com.robinhood.rosetta.eventlogging.CryptoAssetContextDto;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContextDto;
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

/* compiled from: CryptoTokenApprovalContextDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0012JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Surrogate;)V", "transaction_hash", "", "currency_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "session_id", "network_fee", "", "rh_fee", "result", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;)V", "getTransaction_hash", "()Ljava/lang/String;", "getCurrency_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getSession_id", "getNetwork_fee", "()D", "getRh_fee", "getResult", "()Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ResultDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoTokenApprovalContextDto implements Dto3<CryptoTokenApprovalContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoTokenApprovalContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoTokenApprovalContextDto, CryptoTokenApprovalContext>> binaryBase64Serializer$delegate;
    private static final CryptoTokenApprovalContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoTokenApprovalContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoTokenApprovalContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTransaction_hash() {
        return this.surrogate.getTransaction_hash();
    }

    public final CryptoAssetContextDto getCurrency_id() {
        return this.surrogate.getCurrency_id();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final double getNetwork_fee() {
        return this.surrogate.getNetwork_fee();
    }

    public final double getRh_fee() {
        return this.surrogate.getRh_fee();
    }

    public final ResultDto getResult() {
        return this.surrogate.getResult();
    }

    public /* synthetic */ CryptoTokenApprovalContextDto(String str, CryptoAssetContextDto cryptoAssetContextDto, String str2, double d, double d2, ResultDto resultDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cryptoAssetContextDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0.0d : d2, (i & 32) != 0 ? ResultDto.INSTANCE.getZeroValue() : resultDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoTokenApprovalContextDto(String transaction_hash, CryptoAssetContextDto cryptoAssetContextDto, String session_id, double d, double d2, ResultDto result) {
        this(new Surrogate(transaction_hash, cryptoAssetContextDto, session_id, d, d2, result));
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    public static /* synthetic */ CryptoTokenApprovalContextDto copy$default(CryptoTokenApprovalContextDto cryptoTokenApprovalContextDto, String str, CryptoAssetContextDto cryptoAssetContextDto, String str2, double d, double d2, ResultDto resultDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTokenApprovalContextDto.surrogate.getTransaction_hash();
        }
        if ((i & 2) != 0) {
            cryptoAssetContextDto = cryptoTokenApprovalContextDto.surrogate.getCurrency_id();
        }
        if ((i & 4) != 0) {
            str2 = cryptoTokenApprovalContextDto.surrogate.getSession_id();
        }
        if ((i & 8) != 0) {
            d = cryptoTokenApprovalContextDto.surrogate.getNetwork_fee();
        }
        if ((i & 16) != 0) {
            d2 = cryptoTokenApprovalContextDto.surrogate.getRh_fee();
        }
        if ((i & 32) != 0) {
            resultDto = cryptoTokenApprovalContextDto.surrogate.getResult();
        }
        ResultDto resultDto2 = resultDto;
        double d3 = d2;
        String str3 = str2;
        return cryptoTokenApprovalContextDto.copy(str, cryptoAssetContextDto, str3, d, d3, resultDto2);
    }

    public final CryptoTokenApprovalContextDto copy(String transaction_hash, CryptoAssetContextDto currency_id, String session_id, double network_fee, double rh_fee, ResultDto result) {
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(result, "result");
        return new CryptoTokenApprovalContextDto(new Surrogate(transaction_hash, currency_id, session_id, network_fee, rh_fee, result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoTokenApprovalContext toProto() {
        String transaction_hash = this.surrogate.getTransaction_hash();
        CryptoAssetContextDto currency_id = this.surrogate.getCurrency_id();
        return new CryptoTokenApprovalContext(transaction_hash, currency_id != null ? currency_id.toProto() : null, this.surrogate.getSession_id(), this.surrogate.getNetwork_fee(), this.surrogate.getRh_fee(), (CryptoTokenApprovalContext.Result) this.surrogate.getResult().toProto(), null, 64, null);
    }

    public String toString() {
        return "[CryptoTokenApprovalContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoTokenApprovalContextDto) && Intrinsics.areEqual(((CryptoTokenApprovalContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoTokenApprovalContextDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002;<Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0018\u0010*\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\u0018\u0010+\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003Je\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0012HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R+\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010!R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Surrogate;", "", "transaction_hash", "", "currency_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "session_id", "network_fee", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "rh_fee", "result", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTransaction_hash$annotations", "()V", "getTransaction_hash", "()Ljava/lang/String;", "getCurrency_id$annotations", "getCurrency_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getSession_id$annotations", "getSession_id", "getNetwork_fee$annotations", "getNetwork_fee", "()D", "getRh_fee$annotations", "getRh_fee", "getResult$annotations", "getResult", "()Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoAssetContextDto currency_id;
        private final double network_fee;
        private final ResultDto result;
        private final double rh_fee;
        private final String session_id;
        private final String transaction_hash;

        public Surrogate() {
            this((String) null, (CryptoAssetContextDto) null, (String) null, 0.0d, 0.0d, (ResultDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, CryptoAssetContextDto cryptoAssetContextDto, String str2, double d, double d2, ResultDto resultDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.transaction_hash;
            }
            if ((i & 2) != 0) {
                cryptoAssetContextDto = surrogate.currency_id;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.session_id;
            }
            if ((i & 8) != 0) {
                d = surrogate.network_fee;
            }
            if ((i & 16) != 0) {
                d2 = surrogate.rh_fee;
            }
            if ((i & 32) != 0) {
                resultDto = surrogate.result;
            }
            ResultDto resultDto2 = resultDto;
            double d3 = d2;
            String str3 = str2;
            return surrogate.copy(str, cryptoAssetContextDto, str3, d, d3, resultDto2);
        }

        @SerialName("currencyId")
        @JsonAnnotations2(names = {"currency_id"})
        public static /* synthetic */ void getCurrency_id$annotations() {
        }

        @SerialName("networkFee")
        @JsonAnnotations2(names = {"network_fee"})
        public static /* synthetic */ void getNetwork_fee$annotations() {
        }

        @SerialName("result")
        @JsonAnnotations2(names = {"result"})
        public static /* synthetic */ void getResult$annotations() {
        }

        @SerialName("rhFee")
        @JsonAnnotations2(names = {"rh_fee"})
        public static /* synthetic */ void getRh_fee$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("transactionHash")
        @JsonAnnotations2(names = {"transaction_hash"})
        public static /* synthetic */ void getTransaction_hash$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTransaction_hash() {
            return this.transaction_hash;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoAssetContextDto getCurrency_id() {
            return this.currency_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component4, reason: from getter */
        public final double getNetwork_fee() {
            return this.network_fee;
        }

        /* renamed from: component5, reason: from getter */
        public final double getRh_fee() {
            return this.rh_fee;
        }

        /* renamed from: component6, reason: from getter */
        public final ResultDto getResult() {
            return this.result;
        }

        public final Surrogate copy(String transaction_hash, CryptoAssetContextDto currency_id, String session_id, double network_fee, double rh_fee, ResultDto result) {
            Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(result, "result");
            return new Surrogate(transaction_hash, currency_id, session_id, network_fee, rh_fee, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.transaction_hash, surrogate.transaction_hash) && Intrinsics.areEqual(this.currency_id, surrogate.currency_id) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Double.compare(this.network_fee, surrogate.network_fee) == 0 && Double.compare(this.rh_fee, surrogate.rh_fee) == 0 && this.result == surrogate.result;
        }

        public int hashCode() {
            int iHashCode = this.transaction_hash.hashCode() * 31;
            CryptoAssetContextDto cryptoAssetContextDto = this.currency_id;
            return ((((((((iHashCode + (cryptoAssetContextDto == null ? 0 : cryptoAssetContextDto.hashCode())) * 31) + this.session_id.hashCode()) * 31) + Double.hashCode(this.network_fee)) * 31) + Double.hashCode(this.rh_fee)) * 31) + this.result.hashCode();
        }

        public String toString() {
            return "Surrogate(transaction_hash=" + this.transaction_hash + ", currency_id=" + this.currency_id + ", session_id=" + this.session_id + ", network_fee=" + this.network_fee + ", rh_fee=" + this.rh_fee + ", result=" + this.result + ")";
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoTokenApprovalContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CryptoAssetContextDto cryptoAssetContextDto, String str2, double d, double d2, ResultDto resultDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.transaction_hash = "";
            } else {
                this.transaction_hash = str;
            }
            if ((i & 2) == 0) {
                this.currency_id = null;
            } else {
                this.currency_id = cryptoAssetContextDto;
            }
            if ((i & 4) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            if ((i & 8) == 0) {
                this.network_fee = 0.0d;
            } else {
                this.network_fee = d;
            }
            if ((i & 16) == 0) {
                this.rh_fee = 0.0d;
            } else {
                this.rh_fee = d2;
            }
            if ((i & 32) == 0) {
                this.result = ResultDto.INSTANCE.getZeroValue();
            } else {
                this.result = resultDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.transaction_hash, "")) {
                output.encodeStringElement(serialDesc, 0, self.transaction_hash);
            }
            CryptoAssetContextDto cryptoAssetContextDto = self.currency_id;
            if (cryptoAssetContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.session_id);
            }
            if (Double.compare(self.network_fee, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.network_fee));
            }
            if (Double.compare(self.rh_fee, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.rh_fee));
            }
            if (self.result != ResultDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ResultDto.Serializer.INSTANCE, self.result);
            }
        }

        public Surrogate(String transaction_hash, CryptoAssetContextDto cryptoAssetContextDto, String session_id, double d, double d2, ResultDto result) {
            Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(result, "result");
            this.transaction_hash = transaction_hash;
            this.currency_id = cryptoAssetContextDto;
            this.session_id = session_id;
            this.network_fee = d;
            this.rh_fee = d2;
            this.result = result;
        }

        public /* synthetic */ Surrogate(String str, CryptoAssetContextDto cryptoAssetContextDto, String str2, double d, double d2, ResultDto resultDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cryptoAssetContextDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0.0d : d2, (i & 32) != 0 ? ResultDto.INSTANCE.getZeroValue() : resultDto);
        }

        public final String getTransaction_hash() {
            return this.transaction_hash;
        }

        public final CryptoAssetContextDto getCurrency_id() {
            return this.currency_id;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final double getNetwork_fee() {
            return this.network_fee;
        }

        public final double getRh_fee() {
            return this.rh_fee;
        }

        public final ResultDto getResult() {
            return this.result;
        }
    }

    /* compiled from: CryptoTokenApprovalContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoTokenApprovalContextDto, CryptoTokenApprovalContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoTokenApprovalContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTokenApprovalContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTokenApprovalContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoTokenApprovalContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoTokenApprovalContext> getProtoAdapter() {
            return CryptoTokenApprovalContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTokenApprovalContextDto getZeroValue() {
            return CryptoTokenApprovalContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTokenApprovalContextDto fromProto(CryptoTokenApprovalContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String transaction_hash = proto.getTransaction_hash();
            CryptoAssetContext currency_id = proto.getCurrency_id();
            return new CryptoTokenApprovalContextDto(new Surrogate(transaction_hash, currency_id != null ? CryptoAssetContextDto.INSTANCE.fromProto(currency_id) : null, proto.getSession_id(), proto.getNetwork_fee(), proto.getRh_fee(), ResultDto.INSTANCE.fromProto(proto.getResult())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTokenApprovalContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoTokenApprovalContextDto(null, null, null, 0.0d, 0.0d, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTokenApprovalContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ResultDto implements Dto2<CryptoTokenApprovalContext.Result>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ResultDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ResultDto, CryptoTokenApprovalContext.Result>> binaryBase64Serializer$delegate;
        public static final ResultDto RESULT_UNSPECIFIED = new RESULT_UNSPECIFIED("RESULT_UNSPECIFIED", 0);
        public static final ResultDto SUCCESS = new SUCCESS("SUCCESS", 1);
        public static final ResultDto CANCELED_BY_USER = new CANCELED_BY_USER("CANCELED_BY_USER", 2);
        public static final ResultDto ERROR = new ERROR("ERROR", 3);

        private static final /* synthetic */ ResultDto[] $values() {
            return new ResultDto[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        public /* synthetic */ ResultDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ResultDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto.ResultDto.RESULT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESULT_UNSPECIFIED extends ResultDto {
            RESULT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTokenApprovalContext.Result toProto() {
                return CryptoTokenApprovalContext.Result.RESULT_UNSPECIFIED;
            }
        }

        private ResultDto(String str, int i) {
        }

        static {
            ResultDto[] resultDtoArr$values = $values();
            $VALUES = resultDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContextDto$ResultDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTokenApprovalContextDto.ResultDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto.ResultDto.SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCESS extends ResultDto {
            SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTokenApprovalContext.Result toProto() {
                return CryptoTokenApprovalContext.Result.SUCCESS;
            }
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto.ResultDto.CANCELED_BY_USER", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED_BY_USER extends ResultDto {
            CANCELED_BY_USER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTokenApprovalContext.Result toProto() {
                return CryptoTokenApprovalContext.Result.CANCELED_BY_USER;
            }
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto.ResultDto.ERROR", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR extends ResultDto {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTokenApprovalContext.Result toProto() {
                return CryptoTokenApprovalContext.Result.ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ResultDto, CryptoTokenApprovalContext.Result> {

            /* compiled from: CryptoTokenApprovalContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoTokenApprovalContext.Result.values().length];
                    try {
                        iArr[CryptoTokenApprovalContext.Result.RESULT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoTokenApprovalContext.Result.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoTokenApprovalContext.Result.CANCELED_BY_USER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoTokenApprovalContext.Result.ERROR.ordinal()] = 4;
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

            public final KSerializer<ResultDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResultDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResultDto> getBinaryBase64Serializer() {
                return (KSerializer) ResultDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTokenApprovalContext.Result> getProtoAdapter() {
                return CryptoTokenApprovalContext.Result.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResultDto getZeroValue() {
                return ResultDto.RESULT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResultDto fromProto(CryptoTokenApprovalContext.Result proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ResultDto.RESULT_UNSPECIFIED;
                }
                if (i == 2) {
                    return ResultDto.SUCCESS;
                }
                if (i == 3) {
                    return ResultDto.CANCELED_BY_USER;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ResultDto.ERROR;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTokenApprovalContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$ResultDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ResultDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ResultDto, CryptoTokenApprovalContext.Result> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoTokenApprovalContext.Result", ResultDto.getEntries(), ResultDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ResultDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ResultDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ResultDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ResultDto valueOf(String str) {
            return (ResultDto) Enum.valueOf(ResultDto.class, str);
        }

        public static ResultDto[] values() {
            return (ResultDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CryptoTokenApprovalContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoTokenApprovalContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTokenApprovalContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoTokenApprovalContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoTokenApprovalContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoTokenApprovalContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoTokenApprovalContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContextDto";
        }
    }
}
