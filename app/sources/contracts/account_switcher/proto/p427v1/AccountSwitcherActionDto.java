package contracts.account_switcher.proto.p427v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.account_switcher.proto.p427v1.DeeplinkActionDto;
import contracts.account_switcher.proto.p427v1.DismissActionDto;
import contracts.account_switcher.proto.p427v1.RefreshActionDto;
import contracts.account_switcher.proto.p427v1.SelectAccountActionDto;
import contracts.account_switcher.proto.p427v1.ShowAllAccountsActionDto;
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

/* compiled from: AccountSwitcherActionDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherAction;", "Landroid/os/Parcelable;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;)V", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "type", "(Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;)V", "toProto", "()Lcontracts/account_switcher/proto/v1/AccountSwitcherAction;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "Serializer", "MultibindingModule", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class AccountSwitcherActionDto implements Dto3<AccountSwitcherAction>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccountSwitcherActionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountSwitcherActionDto, AccountSwitcherAction>> binaryBase64Serializer$delegate;
    private static final AccountSwitcherActionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AccountSwitcherActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountSwitcherActionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountSwitcherActionDto(TypeDto typeDto) {
        TypeDto.SelectAccount selectAccount = typeDto instanceof TypeDto.SelectAccount ? (TypeDto.SelectAccount) typeDto : null;
        SelectAccountActionDto value = selectAccount != null ? selectAccount.getValue() : null;
        TypeDto.Deeplink deeplink = typeDto instanceof TypeDto.Deeplink ? (TypeDto.Deeplink) typeDto : null;
        DeeplinkActionDto value2 = deeplink != null ? deeplink.getValue() : null;
        TypeDto.Dismiss dismiss = typeDto instanceof TypeDto.Dismiss ? (TypeDto.Dismiss) typeDto : null;
        DismissActionDto value3 = dismiss != null ? dismiss.getValue() : null;
        TypeDto.Refresh refresh = typeDto instanceof TypeDto.Refresh ? (TypeDto.Refresh) typeDto : null;
        RefreshActionDto value4 = refresh != null ? refresh.getValue() : null;
        TypeDto.ShowAllAccounts showAllAccounts = typeDto instanceof TypeDto.ShowAllAccounts ? (TypeDto.ShowAllAccounts) typeDto : null;
        this(new Surrogate(value, value2, value3, value4, showAllAccounts != null ? showAllAccounts.getValue() : null));
    }

    public /* synthetic */ AccountSwitcherActionDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public AccountSwitcherAction toProto() {
        SelectAccountActionDto select_account = this.surrogate.getSelect_account();
        SelectAccountAction proto = select_account != null ? select_account.toProto() : null;
        DeeplinkActionDto deeplink = this.surrogate.getDeeplink();
        DeeplinkAction proto2 = deeplink != null ? deeplink.toProto() : null;
        DismissActionDto dismiss = this.surrogate.getDismiss();
        DismissAction proto3 = dismiss != null ? dismiss.toProto() : null;
        RefreshActionDto refresh = this.surrogate.getRefresh();
        RefreshAction proto4 = refresh != null ? refresh.toProto() : null;
        ShowAllAccountsActionDto show_all_accounts = this.surrogate.getShow_all_accounts();
        return new AccountSwitcherAction(proto, proto2, proto3, proto4, show_all_accounts != null ? show_all_accounts.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[AccountSwitcherActionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AccountSwitcherActionDto) && Intrinsics.areEqual(((AccountSwitcherActionDto) other).surrogate, this.surrogate);
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
    /* compiled from: AccountSwitcherActionDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;", "", "Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;", "select_account", "Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;", "deeplink", "Lcontracts/account_switcher/proto/v1/DismissActionDto;", "dismiss", "Lcontracts/account_switcher/proto/v1/RefreshActionDto;", "refresh", "Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;", "show_all_accounts", "<init>", "(Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;Lcontracts/account_switcher/proto/v1/DismissActionDto;Lcontracts/account_switcher/proto/v1/RefreshActionDto;Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/account_switcher/proto/v1/SelectAccountActionDto;Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;Lcontracts/account_switcher/proto/v1/DismissActionDto;Lcontracts/account_switcher/proto/v1/RefreshActionDto;Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_account_switcher_proto_v1_externalRelease", "(Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;", "getSelect_account", "()Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;", "getSelect_account$annotations", "()V", "Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;", "getDeeplink", "()Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;", "getDeeplink$annotations", "Lcontracts/account_switcher/proto/v1/DismissActionDto;", "getDismiss", "()Lcontracts/account_switcher/proto/v1/DismissActionDto;", "getDismiss$annotations", "Lcontracts/account_switcher/proto/v1/RefreshActionDto;", "getRefresh", "()Lcontracts/account_switcher/proto/v1/RefreshActionDto;", "getRefresh$annotations", "Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;", "getShow_all_accounts", "()Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;", "getShow_all_accounts$annotations", "Companion", "$serializer", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DeeplinkActionDto deeplink;
        private final DismissActionDto dismiss;
        private final RefreshActionDto refresh;
        private final SelectAccountActionDto select_account;
        private final ShowAllAccountsActionDto show_all_accounts;

        public Surrogate() {
            this((SelectAccountActionDto) null, (DeeplinkActionDto) null, (DismissActionDto) null, (RefreshActionDto) null, (ShowAllAccountsActionDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.select_account, surrogate.select_account) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.dismiss, surrogate.dismiss) && Intrinsics.areEqual(this.refresh, surrogate.refresh) && Intrinsics.areEqual(this.show_all_accounts, surrogate.show_all_accounts);
        }

        public int hashCode() {
            SelectAccountActionDto selectAccountActionDto = this.select_account;
            int iHashCode = (selectAccountActionDto == null ? 0 : selectAccountActionDto.hashCode()) * 31;
            DeeplinkActionDto deeplinkActionDto = this.deeplink;
            int iHashCode2 = (iHashCode + (deeplinkActionDto == null ? 0 : deeplinkActionDto.hashCode())) * 31;
            DismissActionDto dismissActionDto = this.dismiss;
            int iHashCode3 = (iHashCode2 + (dismissActionDto == null ? 0 : dismissActionDto.hashCode())) * 31;
            RefreshActionDto refreshActionDto = this.refresh;
            int iHashCode4 = (iHashCode3 + (refreshActionDto == null ? 0 : refreshActionDto.hashCode())) * 31;
            ShowAllAccountsActionDto showAllAccountsActionDto = this.show_all_accounts;
            return iHashCode4 + (showAllAccountsActionDto != null ? showAllAccountsActionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(select_account=" + this.select_account + ", deeplink=" + this.deeplink + ", dismiss=" + this.dismiss + ", refresh=" + this.refresh + ", show_all_accounts=" + this.show_all_accounts + ")";
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AccountSwitcherActionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SelectAccountActionDto selectAccountActionDto, DeeplinkActionDto deeplinkActionDto, DismissActionDto dismissActionDto, RefreshActionDto refreshActionDto, ShowAllAccountsActionDto showAllAccountsActionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.select_account = null;
            } else {
                this.select_account = selectAccountActionDto;
            }
            if ((i & 2) == 0) {
                this.deeplink = null;
            } else {
                this.deeplink = deeplinkActionDto;
            }
            if ((i & 4) == 0) {
                this.dismiss = null;
            } else {
                this.dismiss = dismissActionDto;
            }
            if ((i & 8) == 0) {
                this.refresh = null;
            } else {
                this.refresh = refreshActionDto;
            }
            if ((i & 16) == 0) {
                this.show_all_accounts = null;
            } else {
                this.show_all_accounts = showAllAccountsActionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_account_switcher_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            SelectAccountActionDto selectAccountActionDto = self.select_account;
            if (selectAccountActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SelectAccountActionDto.Serializer.INSTANCE, selectAccountActionDto);
            }
            DeeplinkActionDto deeplinkActionDto = self.deeplink;
            if (deeplinkActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DeeplinkActionDto.Serializer.INSTANCE, deeplinkActionDto);
            }
            DismissActionDto dismissActionDto = self.dismiss;
            if (dismissActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DismissActionDto.Serializer.INSTANCE, dismissActionDto);
            }
            RefreshActionDto refreshActionDto = self.refresh;
            if (refreshActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, RefreshActionDto.Serializer.INSTANCE, refreshActionDto);
            }
            ShowAllAccountsActionDto showAllAccountsActionDto = self.show_all_accounts;
            if (showAllAccountsActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ShowAllAccountsActionDto.Serializer.INSTANCE, showAllAccountsActionDto);
            }
        }

        public Surrogate(SelectAccountActionDto selectAccountActionDto, DeeplinkActionDto deeplinkActionDto, DismissActionDto dismissActionDto, RefreshActionDto refreshActionDto, ShowAllAccountsActionDto showAllAccountsActionDto) {
            this.select_account = selectAccountActionDto;
            this.deeplink = deeplinkActionDto;
            this.dismiss = dismissActionDto;
            this.refresh = refreshActionDto;
            this.show_all_accounts = showAllAccountsActionDto;
        }

        public /* synthetic */ Surrogate(SelectAccountActionDto selectAccountActionDto, DeeplinkActionDto deeplinkActionDto, DismissActionDto dismissActionDto, RefreshActionDto refreshActionDto, ShowAllAccountsActionDto showAllAccountsActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : selectAccountActionDto, (i & 2) != 0 ? null : deeplinkActionDto, (i & 4) != 0 ? null : dismissActionDto, (i & 8) != 0 ? null : refreshActionDto, (i & 16) != 0 ? null : showAllAccountsActionDto);
        }

        public final SelectAccountActionDto getSelect_account() {
            return this.select_account;
        }

        public final DeeplinkActionDto getDeeplink() {
            return this.deeplink;
        }

        public final DismissActionDto getDismiss() {
            return this.dismiss;
        }

        public final RefreshActionDto getRefresh() {
            return this.refresh;
        }

        public final ShowAllAccountsActionDto getShow_all_accounts() {
            return this.show_all_accounts;
        }
    }

    /* compiled from: AccountSwitcherActionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AccountSwitcherActionDto, AccountSwitcherAction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountSwitcherActionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountSwitcherActionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountSwitcherActionDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountSwitcherActionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountSwitcherAction> getProtoAdapter() {
            return AccountSwitcherAction.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountSwitcherActionDto getZeroValue() {
            return AccountSwitcherActionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountSwitcherActionDto fromProto(AccountSwitcherAction proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SelectAccountAction select_account = proto.getSelect_account();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SelectAccountActionDto selectAccountActionDtoFromProto = select_account != null ? SelectAccountActionDto.INSTANCE.fromProto(select_account) : null;
            DeeplinkAction deeplink = proto.getDeeplink();
            DeeplinkActionDto deeplinkActionDtoFromProto = deeplink != null ? DeeplinkActionDto.INSTANCE.fromProto(deeplink) : null;
            DismissAction dismiss = proto.getDismiss();
            DismissActionDto dismissActionDtoFromProto = dismiss != null ? DismissActionDto.INSTANCE.fromProto(dismiss) : null;
            RefreshAction refresh = proto.getRefresh();
            RefreshActionDto refreshActionDtoFromProto = refresh != null ? RefreshActionDto.INSTANCE.fromProto(refresh) : null;
            ShowAllAccountsAction show_all_accounts = proto.getShow_all_accounts();
            return new AccountSwitcherActionDto(new Surrogate(selectAccountActionDtoFromProto, deeplinkActionDtoFromProto, dismissActionDtoFromProto, refreshActionDtoFromProto, show_all_accounts != null ? ShowAllAccountsActionDto.INSTANCE.fromProto(show_all_accounts) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.account_switcher.proto.v1.AccountSwitcherActionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSwitcherActionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AccountSwitcherActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountSwitcherActionDto.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SelectAccount", "Deeplink", BentoAlertSheet6.button2Title, "Refresh", "ShowAllAccounts", "Companion", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Deeplink;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Dismiss;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Refresh;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$SelectAccount;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$ShowAllAccounts;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$SelectAccount;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;", "value", "<init>", "(Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;", "getValue", "()Lcontracts/account_switcher/proto/v1/SelectAccountActionDto;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelectAccount extends TypeDto {
            private final SelectAccountActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectAccount) && Intrinsics.areEqual(this.value, ((SelectAccount) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SelectAccount(value=" + this.value + ")";
            }

            public final SelectAccountActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectAccount(SelectAccountActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Deeplink;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;", "value", "<init>", "(Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;", "getValue", "()Lcontracts/account_switcher/proto/v1/DeeplinkActionDto;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Deeplink extends TypeDto {
            private final DeeplinkActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Deeplink) && Intrinsics.areEqual(this.value, ((Deeplink) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Deeplink(value=" + this.value + ")";
            }

            public final DeeplinkActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Deeplink(DeeplinkActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Dismiss;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcontracts/account_switcher/proto/v1/DismissActionDto;", "value", "<init>", "(Lcontracts/account_switcher/proto/v1/DismissActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/account_switcher/proto/v1/DismissActionDto;", "getValue", "()Lcontracts/account_switcher/proto/v1/DismissActionDto;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Dismiss extends TypeDto {
            private final DismissActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dismiss) && Intrinsics.areEqual(this.value, ((Dismiss) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Dismiss(value=" + this.value + ")";
            }

            public final DismissActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dismiss(DismissActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Refresh;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcontracts/account_switcher/proto/v1/RefreshActionDto;", "value", "<init>", "(Lcontracts/account_switcher/proto/v1/RefreshActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/account_switcher/proto/v1/RefreshActionDto;", "getValue", "()Lcontracts/account_switcher/proto/v1/RefreshActionDto;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Refresh extends TypeDto {
            private final RefreshActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Refresh) && Intrinsics.areEqual(this.value, ((Refresh) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Refresh(value=" + this.value + ")";
            }

            public final RefreshActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refresh(RefreshActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$ShowAllAccounts;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;", "value", "<init>", "(Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;", "getValue", "()Lcontracts/account_switcher/proto/v1/ShowAllAccountsActionDto;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowAllAccounts extends TypeDto {
            private final ShowAllAccountsActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowAllAccounts) && Intrinsics.areEqual(this.value, ((ShowAllAccounts) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowAllAccounts(value=" + this.value + ")";
            }

            public final ShowAllAccountsActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowAllAccounts(ShowAllAccountsActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AccountSwitcherActionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$TypeDto;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherAction;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TypeDto, AccountSwitcherAction> {
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
            public ProtoAdapter<AccountSwitcherAction> getProtoAdapter() {
                return AccountSwitcherAction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(AccountSwitcherAction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSelect_account() != null) {
                    return new SelectAccount(SelectAccountActionDto.INSTANCE.fromProto(proto.getSelect_account()));
                }
                if (proto.getDeeplink() != null) {
                    return new Deeplink(DeeplinkActionDto.INSTANCE.fromProto(proto.getDeeplink()));
                }
                if (proto.getDismiss() != null) {
                    return new Dismiss(DismissActionDto.INSTANCE.fromProto(proto.getDismiss()));
                }
                if (proto.getRefresh() != null) {
                    return new Refresh(RefreshActionDto.INSTANCE.fromProto(proto.getRefresh()));
                }
                if (proto.getShow_all_accounts() != null) {
                    return new ShowAllAccounts(ShowAllAccountsActionDto.INSTANCE.fromProto(proto.getShow_all_accounts()));
                }
                return null;
            }
        }
    }

    /* compiled from: AccountSwitcherActionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AccountSwitcherActionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.account_switcher.proto.v1.AccountSwitcherAction", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountSwitcherActionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AccountSwitcherActionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AccountSwitcherActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AccountSwitcherActionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "contracts.account_switcher.proto.v1.AccountSwitcherActionDto";
        }
    }
}
