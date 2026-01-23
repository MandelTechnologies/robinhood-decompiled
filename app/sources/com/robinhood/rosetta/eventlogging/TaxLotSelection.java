package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.TaxLotSelection;
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

/* compiled from: TaxLotSelection.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "Lcom/squareup/wire/Message;", "", "open_lot_id", "", "quantity", "", "quantity_available", "last_check_box_state", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;Lokio/ByteString;)V", "getOpen_lot_id", "()Ljava/lang/String;", "getQuantity", "()D", "getQuantity_available", "getLast_check_box_state", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CheckBoxState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TaxLotSelection extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotSelection> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotSelection$CheckBoxState#ADAPTER", jsonName = "lastCheckBoxState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CheckBoxState last_check_box_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openLotId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String open_lot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "quantityAvailable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double quantity_available;

    public TaxLotSelection() {
        this(null, 0.0d, 0.0d, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24573newBuilder();
    }

    public final String getOpen_lot_id() {
        return this.open_lot_id;
    }

    public /* synthetic */ TaxLotSelection(String str, double d, double d2, CheckBoxState checkBoxState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED : checkBoxState, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final double getQuantity_available() {
        return this.quantity_available;
    }

    public final CheckBoxState getLast_check_box_state() {
        return this.last_check_box_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotSelection(String open_lot_id, double d, double d2, CheckBoxState last_check_box_state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(last_check_box_state, "last_check_box_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.open_lot_id = open_lot_id;
        this.quantity = d;
        this.quantity_available = d2;
        this.last_check_box_state = last_check_box_state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24573newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotSelection)) {
            return false;
        }
        TaxLotSelection taxLotSelection = (TaxLotSelection) other;
        return Intrinsics.areEqual(unknownFields(), taxLotSelection.unknownFields()) && Intrinsics.areEqual(this.open_lot_id, taxLotSelection.open_lot_id) && this.quantity == taxLotSelection.quantity && this.quantity_available == taxLotSelection.quantity_available && this.last_check_box_state == taxLotSelection.last_check_box_state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.open_lot_id.hashCode()) * 37) + Double.hashCode(this.quantity)) * 37) + Double.hashCode(this.quantity_available)) * 37) + this.last_check_box_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("open_lot_id=" + Internal.sanitize(this.open_lot_id));
        arrayList.add("quantity=" + this.quantity);
        arrayList.add("quantity_available=" + this.quantity_available);
        arrayList.add("last_check_box_state=" + this.last_check_box_state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotSelection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotSelection copy$default(TaxLotSelection taxLotSelection, String str, double d, double d2, CheckBoxState checkBoxState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotSelection.open_lot_id;
        }
        if ((i & 2) != 0) {
            d = taxLotSelection.quantity;
        }
        if ((i & 4) != 0) {
            d2 = taxLotSelection.quantity_available;
        }
        if ((i & 8) != 0) {
            checkBoxState = taxLotSelection.last_check_box_state;
        }
        if ((i & 16) != 0) {
            byteString = taxLotSelection.unknownFields();
        }
        double d3 = d2;
        return taxLotSelection.copy(str, d, d3, checkBoxState, byteString);
    }

    public final TaxLotSelection copy(String open_lot_id, double quantity, double quantity_available, CheckBoxState last_check_box_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(last_check_box_state, "last_check_box_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotSelection(open_lot_id, quantity, quantity_available, last_check_box_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotSelection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotSelection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TaxLotSelection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotSelection value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOpen_lot_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOpen_lot_id());
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getQuantity_available()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getQuantity_available()));
                }
                return value.getLast_check_box_state() != TaxLotSelection.CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED ? size + TaxLotSelection.CheckBoxState.ADAPTER.encodedSizeWithTag(4, value.getLast_check_box_state()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotSelection value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOpen_lot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOpen_lot_id());
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getQuantity_available()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getQuantity_available()));
                }
                if (value.getLast_check_box_state() != TaxLotSelection.CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED) {
                    TaxLotSelection.CheckBoxState.ADAPTER.encodeWithTag(writer, 4, (int) value.getLast_check_box_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotSelection value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLast_check_box_state() != TaxLotSelection.CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED) {
                    TaxLotSelection.CheckBoxState.ADAPTER.encodeWithTag(writer, 4, (int) value.getLast_check_box_state());
                }
                if (!Double.valueOf(value.getQuantity_available()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getQuantity_available()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getQuantity()));
                }
                if (Intrinsics.areEqual(value.getOpen_lot_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOpen_lot_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotSelection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotSelection.CheckBoxState checkBoxStateDecode = TaxLotSelection.CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                String strDecode = "";
                while (true) {
                    TaxLotSelection.CheckBoxState checkBoxState = checkBoxStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TaxLotSelection(strDecode, dDoubleValue, dDoubleValue2, checkBoxState, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 3) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 4) {
                            try {
                                checkBoxStateDecode = TaxLotSelection.CheckBoxState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotSelection redact(TaxLotSelection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLotSelection.copy$default(value, null, 0.0d, 0.0d, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECK_BOX_STATE_UNSPECIFIED", "SELECTED", "PARTIAL", "UNSELECTED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckBoxState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckBoxState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckBoxState> ADAPTER;
        public static final CheckBoxState CHECK_BOX_STATE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckBoxState PARTIAL;
        public static final CheckBoxState SELECTED;
        public static final CheckBoxState UNSELECTED;
        private final int value;

        private static final /* synthetic */ CheckBoxState[] $values() {
            return new CheckBoxState[]{CHECK_BOX_STATE_UNSPECIFIED, SELECTED, PARTIAL, UNSELECTED};
        }

        @JvmStatic
        public static final CheckBoxState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckBoxState> getEntries() {
            return $ENTRIES;
        }

        private CheckBoxState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckBoxState checkBoxState = new CheckBoxState("CHECK_BOX_STATE_UNSPECIFIED", 0, 0);
            CHECK_BOX_STATE_UNSPECIFIED = checkBoxState;
            SELECTED = new CheckBoxState("SELECTED", 1, 1);
            PARTIAL = new CheckBoxState("PARTIAL", 2, 2);
            UNSELECTED = new CheckBoxState("UNSELECTED", 3, 3);
            CheckBoxState[] checkBoxStateArr$values = $values();
            $VALUES = checkBoxStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkBoxStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckBoxState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckBoxState>(orCreateKotlinClass, syntax, checkBoxState) { // from class: com.robinhood.rosetta.eventlogging.TaxLotSelection$CheckBoxState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TaxLotSelection.CheckBoxState fromValue(int value) {
                    return TaxLotSelection.CheckBoxState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TaxLotSelection.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection$CheckBoxState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckBoxState fromValue(int value) {
                if (value == 0) {
                    return CheckBoxState.CHECK_BOX_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CheckBoxState.SELECTED;
                }
                if (value == 2) {
                    return CheckBoxState.PARTIAL;
                }
                if (value != 3) {
                    return null;
                }
                return CheckBoxState.UNSELECTED;
            }
        }

        public static CheckBoxState valueOf(String str) {
            return (CheckBoxState) Enum.valueOf(CheckBoxState.class, str);
        }

        public static CheckBoxState[] values() {
            return (CheckBoxState[]) $VALUES.clone();
        }
    }
}
