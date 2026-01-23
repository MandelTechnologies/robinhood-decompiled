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

/* compiled from: PostTransferUpsellContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContext;", "Lcom/squareup/wire/Message;", "", "post_transfer_upsell_type", "", "impression_count", "", "resurrection_impression_count", "should_show_post_transfer_upsell", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "ms_since_last_seen", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;IILcom/robinhood/rosetta/eventlogging/Boolean;JLokio/ByteString;)V", "getPost_transfer_upsell_type", "()Ljava/lang/String;", "getImpression_count", "()I", "getResurrection_impression_count", "getShould_show_post_transfer_upsell", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getMs_since_last_seen", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PostTransferUpsellContext extends Message {

    @JvmField
    public static final ProtoAdapter<PostTransferUpsellContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "impressionCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int impression_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "msSinceLastSeen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final long ms_since_last_seen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postTransferUpsellType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String post_transfer_upsell_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "resurrectionImpressionCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int resurrection_impression_count;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "shouldShowPostTransferUpsell", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Boolean should_show_post_transfer_upsell;

    public PostTransferUpsellContext() {
        this(null, 0, 0, null, 0L, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24511newBuilder();
    }

    public final String getPost_transfer_upsell_type() {
        return this.post_transfer_upsell_type;
    }

    public /* synthetic */ PostTransferUpsellContext(String str, int i, int i2, Boolean r5, long j, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r5, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getImpression_count() {
        return this.impression_count;
    }

    public final int getResurrection_impression_count() {
        return this.resurrection_impression_count;
    }

    public final Boolean getShould_show_post_transfer_upsell() {
        return this.should_show_post_transfer_upsell;
    }

    public final long getMs_since_last_seen() {
        return this.ms_since_last_seen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransferUpsellContext(String post_transfer_upsell_type, int i, int i2, Boolean should_show_post_transfer_upsell, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(post_transfer_upsell_type, "post_transfer_upsell_type");
        Intrinsics.checkNotNullParameter(should_show_post_transfer_upsell, "should_show_post_transfer_upsell");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.post_transfer_upsell_type = post_transfer_upsell_type;
        this.impression_count = i;
        this.resurrection_impression_count = i2;
        this.should_show_post_transfer_upsell = should_show_post_transfer_upsell;
        this.ms_since_last_seen = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24511newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PostTransferUpsellContext)) {
            return false;
        }
        PostTransferUpsellContext postTransferUpsellContext = (PostTransferUpsellContext) other;
        return Intrinsics.areEqual(unknownFields(), postTransferUpsellContext.unknownFields()) && Intrinsics.areEqual(this.post_transfer_upsell_type, postTransferUpsellContext.post_transfer_upsell_type) && this.impression_count == postTransferUpsellContext.impression_count && this.resurrection_impression_count == postTransferUpsellContext.resurrection_impression_count && this.should_show_post_transfer_upsell == postTransferUpsellContext.should_show_post_transfer_upsell && this.ms_since_last_seen == postTransferUpsellContext.ms_since_last_seen;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.post_transfer_upsell_type.hashCode()) * 37) + Integer.hashCode(this.impression_count)) * 37) + Integer.hashCode(this.resurrection_impression_count)) * 37) + this.should_show_post_transfer_upsell.hashCode()) * 37) + Long.hashCode(this.ms_since_last_seen);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("post_transfer_upsell_type=" + Internal.sanitize(this.post_transfer_upsell_type));
        arrayList.add("impression_count=" + this.impression_count);
        arrayList.add("resurrection_impression_count=" + this.resurrection_impression_count);
        arrayList.add("should_show_post_transfer_upsell=" + this.should_show_post_transfer_upsell);
        arrayList.add("ms_since_last_seen=" + this.ms_since_last_seen);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostTransferUpsellContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PostTransferUpsellContext copy$default(PostTransferUpsellContext postTransferUpsellContext, String str, int i, int i2, Boolean r4, long j, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postTransferUpsellContext.post_transfer_upsell_type;
        }
        if ((i3 & 2) != 0) {
            i = postTransferUpsellContext.impression_count;
        }
        if ((i3 & 4) != 0) {
            i2 = postTransferUpsellContext.resurrection_impression_count;
        }
        if ((i3 & 8) != 0) {
            r4 = postTransferUpsellContext.should_show_post_transfer_upsell;
        }
        if ((i3 & 16) != 0) {
            j = postTransferUpsellContext.ms_since_last_seen;
        }
        if ((i3 & 32) != 0) {
            byteString = postTransferUpsellContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        long j2 = j;
        return postTransferUpsellContext.copy(str, i, i2, r4, j2, byteString2);
    }

    public final PostTransferUpsellContext copy(String post_transfer_upsell_type, int impression_count, int resurrection_impression_count, Boolean should_show_post_transfer_upsell, long ms_since_last_seen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(post_transfer_upsell_type, "post_transfer_upsell_type");
        Intrinsics.checkNotNullParameter(should_show_post_transfer_upsell, "should_show_post_transfer_upsell");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PostTransferUpsellContext(post_transfer_upsell_type, impression_count, resurrection_impression_count, should_show_post_transfer_upsell, ms_since_last_seen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostTransferUpsellContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PostTransferUpsellContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PostTransferUpsellContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PostTransferUpsellContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPost_transfer_upsell_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPost_transfer_upsell_type());
                }
                if (value.getImpression_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getImpression_count()));
                }
                if (value.getResurrection_impression_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getResurrection_impression_count()));
                }
                if (value.getShould_show_post_transfer_upsell() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(4, value.getShould_show_post_transfer_upsell());
                }
                return value.getMs_since_last_seen() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(5, Long.valueOf(value.getMs_since_last_seen())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PostTransferUpsellContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPost_transfer_upsell_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPost_transfer_upsell_type());
                }
                if (value.getImpression_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getImpression_count()));
                }
                if (value.getResurrection_impression_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getResurrection_impression_count()));
                }
                if (value.getShould_show_post_transfer_upsell() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getShould_show_post_transfer_upsell());
                }
                if (value.getMs_since_last_seen() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getMs_since_last_seen()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PostTransferUpsellContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMs_since_last_seen() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getMs_since_last_seen()));
                }
                if (value.getShould_show_post_transfer_upsell() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getShould_show_post_transfer_upsell());
                }
                if (value.getResurrection_impression_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getResurrection_impression_count()));
                }
                if (value.getImpression_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getImpression_count()));
                }
                if (Intrinsics.areEqual(value.getPost_transfer_upsell_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPost_transfer_upsell_type());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PostTransferUpsellContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                long jLongValue = 0;
                String strDecode = "";
                while (true) {
                    Boolean r3 = booleanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PostTransferUpsellContext(strDecode, iIntValue, iIntValue2, r3, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 4) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostTransferUpsellContext redact(PostTransferUpsellContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PostTransferUpsellContext.copy$default(value, null, 0, 0, null, 0L, ByteString.EMPTY, 31, null);
            }
        };
    }
}
