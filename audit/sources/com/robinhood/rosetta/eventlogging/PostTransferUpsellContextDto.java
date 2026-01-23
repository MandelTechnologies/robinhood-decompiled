package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: PostTransferUpsellContextDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u000bH\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Surrogate;)V", "post_transfer_upsell_type", "", "impression_count", "", "resurrection_impression_count", "should_show_post_transfer_upsell", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "ms_since_last_seen", "", "(Ljava/lang/String;IILcom/robinhood/rosetta/eventlogging/BooleanDto;J)V", "getPost_transfer_upsell_type", "()Ljava/lang/String;", "getImpression_count", "()I", "getResurrection_impression_count", "getShould_show_post_transfer_upsell", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getMs_since_last_seen", "()J", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PostTransferUpsellContextDto implements Dto3<PostTransferUpsellContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PostTransferUpsellContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PostTransferUpsellContextDto, PostTransferUpsellContext>> binaryBase64Serializer$delegate;
    private static final PostTransferUpsellContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PostTransferUpsellContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PostTransferUpsellContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPost_transfer_upsell_type() {
        return this.surrogate.getPost_transfer_upsell_type();
    }

    public final int getImpression_count() {
        return this.surrogate.getImpression_count();
    }

    public final int getResurrection_impression_count() {
        return this.surrogate.getResurrection_impression_count();
    }

    public final BooleanDto getShould_show_post_transfer_upsell() {
        return this.surrogate.getShould_show_post_transfer_upsell();
    }

    public final long getMs_since_last_seen() {
        return this.surrogate.getMs_since_last_seen();
    }

    public /* synthetic */ PostTransferUpsellContextDto(String str, int i, int i2, BooleanDto booleanDto, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i3 & 16) != 0 ? 0L : j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostTransferUpsellContextDto(String post_transfer_upsell_type, int i, int i2, BooleanDto should_show_post_transfer_upsell, long j) {
        this(new Surrogate(post_transfer_upsell_type, i, i2, should_show_post_transfer_upsell, j));
        Intrinsics.checkNotNullParameter(post_transfer_upsell_type, "post_transfer_upsell_type");
        Intrinsics.checkNotNullParameter(should_show_post_transfer_upsell, "should_show_post_transfer_upsell");
    }

    public static /* synthetic */ PostTransferUpsellContextDto copy$default(PostTransferUpsellContextDto postTransferUpsellContextDto, String str, int i, int i2, BooleanDto booleanDto, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postTransferUpsellContextDto.surrogate.getPost_transfer_upsell_type();
        }
        if ((i3 & 2) != 0) {
            i = postTransferUpsellContextDto.surrogate.getImpression_count();
        }
        if ((i3 & 4) != 0) {
            i2 = postTransferUpsellContextDto.surrogate.getResurrection_impression_count();
        }
        if ((i3 & 8) != 0) {
            booleanDto = postTransferUpsellContextDto.surrogate.getShould_show_post_transfer_upsell();
        }
        if ((i3 & 16) != 0) {
            j = postTransferUpsellContextDto.surrogate.getMs_since_last_seen();
        }
        long j2 = j;
        return postTransferUpsellContextDto.copy(str, i, i2, booleanDto, j2);
    }

    public final PostTransferUpsellContextDto copy(String post_transfer_upsell_type, int impression_count, int resurrection_impression_count, BooleanDto should_show_post_transfer_upsell, long ms_since_last_seen) {
        Intrinsics.checkNotNullParameter(post_transfer_upsell_type, "post_transfer_upsell_type");
        Intrinsics.checkNotNullParameter(should_show_post_transfer_upsell, "should_show_post_transfer_upsell");
        return new PostTransferUpsellContextDto(new Surrogate(post_transfer_upsell_type, impression_count, resurrection_impression_count, should_show_post_transfer_upsell, ms_since_last_seen));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PostTransferUpsellContext toProto() {
        return new PostTransferUpsellContext(this.surrogate.getPost_transfer_upsell_type(), this.surrogate.getImpression_count(), this.surrogate.getResurrection_impression_count(), (Boolean) this.surrogate.getShould_show_post_transfer_upsell().toProto(), this.surrogate.getMs_since_last_seen(), null, 32, null);
    }

    public String toString() {
        return "[PostTransferUpsellContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PostTransferUpsellContextDto) && Intrinsics.areEqual(((PostTransferUpsellContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PostTransferUpsellContextDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000278Bf\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u000f\u0010\u0010BG\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0018\u0010%\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010&\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0018\u0010(\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003Jh\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R+\u0010\f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Surrogate;", "", "post_transfer_upsell_type", "", "impression_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "resurrection_impression_count", "should_show_post_transfer_upsell", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "ms_since_last_seen", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "<init>", "(Ljava/lang/String;IILcom/robinhood/rosetta/eventlogging/BooleanDto;J)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILcom/robinhood/rosetta/eventlogging/BooleanDto;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPost_transfer_upsell_type$annotations", "()V", "getPost_transfer_upsell_type", "()Ljava/lang/String;", "getImpression_count$annotations", "getImpression_count", "()I", "getResurrection_impression_count$annotations", "getResurrection_impression_count", "getShould_show_post_transfer_upsell$annotations", "getShould_show_post_transfer_upsell", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getMs_since_last_seen$annotations", "getMs_since_last_seen", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int impression_count;
        private final long ms_since_last_seen;
        private final String post_transfer_upsell_type;
        private final int resurrection_impression_count;
        private final BooleanDto should_show_post_transfer_upsell;

        public Surrogate() {
            this((String) null, 0, 0, (BooleanDto) null, 0L, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, int i2, BooleanDto booleanDto, long j, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.post_transfer_upsell_type;
            }
            if ((i3 & 2) != 0) {
                i = surrogate.impression_count;
            }
            if ((i3 & 4) != 0) {
                i2 = surrogate.resurrection_impression_count;
            }
            if ((i3 & 8) != 0) {
                booleanDto = surrogate.should_show_post_transfer_upsell;
            }
            if ((i3 & 16) != 0) {
                j = surrogate.ms_since_last_seen;
            }
            long j2 = j;
            return surrogate.copy(str, i, i2, booleanDto, j2);
        }

        @SerialName("impressionCount")
        @JsonAnnotations2(names = {"impression_count"})
        public static /* synthetic */ void getImpression_count$annotations() {
        }

        @SerialName("msSinceLastSeen")
        @JsonAnnotations2(names = {"ms_since_last_seen"})
        public static /* synthetic */ void getMs_since_last_seen$annotations() {
        }

        @SerialName("postTransferUpsellType")
        @JsonAnnotations2(names = {"post_transfer_upsell_type"})
        public static /* synthetic */ void getPost_transfer_upsell_type$annotations() {
        }

        @SerialName("resurrectionImpressionCount")
        @JsonAnnotations2(names = {"resurrection_impression_count"})
        public static /* synthetic */ void getResurrection_impression_count$annotations() {
        }

        @SerialName("shouldShowPostTransferUpsell")
        @JsonAnnotations2(names = {"should_show_post_transfer_upsell"})
        public static /* synthetic */ void getShould_show_post_transfer_upsell$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPost_transfer_upsell_type() {
            return this.post_transfer_upsell_type;
        }

        /* renamed from: component2, reason: from getter */
        public final int getImpression_count() {
            return this.impression_count;
        }

        /* renamed from: component3, reason: from getter */
        public final int getResurrection_impression_count() {
            return this.resurrection_impression_count;
        }

        /* renamed from: component4, reason: from getter */
        public final BooleanDto getShould_show_post_transfer_upsell() {
            return this.should_show_post_transfer_upsell;
        }

        /* renamed from: component5, reason: from getter */
        public final long getMs_since_last_seen() {
            return this.ms_since_last_seen;
        }

        public final Surrogate copy(String post_transfer_upsell_type, int impression_count, int resurrection_impression_count, BooleanDto should_show_post_transfer_upsell, long ms_since_last_seen) {
            Intrinsics.checkNotNullParameter(post_transfer_upsell_type, "post_transfer_upsell_type");
            Intrinsics.checkNotNullParameter(should_show_post_transfer_upsell, "should_show_post_transfer_upsell");
            return new Surrogate(post_transfer_upsell_type, impression_count, resurrection_impression_count, should_show_post_transfer_upsell, ms_since_last_seen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.post_transfer_upsell_type, surrogate.post_transfer_upsell_type) && this.impression_count == surrogate.impression_count && this.resurrection_impression_count == surrogate.resurrection_impression_count && this.should_show_post_transfer_upsell == surrogate.should_show_post_transfer_upsell && this.ms_since_last_seen == surrogate.ms_since_last_seen;
        }

        public int hashCode() {
            return (((((((this.post_transfer_upsell_type.hashCode() * 31) + Integer.hashCode(this.impression_count)) * 31) + Integer.hashCode(this.resurrection_impression_count)) * 31) + this.should_show_post_transfer_upsell.hashCode()) * 31) + Long.hashCode(this.ms_since_last_seen);
        }

        public String toString() {
            return "Surrogate(post_transfer_upsell_type=" + this.post_transfer_upsell_type + ", impression_count=" + this.impression_count + ", resurrection_impression_count=" + this.resurrection_impression_count + ", should_show_post_transfer_upsell=" + this.should_show_post_transfer_upsell + ", ms_since_last_seen=" + this.ms_since_last_seen + ")";
        }

        /* compiled from: PostTransferUpsellContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PostTransferUpsellContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, int i3, BooleanDto booleanDto, long j, SerializationConstructorMarker serializationConstructorMarker) {
            this.post_transfer_upsell_type = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.impression_count = 0;
            } else {
                this.impression_count = i2;
            }
            if ((i & 4) == 0) {
                this.resurrection_impression_count = 0;
            } else {
                this.resurrection_impression_count = i3;
            }
            if ((i & 8) == 0) {
                this.should_show_post_transfer_upsell = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.should_show_post_transfer_upsell = booleanDto;
            }
            if ((i & 16) == 0) {
                this.ms_since_last_seen = 0L;
            } else {
                this.ms_since_last_seen = j;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.post_transfer_upsell_type, "")) {
                output.encodeStringElement(serialDesc, 0, self.post_transfer_upsell_type);
            }
            int i = self.impression_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.resurrection_impression_count;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (self.should_show_post_transfer_upsell != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BooleanDto.Serializer.INSTANCE, self.should_show_post_transfer_upsell);
            }
            long j = self.ms_since_last_seen;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
        }

        public Surrogate(String post_transfer_upsell_type, int i, int i2, BooleanDto should_show_post_transfer_upsell, long j) {
            Intrinsics.checkNotNullParameter(post_transfer_upsell_type, "post_transfer_upsell_type");
            Intrinsics.checkNotNullParameter(should_show_post_transfer_upsell, "should_show_post_transfer_upsell");
            this.post_transfer_upsell_type = post_transfer_upsell_type;
            this.impression_count = i;
            this.resurrection_impression_count = i2;
            this.should_show_post_transfer_upsell = should_show_post_transfer_upsell;
            this.ms_since_last_seen = j;
        }

        public final String getPost_transfer_upsell_type() {
            return this.post_transfer_upsell_type;
        }

        public /* synthetic */ Surrogate(String str, int i, int i2, BooleanDto booleanDto, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i3 & 16) != 0 ? 0L : j);
        }

        public final int getImpression_count() {
            return this.impression_count;
        }

        public final int getResurrection_impression_count() {
            return this.resurrection_impression_count;
        }

        public final BooleanDto getShould_show_post_transfer_upsell() {
            return this.should_show_post_transfer_upsell;
        }

        public final long getMs_since_last_seen() {
            return this.ms_since_last_seen;
        }
    }

    /* compiled from: PostTransferUpsellContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto;", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PostTransferUpsellContextDto, PostTransferUpsellContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PostTransferUpsellContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostTransferUpsellContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostTransferUpsellContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PostTransferUpsellContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PostTransferUpsellContext> getProtoAdapter() {
            return PostTransferUpsellContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostTransferUpsellContextDto getZeroValue() {
            return PostTransferUpsellContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostTransferUpsellContextDto fromProto(PostTransferUpsellContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PostTransferUpsellContextDto(new Surrogate(proto.getPost_transfer_upsell_type(), proto.getImpression_count(), proto.getResurrection_impression_count(), BooleanDto.INSTANCE.fromProto(proto.getShould_show_post_transfer_upsell()), proto.getMs_since_last_seen()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PostTransferUpsellContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostTransferUpsellContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PostTransferUpsellContextDto(null, 0, 0, null, 0L, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PostTransferUpsellContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PostTransferUpsellContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PostTransferUpsellContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PostTransferUpsellContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PostTransferUpsellContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PostTransferUpsellContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PostTransferUpsellContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferUpsellContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PostTransferUpsellContextDto";
        }
    }
}
