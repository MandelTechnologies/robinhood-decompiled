package microgram.contracts.invest_tab_highlights.proto.p494v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: HighlightCard.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\fH\u0016Jh\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001e¨\u0006-"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCard;", "Lcom/squareup/wire/Message;", "", "generic_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "ec_event_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;", "ec_reserved_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContent;", "portfolio_digest_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContent;", "id", "", "type", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;", "deeplink", "analytics_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContent;Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContent;Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getGeneric_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "getEc_event_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;", "getEc_reserved_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContent;", "getPortfolio_digest_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContent;", "getId", "()Ljava/lang/String;", "getType", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;", "getDeeplink", "getAnalytics_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HighlightCard extends Message {

    @JvmField
    public static final ProtoAdapter<HighlightCard> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "analyticsName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final String analytics_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final String deeplink;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.EcEventContent#ADAPTER", jsonName = "ecEventContent", oneofName = "content", schemaIndex = 1, tag = 2)
    private final EcEventContent ec_event_content;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.EcReservedContent#ADAPTER", jsonName = "ecReservedContent", oneofName = "content", schemaIndex = 2, tag = 3)
    private final EcReservedContent ec_reserved_content;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardGenericContent#ADAPTER", jsonName = "genericContent", oneofName = "content", schemaIndex = 0, tag = 1)
    private final HighlightCardGenericContent generic_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final String id;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.PortfolioDigestContent#ADAPTER", jsonName = "portfolioDigestContent", oneofName = "content", schemaIndex = 3, tag = 8)
    private final PortfolioDigestContent portfolio_digest_content;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.HighlightType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final HighlightType type;

    public HighlightCard() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ HighlightCard(HighlightCardGenericContent highlightCardGenericContent, EcEventContent ecEventContent, EcReservedContent ecReservedContent, PortfolioDigestContent portfolioDigestContent, String str, HighlightType highlightType, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : highlightCardGenericContent, (i & 2) != 0 ? null : ecEventContent, (i & 4) != 0 ? null : ecReservedContent, (i & 8) != 0 ? null : portfolioDigestContent, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED : highlightType, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29125newBuilder();
    }

    public final HighlightCardGenericContent getGeneric_content() {
        return this.generic_content;
    }

    public final EcEventContent getEc_event_content() {
        return this.ec_event_content;
    }

    public final EcReservedContent getEc_reserved_content() {
        return this.ec_reserved_content;
    }

    public final PortfolioDigestContent getPortfolio_digest_content() {
        return this.portfolio_digest_content;
    }

    public final String getId() {
        return this.id;
    }

    public final HighlightType getType() {
        return this.type;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getAnalytics_name() {
        return this.analytics_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightCard(HighlightCardGenericContent highlightCardGenericContent, EcEventContent ecEventContent, EcReservedContent ecReservedContent, PortfolioDigestContent portfolioDigestContent, String id, HighlightType type2, String deeplink, String analytics_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(analytics_name, "analytics_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.generic_content = highlightCardGenericContent;
        this.ec_event_content = ecEventContent;
        this.ec_reserved_content = ecReservedContent;
        this.portfolio_digest_content = portfolioDigestContent;
        this.id = id;
        this.type = type2;
        this.deeplink = deeplink;
        this.analytics_name = analytics_name;
        if (Internal.countNonNull(highlightCardGenericContent, ecEventContent, ecReservedContent, portfolioDigestContent, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of generic_content, ec_event_content, ec_reserved_content, portfolio_digest_content may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29125newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HighlightCard)) {
            return false;
        }
        HighlightCard highlightCard = (HighlightCard) other;
        return Intrinsics.areEqual(unknownFields(), highlightCard.unknownFields()) && Intrinsics.areEqual(this.generic_content, highlightCard.generic_content) && Intrinsics.areEqual(this.ec_event_content, highlightCard.ec_event_content) && Intrinsics.areEqual(this.ec_reserved_content, highlightCard.ec_reserved_content) && Intrinsics.areEqual(this.portfolio_digest_content, highlightCard.portfolio_digest_content) && Intrinsics.areEqual(this.id, highlightCard.id) && this.type == highlightCard.type && Intrinsics.areEqual(this.deeplink, highlightCard.deeplink) && Intrinsics.areEqual(this.analytics_name, highlightCard.analytics_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        HighlightCardGenericContent highlightCardGenericContent = this.generic_content;
        int iHashCode2 = (iHashCode + (highlightCardGenericContent != null ? highlightCardGenericContent.hashCode() : 0)) * 37;
        EcEventContent ecEventContent = this.ec_event_content;
        int iHashCode3 = (iHashCode2 + (ecEventContent != null ? ecEventContent.hashCode() : 0)) * 37;
        EcReservedContent ecReservedContent = this.ec_reserved_content;
        int iHashCode4 = (iHashCode3 + (ecReservedContent != null ? ecReservedContent.hashCode() : 0)) * 37;
        PortfolioDigestContent portfolioDigestContent = this.portfolio_digest_content;
        int iHashCode5 = ((((((((iHashCode4 + (portfolioDigestContent != null ? portfolioDigestContent.hashCode() : 0)) * 37) + this.id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.analytics_name.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        HighlightCardGenericContent highlightCardGenericContent = this.generic_content;
        if (highlightCardGenericContent != null) {
            arrayList.add("generic_content=" + highlightCardGenericContent);
        }
        EcEventContent ecEventContent = this.ec_event_content;
        if (ecEventContent != null) {
            arrayList.add("ec_event_content=" + ecEventContent);
        }
        EcReservedContent ecReservedContent = this.ec_reserved_content;
        if (ecReservedContent != null) {
            arrayList.add("ec_reserved_content=" + ecReservedContent);
        }
        PortfolioDigestContent portfolioDigestContent = this.portfolio_digest_content;
        if (portfolioDigestContent != null) {
            arrayList.add("portfolio_digest_content=" + portfolioDigestContent);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("type=" + this.type);
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("analytics_name=" + Internal.sanitize(this.analytics_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "HighlightCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HighlightCard copy$default(HighlightCard highlightCard, HighlightCardGenericContent highlightCardGenericContent, EcEventContent ecEventContent, EcReservedContent ecReservedContent, PortfolioDigestContent portfolioDigestContent, String str, HighlightType highlightType, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            highlightCardGenericContent = highlightCard.generic_content;
        }
        if ((i & 2) != 0) {
            ecEventContent = highlightCard.ec_event_content;
        }
        if ((i & 4) != 0) {
            ecReservedContent = highlightCard.ec_reserved_content;
        }
        if ((i & 8) != 0) {
            portfolioDigestContent = highlightCard.portfolio_digest_content;
        }
        if ((i & 16) != 0) {
            str = highlightCard.id;
        }
        if ((i & 32) != 0) {
            highlightType = highlightCard.type;
        }
        if ((i & 64) != 0) {
            str2 = highlightCard.deeplink;
        }
        if ((i & 128) != 0) {
            str3 = highlightCard.analytics_name;
        }
        if ((i & 256) != 0) {
            byteString = highlightCard.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        HighlightType highlightType2 = highlightType;
        String str5 = str2;
        String str6 = str;
        EcReservedContent ecReservedContent2 = ecReservedContent;
        return highlightCard.copy(highlightCardGenericContent, ecEventContent, ecReservedContent2, portfolioDigestContent, str6, highlightType2, str5, str4, byteString2);
    }

    public final HighlightCard copy(HighlightCardGenericContent generic_content, EcEventContent ec_event_content, EcReservedContent ec_reserved_content, PortfolioDigestContent portfolio_digest_content, String id, HighlightType type2, String deeplink, String analytics_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(analytics_name, "analytics_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HighlightCard(generic_content, ec_event_content, ec_reserved_content, portfolio_digest_content, id, type2, deeplink, analytics_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HighlightCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HighlightCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HighlightCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + HighlightCardGenericContent.ADAPTER.encodedSizeWithTag(1, value.getGeneric_content()) + EcEventContent.ADAPTER.encodedSizeWithTag(2, value.getEc_event_content()) + EcReservedContent.ADAPTER.encodedSizeWithTag(3, value.getEc_reserved_content()) + PortfolioDigestContent.ADAPTER.encodedSizeWithTag(8, value.getPortfolio_digest_content());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getId());
                }
                if (value.getType() != HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED) {
                    size += HighlightType.ADAPTER.encodedSizeWithTag(5, value.getType());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDeeplink());
                }
                return !Intrinsics.areEqual(value.getAnalytics_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAnalytics_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HighlightCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                }
                if (value.getType() != HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED) {
                    HighlightType.ADAPTER.encodeWithTag(writer, 5, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getAnalytics_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAnalytics_name());
                }
                HighlightCardGenericContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getGeneric_content());
                EcEventContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEc_event_content());
                EcReservedContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getEc_reserved_content());
                PortfolioDigestContent.ADAPTER.encodeWithTag(writer, 8, (int) value.getPortfolio_digest_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HighlightCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PortfolioDigestContent.ADAPTER.encodeWithTag(writer, 8, (int) value.getPortfolio_digest_content());
                EcReservedContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getEc_reserved_content());
                EcEventContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEc_event_content());
                HighlightCardGenericContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getGeneric_content());
                if (!Intrinsics.areEqual(value.getAnalytics_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAnalytics_name());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDeeplink());
                }
                if (value.getType() != HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED) {
                    HighlightType.ADAPTER.encodeWithTag(writer, 5, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                HighlightType highlightType = HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                EcEventContent ecEventContentDecode = null;
                EcReservedContent ecReservedContentDecode = null;
                PortfolioDigestContent portfolioDigestContentDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                HighlightType highlightTypeDecode = highlightType;
                HighlightCardGenericContent highlightCardGenericContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                highlightCardGenericContentDecode = HighlightCardGenericContent.ADAPTER.decode(reader);
                                break;
                            case 2:
                                ecEventContentDecode = EcEventContent.ADAPTER.decode(reader);
                                break;
                            case 3:
                                ecReservedContentDecode = EcReservedContent.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    highlightTypeDecode = HighlightType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                portfolioDigestContentDecode = PortfolioDigestContent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new HighlightCard(highlightCardGenericContentDecode, ecEventContentDecode, ecReservedContentDecode, portfolioDigestContentDecode, strDecode, highlightTypeDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightCard redact(HighlightCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                HighlightCardGenericContent generic_content = value.getGeneric_content();
                HighlightCardGenericContent highlightCardGenericContentRedact = generic_content != null ? HighlightCardGenericContent.ADAPTER.redact(generic_content) : null;
                EcEventContent ec_event_content = value.getEc_event_content();
                EcEventContent ecEventContentRedact = ec_event_content != null ? EcEventContent.ADAPTER.redact(ec_event_content) : null;
                EcReservedContent ec_reserved_content = value.getEc_reserved_content();
                EcReservedContent ecReservedContentRedact = ec_reserved_content != null ? EcReservedContent.ADAPTER.redact(ec_reserved_content) : null;
                PortfolioDigestContent portfolio_digest_content = value.getPortfolio_digest_content();
                return HighlightCard.copy$default(value, highlightCardGenericContentRedact, ecEventContentRedact, ecReservedContentRedact, portfolio_digest_content != null ? PortfolioDigestContent.ADAPTER.redact(portfolio_digest_content) : null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
            }
        };
    }
}
