package com.robinhood.shared.crypto.transfer.unified;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Uuids;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferUnifiedViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010%\u001a\u00020\rHÂ\u0003JK\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u001fHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState;", "", "activeScreen", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "useSavedAddressesFlow", "", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "sendState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "source", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZLcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;)V", "getActiveScreen", "()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getUseSavedAddressesFlow", "()Z", "isOnSendScreen", "topBarState", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$TopBarState;", "getTopBarState", "()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$TopBarState;", "showActionToggle", "getShowActionToggle", "mutateWithPageIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "TopBarState", "Screen", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferUnifiedViewState {
    public static final int $stable = 8;
    private final Screen activeScreen;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final ApiCryptoTransferConfig.TransferStates.SendState sendState;
    private final CryptoTransferIntentKey.Source source;
    private final UiCurrencyPair uiCurrencyPair;
    private final boolean useSavedAddressesFlow;

    /* renamed from: component4, reason: from getter */
    private final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    /* renamed from: component5, reason: from getter */
    private final ApiCryptoTransferConfig.TransferStates.SendState getSendState() {
        return this.sendState;
    }

    /* renamed from: component6, reason: from getter */
    private final CryptoTransferIntentKey.Source getSource() {
        return this.source;
    }

    public static /* synthetic */ CryptoTransferUnifiedViewState copy$default(CryptoTransferUnifiedViewState cryptoTransferUnifiedViewState, Screen screen, UiCurrencyPair uiCurrencyPair, boolean z, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferConfig.TransferStates.SendState sendState, CryptoTransferIntentKey.Source source, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = cryptoTransferUnifiedViewState.activeScreen;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoTransferUnifiedViewState.uiCurrencyPair;
        }
        if ((i & 4) != 0) {
            z = cryptoTransferUnifiedViewState.useSavedAddressesFlow;
        }
        if ((i & 8) != 0) {
            cryptoTransferConfig = cryptoTransferUnifiedViewState.cryptoTransferConfig;
        }
        if ((i & 16) != 0) {
            sendState = cryptoTransferUnifiedViewState.sendState;
        }
        if ((i & 32) != 0) {
            source = cryptoTransferUnifiedViewState.source;
        }
        ApiCryptoTransferConfig.TransferStates.SendState sendState2 = sendState;
        CryptoTransferIntentKey.Source source2 = source;
        return cryptoTransferUnifiedViewState.copy(screen, uiCurrencyPair, z, cryptoTransferConfig, sendState2, source2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen getActiveScreen() {
        return this.activeScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseSavedAddressesFlow() {
        return this.useSavedAddressesFlow;
    }

    public final CryptoTransferUnifiedViewState copy(Screen activeScreen, UiCurrencyPair uiCurrencyPair, boolean useSavedAddressesFlow, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferConfig.TransferStates.SendState sendState, CryptoTransferIntentKey.Source source) {
        Intrinsics.checkNotNullParameter(activeScreen, "activeScreen");
        Intrinsics.checkNotNullParameter(source, "source");
        return new CryptoTransferUnifiedViewState(activeScreen, uiCurrencyPair, useSavedAddressesFlow, cryptoTransferConfig, sendState, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferUnifiedViewState)) {
            return false;
        }
        CryptoTransferUnifiedViewState cryptoTransferUnifiedViewState = (CryptoTransferUnifiedViewState) other;
        return this.activeScreen == cryptoTransferUnifiedViewState.activeScreen && Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferUnifiedViewState.uiCurrencyPair) && this.useSavedAddressesFlow == cryptoTransferUnifiedViewState.useSavedAddressesFlow && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoTransferUnifiedViewState.cryptoTransferConfig) && this.sendState == cryptoTransferUnifiedViewState.sendState && Intrinsics.areEqual(this.source, cryptoTransferUnifiedViewState.source);
    }

    public int hashCode() {
        int iHashCode = this.activeScreen.hashCode() * 31;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode2 = (((iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31) + Boolean.hashCode(this.useSavedAddressesFlow)) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        int iHashCode3 = (iHashCode2 + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
        ApiCryptoTransferConfig.TransferStates.SendState sendState = this.sendState;
        return ((iHashCode3 + (sendState != null ? sendState.hashCode() : 0)) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "CryptoTransferUnifiedViewState(activeScreen=" + this.activeScreen + ", uiCurrencyPair=" + this.uiCurrencyPair + ", useSavedAddressesFlow=" + this.useSavedAddressesFlow + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ", sendState=" + this.sendState + ", source=" + this.source + ")";
    }

    public CryptoTransferUnifiedViewState(Screen activeScreen, UiCurrencyPair uiCurrencyPair, boolean z, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferConfig.TransferStates.SendState sendState, CryptoTransferIntentKey.Source source) {
        Intrinsics.checkNotNullParameter(activeScreen, "activeScreen");
        Intrinsics.checkNotNullParameter(source, "source");
        this.activeScreen = activeScreen;
        this.uiCurrencyPair = uiCurrencyPair;
        this.useSavedAddressesFlow = z;
        this.cryptoTransferConfig = cryptoTransferConfig;
        this.sendState = sendState;
        this.source = source;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CryptoTransferUnifiedViewState(Screen screen, UiCurrencyPair uiCurrencyPair, boolean z, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferConfig.TransferStates.SendState sendState, CryptoTransferIntentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CryptoTransferIntentKey.Source source2;
        ApiCryptoTransferConfig.TransferStates.SendState sendState2;
        uiCurrencyPair = (i & 2) != 0 ? null : uiCurrencyPair;
        cryptoTransferConfig = (i & 8) != 0 ? null : cryptoTransferConfig;
        if ((i & 16) != 0) {
            source2 = source;
            sendState2 = null;
        } else {
            source2 = source;
            sendState2 = sendState;
        }
        this(screen, uiCurrencyPair, z, cryptoTransferConfig, sendState2, source2);
    }

    public final Screen getActiveScreen() {
        return this.activeScreen;
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final boolean getUseSavedAddressesFlow() {
        return this.useSavedAddressesFlow;
    }

    public final boolean isOnSendScreen() {
        return this.activeScreen == Screen.SEND;
    }

    public final TopBarState getTopBarState() {
        if (this.uiCurrencyPair == null || this.cryptoTransferConfig == null) {
            return null;
        }
        return new TopBarState(this.useSavedAddressesFlow, isOnSendScreen(), this.sendState, this.uiCurrencyPair, this.cryptoTransferConfig);
    }

    public final boolean getShowActionToggle() {
        CryptoTransferIntentKey.Source source = this.source;
        if (Intrinsics.areEqual(source, CryptoTransferIntentKey.Source.Default.INSTANCE) || (source instanceof CryptoTransferIntentKey.Source.Gateway)) {
            return true;
        }
        if (Intrinsics.areEqual(source, CryptoTransferIntentKey.Source.CryptoFeesDepositIncentive.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CryptoTransferUnifiedViewState mutateWithPageIndex(int index) {
        return copy$default(this, Screen.INSTANCE.screenFromIndex$feature_crypto_transfer_externalDebug(index), null, false, null, null, null, 62, null);
    }

    /* compiled from: CryptoTransferUnifiedViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J=\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u001eHÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u000eR\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u000e¨\u0006<"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$TopBarState;", "", "useSavedAddressesFlow", "", "isOnSendScreen", "sendState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "<init>", "(ZZLcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;)V", "getUseSavedAddressesFlow", "()Z", "getSendState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoTransferConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "currencyId", "Ljava/util/UUID;", "loggingReceiveScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingReceiveScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingSendScreen", "getLoggingSendScreen", "maxAddressLength", "", "getMaxAddressLength", "()I", "addressTagConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "getAddressTagConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "submitWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getSubmitWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "shouldShowProgressBar", "getShouldShowProgressBar", "shouldAlwaysShowBackButton", "getShouldAlwaysShowBackButton", "shouldShowEnterManuallyButton", "getShouldShowEnterManuallyButton", "shouldShowToggle", "getShouldShowToggle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopBarState {
        public static final int $stable = 8;
        private final CryptoTransferConfig cryptoTransferConfig;
        private final UUID currencyId;
        private final boolean isOnSendScreen;
        private final com.robinhood.rosetta.eventlogging.Screen loggingReceiveScreen;
        private final com.robinhood.rosetta.eventlogging.Screen loggingSendScreen;
        private final ApiCryptoTransferConfig.TransferStates.SendState sendState;
        private final UiCurrencyPair uiCurrencyPair;
        private final boolean useSavedAddressesFlow;

        public static /* synthetic */ TopBarState copy$default(TopBarState topBarState, boolean z, boolean z2, ApiCryptoTransferConfig.TransferStates.SendState sendState, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                z = topBarState.useSavedAddressesFlow;
            }
            if ((i & 2) != 0) {
                z2 = topBarState.isOnSendScreen;
            }
            if ((i & 4) != 0) {
                sendState = topBarState.sendState;
            }
            if ((i & 8) != 0) {
                uiCurrencyPair = topBarState.uiCurrencyPair;
            }
            if ((i & 16) != 0) {
                cryptoTransferConfig = topBarState.cryptoTransferConfig;
            }
            CryptoTransferConfig cryptoTransferConfig2 = cryptoTransferConfig;
            ApiCryptoTransferConfig.TransferStates.SendState sendState2 = sendState;
            return topBarState.copy(z, z2, sendState2, uiCurrencyPair, cryptoTransferConfig2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseSavedAddressesFlow() {
            return this.useSavedAddressesFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsOnSendScreen() {
            return this.isOnSendScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiCryptoTransferConfig.TransferStates.SendState getSendState() {
            return this.sendState;
        }

        /* renamed from: component4, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoTransferConfig getCryptoTransferConfig() {
            return this.cryptoTransferConfig;
        }

        public final TopBarState copy(boolean useSavedAddressesFlow, boolean isOnSendScreen, ApiCryptoTransferConfig.TransferStates.SendState sendState, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(cryptoTransferConfig, "cryptoTransferConfig");
            return new TopBarState(useSavedAddressesFlow, isOnSendScreen, sendState, uiCurrencyPair, cryptoTransferConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopBarState)) {
                return false;
            }
            TopBarState topBarState = (TopBarState) other;
            return this.useSavedAddressesFlow == topBarState.useSavedAddressesFlow && this.isOnSendScreen == topBarState.isOnSendScreen && this.sendState == topBarState.sendState && Intrinsics.areEqual(this.uiCurrencyPair, topBarState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoTransferConfig, topBarState.cryptoTransferConfig);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.useSavedAddressesFlow) * 31) + Boolean.hashCode(this.isOnSendScreen)) * 31;
            ApiCryptoTransferConfig.TransferStates.SendState sendState = this.sendState;
            return ((((iHashCode + (sendState == null ? 0 : sendState.hashCode())) * 31) + this.uiCurrencyPair.hashCode()) * 31) + this.cryptoTransferConfig.hashCode();
        }

        public String toString() {
            return "TopBarState(useSavedAddressesFlow=" + this.useSavedAddressesFlow + ", isOnSendScreen=" + this.isOnSendScreen + ", sendState=" + this.sendState + ", uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ")";
        }

        public TopBarState(boolean z, boolean z2, ApiCryptoTransferConfig.TransferStates.SendState sendState, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(cryptoTransferConfig, "cryptoTransferConfig");
            this.useSavedAddressesFlow = z;
            this.isOnSendScreen = z2;
            this.sendState = sendState;
            this.uiCurrencyPair = uiCurrencyPair;
            this.cryptoTransferConfig = cryptoTransferConfig;
            UUID assetCurrencyId = uiCurrencyPair.getAssetCurrencyId();
            this.currencyId = assetCurrencyId;
            this.loggingReceiveScreen = new com.robinhood.rosetta.eventlogging.Screen(Screen.Name.CRYPTO_TRANSFER_RECEIVE, null, Uuids.toStringOrEmpty(assetCurrencyId), null, 10, null);
            this.loggingSendScreen = new com.robinhood.rosetta.eventlogging.Screen(Screen.Name.CRYPTO_TRANSFER_SEND_QR_SCANNER, null, Uuids.toStringOrEmpty(assetCurrencyId), null, 10, null);
        }

        public final boolean getUseSavedAddressesFlow() {
            return this.useSavedAddressesFlow;
        }

        public final boolean isOnSendScreen() {
            return this.isOnSendScreen;
        }

        public final ApiCryptoTransferConfig.TransferStates.SendState getSendState() {
            return this.sendState;
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final CryptoTransferConfig getCryptoTransferConfig() {
            return this.cryptoTransferConfig;
        }

        public final com.robinhood.rosetta.eventlogging.Screen getLoggingReceiveScreen() {
            return this.loggingReceiveScreen;
        }

        public final com.robinhood.rosetta.eventlogging.Screen getLoggingSendScreen() {
            return this.loggingSendScreen;
        }

        public final int getMaxAddressLength() {
            return this.cryptoTransferConfig.getMaxAddressLength();
        }

        public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
            return this.cryptoTransferConfig.getAddressTag();
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            CryptoTransferConfig.TransferWarnings.Stage send;
            CryptoTransferConfig.TransferWarnings transferWarnings = this.cryptoTransferConfig.getTransferWarnings();
            if (transferWarnings == null || (send = transferWarnings.getSend()) == null) {
                return null;
            }
            return send.getFinal();
        }

        public final boolean getShouldShowProgressBar() {
            return this.useSavedAddressesFlow && this.isOnSendScreen && this.sendState == ApiCryptoTransferConfig.TransferStates.SendState.SEND;
        }

        public final boolean getShouldAlwaysShowBackButton() {
            return this.useSavedAddressesFlow && this.isOnSendScreen && this.sendState == ApiCryptoTransferConfig.TransferStates.SendState.SEND;
        }

        public final boolean getShouldShowEnterManuallyButton() {
            return this.useSavedAddressesFlow && this.isOnSendScreen && this.sendState == ApiCryptoTransferConfig.TransferStates.SendState.SEND;
        }

        public final boolean getShouldShowToggle() {
            return !this.useSavedAddressesFlow;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransferUnifiedViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Ljava/lang/String;II)V", "getIndex", "()I", "RECEIVE", "SEND", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Screen {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Screen RECEIVE = new Screen("RECEIVE", 0, 0);
        public static final Screen SEND = new Screen("SEND", 1, 1);
        private final int index;

        private static final /* synthetic */ Screen[] $values() {
            return new Screen[]{RECEIVE, SEND};
        }

        public static EnumEntries<Screen> getEntries() {
            return $ENTRIES;
        }

        private Screen(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            return this.index;
        }

        static {
            Screen[] screenArr$values = $values();
            $VALUES = screenArr$values;
            $ENTRIES = EnumEntries2.enumEntries(screenArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: CryptoTransferUnifiedViewState.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen$Companion;", "", "<init>", "()V", "screenFromIndex", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState$Screen;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "screenFromIndex$feature_crypto_transfer_externalDebug", "screenFromAction", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "screenFromAction$feature_crypto_transfer_externalDebug", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {

            /* compiled from: CryptoTransferUnifiedViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoTransferAction.values().length];
                    try {
                        iArr[CryptoTransferAction.SEARCH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoTransferAction.ENROLL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoTransferAction.SAVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoTransferAction.SEND.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CryptoTransferAction.RECEIVE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Screen screenFromIndex$feature_crypto_transfer_externalDebug(int index) {
                for (Screen screen : Screen.getEntries()) {
                    if (screen.getIndex() == index) {
                        return screen;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            public final Screen screenFromAction$feature_crypto_transfer_externalDebug(CryptoTransferAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(action);
                    throw new ExceptionsH();
                }
                if (i == 4) {
                    return Screen.SEND;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return Screen.RECEIVE;
            }
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }
}
