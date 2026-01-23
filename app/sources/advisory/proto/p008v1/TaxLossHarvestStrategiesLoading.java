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

/* compiled from: TaxLossHarvestStrategiesLoading.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;", "Lcom/squareup/wire/Message;", "", "lottie_url_dark", "", "lottie_url_light", "loading_titles", "", "min_loading_time", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DLokio/ByteString;)V", "getLottie_url_dark", "()Ljava/lang/String;", "getLottie_url_light", "getMin_loading_time", "()D", "getLoading_titles", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategiesLoading extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategiesLoading> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loadingTitles", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> loading_titles;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String lottie_url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String lottie_url_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "minLoadingTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double min_loading_time;

    public TaxLossHarvestStrategiesLoading() {
        this(null, null, null, 0.0d, null, 31, null);
    }

    public /* synthetic */ TaxLossHarvestStrategiesLoading(String str, String str2, List list, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4561newBuilder();
    }

    public final String getLottie_url_dark() {
        return this.lottie_url_dark;
    }

    public final String getLottie_url_light() {
        return this.lottie_url_light;
    }

    public final double getMin_loading_time() {
        return this.min_loading_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategiesLoading(String lottie_url_dark, String lottie_url_light, List<String> loading_titles, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lottie_url_dark, "lottie_url_dark");
        Intrinsics.checkNotNullParameter(lottie_url_light, "lottie_url_light");
        Intrinsics.checkNotNullParameter(loading_titles, "loading_titles");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.lottie_url_dark = lottie_url_dark;
        this.lottie_url_light = lottie_url_light;
        this.min_loading_time = d;
        this.loading_titles = Internal.immutableCopyOf("loading_titles", loading_titles);
    }

    public final List<String> getLoading_titles() {
        return this.loading_titles;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4561newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestStrategiesLoading)) {
            return false;
        }
        TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading = (TaxLossHarvestStrategiesLoading) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestStrategiesLoading.unknownFields()) && Intrinsics.areEqual(this.lottie_url_dark, taxLossHarvestStrategiesLoading.lottie_url_dark) && Intrinsics.areEqual(this.lottie_url_light, taxLossHarvestStrategiesLoading.lottie_url_light) && Intrinsics.areEqual(this.loading_titles, taxLossHarvestStrategiesLoading.loading_titles) && this.min_loading_time == taxLossHarvestStrategiesLoading.min_loading_time;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.lottie_url_dark.hashCode()) * 37) + this.lottie_url_light.hashCode()) * 37) + this.loading_titles.hashCode()) * 37) + Double.hashCode(this.min_loading_time);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lottie_url_dark=" + Internal.sanitize(this.lottie_url_dark));
        arrayList.add("lottie_url_light=" + Internal.sanitize(this.lottie_url_light));
        if (!this.loading_titles.isEmpty()) {
            arrayList.add("loading_titles=" + Internal.sanitize(this.loading_titles));
        }
        arrayList.add("min_loading_time=" + this.min_loading_time);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestStrategiesLoading{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestStrategiesLoading copy$default(TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, String str, String str2, List list, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestStrategiesLoading.lottie_url_dark;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestStrategiesLoading.lottie_url_light;
        }
        if ((i & 4) != 0) {
            list = taxLossHarvestStrategiesLoading.loading_titles;
        }
        if ((i & 8) != 0) {
            d = taxLossHarvestStrategiesLoading.min_loading_time;
        }
        if ((i & 16) != 0) {
            byteString = taxLossHarvestStrategiesLoading.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return taxLossHarvestStrategiesLoading.copy(str, str2, list2, d, byteString2);
    }

    public final TaxLossHarvestStrategiesLoading copy(String lottie_url_dark, String lottie_url_light, List<String> loading_titles, double min_loading_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lottie_url_dark, "lottie_url_dark");
        Intrinsics.checkNotNullParameter(lottie_url_light, "lottie_url_light");
        Intrinsics.checkNotNullParameter(loading_titles, "loading_titles");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestStrategiesLoading(lottie_url_dark, lottie_url_light, loading_titles, min_loading_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategiesLoading.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestStrategiesLoading>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestStrategiesLoading$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestStrategiesLoading value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLottie_url_dark(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLottie_url_dark());
                }
                if (!Intrinsics.areEqual(value.getLottie_url_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLottie_url_light());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.getLoading_titles());
                return !Double.valueOf(value.getMin_loading_time()).equals(Double.valueOf(0.0d)) ? iEncodedSizeWithTag + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getMin_loading_time())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestStrategiesLoading value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLottie_url_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLottie_url_dark());
                }
                if (!Intrinsics.areEqual(value.getLottie_url_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLottie_url_light());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, (int) value.getLoading_titles());
                if (!Double.valueOf(value.getMin_loading_time()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getMin_loading_time()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestStrategiesLoading value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getMin_loading_time()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getMin_loading_time()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getLoading_titles());
                if (!Intrinsics.areEqual(value.getLottie_url_light(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getLottie_url_light());
                }
                if (Intrinsics.areEqual(value.getLottie_url_dark(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLottie_url_dark());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategiesLoading decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestStrategiesLoading(strDecode, strDecode2, arrayList, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 4) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategiesLoading redact(TaxLossHarvestStrategiesLoading value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLossHarvestStrategiesLoading.copy$default(value, null, null, null, 0.0d, ByteString.EMPTY, 15, null);
            }
        };
    }
}
