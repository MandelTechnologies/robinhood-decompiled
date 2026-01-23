package com.robinhood.rosetta.brokerage;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;

/* compiled from: CashAdjustmentDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0012JX\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/brokerage/CashAdjustment;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Surrogate;)V", "trigger_id", "Lokio/ByteString;", "record_date", "Lcom/robinhood/rosetta/common/DateDto;", "trade_delta", "Lcom/robinhood/rosetta/common/MoneyDto;", "settle_delta", "funding_hold_delta", "settlement_date", "short_delta", "(Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "getTrigger_id", "()Lokio/ByteString;", "getRecord_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getTrade_delta", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getSettle_delta", "getFunding_hold_delta", "getSettlement_date", "getShort_delta", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CashAdjustmentDto implements Dto3<CashAdjustment>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CashAdjustmentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CashAdjustmentDto, CashAdjustment>> binaryBase64Serializer$delegate;
    private static final CashAdjustmentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CashAdjustmentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CashAdjustmentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getTrigger_id() {
        return this.surrogate.getTrigger_id();
    }

    public final DateDto getRecord_date() {
        return this.surrogate.getRecord_date();
    }

    public final MoneyDto getTrade_delta() {
        return this.surrogate.getTrade_delta();
    }

    public final MoneyDto getSettle_delta() {
        return this.surrogate.getSettle_delta();
    }

    public final MoneyDto getFunding_hold_delta() {
        return this.surrogate.getFunding_hold_delta();
    }

    public final DateDto getSettlement_date() {
        return this.surrogate.getSettlement_date();
    }

    public final MoneyDto getShort_delta() {
        return this.surrogate.getShort_delta();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CashAdjustmentDto(okio.ByteString r2, com.robinhood.rosetta.common.DateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, com.robinhood.rosetta.common.MoneyDto r6, com.robinhood.rosetta.common.DateDto r7, com.robinhood.rosetta.common.MoneyDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            okio.ByteString r2 = okio.ByteString.EMPTY
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.brokerage.CashAdjustmentDto.<init>(okio.ByteString, com.robinhood.rosetta.common.DateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.DateDto, com.robinhood.rosetta.common.MoneyDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashAdjustmentDto(ByteString trigger_id, DateDto dateDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, DateDto dateDto2, MoneyDto moneyDto4) {
        this(new Surrogate(trigger_id, dateDto, moneyDto, moneyDto2, moneyDto3, dateDto2, moneyDto4));
        Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
    }

    public static /* synthetic */ CashAdjustmentDto copy$default(CashAdjustmentDto cashAdjustmentDto, ByteString byteString, DateDto dateDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, DateDto dateDto2, MoneyDto moneyDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = cashAdjustmentDto.surrogate.getTrigger_id();
        }
        if ((i & 2) != 0) {
            dateDto = cashAdjustmentDto.surrogate.getRecord_date();
        }
        if ((i & 4) != 0) {
            moneyDto = cashAdjustmentDto.surrogate.getTrade_delta();
        }
        if ((i & 8) != 0) {
            moneyDto2 = cashAdjustmentDto.surrogate.getSettle_delta();
        }
        if ((i & 16) != 0) {
            moneyDto3 = cashAdjustmentDto.surrogate.getFunding_hold_delta();
        }
        if ((i & 32) != 0) {
            dateDto2 = cashAdjustmentDto.surrogate.getSettlement_date();
        }
        if ((i & 64) != 0) {
            moneyDto4 = cashAdjustmentDto.surrogate.getShort_delta();
        }
        DateDto dateDto3 = dateDto2;
        MoneyDto moneyDto5 = moneyDto4;
        MoneyDto moneyDto6 = moneyDto3;
        MoneyDto moneyDto7 = moneyDto;
        return cashAdjustmentDto.copy(byteString, dateDto, moneyDto7, moneyDto2, moneyDto6, dateDto3, moneyDto5);
    }

    public final CashAdjustmentDto copy(ByteString trigger_id, DateDto record_date, MoneyDto trade_delta, MoneyDto settle_delta, MoneyDto funding_hold_delta, DateDto settlement_date, MoneyDto short_delta) {
        Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
        return new CashAdjustmentDto(new Surrogate(trigger_id, record_date, trade_delta, settle_delta, funding_hold_delta, settlement_date, short_delta));
    }

    @Override // com.robinhood.idl.Dto
    public CashAdjustment toProto() {
        ByteString trigger_id = this.surrogate.getTrigger_id();
        DateDto record_date = this.surrogate.getRecord_date();
        Date proto = record_date != null ? record_date.toProto() : null;
        MoneyDto trade_delta = this.surrogate.getTrade_delta();
        Money proto2 = trade_delta != null ? trade_delta.toProto() : null;
        MoneyDto settle_delta = this.surrogate.getSettle_delta();
        Money proto3 = settle_delta != null ? settle_delta.toProto() : null;
        MoneyDto funding_hold_delta = this.surrogate.getFunding_hold_delta();
        Money proto4 = funding_hold_delta != null ? funding_hold_delta.toProto() : null;
        DateDto settlement_date = this.surrogate.getSettlement_date();
        Date proto5 = settlement_date != null ? settlement_date.toProto() : null;
        MoneyDto short_delta = this.surrogate.getShort_delta();
        return new CashAdjustment(trigger_id, proto, proto2, proto3, proto4, proto5, short_delta != null ? short_delta.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[CashAdjustmentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CashAdjustmentDto) && Intrinsics.areEqual(((CashAdjustmentDto) other).surrogate, this.surrogate);
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
    /* compiled from: CashAdjustmentDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bh\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u0018\u0010(\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003Jj\u0010/\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001fR\u001e\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u001cR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u001f¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Surrogate;", "", "trigger_id", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "record_date", "Lcom/robinhood/rosetta/common/DateDto;", "trade_delta", "Lcom/robinhood/rosetta/common/MoneyDto;", "settle_delta", "funding_hold_delta", "settlement_date", "short_delta", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTrigger_id$annotations", "()V", "getTrigger_id", "()Lokio/ByteString;", "getRecord_date$annotations", "getRecord_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getTrade_delta$annotations", "getTrade_delta", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getSettle_delta$annotations", "getSettle_delta", "getFunding_hold_delta$annotations", "getFunding_hold_delta", "getSettlement_date$annotations", "getSettlement_date", "getShort_delta$annotations", "getShort_delta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_brokerage_externalRelease", "$serializer", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto funding_hold_delta;
        private final DateDto record_date;
        private final MoneyDto settle_delta;
        private final DateDto settlement_date;
        private final MoneyDto short_delta;
        private final MoneyDto trade_delta;
        private final ByteString trigger_id;

        public Surrogate() {
            this((ByteString) null, (DateDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (DateDto) null, (MoneyDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, DateDto dateDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, DateDto dateDto2, MoneyDto moneyDto4, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.trigger_id;
            }
            if ((i & 2) != 0) {
                dateDto = surrogate.record_date;
            }
            if ((i & 4) != 0) {
                moneyDto = surrogate.trade_delta;
            }
            if ((i & 8) != 0) {
                moneyDto2 = surrogate.settle_delta;
            }
            if ((i & 16) != 0) {
                moneyDto3 = surrogate.funding_hold_delta;
            }
            if ((i & 32) != 0) {
                dateDto2 = surrogate.settlement_date;
            }
            if ((i & 64) != 0) {
                moneyDto4 = surrogate.short_delta;
            }
            DateDto dateDto3 = dateDto2;
            MoneyDto moneyDto5 = moneyDto4;
            MoneyDto moneyDto6 = moneyDto3;
            MoneyDto moneyDto7 = moneyDto;
            return surrogate.copy(byteString, dateDto, moneyDto7, moneyDto2, moneyDto6, dateDto3, moneyDto5);
        }

        @SerialName("fundingHoldDelta")
        @JsonAnnotations2(names = {"funding_hold_delta"})
        public static /* synthetic */ void getFunding_hold_delta$annotations() {
        }

        @SerialName("recordDate")
        @JsonAnnotations2(names = {"record_date"})
        public static /* synthetic */ void getRecord_date$annotations() {
        }

        @SerialName("settleDelta")
        @JsonAnnotations2(names = {"settle_delta"})
        public static /* synthetic */ void getSettle_delta$annotations() {
        }

        @SerialName("settlementDate")
        @JsonAnnotations2(names = {"settlement_date"})
        public static /* synthetic */ void getSettlement_date$annotations() {
        }

        @SerialName("shortDelta")
        @JsonAnnotations2(names = {"short_delta"})
        public static /* synthetic */ void getShort_delta$annotations() {
        }

        @SerialName("tradeDelta")
        @JsonAnnotations2(names = {"trade_delta"})
        public static /* synthetic */ void getTrade_delta$annotations() {
        }

        @SerialName("triggerId")
        @JsonAnnotations2(names = {"trigger_id"})
        public static /* synthetic */ void getTrigger_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getTrigger_id() {
            return this.trigger_id;
        }

        /* renamed from: component2, reason: from getter */
        public final DateDto getRecord_date() {
            return this.record_date;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getTrade_delta() {
            return this.trade_delta;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getSettle_delta() {
            return this.settle_delta;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getFunding_hold_delta() {
            return this.funding_hold_delta;
        }

        /* renamed from: component6, reason: from getter */
        public final DateDto getSettlement_date() {
            return this.settlement_date;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getShort_delta() {
            return this.short_delta;
        }

        public final Surrogate copy(ByteString trigger_id, DateDto record_date, MoneyDto trade_delta, MoneyDto settle_delta, MoneyDto funding_hold_delta, DateDto settlement_date, MoneyDto short_delta) {
            Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
            return new Surrogate(trigger_id, record_date, trade_delta, settle_delta, funding_hold_delta, settlement_date, short_delta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.trigger_id, surrogate.trigger_id) && Intrinsics.areEqual(this.record_date, surrogate.record_date) && Intrinsics.areEqual(this.trade_delta, surrogate.trade_delta) && Intrinsics.areEqual(this.settle_delta, surrogate.settle_delta) && Intrinsics.areEqual(this.funding_hold_delta, surrogate.funding_hold_delta) && Intrinsics.areEqual(this.settlement_date, surrogate.settlement_date) && Intrinsics.areEqual(this.short_delta, surrogate.short_delta);
        }

        public int hashCode() {
            int iHashCode = this.trigger_id.hashCode() * 31;
            DateDto dateDto = this.record_date;
            int iHashCode2 = (iHashCode + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            MoneyDto moneyDto = this.trade_delta;
            int iHashCode3 = (iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.settle_delta;
            int iHashCode4 = (iHashCode3 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.funding_hold_delta;
            int iHashCode5 = (iHashCode4 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            DateDto dateDto2 = this.settlement_date;
            int iHashCode6 = (iHashCode5 + (dateDto2 == null ? 0 : dateDto2.hashCode())) * 31;
            MoneyDto moneyDto4 = this.short_delta;
            return iHashCode6 + (moneyDto4 != null ? moneyDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(trigger_id=" + this.trigger_id + ", record_date=" + this.record_date + ", trade_delta=" + this.trade_delta + ", settle_delta=" + this.settle_delta + ", funding_hold_delta=" + this.funding_hold_delta + ", settlement_date=" + this.settlement_date + ", short_delta=" + this.short_delta + ")";
        }

        /* compiled from: CashAdjustmentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Surrogate;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CashAdjustmentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, DateDto dateDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, DateDto dateDto2, MoneyDto moneyDto4, SerializationConstructorMarker serializationConstructorMarker) {
            this.trigger_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.record_date = null;
            } else {
                this.record_date = dateDto;
            }
            if ((i & 4) == 0) {
                this.trade_delta = null;
            } else {
                this.trade_delta = moneyDto;
            }
            if ((i & 8) == 0) {
                this.settle_delta = null;
            } else {
                this.settle_delta = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.funding_hold_delta = null;
            } else {
                this.funding_hold_delta = moneyDto3;
            }
            if ((i & 32) == 0) {
                this.settlement_date = null;
            } else {
                this.settlement_date = dateDto2;
            }
            if ((i & 64) == 0) {
                this.short_delta = null;
            } else {
                this.short_delta = moneyDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_brokerage_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.trigger_id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.trigger_id);
            }
            DateDto dateDto = self.record_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DateDto.Serializer.INSTANCE, dateDto);
            }
            MoneyDto moneyDto = self.trade_delta;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.settle_delta;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.funding_hold_delta;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            DateDto dateDto2 = self.settlement_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, DateDto.Serializer.INSTANCE, dateDto2);
            }
            MoneyDto moneyDto4 = self.short_delta;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
        }

        public Surrogate(ByteString trigger_id, DateDto dateDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, DateDto dateDto2, MoneyDto moneyDto4) {
            Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
            this.trigger_id = trigger_id;
            this.record_date = dateDto;
            this.trade_delta = moneyDto;
            this.settle_delta = moneyDto2;
            this.funding_hold_delta = moneyDto3;
            this.settlement_date = dateDto2;
            this.short_delta = moneyDto4;
        }

        public final ByteString getTrigger_id() {
            return this.trigger_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(okio.ByteString r2, com.robinhood.rosetta.common.DateDto r3, com.robinhood.rosetta.common.MoneyDto r4, com.robinhood.rosetta.common.MoneyDto r5, com.robinhood.rosetta.common.MoneyDto r6, com.robinhood.rosetta.common.DateDto r7, com.robinhood.rosetta.common.MoneyDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                okio.ByteString r2 = okio.ByteString.EMPTY
            L6:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lc
                r3 = r0
            Lc:
                r10 = r9 & 4
                if (r10 == 0) goto L11
                r4 = r0
            L11:
                r10 = r9 & 8
                if (r10 == 0) goto L16
                r5 = r0
            L16:
                r10 = r9 & 16
                if (r10 == 0) goto L1b
                r6 = r0
            L1b:
                r10 = r9 & 32
                if (r10 == 0) goto L20
                r7 = r0
            L20:
                r9 = r9 & 64
                if (r9 == 0) goto L2d
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L35
            L2d:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L35:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.brokerage.CashAdjustmentDto.Surrogate.<init>(okio.ByteString, com.robinhood.rosetta.common.DateDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.DateDto, com.robinhood.rosetta.common.MoneyDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final DateDto getRecord_date() {
            return this.record_date;
        }

        public final MoneyDto getTrade_delta() {
            return this.trade_delta;
        }

        public final MoneyDto getSettle_delta() {
            return this.settle_delta;
        }

        public final MoneyDto getFunding_hold_delta() {
            return this.funding_hold_delta;
        }

        public final DateDto getSettlement_date() {
            return this.settlement_date;
        }

        public final MoneyDto getShort_delta() {
            return this.short_delta;
        }
    }

    /* compiled from: CashAdjustmentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto;", "Lcom/robinhood/rosetta/brokerage/CashAdjustment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CashAdjustmentDto, CashAdjustment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CashAdjustmentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashAdjustmentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashAdjustmentDto> getBinaryBase64Serializer() {
            return (KSerializer) CashAdjustmentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CashAdjustment> getProtoAdapter() {
            return CashAdjustment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashAdjustmentDto getZeroValue() {
            return CashAdjustmentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashAdjustmentDto fromProto(CashAdjustment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString trigger_id = proto.getTrigger_id();
            Date record_date = proto.getRecord_date();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DateDto dateDtoFromProto = record_date != null ? DateDto.INSTANCE.fromProto(record_date) : null;
            Money trade_delta = proto.getTrade_delta();
            MoneyDto moneyDtoFromProto = trade_delta != null ? MoneyDto.INSTANCE.fromProto(trade_delta) : null;
            Money settle_delta = proto.getSettle_delta();
            MoneyDto moneyDtoFromProto2 = settle_delta != null ? MoneyDto.INSTANCE.fromProto(settle_delta) : null;
            Money funding_hold_delta = proto.getFunding_hold_delta();
            MoneyDto moneyDtoFromProto3 = funding_hold_delta != null ? MoneyDto.INSTANCE.fromProto(funding_hold_delta) : null;
            Date settlement_date = proto.getSettlement_date();
            DateDto dateDtoFromProto2 = settlement_date != null ? DateDto.INSTANCE.fromProto(settlement_date) : null;
            Money short_delta = proto.getShort_delta();
            return new CashAdjustmentDto(new Surrogate(trigger_id, dateDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, dateDtoFromProto2, short_delta != null ? MoneyDto.INSTANCE.fromProto(short_delta) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.brokerage.CashAdjustmentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashAdjustmentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CashAdjustmentDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CashAdjustmentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CashAdjustmentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.brokerage.CashAdjustment", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CashAdjustmentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CashAdjustmentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CashAdjustmentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CashAdjustmentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.brokerage.CashAdjustmentDto";
        }
    }
}
