package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.copilot.proto.p286v1.FeedbackTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: GetFeedbackRequestDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0012JY\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0018¨\u00065"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequest;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;)V", "", "instrument_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "feedback_timestamp", "composite_feedback_id", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetFeedbackRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;", "getInstrument_id", "getUser_id", "getType", "()Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;", "getGeneration_timestamp", "()Lj$/time/Instant;", "getFeedback_timestamp", "getComposite_feedback_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetFeedbackRequestDto implements Dto3<GetFeedbackRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetFeedbackRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetFeedbackRequestDto, GetFeedbackRequest>> binaryBase64Serializer$delegate;
    private static final GetFeedbackRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetFeedbackRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetFeedbackRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final FeedbackTypeDto getType() {
        return this.surrogate.getType();
    }

    public final Instant getGeneration_timestamp() {
        return this.surrogate.getGeneration_timestamp();
    }

    public final Instant getFeedback_timestamp() {
        return this.surrogate.getFeedback_timestamp();
    }

    public final String getComposite_feedback_id() {
        return this.surrogate.getComposite_feedback_id();
    }

    public /* synthetic */ GetFeedbackRequestDto(String str, String str2, FeedbackTypeDto feedbackTypeDto, Instant instant, Instant instant2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? FeedbackTypeDto.INSTANCE.getZeroValue() : feedbackTypeDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetFeedbackRequestDto(String instrument_id, String user_id, FeedbackTypeDto type2, Instant instant, Instant instant2, String composite_feedback_id) {
        this(new Surrogate(instrument_id, user_id, type2, instant, instant2, composite_feedback_id));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
    }

    public static /* synthetic */ GetFeedbackRequestDto copy$default(GetFeedbackRequestDto getFeedbackRequestDto, String str, String str2, FeedbackTypeDto feedbackTypeDto, Instant instant, Instant instant2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFeedbackRequestDto.surrogate.getInstrument_id();
        }
        if ((i & 2) != 0) {
            str2 = getFeedbackRequestDto.surrogate.getUser_id();
        }
        if ((i & 4) != 0) {
            feedbackTypeDto = getFeedbackRequestDto.surrogate.getType();
        }
        if ((i & 8) != 0) {
            instant = getFeedbackRequestDto.surrogate.getGeneration_timestamp();
        }
        if ((i & 16) != 0) {
            instant2 = getFeedbackRequestDto.surrogate.getFeedback_timestamp();
        }
        if ((i & 32) != 0) {
            str3 = getFeedbackRequestDto.surrogate.getComposite_feedback_id();
        }
        Instant instant3 = instant2;
        String str4 = str3;
        return getFeedbackRequestDto.copy(str, str2, feedbackTypeDto, instant, instant3, str4);
    }

    public final GetFeedbackRequestDto copy(String instrument_id, String user_id, FeedbackTypeDto type2, Instant generation_timestamp, Instant feedback_timestamp, String composite_feedback_id) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        return new GetFeedbackRequestDto(new Surrogate(instrument_id, user_id, type2, generation_timestamp, feedback_timestamp, composite_feedback_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetFeedbackRequest toProto() {
        return new GetFeedbackRequest(this.surrogate.getInstrument_id(), this.surrogate.getUser_id(), (FeedbackType) this.surrogate.getType().toProto(), this.surrogate.getGeneration_timestamp(), this.surrogate.getFeedback_timestamp(), this.surrogate.getComposite_feedback_id(), null, 64, null);
    }

    public String toString() {
        return "[GetFeedbackRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetFeedbackRequestDto) && Intrinsics.areEqual(((GetFeedbackRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetFeedbackRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BAB\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010BW\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J6\u0010&\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0098\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2.\b\u0002\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010#RF\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010%RF\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010%R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00101\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010 ¨\u0006C"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;", "", "", "instrument_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "generation_timestamp", "feedback_timestamp", "composite_feedback_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;", "component4", "()Lj$/time/Instant;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "getUser_id", "getUser_id$annotations", "Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;", "getType", "getType$annotations", "Lj$/time/Instant;", "getGeneration_timestamp", "getGeneration_timestamp$annotations", "getFeedback_timestamp", "getFeedback_timestamp$annotations", "getComposite_feedback_id", "getComposite_feedback_id$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String composite_feedback_id;
        private final Instant feedback_timestamp;
        private final Instant generation_timestamp;
        private final String instrument_id;
        private final FeedbackTypeDto type;
        private final String user_id;

        public Surrogate() {
            this((String) null, (String) null, (FeedbackTypeDto) null, (Instant) null, (Instant) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, FeedbackTypeDto feedbackTypeDto, Instant instant, Instant instant2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.instrument_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.user_id;
            }
            if ((i & 4) != 0) {
                feedbackTypeDto = surrogate.type;
            }
            if ((i & 8) != 0) {
                instant = surrogate.generation_timestamp;
            }
            if ((i & 16) != 0) {
                instant2 = surrogate.feedback_timestamp;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.composite_feedback_id;
            }
            Instant instant3 = instant2;
            String str4 = str3;
            return surrogate.copy(str, str2, feedbackTypeDto, instant, instant3, str4);
        }

        @SerialName("compositeFeedbackId")
        @JsonAnnotations2(names = {"composite_feedback_id"})
        public static /* synthetic */ void getComposite_feedback_id$annotations() {
        }

        @SerialName("feedbackTimestamp")
        @JsonAnnotations2(names = {"feedback_timestamp"})
        public static /* synthetic */ void getFeedback_timestamp$annotations() {
        }

        @SerialName("generationTimestamp")
        @JsonAnnotations2(names = {"generation_timestamp"})
        public static /* synthetic */ void getGeneration_timestamp$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUser_id() {
            return this.user_id;
        }

        /* renamed from: component3, reason: from getter */
        public final FeedbackTypeDto getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getGeneration_timestamp() {
            return this.generation_timestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getFeedback_timestamp() {
            return this.feedback_timestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final String getComposite_feedback_id() {
            return this.composite_feedback_id;
        }

        public final Surrogate copy(String instrument_id, String user_id, FeedbackTypeDto type2, Instant generation_timestamp, Instant feedback_timestamp, String composite_feedback_id) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
            return new Surrogate(instrument_id, user_id, type2, generation_timestamp, feedback_timestamp, composite_feedback_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && this.type == surrogate.type && Intrinsics.areEqual(this.generation_timestamp, surrogate.generation_timestamp) && Intrinsics.areEqual(this.feedback_timestamp, surrogate.feedback_timestamp) && Intrinsics.areEqual(this.composite_feedback_id, surrogate.composite_feedback_id);
        }

        public int hashCode() {
            int iHashCode = ((((this.instrument_id.hashCode() * 31) + this.user_id.hashCode()) * 31) + this.type.hashCode()) * 31;
            Instant instant = this.generation_timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.feedback_timestamp;
            return ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.composite_feedback_id.hashCode();
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", user_id=" + this.user_id + ", type=" + this.type + ", generation_timestamp=" + this.generation_timestamp + ", feedback_timestamp=" + this.feedback_timestamp + ", composite_feedback_id=" + this.composite_feedback_id + ")";
        }

        /* compiled from: GetFeedbackRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetFeedbackRequestDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, FeedbackTypeDto feedbackTypeDto, Instant instant, Instant instant2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 2) == 0) {
                this.user_id = "";
            } else {
                this.user_id = str2;
            }
            if ((i & 4) == 0) {
                this.type = FeedbackTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = feedbackTypeDto;
            }
            if ((i & 8) == 0) {
                this.generation_timestamp = null;
            } else {
                this.generation_timestamp = instant;
            }
            if ((i & 16) == 0) {
                this.feedback_timestamp = null;
            } else {
                this.feedback_timestamp = instant2;
            }
            if ((i & 32) == 0) {
                this.composite_feedback_id = "";
            } else {
                this.composite_feedback_id = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.user_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.user_id);
            }
            if (self.type != FeedbackTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, FeedbackTypeDto.Serializer.INSTANCE, self.type);
            }
            Instant instant = self.generation_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.feedback_timestamp;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant2);
            }
            if (Intrinsics.areEqual(self.composite_feedback_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.composite_feedback_id);
        }

        public Surrogate(String instrument_id, String user_id, FeedbackTypeDto type2, Instant instant, Instant instant2, String composite_feedback_id) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
            this.instrument_id = instrument_id;
            this.user_id = user_id;
            this.type = type2;
            this.generation_timestamp = instant;
            this.feedback_timestamp = instant2;
            this.composite_feedback_id = composite_feedback_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, FeedbackTypeDto feedbackTypeDto, Instant instant, Instant instant2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? FeedbackTypeDto.INSTANCE.getZeroValue() : feedbackTypeDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? "" : str3);
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getUser_id() {
            return this.user_id;
        }

        public final FeedbackTypeDto getType() {
            return this.type;
        }

        public final Instant getGeneration_timestamp() {
            return this.generation_timestamp;
        }

        public final Instant getFeedback_timestamp() {
            return this.feedback_timestamp;
        }

        public final String getComposite_feedback_id() {
            return this.composite_feedback_id;
        }
    }

    /* compiled from: GetFeedbackRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetFeedbackRequestDto, GetFeedbackRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFeedbackRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFeedbackRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFeedbackRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetFeedbackRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetFeedbackRequest> getProtoAdapter() {
            return GetFeedbackRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFeedbackRequestDto getZeroValue() {
            return GetFeedbackRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFeedbackRequestDto fromProto(GetFeedbackRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetFeedbackRequestDto(new Surrogate(proto.getInstrument_id(), proto.getUser_id(), FeedbackTypeDto.INSTANCE.fromProto(proto.getType()), proto.getGeneration_timestamp(), proto.getFeedback_timestamp(), proto.getComposite_feedback_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetFeedbackRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFeedbackRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetFeedbackRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetFeedbackRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetFeedbackRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetFeedbackRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetFeedbackRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetFeedbackRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetFeedbackRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetFeedbackRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetFeedbackRequestDto";
        }
    }
}
