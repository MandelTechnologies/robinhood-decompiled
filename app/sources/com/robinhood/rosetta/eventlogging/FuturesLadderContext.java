package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.eventlogging.FuturesLadderContext;
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

/* compiled from: FuturesLadderContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext;", "Lcom/squareup/wire/Message;", "", "num_pending_orders_selected", "", "num_positions", "num_pending_orders", "pnl_display_mode", "Lcom/robinhood/rosetta/eventlogging/PnlDisplayMode;", "nux_progress", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "unknownFields", "Lokio/ByteString;", "<init>", "(IIILcom/robinhood/rosetta/eventlogging/PnlDisplayMode;Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;Lokio/ByteString;)V", "getNum_pending_orders_selected", "()I", "getNum_positions", "getNum_pending_orders", "getPnl_display_mode", "()Lcom/robinhood/rosetta/eventlogging/PnlDisplayMode;", "getNux_progress", "()Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "NuxProgress", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class FuturesLadderContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesLadderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numPendingOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int num_pending_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numPendingOrdersSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int num_pending_orders_selected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numPositions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int num_positions;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesLadderContext$NuxProgress#ADAPTER", jsonName = "nuxProgress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final NuxProgress nux_progress;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PnlDisplayMode#ADAPTER", jsonName = "pnlDisplayMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PnlDisplayMode pnl_display_mode;

    public FuturesLadderContext() {
        this(0, 0, 0, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24274newBuilder();
    }

    public final int getNum_pending_orders_selected() {
        return this.num_pending_orders_selected;
    }

    public final int getNum_positions() {
        return this.num_positions;
    }

    public final int getNum_pending_orders() {
        return this.num_pending_orders;
    }

    public final PnlDisplayMode getPnl_display_mode() {
        return this.pnl_display_mode;
    }

    public /* synthetic */ FuturesLadderContext(int i, int i2, int i3, PnlDisplayMode pnlDisplayMode, NuxProgress nuxProgress, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED : pnlDisplayMode, (i4 & 16) != 0 ? NuxProgress.UNSPECIFIED : nuxProgress, (i4 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final NuxProgress getNux_progress() {
        return this.nux_progress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesLadderContext(int i, int i2, int i3, PnlDisplayMode pnl_display_mode, NuxProgress nux_progress, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        Intrinsics.checkNotNullParameter(nux_progress, "nux_progress");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.num_pending_orders_selected = i;
        this.num_positions = i2;
        this.num_pending_orders = i3;
        this.pnl_display_mode = pnl_display_mode;
        this.nux_progress = nux_progress;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24274newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesLadderContext)) {
            return false;
        }
        FuturesLadderContext futuresLadderContext = (FuturesLadderContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresLadderContext.unknownFields()) && this.num_pending_orders_selected == futuresLadderContext.num_pending_orders_selected && this.num_positions == futuresLadderContext.num_positions && this.num_pending_orders == futuresLadderContext.num_pending_orders && this.pnl_display_mode == futuresLadderContext.pnl_display_mode && this.nux_progress == futuresLadderContext.nux_progress;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.num_pending_orders_selected)) * 37) + Integer.hashCode(this.num_positions)) * 37) + Integer.hashCode(this.num_pending_orders)) * 37) + this.pnl_display_mode.hashCode()) * 37) + this.nux_progress.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("num_pending_orders_selected=" + this.num_pending_orders_selected);
        arrayList.add("num_positions=" + this.num_positions);
        arrayList.add("num_pending_orders=" + this.num_pending_orders);
        arrayList.add("pnl_display_mode=" + this.pnl_display_mode);
        arrayList.add("nux_progress=" + this.nux_progress);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesLadderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesLadderContext copy$default(FuturesLadderContext futuresLadderContext, int i, int i2, int i3, PnlDisplayMode pnlDisplayMode, NuxProgress nuxProgress, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = futuresLadderContext.num_pending_orders_selected;
        }
        if ((i4 & 2) != 0) {
            i2 = futuresLadderContext.num_positions;
        }
        if ((i4 & 4) != 0) {
            i3 = futuresLadderContext.num_pending_orders;
        }
        if ((i4 & 8) != 0) {
            pnlDisplayMode = futuresLadderContext.pnl_display_mode;
        }
        if ((i4 & 16) != 0) {
            nuxProgress = futuresLadderContext.nux_progress;
        }
        if ((i4 & 32) != 0) {
            byteString = futuresLadderContext.unknownFields();
        }
        NuxProgress nuxProgress2 = nuxProgress;
        ByteString byteString2 = byteString;
        return futuresLadderContext.copy(i, i2, i3, pnlDisplayMode, nuxProgress2, byteString2);
    }

    public final FuturesLadderContext copy(int num_pending_orders_selected, int num_positions, int num_pending_orders, PnlDisplayMode pnl_display_mode, NuxProgress nux_progress, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        Intrinsics.checkNotNullParameter(nux_progress, "nux_progress");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesLadderContext(num_pending_orders_selected, num_positions, num_pending_orders, pnl_display_mode, nux_progress, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesLadderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesLadderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesLadderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesLadderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNum_pending_orders_selected() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNum_pending_orders_selected()));
                }
                if (value.getNum_positions() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getNum_positions()));
                }
                if (value.getNum_pending_orders() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getNum_pending_orders()));
                }
                if (value.getPnl_display_mode() != PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED) {
                    size += PnlDisplayMode.ADAPTER.encodedSizeWithTag(4, value.getPnl_display_mode());
                }
                return value.getNux_progress() != FuturesLadderContext.NuxProgress.UNSPECIFIED ? size + FuturesLadderContext.NuxProgress.ADAPTER.encodedSizeWithTag(5, value.getNux_progress()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesLadderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNum_pending_orders_selected() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_pending_orders_selected()));
                }
                if (value.getNum_positions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getNum_positions()));
                }
                if (value.getNum_pending_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNum_pending_orders()));
                }
                if (value.getPnl_display_mode() != PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED) {
                    PnlDisplayMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getPnl_display_mode());
                }
                if (value.getNux_progress() != FuturesLadderContext.NuxProgress.UNSPECIFIED) {
                    FuturesLadderContext.NuxProgress.ADAPTER.encodeWithTag(writer, 5, (int) value.getNux_progress());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesLadderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNux_progress() != FuturesLadderContext.NuxProgress.UNSPECIFIED) {
                    FuturesLadderContext.NuxProgress.ADAPTER.encodeWithTag(writer, 5, (int) value.getNux_progress());
                }
                if (value.getPnl_display_mode() != PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED) {
                    PnlDisplayMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getPnl_display_mode());
                }
                if (value.getNum_pending_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNum_pending_orders()));
                }
                if (value.getNum_positions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getNum_positions()));
                }
                if (value.getNum_pending_orders_selected() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_pending_orders_selected()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesLadderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PnlDisplayMode pnlDisplayModeDecode = PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED;
                FuturesLadderContext.NuxProgress nuxProgress = FuturesLadderContext.NuxProgress.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                FuturesLadderContext.NuxProgress nuxProgressDecode = nuxProgress;
                while (true) {
                    PnlDisplayMode pnlDisplayMode = pnlDisplayModeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FuturesLadderContext(iIntValue, iIntValue2, iIntValue3, pnlDisplayMode, nuxProgressDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 2) {
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 4) {
                            try {
                                pnlDisplayModeDecode = PnlDisplayMode.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            try {
                                nuxProgressDecode = FuturesLadderContext.NuxProgress.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesLadderContext redact(FuturesLadderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesLadderContext.copy$default(value, 0, 0, 0, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesLadderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "LADDER_INTRODUCTION", "LAST_TRADED_PRICE_INFORMATION", "TICK_SIZE_INFORMATION", "BID_BARS_INFORMATION", "ASK_BARS_INFORMATION", "MARKET_ORDER_INFORMATION", "LADDER_ROW_ORDER_INFORMATION", "LADDER_ROW_EDIT_INFORMATION", "LADDER_ROW_CANCEL_ORDER_INFORMATION", "LADDER_ROW_AVERAGE_PRICE_INFORMATION", "LADDER_ROW_CLOSE_POSITION_INFORMATION", "TRANSITION_TO_REAL_LADDER_UI", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class NuxProgress implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NuxProgress[] $VALUES;

        @JvmField
        public static final ProtoAdapter<NuxProgress> ADAPTER;
        public static final NuxProgress ASK_BARS_INFORMATION;
        public static final NuxProgress BID_BARS_INFORMATION;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NuxProgress LADDER_INTRODUCTION;
        public static final NuxProgress LADDER_ROW_AVERAGE_PRICE_INFORMATION;
        public static final NuxProgress LADDER_ROW_CANCEL_ORDER_INFORMATION;
        public static final NuxProgress LADDER_ROW_CLOSE_POSITION_INFORMATION;
        public static final NuxProgress LADDER_ROW_EDIT_INFORMATION;
        public static final NuxProgress LADDER_ROW_ORDER_INFORMATION;
        public static final NuxProgress LAST_TRADED_PRICE_INFORMATION;
        public static final NuxProgress MARKET_ORDER_INFORMATION;
        public static final NuxProgress TICK_SIZE_INFORMATION;
        public static final NuxProgress TRANSITION_TO_REAL_LADDER_UI;
        public static final NuxProgress UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ NuxProgress[] $values() {
            return new NuxProgress[]{UNSPECIFIED, LADDER_INTRODUCTION, LAST_TRADED_PRICE_INFORMATION, TICK_SIZE_INFORMATION, BID_BARS_INFORMATION, ASK_BARS_INFORMATION, MARKET_ORDER_INFORMATION, LADDER_ROW_ORDER_INFORMATION, LADDER_ROW_EDIT_INFORMATION, LADDER_ROW_CANCEL_ORDER_INFORMATION, LADDER_ROW_AVERAGE_PRICE_INFORMATION, LADDER_ROW_CLOSE_POSITION_INFORMATION, TRANSITION_TO_REAL_LADDER_UI};
        }

        @JvmStatic
        public static final NuxProgress fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<NuxProgress> getEntries() {
            return $ENTRIES;
        }

        private NuxProgress(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final NuxProgress nuxProgress = new NuxProgress(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = nuxProgress;
            LADDER_INTRODUCTION = new NuxProgress("LADDER_INTRODUCTION", 1, 1);
            LAST_TRADED_PRICE_INFORMATION = new NuxProgress("LAST_TRADED_PRICE_INFORMATION", 2, 2);
            TICK_SIZE_INFORMATION = new NuxProgress("TICK_SIZE_INFORMATION", 3, 3);
            BID_BARS_INFORMATION = new NuxProgress("BID_BARS_INFORMATION", 4, 4);
            ASK_BARS_INFORMATION = new NuxProgress("ASK_BARS_INFORMATION", 5, 5);
            MARKET_ORDER_INFORMATION = new NuxProgress("MARKET_ORDER_INFORMATION", 6, 6);
            LADDER_ROW_ORDER_INFORMATION = new NuxProgress("LADDER_ROW_ORDER_INFORMATION", 7, 7);
            LADDER_ROW_EDIT_INFORMATION = new NuxProgress("LADDER_ROW_EDIT_INFORMATION", 8, 8);
            LADDER_ROW_CANCEL_ORDER_INFORMATION = new NuxProgress("LADDER_ROW_CANCEL_ORDER_INFORMATION", 9, 9);
            LADDER_ROW_AVERAGE_PRICE_INFORMATION = new NuxProgress("LADDER_ROW_AVERAGE_PRICE_INFORMATION", 10, 10);
            LADDER_ROW_CLOSE_POSITION_INFORMATION = new NuxProgress("LADDER_ROW_CLOSE_POSITION_INFORMATION", 11, 11);
            TRANSITION_TO_REAL_LADDER_UI = new NuxProgress("TRANSITION_TO_REAL_LADDER_UI", 12, 12);
            NuxProgress[] nuxProgressArr$values = $values();
            $VALUES = nuxProgressArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nuxProgressArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NuxProgress.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<NuxProgress>(orCreateKotlinClass, syntax, nuxProgress) { // from class: com.robinhood.rosetta.eventlogging.FuturesLadderContext$NuxProgress$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesLadderContext.NuxProgress fromValue(int value) {
                    return FuturesLadderContext.NuxProgress.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesLadderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final NuxProgress fromValue(int value) {
                switch (value) {
                    case 0:
                        return NuxProgress.UNSPECIFIED;
                    case 1:
                        return NuxProgress.LADDER_INTRODUCTION;
                    case 2:
                        return NuxProgress.LAST_TRADED_PRICE_INFORMATION;
                    case 3:
                        return NuxProgress.TICK_SIZE_INFORMATION;
                    case 4:
                        return NuxProgress.BID_BARS_INFORMATION;
                    case 5:
                        return NuxProgress.ASK_BARS_INFORMATION;
                    case 6:
                        return NuxProgress.MARKET_ORDER_INFORMATION;
                    case 7:
                        return NuxProgress.LADDER_ROW_ORDER_INFORMATION;
                    case 8:
                        return NuxProgress.LADDER_ROW_EDIT_INFORMATION;
                    case 9:
                        return NuxProgress.LADDER_ROW_CANCEL_ORDER_INFORMATION;
                    case 10:
                        return NuxProgress.LADDER_ROW_AVERAGE_PRICE_INFORMATION;
                    case 11:
                        return NuxProgress.LADDER_ROW_CLOSE_POSITION_INFORMATION;
                    case 12:
                        return NuxProgress.TRANSITION_TO_REAL_LADDER_UI;
                    default:
                        return null;
                }
            }
        }

        public static NuxProgress valueOf(String str) {
            return (NuxProgress) Enum.valueOf(NuxProgress.class, str);
        }

        public static NuxProgress[] values() {
            return (NuxProgress[]) $VALUES.clone();
        }
    }
}
