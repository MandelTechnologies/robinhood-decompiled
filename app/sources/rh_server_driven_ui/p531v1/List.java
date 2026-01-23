package rh_server_driven_ui.p531v1;

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

/* compiled from: List.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lrh_server_driven_ui/v1/List;", "Lcom/squareup/wire/Message;", "", "items", "", "Lrh_server_driven_ui/v1/UIComponent;", "disable_scroll", "", "hide_scroll_indicator", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;ZZLokio/ByteString;)V", "getDisable_scroll", "()Z", "getHide_scroll_indicator", "getItems", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class List extends Message {

    @JvmField
    public static final ProtoAdapter<List> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableScroll", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean disable_scroll;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hideScrollIndicator", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean hide_scroll_indicator;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final java.util.List<UIComponent> items;

    public List() {
        this(null, false, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29772newBuilder();
    }

    public /* synthetic */ List(java.util.List list, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getDisable_scroll() {
        return this.disable_scroll;
    }

    public final boolean getHide_scroll_indicator() {
        return this.hide_scroll_indicator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public List(java.util.List<UIComponent> items, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.disable_scroll = z;
        this.hide_scroll_indicator = z2;
        this.items = Internal.immutableCopyOf("items", items);
    }

    public final java.util.List<UIComponent> getItems() {
        return this.items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29772newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        List list = (List) other;
        return Intrinsics.areEqual(unknownFields(), list.unknownFields()) && Intrinsics.areEqual(this.items, list.items) && this.disable_scroll == list.disable_scroll && this.hide_scroll_indicator == list.hide_scroll_indicator;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.items.hashCode()) * 37) + Boolean.hashCode(this.disable_scroll)) * 37) + Boolean.hashCode(this.hide_scroll_indicator);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        arrayList.add("disable_scroll=" + this.disable_scroll);
        arrayList.add("hide_scroll_indicator=" + this.hide_scroll_indicator);
        return CollectionsKt.joinToString$default(arrayList, ", ", "List{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List copy$default(List list, java.util.List list2, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = list.items;
        }
        if ((i & 2) != 0) {
            z = list.disable_scroll;
        }
        if ((i & 4) != 0) {
            z2 = list.hide_scroll_indicator;
        }
        if ((i & 8) != 0) {
            byteString = list.unknownFields();
        }
        return list.copy(list2, z, z2, byteString);
    }

    public final List copy(java.util.List<UIComponent> items, boolean disable_scroll, boolean hide_scroll_indicator, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new List(items, disable_scroll, hide_scroll_indicator, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(List.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<List>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.List$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + UIComponent.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getItems());
                if (value.getDisable_scroll()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getDisable_scroll()));
                }
                return value.getHide_scroll_indicator() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getHide_scroll_indicator())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
                if (value.getDisable_scroll()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getDisable_scroll()));
                }
                if (value.getHide_scroll_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHide_scroll_indicator()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHide_scroll_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHide_scroll_indicator()));
                }
                if (value.getDisable_scroll()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getDisable_scroll()));
                }
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new List(arrayList, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(UIComponent.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List redact(List value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return List.copy$default(value, Internal.m26823redactElements(value.getItems(), UIComponent.ADAPTER), false, false, ByteString.EMPTY, 6, null);
            }
        };
    }
}
