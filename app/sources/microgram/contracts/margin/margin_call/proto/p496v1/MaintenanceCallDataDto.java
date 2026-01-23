package microgram.contracts.margin.margin_call.proto.p496v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.contracts.margin.margin_call.proto.p496v1.CashFlowStateDto;
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataDto;
import microgram.contracts.margin.margin_call.proto.p496v1.TradeDto;
import p479j$.time.Instant;

/* compiled from: MaintenanceCallDataDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B§\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0006\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;)V", "", "account_number", "", "is_resolved", "is_pending", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount_remaining", "recommended_deposit_amount", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "sells", "order_ids_to_cancel", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "regular_market_open_time", "regular_market_close_time", "amount_towards_call", "total_estimated_cash_flow", "Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;", "cash_flow_state", "(Ljava/lang/String;ZZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;)V", "toProto", "()Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;", "getSells", "()Ljava/util/List;", "getAmount_towards_call", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_estimated_cash_flow", "getCash_flow_state", "()Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MaintenanceCallDataDto implements Dto3<MaintenanceCallData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MaintenanceCallDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MaintenanceCallDataDto, MaintenanceCallData>> binaryBase64Serializer$delegate;
    private static final MaintenanceCallDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MaintenanceCallDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MaintenanceCallDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<TradeDto> getSells() {
        return this.surrogate.getSells();
    }

    public final MoneyDto getAmount_towards_call() {
        return this.surrogate.getAmount_towards_call();
    }

    public final MoneyDto getTotal_estimated_cash_flow() {
        return this.surrogate.getTotal_estimated_cash_flow();
    }

    public final CashFlowStateDto getCash_flow_state() {
        return this.surrogate.getCash_flow_state();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MaintenanceCallDataDto(java.lang.String r2, boolean r3, boolean r4, com.robinhood.rosetta.common.MoneyDto r5, com.robinhood.rosetta.common.MoneyDto r6, java.util.List r7, java.util.List r8, p479j$.time.Instant r9, p479j$.time.Instant r10, com.robinhood.rosetta.common.MoneyDto r11, com.robinhood.rosetta.common.MoneyDto r12, microgram.contracts.margin.margin_call.proto.p496v1.CashFlowStateDto r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto Lc
            r3 = r0
        Lc:
            r15 = r14 & 4
            if (r15 == 0) goto L11
            r4 = r0
        L11:
            r15 = r14 & 8
            r0 = 0
            if (r15 == 0) goto L17
            r5 = r0
        L17:
            r15 = r14 & 16
            if (r15 == 0) goto L1c
            r6 = r0
        L1c:
            r15 = r14 & 32
            if (r15 == 0) goto L24
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L24:
            r15 = r14 & 64
            if (r15 == 0) goto L2c
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        L2c:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L31
            r9 = r0
        L31:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L36
            r10 = r0
        L36:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L3b
            r11 = r0
        L3b:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L40
            r12 = r0
        L40:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L52
            r15 = r0
            r13 = r11
            r14 = r12
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
            goto L5f
        L52:
            r15 = r13
            r14 = r12
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
            r3 = r1
        L5f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataDto.<init>(java.lang.String, boolean, boolean, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.util.List, java.util.List, j$.time.Instant, j$.time.Instant, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, microgram.contracts.margin.margin_call.proto.v1.CashFlowStateDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaintenanceCallDataDto(String account_number, boolean z, boolean z2, MoneyDto moneyDto, MoneyDto moneyDto2, List<TradeDto> sells, List<String> order_ids_to_cancel, Instant instant, Instant instant2, MoneyDto moneyDto3, MoneyDto moneyDto4, CashFlowStateDto cashFlowStateDto) {
        this(new Surrogate(account_number, z, z2, moneyDto, moneyDto2, sells, order_ids_to_cancel, instant, instant2, moneyDto3, moneyDto4, cashFlowStateDto));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(sells, "sells");
        Intrinsics.checkNotNullParameter(order_ids_to_cancel, "order_ids_to_cancel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MaintenanceCallData toProto() {
        String account_number = this.surrogate.getAccount_number();
        boolean is_resolved = this.surrogate.getIs_resolved();
        boolean is_pending = this.surrogate.getIs_pending();
        MoneyDto amount_remaining = this.surrogate.getAmount_remaining();
        Money proto = amount_remaining != null ? amount_remaining.toProto() : null;
        MoneyDto recommended_deposit_amount = this.surrogate.getRecommended_deposit_amount();
        Money proto2 = recommended_deposit_amount != null ? recommended_deposit_amount.toProto() : null;
        List<TradeDto> sells = this.surrogate.getSells();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sells, 10));
        Iterator<T> it = sells.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeDto) it.next()).toProto());
        }
        List<String> order_ids_to_cancel = this.surrogate.getOrder_ids_to_cancel();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_ids_to_cancel, 10));
        Iterator<T> it2 = order_ids_to_cancel.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        Instant regular_market_open_time = this.surrogate.getRegular_market_open_time();
        Instant regular_market_close_time = this.surrogate.getRegular_market_close_time();
        MoneyDto amount_towards_call = this.surrogate.getAmount_towards_call();
        Money proto3 = amount_towards_call != null ? amount_towards_call.toProto() : null;
        MoneyDto total_estimated_cash_flow = this.surrogate.getTotal_estimated_cash_flow();
        Money proto4 = total_estimated_cash_flow != null ? total_estimated_cash_flow.toProto() : null;
        CashFlowStateDto cash_flow_state = this.surrogate.getCash_flow_state();
        return new MaintenanceCallData(account_number, is_resolved, is_pending, proto, proto2, arrayList, arrayList2, regular_market_open_time, regular_market_close_time, proto3, proto4, cash_flow_state != null ? (CashFlowState) cash_flow_state.toProto() : null, null, 4096, null);
    }

    public String toString() {
        return "[MaintenanceCallDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MaintenanceCallDataDto) && Intrinsics.areEqual(((MaintenanceCallDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: MaintenanceCallDataDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\b\u0083\b\u0018\u0000 R2\u00020\u0001:\u0002SRBá\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u009b\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010*R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b\u0005\u00105R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b7\u00103\u001a\u0004\b\u0006\u00105R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b=\u00103\u001a\u0004\b<\u0010:R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bA\u00103\u001a\u0004\b?\u0010@R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bC\u00103\u001a\u0004\bB\u0010@RF\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FRF\u0010\u0014\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010D\u0012\u0004\bI\u00103\u001a\u0004\bH\u0010FR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00108\u0012\u0004\bK\u00103\u001a\u0004\bJ\u0010:R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00108\u0012\u0004\bM\u00103\u001a\u0004\bL\u0010:R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010N\u0012\u0004\bQ\u00103\u001a\u0004\bO\u0010P¨\u0006T"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;", "", "", "account_number", "", "is_resolved", "is_pending", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount_remaining", "recommended_deposit_amount", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "sells", "order_ids_to_cancel", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "regular_market_open_time", "regular_market_close_time", "amount_towards_call", "total_estimated_cash_flow", "Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;", "cash_flow_state", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Z", "()Z", "is_resolved$annotations", "is_pending$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount_remaining", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount_remaining$annotations", "getRecommended_deposit_amount", "getRecommended_deposit_amount$annotations", "Ljava/util/List;", "getSells", "()Ljava/util/List;", "getSells$annotations", "getOrder_ids_to_cancel", "getOrder_ids_to_cancel$annotations", "Lj$/time/Instant;", "getRegular_market_open_time", "()Lj$/time/Instant;", "getRegular_market_open_time$annotations", "getRegular_market_close_time", "getRegular_market_close_time$annotations", "getAmount_towards_call", "getAmount_towards_call$annotations", "getTotal_estimated_cash_flow", "getTotal_estimated_cash_flow$annotations", "Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;", "getCash_flow_state", "()Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowStateDto;", "getCash_flow_state$annotations", "Companion", "$serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final MoneyDto amount_remaining;
        private final MoneyDto amount_towards_call;
        private final CashFlowStateDto cash_flow_state;
        private final boolean is_pending;
        private final boolean is_resolved;
        private final List<String> order_ids_to_cancel;
        private final MoneyDto recommended_deposit_amount;
        private final Instant regular_market_close_time;
        private final Instant regular_market_open_time;
        private final List<TradeDto> sells;
        private final MoneyDto total_estimated_cash_flow;

        public Surrogate() {
            this((String) null, false, false, (MoneyDto) null, (MoneyDto) null, (List) null, (List) null, (Instant) null, (Instant) null, (MoneyDto) null, (MoneyDto) null, (CashFlowStateDto) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TradeDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.is_resolved == surrogate.is_resolved && this.is_pending == surrogate.is_pending && Intrinsics.areEqual(this.amount_remaining, surrogate.amount_remaining) && Intrinsics.areEqual(this.recommended_deposit_amount, surrogate.recommended_deposit_amount) && Intrinsics.areEqual(this.sells, surrogate.sells) && Intrinsics.areEqual(this.order_ids_to_cancel, surrogate.order_ids_to_cancel) && Intrinsics.areEqual(this.regular_market_open_time, surrogate.regular_market_open_time) && Intrinsics.areEqual(this.regular_market_close_time, surrogate.regular_market_close_time) && Intrinsics.areEqual(this.amount_towards_call, surrogate.amount_towards_call) && Intrinsics.areEqual(this.total_estimated_cash_flow, surrogate.total_estimated_cash_flow) && this.cash_flow_state == surrogate.cash_flow_state;
        }

        public int hashCode() {
            int iHashCode = ((((this.account_number.hashCode() * 31) + Boolean.hashCode(this.is_resolved)) * 31) + Boolean.hashCode(this.is_pending)) * 31;
            MoneyDto moneyDto = this.amount_remaining;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.recommended_deposit_amount;
            int iHashCode3 = (((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.sells.hashCode()) * 31) + this.order_ids_to_cancel.hashCode()) * 31;
            Instant instant = this.regular_market_open_time;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.regular_market_close_time;
            int iHashCode5 = (iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.amount_towards_call;
            int iHashCode6 = (iHashCode5 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.total_estimated_cash_flow;
            int iHashCode7 = (iHashCode6 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            CashFlowStateDto cashFlowStateDto = this.cash_flow_state;
            return iHashCode7 + (cashFlowStateDto != null ? cashFlowStateDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", is_resolved=" + this.is_resolved + ", is_pending=" + this.is_pending + ", amount_remaining=" + this.amount_remaining + ", recommended_deposit_amount=" + this.recommended_deposit_amount + ", sells=" + this.sells + ", order_ids_to_cancel=" + this.order_ids_to_cancel + ", regular_market_open_time=" + this.regular_market_open_time + ", regular_market_close_time=" + this.regular_market_close_time + ", amount_towards_call=" + this.amount_towards_call + ", total_estimated_cash_flow=" + this.total_estimated_cash_flow + ", cash_flow_state=" + this.cash_flow_state + ")";
        }

        /* compiled from: MaintenanceCallDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MaintenanceCallDataDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MaintenanceCallDataDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MaintenanceCallDataDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, boolean z2, MoneyDto moneyDto, MoneyDto moneyDto2, List list, List list2, Instant instant, Instant instant2, MoneyDto moneyDto3, MoneyDto moneyDto4, CashFlowStateDto cashFlowStateDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.is_resolved = false;
            } else {
                this.is_resolved = z;
            }
            if ((i & 4) == 0) {
                this.is_pending = false;
            } else {
                this.is_pending = z2;
            }
            if ((i & 8) == 0) {
                this.amount_remaining = null;
            } else {
                this.amount_remaining = moneyDto;
            }
            if ((i & 16) == 0) {
                this.recommended_deposit_amount = null;
            } else {
                this.recommended_deposit_amount = moneyDto2;
            }
            if ((i & 32) == 0) {
                this.sells = CollectionsKt.emptyList();
            } else {
                this.sells = list;
            }
            if ((i & 64) == 0) {
                this.order_ids_to_cancel = CollectionsKt.emptyList();
            } else {
                this.order_ids_to_cancel = list2;
            }
            if ((i & 128) == 0) {
                this.regular_market_open_time = null;
            } else {
                this.regular_market_open_time = instant;
            }
            if ((i & 256) == 0) {
                this.regular_market_close_time = null;
            } else {
                this.regular_market_close_time = instant2;
            }
            if ((i & 512) == 0) {
                this.amount_towards_call = null;
            } else {
                this.amount_towards_call = moneyDto3;
            }
            if ((i & 1024) == 0) {
                this.total_estimated_cash_flow = null;
            } else {
                this.total_estimated_cash_flow = moneyDto4;
            }
            if ((i & 2048) == 0) {
                this.cash_flow_state = null;
            } else {
                this.cash_flow_state = cashFlowStateDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease */
        public static final /* synthetic */ void m3769xd30f103b(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            boolean z = self.is_resolved;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            boolean z2 = self.is_pending;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 2, z2);
            }
            MoneyDto moneyDto = self.amount_remaining;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.recommended_deposit_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.sells, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.sells);
            }
            if (!Intrinsics.areEqual(self.order_ids_to_cancel, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.order_ids_to_cancel);
            }
            Instant instant = self.regular_market_open_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.regular_market_close_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant2);
            }
            MoneyDto moneyDto3 = self.amount_towards_call;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.total_estimated_cash_flow;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            CashFlowStateDto cashFlowStateDto = self.cash_flow_state;
            if (cashFlowStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, CashFlowStateDto.Serializer.INSTANCE, cashFlowStateDto);
            }
        }

        public Surrogate(String account_number, boolean z, boolean z2, MoneyDto moneyDto, MoneyDto moneyDto2, List<TradeDto> sells, List<String> order_ids_to_cancel, Instant instant, Instant instant2, MoneyDto moneyDto3, MoneyDto moneyDto4, CashFlowStateDto cashFlowStateDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(sells, "sells");
            Intrinsics.checkNotNullParameter(order_ids_to_cancel, "order_ids_to_cancel");
            this.account_number = account_number;
            this.is_resolved = z;
            this.is_pending = z2;
            this.amount_remaining = moneyDto;
            this.recommended_deposit_amount = moneyDto2;
            this.sells = sells;
            this.order_ids_to_cancel = order_ids_to_cancel;
            this.regular_market_open_time = instant;
            this.regular_market_close_time = instant2;
            this.amount_towards_call = moneyDto3;
            this.total_estimated_cash_flow = moneyDto4;
            this.cash_flow_state = cashFlowStateDto;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, boolean r3, boolean r4, com.robinhood.rosetta.common.MoneyDto r5, com.robinhood.rosetta.common.MoneyDto r6, java.util.List r7, java.util.List r8, p479j$.time.Instant r9, p479j$.time.Instant r10, com.robinhood.rosetta.common.MoneyDto r11, com.robinhood.rosetta.common.MoneyDto r12, microgram.contracts.margin.margin_call.proto.p496v1.CashFlowStateDto r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r1 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lc
                r3 = r0
            Lc:
                r15 = r14 & 4
                if (r15 == 0) goto L11
                r4 = r0
            L11:
                r15 = r14 & 8
                r0 = 0
                if (r15 == 0) goto L17
                r5 = r0
            L17:
                r15 = r14 & 16
                if (r15 == 0) goto L1c
                r6 = r0
            L1c:
                r15 = r14 & 32
                if (r15 == 0) goto L24
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            L24:
                r15 = r14 & 64
                if (r15 == 0) goto L2c
                java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            L2c:
                r15 = r14 & 128(0x80, float:1.794E-43)
                if (r15 == 0) goto L31
                r9 = r0
            L31:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L36
                r10 = r0
            L36:
                r15 = r14 & 512(0x200, float:7.175E-43)
                if (r15 == 0) goto L3b
                r11 = r0
            L3b:
                r15 = r14 & 1024(0x400, float:1.435E-42)
                if (r15 == 0) goto L40
                r12 = r0
            L40:
                r14 = r14 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L52
                r15 = r0
                r13 = r11
                r14 = r12
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
                goto L5f
            L52:
                r15 = r13
                r14 = r12
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
                r3 = r1
            L5f:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataDto.Surrogate.<init>(java.lang.String, boolean, boolean, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, java.util.List, java.util.List, j$.time.Instant, j$.time.Instant, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, microgram.contracts.margin.margin_call.proto.v1.CashFlowStateDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: is_resolved, reason: from getter */
        public final boolean getIs_resolved() {
            return this.is_resolved;
        }

        /* renamed from: is_pending, reason: from getter */
        public final boolean getIs_pending() {
            return this.is_pending;
        }

        public final MoneyDto getAmount_remaining() {
            return this.amount_remaining;
        }

        public final MoneyDto getRecommended_deposit_amount() {
            return this.recommended_deposit_amount;
        }

        public final List<TradeDto> getSells() {
            return this.sells;
        }

        public final List<String> getOrder_ids_to_cancel() {
            return this.order_ids_to_cancel;
        }

        public final Instant getRegular_market_open_time() {
            return this.regular_market_open_time;
        }

        public final Instant getRegular_market_close_time() {
            return this.regular_market_close_time;
        }

        public final MoneyDto getAmount_towards_call() {
            return this.amount_towards_call;
        }

        public final MoneyDto getTotal_estimated_cash_flow() {
            return this.total_estimated_cash_flow;
        }

        public final CashFlowStateDto getCash_flow_state() {
            return this.cash_flow_state;
        }
    }

    /* compiled from: MaintenanceCallDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MaintenanceCallDataDto, MaintenanceCallData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MaintenanceCallDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MaintenanceCallDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MaintenanceCallDataDto> getBinaryBase64Serializer() {
            return (KSerializer) MaintenanceCallDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MaintenanceCallData> getProtoAdapter() {
            return MaintenanceCallData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MaintenanceCallDataDto getZeroValue() {
            return MaintenanceCallDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MaintenanceCallDataDto fromProto(MaintenanceCallData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            boolean zIs_resolved = proto.getIs_resolved();
            boolean zIs_pending = proto.getIs_pending();
            Money amount_remaining = proto.getAmount_remaining();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount_remaining != null ? MoneyDto.INSTANCE.fromProto(amount_remaining) : null;
            Money recommended_deposit_amount = proto.getRecommended_deposit_amount();
            MoneyDto moneyDtoFromProto2 = recommended_deposit_amount != null ? MoneyDto.INSTANCE.fromProto(recommended_deposit_amount) : null;
            List<Trade> sells = proto.getSells();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sells, 10));
            Iterator<T> it = sells.iterator();
            while (it.hasNext()) {
                arrayList.add(TradeDto.INSTANCE.fromProto((Trade) it.next()));
            }
            List<String> order_ids_to_cancel = proto.getOrder_ids_to_cancel();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_ids_to_cancel, 10));
            Iterator<T> it2 = order_ids_to_cancel.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            Instant regular_market_open_time = proto.getRegular_market_open_time();
            Instant regular_market_close_time = proto.getRegular_market_close_time();
            Money amount_towards_call = proto.getAmount_towards_call();
            MoneyDto moneyDtoFromProto3 = amount_towards_call != null ? MoneyDto.INSTANCE.fromProto(amount_towards_call) : null;
            Money total_estimated_cash_flow = proto.getTotal_estimated_cash_flow();
            MoneyDto moneyDtoFromProto4 = total_estimated_cash_flow != null ? MoneyDto.INSTANCE.fromProto(total_estimated_cash_flow) : null;
            CashFlowState cash_flow_state = proto.getCash_flow_state();
            return new MaintenanceCallDataDto(new Surrogate(account_number, zIs_resolved, zIs_pending, moneyDtoFromProto, moneyDtoFromProto2, arrayList, arrayList2, regular_market_open_time, regular_market_close_time, moneyDtoFromProto3, moneyDtoFromProto4, cash_flow_state != null ? CashFlowStateDto.INSTANCE.fromProto(cash_flow_state) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MaintenanceCallDataDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new MaintenanceCallDataDto(null, false, false, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MaintenanceCallDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MaintenanceCallDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MaintenanceCallDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MaintenanceCallDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MaintenanceCallDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MaintenanceCallDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataDto";
        }
    }
}
