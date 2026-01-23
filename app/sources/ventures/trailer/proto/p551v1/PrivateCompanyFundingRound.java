package ventures.trailer.proto.p551v1;

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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: PrivateCompanyFundingRound.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lventures/trailer/proto/v1/PrivateCompanyFundingRound;", "Lcom/squareup/wire/Message;", "", "header_content", "Lrh_server_driven_ui/v1/UIComponent;", "expanded_content", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Lokio/ByteString;)V", "getHeader_content", "()Lrh_server_driven_ui/v1/UIComponent;", "getExpanded_content", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class PrivateCompanyFundingRound extends Message {

    @JvmField
    public static final ProtoAdapter<PrivateCompanyFundingRound> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "expandedContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UIComponent expanded_content;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "headerContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent header_content;

    public PrivateCompanyFundingRound() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30043newBuilder();
    }

    public final UIComponent getHeader_content() {
        return this.header_content;
    }

    public final UIComponent getExpanded_content() {
        return this.expanded_content;
    }

    public /* synthetic */ PrivateCompanyFundingRound(UIComponent uIComponent, UIComponent uIComponent2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : uIComponent2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateCompanyFundingRound(UIComponent uIComponent, UIComponent uIComponent2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header_content = uIComponent;
        this.expanded_content = uIComponent2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30043newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrivateCompanyFundingRound)) {
            return false;
        }
        PrivateCompanyFundingRound privateCompanyFundingRound = (PrivateCompanyFundingRound) other;
        return Intrinsics.areEqual(unknownFields(), privateCompanyFundingRound.unknownFields()) && Intrinsics.areEqual(this.header_content, privateCompanyFundingRound.header_content) && Intrinsics.areEqual(this.expanded_content, privateCompanyFundingRound.expanded_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.header_content;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        UIComponent uIComponent2 = this.expanded_content;
        int iHashCode3 = iHashCode2 + (uIComponent2 != null ? uIComponent2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.header_content;
        if (uIComponent != null) {
            arrayList.add("header_content=" + uIComponent);
        }
        UIComponent uIComponent2 = this.expanded_content;
        if (uIComponent2 != null) {
            arrayList.add("expanded_content=" + uIComponent2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrivateCompanyFundingRound{", "}", 0, null, null, 56, null);
    }

    public final PrivateCompanyFundingRound copy(UIComponent header_content, UIComponent expanded_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PrivateCompanyFundingRound(header_content, expanded_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrivateCompanyFundingRound.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PrivateCompanyFundingRound>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.PrivateCompanyFundingRound$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PrivateCompanyFundingRound value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHeader_content() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getHeader_content());
                }
                return value.getExpanded_content() != null ? size + UIComponent.ADAPTER.encodedSizeWithTag(2, value.getExpanded_content()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PrivateCompanyFundingRound value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHeader_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getHeader_content());
                }
                if (value.getExpanded_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getExpanded_content());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PrivateCompanyFundingRound value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExpanded_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getExpanded_content());
                }
                if (value.getHeader_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getHeader_content());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyFundingRound redact(PrivateCompanyFundingRound value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent header_content = value.getHeader_content();
                UIComponent uIComponentRedact = header_content != null ? UIComponent.ADAPTER.redact(header_content) : null;
                UIComponent expanded_content = value.getExpanded_content();
                return value.copy(uIComponentRedact, expanded_content != null ? UIComponent.ADAPTER.redact(expanded_content) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyFundingRound decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                UIComponent uIComponentDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PrivateCompanyFundingRound(uIComponentDecode, uIComponentDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
