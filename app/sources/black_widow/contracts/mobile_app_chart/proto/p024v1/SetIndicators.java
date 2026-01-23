package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: SetIndicators.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J0\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicators;", "Lcom/squareup/wire/Message;", "", "indicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/Indicator;", "popular_indicators", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getIndicators", "()Ljava/util/List;", "getPopular_indicators", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetIndicators extends Message {

    @JvmField
    public static final ProtoAdapter<SetIndicators> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.Indicator#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Indicator> indicators;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "popularIndicators", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> popular_indicators;

    public SetIndicators() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8658newBuilder();
    }

    public /* synthetic */ SetIndicators(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetIndicators(List<Indicator> indicators, List<String> popular_indicators, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(popular_indicators, "popular_indicators");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.indicators = Internal.immutableCopyOf("indicators", indicators);
        this.popular_indicators = Internal.immutableCopyOf("popular_indicators", popular_indicators);
    }

    public final List<Indicator> getIndicators() {
        return this.indicators;
    }

    public final List<String> getPopular_indicators() {
        return this.popular_indicators;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8658newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetIndicators)) {
            return false;
        }
        SetIndicators setIndicators = (SetIndicators) other;
        return Intrinsics.areEqual(unknownFields(), setIndicators.unknownFields()) && Intrinsics.areEqual(this.indicators, setIndicators.indicators) && Intrinsics.areEqual(this.popular_indicators, setIndicators.popular_indicators);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.indicators.hashCode()) * 37) + this.popular_indicators.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.indicators.isEmpty()) {
            arrayList.add("indicators=" + this.indicators);
        }
        if (!this.popular_indicators.isEmpty()) {
            arrayList.add("popular_indicators=" + Internal.sanitize(this.popular_indicators));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetIndicators{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetIndicators copy$default(SetIndicators setIndicators, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = setIndicators.indicators;
        }
        if ((i & 2) != 0) {
            list2 = setIndicators.popular_indicators;
        }
        if ((i & 4) != 0) {
            byteString = setIndicators.unknownFields();
        }
        return setIndicators.copy(list, list2, byteString);
    }

    public final SetIndicators copy(List<Indicator> indicators, List<String> popular_indicators, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(popular_indicators, "popular_indicators");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetIndicators(indicators, popular_indicators, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetIndicators.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetIndicators>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetIndicators$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetIndicators value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Indicator.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getIndicators()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getPopular_indicators());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetIndicators value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Indicator.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getIndicators());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getPopular_indicators());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetIndicators value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getPopular_indicators());
                Indicator.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getIndicators());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetIndicators decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetIndicators(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(Indicator.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetIndicators redact(SetIndicators value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SetIndicators.copy$default(value, Internal.m26823redactElements(value.getIndicators(), Indicator.ADAPTER), null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
