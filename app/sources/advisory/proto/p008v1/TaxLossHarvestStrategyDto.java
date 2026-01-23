package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestStrategyReviewDto;
import advisory.proto.p008v1.TaxLossHarvestStrategyTypeDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TaxLossHarvestStrategyDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0017¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestStrategy;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;)V", "Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;", "type", "", "title", "subtitle", "description", "", "is_default", "Ladvisory/proto/v1/TaxLossHarvestStrategyReviewDto;", "review", "logging_identifier", "(Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/TaxLossHarvestStrategyReviewDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestStrategy;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;", "getType", "()Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;", "getTitle", "getSubtitle", "getDescription", "()Z", "getReview", "()Ladvisory/proto/v1/TaxLossHarvestStrategyReviewDto;", "getLogging_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategyDto implements Dto3<TaxLossHarvestStrategy>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestStrategyDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestStrategyDto, TaxLossHarvestStrategy>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestStrategyDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestStrategyDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestStrategyDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TaxLossHarvestStrategyTypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final boolean is_default() {
        return this.surrogate.getIs_default();
    }

    public final TaxLossHarvestStrategyReviewDto getReview() {
        return this.surrogate.getReview();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TaxLossHarvestStrategyDto(advisory.proto.p008v1.TaxLossHarvestStrategyTypeDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, advisory.proto.p008v1.TaxLossHarvestStrategyReviewDto r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            advisory.proto.v1.TaxLossHarvestStrategyTypeDto$Companion r2 = advisory.proto.p008v1.TaxLossHarvestStrategyTypeDto.INSTANCE
            advisory.proto.v1.TaxLossHarvestStrategyTypeDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L11
            r3 = r0
        L11:
            r10 = r9 & 4
            if (r10 == 0) goto L16
            r4 = r0
        L16:
            r10 = r9 & 8
            if (r10 == 0) goto L1b
            r5 = r0
        L1b:
            r10 = r9 & 16
            if (r10 == 0) goto L20
            r6 = 0
        L20:
            r10 = r9 & 32
            r0 = 0
            if (r10 == 0) goto L26
            r7 = r0
        L26:
            r9 = r9 & 64
            if (r9 == 0) goto L33
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3b
        L33:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.TaxLossHarvestStrategyDto.<init>(advisory.proto.v1.TaxLossHarvestStrategyTypeDto, java.lang.String, java.lang.String, java.lang.String, boolean, advisory.proto.v1.TaxLossHarvestStrategyReviewDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategyDto(TaxLossHarvestStrategyTypeDto type2, String title, String subtitle, String description, boolean z, TaxLossHarvestStrategyReviewDto taxLossHarvestStrategyReviewDto, String str) {
        this(new Surrogate(type2, title, subtitle, description, z, taxLossHarvestStrategyReviewDto, str));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestStrategy toProto() {
        TaxLossHarvestStrategyType taxLossHarvestStrategyType = (TaxLossHarvestStrategyType) this.surrogate.getType().toProto();
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        String description = this.surrogate.getDescription();
        boolean is_default = this.surrogate.getIs_default();
        TaxLossHarvestStrategyReviewDto review = this.surrogate.getReview();
        return new TaxLossHarvestStrategy(taxLossHarvestStrategyType, title, subtitle, description, is_default, review != null ? review.toProto() : null, this.surrogate.getLogging_identifier(), null, 128, null);
    }

    public String toString() {
        return "[TaxLossHarvestStrategyDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestStrategyDto) && Intrinsics.areEqual(((TaxLossHarvestStrategyDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestStrategyDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001eR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001eR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b2\u0010(\u001a\u0004\b\t\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010)\u0012\u0004\b8\u0010(\u001a\u0004\b7\u0010\u001e¨\u0006;"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;", "", "Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;", "type", "", "title", "subtitle", "description", "", "is_default", "Ladvisory/proto/v1/TaxLossHarvestStrategyReviewDto;", "review", "logging_identifier", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/TaxLossHarvestStrategyReviewDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/TaxLossHarvestStrategyTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/TaxLossHarvestStrategyReviewDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;", "getType", "()Ladvisory/proto/v1/TaxLossHarvestStrategyTypeDto;", "getType$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getDescription", "getDescription$annotations", "Z", "()Z", "is_default$annotations", "Ladvisory/proto/v1/TaxLossHarvestStrategyReviewDto;", "getReview", "()Ladvisory/proto/v1/TaxLossHarvestStrategyReviewDto;", "getReview$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final boolean is_default;
        private final String logging_identifier;
        private final TaxLossHarvestStrategyReviewDto review;
        private final String subtitle;
        private final String title;
        private final TaxLossHarvestStrategyTypeDto type;

        public Surrogate() {
            this((TaxLossHarvestStrategyTypeDto) null, (String) null, (String) null, (String) null, false, (TaxLossHarvestStrategyReviewDto) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.description, surrogate.description) && this.is_default == surrogate.is_default && Intrinsics.areEqual(this.review, surrogate.review) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.is_default)) * 31;
            TaxLossHarvestStrategyReviewDto taxLossHarvestStrategyReviewDto = this.review;
            int iHashCode2 = (iHashCode + (taxLossHarvestStrategyReviewDto == null ? 0 : taxLossHarvestStrategyReviewDto.hashCode())) * 31;
            String str = this.logging_identifier;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ", is_default=" + this.is_default + ", review=" + this.review + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: TaxLossHarvestStrategyDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestStrategyDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TaxLossHarvestStrategyTypeDto taxLossHarvestStrategyTypeDto, String str, String str2, String str3, boolean z, TaxLossHarvestStrategyReviewDto taxLossHarvestStrategyReviewDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? TaxLossHarvestStrategyTypeDto.INSTANCE.getZeroValue() : taxLossHarvestStrategyTypeDto;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 4) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((i & 16) == 0) {
                this.is_default = false;
            } else {
                this.is_default = z;
            }
            if ((i & 32) == 0) {
                this.review = null;
            } else {
                this.review = taxLossHarvestStrategyReviewDto;
            }
            if ((i & 64) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != TaxLossHarvestStrategyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, TaxLossHarvestStrategyTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 2, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 3, self.description);
            }
            boolean z = self.is_default;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            TaxLossHarvestStrategyReviewDto taxLossHarvestStrategyReviewDto = self.review;
            if (taxLossHarvestStrategyReviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TaxLossHarvestStrategyReviewDto.Serializer.INSTANCE, taxLossHarvestStrategyReviewDto);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(TaxLossHarvestStrategyTypeDto type2, String title, String subtitle, String description, boolean z, TaxLossHarvestStrategyReviewDto taxLossHarvestStrategyReviewDto, String str) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(description, "description");
            this.type = type2;
            this.title = title;
            this.subtitle = subtitle;
            this.description = description;
            this.is_default = z;
            this.review = taxLossHarvestStrategyReviewDto;
            this.logging_identifier = str;
        }

        public final TaxLossHarvestStrategyTypeDto getType() {
            return this.type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(advisory.proto.p008v1.TaxLossHarvestStrategyTypeDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, advisory.proto.p008v1.TaxLossHarvestStrategyReviewDto r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                advisory.proto.v1.TaxLossHarvestStrategyTypeDto$Companion r2 = advisory.proto.p008v1.TaxLossHarvestStrategyTypeDto.INSTANCE
                advisory.proto.v1.TaxLossHarvestStrategyTypeDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                java.lang.String r0 = ""
                if (r10 == 0) goto L11
                r3 = r0
            L11:
                r10 = r9 & 4
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                r5 = r0
            L1b:
                r10 = r9 & 16
                if (r10 == 0) goto L20
                r6 = 0
            L20:
                r10 = r9 & 32
                r0 = 0
                if (r10 == 0) goto L26
                r7 = r0
            L26:
                r9 = r9 & 64
                if (r9 == 0) goto L33
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3b
            L33:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3b:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.TaxLossHarvestStrategyDto.Surrogate.<init>(advisory.proto.v1.TaxLossHarvestStrategyTypeDto, java.lang.String, java.lang.String, java.lang.String, boolean, advisory.proto.v1.TaxLossHarvestStrategyReviewDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getDescription() {
            return this.description;
        }

        /* renamed from: is_default, reason: from getter */
        public final boolean getIs_default() {
            return this.is_default;
        }

        public final TaxLossHarvestStrategyReviewDto getReview() {
            return this.review;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: TaxLossHarvestStrategyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto;", "Ladvisory/proto/v1/TaxLossHarvestStrategy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestStrategyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestStrategyDto, TaxLossHarvestStrategy> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestStrategyDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestStrategyDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestStrategyDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestStrategyDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestStrategy> getProtoAdapter() {
            return TaxLossHarvestStrategy.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestStrategyDto getZeroValue() {
            return TaxLossHarvestStrategyDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestStrategyDto fromProto(TaxLossHarvestStrategy proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TaxLossHarvestStrategyTypeDto taxLossHarvestStrategyTypeDtoFromProto = TaxLossHarvestStrategyTypeDto.INSTANCE.fromProto(proto.getType());
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            String description = proto.getDescription();
            boolean is_default = proto.getIs_default();
            TaxLossHarvestStrategyReview review = proto.getReview();
            return new TaxLossHarvestStrategyDto(new Surrogate(taxLossHarvestStrategyTypeDtoFromProto, title, subtitle, description, is_default, review != null ? TaxLossHarvestStrategyReviewDto.INSTANCE.fromProto(review) : null, proto.getLogging_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestStrategyDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestStrategyDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLossHarvestStrategyDto(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestStrategyDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestStrategyDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestStrategy", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestStrategyDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestStrategyDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestStrategyDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestStrategyDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestStrategyDto";
        }
    }
}
