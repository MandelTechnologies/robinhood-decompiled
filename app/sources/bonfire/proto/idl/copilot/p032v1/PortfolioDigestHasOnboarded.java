package bonfire.proto.idl.copilot.p032v1;

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

/* compiled from: PortfolioDigestHasOnboarded.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreview;", ErrorResponse.DETAIL, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreview;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;Lokio/ByteString;)V", "getPreview", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreview;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PortfolioDigestHasOnboarded extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioDigestHasOnboarded> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestDetail#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PortfolioDigestDetail detail;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestPreview#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PortfolioDigestPreview preview;

    public PortfolioDigestHasOnboarded() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8884newBuilder();
    }

    public final PortfolioDigestPreview getPreview() {
        return this.preview;
    }

    public final PortfolioDigestDetail getDetail() {
        return this.detail;
    }

    public /* synthetic */ PortfolioDigestHasOnboarded(PortfolioDigestPreview portfolioDigestPreview, PortfolioDigestDetail portfolioDigestDetail, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : portfolioDigestPreview, (i & 2) != 0 ? null : portfolioDigestDetail, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestHasOnboarded(PortfolioDigestPreview portfolioDigestPreview, PortfolioDigestDetail portfolioDigestDetail, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.preview = portfolioDigestPreview;
        this.detail = portfolioDigestDetail;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8884newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioDigestHasOnboarded)) {
            return false;
        }
        PortfolioDigestHasOnboarded portfolioDigestHasOnboarded = (PortfolioDigestHasOnboarded) other;
        return Intrinsics.areEqual(unknownFields(), portfolioDigestHasOnboarded.unknownFields()) && Intrinsics.areEqual(this.preview, portfolioDigestHasOnboarded.preview) && Intrinsics.areEqual(this.detail, portfolioDigestHasOnboarded.detail);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PortfolioDigestPreview portfolioDigestPreview = this.preview;
        int iHashCode2 = (iHashCode + (portfolioDigestPreview != null ? portfolioDigestPreview.hashCode() : 0)) * 37;
        PortfolioDigestDetail portfolioDigestDetail = this.detail;
        int iHashCode3 = iHashCode2 + (portfolioDigestDetail != null ? portfolioDigestDetail.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PortfolioDigestPreview portfolioDigestPreview = this.preview;
        if (portfolioDigestPreview != null) {
            arrayList.add("preview=" + portfolioDigestPreview);
        }
        PortfolioDigestDetail portfolioDigestDetail = this.detail;
        if (portfolioDigestDetail != null) {
            arrayList.add("detail=" + portfolioDigestDetail);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioDigestHasOnboarded{", "}", 0, null, null, 56, null);
    }

    public final PortfolioDigestHasOnboarded copy(PortfolioDigestPreview preview, PortfolioDigestDetail detail, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioDigestHasOnboarded(preview, detail, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestHasOnboarded.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioDigestHasOnboarded>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestHasOnboarded$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioDigestHasOnboarded value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPreview() != null) {
                    size += PortfolioDigestPreview.ADAPTER.encodedSizeWithTag(1, value.getPreview());
                }
                return value.getDetail() != null ? size + PortfolioDigestDetail.ADAPTER.encodedSizeWithTag(2, value.getDetail()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioDigestHasOnboarded value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPreview() != null) {
                    PortfolioDigestPreview.ADAPTER.encodeWithTag(writer, 1, (int) value.getPreview());
                }
                if (value.getDetail() != null) {
                    PortfolioDigestDetail.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetail());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioDigestHasOnboarded value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDetail() != null) {
                    PortfolioDigestDetail.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetail());
                }
                if (value.getPreview() != null) {
                    PortfolioDigestPreview.ADAPTER.encodeWithTag(writer, 1, (int) value.getPreview());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestHasOnboarded redact(PortfolioDigestHasOnboarded value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PortfolioDigestPreview preview = value.getPreview();
                PortfolioDigestPreview portfolioDigestPreviewRedact = preview != null ? PortfolioDigestPreview.ADAPTER.redact(preview) : null;
                PortfolioDigestDetail detail = value.getDetail();
                return value.copy(portfolioDigestPreviewRedact, detail != null ? PortfolioDigestDetail.ADAPTER.redact(detail) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestHasOnboarded decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PortfolioDigestPreview portfolioDigestPreviewDecode = null;
                PortfolioDigestDetail portfolioDigestDetailDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioDigestHasOnboarded(portfolioDigestPreviewDecode, portfolioDigestDetailDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        portfolioDigestPreviewDecode = PortfolioDigestPreview.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        portfolioDigestDetailDecode = PortfolioDigestDetail.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
