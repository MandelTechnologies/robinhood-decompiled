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

/* compiled from: LearningLesson.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "Lcom/squareup/wire/Message;", "", "identifier", "", "title", "is_completed", "", "version", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getTitle", "()Z", "getVersion", "()I", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LearningLesson extends Message {

    @JvmField
    public static final ProtoAdapter<LearningLesson> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCompleted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_completed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int version;

    public LearningLesson() {
        this(null, null, false, 0, null, 31, null);
    }

    public /* synthetic */ LearningLesson(String str, String str2, boolean z, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24332newBuilder();
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: is_completed, reason: from getter */
    public final boolean getIs_completed() {
        return this.is_completed;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearningLesson(String identifier, String title, boolean z, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.identifier = identifier;
        this.title = title;
        this.is_completed = z;
        this.version = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24332newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LearningLesson)) {
            return false;
        }
        LearningLesson learningLesson = (LearningLesson) other;
        return Intrinsics.areEqual(unknownFields(), learningLesson.unknownFields()) && Intrinsics.areEqual(this.identifier, learningLesson.identifier) && Intrinsics.areEqual(this.title, learningLesson.title) && this.is_completed == learningLesson.is_completed && this.version == learningLesson.version;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.identifier.hashCode()) * 37) + this.title.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_completed)) * 37) + Integer.hashCode(this.version);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("is_completed=" + this.is_completed);
        arrayList.add("version=" + this.version);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LearningLesson{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LearningLesson copy$default(LearningLesson learningLesson, String str, String str2, boolean z, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = learningLesson.identifier;
        }
        if ((i2 & 2) != 0) {
            str2 = learningLesson.title;
        }
        if ((i2 & 4) != 0) {
            z = learningLesson.is_completed;
        }
        if ((i2 & 8) != 0) {
            i = learningLesson.version;
        }
        if ((i2 & 16) != 0) {
            byteString = learningLesson.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return learningLesson.copy(str, str2, z2, i, byteString2);
    }

    public final LearningLesson copy(String identifier, String title, boolean is_completed, int version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LearningLesson(identifier, title, is_completed, version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LearningLesson.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LearningLesson>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LearningLesson$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LearningLesson value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (value.getIs_completed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getIs_completed()));
                }
                return value.getVersion() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getVersion())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LearningLesson value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (value.getIs_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_completed()));
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getVersion()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LearningLesson value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getIs_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_completed()));
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getIdentifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LearningLesson redact(LearningLesson value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LearningLesson.copy$default(value, null, null, false, 0, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LearningLesson decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LearningLesson(strDecode, strDecode2, zBooleanValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
