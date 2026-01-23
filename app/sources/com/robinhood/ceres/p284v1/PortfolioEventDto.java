package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.CashMovementDto;
import com.robinhood.ceres.p284v1.EventTypeDto;
import com.robinhood.ceres.p284v1.PortfolioEventDto;
import com.robinhood.ceres.p284v1.PositionMovementDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: PortfolioEventDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<;=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u007f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0018J\u0083\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0019\u0010\u0015\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b8\u00101R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010\u001e¨\u0006?"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/PortfolioEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;)V", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/ceres/v1/EventTypeDto;", "type", "account_id", "", "Lcom/robinhood/ceres/v1/PositionMovementDto;", "position_movements", "Lcom/robinhood/ceres/v1/CashMovementDto;", "cash_movements", "trade_date", "rhs_account_number", "rhd_sub_account_id", "(Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/ceres/v1/PortfolioEventDto;", "toProto", "()Lcom/robinhood/ceres/v1/PortfolioEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;", "getId", "getTimestamp", "()Lj$/time/Instant;", "getType", "()Lcom/robinhood/ceres/v1/EventTypeDto;", "getAccount_id", "getPosition_movements", "()Ljava/util/List;", "getCash_movements", "getTrade_date", "getRhs_account_number", "getRhd_sub_account_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PortfolioEventDto implements Dto3<PortfolioEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioEventDto, PortfolioEvent>> binaryBase64Serializer$delegate;
    private static final PortfolioEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final EventTypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final List<PositionMovementDto> getPosition_movements() {
        return this.surrogate.getPosition_movements();
    }

    public final List<CashMovementDto> getCash_movements() {
        return this.surrogate.getCash_movements();
    }

    public final Instant getTrade_date() {
        return this.surrogate.getTrade_date();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final String getRhd_sub_account_id() {
        return this.surrogate.getRhd_sub_account_id();
    }

    public /* synthetic */ PortfolioEventDto(String str, Instant instant, EventTypeDto eventTypeDto, String str2, List list, List list2, Instant instant2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PortfolioEventDto(String id, Instant instant, EventTypeDto type2, String account_id, List<PositionMovementDto> position_movements, List<CashMovementDto> cash_movements, Instant instant2, String rhs_account_number, String rhd_sub_account_id) {
        this(new Surrogate(id, instant, type2, account_id, position_movements, cash_movements, instant2, rhs_account_number, rhd_sub_account_id));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position_movements, "position_movements");
        Intrinsics.checkNotNullParameter(cash_movements, "cash_movements");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_sub_account_id, "rhd_sub_account_id");
    }

    public static /* synthetic */ PortfolioEventDto copy$default(PortfolioEventDto portfolioEventDto, String str, Instant instant, EventTypeDto eventTypeDto, String str2, List list, List list2, Instant instant2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioEventDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            instant = portfolioEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            eventTypeDto = portfolioEventDto.surrogate.getType();
        }
        if ((i & 8) != 0) {
            str2 = portfolioEventDto.surrogate.getAccount_id();
        }
        if ((i & 16) != 0) {
            list = portfolioEventDto.surrogate.getPosition_movements();
        }
        if ((i & 32) != 0) {
            list2 = portfolioEventDto.surrogate.getCash_movements();
        }
        if ((i & 64) != 0) {
            instant2 = portfolioEventDto.surrogate.getTrade_date();
        }
        if ((i & 128) != 0) {
            str3 = portfolioEventDto.surrogate.getRhs_account_number();
        }
        if ((i & 256) != 0) {
            str4 = portfolioEventDto.surrogate.getRhd_sub_account_id();
        }
        String str5 = str3;
        String str6 = str4;
        List list3 = list2;
        Instant instant3 = instant2;
        List list4 = list;
        EventTypeDto eventTypeDto2 = eventTypeDto;
        return portfolioEventDto.copy(str, instant, eventTypeDto2, str2, list4, list3, instant3, str5, str6);
    }

    public final PortfolioEventDto copy(String id, Instant timestamp, EventTypeDto type2, String account_id, List<PositionMovementDto> position_movements, List<CashMovementDto> cash_movements, Instant trade_date, String rhs_account_number, String rhd_sub_account_id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position_movements, "position_movements");
        Intrinsics.checkNotNullParameter(cash_movements, "cash_movements");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_sub_account_id, "rhd_sub_account_id");
        return new PortfolioEventDto(new Surrogate(id, timestamp, type2, account_id, position_movements, cash_movements, trade_date, rhs_account_number, rhd_sub_account_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PortfolioEvent toProto() {
        String id = this.surrogate.getId();
        Instant timestamp = this.surrogate.getTimestamp();
        EventType eventType = (EventType) this.surrogate.getType().toProto();
        String account_id = this.surrogate.getAccount_id();
        List<PositionMovementDto> position_movements = this.surrogate.getPosition_movements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(position_movements, 10));
        Iterator<T> it = position_movements.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionMovementDto) it.next()).toProto());
        }
        List<CashMovementDto> cash_movements = this.surrogate.getCash_movements();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash_movements, 10));
        Iterator<T> it2 = cash_movements.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CashMovementDto) it2.next()).toProto());
        }
        return new PortfolioEvent(id, timestamp, eventType, account_id, arrayList, arrayList2, this.surrogate.getTrade_date(), this.surrogate.getRhs_account_number(), this.surrogate.getRhd_sub_account_id(), null, 512, null);
    }

    public String toString() {
        return "[PortfolioEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioEventDto) && Intrinsics.areEqual(((PortfolioEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioEventDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0083\b\u0018\u0000 R2\u00020\u0001:\u0002SRB¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J6\u0010'\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003¢\u0006\u0004\b.\u0010-J6\u0010/\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&JÂ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010&J\u0010\u00105\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010&RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010(R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010*R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010&R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bI\u0010>\u001a\u0004\bH\u0010-R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bK\u0010>\u001a\u0004\bJ\u0010-RF\u0010\u0012\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010?\u0012\u0004\bM\u0010>\u001a\u0004\bL\u0010(R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010;\u0012\u0004\bO\u0010>\u001a\u0004\bN\u0010&R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010;\u0012\u0004\bQ\u0010>\u001a\u0004\bP\u0010&¨\u0006T"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;", "", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/ceres/v1/EventTypeDto;", "type", "account_id", "", "Lcom/robinhood/ceres/v1/PositionMovementDto;", "position_movements", "Lcom/robinhood/ceres/v1/CashMovementDto;", "cash_movements", "trade_date", "rhs_account_number", "rhd_sub_account_id", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ceres_v1_externalRelease", "(Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/ceres/v1/EventTypeDto;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/ceres/v1/EventTypeDto;", "getType", "getType$annotations", "getAccount_id", "getAccount_id$annotations", "Ljava/util/List;", "getPosition_movements", "getPosition_movements$annotations", "getCash_movements", "getCash_movements$annotations", "getTrade_date", "getTrade_date$annotations", "getRhs_account_number", "getRhs_account_number$annotations", "getRhd_sub_account_id", "getRhd_sub_account_id$annotations", "Companion", "$serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final List<CashMovementDto> cash_movements;
        private final String id;
        private final List<PositionMovementDto> position_movements;
        private final String rhd_sub_account_id;
        private final String rhs_account_number;
        private final Instant timestamp;
        private final Instant trade_date;
        private final EventTypeDto type;

        public Surrogate() {
            this((String) null, (Instant) null, (EventTypeDto) null, (String) null, (List) null, (List) null, (Instant) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PositionMovementDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(CashMovementDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, EventTypeDto eventTypeDto, String str2, List list, List list2, Instant instant2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                eventTypeDto = surrogate.type;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.account_id;
            }
            if ((i & 16) != 0) {
                list = surrogate.position_movements;
            }
            if ((i & 32) != 0) {
                list2 = surrogate.cash_movements;
            }
            if ((i & 64) != 0) {
                instant2 = surrogate.trade_date;
            }
            if ((i & 128) != 0) {
                str3 = surrogate.rhs_account_number;
            }
            if ((i & 256) != 0) {
                str4 = surrogate.rhd_sub_account_id;
            }
            String str5 = str3;
            String str6 = str4;
            List list3 = list2;
            Instant instant3 = instant2;
            List list4 = list;
            EventTypeDto eventTypeDto2 = eventTypeDto;
            return surrogate.copy(str, instant, eventTypeDto2, str2, list4, list3, instant3, str5, str6);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("cashMovements")
        @JsonAnnotations2(names = {"cash_movements"})
        public static /* synthetic */ void getCash_movements$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("positionMovements")
        @JsonAnnotations2(names = {"position_movements"})
        public static /* synthetic */ void getPosition_movements$annotations() {
        }

        @SerialName("rhdSubAccountId")
        @JsonAnnotations2(names = {"rhd_sub_account_id"})
        public static /* synthetic */ void getRhd_sub_account_id$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("tradeDate")
        @JsonAnnotations2(names = {"trade_date"})
        public static /* synthetic */ void getTrade_date$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final EventTypeDto getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<PositionMovementDto> component5() {
            return this.position_movements;
        }

        public final List<CashMovementDto> component6() {
            return this.cash_movements;
        }

        /* renamed from: component7, reason: from getter */
        public final Instant getTrade_date() {
            return this.trade_date;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component9, reason: from getter */
        public final String getRhd_sub_account_id() {
            return this.rhd_sub_account_id;
        }

        public final Surrogate copy(String id, Instant timestamp, EventTypeDto type2, String account_id, List<PositionMovementDto> position_movements, List<CashMovementDto> cash_movements, Instant trade_date, String rhs_account_number, String rhd_sub_account_id) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(position_movements, "position_movements");
            Intrinsics.checkNotNullParameter(cash_movements, "cash_movements");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(rhd_sub_account_id, "rhd_sub_account_id");
            return new Surrogate(id, timestamp, type2, account_id, position_movements, cash_movements, trade_date, rhs_account_number, rhd_sub_account_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && this.type == surrogate.type && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.position_movements, surrogate.position_movements) && Intrinsics.areEqual(this.cash_movements, surrogate.cash_movements) && Intrinsics.areEqual(this.trade_date, surrogate.trade_date) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.rhd_sub_account_id, surrogate.rhd_sub_account_id);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.type.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.position_movements.hashCode()) * 31) + this.cash_movements.hashCode()) * 31;
            Instant instant2 = this.trade_date;
            return ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.rhs_account_number.hashCode()) * 31) + this.rhd_sub_account_id.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", account_id=" + this.account_id + ", position_movements=" + this.position_movements + ", cash_movements=" + this.cash_movements + ", trade_date=" + this.trade_date + ", rhs_account_number=" + this.rhs_account_number + ", rhd_sub_account_id=" + this.rhd_sub_account_id + ")";
        }

        /* compiled from: PortfolioEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioEventDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.PortfolioEventDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioEventDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.PortfolioEventDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioEventDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, EventTypeDto eventTypeDto, String str2, List list, List list2, Instant instant2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.type = EventTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = eventTypeDto;
            }
            if ((i & 8) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 16) == 0) {
                this.position_movements = CollectionsKt.emptyList();
            } else {
                this.position_movements = list;
            }
            if ((i & 32) == 0) {
                this.cash_movements = CollectionsKt.emptyList();
            } else {
                this.cash_movements = list2;
            }
            if ((i & 64) == 0) {
                this.trade_date = null;
            } else {
                this.trade_date = instant2;
            }
            if ((i & 128) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str3;
            }
            if ((i & 256) == 0) {
                this.rhd_sub_account_id = "";
            } else {
                this.rhd_sub_account_id = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.type != EventTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EventTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_id);
            }
            if (!Intrinsics.areEqual(self.position_movements, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.position_movements);
            }
            if (!Intrinsics.areEqual(self.cash_movements, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.cash_movements);
            }
            Instant instant2 = self.trade_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 7, self.rhs_account_number);
            }
            if (Intrinsics.areEqual(self.rhd_sub_account_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 8, self.rhd_sub_account_id);
        }

        public Surrogate(String id, Instant instant, EventTypeDto type2, String account_id, List<PositionMovementDto> position_movements, List<CashMovementDto> cash_movements, Instant instant2, String rhs_account_number, String rhd_sub_account_id) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(position_movements, "position_movements");
            Intrinsics.checkNotNullParameter(cash_movements, "cash_movements");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(rhd_sub_account_id, "rhd_sub_account_id");
            this.id = id;
            this.timestamp = instant;
            this.type = type2;
            this.account_id = account_id;
            this.position_movements = position_movements;
            this.cash_movements = cash_movements;
            this.trade_date = instant2;
            this.rhs_account_number = rhs_account_number;
            this.rhd_sub_account_id = rhd_sub_account_id;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, EventTypeDto eventTypeDto, String str2, List list, List list2, Instant instant2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final EventTypeDto getType() {
            return this.type;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<PositionMovementDto> getPosition_movements() {
            return this.position_movements;
        }

        public final List<CashMovementDto> getCash_movements() {
            return this.cash_movements;
        }

        public final Instant getTrade_date() {
            return this.trade_date;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getRhd_sub_account_id() {
            return this.rhd_sub_account_id;
        }
    }

    /* compiled from: PortfolioEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/PortfolioEventDto;", "Lcom/robinhood/ceres/v1/PortfolioEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/PortfolioEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioEventDto, PortfolioEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioEventDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioEvent> getProtoAdapter() {
            return PortfolioEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioEventDto getZeroValue() {
            return PortfolioEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioEventDto fromProto(PortfolioEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            Instant timestamp = proto.getTimestamp();
            EventTypeDto eventTypeDtoFromProto = EventTypeDto.INSTANCE.fromProto(proto.getType());
            String account_id = proto.getAccount_id();
            List<PositionMovement> position_movements = proto.getPosition_movements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(position_movements, 10));
            Iterator<T> it = position_movements.iterator();
            while (it.hasNext()) {
                arrayList.add(PositionMovementDto.INSTANCE.fromProto((PositionMovement) it.next()));
            }
            List<CashMovement> cash_movements = proto.getCash_movements();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash_movements, 10));
            Iterator<T> it2 = cash_movements.iterator();
            while (it2.hasNext()) {
                arrayList2.add(CashMovementDto.INSTANCE.fromProto((CashMovement) it2.next()));
            }
            return new PortfolioEventDto(new Surrogate(id, timestamp, eventTypeDtoFromProto, account_id, arrayList, arrayList2, proto.getTrade_date(), proto.getRhs_account_number(), proto.getRhd_sub_account_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.PortfolioEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioEventDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new PortfolioEventDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PortfolioEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/PortfolioEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.PortfolioEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.PortfolioEventDto";
        }
    }
}
