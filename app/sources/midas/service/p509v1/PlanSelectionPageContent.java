package midas.service.p509v1;

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

/* compiled from: PlanSelectionPageContent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lmidas/service/v1/PlanSelectionPageContent;", "Lcom/squareup/wire/Message;", "", "title", "", "plans", "", "Lmidas/service/v1/GoldPlanSelectionOption;", "cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getCta_text", "getPlans", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PlanSelectionPageContent extends Message {

    @JvmField
    public static final ProtoAdapter<PlanSelectionPageContent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String cta_text;

    @WireField(adapter = "midas.service.v1.GoldPlanSelectionOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<GoldPlanSelectionOption> plans;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PlanSelectionPageContent() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ PlanSelectionPageContent(String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29322newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanSelectionPageContent(String title, List<GoldPlanSelectionOption> plans, String cta_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.cta_text = cta_text;
        this.plans = Internal.immutableCopyOf("plans", plans);
    }

    public final List<GoldPlanSelectionOption> getPlans() {
        return this.plans;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29322newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlanSelectionPageContent)) {
            return false;
        }
        PlanSelectionPageContent planSelectionPageContent = (PlanSelectionPageContent) other;
        return Intrinsics.areEqual(unknownFields(), planSelectionPageContent.unknownFields()) && Intrinsics.areEqual(this.title, planSelectionPageContent.title) && Intrinsics.areEqual(this.plans, planSelectionPageContent.plans) && Intrinsics.areEqual(this.cta_text, planSelectionPageContent.cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.plans.hashCode()) * 37) + this.cta_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.plans.isEmpty()) {
            arrayList.add("plans=" + this.plans);
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlanSelectionPageContent{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlanSelectionPageContent copy$default(PlanSelectionPageContent planSelectionPageContent, String str, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planSelectionPageContent.title;
        }
        if ((i & 2) != 0) {
            list = planSelectionPageContent.plans;
        }
        if ((i & 4) != 0) {
            str2 = planSelectionPageContent.cta_text;
        }
        if ((i & 8) != 0) {
            byteString = planSelectionPageContent.unknownFields();
        }
        return planSelectionPageContent.copy(str, list, str2, byteString);
    }

    public final PlanSelectionPageContent copy(String title, List<GoldPlanSelectionOption> plans, String cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlanSelectionPageContent(title, plans, cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlanSelectionPageContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlanSelectionPageContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.PlanSelectionPageContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlanSelectionPageContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + GoldPlanSelectionOption.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getPlans());
                return !Intrinsics.areEqual(value.getCta_text(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCta_text()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlanSelectionPageContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                GoldPlanSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPlans());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlanSelectionPageContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                GoldPlanSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPlans());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlanSelectionPageContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlanSelectionPageContent(strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(GoldPlanSelectionOption.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlanSelectionPageContent redact(PlanSelectionPageContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlanSelectionPageContent.copy$default(value, null, Internal.m26823redactElements(value.getPlans(), GoldPlanSelectionOption.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
