package bonfire.proto.idl.accounts.p028v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: AccountNumbersResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/AccountNumbersResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "contents", "", "Lrh_server_driven_ui/v1/UIComponent;", "contents_masked", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getContents", "()Ljava/util/List;", "getContents_masked", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AccountNumbersResponse extends Message {

    @JvmField
    public static final ProtoAdapter<AccountNumbersResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<UIComponent> contents;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "contentsMasked", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<UIComponent> contents_masked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public AccountNumbersResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8715newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ AccountNumbersResponse(String str, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountNumbersResponse(String title, List<UIComponent> contents, List<UIComponent> contents_masked, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(contents_masked, "contents_masked");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.contents = Internal.immutableCopyOf("contents", contents);
        this.contents_masked = Internal.immutableCopyOf("contents_masked", contents_masked);
    }

    public final List<UIComponent> getContents() {
        return this.contents;
    }

    public final List<UIComponent> getContents_masked() {
        return this.contents_masked;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8715newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountNumbersResponse)) {
            return false;
        }
        AccountNumbersResponse accountNumbersResponse = (AccountNumbersResponse) other;
        return Intrinsics.areEqual(unknownFields(), accountNumbersResponse.unknownFields()) && Intrinsics.areEqual(this.title, accountNumbersResponse.title) && Intrinsics.areEqual(this.contents, accountNumbersResponse.contents) && Intrinsics.areEqual(this.contents_masked, accountNumbersResponse.contents_masked);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.contents.hashCode()) * 37) + this.contents_masked.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.contents.isEmpty()) {
            arrayList.add("contents=" + this.contents);
        }
        if (!this.contents_masked.isEmpty()) {
            arrayList.add("contents_masked=" + this.contents_masked);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountNumbersResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountNumbersResponse copy$default(AccountNumbersResponse accountNumbersResponse, String str, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountNumbersResponse.title;
        }
        if ((i & 2) != 0) {
            list = accountNumbersResponse.contents;
        }
        if ((i & 4) != 0) {
            list2 = accountNumbersResponse.contents_masked;
        }
        if ((i & 8) != 0) {
            byteString = accountNumbersResponse.unknownFields();
        }
        return accountNumbersResponse.copy(str, list, list2, byteString);
    }

    public final AccountNumbersResponse copy(String title, List<UIComponent> contents, List<UIComponent> contents_masked, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(contents_masked, "contents_masked");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountNumbersResponse(title, contents, contents_masked, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountNumbersResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountNumbersResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.AccountNumbersResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountNumbersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getContents()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getContents_masked());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountNumbersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getContents());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getContents_masked());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountNumbersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getContents_masked());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getContents());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountNumbersResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountNumbersResponse(strDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(UIComponent.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(UIComponent.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountNumbersResponse redact(AccountNumbersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<UIComponent> contents = value.getContents();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                return AccountNumbersResponse.copy$default(value, null, Internal.m26823redactElements(contents, protoAdapter), Internal.m26823redactElements(value.getContents_masked(), protoAdapter), ByteString.EMPTY, 1, null);
            }
        };
    }
}
