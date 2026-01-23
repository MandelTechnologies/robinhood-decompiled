package advisory.update_investor_profile.proto.p009v1;

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

/* compiled from: UpdateInvestorProfilePage.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePage;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "items", "", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdown;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getItems", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class UpdateInvestorProfilePage extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateInvestorProfilePage> ADAPTER;

    @WireField(adapter = "advisory.update_investor_profile.proto.v1.UpdateInvestorProfileAllocationBreakdown#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<UpdateInvestorProfileAllocationBreakdown> items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public UpdateInvestorProfilePage() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ UpdateInvestorProfilePage(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4583newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInvestorProfilePage(String title, String subtitle, List<UpdateInvestorProfileAllocationBreakdown> items, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.items = Internal.immutableCopyOf("items", items);
    }

    public final List<UpdateInvestorProfileAllocationBreakdown> getItems() {
        return this.items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4583newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateInvestorProfilePage)) {
            return false;
        }
        UpdateInvestorProfilePage updateInvestorProfilePage = (UpdateInvestorProfilePage) other;
        return Intrinsics.areEqual(unknownFields(), updateInvestorProfilePage.unknownFields()) && Intrinsics.areEqual(this.title, updateInvestorProfilePage.title) && Intrinsics.areEqual(this.subtitle, updateInvestorProfilePage.subtitle) && Intrinsics.areEqual(this.items, updateInvestorProfilePage.items);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.items.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateInvestorProfilePage{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateInvestorProfilePage copy$default(UpdateInvestorProfilePage updateInvestorProfilePage, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateInvestorProfilePage.title;
        }
        if ((i & 2) != 0) {
            str2 = updateInvestorProfilePage.subtitle;
        }
        if ((i & 4) != 0) {
            list = updateInvestorProfilePage.items;
        }
        if ((i & 8) != 0) {
            byteString = updateInvestorProfilePage.unknownFields();
        }
        return updateInvestorProfilePage.copy(str, str2, list, byteString);
    }

    public final UpdateInvestorProfilePage copy(String title, String subtitle, List<UpdateInvestorProfileAllocationBreakdown> items, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateInvestorProfilePage(title, subtitle, items, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateInvestorProfilePage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateInvestorProfilePage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.update_investor_profile.proto.v1.UpdateInvestorProfilePage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateInvestorProfilePage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                return size + UpdateInvestorProfileAllocationBreakdown.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getItems());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateInvestorProfilePage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                UpdateInvestorProfileAllocationBreakdown.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getItems());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateInvestorProfilePage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UpdateInvestorProfileAllocationBreakdown.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getItems());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateInvestorProfilePage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateInvestorProfilePage(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(UpdateInvestorProfileAllocationBreakdown.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateInvestorProfilePage redact(UpdateInvestorProfilePage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateInvestorProfilePage.copy$default(value, null, null, Internal.m26823redactElements(value.getItems(), UpdateInvestorProfileAllocationBreakdown.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
