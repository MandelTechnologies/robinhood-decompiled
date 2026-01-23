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
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfoDto;
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

/* compiled from: ChallengeReplacementInfoDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\u0013\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Surrogate;)V", "old_challenge_id", "", "old_challenge_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "new_challenge_id", "new_challenge_type", "is_silent", "", "flow_id", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;ZLjava/lang/String;)V", "getOld_challenge_id", "()Ljava/lang/String;", "getOld_challenge_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "getNew_challenge_id", "getNew_challenge_type", "()Z", "getFlow_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ChallengeTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ChallengeReplacementInfoDto implements Dto3<ChallengeReplacementInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChallengeReplacementInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChallengeReplacementInfoDto, ChallengeReplacementInfo>> binaryBase64Serializer$delegate;
    private static final ChallengeReplacementInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChallengeReplacementInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChallengeReplacementInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOld_challenge_id() {
        return this.surrogate.getOld_challenge_id();
    }

    public final ChallengeTypeDto getOld_challenge_type() {
        return this.surrogate.getOld_challenge_type();
    }

    public final String getNew_challenge_id() {
        return this.surrogate.getNew_challenge_id();
    }

    public final ChallengeTypeDto getNew_challenge_type() {
        return this.surrogate.getNew_challenge_type();
    }

    public final boolean is_silent() {
        return this.surrogate.is_silent();
    }

    public final String getFlow_id() {
        return this.surrogate.getFlow_id();
    }

    public /* synthetic */ ChallengeReplacementInfoDto(String str, ChallengeTypeDto challengeTypeDto, String str2, ChallengeTypeDto challengeTypeDto2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ChallengeTypeDto.INSTANCE.getZeroValue() : challengeTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ChallengeTypeDto.INSTANCE.getZeroValue() : challengeTypeDto2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeReplacementInfoDto(String old_challenge_id, ChallengeTypeDto old_challenge_type, String new_challenge_id, ChallengeTypeDto new_challenge_type, boolean z, String flow_id) {
        this(new Surrogate(old_challenge_id, old_challenge_type, new_challenge_id, new_challenge_type, z, flow_id));
        Intrinsics.checkNotNullParameter(old_challenge_id, "old_challenge_id");
        Intrinsics.checkNotNullParameter(old_challenge_type, "old_challenge_type");
        Intrinsics.checkNotNullParameter(new_challenge_id, "new_challenge_id");
        Intrinsics.checkNotNullParameter(new_challenge_type, "new_challenge_type");
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
    }

    public static /* synthetic */ ChallengeReplacementInfoDto copy$default(ChallengeReplacementInfoDto challengeReplacementInfoDto, String str, ChallengeTypeDto challengeTypeDto, String str2, ChallengeTypeDto challengeTypeDto2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeReplacementInfoDto.surrogate.getOld_challenge_id();
        }
        if ((i & 2) != 0) {
            challengeTypeDto = challengeReplacementInfoDto.surrogate.getOld_challenge_type();
        }
        if ((i & 4) != 0) {
            str2 = challengeReplacementInfoDto.surrogate.getNew_challenge_id();
        }
        if ((i & 8) != 0) {
            challengeTypeDto2 = challengeReplacementInfoDto.surrogate.getNew_challenge_type();
        }
        if ((i & 16) != 0) {
            z = challengeReplacementInfoDto.surrogate.is_silent();
        }
        if ((i & 32) != 0) {
            str3 = challengeReplacementInfoDto.surrogate.getFlow_id();
        }
        boolean z2 = z;
        String str4 = str3;
        return challengeReplacementInfoDto.copy(str, challengeTypeDto, str2, challengeTypeDto2, z2, str4);
    }

    public final ChallengeReplacementInfoDto copy(String old_challenge_id, ChallengeTypeDto old_challenge_type, String new_challenge_id, ChallengeTypeDto new_challenge_type, boolean is_silent, String flow_id) {
        Intrinsics.checkNotNullParameter(old_challenge_id, "old_challenge_id");
        Intrinsics.checkNotNullParameter(old_challenge_type, "old_challenge_type");
        Intrinsics.checkNotNullParameter(new_challenge_id, "new_challenge_id");
        Intrinsics.checkNotNullParameter(new_challenge_type, "new_challenge_type");
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        return new ChallengeReplacementInfoDto(new Surrogate(old_challenge_id, old_challenge_type, new_challenge_id, new_challenge_type, is_silent, flow_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ChallengeReplacementInfo toProto() {
        return new ChallengeReplacementInfo(this.surrogate.getOld_challenge_id(), (ChallengeReplacementInfo.ChallengeType) this.surrogate.getOld_challenge_type().toProto(), this.surrogate.getNew_challenge_id(), (ChallengeReplacementInfo.ChallengeType) this.surrogate.getNew_challenge_type().toProto(), this.surrogate.is_silent(), this.surrogate.getFlow_id(), null, 64, null);
    }

    public String toString() {
        return "[ChallengeReplacementInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChallengeReplacementInfoDto) && Intrinsics.areEqual(((ChallengeReplacementInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: ChallengeReplacementInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JE\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\b\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Surrogate;", "", "old_challenge_id", "", "old_challenge_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "new_challenge_id", "new_challenge_type", "is_silent", "", "flow_id", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;ZLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOld_challenge_id$annotations", "()V", "getOld_challenge_id", "()Ljava/lang/String;", "getOld_challenge_type$annotations", "getOld_challenge_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "getNew_challenge_id$annotations", "getNew_challenge_id", "getNew_challenge_type$annotations", "getNew_challenge_type", "is_silent$annotations", "()Z", "getFlow_id$annotations", "getFlow_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String flow_id;
        private final boolean is_silent;
        private final String new_challenge_id;
        private final ChallengeTypeDto new_challenge_type;
        private final String old_challenge_id;
        private final ChallengeTypeDto old_challenge_type;

        public Surrogate() {
            this((String) null, (ChallengeTypeDto) null, (String) null, (ChallengeTypeDto) null, false, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ChallengeTypeDto challengeTypeDto, String str2, ChallengeTypeDto challengeTypeDto2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.old_challenge_id;
            }
            if ((i & 2) != 0) {
                challengeTypeDto = surrogate.old_challenge_type;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.new_challenge_id;
            }
            if ((i & 8) != 0) {
                challengeTypeDto2 = surrogate.new_challenge_type;
            }
            if ((i & 16) != 0) {
                z = surrogate.is_silent;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.flow_id;
            }
            boolean z2 = z;
            String str4 = str3;
            return surrogate.copy(str, challengeTypeDto, str2, challengeTypeDto2, z2, str4);
        }

        @SerialName("flowId")
        @JsonAnnotations2(names = {"flow_id"})
        public static /* synthetic */ void getFlow_id$annotations() {
        }

        @SerialName("newChallengeId")
        @JsonAnnotations2(names = {"new_challenge_id"})
        public static /* synthetic */ void getNew_challenge_id$annotations() {
        }

        @SerialName("newChallengeType")
        @JsonAnnotations2(names = {"new_challenge_type"})
        public static /* synthetic */ void getNew_challenge_type$annotations() {
        }

        @SerialName("oldChallengeId")
        @JsonAnnotations2(names = {"old_challenge_id"})
        public static /* synthetic */ void getOld_challenge_id$annotations() {
        }

        @SerialName("oldChallengeType")
        @JsonAnnotations2(names = {"old_challenge_type"})
        public static /* synthetic */ void getOld_challenge_type$annotations() {
        }

        @SerialName("isSilent")
        @JsonAnnotations2(names = {"is_silent"})
        public static /* synthetic */ void is_silent$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOld_challenge_id() {
            return this.old_challenge_id;
        }

        /* renamed from: component2, reason: from getter */
        public final ChallengeTypeDto getOld_challenge_type() {
            return this.old_challenge_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNew_challenge_id() {
            return this.new_challenge_id;
        }

        /* renamed from: component4, reason: from getter */
        public final ChallengeTypeDto getNew_challenge_type() {
            return this.new_challenge_type;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIs_silent() {
            return this.is_silent;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFlow_id() {
            return this.flow_id;
        }

        public final Surrogate copy(String old_challenge_id, ChallengeTypeDto old_challenge_type, String new_challenge_id, ChallengeTypeDto new_challenge_type, boolean is_silent, String flow_id) {
            Intrinsics.checkNotNullParameter(old_challenge_id, "old_challenge_id");
            Intrinsics.checkNotNullParameter(old_challenge_type, "old_challenge_type");
            Intrinsics.checkNotNullParameter(new_challenge_id, "new_challenge_id");
            Intrinsics.checkNotNullParameter(new_challenge_type, "new_challenge_type");
            Intrinsics.checkNotNullParameter(flow_id, "flow_id");
            return new Surrogate(old_challenge_id, old_challenge_type, new_challenge_id, new_challenge_type, is_silent, flow_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.old_challenge_id, surrogate.old_challenge_id) && this.old_challenge_type == surrogate.old_challenge_type && Intrinsics.areEqual(this.new_challenge_id, surrogate.new_challenge_id) && this.new_challenge_type == surrogate.new_challenge_type && this.is_silent == surrogate.is_silent && Intrinsics.areEqual(this.flow_id, surrogate.flow_id);
        }

        public int hashCode() {
            return (((((((((this.old_challenge_id.hashCode() * 31) + this.old_challenge_type.hashCode()) * 31) + this.new_challenge_id.hashCode()) * 31) + this.new_challenge_type.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_silent)) * 31) + this.flow_id.hashCode();
        }

        public String toString() {
            return "Surrogate(old_challenge_id=" + this.old_challenge_id + ", old_challenge_type=" + this.old_challenge_type + ", new_challenge_id=" + this.new_challenge_id + ", new_challenge_type=" + this.new_challenge_type + ", is_silent=" + this.is_silent + ", flow_id=" + this.flow_id + ")";
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChallengeReplacementInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ChallengeTypeDto challengeTypeDto, String str2, ChallengeTypeDto challengeTypeDto2, boolean z, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.old_challenge_id = "";
            } else {
                this.old_challenge_id = str;
            }
            if ((i & 2) == 0) {
                this.old_challenge_type = ChallengeTypeDto.INSTANCE.getZeroValue();
            } else {
                this.old_challenge_type = challengeTypeDto;
            }
            if ((i & 4) == 0) {
                this.new_challenge_id = "";
            } else {
                this.new_challenge_id = str2;
            }
            if ((i & 8) == 0) {
                this.new_challenge_type = ChallengeTypeDto.INSTANCE.getZeroValue();
            } else {
                this.new_challenge_type = challengeTypeDto2;
            }
            if ((i & 16) == 0) {
                this.is_silent = false;
            } else {
                this.is_silent = z;
            }
            if ((i & 32) == 0) {
                this.flow_id = "";
            } else {
                this.flow_id = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.old_challenge_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.old_challenge_id);
            }
            ChallengeTypeDto challengeTypeDto = self.old_challenge_type;
            ChallengeTypeDto.Companion companion = ChallengeTypeDto.INSTANCE;
            if (challengeTypeDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ChallengeTypeDto.Serializer.INSTANCE, self.old_challenge_type);
            }
            if (!Intrinsics.areEqual(self.new_challenge_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.new_challenge_id);
            }
            if (self.new_challenge_type != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ChallengeTypeDto.Serializer.INSTANCE, self.new_challenge_type);
            }
            boolean z = self.is_silent;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            if (Intrinsics.areEqual(self.flow_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.flow_id);
        }

        public Surrogate(String old_challenge_id, ChallengeTypeDto old_challenge_type, String new_challenge_id, ChallengeTypeDto new_challenge_type, boolean z, String flow_id) {
            Intrinsics.checkNotNullParameter(old_challenge_id, "old_challenge_id");
            Intrinsics.checkNotNullParameter(old_challenge_type, "old_challenge_type");
            Intrinsics.checkNotNullParameter(new_challenge_id, "new_challenge_id");
            Intrinsics.checkNotNullParameter(new_challenge_type, "new_challenge_type");
            Intrinsics.checkNotNullParameter(flow_id, "flow_id");
            this.old_challenge_id = old_challenge_id;
            this.old_challenge_type = old_challenge_type;
            this.new_challenge_id = new_challenge_id;
            this.new_challenge_type = new_challenge_type;
            this.is_silent = z;
            this.flow_id = flow_id;
        }

        public /* synthetic */ Surrogate(String str, ChallengeTypeDto challengeTypeDto, String str2, ChallengeTypeDto challengeTypeDto2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ChallengeTypeDto.INSTANCE.getZeroValue() : challengeTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ChallengeTypeDto.INSTANCE.getZeroValue() : challengeTypeDto2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3);
        }

        public final String getOld_challenge_id() {
            return this.old_challenge_id;
        }

        public final ChallengeTypeDto getOld_challenge_type() {
            return this.old_challenge_type;
        }

        public final String getNew_challenge_id() {
            return this.new_challenge_id;
        }

        public final ChallengeTypeDto getNew_challenge_type() {
            return this.new_challenge_type;
        }

        public final boolean is_silent() {
            return this.is_silent;
        }

        public final String getFlow_id() {
            return this.flow_id;
        }
    }

    /* compiled from: ChallengeReplacementInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ChallengeReplacementInfoDto, ChallengeReplacementInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChallengeReplacementInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChallengeReplacementInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChallengeReplacementInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) ChallengeReplacementInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChallengeReplacementInfo> getProtoAdapter() {
            return ChallengeReplacementInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChallengeReplacementInfoDto getZeroValue() {
            return ChallengeReplacementInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChallengeReplacementInfoDto fromProto(ChallengeReplacementInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String old_challenge_id = proto.getOld_challenge_id();
            ChallengeTypeDto.Companion companion = ChallengeTypeDto.INSTANCE;
            return new ChallengeReplacementInfoDto(new Surrogate(old_challenge_id, companion.fromProto(proto.getOld_challenge_type()), proto.getNew_challenge_id(), companion.fromProto(proto.getNew_challenge_type()), proto.getIs_silent(), proto.getFlow_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ChallengeReplacementInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeReplacementInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChallengeReplacementInfoDto(null, null, null, null, false, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeReplacementInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHALLENGE_TYPE_UNSPECIFIED", "SMS", "APP", "BACKUP_CODE", "EMAIL", "PROMPT", "WEBAUTHN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChallengeTypeDto implements Dto2<ChallengeReplacementInfo.ChallengeType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChallengeTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChallengeTypeDto, ChallengeReplacementInfo.ChallengeType>> binaryBase64Serializer$delegate;
        public static final ChallengeTypeDto CHALLENGE_TYPE_UNSPECIFIED = new CHALLENGE_TYPE_UNSPECIFIED("CHALLENGE_TYPE_UNSPECIFIED", 0);
        public static final ChallengeTypeDto SMS = new SMS("SMS", 1);
        public static final ChallengeTypeDto APP = new APP("APP", 2);
        public static final ChallengeTypeDto BACKUP_CODE = new BACKUP_CODE("BACKUP_CODE", 3);
        public static final ChallengeTypeDto EMAIL = new EMAIL("EMAIL", 4);
        public static final ChallengeTypeDto PROMPT = new PROMPT("PROMPT", 5);
        public static final ChallengeTypeDto WEBAUTHN = new WEBAUTHN("WEBAUTHN", 6);

        private static final /* synthetic */ ChallengeTypeDto[] $values() {
            return new ChallengeTypeDto[]{CHALLENGE_TYPE_UNSPECIFIED, SMS, APP, BACKUP_CODE, EMAIL, PROMPT, WEBAUTHN};
        }

        public /* synthetic */ ChallengeTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChallengeTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ChallengeTypeDto(String str, int i) {
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.CHALLENGE_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHALLENGE_TYPE_UNSPECIFIED extends ChallengeTypeDto {
            CHALLENGE_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
            }
        }

        static {
            ChallengeTypeDto[] challengeTypeDtoArr$values = $values();
            $VALUES = challengeTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ChallengeReplacementInfoDto$ChallengeTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChallengeReplacementInfoDto.ChallengeTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.SMS", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMS extends ChallengeTypeDto {
            SMS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.SMS;
            }
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.APP", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP extends ChallengeTypeDto {
            APP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.APP;
            }
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.BACKUP_CODE", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BACKUP_CODE extends ChallengeTypeDto {
            BACKUP_CODE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.BACKUP_CODE;
            }
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.EMAIL", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL extends ChallengeTypeDto {
            EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.EMAIL;
            }
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.PROMPT", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROMPT extends ChallengeTypeDto {
            PROMPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.PROMPT;
            }
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto.ChallengeTypeDto.WEBAUTHN", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEBAUTHN extends ChallengeTypeDto {
            WEBAUTHN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeReplacementInfo.ChallengeType toProto() {
                return ChallengeReplacementInfo.ChallengeType.WEBAUTHN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChallengeTypeDto, ChallengeReplacementInfo.ChallengeType> {

            /* compiled from: ChallengeReplacementInfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ChallengeReplacementInfo.ChallengeType.values().length];
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.SMS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.APP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.BACKUP_CODE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.EMAIL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.PROMPT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ChallengeReplacementInfo.ChallengeType.WEBAUTHN.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChallengeTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChallengeTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChallengeTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ChallengeTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChallengeReplacementInfo.ChallengeType> getProtoAdapter() {
                return ChallengeReplacementInfo.ChallengeType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChallengeTypeDto getZeroValue() {
                return ChallengeTypeDto.CHALLENGE_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChallengeTypeDto fromProto(ChallengeReplacementInfo.ChallengeType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ChallengeTypeDto.CHALLENGE_TYPE_UNSPECIFIED;
                    case 2:
                        return ChallengeTypeDto.SMS;
                    case 3:
                        return ChallengeTypeDto.APP;
                    case 4:
                        return ChallengeTypeDto.BACKUP_CODE;
                    case 5:
                        return ChallengeTypeDto.EMAIL;
                    case 6:
                        return ChallengeTypeDto.PROMPT;
                    case 7:
                        return ChallengeTypeDto.WEBAUTHN;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChallengeReplacementInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$ChallengeTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChallengeTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChallengeTypeDto, ChallengeReplacementInfo.ChallengeType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ChallengeReplacementInfo.ChallengeType", ChallengeTypeDto.getEntries(), ChallengeTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChallengeTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChallengeTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChallengeTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChallengeTypeDto valueOf(String str) {
            return (ChallengeTypeDto) Enum.valueOf(ChallengeTypeDto.class, str);
        }

        public static ChallengeTypeDto[] values() {
            return (ChallengeTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ChallengeReplacementInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ChallengeReplacementInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ChallengeReplacementInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChallengeReplacementInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChallengeReplacementInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChallengeReplacementInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChallengeReplacementInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ChallengeReplacementInfoDto";
        }
    }
}
