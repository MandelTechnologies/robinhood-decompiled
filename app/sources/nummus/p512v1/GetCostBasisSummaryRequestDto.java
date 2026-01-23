package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import nummus.p512v1.CostBasisStatusDto;

/* compiled from: GetCostBasisSummaryRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0019R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/GetCostBasisSummaryRequest;", "Landroid/os/Parcelable;", "Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;)V", "", "account_id", "source_id", "source_type", "currency_pair_id", "Lnummus/v1/CostBasisStatusDto;", "status", "", "year", "limit", "cursor", "", "allow_correction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;IILjava/lang/String;Z)V", "toProto", "()Lnummus/v1/GetCostBasisSummaryRequest;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;", "getAccount_id", "getSource_id", "getSource_type", "getCurrency_pair_id", "getStatus", "()Lnummus/v1/CostBasisStatusDto;", "getYear", "getLimit", "getCursor", "getAllow_correction", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class GetCostBasisSummaryRequestDto implements Dto3<GetCostBasisSummaryRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCostBasisSummaryRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCostBasisSummaryRequestDto, GetCostBasisSummaryRequest>> binaryBase64Serializer$delegate;
    private static final GetCostBasisSummaryRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCostBasisSummaryRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCostBasisSummaryRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getSource_id() {
        return this.surrogate.getSource_id();
    }

    public final String getSource_type() {
        return this.surrogate.getSource_type();
    }

    public final String getCurrency_pair_id() {
        return this.surrogate.getCurrency_pair_id();
    }

    public final CostBasisStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final int getYear() {
        return this.surrogate.getYear();
    }

    public final int getLimit() {
        return this.surrogate.getLimit();
    }

    public final String getCursor() {
        return this.surrogate.getCursor();
    }

    public final boolean getAllow_correction() {
        return this.surrogate.getAllow_correction();
    }

    public /* synthetic */ GetCostBasisSummaryRequestDto(String str, String str2, String str3, String str4, CostBasisStatusDto costBasisStatusDto, int i, int i2, String str5, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? CostBasisStatusDto.INSTANCE.getZeroValue() : costBasisStatusDto, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCostBasisSummaryRequestDto(String account_id, String source_id, String source_type, String currency_pair_id, CostBasisStatusDto status, int i, int i2, String cursor, boolean z) {
        this(new Surrogate(account_id, source_id, source_type, currency_pair_id, status, i, i2, cursor, z));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCostBasisSummaryRequest toProto() {
        return new GetCostBasisSummaryRequest(this.surrogate.getAccount_id(), this.surrogate.getSource_id(), this.surrogate.getSource_type(), this.surrogate.getCurrency_pair_id(), (CostBasisStatus) this.surrogate.getStatus().toProto(), this.surrogate.getYear(), this.surrogate.getLimit(), this.surrogate.getCursor(), this.surrogate.getAllow_correction(), null, 512, null);
    }

    public String toString() {
        return "[GetCostBasisSummaryRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCostBasisSummaryRequestDto) && Intrinsics.areEqual(((GetCostBasisSummaryRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCostBasisSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BAB\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bo\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\"R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\"R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\"R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R/\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b8\u0010+\u001a\u0004\b7\u0010$R/\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b:\u0010+\u001a\u0004\b9\u0010$R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010(\u0012\u0004\b<\u0010+\u001a\u0004\b;\u0010\"R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u0010+\u001a\u0004\b>\u0010?¨\u0006C"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;", "", "", "account_id", "source_id", "source_type", "currency_pair_id", "Lnummus/v1/CostBasisStatusDto;", "status", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "year", "limit", "cursor", "", "allow_correction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;IILjava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatusDto;IILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "()V", "getSource_id", "getSource_id$annotations", "getSource_type", "getSource_type$annotations", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "Lnummus/v1/CostBasisStatusDto;", "getStatus", "()Lnummus/v1/CostBasisStatusDto;", "getStatus$annotations", "I", "getYear", "getYear$annotations", "getLimit", "getLimit$annotations", "getCursor", "getCursor$annotations", "Z", "getAllow_correction", "()Z", "getAllow_correction$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final boolean allow_correction;
        private final String currency_pair_id;
        private final String cursor;
        private final int limit;
        private final String source_id;
        private final String source_type;
        private final CostBasisStatusDto status;
        private final int year;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (CostBasisStatusDto) null, 0, 0, (String) null, false, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.source_id, surrogate.source_id) && Intrinsics.areEqual(this.source_type, surrogate.source_type) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && this.status == surrogate.status && this.year == surrogate.year && this.limit == surrogate.limit && Intrinsics.areEqual(this.cursor, surrogate.cursor) && this.allow_correction == surrogate.allow_correction;
        }

        public int hashCode() {
            return (((((((((((((((this.account_id.hashCode() * 31) + this.source_id.hashCode()) * 31) + this.source_type.hashCode()) * 31) + this.currency_pair_id.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.year)) * 31) + Integer.hashCode(this.limit)) * 31) + this.cursor.hashCode()) * 31) + Boolean.hashCode(this.allow_correction);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", source_id=" + this.source_id + ", source_type=" + this.source_type + ", currency_pair_id=" + this.currency_pair_id + ", status=" + this.status + ", year=" + this.year + ", limit=" + this.limit + ", cursor=" + this.cursor + ", allow_correction=" + this.allow_correction + ")";
        }

        /* compiled from: GetCostBasisSummaryRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCostBasisSummaryRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, CostBasisStatusDto costBasisStatusDto, int i2, int i3, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.source_id = "";
            } else {
                this.source_id = str2;
            }
            if ((i & 4) == 0) {
                this.source_type = "";
            } else {
                this.source_type = str3;
            }
            if ((i & 8) == 0) {
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str4;
            }
            if ((i & 16) == 0) {
                this.status = CostBasisStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = costBasisStatusDto;
            }
            if ((i & 32) == 0) {
                this.year = 0;
            } else {
                this.year = i2;
            }
            if ((i & 64) == 0) {
                this.limit = 0;
            } else {
                this.limit = i3;
            }
            if ((i & 128) == 0) {
                this.cursor = "";
            } else {
                this.cursor = str5;
            }
            if ((i & 256) == 0) {
                this.allow_correction = false;
            } else {
                this.allow_correction = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (!Intrinsics.areEqual(self.source_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.source_id);
            }
            if (!Intrinsics.areEqual(self.source_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.source_type);
            }
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.currency_pair_id);
            }
            if (self.status != CostBasisStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, CostBasisStatusDto.Serializer.INSTANCE, self.status);
            }
            int i = self.year;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.limit;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.cursor, "")) {
                output.encodeStringElement(serialDesc, 7, self.cursor);
            }
            boolean z = self.allow_correction;
            if (z) {
                output.encodeBooleanElement(serialDesc, 8, z);
            }
        }

        public Surrogate(String account_id, String source_id, String source_type, String currency_pair_id, CostBasisStatusDto status, int i, int i2, String cursor, boolean z) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            this.account_id = account_id;
            this.source_id = source_id;
            this.source_type = source_type;
            this.currency_pair_id = currency_pair_id;
            this.status = status;
            this.year = i;
            this.limit = i2;
            this.cursor = cursor;
            this.allow_correction = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, CostBasisStatusDto costBasisStatusDto, int i, int i2, String str5, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? CostBasisStatusDto.INSTANCE.getZeroValue() : costBasisStatusDto, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? false : z);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getSource_id() {
            return this.source_id;
        }

        public final String getSource_type() {
            return this.source_type;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final CostBasisStatusDto getStatus() {
            return this.status;
        }

        public final int getYear() {
            return this.year;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final boolean getAllow_correction() {
            return this.allow_correction;
        }
    }

    /* compiled from: GetCostBasisSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/GetCostBasisSummaryRequestDto;", "Lnummus/v1/GetCostBasisSummaryRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/GetCostBasisSummaryRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetCostBasisSummaryRequestDto, GetCostBasisSummaryRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCostBasisSummaryRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCostBasisSummaryRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCostBasisSummaryRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCostBasisSummaryRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCostBasisSummaryRequest> getProtoAdapter() {
            return GetCostBasisSummaryRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCostBasisSummaryRequestDto getZeroValue() {
            return GetCostBasisSummaryRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCostBasisSummaryRequestDto fromProto(GetCostBasisSummaryRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetCostBasisSummaryRequestDto(new Surrogate(proto.getAccount_id(), proto.getSource_id(), proto.getSource_type(), proto.getCurrency_pair_id(), CostBasisStatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getYear(), proto.getLimit(), proto.getCursor(), proto.getAllow_correction()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.GetCostBasisSummaryRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCostBasisSummaryRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCostBasisSummaryRequestDto(null, null, null, null, null, 0, 0, null, false, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCostBasisSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/GetCostBasisSummaryRequestDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/GetCostBasisSummaryRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCostBasisSummaryRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.GetCostBasisSummaryRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCostBasisSummaryRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCostBasisSummaryRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCostBasisSummaryRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCostBasisSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "nummus.v1.GetCostBasisSummaryRequestDto";
        }
    }
}
