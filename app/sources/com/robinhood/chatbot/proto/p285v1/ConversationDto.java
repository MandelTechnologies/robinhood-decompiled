package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.chatbot.proto.p285v1.ConversationDto;
import com.robinhood.chatbot.proto.p285v1.ResponseModeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: ConversationDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0014Jg\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001a¨\u00069"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/Conversation;", "Landroid/os/Parcelable;", "Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;)V", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", MatchaQrCodeDuxo6.USER_ID_KEY, "state", "Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "response_mode", "", "annotations", "locality", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;)Lcom/robinhood/chatbot/proto/v1/ConversationDto;", "toProto", "()Lcom/robinhood/chatbot/proto/v1/Conversation;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;", "getId", "getCreated_at", "()Lj$/time/Instant;", "getUser_id", "getState", "getResponse_mode", "()Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "getAnnotations", "()Ljava/util/Map;", "getLocality", "Companion", "Surrogate", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class ConversationDto implements Dto3<Conversation>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ConversationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ConversationDto, Conversation>> binaryBase64Serializer$delegate;
    private static final ConversationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ConversationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ConversationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final String getState() {
        return this.surrogate.getState();
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

    public /* synthetic */ ConversationDto(String str, Instant instant, String str2, String str3, ResponseModeDto responseModeDto, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ResponseModeDto.INSTANCE.getZeroValue() : responseModeDto, (i & 32) != 0 ? null : map, (i & 64) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationDto(String id, Instant instant, String user_id, String state, ResponseModeDto response_mode, Map<String, ?> map, String locality) {
        this(new Surrogate(id, instant, user_id, state, response_mode, map, locality));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
    }

    public static /* synthetic */ ConversationDto copy$default(ConversationDto conversationDto, String str, Instant instant, String str2, String str3, ResponseModeDto responseModeDto, Map map, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            instant = conversationDto.surrogate.getCreated_at();
        }
        if ((i & 4) != 0) {
            str2 = conversationDto.surrogate.getUser_id();
        }
        if ((i & 8) != 0) {
            str3 = conversationDto.surrogate.getState();
        }
        if ((i & 16) != 0) {
            responseModeDto = conversationDto.surrogate.getResponse_mode();
        }
        if ((i & 32) != 0) {
            map = conversationDto.surrogate.getAnnotations();
        }
        if ((i & 64) != 0) {
            str4 = conversationDto.surrogate.getLocality();
        }
        Map map2 = map;
        String str5 = str4;
        ResponseModeDto responseModeDto2 = responseModeDto;
        String str6 = str2;
        return conversationDto.copy(str, instant, str6, str3, responseModeDto2, map2, str5);
    }

    public final ConversationDto copy(String id, Instant created_at, String user_id, String state, ResponseModeDto response_mode, Map<String, ?> annotations, String locality) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new ConversationDto(new Surrogate(id, created_at, user_id, state, response_mode, annotations, locality));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Conversation toProto() {
        return new Conversation(this.surrogate.getId(), this.surrogate.getCreated_at(), this.surrogate.getUser_id(), this.surrogate.getState(), (ResponseMode) this.surrogate.getResponse_mode().toProto(), this.surrogate.getAnnotations(), this.surrogate.getLocality(), null, 128, null);
    }

    public String toString() {
        return "[ConversationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ConversationDto) && Intrinsics.areEqual(((ConversationDto) other).surrogate, this.surrogate);
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
    /* compiled from: ConversationDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIB\u0092\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012'\b\u0002\u0010\u0010\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013Bo\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J/\u0010*\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J\u009b\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2'\b\u0002\u0010\u0010\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010%R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b>\u00109\u001a\u0004\b=\u0010#R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b@\u00109\u001a\u0004\b?\u0010#R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010)R?\u0010\u0010\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bF\u00109\u001a\u0004\bE\u0010+R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00106\u0012\u0004\bH\u00109\u001a\u0004\bG\u0010#¨\u0006K"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;", "", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", MatchaQrCodeDuxo6.USER_ID_KEY, "state", "Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "response_mode", "", "Lcom/robinhood/idl/serialization/StructSerializer;", "annotations", "locality", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$chatbot_v1_externalRelease", "(Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "component5", "()Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "component6", "()Ljava/util/Map;", "component7", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;Ljava/util/Map;Ljava/lang/String;)Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "getUser_id", "getUser_id$annotations", "getState", "getState$annotations", "Lcom/robinhood/chatbot/proto/v1/ResponseModeDto;", "getResponse_mode", "getResponse_mode$annotations", "Ljava/util/Map;", "getAnnotations", "getAnnotations$annotations", "getLocality", "getLocality$annotations", "Companion", "$serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final Map<String, Object> annotations;
        private final Instant created_at;
        private final String id;
        private final String locality;
        private final ResponseModeDto response_mode;
        private final String state;
        private final String user_id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.ConversationDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (Instant) null, (String) null, (String) null, (ResponseModeDto) null, (Map) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, String str2, String str3, ResponseModeDto responseModeDto, Map map, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                instant = surrogate.created_at;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.user_id;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.state;
            }
            if ((i & 16) != 0) {
                responseModeDto = surrogate.response_mode;
            }
            if ((i & 32) != 0) {
                map = surrogate.annotations;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.locality;
            }
            Map map2 = map;
            String str5 = str4;
            ResponseModeDto responseModeDto2 = responseModeDto;
            String str6 = str2;
            return surrogate.copy(str, instant, str6, str3, responseModeDto2, map2, str5);
        }

        @SerialName("annotations")
        @JsonAnnotations2(names = {"annotations"})
        public static /* synthetic */ void getAnnotations$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("responseMode")
        @JsonAnnotations2(names = {"response_mode"})
        public static /* synthetic */ void getResponse_mode$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUser_id() {
            return this.user_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* renamed from: component5, reason: from getter */
        public final ResponseModeDto getResponse_mode() {
            return this.response_mode;
        }

        public final Map<String, Object> component6() {
            return this.annotations;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        public final Surrogate copy(String id, Instant created_at, String user_id, String state, ResponseModeDto response_mode, Map<String, ? extends Object> annotations, String locality) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(response_mode, "response_mode");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Surrogate(id, created_at, user_id, state, response_mode, annotations, locality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && Intrinsics.areEqual(this.state, surrogate.state) && this.response_mode == surrogate.response_mode && Intrinsics.areEqual(this.annotations, surrogate.annotations) && Intrinsics.areEqual(this.locality, surrogate.locality);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.user_id.hashCode()) * 31) + this.state.hashCode()) * 31) + this.response_mode.hashCode()) * 31;
            Map<String, Object> map = this.annotations;
            return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", created_at=" + this.created_at + ", user_id=" + this.user_id + ", state=" + this.state + ", response_mode=" + this.response_mode + ", annotations=" + this.annotations + ", locality=" + this.locality + ")";
        }

        /* compiled from: ConversationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ConversationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, String str2, String str3, ResponseModeDto responseModeDto, Map map, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 4) == 0) {
                this.user_id = "";
            } else {
                this.user_id = str2;
            }
            if ((i & 8) == 0) {
                this.state = "";
            } else {
                this.state = str3;
            }
            if ((i & 16) == 0) {
                this.response_mode = ResponseModeDto.INSTANCE.getZeroValue();
            } else {
                this.response_mode = responseModeDto;
            }
            if ((i & 32) == 0) {
                this.annotations = null;
            } else {
                this.annotations = map;
            }
            if ((i & 64) == 0) {
                this.locality = "";
            } else {
                this.locality = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.user_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.user_id);
            }
            if (!Intrinsics.areEqual(self.state, "")) {
                output.encodeStringElement(serialDesc, 3, self.state);
            }
            if (self.response_mode != ResponseModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, ResponseModeDto.Serializer.INSTANCE, self.response_mode);
            }
            if (self.annotations != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.annotations);
            }
            if (Intrinsics.areEqual(self.locality, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.locality);
        }

        public Surrogate(String id, Instant instant, String user_id, String state, ResponseModeDto response_mode, Map<String, ? extends Object> map, String locality) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(response_mode, "response_mode");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.id = id;
            this.created_at = instant;
            this.user_id = user_id;
            this.state = state;
            this.response_mode = response_mode;
            this.annotations = map;
            this.locality = locality;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, String str2, String str3, ResponseModeDto responseModeDto, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ResponseModeDto.INSTANCE.getZeroValue() : responseModeDto, (i & 32) != 0 ? null : map, (i & 64) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final String getUser_id() {
            return this.user_id;
        }

        public final String getState() {
            return this.state;
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

    /* compiled from: ConversationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/ConversationDto;", "Lcom/robinhood/chatbot/proto/v1/Conversation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/ConversationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ConversationDto, Conversation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConversationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConversationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConversationDto> getBinaryBase64Serializer() {
            return (KSerializer) ConversationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Conversation> getProtoAdapter() {
            return Conversation.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConversationDto getZeroValue() {
            return ConversationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConversationDto fromProto(Conversation proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ConversationDto(new Surrogate(proto.getId(), proto.getCreated_at(), proto.getUser_id(), proto.getState(), ResponseModeDto.INSTANCE.fromProto(proto.getResponse_mode()), proto.getAnnotations(), proto.getLocality()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.ConversationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ConversationDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ConversationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ConversationDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/ConversationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<ConversationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.Conversation", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ConversationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ConversationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ConversationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ConversationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.ConversationDto";
        }
    }
}
