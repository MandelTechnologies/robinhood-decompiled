package com.robinhood.android.transfers.withdrawablecash;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: WithdrawableCashState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "", "<init>", "()V", "Default", "Sdui", "Hidden", "LoadingPlaceholder", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$Default;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$Hidden;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$LoadingPlaceholder;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$Sdui;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class WithdrawableCashState {
    public static final int $stable = 0;

    public /* synthetic */ WithdrawableCashState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WithdrawableCashState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$Default;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Default extends WithdrawableCashState {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return 543172656;
        }

        public String toString() {
            return "Default";
        }

        private Default() {
            super(null);
        }
    }

    private WithdrawableCashState() {
    }

    /* compiled from: WithdrawableCashState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$Sdui;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getContent", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sdui extends WithdrawableCashState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> content;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sdui copy$default(Sdui sdui, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = sdui.content;
            }
            return sdui.copy(immutableList);
        }

        public final ImmutableList<UIComponent<GenericAction>> component1() {
            return this.content;
        }

        public final Sdui copy(ImmutableList<? extends UIComponent<? extends GenericAction>> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Sdui(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sdui) && Intrinsics.areEqual(this.content, ((Sdui) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Sdui(content=" + this.content + ")";
        }

        public final ImmutableList<UIComponent<GenericAction>> getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Sdui(ImmutableList<? extends UIComponent<? extends GenericAction>> content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    /* compiled from: WithdrawableCashState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$Hidden;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Hidden extends WithdrawableCashState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return 1382601179;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
            super(null);
        }
    }

    /* compiled from: WithdrawableCashState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState$LoadingPlaceholder;", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadingPlaceholder extends WithdrawableCashState {
        public static final int $stable = 0;
        public static final LoadingPlaceholder INSTANCE = new LoadingPlaceholder();

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadingPlaceholder);
        }

        public int hashCode() {
            return 1901977928;
        }

        public String toString() {
            return "LoadingPlaceholder";
        }

        private LoadingPlaceholder() {
            super(null);
        }
    }
}
