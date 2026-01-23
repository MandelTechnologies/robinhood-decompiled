package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.chatbot.proto.p285v1.CreateConversationRequestDto;
import com.robinhood.chatbot.proto.p285v1.MessageInputDto;
import com.robinhood.chatbot.proto.p285v1.ResponseModeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CreateConversationRequestDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0012JJ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\tJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006/"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Surrogate;)V", MatchaQrCodeDuxo6.USER_ID_KEY, "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "Lcom/robinhood/chatbot/proto/v1/MessageInputDto;", "response_mode", "Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "annotations", "", "locality", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;)V", "getUser_id", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "getResponse_mode", "()Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "getAnnotations", "()Ljava/util/Map;", "getLocality", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class CreateConversationRequestDto implements Dto3<CreateConversationRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateConversationRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateConversationRequestDto, CreateConversationRequest>> binaryBase64Serializer$delegate;
    private static final CreateConversationRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateConversationRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateConversationRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final List<MessageInputDto> getMessages() {
        return this.surrogate.getMessages();
    }

    public final ResponseModeDto getResponse_mode() {
        return this.surrogate.getResponse_mode();
    }

    public final Map<String, ?> getAnnotations() {
        return this.surrogate.getAnnotations();
    }

    public final String getLocality() {
        return this.surrogate.getLocality();
    }

    public /* synthetic */ CreateConversationRequestDto(String str, List list, ResponseModeDto responseModeDto, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ResponseModeDto.INSTANCE.getZeroValue() : responseModeDto, (i & 8) != 0 ? null : map, (i & 16) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateConversationRequestDto(String user_id, List<MessageInputDto> messages, ResponseModeDto response_mode, Map<String, ?> map, String locality) {
        this(new Surrogate(user_id, messages, response_mode, map, locality));
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
    }

    public static /* synthetic */ CreateConversationRequestDto copy$default(CreateConversationRequestDto createConversationRequestDto, String str, List list, ResponseModeDto responseModeDto, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createConversationRequestDto.surrogate.getUser_id();
        }
        if ((i & 2) != 0) {
            list = createConversationRequestDto.surrogate.getMessages();
        }
        if ((i & 4) != 0) {
            responseModeDto = createConversationRequestDto.surrogate.getResponse_mode();
        }
        if ((i & 8) != 0) {
            map = createConversationRequestDto.surrogate.getAnnotations();
        }
        if ((i & 16) != 0) {
            str2 = createConversationRequestDto.surrogate.getLocality();
        }
        String str3 = str2;
        ResponseModeDto responseModeDto2 = responseModeDto;
        return createConversationRequestDto.copy(str, list, responseModeDto2, map, str3);
    }

    public final CreateConversationRequestDto copy(String user_id, List<MessageInputDto> messages, ResponseModeDto response_mode, Map<String, ?> annotations, String locality) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new CreateConversationRequestDto(new Surrogate(user_id, messages, response_mode, annotations, locality));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateConversationRequest toProto() {
        String user_id = this.surrogate.getUser_id();
        List<MessageInputDto> messages = this.surrogate.getMessages();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(((MessageInputDto) it.next()).toProto());
        }
        return new CreateConversationRequest(user_id, arrayList, (ResponseMode) this.surrogate.getResponse_mode().toProto(), this.surrogate.getAnnotations(), this.surrogate.getLocality(), null, 32, null);
    }

    public String toString() {
        return "[CreateConversationRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateConversationRequestDto) && Intrinsics.areEqual(((CreateConversationRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateConversationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289B^\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012'\b\u0002\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J(\u0010(\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J`\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2'\b\u0002\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0012HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR;\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019¨\u0006:"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Surrogate;", "", MatchaQrCodeDuxo6.USER_ID_KEY, "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "Lcom/robinhood/chatbot/proto/v1/MessageInputDto;", "response_mode", "Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "annotations", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", "locality", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_id$annotations", "()V", "getUser_id", "()Ljava/lang/String;", "getMessages$annotations", "getMessages", "()Ljava/util/List;", "getResponse_mode$annotations", "getResponse_mode", "()Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "getAnnotations$annotations", "getAnnotations", "()Ljava/util/Map;", "getLocality$annotations", "getLocality", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, Object> annotations;
        private final String locality;
        private final List<MessageInputDto> messages;
        private final ResponseModeDto response_mode;
        private final String user_id;

        public Surrogate() {
            this((String) null, (List) null, (ResponseModeDto) null, (Map) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MessageInputDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, ResponseModeDto responseModeDto, Map map, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.user_id;
            }
            if ((i & 2) != 0) {
                list = surrogate.messages;
            }
            if ((i & 4) != 0) {
                responseModeDto = surrogate.response_mode;
            }
            if ((i & 8) != 0) {
                map = surrogate.annotations;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.locality;
            }
            String str3 = str2;
            ResponseModeDto responseModeDto2 = responseModeDto;
            return surrogate.copy(str, list, responseModeDto2, map, str3);
        }

        @SerialName("annotations")
        @JsonAnnotations2(names = {"annotations"})
        public static /* synthetic */ void getAnnotations$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName(NotificationSettings4FragmentKey.SETTINGS_MESSAGES)
        @JsonAnnotations2(names = {NotificationSettings4FragmentKey.SETTINGS_MESSAGES})
        public static /* synthetic */ void getMessages$annotations() {
        }

        @SerialName("responseMode")
        @JsonAnnotations2(names = {"response_mode"})
        public static /* synthetic */ void getResponse_mode$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUser_id() {
            return this.user_id;
        }

        public final List<MessageInputDto> component2() {
            return this.messages;
        }

        /* renamed from: component3, reason: from getter */
        public final ResponseModeDto getResponse_mode() {
            return this.response_mode;
        }

        public final Map<String, Object> component4() {
            return this.annotations;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        public final Surrogate copy(String user_id, List<MessageInputDto> messages, ResponseModeDto response_mode, Map<String, ? extends Object> annotations, String locality) {
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(messages, "messages");
            Intrinsics.checkNotNullParameter(response_mode, "response_mode");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Surrogate(user_id, messages, response_mode, annotations, locality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_id, surrogate.user_id) && Intrinsics.areEqual(this.messages, surrogate.messages) && this.response_mode == surrogate.response_mode && Intrinsics.areEqual(this.annotations, surrogate.annotations) && Intrinsics.areEqual(this.locality, surrogate.locality);
        }

        public int hashCode() {
            int iHashCode = ((((this.user_id.hashCode() * 31) + this.messages.hashCode()) * 31) + this.response_mode.hashCode()) * 31;
            Map<String, Object> map = this.annotations;
            return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Surrogate(user_id=" + this.user_id + ", messages=" + this.messages + ", response_mode=" + this.response_mode + ", annotations=" + this.annotations + ", locality=" + this.locality + ")";
        }

        /* compiled from: CreateConversationRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateConversationRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.chatbot.proto.v1.CreateConversationRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateConversationRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.chatbot.proto.v1.CreateConversationRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateConversationRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, ResponseModeDto responseModeDto, Map map, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user_id = "";
            } else {
                this.user_id = str;
            }
            if ((i & 2) == 0) {
                this.messages = CollectionsKt.emptyList();
            } else {
                this.messages = list;
            }
            if ((i & 4) == 0) {
                this.response_mode = ResponseModeDto.INSTANCE.getZeroValue();
            } else {
                this.response_mode = responseModeDto;
            }
            if ((i & 8) == 0) {
                this.annotations = null;
            } else {
                this.annotations = map;
            }
            if ((i & 16) == 0) {
                this.locality = "";
            } else {
                this.locality = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.user_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.user_id);
            }
            if (!Intrinsics.areEqual(self.messages, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.messages);
            }
            if (self.response_mode != ResponseModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ResponseModeDto.Serializer.INSTANCE, self.response_mode);
            }
            if (self.annotations != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.annotations);
            }
            if (Intrinsics.areEqual(self.locality, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.locality);
        }

        public Surrogate(String user_id, List<MessageInputDto> messages, ResponseModeDto response_mode, Map<String, ? extends Object> map, String locality) {
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(messages, "messages");
            Intrinsics.checkNotNullParameter(response_mode, "response_mode");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.user_id = user_id;
            this.messages = messages;
            this.response_mode = response_mode;
            this.annotations = map;
            this.locality = locality;
        }

        public /* synthetic */ Surrogate(String str, List list, ResponseModeDto responseModeDto, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ResponseModeDto.INSTANCE.getZeroValue() : responseModeDto, (i & 8) != 0 ? null : map, (i & 16) != 0 ? "" : str2);
        }

        public final String getUser_id() {
            return this.user_id;
        }

        public final List<MessageInputDto> getMessages() {
            return this.messages;
        }

        public final ResponseModeDto getResponse_mode() {
            return this.response_mode;
        }

        public final Map<String, Object> getAnnotations() {
            return this.annotations;
        }

        public final String getLocality() {
            return this.locality;
        }
    }

    /* compiled from: CreateConversationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateConversationRequestDto, CreateConversationRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateConversationRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateConversationRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateConversationRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateConversationRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateConversationRequest> getProtoAdapter() {
            return CreateConversationRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateConversationRequestDto getZeroValue() {
            return CreateConversationRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateConversationRequestDto fromProto(CreateConversationRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String user_id = proto.getUser_id();
            List<MessageInput> messages = proto.getMessages();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messages, 10));
            Iterator<T> it = messages.iterator();
            while (it.hasNext()) {
                arrayList.add(MessageInputDto.INSTANCE.fromProto((MessageInput) it.next()));
            }
            return new CreateConversationRequestDto(new Surrogate(user_id, arrayList, ResponseModeDto.INSTANCE.fromProto(proto.getResponse_mode()), proto.getAnnotations(), proto.getLocality()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.CreateConversationRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateConversationRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CreateConversationRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateConversationRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<CreateConversationRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.CreateConversationRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateConversationRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateConversationRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateConversationRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateConversationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.CreateConversationRequestDto";
        }
    }
}
