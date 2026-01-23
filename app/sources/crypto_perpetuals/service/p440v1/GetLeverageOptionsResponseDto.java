package crypto_perpetuals.service.p440v1;

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
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.LeverageEntryPoint;
import crypto_perpetuals.common.p435v1.LeverageEntryPointDto;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.MarginModeDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetLeverageOptionsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010,¨\u0006:"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponse;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "min_leverage", "max_leverage", "default_selected_leverage", "", "message", "contract_id", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;", "entry_point", "top_of_leverage_range", "leverage_increment", "disclaimer", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;", "getMin_leverage", "()Lcom/robinhood/idl/IdlDecimal;", "getMax_leverage", "getDefault_selected_leverage", "getContract_id", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getEntry_point", "()Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;", "getTop_of_leverage_range", "getLeverage_increment", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class GetLeverageOptionsResponseDto implements Dto3<GetLeverageOptionsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetLeverageOptionsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetLeverageOptionsResponseDto, GetLeverageOptionsResponse>> binaryBase64Serializer$delegate;
    private static final GetLeverageOptionsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetLeverageOptionsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetLeverageOptionsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getMin_leverage() {
        return this.surrogate.getMin_leverage();
    }

    public final IdlDecimal getMax_leverage() {
        return this.surrogate.getMax_leverage();
    }

    public final IdlDecimal getDefault_selected_leverage() {
        return this.surrogate.getDefault_selected_leverage();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final LeverageEntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final IdlDecimal getTop_of_leverage_range() {
        return this.surrogate.getTop_of_leverage_range();
    }

    public final IdlDecimal getLeverage_increment() {
        return this.surrogate.getLeverage_increment();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetLeverageOptionsResponseDto(com.robinhood.idl.IdlDecimal r3, com.robinhood.idl.IdlDecimal r4, com.robinhood.idl.IdlDecimal r5, java.lang.String r6, java.lang.String r7, crypto_perpetuals.common.p435v1.MarginModeDto r8, crypto_perpetuals.common.p435v1.LeverageEntryPointDto r9, com.robinhood.idl.IdlDecimal r10, com.robinhood.idl.IdlDecimal r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r2 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto Lb
            com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
            r3.<init>(r0)
        Lb:
            r14 = r13 & 2
            if (r14 == 0) goto L14
            com.robinhood.idl.IdlDecimal r4 = new com.robinhood.idl.IdlDecimal
            r4.<init>(r0)
        L14:
            r14 = r13 & 4
            if (r14 == 0) goto L1d
            com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
            r5.<init>(r0)
        L1d:
            r14 = r13 & 8
            r1 = 0
            if (r14 == 0) goto L23
            r6 = r1
        L23:
            r14 = r13 & 16
            if (r14 == 0) goto L28
            r7 = r0
        L28:
            r14 = r13 & 32
            if (r14 == 0) goto L32
            crypto_perpetuals.common.v1.MarginModeDto$Companion r8 = crypto_perpetuals.common.p435v1.MarginModeDto.INSTANCE
            crypto_perpetuals.common.v1.MarginModeDto r8 = r8.getZeroValue()
        L32:
            r14 = r13 & 64
            if (r14 == 0) goto L3c
            crypto_perpetuals.common.v1.LeverageEntryPointDto$Companion r9 = crypto_perpetuals.common.p435v1.LeverageEntryPointDto.INSTANCE
            crypto_perpetuals.common.v1.LeverageEntryPointDto r9 = r9.getZeroValue()
        L3c:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L45
            com.robinhood.idl.IdlDecimal r10 = new com.robinhood.idl.IdlDecimal
            r10.<init>(r0)
        L45:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L4e
            com.robinhood.idl.IdlDecimal r11 = new com.robinhood.idl.IdlDecimal
            r11.<init>(r0)
        L4e:
            r13 = r13 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L5e
            r14 = r1
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L69
        L5e:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L69:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.service.p440v1.GetLeverageOptionsResponseDto.<init>(com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, java.lang.String, java.lang.String, crypto_perpetuals.common.v1.MarginModeDto, crypto_perpetuals.common.v1.LeverageEntryPointDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetLeverageOptionsResponseDto(IdlDecimal min_leverage, IdlDecimal max_leverage, IdlDecimal default_selected_leverage, String str, String contract_id, MarginModeDto margin_mode, LeverageEntryPointDto entry_point, IdlDecimal top_of_leverage_range, IdlDecimal leverage_increment, String str2) {
        this(new Surrogate(min_leverage, max_leverage, default_selected_leverage, str, contract_id, margin_mode, entry_point, top_of_leverage_range, leverage_increment, str2));
        Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
        Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
        Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(top_of_leverage_range, "top_of_leverage_range");
        Intrinsics.checkNotNullParameter(leverage_increment, "leverage_increment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetLeverageOptionsResponse toProto() {
        return new GetLeverageOptionsResponse(this.surrogate.getMin_leverage().getStringValue(), this.surrogate.getMax_leverage().getStringValue(), this.surrogate.getDefault_selected_leverage().getStringValue(), this.surrogate.getMessage(), this.surrogate.getContract_id(), (MarginMode) this.surrogate.getMargin_mode().toProto(), (LeverageEntryPoint) this.surrogate.getEntry_point().toProto(), this.surrogate.getTop_of_leverage_range().getStringValue(), this.surrogate.getLeverage_increment().getStringValue(), this.surrogate.getDisclaimer(), null, 1024, null);
    }

    public String toString() {
        return "[GetLeverageOptionsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetLeverageOptionsResponseDto) && Intrinsics.areEqual(((GetLeverageOptionsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetLeverageOptionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGBº\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014B\u007f\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010-R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010$R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010$R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\b<\u0010/\u001a\u0004\b:\u0010;R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u0010/\u001a\u0004\b>\u0010?R/\u0010\u0010\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010+\u0012\u0004\bB\u0010/\u001a\u0004\bA\u0010-R/\u0010\u0011\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010+\u0012\u0004\bD\u0010/\u001a\u0004\bC\u0010-R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00104\u0012\u0004\bF\u0010/\u001a\u0004\bE\u0010$¨\u0006I"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "min_leverage", "max_leverage", "default_selected_leverage", "", "message", "contract_id", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;", "entry_point", "top_of_leverage_range", "leverage_increment", "disclaimer", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_service_v1_externalRelease", "(Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getMin_leverage", "()Lcom/robinhood/idl/IdlDecimal;", "getMin_leverage$annotations", "()V", "getMax_leverage", "getMax_leverage$annotations", "getDefault_selected_leverage", "getDefault_selected_leverage$annotations", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "getContract_id", "getContract_id$annotations", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode$annotations", "Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;", "getEntry_point", "()Lcrypto_perpetuals/common/v1/LeverageEntryPointDto;", "getEntry_point$annotations", "getTop_of_leverage_range", "getTop_of_leverage_range$annotations", "getLeverage_increment", "getLeverage_increment$annotations", "getDisclaimer", "getDisclaimer$annotations", "Companion", "$serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final IdlDecimal default_selected_leverage;
        private final String disclaimer;
        private final LeverageEntryPointDto entry_point;
        private final IdlDecimal leverage_increment;
        private final MarginModeDto margin_mode;
        private final IdlDecimal max_leverage;
        private final String message;
        private final IdlDecimal min_leverage;
        private final IdlDecimal top_of_leverage_range;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (MarginModeDto) null, (LeverageEntryPointDto) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.min_leverage, surrogate.min_leverage) && Intrinsics.areEqual(this.max_leverage, surrogate.max_leverage) && Intrinsics.areEqual(this.default_selected_leverage, surrogate.default_selected_leverage) && Intrinsics.areEqual(this.message, surrogate.message) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.margin_mode == surrogate.margin_mode && this.entry_point == surrogate.entry_point && Intrinsics.areEqual(this.top_of_leverage_range, surrogate.top_of_leverage_range) && Intrinsics.areEqual(this.leverage_increment, surrogate.leverage_increment) && Intrinsics.areEqual(this.disclaimer, surrogate.disclaimer);
        }

        public int hashCode() {
            int iHashCode = ((((this.min_leverage.hashCode() * 31) + this.max_leverage.hashCode()) * 31) + this.default_selected_leverage.hashCode()) * 31;
            String str = this.message;
            int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contract_id.hashCode()) * 31) + this.margin_mode.hashCode()) * 31) + this.entry_point.hashCode()) * 31) + this.top_of_leverage_range.hashCode()) * 31) + this.leverage_increment.hashCode()) * 31;
            String str2 = this.disclaimer;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(min_leverage=" + this.min_leverage + ", max_leverage=" + this.max_leverage + ", default_selected_leverage=" + this.default_selected_leverage + ", message=" + this.message + ", contract_id=" + this.contract_id + ", margin_mode=" + this.margin_mode + ", entry_point=" + this.entry_point + ", top_of_leverage_range=" + this.top_of_leverage_range + ", leverage_increment=" + this.leverage_increment + ", disclaimer=" + this.disclaimer + ")";
        }

        /* compiled from: GetLeverageOptionsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetLeverageOptionsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, String str2, MarginModeDto marginModeDto, LeverageEntryPointDto leverageEntryPointDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.min_leverage = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.max_leverage = new IdlDecimal("");
            } else {
                this.max_leverage = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.default_selected_leverage = new IdlDecimal("");
            } else {
                this.default_selected_leverage = idlDecimal3;
            }
            if ((i & 8) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
            if ((i & 16) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str2;
            }
            if ((i & 32) == 0) {
                this.margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_mode = marginModeDto;
            }
            if ((i & 64) == 0) {
                this.entry_point = LeverageEntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = leverageEntryPointDto;
            }
            if ((i & 128) == 0) {
                this.top_of_leverage_range = new IdlDecimal("");
            } else {
                this.top_of_leverage_range = idlDecimal4;
            }
            if ((i & 256) == 0) {
                this.leverage_increment = new IdlDecimal("");
            } else {
                this.leverage_increment = idlDecimal5;
            }
            if ((i & 512) == 0) {
                this.disclaimer = null;
            } else {
                this.disclaimer = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.min_leverage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.min_leverage);
            }
            if (!Intrinsics.areEqual(self.max_leverage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.max_leverage);
            }
            if (!Intrinsics.areEqual(self.default_selected_leverage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.default_selected_leverage);
            }
            String str = self.message;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.contract_id);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            if (self.entry_point != LeverageEntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, LeverageEntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            if (!Intrinsics.areEqual(self.top_of_leverage_range, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.top_of_leverage_range);
            }
            if (!Intrinsics.areEqual(self.leverage_increment, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.leverage_increment);
            }
            String str2 = self.disclaimer;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(IdlDecimal min_leverage, IdlDecimal max_leverage, IdlDecimal default_selected_leverage, String str, String contract_id, MarginModeDto margin_mode, LeverageEntryPointDto entry_point, IdlDecimal top_of_leverage_range, IdlDecimal leverage_increment, String str2) {
            Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
            Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
            Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(top_of_leverage_range, "top_of_leverage_range");
            Intrinsics.checkNotNullParameter(leverage_increment, "leverage_increment");
            this.min_leverage = min_leverage;
            this.max_leverage = max_leverage;
            this.default_selected_leverage = default_selected_leverage;
            this.message = str;
            this.contract_id = contract_id;
            this.margin_mode = margin_mode;
            this.entry_point = entry_point;
            this.top_of_leverage_range = top_of_leverage_range;
            this.leverage_increment = leverage_increment;
            this.disclaimer = str2;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.idl.IdlDecimal r3, com.robinhood.idl.IdlDecimal r4, com.robinhood.idl.IdlDecimal r5, java.lang.String r6, java.lang.String r7, crypto_perpetuals.common.p435v1.MarginModeDto r8, crypto_perpetuals.common.p435v1.LeverageEntryPointDto r9, com.robinhood.idl.IdlDecimal r10, com.robinhood.idl.IdlDecimal r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r2 = this;
                r14 = r13 & 1
                java.lang.String r0 = ""
                if (r14 == 0) goto Lb
                com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                r3.<init>(r0)
            Lb:
                r14 = r13 & 2
                if (r14 == 0) goto L14
                com.robinhood.idl.IdlDecimal r4 = new com.robinhood.idl.IdlDecimal
                r4.<init>(r0)
            L14:
                r14 = r13 & 4
                if (r14 == 0) goto L1d
                com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
                r5.<init>(r0)
            L1d:
                r14 = r13 & 8
                r1 = 0
                if (r14 == 0) goto L23
                r6 = r1
            L23:
                r14 = r13 & 16
                if (r14 == 0) goto L28
                r7 = r0
            L28:
                r14 = r13 & 32
                if (r14 == 0) goto L32
                crypto_perpetuals.common.v1.MarginModeDto$Companion r8 = crypto_perpetuals.common.p435v1.MarginModeDto.INSTANCE
                crypto_perpetuals.common.v1.MarginModeDto r8 = r8.getZeroValue()
            L32:
                r14 = r13 & 64
                if (r14 == 0) goto L3c
                crypto_perpetuals.common.v1.LeverageEntryPointDto$Companion r9 = crypto_perpetuals.common.p435v1.LeverageEntryPointDto.INSTANCE
                crypto_perpetuals.common.v1.LeverageEntryPointDto r9 = r9.getZeroValue()
            L3c:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L45
                com.robinhood.idl.IdlDecimal r10 = new com.robinhood.idl.IdlDecimal
                r10.<init>(r0)
            L45:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L4e
                com.robinhood.idl.IdlDecimal r11 = new com.robinhood.idl.IdlDecimal
                r11.<init>(r0)
            L4e:
                r13 = r13 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L5e
                r14 = r1
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L69
            L5e:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L69:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.service.p440v1.GetLeverageOptionsResponseDto.Surrogate.<init>(com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, java.lang.String, java.lang.String, crypto_perpetuals.common.v1.MarginModeDto, crypto_perpetuals.common.v1.LeverageEntryPointDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getMin_leverage() {
            return this.min_leverage;
        }

        public final IdlDecimal getMax_leverage() {
            return this.max_leverage;
        }

        public final IdlDecimal getDefault_selected_leverage() {
            return this.default_selected_leverage;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final LeverageEntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final IdlDecimal getTop_of_leverage_range() {
            return this.top_of_leverage_range;
        }

        public final IdlDecimal getLeverage_increment() {
            return this.leverage_increment;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }
    }

    /* compiled from: GetLeverageOptionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto;", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetLeverageOptionsResponseDto, GetLeverageOptionsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetLeverageOptionsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLeverageOptionsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLeverageOptionsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetLeverageOptionsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetLeverageOptionsResponse> getProtoAdapter() {
            return GetLeverageOptionsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLeverageOptionsResponseDto getZeroValue() {
            return GetLeverageOptionsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLeverageOptionsResponseDto fromProto(GetLeverageOptionsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetLeverageOptionsResponseDto(new Surrogate(new IdlDecimal(proto.getMin_leverage()), new IdlDecimal(proto.getMax_leverage()), new IdlDecimal(proto.getDefault_selected_leverage()), proto.getMessage(), proto.getContract_id(), MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode()), LeverageEntryPointDto.INSTANCE.fromProto(proto.getEntry_point()), new IdlDecimal(proto.getTop_of_leverage_range()), new IdlDecimal(proto.getLeverage_increment()), proto.getDisclaimer()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.service.v1.GetLeverageOptionsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLeverageOptionsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetLeverageOptionsResponseDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetLeverageOptionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetLeverageOptionsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.service.v1.GetLeverageOptionsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetLeverageOptionsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetLeverageOptionsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetLeverageOptionsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetLeverageOptionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetLeverageOptionsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "crypto_perpetuals.service.v1.GetLeverageOptionsResponseDto";
        }
    }
}
