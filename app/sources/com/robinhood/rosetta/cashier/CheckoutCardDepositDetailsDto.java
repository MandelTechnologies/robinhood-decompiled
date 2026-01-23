package com.robinhood.rosetta.cashier;

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
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardDepositDetails;
import com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: CheckoutCardDepositDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005<;=>?B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0006\u0010\u0017J\u0085\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0019\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b8\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;)V", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "card_amount", "user_amount", "", "card_number_last_four", "card_nickname", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "pending_id_check_at", "pending_account_approval_at", "completed_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "brokerage_accounting_details", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "copy", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "getCard_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getUser_amount", "getCard_number_last_four", "getCard_nickname", "getPending_id_check_at", "()Lj$/time/Instant;", "getPending_account_approval_at", "getCompleted_at", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "Companion", "Surrogate", "CheckoutCardDepositStateDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CheckoutCardDepositDetailsDto implements Dto3<CheckoutCardDepositDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CheckoutCardDepositDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardDepositDetailsDto, CheckoutCardDepositDetails>> binaryBase64Serializer$delegate;
    private static final CheckoutCardDepositDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CheckoutCardDepositDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CheckoutCardDepositDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CheckoutCardDepositStateDto getState() {
        return this.surrogate.getState();
    }

    public final MoneyDto getCard_amount() {
        return this.surrogate.getCard_amount();
    }

    public final MoneyDto getUser_amount() {
        return this.surrogate.getUser_amount();
    }

    public final String getCard_number_last_four() {
        return this.surrogate.getCard_number_last_four();
    }

    public final String getCard_nickname() {
        return this.surrogate.getCard_nickname();
    }

    public final Instant getPending_id_check_at() {
        return this.surrogate.getPending_id_check_at();
    }

    public final Instant getPending_account_approval_at() {
        return this.surrogate.getPending_account_approval_at();
    }

    public final Instant getCompleted_at() {
        return this.surrogate.getCompleted_at();
    }

    public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
        return this.surrogate.getBrokerage_accounting_details();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CheckoutCardDepositDetailsDto(com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.lang.String r6, java.lang.String r7, p479j$.time.Instant r8, p479j$.time.Instant r9, p479j$.time.Instant r10, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r2 = this;
            r13 = r12 & 1
            if (r13 == 0) goto La
            com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto$Companion r3 = com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.INSTANCE
            com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto r3 = r3.getZeroValue()
        La:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto L10
            r4 = r0
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L15
            r5 = r0
        L15:
            r13 = r12 & 8
            java.lang.String r1 = ""
            if (r13 == 0) goto L1c
            r6 = r1
        L1c:
            r13 = r12 & 16
            if (r13 == 0) goto L21
            r7 = r1
        L21:
            r13 = r12 & 32
            if (r13 == 0) goto L26
            r8 = r0
        L26:
            r13 = r12 & 64
            if (r13 == 0) goto L2b
            r9 = r0
        L2b:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L30
            r10 = r0
        L30:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L3f
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L49
        L3f:
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
        L49:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto.<init>(com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, j$.time.Instant, j$.time.Instant, j$.time.Instant, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckoutCardDepositDetailsDto(CheckoutCardDepositStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, String card_number_last_four, String card_nickname, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
        this(new Surrogate(state, moneyDto, moneyDto2, card_number_last_four, card_nickname, instant, instant2, instant3, brokerageAccountingDetailsDto));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
    }

    public static /* synthetic */ CheckoutCardDepositDetailsDto copy$default(CheckoutCardDepositDetailsDto checkoutCardDepositDetailsDto, CheckoutCardDepositStateDto checkoutCardDepositStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardDepositStateDto = checkoutCardDepositDetailsDto.surrogate.getState();
        }
        if ((i & 2) != 0) {
            moneyDto = checkoutCardDepositDetailsDto.surrogate.getCard_amount();
        }
        if ((i & 4) != 0) {
            moneyDto2 = checkoutCardDepositDetailsDto.surrogate.getUser_amount();
        }
        if ((i & 8) != 0) {
            str = checkoutCardDepositDetailsDto.surrogate.getCard_number_last_four();
        }
        if ((i & 16) != 0) {
            str2 = checkoutCardDepositDetailsDto.surrogate.getCard_nickname();
        }
        if ((i & 32) != 0) {
            instant = checkoutCardDepositDetailsDto.surrogate.getPending_id_check_at();
        }
        if ((i & 64) != 0) {
            instant2 = checkoutCardDepositDetailsDto.surrogate.getPending_account_approval_at();
        }
        if ((i & 128) != 0) {
            instant3 = checkoutCardDepositDetailsDto.surrogate.getCompleted_at();
        }
        if ((i & 256) != 0) {
            brokerageAccountingDetailsDto = checkoutCardDepositDetailsDto.surrogate.getBrokerage_accounting_details();
        }
        Instant instant4 = instant3;
        BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto;
        Instant instant5 = instant;
        Instant instant6 = instant2;
        String str3 = str2;
        MoneyDto moneyDto3 = moneyDto2;
        return checkoutCardDepositDetailsDto.copy(checkoutCardDepositStateDto, moneyDto, moneyDto3, str, str3, instant5, instant6, instant4, brokerageAccountingDetailsDto2);
    }

    public final CheckoutCardDepositDetailsDto copy(CheckoutCardDepositStateDto state, MoneyDto card_amount, MoneyDto user_amount, String card_number_last_four, String card_nickname, Instant pending_id_check_at, Instant pending_account_approval_at, Instant completed_at, BrokerageAccountingDetailsDto brokerage_accounting_details) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        return new CheckoutCardDepositDetailsDto(new Surrogate(state, card_amount, user_amount, card_number_last_four, card_nickname, pending_id_check_at, pending_account_approval_at, completed_at, brokerage_accounting_details));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CheckoutCardDepositDetails toProto() {
        CheckoutCardDepositDetails.CheckoutCardDepositState checkoutCardDepositState = (CheckoutCardDepositDetails.CheckoutCardDepositState) this.surrogate.getState().toProto();
        MoneyDto card_amount = this.surrogate.getCard_amount();
        Money proto = card_amount != null ? card_amount.toProto() : null;
        MoneyDto user_amount = this.surrogate.getUser_amount();
        Money proto2 = user_amount != null ? user_amount.toProto() : null;
        String card_number_last_four = this.surrogate.getCard_number_last_four();
        String card_nickname = this.surrogate.getCard_nickname();
        Instant pending_id_check_at = this.surrogate.getPending_id_check_at();
        Instant pending_account_approval_at = this.surrogate.getPending_account_approval_at();
        Instant completed_at = this.surrogate.getCompleted_at();
        BrokerageAccountingDetailsDto brokerage_accounting_details = this.surrogate.getBrokerage_accounting_details();
        return new CheckoutCardDepositDetails(checkoutCardDepositState, proto, proto2, card_number_last_four, card_nickname, pending_id_check_at, pending_account_approval_at, completed_at, brokerage_accounting_details != null ? brokerage_accounting_details.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[CheckoutCardDepositDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CheckoutCardDepositDetailsDto) && Intrinsics.areEqual(((CheckoutCardDepositDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CheckoutCardDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002TSBÙ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bu\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010*J6\u0010,\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J6\u0010.\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b.\u0010-J6\u0010/\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101Jâ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2.\b\u0002\u0010\u0010\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2.\b\u0002\u0010\u0011\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b4\u0010*J\u0010\u00105\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010?\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010?\u0012\u0004\bC\u0010>\u001a\u0004\bB\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010D\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010*R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010*RF\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bK\u0010>\u001a\u0004\bJ\u0010-RF\u0010\u0010\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010I\u0012\u0004\bM\u0010>\u001a\u0004\bL\u0010-RF\u0010\u0011\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010I\u0012\u0004\bO\u0010>\u001a\u0004\bN\u0010-R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010P\u0012\u0004\bR\u0010>\u001a\u0004\bQ\u00101¨\u0006U"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;", "", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "card_amount", "user_amount", "", "card_number_last_four", "card_nickname", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "pending_id_check_at", "pending_account_approval_at", "completed_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "brokerage_accounting_details", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "component2", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lj$/time/Instant;", "component7", "component8", "component9", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "copy", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "getState", "getState$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCard_amount", "getCard_amount$annotations", "getUser_amount", "getUser_amount$annotations", "Ljava/lang/String;", "getCard_number_last_four", "getCard_number_last_four$annotations", "getCard_nickname", "getCard_nickname$annotations", "Lj$/time/Instant;", "getPending_id_check_at", "getPending_id_check_at$annotations", "getPending_account_approval_at", "getPending_account_approval_at$annotations", "getCompleted_at", "getCompleted_at$annotations", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "getBrokerage_accounting_details", "getBrokerage_accounting_details$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountingDetailsDto brokerage_accounting_details;
        private final MoneyDto card_amount;
        private final String card_nickname;
        private final String card_number_last_four;
        private final Instant completed_at;
        private final Instant pending_account_approval_at;
        private final Instant pending_id_check_at;
        private final CheckoutCardDepositStateDto state;
        private final MoneyDto user_amount;

        public Surrogate() {
            this((CheckoutCardDepositStateDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, (String) null, (Instant) null, (Instant) null, (Instant) null, (BrokerageAccountingDetailsDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CheckoutCardDepositStateDto checkoutCardDepositStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutCardDepositStateDto = surrogate.state;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.card_amount;
            }
            if ((i & 4) != 0) {
                moneyDto2 = surrogate.user_amount;
            }
            if ((i & 8) != 0) {
                str = surrogate.card_number_last_four;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.card_nickname;
            }
            if ((i & 32) != 0) {
                instant = surrogate.pending_id_check_at;
            }
            if ((i & 64) != 0) {
                instant2 = surrogate.pending_account_approval_at;
            }
            if ((i & 128) != 0) {
                instant3 = surrogate.completed_at;
            }
            if ((i & 256) != 0) {
                brokerageAccountingDetailsDto = surrogate.brokerage_accounting_details;
            }
            Instant instant4 = instant3;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto;
            Instant instant5 = instant;
            Instant instant6 = instant2;
            String str3 = str2;
            MoneyDto moneyDto3 = moneyDto2;
            return surrogate.copy(checkoutCardDepositStateDto, moneyDto, moneyDto3, str, str3, instant5, instant6, instant4, brokerageAccountingDetailsDto2);
        }

        @SerialName("brokerageAccountingDetails")
        @JsonAnnotations2(names = {"brokerage_accounting_details"})
        public static /* synthetic */ void getBrokerage_accounting_details$annotations() {
        }

        @SerialName("cardAmount")
        @JsonAnnotations2(names = {"card_amount"})
        public static /* synthetic */ void getCard_amount$annotations() {
        }

        @SerialName("cardNickname")
        @JsonAnnotations2(names = {"card_nickname"})
        public static /* synthetic */ void getCard_nickname$annotations() {
        }

        @SerialName("cardNumberLastFour")
        @JsonAnnotations2(names = {"card_number_last_four"})
        public static /* synthetic */ void getCard_number_last_four$annotations() {
        }

        @SerialName("completedAt")
        @JsonAnnotations2(names = {"completed_at"})
        public static /* synthetic */ void getCompleted_at$annotations() {
        }

        @SerialName("pendingAccountApprovalAt")
        @JsonAnnotations2(names = {"pending_account_approval_at"})
        public static /* synthetic */ void getPending_account_approval_at$annotations() {
        }

        @SerialName("pendingIdCheckAt")
        @JsonAnnotations2(names = {"pending_id_check_at"})
        public static /* synthetic */ void getPending_id_check_at$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("userAmount")
        @JsonAnnotations2(names = {"user_amount"})
        public static /* synthetic */ void getUser_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CheckoutCardDepositStateDto getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getCard_amount() {
            return this.card_amount;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getUser_amount() {
            return this.user_amount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCard_number_last_four() {
            return this.card_number_last_four;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCard_nickname() {
            return this.card_nickname;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getPending_id_check_at() {
            return this.pending_id_check_at;
        }

        /* renamed from: component7, reason: from getter */
        public final Instant getPending_account_approval_at() {
            return this.pending_account_approval_at;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getCompleted_at() {
            return this.completed_at;
        }

        /* renamed from: component9, reason: from getter */
        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }

        public final Surrogate copy(CheckoutCardDepositStateDto state, MoneyDto card_amount, MoneyDto user_amount, String card_number_last_four, String card_nickname, Instant pending_id_check_at, Instant pending_account_approval_at, Instant completed_at, BrokerageAccountingDetailsDto brokerage_accounting_details) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            return new Surrogate(state, card_amount, user_amount, card_number_last_four, card_nickname, pending_id_check_at, pending_account_approval_at, completed_at, brokerage_accounting_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && Intrinsics.areEqual(this.card_amount, surrogate.card_amount) && Intrinsics.areEqual(this.user_amount, surrogate.user_amount) && Intrinsics.areEqual(this.card_number_last_four, surrogate.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, surrogate.card_nickname) && Intrinsics.areEqual(this.pending_id_check_at, surrogate.pending_id_check_at) && Intrinsics.areEqual(this.pending_account_approval_at, surrogate.pending_account_approval_at) && Intrinsics.areEqual(this.completed_at, surrogate.completed_at) && Intrinsics.areEqual(this.brokerage_accounting_details, surrogate.brokerage_accounting_details);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            MoneyDto moneyDto = this.card_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.user_amount;
            int iHashCode3 = (((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.card_number_last_four.hashCode()) * 31) + this.card_nickname.hashCode()) * 31;
            Instant instant = this.pending_id_check_at;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.pending_account_approval_at;
            int iHashCode5 = (iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.completed_at;
            int iHashCode6 = (iHashCode5 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = this.brokerage_accounting_details;
            return iHashCode6 + (brokerageAccountingDetailsDto != null ? brokerageAccountingDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", card_amount=" + this.card_amount + ", user_amount=" + this.user_amount + ", card_number_last_four=" + this.card_number_last_four + ", card_nickname=" + this.card_nickname + ", pending_id_check_at=" + this.pending_id_check_at + ", pending_account_approval_at=" + this.pending_account_approval_at + ", completed_at=" + this.completed_at + ", brokerage_accounting_details=" + this.brokerage_accounting_details + ")";
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CheckoutCardDepositDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CheckoutCardDepositStateDto checkoutCardDepositStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? CheckoutCardDepositStateDto.INSTANCE.getZeroValue() : checkoutCardDepositStateDto;
            if ((i & 2) == 0) {
                this.card_amount = null;
            } else {
                this.card_amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.user_amount = null;
            } else {
                this.user_amount = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.card_number_last_four = "";
            } else {
                this.card_number_last_four = str;
            }
            if ((i & 16) == 0) {
                this.card_nickname = "";
            } else {
                this.card_nickname = str2;
            }
            if ((i & 32) == 0) {
                this.pending_id_check_at = null;
            } else {
                this.pending_id_check_at = instant;
            }
            if ((i & 64) == 0) {
                this.pending_account_approval_at = null;
            } else {
                this.pending_account_approval_at = instant2;
            }
            if ((i & 128) == 0) {
                this.completed_at = null;
            } else {
                this.completed_at = instant3;
            }
            if ((i & 256) == 0) {
                this.brokerage_accounting_details = null;
            } else {
                this.brokerage_accounting_details = brokerageAccountingDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != CheckoutCardDepositStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CheckoutCardDepositStateDto.Serializer.INSTANCE, self.state);
            }
            MoneyDto moneyDto = self.card_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.user_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.card_number_last_four, "")) {
                output.encodeStringElement(serialDesc, 3, self.card_number_last_four);
            }
            if (!Intrinsics.areEqual(self.card_nickname, "")) {
                output.encodeStringElement(serialDesc, 4, self.card_nickname);
            }
            Instant instant = self.pending_id_check_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.pending_account_approval_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.completed_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant3);
            }
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = self.brokerage_accounting_details;
            if (brokerageAccountingDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, BrokerageAccountingDetailsDto.Serializer.INSTANCE, brokerageAccountingDetailsDto);
            }
        }

        public Surrogate(CheckoutCardDepositStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, String card_number_last_four, String card_nickname, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            this.state = state;
            this.card_amount = moneyDto;
            this.user_amount = moneyDto2;
            this.card_number_last_four = card_number_last_four;
            this.card_nickname = card_nickname;
            this.pending_id_check_at = instant;
            this.pending_account_approval_at = instant2;
            this.completed_at = instant3;
            this.brokerage_accounting_details = brokerageAccountingDetailsDto;
        }

        public final CheckoutCardDepositStateDto getState() {
            return this.state;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.lang.String r6, java.lang.String r7, p479j$.time.Instant r8, p479j$.time.Instant r9, p479j$.time.Instant r10, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r2 = this;
                r13 = r12 & 1
                if (r13 == 0) goto La
                com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto$Companion r3 = com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.INSTANCE
                com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto r3 = r3.getZeroValue()
            La:
                r13 = r12 & 2
                r0 = 0
                if (r13 == 0) goto L10
                r4 = r0
            L10:
                r13 = r12 & 4
                if (r13 == 0) goto L15
                r5 = r0
            L15:
                r13 = r12 & 8
                java.lang.String r1 = ""
                if (r13 == 0) goto L1c
                r6 = r1
            L1c:
                r13 = r12 & 16
                if (r13 == 0) goto L21
                r7 = r1
            L21:
                r13 = r12 & 32
                if (r13 == 0) goto L26
                r8 = r0
            L26:
                r13 = r12 & 64
                if (r13 == 0) goto L2b
                r9 = r0
            L2b:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L30
                r10 = r0
            L30:
                r12 = r12 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L3f
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L49
            L3f:
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
            L49:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto.Surrogate.<init>(com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, j$.time.Instant, j$.time.Instant, j$.time.Instant, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final MoneyDto getCard_amount() {
            return this.card_amount;
        }

        public final MoneyDto getUser_amount() {
            return this.user_amount;
        }

        public final String getCard_number_last_four() {
            return this.card_number_last_four;
        }

        public final String getCard_nickname() {
            return this.card_nickname;
        }

        public final Instant getPending_id_check_at() {
            return this.pending_id_check_at;
        }

        public final Instant getPending_account_approval_at() {
            return this.pending_account_approval_at;
        }

        public final Instant getCompleted_at() {
            return this.completed_at;
        }

        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }
    }

    /* compiled from: CheckoutCardDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CheckoutCardDepositDetailsDto, CheckoutCardDepositDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutCardDepositDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardDepositDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardDepositDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CheckoutCardDepositDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CheckoutCardDepositDetails> getProtoAdapter() {
            return CheckoutCardDepositDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardDepositDetailsDto getZeroValue() {
            return CheckoutCardDepositDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardDepositDetailsDto fromProto(CheckoutCardDepositDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CheckoutCardDepositStateDto checkoutCardDepositStateDtoFromProto = CheckoutCardDepositStateDto.INSTANCE.fromProto(proto.getState());
            Money card_amount = proto.getCard_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = card_amount != null ? MoneyDto.INSTANCE.fromProto(card_amount) : null;
            Money user_amount = proto.getUser_amount();
            MoneyDto moneyDtoFromProto2 = user_amount != null ? MoneyDto.INSTANCE.fromProto(user_amount) : null;
            String card_number_last_four = proto.getCard_number_last_four();
            String card_nickname = proto.getCard_nickname();
            Instant pending_id_check_at = proto.getPending_id_check_at();
            Instant pending_account_approval_at = proto.getPending_account_approval_at();
            Instant completed_at = proto.getCompleted_at();
            BrokerageAccountingDetails brokerage_accounting_details = proto.getBrokerage_accounting_details();
            return new CheckoutCardDepositDetailsDto(new Surrogate(checkoutCardDepositStateDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, card_number_last_four, card_nickname, pending_id_check_at, pending_account_approval_at, completed_at, brokerage_accounting_details != null ? BrokerageAccountingDetailsDto.INSTANCE.fromProto(brokerage_accounting_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckoutCardDepositDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CheckoutCardDepositDetailsDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED", "NEW", "COMPLETED", "REJECTED", "CANCELED", "AUTHORIZE_PENDING_SCA", "AUTHORIZED", "PENDING_CAPTURE", "CAPTURED", "PENDING_ID_CHECK", "PENDING_ACCOUNT_APPROVAL", "PENDING_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckoutCardDepositStateDto implements Dto2<CheckoutCardDepositDetails.CheckoutCardDepositState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardDepositStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckoutCardDepositStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardDepositStateDto, CheckoutCardDepositDetails.CheckoutCardDepositState>> binaryBase64Serializer$delegate;
        public static final CheckoutCardDepositStateDto CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED = new CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED("CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED", 0);
        public static final CheckoutCardDepositStateDto NEW = new NEW("NEW", 1);
        public static final CheckoutCardDepositStateDto COMPLETED = new COMPLETED("COMPLETED", 2);
        public static final CheckoutCardDepositStateDto REJECTED = new REJECTED("REJECTED", 3);
        public static final CheckoutCardDepositStateDto CANCELED = new CANCELED("CANCELED", 4);
        public static final CheckoutCardDepositStateDto AUTHORIZE_PENDING_SCA = new AUTHORIZE_PENDING_SCA("AUTHORIZE_PENDING_SCA", 5);
        public static final CheckoutCardDepositStateDto AUTHORIZED = new AUTHORIZED("AUTHORIZED", 6);
        public static final CheckoutCardDepositStateDto PENDING_CAPTURE = new PENDING_CAPTURE("PENDING_CAPTURE", 7);
        public static final CheckoutCardDepositStateDto CAPTURED = new CAPTURED("CAPTURED", 8);
        public static final CheckoutCardDepositStateDto PENDING_ID_CHECK = new PENDING_ID_CHECK("PENDING_ID_CHECK", 9);
        public static final CheckoutCardDepositStateDto PENDING_ACCOUNT_APPROVAL = new PENDING_ACCOUNT_APPROVAL("PENDING_ACCOUNT_APPROVAL", 10);
        public static final CheckoutCardDepositStateDto PENDING_ERROR = new PENDING_ERROR("PENDING_ERROR", 11);

        private static final /* synthetic */ CheckoutCardDepositStateDto[] $values() {
            return new CheckoutCardDepositStateDto[]{CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED, NEW, COMPLETED, REJECTED, CANCELED, AUTHORIZE_PENDING_SCA, AUTHORIZED, PENDING_CAPTURE, CAPTURED, PENDING_ID_CHECK, PENDING_ACCOUNT_APPROVAL, PENDING_ERROR};
        }

        public /* synthetic */ CheckoutCardDepositStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckoutCardDepositStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CheckoutCardDepositStateDto(String str, int i) {
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED extends CheckoutCardDepositStateDto {
            CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED;
            }
        }

        static {
            CheckoutCardDepositStateDto[] checkoutCardDepositStateDtoArr$values = $values();
            $VALUES = checkoutCardDepositStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardDepositStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.NEW", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends CheckoutCardDepositStateDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.NEW;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.COMPLETED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends CheckoutCardDepositStateDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.COMPLETED;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.REJECTED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends CheckoutCardDepositStateDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.REJECTED;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.CANCELED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED extends CheckoutCardDepositStateDto {
            CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.CANCELED;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.AUTHORIZE_PENDING_SCA", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTHORIZE_PENDING_SCA extends CheckoutCardDepositStateDto {
            AUTHORIZE_PENDING_SCA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.AUTHORIZE_PENDING_SCA;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.AUTHORIZED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTHORIZED extends CheckoutCardDepositStateDto {
            AUTHORIZED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.AUTHORIZED;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.PENDING_CAPTURE", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_CAPTURE extends CheckoutCardDepositStateDto {
            PENDING_CAPTURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_CAPTURE;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.CAPTURED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CAPTURED extends CheckoutCardDepositStateDto {
            CAPTURED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.CAPTURED;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.PENDING_ID_CHECK", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ID_CHECK extends CheckoutCardDepositStateDto {
            PENDING_ID_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_ID_CHECK;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.PENDING_ACCOUNT_APPROVAL", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ACCOUNT_APPROVAL extends CheckoutCardDepositStateDto {
            PENDING_ACCOUNT_APPROVAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_ACCOUNT_APPROVAL;
            }
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto.CheckoutCardDepositStateDto.PENDING_ERROR", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ERROR extends CheckoutCardDepositStateDto {
            PENDING_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDepositDetails.CheckoutCardDepositState toProto() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckoutCardDepositStateDto, CheckoutCardDepositDetails.CheckoutCardDepositState> {

            /* compiled from: CheckoutCardDepositDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CheckoutCardDepositDetails.CheckoutCardDepositState.values().length];
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.NEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.COMPLETED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.REJECTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.CANCELED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.AUTHORIZE_PENDING_SCA.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.AUTHORIZED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_CAPTURE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.CAPTURED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_ID_CHECK.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_ACCOUNT_APPROVAL.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[CheckoutCardDepositDetails.CheckoutCardDepositState.PENDING_ERROR.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CheckoutCardDepositStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardDepositStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardDepositStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckoutCardDepositStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CheckoutCardDepositDetails.CheckoutCardDepositState> getProtoAdapter() {
                return CheckoutCardDepositDetails.CheckoutCardDepositState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardDepositStateDto getZeroValue() {
                return CheckoutCardDepositStateDto.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardDepositStateDto fromProto(CheckoutCardDepositDetails.CheckoutCardDepositState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CheckoutCardDepositStateDto.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED;
                    case 2:
                        return CheckoutCardDepositStateDto.NEW;
                    case 3:
                        return CheckoutCardDepositStateDto.COMPLETED;
                    case 4:
                        return CheckoutCardDepositStateDto.REJECTED;
                    case 5:
                        return CheckoutCardDepositStateDto.CANCELED;
                    case 6:
                        return CheckoutCardDepositStateDto.AUTHORIZE_PENDING_SCA;
                    case 7:
                        return CheckoutCardDepositStateDto.AUTHORIZED;
                    case 8:
                        return CheckoutCardDepositStateDto.PENDING_CAPTURE;
                    case 9:
                        return CheckoutCardDepositStateDto.CAPTURED;
                    case 10:
                        return CheckoutCardDepositStateDto.PENDING_ID_CHECK;
                    case 11:
                        return CheckoutCardDepositStateDto.PENDING_ACCOUNT_APPROVAL;
                    case 12:
                        return CheckoutCardDepositStateDto.PENDING_ERROR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CheckoutCardDepositDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$CheckoutCardDepositStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CheckoutCardDepositStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckoutCardDepositStateDto, CheckoutCardDepositDetails.CheckoutCardDepositState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.CheckoutCardDepositDetails.CheckoutCardDepositState", CheckoutCardDepositStateDto.getEntries(), CheckoutCardDepositStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckoutCardDepositStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckoutCardDepositStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckoutCardDepositStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckoutCardDepositStateDto valueOf(String str) {
            return (CheckoutCardDepositStateDto) Enum.valueOf(CheckoutCardDepositStateDto.class, str);
        }

        public static CheckoutCardDepositStateDto[] values() {
            return (CheckoutCardDepositStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckoutCardDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CheckoutCardDepositDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.CheckoutCardDepositDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CheckoutCardDepositDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CheckoutCardDepositDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CheckoutCardDepositDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CheckoutCardDepositDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.CheckoutCardDepositDetailsDto";
        }
    }
}
