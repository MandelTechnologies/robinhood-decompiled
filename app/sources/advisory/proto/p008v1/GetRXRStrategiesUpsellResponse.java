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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetRXRStrategiesUpsellResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesUpsellResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "value_props", "Ladvisory/proto/v1/GetRXRStrategiesValueProps;", "intro", "Ladvisory/proto/v1/GetRXRStrategiesIntro;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Ladvisory/proto/v1/GetRXRStrategiesBanner;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/GetRXRStrategiesValueProps;Ladvisory/proto/v1/GetRXRStrategiesIntro;Ladvisory/proto/v1/GetRXRStrategiesBanner;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getValue_props", "()Ladvisory/proto/v1/GetRXRStrategiesValueProps;", "getIntro", "()Ladvisory/proto/v1/GetRXRStrategiesIntro;", "getBanner", "()Ladvisory/proto/v1/GetRXRStrategiesBanner;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRXRStrategiesUpsellResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetRXRStrategiesUpsellResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.GetRXRStrategiesBanner#ADAPTER", schemaIndex = 3, tag = 4)
    private final GetRXRStrategiesBanner banner;

    @WireField(adapter = "advisory.proto.v1.GetRXRStrategiesIntro#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final GetRXRStrategiesIntro intro;

    @WireField(adapter = "advisory.proto.v1.GetRXRStrategiesValueProps#ADAPTER", jsonName = "valueProps", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final GetRXRStrategiesValueProps value_props;

    public GetRXRStrategiesUpsellResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4470newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetRXRStrategiesUpsellResponse(String str, GetRXRStrategiesValueProps getRXRStrategiesValueProps, GetRXRStrategiesIntro getRXRStrategiesIntro, GetRXRStrategiesBanner getRXRStrategiesBanner, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : getRXRStrategiesValueProps, (i & 4) != 0 ? null : getRXRStrategiesIntro, (i & 8) != 0 ? null : getRXRStrategiesBanner, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final GetRXRStrategiesValueProps getValue_props() {
        return this.value_props;
    }

    public final GetRXRStrategiesIntro getIntro() {
        return this.intro;
    }

    public final GetRXRStrategiesBanner getBanner() {
        return this.banner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRXRStrategiesUpsellResponse(String account_number, GetRXRStrategiesValueProps getRXRStrategiesValueProps, GetRXRStrategiesIntro getRXRStrategiesIntro, GetRXRStrategiesBanner getRXRStrategiesBanner, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.value_props = getRXRStrategiesValueProps;
        this.intro = getRXRStrategiesIntro;
        this.banner = getRXRStrategiesBanner;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4470newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRXRStrategiesUpsellResponse)) {
            return false;
        }
        GetRXRStrategiesUpsellResponse getRXRStrategiesUpsellResponse = (GetRXRStrategiesUpsellResponse) other;
        return Intrinsics.areEqual(unknownFields(), getRXRStrategiesUpsellResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getRXRStrategiesUpsellResponse.account_number) && Intrinsics.areEqual(this.value_props, getRXRStrategiesUpsellResponse.value_props) && Intrinsics.areEqual(this.intro, getRXRStrategiesUpsellResponse.intro) && Intrinsics.areEqual(this.banner, getRXRStrategiesUpsellResponse.banner);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        GetRXRStrategiesValueProps getRXRStrategiesValueProps = this.value_props;
        int iHashCode2 = (iHashCode + (getRXRStrategiesValueProps != null ? getRXRStrategiesValueProps.hashCode() : 0)) * 37;
        GetRXRStrategiesIntro getRXRStrategiesIntro = this.intro;
        int iHashCode3 = (iHashCode2 + (getRXRStrategiesIntro != null ? getRXRStrategiesIntro.hashCode() : 0)) * 37;
        GetRXRStrategiesBanner getRXRStrategiesBanner = this.banner;
        int iHashCode4 = iHashCode3 + (getRXRStrategiesBanner != null ? getRXRStrategiesBanner.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        GetRXRStrategiesValueProps getRXRStrategiesValueProps = this.value_props;
        if (getRXRStrategiesValueProps != null) {
            arrayList.add("value_props=" + getRXRStrategiesValueProps);
        }
        GetRXRStrategiesIntro getRXRStrategiesIntro = this.intro;
        if (getRXRStrategiesIntro != null) {
            arrayList.add("intro=" + getRXRStrategiesIntro);
        }
        GetRXRStrategiesBanner getRXRStrategiesBanner = this.banner;
        if (getRXRStrategiesBanner != null) {
            arrayList.add("banner=" + getRXRStrategiesBanner);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRXRStrategiesUpsellResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRXRStrategiesUpsellResponse copy$default(GetRXRStrategiesUpsellResponse getRXRStrategiesUpsellResponse, String str, GetRXRStrategiesValueProps getRXRStrategiesValueProps, GetRXRStrategiesIntro getRXRStrategiesIntro, GetRXRStrategiesBanner getRXRStrategiesBanner, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRXRStrategiesUpsellResponse.account_number;
        }
        if ((i & 2) != 0) {
            getRXRStrategiesValueProps = getRXRStrategiesUpsellResponse.value_props;
        }
        if ((i & 4) != 0) {
            getRXRStrategiesIntro = getRXRStrategiesUpsellResponse.intro;
        }
        if ((i & 8) != 0) {
            getRXRStrategiesBanner = getRXRStrategiesUpsellResponse.banner;
        }
        if ((i & 16) != 0) {
            byteString = getRXRStrategiesUpsellResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        GetRXRStrategiesIntro getRXRStrategiesIntro2 = getRXRStrategiesIntro;
        return getRXRStrategiesUpsellResponse.copy(str, getRXRStrategiesValueProps, getRXRStrategiesIntro2, getRXRStrategiesBanner, byteString2);
    }

    public final GetRXRStrategiesUpsellResponse copy(String account_number, GetRXRStrategiesValueProps value_props, GetRXRStrategiesIntro intro, GetRXRStrategiesBanner banner, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRXRStrategiesUpsellResponse(account_number, value_props, intro, banner, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRXRStrategiesUpsellResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRXRStrategiesUpsellResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetRXRStrategiesUpsellResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRXRStrategiesUpsellResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getValue_props() != null) {
                    size += GetRXRStrategiesValueProps.ADAPTER.encodedSizeWithTag(2, value.getValue_props());
                }
                if (value.getIntro() != null) {
                    size += GetRXRStrategiesIntro.ADAPTER.encodedSizeWithTag(3, value.getIntro());
                }
                return size + GetRXRStrategiesBanner.ADAPTER.encodedSizeWithTag(4, value.getBanner());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRXRStrategiesUpsellResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getValue_props() != null) {
                    GetRXRStrategiesValueProps.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue_props());
                }
                if (value.getIntro() != null) {
                    GetRXRStrategiesIntro.ADAPTER.encodeWithTag(writer, 3, (int) value.getIntro());
                }
                GetRXRStrategiesBanner.ADAPTER.encodeWithTag(writer, 4, (int) value.getBanner());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRXRStrategiesUpsellResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetRXRStrategiesBanner.ADAPTER.encodeWithTag(writer, 4, (int) value.getBanner());
                if (value.getIntro() != null) {
                    GetRXRStrategiesIntro.ADAPTER.encodeWithTag(writer, 3, (int) value.getIntro());
                }
                if (value.getValue_props() != null) {
                    GetRXRStrategiesValueProps.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue_props());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRXRStrategiesUpsellResponse redact(GetRXRStrategiesUpsellResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetRXRStrategiesValueProps value_props = value.getValue_props();
                GetRXRStrategiesValueProps getRXRStrategiesValuePropsRedact = value_props != null ? GetRXRStrategiesValueProps.ADAPTER.redact(value_props) : null;
                GetRXRStrategiesIntro intro = value.getIntro();
                GetRXRStrategiesIntro getRXRStrategiesIntroRedact = intro != null ? GetRXRStrategiesIntro.ADAPTER.redact(intro) : null;
                GetRXRStrategiesBanner banner = value.getBanner();
                return GetRXRStrategiesUpsellResponse.copy$default(value, null, getRXRStrategiesValuePropsRedact, getRXRStrategiesIntroRedact, banner != null ? GetRXRStrategiesBanner.ADAPTER.redact(banner) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetRXRStrategiesUpsellResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                GetRXRStrategiesValueProps getRXRStrategiesValuePropsDecode = null;
                GetRXRStrategiesIntro getRXRStrategiesIntroDecode = null;
                GetRXRStrategiesBanner getRXRStrategiesBannerDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRXRStrategiesUpsellResponse(strDecode, getRXRStrategiesValuePropsDecode, getRXRStrategiesIntroDecode, getRXRStrategiesBannerDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        getRXRStrategiesValuePropsDecode = GetRXRStrategiesValueProps.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        getRXRStrategiesIntroDecode = GetRXRStrategiesIntro.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        getRXRStrategiesBannerDecode = GetRXRStrategiesBanner.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
