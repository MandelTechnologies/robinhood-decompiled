package search_coprocessor.p542v1;

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

/* compiled from: MultiContractsHeroCarousel.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroCarousel;", "Lcom/squareup/wire/Message;", "", "id", "", "event_ids", "", "is_non_sport_event", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLokio/ByteString;)V", "getId", "()Ljava/lang/String;", "()Z", "getEvent_ids", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class MultiContractsHeroCarousel extends Message {

    @JvmField
    public static final ProtoAdapter<MultiContractsHeroCarousel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventIds", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> event_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isNonSportEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_non_sport_event;

    public MultiContractsHeroCarousel() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29964newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ MultiContractsHeroCarousel(String str, List list, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_non_sport_event, reason: from getter */
    public final boolean getIs_non_sport_event() {
        return this.is_non_sport_event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiContractsHeroCarousel(String id, List<String> event_ids, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.is_non_sport_event = z;
        this.event_ids = Internal.immutableCopyOf("event_ids", event_ids);
    }

    public final List<String> getEvent_ids() {
        return this.event_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29964newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MultiContractsHeroCarousel)) {
            return false;
        }
        MultiContractsHeroCarousel multiContractsHeroCarousel = (MultiContractsHeroCarousel) other;
        return Intrinsics.areEqual(unknownFields(), multiContractsHeroCarousel.unknownFields()) && Intrinsics.areEqual(this.id, multiContractsHeroCarousel.id) && Intrinsics.areEqual(this.event_ids, multiContractsHeroCarousel.event_ids) && this.is_non_sport_event == multiContractsHeroCarousel.is_non_sport_event;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.event_ids.hashCode()) * 37) + Boolean.hashCode(this.is_non_sport_event);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        if (!this.event_ids.isEmpty()) {
            arrayList.add("event_ids=" + Internal.sanitize(this.event_ids));
        }
        arrayList.add("is_non_sport_event=" + this.is_non_sport_event);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiContractsHeroCarousel{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiContractsHeroCarousel copy$default(MultiContractsHeroCarousel multiContractsHeroCarousel, String str, List list, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiContractsHeroCarousel.id;
        }
        if ((i & 2) != 0) {
            list = multiContractsHeroCarousel.event_ids;
        }
        if ((i & 4) != 0) {
            z = multiContractsHeroCarousel.is_non_sport_event;
        }
        if ((i & 8) != 0) {
            byteString = multiContractsHeroCarousel.unknownFields();
        }
        return multiContractsHeroCarousel.copy(str, list, z, byteString);
    }

    public final MultiContractsHeroCarousel copy(String id, List<String> event_ids, boolean is_non_sport_event, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MultiContractsHeroCarousel(id, event_ids, is_non_sport_event, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MultiContractsHeroCarousel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MultiContractsHeroCarousel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.MultiContractsHeroCarousel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MultiContractsHeroCarousel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getEvent_ids());
                return value.getIs_non_sport_event() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_non_sport_event())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MultiContractsHeroCarousel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getEvent_ids());
                if (value.getIs_non_sport_event()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_non_sport_event()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MultiContractsHeroCarousel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_non_sport_event()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_non_sport_event()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getEvent_ids());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiContractsHeroCarousel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MultiContractsHeroCarousel(strDecode, arrayList, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiContractsHeroCarousel redact(MultiContractsHeroCarousel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MultiContractsHeroCarousel.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }
        };
    }
}
