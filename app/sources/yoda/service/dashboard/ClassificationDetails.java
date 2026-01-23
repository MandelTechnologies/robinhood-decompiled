package yoda.service.dashboard;

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

/* compiled from: ClassificationDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lyoda/service/dashboard/ClassificationDetails;", "Lcom/squareup/wire/Message;", "", "short_name", "", "long_name", "description", "lower_case_short_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getShort_name", "()Ljava/lang/String;", "getLong_name", "getDescription", "getLower_case_short_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ClassificationDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ClassificationDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "longName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String long_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lowerCaseShortName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String lower_case_short_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "shortName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String short_name;

    public ClassificationDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ClassificationDetails(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30089newBuilder();
    }

    public final String getShort_name() {
        return this.short_name;
    }

    public final String getLong_name() {
        return this.long_name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLower_case_short_name() {
        return this.lower_case_short_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassificationDetails(String short_name, String long_name, String description, String lower_case_short_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(short_name, "short_name");
        Intrinsics.checkNotNullParameter(long_name, "long_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lower_case_short_name, "lower_case_short_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.short_name = short_name;
        this.long_name = long_name;
        this.description = description;
        this.lower_case_short_name = lower_case_short_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30089newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClassificationDetails)) {
            return false;
        }
        ClassificationDetails classificationDetails = (ClassificationDetails) other;
        return Intrinsics.areEqual(unknownFields(), classificationDetails.unknownFields()) && Intrinsics.areEqual(this.short_name, classificationDetails.short_name) && Intrinsics.areEqual(this.long_name, classificationDetails.long_name) && Intrinsics.areEqual(this.description, classificationDetails.description) && Intrinsics.areEqual(this.lower_case_short_name, classificationDetails.lower_case_short_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.short_name.hashCode()) * 37) + this.long_name.hashCode()) * 37) + this.description.hashCode()) * 37) + this.lower_case_short_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("short_name=" + Internal.sanitize(this.short_name));
        arrayList.add("long_name=" + Internal.sanitize(this.long_name));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("lower_case_short_name=" + Internal.sanitize(this.lower_case_short_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClassificationDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClassificationDetails copy$default(ClassificationDetails classificationDetails, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classificationDetails.short_name;
        }
        if ((i & 2) != 0) {
            str2 = classificationDetails.long_name;
        }
        if ((i & 4) != 0) {
            str3 = classificationDetails.description;
        }
        if ((i & 8) != 0) {
            str4 = classificationDetails.lower_case_short_name;
        }
        if ((i & 16) != 0) {
            byteString = classificationDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return classificationDetails.copy(str, str2, str5, str4, byteString2);
    }

    public final ClassificationDetails copy(String short_name, String long_name, String description, String lower_case_short_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(short_name, "short_name");
        Intrinsics.checkNotNullParameter(long_name, "long_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lower_case_short_name, "lower_case_short_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClassificationDetails(short_name, long_name, description, lower_case_short_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClassificationDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClassificationDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.ClassificationDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClassificationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getShort_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getShort_name());
                }
                if (!Intrinsics.areEqual(value.getLong_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLong_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                return !Intrinsics.areEqual(value.getLower_case_short_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLower_case_short_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClassificationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getShort_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getShort_name());
                }
                if (!Intrinsics.areEqual(value.getLong_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLong_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getLower_case_short_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLower_case_short_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClassificationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLower_case_short_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLower_case_short_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getLong_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLong_name());
                }
                if (Intrinsics.areEqual(value.getShort_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getShort_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClassificationDetails redact(ClassificationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClassificationDetails.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClassificationDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ClassificationDetails(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
