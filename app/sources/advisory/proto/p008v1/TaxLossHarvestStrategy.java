package advisory.proto.p008v1;

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

/* compiled from: TaxLossHarvestStrategy.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006%"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategy;", "Lcom/squareup/wire/Message;", "", "type", "Ladvisory/proto/v1/TaxLossHarvestStrategyType;", "title", "", "subtitle", "description", "is_default", "", "review", "Ladvisory/proto/v1/TaxLossHarvestStrategyReview;", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/TaxLossHarvestStrategyReview;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Ladvisory/proto/v1/TaxLossHarvestStrategyType;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDescription", "()Z", "getReview", "()Ladvisory/proto/v1/TaxLossHarvestStrategyReview;", "getLogging_identifier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategy extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategy> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDefault", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_default;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 6, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyReview#ADAPTER", schemaIndex = 5, tag = 6)
    private final TaxLossHarvestStrategyReview review;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaxLossHarvestStrategyType type;

    public TaxLossHarvestStrategy() {
        this(null, null, null, null, false, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4562newBuilder();
    }

    public final TaxLossHarvestStrategyType getType() {
        return this.type;
    }

    public /* synthetic */ TaxLossHarvestStrategy(TaxLossHarvestStrategyType taxLossHarvestStrategyType, String str, String str2, String str3, boolean z, TaxLossHarvestStrategyReview taxLossHarvestStrategyReview, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED : taxLossHarvestStrategyType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : taxLossHarvestStrategyReview, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDescription() {
        return this.description;
    }

    /* renamed from: is_default, reason: from getter */
    public final boolean getIs_default() {
        return this.is_default;
    }

    public final TaxLossHarvestStrategyReview getReview() {
        return this.review;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategy(TaxLossHarvestStrategyType type2, String title, String subtitle, String description, boolean z, TaxLossHarvestStrategyReview taxLossHarvestStrategyReview, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.is_default = z;
        this.review = taxLossHarvestStrategyReview;
        this.logging_identifier = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4562newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestStrategy)) {
            return false;
        }
        TaxLossHarvestStrategy taxLossHarvestStrategy = (TaxLossHarvestStrategy) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestStrategy.unknownFields()) && this.type == taxLossHarvestStrategy.type && Intrinsics.areEqual(this.title, taxLossHarvestStrategy.title) && Intrinsics.areEqual(this.subtitle, taxLossHarvestStrategy.subtitle) && Intrinsics.areEqual(this.description, taxLossHarvestStrategy.description) && this.is_default == taxLossHarvestStrategy.is_default && Intrinsics.areEqual(this.review, taxLossHarvestStrategy.review) && Intrinsics.areEqual(this.logging_identifier, taxLossHarvestStrategy.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.description.hashCode()) * 37) + Boolean.hashCode(this.is_default)) * 37;
        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview = this.review;
        int iHashCode2 = (iHashCode + (taxLossHarvestStrategyReview != null ? taxLossHarvestStrategyReview.hashCode() : 0)) * 37;
        String str = this.logging_identifier;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("is_default=" + this.is_default);
        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview = this.review;
        if (taxLossHarvestStrategyReview != null) {
            arrayList.add("review=" + taxLossHarvestStrategyReview);
        }
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestStrategy{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestStrategy copy$default(TaxLossHarvestStrategy taxLossHarvestStrategy, TaxLossHarvestStrategyType taxLossHarvestStrategyType, String str, String str2, String str3, boolean z, TaxLossHarvestStrategyReview taxLossHarvestStrategyReview, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLossHarvestStrategyType = taxLossHarvestStrategy.type;
        }
        if ((i & 2) != 0) {
            str = taxLossHarvestStrategy.title;
        }
        if ((i & 4) != 0) {
            str2 = taxLossHarvestStrategy.subtitle;
        }
        if ((i & 8) != 0) {
            str3 = taxLossHarvestStrategy.description;
        }
        if ((i & 16) != 0) {
            z = taxLossHarvestStrategy.is_default;
        }
        if ((i & 32) != 0) {
            taxLossHarvestStrategyReview = taxLossHarvestStrategy.review;
        }
        if ((i & 64) != 0) {
            str4 = taxLossHarvestStrategy.logging_identifier;
        }
        if ((i & 128) != 0) {
            byteString = taxLossHarvestStrategy.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview2 = taxLossHarvestStrategyReview;
        return taxLossHarvestStrategy.copy(taxLossHarvestStrategyType, str, str2, str3, z2, taxLossHarvestStrategyReview2, str5, byteString2);
    }

    public final TaxLossHarvestStrategy copy(TaxLossHarvestStrategyType type2, String title, String subtitle, String description, boolean is_default, TaxLossHarvestStrategyReview review, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestStrategy(type2, title, subtitle, description, is_default, review, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategy.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestStrategy>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestStrategy$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestStrategy value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED) {
                    size += TaxLossHarvestStrategyType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription());
                }
                if (value.getIs_default()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_default()));
                }
                return size + TaxLossHarvestStrategyReview.ADAPTER.encodedSizeWithTag(6, value.getReview()) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestStrategy value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED) {
                    TaxLossHarvestStrategyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (value.getIs_default()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_default()));
                }
                TaxLossHarvestStrategyReview.ADAPTER.encodeWithTag(writer, 6, (int) value.getReview());
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestStrategy value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                TaxLossHarvestStrategyReview.ADAPTER.encodeWithTag(writer, 6, (int) value.getReview());
                if (value.getIs_default()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_default()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (value.getType() != TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED) {
                    TaxLossHarvestStrategyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategy decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLossHarvestStrategyType taxLossHarvestStrategyType = TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                TaxLossHarvestStrategyReview taxLossHarvestStrategyReviewDecode = null;
                String strDecode2 = null;
                TaxLossHarvestStrategyType taxLossHarvestStrategyTypeDecode = taxLossHarvestStrategyType;
                String strDecode3 = strDecode;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    taxLossHarvestStrategyTypeDecode = TaxLossHarvestStrategyType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                taxLossHarvestStrategyReviewDecode = TaxLossHarvestStrategyReview.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TaxLossHarvestStrategy(taxLossHarvestStrategyTypeDecode, strDecode3, strDecode4, strDecode, zBooleanValue, taxLossHarvestStrategyReviewDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategy redact(TaxLossHarvestStrategy value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLossHarvestStrategyReview review = value.getReview();
                return TaxLossHarvestStrategy.copy$default(value, null, null, null, null, false, review != null ? TaxLossHarvestStrategyReview.ADAPTER.redact(review) : null, null, ByteString.EMPTY, 95, null);
            }
        };
    }
}
