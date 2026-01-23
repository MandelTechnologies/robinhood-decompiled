package com.robinhood.rosetta.common;

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
import p479j$.time.Instant;

/* compiled from: TimestampRange.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/common/TimestampRange;", "Lcom/squareup/wire/Message;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "lower", "upper", "", "bounds", "Lokio/ByteString;", "unknownFields", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/common/TimestampRange;", "Lj$/time/Instant;", "getLower", "()Lj$/time/Instant;", "getUpper", "Ljava/lang/String;", "getBounds", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TimestampRange extends Message {

    @JvmField
    public static final ProtoAdapter<TimestampRange> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bounds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Instant lower;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant upper;

    public TimestampRange() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23989newBuilder();
    }

    public final Instant getLower() {
        return this.lower;
    }

    public final Instant getUpper() {
        return this.upper;
    }

    public final String getBounds() {
        return this.bounds;
    }

    public /* synthetic */ TimestampRange(Instant instant, Instant instant2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? null : instant2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimestampRange(Instant instant, Instant instant2, String bounds, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.lower = instant;
        this.upper = instant2;
        this.bounds = bounds;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23989newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimestampRange)) {
            return false;
        }
        TimestampRange timestampRange = (TimestampRange) other;
        return Intrinsics.areEqual(unknownFields(), timestampRange.unknownFields()) && Intrinsics.areEqual(this.lower, timestampRange.lower) && Intrinsics.areEqual(this.upper, timestampRange.upper) && Intrinsics.areEqual(this.bounds, timestampRange.bounds);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.lower;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.upper;
        int iHashCode3 = ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.bounds.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.lower;
        if (instant != null) {
            arrayList.add("lower=" + instant);
        }
        Instant instant2 = this.upper;
        if (instant2 != null) {
            arrayList.add("upper=" + instant2);
        }
        arrayList.add("bounds=" + Internal.sanitize(this.bounds));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimestampRange{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TimestampRange copy$default(TimestampRange timestampRange, Instant instant, Instant instant2, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = timestampRange.lower;
        }
        if ((i & 2) != 0) {
            instant2 = timestampRange.upper;
        }
        if ((i & 4) != 0) {
            str = timestampRange.bounds;
        }
        if ((i & 8) != 0) {
            byteString = timestampRange.unknownFields();
        }
        return timestampRange.copy(instant, instant2, str, byteString);
    }

    public final TimestampRange copy(Instant lower, Instant upper, String bounds, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimestampRange(lower, upper, bounds, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimestampRange.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimestampRange>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.common.TimestampRange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimestampRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLower() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getLower());
                }
                if (value.getUpper() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getUpper());
                }
                return !Intrinsics.areEqual(value.getBounds(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBounds()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimestampRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLower() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getLower());
                }
                if (value.getUpper() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getUpper());
                }
                if (!Intrinsics.areEqual(value.getBounds(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBounds());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimestampRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getBounds(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBounds());
                }
                if (value.getUpper() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getUpper());
                }
                if (value.getLower() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getLower());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimestampRange redact(TimestampRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant lower = value.getLower();
                Instant instantRedact = lower != null ? ProtoAdapter.INSTANT.redact(lower) : null;
                Instant upper = value.getUpper();
                return TimestampRange.copy$default(value, instantRedact, upper != null ? ProtoAdapter.INSTANT.redact(upper) : null, null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TimestampRange decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = "";
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TimestampRange(instantDecode, instantDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
