package wormhole.service.p554v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: GetRealizedPerformanceSummaryResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014¨\u0006-"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponse;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;)V", "", "has_closed_pnl", "Lcom/robinhood/rosetta/common/MoneyDto;", "ytd_gain_loss", "past_month_gain_loss", "", "instrument_id", "account_number", "(ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lwormhole/service/v1/GetRealizedPerformanceSummaryResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;", "getYtd_gain_loss", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getPast_month_gain_loss", "getInstrument_id", "getAccount_number", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetRealizedPerformanceSummaryResponseDto implements Dto3<GetRealizedPerformanceSummaryResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetRealizedPerformanceSummaryResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetRealizedPerformanceSummaryResponseDto, GetRealizedPerformanceSummaryResponse>> binaryBase64Serializer$delegate;
    private static final GetRealizedPerformanceSummaryResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetRealizedPerformanceSummaryResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetRealizedPerformanceSummaryResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getYtd_gain_loss() {
        return this.surrogate.getYtd_gain_loss();
    }

    public final MoneyDto getPast_month_gain_loss() {
        return this.surrogate.getPast_month_gain_loss();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetRealizedPerformanceSummaryResponseDto(boolean r2, com.robinhood.rosetta.common.MoneyDto r3, com.robinhood.rosetta.common.MoneyDto r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L10
            r4 = r0
        L10:
            r8 = r7 & 8
            java.lang.String r0 = ""
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wormhole.service.p554v1.GetRealizedPerformanceSummaryResponseDto.<init>(boolean, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetRealizedPerformanceSummaryResponseDto(boolean z, MoneyDto moneyDto, MoneyDto moneyDto2, String instrument_id, String account_number) {
        this(new Surrogate(z, moneyDto, moneyDto2, instrument_id, account_number));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
    }

    @Override // com.robinhood.idl.Dto
    public GetRealizedPerformanceSummaryResponse toProto() {
        boolean has_closed_pnl = this.surrogate.getHas_closed_pnl();
        MoneyDto ytd_gain_loss = this.surrogate.getYtd_gain_loss();
        Money proto = ytd_gain_loss != null ? ytd_gain_loss.toProto() : null;
        MoneyDto past_month_gain_loss = this.surrogate.getPast_month_gain_loss();
        return new GetRealizedPerformanceSummaryResponse(has_closed_pnl, proto, past_month_gain_loss != null ? past_month_gain_loss.toProto() : null, this.surrogate.getInstrument_id(), this.surrogate.getAccount_number(), null, 32, null);
    }

    public String toString() {
        return "[GetRealizedPerformanceSummaryResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetRealizedPerformanceSummaryResponseDto) && Intrinsics.areEqual(((GetRealizedPerformanceSummaryResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetRealizedPerformanceSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001bR \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\u001b¨\u00063"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;", "", "", "has_closed_pnl", "Lcom/robinhood/rosetta/common/MoneyDto;", "ytd_gain_loss", "past_month_gain_loss", "", "instrument_id", "account_number", "<init>", "(ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHas_closed_pnl", "()Z", "getHas_closed_pnl$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getYtd_gain_loss", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getYtd_gain_loss$annotations", "getPast_month_gain_loss", "getPast_month_gain_loss$annotations", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "getAccount_number", "getAccount_number$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final boolean has_closed_pnl;
        private final String instrument_id;
        private final MoneyDto past_month_gain_loss;
        private final MoneyDto ytd_gain_loss;

        public Surrogate() {
            this(false, (MoneyDto) null, (MoneyDto) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.has_closed_pnl == surrogate.has_closed_pnl && Intrinsics.areEqual(this.ytd_gain_loss, surrogate.ytd_gain_loss) && Intrinsics.areEqual(this.past_month_gain_loss, surrogate.past_month_gain_loss) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.account_number, surrogate.account_number);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.has_closed_pnl) * 31;
            MoneyDto moneyDto = this.ytd_gain_loss;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.past_month_gain_loss;
            return ((((iHashCode2 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.instrument_id.hashCode()) * 31) + this.account_number.hashCode();
        }

        public String toString() {
            return "Surrogate(has_closed_pnl=" + this.has_closed_pnl + ", ytd_gain_loss=" + this.ytd_gain_loss + ", past_month_gain_loss=" + this.past_month_gain_loss + ", instrument_id=" + this.instrument_id + ", account_number=" + this.account_number + ")";
        }

        /* compiled from: GetRealizedPerformanceSummaryResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetRealizedPerformanceSummaryResponseDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.has_closed_pnl = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.ytd_gain_loss = null;
            } else {
                this.ytd_gain_loss = moneyDto;
            }
            if ((i & 4) == 0) {
                this.past_month_gain_loss = null;
            } else {
                this.past_month_gain_loss = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 16) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.has_closed_pnl;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            MoneyDto moneyDto = self.ytd_gain_loss;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.past_month_gain_loss;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.instrument_id);
            }
            if (Intrinsics.areEqual(self.account_number, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.account_number);
        }

        public Surrogate(boolean z, MoneyDto moneyDto, MoneyDto moneyDto2, String instrument_id, String account_number) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.has_closed_pnl = z;
            this.ytd_gain_loss = moneyDto;
            this.past_month_gain_loss = moneyDto2;
            this.instrument_id = instrument_id;
            this.account_number = account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(boolean r2, com.robinhood.rosetta.common.MoneyDto r3, com.robinhood.rosetta.common.MoneyDto r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L5
                r2 = 0
            L5:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lb
                r3 = r0
            Lb:
                r8 = r7 & 4
                if (r8 == 0) goto L10
                r4 = r0
            L10:
                r8 = r7 & 8
                java.lang.String r0 = ""
                if (r8 == 0) goto L17
                r5 = r0
            L17:
                r7 = r7 & 16
                if (r7 == 0) goto L22
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L28
            L22:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L28:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wormhole.service.p554v1.GetRealizedPerformanceSummaryResponseDto.Surrogate.<init>(boolean, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final boolean getHas_closed_pnl() {
            return this.has_closed_pnl;
        }

        public final MoneyDto getYtd_gain_loss() {
            return this.ytd_gain_loss;
        }

        public final MoneyDto getPast_month_gain_loss() {
            return this.past_month_gain_loss;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }
    }

    /* compiled from: GetRealizedPerformanceSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetRealizedPerformanceSummaryResponseDto, GetRealizedPerformanceSummaryResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetRealizedPerformanceSummaryResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedPerformanceSummaryResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedPerformanceSummaryResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetRealizedPerformanceSummaryResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetRealizedPerformanceSummaryResponse> getProtoAdapter() {
            return GetRealizedPerformanceSummaryResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedPerformanceSummaryResponseDto getZeroValue() {
            return GetRealizedPerformanceSummaryResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedPerformanceSummaryResponseDto fromProto(GetRealizedPerformanceSummaryResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean has_closed_pnl = proto.getHas_closed_pnl();
            Money ytd_gain_loss = proto.getYtd_gain_loss();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = ytd_gain_loss != null ? MoneyDto.INSTANCE.fromProto(ytd_gain_loss) : null;
            Money past_month_gain_loss = proto.getPast_month_gain_loss();
            return new GetRealizedPerformanceSummaryResponseDto(new Surrogate(has_closed_pnl, moneyDtoFromProto, past_month_gain_loss != null ? MoneyDto.INSTANCE.fromProto(past_month_gain_loss) : null, proto.getInstrument_id(), proto.getAccount_number()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.GetRealizedPerformanceSummaryResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRealizedPerformanceSummaryResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetRealizedPerformanceSummaryResponseDto(false, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetRealizedPerformanceSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<GetRealizedPerformanceSummaryResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.GetRealizedPerformanceSummaryResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetRealizedPerformanceSummaryResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetRealizedPerformanceSummaryResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetRealizedPerformanceSummaryResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetRealizedPerformanceSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "wormhole.service.v1.GetRealizedPerformanceSummaryResponseDto";
        }
    }
}
