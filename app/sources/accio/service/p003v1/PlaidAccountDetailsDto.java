package accio.service.p003v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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

/* compiled from: PlaidAccountDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Laccio/service/v1/PlaidAccountDetails;", "Landroid/os/Parcelable;", "Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;", "surrogate", "<init>", "(Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;)V", "", "plaid_account_id", "account_number_mask", "", "current_balance", "available_balance", "limit", "account_number", "routing_number", "institution_id", "institution_name", "logo_url", "account_link_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Laccio/service/v1/PlaidAccountDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class PlaidAccountDetailsDto implements Dto3<PlaidAccountDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidAccountDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidAccountDetailsDto, PlaidAccountDetails>> binaryBase64Serializer$delegate;
    private static final PlaidAccountDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidAccountDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidAccountDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ PlaidAccountDetailsDto(String str, String str2, Double d, Double d2, Double d3, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidAccountDetailsDto(String plaid_account_id, String account_number_mask, Double d, Double d2, Double d3, String account_number, String routing_number, String institution_id, String institution_name, String logo_url, String account_link_id) {
        this(new Surrogate(plaid_account_id, account_number_mask, d, d2, d3, account_number, routing_number, institution_id, institution_name, logo_url, account_link_id));
        Intrinsics.checkNotNullParameter(plaid_account_id, "plaid_account_id");
        Intrinsics.checkNotNullParameter(account_number_mask, "account_number_mask");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
    }

    @Override // com.robinhood.idl.Dto
    public PlaidAccountDetails toProto() {
        return new PlaidAccountDetails(this.surrogate.getPlaid_account_id(), this.surrogate.getAccount_number_mask(), this.surrogate.getCurrent_balance(), this.surrogate.getAvailable_balance(), this.surrogate.getLimit(), this.surrogate.getAccount_number(), this.surrogate.getRouting_number(), this.surrogate.getInstitution_id(), this.surrogate.getInstitution_name(), this.surrogate.getLogo_url(), this.surrogate.getAccount_link_id(), null, 2048, null);
    }

    public String toString() {
        return "[PlaidAccountDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidAccountDetailsDto) && Intrinsics.areEqual(((PlaidAccountDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PlaidAccountDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDB¨\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#R1\u0010\t\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102R1\u0010\n\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b5\u0010-\u001a\u0004\b4\u00102R1\u0010\u000b\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00102R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010*\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010#R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010*\u0012\u0004\b;\u0010-\u001a\u0004\b:\u0010#R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010*\u0012\u0004\b=\u0010-\u001a\u0004\b<\u0010#R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010#R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010*\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010#R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010*\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010#¨\u0006F"}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;", "", "", "plaid_account_id", "account_number_mask", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "current_balance", "available_balance", "limit", "account_number", "routing_number", "institution_id", "institution_name", "logo_url", "account_link_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$accio_service_v1_externalRelease", "(Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaid_account_id", "getPlaid_account_id$annotations", "()V", "getAccount_number_mask", "getAccount_number_mask$annotations", "Ljava/lang/Double;", "getCurrent_balance", "()Ljava/lang/Double;", "getCurrent_balance$annotations", "getAvailable_balance", "getAvailable_balance$annotations", "getLimit", "getLimit$annotations", "getAccount_number", "getAccount_number$annotations", "getRouting_number", "getRouting_number$annotations", "getInstitution_id", "getInstitution_id$annotations", "getInstitution_name", "getInstitution_name$annotations", "getLogo_url", "getLogo_url$annotations", "getAccount_link_id", "getAccount_link_id$annotations", "Companion", "$serializer", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_link_id;
        private final String account_number;
        private final String account_number_mask;
        private final Double available_balance;
        private final Double current_balance;
        private final String institution_id;
        private final String institution_name;
        private final Double limit;
        private final String logo_url;
        private final String plaid_account_id;
        private final String routing_number;

        public Surrogate() {
            this((String) null, (String) null, (Double) null, (Double) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.plaid_account_id, surrogate.plaid_account_id) && Intrinsics.areEqual(this.account_number_mask, surrogate.account_number_mask) && Intrinsics.areEqual((Object) this.current_balance, (Object) surrogate.current_balance) && Intrinsics.areEqual((Object) this.available_balance, (Object) surrogate.available_balance) && Intrinsics.areEqual((Object) this.limit, (Object) surrogate.limit) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.routing_number, surrogate.routing_number) && Intrinsics.areEqual(this.institution_id, surrogate.institution_id) && Intrinsics.areEqual(this.institution_name, surrogate.institution_name) && Intrinsics.areEqual(this.logo_url, surrogate.logo_url) && Intrinsics.areEqual(this.account_link_id, surrogate.account_link_id);
        }

        public int hashCode() {
            int iHashCode = ((this.plaid_account_id.hashCode() * 31) + this.account_number_mask.hashCode()) * 31;
            Double d = this.current_balance;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.available_balance;
            int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.limit;
            return ((((((((((((iHashCode3 + (d3 != null ? d3.hashCode() : 0)) * 31) + this.account_number.hashCode()) * 31) + this.routing_number.hashCode()) * 31) + this.institution_id.hashCode()) * 31) + this.institution_name.hashCode()) * 31) + this.logo_url.hashCode()) * 31) + this.account_link_id.hashCode();
        }

        public String toString() {
            return "Surrogate(plaid_account_id=" + this.plaid_account_id + ", account_number_mask=" + this.account_number_mask + ", current_balance=" + this.current_balance + ", available_balance=" + this.available_balance + ", limit=" + this.limit + ", account_number=" + this.account_number + ", routing_number=" + this.routing_number + ", institution_id=" + this.institution_id + ", institution_name=" + this.institution_name + ", logo_url=" + this.logo_url + ", account_link_id=" + this.account_link_id + ")";
        }

        /* compiled from: PlaidAccountDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidAccountDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Double d, Double d2, Double d3, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.plaid_account_id = "";
            } else {
                this.plaid_account_id = str;
            }
            if ((i & 2) == 0) {
                this.account_number_mask = "";
            } else {
                this.account_number_mask = str2;
            }
            if ((i & 4) == 0) {
                this.current_balance = null;
            } else {
                this.current_balance = d;
            }
            if ((i & 8) == 0) {
                this.available_balance = null;
            } else {
                this.available_balance = d2;
            }
            if ((i & 16) == 0) {
                this.limit = null;
            } else {
                this.limit = d3;
            }
            if ((i & 32) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str3;
            }
            if ((i & 64) == 0) {
                this.routing_number = "";
            } else {
                this.routing_number = str4;
            }
            if ((i & 128) == 0) {
                this.institution_id = "";
            } else {
                this.institution_id = str5;
            }
            if ((i & 256) == 0) {
                this.institution_name = "";
            } else {
                this.institution_name = str6;
            }
            if ((i & 512) == 0) {
                this.logo_url = "";
            } else {
                this.logo_url = str7;
            }
            if ((i & 1024) == 0) {
                this.account_link_id = "";
            } else {
                this.account_link_id = str8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$accio_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.plaid_account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.plaid_account_id);
            }
            if (!Intrinsics.areEqual(self.account_number_mask, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number_mask);
            }
            Double d = self.current_balance;
            if (d != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, d);
            }
            Double d2 = self.available_balance;
            if (d2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, d2);
            }
            Double d3 = self.limit;
            if (d3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, d3);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 5, self.account_number);
            }
            if (!Intrinsics.areEqual(self.routing_number, "")) {
                output.encodeStringElement(serialDesc, 6, self.routing_number);
            }
            if (!Intrinsics.areEqual(self.institution_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.institution_id);
            }
            if (!Intrinsics.areEqual(self.institution_name, "")) {
                output.encodeStringElement(serialDesc, 8, self.institution_name);
            }
            if (!Intrinsics.areEqual(self.logo_url, "")) {
                output.encodeStringElement(serialDesc, 9, self.logo_url);
            }
            if (Intrinsics.areEqual(self.account_link_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 10, self.account_link_id);
        }

        public Surrogate(String plaid_account_id, String account_number_mask, Double d, Double d2, Double d3, String account_number, String routing_number, String institution_id, String institution_name, String logo_url, String account_link_id) {
            Intrinsics.checkNotNullParameter(plaid_account_id, "plaid_account_id");
            Intrinsics.checkNotNullParameter(account_number_mask, "account_number_mask");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(routing_number, "routing_number");
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            Intrinsics.checkNotNullParameter(institution_name, "institution_name");
            Intrinsics.checkNotNullParameter(logo_url, "logo_url");
            Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
            this.plaid_account_id = plaid_account_id;
            this.account_number_mask = account_number_mask;
            this.current_balance = d;
            this.available_balance = d2;
            this.limit = d3;
            this.account_number = account_number;
            this.routing_number = routing_number;
            this.institution_id = institution_id;
            this.institution_name = institution_name;
            this.logo_url = logo_url;
            this.account_link_id = account_link_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, Double d, Double d2, Double d3, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8);
        }

        public final String getPlaid_account_id() {
            return this.plaid_account_id;
        }

        public final String getAccount_number_mask() {
            return this.account_number_mask;
        }

        public final Double getCurrent_balance() {
            return this.current_balance;
        }

        public final Double getAvailable_balance() {
            return this.available_balance;
        }

        public final Double getLimit() {
            return this.limit;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getRouting_number() {
            return this.routing_number;
        }

        public final String getInstitution_id() {
            return this.institution_id;
        }

        public final String getInstitution_name() {
            return this.institution_name;
        }

        public final String getLogo_url() {
            return this.logo_url;
        }

        public final String getAccount_link_id() {
            return this.account_link_id;
        }
    }

    /* compiled from: PlaidAccountDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccio/service/v1/PlaidAccountDetailsDto;", "Laccio/service/v1/PlaidAccountDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccio/service/v1/PlaidAccountDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PlaidAccountDetailsDto, PlaidAccountDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidAccountDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidAccountDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidAccountDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidAccountDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidAccountDetails> getProtoAdapter() {
            return PlaidAccountDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidAccountDetailsDto getZeroValue() {
            return PlaidAccountDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidAccountDetailsDto fromProto(PlaidAccountDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PlaidAccountDetailsDto(new Surrogate(proto.getPlaid_account_id(), proto.getAccount_number_mask(), proto.getCurrent_balance(), proto.getAvailable_balance(), proto.getLimit(), proto.getAccount_number(), proto.getRouting_number(), proto.getInstitution_id(), proto.getInstitution_name(), proto.getLogo_url(), proto.getAccount_link_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: accio.service.v1.PlaidAccountDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidAccountDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PlaidAccountDetailsDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PlaidAccountDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccio/service/v1/PlaidAccountDetailsDto;", "<init>", "()V", "surrogateSerializer", "Laccio/service/v1/PlaidAccountDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PlaidAccountDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/accio.service.v1.PlaidAccountDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidAccountDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidAccountDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidAccountDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidAccountDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "accio.service.v1.PlaidAccountDetailsDto";
        }
    }
}
