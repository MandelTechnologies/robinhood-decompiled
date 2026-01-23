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

/* compiled from: AccountCreationLoadingViewModel.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModel;", "Lcom/squareup/wire/Message;", "", "body_text", "", "title_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getBody_text", "()Ljava/lang/String;", "getTitle_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AccountCreationLoadingViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<AccountCreationLoadingViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bodyText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String body_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title_text;

    public AccountCreationLoadingViewModel() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ AccountCreationLoadingViewModel(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8979newBuilder();
    }

    public final String getBody_text() {
        return this.body_text;
    }

    public final String getTitle_text() {
        return this.title_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCreationLoadingViewModel(String body_text, String title_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(body_text, "body_text");
        Intrinsics.checkNotNullParameter(title_text, "title_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body_text = body_text;
        this.title_text = title_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8979newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountCreationLoadingViewModel)) {
            return false;
        }
        AccountCreationLoadingViewModel accountCreationLoadingViewModel = (AccountCreationLoadingViewModel) other;
        return Intrinsics.areEqual(unknownFields(), accountCreationLoadingViewModel.unknownFields()) && Intrinsics.areEqual(this.body_text, accountCreationLoadingViewModel.body_text) && Intrinsics.areEqual(this.title_text, accountCreationLoadingViewModel.title_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.body_text.hashCode()) * 37) + this.title_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("body_text=" + Internal.sanitize(this.body_text));
        arrayList.add("title_text=" + Internal.sanitize(this.title_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountCreationLoadingViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountCreationLoadingViewModel copy$default(AccountCreationLoadingViewModel accountCreationLoadingViewModel, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountCreationLoadingViewModel.body_text;
        }
        if ((i & 2) != 0) {
            str2 = accountCreationLoadingViewModel.title_text;
        }
        if ((i & 4) != 0) {
            byteString = accountCreationLoadingViewModel.unknownFields();
        }
        return accountCreationLoadingViewModel.copy(str, str2, byteString);
    }

    public final AccountCreationLoadingViewModel copy(String body_text, String title_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(body_text, "body_text");
        Intrinsics.checkNotNullParameter(title_text, "title_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountCreationLoadingViewModel(body_text, title_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountCreationLoadingViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountCreationLoadingViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationLoadingViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountCreationLoadingViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBody_text());
                }
                return !Intrinsics.areEqual(value.getTitle_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountCreationLoadingViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody_text());
                }
                if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountCreationLoadingViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle_text());
                }
                if (Intrinsics.areEqual(value.getBody_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountCreationLoadingViewModel redact(AccountCreationLoadingViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AccountCreationLoadingViewModel.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountCreationLoadingViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountCreationLoadingViewModel(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
