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

/* compiled from: AdvisoryDepositGoldValuePropContent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "Lcom/squareup/wire/Message;", "", "", "pill_title", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;", "value_prop_modal", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContent;", "dynamic_content", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContent;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContent;Lokio/ByteString;)Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "Ljava/lang/String;", "getPill_title", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;", "getValue_prop_modal", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModal;", "getValue_prop_modal$annotations", "()V", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContent;", "getDynamic_content", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContent;", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryDepositGoldValuePropContent extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryDepositGoldValuePropContent> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.AdvisoryDepositGoldValuePropDynamicContent#ADAPTER", jsonName = "dynamicContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AdvisoryDepositGoldValuePropDynamicContent dynamic_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pillTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String pill_title;

    @WireField(adapter = "advisory.proto.v1.AdvisoryDepositGoldValuePropModal#ADAPTER", jsonName = "valuePropModal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AdvisoryDepositGoldValuePropModal value_prop_modal;

    public AdvisoryDepositGoldValuePropContent() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4371newBuilder();
    }

    public final String getPill_title() {
        return this.pill_title;
    }

    public /* synthetic */ AdvisoryDepositGoldValuePropContent(String str, AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal, AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : advisoryDepositGoldValuePropModal, (i & 4) != 0 ? null : advisoryDepositGoldValuePropDynamicContent, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AdvisoryDepositGoldValuePropModal getValue_prop_modal() {
        return this.value_prop_modal;
    }

    public final AdvisoryDepositGoldValuePropDynamicContent getDynamic_content() {
        return this.dynamic_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryDepositGoldValuePropContent(String pill_title, AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal, AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(pill_title, "pill_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.pill_title = pill_title;
        this.value_prop_modal = advisoryDepositGoldValuePropModal;
        this.dynamic_content = advisoryDepositGoldValuePropDynamicContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4371newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryDepositGoldValuePropContent)) {
            return false;
        }
        AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent = (AdvisoryDepositGoldValuePropContent) other;
        return Intrinsics.areEqual(unknownFields(), advisoryDepositGoldValuePropContent.unknownFields()) && Intrinsics.areEqual(this.pill_title, advisoryDepositGoldValuePropContent.pill_title) && Intrinsics.areEqual(this.value_prop_modal, advisoryDepositGoldValuePropContent.value_prop_modal) && Intrinsics.areEqual(this.dynamic_content, advisoryDepositGoldValuePropContent.dynamic_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.pill_title.hashCode()) * 37;
        AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal = this.value_prop_modal;
        int iHashCode2 = (iHashCode + (advisoryDepositGoldValuePropModal != null ? advisoryDepositGoldValuePropModal.hashCode() : 0)) * 37;
        AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContent = this.dynamic_content;
        int iHashCode3 = iHashCode2 + (advisoryDepositGoldValuePropDynamicContent != null ? advisoryDepositGoldValuePropDynamicContent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pill_title=" + Internal.sanitize(this.pill_title));
        AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal = this.value_prop_modal;
        if (advisoryDepositGoldValuePropModal != null) {
            arrayList.add("value_prop_modal=" + advisoryDepositGoldValuePropModal);
        }
        AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContent = this.dynamic_content;
        if (advisoryDepositGoldValuePropDynamicContent != null) {
            arrayList.add("dynamic_content=" + advisoryDepositGoldValuePropDynamicContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryDepositGoldValuePropContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryDepositGoldValuePropContent copy$default(AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent, String str, AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModal, AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryDepositGoldValuePropContent.pill_title;
        }
        if ((i & 2) != 0) {
            advisoryDepositGoldValuePropModal = advisoryDepositGoldValuePropContent.value_prop_modal;
        }
        if ((i & 4) != 0) {
            advisoryDepositGoldValuePropDynamicContent = advisoryDepositGoldValuePropContent.dynamic_content;
        }
        if ((i & 8) != 0) {
            byteString = advisoryDepositGoldValuePropContent.unknownFields();
        }
        return advisoryDepositGoldValuePropContent.copy(str, advisoryDepositGoldValuePropModal, advisoryDepositGoldValuePropDynamicContent, byteString);
    }

    public final AdvisoryDepositGoldValuePropContent copy(String pill_title, AdvisoryDepositGoldValuePropModal value_prop_modal, AdvisoryDepositGoldValuePropDynamicContent dynamic_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(pill_title, "pill_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryDepositGoldValuePropContent(pill_title, value_prop_modal, dynamic_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryDepositGoldValuePropContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryDepositGoldValuePropContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryDepositGoldValuePropContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryDepositGoldValuePropContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPill_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPill_title());
                }
                if (value.getValue_prop_modal() != null) {
                    size += AdvisoryDepositGoldValuePropModal.ADAPTER.encodedSizeWithTag(2, value.getValue_prop_modal());
                }
                return value.getDynamic_content() != null ? size + AdvisoryDepositGoldValuePropDynamicContent.ADAPTER.encodedSizeWithTag(3, value.getDynamic_content()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryDepositGoldValuePropContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPill_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPill_title());
                }
                if (value.getValue_prop_modal() != null) {
                    AdvisoryDepositGoldValuePropModal.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue_prop_modal());
                }
                if (value.getDynamic_content() != null) {
                    AdvisoryDepositGoldValuePropDynamicContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getDynamic_content());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryDepositGoldValuePropContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDynamic_content() != null) {
                    AdvisoryDepositGoldValuePropDynamicContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getDynamic_content());
                }
                if (value.getValue_prop_modal() != null) {
                    AdvisoryDepositGoldValuePropModal.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue_prop_modal());
                }
                if (Intrinsics.areEqual(value.getPill_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPill_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryDepositGoldValuePropContent redact(AdvisoryDepositGoldValuePropContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryDepositGoldValuePropModal value_prop_modal = value.getValue_prop_modal();
                AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModalRedact = value_prop_modal != null ? AdvisoryDepositGoldValuePropModal.ADAPTER.redact(value_prop_modal) : null;
                AdvisoryDepositGoldValuePropDynamicContent dynamic_content = value.getDynamic_content();
                return AdvisoryDepositGoldValuePropContent.copy$default(value, null, advisoryDepositGoldValuePropModalRedact, dynamic_content != null ? AdvisoryDepositGoldValuePropDynamicContent.ADAPTER.redact(dynamic_content) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryDepositGoldValuePropContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AdvisoryDepositGoldValuePropModal advisoryDepositGoldValuePropModalDecode = null;
                AdvisoryDepositGoldValuePropDynamicContent advisoryDepositGoldValuePropDynamicContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryDepositGoldValuePropContent(strDecode, advisoryDepositGoldValuePropModalDecode, advisoryDepositGoldValuePropDynamicContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        advisoryDepositGoldValuePropModalDecode = AdvisoryDepositGoldValuePropModal.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        advisoryDepositGoldValuePropDynamicContentDecode = AdvisoryDepositGoldValuePropDynamicContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
