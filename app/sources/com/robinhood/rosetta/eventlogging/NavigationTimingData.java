package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NavigationTimingData;
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

/* compiled from: NavigationTimingData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingData;", "Lcom/squareup/wire/Message;", "", "duration_type", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "navigation_type", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "duration_ms", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;DLokio/ByteString;)V", "getDuration_type", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "getNavigation_type", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "getDuration_ms", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "DurationType", "NavigationType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NavigationTimingData extends Message {

    @JvmField
    public static final ProtoAdapter<NavigationTimingData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "durationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double duration_ms;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NavigationTimingData$DurationType#ADAPTER", jsonName = "durationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DurationType duration_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NavigationTimingData$NavigationType#ADAPTER", jsonName = "navigationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final NavigationType navigation_type;

    public NavigationTimingData() {
        this(null, null, 0.0d, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24392newBuilder();
    }

    public final DurationType getDuration_type() {
        return this.duration_type;
    }

    public /* synthetic */ NavigationTimingData(DurationType durationType, NavigationType navigationType, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DurationType.DURATION_TYPE_UNSPECIFIED : durationType, (i & 2) != 0 ? NavigationType.NAVIGATION_TYPE_UNSPECIFIED : navigationType, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final NavigationType getNavigation_type() {
        return this.navigation_type;
    }

    public final double getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationTimingData(DurationType duration_type, NavigationType navigation_type, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(duration_type, "duration_type");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.duration_type = duration_type;
        this.navigation_type = navigation_type;
        this.duration_ms = d;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24392newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NavigationTimingData)) {
            return false;
        }
        NavigationTimingData navigationTimingData = (NavigationTimingData) other;
        return Intrinsics.areEqual(unknownFields(), navigationTimingData.unknownFields()) && this.duration_type == navigationTimingData.duration_type && this.navigation_type == navigationTimingData.navigation_type && this.duration_ms == navigationTimingData.duration_ms;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.duration_type.hashCode()) * 37) + this.navigation_type.hashCode()) * 37) + Double.hashCode(this.duration_ms);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("duration_type=" + this.duration_type);
        arrayList.add("navigation_type=" + this.navigation_type);
        arrayList.add("duration_ms=" + this.duration_ms);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationTimingData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NavigationTimingData copy$default(NavigationTimingData navigationTimingData, DurationType durationType, NavigationType navigationType, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            durationType = navigationTimingData.duration_type;
        }
        if ((i & 2) != 0) {
            navigationType = navigationTimingData.navigation_type;
        }
        if ((i & 4) != 0) {
            d = navigationTimingData.duration_ms;
        }
        if ((i & 8) != 0) {
            byteString = navigationTimingData.unknownFields();
        }
        ByteString byteString2 = byteString;
        return navigationTimingData.copy(durationType, navigationType, d, byteString2);
    }

    public final NavigationTimingData copy(DurationType duration_type, NavigationType navigation_type, double duration_ms, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(duration_type, "duration_type");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NavigationTimingData(duration_type, navigation_type, duration_ms, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NavigationTimingData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NavigationTimingData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NavigationTimingData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NavigationTimingData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDuration_type() != NavigationTimingData.DurationType.DURATION_TYPE_UNSPECIFIED) {
                    size += NavigationTimingData.DurationType.ADAPTER.encodedSizeWithTag(1, value.getDuration_type());
                }
                if (value.getNavigation_type() != NavigationTimingData.NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                    size += NavigationTimingData.NavigationType.ADAPTER.encodedSizeWithTag(2, value.getNavigation_type());
                }
                return !Double.valueOf(value.getDuration_ms()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getDuration_ms())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NavigationTimingData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDuration_type() != NavigationTimingData.DurationType.DURATION_TYPE_UNSPECIFIED) {
                    NavigationTimingData.DurationType.ADAPTER.encodeWithTag(writer, 1, (int) value.getDuration_type());
                }
                if (value.getNavigation_type() != NavigationTimingData.NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                    NavigationTimingData.NavigationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigation_type());
                }
                if (!Double.valueOf(value.getDuration_ms()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDuration_ms()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NavigationTimingData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getDuration_ms()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDuration_ms()));
                }
                if (value.getNavigation_type() != NavigationTimingData.NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                    NavigationTimingData.NavigationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigation_type());
                }
                if (value.getDuration_type() != NavigationTimingData.DurationType.DURATION_TYPE_UNSPECIFIED) {
                    NavigationTimingData.DurationType.ADAPTER.encodeWithTag(writer, 1, (int) value.getDuration_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NavigationTimingData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NavigationTimingData.DurationType durationTypeDecode = NavigationTimingData.DurationType.DURATION_TYPE_UNSPECIFIED;
                NavigationTimingData.NavigationType navigationType = NavigationTimingData.NavigationType.NAVIGATION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                NavigationTimingData.NavigationType navigationTypeDecode = navigationType;
                while (true) {
                    NavigationTimingData.DurationType durationType = durationTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new NavigationTimingData(durationType, navigationTypeDecode, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                durationTypeDecode = NavigationTimingData.DurationType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                navigationTypeDecode = NavigationTimingData.NavigationType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NavigationTimingData redact(NavigationTimingData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NavigationTimingData.copy$default(value, null, null, 0.0d, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationTimingData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DURATION_TYPE_UNSPECIFIED", "TOTAL_PAGE_LOAD_TIME", "REQUEST_RESPONSE_TIME", "PAGE_RENDER_TIME", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DurationType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DurationType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DurationType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DurationType DURATION_TYPE_UNSPECIFIED;
        public static final DurationType PAGE_RENDER_TIME;
        public static final DurationType REQUEST_RESPONSE_TIME;
        public static final DurationType TOTAL_PAGE_LOAD_TIME;
        private final int value;

        private static final /* synthetic */ DurationType[] $values() {
            return new DurationType[]{DURATION_TYPE_UNSPECIFIED, TOTAL_PAGE_LOAD_TIME, REQUEST_RESPONSE_TIME, PAGE_RENDER_TIME};
        }

        @JvmStatic
        public static final DurationType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DurationType> getEntries() {
            return $ENTRIES;
        }

        private DurationType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DurationType durationType = new DurationType("DURATION_TYPE_UNSPECIFIED", 0, 0);
            DURATION_TYPE_UNSPECIFIED = durationType;
            TOTAL_PAGE_LOAD_TIME = new DurationType("TOTAL_PAGE_LOAD_TIME", 1, 1);
            REQUEST_RESPONSE_TIME = new DurationType("REQUEST_RESPONSE_TIME", 2, 2);
            PAGE_RENDER_TIME = new DurationType("PAGE_RENDER_TIME", 3, 3);
            DurationType[] durationTypeArr$values = $values();
            $VALUES = durationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(durationTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DurationType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DurationType>(orCreateKotlinClass, syntax, durationType) { // from class: com.robinhood.rosetta.eventlogging.NavigationTimingData$DurationType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NavigationTimingData.DurationType fromValue(int value) {
                    return NavigationTimingData.DurationType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NavigationTimingData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DurationType fromValue(int value) {
                if (value == 0) {
                    return DurationType.DURATION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DurationType.TOTAL_PAGE_LOAD_TIME;
                }
                if (value == 2) {
                    return DurationType.REQUEST_RESPONSE_TIME;
                }
                if (value != 3) {
                    return null;
                }
                return DurationType.PAGE_RENDER_TIME;
            }
        }

        public static DurationType valueOf(String str) {
            return (DurationType) Enum.valueOf(DurationType.class, str);
        }

        public static DurationType[] values() {
            return (DurationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationTimingData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NAVIGATION_TYPE_UNSPECIFIED", "NAVIGATE", "RELOAD", "BACK_FORWARD", "PRERENDER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigationType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<NavigationType> ADAPTER;
        public static final NavigationType BACK_FORWARD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NavigationType NAVIGATE;
        public static final NavigationType NAVIGATION_TYPE_UNSPECIFIED;
        public static final NavigationType PRERENDER;
        public static final NavigationType RELOAD;
        private final int value;

        private static final /* synthetic */ NavigationType[] $values() {
            return new NavigationType[]{NAVIGATION_TYPE_UNSPECIFIED, NAVIGATE, RELOAD, BACK_FORWARD, PRERENDER};
        }

        @JvmStatic
        public static final NavigationType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<NavigationType> getEntries() {
            return $ENTRIES;
        }

        private NavigationType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final NavigationType navigationType = new NavigationType("NAVIGATION_TYPE_UNSPECIFIED", 0, 0);
            NAVIGATION_TYPE_UNSPECIFIED = navigationType;
            NAVIGATE = new NavigationType("NAVIGATE", 1, 1);
            RELOAD = new NavigationType("RELOAD", 2, 2);
            BACK_FORWARD = new NavigationType("BACK_FORWARD", 3, 3);
            PRERENDER = new NavigationType("PRERENDER", 4, 4);
            NavigationType[] navigationTypeArr$values = $values();
            $VALUES = navigationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navigationTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NavigationType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<NavigationType>(orCreateKotlinClass, syntax, navigationType) { // from class: com.robinhood.rosetta.eventlogging.NavigationTimingData$NavigationType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NavigationTimingData.NavigationType fromValue(int value) {
                    return NavigationTimingData.NavigationType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NavigationTimingData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final NavigationType fromValue(int value) {
                if (value == 0) {
                    return NavigationType.NAVIGATION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return NavigationType.NAVIGATE;
                }
                if (value == 2) {
                    return NavigationType.RELOAD;
                }
                if (value == 3) {
                    return NavigationType.BACK_FORWARD;
                }
                if (value != 4) {
                    return null;
                }
                return NavigationType.PRERENDER;
            }
        }

        public static NavigationType valueOf(String str) {
            return (NavigationType) Enum.valueOf(NavigationType.class, str);
        }

        public static NavigationType[] values() {
            return (NavigationType[]) $VALUES.clone();
        }
    }
}
