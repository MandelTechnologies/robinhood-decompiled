package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.LeverageEntryPoint;
import crypto_perpetuals.common.p435v1.MarginMode;
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

/* compiled from: GetLeverageOptionsResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016Jx\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006+"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponse;", "Lcom/squareup/wire/Message;", "", "min_leverage", "", "max_leverage", "default_selected_leverage", "message", "contract_id", "margin_mode", "Lcrypto_perpetuals/common/v1/MarginMode;", "entry_point", "Lcrypto_perpetuals/common/v1/LeverageEntryPoint;", "top_of_leverage_range", "leverage_increment", "disclaimer", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginMode;Lcrypto_perpetuals/common/v1/LeverageEntryPoint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMin_leverage", "()Ljava/lang/String;", "getMax_leverage", "getDefault_selected_leverage", "getMessage", "getContract_id", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "getEntry_point", "()Lcrypto_perpetuals/common/v1/LeverageEntryPoint;", "getTop_of_leverage_range", "getLeverage_increment", "getDisclaimer", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetLeverageOptionsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetLeverageOptionsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "defaultSelectedLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String default_selected_leverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final String disclaimer;

    @WireField(adapter = "crypto_perpetuals.common.v1.LeverageEntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final LeverageEntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "leverageIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String leverage_increment;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String max_leverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String min_leverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "topOfLeverageRange", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String top_of_leverage_range;

    public GetLeverageOptionsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ GetLeverageOptionsResponse(String str, String str2, String str3, String str4, String str5, MarginMode marginMode, LeverageEntryPoint leverageEntryPoint, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 64) != 0 ? LeverageEntryPoint.LEVERAGE_ENTRY_POINT_UNSPECIFIED : leverageEntryPoint, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27866newBuilder();
    }

    public final String getMin_leverage() {
        return this.min_leverage;
    }

    public final String getMax_leverage() {
        return this.max_leverage;
    }

    public final String getDefault_selected_leverage() {
        return this.default_selected_leverage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final LeverageEntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final String getTop_of_leverage_range() {
        return this.top_of_leverage_range;
    }

    public final String getLeverage_increment() {
        return this.leverage_increment;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLeverageOptionsResponse(String min_leverage, String max_leverage, String default_selected_leverage, String str, String contract_id, MarginMode margin_mode, LeverageEntryPoint entry_point, String top_of_leverage_range, String leverage_increment, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
        Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
        Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(top_of_leverage_range, "top_of_leverage_range");
        Intrinsics.checkNotNullParameter(leverage_increment, "leverage_increment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min_leverage = min_leverage;
        this.max_leverage = max_leverage;
        this.default_selected_leverage = default_selected_leverage;
        this.message = str;
        this.contract_id = contract_id;
        this.margin_mode = margin_mode;
        this.entry_point = entry_point;
        this.top_of_leverage_range = top_of_leverage_range;
        this.leverage_increment = leverage_increment;
        this.disclaimer = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27866newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLeverageOptionsResponse)) {
            return false;
        }
        GetLeverageOptionsResponse getLeverageOptionsResponse = (GetLeverageOptionsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getLeverageOptionsResponse.unknownFields()) && Intrinsics.areEqual(this.min_leverage, getLeverageOptionsResponse.min_leverage) && Intrinsics.areEqual(this.max_leverage, getLeverageOptionsResponse.max_leverage) && Intrinsics.areEqual(this.default_selected_leverage, getLeverageOptionsResponse.default_selected_leverage) && Intrinsics.areEqual(this.message, getLeverageOptionsResponse.message) && Intrinsics.areEqual(this.contract_id, getLeverageOptionsResponse.contract_id) && this.margin_mode == getLeverageOptionsResponse.margin_mode && this.entry_point == getLeverageOptionsResponse.entry_point && Intrinsics.areEqual(this.top_of_leverage_range, getLeverageOptionsResponse.top_of_leverage_range) && Intrinsics.areEqual(this.leverage_increment, getLeverageOptionsResponse.leverage_increment) && Intrinsics.areEqual(this.disclaimer, getLeverageOptionsResponse.disclaimer);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.min_leverage.hashCode()) * 37) + this.max_leverage.hashCode()) * 37) + this.default_selected_leverage.hashCode()) * 37;
        String str = this.message;
        int iHashCode2 = (((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.contract_id.hashCode()) * 37) + this.margin_mode.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.top_of_leverage_range.hashCode()) * 37) + this.leverage_increment.hashCode()) * 37;
        String str2 = this.disclaimer;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("min_leverage=" + Internal.sanitize(this.min_leverage));
        arrayList.add("max_leverage=" + Internal.sanitize(this.max_leverage));
        arrayList.add("default_selected_leverage=" + Internal.sanitize(this.default_selected_leverage));
        String str = this.message;
        if (str != null) {
            arrayList.add("message=" + Internal.sanitize(str));
        }
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("margin_mode=" + this.margin_mode);
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("top_of_leverage_range=" + Internal.sanitize(this.top_of_leverage_range));
        arrayList.add("leverage_increment=" + Internal.sanitize(this.leverage_increment));
        String str2 = this.disclaimer;
        if (str2 != null) {
            arrayList.add("disclaimer=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLeverageOptionsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLeverageOptionsResponse copy$default(GetLeverageOptionsResponse getLeverageOptionsResponse, String str, String str2, String str3, String str4, String str5, MarginMode marginMode, LeverageEntryPoint leverageEntryPoint, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLeverageOptionsResponse.min_leverage;
        }
        if ((i & 2) != 0) {
            str2 = getLeverageOptionsResponse.max_leverage;
        }
        if ((i & 4) != 0) {
            str3 = getLeverageOptionsResponse.default_selected_leverage;
        }
        if ((i & 8) != 0) {
            str4 = getLeverageOptionsResponse.message;
        }
        if ((i & 16) != 0) {
            str5 = getLeverageOptionsResponse.contract_id;
        }
        if ((i & 32) != 0) {
            marginMode = getLeverageOptionsResponse.margin_mode;
        }
        if ((i & 64) != 0) {
            leverageEntryPoint = getLeverageOptionsResponse.entry_point;
        }
        if ((i & 128) != 0) {
            str6 = getLeverageOptionsResponse.top_of_leverage_range;
        }
        if ((i & 256) != 0) {
            str7 = getLeverageOptionsResponse.leverage_increment;
        }
        if ((i & 512) != 0) {
            str8 = getLeverageOptionsResponse.disclaimer;
        }
        if ((i & 1024) != 0) {
            byteString = getLeverageOptionsResponse.unknownFields();
        }
        String str9 = str8;
        ByteString byteString2 = byteString;
        String str10 = str6;
        String str11 = str7;
        MarginMode marginMode2 = marginMode;
        LeverageEntryPoint leverageEntryPoint2 = leverageEntryPoint;
        String str12 = str5;
        String str13 = str3;
        return getLeverageOptionsResponse.copy(str, str2, str13, str4, str12, marginMode2, leverageEntryPoint2, str10, str11, str9, byteString2);
    }

    public final GetLeverageOptionsResponse copy(String min_leverage, String max_leverage, String default_selected_leverage, String message, String contract_id, MarginMode margin_mode, LeverageEntryPoint entry_point, String top_of_leverage_range, String leverage_increment, String disclaimer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
        Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
        Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(top_of_leverage_range, "top_of_leverage_range");
        Intrinsics.checkNotNullParameter(leverage_increment, "leverage_increment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLeverageOptionsResponse(min_leverage, max_leverage, default_selected_leverage, message, contract_id, margin_mode, entry_point, top_of_leverage_range, leverage_increment, disclaimer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLeverageOptionsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLeverageOptionsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.GetLeverageOptionsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLeverageOptionsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMin_leverage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMin_leverage());
                }
                if (!Intrinsics.areEqual(value.getMax_leverage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMax_leverage());
                }
                if (!Intrinsics.areEqual(value.getDefault_selected_leverage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDefault_selected_leverage());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getMessage());
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getContract_id());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    iEncodedSizeWithTag += MarginMode.ADAPTER.encodedSizeWithTag(6, value.getMargin_mode());
                }
                if (value.getEntry_point() != LeverageEntryPoint.LEVERAGE_ENTRY_POINT_UNSPECIFIED) {
                    iEncodedSizeWithTag += LeverageEntryPoint.ADAPTER.encodedSizeWithTag(7, value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getTop_of_leverage_range(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getTop_of_leverage_range());
                }
                if (!Intrinsics.areEqual(value.getLeverage_increment(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getLeverage_increment());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getDisclaimer());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLeverageOptionsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMin_leverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMin_leverage());
                }
                if (!Intrinsics.areEqual(value.getMax_leverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMax_leverage());
                }
                if (!Intrinsics.areEqual(value.getDefault_selected_leverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDefault_selected_leverage());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMessage());
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getContract_id());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 6, (int) value.getMargin_mode());
                }
                if (value.getEntry_point() != LeverageEntryPoint.LEVERAGE_ENTRY_POINT_UNSPECIFIED) {
                    LeverageEntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getTop_of_leverage_range(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getTop_of_leverage_range());
                }
                if (!Intrinsics.areEqual(value.getLeverage_increment(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getLeverage_increment());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDisclaimer());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLeverageOptionsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDisclaimer());
                if (!Intrinsics.areEqual(value.getLeverage_increment(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getLeverage_increment());
                }
                if (!Intrinsics.areEqual(value.getTop_of_leverage_range(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getTop_of_leverage_range());
                }
                if (value.getEntry_point() != LeverageEntryPoint.LEVERAGE_ENTRY_POINT_UNSPECIFIED) {
                    LeverageEntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 6, (int) value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getContract_id());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMessage());
                if (!Intrinsics.areEqual(value.getDefault_selected_leverage(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDefault_selected_leverage());
                }
                if (!Intrinsics.areEqual(value.getMax_leverage(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getMax_leverage());
                }
                if (Intrinsics.areEqual(value.getMin_leverage(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getMin_leverage());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLeverageOptionsResponse decode(ProtoReader reader) throws IOException {
                LeverageEntryPoint leverageEntryPoint;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarginMode marginMode = MarginMode.MARGIN_MODE_UNSPECIFIED;
                LeverageEntryPoint leverageEntryPoint2 = LeverageEntryPoint.LEVERAGE_ENTRY_POINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = null;
                String strDecode7 = null;
                LeverageEntryPoint leverageEntryPointDecode = leverageEntryPoint2;
                String strDecode8 = strDecode5;
                MarginMode marginModeDecode = marginMode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                leverageEntryPoint = leverageEntryPointDecode;
                                str = strDecode8;
                                try {
                                    marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode8 = str;
                                leverageEntryPointDecode = leverageEntryPoint;
                                break;
                            case 7:
                                try {
                                    leverageEntryPointDecode = LeverageEntryPoint.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    leverageEntryPoint = leverageEntryPointDecode;
                                    str = strDecode8;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                leverageEntryPoint = leverageEntryPointDecode;
                                str = strDecode8;
                                str2 = strDecode;
                                strDecode = str2;
                                strDecode8 = str;
                                leverageEntryPointDecode = leverageEntryPoint;
                                break;
                        }
                    } else {
                        return new GetLeverageOptionsResponse(strDecode8, strDecode, strDecode2, strDecode6, strDecode3, marginModeDecode, leverageEntryPointDecode, strDecode4, strDecode5, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLeverageOptionsResponse redact(GetLeverageOptionsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetLeverageOptionsResponse.copy$default(value, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 1023, null);
            }
        };
    }
}
