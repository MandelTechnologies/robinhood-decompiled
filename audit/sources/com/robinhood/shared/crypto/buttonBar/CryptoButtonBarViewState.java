package com.robinhood.shared.crypto.buttonBar;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoButtonBarViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState;", "", "buttonBarType", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "<init>", "(Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "getButtonBarType", "()Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonBarType", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoButtonBarViewState {
    public static final int $stable = 8;
    private final AccountSwitcherData accountSwitcherData;
    private final ButtonBarType buttonBarType;

    public static /* synthetic */ CryptoButtonBarViewState copy$default(CryptoButtonBarViewState cryptoButtonBarViewState, ButtonBarType buttonBarType, AccountSwitcherData accountSwitcherData, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonBarType = cryptoButtonBarViewState.buttonBarType;
        }
        if ((i & 2) != 0) {
            accountSwitcherData = cryptoButtonBarViewState.accountSwitcherData;
        }
        return cryptoButtonBarViewState.copy(buttonBarType, accountSwitcherData);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonBarType getButtonBarType() {
        return this.buttonBarType;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    public final CryptoButtonBarViewState copy(ButtonBarType buttonBarType, AccountSwitcherData accountSwitcherData) {
        return new CryptoButtonBarViewState(buttonBarType, accountSwitcherData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoButtonBarViewState)) {
            return false;
        }
        CryptoButtonBarViewState cryptoButtonBarViewState = (CryptoButtonBarViewState) other;
        return Intrinsics.areEqual(this.buttonBarType, cryptoButtonBarViewState.buttonBarType) && Intrinsics.areEqual(this.accountSwitcherData, cryptoButtonBarViewState.accountSwitcherData);
    }

    public int hashCode() {
        ButtonBarType buttonBarType = this.buttonBarType;
        int iHashCode = (buttonBarType == null ? 0 : buttonBarType.hashCode()) * 31;
        AccountSwitcherData accountSwitcherData = this.accountSwitcherData;
        return iHashCode + (accountSwitcherData != null ? accountSwitcherData.hashCode() : 0);
    }

    public String toString() {
        return "CryptoButtonBarViewState(buttonBarType=" + this.buttonBarType + ", accountSwitcherData=" + this.accountSwitcherData + ")";
    }

    public CryptoButtonBarViewState(ButtonBarType buttonBarType, AccountSwitcherData accountSwitcherData) {
        this.buttonBarType = buttonBarType;
        this.accountSwitcherData = accountSwitcherData;
    }

    public final ButtonBarType getButtonBarType() {
        return this.buttonBarType;
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    /* compiled from: CryptoButtonBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "", "<init>", "()V", "Horizontal", "Vertical", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Horizontal;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Vertical;", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ButtonBarType {
        public static final int $stable = 0;

        public /* synthetic */ ButtonBarType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ButtonBarType() {
        }

        /* compiled from: CryptoButtonBarViewState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Horizontal;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", CarResultComposable2.BUTTONS, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclosure", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Horizontal extends ButtonBarType {
            public static final int $stable = 8;
            private final ImmutableList<ExpandableButtonTrayState.ActionButton<GenericAction>> buttons;
            private final UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction> disclosure;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, ImmutableList immutableList, UIComponent uIComponent, int i, Object obj) {
                if ((i & 1) != 0) {
                    immutableList = horizontal.buttons;
                }
                if ((i & 2) != 0) {
                    uIComponent = horizontal.disclosure;
                }
                return horizontal.copy(immutableList, uIComponent);
            }

            public final ImmutableList<ExpandableButtonTrayState.ActionButton<GenericAction>> component1() {
                return this.buttons;
            }

            public final UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction> component2() {
                return this.disclosure;
            }

            public final Horizontal copy(ImmutableList<? extends ExpandableButtonTrayState.ActionButton<GenericAction>> buttons, UIComponent<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction> disclosure) {
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                return new Horizontal(buttons, disclosure);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Horizontal)) {
                    return false;
                }
                Horizontal horizontal = (Horizontal) other;
                return Intrinsics.areEqual(this.buttons, horizontal.buttons) && Intrinsics.areEqual(this.disclosure, horizontal.disclosure);
            }

            public int hashCode() {
                int iHashCode = this.buttons.hashCode() * 31;
                UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction> uIComponent = this.disclosure;
                return iHashCode + (uIComponent == null ? 0 : uIComponent.hashCode());
            }

            public String toString() {
                return "Horizontal(buttons=" + this.buttons + ", disclosure=" + this.disclosure + ")";
            }

            public final ImmutableList<ExpandableButtonTrayState.ActionButton<GenericAction>> getButtons() {
                return this.buttons;
            }

            public final UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction> getDisclosure() {
                return this.disclosure;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Horizontal(ImmutableList<? extends ExpandableButtonTrayState.ActionButton<GenericAction>> buttons, UIComponent<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction> uIComponent) {
                super(null);
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.buttons = buttons;
                this.disclosure = uIComponent;
            }
        }

        /* compiled from: CryptoButtonBarViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Vertical;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "state", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "<init>", "(Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;)V", "getState", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Vertical extends ButtonBarType {
            public static final int $stable = ExpandableButtonTrayState.$stable;
            private final ExpandableButtonTrayState<GenericAction> state;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Vertical copy$default(Vertical vertical, ExpandableButtonTrayState cryptoExpandableButtonTrayComposable6, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoExpandableButtonTrayComposable6 = vertical.state;
                }
                return vertical.copy(cryptoExpandableButtonTrayComposable6);
            }

            public final ExpandableButtonTrayState<GenericAction> component1() {
                return this.state;
            }

            public final Vertical copy(ExpandableButtonTrayState<GenericAction> state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Vertical(state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Vertical) && Intrinsics.areEqual(this.state, ((Vertical) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "Vertical(state=" + this.state + ")";
            }

            public final ExpandableButtonTrayState<GenericAction> getState() {
                return this.state;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Vertical(ExpandableButtonTrayState<GenericAction> state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }
        }
    }
}
