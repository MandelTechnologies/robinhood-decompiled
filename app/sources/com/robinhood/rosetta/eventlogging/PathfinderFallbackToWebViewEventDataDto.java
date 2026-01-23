package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventDataDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Surrogate;)V", "page", "", "reason", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "inquiry_id", "sequence", "", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;Ljava/lang/String;I)V", "getPage", "()Ljava/lang/String;", "getReason", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "getInquiry_id", "getSequence", "()I", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ReasonDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PathfinderFallbackToWebViewEventDataDto implements Dto3<PathfinderFallbackToWebViewEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PathfinderFallbackToWebViewEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PathfinderFallbackToWebViewEventDataDto, PathfinderFallbackToWebViewEventData>> binaryBase64Serializer$delegate;
    private static final PathfinderFallbackToWebViewEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PathfinderFallbackToWebViewEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PathfinderFallbackToWebViewEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPage() {
        return this.surrogate.getPage();
    }

    public final ReasonDto getReason() {
        return this.surrogate.getReason();
    }

    public final String getInquiry_id() {
        return this.surrogate.getInquiry_id();
    }

    public final int getSequence() {
        return this.surrogate.getSequence();
    }

    public /* synthetic */ PathfinderFallbackToWebViewEventDataDto(String str, ReasonDto reasonDto, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ReasonDto.INSTANCE.getZeroValue() : reasonDto, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PathfinderFallbackToWebViewEventDataDto(String page, ReasonDto reason, String inquiry_id, int i) {
        this(new Surrogate(page, reason, inquiry_id, i));
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
    }

    public static /* synthetic */ PathfinderFallbackToWebViewEventDataDto copy$default(PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, String str, ReasonDto reasonDto, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pathfinderFallbackToWebViewEventDataDto.surrogate.getPage();
        }
        if ((i2 & 2) != 0) {
            reasonDto = pathfinderFallbackToWebViewEventDataDto.surrogate.getReason();
        }
        if ((i2 & 4) != 0) {
            str2 = pathfinderFallbackToWebViewEventDataDto.surrogate.getInquiry_id();
        }
        if ((i2 & 8) != 0) {
            i = pathfinderFallbackToWebViewEventDataDto.surrogate.getSequence();
        }
        return pathfinderFallbackToWebViewEventDataDto.copy(str, reasonDto, str2, i);
    }

    public final PathfinderFallbackToWebViewEventDataDto copy(String page, ReasonDto reason, String inquiry_id, int sequence) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
        return new PathfinderFallbackToWebViewEventDataDto(new Surrogate(page, reason, inquiry_id, sequence));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PathfinderFallbackToWebViewEventData toProto() {
        return new PathfinderFallbackToWebViewEventData(this.surrogate.getPage(), (PathfinderFallbackToWebViewEventData.Reason) this.surrogate.getReason().toProto(), this.surrogate.getInquiry_id(), this.surrogate.getSequence(), null, 16, null);
    }

    public String toString() {
        return "[PathfinderFallbackToWebViewEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PathfinderFallbackToWebViewEventDataDto) && Intrinsics.areEqual(((PathfinderFallbackToWebViewEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\f\u0010\rBA\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0018\u0010!\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J@\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Surrogate;", "", "page", "", "reason", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "inquiry_id", "sequence", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPage$annotations", "()V", "getPage", "()Ljava/lang/String;", "getReason$annotations", "getReason", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "getInquiry_id$annotations", "getInquiry_id", "getSequence$annotations", "getSequence", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String inquiry_id;
        private final String page;
        private final ReasonDto reason;
        private final int sequence;

        public Surrogate() {
            this((String) null, (ReasonDto) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ReasonDto reasonDto, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.page;
            }
            if ((i2 & 2) != 0) {
                reasonDto = surrogate.reason;
            }
            if ((i2 & 4) != 0) {
                str2 = surrogate.inquiry_id;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.sequence;
            }
            return surrogate.copy(str, reasonDto, str2, i);
        }

        @SerialName("inquiryId")
        @JsonAnnotations2(names = {"inquiry_id"})
        public static /* synthetic */ void getInquiry_id$annotations() {
        }

        @SerialName("page")
        @JsonAnnotations2(names = {"page"})
        public static /* synthetic */ void getPage$annotations() {
        }

        @SerialName("reason")
        @JsonAnnotations2(names = {"reason"})
        public static /* synthetic */ void getReason$annotations() {
        }

        @SerialName("sequence")
        @JsonAnnotations2(names = {"sequence"})
        public static /* synthetic */ void getSequence$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPage() {
            return this.page;
        }

        /* renamed from: component2, reason: from getter */
        public final ReasonDto getReason() {
            return this.reason;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInquiry_id() {
            return this.inquiry_id;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSequence() {
            return this.sequence;
        }

        public final Surrogate copy(String page, ReasonDto reason, String inquiry_id, int sequence) {
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
            return new Surrogate(page, reason, inquiry_id, sequence);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.page, surrogate.page) && this.reason == surrogate.reason && Intrinsics.areEqual(this.inquiry_id, surrogate.inquiry_id) && this.sequence == surrogate.sequence;
        }

        public int hashCode() {
            return (((((this.page.hashCode() * 31) + this.reason.hashCode()) * 31) + this.inquiry_id.hashCode()) * 31) + Integer.hashCode(this.sequence);
        }

        public String toString() {
            return "Surrogate(page=" + this.page + ", reason=" + this.reason + ", inquiry_id=" + this.inquiry_id + ", sequence=" + this.sequence + ")";
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PathfinderFallbackToWebViewEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ReasonDto reasonDto, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.page = "";
            } else {
                this.page = str;
            }
            if ((i & 2) == 0) {
                this.reason = ReasonDto.INSTANCE.getZeroValue();
            } else {
                this.reason = reasonDto;
            }
            if ((i & 4) == 0) {
                this.inquiry_id = "";
            } else {
                this.inquiry_id = str2;
            }
            if ((i & 8) == 0) {
                this.sequence = 0;
            } else {
                this.sequence = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.page, "")) {
                output.encodeStringElement(serialDesc, 0, self.page);
            }
            if (self.reason != ReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ReasonDto.Serializer.INSTANCE, self.reason);
            }
            if (!Intrinsics.areEqual(self.inquiry_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.inquiry_id);
            }
            int i = self.sequence;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String page, ReasonDto reason, String inquiry_id, int i) {
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
            this.page = page;
            this.reason = reason;
            this.inquiry_id = inquiry_id;
            this.sequence = i;
        }

        public /* synthetic */ Surrogate(String str, ReasonDto reasonDto, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ReasonDto.INSTANCE.getZeroValue() : reasonDto, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i);
        }

        public final String getPage() {
            return this.page;
        }

        public final ReasonDto getReason() {
            return this.reason;
        }

        public final String getInquiry_id() {
            return this.inquiry_id;
        }

        public final int getSequence() {
            return this.sequence;
        }
    }

    /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PathfinderFallbackToWebViewEventDataDto, PathfinderFallbackToWebViewEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PathfinderFallbackToWebViewEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PathfinderFallbackToWebViewEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PathfinderFallbackToWebViewEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PathfinderFallbackToWebViewEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PathfinderFallbackToWebViewEventData> getProtoAdapter() {
            return PathfinderFallbackToWebViewEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PathfinderFallbackToWebViewEventDataDto getZeroValue() {
            return PathfinderFallbackToWebViewEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PathfinderFallbackToWebViewEventDataDto fromProto(PathfinderFallbackToWebViewEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PathfinderFallbackToWebViewEventDataDto(new Surrogate(proto.getPage(), ReasonDto.INSTANCE.fromProto(proto.getReason()), proto.getInquiry_id(), proto.getSequence()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PathfinderFallbackToWebViewEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PathfinderFallbackToWebViewEventDataDto(null, null, null, 0, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "REASON_UNSPECIFIED", "PAGE_DOES_NOT_EXIST", "INCOMPATIBLE_CLIENT_VERSION", "DESERIALIZATION_ERROR", "DID_NOT_FALLBACK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ReasonDto implements Dto2<PathfinderFallbackToWebViewEventData.Reason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ReasonDto, PathfinderFallbackToWebViewEventData.Reason>> binaryBase64Serializer$delegate;
        public static final ReasonDto REASON_UNSPECIFIED = new REASON_UNSPECIFIED("REASON_UNSPECIFIED", 0);
        public static final ReasonDto PAGE_DOES_NOT_EXIST = new PAGE_DOES_NOT_EXIST("PAGE_DOES_NOT_EXIST", 1);
        public static final ReasonDto INCOMPATIBLE_CLIENT_VERSION = new INCOMPATIBLE_CLIENT_VERSION("INCOMPATIBLE_CLIENT_VERSION", 2);
        public static final ReasonDto DESERIALIZATION_ERROR = new DESERIALIZATION_ERROR("DESERIALIZATION_ERROR", 3);
        public static final ReasonDto DID_NOT_FALLBACK = new DID_NOT_FALLBACK("DID_NOT_FALLBACK", 4);

        private static final /* synthetic */ ReasonDto[] $values() {
            return new ReasonDto[]{REASON_UNSPECIFIED, PAGE_DOES_NOT_EXIST, INCOMPATIBLE_CLIENT_VERSION, DESERIALIZATION_ERROR, DID_NOT_FALLBACK};
        }

        public /* synthetic */ ReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto.ReasonDto.REASON_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REASON_UNSPECIFIED extends ReasonDto {
            REASON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PathfinderFallbackToWebViewEventData.Reason toProto() {
                return PathfinderFallbackToWebViewEventData.Reason.REASON_UNSPECIFIED;
            }
        }

        private ReasonDto(String str, int i) {
        }

        static {
            ReasonDto[] reasonDtoArr$values = $values();
            $VALUES = reasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventDataDto$ReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PathfinderFallbackToWebViewEventDataDto.ReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto.ReasonDto.PAGE_DOES_NOT_EXIST", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAGE_DOES_NOT_EXIST extends ReasonDto {
            PAGE_DOES_NOT_EXIST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PathfinderFallbackToWebViewEventData.Reason toProto() {
                return PathfinderFallbackToWebViewEventData.Reason.PAGE_DOES_NOT_EXIST;
            }
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto.ReasonDto.INCOMPATIBLE_CLIENT_VERSION", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INCOMPATIBLE_CLIENT_VERSION extends ReasonDto {
            INCOMPATIBLE_CLIENT_VERSION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PathfinderFallbackToWebViewEventData.Reason toProto() {
                return PathfinderFallbackToWebViewEventData.Reason.INCOMPATIBLE_CLIENT_VERSION;
            }
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto.ReasonDto.DESERIALIZATION_ERROR", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DESERIALIZATION_ERROR extends ReasonDto {
            DESERIALIZATION_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PathfinderFallbackToWebViewEventData.Reason toProto() {
                return PathfinderFallbackToWebViewEventData.Reason.DESERIALIZATION_ERROR;
            }
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto.ReasonDto.DID_NOT_FALLBACK", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DID_NOT_FALLBACK extends ReasonDto {
            DID_NOT_FALLBACK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PathfinderFallbackToWebViewEventData.Reason toProto() {
                return PathfinderFallbackToWebViewEventData.Reason.DID_NOT_FALLBACK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ReasonDto, PathfinderFallbackToWebViewEventData.Reason> {

            /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PathfinderFallbackToWebViewEventData.Reason.values().length];
                    try {
                        iArr[PathfinderFallbackToWebViewEventData.Reason.REASON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PathfinderFallbackToWebViewEventData.Reason.PAGE_DOES_NOT_EXIST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PathfinderFallbackToWebViewEventData.Reason.INCOMPATIBLE_CLIENT_VERSION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PathfinderFallbackToWebViewEventData.Reason.DESERIALIZATION_ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PathfinderFallbackToWebViewEventData.Reason.DID_NOT_FALLBACK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) ReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PathfinderFallbackToWebViewEventData.Reason> getProtoAdapter() {
                return PathfinderFallbackToWebViewEventData.Reason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReasonDto getZeroValue() {
                return ReasonDto.REASON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReasonDto fromProto(PathfinderFallbackToWebViewEventData.Reason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ReasonDto.REASON_UNSPECIFIED;
                }
                if (i == 2) {
                    return ReasonDto.PAGE_DOES_NOT_EXIST;
                }
                if (i == 3) {
                    return ReasonDto.INCOMPATIBLE_CLIENT_VERSION;
                }
                if (i == 4) {
                    return ReasonDto.DESERIALIZATION_ERROR;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return ReasonDto.DID_NOT_FALLBACK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$ReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ReasonDto, PathfinderFallbackToWebViewEventData.Reason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PathfinderFallbackToWebViewEventData.Reason", ReasonDto.getEntries(), ReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ReasonDto valueOf(String str) {
            return (ReasonDto) Enum.valueOf(ReasonDto.class, str);
        }

        public static ReasonDto[] values() {
            return (ReasonDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PathfinderFallbackToWebViewEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PathfinderFallbackToWebViewEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PathfinderFallbackToWebViewEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PathfinderFallbackToWebViewEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PathfinderFallbackToWebViewEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PathfinderFallbackToWebViewEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventDataDto";
        }
    }
}
