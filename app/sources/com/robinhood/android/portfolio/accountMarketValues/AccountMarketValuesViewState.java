package com.robinhood.android.portfolio.accountMarketValues;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountMarketValuesViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesViewState;", "", "Loading", "Ready", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface AccountMarketValuesViewState {

    /* compiled from: AccountMarketValuesViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesViewState$Loading;", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AccountMarketValuesViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -785358804;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AccountMarketValuesViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesViewState$Ready;", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesViewState;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements AccountMarketValuesViewState {
        public static final int $stable = 8;
        private final UIComponent<GenericAction> content;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, UIComponent uIComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                uIComponent = ready.content;
            }
            return ready.copy(uIComponent);
        }

        public final UIComponent<GenericAction> component1() {
            return this.content;
        }

        public final Ready copy(UIComponent<? extends GenericAction> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Ready(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.areEqual(this.content, ((Ready) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Ready(content=" + this.content + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ready(UIComponent<? extends GenericAction> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final UIComponent<GenericAction> getContent() {
            return this.content;
        }
    }
}
