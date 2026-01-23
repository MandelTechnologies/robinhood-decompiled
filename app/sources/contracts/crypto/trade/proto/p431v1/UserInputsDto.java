package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.UserInputs;
import contracts.crypto.trade.proto.p431v1.UserInputsDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;
import rosetta.nummus.order.InputMode;
import rosetta.nummus.order.InputModeDto;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.SideDto;
import rosetta.nummus.order.TimeInForce;
import rosetta.nummus.order.TimeInForceDto;

/* compiled from: UserInputsDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00057689:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006;"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;)V", "Lrosetta/nummus/order/InputModeDto;", "input_mode", "Lrosetta/nummus/order/SideDto;", "order_side", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "crypto_order_prices", "Lrosetta/nummus/order/TimeInForceDto;", "time_in_force", "display_asset_quantity", "fee_ratio", "(Lrosetta/nummus/order/InputModeDto;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;Lrosetta/nummus/order/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/UserInputs;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;", "getInput_mode", "()Lrosetta/nummus/order/InputModeDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getCrypto_order_prices", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "Companion", "Surrogate", "CryptoOrderPricesDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class UserInputsDto implements Dto3<UserInputs>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UserInputsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UserInputsDto, UserInputs>> binaryBase64Serializer$delegate;
    private static final UserInputsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UserInputsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UserInputsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InputModeDto getInput_mode() {
        return this.surrogate.getInput_mode();
    }

    public final SideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final MonetizationModelDto getMonetization_model() {
        return this.surrogate.getMonetization_model();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final CryptoOrderPricesDto getCrypto_order_prices() {
        return this.surrogate.getCrypto_order_prices();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UserInputsDto(rosetta.nummus.order.InputModeDto r2, rosetta.nummus.order.SideDto r3, rosetta.nummus.MonetizationModelDto r4, com.robinhood.idl.IdlDecimal r5, contracts.crypto.trade.proto.v1.UserInputsDto.CryptoOrderPricesDto r6, rosetta.nummus.order.TimeInForceDto r7, com.robinhood.idl.IdlDecimal r8, com.robinhood.idl.IdlDecimal r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            rosetta.nummus.order.InputModeDto$Companion r2 = rosetta.nummus.order.InputModeDto.INSTANCE
            rosetta.nummus.order.InputModeDto r2 = r2.getZeroValue()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L14
            rosetta.nummus.order.SideDto$Companion r3 = rosetta.nummus.order.SideDto.INSTANCE
            rosetta.nummus.order.SideDto r3 = r3.getZeroValue()
        L14:
            r11 = r10 & 4
            if (r11 == 0) goto L1e
            rosetta.nummus.MonetizationModelDto$Companion r4 = rosetta.nummus.MonetizationModelDto.INSTANCE
            rosetta.nummus.MonetizationModelDto r4 = r4.getZeroValue()
        L1e:
            r11 = r10 & 8
            r0 = 0
            if (r11 == 0) goto L24
            r5 = r0
        L24:
            r11 = r10 & 16
            if (r11 == 0) goto L29
            r6 = r0
        L29:
            r11 = r10 & 32
            if (r11 == 0) goto L33
            rosetta.nummus.order.TimeInForceDto$Companion r7 = rosetta.nummus.order.TimeInForceDto.INSTANCE
            rosetta.nummus.order.TimeInForceDto r7 = r7.getZeroValue()
        L33:
            r11 = r10 & 64
            if (r11 == 0) goto L3e
            com.robinhood.idl.IdlDecimal r8 = new com.robinhood.idl.IdlDecimal
            java.lang.String r11 = ""
            r8.<init>(r11)
        L3e:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L4c
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L55
        L4c:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L55:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: contracts.crypto.trade.proto.p431v1.UserInputsDto.<init>(rosetta.nummus.order.InputModeDto, rosetta.nummus.order.SideDto, rosetta.nummus.MonetizationModelDto, com.robinhood.idl.IdlDecimal, contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto, rosetta.nummus.order.TimeInForceDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserInputsDto(InputModeDto input_mode, SideDto order_side, MonetizationModelDto monetization_model, IdlDecimal idlDecimal, CryptoOrderPricesDto cryptoOrderPricesDto, TimeInForceDto time_in_force, IdlDecimal display_asset_quantity, IdlDecimal idlDecimal2) {
        this(new Surrogate(input_mode, order_side, monetization_model, idlDecimal, cryptoOrderPricesDto, time_in_force, display_asset_quantity, idlDecimal2));
        Intrinsics.checkNotNullParameter(input_mode, "input_mode");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(display_asset_quantity, "display_asset_quantity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UserInputs toProto() {
        InputMode inputMode = (InputMode) this.surrogate.getInput_mode().toProto();
        Side side = (Side) this.surrogate.getOrder_side().toProto();
        MonetizationModel monetizationModel = (MonetizationModel) this.surrogate.getMonetization_model().toProto();
        IdlDecimal quantity = this.surrogate.getQuantity();
        String stringValue = quantity != null ? quantity.getStringValue() : null;
        CryptoOrderPricesDto crypto_order_prices = this.surrogate.getCrypto_order_prices();
        UserInputs.CryptoOrderPrices proto = crypto_order_prices != null ? crypto_order_prices.toProto() : null;
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        String stringValue2 = this.surrogate.getDisplay_asset_quantity().getStringValue();
        IdlDecimal fee_ratio = this.surrogate.getFee_ratio();
        return new UserInputs(inputMode, side, monetizationModel, stringValue, proto, timeInForce, stringValue2, fee_ratio != null ? fee_ratio.getStringValue() : null, null, 256, null);
    }

    public String toString() {
        return "[UserInputsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UserInputsDto) && Intrinsics.areEqual(((UserInputsDto) other).surrogate, this.surrogate);
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
    /* compiled from: UserInputsDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIB\u008a\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\u0013\u0010\u0014Bk\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R1\u0010\f\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bD\u00100\u001a\u0004\bB\u0010CR/\u0010\u0011\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00109\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010;R1\u0010\u0012\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00109\u0012\u0004\bH\u00100\u001a\u0004\bG\u0010;¨\u0006K"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;", "", "Lrosetta/nummus/order/InputModeDto;", "input_mode", "Lrosetta/nummus/order/SideDto;", "order_side", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "crypto_order_prices", "Lrosetta/nummus/order/TimeInForceDto;", "time_in_force", "display_asset_quantity", "fee_ratio", "<init>", "(Lrosetta/nummus/order/InputModeDto;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;Lrosetta/nummus/order/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/nummus/order/InputModeDto;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;Lrosetta/nummus/order/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/nummus/order/InputModeDto;", "getInput_mode", "()Lrosetta/nummus/order/InputModeDto;", "getInput_mode$annotations", "()V", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "getCrypto_order_prices", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "getCrypto_order_prices$annotations", "Lrosetta/nummus/order/TimeInForceDto;", "getTime_in_force", "()Lrosetta/nummus/order/TimeInForceDto;", "getTime_in_force$annotations", "getDisplay_asset_quantity", "getDisplay_asset_quantity$annotations", "getFee_ratio", "getFee_ratio$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoOrderPricesDto crypto_order_prices;
        private final IdlDecimal display_asset_quantity;
        private final IdlDecimal fee_ratio;
        private final InputModeDto input_mode;
        private final MonetizationModelDto monetization_model;
        private final SideDto order_side;
        private final IdlDecimal quantity;
        private final TimeInForceDto time_in_force;

        public Surrogate() {
            this((InputModeDto) null, (SideDto) null, (MonetizationModelDto) null, (IdlDecimal) null, (CryptoOrderPricesDto) null, (TimeInForceDto) null, (IdlDecimal) null, (IdlDecimal) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.input_mode == surrogate.input_mode && this.order_side == surrogate.order_side && this.monetization_model == surrogate.monetization_model && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.crypto_order_prices, surrogate.crypto_order_prices) && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.display_asset_quantity, surrogate.display_asset_quantity) && Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio);
        }

        public int hashCode() {
            int iHashCode = ((((this.input_mode.hashCode() * 31) + this.order_side.hashCode()) * 31) + this.monetization_model.hashCode()) * 31;
            IdlDecimal idlDecimal = this.quantity;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            CryptoOrderPricesDto cryptoOrderPricesDto = this.crypto_order_prices;
            int iHashCode3 = (((((iHashCode2 + (cryptoOrderPricesDto == null ? 0 : cryptoOrderPricesDto.hashCode())) * 31) + this.time_in_force.hashCode()) * 31) + this.display_asset_quantity.hashCode()) * 31;
            IdlDecimal idlDecimal2 = this.fee_ratio;
            return iHashCode3 + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(input_mode=" + this.input_mode + ", order_side=" + this.order_side + ", monetization_model=" + this.monetization_model + ", quantity=" + this.quantity + ", crypto_order_prices=" + this.crypto_order_prices + ", time_in_force=" + this.time_in_force + ", display_asset_quantity=" + this.display_asset_quantity + ", fee_ratio=" + this.fee_ratio + ")";
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UserInputsDto6.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, InputModeDto inputModeDto, SideDto sideDto, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, CryptoOrderPricesDto cryptoOrderPricesDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            this.input_mode = (i & 1) == 0 ? InputModeDto.INSTANCE.getZeroValue() : inputModeDto;
            if ((i & 2) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
            if ((i & 4) == 0) {
                this.monetization_model = MonetizationModelDto.INSTANCE.getZeroValue();
            } else {
                this.monetization_model = monetizationModelDto;
            }
            if ((i & 8) == 0) {
                this.quantity = null;
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.crypto_order_prices = null;
            } else {
                this.crypto_order_prices = cryptoOrderPricesDto;
            }
            if ((i & 32) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 64) == 0) {
                this.display_asset_quantity = new IdlDecimal("");
            } else {
                this.display_asset_quantity = idlDecimal2;
            }
            if ((i & 128) == 0) {
                this.fee_ratio = null;
            } else {
                this.fee_ratio = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.input_mode != InputModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, InputModeDto.Serializer.INSTANCE, self.input_mode);
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.order_side);
            }
            if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
            }
            IdlDecimal idlDecimal = self.quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            CryptoOrderPricesDto cryptoOrderPricesDto = self.crypto_order_prices;
            if (cryptoOrderPricesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CryptoOrderPricesDto.Serializer.INSTANCE, cryptoOrderPricesDto);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (!Intrinsics.areEqual(self.display_asset_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.display_asset_quantity);
            }
            IdlDecimal idlDecimal2 = self.fee_ratio;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
        }

        public Surrogate(InputModeDto input_mode, SideDto order_side, MonetizationModelDto monetization_model, IdlDecimal idlDecimal, CryptoOrderPricesDto cryptoOrderPricesDto, TimeInForceDto time_in_force, IdlDecimal display_asset_quantity, IdlDecimal idlDecimal2) {
            Intrinsics.checkNotNullParameter(input_mode, "input_mode");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(display_asset_quantity, "display_asset_quantity");
            this.input_mode = input_mode;
            this.order_side = order_side;
            this.monetization_model = monetization_model;
            this.quantity = idlDecimal;
            this.crypto_order_prices = cryptoOrderPricesDto;
            this.time_in_force = time_in_force;
            this.display_asset_quantity = display_asset_quantity;
            this.fee_ratio = idlDecimal2;
        }

        public final InputModeDto getInput_mode() {
            return this.input_mode;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(rosetta.nummus.order.InputModeDto r2, rosetta.nummus.order.SideDto r3, rosetta.nummus.MonetizationModelDto r4, com.robinhood.idl.IdlDecimal r5, contracts.crypto.trade.proto.v1.UserInputsDto.CryptoOrderPricesDto r6, rosetta.nummus.order.TimeInForceDto r7, com.robinhood.idl.IdlDecimal r8, com.robinhood.idl.IdlDecimal r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                rosetta.nummus.order.InputModeDto$Companion r2 = rosetta.nummus.order.InputModeDto.INSTANCE
                rosetta.nummus.order.InputModeDto r2 = r2.getZeroValue()
            La:
                r11 = r10 & 2
                if (r11 == 0) goto L14
                rosetta.nummus.order.SideDto$Companion r3 = rosetta.nummus.order.SideDto.INSTANCE
                rosetta.nummus.order.SideDto r3 = r3.getZeroValue()
            L14:
                r11 = r10 & 4
                if (r11 == 0) goto L1e
                rosetta.nummus.MonetizationModelDto$Companion r4 = rosetta.nummus.MonetizationModelDto.INSTANCE
                rosetta.nummus.MonetizationModelDto r4 = r4.getZeroValue()
            L1e:
                r11 = r10 & 8
                r0 = 0
                if (r11 == 0) goto L24
                r5 = r0
            L24:
                r11 = r10 & 16
                if (r11 == 0) goto L29
                r6 = r0
            L29:
                r11 = r10 & 32
                if (r11 == 0) goto L33
                rosetta.nummus.order.TimeInForceDto$Companion r7 = rosetta.nummus.order.TimeInForceDto.INSTANCE
                rosetta.nummus.order.TimeInForceDto r7 = r7.getZeroValue()
            L33:
                r11 = r10 & 64
                if (r11 == 0) goto L3e
                com.robinhood.idl.IdlDecimal r8 = new com.robinhood.idl.IdlDecimal
                java.lang.String r11 = ""
                r8.<init>(r11)
            L3e:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L4c
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L55
            L4c:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L55:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: contracts.crypto.trade.proto.p431v1.UserInputsDto.Surrogate.<init>(rosetta.nummus.order.InputModeDto, rosetta.nummus.order.SideDto, rosetta.nummus.MonetizationModelDto, com.robinhood.idl.IdlDecimal, contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto, rosetta.nummus.order.TimeInForceDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final CryptoOrderPricesDto getCrypto_order_prices() {
            return this.crypto_order_prices;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final IdlDecimal getDisplay_asset_quantity() {
            return this.display_asset_quantity;
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }
    }

    /* compiled from: UserInputsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<UserInputsDto, UserInputs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UserInputsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserInputsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserInputsDto> getBinaryBase64Serializer() {
            return (KSerializer) UserInputsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UserInputs> getProtoAdapter() {
            return UserInputs.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserInputsDto getZeroValue() {
            return UserInputsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserInputsDto fromProto(UserInputs proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            InputModeDto inputModeDtoFromProto = InputModeDto.INSTANCE.fromProto(proto.getInput_mode());
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getOrder_side());
            MonetizationModelDto monetizationModelDtoFromProto = MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model());
            String quantity = proto.getQuantity();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = quantity != null ? new IdlDecimal(quantity) : null;
            UserInputs.CryptoOrderPrices crypto_order_prices = proto.getCrypto_order_prices();
            CryptoOrderPricesDto cryptoOrderPricesDtoFromProto = crypto_order_prices != null ? CryptoOrderPricesDto.INSTANCE.fromProto(crypto_order_prices) : null;
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getDisplay_asset_quantity());
            String fee_ratio = proto.getFee_ratio();
            return new UserInputsDto(new Surrogate(inputModeDtoFromProto, sideDtoFromProto, monetizationModelDtoFromProto, idlDecimal, cryptoOrderPricesDtoFromProto, timeInForceDtoFromProto, idlDecimal2, fee_ratio != null ? new IdlDecimal(fee_ratio) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserInputsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UserInputsDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UserInputsDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t#\"$%&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006+"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "prices", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;", "getPrices", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Companion", "Surrogate", "PricesDto", "MarketDto", "LimitDto", "StopLossDto", "StopLimitDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CryptoOrderPricesDto implements Dto3<UserInputs.CryptoOrderPrices>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CryptoOrderPricesDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderPricesDto, UserInputs.CryptoOrderPrices>> binaryBase64Serializer$delegate;
        private static final CryptoOrderPricesDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CryptoOrderPricesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CryptoOrderPricesDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final PricesDto getPrices() {
            if (this.surrogate.getMarket() != null) {
                return new PricesDto.Market(this.surrogate.getMarket());
            }
            if (this.surrogate.getLimit() != null) {
                return new PricesDto.Limit(this.surrogate.getLimit());
            }
            if (this.surrogate.getStop_loss() != null) {
                return new PricesDto.StopLoss(this.surrogate.getStop_loss());
            }
            if (this.surrogate.getStop_limit() != null) {
                return new PricesDto.StopLimit(this.surrogate.getStop_limit());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CryptoOrderPricesDto(PricesDto pricesDto) {
            PricesDto.Market market = pricesDto instanceof PricesDto.Market ? (PricesDto.Market) pricesDto : null;
            MarketDto value = market != null ? market.getValue() : null;
            PricesDto.Limit limit = pricesDto instanceof PricesDto.Limit ? (PricesDto.Limit) pricesDto : null;
            LimitDto value2 = limit != null ? limit.getValue() : null;
            PricesDto.StopLoss stopLoss = pricesDto instanceof PricesDto.StopLoss ? (PricesDto.StopLoss) pricesDto : null;
            StopLossDto value3 = stopLoss != null ? stopLoss.getValue() : null;
            PricesDto.StopLimit stopLimit = pricesDto instanceof PricesDto.StopLimit ? (PricesDto.StopLimit) pricesDto : null;
            this(new Surrogate(value, value2, value3, stopLimit != null ? stopLimit.getValue() : null));
        }

        public /* synthetic */ CryptoOrderPricesDto(PricesDto pricesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pricesDto);
        }

        @Override // com.robinhood.idl.Dto
        public UserInputs.CryptoOrderPrices toProto() {
            MarketDto market = this.surrogate.getMarket();
            UserInputs.CryptoOrderPrices.Market proto = market != null ? market.toProto() : null;
            LimitDto limit = this.surrogate.getLimit();
            UserInputs.CryptoOrderPrices.Limit proto2 = limit != null ? limit.toProto() : null;
            StopLossDto stop_loss = this.surrogate.getStop_loss();
            UserInputs.CryptoOrderPrices.StopLoss proto3 = stop_loss != null ? stop_loss.toProto() : null;
            StopLimitDto stop_limit = this.surrogate.getStop_limit();
            return new UserInputs.CryptoOrderPrices(proto, proto2, proto3, stop_limit != null ? stop_limit.toProto() : null, null, 16, null);
        }

        public String toString() {
            return "[CryptoOrderPricesDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CryptoOrderPricesDto) && Intrinsics.areEqual(((CryptoOrderPricesDto) other).surrogate, this.surrogate);
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
        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "market", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "limit", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "stop_loss", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "stop_limit", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "getMarket", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "getMarket$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "getLimit", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "getLimit$annotations", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "getStop_loss", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "getStop_loss$annotations", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "getStop_limit", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "getStop_limit$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final LimitDto limit;
            private final MarketDto market;
            private final StopLimitDto stop_limit;
            private final StopLossDto stop_loss;

            public Surrogate() {
                this((MarketDto) null, (LimitDto) null, (StopLossDto) null, (StopLimitDto) null, 15, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.market, surrogate.market) && Intrinsics.areEqual(this.limit, surrogate.limit) && Intrinsics.areEqual(this.stop_loss, surrogate.stop_loss) && Intrinsics.areEqual(this.stop_limit, surrogate.stop_limit);
            }

            public int hashCode() {
                MarketDto marketDto = this.market;
                int iHashCode = (marketDto == null ? 0 : marketDto.hashCode()) * 31;
                LimitDto limitDto = this.limit;
                int iHashCode2 = (iHashCode + (limitDto == null ? 0 : limitDto.hashCode())) * 31;
                StopLossDto stopLossDto = this.stop_loss;
                int iHashCode3 = (iHashCode2 + (stopLossDto == null ? 0 : stopLossDto.hashCode())) * 31;
                StopLimitDto stopLimitDto = this.stop_limit;
                return iHashCode3 + (stopLimitDto != null ? stopLimitDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(market=" + this.market + ", limit=" + this.limit + ", stop_loss=" + this.stop_loss + ", stop_limit=" + this.stop_limit + ")";
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return UserInputsDto5.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, MarketDto marketDto, LimitDto limitDto, StopLossDto stopLossDto, StopLimitDto stopLimitDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.market = null;
                } else {
                    this.market = marketDto;
                }
                if ((i & 2) == 0) {
                    this.limit = null;
                } else {
                    this.limit = limitDto;
                }
                if ((i & 4) == 0) {
                    this.stop_loss = null;
                } else {
                    this.stop_loss = stopLossDto;
                }
                if ((i & 8) == 0) {
                    this.stop_limit = null;
                } else {
                    this.stop_limit = stopLimitDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                MarketDto marketDto = self.market;
                if (marketDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, MarketDto.Serializer.INSTANCE, marketDto);
                }
                LimitDto limitDto = self.limit;
                if (limitDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, LimitDto.Serializer.INSTANCE, limitDto);
                }
                StopLossDto stopLossDto = self.stop_loss;
                if (stopLossDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, StopLossDto.Serializer.INSTANCE, stopLossDto);
                }
                StopLimitDto stopLimitDto = self.stop_limit;
                if (stopLimitDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, StopLimitDto.Serializer.INSTANCE, stopLimitDto);
                }
            }

            public Surrogate(MarketDto marketDto, LimitDto limitDto, StopLossDto stopLossDto, StopLimitDto stopLimitDto) {
                this.market = marketDto;
                this.limit = limitDto;
                this.stop_loss = stopLossDto;
                this.stop_limit = stopLimitDto;
            }

            public /* synthetic */ Surrogate(MarketDto marketDto, LimitDto limitDto, StopLossDto stopLossDto, StopLimitDto stopLimitDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : marketDto, (i & 2) != 0 ? null : limitDto, (i & 4) != 0 ? null : stopLossDto, (i & 8) != 0 ? null : stopLimitDto);
            }

            public final MarketDto getMarket() {
                return this.market;
            }

            public final LimitDto getLimit() {
                return this.limit;
            }

            public final StopLossDto getStop_loss() {
                return this.stop_loss;
            }

            public final StopLimitDto getStop_limit() {
                return this.stop_limit;
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CryptoOrderPricesDto, UserInputs.CryptoOrderPrices> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CryptoOrderPricesDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderPricesDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderPricesDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoOrderPricesDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<UserInputs.CryptoOrderPrices> getProtoAdapter() {
                return UserInputs.CryptoOrderPrices.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderPricesDto getZeroValue() {
                return CryptoOrderPricesDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderPricesDto fromProto(UserInputs.CryptoOrderPrices proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                UserInputs.CryptoOrderPrices.Market market = proto.getMarket();
                DefaultConstructorMarker defaultConstructorMarker = null;
                MarketDto marketDtoFromProto = market != null ? MarketDto.INSTANCE.fromProto(market) : null;
                UserInputs.CryptoOrderPrices.Limit limit = proto.getLimit();
                LimitDto limitDtoFromProto = limit != null ? LimitDto.INSTANCE.fromProto(limit) : null;
                UserInputs.CryptoOrderPrices.StopLoss stop_loss = proto.getStop_loss();
                StopLossDto stopLossDtoFromProto = stop_loss != null ? StopLossDto.INSTANCE.fromProto(stop_loss) : null;
                UserInputs.CryptoOrderPrices.StopLimit stop_limit = proto.getStop_limit();
                return new CryptoOrderPricesDto(new Surrogate(marketDtoFromProto, limitDtoFromProto, stopLossDtoFromProto, stop_limit != null ? StopLimitDto.INSTANCE.fromProto(stop_limit) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserInputsDto.CryptoOrderPricesDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CryptoOrderPricesDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Market", "Limit", "StopLoss", "StopLimit", "Companion", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$Limit;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$Market;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$StopLimit;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$StopLoss;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class PricesDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ PricesDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private PricesDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$Market;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Market extends PricesDto {
                private final MarketDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Market) && Intrinsics.areEqual(this.value, ((Market) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Market(value=" + this.value + ")";
                }

                public final MarketDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Market(MarketDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$Limit;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Limit extends PricesDto {
                private final LimitDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Limit) && Intrinsics.areEqual(this.value, ((Limit) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Limit(value=" + this.value + ")";
                }

                public final LimitDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Limit(LimitDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$StopLoss;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class StopLoss extends PricesDto {
                private final StopLossDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StopLoss) && Intrinsics.areEqual(this.value, ((StopLoss) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "StopLoss(value=" + this.value + ")";
                }

                public final StopLossDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StopLoss(StopLossDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$StopLimit;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class StopLimit extends PricesDto {
                private final StopLimitDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StopLimit) && Intrinsics.areEqual(this.value, ((StopLimit) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "StopLimit(value=" + this.value + ")";
                }

                public final StopLimitDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StopLimit(StopLimitDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$PricesDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public static final class Companion implements Dto4.Creator<PricesDto, UserInputs.CryptoOrderPrices> {
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
                public ProtoAdapter<UserInputs.CryptoOrderPrices> getProtoAdapter() {
                    return UserInputs.CryptoOrderPrices.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public PricesDto fromProto(UserInputs.CryptoOrderPrices proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getMarket() != null) {
                        return new Market(MarketDto.INSTANCE.fromProto(proto.getMarket()));
                    }
                    if (proto.getLimit() != null) {
                        return new Limit(LimitDto.INSTANCE.fromProto(proto.getLimit()));
                    }
                    if (proto.getStop_loss() != null) {
                        return new StopLoss(StopLossDto.INSTANCE.fromProto(proto.getStop_loss()));
                    }
                    if (proto.getStop_limit() != null) {
                        return new StopLimit(StopLimitDto.INSTANCE.fromProto(proto.getStop_limit()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class MarketDto implements Dto3<UserInputs.CryptoOrderPrices.Market>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<MarketDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<MarketDto, UserInputs.CryptoOrderPrices.Market>> binaryBase64Serializer$delegate;
            private static final MarketDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ MarketDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private MarketDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public MarketDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public UserInputs.CryptoOrderPrices.Market toProto() {
                return new UserInputs.CryptoOrderPrices.Market(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[MarketDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof MarketDto) && Intrinsics.areEqual(((MarketDto) other).surrogate, this.surrogate);
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
            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$MarketDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserInputsDto.CryptoOrderPricesDto.MarketDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return -110806323;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("contracts.crypto.trade.proto.v1.UserInputsDto.CryptoOrderPricesDto.MarketDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Market;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<MarketDto, UserInputs.CryptoOrderPrices.Market> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<MarketDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<MarketDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<MarketDto> getBinaryBase64Serializer() {
                    return (KSerializer) MarketDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<UserInputs.CryptoOrderPrices.Market> getProtoAdapter() {
                    return UserInputs.CryptoOrderPrices.Market.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public MarketDto getZeroValue() {
                    return MarketDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public MarketDto fromProto(UserInputs.CryptoOrderPrices.Market proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new MarketDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$MarketDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserInputsDto.CryptoOrderPricesDto.MarketDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new MarketDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public static final class Serializer implements KSerializer<MarketDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.UserInputs.CryptoOrderPrices.Market", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, MarketDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public MarketDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new MarketDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MarketDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$MarketDto";
                }
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "limit_price", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class LimitDto implements Dto3<UserInputs.CryptoOrderPrices.Limit>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<LimitDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<LimitDto, UserInputs.CryptoOrderPrices.Limit>> binaryBase64Serializer$delegate;
            private static final LimitDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ LimitDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private LimitDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public LimitDto(IdlDecimal idlDecimal) {
                this(new Surrogate(idlDecimal));
            }

            public /* synthetic */ LimitDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public UserInputs.CryptoOrderPrices.Limit toProto() {
                IdlDecimal limit_price = this.surrogate.getLimit_price();
                return new UserInputs.CryptoOrderPrices.Limit(limit_price != null ? limit_price.getStringValue() : null, null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[LimitDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof LimitDto) && Intrinsics.areEqual(((LimitDto) other).surrogate, this.surrogate);
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
            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\"\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "limit_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getLimit_price", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal limit_price;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.limit_price, ((Surrogate) other).limit_price);
                }

                public int hashCode() {
                    IdlDecimal idlDecimal = this.limit_price;
                    if (idlDecimal == null) {
                        return 0;
                    }
                    return idlDecimal.hashCode();
                }

                public String toString() {
                    return "Surrogate(limit_price=" + this.limit_price + ")";
                }

                /* compiled from: UserInputsDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return UserInputsDto2.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.limit_price = null;
                    } else {
                        this.limit_price = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    IdlDecimal idlDecimal = self.limit_price;
                    if (idlDecimal != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                    }
                }

                public Surrogate(IdlDecimal idlDecimal) {
                    this.limit_price = idlDecimal;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal);
                }

                public final IdlDecimal getLimit_price() {
                    return this.limit_price;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$Limit;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<LimitDto, UserInputs.CryptoOrderPrices.Limit> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<LimitDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<LimitDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<LimitDto> getBinaryBase64Serializer() {
                    return (KSerializer) LimitDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<UserInputs.CryptoOrderPrices.Limit> getProtoAdapter() {
                    return UserInputs.CryptoOrderPrices.Limit.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public LimitDto getZeroValue() {
                    return LimitDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public LimitDto fromProto(UserInputs.CryptoOrderPrices.Limit proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String limit_price = proto.getLimit_price();
                    return new LimitDto(new Surrogate(limit_price != null ? new IdlDecimal(limit_price) : null), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$LimitDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserInputsDto.CryptoOrderPricesDto.LimitDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new LimitDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public static final class Serializer implements KSerializer<LimitDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.UserInputs.CryptoOrderPrices.Limit", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, LimitDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public LimitDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new LimitDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$LimitDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4187_3)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$LimitDto";
                }
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "stop_price", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class StopLossDto implements Dto3<UserInputs.CryptoOrderPrices.StopLoss>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<StopLossDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<StopLossDto, UserInputs.CryptoOrderPrices.StopLoss>> binaryBase64Serializer$delegate;
            private static final StopLossDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ StopLossDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private StopLossDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public StopLossDto(IdlDecimal idlDecimal) {
                this(new Surrogate(idlDecimal));
            }

            public /* synthetic */ StopLossDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public UserInputs.CryptoOrderPrices.StopLoss toProto() {
                IdlDecimal stop_price = this.surrogate.getStop_price();
                return new UserInputs.CryptoOrderPrices.StopLoss(stop_price != null ? stop_price.getStringValue() : null, null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[StopLossDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof StopLossDto) && Intrinsics.areEqual(((StopLossDto) other).surrogate, this.surrogate);
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
            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\"\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "stop_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getStop_price", "()Lcom/robinhood/idl/IdlDecimal;", "getStop_price$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal stop_price;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.stop_price, ((Surrogate) other).stop_price);
                }

                public int hashCode() {
                    IdlDecimal idlDecimal = this.stop_price;
                    if (idlDecimal == null) {
                        return 0;
                    }
                    return idlDecimal.hashCode();
                }

                public String toString() {
                    return "Surrogate(stop_price=" + this.stop_price + ")";
                }

                /* compiled from: UserInputsDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return UserInputsDto4.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.stop_price = null;
                    } else {
                        this.stop_price = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    IdlDecimal idlDecimal = self.stop_price;
                    if (idlDecimal != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                    }
                }

                public Surrogate(IdlDecimal idlDecimal) {
                    this.stop_price = idlDecimal;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal);
                }

                public final IdlDecimal getStop_price() {
                    return this.stop_price;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLoss;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<StopLossDto, UserInputs.CryptoOrderPrices.StopLoss> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<StopLossDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StopLossDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StopLossDto> getBinaryBase64Serializer() {
                    return (KSerializer) StopLossDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<UserInputs.CryptoOrderPrices.StopLoss> getProtoAdapter() {
                    return UserInputs.CryptoOrderPrices.StopLoss.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StopLossDto getZeroValue() {
                    return StopLossDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StopLossDto fromProto(UserInputs.CryptoOrderPrices.StopLoss proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String stop_price = proto.getStop_price();
                    return new StopLossDto(new Surrogate(stop_price != null ? new IdlDecimal(stop_price) : null), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$StopLossDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserInputsDto.CryptoOrderPricesDto.StopLossDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new StopLossDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public static final class Serializer implements KSerializer<StopLossDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.UserInputs.CryptoOrderPrices.StopLoss", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, StopLossDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public StopLossDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new StopLossDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLossDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4187_3)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$StopLossDto";
                }
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006%"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "limit_price", "stop_price", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class StopLimitDto implements Dto3<UserInputs.CryptoOrderPrices.StopLimit>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<StopLimitDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<StopLimitDto, UserInputs.CryptoOrderPrices.StopLimit>> binaryBase64Serializer$delegate;
            private static final StopLimitDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ StopLimitDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private StopLimitDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public StopLimitDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
                this(new Surrogate(idlDecimal, idlDecimal2));
            }

            public /* synthetic */ StopLimitDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2);
            }

            @Override // com.robinhood.idl.Dto
            public UserInputs.CryptoOrderPrices.StopLimit toProto() {
                IdlDecimal limit_price = this.surrogate.getLimit_price();
                String stringValue = limit_price != null ? limit_price.getStringValue() : null;
                IdlDecimal stop_price = this.surrogate.getStop_price();
                return new UserInputs.CryptoOrderPrices.StopLimit(stringValue, stop_price != null ? stop_price.getStringValue() : null, null, 4, null);
            }

            public String toString() {
                return "[StopLimitDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof StopLimitDto) && Intrinsics.areEqual(((StopLimitDto) other).surrogate, this.surrogate);
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
            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B=\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "limit_price", "stop_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getLimit_price", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price$annotations", "()V", "getStop_price", "getStop_price$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal limit_price;
                private final IdlDecimal stop_price;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, (IdlDecimal) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price);
                }

                public int hashCode() {
                    IdlDecimal idlDecimal = this.limit_price;
                    int iHashCode = (idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31;
                    IdlDecimal idlDecimal2 = this.stop_price;
                    return iHashCode + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ")";
                }

                /* compiled from: UserInputsDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return UserInputsDto3.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.limit_price = null;
                    } else {
                        this.limit_price = idlDecimal;
                    }
                    if ((i & 2) == 0) {
                        this.stop_price = null;
                    } else {
                        this.stop_price = idlDecimal2;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    IdlDecimal idlDecimal = self.limit_price;
                    if (idlDecimal != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                    }
                    IdlDecimal idlDecimal2 = self.stop_price;
                    if (idlDecimal2 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal2);
                    }
                }

                public Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
                    this.limit_price = idlDecimal;
                    this.stop_price = idlDecimal2;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2);
                }

                public final IdlDecimal getLimit_price() {
                    return this.limit_price;
                }

                public final IdlDecimal getStop_price() {
                    return this.stop_price;
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "Lcontracts/crypto/trade/proto/v1/UserInputs$CryptoOrderPrices$StopLimit;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<StopLimitDto, UserInputs.CryptoOrderPrices.StopLimit> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<StopLimitDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StopLimitDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StopLimitDto> getBinaryBase64Serializer() {
                    return (KSerializer) StopLimitDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<UserInputs.CryptoOrderPrices.StopLimit> getProtoAdapter() {
                    return UserInputs.CryptoOrderPrices.StopLimit.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StopLimitDto getZeroValue() {
                    return StopLimitDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StopLimitDto fromProto(UserInputs.CryptoOrderPrices.StopLimit proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String limit_price = proto.getLimit_price();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    IdlDecimal idlDecimal = limit_price != null ? new IdlDecimal(limit_price) : null;
                    String stop_price = proto.getStop_price();
                    return new StopLimitDto(new Surrogate(idlDecimal, stop_price != null ? new IdlDecimal(stop_price) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$StopLimitDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserInputsDto.CryptoOrderPricesDto.StopLimitDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new StopLimitDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public static final class Serializer implements KSerializer<StopLimitDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.UserInputs.CryptoOrderPrices.StopLimit", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, StopLimitDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public StopLimitDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new StopLimitDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: UserInputsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$StopLimitDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4187_3)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto$StopLimitDto";
                }
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Serializer implements KSerializer<CryptoOrderPricesDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.UserInputs.CryptoOrderPrices", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoOrderPricesDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CryptoOrderPricesDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CryptoOrderPricesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: UserInputsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$CryptoOrderPricesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.UserInputsDto$CryptoOrderPricesDto";
            }
        }
    }

    /* compiled from: UserInputsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/UserInputsDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/UserInputsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<UserInputsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.UserInputs", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UserInputsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UserInputsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UserInputsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UserInputsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/UserInputsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.UserInputsDto";
        }
    }
}
