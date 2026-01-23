package hippo.model.p469v1;

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

/* compiled from: OptionOrderFormSettings.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/OptionOrderFormSettings;", "Lcom/squareup/wire/Message;", "", "option_ratio_quantity_type", "Lhippo/model/v1/OptionRatioQuantityType;", "option_last_selected_session", "Lhippo/model/v1/OptionTradingSession;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/OptionRatioQuantityType;Lhippo/model/v1/OptionTradingSession;Lokio/ByteString;)V", "getOption_ratio_quantity_type", "()Lhippo/model/v1/OptionRatioQuantityType;", "getOption_last_selected_session", "()Lhippo/model/v1/OptionTradingSession;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OptionOrderFormSettings extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderFormSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.OptionTradingSession#ADAPTER", jsonName = "optionLastSelectedSession", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OptionTradingSession option_last_selected_session;

    @WireField(adapter = "hippo.model.v1.OptionRatioQuantityType#ADAPTER", jsonName = "optionRatioQuantityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OptionRatioQuantityType option_ratio_quantity_type;

    public OptionOrderFormSettings() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28252newBuilder();
    }

    public final OptionRatioQuantityType getOption_ratio_quantity_type() {
        return this.option_ratio_quantity_type;
    }

    public /* synthetic */ OptionOrderFormSettings(OptionRatioQuantityType optionRatioQuantityType, OptionTradingSession optionTradingSession, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED : optionRatioQuantityType, (i & 2) != 0 ? OptionTradingSession.OPTION_TRADING_SESSION_UNSPECIFIED : optionTradingSession, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OptionTradingSession getOption_last_selected_session() {
        return this.option_last_selected_session;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderFormSettings(OptionRatioQuantityType option_ratio_quantity_type, OptionTradingSession option_last_selected_session, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option_ratio_quantity_type, "option_ratio_quantity_type");
        Intrinsics.checkNotNullParameter(option_last_selected_session, "option_last_selected_session");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.option_ratio_quantity_type = option_ratio_quantity_type;
        this.option_last_selected_session = option_last_selected_session;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28252newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderFormSettings)) {
            return false;
        }
        OptionOrderFormSettings optionOrderFormSettings = (OptionOrderFormSettings) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderFormSettings.unknownFields()) && this.option_ratio_quantity_type == optionOrderFormSettings.option_ratio_quantity_type && this.option_last_selected_session == optionOrderFormSettings.option_last_selected_session;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.option_ratio_quantity_type.hashCode()) * 37) + this.option_last_selected_session.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("option_ratio_quantity_type=" + this.option_ratio_quantity_type);
        arrayList.add("option_last_selected_session=" + this.option_last_selected_session);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderFormSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionOrderFormSettings copy$default(OptionOrderFormSettings optionOrderFormSettings, OptionRatioQuantityType optionRatioQuantityType, OptionTradingSession optionTradingSession, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            optionRatioQuantityType = optionOrderFormSettings.option_ratio_quantity_type;
        }
        if ((i & 2) != 0) {
            optionTradingSession = optionOrderFormSettings.option_last_selected_session;
        }
        if ((i & 4) != 0) {
            byteString = optionOrderFormSettings.unknownFields();
        }
        return optionOrderFormSettings.copy(optionRatioQuantityType, optionTradingSession, byteString);
    }

    public final OptionOrderFormSettings copy(OptionRatioQuantityType option_ratio_quantity_type, OptionTradingSession option_last_selected_session, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option_ratio_quantity_type, "option_ratio_quantity_type");
        Intrinsics.checkNotNullParameter(option_last_selected_session, "option_last_selected_session");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderFormSettings(option_ratio_quantity_type, option_last_selected_session, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderFormSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderFormSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.OptionOrderFormSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderFormSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOption_ratio_quantity_type() != OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED) {
                    size += OptionRatioQuantityType.ADAPTER.encodedSizeWithTag(1, value.getOption_ratio_quantity_type());
                }
                return value.getOption_last_selected_session() != OptionTradingSession.OPTION_TRADING_SESSION_UNSPECIFIED ? size + OptionTradingSession.ADAPTER.encodedSizeWithTag(2, value.getOption_last_selected_session()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderFormSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOption_ratio_quantity_type() != OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED) {
                    OptionRatioQuantityType.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption_ratio_quantity_type());
                }
                if (value.getOption_last_selected_session() != OptionTradingSession.OPTION_TRADING_SESSION_UNSPECIFIED) {
                    OptionTradingSession.ADAPTER.encodeWithTag(writer, 2, (int) value.getOption_last_selected_session());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderFormSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOption_last_selected_session() != OptionTradingSession.OPTION_TRADING_SESSION_UNSPECIFIED) {
                    OptionTradingSession.ADAPTER.encodeWithTag(writer, 2, (int) value.getOption_last_selected_session());
                }
                if (value.getOption_ratio_quantity_type() != OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED) {
                    OptionRatioQuantityType.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption_ratio_quantity_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderFormSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OptionRatioQuantityType optionRatioQuantityTypeDecode = OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED;
                OptionTradingSession optionTradingSessionDecode = OptionTradingSession.OPTION_TRADING_SESSION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionOrderFormSettings(optionRatioQuantityTypeDecode, optionTradingSessionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            optionRatioQuantityTypeDecode = OptionRatioQuantityType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            optionTradingSessionDecode = OptionTradingSession.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderFormSettings redact(OptionOrderFormSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionOrderFormSettings.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
