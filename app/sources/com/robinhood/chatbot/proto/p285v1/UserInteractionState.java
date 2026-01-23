package com.robinhood.chatbot.proto.p285v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UserInteractionState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\tH\u0016Jn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006,"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionState;", "Lcom/squareup/wire/Message;", "", "text_input_allowed", "", "suggested_responses", "", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponse;", "text_input_placeholder", "", "text_input_state", "is_typing", "thinking_state", "Lcom/robinhood/chatbot/proto/v1/ThinkingState;", "extra_user_input_type", "Lcom/robinhood/chatbot/proto/v1/ExtraUserInputType;", "selection_menu", "Lcom/robinhood/chatbot/proto/v1/SelectionMenu;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/chatbot/proto/v1/ThinkingState;Lcom/robinhood/chatbot/proto/v1/ExtraUserInputType;Lcom/robinhood/chatbot/proto/v1/SelectionMenu;Lokio/ByteString;)V", "getText_input_allowed", "()Z", "getText_input_placeholder", "()Ljava/lang/String;", "getText_input_state", "getThinking_state", "()Lcom/robinhood/chatbot/proto/v1/ThinkingState;", "getExtra_user_input_type", "()Lcom/robinhood/chatbot/proto/v1/ExtraUserInputType;", "getSelection_menu", "()Lcom/robinhood/chatbot/proto/v1/SelectionMenu;", "getSuggested_responses", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class UserInteractionState extends Message {

    @JvmField
    public static final ProtoAdapter<UserInteractionState> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ExtraUserInputType#ADAPTER", jsonName = "extraUserInputType", schemaIndex = 6, tag = 7)
    private final ExtraUserInputType extra_user_input_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isTyping", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_typing;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SelectionMenu#ADAPTER", jsonName = "selectionMenu", oneofName = "extra_user_input", schemaIndex = 7, tag = 8)
    private final SelectionMenu selection_menu;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SuggestedResponse#ADAPTER", jsonName = "suggestedResponses", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<SuggestedResponse> suggested_responses;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "textInputAllowed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean text_input_allowed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "textInputPlaceholder", schemaIndex = 2, tag = 3)
    private final String text_input_placeholder;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "textInputState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String text_input_state;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ThinkingState#ADAPTER", jsonName = "thinkingState", schemaIndex = 5, tag = 6)
    private final ThinkingState thinking_state;

    public UserInteractionState() {
        this(false, null, null, null, false, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20562newBuilder();
    }

    public final boolean getText_input_allowed() {
        return this.text_input_allowed;
    }

    public /* synthetic */ UserInteractionState(boolean z, List list, String str, String str2, boolean z2, ThinkingState thinkingState, ExtraUserInputType extraUserInputType, SelectionMenu selectionMenu, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : thinkingState, (i & 64) != 0 ? null : extraUserInputType, (i & 128) != 0 ? null : selectionMenu, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getText_input_placeholder() {
        return this.text_input_placeholder;
    }

    public final String getText_input_state() {
        return this.text_input_state;
    }

    /* renamed from: is_typing, reason: from getter */
    public final boolean getIs_typing() {
        return this.is_typing;
    }

    public final ThinkingState getThinking_state() {
        return this.thinking_state;
    }

    public final ExtraUserInputType getExtra_user_input_type() {
        return this.extra_user_input_type;
    }

    public final SelectionMenu getSelection_menu() {
        return this.selection_menu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInteractionState(boolean z, List<SuggestedResponse> suggested_responses, String str, String text_input_state, boolean z2, ThinkingState thinkingState, ExtraUserInputType extraUserInputType, SelectionMenu selectionMenu, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
        Intrinsics.checkNotNullParameter(text_input_state, "text_input_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text_input_allowed = z;
        this.text_input_placeholder = str;
        this.text_input_state = text_input_state;
        this.is_typing = z2;
        this.thinking_state = thinkingState;
        this.extra_user_input_type = extraUserInputType;
        this.selection_menu = selectionMenu;
        this.suggested_responses = Internal.immutableCopyOf("suggested_responses", suggested_responses);
    }

    public final List<SuggestedResponse> getSuggested_responses() {
        return this.suggested_responses;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20562newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserInteractionState)) {
            return false;
        }
        UserInteractionState userInteractionState = (UserInteractionState) other;
        return Intrinsics.areEqual(unknownFields(), userInteractionState.unknownFields()) && this.text_input_allowed == userInteractionState.text_input_allowed && Intrinsics.areEqual(this.suggested_responses, userInteractionState.suggested_responses) && Intrinsics.areEqual(this.text_input_placeholder, userInteractionState.text_input_placeholder) && Intrinsics.areEqual(this.text_input_state, userInteractionState.text_input_state) && this.is_typing == userInteractionState.is_typing && Intrinsics.areEqual(this.thinking_state, userInteractionState.thinking_state) && this.extra_user_input_type == userInteractionState.extra_user_input_type && Intrinsics.areEqual(this.selection_menu, userInteractionState.selection_menu);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.text_input_allowed)) * 37) + this.suggested_responses.hashCode()) * 37;
        String str = this.text_input_placeholder;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.text_input_state.hashCode()) * 37) + Boolean.hashCode(this.is_typing)) * 37;
        ThinkingState thinkingState = this.thinking_state;
        int iHashCode3 = (iHashCode2 + (thinkingState != null ? thinkingState.hashCode() : 0)) * 37;
        ExtraUserInputType extraUserInputType = this.extra_user_input_type;
        int iHashCode4 = (iHashCode3 + (extraUserInputType != null ? extraUserInputType.hashCode() : 0)) * 37;
        SelectionMenu selectionMenu = this.selection_menu;
        int iHashCode5 = iHashCode4 + (selectionMenu != null ? selectionMenu.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text_input_allowed=" + this.text_input_allowed);
        if (!this.suggested_responses.isEmpty()) {
            arrayList.add("suggested_responses=" + this.suggested_responses);
        }
        String str = this.text_input_placeholder;
        if (str != null) {
            arrayList.add("text_input_placeholder=" + Internal.sanitize(str));
        }
        arrayList.add("text_input_state=" + Internal.sanitize(this.text_input_state));
        arrayList.add("is_typing=" + this.is_typing);
        ThinkingState thinkingState = this.thinking_state;
        if (thinkingState != null) {
            arrayList.add("thinking_state=" + thinkingState);
        }
        ExtraUserInputType extraUserInputType = this.extra_user_input_type;
        if (extraUserInputType != null) {
            arrayList.add("extra_user_input_type=" + extraUserInputType);
        }
        SelectionMenu selectionMenu = this.selection_menu;
        if (selectionMenu != null) {
            arrayList.add("selection_menu=" + selectionMenu);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserInteractionState{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UserInteractionState copy$default(UserInteractionState userInteractionState, boolean z, List list, String str, String str2, boolean z2, ThinkingState thinkingState, ExtraUserInputType extraUserInputType, SelectionMenu selectionMenu, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userInteractionState.text_input_allowed;
        }
        if ((i & 2) != 0) {
            list = userInteractionState.suggested_responses;
        }
        if ((i & 4) != 0) {
            str = userInteractionState.text_input_placeholder;
        }
        if ((i & 8) != 0) {
            str2 = userInteractionState.text_input_state;
        }
        if ((i & 16) != 0) {
            z2 = userInteractionState.is_typing;
        }
        if ((i & 32) != 0) {
            thinkingState = userInteractionState.thinking_state;
        }
        if ((i & 64) != 0) {
            extraUserInputType = userInteractionState.extra_user_input_type;
        }
        if ((i & 128) != 0) {
            selectionMenu = userInteractionState.selection_menu;
        }
        if ((i & 256) != 0) {
            byteString = userInteractionState.unknownFields();
        }
        SelectionMenu selectionMenu2 = selectionMenu;
        ByteString byteString2 = byteString;
        ThinkingState thinkingState2 = thinkingState;
        ExtraUserInputType extraUserInputType2 = extraUserInputType;
        boolean z3 = z2;
        String str3 = str;
        return userInteractionState.copy(z, list, str3, str2, z3, thinkingState2, extraUserInputType2, selectionMenu2, byteString2);
    }

    public final UserInteractionState copy(boolean text_input_allowed, List<SuggestedResponse> suggested_responses, String text_input_placeholder, String text_input_state, boolean is_typing, ThinkingState thinking_state, ExtraUserInputType extra_user_input_type, SelectionMenu selection_menu, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
        Intrinsics.checkNotNullParameter(text_input_state, "text_input_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserInteractionState(text_input_allowed, suggested_responses, text_input_placeholder, text_input_state, is_typing, thinking_state, extra_user_input_type, selection_menu, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserInteractionState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserInteractionState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.UserInteractionState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserInteractionState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getText_input_allowed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getText_input_allowed()));
                }
                int iEncodedSizeWithTag = size + SuggestedResponse.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSuggested_responses());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getText_input_placeholder());
                if (!Intrinsics.areEqual(value.getText_input_state(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(4, value.getText_input_state());
                }
                if (value.getIs_typing()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_typing()));
                }
                return iEncodedSizeWithTag2 + ThinkingState.ADAPTER.encodedSizeWithTag(6, value.getThinking_state()) + ExtraUserInputType.ADAPTER.encodedSizeWithTag(7, value.getExtra_user_input_type()) + SelectionMenu.ADAPTER.encodedSizeWithTag(8, value.getSelection_menu());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserInteractionState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getText_input_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getText_input_allowed()));
                }
                SuggestedResponse.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSuggested_responses());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getText_input_placeholder());
                if (!Intrinsics.areEqual(value.getText_input_state(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getText_input_state());
                }
                if (value.getIs_typing()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_typing()));
                }
                ThinkingState.ADAPTER.encodeWithTag(writer, 6, (int) value.getThinking_state());
                ExtraUserInputType.ADAPTER.encodeWithTag(writer, 7, (int) value.getExtra_user_input_type());
                SelectionMenu.ADAPTER.encodeWithTag(writer, 8, (int) value.getSelection_menu());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserInteractionState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SelectionMenu.ADAPTER.encodeWithTag(writer, 8, (int) value.getSelection_menu());
                ExtraUserInputType.ADAPTER.encodeWithTag(writer, 7, (int) value.getExtra_user_input_type());
                ThinkingState.ADAPTER.encodeWithTag(writer, 6, (int) value.getThinking_state());
                if (value.getIs_typing()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_typing()));
                }
                if (!Intrinsics.areEqual(value.getText_input_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getText_input_state());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText_input_placeholder());
                SuggestedResponse.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSuggested_responses());
                if (value.getText_input_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getText_input_allowed()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UserInteractionState decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                ThinkingState thinkingStateDecode = null;
                ExtraUserInputType extraUserInputTypeDecode = null;
                SelectionMenu selectionMenuDecode = null;
                String strDecode2 = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                arrayList.add(SuggestedResponse.ADAPTER.decode(reader));
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                thinkingStateDecode = ThinkingState.ADAPTER.decode(reader);
                                break;
                            case 7:
                                try {
                                    extraUserInputTypeDecode = ExtraUserInputType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                selectionMenuDecode = SelectionMenu.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new UserInteractionState(zBooleanValue, arrayList, strDecode, strDecode2, zBooleanValue2, thinkingStateDecode, extraUserInputTypeDecode, selectionMenuDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserInteractionState redact(UserInteractionState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getSuggested_responses(), SuggestedResponse.ADAPTER);
                ThinkingState thinking_state = value.getThinking_state();
                ThinkingState thinkingStateRedact = thinking_state != null ? ThinkingState.ADAPTER.redact(thinking_state) : null;
                SelectionMenu selection_menu = value.getSelection_menu();
                return UserInteractionState.copy$default(value, false, listM26823redactElements, null, null, false, thinkingStateRedact, null, selection_menu != null ? SelectionMenu.ADAPTER.redact(selection_menu) : null, ByteString.EMPTY, 93, null);
            }
        };
    }
}
