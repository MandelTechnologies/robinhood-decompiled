package contracts.account_switcher.proto.p427v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: TradeAccountSwitcherAccountRowDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u00062"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRow;", "Landroid/os/Parcelable;", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;)V", "", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "title", "subtitle", "metadata_title", "metadata_subtitle", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "enabled", "logging_identifier", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLjava/lang/String;Lj$/time/Instant;)V", "toProto", "()Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRow;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class TradeAccountSwitcherAccountRowDto implements Dto3<TradeAccountSwitcherAccountRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TradeAccountSwitcherAccountRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TradeAccountSwitcherAccountRowDto, TradeAccountSwitcherAccountRow>> binaryBase64Serializer$delegate;
    private static final TradeAccountSwitcherAccountRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TradeAccountSwitcherAccountRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TradeAccountSwitcherAccountRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TradeAccountSwitcherAccountRowDto(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, String str2, String str3, String str4, String str5, IconDto iconDto, boolean z, String str6, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : instant);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TradeAccountSwitcherAccountRowDto(String account_number, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, String title, String str, String str2, String str3, IconDto icon, boolean z, String str4, Instant instant) {
        this(new Surrogate(account_number, brokerage_account_type, management_type, title, str, str2, str3, icon, z, str4, instant));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TradeAccountSwitcherAccountRow toProto() {
        return new TradeAccountSwitcherAccountRow(this.surrogate.getAccount_number(), (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto(), (ManagementType) this.surrogate.getManagement_type().toProto(), this.surrogate.getTitle(), this.surrogate.getSubtitle(), this.surrogate.getMetadata_title(), this.surrogate.getMetadata_subtitle(), (Icon) this.surrogate.getIcon().toProto(), this.surrogate.getEnabled(), this.surrogate.getLogging_identifier(), this.surrogate.getCreated_at(), null, 2048, null);
    }

    public String toString() {
        return "[TradeAccountSwitcherAccountRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TradeAccountSwitcherAccountRowDto) && Intrinsics.areEqual(((TradeAccountSwitcherAccountRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: TradeAccountSwitcherAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002QPB£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0087\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\bA\u00101\u001a\u0004\b@\u0010(R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010DR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010HR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010.\u0012\u0004\bK\u00101\u001a\u0004\bJ\u0010(RF\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010L\u0012\u0004\bO\u00101\u001a\u0004\bM\u0010N¨\u0006R"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;", "", "", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "title", "subtitle", "metadata_title", "metadata_subtitle", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "enabled", "logging_identifier", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLjava/lang/String;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLjava/lang/String;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_account_switcher_proto_v1_externalRelease", "(Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getMetadata_title", "getMetadata_title$annotations", "getMetadata_subtitle", "getMetadata_subtitle$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Z", "getEnabled", "()Z", "getEnabled$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Companion", "$serializer", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final BrokerageAccountTypeDto brokerage_account_type;
        private final Instant created_at;
        private final boolean enabled;
        private final IconDto icon;
        private final String logging_identifier;
        private final ManagementTypeDto management_type;
        private final String metadata_subtitle;
        private final String metadata_title;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (BrokerageAccountTypeDto) null, (ManagementTypeDto) null, (String) null, (String) null, (String) null, (String) null, (IconDto) null, false, (String) null, (Instant) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.brokerage_account_type == surrogate.brokerage_account_type && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.metadata_title, surrogate.metadata_title) && Intrinsics.areEqual(this.metadata_subtitle, surrogate.metadata_subtitle) && this.icon == surrogate.icon && this.enabled == surrogate.enabled && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.created_at, surrogate.created_at);
        }

        public int hashCode() {
            int iHashCode = ((((((this.account_number.hashCode() * 31) + this.brokerage_account_type.hashCode()) * 31) + this.management_type.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.metadata_title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.metadata_subtitle;
            int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
            String str4 = this.logging_identifier;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Instant instant = this.created_at;
            return iHashCode5 + (instant != null ? instant.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", brokerage_account_type=" + this.brokerage_account_type + ", management_type=" + this.management_type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", metadata_title=" + this.metadata_title + ", metadata_subtitle=" + this.metadata_subtitle + ", icon=" + this.icon + ", enabled=" + this.enabled + ", logging_identifier=" + this.logging_identifier + ", created_at=" + this.created_at + ")";
        }

        /* compiled from: TradeAccountSwitcherAccountRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TradeAccountSwitcherAccountRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, String str2, String str3, String str4, String str5, IconDto iconDto, boolean z, String str6, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.brokerage_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.brokerage_account_type = brokerageAccountTypeDto;
            }
            if ((i & 4) == 0) {
                this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.management_type = managementTypeDto;
            }
            if ((i & 8) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 16) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str3;
            }
            if ((i & 32) == 0) {
                this.metadata_title = null;
            } else {
                this.metadata_title = str4;
            }
            if ((i & 64) == 0) {
                this.metadata_subtitle = null;
            } else {
                this.metadata_subtitle = str5;
            }
            if ((i & 128) == 0) {
                this.icon = IconDto.INSTANCE.getZeroValue();
            } else {
                this.icon = iconDto;
            }
            if ((i & 256) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            if ((i & 512) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str6;
            }
            if ((i & 1024) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_account_switcher_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 3, self.title);
            }
            String str = self.subtitle;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            String str2 = self.metadata_title;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.metadata_subtitle;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str3);
            }
            if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, IconDto.Serializer.INSTANCE, self.icon);
            }
            boolean z = self.enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 8, z);
            }
            String str4 = self.logging_identifier;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str4);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant);
            }
        }

        public Surrogate(String account_number, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, String title, String str, String str2, String str3, IconDto icon, boolean z, String str4, Instant instant) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.account_number = account_number;
            this.brokerage_account_type = brokerage_account_type;
            this.management_type = management_type;
            this.title = title;
            this.subtitle = str;
            this.metadata_title = str2;
            this.metadata_subtitle = str3;
            this.icon = icon;
            this.enabled = z;
            this.logging_identifier = str4;
            this.created_at = instant;
        }

        public /* synthetic */ Surrogate(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, String str2, String str3, String str4, String str5, IconDto iconDto, boolean z, String str6, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : instant);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getMetadata_title() {
            return this.metadata_title;
        }

        public final String getMetadata_subtitle() {
            return this.metadata_subtitle;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }
    }

    /* compiled from: TradeAccountSwitcherAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto;", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TradeAccountSwitcherAccountRowDto, TradeAccountSwitcherAccountRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeAccountSwitcherAccountRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TradeAccountSwitcherAccountRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TradeAccountSwitcherAccountRowDto> getBinaryBase64Serializer() {
            return (KSerializer) TradeAccountSwitcherAccountRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TradeAccountSwitcherAccountRow> getProtoAdapter() {
            return TradeAccountSwitcherAccountRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TradeAccountSwitcherAccountRowDto getZeroValue() {
            return TradeAccountSwitcherAccountRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TradeAccountSwitcherAccountRowDto fromProto(TradeAccountSwitcherAccountRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TradeAccountSwitcherAccountRowDto(new Surrogate(proto.getAccount_number(), BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type()), ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type()), proto.getTitle(), proto.getSubtitle(), proto.getMetadata_title(), proto.getMetadata_subtitle(), IconDto.INSTANCE.fromProto(proto.getIcon()), proto.getEnabled(), proto.getLogging_identifier(), proto.getCreated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.account_switcher.proto.v1.TradeAccountSwitcherAccountRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeAccountSwitcherAccountRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TradeAccountSwitcherAccountRowDto(null, null, null, null, null, null, null, null, false, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TradeAccountSwitcherAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TradeAccountSwitcherAccountRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.account_switcher.proto.v1.TradeAccountSwitcherAccountRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TradeAccountSwitcherAccountRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TradeAccountSwitcherAccountRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TradeAccountSwitcherAccountRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TradeAccountSwitcherAccountRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "contracts.account_switcher.proto.v1.TradeAccountSwitcherAccountRowDto";
        }
    }
}
