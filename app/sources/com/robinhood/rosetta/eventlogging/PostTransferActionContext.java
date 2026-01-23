package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PostTransferActionContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PostTransferActionContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext;", "Lcom/squareup/wire/Message;", "", "post_transfer_action_type", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;Lokio/ByteString;)V", "getPost_transfer_action_type", "()Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "PostTransferActionType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PostTransferActionContext extends Message {

    @JvmField
    public static final ProtoAdapter<PostTransferActionContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PostTransferActionContext$PostTransferActionType#ADAPTER", jsonName = "postTransferActionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PostTransferActionType post_transfer_action_type;

    /* JADX WARN: Multi-variable type inference failed */
    public PostTransferActionContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24510newBuilder();
    }

    public final PostTransferActionType getPost_transfer_action_type() {
        return this.post_transfer_action_type;
    }

    public /* synthetic */ PostTransferActionContext(PostTransferActionType postTransferActionType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED : postTransferActionType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransferActionContext(PostTransferActionType post_transfer_action_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(post_transfer_action_type, "post_transfer_action_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.post_transfer_action_type = post_transfer_action_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24510newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PostTransferActionContext)) {
            return false;
        }
        PostTransferActionContext postTransferActionContext = (PostTransferActionContext) other;
        return Intrinsics.areEqual(unknownFields(), postTransferActionContext.unknownFields()) && this.post_transfer_action_type == postTransferActionContext.post_transfer_action_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.post_transfer_action_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("post_transfer_action_type=" + this.post_transfer_action_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostTransferActionContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PostTransferActionContext copy$default(PostTransferActionContext postTransferActionContext, PostTransferActionType postTransferActionType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            postTransferActionType = postTransferActionContext.post_transfer_action_type;
        }
        if ((i & 2) != 0) {
            byteString = postTransferActionContext.unknownFields();
        }
        return postTransferActionContext.copy(postTransferActionType, byteString);
    }

    public final PostTransferActionContext copy(PostTransferActionType post_transfer_action_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(post_transfer_action_type, "post_transfer_action_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PostTransferActionContext(post_transfer_action_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostTransferActionContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PostTransferActionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PostTransferActionContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PostTransferActionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getPost_transfer_action_type() != PostTransferActionContext.PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED ? size + PostTransferActionContext.PostTransferActionType.ADAPTER.encodedSizeWithTag(1, value.getPost_transfer_action_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PostTransferActionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPost_transfer_action_type() != PostTransferActionContext.PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED) {
                    PostTransferActionContext.PostTransferActionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getPost_transfer_action_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PostTransferActionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPost_transfer_action_type() != PostTransferActionContext.PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED) {
                    PostTransferActionContext.PostTransferActionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getPost_transfer_action_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PostTransferActionContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PostTransferActionContext.PostTransferActionType postTransferActionTypeDecode = PostTransferActionContext.PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PostTransferActionContext(postTransferActionTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            postTransferActionTypeDecode = PostTransferActionContext.PostTransferActionType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostTransferActionContext redact(PostTransferActionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PostTransferActionContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostTransferActionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POST_TRANSFER_ACTION_TYPE_UNSPECIFIED", "RHS_RECURRING_UPSELL", "RHY_RECURRING_UPSELL", "GOLD_UPSELL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PostTransferActionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PostTransferActionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<PostTransferActionType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PostTransferActionType GOLD_UPSELL;
        public static final PostTransferActionType POST_TRANSFER_ACTION_TYPE_UNSPECIFIED;
        public static final PostTransferActionType RHS_RECURRING_UPSELL;
        public static final PostTransferActionType RHY_RECURRING_UPSELL;
        private final int value;

        private static final /* synthetic */ PostTransferActionType[] $values() {
            return new PostTransferActionType[]{POST_TRANSFER_ACTION_TYPE_UNSPECIFIED, RHS_RECURRING_UPSELL, RHY_RECURRING_UPSELL, GOLD_UPSELL};
        }

        @JvmStatic
        public static final PostTransferActionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PostTransferActionType> getEntries() {
            return $ENTRIES;
        }

        private PostTransferActionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PostTransferActionType postTransferActionType = new PostTransferActionType("POST_TRANSFER_ACTION_TYPE_UNSPECIFIED", 0, 0);
            POST_TRANSFER_ACTION_TYPE_UNSPECIFIED = postTransferActionType;
            RHS_RECURRING_UPSELL = new PostTransferActionType("RHS_RECURRING_UPSELL", 1, 1);
            RHY_RECURRING_UPSELL = new PostTransferActionType("RHY_RECURRING_UPSELL", 2, 2);
            GOLD_UPSELL = new PostTransferActionType("GOLD_UPSELL", 3, 3);
            PostTransferActionType[] postTransferActionTypeArr$values = $values();
            $VALUES = postTransferActionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(postTransferActionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostTransferActionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PostTransferActionType>(orCreateKotlinClass, syntax, postTransferActionType) { // from class: com.robinhood.rosetta.eventlogging.PostTransferActionContext$PostTransferActionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PostTransferActionContext.PostTransferActionType fromValue(int value) {
                    return PostTransferActionContext.PostTransferActionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PostTransferActionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PostTransferActionType fromValue(int value) {
                if (value == 0) {
                    return PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return PostTransferActionType.RHS_RECURRING_UPSELL;
                }
                if (value == 2) {
                    return PostTransferActionType.RHY_RECURRING_UPSELL;
                }
                if (value != 3) {
                    return null;
                }
                return PostTransferActionType.GOLD_UPSELL;
            }
        }

        public static PostTransferActionType valueOf(String str) {
            return (PostTransferActionType) Enum.valueOf(PostTransferActionType.class, str);
        }

        public static PostTransferActionType[] values() {
            return (PostTransferActionType[]) $VALUES.clone();
        }
    }
}
