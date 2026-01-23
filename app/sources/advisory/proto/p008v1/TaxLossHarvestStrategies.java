package advisory.proto.p008v1;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
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

/* compiled from: TaxLossHarvestStrategies.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategies;", "Lcom/squareup/wire/Message;", "", "title", "", "strategies", "", "Ladvisory/proto/v1/TaxLossHarvestStrategy;", "disclosure_markdown", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Ladvisory/proto/v1/TaxLossHarvestStrategiesBanner;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestStrategiesBanner;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDisclosure_markdown", "getBanner", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesBanner;", "getStrategies", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategies extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategies> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategiesBanner#ADAPTER", schemaIndex = 3, tag = 4)
    private final TaxLossHarvestStrategiesBanner banner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String disclosure_markdown;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategy#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<TaxLossHarvestStrategy> strategies;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TaxLossHarvestStrategies() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ TaxLossHarvestStrategies(String str, List list, String str2, TaxLossHarvestStrategiesBanner taxLossHarvestStrategiesBanner, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : taxLossHarvestStrategiesBanner, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4557newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final TaxLossHarvestStrategiesBanner getBanner() {
        return this.banner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategies(String title, List<TaxLossHarvestStrategy> strategies, String disclosure_markdown, TaxLossHarvestStrategiesBanner taxLossHarvestStrategiesBanner, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.disclosure_markdown = disclosure_markdown;
        this.banner = taxLossHarvestStrategiesBanner;
        this.strategies = Internal.immutableCopyOf("strategies", strategies);
    }

    public final List<TaxLossHarvestStrategy> getStrategies() {
        return this.strategies;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4557newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestStrategies)) {
            return false;
        }
        TaxLossHarvestStrategies taxLossHarvestStrategies = (TaxLossHarvestStrategies) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestStrategies.unknownFields()) && Intrinsics.areEqual(this.title, taxLossHarvestStrategies.title) && Intrinsics.areEqual(this.strategies, taxLossHarvestStrategies.strategies) && Intrinsics.areEqual(this.disclosure_markdown, taxLossHarvestStrategies.disclosure_markdown) && Intrinsics.areEqual(this.banner, taxLossHarvestStrategies.banner);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.strategies.hashCode()) * 37) + this.disclosure_markdown.hashCode()) * 37;
        TaxLossHarvestStrategiesBanner taxLossHarvestStrategiesBanner = this.banner;
        int iHashCode2 = iHashCode + (taxLossHarvestStrategiesBanner != null ? taxLossHarvestStrategiesBanner.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.strategies.isEmpty()) {
            arrayList.add("strategies=" + this.strategies);
        }
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        TaxLossHarvestStrategiesBanner taxLossHarvestStrategiesBanner = this.banner;
        if (taxLossHarvestStrategiesBanner != null) {
            arrayList.add("banner=" + taxLossHarvestStrategiesBanner);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestStrategies{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestStrategies copy$default(TaxLossHarvestStrategies taxLossHarvestStrategies, String str, List list, String str2, TaxLossHarvestStrategiesBanner taxLossHarvestStrategiesBanner, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestStrategies.title;
        }
        if ((i & 2) != 0) {
            list = taxLossHarvestStrategies.strategies;
        }
        if ((i & 4) != 0) {
            str2 = taxLossHarvestStrategies.disclosure_markdown;
        }
        if ((i & 8) != 0) {
            taxLossHarvestStrategiesBanner = taxLossHarvestStrategies.banner;
        }
        if ((i & 16) != 0) {
            byteString = taxLossHarvestStrategies.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return taxLossHarvestStrategies.copy(str, list, str3, taxLossHarvestStrategiesBanner, byteString2);
    }

    public final TaxLossHarvestStrategies copy(String title, List<TaxLossHarvestStrategy> strategies, String disclosure_markdown, TaxLossHarvestStrategiesBanner banner, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestStrategies(title, strategies, disclosure_markdown, banner, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategies.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestStrategies>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestStrategies$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestStrategies value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + TaxLossHarvestStrategy.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getStrategies());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisclosure_markdown());
                }
                return iEncodedSizeWithTag + TaxLossHarvestStrategiesBanner.ADAPTER.encodedSizeWithTag(4, value.getBanner());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestStrategies value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                TaxLossHarvestStrategy.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getStrategies());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                }
                TaxLossHarvestStrategiesBanner.ADAPTER.encodeWithTag(writer, 4, (int) value.getBanner());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestStrategies value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TaxLossHarvestStrategiesBanner.ADAPTER.encodeWithTag(writer, 4, (int) value.getBanner());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                }
                TaxLossHarvestStrategy.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getStrategies());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategies decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                TaxLossHarvestStrategiesBanner taxLossHarvestStrategiesBannerDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestStrategies(strDecode, arrayList, strDecode2, taxLossHarvestStrategiesBannerDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(TaxLossHarvestStrategy.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        taxLossHarvestStrategiesBannerDecode = TaxLossHarvestStrategiesBanner.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategies redact(TaxLossHarvestStrategies value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getStrategies(), TaxLossHarvestStrategy.ADAPTER);
                TaxLossHarvestStrategiesBanner banner = value.getBanner();
                return TaxLossHarvestStrategies.copy$default(value, null, listM26823redactElements, null, banner != null ? TaxLossHarvestStrategiesBanner.ADAPTER.redact(banner) : null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
