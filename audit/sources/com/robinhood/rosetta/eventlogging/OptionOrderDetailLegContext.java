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

/* compiled from: OptionOrderDetailLegContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailLegContext;", "Lcom/squareup/wire/Message;", "", "position_effect", "", "order_state", "option_instrument_id", "order_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPosition_effect", "()Ljava/lang/String;", "getOrder_state", "getOption_instrument_id", "getOrder_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderDetailLegContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderDetailLegContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionInstrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String option_instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String position_effect;

    public OptionOrderDetailLegContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ OptionOrderDetailLegContext(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24429newBuilder();
    }

    public final String getPosition_effect() {
        return this.position_effect;
    }

    public final String getOrder_state() {
        return this.order_state;
    }

    public final String getOption_instrument_id() {
        return this.option_instrument_id;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailLegContext(String position_effect, String order_state, String option_instrument_id, String order_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.position_effect = position_effect;
        this.order_state = order_state;
        this.option_instrument_id = option_instrument_id;
        this.order_id = order_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24429newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderDetailLegContext)) {
            return false;
        }
        OptionOrderDetailLegContext optionOrderDetailLegContext = (OptionOrderDetailLegContext) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderDetailLegContext.unknownFields()) && Intrinsics.areEqual(this.position_effect, optionOrderDetailLegContext.position_effect) && Intrinsics.areEqual(this.order_state, optionOrderDetailLegContext.order_state) && Intrinsics.areEqual(this.option_instrument_id, optionOrderDetailLegContext.option_instrument_id) && Intrinsics.areEqual(this.order_id, optionOrderDetailLegContext.order_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.position_effect.hashCode()) * 37) + this.order_state.hashCode()) * 37) + this.option_instrument_id.hashCode()) * 37) + this.order_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("position_effect=" + Internal.sanitize(this.position_effect));
        arrayList.add("order_state=" + Internal.sanitize(this.order_state));
        arrayList.add("option_instrument_id=" + Internal.sanitize(this.option_instrument_id));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderDetailLegContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionOrderDetailLegContext copy$default(OptionOrderDetailLegContext optionOrderDetailLegContext, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderDetailLegContext.position_effect;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderDetailLegContext.order_state;
        }
        if ((i & 4) != 0) {
            str3 = optionOrderDetailLegContext.option_instrument_id;
        }
        if ((i & 8) != 0) {
            str4 = optionOrderDetailLegContext.order_id;
        }
        if ((i & 16) != 0) {
            byteString = optionOrderDetailLegContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return optionOrderDetailLegContext.copy(str, str2, str5, str4, byteString2);
    }

    public final OptionOrderDetailLegContext copy(String position_effect, String order_state, String option_instrument_id, String order_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(option_instrument_id, "option_instrument_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderDetailLegContext(position_effect, order_state, option_instrument_id, order_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderDetailLegContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderDetailLegContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderDetailLegContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPosition_effect(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPosition_effect());
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getOption_instrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOption_instrument_id());
                }
                return !Intrinsics.areEqual(value.getOrder_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOrder_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderDetailLegContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPosition_effect(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPosition_effect());
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getOption_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOption_instrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOrder_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderDetailLegContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getOption_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOption_instrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_state());
                }
                if (Intrinsics.areEqual(value.getPosition_effect(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPosition_effect());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderDetailLegContext redact(OptionOrderDetailLegContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionOrderDetailLegContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderDetailLegContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionOrderDetailLegContext(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
