package com.robinhood.rosetta.eventlogging;

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
import rosetta.option.StrategyName;

/* compiled from: OptionsChainCustomizationContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContext;", "Lcom/squareup/wire/Message;", "", "order_side", "", "strategy", "Lrosetta/option/StrategyName;", "selected_category", "previous_metric_one", "previous_metric_two", "metric_one", "metric_two", "metrics", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/option/StrategyName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getOrder_side", "()Ljava/lang/String;", "getStrategy", "()Lrosetta/option/StrategyName;", "getSelected_category", "getPrevious_metric_one", "getPrevious_metric_two", "getMetric_one", "getMetric_two", "getMetrics", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionsChainCustomizationContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionsChainCustomizationContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricOne", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String metric_one;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricTwo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String metric_two;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final java.util.List<String> metrics;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousMetricOne", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String previous_metric_one;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousMetricTwo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String previous_metric_two;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String selected_category;

    @WireField(adapter = "rosetta.option.StrategyName#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final StrategyName strategy;

    public OptionsChainCustomizationContext() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ OptionsChainCustomizationContext(String str, StrategyName strategyName, String str2, String str3, String str4, String str5, String str6, java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StrategyName.STRATEGY_NAME_UNSPECIFIED : strategyName, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24442newBuilder();
    }

    public final String getOrder_side() {
        return this.order_side;
    }

    public final StrategyName getStrategy() {
        return this.strategy;
    }

    public final String getSelected_category() {
        return this.selected_category;
    }

    public final String getPrevious_metric_one() {
        return this.previous_metric_one;
    }

    public final String getPrevious_metric_two() {
        return this.previous_metric_two;
    }

    public final String getMetric_one() {
        return this.metric_one;
    }

    public final String getMetric_two() {
        return this.metric_two;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsChainCustomizationContext(String order_side, StrategyName strategy, String selected_category, String previous_metric_one, String previous_metric_two, String metric_one, String metric_two, java.util.List<String> metrics, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(selected_category, "selected_category");
        Intrinsics.checkNotNullParameter(previous_metric_one, "previous_metric_one");
        Intrinsics.checkNotNullParameter(previous_metric_two, "previous_metric_two");
        Intrinsics.checkNotNullParameter(metric_one, "metric_one");
        Intrinsics.checkNotNullParameter(metric_two, "metric_two");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_side = order_side;
        this.strategy = strategy;
        this.selected_category = selected_category;
        this.previous_metric_one = previous_metric_one;
        this.previous_metric_two = previous_metric_two;
        this.metric_one = metric_one;
        this.metric_two = metric_two;
        this.metrics = Internal.immutableCopyOf("metrics", metrics);
    }

    public final java.util.List<String> getMetrics() {
        return this.metrics;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24442newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionsChainCustomizationContext)) {
            return false;
        }
        OptionsChainCustomizationContext optionsChainCustomizationContext = (OptionsChainCustomizationContext) other;
        return Intrinsics.areEqual(unknownFields(), optionsChainCustomizationContext.unknownFields()) && Intrinsics.areEqual(this.order_side, optionsChainCustomizationContext.order_side) && this.strategy == optionsChainCustomizationContext.strategy && Intrinsics.areEqual(this.selected_category, optionsChainCustomizationContext.selected_category) && Intrinsics.areEqual(this.previous_metric_one, optionsChainCustomizationContext.previous_metric_one) && Intrinsics.areEqual(this.previous_metric_two, optionsChainCustomizationContext.previous_metric_two) && Intrinsics.areEqual(this.metric_one, optionsChainCustomizationContext.metric_one) && Intrinsics.areEqual(this.metric_two, optionsChainCustomizationContext.metric_two) && Intrinsics.areEqual(this.metrics, optionsChainCustomizationContext.metrics);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.order_side.hashCode()) * 37) + this.strategy.hashCode()) * 37) + this.selected_category.hashCode()) * 37) + this.previous_metric_one.hashCode()) * 37) + this.previous_metric_two.hashCode()) * 37) + this.metric_one.hashCode()) * 37) + this.metric_two.hashCode()) * 37) + this.metrics.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_side=" + Internal.sanitize(this.order_side));
        arrayList.add("strategy=" + this.strategy);
        arrayList.add("selected_category=" + Internal.sanitize(this.selected_category));
        arrayList.add("previous_metric_one=" + Internal.sanitize(this.previous_metric_one));
        arrayList.add("previous_metric_two=" + Internal.sanitize(this.previous_metric_two));
        arrayList.add("metric_one=" + Internal.sanitize(this.metric_one));
        arrayList.add("metric_two=" + Internal.sanitize(this.metric_two));
        if (!this.metrics.isEmpty()) {
            arrayList.add("metrics=" + Internal.sanitize(this.metrics));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionsChainCustomizationContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionsChainCustomizationContext copy$default(OptionsChainCustomizationContext optionsChainCustomizationContext, String str, StrategyName strategyName, String str2, String str3, String str4, String str5, String str6, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsChainCustomizationContext.order_side;
        }
        if ((i & 2) != 0) {
            strategyName = optionsChainCustomizationContext.strategy;
        }
        if ((i & 4) != 0) {
            str2 = optionsChainCustomizationContext.selected_category;
        }
        if ((i & 8) != 0) {
            str3 = optionsChainCustomizationContext.previous_metric_one;
        }
        if ((i & 16) != 0) {
            str4 = optionsChainCustomizationContext.previous_metric_two;
        }
        if ((i & 32) != 0) {
            str5 = optionsChainCustomizationContext.metric_one;
        }
        if ((i & 64) != 0) {
            str6 = optionsChainCustomizationContext.metric_two;
        }
        if ((i & 128) != 0) {
            list = optionsChainCustomizationContext.metrics;
        }
        if ((i & 256) != 0) {
            byteString = optionsChainCustomizationContext.unknownFields();
        }
        java.util.List list2 = list;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return optionsChainCustomizationContext.copy(str, strategyName, str10, str3, str9, str7, str8, list2, byteString2);
    }

    public final OptionsChainCustomizationContext copy(String order_side, StrategyName strategy, String selected_category, String previous_metric_one, String previous_metric_two, String metric_one, String metric_two, java.util.List<String> metrics, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(selected_category, "selected_category");
        Intrinsics.checkNotNullParameter(previous_metric_one, "previous_metric_one");
        Intrinsics.checkNotNullParameter(previous_metric_two, "previous_metric_two");
        Intrinsics.checkNotNullParameter(metric_one, "metric_one");
        Intrinsics.checkNotNullParameter(metric_two, "metric_two");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionsChainCustomizationContext(order_side, strategy, selected_category, previous_metric_one, previous_metric_two, metric_one, metric_two, metrics, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionsChainCustomizationContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionsChainCustomizationContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionsChainCustomizationContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_side(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_side());
                }
                if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                    size += StrategyName.ADAPTER.encodedSizeWithTag(2, value.getStrategy());
                }
                if (!Intrinsics.areEqual(value.getSelected_category(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSelected_category());
                }
                if (!Intrinsics.areEqual(value.getPrevious_metric_one(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrevious_metric_one());
                }
                if (!Intrinsics.areEqual(value.getPrevious_metric_two(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPrevious_metric_two());
                }
                if (!Intrinsics.areEqual(value.getMetric_one(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMetric_one());
                }
                if (!Intrinsics.areEqual(value.getMetric_two(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMetric_two());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, value.getMetrics());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionsChainCustomizationContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_side(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_side());
                }
                if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                    StrategyName.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategy());
                }
                if (!Intrinsics.areEqual(value.getSelected_category(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSelected_category());
                }
                if (!Intrinsics.areEqual(value.getPrevious_metric_one(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrevious_metric_one());
                }
                if (!Intrinsics.areEqual(value.getPrevious_metric_two(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrevious_metric_two());
                }
                if (!Intrinsics.areEqual(value.getMetric_one(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMetric_one());
                }
                if (!Intrinsics.areEqual(value.getMetric_two(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMetric_two());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 8, (int) value.getMetrics());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionsChainCustomizationContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 8, (int) value.getMetrics());
                if (!Intrinsics.areEqual(value.getMetric_two(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getMetric_two());
                }
                if (!Intrinsics.areEqual(value.getMetric_one(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getMetric_one());
                }
                if (!Intrinsics.areEqual(value.getPrevious_metric_two(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getPrevious_metric_two());
                }
                if (!Intrinsics.areEqual(value.getPrevious_metric_one(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getPrevious_metric_one());
                }
                if (!Intrinsics.areEqual(value.getSelected_category(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSelected_category());
                }
                if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                    StrategyName.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategy());
                }
                if (Intrinsics.areEqual(value.getOrder_side(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_side());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionsChainCustomizationContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                StrategyName strategyNameDecode = StrategyName.STRATEGY_NAME_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    StrategyName strategyName = strategyNameDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        strategyNameDecode = StrategyName.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    arrayList.add(ProtoAdapter.STRING.decode(reader));
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new OptionsChainCustomizationContext(strDecode, strategyName, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionsChainCustomizationContext redact(OptionsChainCustomizationContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionsChainCustomizationContext.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, 255, null);
            }
        };
    }
}
