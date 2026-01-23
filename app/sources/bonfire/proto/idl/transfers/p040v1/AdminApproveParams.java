package bonfire.proto.idl.transfers.p040v1;

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

/* compiled from: AdminApproveParams.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/transfers/v1/AdminApproveParams;", "Lcom/squareup/wire/Message;", "", "review_stage_id", "", "reason", "annotation", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getReview_stage_id", "()Ljava/lang/String;", "getReason", "getAnnotation", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdminApproveParams extends Message {

    @JvmField
    public static final ProtoAdapter<AdminApproveParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String annotation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "reviewStageId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String review_stage_id;

    public AdminApproveParams() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ AdminApproveParams(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9050newBuilder();
    }

    public final String getReview_stage_id() {
        return this.review_stage_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getAnnotation() {
        return this.annotation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminApproveParams(String review_stage_id, String reason, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(review_stage_id, "review_stage_id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.review_stage_id = review_stage_id;
        this.reason = reason;
        this.annotation = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9050newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdminApproveParams)) {
            return false;
        }
        AdminApproveParams adminApproveParams = (AdminApproveParams) other;
        return Intrinsics.areEqual(unknownFields(), adminApproveParams.unknownFields()) && Intrinsics.areEqual(this.review_stage_id, adminApproveParams.review_stage_id) && Intrinsics.areEqual(this.reason, adminApproveParams.reason) && Intrinsics.areEqual(this.annotation, adminApproveParams.annotation);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.review_stage_id.hashCode()) * 37) + this.reason.hashCode()) * 37;
        String str = this.annotation;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("review_stage_id=" + Internal.sanitize(this.review_stage_id));
        arrayList.add("reason=" + Internal.sanitize(this.reason));
        String str = this.annotation;
        if (str != null) {
            arrayList.add("annotation=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdminApproveParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdminApproveParams copy$default(AdminApproveParams adminApproveParams, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adminApproveParams.review_stage_id;
        }
        if ((i & 2) != 0) {
            str2 = adminApproveParams.reason;
        }
        if ((i & 4) != 0) {
            str3 = adminApproveParams.annotation;
        }
        if ((i & 8) != 0) {
            byteString = adminApproveParams.unknownFields();
        }
        return adminApproveParams.copy(str, str2, str3, byteString);
    }

    public final AdminApproveParams copy(String review_stage_id, String reason, String annotation, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(review_stage_id, "review_stage_id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdminApproveParams(review_stage_id, reason, annotation, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdminApproveParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdminApproveParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.transfers.v1.AdminApproveParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdminApproveParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getReview_stage_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getReview_stage_id());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getReason());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAnnotation());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdminApproveParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getReview_stage_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReview_stage_id());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReason());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAnnotation());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdminApproveParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getAnnotation());
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (Intrinsics.areEqual(value.getReview_stage_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getReview_stage_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdminApproveParams redact(AdminApproveParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdminApproveParams.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdminApproveParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdminApproveParams(strDecode, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
