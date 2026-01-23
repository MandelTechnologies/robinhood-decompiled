package com.truelayer.payments.core.network.mandates.entity.shared;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.truelayer.payments.core.domain.payments.PeriodicLimits;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00045678Ba\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBM\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003JQ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0004HÖ\u0001J\b\u0010*\u001a\u00020\u0002H\u0016J\t\u0010+\u001a\u00020,HÖ\u0001J&\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203HÁ\u0001¢\u0006\u0002\b4R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u00069"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits;", "seen1", "", "day", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;", "week", "fortnight", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "halfYear", "year", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;)V", "getDay$annotations", "()V", "getDay", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;", "getFortnight$annotations", "getFortnight", "getHalfYear$annotations", "getHalfYear", "getMonth$annotations", "getMonth", "getWeek$annotations", "getWeek", "getYear$annotations", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "Limit", "PeriodAlignment", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class PeriodicLimits implements IntoDomain<com.truelayer.payments.core.domain.payments.PeriodicLimits> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Limit day;
    private final Limit fortnight;
    private final Limit halfYear;
    private final Limit month;
    private final Limit week;
    private final Limit year;

    public PeriodicLimits() {
        this((Limit) null, (Limit) null, (Limit) null, (Limit) null, (Limit) null, (Limit) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PeriodicLimits copy$default(PeriodicLimits periodicLimits, Limit limit, Limit limit2, Limit limit3, Limit limit4, Limit limit5, Limit limit6, int i, Object obj) {
        if ((i & 1) != 0) {
            limit = periodicLimits.day;
        }
        if ((i & 2) != 0) {
            limit2 = periodicLimits.week;
        }
        if ((i & 4) != 0) {
            limit3 = periodicLimits.fortnight;
        }
        if ((i & 8) != 0) {
            limit4 = periodicLimits.month;
        }
        if ((i & 16) != 0) {
            limit5 = periodicLimits.halfYear;
        }
        if ((i & 32) != 0) {
            limit6 = periodicLimits.year;
        }
        Limit limit7 = limit5;
        Limit limit8 = limit6;
        return periodicLimits.copy(limit, limit2, limit3, limit4, limit7, limit8);
    }

    @SerialName("day")
    public static /* synthetic */ void getDay$annotations() {
    }

    @SerialName("fortnight")
    public static /* synthetic */ void getFortnight$annotations() {
    }

    @SerialName("half_year")
    public static /* synthetic */ void getHalfYear$annotations() {
    }

    @SerialName(ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS)
    public static /* synthetic */ void getMonth$annotations() {
    }

    @SerialName("week")
    public static /* synthetic */ void getWeek$annotations() {
    }

    @SerialName("year")
    public static /* synthetic */ void getYear$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Limit getDay() {
        return this.day;
    }

    /* renamed from: component2, reason: from getter */
    public final Limit getWeek() {
        return this.week;
    }

    /* renamed from: component3, reason: from getter */
    public final Limit getFortnight() {
        return this.fortnight;
    }

    /* renamed from: component4, reason: from getter */
    public final Limit getMonth() {
        return this.month;
    }

    /* renamed from: component5, reason: from getter */
    public final Limit getHalfYear() {
        return this.halfYear;
    }

    /* renamed from: component6, reason: from getter */
    public final Limit getYear() {
        return this.year;
    }

    public final PeriodicLimits copy(Limit day, Limit week, Limit fortnight, Limit month, Limit halfYear, Limit year) {
        return new PeriodicLimits(day, week, fortnight, month, halfYear, year);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodicLimits)) {
            return false;
        }
        PeriodicLimits periodicLimits = (PeriodicLimits) other;
        return Intrinsics.areEqual(this.day, periodicLimits.day) && Intrinsics.areEqual(this.week, periodicLimits.week) && Intrinsics.areEqual(this.fortnight, periodicLimits.fortnight) && Intrinsics.areEqual(this.month, periodicLimits.month) && Intrinsics.areEqual(this.halfYear, periodicLimits.halfYear) && Intrinsics.areEqual(this.year, periodicLimits.year);
    }

    public int hashCode() {
        Limit limit = this.day;
        int iHashCode = (limit == null ? 0 : limit.hashCode()) * 31;
        Limit limit2 = this.week;
        int iHashCode2 = (iHashCode + (limit2 == null ? 0 : limit2.hashCode())) * 31;
        Limit limit3 = this.fortnight;
        int iHashCode3 = (iHashCode2 + (limit3 == null ? 0 : limit3.hashCode())) * 31;
        Limit limit4 = this.month;
        int iHashCode4 = (iHashCode3 + (limit4 == null ? 0 : limit4.hashCode())) * 31;
        Limit limit5 = this.halfYear;
        int iHashCode5 = (iHashCode4 + (limit5 == null ? 0 : limit5.hashCode())) * 31;
        Limit limit6 = this.year;
        return iHashCode5 + (limit6 != null ? limit6.hashCode() : 0);
    }

    public String toString() {
        return "PeriodicLimits(day=" + this.day + ", week=" + this.week + ", fortnight=" + this.fortnight + ", month=" + this.month + ", halfYear=" + this.halfYear + ", year=" + this.year + ")";
    }

    /* compiled from: MandateConstraints.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicLimits> serializer() {
            return MandateConstraints5.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ PeriodicLimits(int i, @SerialName("day") Limit limit, @SerialName("week") Limit limit2, @SerialName("fortnight") Limit limit3, @SerialName(ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS) Limit limit4, @SerialName("half_year") Limit limit5, @SerialName("year") Limit limit6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.day = null;
        } else {
            this.day = limit;
        }
        if ((i & 2) == 0) {
            this.week = null;
        } else {
            this.week = limit2;
        }
        if ((i & 4) == 0) {
            this.fortnight = null;
        } else {
            this.fortnight = limit3;
        }
        if ((i & 8) == 0) {
            this.month = null;
        } else {
            this.month = limit4;
        }
        if ((i & 16) == 0) {
            this.halfYear = null;
        } else {
            this.halfYear = limit5;
        }
        if ((i & 32) == 0) {
            this.year = null;
        } else {
            this.year = limit6;
        }
    }

    public PeriodicLimits(Limit limit, Limit limit2, Limit limit3, Limit limit4, Limit limit5, Limit limit6) {
        this.day = limit;
        this.week = limit2;
        this.fortnight = limit3;
        this.month = limit4;
        this.halfYear = limit5;
        this.year = limit6;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(PeriodicLimits self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.day != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, MandateConstraints6.INSTANCE, self.day);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.week != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, MandateConstraints6.INSTANCE, self.week);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.fortnight != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MandateConstraints6.INSTANCE, self.fortnight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.month != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, MandateConstraints6.INSTANCE, self.month);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.halfYear != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, MandateConstraints6.INSTANCE, self.halfYear);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.year == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, MandateConstraints6.INSTANCE, self.year);
    }

    public /* synthetic */ PeriodicLimits(Limit limit, Limit limit2, Limit limit3, Limit limit4, Limit limit5, Limit limit6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : limit, (i & 2) != 0 ? null : limit2, (i & 4) != 0 ? null : limit3, (i & 8) != 0 ? null : limit4, (i & 16) != 0 ? null : limit5, (i & 32) != 0 ? null : limit6);
    }

    public final Limit getDay() {
        return this.day;
    }

    public final Limit getWeek() {
        return this.week;
    }

    public final Limit getFortnight() {
        return this.fortnight;
    }

    public final Limit getMonth() {
        return this.month;
    }

    public final Limit getHalfYear() {
        return this.halfYear;
    }

    /* compiled from: MandateConstraints.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;", "seen1", "", "maximumAmount", "", "periodAlignment", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment;)V", "getMaximumAmount$annotations", "()V", "getMaximumAmount", "()J", "getPeriodAlignment$annotations", "getPeriodAlignment", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Limit implements IntoDomain<PeriodicLimits.Limit> {
        private final long maximumAmount;
        private final PeriodAlignment periodAlignment;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, PeriodAlignment.INSTANCE.serializer()};

        public static /* synthetic */ Limit copy$default(Limit limit, long j, PeriodAlignment periodAlignment, int i, Object obj) {
            if ((i & 1) != 0) {
                j = limit.maximumAmount;
            }
            if ((i & 2) != 0) {
                periodAlignment = limit.periodAlignment;
            }
            return limit.copy(j, periodAlignment);
        }

        @SerialName("maximum_amount")
        public static /* synthetic */ void getMaximumAmount$annotations() {
        }

        @SerialName("period_alignment")
        public static /* synthetic */ void getPeriodAlignment$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final long getMaximumAmount() {
            return this.maximumAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final PeriodAlignment getPeriodAlignment() {
            return this.periodAlignment;
        }

        public final Limit copy(long maximumAmount, PeriodAlignment periodAlignment) {
            Intrinsics.checkNotNullParameter(periodAlignment, "periodAlignment");
            return new Limit(maximumAmount, periodAlignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return this.maximumAmount == limit.maximumAmount && this.periodAlignment == limit.periodAlignment;
        }

        public int hashCode() {
            return (Long.hashCode(this.maximumAmount) * 31) + this.periodAlignment.hashCode();
        }

        public String toString() {
            return "Limit(maximumAmount=" + this.maximumAmount + ", periodAlignment=" + this.periodAlignment + ")";
        }

        /* compiled from: MandateConstraints.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Limit> serializer() {
                return MandateConstraints6.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ Limit(int i, @SerialName("maximum_amount") long j, @SerialName("period_alignment") PeriodAlignment periodAlignment, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, MandateConstraints6.INSTANCE.getDescriptor());
            }
            this.maximumAmount = j;
            this.periodAlignment = periodAlignment;
        }

        public Limit(long j, PeriodAlignment periodAlignment) {
            Intrinsics.checkNotNullParameter(periodAlignment, "periodAlignment");
            this.maximumAmount = j;
            this.periodAlignment = periodAlignment;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Limit self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeLongElement(serialDesc, 0, self.maximumAmount);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.periodAlignment);
        }

        public final long getMaximumAmount() {
            return this.maximumAmount;
        }

        public final PeriodAlignment getPeriodAlignment() {
            return this.periodAlignment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public PeriodicLimits.Limit intoDomain2() {
            return new PeriodicLimits.Limit(this.maximumAmount, this.periodAlignment.intoDomain());
        }
    }

    public final Limit getYear() {
        return this.year;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MandateConstraints.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment;", "", "(Ljava/lang/String;I)V", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$PeriodAlignment;", "Consent", "Calendar", "Unknown", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final class PeriodAlignment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PeriodAlignment[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("consent")
        public static final PeriodAlignment Consent = new PeriodAlignment("Consent", 0);

        @SerialName("calendar")
        public static final PeriodAlignment Calendar = new PeriodAlignment("Calendar", 1);

        @SerialName("unknown")
        public static final PeriodAlignment Unknown = new PeriodAlignment("Unknown", 2);

        /* compiled from: MandateConstraints.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PeriodAlignment.values().length];
                try {
                    iArr[PeriodAlignment.Consent.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PeriodAlignment.Calendar.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PeriodAlignment.Unknown.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ PeriodAlignment[] $values() {
            return new PeriodAlignment[]{Consent, Calendar, Unknown};
        }

        public static EnumEntries<PeriodAlignment> getEntries() {
            return $ENTRIES;
        }

        public static PeriodAlignment valueOf(String str) {
            return (PeriodAlignment) Enum.valueOf(PeriodAlignment.class, str);
        }

        public static PeriodAlignment[] values() {
            return (PeriodAlignment[]) $VALUES.clone();
        }

        /* compiled from: MandateConstraints.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$PeriodAlignment;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) PeriodAlignment.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<PeriodAlignment> serializer() {
                return get$cachedSerializer();
            }
        }

        private PeriodAlignment(String str, int i) {
        }

        static {
            PeriodAlignment[] periodAlignmentArr$values = $values();
            $VALUES = periodAlignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(periodAlignmentArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits.PeriodAlignment.Companion.1
                @Override // kotlin.jvm.functions.Function0
                public final KSerializer<Object> invoke() {
                    return Enums4.createAnnotatedEnumSerializer("com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits.PeriodAlignment", PeriodAlignment.values(), new String[]{"consent", "calendar", "unknown"}, new Annotation[][]{null, null, null}, null);
                }
            });
        }

        public final PeriodicLimits.PeriodAlignment intoDomain() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return PeriodicLimits.PeriodAlignment.Consent;
            }
            if (i == 2) {
                return PeriodicLimits.PeriodAlignment.Calendar;
            }
            if (i == 3) {
                return PeriodicLimits.PeriodAlignment.Unknown;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.PeriodicLimits intoDomain2() {
        Limit limit = this.day;
        PeriodicLimits.Limit limitIntoDomain2 = limit != null ? limit.intoDomain2() : null;
        Limit limit2 = this.week;
        PeriodicLimits.Limit limitIntoDomain22 = limit2 != null ? limit2.intoDomain2() : null;
        Limit limit3 = this.fortnight;
        PeriodicLimits.Limit limitIntoDomain23 = limit3 != null ? limit3.intoDomain2() : null;
        Limit limit4 = this.month;
        PeriodicLimits.Limit limitIntoDomain24 = limit4 != null ? limit4.intoDomain2() : null;
        Limit limit5 = this.halfYear;
        PeriodicLimits.Limit limitIntoDomain25 = limit5 != null ? limit5.intoDomain2() : null;
        Limit limit6 = this.year;
        return new com.truelayer.payments.core.domain.payments.PeriodicLimits(limitIntoDomain2, limitIntoDomain22, limitIntoDomain23, limitIntoDomain24, limitIntoDomain25, limit6 != null ? limit6.intoDomain2() : null);
    }
}
