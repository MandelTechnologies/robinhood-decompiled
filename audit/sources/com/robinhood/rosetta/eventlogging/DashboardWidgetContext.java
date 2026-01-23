package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.eventlogging.DashboardWidgetContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: DashboardWidgetContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext;", "Lcom/squareup/wire/Message;", "", "sorting_key", "", "sorting_order", "chart_customization", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;Lokio/ByteString;)V", "getSorting_key", "()Ljava/lang/String;", "getSorting_order", "getChart_customization", "()Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ChartCustomization", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DashboardWidgetContext extends Message {

    @JvmField
    public static final ProtoAdapter<DashboardWidgetContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DashboardWidgetContext$ChartCustomization#ADAPTER", jsonName = "chartCustomization", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ChartCustomization chart_customization;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortingKey", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String sorting_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortingOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sorting_order;

    public DashboardWidgetContext() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DashboardWidgetContext(String str, String str2, ChartCustomization chartCustomization, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ChartCustomization.UNSPECIFIED : chartCustomization, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24181newBuilder();
    }

    public final String getSorting_key() {
        return this.sorting_key;
    }

    public final String getSorting_order() {
        return this.sorting_order;
    }

    public final ChartCustomization getChart_customization() {
        return this.chart_customization;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardWidgetContext(String sorting_key, String sorting_order, ChartCustomization chart_customization, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sorting_key, "sorting_key");
        Intrinsics.checkNotNullParameter(sorting_order, "sorting_order");
        Intrinsics.checkNotNullParameter(chart_customization, "chart_customization");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sorting_key = sorting_key;
        this.sorting_order = sorting_order;
        this.chart_customization = chart_customization;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24181newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DashboardWidgetContext)) {
            return false;
        }
        DashboardWidgetContext dashboardWidgetContext = (DashboardWidgetContext) other;
        return Intrinsics.areEqual(unknownFields(), dashboardWidgetContext.unknownFields()) && Intrinsics.areEqual(this.sorting_key, dashboardWidgetContext.sorting_key) && Intrinsics.areEqual(this.sorting_order, dashboardWidgetContext.sorting_order) && this.chart_customization == dashboardWidgetContext.chart_customization;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.sorting_key.hashCode()) * 37) + this.sorting_order.hashCode()) * 37) + this.chart_customization.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sorting_key=" + Internal.sanitize(this.sorting_key));
        arrayList.add("sorting_order=" + Internal.sanitize(this.sorting_order));
        arrayList.add("chart_customization=" + this.chart_customization);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DashboardWidgetContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DashboardWidgetContext copy$default(DashboardWidgetContext dashboardWidgetContext, String str, String str2, ChartCustomization chartCustomization, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardWidgetContext.sorting_key;
        }
        if ((i & 2) != 0) {
            str2 = dashboardWidgetContext.sorting_order;
        }
        if ((i & 4) != 0) {
            chartCustomization = dashboardWidgetContext.chart_customization;
        }
        if ((i & 8) != 0) {
            byteString = dashboardWidgetContext.unknownFields();
        }
        return dashboardWidgetContext.copy(str, str2, chartCustomization, byteString);
    }

    public final DashboardWidgetContext copy(String sorting_key, String sorting_order, ChartCustomization chart_customization, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sorting_key, "sorting_key");
        Intrinsics.checkNotNullParameter(sorting_order, "sorting_order");
        Intrinsics.checkNotNullParameter(chart_customization, "chart_customization");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DashboardWidgetContext(sorting_key, sorting_order, chart_customization, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DashboardWidgetContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DashboardWidgetContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DashboardWidgetContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DashboardWidgetContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSorting_key(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSorting_key());
                }
                if (!Intrinsics.areEqual(value.getSorting_order(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSorting_order());
                }
                return value.getChart_customization() != DashboardWidgetContext.ChartCustomization.UNSPECIFIED ? size + DashboardWidgetContext.ChartCustomization.ADAPTER.encodedSizeWithTag(3, value.getChart_customization()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DashboardWidgetContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSorting_key(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSorting_key());
                }
                if (!Intrinsics.areEqual(value.getSorting_order(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSorting_order());
                }
                if (value.getChart_customization() != DashboardWidgetContext.ChartCustomization.UNSPECIFIED) {
                    DashboardWidgetContext.ChartCustomization.ADAPTER.encodeWithTag(writer, 3, (int) value.getChart_customization());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DashboardWidgetContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getChart_customization() != DashboardWidgetContext.ChartCustomization.UNSPECIFIED) {
                    DashboardWidgetContext.ChartCustomization.ADAPTER.encodeWithTag(writer, 3, (int) value.getChart_customization());
                }
                if (!Intrinsics.areEqual(value.getSorting_order(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSorting_order());
                }
                if (Intrinsics.areEqual(value.getSorting_key(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSorting_key());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DashboardWidgetContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DashboardWidgetContext.ChartCustomization chartCustomizationDecode = DashboardWidgetContext.ChartCustomization.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DashboardWidgetContext(strDecode, strDecode2, chartCustomizationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            chartCustomizationDecode = DashboardWidgetContext.ChartCustomization.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DashboardWidgetContext redact(DashboardWidgetContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DashboardWidgetContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DashboardWidgetContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "LINE_CHART", "ADVANCED_CHART", "CONTRIBUTION_CHART", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartCustomization implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartCustomization[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChartCustomization> ADAPTER;
        public static final ChartCustomization ADVANCED_CHART;
        public static final ChartCustomization CONTRIBUTION_CHART;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChartCustomization LINE_CHART;
        public static final ChartCustomization UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ ChartCustomization[] $values() {
            return new ChartCustomization[]{UNSPECIFIED, LINE_CHART, ADVANCED_CHART, CONTRIBUTION_CHART};
        }

        @JvmStatic
        public static final ChartCustomization fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChartCustomization> getEntries() {
            return $ENTRIES;
        }

        private ChartCustomization(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChartCustomization chartCustomization = new ChartCustomization(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = chartCustomization;
            LINE_CHART = new ChartCustomization("LINE_CHART", 1, 1);
            ADVANCED_CHART = new ChartCustomization("ADVANCED_CHART", 2, 2);
            CONTRIBUTION_CHART = new ChartCustomization("CONTRIBUTION_CHART", 3, 3);
            ChartCustomization[] chartCustomizationArr$values = $values();
            $VALUES = chartCustomizationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartCustomizationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartCustomization.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChartCustomization>(orCreateKotlinClass, syntax, chartCustomization) { // from class: com.robinhood.rosetta.eventlogging.DashboardWidgetContext$ChartCustomization$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DashboardWidgetContext.ChartCustomization fromValue(int value) {
                    return DashboardWidgetContext.ChartCustomization.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DashboardWidgetContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DashboardWidgetContext$ChartCustomization;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChartCustomization fromValue(int value) {
                if (value == 0) {
                    return ChartCustomization.UNSPECIFIED;
                }
                if (value == 1) {
                    return ChartCustomization.LINE_CHART;
                }
                if (value == 2) {
                    return ChartCustomization.ADVANCED_CHART;
                }
                if (value != 3) {
                    return null;
                }
                return ChartCustomization.CONTRIBUTION_CHART;
            }
        }

        public static ChartCustomization valueOf(String str) {
            return (ChartCustomization) Enum.valueOf(ChartCustomization.class, str);
        }

        public static ChartCustomization[] values() {
            return (ChartCustomization[]) $VALUES.clone();
        }
    }
}
