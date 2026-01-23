package microgram.p507ui.p508v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: PresentBottomSheetRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/ui/v1/PresentBottomSheetRequest;", "Lcom/squareup/wire/Message;", "", "identifier", "", "initial_screen_data", "Lmicrogram/ui/v1/BottomSheetContent;", "metadata", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/BottomSheetContent;Ljava/util/Map;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getInitial_screen_data", "()Lmicrogram/ui/v1/BottomSheetContent;", "getMetadata", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PresentBottomSheetRequest extends Message {

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String identifier;

    @WireField(adapter = "microgram.ui.v1.BottomSheetContent#ADAPTER", jsonName = "initialScreenData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BottomSheetContent initial_screen_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final Map<String, String> metadata;

    @JvmField
    public static final ProtoAdapter<PresentBottomSheetRequest> ADAPTER = new PresentBottomSheetRequest2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(PresentBottomSheetRequest.class), Syntax.PROTO_3);

    public PresentBottomSheetRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29263newBuilder();
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ PresentBottomSheetRequest(String str, BottomSheetContent bottomSheetContent, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bottomSheetContent, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BottomSheetContent getInitial_screen_data() {
        return this.initial_screen_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentBottomSheetRequest(String identifier, BottomSheetContent bottomSheetContent, Map<String, String> metadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.identifier = identifier;
        this.initial_screen_data = bottomSheetContent;
        this.metadata = Internal.immutableCopyOf("metadata", metadata);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29263newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PresentBottomSheetRequest)) {
            return false;
        }
        PresentBottomSheetRequest presentBottomSheetRequest = (PresentBottomSheetRequest) other;
        return Intrinsics.areEqual(unknownFields(), presentBottomSheetRequest.unknownFields()) && Intrinsics.areEqual(this.identifier, presentBottomSheetRequest.identifier) && Intrinsics.areEqual(this.initial_screen_data, presentBottomSheetRequest.initial_screen_data) && Intrinsics.areEqual(this.metadata, presentBottomSheetRequest.metadata);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.identifier.hashCode()) * 37;
        BottomSheetContent bottomSheetContent = this.initial_screen_data;
        int iHashCode2 = ((iHashCode + (bottomSheetContent != null ? bottomSheetContent.hashCode() : 0)) * 37) + this.metadata.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        BottomSheetContent bottomSheetContent = this.initial_screen_data;
        if (bottomSheetContent != null) {
            arrayList.add("initial_screen_data=" + bottomSheetContent);
        }
        if (!this.metadata.isEmpty()) {
            arrayList.add("metadata=" + this.metadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PresentBottomSheetRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresentBottomSheetRequest copy$default(PresentBottomSheetRequest presentBottomSheetRequest, String str, BottomSheetContent bottomSheetContent, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentBottomSheetRequest.identifier;
        }
        if ((i & 2) != 0) {
            bottomSheetContent = presentBottomSheetRequest.initial_screen_data;
        }
        if ((i & 4) != 0) {
            map = presentBottomSheetRequest.metadata;
        }
        if ((i & 8) != 0) {
            byteString = presentBottomSheetRequest.unknownFields();
        }
        return presentBottomSheetRequest.copy(str, bottomSheetContent, map, byteString);
    }

    public final PresentBottomSheetRequest copy(String identifier, BottomSheetContent initial_screen_data, Map<String, String> metadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PresentBottomSheetRequest(identifier, initial_screen_data, metadata, unknownFields);
    }
}
