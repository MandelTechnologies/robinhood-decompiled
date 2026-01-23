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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetNavigationFlowResponse.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowResponse;", "Lcom/squareup/wire/Message;", "", "next_screen_title", "", "should_push_to_results_screen", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLokio/ByteString;)V", "getNext_screen_title", "()Ljava/lang/String;", "getShould_push_to_results_screen", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class GetNavigationFlowResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetNavigationFlowResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextScreenTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String next_screen_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldPushToResultsScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean should_push_to_results_screen;

    public GetNavigationFlowResponse() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4581newBuilder();
    }

    public final String getNext_screen_title() {
        return this.next_screen_title;
    }

    public /* synthetic */ GetNavigationFlowResponse(String str, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getShould_push_to_results_screen() {
        return this.should_push_to_results_screen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNavigationFlowResponse(String next_screen_title, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(next_screen_title, "next_screen_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next_screen_title = next_screen_title;
        this.should_push_to_results_screen = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4581newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNavigationFlowResponse)) {
            return false;
        }
        GetNavigationFlowResponse getNavigationFlowResponse = (GetNavigationFlowResponse) other;
        return Intrinsics.areEqual(unknownFields(), getNavigationFlowResponse.unknownFields()) && Intrinsics.areEqual(this.next_screen_title, getNavigationFlowResponse.next_screen_title) && this.should_push_to_results_screen == getNavigationFlowResponse.should_push_to_results_screen;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.next_screen_title.hashCode()) * 37) + Boolean.hashCode(this.should_push_to_results_screen);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("next_screen_title=" + Internal.sanitize(this.next_screen_title));
        arrayList.add("should_push_to_results_screen=" + this.should_push_to_results_screen);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNavigationFlowResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetNavigationFlowResponse copy$default(GetNavigationFlowResponse getNavigationFlowResponse, String str, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNavigationFlowResponse.next_screen_title;
        }
        if ((i & 2) != 0) {
            z = getNavigationFlowResponse.should_push_to_results_screen;
        }
        if ((i & 4) != 0) {
            byteString = getNavigationFlowResponse.unknownFields();
        }
        return getNavigationFlowResponse.copy(str, z, byteString);
    }

    public final GetNavigationFlowResponse copy(String next_screen_title, boolean should_push_to_results_screen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(next_screen_title, "next_screen_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNavigationFlowResponse(next_screen_title, should_push_to_results_screen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNavigationFlowResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNavigationFlowResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.update_investor_profile.proto.v1.GetNavigationFlowResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNavigationFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNext_screen_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNext_screen_title());
                }
                return value.getShould_push_to_results_screen() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getShould_push_to_results_screen())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNavigationFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNext_screen_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNext_screen_title());
                }
                if (value.getShould_push_to_results_screen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShould_push_to_results_screen()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNavigationFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShould_push_to_results_screen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShould_push_to_results_screen()));
                }
                if (Intrinsics.areEqual(value.getNext_screen_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNext_screen_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNavigationFlowResponse redact(GetNavigationFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetNavigationFlowResponse.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetNavigationFlowResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNavigationFlowResponse(strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
