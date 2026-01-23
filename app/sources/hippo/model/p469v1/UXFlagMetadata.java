package hippo.model.p469v1;

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

/* compiled from: UXFlagMetadata.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J0\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lhippo/model/v1/UXFlagMetadata;", "Lcom/squareup/wire/Message;", "", "client_platforms", "", "Lhippo/model/v1/ClientPlatform;", "account_numbers", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getClient_platforms", "()Ljava/util/List;", "getAccount_numbers", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class UXFlagMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<UXFlagMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumbers", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> account_numbers;

    @WireField(adapter = "hippo.model.v1.ClientPlatform#ADAPTER", jsonName = "clientPlatforms", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<ClientPlatform> client_platforms;

    public UXFlagMetadata() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28258newBuilder();
    }

    public /* synthetic */ UXFlagMetadata(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UXFlagMetadata(List<? extends ClientPlatform> client_platforms, List<String> account_numbers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(client_platforms, "client_platforms");
        Intrinsics.checkNotNullParameter(account_numbers, "account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.client_platforms = Internal.immutableCopyOf("client_platforms", client_platforms);
        this.account_numbers = Internal.immutableCopyOf("account_numbers", account_numbers);
    }

    public final List<ClientPlatform> getClient_platforms() {
        return this.client_platforms;
    }

    public final List<String> getAccount_numbers() {
        return this.account_numbers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28258newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UXFlagMetadata)) {
            return false;
        }
        UXFlagMetadata uXFlagMetadata = (UXFlagMetadata) other;
        return Intrinsics.areEqual(unknownFields(), uXFlagMetadata.unknownFields()) && Intrinsics.areEqual(this.client_platforms, uXFlagMetadata.client_platforms) && Intrinsics.areEqual(this.account_numbers, uXFlagMetadata.account_numbers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.client_platforms.hashCode()) * 37) + this.account_numbers.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.client_platforms.isEmpty()) {
            arrayList.add("client_platforms=" + this.client_platforms);
        }
        if (!this.account_numbers.isEmpty()) {
            arrayList.add("account_numbers=" + Internal.sanitize(this.account_numbers));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UXFlagMetadata{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UXFlagMetadata copy$default(UXFlagMetadata uXFlagMetadata, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uXFlagMetadata.client_platforms;
        }
        if ((i & 2) != 0) {
            list2 = uXFlagMetadata.account_numbers;
        }
        if ((i & 4) != 0) {
            byteString = uXFlagMetadata.unknownFields();
        }
        return uXFlagMetadata.copy(list, list2, byteString);
    }

    public final UXFlagMetadata copy(List<? extends ClientPlatform> client_platforms, List<String> account_numbers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(client_platforms, "client_platforms");
        Intrinsics.checkNotNullParameter(account_numbers, "account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UXFlagMetadata(client_platforms, account_numbers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UXFlagMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UXFlagMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.UXFlagMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UXFlagMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ClientPlatform.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getClient_platforms()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getAccount_numbers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UXFlagMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ClientPlatform.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getClient_platforms());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getAccount_numbers());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UXFlagMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getAccount_numbers());
                ClientPlatform.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getClient_platforms());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UXFlagMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UXFlagMetadata(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            ClientPlatform.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UXFlagMetadata redact(UXFlagMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UXFlagMetadata.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
