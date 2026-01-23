package redesign_settings.p528v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetHighlightSettingsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006!"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponse;", "Lcom/squareup/wire/Message;", "", "price_movement_threshold", "", "risk_score_threshold", "", "max_top_movers_highlights_displayed", "min_highlights_required_for_display", "max_highlights_displayed", "min_equity_holdings_for_display", "unknownFields", "Lokio/ByteString;", "<init>", "(FIIIIILokio/ByteString;)V", "getPrice_movement_threshold", "()F", "getRisk_score_threshold", "()I", "getMax_top_movers_highlights_displayed", "getMin_highlights_required_for_display", "getMax_highlights_displayed", "getMin_equity_holdings_for_display", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetHighlightSettingsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetHighlightSettingsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxHighlightsDisplayed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int max_highlights_displayed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxTopMoversHighlightsDisplayed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int max_top_movers_highlights_displayed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minEquityHoldingsForDisplay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int min_equity_holdings_for_display;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minHighlightsRequiredForDisplay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int min_highlights_required_for_display;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "priceMovementThreshold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float price_movement_threshold;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "riskScoreThreshold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int risk_score_threshold;

    public GetHighlightSettingsResponse() {
        this(0.0f, 0, 0, 0, 0, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29648newBuilder();
    }

    public final float getPrice_movement_threshold() {
        return this.price_movement_threshold;
    }

    public final int getRisk_score_threshold() {
        return this.risk_score_threshold;
    }

    public final int getMax_top_movers_highlights_displayed() {
        return this.max_top_movers_highlights_displayed;
    }

    public final int getMin_highlights_required_for_display() {
        return this.min_highlights_required_for_display;
    }

    public final int getMax_highlights_displayed() {
        return this.max_highlights_displayed;
    }

    public final int getMin_equity_holdings_for_display() {
        return this.min_equity_holdings_for_display;
    }

    public /* synthetic */ GetHighlightSettingsResponse(float f, int i, int i2, int i3, int i4, int i5, ByteString byteString, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0.0f : f, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHighlightSettingsResponse(float f, int i, int i2, int i3, int i4, int i5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.price_movement_threshold = f;
        this.risk_score_threshold = i;
        this.max_top_movers_highlights_displayed = i2;
        this.min_highlights_required_for_display = i3;
        this.max_highlights_displayed = i4;
        this.min_equity_holdings_for_display = i5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29648newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetHighlightSettingsResponse)) {
            return false;
        }
        GetHighlightSettingsResponse getHighlightSettingsResponse = (GetHighlightSettingsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getHighlightSettingsResponse.unknownFields()) && this.price_movement_threshold == getHighlightSettingsResponse.price_movement_threshold && this.risk_score_threshold == getHighlightSettingsResponse.risk_score_threshold && this.max_top_movers_highlights_displayed == getHighlightSettingsResponse.max_top_movers_highlights_displayed && this.min_highlights_required_for_display == getHighlightSettingsResponse.min_highlights_required_for_display && this.max_highlights_displayed == getHighlightSettingsResponse.max_highlights_displayed && this.min_equity_holdings_for_display == getHighlightSettingsResponse.min_equity_holdings_for_display;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Float.hashCode(this.price_movement_threshold)) * 37) + Integer.hashCode(this.risk_score_threshold)) * 37) + Integer.hashCode(this.max_top_movers_highlights_displayed)) * 37) + Integer.hashCode(this.min_highlights_required_for_display)) * 37) + Integer.hashCode(this.max_highlights_displayed)) * 37) + Integer.hashCode(this.min_equity_holdings_for_display);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("price_movement_threshold=" + this.price_movement_threshold);
        arrayList.add("risk_score_threshold=" + this.risk_score_threshold);
        arrayList.add("max_top_movers_highlights_displayed=" + this.max_top_movers_highlights_displayed);
        arrayList.add("min_highlights_required_for_display=" + this.min_highlights_required_for_display);
        arrayList.add("max_highlights_displayed=" + this.max_highlights_displayed);
        arrayList.add("min_equity_holdings_for_display=" + this.min_equity_holdings_for_display);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetHighlightSettingsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetHighlightSettingsResponse copy$default(GetHighlightSettingsResponse getHighlightSettingsResponse, float f, int i, int i2, int i3, int i4, int i5, ByteString byteString, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f = getHighlightSettingsResponse.price_movement_threshold;
        }
        if ((i6 & 2) != 0) {
            i = getHighlightSettingsResponse.risk_score_threshold;
        }
        if ((i6 & 4) != 0) {
            i2 = getHighlightSettingsResponse.max_top_movers_highlights_displayed;
        }
        if ((i6 & 8) != 0) {
            i3 = getHighlightSettingsResponse.min_highlights_required_for_display;
        }
        if ((i6 & 16) != 0) {
            i4 = getHighlightSettingsResponse.max_highlights_displayed;
        }
        if ((i6 & 32) != 0) {
            i5 = getHighlightSettingsResponse.min_equity_holdings_for_display;
        }
        if ((i6 & 64) != 0) {
            byteString = getHighlightSettingsResponse.unknownFields();
        }
        int i7 = i5;
        ByteString byteString2 = byteString;
        int i8 = i4;
        int i9 = i2;
        return getHighlightSettingsResponse.copy(f, i, i9, i3, i8, i7, byteString2);
    }

    public final GetHighlightSettingsResponse copy(float price_movement_threshold, int risk_score_threshold, int max_top_movers_highlights_displayed, int min_highlights_required_for_display, int max_highlights_displayed, int min_equity_holdings_for_display, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetHighlightSettingsResponse(price_movement_threshold, risk_score_threshold, max_top_movers_highlights_displayed, min_highlights_required_for_display, max_highlights_displayed, min_equity_holdings_for_display, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetHighlightSettingsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetHighlightSettingsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: redesign_settings.v1.GetHighlightSettingsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetHighlightSettingsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Float.valueOf(value.getPrice_movement_threshold()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getPrice_movement_threshold()));
                }
                if (value.getRisk_score_threshold() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getRisk_score_threshold()));
                }
                if (value.getMax_top_movers_highlights_displayed() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getMax_top_movers_highlights_displayed()));
                }
                if (value.getMin_highlights_required_for_display() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getMin_highlights_required_for_display()));
                }
                if (value.getMax_highlights_displayed() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getMax_highlights_displayed()));
                }
                return value.getMin_equity_holdings_for_display() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getMin_equity_holdings_for_display())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetHighlightSettingsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Float.valueOf(value.getPrice_movement_threshold()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getPrice_movement_threshold()));
                }
                if (value.getRisk_score_threshold() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getRisk_score_threshold()));
                }
                if (value.getMax_top_movers_highlights_displayed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getMax_top_movers_highlights_displayed()));
                }
                if (value.getMin_highlights_required_for_display() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getMin_highlights_required_for_display()));
                }
                if (value.getMax_highlights_displayed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getMax_highlights_displayed()));
                }
                if (value.getMin_equity_holdings_for_display() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getMin_equity_holdings_for_display()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetHighlightSettingsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMin_equity_holdings_for_display() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getMin_equity_holdings_for_display()));
                }
                if (value.getMax_highlights_displayed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getMax_highlights_displayed()));
                }
                if (value.getMin_highlights_required_for_display() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getMin_highlights_required_for_display()));
                }
                if (value.getMax_top_movers_highlights_displayed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getMax_top_movers_highlights_displayed()));
                }
                if (value.getRisk_score_threshold() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getRisk_score_threshold()));
                }
                if (Float.valueOf(value.getPrice_movement_threshold()).equals(Float.valueOf(0.0f))) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getPrice_movement_threshold()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetHighlightSettingsResponse redact(GetHighlightSettingsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetHighlightSettingsResponse.copy$default(value, 0.0f, 0, 0, 0, 0, 0, ByteString.EMPTY, 63, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetHighlightSettingsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 2:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 3:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 4:
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetHighlightSettingsResponse(fFloatValue, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
