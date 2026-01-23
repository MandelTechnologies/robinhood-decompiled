package crypto.fee_tier.proto.p434v1;

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

/* compiled from: LaunchFeeTierUpsellBottomSheetRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class LaunchFeeTierUpsellBottomSheetRequest extends Message {

    @JvmField
    public static final ProtoAdapter<LaunchFeeTierUpsellBottomSheetRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 0, tag = 1)
    private final String account_id;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchFeeTierUpsellBottomSheetRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27790newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ LaunchFeeTierUpsellBottomSheetRequest(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchFeeTierUpsellBottomSheetRequest(String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27790newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LaunchFeeTierUpsellBottomSheetRequest)) {
            return false;
        }
        LaunchFeeTierUpsellBottomSheetRequest launchFeeTierUpsellBottomSheetRequest = (LaunchFeeTierUpsellBottomSheetRequest) other;
        return Intrinsics.areEqual(unknownFields(), launchFeeTierUpsellBottomSheetRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, launchFeeTierUpsellBottomSheetRequest.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.account_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.account_id;
        if (str != null) {
            arrayList.add("account_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LaunchFeeTierUpsellBottomSheetRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LaunchFeeTierUpsellBottomSheetRequest copy$default(LaunchFeeTierUpsellBottomSheetRequest launchFeeTierUpsellBottomSheetRequest, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = launchFeeTierUpsellBottomSheetRequest.account_id;
        }
        if ((i & 2) != 0) {
            byteString = launchFeeTierUpsellBottomSheetRequest.unknownFields();
        }
        return launchFeeTierUpsellBottomSheetRequest.copy(str, byteString);
    }

    public final LaunchFeeTierUpsellBottomSheetRequest copy(String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LaunchFeeTierUpsellBottomSheetRequest(account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LaunchFeeTierUpsellBottomSheetRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LaunchFeeTierUpsellBottomSheetRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.LaunchFeeTierUpsellBottomSheetRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LaunchFeeTierUpsellBottomSheetRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LaunchFeeTierUpsellBottomSheetRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LaunchFeeTierUpsellBottomSheetRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LaunchFeeTierUpsellBottomSheetRequest redact(LaunchFeeTierUpsellBottomSheetRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LaunchFeeTierUpsellBottomSheetRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LaunchFeeTierUpsellBottomSheetRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LaunchFeeTierUpsellBottomSheetRequest(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
