package rosetta.midas.p538v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;
import rosetta.midas.p538v1.IncentiveCCCreditLimitIncreaseDto;
import rosetta.midas.p538v1.PromotionDetails;
import rosetta.midas.p538v1.PromotionDetailsDto;

/* compiled from: PromotionDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006(')*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006-"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/PromotionDetails;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;)V", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "promotion_eligibility_details", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "promotion_participation_details", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;)V", "toProto", "()Lrosetta/midas/v1/PromotionDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;", "Companion", "Surrogate", "PromotionEligibilityDetailsDto", "PromotionParticipationDetailsDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class PromotionDetailsDto implements Dto3<PromotionDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PromotionDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PromotionDetailsDto, PromotionDetails>> binaryBase64Serializer$delegate;
    private static final PromotionDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PromotionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PromotionDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PromotionDetailsDto(java.lang.String r2, p479j$.time.Instant r3, p479j$.time.Instant r4, rosetta.midas.v1.PromotionDetailsDto.PromotionEligibilityDetailsDto r5, rosetta.midas.v1.PromotionDetailsDto.PromotionParticipationDetailsDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rosetta.midas.p538v1.PromotionDetailsDto.<init>(java.lang.String, j$.time.Instant, j$.time.Instant, rosetta.midas.v1.PromotionDetailsDto$PromotionEligibilityDetailsDto, rosetta.midas.v1.PromotionDetailsDto$PromotionParticipationDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromotionDetailsDto(String uuid, Instant instant, Instant instant2, PromotionEligibilityDetailsDto promotionEligibilityDetailsDto, PromotionParticipationDetailsDto promotionParticipationDetailsDto) {
        this(new Surrogate(uuid, instant, instant2, promotionEligibilityDetailsDto, promotionParticipationDetailsDto));
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }

    @Override // com.robinhood.idl.Dto
    public PromotionDetails toProto() {
        String uuid = this.surrogate.getUuid();
        Instant start_date = this.surrogate.getStart_date();
        Instant end_date = this.surrogate.getEnd_date();
        PromotionEligibilityDetailsDto promotion_eligibility_details = this.surrogate.getPromotion_eligibility_details();
        PromotionDetails.PromotionEligibilityDetails proto = promotion_eligibility_details != null ? promotion_eligibility_details.toProto() : null;
        PromotionParticipationDetailsDto promotion_participation_details = this.surrogate.getPromotion_participation_details();
        return new PromotionDetails(uuid, start_date, end_date, proto, promotion_participation_details != null ? promotion_participation_details.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[PromotionDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PromotionDetailsDto) && Intrinsics.areEqual(((PromotionDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PromotionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-RF\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b8\u0010*\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;", "", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "start_date", "end_date", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "promotion_eligibility_details", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "promotion_participation_details", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getUuid$annotations", "()V", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getStart_date$annotations", "getEnd_date", "getEnd_date$annotations", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "getPromotion_eligibility_details", "()Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "getPromotion_eligibility_details$annotations", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "getPromotion_participation_details", "()Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "getPromotion_participation_details$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant end_date;
        private final PromotionEligibilityDetailsDto promotion_eligibility_details;
        private final PromotionParticipationDetailsDto promotion_participation_details;
        private final Instant start_date;
        private final String uuid;

        public Surrogate() {
            this((String) null, (Instant) null, (Instant) null, (PromotionEligibilityDetailsDto) null, (PromotionParticipationDetailsDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.end_date, surrogate.end_date) && Intrinsics.areEqual(this.promotion_eligibility_details, surrogate.promotion_eligibility_details) && Intrinsics.areEqual(this.promotion_participation_details, surrogate.promotion_participation_details);
        }

        public int hashCode() {
            int iHashCode = this.uuid.hashCode() * 31;
            Instant instant = this.start_date;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.end_date;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            PromotionEligibilityDetailsDto promotionEligibilityDetailsDto = this.promotion_eligibility_details;
            int iHashCode4 = (iHashCode3 + (promotionEligibilityDetailsDto == null ? 0 : promotionEligibilityDetailsDto.hashCode())) * 31;
            PromotionParticipationDetailsDto promotionParticipationDetailsDto = this.promotion_participation_details;
            return iHashCode4 + (promotionParticipationDetailsDto != null ? promotionParticipationDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(uuid=" + this.uuid + ", start_date=" + this.start_date + ", end_date=" + this.end_date + ", promotion_eligibility_details=" + this.promotion_eligibility_details + ", promotion_participation_details=" + this.promotion_participation_details + ")";
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PromotionDetailsDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, Instant instant2, PromotionEligibilityDetailsDto promotionEligibilityDetailsDto, PromotionParticipationDetailsDto promotionParticipationDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.uuid = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.start_date = null;
            } else {
                this.start_date = instant;
            }
            if ((i & 4) == 0) {
                this.end_date = null;
            } else {
                this.end_date = instant2;
            }
            if ((i & 8) == 0) {
                this.promotion_eligibility_details = null;
            } else {
                this.promotion_eligibility_details = promotionEligibilityDetailsDto;
            }
            if ((i & 16) == 0) {
                this.promotion_participation_details = null;
            } else {
                this.promotion_participation_details = promotionParticipationDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 0, self.uuid);
            }
            Instant instant = self.start_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.end_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
            }
            PromotionEligibilityDetailsDto promotionEligibilityDetailsDto = self.promotion_eligibility_details;
            if (promotionEligibilityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PromotionEligibilityDetailsDto.Serializer.INSTANCE, promotionEligibilityDetailsDto);
            }
            PromotionParticipationDetailsDto promotionParticipationDetailsDto = self.promotion_participation_details;
            if (promotionParticipationDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PromotionParticipationDetailsDto.Serializer.INSTANCE, promotionParticipationDetailsDto);
            }
        }

        public Surrogate(String uuid, Instant instant, Instant instant2, PromotionEligibilityDetailsDto promotionEligibilityDetailsDto, PromotionParticipationDetailsDto promotionParticipationDetailsDto) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.uuid = uuid;
            this.start_date = instant;
            this.end_date = instant2;
            this.promotion_eligibility_details = promotionEligibilityDetailsDto;
            this.promotion_participation_details = promotionParticipationDetailsDto;
        }

        public final String getUuid() {
            return this.uuid;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, p479j$.time.Instant r3, p479j$.time.Instant r4, rosetta.midas.v1.PromotionDetailsDto.PromotionEligibilityDetailsDto r5, rosetta.midas.v1.PromotionDetailsDto.PromotionParticipationDetailsDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L11
                r4 = r0
            L11:
                r8 = r7 & 8
                if (r8 == 0) goto L16
                r5 = r0
            L16:
                r7 = r7 & 16
                if (r7 == 0) goto L21
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L27
            L21:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L27:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rosetta.midas.p538v1.PromotionDetailsDto.Surrogate.<init>(java.lang.String, j$.time.Instant, j$.time.Instant, rosetta.midas.v1.PromotionDetailsDto$PromotionEligibilityDetailsDto, rosetta.midas.v1.PromotionDetailsDto$PromotionParticipationDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getStart_date() {
            return this.start_date;
        }

        public final Instant getEnd_date() {
            return this.end_date;
        }

        public final PromotionEligibilityDetailsDto getPromotion_eligibility_details() {
            return this.promotion_eligibility_details;
        }

        public final PromotionParticipationDetailsDto getPromotion_participation_details() {
            return this.promotion_participation_details;
        }
    }

    /* compiled from: PromotionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/PromotionDetailsDto;", "Lrosetta/midas/v1/PromotionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/PromotionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PromotionDetailsDto, PromotionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PromotionDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PromotionDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PromotionDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PromotionDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PromotionDetails> getProtoAdapter() {
            return PromotionDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PromotionDetailsDto getZeroValue() {
            return PromotionDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PromotionDetailsDto fromProto(PromotionDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String uuid = proto.getUuid();
            Instant start_date = proto.getStart_date();
            Instant end_date = proto.getEnd_date();
            PromotionDetails.PromotionEligibilityDetails promotion_eligibility_details = proto.getPromotion_eligibility_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PromotionEligibilityDetailsDto promotionEligibilityDetailsDtoFromProto = promotion_eligibility_details != null ? PromotionEligibilityDetailsDto.INSTANCE.fromProto(promotion_eligibility_details) : null;
            PromotionDetails.PromotionParticipationDetails promotion_participation_details = proto.getPromotion_participation_details();
            return new PromotionDetailsDto(new Surrogate(uuid, start_date, end_date, promotionEligibilityDetailsDtoFromProto, promotion_participation_details != null ? PromotionParticipationDetailsDto.INSTANCE.fromProto(promotion_participation_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.PromotionDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromotionDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PromotionDetailsDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PromotionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006+"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;)V", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "campaign_id", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto;)V", "toProto", "()Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;", "Companion", "Surrogate", "DetailsDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PromotionEligibilityDetailsDto implements Dto3<PromotionDetails.PromotionEligibilityDetails>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PromotionEligibilityDetailsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PromotionEligibilityDetailsDto, PromotionDetails.PromotionEligibilityDetails>> binaryBase64Serializer$delegate;
        private static final PromotionEligibilityDetailsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PromotionEligibilityDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PromotionEligibilityDetailsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ PromotionEligibilityDetailsDto(String str, Instant instant, Instant instant2, String str2, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : detailsDto);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PromotionEligibilityDetailsDto(String uuid, Instant instant, Instant instant2, String campaign_id, DetailsDto detailsDto) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            DetailsDto.IncentiveCcCreditLimitIncrease incentiveCcCreditLimitIncrease = detailsDto instanceof DetailsDto.IncentiveCcCreditLimitIncrease ? (DetailsDto.IncentiveCcCreditLimitIncrease) detailsDto : null;
            this(new Surrogate(uuid, instant, instant2, campaign_id, incentiveCcCreditLimitIncrease != null ? incentiveCcCreditLimitIncrease.getValue() : null));
        }

        @Override // com.robinhood.idl.Dto
        public PromotionDetails.PromotionEligibilityDetails toProto() {
            String uuid = this.surrogate.getUuid();
            Instant start_date = this.surrogate.getStart_date();
            Instant end_date = this.surrogate.getEnd_date();
            String campaign_id = this.surrogate.getCampaign_id();
            IncentiveCCCreditLimitIncreaseDto incentive_cc_credit_limit_increase = this.surrogate.getIncentive_cc_credit_limit_increase();
            return new PromotionDetails.PromotionEligibilityDetails(uuid, start_date, end_date, campaign_id, incentive_cc_credit_limit_increase != null ? incentive_cc_credit_limit_increase.toProto() : null, null, 32, null);
        }

        public String toString() {
            return "[PromotionEligibilityDetailsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PromotionEligibilityDetailsDto) && Intrinsics.areEqual(((PromotionEligibilityDetailsDto) other).surrogate, this.surrogate);
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
        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fRF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,RF\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010,R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;", "", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "start_date", "end_date", "campaign_id", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "incentive_cc_credit_limit_increase", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getUuid$annotations", "()V", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getStart_date$annotations", "getEnd_date", "getEnd_date$annotations", "getCampaign_id", "getCampaign_id$annotations", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "getIncentive_cc_credit_limit_increase", "()Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "getIncentive_cc_credit_limit_increase$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String campaign_id;
            private final Instant end_date;
            private final IncentiveCCCreditLimitIncreaseDto incentive_cc_credit_limit_increase;
            private final Instant start_date;
            private final String uuid;

            public Surrogate() {
                this((String) null, (Instant) null, (Instant) null, (String) null, (IncentiveCCCreditLimitIncreaseDto) null, 31, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.end_date, surrogate.end_date) && Intrinsics.areEqual(this.campaign_id, surrogate.campaign_id) && Intrinsics.areEqual(this.incentive_cc_credit_limit_increase, surrogate.incentive_cc_credit_limit_increase);
            }

            public int hashCode() {
                int iHashCode = this.uuid.hashCode() * 31;
                Instant instant = this.start_date;
                int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
                Instant instant2 = this.end_date;
                int iHashCode3 = (((iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.campaign_id.hashCode()) * 31;
                IncentiveCCCreditLimitIncreaseDto incentiveCCCreditLimitIncreaseDto = this.incentive_cc_credit_limit_increase;
                return iHashCode3 + (incentiveCCCreditLimitIncreaseDto != null ? incentiveCCCreditLimitIncreaseDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(uuid=" + this.uuid + ", start_date=" + this.start_date + ", end_date=" + this.end_date + ", campaign_id=" + this.campaign_id + ", incentive_cc_credit_limit_increase=" + this.incentive_cc_credit_limit_increase + ")";
            }

            /* compiled from: PromotionDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return PromotionDetailsDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, Instant instant, Instant instant2, String str2, IncentiveCCCreditLimitIncreaseDto incentiveCCCreditLimitIncreaseDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.uuid = "";
                } else {
                    this.uuid = str;
                }
                if ((i & 2) == 0) {
                    this.start_date = null;
                } else {
                    this.start_date = instant;
                }
                if ((i & 4) == 0) {
                    this.end_date = null;
                } else {
                    this.end_date = instant2;
                }
                if ((i & 8) == 0) {
                    this.campaign_id = "";
                } else {
                    this.campaign_id = str2;
                }
                if ((i & 16) == 0) {
                    this.incentive_cc_credit_limit_increase = null;
                } else {
                    this.incentive_cc_credit_limit_increase = incentiveCCCreditLimitIncreaseDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.uuid, "")) {
                    output.encodeStringElement(serialDesc, 0, self.uuid);
                }
                Instant instant = self.start_date;
                if (instant != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
                }
                Instant instant2 = self.end_date;
                if (instant2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
                }
                if (!Intrinsics.areEqual(self.campaign_id, "")) {
                    output.encodeStringElement(serialDesc, 3, self.campaign_id);
                }
                IncentiveCCCreditLimitIncreaseDto incentiveCCCreditLimitIncreaseDto = self.incentive_cc_credit_limit_increase;
                if (incentiveCCCreditLimitIncreaseDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, IncentiveCCCreditLimitIncreaseDto.Serializer.INSTANCE, incentiveCCCreditLimitIncreaseDto);
                }
            }

            public Surrogate(String uuid, Instant instant, Instant instant2, String campaign_id, IncentiveCCCreditLimitIncreaseDto incentiveCCCreditLimitIncreaseDto) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
                this.uuid = uuid;
                this.start_date = instant;
                this.end_date = instant2;
                this.campaign_id = campaign_id;
                this.incentive_cc_credit_limit_increase = incentiveCCCreditLimitIncreaseDto;
            }

            public /* synthetic */ Surrogate(String str, Instant instant, Instant instant2, String str2, IncentiveCCCreditLimitIncreaseDto incentiveCCCreditLimitIncreaseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : incentiveCCCreditLimitIncreaseDto);
            }

            public final String getUuid() {
                return this.uuid;
            }

            public final Instant getStart_date() {
                return this.start_date;
            }

            public final Instant getEnd_date() {
                return this.end_date;
            }

            public final String getCampaign_id() {
                return this.campaign_id;
            }

            public final IncentiveCCCreditLimitIncreaseDto getIncentive_cc_credit_limit_increase() {
                return this.incentive_cc_credit_limit_increase;
            }
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<PromotionEligibilityDetailsDto, PromotionDetails.PromotionEligibilityDetails> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PromotionEligibilityDetailsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PromotionEligibilityDetailsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PromotionEligibilityDetailsDto> getBinaryBase64Serializer() {
                return (KSerializer) PromotionEligibilityDetailsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PromotionDetails.PromotionEligibilityDetails> getProtoAdapter() {
                return PromotionDetails.PromotionEligibilityDetails.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PromotionEligibilityDetailsDto getZeroValue() {
                return PromotionEligibilityDetailsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PromotionEligibilityDetailsDto fromProto(PromotionDetails.PromotionEligibilityDetails proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String uuid = proto.getUuid();
                Instant start_date = proto.getStart_date();
                Instant end_date = proto.getEnd_date();
                String campaign_id = proto.getCampaign_id();
                IncentiveCCCreditLimitIncrease incentive_cc_credit_limit_increase = proto.getIncentive_cc_credit_limit_increase();
                return new PromotionEligibilityDetailsDto(new Surrogate(uuid, start_date, end_date, campaign_id, incentive_cc_credit_limit_increase != null ? IncentiveCCCreditLimitIncreaseDto.INSTANCE.fromProto(incentive_cc_credit_limit_increase) : null), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.PromotionDetailsDto$PromotionEligibilityDetailsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PromotionDetailsDto.PromotionEligibilityDetailsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PromotionEligibilityDetailsDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "IncentiveCcCreditLimitIncrease", "Companion", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto$IncentiveCcCreditLimitIncrease;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        /* loaded from: classes25.dex */
        public static abstract class DetailsDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private DetailsDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: PromotionDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto$IncentiveCcCreditLimitIncrease;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto;", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "value", "<init>", "(Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "getValue", "()Lrosetta/midas/v1/IncentiveCCCreditLimitIncreaseDto;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class IncentiveCcCreditLimitIncrease extends DetailsDto {
                private final IncentiveCCCreditLimitIncreaseDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof IncentiveCcCreditLimitIncrease) && Intrinsics.areEqual(this.value, ((IncentiveCcCreditLimitIncrease) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "IncentiveCcCreditLimitIncrease(value=" + this.value + ")";
                }

                public final IncentiveCCCreditLimitIncreaseDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IncentiveCcCreditLimitIncrease(IncentiveCCCreditLimitIncreaseDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: PromotionDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$DetailsDto;", "Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<DetailsDto, PromotionDetails.PromotionEligibilityDetails> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.idl.Dto.Creator
                public Void getZeroValue() {
                    return Dto4.Creator.DefaultImpls.getZeroValue(this);
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PromotionDetails.PromotionEligibilityDetails> getProtoAdapter() {
                    return PromotionDetails.PromotionEligibilityDetails.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DetailsDto fromProto(PromotionDetails.PromotionEligibilityDetails proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getIncentive_cc_credit_limit_increase() != null) {
                        return new IncentiveCcCreditLimitIncrease(IncentiveCCCreditLimitIncreaseDto.INSTANCE.fromProto(proto.getIncentive_cc_credit_limit_increase()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<PromotionEligibilityDetailsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.PromotionDetails.PromotionEligibilityDetails", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PromotionEligibilityDetailsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PromotionEligibilityDetailsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PromotionEligibilityDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionEligibilityDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "rosetta.midas.v1.PromotionDetailsDto$PromotionEligibilityDetailsDto";
            }
        }
    }

    /* compiled from: PromotionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;)V", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;)V", "toProto", "()Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PromotionParticipationDetailsDto implements Dto3<PromotionDetails.PromotionParticipationDetails>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PromotionParticipationDetailsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PromotionParticipationDetailsDto, PromotionDetails.PromotionParticipationDetails>> binaryBase64Serializer$delegate;
        private static final PromotionParticipationDetailsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PromotionParticipationDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PromotionParticipationDetailsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ PromotionParticipationDetailsDto(String str, Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PromotionParticipationDetailsDto(String uuid, Instant instant, Instant instant2) {
            this(new Surrogate(uuid, instant, instant2));
            Intrinsics.checkNotNullParameter(uuid, "uuid");
        }

        @Override // com.robinhood.idl.Dto
        public PromotionDetails.PromotionParticipationDetails toProto() {
            return new PromotionDetails.PromotionParticipationDetails(this.surrogate.getUuid(), this.surrogate.getStart_date(), this.surrogate.getEnd_date(), null, 8, null);
        }

        public String toString() {
            return "[PromotionParticipationDetailsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PromotionParticipationDetailsDto) && Intrinsics.areEqual(((PromotionParticipationDetailsDto) other).surrogate, this.surrogate);
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
        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cRF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)RF\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010'\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010)¨\u0006/"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;", "", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "start_date", "end_date", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getUuid$annotations", "()V", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getStart_date$annotations", "getEnd_date", "getEnd_date$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Instant end_date;
            private final Instant start_date;
            private final String uuid;

            public Surrogate() {
                this((String) null, (Instant) null, (Instant) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.end_date, surrogate.end_date);
            }

            public int hashCode() {
                int iHashCode = this.uuid.hashCode() * 31;
                Instant instant = this.start_date;
                int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
                Instant instant2 = this.end_date;
                return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(uuid=" + this.uuid + ", start_date=" + this.start_date + ", end_date=" + this.end_date + ")";
            }

            /* compiled from: PromotionDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return PromotionDetailsDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, Instant instant, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
                this.uuid = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.start_date = null;
                } else {
                    this.start_date = instant;
                }
                if ((i & 4) == 0) {
                    this.end_date = null;
                } else {
                    this.end_date = instant2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.uuid, "")) {
                    output.encodeStringElement(serialDesc, 0, self.uuid);
                }
                Instant instant = self.start_date;
                if (instant != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
                }
                Instant instant2 = self.end_date;
                if (instant2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
                }
            }

            public Surrogate(String uuid, Instant instant, Instant instant2) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                this.uuid = uuid;
                this.start_date = instant;
                this.end_date = instant2;
            }

            public final String getUuid() {
                return this.uuid;
            }

            public /* synthetic */ Surrogate(String str, Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2);
            }

            public final Instant getStart_date() {
                return this.start_date;
            }

            public final Instant getEnd_date() {
                return this.end_date;
            }
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PromotionParticipationDetailsDto, PromotionDetails.PromotionParticipationDetails> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PromotionParticipationDetailsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PromotionParticipationDetailsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PromotionParticipationDetailsDto> getBinaryBase64Serializer() {
                return (KSerializer) PromotionParticipationDetailsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PromotionDetails.PromotionParticipationDetails> getProtoAdapter() {
                return PromotionDetails.PromotionParticipationDetails.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PromotionParticipationDetailsDto getZeroValue() {
                return PromotionParticipationDetailsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PromotionParticipationDetailsDto fromProto(PromotionDetails.PromotionParticipationDetails proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PromotionParticipationDetailsDto(new Surrogate(proto.getUuid(), proto.getStart_date(), proto.getEnd_date()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.PromotionDetailsDto$PromotionParticipationDetailsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PromotionDetailsDto.PromotionParticipationDetailsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PromotionParticipationDetailsDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<PromotionParticipationDetailsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.PromotionDetails.PromotionParticipationDetails", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PromotionParticipationDetailsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PromotionParticipationDetailsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PromotionParticipationDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: PromotionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$PromotionParticipationDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "rosetta.midas.v1.PromotionDetailsDto$PromotionParticipationDetailsDto";
            }
        }
    }

    /* compiled from: PromotionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/PromotionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/PromotionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<PromotionDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.PromotionDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PromotionDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PromotionDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PromotionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PromotionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rosetta.midas.v1.PromotionDetailsDto";
        }
    }
}
