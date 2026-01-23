package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ErrorResponse;
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

/* compiled from: DigestV2.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J2\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestV2;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lcom/robinhood/copilot/proto/v1/DigestV2Preview;", ErrorResponse.DETAIL, "Lcom/robinhood/copilot/proto/v1/DigestV2Detail;", "digest_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/copilot/proto/v1/DigestV2Preview;Lcom/robinhood/copilot/proto/v1/DigestV2Detail;Ljava/lang/String;Lokio/ByteString;)V", "getPreview", "()Lcom/robinhood/copilot/proto/v1/DigestV2Preview;", "getDetail", "()Lcom/robinhood/copilot/proto/v1/DigestV2Detail;", "getDigest_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class DigestV2 extends Message {

    @JvmField
    public static final ProtoAdapter<DigestV2> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestV2Detail#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final DigestV2Detail detail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String digest_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestV2Preview#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DigestV2Preview preview;

    public DigestV2() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22093newBuilder();
    }

    public final DigestV2Preview getPreview() {
        return this.preview;
    }

    public final DigestV2Detail getDetail() {
        return this.detail;
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public /* synthetic */ DigestV2(DigestV2Preview digestV2Preview, DigestV2Detail digestV2Detail, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : digestV2Preview, (i & 2) != 0 ? null : digestV2Detail, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestV2(DigestV2Preview digestV2Preview, DigestV2Detail digestV2Detail, String digest_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.preview = digestV2Preview;
        this.detail = digestV2Detail;
        this.digest_id = digest_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22093newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DigestV2)) {
            return false;
        }
        DigestV2 digestV2 = (DigestV2) other;
        return Intrinsics.areEqual(unknownFields(), digestV2.unknownFields()) && Intrinsics.areEqual(this.preview, digestV2.preview) && Intrinsics.areEqual(this.detail, digestV2.detail) && Intrinsics.areEqual(this.digest_id, digestV2.digest_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DigestV2Preview digestV2Preview = this.preview;
        int iHashCode2 = (iHashCode + (digestV2Preview != null ? digestV2Preview.hashCode() : 0)) * 37;
        DigestV2Detail digestV2Detail = this.detail;
        int iHashCode3 = ((iHashCode2 + (digestV2Detail != null ? digestV2Detail.hashCode() : 0)) * 37) + this.digest_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DigestV2Preview digestV2Preview = this.preview;
        if (digestV2Preview != null) {
            arrayList.add("preview=" + digestV2Preview);
        }
        DigestV2Detail digestV2Detail = this.detail;
        if (digestV2Detail != null) {
            arrayList.add("detail=" + digestV2Detail);
        }
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigestV2{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DigestV2 copy$default(DigestV2 digestV2, DigestV2Preview digestV2Preview, DigestV2Detail digestV2Detail, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            digestV2Preview = digestV2.preview;
        }
        if ((i & 2) != 0) {
            digestV2Detail = digestV2.detail;
        }
        if ((i & 4) != 0) {
            str = digestV2.digest_id;
        }
        if ((i & 8) != 0) {
            byteString = digestV2.unknownFields();
        }
        return digestV2.copy(digestV2Preview, digestV2Detail, str, byteString);
    }

    public final DigestV2 copy(DigestV2Preview preview, DigestV2Detail detail, String digest_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DigestV2(preview, detail, digest_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestV2.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DigestV2>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.DigestV2$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DigestV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPreview() != null) {
                    size += DigestV2Preview.ADAPTER.encodedSizeWithTag(1, value.getPreview());
                }
                if (value.getDetail() != null) {
                    size += DigestV2Detail.ADAPTER.encodedSizeWithTag(2, value.getDetail());
                }
                return !Intrinsics.areEqual(value.getDigest_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDigest_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DigestV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPreview() != null) {
                    DigestV2Preview.ADAPTER.encodeWithTag(writer, 1, (int) value.getPreview());
                }
                if (value.getDetail() != null) {
                    DigestV2Detail.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetail());
                }
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDigest_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DigestV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDigest_id());
                }
                if (value.getDetail() != null) {
                    DigestV2Detail.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetail());
                }
                if (value.getPreview() != null) {
                    DigestV2Preview.ADAPTER.encodeWithTag(writer, 1, (int) value.getPreview());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DigestV2 redact(DigestV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DigestV2Preview preview = value.getPreview();
                DigestV2Preview digestV2PreviewRedact = preview != null ? DigestV2Preview.ADAPTER.redact(preview) : null;
                DigestV2Detail detail = value.getDetail();
                return DigestV2.copy$default(value, digestV2PreviewRedact, detail != null ? DigestV2Detail.ADAPTER.redact(detail) : null, null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DigestV2 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DigestV2Preview digestV2PreviewDecode = null;
                String strDecode = "";
                DigestV2Detail digestV2DetailDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DigestV2(digestV2PreviewDecode, digestV2DetailDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        digestV2PreviewDecode = DigestV2Preview.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        digestV2DetailDecode = DigestV2Detail.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
