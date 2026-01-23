package rosetta.portfolio.p541v1;

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

/* compiled from: RealizedGain.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lrosetta/portfolio/v1/RealizedGain;", "Lcom/squareup/wire/Message;", "", "span", "Lrosetta/portfolio/v1/Span;", "asset_class", "Lrosetta/portfolio/v1/AssetClass;", "realized_gain", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/portfolio/v1/Span;Lrosetta/portfolio/v1/AssetClass;Ljava/lang/String;Lokio/ByteString;)V", "getSpan", "()Lrosetta/portfolio/v1/Span;", "getAsset_class", "()Lrosetta/portfolio/v1/AssetClass;", "getRealized_gain", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RealizedGain extends Message {

    @JvmField
    public static final ProtoAdapter<RealizedGain> ADAPTER;

    @WireField(adapter = "rosetta.portfolio.v1.AssetClass#ADAPTER", jsonName = "assetClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AssetClass asset_class;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "realizedGain", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String realized_gain;

    @WireField(adapter = "rosetta.portfolio.v1.Span#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Span span;

    public RealizedGain() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29928newBuilder();
    }

    public final Span getSpan() {
        return this.span;
    }

    public /* synthetic */ RealizedGain(Span span, AssetClass assetClass, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Span.SPAN_UNSPECIFIED : span, (i & 2) != 0 ? AssetClass.ASSET_CLASS_UNSPECIFIED : assetClass, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AssetClass getAsset_class() {
        return this.asset_class;
    }

    public final String getRealized_gain() {
        return this.realized_gain;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealizedGain(Span span, AssetClass asset_class, String realized_gain, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(realized_gain, "realized_gain");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.span = span;
        this.asset_class = asset_class;
        this.realized_gain = realized_gain;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29928newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RealizedGain)) {
            return false;
        }
        RealizedGain realizedGain = (RealizedGain) other;
        return Intrinsics.areEqual(unknownFields(), realizedGain.unknownFields()) && this.span == realizedGain.span && this.asset_class == realizedGain.asset_class && Intrinsics.areEqual(this.realized_gain, realizedGain.realized_gain);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.span.hashCode()) * 37) + this.asset_class.hashCode()) * 37) + this.realized_gain.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("span=" + this.span);
        arrayList.add("asset_class=" + this.asset_class);
        arrayList.add("realized_gain=" + Internal.sanitize(this.realized_gain));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealizedGain{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RealizedGain copy$default(RealizedGain realizedGain, Span span, AssetClass assetClass, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            span = realizedGain.span;
        }
        if ((i & 2) != 0) {
            assetClass = realizedGain.asset_class;
        }
        if ((i & 4) != 0) {
            str = realizedGain.realized_gain;
        }
        if ((i & 8) != 0) {
            byteString = realizedGain.unknownFields();
        }
        return realizedGain.copy(span, assetClass, str, byteString);
    }

    public final RealizedGain copy(Span span, AssetClass asset_class, String realized_gain, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(realized_gain, "realized_gain");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RealizedGain(span, asset_class, realized_gain, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RealizedGain.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RealizedGain>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.portfolio.v1.RealizedGain$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RealizedGain value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    size += Span.ADAPTER.encodedSizeWithTag(1, value.getSpan());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    size += AssetClass.ADAPTER.encodedSizeWithTag(2, value.getAsset_class());
                }
                return !Intrinsics.areEqual(value.getRealized_gain(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRealized_gain()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RealizedGain value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getRealized_gain(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRealized_gain());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RealizedGain value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRealized_gain(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRealized_gain());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_class());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGain decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Span spanDecode = Span.SPAN_UNSPECIFIED;
                AssetClass assetClassDecode = AssetClass.ASSET_CLASS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RealizedGain(spanDecode, assetClassDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            spanDecode = Span.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            assetClassDecode = AssetClass.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGain redact(RealizedGain value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RealizedGain.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
