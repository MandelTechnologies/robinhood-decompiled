package contracts.account_switcher.proto.p427v1;

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

/* compiled from: AccountSwitcherAction.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/AccountSwitcherAction;", "Lcom/squareup/wire/Message;", "", "select_account", "Lcontracts/account_switcher/proto/v1/SelectAccountAction;", "deeplink", "Lcontracts/account_switcher/proto/v1/DeeplinkAction;", "dismiss", "Lcontracts/account_switcher/proto/v1/DismissAction;", "refresh", "Lcontracts/account_switcher/proto/v1/RefreshAction;", "show_all_accounts", "Lcontracts/account_switcher/proto/v1/ShowAllAccountsAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/account_switcher/proto/v1/SelectAccountAction;Lcontracts/account_switcher/proto/v1/DeeplinkAction;Lcontracts/account_switcher/proto/v1/DismissAction;Lcontracts/account_switcher/proto/v1/RefreshAction;Lcontracts/account_switcher/proto/v1/ShowAllAccountsAction;Lokio/ByteString;)V", "getSelect_account", "()Lcontracts/account_switcher/proto/v1/SelectAccountAction;", "getDeeplink", "()Lcontracts/account_switcher/proto/v1/DeeplinkAction;", "getDismiss", "()Lcontracts/account_switcher/proto/v1/DismissAction;", "getRefresh", "()Lcontracts/account_switcher/proto/v1/RefreshAction;", "getShow_all_accounts", "()Lcontracts/account_switcher/proto/v1/ShowAllAccountsAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AccountSwitcherAction extends Message {

    @JvmField
    public static final ProtoAdapter<AccountSwitcherAction> ADAPTER;

    @WireField(adapter = "contracts.account_switcher.proto.v1.DeeplinkAction#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
    private final DeeplinkAction deeplink;

    @WireField(adapter = "contracts.account_switcher.proto.v1.DismissAction#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final DismissAction dismiss;

    @WireField(adapter = "contracts.account_switcher.proto.v1.RefreshAction#ADAPTER", oneofName = "type", schemaIndex = 3, tag = 4)
    private final RefreshAction refresh;

    @WireField(adapter = "contracts.account_switcher.proto.v1.SelectAccountAction#ADAPTER", jsonName = "selectAccount", oneofName = "type", schemaIndex = 0, tag = 1)
    private final SelectAccountAction select_account;

    @WireField(adapter = "contracts.account_switcher.proto.v1.ShowAllAccountsAction#ADAPTER", jsonName = "showAllAccounts", oneofName = "type", schemaIndex = 4, tag = 5)
    private final ShowAllAccountsAction show_all_accounts;

    public AccountSwitcherAction() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27594newBuilder();
    }

    public final SelectAccountAction getSelect_account() {
        return this.select_account;
    }

    public final DeeplinkAction getDeeplink() {
        return this.deeplink;
    }

    public final DismissAction getDismiss() {
        return this.dismiss;
    }

    public final RefreshAction getRefresh() {
        return this.refresh;
    }

    public final ShowAllAccountsAction getShow_all_accounts() {
        return this.show_all_accounts;
    }

    public /* synthetic */ AccountSwitcherAction(SelectAccountAction selectAccountAction, DeeplinkAction deeplinkAction, DismissAction dismissAction, RefreshAction refreshAction, ShowAllAccountsAction showAllAccountsAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : selectAccountAction, (i & 2) != 0 ? null : deeplinkAction, (i & 4) != 0 ? null : dismissAction, (i & 8) != 0 ? null : refreshAction, (i & 16) != 0 ? null : showAllAccountsAction, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSwitcherAction(SelectAccountAction selectAccountAction, DeeplinkAction deeplinkAction, DismissAction dismissAction, RefreshAction refreshAction, ShowAllAccountsAction showAllAccountsAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.select_account = selectAccountAction;
        this.deeplink = deeplinkAction;
        this.dismiss = dismissAction;
        this.refresh = refreshAction;
        this.show_all_accounts = showAllAccountsAction;
        if (Internal.countNonNull(selectAccountAction, deeplinkAction, dismissAction, refreshAction, showAllAccountsAction) > 1) {
            throw new IllegalArgumentException("At most one of select_account, deeplink, dismiss, refresh, show_all_accounts may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27594newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountSwitcherAction)) {
            return false;
        }
        AccountSwitcherAction accountSwitcherAction = (AccountSwitcherAction) other;
        return Intrinsics.areEqual(unknownFields(), accountSwitcherAction.unknownFields()) && Intrinsics.areEqual(this.select_account, accountSwitcherAction.select_account) && Intrinsics.areEqual(this.deeplink, accountSwitcherAction.deeplink) && Intrinsics.areEqual(this.dismiss, accountSwitcherAction.dismiss) && Intrinsics.areEqual(this.refresh, accountSwitcherAction.refresh) && Intrinsics.areEqual(this.show_all_accounts, accountSwitcherAction.show_all_accounts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SelectAccountAction selectAccountAction = this.select_account;
        int iHashCode2 = (iHashCode + (selectAccountAction != null ? selectAccountAction.hashCode() : 0)) * 37;
        DeeplinkAction deeplinkAction = this.deeplink;
        int iHashCode3 = (iHashCode2 + (deeplinkAction != null ? deeplinkAction.hashCode() : 0)) * 37;
        DismissAction dismissAction = this.dismiss;
        int iHashCode4 = (iHashCode3 + (dismissAction != null ? dismissAction.hashCode() : 0)) * 37;
        RefreshAction refreshAction = this.refresh;
        int iHashCode5 = (iHashCode4 + (refreshAction != null ? refreshAction.hashCode() : 0)) * 37;
        ShowAllAccountsAction showAllAccountsAction = this.show_all_accounts;
        int iHashCode6 = iHashCode5 + (showAllAccountsAction != null ? showAllAccountsAction.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SelectAccountAction selectAccountAction = this.select_account;
        if (selectAccountAction != null) {
            arrayList.add("select_account=" + selectAccountAction);
        }
        DeeplinkAction deeplinkAction = this.deeplink;
        if (deeplinkAction != null) {
            arrayList.add("deeplink=" + deeplinkAction);
        }
        DismissAction dismissAction = this.dismiss;
        if (dismissAction != null) {
            arrayList.add("dismiss=" + dismissAction);
        }
        RefreshAction refreshAction = this.refresh;
        if (refreshAction != null) {
            arrayList.add("refresh=" + refreshAction);
        }
        ShowAllAccountsAction showAllAccountsAction = this.show_all_accounts;
        if (showAllAccountsAction != null) {
            arrayList.add("show_all_accounts=" + showAllAccountsAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountSwitcherAction{", "}", 0, null, null, 56, null);
    }

    public final AccountSwitcherAction copy(SelectAccountAction select_account, DeeplinkAction deeplink, DismissAction dismiss, RefreshAction refresh, ShowAllAccountsAction show_all_accounts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountSwitcherAction(select_account, deeplink, dismiss, refresh, show_all_accounts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountSwitcherAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountSwitcherAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.account_switcher.proto.v1.AccountSwitcherAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountSwitcherAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SelectAccountAction.ADAPTER.encodedSizeWithTag(1, value.getSelect_account()) + DeeplinkAction.ADAPTER.encodedSizeWithTag(2, value.getDeeplink()) + DismissAction.ADAPTER.encodedSizeWithTag(3, value.getDismiss()) + RefreshAction.ADAPTER.encodedSizeWithTag(4, value.getRefresh()) + ShowAllAccountsAction.ADAPTER.encodedSizeWithTag(5, value.getShow_all_accounts());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountSwitcherAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SelectAccountAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelect_account());
                DeeplinkAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDeeplink());
                DismissAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getDismiss());
                RefreshAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getRefresh());
                ShowAllAccountsAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getShow_all_accounts());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountSwitcherAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ShowAllAccountsAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getShow_all_accounts());
                RefreshAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getRefresh());
                DismissAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getDismiss());
                DeeplinkAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDeeplink());
                SelectAccountAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelect_account());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountSwitcherAction redact(AccountSwitcherAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SelectAccountAction select_account = value.getSelect_account();
                SelectAccountAction selectAccountActionRedact = select_account != null ? SelectAccountAction.ADAPTER.redact(select_account) : null;
                DeeplinkAction deeplink = value.getDeeplink();
                DeeplinkAction deeplinkActionRedact = deeplink != null ? DeeplinkAction.ADAPTER.redact(deeplink) : null;
                DismissAction dismiss = value.getDismiss();
                DismissAction dismissActionRedact = dismiss != null ? DismissAction.ADAPTER.redact(dismiss) : null;
                RefreshAction refresh = value.getRefresh();
                RefreshAction refreshActionRedact = refresh != null ? RefreshAction.ADAPTER.redact(refresh) : null;
                ShowAllAccountsAction show_all_accounts = value.getShow_all_accounts();
                return value.copy(selectAccountActionRedact, deeplinkActionRedact, dismissActionRedact, refreshActionRedact, show_all_accounts != null ? ShowAllAccountsAction.ADAPTER.redact(show_all_accounts) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountSwitcherAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SelectAccountAction selectAccountActionDecode = null;
                DeeplinkAction deeplinkActionDecode = null;
                DismissAction dismissActionDecode = null;
                RefreshAction refreshActionDecode = null;
                ShowAllAccountsAction showAllAccountsActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountSwitcherAction(selectAccountActionDecode, deeplinkActionDecode, dismissActionDecode, refreshActionDecode, showAllAccountsActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        selectAccountActionDecode = SelectAccountAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        deeplinkActionDecode = DeeplinkAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        dismissActionDecode = DismissAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        refreshActionDecode = RefreshAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        showAllAccountsActionDecode = ShowAllAccountsAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
