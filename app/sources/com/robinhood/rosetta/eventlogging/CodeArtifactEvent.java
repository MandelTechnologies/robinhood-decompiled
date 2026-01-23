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

/* compiled from: CodeArtifactEvent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "Lcom/squareup/wire/Message;", "", "file_suffix", "", "file_count", "", "test_file_count", "line_count", "test_line_count", "top_level_directory", "line_code_count", "line_comment_count", "line_blank_count", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;JJJJLjava/lang/String;JJJLokio/ByteString;)V", "getFile_suffix", "()Ljava/lang/String;", "getFile_count", "()J", "getTest_file_count", "getLine_count", "getTest_line_count", "getTop_level_directory", "getLine_code_count", "getLine_comment_count", "getLine_blank_count", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CodeArtifactEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CodeArtifactEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "fileCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long file_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fileSuffix", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String file_suffix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "lineBlankCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final long line_blank_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "lineCodeCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final long line_code_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "lineCommentCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final long line_comment_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "lineCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long line_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "testFileCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long test_file_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "testLineCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final long test_line_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "topLevelDirectory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String top_level_directory;

    public CodeArtifactEvent() {
        this(null, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, null, 1023, null);
    }

    public /* synthetic */ CodeArtifactEvent(String str, long j, long j2, long j3, long j4, String str2, long j5, long j6, long j7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? 0L : j4, (i & 32) == 0 ? str2 : "", (i & 64) != 0 ? 0L : j5, (i & 128) != 0 ? 0L : j6, (i & 256) == 0 ? j7 : 0L, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24122newBuilder();
    }

    public final String getFile_suffix() {
        return this.file_suffix;
    }

    public final long getFile_count() {
        return this.file_count;
    }

    public final long getTest_file_count() {
        return this.test_file_count;
    }

    public final long getLine_count() {
        return this.line_count;
    }

    public final long getTest_line_count() {
        return this.test_line_count;
    }

    public final String getTop_level_directory() {
        return this.top_level_directory;
    }

    public final long getLine_code_count() {
        return this.line_code_count;
    }

    public final long getLine_comment_count() {
        return this.line_comment_count;
    }

    public final long getLine_blank_count() {
        return this.line_blank_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeArtifactEvent(String file_suffix, long j, long j2, long j3, long j4, String top_level_directory, long j5, long j6, long j7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(file_suffix, "file_suffix");
        Intrinsics.checkNotNullParameter(top_level_directory, "top_level_directory");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.file_suffix = file_suffix;
        this.file_count = j;
        this.test_file_count = j2;
        this.line_count = j3;
        this.test_line_count = j4;
        this.top_level_directory = top_level_directory;
        this.line_code_count = j5;
        this.line_comment_count = j6;
        this.line_blank_count = j7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24122newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CodeArtifactEvent)) {
            return false;
        }
        CodeArtifactEvent codeArtifactEvent = (CodeArtifactEvent) other;
        return Intrinsics.areEqual(unknownFields(), codeArtifactEvent.unknownFields()) && Intrinsics.areEqual(this.file_suffix, codeArtifactEvent.file_suffix) && this.file_count == codeArtifactEvent.file_count && this.test_file_count == codeArtifactEvent.test_file_count && this.line_count == codeArtifactEvent.line_count && this.test_line_count == codeArtifactEvent.test_line_count && Intrinsics.areEqual(this.top_level_directory, codeArtifactEvent.top_level_directory) && this.line_code_count == codeArtifactEvent.line_code_count && this.line_comment_count == codeArtifactEvent.line_comment_count && this.line_blank_count == codeArtifactEvent.line_blank_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.file_suffix.hashCode()) * 37) + Long.hashCode(this.file_count)) * 37) + Long.hashCode(this.test_file_count)) * 37) + Long.hashCode(this.line_count)) * 37) + Long.hashCode(this.test_line_count)) * 37) + this.top_level_directory.hashCode()) * 37) + Long.hashCode(this.line_code_count)) * 37) + Long.hashCode(this.line_comment_count)) * 37) + Long.hashCode(this.line_blank_count);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("file_suffix=" + Internal.sanitize(this.file_suffix));
        arrayList.add("file_count=" + this.file_count);
        arrayList.add("test_file_count=" + this.test_file_count);
        arrayList.add("line_count=" + this.line_count);
        arrayList.add("test_line_count=" + this.test_line_count);
        arrayList.add("top_level_directory=" + Internal.sanitize(this.top_level_directory));
        arrayList.add("line_code_count=" + this.line_code_count);
        arrayList.add("line_comment_count=" + this.line_comment_count);
        arrayList.add("line_blank_count=" + this.line_blank_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CodeArtifactEvent{", "}", 0, null, null, 56, null);
    }

    public final CodeArtifactEvent copy(String file_suffix, long file_count, long test_file_count, long line_count, long test_line_count, String top_level_directory, long line_code_count, long line_comment_count, long line_blank_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(file_suffix, "file_suffix");
        Intrinsics.checkNotNullParameter(top_level_directory, "top_level_directory");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CodeArtifactEvent(file_suffix, file_count, test_file_count, line_count, test_line_count, top_level_directory, line_code_count, line_comment_count, line_blank_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CodeArtifactEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CodeArtifactEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CodeArtifactEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CodeArtifactEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFile_suffix(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFile_suffix());
                }
                if (value.getFile_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getFile_count()));
                }
                if (value.getTest_file_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getTest_file_count()));
                }
                if (value.getLine_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getLine_count()));
                }
                if (value.getTest_line_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(5, Long.valueOf(value.getTest_line_count()));
                }
                if (!Intrinsics.areEqual(value.getTop_level_directory(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTop_level_directory());
                }
                if (value.getLine_code_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(7, Long.valueOf(value.getLine_code_count()));
                }
                if (value.getLine_comment_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(8, Long.valueOf(value.getLine_comment_count()));
                }
                return value.getLine_blank_count() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(9, Long.valueOf(value.getLine_blank_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CodeArtifactEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFile_suffix(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFile_suffix());
                }
                if (value.getFile_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getFile_count()));
                }
                if (value.getTest_file_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getTest_file_count()));
                }
                if (value.getLine_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getLine_count()));
                }
                if (value.getTest_line_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getTest_line_count()));
                }
                if (!Intrinsics.areEqual(value.getTop_level_directory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTop_level_directory());
                }
                if (value.getLine_code_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 7, (int) Long.valueOf(value.getLine_code_count()));
                }
                if (value.getLine_comment_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 8, (int) Long.valueOf(value.getLine_comment_count()));
                }
                if (value.getLine_blank_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 9, (int) Long.valueOf(value.getLine_blank_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CodeArtifactEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLine_blank_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 9, (int) Long.valueOf(value.getLine_blank_count()));
                }
                if (value.getLine_comment_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 8, (int) Long.valueOf(value.getLine_comment_count()));
                }
                if (value.getLine_code_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 7, (int) Long.valueOf(value.getLine_code_count()));
                }
                if (!Intrinsics.areEqual(value.getTop_level_directory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTop_level_directory());
                }
                if (value.getTest_line_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getTest_line_count()));
                }
                if (value.getLine_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getLine_count()));
                }
                if (value.getTest_file_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getTest_file_count()));
                }
                if (value.getFile_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getFile_count()));
                }
                if (Intrinsics.areEqual(value.getFile_suffix(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFile_suffix());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CodeArtifactEvent redact(CodeArtifactEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((511 & 1) != 0 ? value.file_suffix : null, (511 & 2) != 0 ? value.file_count : 0L, (511 & 4) != 0 ? value.test_file_count : 0L, (511 & 8) != 0 ? value.line_count : 0L, (511 & 16) != 0 ? value.test_line_count : 0L, (511 & 32) != 0 ? value.top_level_directory : null, (511 & 64) != 0 ? value.line_code_count : 0L, (511 & 128) != 0 ? value.line_comment_count : 0L, (511 & 256) != 0 ? value.line_blank_count : 0L, (511 & 512) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CodeArtifactEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                long jLongValue4 = 0;
                long jLongValue5 = 0;
                long jLongValue6 = 0;
                long jLongValue7 = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 3:
                                jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 4:
                                jLongValue3 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 5:
                                jLongValue4 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                jLongValue5 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 8:
                                jLongValue6 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 9:
                                jLongValue7 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CodeArtifactEvent(strDecode, jLongValue, jLongValue2, jLongValue3, jLongValue4, strDecode2, jLongValue5, jLongValue6, jLongValue7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
