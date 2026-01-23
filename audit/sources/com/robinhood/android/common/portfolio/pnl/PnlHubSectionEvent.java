package com.robinhood.android.common.portfolio.pnl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PnlHubSectionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionEvent;", "", "<init>", "()V", "ShowNowIncludesCryptoTooltip", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionEvent$ShowNowIncludesCryptoTooltip;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class PnlHubSectionEvent {
    public static final int $stable = 0;

    public /* synthetic */ PnlHubSectionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PnlHubSectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionEvent$ShowNowIncludesCryptoTooltip;", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowNowIncludesCryptoTooltip extends PnlHubSectionEvent {
        public static final int $stable = 0;
        public static final ShowNowIncludesCryptoTooltip INSTANCE = new ShowNowIncludesCryptoTooltip();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowNowIncludesCryptoTooltip);
        }

        public int hashCode() {
            return 968105083;
        }

        public String toString() {
            return "ShowNowIncludesCryptoTooltip";
        }

        private ShowNowIncludesCryptoTooltip() {
            super(null);
        }
    }

    private PnlHubSectionEvent() {
    }
}
