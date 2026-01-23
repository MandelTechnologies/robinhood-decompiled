package crypto_perpetuals.position.p439v1;

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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.MarginModeDto;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.position.p439v1.BuyingPowerEffectDto;
import crypto_perpetuals.position.p439v1.MarginEdit;
import crypto_perpetuals.position.p439v1.MarginEditDto;
import crypto_perpetuals.position.p439v1.MarginEditTypeDto;
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
import p479j$.time.Instant;

/* compiled from: MarginEditDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005@?ABCB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0085\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0019\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178F¢\u0006\u0006\u001a\u0004\b>\u0010=¨\u0006D"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/position/v1/MarginEdit;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;)V", "", "id", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "status", "Lcrypto_perpetuals/position/v1/MarginEditTypeDto;", "edit_type", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/MoneyDto;", "amount", "contract_id", "position_id", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "buying_power_effect", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "(Ljava/lang/String;Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;Lcrypto_perpetuals/position/v1/MarginEditTypeDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;Lj$/time/Instant;Lj$/time/Instant;)V", "toProto", "()Lcrypto_perpetuals/position/v1/MarginEdit;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;", "getId", "getStatus", "()Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "getEdit_type", "()Lcrypto_perpetuals/position/v1/MarginEditTypeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getAmount", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getContract_id", "getPosition_id", "getBuying_power_effect", "()Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Companion", "Surrogate", "StatusDto", "Serializer", "MultibindingModule", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class MarginEditDto implements Dto3<MarginEdit>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginEditDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginEditDto, MarginEdit>> binaryBase64Serializer$delegate;
    private static final MarginEditDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginEditDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginEditDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final StatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final MarginEditTypeDto getEdit_type() {
        return this.surrogate.getEdit_type();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final String getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final BuyingPowerEffectDto getBuying_power_effect() {
        return this.surrogate.getBuying_power_effect();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MarginEditDto(java.lang.String r2, crypto_perpetuals.position.v1.MarginEditDto.StatusDto r3, crypto_perpetuals.position.p439v1.MarginEditTypeDto r4, crypto_perpetuals.common.p435v1.MarginModeDto r5, crypto_perpetuals.common.p435v1.MoneyDto r6, java.lang.String r7, java.lang.String r8, crypto_perpetuals.position.p439v1.BuyingPowerEffectDto r9, p479j$.time.Instant r10, p479j$.time.Instant r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            crypto_perpetuals.position.v1.MarginEditDto$StatusDto$Companion r3 = crypto_perpetuals.position.v1.MarginEditDto.StatusDto.INSTANCE
            crypto_perpetuals.position.v1.MarginEditDto$StatusDto r3 = r3.getZeroValue()
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L1a
            crypto_perpetuals.position.v1.MarginEditTypeDto$Companion r4 = crypto_perpetuals.position.p439v1.MarginEditTypeDto.INSTANCE
            crypto_perpetuals.position.v1.MarginEditTypeDto r4 = r4.getZeroValue()
        L1a:
            r13 = r12 & 8
            if (r13 == 0) goto L24
            crypto_perpetuals.common.v1.MarginModeDto$Companion r5 = crypto_perpetuals.common.p435v1.MarginModeDto.INSTANCE
            crypto_perpetuals.common.v1.MarginModeDto r5 = r5.getZeroValue()
        L24:
            r13 = r12 & 16
            r0 = 0
            if (r13 == 0) goto L2a
            r6 = r0
        L2a:
            r13 = r12 & 32
            if (r13 == 0) goto L2f
            r7 = r0
        L2f:
            r13 = r12 & 64
            if (r13 == 0) goto L34
            r8 = r0
        L34:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L39
            r9 = r0
        L39:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L3e
            r10 = r0
        L3e:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L4e
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L59
        L4e:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L59:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.position.p439v1.MarginEditDto.<init>(java.lang.String, crypto_perpetuals.position.v1.MarginEditDto$StatusDto, crypto_perpetuals.position.v1.MarginEditTypeDto, crypto_perpetuals.common.v1.MarginModeDto, crypto_perpetuals.common.v1.MoneyDto, java.lang.String, java.lang.String, crypto_perpetuals.position.v1.BuyingPowerEffectDto, j$.time.Instant, j$.time.Instant, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginEditDto(String id, StatusDto status, MarginEditTypeDto edit_type, MarginModeDto margin_mode, MoneyDto moneyDto, String str, String str2, BuyingPowerEffectDto buyingPowerEffectDto, Instant instant, Instant instant2) {
        this(new Surrogate(id, status, edit_type, margin_mode, moneyDto, str, str2, buyingPowerEffectDto, instant, instant2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(edit_type, "edit_type");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MarginEdit toProto() {
        String id = this.surrogate.getId();
        MarginEdit.Status status = (MarginEdit.Status) this.surrogate.getStatus().toProto();
        MarginEditType marginEditType = (MarginEditType) this.surrogate.getEdit_type().toProto();
        MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        String contract_id = this.surrogate.getContract_id();
        String position_id = this.surrogate.getPosition_id();
        BuyingPowerEffectDto buying_power_effect = this.surrogate.getBuying_power_effect();
        return new MarginEdit(id, status, marginEditType, marginMode, proto, contract_id, position_id, buying_power_effect != null ? buying_power_effect.toProto() : null, this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), null, 1024, null);
    }

    public String toString() {
        return "[MarginEditDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginEditDto) && Intrinsics.areEqual(((MarginEditDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginEditDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b'\b\u0083\b\u0018\u0000 Q2\u00020\u0001:\u0002RQB¿\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\u0004\b\u0017\u0010\u0018B\u007f\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b:\u00102\u001a\u0004\b8\u00109R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bB\u00102\u001a\u0004\b@\u0010AR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\bD\u00102\u001a\u0004\bC\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010/\u0012\u0004\bF\u00102\u001a\u0004\bE\u0010(R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bJ\u00102\u001a\u0004\bH\u0010IRF\u0010\u0015\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010K\u0012\u0004\bN\u00102\u001a\u0004\bL\u0010MRF\u0010\u0016\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010K\u0012\u0004\bP\u00102\u001a\u0004\bO\u0010M¨\u0006S"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;", "", "", "id", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "status", "Lcrypto_perpetuals/position/v1/MarginEditTypeDto;", "edit_type", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/MoneyDto;", "amount", "contract_id", "position_id", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "buying_power_effect", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;Lcrypto_perpetuals/position/v1/MarginEditTypeDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;Lcrypto_perpetuals/position/v1/MarginEditTypeDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_position_v1_externalRelease", "(Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "getStatus", "()Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "getStatus$annotations", "Lcrypto_perpetuals/position/v1/MarginEditTypeDto;", "getEdit_type", "()Lcrypto_perpetuals/position/v1/MarginEditTypeDto;", "getEdit_type$annotations", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode$annotations", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getAmount", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getAmount$annotations", "getContract_id", "getContract_id$annotations", "getPosition_id", "getPosition_id$annotations", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "getBuying_power_effect", "()Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "getBuying_power_effect$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Companion", "$serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final BuyingPowerEffectDto buying_power_effect;
        private final String contract_id;
        private final Instant created_at;
        private final MarginEditTypeDto edit_type;
        private final String id;
        private final MarginModeDto margin_mode;
        private final String position_id;
        private final StatusDto status;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (StatusDto) null, (MarginEditTypeDto) null, (MarginModeDto) null, (MoneyDto) null, (String) null, (String) null, (BuyingPowerEffectDto) null, (Instant) null, (Instant) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.status == surrogate.status && this.edit_type == surrogate.edit_type && this.margin_mode == surrogate.margin_mode && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.buying_power_effect, surrogate.buying_power_effect) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.edit_type.hashCode()) * 31) + this.margin_mode.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            String str = this.contract_id;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.position_id;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BuyingPowerEffectDto buyingPowerEffectDto = this.buying_power_effect;
            int iHashCode5 = (iHashCode4 + (buyingPowerEffectDto == null ? 0 : buyingPowerEffectDto.hashCode())) * 31;
            Instant instant = this.created_at;
            int iHashCode6 = (iHashCode5 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            return iHashCode6 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", status=" + this.status + ", edit_type=" + this.edit_type + ", margin_mode=" + this.margin_mode + ", amount=" + this.amount + ", contract_id=" + this.contract_id + ", position_id=" + this.position_id + ", buying_power_effect=" + this.buying_power_effect + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginEditDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, StatusDto statusDto, MarginEditTypeDto marginEditTypeDto, MarginModeDto marginModeDto, MoneyDto moneyDto, String str2, String str3, BuyingPowerEffectDto buyingPowerEffectDto, Instant instant, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.status = StatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = statusDto;
            }
            if ((i & 4) == 0) {
                this.edit_type = MarginEditTypeDto.INSTANCE.getZeroValue();
            } else {
                this.edit_type = marginEditTypeDto;
            }
            if ((i & 8) == 0) {
                this.margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_mode = marginModeDto;
            }
            if ((i & 16) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 32) == 0) {
                this.contract_id = null;
            } else {
                this.contract_id = str2;
            }
            if ((i & 64) == 0) {
                this.position_id = null;
            } else {
                this.position_id = str3;
            }
            if ((i & 128) == 0) {
                this.buying_power_effect = null;
            } else {
                this.buying_power_effect = buyingPowerEffectDto;
            }
            if ((i & 256) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 512) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_position_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.status != StatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, StatusDto.Serializer.INSTANCE, self.status);
            }
            if (self.edit_type != MarginEditTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, MarginEditTypeDto.Serializer.INSTANCE, self.edit_type);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            String str = self.contract_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            String str2 = self.position_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
            }
            BuyingPowerEffectDto buyingPowerEffectDto = self.buying_power_effect;
            if (buyingPowerEffectDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BuyingPowerEffectDto.Serializer.INSTANCE, buyingPowerEffectDto);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(String id, StatusDto status, MarginEditTypeDto edit_type, MarginModeDto margin_mode, MoneyDto moneyDto, String str, String str2, BuyingPowerEffectDto buyingPowerEffectDto, Instant instant, Instant instant2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(edit_type, "edit_type");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            this.id = id;
            this.status = status;
            this.edit_type = edit_type;
            this.margin_mode = margin_mode;
            this.amount = moneyDto;
            this.contract_id = str;
            this.position_id = str2;
            this.buying_power_effect = buyingPowerEffectDto;
            this.created_at = instant;
            this.updated_at = instant2;
        }

        public final String getId() {
            return this.id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, crypto_perpetuals.position.v1.MarginEditDto.StatusDto r3, crypto_perpetuals.position.p439v1.MarginEditTypeDto r4, crypto_perpetuals.common.p435v1.MarginModeDto r5, crypto_perpetuals.common.p435v1.MoneyDto r6, java.lang.String r7, java.lang.String r8, crypto_perpetuals.position.p439v1.BuyingPowerEffectDto r9, p479j$.time.Instant r10, p479j$.time.Instant r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                if (r13 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r13 = r12 & 2
                if (r13 == 0) goto L10
                crypto_perpetuals.position.v1.MarginEditDto$StatusDto$Companion r3 = crypto_perpetuals.position.v1.MarginEditDto.StatusDto.INSTANCE
                crypto_perpetuals.position.v1.MarginEditDto$StatusDto r3 = r3.getZeroValue()
            L10:
                r13 = r12 & 4
                if (r13 == 0) goto L1a
                crypto_perpetuals.position.v1.MarginEditTypeDto$Companion r4 = crypto_perpetuals.position.p439v1.MarginEditTypeDto.INSTANCE
                crypto_perpetuals.position.v1.MarginEditTypeDto r4 = r4.getZeroValue()
            L1a:
                r13 = r12 & 8
                if (r13 == 0) goto L24
                crypto_perpetuals.common.v1.MarginModeDto$Companion r5 = crypto_perpetuals.common.p435v1.MarginModeDto.INSTANCE
                crypto_perpetuals.common.v1.MarginModeDto r5 = r5.getZeroValue()
            L24:
                r13 = r12 & 16
                r0 = 0
                if (r13 == 0) goto L2a
                r6 = r0
            L2a:
                r13 = r12 & 32
                if (r13 == 0) goto L2f
                r7 = r0
            L2f:
                r13 = r12 & 64
                if (r13 == 0) goto L34
                r8 = r0
            L34:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L39
                r9 = r0
            L39:
                r13 = r12 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L3e
                r10 = r0
            L3e:
                r12 = r12 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L4e
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L59
            L4e:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L59:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.position.p439v1.MarginEditDto.Surrogate.<init>(java.lang.String, crypto_perpetuals.position.v1.MarginEditDto$StatusDto, crypto_perpetuals.position.v1.MarginEditTypeDto, crypto_perpetuals.common.v1.MarginModeDto, crypto_perpetuals.common.v1.MoneyDto, java.lang.String, java.lang.String, crypto_perpetuals.position.v1.BuyingPowerEffectDto, j$.time.Instant, j$.time.Instant, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final StatusDto getStatus() {
            return this.status;
        }

        public final MarginEditTypeDto getEdit_type() {
            return this.edit_type;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final String getPosition_id() {
            return this.position_id;
        }

        public final BuyingPowerEffectDto getBuying_power_effect() {
            return this.buying_power_effect;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }
    }

    /* compiled from: MarginEditDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/position/v1/MarginEditDto;", "Lcrypto_perpetuals/position/v1/MarginEdit;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/position/v1/MarginEditDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MarginEditDto, MarginEdit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginEditDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginEditDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginEditDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginEditDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginEdit> getProtoAdapter() {
            return MarginEdit.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginEditDto getZeroValue() {
            return MarginEditDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginEditDto fromProto(MarginEdit proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            StatusDto statusDtoFromProto = StatusDto.INSTANCE.fromProto(proto.getStatus());
            MarginEditTypeDto marginEditTypeDtoFromProto = MarginEditTypeDto.INSTANCE.fromProto(proto.getEdit_type());
            MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode());
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            String contract_id = proto.getContract_id();
            String position_id = proto.getPosition_id();
            BuyingPowerEffect buying_power_effect = proto.getBuying_power_effect();
            return new MarginEditDto(new Surrogate(id, statusDtoFromProto, marginEditTypeDtoFromProto, marginModeDtoFromProto, moneyDtoFromProto, contract_id, position_id, buying_power_effect != null ? BuyingPowerEffectDto.INSTANCE.fromProto(buying_power_effect) : null, proto.getCreated_at(), proto.getUpdated_at()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.position.v1.MarginEditDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginEditDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginEditDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarginEditDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATUS_UNSPECIFIED", "STATUS_PENDING", "STATUS_COMPLETED", "STATUS_FAILED", "STATUS_PARTIALLY_FILLED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StatusDto implements Dto2<MarginEdit.Status>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StatusDto, MarginEdit.Status>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final StatusDto STATUS_UNSPECIFIED = new STATUS_UNSPECIFIED("STATUS_UNSPECIFIED", 0);
        public static final StatusDto STATUS_PENDING = new STATUS_PENDING("STATUS_PENDING", 1);
        public static final StatusDto STATUS_COMPLETED = new STATUS_COMPLETED("STATUS_COMPLETED", 2);
        public static final StatusDto STATUS_FAILED = new STATUS_FAILED("STATUS_FAILED", 3);
        public static final StatusDto STATUS_PARTIALLY_FILLED = new STATUS_PARTIALLY_FILLED("STATUS_PARTIALLY_FILLED", 4);

        private static final /* synthetic */ StatusDto[] $values() {
            return new StatusDto[]{STATUS_UNSPECIFIED, STATUS_PENDING, STATUS_COMPLETED, STATUS_FAILED, STATUS_PARTIALLY_FILLED};
        }

        public /* synthetic */ StatusDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<StatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private StatusDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/position/v1/MarginEditDto.StatusDto.STATUS_UNSPECIFIED", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "toProto", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_UNSPECIFIED extends StatusDto {
            STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, "unspecified", null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginEdit.Status toProto() {
                return MarginEdit.Status.STATUS_UNSPECIFIED;
            }
        }

        static {
            StatusDto[] statusDtoArr$values = $values();
            $VALUES = statusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.position.v1.MarginEditDto$StatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginEditDto.StatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/position/v1/MarginEditDto.StatusDto.STATUS_PENDING", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "toProto", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_PENDING extends StatusDto {
            STATUS_PENDING(String str, int i) {
                super(str, i, "pending", null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginEdit.Status toProto() {
                return MarginEdit.Status.STATUS_PENDING;
            }
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/position/v1/MarginEditDto.StatusDto.STATUS_COMPLETED", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "toProto", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_COMPLETED extends StatusDto {
            STATUS_COMPLETED(String str, int i) {
                super(str, i, "completed", null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginEdit.Status toProto() {
                return MarginEdit.Status.STATUS_COMPLETED;
            }
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/position/v1/MarginEditDto.StatusDto.STATUS_FAILED", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "toProto", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_FAILED extends StatusDto {
            STATUS_FAILED(String str, int i) {
                super(str, i, "failed", null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginEdit.Status toProto() {
                return MarginEdit.Status.STATUS_FAILED;
            }
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/position/v1/MarginEditDto.StatusDto.STATUS_PARTIALLY_FILLED", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "toProto", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_PARTIALLY_FILLED extends StatusDto {
            STATUS_PARTIALLY_FILLED(String str, int i) {
                super(str, i, "partially_filled", null);
            }

            @Override // com.robinhood.idl.Dto
            public MarginEdit.Status toProto() {
                return MarginEdit.Status.STATUS_PARTIALLY_FILLED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StatusDto, MarginEdit.Status> {

            /* compiled from: MarginEditDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MarginEdit.Status.values().length];
                    try {
                        iArr[MarginEdit.Status.STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MarginEdit.Status.STATUS_PENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MarginEdit.Status.STATUS_COMPLETED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MarginEdit.Status.STATUS_FAILED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[MarginEdit.Status.STATUS_PARTIALLY_FILLED.ordinal()] = 5;
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

            public final KSerializer<StatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StatusDto> getBinaryBase64Serializer() {
                return (KSerializer) StatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MarginEdit.Status> getProtoAdapter() {
                return MarginEdit.Status.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto getZeroValue() {
                return StatusDto.STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto fromProto(MarginEdit.Status proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StatusDto.STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return StatusDto.STATUS_PENDING;
                }
                if (i == 3) {
                    return StatusDto.STATUS_COMPLETED;
                }
                if (i == 4) {
                    return StatusDto.STATUS_FAILED;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return StatusDto.STATUS_PARTIALLY_FILLED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MarginEditDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/MarginEditDto$StatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StatusDto, MarginEdit.Status> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_perpetuals.position.v1.MarginEdit.Status", StatusDto.getEntries(), StatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: MarginEditDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/MarginEditDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/position/v1/MarginEditDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginEditDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.position.v1.MarginEdit", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginEditDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginEditDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginEditDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginEditDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEditDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "crypto_perpetuals.position.v1.MarginEditDto";
        }
    }
}
