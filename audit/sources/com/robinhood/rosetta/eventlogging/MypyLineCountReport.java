package com.robinhood.rosetta.eventlogging;

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

/* compiled from: MypyLineCountReport.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyLineCountReport;", "Lcom/squareup/wire/Message;", "", "total_imputed_annotated_lines", "", "total_physical_lines", "total_annotated_functions", "total_functions", "unknownFields", "Lokio/ByteString;", "<init>", "(IIIILokio/ByteString;)V", "getTotal_imputed_annotated_lines", "()I", "getTotal_physical_lines", "getTotal_annotated_functions", "getTotal_functions", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MypyLineCountReport extends Message {

    @JvmField
    public static final ProtoAdapter<MypyLineCountReport> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalAnnotatedFunctions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int total_annotated_functions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalFunctions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int total_functions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalImputedAnnotatedLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int total_imputed_annotated_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalPhysicalLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int total_physical_lines;

    public MypyLineCountReport() {
        this(0, 0, 0, 0, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24386newBuilder();
    }

    public final int getTotal_imputed_annotated_lines() {
        return this.total_imputed_annotated_lines;
    }

    public final int getTotal_physical_lines() {
        return this.total_physical_lines;
    }

    public final int getTotal_annotated_functions() {
        return this.total_annotated_functions;
    }

    public final int getTotal_functions() {
        return this.total_functions;
    }

    public /* synthetic */ MypyLineCountReport(int i, int i2, int i3, int i4, ByteString byteString, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MypyLineCountReport(int i, int i2, int i3, int i4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_imputed_annotated_lines = i;
        this.total_physical_lines = i2;
        this.total_annotated_functions = i3;
        this.total_functions = i4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24386newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MypyLineCountReport)) {
            return false;
        }
        MypyLineCountReport mypyLineCountReport = (MypyLineCountReport) other;
        return Intrinsics.areEqual(unknownFields(), mypyLineCountReport.unknownFields()) && this.total_imputed_annotated_lines == mypyLineCountReport.total_imputed_annotated_lines && this.total_physical_lines == mypyLineCountReport.total_physical_lines && this.total_annotated_functions == mypyLineCountReport.total_annotated_functions && this.total_functions == mypyLineCountReport.total_functions;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.total_imputed_annotated_lines)) * 37) + Integer.hashCode(this.total_physical_lines)) * 37) + Integer.hashCode(this.total_annotated_functions)) * 37) + Integer.hashCode(this.total_functions);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_imputed_annotated_lines=" + this.total_imputed_annotated_lines);
        arrayList.add("total_physical_lines=" + this.total_physical_lines);
        arrayList.add("total_annotated_functions=" + this.total_annotated_functions);
        arrayList.add("total_functions=" + this.total_functions);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MypyLineCountReport{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MypyLineCountReport copy$default(MypyLineCountReport mypyLineCountReport, int i, int i2, int i3, int i4, ByteString byteString, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = mypyLineCountReport.total_imputed_annotated_lines;
        }
        if ((i5 & 2) != 0) {
            i2 = mypyLineCountReport.total_physical_lines;
        }
        if ((i5 & 4) != 0) {
            i3 = mypyLineCountReport.total_annotated_functions;
        }
        if ((i5 & 8) != 0) {
            i4 = mypyLineCountReport.total_functions;
        }
        if ((i5 & 16) != 0) {
            byteString = mypyLineCountReport.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i6 = i3;
        return mypyLineCountReport.copy(i, i2, i6, i4, byteString2);
    }

    public final MypyLineCountReport copy(int total_imputed_annotated_lines, int total_physical_lines, int total_annotated_functions, int total_functions, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MypyLineCountReport(total_imputed_annotated_lines, total_physical_lines, total_annotated_functions, total_functions, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MypyLineCountReport.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MypyLineCountReport>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MypyLineCountReport$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MypyLineCountReport value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_imputed_annotated_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTotal_imputed_annotated_lines()));
                }
                if (value.getTotal_physical_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTotal_physical_lines()));
                }
                if (value.getTotal_annotated_functions() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getTotal_annotated_functions()));
                }
                return value.getTotal_functions() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTotal_functions())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MypyLineCountReport value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_imputed_annotated_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_imputed_annotated_lines()));
                }
                if (value.getTotal_physical_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_physical_lines()));
                }
                if (value.getTotal_annotated_functions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_annotated_functions()));
                }
                if (value.getTotal_functions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_functions()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MypyLineCountReport value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_functions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_functions()));
                }
                if (value.getTotal_annotated_functions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_annotated_functions()));
                }
                if (value.getTotal_physical_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_physical_lines()));
                }
                if (value.getTotal_imputed_annotated_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_imputed_annotated_lines()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MypyLineCountReport redact(MypyLineCountReport value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MypyLineCountReport.copy$default(value, 0, 0, 0, 0, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MypyLineCountReport decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MypyLineCountReport(iIntValue, iIntValue2, iIntValue3, iIntValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
