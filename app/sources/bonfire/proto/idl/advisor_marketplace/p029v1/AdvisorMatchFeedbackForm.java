package bonfire.proto.idl.advisor_marketplace.p029v1;

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

/* compiled from: AdvisorMatchFeedbackForm.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackForm;", "Lcom/squareup/wire/Message;", "", "header", "", "options", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOptionData;", "custom_feedback_placeholder", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getHeader", "()Ljava/lang/String;", "getCustom_feedback_placeholder", "getOptions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorMatchFeedbackForm extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorMatchFeedbackForm> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "customFeedbackPlaceholder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String custom_feedback_placeholder;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFeedbackOptionData#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AdvisorMatchFeedbackOptionData> options;

    public AdvisorMatchFeedbackForm() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ AdvisorMatchFeedbackForm(String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8761newBuilder();
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getCustom_feedback_placeholder() {
        return this.custom_feedback_placeholder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMatchFeedbackForm(String header, List<AdvisorMatchFeedbackOptionData> options, String custom_feedback_placeholder, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(custom_feedback_placeholder, "custom_feedback_placeholder");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = header;
        this.custom_feedback_placeholder = custom_feedback_placeholder;
        this.options = Internal.immutableCopyOf("options", options);
    }

    public final List<AdvisorMatchFeedbackOptionData> getOptions() {
        return this.options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8761newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorMatchFeedbackForm)) {
            return false;
        }
        AdvisorMatchFeedbackForm advisorMatchFeedbackForm = (AdvisorMatchFeedbackForm) other;
        return Intrinsics.areEqual(unknownFields(), advisorMatchFeedbackForm.unknownFields()) && Intrinsics.areEqual(this.header, advisorMatchFeedbackForm.header) && Intrinsics.areEqual(this.options, advisorMatchFeedbackForm.options) && Intrinsics.areEqual(this.custom_feedback_placeholder, advisorMatchFeedbackForm.custom_feedback_placeholder);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.header.hashCode()) * 37) + this.options.hashCode()) * 37) + this.custom_feedback_placeholder.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header=" + Internal.sanitize(this.header));
        if (!this.options.isEmpty()) {
            arrayList.add("options=" + this.options);
        }
        arrayList.add("custom_feedback_placeholder=" + Internal.sanitize(this.custom_feedback_placeholder));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorMatchFeedbackForm{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvisorMatchFeedbackForm copy$default(AdvisorMatchFeedbackForm advisorMatchFeedbackForm, String str, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorMatchFeedbackForm.header;
        }
        if ((i & 2) != 0) {
            list = advisorMatchFeedbackForm.options;
        }
        if ((i & 4) != 0) {
            str2 = advisorMatchFeedbackForm.custom_feedback_placeholder;
        }
        if ((i & 8) != 0) {
            byteString = advisorMatchFeedbackForm.unknownFields();
        }
        return advisorMatchFeedbackForm.copy(str, list, str2, byteString);
    }

    public final AdvisorMatchFeedbackForm copy(String header, List<AdvisorMatchFeedbackOptionData> options, String custom_feedback_placeholder, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(custom_feedback_placeholder, "custom_feedback_placeholder");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorMatchFeedbackForm(header, options, custom_feedback_placeholder, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorMatchFeedbackForm.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorMatchFeedbackForm>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFeedbackForm$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorMatchFeedbackForm value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader());
                }
                int iEncodedSizeWithTag = size + AdvisorMatchFeedbackOptionData.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getOptions());
                return !Intrinsics.areEqual(value.getCustom_feedback_placeholder(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCustom_feedback_placeholder()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorMatchFeedbackForm value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                AdvisorMatchFeedbackOptionData.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getOptions());
                if (!Intrinsics.areEqual(value.getCustom_feedback_placeholder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCustom_feedback_placeholder());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorMatchFeedbackForm value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCustom_feedback_placeholder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCustom_feedback_placeholder());
                }
                AdvisorMatchFeedbackOptionData.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getOptions());
                if (Intrinsics.areEqual(value.getHeader(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMatchFeedbackForm decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorMatchFeedbackForm(strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(AdvisorMatchFeedbackOptionData.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMatchFeedbackForm redact(AdvisorMatchFeedbackForm value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisorMatchFeedbackForm.copy$default(value, null, Internal.m26823redactElements(value.getOptions(), AdvisorMatchFeedbackOptionData.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
