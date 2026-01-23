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
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeDetails;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto;
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

/* compiled from: CheckoutCardDisputeDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0012JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Surrogate;)V", "state", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "card_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "user_amount", "card_number_last_four", "", "card_nickname", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "getCard_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getUser_amount", "getCard_number_last_four", "()Ljava/lang/String;", "getCard_nickname", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CheckoutCardDisputeStateDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CheckoutCardDisputeDetailsDto implements Dto3<CheckoutCardDisputeDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CheckoutCardDisputeDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardDisputeDetailsDto, CheckoutCardDisputeDetails>> binaryBase64Serializer$delegate;
    private static final CheckoutCardDisputeDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CheckoutCardDisputeDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CheckoutCardDisputeDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CheckoutCardDisputeStateDto getState() {
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

    public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
        return this.surrogate.getBrokerage_accounting_details();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CheckoutCardDisputeDetailsDto(com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.lang.String r6, java.lang.String r7, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto$Companion r3 = com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.INSTANCE
            com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto r3 = r3.getZeroValue()
        La:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 4
            if (r10 == 0) goto L15
            r5 = r0
        L15:
            r10 = r9 & 8
            java.lang.String r1 = ""
            if (r10 == 0) goto L1c
            r6 = r1
        L1c:
            r10 = r9 & 16
            if (r10 == 0) goto L21
            r7 = r1
        L21:
            r9 = r9 & 32
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L34
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L34:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto.<init>(com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckoutCardDisputeDetailsDto(CheckoutCardDisputeStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, String card_number_last_four, String card_nickname, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
        this(new Surrogate(state, moneyDto, moneyDto2, card_number_last_four, card_nickname, brokerageAccountingDetailsDto));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
    }

    public static /* synthetic */ CheckoutCardDisputeDetailsDto copy$default(CheckoutCardDisputeDetailsDto checkoutCardDisputeDetailsDto, CheckoutCardDisputeStateDto checkoutCardDisputeStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardDisputeStateDto = checkoutCardDisputeDetailsDto.surrogate.getState();
        }
        if ((i & 2) != 0) {
            moneyDto = checkoutCardDisputeDetailsDto.surrogate.getCard_amount();
        }
        if ((i & 4) != 0) {
            moneyDto2 = checkoutCardDisputeDetailsDto.surrogate.getUser_amount();
        }
        if ((i & 8) != 0) {
            str = checkoutCardDisputeDetailsDto.surrogate.getCard_number_last_four();
        }
        if ((i & 16) != 0) {
            str2 = checkoutCardDisputeDetailsDto.surrogate.getCard_nickname();
        }
        if ((i & 32) != 0) {
            brokerageAccountingDetailsDto = checkoutCardDisputeDetailsDto.surrogate.getBrokerage_accounting_details();
        }
        String str3 = str2;
        BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto;
        return checkoutCardDisputeDetailsDto.copy(checkoutCardDisputeStateDto, moneyDto, moneyDto2, str, str3, brokerageAccountingDetailsDto2);
    }

    public final CheckoutCardDisputeDetailsDto copy(CheckoutCardDisputeStateDto state, MoneyDto card_amount, MoneyDto user_amount, String card_number_last_four, String card_nickname, BrokerageAccountingDetailsDto brokerage_accounting_details) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        return new CheckoutCardDisputeDetailsDto(new Surrogate(state, card_amount, user_amount, card_number_last_four, card_nickname, brokerage_accounting_details));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CheckoutCardDisputeDetails toProto() {
        CheckoutCardDisputeDetails.CheckoutCardDisputeState checkoutCardDisputeState = (CheckoutCardDisputeDetails.CheckoutCardDisputeState) this.surrogate.getState().toProto();
        MoneyDto card_amount = this.surrogate.getCard_amount();
        Money proto = card_amount != null ? card_amount.toProto() : null;
        MoneyDto user_amount = this.surrogate.getUser_amount();
        Money proto2 = user_amount != null ? user_amount.toProto() : null;
        String card_number_last_four = this.surrogate.getCard_number_last_four();
        String card_nickname = this.surrogate.getCard_nickname();
        BrokerageAccountingDetailsDto brokerage_accounting_details = this.surrogate.getBrokerage_accounting_details();
        return new CheckoutCardDisputeDetails(checkoutCardDisputeState, proto, proto2, card_number_last_four, card_nickname, brokerage_accounting_details != null ? brokerage_accounting_details.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[CheckoutCardDisputeDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CheckoutCardDisputeDetailsDto) && Intrinsics.areEqual(((CheckoutCardDisputeDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CheckoutCardDisputeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Surrogate;", "", "state", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "card_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "user_amount", "card_number_last_four", "", "card_nickname", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getState$annotations", "()V", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "getCard_amount$annotations", "getCard_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getUser_amount$annotations", "getUser_amount", "getCard_number_last_four$annotations", "getCard_number_last_four", "()Ljava/lang/String;", "getCard_nickname$annotations", "getCard_nickname", "getBrokerage_accounting_details$annotations", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountingDetailsDto brokerage_accounting_details;
        private final MoneyDto card_amount;
        private final String card_nickname;
        private final String card_number_last_four;
        private final CheckoutCardDisputeStateDto state;
        private final MoneyDto user_amount;

        public Surrogate() {
            this((CheckoutCardDisputeStateDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, (String) null, (BrokerageAccountingDetailsDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CheckoutCardDisputeStateDto checkoutCardDisputeStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutCardDisputeStateDto = surrogate.state;
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
                brokerageAccountingDetailsDto = surrogate.brokerage_accounting_details;
            }
            String str3 = str2;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto;
            return surrogate.copy(checkoutCardDisputeStateDto, moneyDto, moneyDto2, str, str3, brokerageAccountingDetailsDto2);
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

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("userAmount")
        @JsonAnnotations2(names = {"user_amount"})
        public static /* synthetic */ void getUser_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CheckoutCardDisputeStateDto getState() {
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
        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }

        public final Surrogate copy(CheckoutCardDisputeStateDto state, MoneyDto card_amount, MoneyDto user_amount, String card_number_last_four, String card_nickname, BrokerageAccountingDetailsDto brokerage_accounting_details) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            return new Surrogate(state, card_amount, user_amount, card_number_last_four, card_nickname, brokerage_accounting_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && Intrinsics.areEqual(this.card_amount, surrogate.card_amount) && Intrinsics.areEqual(this.user_amount, surrogate.user_amount) && Intrinsics.areEqual(this.card_number_last_four, surrogate.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, surrogate.card_nickname) && Intrinsics.areEqual(this.brokerage_accounting_details, surrogate.brokerage_accounting_details);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            MoneyDto moneyDto = this.card_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.user_amount;
            int iHashCode3 = (((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.card_number_last_four.hashCode()) * 31) + this.card_nickname.hashCode()) * 31;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = this.brokerage_accounting_details;
            return iHashCode3 + (brokerageAccountingDetailsDto != null ? brokerageAccountingDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", card_amount=" + this.card_amount + ", user_amount=" + this.user_amount + ", card_number_last_four=" + this.card_number_last_four + ", card_nickname=" + this.card_nickname + ", brokerage_accounting_details=" + this.brokerage_accounting_details + ")";
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CheckoutCardDisputeDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CheckoutCardDisputeStateDto checkoutCardDisputeStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, String str, String str2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? CheckoutCardDisputeStateDto.INSTANCE.getZeroValue() : checkoutCardDisputeStateDto;
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
                this.brokerage_accounting_details = null;
            } else {
                this.brokerage_accounting_details = brokerageAccountingDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != CheckoutCardDisputeStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CheckoutCardDisputeStateDto.Serializer.INSTANCE, self.state);
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
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = self.brokerage_accounting_details;
            if (brokerageAccountingDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BrokerageAccountingDetailsDto.Serializer.INSTANCE, brokerageAccountingDetailsDto);
            }
        }

        public Surrogate(CheckoutCardDisputeStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2, String card_number_last_four, String card_nickname, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            this.state = state;
            this.card_amount = moneyDto;
            this.user_amount = moneyDto2;
            this.card_number_last_four = card_number_last_four;
            this.card_nickname = card_nickname;
            this.brokerage_accounting_details = brokerageAccountingDetailsDto;
        }

        public final CheckoutCardDisputeStateDto getState() {
            return this.state;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, java.lang.String r6, java.lang.String r7, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r2 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto$Companion r3 = com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.INSTANCE
                com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto r3 = r3.getZeroValue()
            La:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L10
                r4 = r0
            L10:
                r10 = r9 & 4
                if (r10 == 0) goto L15
                r5 = r0
            L15:
                r10 = r9 & 8
                java.lang.String r1 = ""
                if (r10 == 0) goto L1c
                r6 = r1
            L1c:
                r10 = r9 & 16
                if (r10 == 0) goto L21
                r7 = r1
            L21:
                r9 = r9 & 32
                if (r9 == 0) goto L2d
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L34
            L2d:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L34:
                r4.<init>(r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto.Surrogate.<init>(com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }
    }

    /* compiled from: CheckoutCardDisputeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CheckoutCardDisputeDetailsDto, CheckoutCardDisputeDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutCardDisputeDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardDisputeDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardDisputeDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CheckoutCardDisputeDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CheckoutCardDisputeDetails> getProtoAdapter() {
            return CheckoutCardDisputeDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardDisputeDetailsDto getZeroValue() {
            return CheckoutCardDisputeDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardDisputeDetailsDto fromProto(CheckoutCardDisputeDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CheckoutCardDisputeStateDto checkoutCardDisputeStateDtoFromProto = CheckoutCardDisputeStateDto.INSTANCE.fromProto(proto.getState());
            Money card_amount = proto.getCard_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = card_amount != null ? MoneyDto.INSTANCE.fromProto(card_amount) : null;
            Money user_amount = proto.getUser_amount();
            MoneyDto moneyDtoFromProto2 = user_amount != null ? MoneyDto.INSTANCE.fromProto(user_amount) : null;
            String card_number_last_four = proto.getCard_number_last_four();
            String card_nickname = proto.getCard_nickname();
            BrokerageAccountingDetails brokerage_accounting_details = proto.getBrokerage_accounting_details();
            return new CheckoutCardDisputeDetailsDto(new Surrogate(checkoutCardDisputeStateDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, card_number_last_four, card_nickname, brokerage_accounting_details != null ? BrokerageAccountingDetailsDto.INSTANCE.fromProto(brokerage_accounting_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckoutCardDisputeDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CheckoutCardDisputeDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardDisputeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED", "RECEIVED", "RESOLVED", "CANCELED", "EXPIRED", "WON", "LOST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckoutCardDisputeStateDto implements Dto2<CheckoutCardDisputeDetails.CheckoutCardDisputeState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardDisputeStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckoutCardDisputeStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardDisputeStateDto, CheckoutCardDisputeDetails.CheckoutCardDisputeState>> binaryBase64Serializer$delegate;
        public static final CheckoutCardDisputeStateDto CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED = new CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED("CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED", 0);
        public static final CheckoutCardDisputeStateDto RECEIVED = new RECEIVED("RECEIVED", 1);
        public static final CheckoutCardDisputeStateDto RESOLVED = new RESOLVED("RESOLVED", 2);
        public static final CheckoutCardDisputeStateDto CANCELED = new CANCELED("CANCELED", 3);
        public static final CheckoutCardDisputeStateDto EXPIRED = new EXPIRED("EXPIRED", 4);
        public static final CheckoutCardDisputeStateDto WON = new WON("WON", 5);
        public static final CheckoutCardDisputeStateDto LOST = new LOST("LOST", 6);

        private static final /* synthetic */ CheckoutCardDisputeStateDto[] $values() {
            return new CheckoutCardDisputeStateDto[]{CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED, RECEIVED, RESOLVED, CANCELED, EXPIRED, WON, LOST};
        }

        public /* synthetic */ CheckoutCardDisputeStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckoutCardDisputeStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CheckoutCardDisputeStateDto(String str, int i) {
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED extends CheckoutCardDisputeStateDto {
            CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED;
            }
        }

        static {
            CheckoutCardDisputeStateDto[] checkoutCardDisputeStateDtoArr$values = $values();
            $VALUES = checkoutCardDisputeStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardDisputeStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.RECEIVED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECEIVED extends CheckoutCardDisputeStateDto {
            RECEIVED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.RECEIVED;
            }
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.RESOLVED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESOLVED extends CheckoutCardDisputeStateDto {
            RESOLVED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.RESOLVED;
            }
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.CANCELED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED extends CheckoutCardDisputeStateDto {
            CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.CANCELED;
            }
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.EXPIRED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED extends CheckoutCardDisputeStateDto {
            EXPIRED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.EXPIRED;
            }
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.WON", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WON extends CheckoutCardDisputeStateDto {
            WON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.WON;
            }
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto.CheckoutCardDisputeStateDto.LOST", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOST extends CheckoutCardDisputeStateDto {
            LOST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeDetails.CheckoutCardDisputeState toProto() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.LOST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckoutCardDisputeStateDto, CheckoutCardDisputeDetails.CheckoutCardDisputeState> {

            /* compiled from: CheckoutCardDisputeDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CheckoutCardDisputeDetails.CheckoutCardDisputeState.values().length];
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.RECEIVED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.RESOLVED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.CANCELED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.EXPIRED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.WON.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CheckoutCardDisputeDetails.CheckoutCardDisputeState.LOST.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CheckoutCardDisputeStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardDisputeStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardDisputeStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckoutCardDisputeStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CheckoutCardDisputeDetails.CheckoutCardDisputeState> getProtoAdapter() {
                return CheckoutCardDisputeDetails.CheckoutCardDisputeState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardDisputeStateDto getZeroValue() {
                return CheckoutCardDisputeStateDto.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardDisputeStateDto fromProto(CheckoutCardDisputeDetails.CheckoutCardDisputeState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CheckoutCardDisputeStateDto.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED;
                    case 2:
                        return CheckoutCardDisputeStateDto.RECEIVED;
                    case 3:
                        return CheckoutCardDisputeStateDto.RESOLVED;
                    case 4:
                        return CheckoutCardDisputeStateDto.CANCELED;
                    case 5:
                        return CheckoutCardDisputeStateDto.EXPIRED;
                    case 6:
                        return CheckoutCardDisputeStateDto.WON;
                    case 7:
                        return CheckoutCardDisputeStateDto.LOST;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CheckoutCardDisputeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$CheckoutCardDisputeStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CheckoutCardDisputeStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckoutCardDisputeStateDto, CheckoutCardDisputeDetails.CheckoutCardDisputeState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.CheckoutCardDisputeDetails.CheckoutCardDisputeState", CheckoutCardDisputeStateDto.getEntries(), CheckoutCardDisputeStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckoutCardDisputeStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckoutCardDisputeStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckoutCardDisputeStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckoutCardDisputeStateDto valueOf(String str) {
            return (CheckoutCardDisputeStateDto) Enum.valueOf(CheckoutCardDisputeStateDto.class, str);
        }

        public static CheckoutCardDisputeStateDto[] values() {
            return (CheckoutCardDisputeStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckoutCardDisputeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CheckoutCardDisputeDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.CheckoutCardDisputeDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CheckoutCardDisputeDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CheckoutCardDisputeDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CheckoutCardDisputeDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CheckoutCardDisputeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.CheckoutCardDisputeDetailsDto";
        }
    }
}
