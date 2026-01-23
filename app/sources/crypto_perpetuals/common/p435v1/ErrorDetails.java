package crypto_perpetuals.common.p435v1;

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

/* compiled from: ErrorDetails.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J@\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/ErrorDetails;", "Lcom/squareup/wire/Message;", "", "title", "", "message", "debug_info", "ctas", "", "Lcrypto_perpetuals/common/v1/CTA;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDebug_info", "getCtas", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ErrorDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ErrorDetails> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.CTA#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<CTA> ctas;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "debugInfo", schemaIndex = 2, tag = 3)
    private final String debug_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ErrorDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ErrorDetails(String str, String str2, String str3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27811newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getDebug_info() {
        return this.debug_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorDetails(String title, String message, String str, List<CTA> ctas, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctas, "ctas");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.message = message;
        this.debug_info = str;
        this.ctas = Internal.immutableCopyOf("ctas", ctas);
    }

    public final List<CTA> getCtas() {
        return this.ctas;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27811newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ErrorDetails)) {
            return false;
        }
        ErrorDetails errorDetails = (ErrorDetails) other;
        return Intrinsics.areEqual(unknownFields(), errorDetails.unknownFields()) && Intrinsics.areEqual(this.title, errorDetails.title) && Intrinsics.areEqual(this.message, errorDetails.message) && Intrinsics.areEqual(this.debug_info, errorDetails.debug_info) && Intrinsics.areEqual(this.ctas, errorDetails.ctas);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.message.hashCode()) * 37;
        String str = this.debug_info;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.ctas.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("message=" + Internal.sanitize(this.message));
        String str = this.debug_info;
        if (str != null) {
            arrayList.add("debug_info=" + Internal.sanitize(str));
        }
        if (!this.ctas.isEmpty()) {
            arrayList.add("ctas=" + this.ctas);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ErrorDetails copy$default(ErrorDetails errorDetails, String str, String str2, String str3, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = errorDetails.message;
        }
        if ((i & 4) != 0) {
            str3 = errorDetails.debug_info;
        }
        if ((i & 8) != 0) {
            list = errorDetails.ctas;
        }
        if ((i & 16) != 0) {
            byteString = errorDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return errorDetails.copy(str, str2, str4, list, byteString2);
    }

    public final ErrorDetails copy(String title, String message, String debug_info, List<CTA> ctas, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctas, "ctas");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ErrorDetails(title, message, debug_info, ctas, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ErrorDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.ErrorDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ErrorDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDebug_info()) + CTA.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getCtas());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ErrorDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDebug_info());
                CTA.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getCtas());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ErrorDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CTA.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getCtas());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDebug_info());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getMessage());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ErrorDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ErrorDetails(strDecode, strDecode3, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(CTA.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ErrorDetails redact(ErrorDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ErrorDetails.copy$default(value, null, null, null, Internal.m26823redactElements(value.getCtas(), CTA.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }
}
