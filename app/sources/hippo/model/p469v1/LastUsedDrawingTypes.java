package hippo.model.p469v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: LastUsedDrawingTypes.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lhippo/model/v1/LastUsedDrawingTypes;", "Lcom/squareup/wire/Message;", "", "line_type", "Lhippo/model/v1/LineDrawingType;", "shape_type", "Lhippo/model/v1/ShapeDrawingType;", "advanced_type", "Lhippo/model/v1/AdvancedDrawingType;", "annotation_type", "Lhippo/model/v1/AnnotationDrawingType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/LineDrawingType;Lhippo/model/v1/ShapeDrawingType;Lhippo/model/v1/AdvancedDrawingType;Lhippo/model/v1/AnnotationDrawingType;Lokio/ByteString;)V", "getLine_type", "()Lhippo/model/v1/LineDrawingType;", "getShape_type", "()Lhippo/model/v1/ShapeDrawingType;", "getAdvanced_type", "()Lhippo/model/v1/AdvancedDrawingType;", "getAnnotation_type", "()Lhippo/model/v1/AnnotationDrawingType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LastUsedDrawingTypes extends Message {

    @JvmField
    public static final ProtoAdapter<LastUsedDrawingTypes> ADAPTER;

    @WireField(adapter = "hippo.model.v1.AdvancedDrawingType#ADAPTER", jsonName = "advancedType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AdvancedDrawingType advanced_type;

    @WireField(adapter = "hippo.model.v1.AnnotationDrawingType#ADAPTER", jsonName = "annotationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AnnotationDrawingType annotation_type;

    @WireField(adapter = "hippo.model.v1.LineDrawingType#ADAPTER", jsonName = "lineType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final LineDrawingType line_type;

    @WireField(adapter = "hippo.model.v1.ShapeDrawingType#ADAPTER", jsonName = "shapeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ShapeDrawingType shape_type;

    public LastUsedDrawingTypes() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28249newBuilder();
    }

    public final LineDrawingType getLine_type() {
        return this.line_type;
    }

    public /* synthetic */ LastUsedDrawingTypes(LineDrawingType lineDrawingType, ShapeDrawingType shapeDrawingType, AdvancedDrawingType advancedDrawingType, AnnotationDrawingType annotationDrawingType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LineDrawingType.LINE_DRAWING_TYPE_UNSPECIFIED : lineDrawingType, (i & 2) != 0 ? ShapeDrawingType.SHAPE_DRAWING_TYPE_UNSPECIFIED : shapeDrawingType, (i & 4) != 0 ? AdvancedDrawingType.ADVANCED_DRAWING_TYPE_UNSPECIFIED : advancedDrawingType, (i & 8) != 0 ? AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_UNSPECIFIED : annotationDrawingType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ShapeDrawingType getShape_type() {
        return this.shape_type;
    }

    public final AdvancedDrawingType getAdvanced_type() {
        return this.advanced_type;
    }

    public final AnnotationDrawingType getAnnotation_type() {
        return this.annotation_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastUsedDrawingTypes(LineDrawingType line_type, ShapeDrawingType shape_type, AdvancedDrawingType advanced_type, AnnotationDrawingType annotation_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(line_type, "line_type");
        Intrinsics.checkNotNullParameter(shape_type, "shape_type");
        Intrinsics.checkNotNullParameter(advanced_type, "advanced_type");
        Intrinsics.checkNotNullParameter(annotation_type, "annotation_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.line_type = line_type;
        this.shape_type = shape_type;
        this.advanced_type = advanced_type;
        this.annotation_type = annotation_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28249newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LastUsedDrawingTypes)) {
            return false;
        }
        LastUsedDrawingTypes lastUsedDrawingTypes = (LastUsedDrawingTypes) other;
        return Intrinsics.areEqual(unknownFields(), lastUsedDrawingTypes.unknownFields()) && this.line_type == lastUsedDrawingTypes.line_type && this.shape_type == lastUsedDrawingTypes.shape_type && this.advanced_type == lastUsedDrawingTypes.advanced_type && this.annotation_type == lastUsedDrawingTypes.annotation_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.line_type.hashCode()) * 37) + this.shape_type.hashCode()) * 37) + this.advanced_type.hashCode()) * 37) + this.annotation_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("line_type=" + this.line_type);
        arrayList.add("shape_type=" + this.shape_type);
        arrayList.add("advanced_type=" + this.advanced_type);
        arrayList.add("annotation_type=" + this.annotation_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LastUsedDrawingTypes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LastUsedDrawingTypes copy$default(LastUsedDrawingTypes lastUsedDrawingTypes, LineDrawingType lineDrawingType, ShapeDrawingType shapeDrawingType, AdvancedDrawingType advancedDrawingType, AnnotationDrawingType annotationDrawingType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            lineDrawingType = lastUsedDrawingTypes.line_type;
        }
        if ((i & 2) != 0) {
            shapeDrawingType = lastUsedDrawingTypes.shape_type;
        }
        if ((i & 4) != 0) {
            advancedDrawingType = lastUsedDrawingTypes.advanced_type;
        }
        if ((i & 8) != 0) {
            annotationDrawingType = lastUsedDrawingTypes.annotation_type;
        }
        if ((i & 16) != 0) {
            byteString = lastUsedDrawingTypes.unknownFields();
        }
        ByteString byteString2 = byteString;
        AdvancedDrawingType advancedDrawingType2 = advancedDrawingType;
        return lastUsedDrawingTypes.copy(lineDrawingType, shapeDrawingType, advancedDrawingType2, annotationDrawingType, byteString2);
    }

    public final LastUsedDrawingTypes copy(LineDrawingType line_type, ShapeDrawingType shape_type, AdvancedDrawingType advanced_type, AnnotationDrawingType annotation_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(line_type, "line_type");
        Intrinsics.checkNotNullParameter(shape_type, "shape_type");
        Intrinsics.checkNotNullParameter(advanced_type, "advanced_type");
        Intrinsics.checkNotNullParameter(annotation_type, "annotation_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LastUsedDrawingTypes(line_type, shape_type, advanced_type, annotation_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LastUsedDrawingTypes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LastUsedDrawingTypes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.LastUsedDrawingTypes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LastUsedDrawingTypes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLine_type() != LineDrawingType.LINE_DRAWING_TYPE_UNSPECIFIED) {
                    size += LineDrawingType.ADAPTER.encodedSizeWithTag(1, value.getLine_type());
                }
                if (value.getShape_type() != ShapeDrawingType.SHAPE_DRAWING_TYPE_UNSPECIFIED) {
                    size += ShapeDrawingType.ADAPTER.encodedSizeWithTag(2, value.getShape_type());
                }
                if (value.getAdvanced_type() != AdvancedDrawingType.ADVANCED_DRAWING_TYPE_UNSPECIFIED) {
                    size += AdvancedDrawingType.ADAPTER.encodedSizeWithTag(3, value.getAdvanced_type());
                }
                return value.getAnnotation_type() != AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_UNSPECIFIED ? size + AnnotationDrawingType.ADAPTER.encodedSizeWithTag(4, value.getAnnotation_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LastUsedDrawingTypes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLine_type() != LineDrawingType.LINE_DRAWING_TYPE_UNSPECIFIED) {
                    LineDrawingType.ADAPTER.encodeWithTag(writer, 1, (int) value.getLine_type());
                }
                if (value.getShape_type() != ShapeDrawingType.SHAPE_DRAWING_TYPE_UNSPECIFIED) {
                    ShapeDrawingType.ADAPTER.encodeWithTag(writer, 2, (int) value.getShape_type());
                }
                if (value.getAdvanced_type() != AdvancedDrawingType.ADVANCED_DRAWING_TYPE_UNSPECIFIED) {
                    AdvancedDrawingType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAdvanced_type());
                }
                if (value.getAnnotation_type() != AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_UNSPECIFIED) {
                    AnnotationDrawingType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAnnotation_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LastUsedDrawingTypes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAnnotation_type() != AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_UNSPECIFIED) {
                    AnnotationDrawingType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAnnotation_type());
                }
                if (value.getAdvanced_type() != AdvancedDrawingType.ADVANCED_DRAWING_TYPE_UNSPECIFIED) {
                    AdvancedDrawingType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAdvanced_type());
                }
                if (value.getShape_type() != ShapeDrawingType.SHAPE_DRAWING_TYPE_UNSPECIFIED) {
                    ShapeDrawingType.ADAPTER.encodeWithTag(writer, 2, (int) value.getShape_type());
                }
                if (value.getLine_type() != LineDrawingType.LINE_DRAWING_TYPE_UNSPECIFIED) {
                    LineDrawingType.ADAPTER.encodeWithTag(writer, 1, (int) value.getLine_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LastUsedDrawingTypes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LineDrawingType lineDrawingTypeDecode = LineDrawingType.LINE_DRAWING_TYPE_UNSPECIFIED;
                ShapeDrawingType shapeDrawingType = ShapeDrawingType.SHAPE_DRAWING_TYPE_UNSPECIFIED;
                AdvancedDrawingType advancedDrawingType = AdvancedDrawingType.ADVANCED_DRAWING_TYPE_UNSPECIFIED;
                AnnotationDrawingType annotationDrawingType = AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                AnnotationDrawingType annotationDrawingTypeDecode = annotationDrawingType;
                AdvancedDrawingType advancedDrawingTypeDecode = advancedDrawingType;
                ShapeDrawingType shapeDrawingTypeDecode = shapeDrawingType;
                while (true) {
                    LineDrawingType lineDrawingType = lineDrawingTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LastUsedDrawingTypes(lineDrawingType, shapeDrawingTypeDecode, advancedDrawingTypeDecode, annotationDrawingTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                lineDrawingTypeDecode = LineDrawingType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                shapeDrawingTypeDecode = ShapeDrawingType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                advancedDrawingTypeDecode = AdvancedDrawingType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                annotationDrawingTypeDecode = AnnotationDrawingType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LastUsedDrawingTypes redact(LastUsedDrawingTypes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LastUsedDrawingTypes.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
