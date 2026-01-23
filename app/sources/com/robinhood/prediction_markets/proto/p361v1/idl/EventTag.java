package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: EventTag.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventTag;", "Lcom/squareup/wire/Message;", "", "game_tag", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameTag;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GameTag;Lokio/ByteString;)V", "getGame_tag", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GameTag;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventTag extends Message {

    @JvmField
    public static final ProtoAdapter<EventTag> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.GameTag#ADAPTER", jsonName = "gameTag", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GameTag game_tag;

    /* JADX WARN: Multi-variable type inference failed */
    public EventTag() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23794newBuilder();
    }

    public final GameTag getGame_tag() {
        return this.game_tag;
    }

    public /* synthetic */ EventTag(GameTag gameTag, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GameTag.GAME_TAG_UNSPECIFIED : gameTag, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTag(GameTag game_tag, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(game_tag, "game_tag");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.game_tag = game_tag;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23794newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventTag)) {
            return false;
        }
        EventTag eventTag = (EventTag) other;
        return Intrinsics.areEqual(unknownFields(), eventTag.unknownFields()) && this.game_tag == eventTag.game_tag;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.game_tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("game_tag=" + this.game_tag);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventTag{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventTag copy$default(EventTag eventTag, GameTag gameTag, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            gameTag = eventTag.game_tag;
        }
        if ((i & 2) != 0) {
            byteString = eventTag.unknownFields();
        }
        return eventTag.copy(gameTag, byteString);
    }

    public final EventTag copy(GameTag game_tag, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(game_tag, "game_tag");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventTag(game_tag, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventTag.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventTag>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventTag$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventTag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getGame_tag() != GameTag.GAME_TAG_UNSPECIFIED ? size + GameTag.ADAPTER.encodedSizeWithTag(1, value.getGame_tag()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventTag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getGame_tag() != GameTag.GAME_TAG_UNSPECIFIED) {
                    GameTag.ADAPTER.encodeWithTag(writer, 1, (int) value.getGame_tag());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventTag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getGame_tag() != GameTag.GAME_TAG_UNSPECIFIED) {
                    GameTag.ADAPTER.encodeWithTag(writer, 1, (int) value.getGame_tag());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventTag decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GameTag gameTagDecode = GameTag.GAME_TAG_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EventTag(gameTagDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            gameTagDecode = GameTag.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventTag redact(EventTag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EventTag.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
