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

/* compiled from: SetIndicatorAction.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorAction;", "Lcom/squareup/wire/Message;", "", "id", "", "indicator_action", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorAction;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getIndicator_action", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetIndicatorAction extends Message {

    @JvmField
    public static final ProtoAdapter<SetIndicatorAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorAction#ADAPTER", jsonName = "indicatorAction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IndicatorAction indicator_action;

    public SetIndicatorAction() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8654newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ SetIndicatorAction(String str, IndicatorAction indicatorAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : indicatorAction, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final IndicatorAction getIndicator_action() {
        return this.indicator_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetIndicatorAction(String id, IndicatorAction indicatorAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.indicator_action = indicatorAction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8654newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetIndicatorAction)) {
            return false;
        }
        SetIndicatorAction setIndicatorAction = (SetIndicatorAction) other;
        return Intrinsics.areEqual(unknownFields(), setIndicatorAction.unknownFields()) && Intrinsics.areEqual(this.id, setIndicatorAction.id) && Intrinsics.areEqual(this.indicator_action, setIndicatorAction.indicator_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        IndicatorAction indicatorAction = this.indicator_action;
        int iHashCode2 = iHashCode + (indicatorAction != null ? indicatorAction.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        IndicatorAction indicatorAction = this.indicator_action;
        if (indicatorAction != null) {
            arrayList.add("indicator_action=" + indicatorAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetIndicatorAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetIndicatorAction copy$default(SetIndicatorAction setIndicatorAction, String str, IndicatorAction indicatorAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setIndicatorAction.id;
        }
        if ((i & 2) != 0) {
            indicatorAction = setIndicatorAction.indicator_action;
        }
        if ((i & 4) != 0) {
            byteString = setIndicatorAction.unknownFields();
        }
        return setIndicatorAction.copy(str, indicatorAction, byteString);
    }

    public final SetIndicatorAction copy(String id, IndicatorAction indicator_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetIndicatorAction(id, indicator_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetIndicatorAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetIndicatorAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetIndicatorAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetIndicatorAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return value.getIndicator_action() != null ? size + IndicatorAction.ADAPTER.encodedSizeWithTag(2, value.getIndicator_action()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetIndicatorAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getIndicator_action() != null) {
                    IndicatorAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getIndicator_action());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetIndicatorAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIndicator_action() != null) {
                    IndicatorAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getIndicator_action());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetIndicatorAction redact(SetIndicatorAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndicatorAction indicator_action = value.getIndicator_action();
                return SetIndicatorAction.copy$default(value, null, indicator_action != null ? IndicatorAction.ADAPTER.redact(indicator_action) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetIndicatorAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                IndicatorAction indicatorActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetIndicatorAction(strDecode, indicatorActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        indicatorActionDecode = IndicatorAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
