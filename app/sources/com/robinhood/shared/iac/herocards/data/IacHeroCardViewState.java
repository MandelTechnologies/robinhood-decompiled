package com.robinhood.shared.iac.herocards.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IacHeroCardViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/data/IacHeroCardViewState;", "", "<init>", "()V", "Default", "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardViewState$Default;", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class IacHeroCardViewState {
    public static final int $stable = 0;

    public /* synthetic */ IacHeroCardViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: IacHeroCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/data/IacHeroCardViewState$Default;", "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Default extends IacHeroCardViewState {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return -675424718;
        }

        public String toString() {
            return "Default";
        }

        private Default() {
            super(null);
        }
    }

    private IacHeroCardViewState() {
    }
}
