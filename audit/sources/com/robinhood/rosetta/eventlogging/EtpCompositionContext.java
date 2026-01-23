package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
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

/* compiled from: EtpCompositionContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext;", "Lcom/squareup/wire/Message;", "", "composition_type", "Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext$CompositionType;", "instrument_id", "", "sector", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext$CompositionType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getComposition_type", "()Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext$CompositionType;", "getInstrument_id", "()Ljava/lang/String;", "getSector", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CompositionType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EtpCompositionContext extends Message {

    @JvmField
    public static final ProtoAdapter<EtpCompositionContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EtpCompositionContext$CompositionType#ADAPTER", jsonName = "compositionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CompositionType composition_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String sector;

    public EtpCompositionContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24256newBuilder();
    }

    public final CompositionType getComposition_type() {
        return this.composition_type;
    }

    public /* synthetic */ EtpCompositionContext(CompositionType compositionType, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CompositionType.SECTORS : compositionType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getSector() {
        return this.sector;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpCompositionContext(CompositionType composition_type, String instrument_id, String sector, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(composition_type, "composition_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.composition_type = composition_type;
        this.instrument_id = instrument_id;
        this.sector = sector;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24256newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EtpCompositionContext)) {
            return false;
        }
        EtpCompositionContext etpCompositionContext = (EtpCompositionContext) other;
        return Intrinsics.areEqual(unknownFields(), etpCompositionContext.unknownFields()) && this.composition_type == etpCompositionContext.composition_type && Intrinsics.areEqual(this.instrument_id, etpCompositionContext.instrument_id) && Intrinsics.areEqual(this.sector, etpCompositionContext.sector);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.composition_type.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.sector.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("composition_type=" + this.composition_type);
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("sector=" + Internal.sanitize(this.sector));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EtpCompositionContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EtpCompositionContext copy$default(EtpCompositionContext etpCompositionContext, CompositionType compositionType, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            compositionType = etpCompositionContext.composition_type;
        }
        if ((i & 2) != 0) {
            str = etpCompositionContext.instrument_id;
        }
        if ((i & 4) != 0) {
            str2 = etpCompositionContext.sector;
        }
        if ((i & 8) != 0) {
            byteString = etpCompositionContext.unknownFields();
        }
        return etpCompositionContext.copy(compositionType, str, str2, byteString);
    }

    public final EtpCompositionContext copy(CompositionType composition_type, String instrument_id, String sector, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(composition_type, "composition_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EtpCompositionContext(composition_type, instrument_id, sector, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EtpCompositionContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EtpCompositionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EtpCompositionContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EtpCompositionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getComposition_type() != EtpCompositionContext.CompositionType.SECTORS) {
                    size += EtpCompositionContext.CompositionType.ADAPTER.encodedSizeWithTag(1, value.getComposition_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                return !Intrinsics.areEqual(value.getSector(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSector()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EtpCompositionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getComposition_type() != EtpCompositionContext.CompositionType.SECTORS) {
                    EtpCompositionContext.CompositionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getComposition_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSector());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EtpCompositionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSector());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getComposition_type() != EtpCompositionContext.CompositionType.SECTORS) {
                    EtpCompositionContext.CompositionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getComposition_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EtpCompositionContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EtpCompositionContext.CompositionType compositionTypeDecode = EtpCompositionContext.CompositionType.SECTORS;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EtpCompositionContext(compositionTypeDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            compositionTypeDecode = EtpCompositionContext.CompositionType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EtpCompositionContext redact(EtpCompositionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EtpCompositionContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EtpCompositionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext$CompositionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SECTORS", "HOLDINGS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CompositionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CompositionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CompositionType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CompositionType HOLDINGS;
        public static final CompositionType SECTORS;
        private final int value;

        private static final /* synthetic */ CompositionType[] $values() {
            return new CompositionType[]{SECTORS, HOLDINGS};
        }

        @JvmStatic
        public static final CompositionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CompositionType> getEntries() {
            return $ENTRIES;
        }

        private CompositionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CompositionType compositionType = new CompositionType("SECTORS", 0, 0);
            SECTORS = compositionType;
            HOLDINGS = new CompositionType("HOLDINGS", 1, 1);
            CompositionType[] compositionTypeArr$values = $values();
            $VALUES = compositionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(compositionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CompositionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CompositionType>(orCreateKotlinClass, syntax, compositionType) { // from class: com.robinhood.rosetta.eventlogging.EtpCompositionContext$CompositionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EtpCompositionContext.CompositionType fromValue(int value) {
                    return EtpCompositionContext.CompositionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EtpCompositionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext$CompositionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EtpCompositionContext$CompositionType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CompositionType fromValue(int value) {
                if (value == 0) {
                    return CompositionType.SECTORS;
                }
                if (value != 1) {
                    return null;
                }
                return CompositionType.HOLDINGS;
            }
        }

        public static CompositionType valueOf(String str) {
            return (CompositionType) Enum.valueOf(CompositionType.class, str);
        }

        public static CompositionType[] values() {
            return (CompositionType[]) $VALUES.clone();
        }
    }
}
