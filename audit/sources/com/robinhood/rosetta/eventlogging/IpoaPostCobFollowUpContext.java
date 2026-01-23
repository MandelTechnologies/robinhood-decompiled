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

/* compiled from: IpoaPostCobFollowUpContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContext;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "expected_ipo_date", "projected_allocated_shares", "", "projected_allocated_percentage", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JFLokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getExpected_ipo_date", "getProjected_allocated_shares", "()J", "getProjected_allocated_percentage", "()F", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class IpoaPostCobFollowUpContext extends Message {

    @JvmField
    public static final ProtoAdapter<IpoaPostCobFollowUpContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expectedIpoDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String expected_ipo_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "projectedAllocatedPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float projected_allocated_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "projectedAllocatedShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long projected_allocated_shares;

    public IpoaPostCobFollowUpContext() {
        this(null, null, 0L, 0.0f, null, 31, null);
    }

    public /* synthetic */ IpoaPostCobFollowUpContext(String str, String str2, long j, float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24327newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getExpected_ipo_date() {
        return this.expected_ipo_date;
    }

    public final long getProjected_allocated_shares() {
        return this.projected_allocated_shares;
    }

    public final float getProjected_allocated_percentage() {
        return this.projected_allocated_percentage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoaPostCobFollowUpContext(String instrument_id, String expected_ipo_date, long j, float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.expected_ipo_date = expected_ipo_date;
        this.projected_allocated_shares = j;
        this.projected_allocated_percentage = f;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24327newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IpoaPostCobFollowUpContext)) {
            return false;
        }
        IpoaPostCobFollowUpContext ipoaPostCobFollowUpContext = (IpoaPostCobFollowUpContext) other;
        return Intrinsics.areEqual(unknownFields(), ipoaPostCobFollowUpContext.unknownFields()) && Intrinsics.areEqual(this.instrument_id, ipoaPostCobFollowUpContext.instrument_id) && Intrinsics.areEqual(this.expected_ipo_date, ipoaPostCobFollowUpContext.expected_ipo_date) && this.projected_allocated_shares == ipoaPostCobFollowUpContext.projected_allocated_shares && this.projected_allocated_percentage == ipoaPostCobFollowUpContext.projected_allocated_percentage;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.expected_ipo_date.hashCode()) * 37) + Long.hashCode(this.projected_allocated_shares)) * 37) + Float.hashCode(this.projected_allocated_percentage);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("expected_ipo_date=" + Internal.sanitize(this.expected_ipo_date));
        arrayList.add("projected_allocated_shares=" + this.projected_allocated_shares);
        arrayList.add("projected_allocated_percentage=" + this.projected_allocated_percentage);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IpoaPostCobFollowUpContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IpoaPostCobFollowUpContext copy$default(IpoaPostCobFollowUpContext ipoaPostCobFollowUpContext, String str, String str2, long j, float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipoaPostCobFollowUpContext.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = ipoaPostCobFollowUpContext.expected_ipo_date;
        }
        if ((i & 4) != 0) {
            j = ipoaPostCobFollowUpContext.projected_allocated_shares;
        }
        if ((i & 8) != 0) {
            f = ipoaPostCobFollowUpContext.projected_allocated_percentage;
        }
        if ((i & 16) != 0) {
            byteString = ipoaPostCobFollowUpContext.unknownFields();
        }
        long j2 = j;
        return ipoaPostCobFollowUpContext.copy(str, str2, j2, f, byteString);
    }

    public final IpoaPostCobFollowUpContext copy(String instrument_id, String expected_ipo_date, long projected_allocated_shares, float projected_allocated_percentage, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IpoaPostCobFollowUpContext(instrument_id, expected_ipo_date, projected_allocated_shares, projected_allocated_percentage, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IpoaPostCobFollowUpContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IpoaPostCobFollowUpContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.IpoaPostCobFollowUpContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IpoaPostCobFollowUpContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getExpected_ipo_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getExpected_ipo_date());
                }
                if (value.getProjected_allocated_shares() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getProjected_allocated_shares()));
                }
                return !Float.valueOf(value.getProjected_allocated_percentage()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getProjected_allocated_percentage())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IpoaPostCobFollowUpContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getExpected_ipo_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getExpected_ipo_date());
                }
                if (value.getProjected_allocated_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (!Float.valueOf(value.getProjected_allocated_percentage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getProjected_allocated_percentage()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IpoaPostCobFollowUpContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Float.valueOf(value.getProjected_allocated_percentage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getProjected_allocated_percentage()));
                }
                if (value.getProjected_allocated_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (!Intrinsics.areEqual(value.getExpected_ipo_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getExpected_ipo_date());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IpoaPostCobFollowUpContext redact(IpoaPostCobFollowUpContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IpoaPostCobFollowUpContext.copy$default(value, null, null, 0L, 0.0f, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IpoaPostCobFollowUpContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                float fFloatValue = 0.0f;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IpoaPostCobFollowUpContext(strDecode, strDecode2, jLongValue, fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 4) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
