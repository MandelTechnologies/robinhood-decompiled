package advisory.proto.p008v1;

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

/* compiled from: AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight;", "Lcom/squareup/wire/Message;", "", "portfolio_performance_chart_params", "Ladvisory/proto/v1/AdvisoryInsightPortfolioPerformanceChartParams;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightPortfolioPerformanceChartParams;Lokio/ByteString;)V", "getPortfolio_performance_chart_params", "()Ladvisory/proto/v1/AdvisoryInsightPortfolioPerformanceChartParams;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightPortfolioPerformanceChartParams#ADAPTER", jsonName = "portfolioPerformanceChartParams", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AdvisoryInsightPortfolioPerformanceChartParams portfolio_performance_chart_params;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4387newBuilder();
    }

    public final AdvisoryInsightPortfolioPerformanceChartParams getPortfolio_performance_chart_params() {
        return this.portfolio_performance_chart_params;
    }

    public /* synthetic */ AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight(AdvisoryInsightPortfolioPerformanceChartParams advisoryInsightPortfolioPerformanceChartParams, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisoryInsightPortfolioPerformanceChartParams, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight(AdvisoryInsightPortfolioPerformanceChartParams advisoryInsightPortfolioPerformanceChartParams, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.portfolio_performance_chart_params = advisoryInsightPortfolioPerformanceChartParams;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4387newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight)) {
            return false;
        }
        AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight advisoryInsightContentViewModelAssetPerformanceChartNoHighlight = (AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightContentViewModelAssetPerformanceChartNoHighlight.unknownFields()) && Intrinsics.areEqual(this.portfolio_performance_chart_params, advisoryInsightContentViewModelAssetPerformanceChartNoHighlight.portfolio_performance_chart_params);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AdvisoryInsightPortfolioPerformanceChartParams advisoryInsightPortfolioPerformanceChartParams = this.portfolio_performance_chart_params;
        int iHashCode2 = iHashCode + (advisoryInsightPortfolioPerformanceChartParams != null ? advisoryInsightPortfolioPerformanceChartParams.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AdvisoryInsightPortfolioPerformanceChartParams advisoryInsightPortfolioPerformanceChartParams = this.portfolio_performance_chart_params;
        if (advisoryInsightPortfolioPerformanceChartParams != null) {
            arrayList.add("portfolio_performance_chart_params=" + advisoryInsightPortfolioPerformanceChartParams);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight{", "}", 0, null, null, 56, null);
    }

    public final AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight copy(AdvisoryInsightPortfolioPerformanceChartParams portfolio_performance_chart_params, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight(portfolio_performance_chart_params, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getPortfolio_performance_chart_params() != null ? size + AdvisoryInsightPortfolioPerformanceChartParams.ADAPTER.encodedSizeWithTag(1, value.getPortfolio_performance_chart_params()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPortfolio_performance_chart_params() != null) {
                    AdvisoryInsightPortfolioPerformanceChartParams.ADAPTER.encodeWithTag(writer, 1, (int) value.getPortfolio_performance_chart_params());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPortfolio_performance_chart_params() != null) {
                    AdvisoryInsightPortfolioPerformanceChartParams.ADAPTER.encodeWithTag(writer, 1, (int) value.getPortfolio_performance_chart_params());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight redact(AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryInsightPortfolioPerformanceChartParams portfolio_performance_chart_params = value.getPortfolio_performance_chart_params();
                return value.copy(portfolio_performance_chart_params != null ? AdvisoryInsightPortfolioPerformanceChartParams.ADAPTER.redact(portfolio_performance_chart_params) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AdvisoryInsightPortfolioPerformanceChartParams advisoryInsightPortfolioPerformanceChartParamsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryInsightContentViewModelAssetPerformanceChartNoHighlight(advisoryInsightPortfolioPerformanceChartParamsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        advisoryInsightPortfolioPerformanceChartParamsDecode = AdvisoryInsightPortfolioPerformanceChartParams.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
