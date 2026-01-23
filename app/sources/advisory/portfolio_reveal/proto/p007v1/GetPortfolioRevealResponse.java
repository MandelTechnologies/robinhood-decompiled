package advisory.portfolio_reveal.proto.p007v1;

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

/* compiled from: GetPortfolioRevealResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J8\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponse;", "Lcom/squareup/wire/Message;", "", "intro", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntro;", "info_pages", "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealInfoPage;", "asset_class_overview", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntro;Ljava/util/List;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;Lokio/ByteString;)V", "getIntro", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntro;", "getAsset_class_overview", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;", "getInfo_pages", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetPortfolioRevealResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPortfolioRevealResponse> ADAPTER;

    @WireField(adapter = "advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassOverview#ADAPTER", jsonName = "assetClassOverview", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PortfolioRevealAssetClassOverview asset_class_overview;

    @WireField(adapter = "advisory.portfolio_reveal.proto.v1.PortfolioRevealInfoPage#ADAPTER", jsonName = "infoPages", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<PortfolioRevealInfoPage> info_pages;

    @WireField(adapter = "advisory.portfolio_reveal.proto.v1.PortfolioRevealIntro#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PortfolioRevealIntro intro;

    public GetPortfolioRevealResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4360newBuilder();
    }

    public final PortfolioRevealIntro getIntro() {
        return this.intro;
    }

    public /* synthetic */ GetPortfolioRevealResponse(PortfolioRevealIntro portfolioRevealIntro, List list, PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverview, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : portfolioRevealIntro, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : portfolioRevealAssetClassOverview, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PortfolioRevealAssetClassOverview getAsset_class_overview() {
        return this.asset_class_overview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfolioRevealResponse(PortfolioRevealIntro portfolioRevealIntro, List<PortfolioRevealInfoPage> info_pages, PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverview, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(info_pages, "info_pages");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.intro = portfolioRevealIntro;
        this.asset_class_overview = portfolioRevealAssetClassOverview;
        this.info_pages = Internal.immutableCopyOf("info_pages", info_pages);
    }

    public final List<PortfolioRevealInfoPage> getInfo_pages() {
        return this.info_pages;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4360newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPortfolioRevealResponse)) {
            return false;
        }
        GetPortfolioRevealResponse getPortfolioRevealResponse = (GetPortfolioRevealResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPortfolioRevealResponse.unknownFields()) && Intrinsics.areEqual(this.intro, getPortfolioRevealResponse.intro) && Intrinsics.areEqual(this.info_pages, getPortfolioRevealResponse.info_pages) && Intrinsics.areEqual(this.asset_class_overview, getPortfolioRevealResponse.asset_class_overview);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PortfolioRevealIntro portfolioRevealIntro = this.intro;
        int iHashCode2 = (((iHashCode + (portfolioRevealIntro != null ? portfolioRevealIntro.hashCode() : 0)) * 37) + this.info_pages.hashCode()) * 37;
        PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverview = this.asset_class_overview;
        int iHashCode3 = iHashCode2 + (portfolioRevealAssetClassOverview != null ? portfolioRevealAssetClassOverview.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PortfolioRevealIntro portfolioRevealIntro = this.intro;
        if (portfolioRevealIntro != null) {
            arrayList.add("intro=" + portfolioRevealIntro);
        }
        if (!this.info_pages.isEmpty()) {
            arrayList.add("info_pages=" + this.info_pages);
        }
        PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverview = this.asset_class_overview;
        if (portfolioRevealAssetClassOverview != null) {
            arrayList.add("asset_class_overview=" + portfolioRevealAssetClassOverview);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfolioRevealResponse{", "}", 0, null, null, 56, null);
    }

    public final GetPortfolioRevealResponse copy(PortfolioRevealIntro intro, List<PortfolioRevealInfoPage> info_pages, PortfolioRevealAssetClassOverview asset_class_overview, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(info_pages, "info_pages");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPortfolioRevealResponse(intro, info_pages, asset_class_overview, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPortfolioRevealResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPortfolioRevealResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.portfolio_reveal.proto.v1.GetPortfolioRevealResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPortfolioRevealResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIntro() != null) {
                    size += PortfolioRevealIntro.ADAPTER.encodedSizeWithTag(1, value.getIntro());
                }
                int iEncodedSizeWithTag = size + PortfolioRevealInfoPage.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getInfo_pages());
                return value.getAsset_class_overview() != null ? iEncodedSizeWithTag + PortfolioRevealAssetClassOverview.ADAPTER.encodedSizeWithTag(3, value.getAsset_class_overview()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPortfolioRevealResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIntro() != null) {
                    PortfolioRevealIntro.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntro());
                }
                PortfolioRevealInfoPage.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getInfo_pages());
                if (value.getAsset_class_overview() != null) {
                    PortfolioRevealAssetClassOverview.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsset_class_overview());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPortfolioRevealResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAsset_class_overview() != null) {
                    PortfolioRevealAssetClassOverview.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsset_class_overview());
                }
                PortfolioRevealInfoPage.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getInfo_pages());
                if (value.getIntro() != null) {
                    PortfolioRevealIntro.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntro());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioRevealResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                PortfolioRevealIntro portfolioRevealIntroDecode = null;
                PortfolioRevealAssetClassOverview portfolioRevealAssetClassOverviewDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPortfolioRevealResponse(portfolioRevealIntroDecode, arrayList, portfolioRevealAssetClassOverviewDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        portfolioRevealIntroDecode = PortfolioRevealIntro.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(PortfolioRevealInfoPage.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        portfolioRevealAssetClassOverviewDecode = PortfolioRevealAssetClassOverview.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioRevealResponse redact(GetPortfolioRevealResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PortfolioRevealIntro intro = value.getIntro();
                PortfolioRevealIntro portfolioRevealIntroRedact = intro != null ? PortfolioRevealIntro.ADAPTER.redact(intro) : null;
                List<PortfolioRevealInfoPage> listM26823redactElements = Internal.m26823redactElements(value.getInfo_pages(), PortfolioRevealInfoPage.ADAPTER);
                PortfolioRevealAssetClassOverview asset_class_overview = value.getAsset_class_overview();
                return value.copy(portfolioRevealIntroRedact, listM26823redactElements, asset_class_overview != null ? PortfolioRevealAssetClassOverview.ADAPTER.redact(asset_class_overview) : null, ByteString.EMPTY);
            }
        };
    }
}
