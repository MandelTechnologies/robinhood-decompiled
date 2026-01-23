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

/* compiled from: EducationTour.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EducationTour;", "Lcom/squareup/wire/Message;", "", "screen", "", "screen_unique_id", "identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getScreen", "()Ljava/lang/String;", "getScreen_unique_id", "getIdentifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EducationTour extends Message {

    @JvmField
    public static final ProtoAdapter<EducationTour> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenUniqueId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String screen_unique_id;

    public EducationTour() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ EducationTour(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24234newBuilder();
    }

    public final String getScreen() {
        return this.screen;
    }

    public final String getScreen_unique_id() {
        return this.screen_unique_id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTour(String screen, String screen_unique_id, String identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screen_unique_id, "screen_unique_id");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen = screen;
        this.screen_unique_id = screen_unique_id;
        this.identifier = identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24234newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EducationTour)) {
            return false;
        }
        EducationTour educationTour = (EducationTour) other;
        return Intrinsics.areEqual(unknownFields(), educationTour.unknownFields()) && Intrinsics.areEqual(this.screen, educationTour.screen) && Intrinsics.areEqual(this.screen_unique_id, educationTour.screen_unique_id) && Intrinsics.areEqual(this.identifier, educationTour.identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.screen.hashCode()) * 37) + this.screen_unique_id.hashCode()) * 37) + this.identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screen=" + Internal.sanitize(this.screen));
        arrayList.add("screen_unique_id=" + Internal.sanitize(this.screen_unique_id));
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EducationTour{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EducationTour copy$default(EducationTour educationTour, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationTour.screen;
        }
        if ((i & 2) != 0) {
            str2 = educationTour.screen_unique_id;
        }
        if ((i & 4) != 0) {
            str3 = educationTour.identifier;
        }
        if ((i & 8) != 0) {
            byteString = educationTour.unknownFields();
        }
        return educationTour.copy(str, str2, str3, byteString);
    }

    public final EducationTour copy(String screen, String screen_unique_id, String identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screen_unique_id, "screen_unique_id");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EducationTour(screen, screen_unique_id, identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EducationTour.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EducationTour>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EducationTour$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EducationTour value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getScreen(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreen());
                }
                if (!Intrinsics.areEqual(value.getScreen_unique_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScreen_unique_id());
                }
                return !Intrinsics.areEqual(value.getIdentifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIdentifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EducationTour value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getScreen(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen());
                }
                if (!Intrinsics.areEqual(value.getScreen_unique_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScreen_unique_id());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EducationTour value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getScreen_unique_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScreen_unique_id());
                }
                if (Intrinsics.areEqual(value.getScreen(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EducationTour redact(EducationTour value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EducationTour.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EducationTour decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EducationTour(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
