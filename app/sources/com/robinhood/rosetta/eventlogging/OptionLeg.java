package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import rosetta.option.PositionEffect;
import rosetta.order.Side;

/* compiled from: OptionLeg.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionLeg;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "", "position_effect", "Lrosetta/option/PositionEffect;", "ratio_quantity", "", "side", "Lrosetta/order/Side;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/option/PositionEffect;ILrosetta/order/Side;Lokio/ByteString;)V", "getOption", "()Ljava/lang/String;", "getPosition_effect", "()Lrosetta/option/PositionEffect;", "getRatio_quantity", "()I", "getSide", "()Lrosetta/order/Side;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionLeg extends Message {

    @JvmField
    public static final ProtoAdapter<OptionLeg> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String option;

    @WireField(adapter = "rosetta.option.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "ratioQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int ratio_quantity;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Side side;

    public OptionLeg() {
        this(null, null, 0, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24419newBuilder();
    }

    public final String getOption() {
        return this.option;
    }

    public /* synthetic */ OptionLeg(String str, PositionEffect positionEffect, int i, Side side, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final int getRatio_quantity() {
        return this.ratio_quantity;
    }

    public final Side getSide() {
        return this.side;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionLeg(String option, PositionEffect position_effect, int i, Side side, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.option = option;
        this.position_effect = position_effect;
        this.ratio_quantity = i;
        this.side = side;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24419newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionLeg)) {
            return false;
        }
        OptionLeg optionLeg = (OptionLeg) other;
        return Intrinsics.areEqual(unknownFields(), optionLeg.unknownFields()) && Intrinsics.areEqual(this.option, optionLeg.option) && this.position_effect == optionLeg.position_effect && this.ratio_quantity == optionLeg.ratio_quantity && this.side == optionLeg.side;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.option.hashCode()) * 37) + this.position_effect.hashCode()) * 37) + Integer.hashCode(this.ratio_quantity)) * 37) + this.side.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("option=" + Internal.sanitize(this.option));
        arrayList.add("position_effect=" + this.position_effect);
        arrayList.add("ratio_quantity=" + this.ratio_quantity);
        arrayList.add("side=" + this.side);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionLeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionLeg copy$default(OptionLeg optionLeg, String str, PositionEffect positionEffect, int i, Side side, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = optionLeg.option;
        }
        if ((i2 & 2) != 0) {
            positionEffect = optionLeg.position_effect;
        }
        if ((i2 & 4) != 0) {
            i = optionLeg.ratio_quantity;
        }
        if ((i2 & 8) != 0) {
            side = optionLeg.side;
        }
        if ((i2 & 16) != 0) {
            byteString = optionLeg.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return optionLeg.copy(str, positionEffect, i3, side, byteString2);
    }

    public final OptionLeg copy(String option, PositionEffect position_effect, int ratio_quantity, Side side, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionLeg(option, position_effect, ratio_quantity, side, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionLeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionLeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOption(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOption());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    size += PositionEffect.ADAPTER.encodedSizeWithTag(2, value.getPosition_effect());
                }
                if (value.getRatio_quantity() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getRatio_quantity()));
                }
                return value.getSide() != Side.SIDE_UNSPECIFIED ? size + Side.ADAPTER.encodedSizeWithTag(4, value.getSide()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOption(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 2, (int) value.getPosition_effect());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getSide());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 4, (int) value.getSide());
                }
                if (value.getRatio_quantity() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getRatio_quantity()));
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 2, (int) value.getPosition_effect());
                }
                if (Intrinsics.areEqual(value.getOption(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOption());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionLeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionEffect positionEffectDecode = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                Side sideDecode = side;
                while (true) {
                    PositionEffect positionEffect = positionEffectDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OptionLeg(strDecode, positionEffect, iIntValue, sideDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (iNextTag == 4) {
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
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
            public OptionLeg redact(OptionLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionLeg.copy$default(value, null, null, 0, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
