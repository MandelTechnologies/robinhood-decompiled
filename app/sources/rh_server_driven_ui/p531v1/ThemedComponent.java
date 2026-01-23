package rh_server_driven_ui.p531v1;

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

/* compiled from: ThemedComponent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lrh_server_driven_ui/v1/ThemedComponent;", "Lcom/squareup/wire/Message;", "", "dark", "Lrh_server_driven_ui/v1/UIComponent;", "light", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Lokio/ByteString;)V", "getDark", "()Lrh_server_driven_ui/v1/UIComponent;", "getLight", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ThemedComponent extends Message {

    @JvmField
    public static final ProtoAdapter<ThemedComponent> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent dark;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UIComponent light;

    public ThemedComponent() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29848newBuilder();
    }

    public final UIComponent getDark() {
        return this.dark;
    }

    public final UIComponent getLight() {
        return this.light;
    }

    public /* synthetic */ ThemedComponent(UIComponent uIComponent, UIComponent uIComponent2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : uIComponent2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemedComponent(UIComponent uIComponent, UIComponent uIComponent2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dark = uIComponent;
        this.light = uIComponent2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29848newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ThemedComponent)) {
            return false;
        }
        ThemedComponent themedComponent = (ThemedComponent) other;
        return Intrinsics.areEqual(unknownFields(), themedComponent.unknownFields()) && Intrinsics.areEqual(this.dark, themedComponent.dark) && Intrinsics.areEqual(this.light, themedComponent.light);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.dark;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        UIComponent uIComponent2 = this.light;
        int iHashCode3 = iHashCode2 + (uIComponent2 != null ? uIComponent2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.dark;
        if (uIComponent != null) {
            arrayList.add("dark=" + uIComponent);
        }
        UIComponent uIComponent2 = this.light;
        if (uIComponent2 != null) {
            arrayList.add("light=" + uIComponent2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThemedComponent{", "}", 0, null, null, 56, null);
    }

    public final ThemedComponent copy(UIComponent dark, UIComponent light, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ThemedComponent(dark, light, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ThemedComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ThemedComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ThemedComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ThemedComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDark() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getDark());
                }
                return value.getLight() != null ? size + UIComponent.ADAPTER.encodedSizeWithTag(2, value.getLight()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ThemedComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDark() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getDark());
                }
                if (value.getLight() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getLight());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ThemedComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLight() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getLight());
                }
                if (value.getDark() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getDark());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThemedComponent redact(ThemedComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent dark = value.getDark();
                UIComponent uIComponentRedact = dark != null ? UIComponent.ADAPTER.redact(dark) : null;
                UIComponent light = value.getLight();
                return value.copy(uIComponentRedact, light != null ? UIComponent.ADAPTER.redact(light) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThemedComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                UIComponent uIComponentDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ThemedComponent(uIComponentDecode, uIComponentDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        uIComponentDecode2 = UIComponent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
