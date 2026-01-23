package microgram.contracts.etp_details_service.proto.p489v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
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

/* compiled from: StreamEtpDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006)"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;)V", "", "instrument_id", "Lcom/robinhood/idl/IdlDecimal;", "gross_management_fee_discount", "gross_management_fee", "Lcom/robinhood/rosetta/common/DateDto;", "gross_management_fee_discount_expiration_date", "gross_expense_ratio", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class StreamEtpDetailsResponseDto implements Dto3<StreamEtpDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamEtpDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamEtpDetailsResponseDto, StreamEtpDetailsResponse>> binaryBase64Serializer$delegate;
    private static final StreamEtpDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamEtpDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamEtpDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StreamEtpDetailsResponseDto(java.lang.String r2, com.robinhood.idl.IdlDecimal r3, com.robinhood.idl.IdlDecimal r4, com.robinhood.rosetta.common.DateDto r5, com.robinhood.idl.IdlDecimal r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.etp_details_service.proto.p489v1.StreamEtpDetailsResponseDto.<init>(java.lang.String, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.rosetta.common.DateDto, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamEtpDetailsResponseDto(String instrument_id, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, DateDto dateDto, IdlDecimal idlDecimal3) {
        this(new Surrogate(instrument_id, idlDecimal, idlDecimal2, dateDto, idlDecimal3));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
    }

    @Override // com.robinhood.idl.Dto
    public StreamEtpDetailsResponse toProto() {
        String instrument_id = this.surrogate.getInstrument_id();
        IdlDecimal gross_management_fee_discount = this.surrogate.getGross_management_fee_discount();
        String stringValue = gross_management_fee_discount != null ? gross_management_fee_discount.getStringValue() : null;
        IdlDecimal gross_management_fee = this.surrogate.getGross_management_fee();
        String stringValue2 = gross_management_fee != null ? gross_management_fee.getStringValue() : null;
        DateDto gross_management_fee_discount_expiration_date = this.surrogate.getGross_management_fee_discount_expiration_date();
        Date proto = gross_management_fee_discount_expiration_date != null ? gross_management_fee_discount_expiration_date.toProto() : null;
        IdlDecimal gross_expense_ratio = this.surrogate.getGross_expense_ratio();
        return new StreamEtpDetailsResponse(instrument_id, stringValue, stringValue2, proto, gross_expense_ratio != null ? gross_expense_ratio.getStringValue() : null, null, 32, null);
    }

    public String toString() {
        return "[StreamEtpDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamEtpDetailsResponseDto) && Intrinsics.areEqual(((StreamEtpDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamEtpDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265Bn\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR1\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R1\u0010\t\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R1\u0010\f\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010)\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010+¨\u00067"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;", "", "", "instrument_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "gross_management_fee_discount", "gross_management_fee", "Lcom/robinhood/rosetta/common/DateDto;", "gross_management_fee_discount_expiration_date", "gross_expense_ratio", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$etp_details_service_proto_v1_externalRelease", "(Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getGross_management_fee_discount", "()Lcom/robinhood/idl/IdlDecimal;", "getGross_management_fee_discount$annotations", "getGross_management_fee", "getGross_management_fee$annotations", "Lcom/robinhood/rosetta/common/DateDto;", "getGross_management_fee_discount_expiration_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getGross_management_fee_discount_expiration_date$annotations", "getGross_expense_ratio", "getGross_expense_ratio$annotations", "Companion", "$serializer", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal gross_expense_ratio;
        private final IdlDecimal gross_management_fee;
        private final IdlDecimal gross_management_fee_discount;
        private final DateDto gross_management_fee_discount_expiration_date;
        private final String instrument_id;

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (IdlDecimal) null, (DateDto) null, (IdlDecimal) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.gross_management_fee_discount, surrogate.gross_management_fee_discount) && Intrinsics.areEqual(this.gross_management_fee, surrogate.gross_management_fee) && Intrinsics.areEqual(this.gross_management_fee_discount_expiration_date, surrogate.gross_management_fee_discount_expiration_date) && Intrinsics.areEqual(this.gross_expense_ratio, surrogate.gross_expense_ratio);
        }

        public int hashCode() {
            int iHashCode = this.instrument_id.hashCode() * 31;
            IdlDecimal idlDecimal = this.gross_management_fee_discount;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.gross_management_fee;
            int iHashCode3 = (iHashCode2 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            DateDto dateDto = this.gross_management_fee_discount_expiration_date;
            int iHashCode4 = (iHashCode3 + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.gross_expense_ratio;
            return iHashCode4 + (idlDecimal3 != null ? idlDecimal3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", gross_management_fee_discount=" + this.gross_management_fee_discount + ", gross_management_fee=" + this.gross_management_fee + ", gross_management_fee_discount_expiration_date=" + this.gross_management_fee_discount_expiration_date + ", gross_expense_ratio=" + this.gross_expense_ratio + ")";
        }

        /* compiled from: StreamEtpDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamEtpDetailsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, DateDto dateDto, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            this.instrument_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.gross_management_fee_discount = null;
            } else {
                this.gross_management_fee_discount = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.gross_management_fee = null;
            } else {
                this.gross_management_fee = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.gross_management_fee_discount_expiration_date = null;
            } else {
                this.gross_management_fee_discount_expiration_date = dateDto;
            }
            if ((i & 16) == 0) {
                this.gross_expense_ratio = null;
            } else {
                this.gross_expense_ratio = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$etp_details_service_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            IdlDecimal idlDecimal = self.gross_management_fee_discount;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.gross_management_fee;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            DateDto dateDto = self.gross_management_fee_discount_expiration_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DateDto.Serializer.INSTANCE, dateDto);
            }
            IdlDecimal idlDecimal3 = self.gross_expense_ratio;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
        }

        public Surrogate(String instrument_id, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, DateDto dateDto, IdlDecimal idlDecimal3) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            this.instrument_id = instrument_id;
            this.gross_management_fee_discount = idlDecimal;
            this.gross_management_fee = idlDecimal2;
            this.gross_management_fee_discount_expiration_date = dateDto;
            this.gross_expense_ratio = idlDecimal3;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, com.robinhood.idl.IdlDecimal r3, com.robinhood.idl.IdlDecimal r4, com.robinhood.rosetta.common.DateDto r5, com.robinhood.idl.IdlDecimal r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
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
            throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.etp_details_service.proto.p489v1.StreamEtpDetailsResponseDto.Surrogate.<init>(java.lang.String, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.rosetta.common.DateDto, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getGross_management_fee_discount() {
            return this.gross_management_fee_discount;
        }

        public final IdlDecimal getGross_management_fee() {
            return this.gross_management_fee;
        }

        public final DateDto getGross_management_fee_discount_expiration_date() {
            return this.gross_management_fee_discount_expiration_date;
        }

        public final IdlDecimal getGross_expense_ratio() {
            return this.gross_expense_ratio;
        }
    }

    /* compiled from: StreamEtpDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamEtpDetailsResponseDto, StreamEtpDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamEtpDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamEtpDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamEtpDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamEtpDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamEtpDetailsResponse> getProtoAdapter() {
            return StreamEtpDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamEtpDetailsResponseDto getZeroValue() {
            return StreamEtpDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamEtpDetailsResponseDto fromProto(StreamEtpDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String instrument_id = proto.getInstrument_id();
            String gross_management_fee_discount = proto.getGross_management_fee_discount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = gross_management_fee_discount != null ? new IdlDecimal(gross_management_fee_discount) : null;
            String gross_management_fee = proto.getGross_management_fee();
            IdlDecimal idlDecimal2 = gross_management_fee != null ? new IdlDecimal(gross_management_fee) : null;
            Date gross_management_fee_discount_expiration_date = proto.getGross_management_fee_discount_expiration_date();
            DateDto dateDtoFromProto = gross_management_fee_discount_expiration_date != null ? DateDto.INSTANCE.fromProto(gross_management_fee_discount_expiration_date) : null;
            String gross_expense_ratio = proto.getGross_expense_ratio();
            return new StreamEtpDetailsResponseDto(new Surrogate(instrument_id, idlDecimal, idlDecimal2, dateDtoFromProto, gross_expense_ratio != null ? new IdlDecimal(gross_expense_ratio) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.etp_details_service.proto.v1.StreamEtpDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamEtpDetailsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamEtpDetailsResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamEtpDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamEtpDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.etp_details_service.proto.v1.StreamEtpDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamEtpDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamEtpDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamEtpDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamEtpDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "microgram.contracts.etp_details_service.proto.v1.StreamEtpDetailsResponseDto";
        }
    }
}
