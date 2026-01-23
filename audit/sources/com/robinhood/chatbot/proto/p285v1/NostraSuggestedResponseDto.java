package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.GenerateSRRequestModeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: NostraSuggestedResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bu\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0017Jy\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u0010$R\u0019\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001d¨\u0006="}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;)V", "", "twilio_conversation_id", "twilio_message_id", "suggested_text", "status", "", "attempt", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "response_mode", "response_version", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "generation_mode", "reference_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/lang/String;)Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto;", "toProto", "()Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;", "getTwilio_conversation_id", "getTwilio_message_id", "getSuggested_text", "getStatus", "getAttempt", "getLast_updated_at", "()Lj$/time/Instant;", "getResponse_mode", "getResponse_version", "getGeneration_mode", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "getReference_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class NostraSuggestedResponseDto implements Dto3<NostraSuggestedResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NostraSuggestedResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NostraSuggestedResponseDto, NostraSuggestedResponse>> binaryBase64Serializer$delegate;
    private static final NostraSuggestedResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NostraSuggestedResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NostraSuggestedResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTwilio_conversation_id() {
        return this.surrogate.getTwilio_conversation_id();
    }

    public final String getTwilio_message_id() {
        return this.surrogate.getTwilio_message_id();
    }

    public final String getSuggested_text() {
        return this.surrogate.getSuggested_text();
    }

    public final String getStatus() {
        return this.surrogate.getStatus();
    }

    public final int getAttempt() {
        return this.surrogate.getAttempt();
    }

    public final Instant getLast_updated_at() {
        return this.surrogate.getLast_updated_at();
    }

    public final String getResponse_mode() {
        return this.surrogate.getResponse_mode();
    }

    public final String getResponse_version() {
        return this.surrogate.getResponse_version();
    }

    public final GenerateSRRequestModeDto getGeneration_mode() {
        return this.surrogate.getGeneration_mode();
    }

    public final String getReference_id() {
        return this.surrogate.getReference_id();
    }

    public /* synthetic */ NostraSuggestedResponseDto(String str, String str2, String str3, String str4, int i, Instant instant, String str5, String str6, GenerateSRRequestModeDto generateSRRequestModeDto, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : instant, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? GenerateSRRequestModeDto.INSTANCE.getZeroValue() : generateSRRequestModeDto, (i2 & 512) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NostraSuggestedResponseDto(String twilio_conversation_id, String twilio_message_id, String suggested_text, String status, int i, Instant instant, String response_mode, String response_version, GenerateSRRequestModeDto generation_mode, String reference_id) {
        this(new Surrogate(twilio_conversation_id, twilio_message_id, suggested_text, status, i, instant, response_mode, response_version, generation_mode, reference_id));
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(suggested_text, "suggested_text");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
    }

    public static /* synthetic */ NostraSuggestedResponseDto copy$default(NostraSuggestedResponseDto nostraSuggestedResponseDto, String str, String str2, String str3, String str4, int i, Instant instant, String str5, String str6, GenerateSRRequestModeDto generateSRRequestModeDto, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = nostraSuggestedResponseDto.surrogate.getTwilio_conversation_id();
        }
        if ((i2 & 2) != 0) {
            str2 = nostraSuggestedResponseDto.surrogate.getTwilio_message_id();
        }
        if ((i2 & 4) != 0) {
            str3 = nostraSuggestedResponseDto.surrogate.getSuggested_text();
        }
        if ((i2 & 8) != 0) {
            str4 = nostraSuggestedResponseDto.surrogate.getStatus();
        }
        if ((i2 & 16) != 0) {
            i = nostraSuggestedResponseDto.surrogate.getAttempt();
        }
        if ((i2 & 32) != 0) {
            instant = nostraSuggestedResponseDto.surrogate.getLast_updated_at();
        }
        if ((i2 & 64) != 0) {
            str5 = nostraSuggestedResponseDto.surrogate.getResponse_mode();
        }
        if ((i2 & 128) != 0) {
            str6 = nostraSuggestedResponseDto.surrogate.getResponse_version();
        }
        if ((i2 & 256) != 0) {
            generateSRRequestModeDto = nostraSuggestedResponseDto.surrogate.getGeneration_mode();
        }
        if ((i2 & 512) != 0) {
            str7 = nostraSuggestedResponseDto.surrogate.getReference_id();
        }
        GenerateSRRequestModeDto generateSRRequestModeDto2 = generateSRRequestModeDto;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        int i3 = i;
        Instant instant2 = instant;
        return nostraSuggestedResponseDto.copy(str, str2, str3, str4, i3, instant2, str9, str10, generateSRRequestModeDto2, str8);
    }

    public final NostraSuggestedResponseDto copy(String twilio_conversation_id, String twilio_message_id, String suggested_text, String status, int attempt, Instant last_updated_at, String response_mode, String response_version, GenerateSRRequestModeDto generation_mode, String reference_id) {
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(suggested_text, "suggested_text");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        return new NostraSuggestedResponseDto(new Surrogate(twilio_conversation_id, twilio_message_id, suggested_text, status, attempt, last_updated_at, response_mode, response_version, generation_mode, reference_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NostraSuggestedResponse toProto() {
        return new NostraSuggestedResponse(this.surrogate.getTwilio_conversation_id(), this.surrogate.getTwilio_message_id(), this.surrogate.getSuggested_text(), this.surrogate.getStatus(), this.surrogate.getAttempt(), this.surrogate.getLast_updated_at(), this.surrogate.getResponse_mode(), this.surrogate.getResponse_version(), (GenerateSRRequestMode) this.surrogate.getGeneration_mode().toProto(), this.surrogate.getReference_id(), null, 1024, null);
    }

    public String toString() {
        return "[NostraSuggestedResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NostraSuggestedResponseDto) && Intrinsics.areEqual(((NostraSuggestedResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: NostraSuggestedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002TSB \u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u001f\u0010)\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b)\u0010*J6\u0010+\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J©\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2.\b\u0002\u0010\u000f\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010%J\u0010\u00105\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b5\u0010*J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\bA\u0010=\u001a\u0004\b@\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010%R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010*RF\u0010\u000f\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bI\u0010=\u001a\u0004\bH\u0010,R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u0010%R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\bM\u0010=\u001a\u0004\bL\u0010%R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010N\u0012\u0004\bP\u0010=\u001a\u0004\bO\u00100R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010:\u0012\u0004\bR\u0010=\u001a\u0004\bQ\u0010%¨\u0006U"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;", "", "", "twilio_conversation_id", "twilio_message_id", "suggested_text", "status", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "attempt", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_updated_at", "response_mode", "response_version", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "generation_mode", "reference_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$chatbot_v1_externalRelease", "(Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "()Lj$/time/Instant;", "component7", "component8", "component9", "()Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;Ljava/lang/String;)Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTwilio_conversation_id", "getTwilio_conversation_id$annotations", "()V", "getTwilio_message_id", "getTwilio_message_id$annotations", "getSuggested_text", "getSuggested_text$annotations", "getStatus", "getStatus$annotations", "I", "getAttempt", "getAttempt$annotations", "Lj$/time/Instant;", "getLast_updated_at", "getLast_updated_at$annotations", "getResponse_mode", "getResponse_mode$annotations", "getResponse_version", "getResponse_version$annotations", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestModeDto;", "getGeneration_mode", "getGeneration_mode$annotations", "getReference_id", "getReference_id$annotations", "Companion", "$serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int attempt;
        private final GenerateSRRequestModeDto generation_mode;
        private final Instant last_updated_at;
        private final String reference_id;
        private final String response_mode;
        private final String response_version;
        private final String status;
        private final String suggested_text;
        private final String twilio_conversation_id;
        private final String twilio_message_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 0, (Instant) null, (String) null, (String) null, (GenerateSRRequestModeDto) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, int i, Instant instant, String str5, String str6, GenerateSRRequestModeDto generateSRRequestModeDto, String str7, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.twilio_conversation_id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.twilio_message_id;
            }
            if ((i2 & 4) != 0) {
                str3 = surrogate.suggested_text;
            }
            if ((i2 & 8) != 0) {
                str4 = surrogate.status;
            }
            if ((i2 & 16) != 0) {
                i = surrogate.attempt;
            }
            if ((i2 & 32) != 0) {
                instant = surrogate.last_updated_at;
            }
            if ((i2 & 64) != 0) {
                str5 = surrogate.response_mode;
            }
            if ((i2 & 128) != 0) {
                str6 = surrogate.response_version;
            }
            if ((i2 & 256) != 0) {
                generateSRRequestModeDto = surrogate.generation_mode;
            }
            if ((i2 & 512) != 0) {
                str7 = surrogate.reference_id;
            }
            GenerateSRRequestModeDto generateSRRequestModeDto2 = generateSRRequestModeDto;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            int i3 = i;
            Instant instant2 = instant;
            return surrogate.copy(str, str2, str3, str4, i3, instant2, str9, str10, generateSRRequestModeDto2, str8);
        }

        @SerialName("attempt")
        @JsonAnnotations2(names = {"attempt"})
        public static /* synthetic */ void getAttempt$annotations() {
        }

        @SerialName("generationMode")
        @JsonAnnotations2(names = {"generation_mode"})
        public static /* synthetic */ void getGeneration_mode$annotations() {
        }

        @SerialName("lastUpdatedAt")
        @JsonAnnotations2(names = {"last_updated_at"})
        public static /* synthetic */ void getLast_updated_at$annotations() {
        }

        @SerialName("referenceId")
        @JsonAnnotations2(names = {"reference_id"})
        public static /* synthetic */ void getReference_id$annotations() {
        }

        @SerialName("responseMode")
        @JsonAnnotations2(names = {"response_mode"})
        public static /* synthetic */ void getResponse_mode$annotations() {
        }

        @SerialName("responseVersion")
        @JsonAnnotations2(names = {"response_version"})
        public static /* synthetic */ void getResponse_version$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("suggestedText")
        @JsonAnnotations2(names = {"suggested_text"})
        public static /* synthetic */ void getSuggested_text$annotations() {
        }

        @SerialName("twilioConversationId")
        @JsonAnnotations2(names = {"twilio_conversation_id"})
        public static /* synthetic */ void getTwilio_conversation_id$annotations() {
        }

        @SerialName("twilioMessageId")
        @JsonAnnotations2(names = {"twilio_message_id"})
        public static /* synthetic */ void getTwilio_message_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTwilio_conversation_id() {
            return this.twilio_conversation_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getReference_id() {
            return this.reference_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTwilio_message_id() {
            return this.twilio_message_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSuggested_text() {
            return this.suggested_text;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final int getAttempt() {
            return this.attempt;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        /* renamed from: component7, reason: from getter */
        public final String getResponse_mode() {
            return this.response_mode;
        }

        /* renamed from: component8, reason: from getter */
        public final String getResponse_version() {
            return this.response_version;
        }

        /* renamed from: component9, reason: from getter */
        public final GenerateSRRequestModeDto getGeneration_mode() {
            return this.generation_mode;
        }

        public final Surrogate copy(String twilio_conversation_id, String twilio_message_id, String suggested_text, String status, int attempt, Instant last_updated_at, String response_mode, String response_version, GenerateSRRequestModeDto generation_mode, String reference_id) {
            Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
            Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
            Intrinsics.checkNotNullParameter(suggested_text, "suggested_text");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response_mode, "response_mode");
            Intrinsics.checkNotNullParameter(response_version, "response_version");
            Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            return new Surrogate(twilio_conversation_id, twilio_message_id, suggested_text, status, attempt, last_updated_at, response_mode, response_version, generation_mode, reference_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.twilio_conversation_id, surrogate.twilio_conversation_id) && Intrinsics.areEqual(this.twilio_message_id, surrogate.twilio_message_id) && Intrinsics.areEqual(this.suggested_text, surrogate.suggested_text) && Intrinsics.areEqual(this.status, surrogate.status) && this.attempt == surrogate.attempt && Intrinsics.areEqual(this.last_updated_at, surrogate.last_updated_at) && Intrinsics.areEqual(this.response_mode, surrogate.response_mode) && Intrinsics.areEqual(this.response_version, surrogate.response_version) && this.generation_mode == surrogate.generation_mode && Intrinsics.areEqual(this.reference_id, surrogate.reference_id);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.twilio_conversation_id.hashCode() * 31) + this.twilio_message_id.hashCode()) * 31) + this.suggested_text.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.attempt)) * 31;
            Instant instant = this.last_updated_at;
            return ((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.response_mode.hashCode()) * 31) + this.response_version.hashCode()) * 31) + this.generation_mode.hashCode()) * 31) + this.reference_id.hashCode();
        }

        public String toString() {
            return "Surrogate(twilio_conversation_id=" + this.twilio_conversation_id + ", twilio_message_id=" + this.twilio_message_id + ", suggested_text=" + this.suggested_text + ", status=" + this.status + ", attempt=" + this.attempt + ", last_updated_at=" + this.last_updated_at + ", response_mode=" + this.response_mode + ", response_version=" + this.response_version + ", generation_mode=" + this.generation_mode + ", reference_id=" + this.reference_id + ")";
        }

        /* compiled from: NostraSuggestedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NostraSuggestedResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, int i2, Instant instant, String str5, String str6, GenerateSRRequestModeDto generateSRRequestModeDto, String str7, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.suggested_text = "";
            } else {
                this.suggested_text = str3;
            }
            if ((i & 8) == 0) {
                this.status = "";
            } else {
                this.status = str4;
            }
            if ((i & 16) == 0) {
                this.attempt = 0;
            } else {
                this.attempt = i2;
            }
            if ((i & 32) == 0) {
                this.last_updated_at = null;
            } else {
                this.last_updated_at = instant;
            }
            if ((i & 64) == 0) {
                this.response_mode = "";
            } else {
                this.response_mode = str5;
            }
            if ((i & 128) == 0) {
                this.response_version = "";
            } else {
                this.response_version = str6;
            }
            if ((i & 256) == 0) {
                this.generation_mode = GenerateSRRequestModeDto.INSTANCE.getZeroValue();
            } else {
                this.generation_mode = generateSRRequestModeDto;
            }
            if ((i & 512) == 0) {
                this.reference_id = "";
            } else {
                this.reference_id = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.twilio_conversation_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.twilio_conversation_id);
            }
            if (!Intrinsics.areEqual(self.twilio_message_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.twilio_message_id);
            }
            if (!Intrinsics.areEqual(self.suggested_text, "")) {
                output.encodeStringElement(serialDesc, 2, self.suggested_text);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 3, self.status);
            }
            int i = self.attempt;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            Instant instant = self.last_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.response_mode, "")) {
                output.encodeStringElement(serialDesc, 6, self.response_mode);
            }
            if (!Intrinsics.areEqual(self.response_version, "")) {
                output.encodeStringElement(serialDesc, 7, self.response_version);
            }
            if (self.generation_mode != GenerateSRRequestModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, GenerateSRRequestModeDto.Serializer.INSTANCE, self.generation_mode);
            }
            if (Intrinsics.areEqual(self.reference_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.reference_id);
        }

        public Surrogate(String twilio_conversation_id, String twilio_message_id, String suggested_text, String status, int i, Instant instant, String response_mode, String response_version, GenerateSRRequestModeDto generation_mode, String reference_id) {
            Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
            Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
            Intrinsics.checkNotNullParameter(suggested_text, "suggested_text");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(response_mode, "response_mode");
            Intrinsics.checkNotNullParameter(response_version, "response_version");
            Intrinsics.checkNotNullParameter(generation_mode, "generation_mode");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            this.twilio_conversation_id = twilio_conversation_id;
            this.twilio_message_id = twilio_message_id;
            this.suggested_text = suggested_text;
            this.status = status;
            this.attempt = i;
            this.last_updated_at = instant;
            this.response_mode = response_mode;
            this.response_version = response_version;
            this.generation_mode = generation_mode;
            this.reference_id = reference_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, int i, Instant instant, String str5, String str6, GenerateSRRequestModeDto generateSRRequestModeDto, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : instant, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? GenerateSRRequestModeDto.INSTANCE.getZeroValue() : generateSRRequestModeDto, (i2 & 512) != 0 ? "" : str7);
        }

        public final String getTwilio_conversation_id() {
            return this.twilio_conversation_id;
        }

        public final String getTwilio_message_id() {
            return this.twilio_message_id;
        }

        public final String getSuggested_text() {
            return this.suggested_text;
        }

        public final String getStatus() {
            return this.status;
        }

        public final int getAttempt() {
            return this.attempt;
        }

        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        public final String getResponse_mode() {
            return this.response_mode;
        }

        public final String getResponse_version() {
            return this.response_version;
        }

        public final GenerateSRRequestModeDto getGeneration_mode() {
            return this.generation_mode;
        }

        public final String getReference_id() {
            return this.reference_id;
        }
    }

    /* compiled from: NostraSuggestedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NostraSuggestedResponseDto, NostraSuggestedResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NostraSuggestedResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NostraSuggestedResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NostraSuggestedResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) NostraSuggestedResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NostraSuggestedResponse> getProtoAdapter() {
            return NostraSuggestedResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NostraSuggestedResponseDto getZeroValue() {
            return NostraSuggestedResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NostraSuggestedResponseDto fromProto(NostraSuggestedResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NostraSuggestedResponseDto(new Surrogate(proto.getTwilio_conversation_id(), proto.getTwilio_message_id(), proto.getSuggested_text(), proto.getStatus(), proto.getAttempt(), proto.getLast_updated_at(), proto.getResponse_mode(), proto.getResponse_version(), GenerateSRRequestModeDto.INSTANCE.fromProto(proto.getGeneration_mode()), proto.getReference_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.NostraSuggestedResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NostraSuggestedResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NostraSuggestedResponseDto(null, null, null, null, 0, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NostraSuggestedResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<NostraSuggestedResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.NostraSuggestedResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NostraSuggestedResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NostraSuggestedResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NostraSuggestedResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NostraSuggestedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.NostraSuggestedResponseDto";
        }
    }
}
