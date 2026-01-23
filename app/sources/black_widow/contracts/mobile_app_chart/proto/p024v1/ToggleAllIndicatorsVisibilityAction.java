package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: ToggleAllIndicatorsVisibilityAction.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0017J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleAllIndicatorsVisibilityAction;", "Lcom/squareup/wire/Message;", "", "is_visible", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ToggleAllIndicatorsVisibilityAction extends Message {

    @JvmField
    public static final ProtoAdapter<ToggleAllIndicatorsVisibilityAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVisible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_visible;

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleAllIndicatorsVisibilityAction() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8680newBuilder();
    }

    /* renamed from: is_visible, reason: from getter */
    public final boolean getIs_visible() {
        return this.is_visible;
    }

    public /* synthetic */ ToggleAllIndicatorsVisibilityAction(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleAllIndicatorsVisibilityAction(boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_visible = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8680newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ToggleAllIndicatorsVisibilityAction)) {
            return false;
        }
        ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityAction = (ToggleAllIndicatorsVisibilityAction) other;
        return Intrinsics.areEqual(unknownFields(), toggleAllIndicatorsVisibilityAction.unknownFields()) && this.is_visible == toggleAllIndicatorsVisibilityAction.is_visible;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_visible);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_visible=" + this.is_visible);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleAllIndicatorsVisibilityAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ToggleAllIndicatorsVisibilityAction copy$default(ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityAction, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toggleAllIndicatorsVisibilityAction.is_visible;
        }
        if ((i & 2) != 0) {
            byteString = toggleAllIndicatorsVisibilityAction.unknownFields();
        }
        return toggleAllIndicatorsVisibilityAction.copy(z, byteString);
    }

    public final ToggleAllIndicatorsVisibilityAction copy(boolean is_visible, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ToggleAllIndicatorsVisibilityAction(is_visible, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToggleAllIndicatorsVisibilityAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ToggleAllIndicatorsVisibilityAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.ToggleAllIndicatorsVisibilityAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ToggleAllIndicatorsVisibilityAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getIs_visible() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_visible())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ToggleAllIndicatorsVisibilityAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_visible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_visible()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ToggleAllIndicatorsVisibilityAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_visible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_visible()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ToggleAllIndicatorsVisibilityAction redact(ToggleAllIndicatorsVisibilityAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ToggleAllIndicatorsVisibilityAction.copy$default(value, false, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ToggleAllIndicatorsVisibilityAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ToggleAllIndicatorsVisibilityAction(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
