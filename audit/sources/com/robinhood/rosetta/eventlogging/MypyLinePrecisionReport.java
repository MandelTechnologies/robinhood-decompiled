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

/* compiled from: MypyLinePrecisionReport.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReport;", "Lcom/squareup/wire/Message;", "", "total_lines", "", "total_precise_lines", "total_imprecise_lines", "total_any_lines", "total_empty_lines", "total_unanalyzed_lines", "unknownFields", "Lokio/ByteString;", "<init>", "(IIIIIILokio/ByteString;)V", "getTotal_lines", "()I", "getTotal_precise_lines", "getTotal_imprecise_lines", "getTotal_any_lines", "getTotal_empty_lines", "getTotal_unanalyzed_lines", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MypyLinePrecisionReport extends Message {

    @JvmField
    public static final ProtoAdapter<MypyLinePrecisionReport> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalAnyLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int total_any_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalEmptyLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int total_empty_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalImpreciseLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int total_imprecise_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int total_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalPreciseLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int total_precise_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalUnanalyzedLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int total_unanalyzed_lines;

    public MypyLinePrecisionReport() {
        this(0, 0, 0, 0, 0, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24388newBuilder();
    }

    public final int getTotal_lines() {
        return this.total_lines;
    }

    public final int getTotal_precise_lines() {
        return this.total_precise_lines;
    }

    public final int getTotal_imprecise_lines() {
        return this.total_imprecise_lines;
    }

    public final int getTotal_any_lines() {
        return this.total_any_lines;
    }

    public final int getTotal_empty_lines() {
        return this.total_empty_lines;
    }

    public final int getTotal_unanalyzed_lines() {
        return this.total_unanalyzed_lines;
    }

    public /* synthetic */ MypyLinePrecisionReport(int i, int i2, int i3, int i4, int i5, int i6, ByteString byteString, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MypyLinePrecisionReport(int i, int i2, int i3, int i4, int i5, int i6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_lines = i;
        this.total_precise_lines = i2;
        this.total_imprecise_lines = i3;
        this.total_any_lines = i4;
        this.total_empty_lines = i5;
        this.total_unanalyzed_lines = i6;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24388newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MypyLinePrecisionReport)) {
            return false;
        }
        MypyLinePrecisionReport mypyLinePrecisionReport = (MypyLinePrecisionReport) other;
        return Intrinsics.areEqual(unknownFields(), mypyLinePrecisionReport.unknownFields()) && this.total_lines == mypyLinePrecisionReport.total_lines && this.total_precise_lines == mypyLinePrecisionReport.total_precise_lines && this.total_imprecise_lines == mypyLinePrecisionReport.total_imprecise_lines && this.total_any_lines == mypyLinePrecisionReport.total_any_lines && this.total_empty_lines == mypyLinePrecisionReport.total_empty_lines && this.total_unanalyzed_lines == mypyLinePrecisionReport.total_unanalyzed_lines;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.total_lines)) * 37) + Integer.hashCode(this.total_precise_lines)) * 37) + Integer.hashCode(this.total_imprecise_lines)) * 37) + Integer.hashCode(this.total_any_lines)) * 37) + Integer.hashCode(this.total_empty_lines)) * 37) + Integer.hashCode(this.total_unanalyzed_lines);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_lines=" + this.total_lines);
        arrayList.add("total_precise_lines=" + this.total_precise_lines);
        arrayList.add("total_imprecise_lines=" + this.total_imprecise_lines);
        arrayList.add("total_any_lines=" + this.total_any_lines);
        arrayList.add("total_empty_lines=" + this.total_empty_lines);
        arrayList.add("total_unanalyzed_lines=" + this.total_unanalyzed_lines);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MypyLinePrecisionReport{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MypyLinePrecisionReport copy$default(MypyLinePrecisionReport mypyLinePrecisionReport, int i, int i2, int i3, int i4, int i5, int i6, ByteString byteString, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = mypyLinePrecisionReport.total_lines;
        }
        if ((i7 & 2) != 0) {
            i2 = mypyLinePrecisionReport.total_precise_lines;
        }
        if ((i7 & 4) != 0) {
            i3 = mypyLinePrecisionReport.total_imprecise_lines;
        }
        if ((i7 & 8) != 0) {
            i4 = mypyLinePrecisionReport.total_any_lines;
        }
        if ((i7 & 16) != 0) {
            i5 = mypyLinePrecisionReport.total_empty_lines;
        }
        if ((i7 & 32) != 0) {
            i6 = mypyLinePrecisionReport.total_unanalyzed_lines;
        }
        if ((i7 & 64) != 0) {
            byteString = mypyLinePrecisionReport.unknownFields();
        }
        int i8 = i6;
        ByteString byteString2 = byteString;
        int i9 = i5;
        int i10 = i3;
        return mypyLinePrecisionReport.copy(i, i2, i10, i4, i9, i8, byteString2);
    }

    public final MypyLinePrecisionReport copy(int total_lines, int total_precise_lines, int total_imprecise_lines, int total_any_lines, int total_empty_lines, int total_unanalyzed_lines, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MypyLinePrecisionReport(total_lines, total_precise_lines, total_imprecise_lines, total_any_lines, total_empty_lines, total_unanalyzed_lines, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MypyLinePrecisionReport.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MypyLinePrecisionReport>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MypyLinePrecisionReport$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MypyLinePrecisionReport value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTotal_lines()));
                }
                if (value.getTotal_precise_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTotal_precise_lines()));
                }
                if (value.getTotal_imprecise_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getTotal_imprecise_lines()));
                }
                if (value.getTotal_any_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTotal_any_lines()));
                }
                if (value.getTotal_empty_lines() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTotal_empty_lines()));
                }
                return value.getTotal_unanalyzed_lines() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTotal_unanalyzed_lines())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MypyLinePrecisionReport value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_lines()));
                }
                if (value.getTotal_precise_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_precise_lines()));
                }
                if (value.getTotal_imprecise_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_imprecise_lines()));
                }
                if (value.getTotal_any_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_any_lines()));
                }
                if (value.getTotal_empty_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_empty_lines()));
                }
                if (value.getTotal_unanalyzed_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_unanalyzed_lines()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MypyLinePrecisionReport value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_unanalyzed_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_unanalyzed_lines()));
                }
                if (value.getTotal_empty_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_empty_lines()));
                }
                if (value.getTotal_any_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_any_lines()));
                }
                if (value.getTotal_imprecise_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTotal_imprecise_lines()));
                }
                if (value.getTotal_precise_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_precise_lines()));
                }
                if (value.getTotal_lines() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_lines()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MypyLinePrecisionReport redact(MypyLinePrecisionReport value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MypyLinePrecisionReport.copy$default(value, 0, 0, 0, 0, 0, 0, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MypyLinePrecisionReport decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                int iIntValue6 = 0;
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
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MypyLinePrecisionReport(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
