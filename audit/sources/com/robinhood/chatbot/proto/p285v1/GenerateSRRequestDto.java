package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.GenerateSRRequestDto;
import com.robinhood.chatbot.proto.p285v1.GenerateSRRequestModeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
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

/* compiled from: GenerateSRRequestDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00110\u0011¢\u0006\u0004\b\u0006\u0010\u0012Jd\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00110\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR)\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00110\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Surrogate;)V", "twilio_conversation_id", "", "twilio_message_id", "user_uuid", "response_version", "sf_case_id", "generation_mode", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "triage_context", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/util/Map;)V", "getTwilio_conversation_id", "()Ljava/lang/String;", "getTwilio_message_id", "getUser_uuid", "getResponse_version", "getSf_case_id", "getGeneration_mode", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "getTriage_context", "()Ljava/util/Map;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class GenerateSRRequestDto implements Dto3<GenerateSRRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GenerateSRRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GenerateSRRequestDto, GenerateSRRequest>> binaryBase64Serializer$delegate;
    private static final GenerateSRRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GenerateSRRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GenerateSRRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTwilio_conversation_id() {
        return this.surrogate.getTwilio_conversation_id();
    }

    public final String getTwilio_message_id() {
        return this.surrogate.getTwilio_message_id();
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final String getResponse_version() {
        return this.surrogate.getResponse_version();
    }

    public final String getSf_case_id() {
        return this.surrogate.getSf_case_id();
    }

    public final GenerateSRRequestModeDto getGeneration_mode() {
        return this.surrogate.getGeneration_mode();
    }

    public final Map<String, Map<String, ?>> getTriage_context() {
        return this.surrogate.getTriage_context();
    }

    public /* synthetic */ GenerateSRRequestDto(String str, String str2, String str3, String str4, String str5, GenerateSRRequestModeDto generateSRRequestModeDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? GenerateSRRequestModeDto.INSTANCE.getZeroValue() : generateSRRequestModeDto, (i & 64) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GenerateSRRequestDto(String twilio_conversation_id, String twilio_message_id, String user_uuid, String response_version, String sf_case_id, GenerateSRRequestModeDto generation_mode, Map<String, ? extends Map<String, ?>> triage_context) {
        this(new Surrogate(twilio_conversation_id, twilio_message_id, user_uuid, response_version, sf_case_id, generation_mode, triage_context));
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(triage_context, "triage_context");
    }

    public static /* synthetic */ GenerateSRRequestDto copy$default(GenerateSRRequestDto generateSRRequestDto, String str, String str2, String str3, String str4, String str5, GenerateSRRequestModeDto generateSRRequestModeDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateSRRequestDto.surrogate.getTwilio_conversation_id();
        }
        if ((i & 2) != 0) {
            str2 = generateSRRequestDto.surrogate.getTwilio_message_id();
        }
        if ((i & 4) != 0) {
            str3 = generateSRRequestDto.surrogate.getUser_uuid();
        }
        if ((i & 8) != 0) {
            str4 = generateSRRequestDto.surrogate.getResponse_version();
        }
        if ((i & 16) != 0) {
            str5 = generateSRRequestDto.surrogate.getSf_case_id();
        }
        if ((i & 32) != 0) {
            generateSRRequestModeDto = generateSRRequestDto.surrogate.getGeneration_mode();
        }
        if ((i & 64) != 0) {
            map = generateSRRequestDto.surrogate.getTriage_context();
        }
        GenerateSRRequestModeDto generateSRRequestModeDto2 = generateSRRequestModeDto;
        Map map2 = map;
        String str6 = str5;
        String str7 = str3;
        return generateSRRequestDto.copy(str, str2, str7, str4, str6, generateSRRequestModeDto2, map2);
    }

    public final GenerateSRRequestDto copy(String twilio_conversation_id, String twilio_message_id, String user_uuid, String response_version, String sf_case_id, GenerateSRRequestModeDto generation_mode, Map<String, ? extends Map<String, ?>> triage_context) {
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(triage_context, "triage_context");
        return new GenerateSRRequestDto(new Surrogate(twilio_conversation_id, twilio_message_id, user_uuid, response_version, sf_case_id, generation_mode, triage_context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GenerateSRRequest toProto() {
        String twilio_conversation_id = this.surrogate.getTwilio_conversation_id();
        String twilio_message_id = this.surrogate.getTwilio_message_id();
        String user_uuid = this.surrogate.getUser_uuid();
        String response_version = this.surrogate.getResponse_version();
        String sf_case_id = this.surrogate.getSf_case_id();
        GenerateSRRequestMode generateSRRequestMode = (GenerateSRRequestMode) this.surrogate.getGeneration_mode().toProto();
        Set<Map.Entry<String, Map<String, Object>>> setEntrySet = this.surrogate.getTriage_context().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (Map) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new GenerateSRRequest(twilio_conversation_id, twilio_message_id, user_uuid, response_version, sf_case_id, generateSRRequestMode, linkedHashMap, null, 128, null);
    }

    public String toString() {
        return "[GenerateSRRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GenerateSRRequestDto) && Intrinsics.areEqual(((GenerateSRRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GenerateSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>Bx\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00123\b\u0002\u0010\n\u001a-\u0012\u0004\u0012\u00020\u0003\u0012#\u0012!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b0\u000b¢\u0006\u0004\b\u000f\u0010\u0010B}\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J4\u0010.\u001a-\u0012\u0004\u0012\u00020\u0003\u0012#\u0012!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b0\u000bHÆ\u0003Jz\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t23\b\u0002\u0010\n\u001a-\u0012\u0004\u0012\u00020\u0003\u0012#\u0012!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b0\u000bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$RG\u0010\n\u001a-\u0012\u0004\u0012\u00020\u0003\u0012#\u0012!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'¨\u0006?"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Surrogate;", "", "twilio_conversation_id", "", "twilio_message_id", "user_uuid", "response_version", "sf_case_id", "generation_mode", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "triage_context", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTwilio_conversation_id$annotations", "()V", "getTwilio_conversation_id", "()Ljava/lang/String;", "getTwilio_message_id$annotations", "getTwilio_message_id", "getUser_uuid$annotations", "getUser_uuid", "getResponse_version$annotations", "getResponse_version", "getSf_case_id$annotations", "getSf_case_id", "getGeneration_mode$annotations", "getGeneration_mode", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "getTriage_context$annotations", "getTriage_context", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final GenerateSRRequestModeDto generation_mode;
        private final String response_version;
        private final String sf_case_id;
        private final Map<String, Map<String, Object>> triage_context;
        private final String twilio_conversation_id;
        private final String twilio_message_id;
        private final String user_uuid;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.GenerateSRRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GenerateSRRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (GenerateSRRequestModeDto) null, (Map) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, BuiltinSerializers.getNullable(new LinkedHashMapSerializer(stringSerializer, BuiltinSerializers.getNullable(StructSerializer.INSTANCE))));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, GenerateSRRequestModeDto generateSRRequestModeDto, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.twilio_conversation_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.twilio_message_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.user_uuid;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.response_version;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.sf_case_id;
            }
            if ((i & 32) != 0) {
                generateSRRequestModeDto = surrogate.generation_mode;
            }
            if ((i & 64) != 0) {
                map = surrogate.triage_context;
            }
            GenerateSRRequestModeDto generateSRRequestModeDto2 = generateSRRequestModeDto;
            Map map2 = map;
            String str6 = str5;
            String str7 = str3;
            return surrogate.copy(str, str2, str7, str4, str6, generateSRRequestModeDto2, map2);
        }

        @SerialName("generationMode")
        @JsonAnnotations2(names = {"generation_mode"})
        public static /* synthetic */ void getGeneration_mode$annotations() {
        }

        @SerialName("responseVersion")
        @JsonAnnotations2(names = {"response_version"})
        public static /* synthetic */ void getResponse_version$annotations() {
        }

        @SerialName("sfCaseId")
        @JsonAnnotations2(names = {"sf_case_id"})
        public static /* synthetic */ void getSf_case_id$annotations() {
        }

        @SerialName("triageContext")
        @JsonAnnotations2(names = {"triage_context"})
        public static /* synthetic */ void getTriage_context$annotations() {
        }

        @SerialName("twilioConversationId")
        @JsonAnnotations2(names = {"twilio_conversation_id"})
        public static /* synthetic */ void getTwilio_conversation_id$annotations() {
        }

        @SerialName("twilioMessageId")
        @JsonAnnotations2(names = {"twilio_message_id"})
        public static /* synthetic */ void getTwilio_message_id$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTwilio_conversation_id() {
            return this.twilio_conversation_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTwilio_message_id() {
            return this.twilio_message_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component4, reason: from getter */
        public final String getResponse_version() {
            return this.response_version;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSf_case_id() {
            return this.sf_case_id;
        }

        /* renamed from: component6, reason: from getter */
        public final GenerateSRRequestModeDto getGeneration_mode() {
            return this.generation_mode;
        }

        public final Map<String, Map<String, Object>> component7() {
            return this.triage_context;
        }

        public final Surrogate copy(String twilio_conversation_id, String twilio_message_id, String user_uuid, String response_version, String sf_case_id, GenerateSRRequestModeDto generation_mode, Map<String, ? extends Map<String, ? extends Object>> triage_context) {
            Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
            Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(response_version, "response_version");
            Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
            Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
            Intrinsics.checkNotNullParameter(triage_context, "triage_context");
            return new Surrogate(twilio_conversation_id, twilio_message_id, user_uuid, response_version, sf_case_id, generation_mode, triage_context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.twilio_conversation_id, surrogate.twilio_conversation_id) && Intrinsics.areEqual(this.twilio_message_id, surrogate.twilio_message_id) && Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && Intrinsics.areEqual(this.response_version, surrogate.response_version) && Intrinsics.areEqual(this.sf_case_id, surrogate.sf_case_id) && this.generation_mode == surrogate.generation_mode && Intrinsics.areEqual(this.triage_context, surrogate.triage_context);
        }

        public int hashCode() {
            return (((((((((((this.twilio_conversation_id.hashCode() * 31) + this.twilio_message_id.hashCode()) * 31) + this.user_uuid.hashCode()) * 31) + this.response_version.hashCode()) * 31) + this.sf_case_id.hashCode()) * 31) + this.generation_mode.hashCode()) * 31) + this.triage_context.hashCode();
        }

        public String toString() {
            return "Surrogate(twilio_conversation_id=" + this.twilio_conversation_id + ", twilio_message_id=" + this.twilio_message_id + ", user_uuid=" + this.user_uuid + ", response_version=" + this.response_version + ", sf_case_id=" + this.sf_case_id + ", generation_mode=" + this.generation_mode + ", triage_context=" + this.triage_context + ")";
        }

        /* compiled from: GenerateSRRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GenerateSRRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, GenerateSRRequestModeDto generateSRRequestModeDto, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.twilio_conversation_id = "";
            } else {
                this.twilio_conversation_id = str;
            }
            if ((i & 2) == 0) {
                this.twilio_message_id = "";
            } else {
                this.twilio_message_id = str2;
            }
            if ((i & 4) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str3;
            }
            if ((i & 8) == 0) {
                this.response_version = "";
            } else {
                this.response_version = str4;
            }
            if ((i & 16) == 0) {
                this.sf_case_id = "";
            } else {
                this.sf_case_id = str5;
            }
            if ((i & 32) == 0) {
                this.generation_mode = GenerateSRRequestModeDto.INSTANCE.getZeroValue();
            } else {
                this.generation_mode = generateSRRequestModeDto;
            }
            if ((i & 64) == 0) {
                this.triage_context = MapsKt.emptyMap();
            } else {
                this.triage_context = map;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.twilio_conversation_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.twilio_conversation_id);
            }
            if (!Intrinsics.areEqual(self.twilio_message_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.twilio_message_id);
            }
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 2, self.user_uuid);
            }
            if (!Intrinsics.areEqual(self.response_version, "")) {
                output.encodeStringElement(serialDesc, 3, self.response_version);
            }
            if (!Intrinsics.areEqual(self.sf_case_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.sf_case_id);
            }
            if (self.generation_mode != GenerateSRRequestModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, GenerateSRRequestModeDto.Serializer.INSTANCE, self.generation_mode);
            }
            if (Intrinsics.areEqual(self.triage_context, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.triage_context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String twilio_conversation_id, String twilio_message_id, String user_uuid, String response_version, String sf_case_id, GenerateSRRequestModeDto generation_mode, Map<String, ? extends Map<String, ? extends Object>> triage_context) {
            Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
            Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(response_version, "response_version");
            Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
            Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
            Intrinsics.checkNotNullParameter(triage_context, "triage_context");
            this.twilio_conversation_id = twilio_conversation_id;
            this.twilio_message_id = twilio_message_id;
            this.user_uuid = user_uuid;
            this.response_version = response_version;
            this.sf_case_id = sf_case_id;
            this.generation_mode = generation_mode;
            this.triage_context = triage_context;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, GenerateSRRequestModeDto generateSRRequestModeDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? GenerateSRRequestModeDto.INSTANCE.getZeroValue() : generateSRRequestModeDto, (i & 64) != 0 ? MapsKt.emptyMap() : map);
        }

        public final String getTwilio_conversation_id() {
            return this.twilio_conversation_id;
        }

        public final String getTwilio_message_id() {
            return this.twilio_message_id;
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final String getResponse_version() {
            return this.response_version;
        }

        public final String getSf_case_id() {
            return this.sf_case_id;
        }

        public final GenerateSRRequestModeDto getGeneration_mode() {
            return this.generation_mode;
        }

        public final Map<String, Map<String, Object>> getTriage_context() {
            return this.triage_context;
        }
    }

    /* compiled from: GenerateSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GenerateSRRequestDto, GenerateSRRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GenerateSRRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GenerateSRRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GenerateSRRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GenerateSRRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GenerateSRRequest> getProtoAdapter() {
            return GenerateSRRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GenerateSRRequestDto getZeroValue() {
            return GenerateSRRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GenerateSRRequestDto fromProto(GenerateSRRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String twilio_conversation_id = proto.getTwilio_conversation_id();
            String twilio_message_id = proto.getTwilio_message_id();
            String user_uuid = proto.getUser_uuid();
            String response_version = proto.getResponse_version();
            String sf_case_id = proto.getSf_case_id();
            GenerateSRRequestModeDto generateSRRequestModeDtoFromProto = GenerateSRRequestModeDto.INSTANCE.fromProto(proto.getGeneration_mode());
            Set<Map.Entry<String, Map<String, ?>>> setEntrySet = proto.getTriage_context().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (Map) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new GenerateSRRequestDto(new Surrogate(twilio_conversation_id, twilio_message_id, user_uuid, response_version, sf_case_id, generateSRRequestModeDtoFromProto, linkedHashMap), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.GenerateSRRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GenerateSRRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GenerateSRRequestDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GenerateSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<GenerateSRRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.GenerateSRRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GenerateSRRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GenerateSRRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GenerateSRRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GenerateSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.GenerateSRRequestDto";
        }
    }
}
