package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: SetIndicatorTemplateAction.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplateAction;", "Lcom/squareup/wire/Message;", "", "id", "", "indicator_template_action", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTemplateAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTemplateAction;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getIndicator_template_action", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTemplateAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetIndicatorTemplateAction extends Message {

    @JvmField
    public static final ProtoAdapter<SetIndicatorTemplateAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorTemplateAction#ADAPTER", jsonName = "indicatorTemplateAction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IndicatorTemplateAction indicator_template_action;

    public SetIndicatorTemplateAction() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8656newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final IndicatorTemplateAction getIndicator_template_action() {
        return this.indicator_template_action;
    }

    public /* synthetic */ SetIndicatorTemplateAction(String str, IndicatorTemplateAction indicatorTemplateAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : indicatorTemplateAction, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetIndicatorTemplateAction(String str, IndicatorTemplateAction indicatorTemplateAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = str;
        this.indicator_template_action = indicatorTemplateAction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8656newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetIndicatorTemplateAction)) {
            return false;
        }
        SetIndicatorTemplateAction setIndicatorTemplateAction = (SetIndicatorTemplateAction) other;
        return Intrinsics.areEqual(unknownFields(), setIndicatorTemplateAction.unknownFields()) && Intrinsics.areEqual(this.id, setIndicatorTemplateAction.id) && Intrinsics.areEqual(this.indicator_template_action, setIndicatorTemplateAction.indicator_template_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        IndicatorTemplateAction indicatorTemplateAction = this.indicator_template_action;
        int iHashCode3 = iHashCode2 + (indicatorTemplateAction != null ? indicatorTemplateAction.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            arrayList.add("id=" + Internal.sanitize(str));
        }
        IndicatorTemplateAction indicatorTemplateAction = this.indicator_template_action;
        if (indicatorTemplateAction != null) {
            arrayList.add("indicator_template_action=" + indicatorTemplateAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetIndicatorTemplateAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetIndicatorTemplateAction copy$default(SetIndicatorTemplateAction setIndicatorTemplateAction, String str, IndicatorTemplateAction indicatorTemplateAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setIndicatorTemplateAction.id;
        }
        if ((i & 2) != 0) {
            indicatorTemplateAction = setIndicatorTemplateAction.indicator_template_action;
        }
        if ((i & 4) != 0) {
            byteString = setIndicatorTemplateAction.unknownFields();
        }
        return setIndicatorTemplateAction.copy(str, indicatorTemplateAction, byteString);
    }

    public final SetIndicatorTemplateAction copy(String id, IndicatorTemplateAction indicator_template_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetIndicatorTemplateAction(id, indicator_template_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetIndicatorTemplateAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetIndicatorTemplateAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetIndicatorTemplateAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetIndicatorTemplateAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                return value.getIndicator_template_action() != null ? size + IndicatorTemplateAction.ADAPTER.encodedSizeWithTag(2, value.getIndicator_template_action()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetIndicatorTemplateAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                if (value.getIndicator_template_action() != null) {
                    IndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getIndicator_template_action());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetIndicatorTemplateAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIndicator_template_action() != null) {
                    IndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getIndicator_template_action());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetIndicatorTemplateAction redact(SetIndicatorTemplateAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndicatorTemplateAction indicator_template_action = value.getIndicator_template_action();
                return SetIndicatorTemplateAction.copy$default(value, null, indicator_template_action != null ? IndicatorTemplateAction.ADAPTER.redact(indicator_template_action) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetIndicatorTemplateAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                IndicatorTemplateAction indicatorTemplateActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetIndicatorTemplateAction(strDecode, indicatorTemplateActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        indicatorTemplateActionDecode = IndicatorTemplateAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
