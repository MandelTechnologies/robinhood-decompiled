package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.FeedbackDto;
import bonfire.proto.idl.copilot.p032v1.FeedbackReactionDto;
import bonfire.proto.idl.copilot.p032v1.FeedbackReasonDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: FeedbackDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u0006-"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/Feedback;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;)V", "Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "feedback_reaction", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReasonDto;", "like_reasons", "dislike_reasons", "(Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/Feedback;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "getLike_reasons", "()Ljava/util/List;", "getDislike_reasons", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class FeedbackDto implements Dto3<Feedback>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeedbackDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeedbackDto, Feedback>> binaryBase64Serializer$delegate;
    private static final FeedbackDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeedbackDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeedbackDto(Surrogate surrogate) {
        this.surrogate = surrogate;
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

    public /* synthetic */ FeedbackDto(FeedbackReactionDto feedbackReactionDto, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FeedbackReactionDto.INSTANCE.getZeroValue() : feedbackReactionDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedbackDto(FeedbackReactionDto feedback_reaction, List<FeedbackReasonDto> like_reasons, List<FeedbackReasonDto> dislike_reasons) {
        this(new Surrogate(feedback_reaction, like_reasons, dislike_reasons));
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Feedback toProto() {
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
        return new Feedback(feedbackReaction, arrayList, arrayList2, null, 8, null);
    }

    public String toString() {
        return "[FeedbackDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeedbackDto) && Intrinsics.areEqual(((FeedbackDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeedbackDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "feedback_reaction", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReasonDto;", "like_reasons", "dislike_reasons", "<init>", "(Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/copilot/v1/FeedbackReactionDto;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReactionDto;", "getFeedback_reaction$annotations", "()V", "Ljava/util/List;", "getLike_reasons", "()Ljava/util/List;", "getLike_reasons$annotations", "getDislike_reasons", "getDislike_reasons$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<FeedbackReasonDto> dislike_reasons;
        private final FeedbackReactionDto feedback_reaction;
        private final List<FeedbackReasonDto> like_reasons;

        public Surrogate() {
            this((FeedbackReactionDto) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
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
            return this.feedback_reaction == surrogate.feedback_reaction && Intrinsics.areEqual(this.like_reasons, surrogate.like_reasons) && Intrinsics.areEqual(this.dislike_reasons, surrogate.dislike_reasons);
        }

        public int hashCode() {
            return (((this.feedback_reaction.hashCode() * 31) + this.like_reasons.hashCode()) * 31) + this.dislike_reasons.hashCode();
        }

        public String toString() {
            return "Surrogate(feedback_reaction=" + this.feedback_reaction + ", like_reasons=" + this.like_reasons + ", dislike_reasons=" + this.dislike_reasons + ")";
        }

        /* compiled from: FeedbackDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeedbackDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.copilot.v1.FeedbackDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FeedbackDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.copilot.v1.FeedbackDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FeedbackDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, FeedbackReactionDto feedbackReactionDto, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            this.feedback_reaction = (i & 1) == 0 ? FeedbackReactionDto.INSTANCE.getZeroValue() : feedbackReactionDto;
            if ((i & 2) == 0) {
                this.like_reasons = CollectionsKt.emptyList();
            } else {
                this.like_reasons = list;
            }
            if ((i & 4) == 0) {
                this.dislike_reasons = CollectionsKt.emptyList();
            } else {
                this.dislike_reasons = list2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.feedback_reaction != FeedbackReactionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FeedbackReactionDto.Serializer.INSTANCE, self.feedback_reaction);
            }
            if (!Intrinsics.areEqual(self.like_reasons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.like_reasons);
            }
            if (Intrinsics.areEqual(self.dislike_reasons, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.dislike_reasons);
        }

        public Surrogate(FeedbackReactionDto feedback_reaction, List<FeedbackReasonDto> like_reasons, List<FeedbackReasonDto> dislike_reasons) {
            Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
            Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
            Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
            this.feedback_reaction = feedback_reaction;
            this.like_reasons = like_reasons;
            this.dislike_reasons = dislike_reasons;
        }

        public final FeedbackReactionDto getFeedback_reaction() {
            return this.feedback_reaction;
        }

        public /* synthetic */ Surrogate(FeedbackReactionDto feedbackReactionDto, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FeedbackReactionDto.INSTANCE.getZeroValue() : feedbackReactionDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final List<FeedbackReasonDto> getLike_reasons() {
            return this.like_reasons;
        }

        public final List<FeedbackReasonDto> getDislike_reasons() {
            return this.dislike_reasons;
        }
    }

    /* compiled from: FeedbackDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/FeedbackDto;", "Lbonfire/proto/idl/copilot/v1/Feedback;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/FeedbackDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeedbackDto, Feedback> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeedbackDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeedbackDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeedbackDto> getBinaryBase64Serializer() {
            return (KSerializer) FeedbackDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Feedback> getProtoAdapter() {
            return Feedback.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeedbackDto getZeroValue() {
            return FeedbackDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeedbackDto fromProto(Feedback proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
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
            return new FeedbackDto(new Surrogate(feedbackReactionDtoFromProto, arrayList, arrayList2), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.FeedbackDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedbackDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new FeedbackDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeedbackDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/FeedbackDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/FeedbackDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeedbackDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.Feedback", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeedbackDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeedbackDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeedbackDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeedbackDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/FeedbackDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.FeedbackDto";
        }
    }
}
