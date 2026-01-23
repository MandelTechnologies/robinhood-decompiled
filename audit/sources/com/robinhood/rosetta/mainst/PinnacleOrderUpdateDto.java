package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.PinnacleUpdateDetailsDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PinnacleOrderUpdateDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0012JH\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdate;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "type", "", "account_id", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;", Constants.REFERRER_API_META, "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;Ljava/lang/String;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getAt", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getType", "()Ljava/lang/String;", "getAccount_id", "getDetails", "()Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;", "getMeta", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class PinnacleOrderUpdateDto implements Dto3<PinnacleOrderUpdate>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PinnacleOrderUpdateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PinnacleOrderUpdateDto, PinnacleOrderUpdate>> binaryBase64Serializer$delegate;
    private static final PinnacleOrderUpdateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PinnacleOrderUpdateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PinnacleOrderUpdateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final TimeDto getAt() {
        return this.surrogate.getAt();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final PinnacleUpdateDetailsDto getDetails() {
        return this.surrogate.getDetails();
    }

    public final String getMeta() {
        return this.surrogate.getMeta();
    }

    public /* synthetic */ PinnacleOrderUpdateDto(UUIDDto uUIDDto, TimeDto timeDto, String str, String str2, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : timeDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : pinnacleUpdateDetailsDto, (i & 32) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnacleOrderUpdateDto(UUIDDto uUIDDto, TimeDto timeDto, String type2, String account_id, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String meta) {
        this(new Surrogate(uUIDDto, timeDto, type2, account_id, pinnacleUpdateDetailsDto, meta));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(meta, "meta");
    }

    public static /* synthetic */ PinnacleOrderUpdateDto copy$default(PinnacleOrderUpdateDto pinnacleOrderUpdateDto, UUIDDto uUIDDto, TimeDto timeDto, String str, String str2, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            uUIDDto = pinnacleOrderUpdateDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            timeDto = pinnacleOrderUpdateDto.surrogate.getAt();
        }
        if ((i & 4) != 0) {
            str = pinnacleOrderUpdateDto.surrogate.getType();
        }
        if ((i & 8) != 0) {
            str2 = pinnacleOrderUpdateDto.surrogate.getAccount_id();
        }
        if ((i & 16) != 0) {
            pinnacleUpdateDetailsDto = pinnacleOrderUpdateDto.surrogate.getDetails();
        }
        if ((i & 32) != 0) {
            str3 = pinnacleOrderUpdateDto.surrogate.getMeta();
        }
        PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto2 = pinnacleUpdateDetailsDto;
        String str4 = str3;
        return pinnacleOrderUpdateDto.copy(uUIDDto, timeDto, str, str2, pinnacleUpdateDetailsDto2, str4);
    }

    public final PinnacleOrderUpdateDto copy(UUIDDto id, TimeDto at, String type2, String account_id, PinnacleUpdateDetailsDto details, String meta) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(meta, "meta");
        return new PinnacleOrderUpdateDto(new Surrogate(id, at, type2, account_id, details, meta));
    }

    @Override // com.robinhood.idl.Dto
    public PinnacleOrderUpdate toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        TimeDto at = this.surrogate.getAt();
        Time proto2 = at != null ? at.toProto() : null;
        String type2 = this.surrogate.getType();
        String account_id = this.surrogate.getAccount_id();
        PinnacleUpdateDetailsDto details = this.surrogate.getDetails();
        return new PinnacleOrderUpdate(proto, proto2, type2, account_id, details != null ? details.toProto() : null, this.surrogate.getMeta(), null, 64, null);
    }

    public String toString() {
        return "[PinnacleOrderUpdateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PinnacleOrderUpdateDto) && Intrinsics.areEqual(((PinnacleOrderUpdateDto) other).surrogate, this.surrogate);
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
    /* compiled from: PinnacleOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003JK\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u001c¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "type", "", "account_id", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;", Constants.REFERRER_API_META, "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getAt$annotations", "getAt", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getType$annotations", "getType", "()Ljava/lang/String;", "getAccount_id$annotations", "getAccount_id", "getDetails$annotations", "getDetails", "()Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetailsDto;", "getMeta$annotations", "getMeta", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final TimeDto at;
        private final PinnacleUpdateDetailsDto details;
        private final UUIDDto id;
        private final String meta;
        private final String type;

        public Surrogate() {
            this((UUIDDto) null, (TimeDto) null, (String) null, (String) null, (PinnacleUpdateDetailsDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, TimeDto timeDto, String str, String str2, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uUIDDto = surrogate.id;
            }
            if ((i & 2) != 0) {
                timeDto = surrogate.at;
            }
            if ((i & 4) != 0) {
                str = surrogate.type;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.account_id;
            }
            if ((i & 16) != 0) {
                pinnacleUpdateDetailsDto = surrogate.details;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.meta;
            }
            PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto2 = pinnacleUpdateDetailsDto;
            String str4 = str3;
            return surrogate.copy(uUIDDto, timeDto, str, str2, pinnacleUpdateDetailsDto2, str4);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("at")
        @JsonAnnotations2(names = {"at"})
        public static /* synthetic */ void getAt$annotations() {
        }

        @SerialName(ErrorBundle.DETAIL_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.DETAIL_ENTRY})
        public static /* synthetic */ void getDetails$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName(Constants.REFERRER_API_META)
        @JsonAnnotations2(names = {Constants.REFERRER_API_META})
        public static /* synthetic */ void getMeta$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final TimeDto getAt() {
            return this.at;
        }

        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component5, reason: from getter */
        public final PinnacleUpdateDetailsDto getDetails() {
            return this.details;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMeta() {
            return this.meta;
        }

        public final Surrogate copy(UUIDDto id, TimeDto at, String type2, String account_id, PinnacleUpdateDetailsDto details, String meta) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(meta, "meta");
            return new Surrogate(id, at, type2, account_id, details, meta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.at, surrogate.at) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.details, surrogate.details) && Intrinsics.areEqual(this.meta, surrogate.meta);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            TimeDto timeDto = this.at;
            int iHashCode2 = (((((iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31) + this.type.hashCode()) * 31) + this.account_id.hashCode()) * 31;
            PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto = this.details;
            return ((iHashCode2 + (pinnacleUpdateDetailsDto != null ? pinnacleUpdateDetailsDto.hashCode() : 0)) * 31) + this.meta.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", at=" + this.at + ", type=" + this.type + ", account_id=" + this.account_id + ", details=" + this.details + ", meta=" + this.meta + ")";
        }

        /* compiled from: PinnacleOrderUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PinnacleOrderUpdateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, TimeDto timeDto, String str, String str2, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.at = null;
            } else {
                this.at = timeDto;
            }
            if ((i & 4) == 0) {
                this.type = "";
            } else {
                this.type = str;
            }
            if ((i & 8) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 16) == 0) {
                this.details = null;
            } else {
                this.details = pinnacleUpdateDetailsDto;
            }
            if ((i & 32) == 0) {
                this.meta = "";
            } else {
                this.meta = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            TimeDto timeDto = self.at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TimeDto.Serializer.INSTANCE, timeDto);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 2, self.type);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_id);
            }
            PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto = self.details;
            if (pinnacleUpdateDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PinnacleUpdateDetailsDto.Serializer.INSTANCE, pinnacleUpdateDetailsDto);
            }
            if (Intrinsics.areEqual(self.meta, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.meta);
        }

        public Surrogate(UUIDDto uUIDDto, TimeDto timeDto, String type2, String account_id, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String meta) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(meta, "meta");
            this.id = uUIDDto;
            this.at = timeDto;
            this.type = type2;
            this.account_id = account_id;
            this.details = pinnacleUpdateDetailsDto;
            this.meta = meta;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, TimeDto timeDto, String str, String str2, PinnacleUpdateDetailsDto pinnacleUpdateDetailsDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : timeDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : pinnacleUpdateDetailsDto, (i & 32) != 0 ? "" : str3);
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final TimeDto getAt() {
            return this.at;
        }

        public final String getType() {
            return this.type;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final PinnacleUpdateDetailsDto getDetails() {
            return this.details;
        }

        public final String getMeta() {
            return this.meta;
        }
    }

    /* compiled from: PinnacleOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdate;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PinnacleOrderUpdateDto, PinnacleOrderUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PinnacleOrderUpdateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleOrderUpdateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleOrderUpdateDto> getBinaryBase64Serializer() {
            return (KSerializer) PinnacleOrderUpdateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PinnacleOrderUpdate> getProtoAdapter() {
            return PinnacleOrderUpdate.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleOrderUpdateDto getZeroValue() {
            return PinnacleOrderUpdateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleOrderUpdateDto fromProto(PinnacleOrderUpdate proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            Time at = proto.getAt();
            TimeDto timeDtoFromProto = at != null ? TimeDto.INSTANCE.fromProto(at) : null;
            String type2 = proto.getType();
            String account_id = proto.getAccount_id();
            PinnacleUpdateDetails details = proto.getDetails();
            return new PinnacleOrderUpdateDto(new Surrogate(uUIDDtoFromProto, timeDtoFromProto, type2, account_id, details != null ? PinnacleUpdateDetailsDto.INSTANCE.fromProto(details) : null, proto.getMeta()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.PinnacleOrderUpdateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinnacleOrderUpdateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PinnacleOrderUpdateDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PinnacleOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PinnacleOrderUpdateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.PinnacleOrderUpdate", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PinnacleOrderUpdateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PinnacleOrderUpdateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PinnacleOrderUpdateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PinnacleOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.PinnacleOrderUpdateDto";
        }
    }
}
