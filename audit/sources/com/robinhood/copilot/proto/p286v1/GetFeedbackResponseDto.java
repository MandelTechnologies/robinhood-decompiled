package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.GetFeedbackResponseDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetFeedbackResponseDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJ>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Surrogate;)V", "digest_id", "", "reaction", "reasons", "", "composite_feedback_id", "freeform_feedback", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDigest_id", "()Ljava/lang/String;", "getReaction", "getReasons", "()Ljava/util/List;", "getComposite_feedback_id", "getFreeform_feedback", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class GetFeedbackResponseDto implements Dto3<GetFeedbackResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetFeedbackResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetFeedbackResponseDto, GetFeedbackResponse>> binaryBase64Serializer$delegate;
    private static final GetFeedbackResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetFeedbackResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetFeedbackResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDigest_id() {
        return this.surrogate.getDigest_id();
    }

    public final String getReaction() {
        return this.surrogate.getReaction();
    }

    public final List<String> getReasons() {
        return this.surrogate.getReasons();
    }

    public final String getComposite_feedback_id() {
        return this.surrogate.getComposite_feedback_id();
    }

    public final String getFreeform_feedback() {
        return this.surrogate.getFreeform_feedback();
    }

    public /* synthetic */ GetFeedbackResponseDto(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetFeedbackResponseDto(String digest_id, String reaction, List<String> reasons, String composite_feedback_id, String freeform_feedback) {
        this(new Surrogate(digest_id, reaction, reasons, composite_feedback_id, freeform_feedback));
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
    }

    public static /* synthetic */ GetFeedbackResponseDto copy$default(GetFeedbackResponseDto getFeedbackResponseDto, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFeedbackResponseDto.surrogate.getDigest_id();
        }
        if ((i & 2) != 0) {
            str2 = getFeedbackResponseDto.surrogate.getReaction();
        }
        if ((i & 4) != 0) {
            list = getFeedbackResponseDto.surrogate.getReasons();
        }
        if ((i & 8) != 0) {
            str3 = getFeedbackResponseDto.surrogate.getComposite_feedback_id();
        }
        if ((i & 16) != 0) {
            str4 = getFeedbackResponseDto.surrogate.getFreeform_feedback();
        }
        String str5 = str4;
        List list2 = list;
        return getFeedbackResponseDto.copy(str, str2, list2, str3, str5);
    }

    public final GetFeedbackResponseDto copy(String digest_id, String reaction, List<String> reasons, String composite_feedback_id, String freeform_feedback) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        return new GetFeedbackResponseDto(new Surrogate(digest_id, reaction, reasons, composite_feedback_id, freeform_feedback));
    }

    @Override // com.robinhood.idl.Dto
    public GetFeedbackResponse toProto() {
        String digest_id = this.surrogate.getDigest_id();
        String reaction = this.surrogate.getReaction();
        List<String> reasons = this.surrogate.getReasons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reasons, 10));
        Iterator<T> it = reasons.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new GetFeedbackResponse(digest_id, reaction, arrayList, this.surrogate.getComposite_feedback_id(), this.surrogate.getFreeform_feedback(), null, 32, null);
    }

    public String toString() {
        return "[GetFeedbackResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetFeedbackResponseDto) && Intrinsics.areEqual(((GetFeedbackResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JA\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u00062"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Surrogate;", "", "digest_id", "", "reaction", "reasons", "", "composite_feedback_id", "freeform_feedback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDigest_id$annotations", "()V", "getDigest_id", "()Ljava/lang/String;", "getReaction$annotations", "getReaction", "getReasons$annotations", "getReasons", "()Ljava/util/List;", "getComposite_feedback_id$annotations", "getComposite_feedback_id", "getFreeform_feedback$annotations", "getFreeform_feedback", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String composite_feedback_id;
        private final String digest_id;
        private final String freeform_feedback;
        private final String reaction;
        private final List<String> reasons;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.GetFeedbackResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFeedbackResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, List list, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.digest_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.reaction;
            }
            if ((i & 4) != 0) {
                list = surrogate.reasons;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.composite_feedback_id;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.freeform_feedback;
            }
            String str5 = str4;
            List list2 = list;
            return surrogate.copy(str, str2, list2, str3, str5);
        }

        @SerialName("compositeFeedbackId")
        @JsonAnnotations2(names = {"composite_feedback_id"})
        public static /* synthetic */ void getComposite_feedback_id$annotations() {
        }

        @SerialName("digestId")
        @JsonAnnotations2(names = {"digest_id"})
        public static /* synthetic */ void getDigest_id$annotations() {
        }

        @SerialName("freeformFeedback")
        @JsonAnnotations2(names = {"freeform_feedback"})
        public static /* synthetic */ void getFreeform_feedback$annotations() {
        }

        @SerialName("reaction")
        @JsonAnnotations2(names = {"reaction"})
        public static /* synthetic */ void getReaction$annotations() {
        }

        @SerialName("reasons")
        @JsonAnnotations2(names = {"reasons"})
        public static /* synthetic */ void getReasons$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDigest_id() {
            return this.digest_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReaction() {
            return this.reaction;
        }

        public final List<String> component3() {
            return this.reasons;
        }

        /* renamed from: component4, reason: from getter */
        public final String getComposite_feedback_id() {
            return this.composite_feedback_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getFreeform_feedback() {
            return this.freeform_feedback;
        }

        public final Surrogate copy(String digest_id, String reaction, List<String> reasons, String composite_feedback_id, String freeform_feedback) {
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            Intrinsics.checkNotNullParameter(reaction, "reaction");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
            Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
            return new Surrogate(digest_id, reaction, reasons, composite_feedback_id, freeform_feedback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.digest_id, surrogate.digest_id) && Intrinsics.areEqual(this.reaction, surrogate.reaction) && Intrinsics.areEqual(this.reasons, surrogate.reasons) && Intrinsics.areEqual(this.composite_feedback_id, surrogate.composite_feedback_id) && Intrinsics.areEqual(this.freeform_feedback, surrogate.freeform_feedback);
        }

        public int hashCode() {
            return (((((((this.digest_id.hashCode() * 31) + this.reaction.hashCode()) * 31) + this.reasons.hashCode()) * 31) + this.composite_feedback_id.hashCode()) * 31) + this.freeform_feedback.hashCode();
        }

        public String toString() {
            return "Surrogate(digest_id=" + this.digest_id + ", reaction=" + this.reaction + ", reasons=" + this.reasons + ", composite_feedback_id=" + this.composite_feedback_id + ", freeform_feedback=" + this.freeform_feedback + ")";
        }

        /* compiled from: GetFeedbackResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetFeedbackResponseDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.digest_id = "";
            } else {
                this.digest_id = str;
            }
            if ((i & 2) == 0) {
                this.reaction = "";
            } else {
                this.reaction = str2;
            }
            if ((i & 4) == 0) {
                this.reasons = CollectionsKt.emptyList();
            } else {
                this.reasons = list;
            }
            if ((i & 8) == 0) {
                this.composite_feedback_id = "";
            } else {
                this.composite_feedback_id = str3;
            }
            if ((i & 16) == 0) {
                this.freeform_feedback = "";
            } else {
                this.freeform_feedback = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.digest_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.digest_id);
            }
            if (!Intrinsics.areEqual(self.reaction, "")) {
                output.encodeStringElement(serialDesc, 1, self.reaction);
            }
            if (!Intrinsics.areEqual(self.reasons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.reasons);
            }
            if (!Intrinsics.areEqual(self.composite_feedback_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.composite_feedback_id);
            }
            if (Intrinsics.areEqual(self.freeform_feedback, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.freeform_feedback);
        }

        public Surrogate(String digest_id, String reaction, List<String> reasons, String composite_feedback_id, String freeform_feedback) {
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            Intrinsics.checkNotNullParameter(reaction, "reaction");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
            Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
            this.digest_id = digest_id;
            this.reaction = reaction;
            this.reasons = reasons;
            this.composite_feedback_id = composite_feedback_id;
            this.freeform_feedback = freeform_feedback;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
        }

        public final String getDigest_id() {
            return this.digest_id;
        }

        public final String getReaction() {
            return this.reaction;
        }

        public final List<String> getReasons() {
            return this.reasons;
        }

        public final String getComposite_feedback_id() {
            return this.composite_feedback_id;
        }

        public final String getFreeform_feedback() {
            return this.freeform_feedback;
        }
    }

    /* compiled from: GetFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetFeedbackResponseDto, GetFeedbackResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFeedbackResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFeedbackResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFeedbackResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetFeedbackResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetFeedbackResponse> getProtoAdapter() {
            return GetFeedbackResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFeedbackResponseDto getZeroValue() {
            return GetFeedbackResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFeedbackResponseDto fromProto(GetFeedbackResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String digest_id = proto.getDigest_id();
            String reaction = proto.getReaction();
            List<String> reasons = proto.getReasons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reasons, 10));
            Iterator<T> it = reasons.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new GetFeedbackResponseDto(new Surrogate(digest_id, reaction, arrayList, proto.getComposite_feedback_id(), proto.getFreeform_feedback()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetFeedbackResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFeedbackResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetFeedbackResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetFeedbackResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetFeedbackResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetFeedbackResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetFeedbackResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetFeedbackResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetFeedbackResponseDto";
        }
    }
}
