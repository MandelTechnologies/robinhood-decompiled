package wormhole.service.p554v1;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
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

/* compiled from: GetRealizedGainLossItemResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemResponse;", "Lcom/squareup/wire/Message;", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lwormhole/service/v1/RealizedGainLossItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lwormhole/service/v1/RealizedGainLossItem;Lokio/ByteString;)V", "getItem", "()Lwormhole/service/v1/RealizedGainLossItem;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedGainLossItemResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedGainLossItemResponse> ADAPTER;

    @WireField(adapter = "wormhole.service.v1.RealizedGainLossItem#ADAPTER", schemaIndex = 0, tag = 1)
    private final RealizedGainLossItem item;

    /* JADX WARN: Multi-variable type inference failed */
    public GetRealizedGainLossItemResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30059newBuilder();
    }

    public final RealizedGainLossItem getItem() {
        return this.item;
    }

    public /* synthetic */ GetRealizedGainLossItemResponse(RealizedGainLossItem realizedGainLossItem, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : realizedGainLossItem, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossItemResponse(RealizedGainLossItem realizedGainLossItem, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.item = realizedGainLossItem;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30059newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedGainLossItemResponse)) {
            return false;
        }
        GetRealizedGainLossItemResponse getRealizedGainLossItemResponse = (GetRealizedGainLossItemResponse) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedGainLossItemResponse.unknownFields()) && Intrinsics.areEqual(this.item, getRealizedGainLossItemResponse.item);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RealizedGainLossItem realizedGainLossItem = this.item;
        int iHashCode2 = iHashCode + (realizedGainLossItem != null ? realizedGainLossItem.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        RealizedGainLossItem realizedGainLossItem = this.item;
        if (realizedGainLossItem != null) {
            arrayList.add("item=" + realizedGainLossItem);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedGainLossItemResponse{", "}", 0, null, null, 56, null);
    }

    public final GetRealizedGainLossItemResponse copy(RealizedGainLossItem item, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedGainLossItemResponse(item, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedGainLossItemResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedGainLossItemResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.GetRealizedGainLossItemResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedGainLossItemResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + RealizedGainLossItem.ADAPTER.encodedSizeWithTag(1, value.getItem());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedGainLossItemResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                RealizedGainLossItem.ADAPTER.encodeWithTag(writer, 1, (int) value.getItem());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedGainLossItemResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RealizedGainLossItem.ADAPTER.encodeWithTag(writer, 1, (int) value.getItem());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemResponse redact(GetRealizedGainLossItemResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RealizedGainLossItem item = value.getItem();
                return value.copy(item != null ? RealizedGainLossItem.ADAPTER.redact(item) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RealizedGainLossItem realizedGainLossItemDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedGainLossItemResponse(realizedGainLossItemDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        realizedGainLossItemDecode = RealizedGainLossItem.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
