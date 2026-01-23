package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailTradeBarViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/Data;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "ServerDriven", "ClientDriven", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data$ClientDriven;", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data$ServerDriven;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.tradebar.Data, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class InstrumentDetailTradeBarViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ InstrumentDetailTradeBarViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getSubtitle();

    public abstract String getTitle();

    private InstrumentDetailTradeBarViewState3() {
    }

    /* compiled from: InstrumentDetailTradeBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/Data$ServerDriven;", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data;", "title", "", "subtitle", "tradeButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/GenericButton;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTradeButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.Data$ServerDriven, reason: from toString */
    public static final /* data */ class ServerDriven extends InstrumentDetailTradeBarViewState3 {
        public static final int $stable = 8;
        private final String subtitle;
        private final String title;
        private final GenericButton tradeButton;

        public static /* synthetic */ ServerDriven copy$default(ServerDriven serverDriven, String str, String str2, GenericButton genericButton, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverDriven.title;
            }
            if ((i & 2) != 0) {
                str2 = serverDriven.subtitle;
            }
            if ((i & 4) != 0) {
                genericButton = serverDriven.tradeButton;
            }
            return serverDriven.copy(str, str2, genericButton);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final GenericButton getTradeButton() {
            return this.tradeButton;
        }

        public final ServerDriven copy(String title, String subtitle, GenericButton tradeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(tradeButton, "tradeButton");
            return new ServerDriven(title, subtitle, tradeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerDriven)) {
                return false;
            }
            ServerDriven serverDriven = (ServerDriven) other;
            return Intrinsics.areEqual(this.title, serverDriven.title) && Intrinsics.areEqual(this.subtitle, serverDriven.subtitle) && Intrinsics.areEqual(this.tradeButton, serverDriven.tradeButton);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.tradeButton.hashCode();
        }

        public String toString() {
            return "ServerDriven(title=" + this.title + ", subtitle=" + this.subtitle + ", tradeButton=" + this.tradeButton + ")";
        }

        @Override // com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarViewState3
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarViewState3
        public String getSubtitle() {
            return this.subtitle;
        }

        public final GenericButton getTradeButton() {
            return this.tradeButton;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerDriven(String title, String subtitle, GenericButton tradeButton) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(tradeButton, "tradeButton");
            this.title = title;
            this.subtitle = subtitle;
            this.tradeButton = tradeButton;
        }
    }

    /* compiled from: InstrumentDetailTradeBarViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/Data$ClientDriven;", "Lcom/robinhood/android/equitydetail/ui/tradebar/Data;", "title", "", "subtitle", "errorMessage", "", "expandActions", "", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getErrorMessage", "()Ljava/lang/CharSequence;", "getExpandActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.Data$ClientDriven, reason: from toString */
    public static final /* data */ class ClientDriven extends InstrumentDetailTradeBarViewState3 {
        public static final int $stable = 8;
        private final CharSequence errorMessage;
        private final List<AbstractTradeBarOverlayView.ExpandAction> expandActions;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClientDriven copy$default(ClientDriven clientDriven, String str, String str2, CharSequence charSequence, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientDriven.title;
            }
            if ((i & 2) != 0) {
                str2 = clientDriven.subtitle;
            }
            if ((i & 4) != 0) {
                charSequence = clientDriven.errorMessage;
            }
            if ((i & 8) != 0) {
                list = clientDriven.expandActions;
            }
            return clientDriven.copy(str, str2, charSequence, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getErrorMessage() {
            return this.errorMessage;
        }

        public final List<AbstractTradeBarOverlayView.ExpandAction> component4() {
            return this.expandActions;
        }

        public final ClientDriven copy(String title, String subtitle, CharSequence errorMessage, List<? extends AbstractTradeBarOverlayView.ExpandAction> expandActions) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(expandActions, "expandActions");
            return new ClientDriven(title, subtitle, errorMessage, expandActions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientDriven)) {
                return false;
            }
            ClientDriven clientDriven = (ClientDriven) other;
            return Intrinsics.areEqual(this.title, clientDriven.title) && Intrinsics.areEqual(this.subtitle, clientDriven.subtitle) && Intrinsics.areEqual(this.errorMessage, clientDriven.errorMessage) && Intrinsics.areEqual(this.expandActions, clientDriven.expandActions);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
            CharSequence charSequence = this.errorMessage;
            return ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.expandActions.hashCode();
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            CharSequence charSequence = this.errorMessage;
            return "ClientDriven(title=" + str + ", subtitle=" + str2 + ", errorMessage=" + ((Object) charSequence) + ", expandActions=" + this.expandActions + ")";
        }

        @Override // com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarViewState3
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarViewState3
        public String getSubtitle() {
            return this.subtitle;
        }

        public final CharSequence getErrorMessage() {
            return this.errorMessage;
        }

        public final List<AbstractTradeBarOverlayView.ExpandAction> getExpandActions() {
            return this.expandActions;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ClientDriven(String title, String subtitle, CharSequence charSequence, List<? extends AbstractTradeBarOverlayView.ExpandAction> expandActions) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(expandActions, "expandActions");
            this.title = title;
            this.subtitle = subtitle;
            this.errorMessage = charSequence;
            this.expandActions = expandActions;
        }
    }
}
