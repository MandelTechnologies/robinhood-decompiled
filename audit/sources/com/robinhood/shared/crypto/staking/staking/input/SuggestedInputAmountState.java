package com.robinhood.shared.crypto.staking.staking.input;

import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SuggestedInputAmountState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState;", "", "type", "Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState$Type;", "pills", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/staking/StakingConfig$SuggestedInputAmount;", "<init>", "(Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState$Type;Lkotlinx/collections/immutable/ImmutableList;)V", "getType", "()Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState$Type;", "getPills", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SuggestedInputAmountState {
    public static final int $stable = 8;
    private final ImmutableList<StakingConfig.SuggestedInputAmount> pills;
    private final Type type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedInputAmountState copy$default(SuggestedInputAmountState suggestedInputAmountState, Type type2, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = suggestedInputAmountState.type;
        }
        if ((i & 2) != 0) {
            immutableList = suggestedInputAmountState.pills;
        }
        return suggestedInputAmountState.copy(type2, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final ImmutableList<StakingConfig.SuggestedInputAmount> component2() {
        return this.pills;
    }

    public final SuggestedInputAmountState copy(Type type2, ImmutableList<StakingConfig.SuggestedInputAmount> pills) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(pills, "pills");
        return new SuggestedInputAmountState(type2, pills);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedInputAmountState)) {
            return false;
        }
        SuggestedInputAmountState suggestedInputAmountState = (SuggestedInputAmountState) other;
        return this.type == suggestedInputAmountState.type && Intrinsics.areEqual(this.pills, suggestedInputAmountState.pills);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.pills.hashCode();
    }

    public String toString() {
        return "SuggestedInputAmountState(type=" + this.type + ", pills=" + this.pills + ")";
    }

    public SuggestedInputAmountState(Type type2, ImmutableList<StakingConfig.SuggestedInputAmount> pills) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(pills, "pills");
        this.type = type2;
        this.pills = pills;
    }

    public final Type getType() {
        return this.type;
    }

    public final ImmutableList<StakingConfig.SuggestedInputAmount> getPills() {
        return this.pills;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuggestedInputAmountState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "FIAT", "PERCENTAGE", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type FIAT = new Type("FIAT", 0);
        public static final Type PERCENTAGE = new Type("PERCENTAGE", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{FIAT, PERCENTAGE};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
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
