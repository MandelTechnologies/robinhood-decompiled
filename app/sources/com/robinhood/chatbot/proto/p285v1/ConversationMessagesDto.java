package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.ConversationMessagesDto;
import com.robinhood.chatbot.proto.p285v1.MessageDto;
import com.robinhood.chatbot.proto.p285v1.UserInteractionStateDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ConversationMessagesDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010J6\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessages;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Surrogate;)V", "conversation_id", "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "Lcom/robinhood/chatbot/proto/v1/MessageDto;", "next", "user_interaction_state", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;)V", "getConversation_id", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "getNext", "getUser_interaction_state", "()Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ConversationMessagesDto implements Dto3<ConversationMessages>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ConversationMessagesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ConversationMessagesDto, ConversationMessages>> binaryBase64Serializer$delegate;
    private static final ConversationMessagesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ConversationMessagesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ConversationMessagesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getConversation_id() {
        return this.surrogate.getConversation_id();
    }

    public final List<MessageDto> getMessages() {
        return this.surrogate.getMessages();
    }

    public final String getNext() {
        return this.surrogate.getNext();
    }

    public final UserInteractionStateDto getUser_interaction_state() {
        return this.surrogate.getUser_interaction_state();
    }

    public /* synthetic */ ConversationMessagesDto(String str, List list, String str2, UserInteractionStateDto userInteractionStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : userInteractionStateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationMessagesDto(String conversation_id, List<MessageDto> messages, String next, UserInteractionStateDto userInteractionStateDto) {
        this(new Surrogate(conversation_id, messages, next, userInteractionStateDto));
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(next, "next");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationMessagesDto copy$default(ConversationMessagesDto conversationMessagesDto, String str, List list, String str2, UserInteractionStateDto userInteractionStateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationMessagesDto.surrogate.getConversation_id();
        }
        if ((i & 2) != 0) {
            list = conversationMessagesDto.surrogate.getMessages();
        }
        if ((i & 4) != 0) {
            str2 = conversationMessagesDto.surrogate.getNext();
        }
        if ((i & 8) != 0) {
            userInteractionStateDto = conversationMessagesDto.surrogate.getUser_interaction_state();
        }
        return conversationMessagesDto.copy(str, list, str2, userInteractionStateDto);
    }

    public final ConversationMessagesDto copy(String conversation_id, List<MessageDto> messages, String next, UserInteractionStateDto user_interaction_state) {
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(next, "next");
        return new ConversationMessagesDto(new Surrogate(conversation_id, messages, next, user_interaction_state));
    }

    @Override // com.robinhood.idl.Dto
    public ConversationMessages toProto() {
        String conversation_id = this.surrogate.getConversation_id();
        List<MessageDto> messages = this.surrogate.getMessages();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(((MessageDto) it.next()).toProto());
        }
        String next = this.surrogate.getNext();
        UserInteractionStateDto user_interaction_state = this.surrogate.getUser_interaction_state();
        return new ConversationMessages(conversation_id, arrayList, next, user_interaction_state != null ? user_interaction_state.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[ConversationMessagesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ConversationMessagesDto) && Intrinsics.areEqual(((ConversationMessagesDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConversationMessagesDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\rHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Surrogate;", "", "conversation_id", "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "Lcom/robinhood/chatbot/proto/v1/MessageDto;", "next", "user_interaction_state", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConversation_id$annotations", "()V", "getConversation_id", "()Ljava/lang/String;", "getMessages$annotations", "getMessages", "()Ljava/util/List;", "getNext$annotations", "getNext", "getUser_interaction_state$annotations", "getUser_interaction_state", "()Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String conversation_id;
        private final List<MessageDto> messages;
        private final String next;
        private final UserInteractionStateDto user_interaction_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.ConversationMessagesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationMessagesDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (UserInteractionStateDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MessageDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, String str2, UserInteractionStateDto userInteractionStateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.conversation_id;
            }
            if ((i & 2) != 0) {
                list = surrogate.messages;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.next;
            }
            if ((i & 8) != 0) {
                userInteractionStateDto = surrogate.user_interaction_state;
            }
            return surrogate.copy(str, list, str2, userInteractionStateDto);
        }

        @SerialName("conversationId")
        @JsonAnnotations2(names = {"conversation_id"})
        public static /* synthetic */ void getConversation_id$annotations() {
        }

        @SerialName(NotificationSettings4FragmentKey.SETTINGS_MESSAGES)
        @JsonAnnotations2(names = {NotificationSettings4FragmentKey.SETTINGS_MESSAGES})
        public static /* synthetic */ void getMessages$annotations() {
        }

        @SerialName("next")
        @JsonAnnotations2(names = {"next"})
        public static /* synthetic */ void getNext$annotations() {
        }

        @SerialName("userInteractionState")
        @JsonAnnotations2(names = {"user_interaction_state"})
        public static /* synthetic */ void getUser_interaction_state$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversation_id() {
            return this.conversation_id;
        }

        public final List<MessageDto> component2() {
            return this.messages;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNext() {
            return this.next;
        }

        /* renamed from: component4, reason: from getter */
        public final UserInteractionStateDto getUser_interaction_state() {
            return this.user_interaction_state;
        }

        public final Surrogate copy(String conversation_id, List<MessageDto> messages, String next, UserInteractionStateDto user_interaction_state) {
            Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
            Intrinsics.checkNotNullParameter(messages, "messages");
            Intrinsics.checkNotNullParameter(next, "next");
            return new Surrogate(conversation_id, messages, next, user_interaction_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.conversation_id, surrogate.conversation_id) && Intrinsics.areEqual(this.messages, surrogate.messages) && Intrinsics.areEqual(this.next, surrogate.next) && Intrinsics.areEqual(this.user_interaction_state, surrogate.user_interaction_state);
        }

        public int hashCode() {
            int iHashCode = ((((this.conversation_id.hashCode() * 31) + this.messages.hashCode()) * 31) + this.next.hashCode()) * 31;
            UserInteractionStateDto userInteractionStateDto = this.user_interaction_state;
            return iHashCode + (userInteractionStateDto == null ? 0 : userInteractionStateDto.hashCode());
        }

        public String toString() {
            return "Surrogate(conversation_id=" + this.conversation_id + ", messages=" + this.messages + ", next=" + this.next + ", user_interaction_state=" + this.user_interaction_state + ")";
        }

        /* compiled from: ConversationMessagesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ConversationMessagesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, UserInteractionStateDto userInteractionStateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.conversation_id = "";
            } else {
                this.conversation_id = str;
            }
            if ((i & 2) == 0) {
                this.messages = CollectionsKt.emptyList();
            } else {
                this.messages = list;
            }
            if ((i & 4) == 0) {
                this.next = "";
            } else {
                this.next = str2;
            }
            if ((i & 8) == 0) {
                this.user_interaction_state = null;
            } else {
                this.user_interaction_state = userInteractionStateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.conversation_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.conversation_id);
            }
            if (!Intrinsics.areEqual(self.messages, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.messages);
            }
            if (!Intrinsics.areEqual(self.next, "")) {
                output.encodeStringElement(serialDesc, 2, self.next);
            }
            UserInteractionStateDto userInteractionStateDto = self.user_interaction_state;
            if (userInteractionStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, UserInteractionStateDto.Serializer.INSTANCE, userInteractionStateDto);
            }
        }

        public Surrogate(String conversation_id, List<MessageDto> messages, String next, UserInteractionStateDto userInteractionStateDto) {
            Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
            Intrinsics.checkNotNullParameter(messages, "messages");
            Intrinsics.checkNotNullParameter(next, "next");
            this.conversation_id = conversation_id;
            this.messages = messages;
            this.next = next;
            this.user_interaction_state = userInteractionStateDto;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, UserInteractionStateDto userInteractionStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : userInteractionStateDto);
        }

        public final String getConversation_id() {
            return this.conversation_id;
        }

        public final List<MessageDto> getMessages() {
            return this.messages;
        }

        public final String getNext() {
            return this.next;
        }

        public final UserInteractionStateDto getUser_interaction_state() {
            return this.user_interaction_state;
        }
    }

    /* compiled from: ConversationMessagesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessages;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ConversationMessagesDto, ConversationMessages> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConversationMessagesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConversationMessagesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConversationMessagesDto> getBinaryBase64Serializer() {
            return (KSerializer) ConversationMessagesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ConversationMessages> getProtoAdapter() {
            return ConversationMessages.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConversationMessagesDto getZeroValue() {
            return ConversationMessagesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConversationMessagesDto fromProto(ConversationMessages proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String conversation_id = proto.getConversation_id();
            List<Message> messages = proto.getMessages();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
            Iterator<T> it = messages.iterator();
            while (it.hasNext()) {
                arrayList.add(MessageDto.INSTANCE.fromProto((Message) it.next()));
            }
            String next = proto.getNext();
            UserInteractionState user_interaction_state = proto.getUser_interaction_state();
            return new ConversationMessagesDto(new Surrogate(conversation_id, arrayList, next, user_interaction_state != null ? UserInteractionStateDto.INSTANCE.fromProto(user_interaction_state) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.ConversationMessagesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationMessagesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ConversationMessagesDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ConversationMessagesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<ConversationMessagesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.ConversationMessages", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ConversationMessagesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ConversationMessagesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ConversationMessagesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ConversationMessagesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.ConversationMessagesDto";
        }
    }
}
