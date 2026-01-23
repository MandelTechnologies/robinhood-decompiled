package com.robinhood.shared.recurring.p392ui.insights;

import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InvestmentInsightsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "", "Loaded", "Loading", "Error", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState$Error;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState$Loaded;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState$Loading;", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface InvestmentInsightsViewState {

    /* compiled from: InvestmentInsightsViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState$Loaded;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "loggingIdentifier", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "menuButton", "Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse$RecurringInsightsMenuButton;", "isCrypto", "", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse$RecurringInsightsMenuButton;Z)V", "getLoggingIdentifier", "()Ljava/lang/String;", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "getMenuButton", "()Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse$RecurringInsightsMenuButton;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InvestmentInsightsViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> components;
        private final boolean isCrypto;
        private final String loggingIdentifier;
        private final RecurringInsightsPageResponse.RecurringInsightsMenuButton menuButton;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ImmutableList immutableList, RecurringInsightsPageResponse.RecurringInsightsMenuButton recurringInsightsMenuButton, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.loggingIdentifier;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.components;
            }
            if ((i & 4) != 0) {
                recurringInsightsMenuButton = loaded.menuButton;
            }
            if ((i & 8) != 0) {
                z = loaded.isCrypto;
            }
            return loaded.copy(str, immutableList, recurringInsightsMenuButton, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ImmutableList<UIComponent<GenericAction>> component2() {
            return this.components;
        }

        /* renamed from: component3, reason: from getter */
        public final RecurringInsightsPageResponse.RecurringInsightsMenuButton getMenuButton() {
            return this.menuButton;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        public final Loaded copy(String loggingIdentifier, ImmutableList<? extends UIComponent<? extends GenericAction>> components, RecurringInsightsPageResponse.RecurringInsightsMenuButton menuButton, boolean isCrypto) {
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(menuButton, "menuButton");
            return new Loaded(loggingIdentifier, components, menuButton, isCrypto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.loggingIdentifier, loaded.loggingIdentifier) && Intrinsics.areEqual(this.components, loaded.components) && Intrinsics.areEqual(this.menuButton, loaded.menuButton) && this.isCrypto == loaded.isCrypto;
        }

        public int hashCode() {
            return (((((this.loggingIdentifier.hashCode() * 31) + this.components.hashCode()) * 31) + this.menuButton.hashCode()) * 31) + Boolean.hashCode(this.isCrypto);
        }

        public String toString() {
            return "Loaded(loggingIdentifier=" + this.loggingIdentifier + ", components=" + this.components + ", menuButton=" + this.menuButton + ", isCrypto=" + this.isCrypto + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String loggingIdentifier, ImmutableList<? extends UIComponent<? extends GenericAction>> components, RecurringInsightsPageResponse.RecurringInsightsMenuButton menuButton, boolean z) {
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(menuButton, "menuButton");
            this.loggingIdentifier = loggingIdentifier;
            this.components = components;
            this.menuButton = menuButton;
            this.isCrypto = z;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ImmutableList<UIComponent<GenericAction>> getComponents() {
            return this.components;
        }

        public final RecurringInsightsPageResponse.RecurringInsightsMenuButton getMenuButton() {
            return this.menuButton;
        }

        public final boolean isCrypto() {
            return this.isCrypto;
        }
    }

    /* compiled from: InvestmentInsightsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState$Loading;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "<init>", "()V", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements InvestmentInsightsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: InvestmentInsightsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState$Error;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements InvestmentInsightsViewState {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.cause;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Error copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Error(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.cause + ")";
        }

        public Error(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }
}
