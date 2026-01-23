package advisory.proto.p008v1;

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

/* compiled from: AdvisoryDepositGoldValuePropDynamicContent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContent;", "Lcom/squareup/wire/Message;", "", "multi_value_prop_content", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;", "single_value_prop_content", "Ladvisory/proto/v1/AdvisoryDepositGoldSingleValuePropModal;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;Ladvisory/proto/v1/AdvisoryDepositGoldSingleValuePropModal;Lokio/ByteString;)V", "getMulti_value_prop_content", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;", "getSingle_value_prop_content", "()Ladvisory/proto/v1/AdvisoryDepositGoldSingleValuePropModal;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryDepositGoldValuePropDynamicContent extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryDepositGoldValuePropDynamicContent> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.AdvisoryDepositGoldValuePropModal#ADAPTER", jsonName = "multiValuePropContent", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final AdvisoryDepositGoldValuePropModal multi_value_prop_content;

    @WireField(adapter = "advisory.proto.v1.AdvisoryDepositGoldSingleValuePropModal#ADAPTER", jsonName = "singleValuePropContent", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final AdvisoryDepositGoldSingleValuePropModal single_value_prop_content;

    public AdvisoryDepositGoldValuePropDynamicContent() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4372newBuilder();
    }

    public final AdvisoryDepositGoldValuePropModal getMulti_value_prop_content() {
        return this.multi_value_prop_content;
    }

    public final AdvisoryDepositGoldSingleValuePropModal getSingle_value_prop_content() {
        return this.single_value_prop_content;
    }

    public /* synthetic */ AdvisoryDepositGoldValuePropDynamicContent(AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal, AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModal, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisoryDepositGoldValuePropModal, (i & 2) != 0 ? null : advisoryDepositGoldSingleValuePropModal, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryDepositGoldValuePropDynamicContent(AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal, AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModal, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.multi_value_prop_content = advisoryDepositGoldValuePropModal;
        this.single_value_prop_content = advisoryDepositGoldSingleValuePropModal;
        if (Internal.countNonNull(advisoryDepositGoldValuePropModal, advisoryDepositGoldSingleValuePropModal) > 1) {
            throw new IllegalArgumentException("At most one of multi_value_prop_content, single_value_prop_content may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4372newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryDepositGoldValuePropDynamicContent)) {
            return false;
        }
        AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContent = (AdvisoryDepositGoldValuePropDynamicContent) other;
        return Intrinsics.areEqual(unknownFields(), advisoryDepositGoldValuePropDynamicContent.unknownFields()) && Intrinsics.areEqual(this.multi_value_prop_content, advisoryDepositGoldValuePropDynamicContent.multi_value_prop_content) && Intrinsics.areEqual(this.single_value_prop_content, advisoryDepositGoldValuePropDynamicContent.single_value_prop_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal = this.multi_value_prop_content;
        int iHashCode2 = (iHashCode + (advisoryDepositGoldValuePropModal != null ? advisoryDepositGoldValuePropModal.hashCode() : 0)) * 37;
        AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModal = this.single_value_prop_content;
        int iHashCode3 = iHashCode2 + (advisoryDepositGoldSingleValuePropModal != null ? advisoryDepositGoldSingleValuePropModal.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal = this.multi_value_prop_content;
        if (advisoryDepositGoldValuePropModal != null) {
            arrayList.add("multi_value_prop_content=" + advisoryDepositGoldValuePropModal);
        }
        AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModal = this.single_value_prop_content;
        if (advisoryDepositGoldSingleValuePropModal != null) {
            arrayList.add("single_value_prop_content=" + advisoryDepositGoldSingleValuePropModal);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryDepositGoldValuePropDynamicContent{", "}", 0, null, null, 56, null);
    }

    public final AdvisoryDepositGoldValuePropDynamicContent copy(AdvisoryDepositGoldValuePropModal multi_value_prop_content, AdvisoryDepositGoldSingleValuePropModal single_value_prop_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryDepositGoldValuePropDynamicContent(multi_value_prop_content, single_value_prop_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryDepositGoldValuePropDynamicContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryDepositGoldValuePropDynamicContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryDepositGoldValuePropDynamicContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryDepositGoldValuePropDynamicContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + AdvisoryDepositGoldValuePropModal.ADAPTER.encodedSizeWithTag(1, value.getMulti_value_prop_content()) + AdvisoryDepositGoldSingleValuePropModal.ADAPTER.encodedSizeWithTag(2, value.getSingle_value_prop_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryDepositGoldValuePropDynamicContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryDepositGoldValuePropModal.ADAPTER.encodeWithTag(writer, 1, (int) value.getMulti_value_prop_content());
                AdvisoryDepositGoldSingleValuePropModal.ADAPTER.encodeWithTag(writer, 2, (int) value.getSingle_value_prop_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryDepositGoldValuePropDynamicContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisoryDepositGoldSingleValuePropModal.ADAPTER.encodeWithTag(writer, 2, (int) value.getSingle_value_prop_content());
                AdvisoryDepositGoldValuePropModal.ADAPTER.encodeWithTag(writer, 1, (int) value.getMulti_value_prop_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryDepositGoldValuePropDynamicContent redact(AdvisoryDepositGoldValuePropDynamicContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryDepositGoldValuePropModal multi_value_prop_content = value.getMulti_value_prop_content();
                AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModalRedact = multi_value_prop_content != null ? AdvisoryDepositGoldValuePropModal.ADAPTER.redact(multi_value_prop_content) : null;
                AdvisoryDepositGoldSingleValuePropModal single_value_prop_content = value.getSingle_value_prop_content();
                return value.copy(advisoryDepositGoldValuePropModalRedact, single_value_prop_content != null ? AdvisoryDepositGoldSingleValuePropModal.ADAPTER.redact(single_value_prop_content) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryDepositGoldValuePropDynamicContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModalDecode = null;
                AdvisoryDepositGoldSingleValuePropModal advisoryDepositGoldSingleValuePropModalDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryDepositGoldValuePropDynamicContent(advisoryDepositGoldValuePropModalDecode, advisoryDepositGoldSingleValuePropModalDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        advisoryDepositGoldValuePropModalDecode = AdvisoryDepositGoldValuePropModal.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        advisoryDepositGoldSingleValuePropModalDecode = AdvisoryDepositGoldSingleValuePropModal.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
