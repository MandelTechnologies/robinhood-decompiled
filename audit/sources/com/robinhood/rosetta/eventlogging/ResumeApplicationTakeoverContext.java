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

/* compiled from: ResumeApplicationTakeoverContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContext;", "Lcom/squareup/wire/Message;", "", "ms_since_last_resurrection_seen", "", "seen_resurrection_count", "was_upsell_shown", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "upsell_identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(JJLcom/robinhood/rosetta/eventlogging/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getMs_since_last_resurrection_seen", "()J", "getSeen_resurrection_count", "getWas_upsell_shown", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getUpsell_identifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ResumeApplicationTakeoverContext extends Message {

    @JvmField
    public static final ProtoAdapter<ResumeApplicationTakeoverContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "msSinceLastResurrectionSeen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long ms_since_last_resurrection_seen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "seenResurrectionCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long seen_resurrection_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "upsellIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String upsell_identifier;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "wasUpsellShown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Boolean was_upsell_shown;

    public ResumeApplicationTakeoverContext() {
        this(0L, 0L, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24535newBuilder();
    }

    public final long getMs_since_last_resurrection_seen() {
        return this.ms_since_last_resurrection_seen;
    }

    public final long getSeen_resurrection_count() {
        return this.seen_resurrection_count;
    }

    public final Boolean getWas_upsell_shown() {
        return this.was_upsell_shown;
    }

    public /* synthetic */ ResumeApplicationTakeoverContext(long j, long j2, Boolean r7, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r7, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getUpsell_identifier() {
        return this.upsell_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResumeApplicationTakeoverContext(long j, long j2, Boolean was_upsell_shown, String upsell_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(was_upsell_shown, "was_upsell_shown");
        Intrinsics.checkNotNullParameter(upsell_identifier, "upsell_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ms_since_last_resurrection_seen = j;
        this.seen_resurrection_count = j2;
        this.was_upsell_shown = was_upsell_shown;
        this.upsell_identifier = upsell_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24535newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ResumeApplicationTakeoverContext)) {
            return false;
        }
        ResumeApplicationTakeoverContext resumeApplicationTakeoverContext = (ResumeApplicationTakeoverContext) other;
        return Intrinsics.areEqual(unknownFields(), resumeApplicationTakeoverContext.unknownFields()) && this.ms_since_last_resurrection_seen == resumeApplicationTakeoverContext.ms_since_last_resurrection_seen && this.seen_resurrection_count == resumeApplicationTakeoverContext.seen_resurrection_count && this.was_upsell_shown == resumeApplicationTakeoverContext.was_upsell_shown && Intrinsics.areEqual(this.upsell_identifier, resumeApplicationTakeoverContext.upsell_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Long.hashCode(this.ms_since_last_resurrection_seen)) * 37) + Long.hashCode(this.seen_resurrection_count)) * 37) + this.was_upsell_shown.hashCode()) * 37) + this.upsell_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ms_since_last_resurrection_seen=" + this.ms_since_last_resurrection_seen);
        arrayList.add("seen_resurrection_count=" + this.seen_resurrection_count);
        arrayList.add("was_upsell_shown=" + this.was_upsell_shown);
        arrayList.add("upsell_identifier=" + Internal.sanitize(this.upsell_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResumeApplicationTakeoverContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ResumeApplicationTakeoverContext copy$default(ResumeApplicationTakeoverContext resumeApplicationTakeoverContext, long j, long j2, Boolean r13, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = resumeApplicationTakeoverContext.ms_since_last_resurrection_seen;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = resumeApplicationTakeoverContext.seen_resurrection_count;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            r13 = resumeApplicationTakeoverContext.was_upsell_shown;
        }
        Boolean r5 = r13;
        if ((i & 8) != 0) {
            str = resumeApplicationTakeoverContext.upsell_identifier;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            byteString = resumeApplicationTakeoverContext.unknownFields();
        }
        return resumeApplicationTakeoverContext.copy(j3, j4, r5, str2, byteString);
    }

    public final ResumeApplicationTakeoverContext copy(long ms_since_last_resurrection_seen, long seen_resurrection_count, Boolean was_upsell_shown, String upsell_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(was_upsell_shown, "was_upsell_shown");
        Intrinsics.checkNotNullParameter(upsell_identifier, "upsell_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ResumeApplicationTakeoverContext(ms_since_last_resurrection_seen, seen_resurrection_count, was_upsell_shown, upsell_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ResumeApplicationTakeoverContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ResumeApplicationTakeoverContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ResumeApplicationTakeoverContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMs_since_last_resurrection_seen() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getMs_since_last_resurrection_seen()));
                }
                if (value.getSeen_resurrection_count() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getSeen_resurrection_count()));
                }
                if (value.getWas_upsell_shown() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(3, value.getWas_upsell_shown());
                }
                return !Intrinsics.areEqual(value.getUpsell_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUpsell_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ResumeApplicationTakeoverContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMs_since_last_resurrection_seen() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getMs_since_last_resurrection_seen()));
                }
                if (value.getSeen_resurrection_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getSeen_resurrection_count()));
                }
                if (value.getWas_upsell_shown() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getWas_upsell_shown());
                }
                if (!Intrinsics.areEqual(value.getUpsell_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUpsell_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ResumeApplicationTakeoverContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUpsell_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUpsell_identifier());
                }
                if (value.getWas_upsell_shown() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getWas_upsell_shown());
                }
                if (value.getSeen_resurrection_count() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getSeen_resurrection_count()));
                }
                if (value.getMs_since_last_resurrection_seen() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getMs_since_last_resurrection_seen()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ResumeApplicationTakeoverContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean r0 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                Boolean booleanDecode = r0;
                String strDecode = "";
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ResumeApplicationTakeoverContext(jLongValue2, jLongValue, booleanDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 2) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 3) {
                        try {
                            booleanDecode = Boolean.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ResumeApplicationTakeoverContext redact(ResumeApplicationTakeoverContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ResumeApplicationTakeoverContext.copy$default(value, 0L, 0L, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
