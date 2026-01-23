package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetails;
import com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto;
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

/* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005879:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015Ja\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0019\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;)V", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "card_amount", "user_amount", "", "card_number_last_four", "card_nickname", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "completed_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "brokerage_accounting_details", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "copy", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "getCard_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getUser_amount", "getCard_number_last_four", "getCard_nickname", "getCompleted_at", "()Lj$/time/Instant;", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "Companion", "Surrogate", "CheckoutCardWithdrawalStateDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CheckoutCardWithdrawalDetailsDto implements Dto3<CheckoutCardWithdrawalDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CheckoutCardWithdrawalDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardWithdrawalDetailsDto, CheckoutCardWithdrawalDetails>> binaryBase64Serializer$delegate;
    private static final CheckoutCardWithdrawalDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CheckoutCardWithdrawalDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CheckoutCardWithdrawalDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CheckoutCardWithdrawalStateDto getState() {
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

    public final Instant getCompleted_at() {
        return this.surrogate.getCompleted_at();
    }

    public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
        return this.surrogate.getBrokerage_accounting_details();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CheckoutCardWithdrawalDetailsDto(com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.lang.String r6, java.lang.String r7, p479j$.time.Instant r8, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto$Companion r3 = com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.INSTANCE
            com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto r3 = r3.getZeroValue()
        La:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 4
            if (r11 == 0) goto L15
            r5 = r0
        L15:
            r11 = r10 & 8
            java.lang.String r1 = ""
            if (r11 == 0) goto L1c
            r6 = r1
        L1c:
            r11 = r10 & 16
            if (r11 == 0) goto L21
            r7 = r1
        L21:
            r11 = r10 & 32
            if (r11 == 0) goto L26
            r8 = r0
        L26:
            r10 = r10 & 64
            if (r10 == 0) goto L33
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L3b
        L33:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L3b:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto.<init>(com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, j$.time.Instant, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckoutCardWithdrawalDetailsDto(CheckoutCardWithdrawalStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, String card_number_last_four, String card_nickname, Instant instant, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
        this(new Surrogate(state, moneyDto, moneyDto2, card_number_last_four, card_nickname, instant, brokerageAccountingDetailsDto));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
    }

    public static /* synthetic */ CheckoutCardWithdrawalDetailsDto copy$default(CheckoutCardWithdrawalDetailsDto checkoutCardWithdrawalDetailsDto, CheckoutCardWithdrawalStateDto checkoutCardWithdrawalStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, Instant instant, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardWithdrawalStateDto = checkoutCardWithdrawalDetailsDto.surrogate.getState();
        }
        if ((i & 2) != 0) {
            moneyDto = checkoutCardWithdrawalDetailsDto.surrogate.getCard_amount();
        }
        if ((i & 4) != 0) {
            moneyDto2 = checkoutCardWithdrawalDetailsDto.surrogate.getUser_amount();
        }
        if ((i & 8) != 0) {
            str = checkoutCardWithdrawalDetailsDto.surrogate.getCard_number_last_four();
        }
        if ((i & 16) != 0) {
            str2 = checkoutCardWithdrawalDetailsDto.surrogate.getCard_nickname();
        }
        if ((i & 32) != 0) {
            instant = checkoutCardWithdrawalDetailsDto.surrogate.getCompleted_at();
        }
        if ((i & 64) != 0) {
            brokerageAccountingDetailsDto = checkoutCardWithdrawalDetailsDto.surrogate.getBrokerage_accounting_details();
        }
        Instant instant2 = instant;
        BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto;
        String str3 = str2;
        MoneyDto moneyDto3 = moneyDto2;
        return checkoutCardWithdrawalDetailsDto.copy(checkoutCardWithdrawalStateDto, moneyDto, moneyDto3, str, str3, instant2, brokerageAccountingDetailsDto2);
    }

    public final CheckoutCardWithdrawalDetailsDto copy(CheckoutCardWithdrawalStateDto state, MoneyDto card_amount, MoneyDto user_amount, String card_number_last_four, String card_nickname, Instant completed_at, BrokerageAccountingDetailsDto brokerage_accounting_details) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        return new CheckoutCardWithdrawalDetailsDto(new Surrogate(state, card_amount, user_amount, card_number_last_four, card_nickname, completed_at, brokerage_accounting_details));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CheckoutCardWithdrawalDetails toProto() {
        CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState checkoutCardWithdrawalState = (CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState) this.surrogate.getState().toProto();
        MoneyDto card_amount = this.surrogate.getCard_amount();
        Money proto = card_amount != null ? card_amount.toProto() : null;
        MoneyDto user_amount = this.surrogate.getUser_amount();
        Money proto2 = user_amount != null ? user_amount.toProto() : null;
        String card_number_last_four = this.surrogate.getCard_number_last_four();
        String card_nickname = this.surrogate.getCard_nickname();
        Instant completed_at = this.surrogate.getCompleted_at();
        BrokerageAccountingDetailsDto brokerage_accounting_details = this.surrogate.getBrokerage_accounting_details();
        return new CheckoutCardWithdrawalDetails(checkoutCardWithdrawalState, proto, proto2, card_number_last_four, card_nickname, completed_at, brokerage_accounting_details != null ? brokerage_accounting_details.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[CheckoutCardWithdrawalDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CheckoutCardWithdrawalDetailsDto) && Intrinsics.areEqual(((CheckoutCardWithdrawalDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKBy\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Ba\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010(J6\u0010*\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010;\u0012\u0004\b?\u0010:\u001a\u0004\b>\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bB\u0010:\u001a\u0004\bA\u0010(R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bD\u0010:\u001a\u0004\bC\u0010(RF\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\bG\u0010:\u001a\u0004\bF\u0010+R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bJ\u0010:\u001a\u0004\bI\u0010-¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;", "", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "card_amount", "user_amount", "", "card_number_last_four", "card_nickname", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "completed_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "brokerage_accounting_details", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_cashier_externalRelease", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "component2", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "copy", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "getState", "getState$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCard_amount", "getCard_amount$annotations", "getUser_amount", "getUser_amount$annotations", "Ljava/lang/String;", "getCard_number_last_four", "getCard_number_last_four$annotations", "getCard_nickname", "getCard_nickname$annotations", "Lj$/time/Instant;", "getCompleted_at", "getCompleted_at$annotations", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "getBrokerage_accounting_details", "getBrokerage_accounting_details$annotations", "Companion", "$serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountingDetailsDto brokerage_accounting_details;
        private final MoneyDto card_amount;
        private final String card_nickname;
        private final String card_number_last_four;
        private final Instant completed_at;
        private final CheckoutCardWithdrawalStateDto state;
        private final MoneyDto user_amount;

        public Surrogate() {
            this((CheckoutCardWithdrawalStateDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, (String) null, (Instant) null, (BrokerageAccountingDetailsDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CheckoutCardWithdrawalStateDto checkoutCardWithdrawalStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, Instant instant, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutCardWithdrawalStateDto = surrogate.state;
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
                instant = surrogate.completed_at;
            }
            if ((i & 64) != 0) {
                brokerageAccountingDetailsDto = surrogate.brokerage_accounting_details;
            }
            Instant instant2 = instant;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto;
            String str3 = str2;
            MoneyDto moneyDto3 = moneyDto2;
            return surrogate.copy(checkoutCardWithdrawalStateDto, moneyDto, moneyDto3, str, str3, instant2, brokerageAccountingDetailsDto2);
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

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("userAmount")
        @JsonAnnotations2(names = {"user_amount"})
        public static /* synthetic */ void getUser_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CheckoutCardWithdrawalStateDto getState() {
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
        public final Instant getCompleted_at() {
            return this.completed_at;
        }

        /* renamed from: component7, reason: from getter */
        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }

        public final Surrogate copy(CheckoutCardWithdrawalStateDto state, MoneyDto card_amount, MoneyDto user_amount, String card_number_last_four, String card_nickname, Instant completed_at, BrokerageAccountingDetailsDto brokerage_accounting_details) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            return new Surrogate(state, card_amount, user_amount, card_number_last_four, card_nickname, completed_at, brokerage_accounting_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && Intrinsics.areEqual(this.card_amount, surrogate.card_amount) && Intrinsics.areEqual(this.user_amount, surrogate.user_amount) && Intrinsics.areEqual(this.card_number_last_four, surrogate.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, surrogate.card_nickname) && Intrinsics.areEqual(this.completed_at, surrogate.completed_at) && Intrinsics.areEqual(this.brokerage_accounting_details, surrogate.brokerage_accounting_details);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            MoneyDto moneyDto = this.card_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.user_amount;
            int iHashCode3 = (((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.card_number_last_four.hashCode()) * 31) + this.card_nickname.hashCode()) * 31;
            Instant instant = this.completed_at;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = this.brokerage_accounting_details;
            return iHashCode4 + (brokerageAccountingDetailsDto != null ? brokerageAccountingDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", card_amount=" + this.card_amount + ", user_amount=" + this.user_amount + ", card_number_last_four=" + this.card_number_last_four + ", card_nickname=" + this.card_nickname + ", completed_at=" + this.completed_at + ", brokerage_accounting_details=" + this.brokerage_accounting_details + ")";
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CheckoutCardWithdrawalDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CheckoutCardWithdrawalStateDto checkoutCardWithdrawalStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, Instant instant, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? CheckoutCardWithdrawalStateDto.INSTANCE.getZeroValue() : checkoutCardWithdrawalStateDto;
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
                this.completed_at = null;
            } else {
                this.completed_at = instant;
            }
            if ((i & 64) == 0) {
                this.brokerage_accounting_details = null;
            } else {
                this.brokerage_accounting_details = brokerageAccountingDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != CheckoutCardWithdrawalStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CheckoutCardWithdrawalStateDto.Serializer.INSTANCE, self.state);
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
            Instant instant = self.completed_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = self.brokerage_accounting_details;
            if (brokerageAccountingDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, BrokerageAccountingDetailsDto.Serializer.INSTANCE, brokerageAccountingDetailsDto);
            }
        }

        public Surrogate(CheckoutCardWithdrawalStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, String card_number_last_four, String card_nickname, Instant instant, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            this.state = state;
            this.card_amount = moneyDto;
            this.user_amount = moneyDto2;
            this.card_number_last_four = card_number_last_four;
            this.card_nickname = card_nickname;
            this.completed_at = instant;
            this.brokerage_accounting_details = brokerageAccountingDetailsDto;
        }

        public final CheckoutCardWithdrawalStateDto getState() {
            return this.state;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.lang.String r6, java.lang.String r7, p479j$.time.Instant r8, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r2 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto$Companion r3 = com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.INSTANCE
                com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto r3 = r3.getZeroValue()
            La:
                r11 = r10 & 2
                r0 = 0
                if (r11 == 0) goto L10
                r4 = r0
            L10:
                r11 = r10 & 4
                if (r11 == 0) goto L15
                r5 = r0
            L15:
                r11 = r10 & 8
                java.lang.String r1 = ""
                if (r11 == 0) goto L1c
                r6 = r1
            L1c:
                r11 = r10 & 16
                if (r11 == 0) goto L21
                r7 = r1
            L21:
                r11 = r10 & 32
                if (r11 == 0) goto L26
                r8 = r0
            L26:
                r10 = r10 & 64
                if (r10 == 0) goto L33
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L3b
            L33:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L3b:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto.Surrogate.<init>(com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, j$.time.Instant, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

        public final Instant getCompleted_at() {
            return this.completed_at;
        }

        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }
    }

    /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CheckoutCardWithdrawalDetailsDto, CheckoutCardWithdrawalDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutCardWithdrawalDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardWithdrawalDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardWithdrawalDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CheckoutCardWithdrawalDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CheckoutCardWithdrawalDetails> getProtoAdapter() {
            return CheckoutCardWithdrawalDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardWithdrawalDetailsDto getZeroValue() {
            return CheckoutCardWithdrawalDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardWithdrawalDetailsDto fromProto(CheckoutCardWithdrawalDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CheckoutCardWithdrawalStateDto checkoutCardWithdrawalStateDtoFromProto = CheckoutCardWithdrawalStateDto.INSTANCE.fromProto(proto.getState());
            Money card_amount = proto.getCard_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = card_amount != null ? MoneyDto.INSTANCE.fromProto(card_amount) : null;
            Money user_amount = proto.getUser_amount();
            MoneyDto moneyDtoFromProto2 = user_amount != null ? MoneyDto.INSTANCE.fromProto(user_amount) : null;
            String card_number_last_four = proto.getCard_number_last_four();
            String card_nickname = proto.getCard_nickname();
            Instant completed_at = proto.getCompleted_at();
            BrokerageAccountingDetails brokerage_accounting_details = proto.getBrokerage_accounting_details();
            return new CheckoutCardWithdrawalDetailsDto(new Surrogate(checkoutCardWithdrawalStateDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, card_number_last_four, card_nickname, completed_at, brokerage_accounting_details != null ? BrokerageAccountingDetailsDto.INSTANCE.fromProto(brokerage_accounting_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckoutCardWithdrawalDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CheckoutCardWithdrawalDetailsDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED", "NEW", "COMPLETED", "REJECTED", "CASH_HELD", "CARD_AMOUNT_SET", "PENDING_PAYOUT", "PAID_OUT", "PENDING_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckoutCardWithdrawalStateDto implements Dto2<CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardWithdrawalStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckoutCardWithdrawalStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardWithdrawalStateDto, CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState>> binaryBase64Serializer$delegate;
        public static final CheckoutCardWithdrawalStateDto CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED = new CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED("CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED", 0);
        public static final CheckoutCardWithdrawalStateDto NEW = new NEW("NEW", 1);
        public static final CheckoutCardWithdrawalStateDto COMPLETED = new COMPLETED("COMPLETED", 2);
        public static final CheckoutCardWithdrawalStateDto REJECTED = new REJECTED("REJECTED", 3);
        public static final CheckoutCardWithdrawalStateDto CASH_HELD = new CASH_HELD("CASH_HELD", 4);
        public static final CheckoutCardWithdrawalStateDto CARD_AMOUNT_SET = new CARD_AMOUNT_SET("CARD_AMOUNT_SET", 5);
        public static final CheckoutCardWithdrawalStateDto PENDING_PAYOUT = new PENDING_PAYOUT("PENDING_PAYOUT", 6);
        public static final CheckoutCardWithdrawalStateDto PAID_OUT = new PAID_OUT("PAID_OUT", 7);
        public static final CheckoutCardWithdrawalStateDto PENDING_ERROR = new PENDING_ERROR("PENDING_ERROR", 8);

        private static final /* synthetic */ CheckoutCardWithdrawalStateDto[] $values() {
            return new CheckoutCardWithdrawalStateDto[]{CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED, NEW, COMPLETED, REJECTED, CASH_HELD, CARD_AMOUNT_SET, PENDING_PAYOUT, PAID_OUT, PENDING_ERROR};
        }

        public /* synthetic */ CheckoutCardWithdrawalStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckoutCardWithdrawalStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CheckoutCardWithdrawalStateDto(String str, int i) {
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED extends CheckoutCardWithdrawalStateDto {
            CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED;
            }
        }

        static {
            CheckoutCardWithdrawalStateDto[] checkoutCardWithdrawalStateDtoArr$values = $values();
            $VALUES = checkoutCardWithdrawalStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardWithdrawalStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.NEW", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends CheckoutCardWithdrawalStateDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.NEW;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.COMPLETED", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends CheckoutCardWithdrawalStateDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.COMPLETED;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.REJECTED", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends CheckoutCardWithdrawalStateDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.REJECTED;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.CASH_HELD", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASH_HELD extends CheckoutCardWithdrawalStateDto {
            CASH_HELD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CASH_HELD;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.CARD_AMOUNT_SET", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CARD_AMOUNT_SET extends CheckoutCardWithdrawalStateDto {
            CARD_AMOUNT_SET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CARD_AMOUNT_SET;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.PENDING_PAYOUT", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_PAYOUT extends CheckoutCardWithdrawalStateDto {
            PENDING_PAYOUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.PENDING_PAYOUT;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.PAID_OUT", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAID_OUT extends CheckoutCardWithdrawalStateDto {
            PAID_OUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.PAID_OUT;
            }
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto.CheckoutCardWithdrawalStateDto.PENDING_ERROR", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ERROR extends CheckoutCardWithdrawalStateDto {
            PENDING_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState toProto() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.PENDING_ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckoutCardWithdrawalStateDto, CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState> {

            /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.values().length];
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.NEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.COMPLETED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.REJECTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CASH_HELD.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CARD_AMOUNT_SET.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.PENDING_PAYOUT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.PAID_OUT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.PENDING_ERROR.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CheckoutCardWithdrawalStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardWithdrawalStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardWithdrawalStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckoutCardWithdrawalStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState> getProtoAdapter() {
                return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardWithdrawalStateDto getZeroValue() {
                return CheckoutCardWithdrawalStateDto.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardWithdrawalStateDto fromProto(CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CheckoutCardWithdrawalStateDto.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED;
                    case 2:
                        return CheckoutCardWithdrawalStateDto.NEW;
                    case 3:
                        return CheckoutCardWithdrawalStateDto.COMPLETED;
                    case 4:
                        return CheckoutCardWithdrawalStateDto.REJECTED;
                    case 5:
                        return CheckoutCardWithdrawalStateDto.CASH_HELD;
                    case 6:
                        return CheckoutCardWithdrawalStateDto.CARD_AMOUNT_SET;
                    case 7:
                        return CheckoutCardWithdrawalStateDto.PENDING_PAYOUT;
                    case 8:
                        return CheckoutCardWithdrawalStateDto.PAID_OUT;
                    case 9:
                        return CheckoutCardWithdrawalStateDto.PENDING_ERROR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$CheckoutCardWithdrawalStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CheckoutCardWithdrawalStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckoutCardWithdrawalStateDto, CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState", CheckoutCardWithdrawalStateDto.getEntries(), CheckoutCardWithdrawalStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckoutCardWithdrawalStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckoutCardWithdrawalStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckoutCardWithdrawalStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckoutCardWithdrawalStateDto valueOf(String str) {
            return (CheckoutCardWithdrawalStateDto) Enum.valueOf(CheckoutCardWithdrawalStateDto.class, str);
        }

        public static CheckoutCardWithdrawalStateDto[] values() {
            return (CheckoutCardWithdrawalStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CheckoutCardWithdrawalDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.CheckoutCardWithdrawalDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CheckoutCardWithdrawalDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CheckoutCardWithdrawalDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CheckoutCardWithdrawalDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CheckoutCardWithdrawalDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetailsDto";
        }
    }
}
