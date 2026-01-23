package accounts.onboarding.proto.p006v1;

import accounts.onboarding.proto.p006v1.BrokerageAccountTypeSelectionDto;
import accounts.onboarding.proto.p006v1.CustodialAccountSelectionDto;
import accounts.onboarding.proto.p006v1.RetirementAccountSelectionDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AvailableAccountRowDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005,+-./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto;", "Lcom/robinhood/idl/MessageDto;", "Laccounts/onboarding/proto/v1/AvailableAccountRow;", "Landroid/os/Parcelable;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;", "surrogate", "<init>", "(Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;)V", "", "title", "subtitle", "", "enabled", "identifier", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "row_type", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;)V", "toProto", "()Laccounts/onboarding/proto/v1/AvailableAccountRow;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;", "getTitle", "getSubtitle", "getEnabled", "()Z", "getIdentifier", "getRow_type", "()Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "Companion", "Surrogate", "RowTypeDto", "Serializer", "MultibindingModule", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AvailableAccountRowDto implements Dto3<AvailableAccountRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AvailableAccountRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AvailableAccountRowDto, AvailableAccountRow>> binaryBase64Serializer$delegate;
    private static final AvailableAccountRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AvailableAccountRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AvailableAccountRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final boolean getEnabled() {
        return this.surrogate.getEnabled();
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    public final RowTypeDto getRow_type() {
        if (this.surrogate.getBrokerage_account_type_selection() != null) {
            return new RowTypeDto.BrokerageAccountTypeSelection(this.surrogate.getBrokerage_account_type_selection());
        }
        if (this.surrogate.getRetirement_selection() != null) {
            return new RowTypeDto.RetirementSelection(this.surrogate.getRetirement_selection());
        }
        if (this.surrogate.getCustodial_selection() != null) {
            return new RowTypeDto.CustodialSelection(this.surrogate.getCustodial_selection());
        }
        return null;
    }

    public /* synthetic */ AvailableAccountRowDto(String str, String str2, boolean z, String str3, RowTypeDto rowTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : rowTypeDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AvailableAccountRowDto(String title, String subtitle, boolean z, String identifier, RowTypeDto rowTypeDto) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        RowTypeDto.BrokerageAccountTypeSelection brokerageAccountTypeSelection = rowTypeDto instanceof RowTypeDto.BrokerageAccountTypeSelection ? (RowTypeDto.BrokerageAccountTypeSelection) rowTypeDto : null;
        BrokerageAccountTypeSelectionDto value = brokerageAccountTypeSelection != null ? brokerageAccountTypeSelection.getValue() : null;
        RowTypeDto.RetirementSelection retirementSelection = rowTypeDto instanceof RowTypeDto.RetirementSelection ? (RowTypeDto.RetirementSelection) rowTypeDto : null;
        RetirementAccountSelectionDto value2 = retirementSelection != null ? retirementSelection.getValue() : null;
        RowTypeDto.CustodialSelection custodialSelection = rowTypeDto instanceof RowTypeDto.CustodialSelection ? (RowTypeDto.CustodialSelection) rowTypeDto : null;
        this(new Surrogate(title, subtitle, z, identifier, value, value2, custodialSelection != null ? custodialSelection.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public AvailableAccountRow toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        boolean enabled = this.surrogate.getEnabled();
        String identifier = this.surrogate.getIdentifier();
        BrokerageAccountTypeSelectionDto brokerage_account_type_selection = this.surrogate.getBrokerage_account_type_selection();
        BrokerageAccountTypeSelection proto = brokerage_account_type_selection != null ? brokerage_account_type_selection.toProto() : null;
        RetirementAccountSelectionDto retirement_selection = this.surrogate.getRetirement_selection();
        RetirementAccountSelection proto2 = retirement_selection != null ? retirement_selection.toProto() : null;
        CustodialAccountSelectionDto custodial_selection = this.surrogate.getCustodial_selection();
        return new AvailableAccountRow(title, subtitle, enabled, proto, proto2, custodial_selection != null ? custodial_selection.toProto() : null, identifier, null, 128, null);
    }

    public String toString() {
        return "[AvailableAccountRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AvailableAccountRowDto) && Intrinsics.areEqual(((AvailableAccountRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: AvailableAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\b<\u0010(\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;", "", "", "title", "subtitle", "", "enabled", "identifier", "Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;", "brokerage_account_type_selection", "Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;", "retirement_selection", "Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;", "custodial_selection", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$account_onboarding_proto_v1_externalRelease", "(Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Z", "getEnabled", "()Z", "getEnabled$annotations", "getIdentifier", "getIdentifier$annotations", "Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;", "getBrokerage_account_type_selection", "()Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;", "getBrokerage_account_type_selection$annotations", "Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;", "getRetirement_selection", "()Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;", "getRetirement_selection$annotations", "Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;", "getCustodial_selection", "()Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;", "getCustodial_selection$annotations", "Companion", "$serializer", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountTypeSelectionDto brokerage_account_type_selection;
        private final CustodialAccountSelectionDto custodial_selection;
        private final boolean enabled;
        private final String identifier;
        private final RetirementAccountSelectionDto retirement_selection;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, false, (String) null, (BrokerageAccountTypeSelectionDto) null, (RetirementAccountSelectionDto) null, (CustodialAccountSelectionDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && this.enabled == surrogate.enabled && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.brokerage_account_type_selection, surrogate.brokerage_account_type_selection) && Intrinsics.areEqual(this.retirement_selection, surrogate.retirement_selection) && Intrinsics.areEqual(this.custodial_selection, surrogate.custodial_selection);
        }

        public int hashCode() {
            int iHashCode = ((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.identifier.hashCode()) * 31;
            BrokerageAccountTypeSelectionDto brokerageAccountTypeSelectionDto = this.brokerage_account_type_selection;
            int iHashCode2 = (iHashCode + (brokerageAccountTypeSelectionDto == null ? 0 : brokerageAccountTypeSelectionDto.hashCode())) * 31;
            RetirementAccountSelectionDto retirementAccountSelectionDto = this.retirement_selection;
            int iHashCode3 = (iHashCode2 + (retirementAccountSelectionDto == null ? 0 : retirementAccountSelectionDto.hashCode())) * 31;
            CustodialAccountSelectionDto custodialAccountSelectionDto = this.custodial_selection;
            return iHashCode3 + (custodialAccountSelectionDto != null ? custodialAccountSelectionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", enabled=" + this.enabled + ", identifier=" + this.identifier + ", brokerage_account_type_selection=" + this.brokerage_account_type_selection + ", retirement_selection=" + this.retirement_selection + ", custodial_selection=" + this.custodial_selection + ")";
        }

        /* compiled from: AvailableAccountRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AvailableAccountRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, String str3, BrokerageAccountTypeSelectionDto brokerageAccountTypeSelectionDto, RetirementAccountSelectionDto retirementAccountSelectionDto, CustodialAccountSelectionDto custodialAccountSelectionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            if ((i & 8) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str3;
            }
            if ((i & 16) == 0) {
                this.brokerage_account_type_selection = null;
            } else {
                this.brokerage_account_type_selection = brokerageAccountTypeSelectionDto;
            }
            if ((i & 32) == 0) {
                this.retirement_selection = null;
            } else {
                this.retirement_selection = retirementAccountSelectionDto;
            }
            if ((i & 64) == 0) {
                this.custodial_selection = null;
            } else {
                this.custodial_selection = custodialAccountSelectionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$account_onboarding_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            boolean z = self.enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 3, self.identifier);
            }
            BrokerageAccountTypeSelectionDto brokerageAccountTypeSelectionDto = self.brokerage_account_type_selection;
            if (brokerageAccountTypeSelectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BrokerageAccountTypeSelectionDto.Serializer.INSTANCE, brokerageAccountTypeSelectionDto);
            }
            RetirementAccountSelectionDto retirementAccountSelectionDto = self.retirement_selection;
            if (retirementAccountSelectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, RetirementAccountSelectionDto.Serializer.INSTANCE, retirementAccountSelectionDto);
            }
            CustodialAccountSelectionDto custodialAccountSelectionDto = self.custodial_selection;
            if (custodialAccountSelectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CustodialAccountSelectionDto.Serializer.INSTANCE, custodialAccountSelectionDto);
            }
        }

        public Surrogate(String title, String subtitle, boolean z, String identifier, BrokerageAccountTypeSelectionDto brokerageAccountTypeSelectionDto, RetirementAccountSelectionDto retirementAccountSelectionDto, CustodialAccountSelectionDto custodialAccountSelectionDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.title = title;
            this.subtitle = subtitle;
            this.enabled = z;
            this.identifier = identifier;
            this.brokerage_account_type_selection = brokerageAccountTypeSelectionDto;
            this.retirement_selection = retirementAccountSelectionDto;
            this.custodial_selection = custodialAccountSelectionDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, String str3, BrokerageAccountTypeSelectionDto brokerageAccountTypeSelectionDto, RetirementAccountSelectionDto retirementAccountSelectionDto, CustodialAccountSelectionDto custodialAccountSelectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : brokerageAccountTypeSelectionDto, (i & 32) != 0 ? null : retirementAccountSelectionDto, (i & 64) != 0 ? null : custodialAccountSelectionDto);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final BrokerageAccountTypeSelectionDto getBrokerage_account_type_selection() {
            return this.brokerage_account_type_selection;
        }

        public final RetirementAccountSelectionDto getRetirement_selection() {
            return this.retirement_selection;
        }

        public final CustodialAccountSelectionDto getCustodial_selection() {
            return this.custodial_selection;
        }
    }

    /* compiled from: AvailableAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto;", "Laccounts/onboarding/proto/v1/AvailableAccountRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccounts/onboarding/proto/v1/AvailableAccountRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AvailableAccountRowDto, AvailableAccountRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AvailableAccountRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AvailableAccountRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AvailableAccountRowDto> getBinaryBase64Serializer() {
            return (KSerializer) AvailableAccountRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AvailableAccountRow> getProtoAdapter() {
            return AvailableAccountRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AvailableAccountRowDto getZeroValue() {
            return AvailableAccountRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AvailableAccountRowDto fromProto(AvailableAccountRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            boolean enabled = proto.getEnabled();
            String identifier = proto.getIdentifier();
            BrokerageAccountTypeSelection brokerage_account_type_selection = proto.getBrokerage_account_type_selection();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BrokerageAccountTypeSelectionDto brokerageAccountTypeSelectionDtoFromProto = brokerage_account_type_selection != null ? BrokerageAccountTypeSelectionDto.INSTANCE.fromProto(brokerage_account_type_selection) : null;
            RetirementAccountSelection retirement_selection = proto.getRetirement_selection();
            RetirementAccountSelectionDto retirementAccountSelectionDtoFromProto = retirement_selection != null ? RetirementAccountSelectionDto.INSTANCE.fromProto(retirement_selection) : null;
            CustodialAccountSelection custodial_selection = proto.getCustodial_selection();
            return new AvailableAccountRowDto(new Surrogate(title, subtitle, enabled, identifier, brokerageAccountTypeSelectionDtoFromProto, retirementAccountSelectionDtoFromProto, custodial_selection != null ? CustodialAccountSelectionDto.INSTANCE.fromProto(custodial_selection) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: accounts.onboarding.proto.v1.AvailableAccountRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AvailableAccountRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AvailableAccountRowDto(null, null, false, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AvailableAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "BrokerageAccountTypeSelection", "RetirementSelection", "CustodialSelection", "Companion", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$BrokerageAccountTypeSelection;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$CustodialSelection;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$RetirementSelection;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class RowTypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ RowTypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RowTypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: AvailableAccountRowDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$BrokerageAccountTypeSelection;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;", "value", "<init>", "(Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;", "getValue", "()Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelectionDto;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BrokerageAccountTypeSelection extends RowTypeDto {
            private final BrokerageAccountTypeSelectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BrokerageAccountTypeSelection) && Intrinsics.areEqual(this.value, ((BrokerageAccountTypeSelection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BrokerageAccountTypeSelection(value=" + this.value + ")";
            }

            public final BrokerageAccountTypeSelectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BrokerageAccountTypeSelection(BrokerageAccountTypeSelectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AvailableAccountRowDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$RetirementSelection;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;", "value", "<init>", "(Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;", "getValue", "()Laccounts/onboarding/proto/v1/RetirementAccountSelectionDto;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RetirementSelection extends RowTypeDto {
            private final RetirementAccountSelectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RetirementSelection) && Intrinsics.areEqual(this.value, ((RetirementSelection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RetirementSelection(value=" + this.value + ")";
            }

            public final RetirementAccountSelectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetirementSelection(RetirementAccountSelectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AvailableAccountRowDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$CustodialSelection;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;", "value", "<init>", "(Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;", "getValue", "()Laccounts/onboarding/proto/v1/CustodialAccountSelectionDto;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final /* data */ class CustodialSelection extends RowTypeDto {
            private final CustodialAccountSelectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustodialSelection) && Intrinsics.areEqual(this.value, ((CustodialSelection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CustodialSelection(value=" + this.value + ")";
            }

            public final CustodialAccountSelectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustodialSelection(CustodialAccountSelectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AvailableAccountRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$RowTypeDto;", "Laccounts/onboarding/proto/v1/AvailableAccountRow;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final class Companion implements Dto4.Creator<RowTypeDto, AvailableAccountRow> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AvailableAccountRow> getProtoAdapter() {
                return AvailableAccountRow.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RowTypeDto fromProto(AvailableAccountRow proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getBrokerage_account_type_selection() != null) {
                    return new BrokerageAccountTypeSelection(BrokerageAccountTypeSelectionDto.INSTANCE.fromProto(proto.getBrokerage_account_type_selection()));
                }
                if (proto.getRetirement_selection() != null) {
                    return new RetirementSelection(RetirementAccountSelectionDto.INSTANCE.fromProto(proto.getRetirement_selection()));
                }
                if (proto.getCustodial_selection() != null) {
                    return new CustodialSelection(CustodialAccountSelectionDto.INSTANCE.fromProto(proto.getCustodial_selection()));
                }
                return null;
            }
        }
    }

    /* compiled from: AvailableAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto;", "<init>", "()V", "surrogateSerializer", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AvailableAccountRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/accounts.onboarding.proto.v1.AvailableAccountRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AvailableAccountRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AvailableAccountRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AvailableAccountRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AvailableAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "accounts.onboarding.proto.v1.AvailableAccountRowDto";
        }
    }
}
