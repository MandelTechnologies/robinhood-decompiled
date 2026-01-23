package billy_mays.service.p023v1;

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

/* compiled from: DepositBoostInformation.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lbilly_mays/service/v1/DepositBoostInformation;", "Lcom/squareup/wire/Message;", "", "zero_state_content", "", "formattable_content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getZero_state_content", "()Ljava/lang/String;", "getFormattable_content", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class DepositBoostInformation extends Message {

    @JvmField
    public static final ProtoAdapter<DepositBoostInformation> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "formattableContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String formattable_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "zeroStateContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String zero_state_content;

    public DepositBoostInformation() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DepositBoostInformation(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8545newBuilder();
    }

    public final String getZero_state_content() {
        return this.zero_state_content;
    }

    public final String getFormattable_content() {
        return this.formattable_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositBoostInformation(String zero_state_content, String formattable_content, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(zero_state_content, "zero_state_content");
        Intrinsics.checkNotNullParameter(formattable_content, "formattable_content");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.zero_state_content = zero_state_content;
        this.formattable_content = formattable_content;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8545newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositBoostInformation)) {
            return false;
        }
        DepositBoostInformation depositBoostInformation = (DepositBoostInformation) other;
        return Intrinsics.areEqual(unknownFields(), depositBoostInformation.unknownFields()) && Intrinsics.areEqual(this.zero_state_content, depositBoostInformation.zero_state_content) && Intrinsics.areEqual(this.formattable_content, depositBoostInformation.formattable_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.zero_state_content.hashCode()) * 37) + this.formattable_content.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("zero_state_content=" + Internal.sanitize(this.zero_state_content));
        arrayList.add("formattable_content=" + Internal.sanitize(this.formattable_content));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositBoostInformation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositBoostInformation copy$default(DepositBoostInformation depositBoostInformation, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositBoostInformation.zero_state_content;
        }
        if ((i & 2) != 0) {
            str2 = depositBoostInformation.formattable_content;
        }
        if ((i & 4) != 0) {
            byteString = depositBoostInformation.unknownFields();
        }
        return depositBoostInformation.copy(str, str2, byteString);
    }

    public final DepositBoostInformation copy(String zero_state_content, String formattable_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(zero_state_content, "zero_state_content");
        Intrinsics.checkNotNullParameter(formattable_content, "formattable_content");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositBoostInformation(zero_state_content, formattable_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositBoostInformation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositBoostInformation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: billy_mays.service.v1.DepositBoostInformation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositBoostInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getZero_state_content(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getZero_state_content());
                }
                return !Intrinsics.areEqual(value.getFormattable_content(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFormattable_content()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositBoostInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getZero_state_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getZero_state_content());
                }
                if (!Intrinsics.areEqual(value.getFormattable_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFormattable_content());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositBoostInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFormattable_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFormattable_content());
                }
                if (Intrinsics.areEqual(value.getZero_state_content(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getZero_state_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositBoostInformation redact(DepositBoostInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DepositBoostInformation.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DepositBoostInformation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DepositBoostInformation(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
