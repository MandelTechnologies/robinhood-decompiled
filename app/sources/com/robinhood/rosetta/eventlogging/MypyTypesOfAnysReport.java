package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: MypyTypesOfAnysReport.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016JV\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;", "Lcom/squareup/wire/Message;", "", "total_unannotated", "", "total_explicit", "total_unimported", "total_omitted_generics", "total_error", "total_special_form", "total_implementation_artifact", "unknownFields", "Lokio/ByteString;", "<init>", "(IIIIIIILokio/ByteString;)V", "getTotal_unannotated", "()I", "getTotal_explicit", "getTotal_unimported", "getTotal_omitted_generics", "getTotal_error", "getTotal_special_form", "getTotal_implementation_artifact", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MypyTypesOfAnysReport extends Message {

    @JvmField
    public static final ProtoAdapter<MypyTypesOfAnysReport> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalError", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int total_error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalExplicit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int total_explicit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalImplementationArtifact", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int total_implementation_artifact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalOmittedGenerics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int total_omitted_generics;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalSpecialForm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int total_special_form;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalUnannotated", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int total_unannotated;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalUnimported", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int total_unimported;

    public MypyTypesOfAnysReport() {
        this(0, 0, 0, 0, 0, 0, 0, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24389newBuilder();
    }

    public final int getTotal_unannotated() {
        return this.total_unannotated;
    }

    public final int getTotal_explicit() {
        return this.total_explicit;
    }

    public final int getTotal_unimported() {
        return this.total_unimported;
    }

    public final int getTotal_omitted_generics() {
        return this.total_omitted_generics;
    }

    public final int getTotal_error() {
        return this.total_error;
    }

    public final int getTotal_special_form() {
        return this.total_special_form;
    }

    public final int getTotal_implementation_artifact() {
        return this.total_implementation_artifact;
    }

    public /* synthetic */ MypyTypesOfAnysReport(int i, int i2, int i3, int i4, int i5, int i6, int i7, ByteString byteString, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7, (i8 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MypyTypesOfAnysReport(int i, int i2, int i3, int i4, int i5, int i6, int i7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_unannotated = i;
        this.total_explicit = i2;
        this.total_unimported = i3;
        this.total_omitted_generics = i4;
        this.total_error = i5;
        this.total_special_form = i6;
        this.total_implementation_artifact = i7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24389newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MypyTypesOfAnysReport)) {
            return false;
        }
        MypyTypesOfAnysReport mypyTypesOfAnysReport = (MypyTypesOfAnysReport) other;
        return Intrinsics.areEqual(unknownFields(), mypyTypesOfAnysReport.unknownFields()) && this.total_unannotated == mypyTypesOfAnysReport.total_unannotated && this.total_explicit == mypyTypesOfAnysReport.total_explicit && this.total_unimported == mypyTypesOfAnysReport.total_unimported && this.total_omitted_generics == mypyTypesOfAnysReport.total_omitted_generics && this.total_error == mypyTypesOfAnysReport.total_error && this.total_special_form == mypyTypesOfAnysReport.total_special_form && this.total_implementation_artifact == mypyTypesOfAnysReport.total_implementation_artifact;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.total_unannotated)) * 37) + Integer.hashCode(this.total_explicit)) * 37) + Integer.hashCode(this.total_unimported)) * 37) + Integer.hashCode(this.total_omitted_generics)) * 37) + Integer.hashCode(this.total_error)) * 37) + Integer.hashCode(this.total_special_form)) * 37) + Integer.hashCode(this.total_implementation_artifact);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_unannotated=" + this.total_unannotated);
        arrayList.add("total_explicit=" + this.total_explicit);
        arrayList.add("total_unimported=" + this.total_unimported);
        arrayList.add("total_omitted_generics=" + this.total_omitted_generics);
        arrayList.add("total_error=" + this.total_error);
        arrayList.add("total_special_form=" + this.total_special_form);
        arrayList.add("total_implementation_artifact=" + this.total_implementation_artifact);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MypyTypesOfAnysReport{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MypyTypesOfAnysReport copy$default(MypyTypesOfAnysReport mypyTypesOfAnysReport, int i, int i2, int i3, int i4, int i5, int i6, int i7, ByteString byteString, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = mypyTypesOfAnysReport.total_unannotated;
        }
        if ((i8 & 2) != 0) {
            i2 = mypyTypesOfAnysReport.total_explicit;
        }
        if ((i8 & 4) != 0) {
            i3 = mypyTypesOfAnysReport.total_unimported;
        }
        if ((i8 & 8) != 0) {
            i4 = mypyTypesOfAnysReport.total_omitted_generics;
        }
        if ((i8 & 16) != 0) {
            i5 = mypyTypesOfAnysReport.total_error;
        }
        if ((i8 & 32) != 0) {
            i6 = mypyTypesOfAnysReport.total_special_form;
        }
        if ((i8 & 64) != 0) {
            i7 = mypyTypesOfAnysReport.total_implementation_artifact;
        }
        if ((i8 & 128) != 0) {
            byteString = mypyTypesOfAnysReport.unknownFields();
        }
        int i9 = i7;
        ByteString byteString2 = byteString;
        int i10 = i5;
        int i11 = i6;
        return mypyTypesOfAnysReport.copy(i, i2, i3, i4, i10, i11, i9, byteString2);
    }

    public final MypyTypesOfAnysReport copy(int total_unannotated, int total_explicit, int total_unimported, int total_omitted_generics, int total_error, int total_special_form, int total_implementation_artifact, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MypyTypesOfAnysReport(total_unannotated, total_explicit, total_unimported, total_omitted_generics, total_error, total_special_form, total_implementation_artifact, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MypyTypesOfAnysReport.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MypyTypesOfAnysReport>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MypyTypesOfAnysReport$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MypyTypesOfAnysReport value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_unannotated() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTotal_unannotated()));
                }
                if (value.getTotal_explicit() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTotal_explicit()));
                }
                if (value.getTotal_unimported() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getTotal_unimported()));
                }
                if (value.getTotal_omitted_generics() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTotal_omitted_generics()));
                }
                if (value.getTotal_error() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTotal_error()));
                }
                if (value.getTotal_special_form() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTotal_special_form()));
                }
                return value.getTotal_implementation_artifact() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getTotal_implementation_artifact())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MypyTypesOfAnysReport value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_unannotated() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_unannotated()));
                }
                if (value.getTotal_explicit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_explicit()));
                }
                if (value.getTotal_unimported() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_unimported()));
                }
                if (value.getTotal_omitted_generics() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_omitted_generics()));
                }
                if (value.getTotal_error() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_error()));
                }
                if (value.getTotal_special_form() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_special_form()));
                }
                if (value.getTotal_implementation_artifact() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getTotal_implementation_artifact()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MypyTypesOfAnysReport value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_implementation_artifact() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getTotal_implementation_artifact()));
                }
                if (value.getTotal_special_form() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_special_form()));
                }
                if (value.getTotal_error() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_error()));
                }
                if (value.getTotal_omitted_generics() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_omitted_generics()));
                }
                if (value.getTotal_unimported() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_unimported()));
                }
                if (value.getTotal_explicit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_explicit()));
                }
                if (value.getTotal_unannotated() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_unannotated()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MypyTypesOfAnysReport redact(MypyTypesOfAnysReport value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MypyTypesOfAnysReport.copy$default(value, 0, 0, 0, 0, 0, 0, 0, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MypyTypesOfAnysReport decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                int iIntValue6 = 0;
                int iIntValue7 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 2:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 3:
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 4:
                                iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 7:
                                iIntValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MypyTypesOfAnysReport(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
