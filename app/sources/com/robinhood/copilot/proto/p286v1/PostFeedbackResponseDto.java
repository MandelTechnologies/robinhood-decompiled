package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.InstrumentTypeDto;
import com.robinhood.copilot.proto.p286v1.PostFeedbackResponseDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.i18n.Locality;
import com.robinhood.rosetta.i18n.LocalityDto;
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
import p479j$.time.Instant;

/* compiled from: PostFeedbackResponseDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>=?@B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0018J\u0087\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001e¨\u0006A"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;)V", "", "instrument_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "feedback_timestamp", "type", "reaction", "", "reasons", "Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "instrument_type", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "locality", "composite_feedback_id", "freeform_feedback", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/PostFeedbackResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;", "getInstrument_id", "getGeneration_timestamp", "()Lj$/time/Instant;", "getFeedback_timestamp", "getType", "getReaction", "getReasons", "()Ljava/util/List;", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "getLocality", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "getComposite_feedback_id", "getFreeform_feedback", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PostFeedbackResponseDto implements Dto3<PostFeedbackResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PostFeedbackResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PostFeedbackResponseDto, PostFeedbackResponse>> binaryBase64Serializer$delegate;
    private static final PostFeedbackResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PostFeedbackResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PostFeedbackResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final Instant getGeneration_timestamp() {
        return this.surrogate.getGeneration_timestamp();
    }

    public final Instant getFeedback_timestamp() {
        return this.surrogate.getFeedback_timestamp();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getReaction() {
        return this.surrogate.getReaction();
    }

    public final List<String> getReasons() {
        return this.surrogate.getReasons();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final LocalityDto getLocality() {
        return this.surrogate.getLocality();
    }

    public final String getComposite_feedback_id() {
        return this.surrogate.getComposite_feedback_id();
    }

    public final String getFreeform_feedback() {
        return this.surrogate.getFreeform_feedback();
    }

    public /* synthetic */ PostFeedbackResponseDto(String str, Instant instant, Instant instant2, String str2, String str3, List list, InstrumentTypeDto instrumentTypeDto, LocalityDto localityDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 128) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostFeedbackResponseDto(String instrument_id, Instant instant, Instant instant2, String type2, String reaction, List<String> reasons, InstrumentTypeDto instrument_type, LocalityDto locality, String composite_feedback_id, String freeform_feedback) {
        this(new Surrogate(instrument_id, instant, instant2, type2, reaction, reasons, instrument_type, locality, composite_feedback_id, freeform_feedback));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
    }

    public static /* synthetic */ PostFeedbackResponseDto copy$default(PostFeedbackResponseDto postFeedbackResponseDto, String str, Instant instant, Instant instant2, String str2, String str3, List list, InstrumentTypeDto instrumentTypeDto, LocalityDto localityDto, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postFeedbackResponseDto.surrogate.getInstrument_id();
        }
        if ((i & 2) != 0) {
            instant = postFeedbackResponseDto.surrogate.getGeneration_timestamp();
        }
        if ((i & 4) != 0) {
            instant2 = postFeedbackResponseDto.surrogate.getFeedback_timestamp();
        }
        if ((i & 8) != 0) {
            str2 = postFeedbackResponseDto.surrogate.getType();
        }
        if ((i & 16) != 0) {
            str3 = postFeedbackResponseDto.surrogate.getReaction();
        }
        if ((i & 32) != 0) {
            list = postFeedbackResponseDto.surrogate.getReasons();
        }
        if ((i & 64) != 0) {
            instrumentTypeDto = postFeedbackResponseDto.surrogate.getInstrument_type();
        }
        if ((i & 128) != 0) {
            localityDto = postFeedbackResponseDto.surrogate.getLocality();
        }
        if ((i & 256) != 0) {
            str4 = postFeedbackResponseDto.surrogate.getComposite_feedback_id();
        }
        if ((i & 512) != 0) {
            str5 = postFeedbackResponseDto.surrogate.getFreeform_feedback();
        }
        String str6 = str4;
        String str7 = str5;
        InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
        LocalityDto localityDto2 = localityDto;
        String str8 = str3;
        List list2 = list;
        return postFeedbackResponseDto.copy(str, instant, instant2, str2, str8, list2, instrumentTypeDto2, localityDto2, str6, str7);
    }

    public final PostFeedbackResponseDto copy(String instrument_id, Instant generation_timestamp, Instant feedback_timestamp, String type2, String reaction, List<String> reasons, InstrumentTypeDto instrument_type, LocalityDto locality, String composite_feedback_id, String freeform_feedback) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        return new PostFeedbackResponseDto(new Surrogate(instrument_id, generation_timestamp, feedback_timestamp, type2, reaction, reasons, instrument_type, locality, composite_feedback_id, freeform_feedback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PostFeedbackResponse toProto() {
        String instrument_id = this.surrogate.getInstrument_id();
        Instant generation_timestamp = this.surrogate.getGeneration_timestamp();
        Instant feedback_timestamp = this.surrogate.getFeedback_timestamp();
        String type2 = this.surrogate.getType();
        String reaction = this.surrogate.getReaction();
        List<String> reasons = this.surrogate.getReasons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reasons, 10));
        Iterator<T> it = reasons.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new PostFeedbackResponse(instrument_id, generation_timestamp, feedback_timestamp, type2, reaction, arrayList, (InstrumentType) this.surrogate.getInstrument_type().toProto(), (Locality) this.surrogate.getLocality().toProto(), this.surrogate.getComposite_feedback_id(), this.surrogate.getFreeform_feedback(), null, 1024, null);
    }

    public String toString() {
        return "[PostFeedbackResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PostFeedbackResponseDto) && Intrinsics.areEqual(((PostFeedbackResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: PostFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002XWB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J6\u0010'\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b'\u0010(J6\u0010)\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010&JÆ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010&J\u0010\u00107\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010&RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bC\u0010@\u001a\u0004\bB\u0010(RF\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010A\u0012\u0004\bE\u0010@\u001a\u0004\bD\u0010(R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\bG\u0010@\u001a\u0004\bF\u0010&R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\bI\u0010@\u001a\u0004\bH\u0010&R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010J\u0012\u0004\bL\u0010@\u001a\u0004\bK\u0010-R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010M\u0012\u0004\bO\u0010@\u001a\u0004\bN\u0010/R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010P\u0012\u0004\bR\u0010@\u001a\u0004\bQ\u00101R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010=\u0012\u0004\bT\u0010@\u001a\u0004\bS\u0010&R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010=\u0012\u0004\bV\u0010@\u001a\u0004\bU\u0010&¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;", "", "", "instrument_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "generation_timestamp", "feedback_timestamp", "type", "reaction", "", "reasons", "Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "instrument_type", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "locality", "composite_feedback_id", "freeform_feedback", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "component8", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "component9", "component10", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "Lj$/time/Instant;", "getGeneration_timestamp", "getGeneration_timestamp$annotations", "getFeedback_timestamp", "getFeedback_timestamp$annotations", "getType", "getType$annotations", "getReaction", "getReaction$annotations", "Ljava/util/List;", "getReasons", "getReasons$annotations", "Lcom/robinhood/copilot/proto/v1/InstrumentTypeDto;", "getInstrument_type", "getInstrument_type$annotations", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "getLocality", "getLocality$annotations", "getComposite_feedback_id", "getComposite_feedback_id$annotations", "getFreeform_feedback", "getFreeform_feedback$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String composite_feedback_id;
        private final Instant feedback_timestamp;
        private final String freeform_feedback;
        private final Instant generation_timestamp;
        private final String instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final LocalityDto locality;
        private final String reaction;
        private final List<String> reasons;
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.PostFeedbackResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostFeedbackResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (Instant) null, (Instant) null, (String) null, (String) null, (List) null, (InstrumentTypeDto) null, (LocalityDto) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, Instant instant2, String str2, String str3, List list, InstrumentTypeDto instrumentTypeDto, LocalityDto localityDto, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.instrument_id;
            }
            if ((i & 2) != 0) {
                instant = surrogate.generation_timestamp;
            }
            if ((i & 4) != 0) {
                instant2 = surrogate.feedback_timestamp;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.type;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.reaction;
            }
            if ((i & 32) != 0) {
                list = surrogate.reasons;
            }
            if ((i & 64) != 0) {
                instrumentTypeDto = surrogate.instrument_type;
            }
            if ((i & 128) != 0) {
                localityDto = surrogate.locality;
            }
            if ((i & 256) != 0) {
                str4 = surrogate.composite_feedback_id;
            }
            if ((i & 512) != 0) {
                str5 = surrogate.freeform_feedback;
            }
            String str6 = str4;
            String str7 = str5;
            InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
            LocalityDto localityDto2 = localityDto;
            String str8 = str3;
            List list2 = list;
            return surrogate.copy(str, instant, instant2, str2, str8, list2, instrumentTypeDto2, localityDto2, str6, str7);
        }

        @SerialName("compositeFeedbackId")
        @JsonAnnotations2(names = {"composite_feedback_id"})
        public static /* synthetic */ void getComposite_feedback_id$annotations() {
        }

        @SerialName("feedbackTimestamp")
        @JsonAnnotations2(names = {"feedback_timestamp"})
        public static /* synthetic */ void getFeedback_timestamp$annotations() {
        }

        @SerialName("freeformFeedback")
        @JsonAnnotations2(names = {"freeform_feedback"})
        public static /* synthetic */ void getFreeform_feedback$annotations() {
        }

        @SerialName("generationTimestamp")
        @JsonAnnotations2(names = {"generation_timestamp"})
        public static /* synthetic */ void getGeneration_timestamp$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("reaction")
        @JsonAnnotations2(names = {"reaction"})
        public static /* synthetic */ void getReaction$annotations() {
        }

        @SerialName("reasons")
        @JsonAnnotations2(names = {"reasons"})
        public static /* synthetic */ void getReasons$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getFreeform_feedback() {
            return this.freeform_feedback;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getGeneration_timestamp() {
            return this.generation_timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getFeedback_timestamp() {
            return this.feedback_timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component5, reason: from getter */
        public final String getReaction() {
            return this.reaction;
        }

        public final List<String> component6() {
            return this.reasons;
        }

        /* renamed from: component7, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        /* renamed from: component8, reason: from getter */
        public final LocalityDto getLocality() {
            return this.locality;
        }

        /* renamed from: component9, reason: from getter */
        public final String getComposite_feedback_id() {
            return this.composite_feedback_id;
        }

        public final Surrogate copy(String instrument_id, Instant generation_timestamp, Instant feedback_timestamp, String type2, String reaction, List<String> reasons, InstrumentTypeDto instrument_type, LocalityDto locality, String composite_feedback_id, String freeform_feedback) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(reaction, "reaction");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
            Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
            return new Surrogate(instrument_id, generation_timestamp, feedback_timestamp, type2, reaction, reasons, instrument_type, locality, composite_feedback_id, freeform_feedback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.generation_timestamp, surrogate.generation_timestamp) && Intrinsics.areEqual(this.feedback_timestamp, surrogate.feedback_timestamp) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.reaction, surrogate.reaction) && Intrinsics.areEqual(this.reasons, surrogate.reasons) && this.instrument_type == surrogate.instrument_type && this.locality == surrogate.locality && Intrinsics.areEqual(this.composite_feedback_id, surrogate.composite_feedback_id) && Intrinsics.areEqual(this.freeform_feedback, surrogate.freeform_feedback);
        }

        public int hashCode() {
            int iHashCode = this.instrument_id.hashCode() * 31;
            Instant instant = this.generation_timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.feedback_timestamp;
            return ((((((((((((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.type.hashCode()) * 31) + this.reaction.hashCode()) * 31) + this.reasons.hashCode()) * 31) + this.instrument_type.hashCode()) * 31) + this.locality.hashCode()) * 31) + this.composite_feedback_id.hashCode()) * 31) + this.freeform_feedback.hashCode();
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", generation_timestamp=" + this.generation_timestamp + ", feedback_timestamp=" + this.feedback_timestamp + ", type=" + this.type + ", reaction=" + this.reaction + ", reasons=" + this.reasons + ", instrument_type=" + this.instrument_type + ", locality=" + this.locality + ", composite_feedback_id=" + this.composite_feedback_id + ", freeform_feedback=" + this.freeform_feedback + ")";
        }

        /* compiled from: PostFeedbackResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PostFeedbackResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, Instant instant2, String str2, String str3, List list, InstrumentTypeDto instrumentTypeDto, LocalityDto localityDto, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 2) == 0) {
                this.generation_timestamp = null;
            } else {
                this.generation_timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.feedback_timestamp = null;
            } else {
                this.feedback_timestamp = instant2;
            }
            if ((i & 8) == 0) {
                this.type = "";
            } else {
                this.type = str2;
            }
            if ((i & 16) == 0) {
                this.reaction = "";
            } else {
                this.reaction = str3;
            }
            if ((i & 32) == 0) {
                this.reasons = CollectionsKt.emptyList();
            } else {
                this.reasons = list;
            }
            if ((i & 64) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
            if ((i & 128) == 0) {
                this.locality = LocalityDto.INSTANCE.getZeroValue();
            } else {
                this.locality = localityDto;
            }
            if ((i & 256) == 0) {
                this.composite_feedback_id = "";
            } else {
                this.composite_feedback_id = str4;
            }
            if ((i & 512) == 0) {
                this.freeform_feedback = "";
            } else {
                this.freeform_feedback = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            Instant instant = self.generation_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.feedback_timestamp;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 3, self.type);
            }
            if (!Intrinsics.areEqual(self.reaction, "")) {
                output.encodeStringElement(serialDesc, 4, self.reaction);
            }
            if (!Intrinsics.areEqual(self.reasons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.reasons);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            if (self.locality != LocalityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, LocalityDto.Serializer.INSTANCE, self.locality);
            }
            if (!Intrinsics.areEqual(self.composite_feedback_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.composite_feedback_id);
            }
            if (Intrinsics.areEqual(self.freeform_feedback, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.freeform_feedback);
        }

        public Surrogate(String instrument_id, Instant instant, Instant instant2, String type2, String reaction, List<String> reasons, InstrumentTypeDto instrument_type, LocalityDto locality, String composite_feedback_id, String freeform_feedback) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(reaction, "reaction");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
            Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
            this.instrument_id = instrument_id;
            this.generation_timestamp = instant;
            this.feedback_timestamp = instant2;
            this.type = type2;
            this.reaction = reaction;
            this.reasons = reasons;
            this.instrument_type = instrument_type;
            this.locality = locality;
            this.composite_feedback_id = composite_feedback_id;
            this.freeform_feedback = freeform_feedback;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, Instant instant2, String str2, String str3, List list, InstrumentTypeDto instrumentTypeDto, LocalityDto localityDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 128) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5);
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final Instant getGeneration_timestamp() {
            return this.generation_timestamp;
        }

        public final Instant getFeedback_timestamp() {
            return this.feedback_timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final String getReaction() {
            return this.reaction;
        }

        public final List<String> getReasons() {
            return this.reasons;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final LocalityDto getLocality() {
            return this.locality;
        }

        public final String getComposite_feedback_id() {
            return this.composite_feedback_id;
        }

        public final String getFreeform_feedback() {
            return this.freeform_feedback;
        }
    }

    /* compiled from: PostFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PostFeedbackResponseDto, PostFeedbackResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PostFeedbackResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostFeedbackResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostFeedbackResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) PostFeedbackResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PostFeedbackResponse> getProtoAdapter() {
            return PostFeedbackResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostFeedbackResponseDto getZeroValue() {
            return PostFeedbackResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostFeedbackResponseDto fromProto(PostFeedbackResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String instrument_id = proto.getInstrument_id();
            Instant generation_timestamp = proto.getGeneration_timestamp();
            Instant feedback_timestamp = proto.getFeedback_timestamp();
            String type2 = proto.getType();
            String reaction = proto.getReaction();
            List<String> reasons = proto.getReasons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reasons, 10));
            Iterator<T> it = reasons.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new PostFeedbackResponseDto(new Surrogate(instrument_id, generation_timestamp, feedback_timestamp, type2, reaction, arrayList, InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type()), LocalityDto.INSTANCE.fromProto(proto.getLocality()), proto.getComposite_feedback_id(), proto.getFreeform_feedback()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.PostFeedbackResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostFeedbackResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PostFeedbackResponseDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PostFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PostFeedbackResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.PostFeedbackResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PostFeedbackResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PostFeedbackResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PostFeedbackResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PostFeedbackResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.PostFeedbackResponseDto";
        }
    }
}
