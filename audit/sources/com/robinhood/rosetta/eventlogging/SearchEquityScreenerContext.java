package com.robinhood.rosetta.eventlogging;

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

/* compiled from: SearchEquityScreenerContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchEquityScreenerContext;", "Lcom/squareup/wire/Message;", "", "screener_name", "", "screener_id", "is_preset", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getScreener_name", "()Ljava/lang/String;", "getScreener_id", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SearchEquityScreenerContext extends Message {

    @JvmField
    public static final ProtoAdapter<SearchEquityScreenerContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPreset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_preset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenerId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String screener_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenerName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String screener_name;

    public SearchEquityScreenerContext() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ SearchEquityScreenerContext(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24562newBuilder();
    }

    public final String getScreener_name() {
        return this.screener_name;
    }

    public final String getScreener_id() {
        return this.screener_id;
    }

    /* renamed from: is_preset, reason: from getter */
    public final boolean getIs_preset() {
        return this.is_preset;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchEquityScreenerContext(String screener_name, String screener_id, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screener_name, "screener_name");
        Intrinsics.checkNotNullParameter(screener_id, "screener_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screener_name = screener_name;
        this.screener_id = screener_id;
        this.is_preset = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24562newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SearchEquityScreenerContext)) {
            return false;
        }
        SearchEquityScreenerContext searchEquityScreenerContext = (SearchEquityScreenerContext) other;
        return Intrinsics.areEqual(unknownFields(), searchEquityScreenerContext.unknownFields()) && Intrinsics.areEqual(this.screener_name, searchEquityScreenerContext.screener_name) && Intrinsics.areEqual(this.screener_id, searchEquityScreenerContext.screener_id) && this.is_preset == searchEquityScreenerContext.is_preset;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.screener_name.hashCode()) * 37) + this.screener_id.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_preset);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screener_name=" + Internal.sanitize(this.screener_name));
        arrayList.add("screener_id=" + Internal.sanitize(this.screener_id));
        arrayList.add("is_preset=" + this.is_preset);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchEquityScreenerContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SearchEquityScreenerContext copy$default(SearchEquityScreenerContext searchEquityScreenerContext, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchEquityScreenerContext.screener_name;
        }
        if ((i & 2) != 0) {
            str2 = searchEquityScreenerContext.screener_id;
        }
        if ((i & 4) != 0) {
            z = searchEquityScreenerContext.is_preset;
        }
        if ((i & 8) != 0) {
            byteString = searchEquityScreenerContext.unknownFields();
        }
        return searchEquityScreenerContext.copy(str, str2, z, byteString);
    }

    public final SearchEquityScreenerContext copy(String screener_name, String screener_id, boolean is_preset, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screener_name, "screener_name");
        Intrinsics.checkNotNullParameter(screener_id, "screener_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SearchEquityScreenerContext(screener_name, screener_id, is_preset, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SearchEquityScreenerContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SearchEquityScreenerContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SearchEquityScreenerContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SearchEquityScreenerContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getScreener_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreener_name());
                }
                if (!Intrinsics.areEqual(value.getScreener_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScreener_id());
                }
                return value.getIs_preset() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getIs_preset())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SearchEquityScreenerContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getScreener_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreener_name());
                }
                if (!Intrinsics.areEqual(value.getScreener_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScreener_id());
                }
                if (value.getIs_preset()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_preset()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SearchEquityScreenerContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_preset()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_preset()));
                }
                if (!Intrinsics.areEqual(value.getScreener_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScreener_id());
                }
                if (Intrinsics.areEqual(value.getScreener_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreener_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SearchEquityScreenerContext redact(SearchEquityScreenerContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SearchEquityScreenerContext.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SearchEquityScreenerContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SearchEquityScreenerContext(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
