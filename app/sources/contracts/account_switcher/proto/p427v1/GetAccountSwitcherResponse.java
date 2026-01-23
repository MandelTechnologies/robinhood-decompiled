package contracts.account_switcher.proto.p427v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: GetAccountSwitcherResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/GetAccountSwitcherResponse;", "Lcom/squareup/wire/Message;", "", "components", "", "Lrh_server_driven_ui/v1/UIComponent;", "footer_components", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getComponents", "()Ljava/util/List;", "getFooter_components", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetAccountSwitcherResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountSwitcherResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<UIComponent> components;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "footerComponents", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<UIComponent> footer_components;

    public GetAccountSwitcherResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27600newBuilder();
    }

    public /* synthetic */ GetAccountSwitcherResponse(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountSwitcherResponse(List<UIComponent> components, List<UIComponent> footer_components, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(footer_components, "footer_components");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.components = Internal.immutableCopyOf("components", components);
        this.footer_components = Internal.immutableCopyOf("footer_components", footer_components);
    }

    public final List<UIComponent> getComponents() {
        return this.components;
    }

    public final List<UIComponent> getFooter_components() {
        return this.footer_components;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27600newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountSwitcherResponse)) {
            return false;
        }
        GetAccountSwitcherResponse getAccountSwitcherResponse = (GetAccountSwitcherResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountSwitcherResponse.unknownFields()) && Intrinsics.areEqual(this.components, getAccountSwitcherResponse.components) && Intrinsics.areEqual(this.footer_components, getAccountSwitcherResponse.footer_components);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.components.hashCode()) * 37) + this.footer_components.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.components.isEmpty()) {
            arrayList.add("components=" + this.components);
        }
        if (!this.footer_components.isEmpty()) {
            arrayList.add("footer_components=" + this.footer_components);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountSwitcherResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAccountSwitcherResponse copy(List<UIComponent> components, List<UIComponent> footer_components, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(footer_components, "footer_components");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountSwitcherResponse(components, footer_components, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountSwitcherResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountSwitcherResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.account_switcher.proto.v1.GetAccountSwitcherResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getComponents()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getFooter_components());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getComponents());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getFooter_components());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getFooter_components());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getComponents());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountSwitcherResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAccountSwitcherResponse(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(UIComponent.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(UIComponent.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountSwitcherResponse redact(GetAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<UIComponent> components = value.getComponents();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                return value.copy(Internal.m26823redactElements(components, protoAdapter), Internal.m26823redactElements(value.getFooter_components(), protoAdapter), ByteString.EMPTY);
            }
        };
    }
}
