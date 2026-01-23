package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModel;
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

/* compiled from: AccountCreationErrorViewModel.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;", "Lcom/squareup/wire/Message;", "", "default_error_message", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;", "timeout_error_message", "multi_timeout_error_message", "refresh_cta", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "contact_support_cta", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;Lokio/ByteString;)V", "getDefault_error_message", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;", "getTimeout_error_message", "getMulti_timeout_error_message", "getRefresh_cta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "getContact_support_cta", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "AccountCreationErrorMessage", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AccountCreationErrorViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<AccountCreationErrorViewModel> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationCta#ADAPTER", jsonName = "contactSupportCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AccountCreationCta contact_support_cta;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel$AccountCreationErrorMessage#ADAPTER", jsonName = "defaultErrorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AccountCreationErrorMessage default_error_message;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel$AccountCreationErrorMessage#ADAPTER", jsonName = "multiTimeoutErrorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountCreationErrorMessage multi_timeout_error_message;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationCta#ADAPTER", jsonName = "refreshCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AccountCreationCta refresh_cta;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel$AccountCreationErrorMessage#ADAPTER", jsonName = "timeoutErrorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountCreationErrorMessage timeout_error_message;

    public AccountCreationErrorViewModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8976newBuilder();
    }

    public final AccountCreationErrorMessage getDefault_error_message() {
        return this.default_error_message;
    }

    public final AccountCreationErrorMessage getTimeout_error_message() {
        return this.timeout_error_message;
    }

    public final AccountCreationErrorMessage getMulti_timeout_error_message() {
        return this.multi_timeout_error_message;
    }

    public final AccountCreationCta getRefresh_cta() {
        return this.refresh_cta;
    }

    public final AccountCreationCta getContact_support_cta() {
        return this.contact_support_cta;
    }

    public /* synthetic */ AccountCreationErrorViewModel(AccountCreationErrorMessage accountCreationErrorMessage, AccountCreationErrorMessage accountCreationErrorMessage2, AccountCreationErrorMessage accountCreationErrorMessage3, AccountCreationCta accountCreationCta, AccountCreationCta accountCreationCta2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountCreationErrorMessage, (i & 2) != 0 ? null : accountCreationErrorMessage2, (i & 4) != 0 ? null : accountCreationErrorMessage3, (i & 8) != 0 ? null : accountCreationCta, (i & 16) != 0 ? null : accountCreationCta2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCreationErrorViewModel(AccountCreationErrorMessage accountCreationErrorMessage, AccountCreationErrorMessage accountCreationErrorMessage2, AccountCreationErrorMessage accountCreationErrorMessage3, AccountCreationCta accountCreationCta, AccountCreationCta accountCreationCta2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.default_error_message = accountCreationErrorMessage;
        this.timeout_error_message = accountCreationErrorMessage2;
        this.multi_timeout_error_message = accountCreationErrorMessage3;
        this.refresh_cta = accountCreationCta;
        this.contact_support_cta = accountCreationCta2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8976newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountCreationErrorViewModel)) {
            return false;
        }
        AccountCreationErrorViewModel accountCreationErrorViewModel = (AccountCreationErrorViewModel) other;
        return Intrinsics.areEqual(unknownFields(), accountCreationErrorViewModel.unknownFields()) && Intrinsics.areEqual(this.default_error_message, accountCreationErrorViewModel.default_error_message) && Intrinsics.areEqual(this.timeout_error_message, accountCreationErrorViewModel.timeout_error_message) && Intrinsics.areEqual(this.multi_timeout_error_message, accountCreationErrorViewModel.multi_timeout_error_message) && Intrinsics.areEqual(this.refresh_cta, accountCreationErrorViewModel.refresh_cta) && Intrinsics.areEqual(this.contact_support_cta, accountCreationErrorViewModel.contact_support_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AccountCreationErrorMessage accountCreationErrorMessage = this.default_error_message;
        int iHashCode2 = (iHashCode + (accountCreationErrorMessage != null ? accountCreationErrorMessage.hashCode() : 0)) * 37;
        AccountCreationErrorMessage accountCreationErrorMessage2 = this.timeout_error_message;
        int iHashCode3 = (iHashCode2 + (accountCreationErrorMessage2 != null ? accountCreationErrorMessage2.hashCode() : 0)) * 37;
        AccountCreationErrorMessage accountCreationErrorMessage3 = this.multi_timeout_error_message;
        int iHashCode4 = (iHashCode3 + (accountCreationErrorMessage3 != null ? accountCreationErrorMessage3.hashCode() : 0)) * 37;
        AccountCreationCta accountCreationCta = this.refresh_cta;
        int iHashCode5 = (iHashCode4 + (accountCreationCta != null ? accountCreationCta.hashCode() : 0)) * 37;
        AccountCreationCta accountCreationCta2 = this.contact_support_cta;
        int iHashCode6 = iHashCode5 + (accountCreationCta2 != null ? accountCreationCta2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AccountCreationErrorMessage accountCreationErrorMessage = this.default_error_message;
        if (accountCreationErrorMessage != null) {
            arrayList.add("default_error_message=" + accountCreationErrorMessage);
        }
        AccountCreationErrorMessage accountCreationErrorMessage2 = this.timeout_error_message;
        if (accountCreationErrorMessage2 != null) {
            arrayList.add("timeout_error_message=" + accountCreationErrorMessage2);
        }
        AccountCreationErrorMessage accountCreationErrorMessage3 = this.multi_timeout_error_message;
        if (accountCreationErrorMessage3 != null) {
            arrayList.add("multi_timeout_error_message=" + accountCreationErrorMessage3);
        }
        AccountCreationCta accountCreationCta = this.refresh_cta;
        if (accountCreationCta != null) {
            arrayList.add("refresh_cta=" + accountCreationCta);
        }
        AccountCreationCta accountCreationCta2 = this.contact_support_cta;
        if (accountCreationCta2 != null) {
            arrayList.add("contact_support_cta=" + accountCreationCta2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountCreationErrorViewModel{", "}", 0, null, null, 56, null);
    }

    public final AccountCreationErrorViewModel copy(AccountCreationErrorMessage default_error_message, AccountCreationErrorMessage timeout_error_message, AccountCreationErrorMessage multi_timeout_error_message, AccountCreationCta refresh_cta, AccountCreationCta contact_support_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountCreationErrorViewModel(default_error_message, timeout_error_message, multi_timeout_error_message, refresh_cta, contact_support_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountCreationErrorViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountCreationErrorViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountCreationErrorViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDefault_error_message() != null) {
                    size += AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodedSizeWithTag(1, value.getDefault_error_message());
                }
                if (value.getTimeout_error_message() != null) {
                    size += AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodedSizeWithTag(2, value.getTimeout_error_message());
                }
                if (value.getMulti_timeout_error_message() != null) {
                    size += AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodedSizeWithTag(3, value.getMulti_timeout_error_message());
                }
                if (value.getRefresh_cta() != null) {
                    size += AccountCreationCta.ADAPTER.encodedSizeWithTag(4, value.getRefresh_cta());
                }
                return value.getContact_support_cta() != null ? size + AccountCreationCta.ADAPTER.encodedSizeWithTag(5, value.getContact_support_cta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountCreationErrorViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDefault_error_message() != null) {
                    AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodeWithTag(writer, 1, (int) value.getDefault_error_message());
                }
                if (value.getTimeout_error_message() != null) {
                    AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodeWithTag(writer, 2, (int) value.getTimeout_error_message());
                }
                if (value.getMulti_timeout_error_message() != null) {
                    AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodeWithTag(writer, 3, (int) value.getMulti_timeout_error_message());
                }
                if (value.getRefresh_cta() != null) {
                    AccountCreationCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getRefresh_cta());
                }
                if (value.getContact_support_cta() != null) {
                    AccountCreationCta.ADAPTER.encodeWithTag(writer, 5, (int) value.getContact_support_cta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountCreationErrorViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContact_support_cta() != null) {
                    AccountCreationCta.ADAPTER.encodeWithTag(writer, 5, (int) value.getContact_support_cta());
                }
                if (value.getRefresh_cta() != null) {
                    AccountCreationCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getRefresh_cta());
                }
                if (value.getMulti_timeout_error_message() != null) {
                    AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodeWithTag(writer, 3, (int) value.getMulti_timeout_error_message());
                }
                if (value.getTimeout_error_message() != null) {
                    AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodeWithTag(writer, 2, (int) value.getTimeout_error_message());
                }
                if (value.getDefault_error_message() != null) {
                    AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.encodeWithTag(writer, 1, (int) value.getDefault_error_message());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountCreationErrorViewModel redact(AccountCreationErrorViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AccountCreationErrorViewModel.AccountCreationErrorMessage default_error_message = value.getDefault_error_message();
                AccountCreationErrorViewModel.AccountCreationErrorMessage accountCreationErrorMessageRedact = default_error_message != null ? AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.redact(default_error_message) : null;
                AccountCreationErrorViewModel.AccountCreationErrorMessage timeout_error_message = value.getTimeout_error_message();
                AccountCreationErrorViewModel.AccountCreationErrorMessage accountCreationErrorMessageRedact2 = timeout_error_message != null ? AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.redact(timeout_error_message) : null;
                AccountCreationErrorViewModel.AccountCreationErrorMessage multi_timeout_error_message = value.getMulti_timeout_error_message();
                AccountCreationErrorViewModel.AccountCreationErrorMessage accountCreationErrorMessageRedact3 = multi_timeout_error_message != null ? AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.redact(multi_timeout_error_message) : null;
                AccountCreationCta refresh_cta = value.getRefresh_cta();
                AccountCreationCta accountCreationCtaRedact = refresh_cta != null ? AccountCreationCta.ADAPTER.redact(refresh_cta) : null;
                AccountCreationCta contact_support_cta = value.getContact_support_cta();
                return value.copy(accountCreationErrorMessageRedact, accountCreationErrorMessageRedact2, accountCreationErrorMessageRedact3, accountCreationCtaRedact, contact_support_cta != null ? AccountCreationCta.ADAPTER.redact(contact_support_cta) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountCreationErrorViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AccountCreationErrorViewModel.AccountCreationErrorMessage accountCreationErrorMessageDecode = null;
                AccountCreationErrorViewModel.AccountCreationErrorMessage accountCreationErrorMessageDecode2 = null;
                AccountCreationErrorViewModel.AccountCreationErrorMessage accountCreationErrorMessageDecode3 = null;
                AccountCreationCta accountCreationCtaDecode = null;
                AccountCreationCta accountCreationCtaDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountCreationErrorViewModel(accountCreationErrorMessageDecode, accountCreationErrorMessageDecode2, accountCreationErrorMessageDecode3, accountCreationCtaDecode, accountCreationCtaDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        accountCreationErrorMessageDecode = AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        accountCreationErrorMessageDecode2 = AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        accountCreationErrorMessageDecode3 = AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        accountCreationCtaDecode = AccountCreationCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        accountCreationCtaDecode2 = AccountCreationCta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: AccountCreationErrorViewModel.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountCreationErrorMessage extends Message {

        @JvmField
        public static final ProtoAdapter<AccountCreationErrorMessage> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String title;

        public AccountCreationErrorMessage() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ AccountCreationErrorMessage(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8977newBuilder();
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountCreationErrorMessage(String title, String subtitle, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = title;
            this.subtitle = subtitle;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8977newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AccountCreationErrorMessage)) {
                return false;
            }
            AccountCreationErrorMessage accountCreationErrorMessage = (AccountCreationErrorMessage) other;
            return Intrinsics.areEqual(unknownFields(), accountCreationErrorMessage.unknownFields()) && Intrinsics.areEqual(this.title, accountCreationErrorMessage.title) && Intrinsics.areEqual(this.subtitle, accountCreationErrorMessage.subtitle);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
            return CollectionsKt.joinToString$default(arrayList, ", ", "AccountCreationErrorMessage{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AccountCreationErrorMessage copy$default(AccountCreationErrorMessage accountCreationErrorMessage, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountCreationErrorMessage.title;
            }
            if ((i & 2) != 0) {
                str2 = accountCreationErrorMessage.subtitle;
            }
            if ((i & 4) != 0) {
                byteString = accountCreationErrorMessage.unknownFields();
            }
            return accountCreationErrorMessage.copy(str, str2, byteString);
        }

        public final AccountCreationErrorMessage copy(String title, String subtitle, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AccountCreationErrorMessage(title, subtitle, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountCreationErrorMessage.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AccountCreationErrorMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel$AccountCreationErrorMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AccountCreationErrorViewModel.AccountCreationErrorMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                    }
                    return !Intrinsics.areEqual(value.getSubtitle(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AccountCreationErrorViewModel.AccountCreationErrorMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AccountCreationErrorViewModel.AccountCreationErrorMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                    }
                    if (Intrinsics.areEqual(value.getTitle(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AccountCreationErrorViewModel.AccountCreationErrorMessage redact(AccountCreationErrorViewModel.AccountCreationErrorMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return AccountCreationErrorViewModel.AccountCreationErrorMessage.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public AccountCreationErrorViewModel.AccountCreationErrorMessage decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AccountCreationErrorViewModel.AccountCreationErrorMessage(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
