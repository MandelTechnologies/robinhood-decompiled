package com.robinhood.shared.common.earnings;

import com.robinhood.rosetta.eventlogging.EarningsCallContext;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarningsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsCall;", "", "callUrl", "", "callType", "Lcom/robinhood/shared/common/earnings/EarningsCall$Type;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/common/earnings/EarningsCall$Type;)V", "getCallUrl", "()Ljava/lang/String;", "getCallType", "()Lcom/robinhood/shared/common/earnings/EarningsCall$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class EarningsCall {
    public static final int $stable = 0;
    private final Type callType;
    private final String callUrl;

    public static /* synthetic */ EarningsCall copy$default(EarningsCall earningsCall, String str, Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earningsCall.callUrl;
        }
        if ((i & 2) != 0) {
            type2 = earningsCall.callType;
        }
        return earningsCall.copy(str, type2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCallUrl() {
        return this.callUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final Type getCallType() {
        return this.callType;
    }

    public final EarningsCall copy(String callUrl, Type callType) {
        Intrinsics.checkNotNullParameter(callUrl, "callUrl");
        Intrinsics.checkNotNullParameter(callType, "callType");
        return new EarningsCall(callUrl, callType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarningsCall)) {
            return false;
        }
        EarningsCall earningsCall = (EarningsCall) other;
        return Intrinsics.areEqual(this.callUrl, earningsCall.callUrl) && this.callType == earningsCall.callType;
    }

    public int hashCode() {
        return (this.callUrl.hashCode() * 31) + this.callType.hashCode();
    }

    public String toString() {
        return "EarningsCall(callUrl=" + this.callUrl + ", callType=" + this.callType + ")";
    }

    public EarningsCall(String callUrl, Type callType) {
        Intrinsics.checkNotNullParameter(callUrl, "callUrl");
        Intrinsics.checkNotNullParameter(callType, "callType");
        this.callUrl = callUrl;
        this.callType = callType;
    }

    public final String getCallUrl() {
        return this.callUrl;
    }

    public final Type getCallType() {
        return this.callType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EarningsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsCall$Type;", "", "stringRes", "", "analyticsCallType", "Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "<init>", "(Ljava/lang/String;IILcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;)V", "getStringRes", "()I", "getAnalyticsCallType", "()Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "PREVIEW", "JOIN", "REPLAY", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final EarningsCallContext.CallType analyticsCallType;
        private final int stringRes;
        public static final Type PREVIEW = new Type("PREVIEW", 0, C37450R.string.instrument_detail_earnings_preview, EarningsCallContext.CallType.PREVIEW);
        public static final Type JOIN = new Type("JOIN", 1, C37450R.string.instrument_detail_earnings_listen, EarningsCallContext.CallType.JOIN_LIVE);
        public static final Type REPLAY = new Type("REPLAY", 2, C37450R.string.instrument_detail_earnings_replay, EarningsCallContext.CallType.REPLAY);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PREVIEW, JOIN, REPLAY};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2, EarningsCallContext.CallType callType) {
            this.stringRes = i2;
            this.analyticsCallType = callType;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public final EarningsCallContext.CallType getAnalyticsCallType() {
            return this.analyticsCallType;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
