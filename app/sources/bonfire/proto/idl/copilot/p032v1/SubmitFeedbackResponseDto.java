package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.FeedbackReactionDto;
import bonfire.proto.idl.copilot.p032v1.FeedbackReasonDto;
import bonfire.proto.idl.copilot.p032v1.InstrumentTypeDto;
import bonfire.proto.idl.copilot.p032v1.SubmitFeedbackResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: SubmitFeedbackResponseDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00066"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;)V", "", "digest_id", "Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "feedback_reaction", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReasonDto;", "like_reasons", "dislike_reasons", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "feedback_timestamp", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "instrument_type", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;", "getDigest_id", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "getLike_reasons", "()Ljava/util/List;", "getDislike_reasons", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class SubmitFeedbackResponseDto implements Dto3<SubmitFeedbackResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubmitFeedbackResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubmitFeedbackResponseDto, SubmitFeedbackResponse>> binaryBase64Serializer$delegate;
    private static final SubmitFeedbackResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubmitFeedbackResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubmitFeedbackResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDigest_id() {
        return this.surrogate.getDigest_id();
    }

    public final FeedbackReactionDto getFeedback_reaction() {
        return this.surrogate.getFeedback_reaction();
    }

    public final List<FeedbackReasonDto> getLike_reasons() {
        return this.surrogate.getLike_reasons();
    }

    public final List<FeedbackReasonDto> getDislike_reasons() {
        return this.surrogate.getDislike_reasons();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public /* synthetic */ SubmitFeedbackResponseDto(String str, FeedbackReactionDto feedbackReactionDto, List list, List list2, Instant instant, InstrumentTypeDto instrumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? FeedbackReactionDto.INSTANCE.getZeroValue() : feedbackReactionDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubmitFeedbackResponseDto(String digest_id, FeedbackReactionDto feedback_reaction, List<FeedbackReasonDto> like_reasons, List<FeedbackReasonDto> dislike_reasons, Instant instant, InstrumentTypeDto instrument_type) {
        this(new Surrogate(digest_id, feedback_reaction, like_reasons, dislike_reasons, instant, instrument_type));
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubmitFeedbackResponse toProto() {
        String digest_id = this.surrogate.getDigest_id();
        FeedbackReaction feedbackReaction = (FeedbackReaction) this.surrogate.getFeedback_reaction().toProto();
        List<FeedbackReasonDto> like_reasons = this.surrogate.getLike_reasons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(like_reasons, 10));
        Iterator<T> it = like_reasons.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeedbackReasonDto) it.next()).toProto());
        }
        List<FeedbackReasonDto> dislike_reasons = this.surrogate.getDislike_reasons();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dislike_reasons, 10));
        Iterator<T> it2 = dislike_reasons.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeedbackReasonDto) it2.next()).toProto());
        }
        return new SubmitFeedbackResponse(digest_id, feedbackReaction, arrayList, arrayList2, this.surrogate.getFeedback_timestamp(), (InstrumentType) this.surrogate.getInstrument_type().toProto(), null, 64, null);
    }

    public String toString() {
        return "[SubmitFeedbackResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubmitFeedbackResponseDto) && Intrinsics.areEqual(((SubmitFeedbackResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubmitFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bc\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00104RF\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;", "", "", "digest_id", "Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "feedback_reaction", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReasonDto;", "like_reasons", "dislike_reasons", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "feedback_timestamp", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "instrument_type", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDigest_id", "getDigest_id$annotations", "()V", "Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "getFeedback_reaction$annotations", "Ljava/util/List;", "getLike_reasons", "()Ljava/util/List;", "getLike_reasons$annotations", "getDislike_reasons", "getDislike_reasons$annotations", "Lj$/time/Instant;", "getFeedback_timestamp", "()Lj$/time/Instant;", "getFeedback_timestamp$annotations", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "getInstrument_type$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String digest_id;
        private final List<FeedbackReasonDto> dislike_reasons;
        private final FeedbackReactionDto feedback_reaction;
        private final Instant feedback_timestamp;
        private final InstrumentTypeDto instrument_type;
        private final List<FeedbackReasonDto> like_reasons;

        public Surrogate() {
            this((String) null, (FeedbackReactionDto) null, (List) null, (List) null, (Instant) null, (InstrumentTypeDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FeedbackReasonDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(FeedbackReasonDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.digest_id, surrogate.digest_id) && this.feedback_reaction == surrogate.feedback_reaction && Intrinsics.areEqual(this.like_reasons, surrogate.like_reasons) && Intrinsics.areEqual(this.dislike_reasons, surrogate.dislike_reasons) && Intrinsics.areEqual(this.feedback_timestamp, surrogate.feedback_timestamp) && this.instrument_type == surrogate.instrument_type;
        }

        public int hashCode() {
            int iHashCode = ((((((this.digest_id.hashCode() * 31) + this.feedback_reaction.hashCode()) * 31) + this.like_reasons.hashCode()) * 31) + this.dislike_reasons.hashCode()) * 31;
            Instant instant = this.feedback_timestamp;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.instrument_type.hashCode();
        }

        public String toString() {
            return "Surrogate(digest_id=" + this.digest_id + ", feedback_reaction=" + this.feedback_reaction + ", like_reasons=" + this.like_reasons + ", dislike_reasons=" + this.dislike_reasons + ", feedback_timestamp=" + this.feedback_timestamp + ", instrument_type=" + this.instrument_type + ")";
        }

        /* compiled from: SubmitFeedbackResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubmitFeedbackResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.copilot.v1.SubmitFeedbackResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubmitFeedbackResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.copilot.v1.SubmitFeedbackResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubmitFeedbackResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, FeedbackReactionDto feedbackReactionDto, List list, List list2, Instant instant, InstrumentTypeDto instrumentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.digest_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.feedback_reaction = FeedbackReactionDto.INSTANCE.getZeroValue();
            } else {
                this.feedback_reaction = feedbackReactionDto;
            }
            if ((i & 4) == 0) {
                this.like_reasons = CollectionsKt.emptyList();
            } else {
                this.like_reasons = list;
            }
            if ((i & 8) == 0) {
                this.dislike_reasons = CollectionsKt.emptyList();
            } else {
                this.dislike_reasons = list2;
            }
            if ((i & 16) == 0) {
                this.feedback_timestamp = null;
            } else {
                this.feedback_timestamp = instant;
            }
            if ((i & 32) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.digest_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.digest_id);
            }
            if (self.feedback_reaction != FeedbackReactionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, FeedbackReactionDto.Serializer.INSTANCE, self.feedback_reaction);
            }
            if (!Intrinsics.areEqual(self.like_reasons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.like_reasons);
            }
            if (!Intrinsics.areEqual(self.dislike_reasons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.dislike_reasons);
            }
            Instant instant = self.feedback_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
        }

        public Surrogate(String digest_id, FeedbackReactionDto feedback_reaction, List<FeedbackReasonDto> like_reasons, List<FeedbackReasonDto> dislike_reasons, Instant instant, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
            Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
            Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            this.digest_id = digest_id;
            this.feedback_reaction = feedback_reaction;
            this.like_reasons = like_reasons;
            this.dislike_reasons = dislike_reasons;
            this.feedback_timestamp = instant;
            this.instrument_type = instrument_type;
        }

        public final String getDigest_id() {
            return this.digest_id;
        }

        public /* synthetic */ Surrogate(String str, FeedbackReactionDto feedbackReactionDto, List list, List list2, Instant instant, InstrumentTypeDto instrumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? FeedbackReactionDto.INSTANCE.getZeroValue() : feedbackReactionDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
        }

        public final FeedbackReactionDto getFeedback_reaction() {
            return this.feedback_reaction;
        }

        public final List<FeedbackReasonDto> getLike_reasons() {
            return this.like_reasons;
        }

        public final List<FeedbackReasonDto> getDislike_reasons() {
            return this.dislike_reasons;
        }

        public final Instant getFeedback_timestamp() {
            return this.feedback_timestamp;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }
    }

    /* compiled from: SubmitFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubmitFeedbackResponseDto, SubmitFeedbackResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubmitFeedbackResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubmitFeedbackResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubmitFeedbackResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) SubmitFeedbackResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubmitFeedbackResponse> getProtoAdapter() {
            return SubmitFeedbackResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubmitFeedbackResponseDto getZeroValue() {
            return SubmitFeedbackResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubmitFeedbackResponseDto fromProto(SubmitFeedbackResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String digest_id = proto.getDigest_id();
            FeedbackReactionDto feedbackReactionDtoFromProto = FeedbackReactionDto.INSTANCE.fromProto(proto.getFeedback_reaction());
            List<FeedbackReason> like_reasons = proto.getLike_reasons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(like_reasons, 10));
            Iterator<T> it = like_reasons.iterator();
            while (it.hasNext()) {
                arrayList.add(FeedbackReasonDto.INSTANCE.fromProto((FeedbackReason) it.next()));
            }
            List<FeedbackReason> dislike_reasons = proto.getDislike_reasons();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dislike_reasons, 10));
            Iterator<T> it2 = dislike_reasons.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FeedbackReasonDto.INSTANCE.fromProto((FeedbackReason) it2.next()));
            }
            return new SubmitFeedbackResponseDto(new Surrogate(digest_id, feedbackReactionDtoFromProto, arrayList, arrayList2, proto.getFeedback_timestamp(), InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.SubmitFeedbackResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitFeedbackResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new SubmitFeedbackResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubmitFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubmitFeedbackResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.SubmitFeedbackResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubmitFeedbackResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubmitFeedbackResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubmitFeedbackResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubmitFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.SubmitFeedbackResponseDto";
        }
    }
}
