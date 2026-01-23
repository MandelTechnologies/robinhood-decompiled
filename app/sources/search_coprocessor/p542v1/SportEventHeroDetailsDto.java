package search_coprocessor.p542v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import search_coprocessor.p542v1.CustomColorDto;
import search_coprocessor.p542v1.SportEventHeroDetails;
import search_coprocessor.p542v1.SportEventHeroDetailsDto;

/* compiled from: SportEventHeroDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00071023456B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010.¨\u00067"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;)V", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "badge", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "status", "", "primary_status_text", "secondary_status_text", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "left_side", "right_side", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;)V", "toProto", "()Lsearch_coprocessor/v1/SportEventHeroDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;", "getBadge", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "getStatus", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "getPrimary_status_text", "getSecondary_status_text", "getLeft_side", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "getRight_side", "Companion", "Surrogate", "EventStatusDto", "BadgeDto", "EventSideDto", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class SportEventHeroDetailsDto implements Dto3<SportEventHeroDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SportEventHeroDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SportEventHeroDetailsDto, SportEventHeroDetails>> binaryBase64Serializer$delegate;
    private static final SportEventHeroDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SportEventHeroDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SportEventHeroDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BadgeDto getBadge() {
        return this.surrogate.getBadge();
    }

    public final EventStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getPrimary_status_text() {
        return this.surrogate.getPrimary_status_text();
    }

    public final String getSecondary_status_text() {
        return this.surrogate.getSecondary_status_text();
    }

    public final EventSideDto getLeft_side() {
        return this.surrogate.getLeft_side();
    }

    public final EventSideDto getRight_side() {
        return this.surrogate.getRight_side();
    }

    public /* synthetic */ SportEventHeroDetailsDto(BadgeDto badgeDto, EventStatusDto eventStatusDto, String str, String str2, EventSideDto eventSideDto, EventSideDto eventSideDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : badgeDto, (i & 2) != 0 ? EventStatusDto.INSTANCE.getZeroValue() : eventStatusDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : eventSideDto, (i & 32) != 0 ? null : eventSideDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportEventHeroDetailsDto(BadgeDto badgeDto, EventStatusDto status, String primary_status_text, String secondary_status_text, EventSideDto eventSideDto, EventSideDto eventSideDto2) {
        this(new Surrogate(badgeDto, status, primary_status_text, secondary_status_text, eventSideDto, eventSideDto2));
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(primary_status_text, "primary_status_text");
        Intrinsics.checkNotNullParameter(secondary_status_text, "secondary_status_text");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SportEventHeroDetails toProto() {
        BadgeDto badge = this.surrogate.getBadge();
        SportEventHeroDetails.Badge proto = badge != null ? badge.toProto() : null;
        SportEventHeroDetails.EventStatus eventStatus = (SportEventHeroDetails.EventStatus) this.surrogate.getStatus().toProto();
        String primary_status_text = this.surrogate.getPrimary_status_text();
        String secondary_status_text = this.surrogate.getSecondary_status_text();
        EventSideDto left_side = this.surrogate.getLeft_side();
        SportEventHeroDetails.EventSide proto2 = left_side != null ? left_side.toProto() : null;
        EventSideDto right_side = this.surrogate.getRight_side();
        return new SportEventHeroDetails(proto, eventStatus, primary_status_text, secondary_status_text, proto2, right_side != null ? right_side.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[SportEventHeroDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SportEventHeroDetailsDto) && Intrinsics.areEqual(((SportEventHeroDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001dR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010(\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b7\u0010(\u001a\u0004\b6\u00104¨\u0006:"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;", "", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "badge", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "status", "", "primary_status_text", "secondary_status_text", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "left_side", "right_side", "<init>", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;Ljava/lang/String;Ljava/lang/String;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "getBadge", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "getBadge$annotations", "()V", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "getStatus", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "getStatus$annotations", "Ljava/lang/String;", "getPrimary_status_text", "getPrimary_status_text$annotations", "getSecondary_status_text", "getSecondary_status_text$annotations", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "getLeft_side", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "getLeft_side$annotations", "getRight_side", "getRight_side$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BadgeDto badge;
        private final EventSideDto left_side;
        private final String primary_status_text;
        private final EventSideDto right_side;
        private final String secondary_status_text;
        private final EventStatusDto status;

        public Surrogate() {
            this((BadgeDto) null, (EventStatusDto) null, (String) null, (String) null, (EventSideDto) null, (EventSideDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.badge, surrogate.badge) && this.status == surrogate.status && Intrinsics.areEqual(this.primary_status_text, surrogate.primary_status_text) && Intrinsics.areEqual(this.secondary_status_text, surrogate.secondary_status_text) && Intrinsics.areEqual(this.left_side, surrogate.left_side) && Intrinsics.areEqual(this.right_side, surrogate.right_side);
        }

        public int hashCode() {
            BadgeDto badgeDto = this.badge;
            int iHashCode = (((((((badgeDto == null ? 0 : badgeDto.hashCode()) * 31) + this.status.hashCode()) * 31) + this.primary_status_text.hashCode()) * 31) + this.secondary_status_text.hashCode()) * 31;
            EventSideDto eventSideDto = this.left_side;
            int iHashCode2 = (iHashCode + (eventSideDto == null ? 0 : eventSideDto.hashCode())) * 31;
            EventSideDto eventSideDto2 = this.right_side;
            return iHashCode2 + (eventSideDto2 != null ? eventSideDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(badge=" + this.badge + ", status=" + this.status + ", primary_status_text=" + this.primary_status_text + ", secondary_status_text=" + this.secondary_status_text + ", left_side=" + this.left_side + ", right_side=" + this.right_side + ")";
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SportEventHeroDetailsDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BadgeDto badgeDto, EventStatusDto eventStatusDto, String str, String str2, EventSideDto eventSideDto, EventSideDto eventSideDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.badge = null;
            } else {
                this.badge = badgeDto;
            }
            if ((i & 2) == 0) {
                this.status = EventStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = eventStatusDto;
            }
            if ((i & 4) == 0) {
                this.primary_status_text = "";
            } else {
                this.primary_status_text = str;
            }
            if ((i & 8) == 0) {
                this.secondary_status_text = "";
            } else {
                this.secondary_status_text = str2;
            }
            if ((i & 16) == 0) {
                this.left_side = null;
            } else {
                this.left_side = eventSideDto;
            }
            if ((i & 32) == 0) {
                this.right_side = null;
            } else {
                this.right_side = eventSideDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BadgeDto badgeDto = self.badge;
            if (badgeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BadgeDto.Serializer.INSTANCE, badgeDto);
            }
            if (self.status != EventStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EventStatusDto.Serializer.INSTANCE, self.status);
            }
            if (!Intrinsics.areEqual(self.primary_status_text, "")) {
                output.encodeStringElement(serialDesc, 2, self.primary_status_text);
            }
            if (!Intrinsics.areEqual(self.secondary_status_text, "")) {
                output.encodeStringElement(serialDesc, 3, self.secondary_status_text);
            }
            EventSideDto eventSideDto = self.left_side;
            if (eventSideDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, EventSideDto.Serializer.INSTANCE, eventSideDto);
            }
            EventSideDto eventSideDto2 = self.right_side;
            if (eventSideDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, EventSideDto.Serializer.INSTANCE, eventSideDto2);
            }
        }

        public Surrogate(BadgeDto badgeDto, EventStatusDto status, String primary_status_text, String secondary_status_text, EventSideDto eventSideDto, EventSideDto eventSideDto2) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(primary_status_text, "primary_status_text");
            Intrinsics.checkNotNullParameter(secondary_status_text, "secondary_status_text");
            this.badge = badgeDto;
            this.status = status;
            this.primary_status_text = primary_status_text;
            this.secondary_status_text = secondary_status_text;
            this.left_side = eventSideDto;
            this.right_side = eventSideDto2;
        }

        public final BadgeDto getBadge() {
            return this.badge;
        }

        public final EventStatusDto getStatus() {
            return this.status;
        }

        public /* synthetic */ Surrogate(BadgeDto badgeDto, EventStatusDto eventStatusDto, String str, String str2, EventSideDto eventSideDto, EventSideDto eventSideDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : badgeDto, (i & 2) != 0 ? EventStatusDto.INSTANCE.getZeroValue() : eventStatusDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : eventSideDto, (i & 32) != 0 ? null : eventSideDto2);
        }

        public final String getPrimary_status_text() {
            return this.primary_status_text;
        }

        public final String getSecondary_status_text() {
            return this.secondary_status_text;
        }

        public final EventSideDto getLeft_side() {
            return this.left_side;
        }

        public final EventSideDto getRight_side() {
            return this.right_side;
        }
    }

    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SportEventHeroDetailsDto, SportEventHeroDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SportEventHeroDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SportEventHeroDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SportEventHeroDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) SportEventHeroDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SportEventHeroDetails> getProtoAdapter() {
            return SportEventHeroDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SportEventHeroDetailsDto getZeroValue() {
            return SportEventHeroDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SportEventHeroDetailsDto fromProto(SportEventHeroDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SportEventHeroDetails.Badge badge = proto.getBadge();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BadgeDto badgeDtoFromProto = badge != null ? BadgeDto.INSTANCE.fromProto(badge) : null;
            EventStatusDto eventStatusDtoFromProto = EventStatusDto.INSTANCE.fromProto(proto.getStatus());
            String primary_status_text = proto.getPrimary_status_text();
            String secondary_status_text = proto.getSecondary_status_text();
            SportEventHeroDetails.EventSide left_side = proto.getLeft_side();
            EventSideDto eventSideDtoFromProto = left_side != null ? EventSideDto.INSTANCE.fromProto(left_side) : null;
            SportEventHeroDetails.EventSide right_side = proto.getRight_side();
            return new SportEventHeroDetailsDto(new Surrogate(badgeDtoFromProto, eventStatusDtoFromProto, primary_status_text, secondary_status_text, eventSideDtoFromProto, right_side != null ? EventSideDto.INSTANCE.fromProto(right_side) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.SportEventHeroDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportEventHeroDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SportEventHeroDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_STATUS_UNSPECIFIED", "UPCOMING", "LIVE", "FINISHED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventStatusDto implements Dto2<SportEventHeroDetails.EventStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventStatusDto, SportEventHeroDetails.EventStatus>> binaryBase64Serializer$delegate;
        public static final EventStatusDto EVENT_STATUS_UNSPECIFIED = new EVENT_STATUS_UNSPECIFIED("EVENT_STATUS_UNSPECIFIED", 0);
        public static final EventStatusDto UPCOMING = new UPCOMING("UPCOMING", 1);
        public static final EventStatusDto LIVE = new LIVE("LIVE", 2);
        public static final EventStatusDto FINISHED = new FINISHED("FINISHED", 3);

        private static final /* synthetic */ EventStatusDto[] $values() {
            return new EventStatusDto[]{EVENT_STATUS_UNSPECIFIED, UPCOMING, LIVE, FINISHED};
        }

        public /* synthetic */ EventStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/SportEventHeroDetailsDto.EventStatusDto.EVENT_STATUS_UNSPECIFIED", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "toProto", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATUS_UNSPECIFIED extends EventStatusDto {
            EVENT_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SportEventHeroDetails.EventStatus toProto() {
                return SportEventHeroDetails.EventStatus.EVENT_STATUS_UNSPECIFIED;
            }
        }

        private EventStatusDto(String str, int i) {
        }

        static {
            EventStatusDto[] eventStatusDtoArr$values = $values();
            $VALUES = eventStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.SportEventHeroDetailsDto$EventStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportEventHeroDetailsDto.EventStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/SportEventHeroDetailsDto.EventStatusDto.UPCOMING", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "toProto", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPCOMING extends EventStatusDto {
            UPCOMING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SportEventHeroDetails.EventStatus toProto() {
                return SportEventHeroDetails.EventStatus.UPCOMING;
            }
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/SportEventHeroDetailsDto.EventStatusDto.LIVE", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "toProto", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIVE extends EventStatusDto {
            LIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SportEventHeroDetails.EventStatus toProto() {
                return SportEventHeroDetails.EventStatus.LIVE;
            }
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/SportEventHeroDetailsDto.EventStatusDto.FINISHED", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "toProto", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FINISHED extends EventStatusDto {
            FINISHED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SportEventHeroDetails.EventStatus toProto() {
                return SportEventHeroDetails.EventStatus.FINISHED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventStatusDto, SportEventHeroDetails.EventStatus> {

            /* compiled from: SportEventHeroDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SportEventHeroDetails.EventStatus.values().length];
                    try {
                        iArr[SportEventHeroDetails.EventStatus.EVENT_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SportEventHeroDetails.EventStatus.UPCOMING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SportEventHeroDetails.EventStatus.LIVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SportEventHeroDetails.EventStatus.FINISHED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) EventStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SportEventHeroDetails.EventStatus> getProtoAdapter() {
                return SportEventHeroDetails.EventStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventStatusDto getZeroValue() {
                return EventStatusDto.EVENT_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventStatusDto fromProto(SportEventHeroDetails.EventStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EventStatusDto.EVENT_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return EventStatusDto.UPCOMING;
                }
                if (i == 3) {
                    return EventStatusDto.LIVE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return EventStatusDto.FINISHED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EventStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventStatusDto, SportEventHeroDetails.EventStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/search_coprocessor.v1.SportEventHeroDetails.EventStatus", EventStatusDto.getEntries(), EventStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventStatusDto valueOf(String str) {
            return (EventStatusDto) Enum.valueOf(EventStatusDto.class, str);
        }

        public static EventStatusDto[] values() {
            return (EventStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;)V", "", "text", "Lsearch_coprocessor/v1/CustomColorDto;", ResourceTypes.COLOR, "(Ljava/lang/String;Lsearch_coprocessor/v1/CustomColorDto;)V", "toProto", "()Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;", "getText", "getColor", "()Lsearch_coprocessor/v1/CustomColorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class BadgeDto implements Dto3<SportEventHeroDetails.Badge>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<BadgeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<BadgeDto, SportEventHeroDetails.Badge>> binaryBase64Serializer$delegate;
        private static final BadgeDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ BadgeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private BadgeDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getText() {
            return this.surrogate.getText();
        }

        public final CustomColorDto getColor() {
            return this.surrogate.getColor();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BadgeDto(String text, CustomColorDto customColorDto) {
            this(new Surrogate(text, customColorDto));
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public /* synthetic */ BadgeDto(String str, CustomColorDto customColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : customColorDto);
        }

        @Override // com.robinhood.idl.Dto
        public SportEventHeroDetails.Badge toProto() {
            String text = this.surrogate.getText();
            CustomColorDto color = this.surrogate.getColor();
            return new SportEventHeroDetails.Badge(text, color != null ? color.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[BadgeDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof BadgeDto) && Intrinsics.areEqual(((BadgeDto) other).surrogate, this.surrogate);
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
        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;", "", "", "text", "Lsearch_coprocessor/v1/CustomColorDto;", ResourceTypes.COLOR, "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/CustomColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lsearch_coprocessor/v1/CustomColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Lsearch_coprocessor/v1/CustomColorDto;", "getColor", "()Lsearch_coprocessor/v1/CustomColorDto;", "getColor$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CustomColorDto color;
            private final String text;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (CustomColorDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.color, surrogate.color);
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                CustomColorDto customColorDto = this.color;
                return iHashCode + (customColorDto == null ? 0 : customColorDto.hashCode());
            }

            public String toString() {
                return "Surrogate(text=" + this.text + ", color=" + this.color + ")";
            }

            /* compiled from: SportEventHeroDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return SportEventHeroDetailsDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, CustomColorDto customColorDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.text = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.color = null;
                } else {
                    this.color = customColorDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.text, "")) {
                    output.encodeStringElement(serialDesc, 0, self.text);
                }
                CustomColorDto customColorDto = self.color;
                if (customColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, CustomColorDto.Serializer.INSTANCE, customColorDto);
                }
            }

            public Surrogate(String text, CustomColorDto customColorDto) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.color = customColorDto;
            }

            public final String getText() {
                return this.text;
            }

            public /* synthetic */ Surrogate(String str, CustomColorDto customColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : customColorDto);
            }

            public final CustomColorDto getColor() {
                return this.color;
            }
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails$Badge;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<BadgeDto, SportEventHeroDetails.Badge> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BadgeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<BadgeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<BadgeDto> getBinaryBase64Serializer() {
                return (KSerializer) BadgeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SportEventHeroDetails.Badge> getProtoAdapter() {
                return SportEventHeroDetails.Badge.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BadgeDto getZeroValue() {
                return BadgeDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BadgeDto fromProto(SportEventHeroDetails.Badge proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String text = proto.getText();
                CustomColor color = proto.getColor();
                return new BadgeDto(new Surrogate(text, color != null ? CustomColorDto.INSTANCE.fromProto(color) : null), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.SportEventHeroDetailsDto$BadgeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportEventHeroDetailsDto.BadgeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new BadgeDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<BadgeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.SportEventHeroDetails.Badge", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, BadgeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public BadgeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new BadgeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$BadgeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "search_coprocessor.v1.SportEventHeroDetailsDto$BadgeDto";
            }
        }
    }

    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u0019¨\u00069"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;)V", "", "id", "score", "", "show_indicator", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "Lcom/robinhood/idl/IdlDecimal;", "display_price", "open_interest", "image_url", "Lsearch_coprocessor/v1/CustomColorDto;", ResourceTypes.COLOR, "cta_text", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lsearch_coprocessor/v1/CustomColorDto;Ljava/lang/String;)V", "toProto", "()Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;", "getId", "getScore", "getShow_indicator", "()Z", "getDisplay_name", "getDisplay_price", "()Lcom/robinhood/idl/IdlDecimal;", "getOpen_interest", "getImage_url", "getColor", "()Lsearch_coprocessor/v1/CustomColorDto;", "getCta_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventSideDto implements Dto3<SportEventHeroDetails.EventSide>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<EventSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventSideDto, SportEventHeroDetails.EventSide>> binaryBase64Serializer$delegate;
        private static final EventSideDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ EventSideDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EventSideDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getId() {
            return this.surrogate.getId();
        }

        public final String getScore() {
            return this.surrogate.getScore();
        }

        public final boolean getShow_indicator() {
            return this.surrogate.getShow_indicator();
        }

        public final String getDisplay_name() {
            return this.surrogate.getDisplay_name();
        }

        public final IdlDecimal getDisplay_price() {
            return this.surrogate.getDisplay_price();
        }

        public final IdlDecimal getOpen_interest() {
            return this.surrogate.getOpen_interest();
        }

        public final String getImage_url() {
            return this.surrogate.getImage_url();
        }

        public final CustomColorDto getColor() {
            return this.surrogate.getColor();
        }

        public final String getCta_text() {
            return this.surrogate.getCta_text();
        }

        public /* synthetic */ EventSideDto(String str, String str2, boolean z, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, CustomColorDto customColorDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : customColorDto, (i & 256) != 0 ? "" : str5);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EventSideDto(String id, String str, boolean z, String display_name, IdlDecimal display_price, IdlDecimal open_interest, String str2, CustomColorDto customColorDto, String cta_text) {
            this(new Surrogate(id, str, z, display_name, display_price, open_interest, str2, customColorDto, cta_text));
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(display_price, "display_price");
            Intrinsics.checkNotNullParameter(open_interest, "open_interest");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        }

        @Override // com.robinhood.idl.Dto
        public SportEventHeroDetails.EventSide toProto() {
            String id = this.surrogate.getId();
            String score = this.surrogate.getScore();
            boolean show_indicator = this.surrogate.getShow_indicator();
            String display_name = this.surrogate.getDisplay_name();
            String stringValue = this.surrogate.getDisplay_price().getStringValue();
            String stringValue2 = this.surrogate.getOpen_interest().getStringValue();
            String image_url = this.surrogate.getImage_url();
            CustomColorDto color = this.surrogate.getColor();
            return new SportEventHeroDetails.EventSide(id, score, show_indicator, display_name, stringValue, stringValue2, image_url, color != null ? color.toProto() : null, this.surrogate.getCta_text(), null, 512, null);
        }

        public String toString() {
            return "[EventSideDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof EventSideDto) && Intrinsics.areEqual(((EventSideDto) other).surrogate, this.surrogate);
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
        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013Bs\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010#R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010#R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010#R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010,\u001a\u0004\b6\u00107R/\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b:\u0010,\u001a\u0004\b9\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010)\u0012\u0004\b<\u0010,\u001a\u0004\b;\u0010#R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\b@\u0010,\u001a\u0004\b>\u0010?R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010)\u0012\u0004\bB\u0010,\u001a\u0004\bA\u0010#¨\u0006E"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;", "", "", "id", "score", "", "show_indicator", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "display_price", "open_interest", "image_url", "Lsearch_coprocessor/v1/CustomColorDto;", ResourceTypes.COLOR, "cta_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lsearch_coprocessor/v1/CustomColorDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lsearch_coprocessor/v1/CustomColorDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getScore", "getScore$annotations", "Z", "getShow_indicator", "()Z", "getShow_indicator$annotations", "getDisplay_name", "getDisplay_name$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getDisplay_price", "()Lcom/robinhood/idl/IdlDecimal;", "getDisplay_price$annotations", "getOpen_interest", "getOpen_interest$annotations", "getImage_url", "getImage_url$annotations", "Lsearch_coprocessor/v1/CustomColorDto;", "getColor", "()Lsearch_coprocessor/v1/CustomColorDto;", "getColor$annotations", "getCta_text", "getCta_text$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CustomColorDto color;
            private final String cta_text;
            private final String display_name;
            private final IdlDecimal display_price;
            private final String id;
            private final String image_url;
            private final IdlDecimal open_interest;
            private final String score;
            private final boolean show_indicator;

            public Surrogate() {
                this((String) null, (String) null, false, (String) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (CustomColorDto) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.score, surrogate.score) && this.show_indicator == surrogate.show_indicator && Intrinsics.areEqual(this.display_name, surrogate.display_name) && Intrinsics.areEqual(this.display_price, surrogate.display_price) && Intrinsics.areEqual(this.open_interest, surrogate.open_interest) && Intrinsics.areEqual(this.image_url, surrogate.image_url) && Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.cta_text, surrogate.cta_text);
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.score;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.show_indicator)) * 31) + this.display_name.hashCode()) * 31) + this.display_price.hashCode()) * 31) + this.open_interest.hashCode()) * 31;
                String str2 = this.image_url;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                CustomColorDto customColorDto = this.color;
                return ((iHashCode3 + (customColorDto != null ? customColorDto.hashCode() : 0)) * 31) + this.cta_text.hashCode();
            }

            public String toString() {
                return "Surrogate(id=" + this.id + ", score=" + this.score + ", show_indicator=" + this.show_indicator + ", display_name=" + this.display_name + ", display_price=" + this.display_price + ", open_interest=" + this.open_interest + ", image_url=" + this.image_url + ", color=" + this.color + ", cta_text=" + this.cta_text + ")";
            }

            /* compiled from: SportEventHeroDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return SportEventHeroDetailsDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, CustomColorDto customColorDto, String str5, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.score = null;
                } else {
                    this.score = str2;
                }
                if ((i & 4) == 0) {
                    this.show_indicator = false;
                } else {
                    this.show_indicator = z;
                }
                if ((i & 8) == 0) {
                    this.display_name = "";
                } else {
                    this.display_name = str3;
                }
                if ((i & 16) == 0) {
                    this.display_price = new IdlDecimal("");
                } else {
                    this.display_price = idlDecimal;
                }
                if ((i & 32) == 0) {
                    this.open_interest = new IdlDecimal("");
                } else {
                    this.open_interest = idlDecimal2;
                }
                if ((i & 64) == 0) {
                    this.image_url = null;
                } else {
                    this.image_url = str4;
                }
                if ((i & 128) == 0) {
                    this.color = null;
                } else {
                    this.color = customColorDto;
                }
                if ((i & 256) == 0) {
                    this.cta_text = "";
                } else {
                    this.cta_text = str5;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.id);
                }
                String str = self.score;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
                }
                boolean z = self.show_indicator;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 2, z);
                }
                if (!Intrinsics.areEqual(self.display_name, "")) {
                    output.encodeStringElement(serialDesc, 3, self.display_name);
                }
                if (!Intrinsics.areEqual(self.display_price, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.display_price);
                }
                if (!Intrinsics.areEqual(self.open_interest, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.open_interest);
                }
                String str2 = self.image_url;
                if (str2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
                }
                CustomColorDto customColorDto = self.color;
                if (customColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, CustomColorDto.Serializer.INSTANCE, customColorDto);
                }
                if (Intrinsics.areEqual(self.cta_text, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 8, self.cta_text);
            }

            public Surrogate(String id, String str, boolean z, String display_name, IdlDecimal display_price, IdlDecimal open_interest, String str2, CustomColorDto customColorDto, String cta_text) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(display_name, "display_name");
                Intrinsics.checkNotNullParameter(display_price, "display_price");
                Intrinsics.checkNotNullParameter(open_interest, "open_interest");
                Intrinsics.checkNotNullParameter(cta_text, "cta_text");
                this.id = id;
                this.score = str;
                this.show_indicator = z;
                this.display_name = display_name;
                this.display_price = display_price;
                this.open_interest = open_interest;
                this.image_url = str2;
                this.color = customColorDto;
                this.cta_text = cta_text;
            }

            public /* synthetic */ Surrogate(String str, String str2, boolean z, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, CustomColorDto customColorDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : customColorDto, (i & 256) != 0 ? "" : str5);
            }

            public final String getId() {
                return this.id;
            }

            public final String getScore() {
                return this.score;
            }

            public final boolean getShow_indicator() {
                return this.show_indicator;
            }

            public final String getDisplay_name() {
                return this.display_name;
            }

            public final IdlDecimal getDisplay_price() {
                return this.display_price;
            }

            public final IdlDecimal getOpen_interest() {
                return this.open_interest;
            }

            public final String getImage_url() {
                return this.image_url;
            }

            public final CustomColorDto getColor() {
                return this.color;
            }

            public final String getCta_text() {
                return this.cta_text;
            }
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "Lsearch_coprocessor/v1/SportEventHeroDetails$EventSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<EventSideDto, SportEventHeroDetails.EventSide> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventSideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventSideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventSideDto> getBinaryBase64Serializer() {
                return (KSerializer) EventSideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SportEventHeroDetails.EventSide> getProtoAdapter() {
                return SportEventHeroDetails.EventSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventSideDto getZeroValue() {
                return EventSideDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventSideDto fromProto(SportEventHeroDetails.EventSide proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String id = proto.getId();
                String score = proto.getScore();
                boolean show_indicator = proto.getShow_indicator();
                String display_name = proto.getDisplay_name();
                IdlDecimal idlDecimal = new IdlDecimal(proto.getDisplay_price());
                IdlDecimal idlDecimal2 = new IdlDecimal(proto.getOpen_interest());
                String image_url = proto.getImage_url();
                CustomColor color = proto.getColor();
                return new EventSideDto(new Surrogate(id, score, show_indicator, display_name, idlDecimal, idlDecimal2, image_url, color != null ? CustomColorDto.INSTANCE.fromProto(color) : null, proto.getCta_text()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.SportEventHeroDetailsDto$EventSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportEventHeroDetailsDto.EventSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new EventSideDto(null, null, false, null, null, null, null, null, null, 511, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EventSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.SportEventHeroDetails.EventSide", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventSideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public EventSideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new EventSideDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SportEventHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "search_coprocessor.v1.SportEventHeroDetailsDto$EventSideDto";
            }
        }
    }

    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SportEventHeroDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.SportEventHeroDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SportEventHeroDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SportEventHeroDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SportEventHeroDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SportEventHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/SportEventHeroDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "search_coprocessor.v1.SportEventHeroDetailsDto";
        }
    }
}
