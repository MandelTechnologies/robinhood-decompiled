package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: EquitiesLadderContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "Lcom/squareup/wire/Message;", "", "pnl_display_mode", "Lcom/robinhood/rosetta/eventlogging/PnlDisplayMode;", "auto_send_enabled", "", "zoom_level", "", "quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PnlDisplayMode;ZDDLokio/ByteString;)V", "getPnl_display_mode", "()Lcom/robinhood/rosetta/eventlogging/PnlDisplayMode;", "getAuto_send_enabled", "()Z", "getZoom_level", "()D", "getQuantity", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EquitiesLadderContext extends Message {

    @JvmField
    public static final ProtoAdapter<EquitiesLadderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSendEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean auto_send_enabled;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PnlDisplayMode#ADAPTER", jsonName = "pnlDisplayMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PnlDisplayMode pnl_display_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "zoomLevel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double zoom_level;

    public EquitiesLadderContext() {
        this(null, false, 0.0d, 0.0d, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24242newBuilder();
    }

    public final PnlDisplayMode getPnl_display_mode() {
        return this.pnl_display_mode;
    }

    public /* synthetic */ EquitiesLadderContext(PnlDisplayMode pnlDisplayMode, boolean z, double d, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED : pnlDisplayMode, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getAuto_send_enabled() {
        return this.auto_send_enabled;
    }

    public final double getZoom_level() {
        return this.zoom_level;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquitiesLadderContext(PnlDisplayMode pnl_display_mode, boolean z, double d, double d2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.pnl_display_mode = pnl_display_mode;
        this.auto_send_enabled = z;
        this.zoom_level = d;
        this.quantity = d2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24242newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquitiesLadderContext)) {
            return false;
        }
        EquitiesLadderContext equitiesLadderContext = (EquitiesLadderContext) other;
        return Intrinsics.areEqual(unknownFields(), equitiesLadderContext.unknownFields()) && this.pnl_display_mode == equitiesLadderContext.pnl_display_mode && this.auto_send_enabled == equitiesLadderContext.auto_send_enabled && this.zoom_level == equitiesLadderContext.zoom_level && this.quantity == equitiesLadderContext.quantity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.pnl_display_mode.hashCode()) * 37) + java.lang.Boolean.hashCode(this.auto_send_enabled)) * 37) + Double.hashCode(this.zoom_level)) * 37) + Double.hashCode(this.quantity);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pnl_display_mode=" + this.pnl_display_mode);
        arrayList.add("auto_send_enabled=" + this.auto_send_enabled);
        arrayList.add("zoom_level=" + this.zoom_level);
        arrayList.add("quantity=" + this.quantity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquitiesLadderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EquitiesLadderContext copy$default(EquitiesLadderContext equitiesLadderContext, PnlDisplayMode pnlDisplayMode, boolean z, double d, double d2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            pnlDisplayMode = equitiesLadderContext.pnl_display_mode;
        }
        if ((i & 2) != 0) {
            z = equitiesLadderContext.auto_send_enabled;
        }
        if ((i & 4) != 0) {
            d = equitiesLadderContext.zoom_level;
        }
        if ((i & 8) != 0) {
            d2 = equitiesLadderContext.quantity;
        }
        if ((i & 16) != 0) {
            byteString = equitiesLadderContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        double d3 = d2;
        return equitiesLadderContext.copy(pnlDisplayMode, z, d, d3, byteString2);
    }

    public final EquitiesLadderContext copy(PnlDisplayMode pnl_display_mode, boolean auto_send_enabled, double zoom_level, double quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(pnl_display_mode, "pnl_display_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquitiesLadderContext(pnl_display_mode, auto_send_enabled, zoom_level, quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquitiesLadderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquitiesLadderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EquitiesLadderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquitiesLadderContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPnl_display_mode() != PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED) {
                    size += PnlDisplayMode.ADAPTER.encodedSizeWithTag(1, value.getPnl_display_mode());
                }
                if (value.getAuto_send_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (!Double.valueOf(value.getZoom_level()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getZoom_level()));
                }
                return !Double.valueOf(value.getQuantity()).equals(dValueOf) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getQuantity())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquitiesLadderContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPnl_display_mode() != PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED) {
                    PnlDisplayMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getPnl_display_mode());
                }
                if (value.getAuto_send_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (!Double.valueOf(value.getZoom_level()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getZoom_level()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getQuantity()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquitiesLadderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getQuantity());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getZoom_level()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getZoom_level()));
                }
                if (value.getAuto_send_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (value.getPnl_display_mode() != PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED) {
                    PnlDisplayMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getPnl_display_mode());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquitiesLadderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PnlDisplayMode pnlDisplayModeDecode = PnlDisplayMode.PNL_DISPLAY_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    PnlDisplayMode pnlDisplayMode = pnlDisplayModeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EquitiesLadderContext(pnlDisplayMode, zBooleanValue, dDoubleValue, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                pnlDisplayModeDecode = PnlDisplayMode.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 4) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquitiesLadderContext redact(EquitiesLadderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EquitiesLadderContext.copy$default(value, null, false, 0.0d, 0.0d, ByteString.EMPTY, 15, null);
            }
        };
    }
}
