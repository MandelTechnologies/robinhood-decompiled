package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

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

/* compiled from: AccountCreationSuccessViewModel.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B=\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "Lcom/squareup/wire/Message;", "", "", "title_text", "body_text", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "continue_cta", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplink;", "continue_cta_v2", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplink;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplink;Lokio/ByteString;)Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "Ljava/lang/String;", "getTitle_text", "getBody_text", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "getContinue_cta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "getContinue_cta$annotations", "()V", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplink;", "getContinue_cta_v2", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplink;", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AccountCreationSuccessViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<AccountCreationSuccessViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bodyText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String body_text;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationCta#ADAPTER", jsonName = "continueCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountCreationCta continue_cta;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationCtaWithDeeplink#ADAPTER", jsonName = "continueCtaV2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AccountCreationCtaWithDeeplink continue_cta_v2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title_text;

    public AccountCreationSuccessViewModel() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ AccountCreationSuccessViewModel(String str, String str2, AccountCreationCta accountCreationCta, AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplink, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : accountCreationCta, (i & 8) != 0 ? null : accountCreationCtaWithDeeplink, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8981newBuilder();
    }

    public final String getTitle_text() {
        return this.title_text;
    }

    public final String getBody_text() {
        return this.body_text;
    }

    public final AccountCreationCta getContinue_cta() {
        return this.continue_cta;
    }

    public final AccountCreationCtaWithDeeplink getContinue_cta_v2() {
        return this.continue_cta_v2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCreationSuccessViewModel(String title_text, String body_text, AccountCreationCta accountCreationCta, AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplink, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title_text, "title_text");
        Intrinsics.checkNotNullParameter(body_text, "body_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title_text = title_text;
        this.body_text = body_text;
        this.continue_cta = accountCreationCta;
        this.continue_cta_v2 = accountCreationCtaWithDeeplink;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8981newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountCreationSuccessViewModel)) {
            return false;
        }
        AccountCreationSuccessViewModel accountCreationSuccessViewModel = (AccountCreationSuccessViewModel) other;
        return Intrinsics.areEqual(unknownFields(), accountCreationSuccessViewModel.unknownFields()) && Intrinsics.areEqual(this.title_text, accountCreationSuccessViewModel.title_text) && Intrinsics.areEqual(this.body_text, accountCreationSuccessViewModel.body_text) && Intrinsics.areEqual(this.continue_cta, accountCreationSuccessViewModel.continue_cta) && Intrinsics.areEqual(this.continue_cta_v2, accountCreationSuccessViewModel.continue_cta_v2);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title_text.hashCode()) * 37) + this.body_text.hashCode()) * 37;
        AccountCreationCta accountCreationCta = this.continue_cta;
        int iHashCode2 = (iHashCode + (accountCreationCta != null ? accountCreationCta.hashCode() : 0)) * 37;
        AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplink = this.continue_cta_v2;
        int iHashCode3 = iHashCode2 + (accountCreationCtaWithDeeplink != null ? accountCreationCtaWithDeeplink.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title_text=" + Internal.sanitize(this.title_text));
        arrayList.add("body_text=" + Internal.sanitize(this.body_text));
        AccountCreationCta accountCreationCta = this.continue_cta;
        if (accountCreationCta != null) {
            arrayList.add("continue_cta=" + accountCreationCta);
        }
        AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplink = this.continue_cta_v2;
        if (accountCreationCtaWithDeeplink != null) {
            arrayList.add("continue_cta_v2=" + accountCreationCtaWithDeeplink);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountCreationSuccessViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountCreationSuccessViewModel copy$default(AccountCreationSuccessViewModel accountCreationSuccessViewModel, String str, String str2, AccountCreationCta accountCreationCta, AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplink, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountCreationSuccessViewModel.title_text;
        }
        if ((i & 2) != 0) {
            str2 = accountCreationSuccessViewModel.body_text;
        }
        if ((i & 4) != 0) {
            accountCreationCta = accountCreationSuccessViewModel.continue_cta;
        }
        if ((i & 8) != 0) {
            accountCreationCtaWithDeeplink = accountCreationSuccessViewModel.continue_cta_v2;
        }
        if ((i & 16) != 0) {
            byteString = accountCreationSuccessViewModel.unknownFields();
        }
        ByteString byteString2 = byteString;
        AccountCreationCta accountCreationCta2 = accountCreationCta;
        return accountCreationSuccessViewModel.copy(str, str2, accountCreationCta2, accountCreationCtaWithDeeplink, byteString2);
    }

    public final AccountCreationSuccessViewModel copy(String title_text, String body_text, AccountCreationCta continue_cta, AccountCreationCtaWithDeeplink continue_cta_v2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title_text, "title_text");
        Intrinsics.checkNotNullParameter(body_text, "body_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountCreationSuccessViewModel(title_text, body_text, continue_cta, continue_cta_v2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountCreationSuccessViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountCreationSuccessViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountCreationSuccessViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle_text());
                }
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBody_text());
                }
                if (value.getContinue_cta() != null) {
                    size += AccountCreationCta.ADAPTER.encodedSizeWithTag(3, value.getContinue_cta());
                }
                return value.getContinue_cta_v2() != null ? size + AccountCreationCtaWithDeeplink.ADAPTER.encodedSizeWithTag(4, value.getContinue_cta_v2()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountCreationSuccessViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle_text());
                }
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody_text());
                }
                if (value.getContinue_cta() != null) {
                    AccountCreationCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getContinue_cta());
                }
                if (value.getContinue_cta_v2() != null) {
                    AccountCreationCtaWithDeeplink.ADAPTER.encodeWithTag(writer, 4, (int) value.getContinue_cta_v2());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountCreationSuccessViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContinue_cta_v2() != null) {
                    AccountCreationCtaWithDeeplink.ADAPTER.encodeWithTag(writer, 4, (int) value.getContinue_cta_v2());
                }
                if (value.getContinue_cta() != null) {
                    AccountCreationCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getContinue_cta());
                }
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody_text());
                }
                if (Intrinsics.areEqual(value.getTitle_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountCreationSuccessViewModel redact(AccountCreationSuccessViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AccountCreationCta continue_cta = value.getContinue_cta();
                AccountCreationCta accountCreationCtaRedact = continue_cta != null ? AccountCreationCta.ADAPTER.redact(continue_cta) : null;
                AccountCreationCtaWithDeeplink continue_cta_v2 = value.getContinue_cta_v2();
                return AccountCreationSuccessViewModel.copy$default(value, null, null, accountCreationCtaRedact, continue_cta_v2 != null ? AccountCreationCtaWithDeeplink.ADAPTER.redact(continue_cta_v2) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountCreationSuccessViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AccountCreationCta accountCreationCtaDecode = null;
                AccountCreationCtaWithDeeplink accountCreationCtaWithDeeplinkDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountCreationSuccessViewModel(strDecode, strDecode2, accountCreationCtaDecode, accountCreationCtaWithDeeplinkDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        accountCreationCtaDecode = AccountCreationCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        accountCreationCtaWithDeeplinkDecode = AccountCreationCtaWithDeeplink.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
