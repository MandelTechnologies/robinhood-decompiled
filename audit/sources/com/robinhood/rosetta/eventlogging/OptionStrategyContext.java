package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: OptionStrategyContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "Lcom/squareup/wire/Message;", "", "is_watching", "", "has_position", "num_legs", "", "is_leg_context", "aggregate_option_position_id", "", "option_position_id", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZJZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "()Z", "getHas_position", "getNum_legs", "()J", "getAggregate_option_position_id", "()Ljava/lang/String;", "getOption_position_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionStrategyContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionStrategyContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "aggregateOptionPositionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String aggregate_option_position_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean has_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLegContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_leg_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isWatching", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_watching;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "numLegs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long num_legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionPositionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String option_position_id;

    public OptionStrategyContext() {
        this(false, false, 0L, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ OptionStrategyContext(boolean z, boolean z2, long j, boolean z3, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24437newBuilder();
    }

    /* renamed from: is_watching, reason: from getter */
    public final boolean getIs_watching() {
        return this.is_watching;
    }

    public final boolean getHas_position() {
        return this.has_position;
    }

    public final long getNum_legs() {
        return this.num_legs;
    }

    /* renamed from: is_leg_context, reason: from getter */
    public final boolean getIs_leg_context() {
        return this.is_leg_context;
    }

    public final String getAggregate_option_position_id() {
        return this.aggregate_option_position_id;
    }

    public final String getOption_position_id() {
        return this.option_position_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyContext(boolean z, boolean z2, long j, boolean z3, String aggregate_option_position_id, String option_position_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(aggregate_option_position_id, "aggregate_option_position_id");
        Intrinsics.checkNotNullParameter(option_position_id, "option_position_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_watching = z;
        this.has_position = z2;
        this.num_legs = j;
        this.is_leg_context = z3;
        this.aggregate_option_position_id = aggregate_option_position_id;
        this.option_position_id = option_position_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24437newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionStrategyContext)) {
            return false;
        }
        OptionStrategyContext optionStrategyContext = (OptionStrategyContext) other;
        return Intrinsics.areEqual(unknownFields(), optionStrategyContext.unknownFields()) && this.is_watching == optionStrategyContext.is_watching && this.has_position == optionStrategyContext.has_position && this.num_legs == optionStrategyContext.num_legs && this.is_leg_context == optionStrategyContext.is_leg_context && Intrinsics.areEqual(this.aggregate_option_position_id, optionStrategyContext.aggregate_option_position_id) && Intrinsics.areEqual(this.option_position_id, optionStrategyContext.option_position_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.is_watching)) * 37) + java.lang.Boolean.hashCode(this.has_position)) * 37) + Long.hashCode(this.num_legs)) * 37) + java.lang.Boolean.hashCode(this.is_leg_context)) * 37) + this.aggregate_option_position_id.hashCode()) * 37) + this.option_position_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_watching=" + this.is_watching);
        arrayList.add("has_position=" + this.has_position);
        arrayList.add("num_legs=" + this.num_legs);
        arrayList.add("is_leg_context=" + this.is_leg_context);
        arrayList.add("aggregate_option_position_id=" + Internal.sanitize(this.aggregate_option_position_id));
        arrayList.add("option_position_id=" + Internal.sanitize(this.option_position_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionStrategyContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionStrategyContext copy$default(OptionStrategyContext optionStrategyContext, boolean z, boolean z2, long j, boolean z3, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionStrategyContext.is_watching;
        }
        if ((i & 2) != 0) {
            z2 = optionStrategyContext.has_position;
        }
        if ((i & 4) != 0) {
            j = optionStrategyContext.num_legs;
        }
        if ((i & 8) != 0) {
            z3 = optionStrategyContext.is_leg_context;
        }
        if ((i & 16) != 0) {
            str = optionStrategyContext.aggregate_option_position_id;
        }
        if ((i & 32) != 0) {
            str2 = optionStrategyContext.option_position_id;
        }
        if ((i & 64) != 0) {
            byteString = optionStrategyContext.unknownFields();
        }
        long j2 = j;
        return optionStrategyContext.copy(z, z2, j2, z3, str, str2, byteString);
    }

    public final OptionStrategyContext copy(boolean is_watching, boolean has_position, long num_legs, boolean is_leg_context, String aggregate_option_position_id, String option_position_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(aggregate_option_position_id, "aggregate_option_position_id");
        Intrinsics.checkNotNullParameter(option_position_id, "option_position_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionStrategyContext(is_watching, has_position, num_legs, is_leg_context, aggregate_option_position_id, option_position_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionStrategyContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionStrategyContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionStrategyContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionStrategyContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_watching()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getIs_watching()));
                }
                if (value.getHas_position()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getHas_position()));
                }
                if (value.getNum_legs() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getNum_legs()));
                }
                if (value.getIs_leg_context()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, java.lang.Boolean.valueOf(value.getIs_leg_context()));
                }
                if (!Intrinsics.areEqual(value.getAggregate_option_position_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAggregate_option_position_id());
                }
                return !Intrinsics.areEqual(value.getOption_position_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getOption_position_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionStrategyContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_watching()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getIs_watching()));
                }
                if (value.getHas_position()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getHas_position()));
                }
                if (value.getNum_legs() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getNum_legs()));
                }
                if (value.getIs_leg_context()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIs_leg_context()));
                }
                if (!Intrinsics.areEqual(value.getAggregate_option_position_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAggregate_option_position_id());
                }
                if (!Intrinsics.areEqual(value.getOption_position_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOption_position_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionStrategyContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOption_position_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOption_position_id());
                }
                if (!Intrinsics.areEqual(value.getAggregate_option_position_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAggregate_option_position_id());
                }
                if (value.getIs_leg_context()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIs_leg_context()));
                }
                if (value.getNum_legs() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getNum_legs()));
                }
                if (value.getHas_position()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getHas_position()));
                }
                if (value.getIs_watching()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getIs_watching()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionStrategyContext redact(OptionStrategyContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionStrategyContext.copy$default(value, false, false, 0L, false, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionStrategyContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                long jLongValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 4:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new OptionStrategyContext(zBooleanValue, zBooleanValue2, jLongValue, zBooleanValue3, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
