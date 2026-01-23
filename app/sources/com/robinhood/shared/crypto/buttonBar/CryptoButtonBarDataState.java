package com.robinhood.shared.crypto.buttonBar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualButtons;
import com.robinhood.models.api.ApiCryptoTradeButtonsDisplayType;
import com.robinhood.models.crypto.p314db.CryptoAccountInfo;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherViewModel;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.models.crypto.p314db.CryptoNonCurrencyPairAccountSwitcher;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.crypto.p314db.Cryptobility2;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ButtonState;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarViewState;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.shared.crypto.utils.CryptoCurrencyPairAccountSwitchers;
import com.robinhood.shared.crypto.utils.CryptoNonCurrencyPairAccountSwitchers;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.resource.StringResource;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ButtonStateDto;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: CryptoButtonBarDataState.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010`\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\baJ\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\beJ\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÀ\u0003¢\u0006\u0002\bgJ\u000e\u0010h\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\biJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u0004\u0018\u00010\u0012HÀ\u0003¢\u0006\u0002\bmJ\u0010\u0010n\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0002\boJ\u0010\u0010p\u001a\u0004\u0018\u00010\u0015HÀ\u0003¢\u0006\u0002\bqJ\u0081\u0001\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010s\u001a\u00020\u000e2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0014\u0010,\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u0004\u0018\u00010:*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u0004\u0018\u00010-*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u00100\u001a\u0004\u0018\u00010-*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010@R \u00100\u001a\u0004\u0018\u000101*\u00020\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\bC\u0010DR*\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0\u000b*\u00020\u00058@X\u0081\u0004¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0L0\u000b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010MR*\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0N0\u000b*\u00020\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\bH\u0010B\u001a\u0004\bJ\u0010OR&\u0010P\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010Q*\u00020\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\bS\u0010B\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020W8@X\u0081\u0004¢\u0006\f\u0012\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0013\u0010\\\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006x"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;", "", "args", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "cryptobility", "Lcom/robinhood/models/crypto/db/Cryptobility;", "perpetualButtons", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;", "homeButtons", "Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;", "loadingButtonLabels", "Lkotlinx/collections/immutable/ImmutableList;", "", "isMibExperimentEnabled", "", "currencyPairAccountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "nonCurrencyPairAccountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;", "selectedRhsAccountNumber", "selectedAccountInfo", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "<init>", "(Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;Lcom/robinhood/models/crypto/db/Cryptobility;Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;Ljava/lang/String;Lcom/robinhood/models/crypto/db/CryptoAccountInfo;)V", "getArgs$lib_crypto_button_bar_externalDebug", "()Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "getHomeButtons$lib_crypto_button_bar_externalDebug", "()Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;", "getLoadingButtonLabels$lib_crypto_button_bar_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "isMibExperimentEnabled$lib_crypto_button_bar_externalDebug", "()Z", "getCurrencyPairAccountSwitcher$lib_crypto_button_bar_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "getNonCurrencyPairAccountSwitcher$lib_crypto_button_bar_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;", "getSelectedRhsAccountNumber$lib_crypto_button_bar_externalDebug", "()Ljava/lang/String;", "getSelectedAccountInfo$lib_crypto_button_bar_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "cryptobilityLoading", "getCryptobilityLoading", "homeButtonsLoading", "getHomeButtonsLoading", "placeholderLoadingButton", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Vertical;", "getPlaceholderLoadingButton", "()Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Vertical;", "buttonBarType", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "getButtonBarType", "()Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "showAccountSelector", "prefixAccountSelector", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState$BottomSheetSelector;", "getPrefixAccountSelector", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState$BottomSheetSelector;", "horizontalButtonBarType", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Horizontal;", "getHorizontalButtonBarType", "(Lcom/robinhood/models/crypto/db/Cryptobility;)Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Horizontal;", "verticalButtonBarType", "getVerticalButtonBarType", "(Lcom/robinhood/models/crypto/db/Cryptobility;)Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Vertical;", "(Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;)Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Vertical;", "getButtonBarType$lib_crypto_button_bar_externalDebug$annotations", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;)V", "getButtonBarType$lib_crypto_button_bar_externalDebug", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;)Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType;", "actionButtons", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "getActionButtons$lib_crypto_button_bar_externalDebug$annotations", "(Lcom/robinhood/models/crypto/db/Cryptobility;)V", "getActionButtons$lib_crypto_button_bar_externalDebug", "(Lcom/robinhood/models/crypto/db/Cryptobility;)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$SduiButton;", "(Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton$IdlButton;", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;)Lkotlinx/collections/immutable/ImmutableList;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getDisclosure$lib_crypto_button_bar_externalDebug$annotations", "getDisclosure$lib_crypto_button_bar_externalDebug", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;)Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen$lib_crypto_button_bar_externalDebug$annotations", "()V", "getEventScreen$lib_crypto_button_bar_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component1$lib_crypto_button_bar_externalDebug", "component2", "component3", "component4", "component4$lib_crypto_button_bar_externalDebug", "component5", "component5$lib_crypto_button_bar_externalDebug", "component6", "component6$lib_crypto_button_bar_externalDebug", "component7", "component7$lib_crypto_button_bar_externalDebug", "component8", "component8$lib_crypto_button_bar_externalDebug", "component9", "component9$lib_crypto_button_bar_externalDebug", "component10", "component10$lib_crypto_button_bar_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoButtonBarDataState {
    public static final int $stable = 8;
    private final CryptoButtonBarArgs args;
    private final Cryptobility cryptobility;
    private final CryptoCurrencyPairAccountSwitcher currencyPairAccountSwitcher;
    private final CryptoHomeCtaButtons homeButtons;
    private final boolean isMibExperimentEnabled;
    private final ImmutableList<String> loadingButtonLabels;
    private final CryptoNonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher;
    private final PerpetualButtons perpetualButtons;
    private final CryptoAccountInfo selectedAccountInfo;
    private final String selectedRhsAccountNumber;
    private final boolean showAccountSelector;

    /* compiled from: CryptoButtonBarDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCryptoTradeButtonsDisplayType.values().length];
            try {
                iArr[ApiCryptoTradeButtonsDisplayType.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTradeButtonsDisplayType.TRADE_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GenericButtonType.values().length];
            try {
                iArr2[GenericButtonType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GenericButtonType.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GenericButtonType.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GenericButtonType.TERTIARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component2, reason: from getter */
    private final Cryptobility getCryptobility() {
        return this.cryptobility;
    }

    /* renamed from: component3, reason: from getter */
    private final PerpetualButtons getPerpetualButtons() {
        return this.perpetualButtons;
    }

    public static /* synthetic */ CryptoButtonBarDataState copy$default(CryptoButtonBarDataState cryptoButtonBarDataState, CryptoButtonBarArgs cryptoButtonBarArgs, Cryptobility cryptobility, PerpetualButtons perpetualButtons, CryptoHomeCtaButtons cryptoHomeCtaButtons, ImmutableList immutableList, boolean z, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher, String str, CryptoAccountInfo cryptoAccountInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoButtonBarArgs = cryptoButtonBarDataState.args;
        }
        if ((i & 2) != 0) {
            cryptobility = cryptoButtonBarDataState.cryptobility;
        }
        if ((i & 4) != 0) {
            perpetualButtons = cryptoButtonBarDataState.perpetualButtons;
        }
        if ((i & 8) != 0) {
            cryptoHomeCtaButtons = cryptoButtonBarDataState.homeButtons;
        }
        if ((i & 16) != 0) {
            immutableList = cryptoButtonBarDataState.loadingButtonLabels;
        }
        if ((i & 32) != 0) {
            z = cryptoButtonBarDataState.isMibExperimentEnabled;
        }
        if ((i & 64) != 0) {
            cryptoCurrencyPairAccountSwitcher = cryptoButtonBarDataState.currencyPairAccountSwitcher;
        }
        if ((i & 128) != 0) {
            cryptoNonCurrencyPairAccountSwitcher = cryptoButtonBarDataState.nonCurrencyPairAccountSwitcher;
        }
        if ((i & 256) != 0) {
            str = cryptoButtonBarDataState.selectedRhsAccountNumber;
        }
        if ((i & 512) != 0) {
            cryptoAccountInfo = cryptoButtonBarDataState.selectedAccountInfo;
        }
        String str2 = str;
        CryptoAccountInfo cryptoAccountInfo2 = cryptoAccountInfo;
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher2 = cryptoCurrencyPairAccountSwitcher;
        CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher2 = cryptoNonCurrencyPairAccountSwitcher;
        ImmutableList immutableList2 = immutableList;
        boolean z2 = z;
        return cryptoButtonBarDataState.copy(cryptoButtonBarArgs, cryptobility, perpetualButtons, cryptoHomeCtaButtons, immutableList2, z2, cryptoCurrencyPairAccountSwitcher2, cryptoNonCurrencyPairAccountSwitcher2, str2, cryptoAccountInfo2);
    }

    public static /* synthetic */ void getActionButtons$lib_crypto_button_bar_externalDebug$annotations(PerpetualButtons perpetualButtons) {
    }

    public static /* synthetic */ void getActionButtons$lib_crypto_button_bar_externalDebug$annotations(Cryptobility cryptobility) {
    }

    public static /* synthetic */ void getButtonBarType$lib_crypto_button_bar_externalDebug$annotations(PerpetualButtons perpetualButtons) {
    }

    public static /* synthetic */ void getDisclosure$lib_crypto_button_bar_externalDebug$annotations(PerpetualButtons perpetualButtons) {
    }

    public static /* synthetic */ void getEventScreen$lib_crypto_button_bar_externalDebug$annotations() {
    }

    /* renamed from: component1$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final CryptoButtonBarArgs getArgs() {
        return this.args;
    }

    /* renamed from: component10$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final CryptoAccountInfo getSelectedAccountInfo() {
        return this.selectedAccountInfo;
    }

    /* renamed from: component4$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final CryptoHomeCtaButtons getHomeButtons() {
        return this.homeButtons;
    }

    public final ImmutableList<String> component5$lib_crypto_button_bar_externalDebug() {
        return this.loadingButtonLabels;
    }

    /* renamed from: component6$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final boolean getIsMibExperimentEnabled() {
        return this.isMibExperimentEnabled;
    }

    /* renamed from: component7$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final CryptoCurrencyPairAccountSwitcher getCurrencyPairAccountSwitcher() {
        return this.currencyPairAccountSwitcher;
    }

    /* renamed from: component8$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final CryptoNonCurrencyPairAccountSwitcher getNonCurrencyPairAccountSwitcher() {
        return this.nonCurrencyPairAccountSwitcher;
    }

    /* renamed from: component9$lib_crypto_button_bar_externalDebug, reason: from getter */
    public final String getSelectedRhsAccountNumber() {
        return this.selectedRhsAccountNumber;
    }

    public final CryptoButtonBarDataState copy(CryptoButtonBarArgs args, Cryptobility cryptobility, PerpetualButtons perpetualButtons, CryptoHomeCtaButtons homeButtons, ImmutableList<String> loadingButtonLabels, boolean isMibExperimentEnabled, CryptoCurrencyPairAccountSwitcher currencyPairAccountSwitcher, CryptoNonCurrencyPairAccountSwitcher nonCurrencyPairAccountSwitcher, String selectedRhsAccountNumber, CryptoAccountInfo selectedAccountInfo) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(loadingButtonLabels, "loadingButtonLabels");
        return new CryptoButtonBarDataState(args, cryptobility, perpetualButtons, homeButtons, loadingButtonLabels, isMibExperimentEnabled, currencyPairAccountSwitcher, nonCurrencyPairAccountSwitcher, selectedRhsAccountNumber, selectedAccountInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoButtonBarDataState)) {
            return false;
        }
        CryptoButtonBarDataState cryptoButtonBarDataState = (CryptoButtonBarDataState) other;
        return Intrinsics.areEqual(this.args, cryptoButtonBarDataState.args) && Intrinsics.areEqual(this.cryptobility, cryptoButtonBarDataState.cryptobility) && Intrinsics.areEqual(this.perpetualButtons, cryptoButtonBarDataState.perpetualButtons) && Intrinsics.areEqual(this.homeButtons, cryptoButtonBarDataState.homeButtons) && Intrinsics.areEqual(this.loadingButtonLabels, cryptoButtonBarDataState.loadingButtonLabels) && this.isMibExperimentEnabled == cryptoButtonBarDataState.isMibExperimentEnabled && Intrinsics.areEqual(this.currencyPairAccountSwitcher, cryptoButtonBarDataState.currencyPairAccountSwitcher) && Intrinsics.areEqual(this.nonCurrencyPairAccountSwitcher, cryptoButtonBarDataState.nonCurrencyPairAccountSwitcher) && Intrinsics.areEqual(this.selectedRhsAccountNumber, cryptoButtonBarDataState.selectedRhsAccountNumber) && Intrinsics.areEqual(this.selectedAccountInfo, cryptoButtonBarDataState.selectedAccountInfo);
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        Cryptobility cryptobility = this.cryptobility;
        int iHashCode2 = (iHashCode + (cryptobility == null ? 0 : cryptobility.hashCode())) * 31;
        PerpetualButtons perpetualButtons = this.perpetualButtons;
        int iHashCode3 = (iHashCode2 + (perpetualButtons == null ? 0 : perpetualButtons.hashCode())) * 31;
        CryptoHomeCtaButtons cryptoHomeCtaButtons = this.homeButtons;
        int iHashCode4 = (((((iHashCode3 + (cryptoHomeCtaButtons == null ? 0 : cryptoHomeCtaButtons.hashCode())) * 31) + this.loadingButtonLabels.hashCode()) * 31) + Boolean.hashCode(this.isMibExperimentEnabled)) * 31;
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.currencyPairAccountSwitcher;
        int iHashCode5 = (iHashCode4 + (cryptoCurrencyPairAccountSwitcher == null ? 0 : cryptoCurrencyPairAccountSwitcher.hashCode())) * 31;
        CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher = this.nonCurrencyPairAccountSwitcher;
        int iHashCode6 = (iHashCode5 + (cryptoNonCurrencyPairAccountSwitcher == null ? 0 : cryptoNonCurrencyPairAccountSwitcher.hashCode())) * 31;
        String str = this.selectedRhsAccountNumber;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        CryptoAccountInfo cryptoAccountInfo = this.selectedAccountInfo;
        return iHashCode7 + (cryptoAccountInfo != null ? cryptoAccountInfo.hashCode() : 0);
    }

    public String toString() {
        return "CryptoButtonBarDataState(args=" + this.args + ", cryptobility=" + this.cryptobility + ", perpetualButtons=" + this.perpetualButtons + ", homeButtons=" + this.homeButtons + ", loadingButtonLabels=" + this.loadingButtonLabels + ", isMibExperimentEnabled=" + this.isMibExperimentEnabled + ", currencyPairAccountSwitcher=" + this.currencyPairAccountSwitcher + ", nonCurrencyPairAccountSwitcher=" + this.nonCurrencyPairAccountSwitcher + ", selectedRhsAccountNumber=" + this.selectedRhsAccountNumber + ", selectedAccountInfo=" + this.selectedAccountInfo + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CryptoButtonBarDataState(CryptoButtonBarArgs args, Cryptobility cryptobility, PerpetualButtons perpetualButtons, CryptoHomeCtaButtons cryptoHomeCtaButtons, ImmutableList<String> loadingButtonLabels, boolean z, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher, String str, CryptoAccountInfo cryptoAccountInfo) {
        CryptoAccountSwitcherViewModel home;
        List<CryptoAccountSwitcherAccount> accounts2;
        CryptoAccountSwitcherViewModel tradeBar;
        List<CryptoAccountSwitcherAccount> accounts3;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(loadingButtonLabels, "loadingButtonLabels");
        this.args = args;
        this.cryptobility = cryptobility;
        this.perpetualButtons = perpetualButtons;
        this.homeButtons = cryptoHomeCtaButtons;
        this.loadingButtonLabels = loadingButtonLabels;
        this.isMibExperimentEnabled = z;
        this.currencyPairAccountSwitcher = cryptoCurrencyPairAccountSwitcher;
        this.nonCurrencyPairAccountSwitcher = cryptoNonCurrencyPairAccountSwitcher;
        this.selectedRhsAccountNumber = str;
        this.selectedAccountInfo = cryptoAccountInfo;
        boolean z2 = false;
        if (z) {
            if (((cryptoCurrencyPairAccountSwitcher == null || (tradeBar = cryptoCurrencyPairAccountSwitcher.getTradeBar()) == null || (accounts3 = tradeBar.getAccounts()) == null) ? 0 : accounts3.size()) > 1) {
                z2 = true;
            } else {
                if (((cryptoNonCurrencyPairAccountSwitcher == null || (home = cryptoNonCurrencyPairAccountSwitcher.getHome()) == null || (accounts2 = home.getAccounts()) == null) ? 0 : accounts2.size()) > 1) {
                }
            }
        }
        this.showAccountSelector = z2;
    }

    public final CryptoButtonBarArgs getArgs$lib_crypto_button_bar_externalDebug() {
        return this.args;
    }

    public final CryptoHomeCtaButtons getHomeButtons$lib_crypto_button_bar_externalDebug() {
        return this.homeButtons;
    }

    public /* synthetic */ CryptoButtonBarDataState(CryptoButtonBarArgs cryptoButtonBarArgs, Cryptobility cryptobility, PerpetualButtons perpetualButtons, CryptoHomeCtaButtons cryptoHomeCtaButtons, ImmutableList immutableList, boolean z, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher, String str, CryptoAccountInfo cryptoAccountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoButtonBarArgs, (i & 2) != 0 ? null : cryptobility, (i & 4) != 0 ? null : perpetualButtons, (i & 8) != 0 ? null : cryptoHomeCtaButtons, (i & 16) != 0 ? extensions2.persistentListOf() : immutableList, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : cryptoCurrencyPairAccountSwitcher, (i & 128) != 0 ? null : cryptoNonCurrencyPairAccountSwitcher, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : cryptoAccountInfo);
    }

    public final ImmutableList<String> getLoadingButtonLabels$lib_crypto_button_bar_externalDebug() {
        return this.loadingButtonLabels;
    }

    public final boolean isMibExperimentEnabled$lib_crypto_button_bar_externalDebug() {
        return this.isMibExperimentEnabled;
    }

    /* renamed from: getCurrencyPairAccountSwitcher$lib_crypto_button_bar_externalDebug */
    public final CryptoCurrencyPairAccountSwitcher m2769xcf3b521c() {
        return this.currencyPairAccountSwitcher;
    }

    /* renamed from: getNonCurrencyPairAccountSwitcher$lib_crypto_button_bar_externalDebug */
    public final CryptoNonCurrencyPairAccountSwitcher m2770xe6ad01bb() {
        return this.nonCurrencyPairAccountSwitcher;
    }

    public final String getSelectedRhsAccountNumber$lib_crypto_button_bar_externalDebug() {
        return this.selectedRhsAccountNumber;
    }

    public final CryptoAccountInfo getSelectedAccountInfo$lib_crypto_button_bar_externalDebug() {
        return this.selectedAccountInfo;
    }

    private final boolean getCryptobilityLoading() {
        if (!this.isMibExperimentEnabled || this.selectedAccountInfo == null) {
            return false;
        }
        Cryptobility cryptobility = this.cryptobility;
        return !Intrinsics.areEqual(cryptobility != null ? Cryptobility2.getAccountInfo(cryptobility) : null, this.selectedAccountInfo) && (this.args instanceof CryptoButtonBarArgs.Crypto);
    }

    private final boolean getHomeButtonsLoading() {
        return this.isMibExperimentEnabled && this.selectedAccountInfo != null && this.homeButtons == null && (this.args instanceof CryptoButtonBarArgs.Home);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CryptoButtonBarViewState.ButtonBarType.Vertical getPlaceholderLoadingButton() {
        StringResource.Companion companion = StringResource.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj = null;
        BentoButtons.Type type2 = null;
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = null;
        boolean z = false;
        boolean z2 = true;
        UserInteractionEventDescriptor userInteractionEventDescriptor = null;
        ColorDto colorDto3 = null;
        return new CryptoButtonBarViewState.ButtonBarType.Vertical(new ExpandableButtonTrayState(new ExpandableButtonTrayState.ExpandButton(companion.invoke(""), null, true, null, null, null, true, 58, defaultConstructorMarker), extensions2.persistentListOf(new ExpandableButtonTrayState.ActionButton.CustomButton(companion.invoke(""), obj, type2, colorDto, colorDto2, serverToBentoAssetMapper2, z, z2, userInteractionEventDescriptor, 380, null)), getPrefixAccountSelector(), false, true, 0 == true ? 1 : 0, colorDto3, 104, defaultConstructorMarker));
    }

    public final CryptoButtonBarViewState.ButtonBarType getButtonBarType() {
        Cryptobility cryptobility = this.cryptobility;
        if (cryptobility != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[cryptobility.getTradeButtonsDisplayType().ordinal()];
            if (i == 1) {
                return getHorizontalButtonBarType(this.cryptobility);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return getVerticalButtonBarType(this.cryptobility);
        }
        if ((getCryptobilityLoading() && this.showAccountSelector) || (getHomeButtonsLoading() && this.showAccountSelector)) {
            return getPlaceholderLoadingButton();
        }
        PerpetualButtons perpetualButtons = this.perpetualButtons;
        if (perpetualButtons != null) {
            return getButtonBarType$lib_crypto_button_bar_externalDebug(perpetualButtons);
        }
        CryptoHomeCtaButtons cryptoHomeCtaButtons = this.homeButtons;
        if (cryptoHomeCtaButtons != null) {
            return getButtonBarType(cryptoHomeCtaButtons);
        }
        return null;
    }

    private final ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector getPrefixAccountSelector() {
        CryptoAccountSwitcherViewModel home;
        List<CryptoAccountSwitcherAccount> accounts2;
        CryptoAccountSwitcherViewModel tradeBar;
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.currencyPairAccountSwitcher;
        if (cryptoCurrencyPairAccountSwitcher != null && this.nonCurrencyPairAccountSwitcher != null) {
            throw new IllegalStateException("Both currency pair and non-currency pair account switchers are set in CryptoButtonBarDataState.");
        }
        Object obj = null;
        if (cryptoCurrencyPairAccountSwitcher == null || (tradeBar = cryptoCurrencyPairAccountSwitcher.getTradeBar()) == null || (accounts2 = tradeBar.getAccounts()) == null) {
            CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher = this.nonCurrencyPairAccountSwitcher;
            if (cryptoNonCurrencyPairAccountSwitcher == null || (home = cryptoNonCurrencyPairAccountSwitcher.getHome()) == null) {
                return null;
            }
            accounts2 = home.getAccounts();
        }
        Iterator<T> it = accounts2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((CryptoAccountSwitcherAccount) next).getRhsAccountNumber(), this.selectedRhsAccountNumber)) {
                obj = next;
                break;
            }
        }
        CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount = (CryptoAccountSwitcherAccount) obj;
        if (cryptoAccountSwitcherAccount == null) {
            cryptoAccountSwitcherAccount = (CryptoAccountSwitcherAccount) CollectionsKt.first((List) accounts2);
        }
        ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(IconDto.INSTANCE.fromProto(cryptoAccountSwitcherAccount.getIcon()));
        if (bentoAsset == null) {
            bentoAsset = ServerToBentoAssetMapper2.FINANCE_24;
        }
        return new ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector(new BentoIcon4.Size24(bentoAsset), StringResource.INSTANCE.invoke(cryptoAccountSwitcherAccount.getTitle()));
    }

    private final CryptoButtonBarViewState.ButtonBarType.Horizontal getHorizontalButtonBarType(Cryptobility cryptobility) {
        if (getActionButtons$lib_crypto_button_bar_externalDebug(cryptobility).isEmpty()) {
            return null;
        }
        return new CryptoButtonBarViewState.ButtonBarType.Horizontal(getActionButtons$lib_crypto_button_bar_externalDebug(cryptobility), cryptobility.getFooterDisclosure());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final CryptoButtonBarViewState.ButtonBarType.Vertical getVerticalButtonBarType(Cryptobility cryptobility) {
        ExpandableButtonTrayState.PrefixContentState titleState;
        boolean enabled;
        boolean z;
        if (this.showAccountSelector) {
            titleState = getPrefixAccountSelector();
        } else {
            StringResource.Companion companion = StringResource.INSTANCE;
            String tradeBarLeftTitle = cryptobility.getTradeBarLeftTitle();
            if (tradeBarLeftTitle == null) {
                tradeBarLeftTitle = "";
            }
            StringResource stringResourceInvoke = companion.invoke(tradeBarLeftTitle);
            String tradeBarLeftSubtitle = cryptobility.getTradeBarLeftSubtitle();
            if (tradeBarLeftSubtitle == null) {
                tradeBarLeftSubtitle = "";
            }
            titleState = new ExpandableButtonTrayState.PrefixContentState.TitleState(stringResourceInvoke, companion.invoke(tradeBarLeftSubtitle));
        }
        ExpandableButtonTrayState.PrefixContentState prefixContentState = titleState;
        ImmutableList3<ExpandableButtonTrayState.ActionButton> persistentList = extensions2.toPersistentList(CollectionsKt.reversed(getActionButtons$lib_crypto_button_bar_externalDebug(cryptobility)));
        if (persistentList.isEmpty()) {
            return null;
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        String tradeBarExpandButtonTitle = cryptobility.getTradeBarExpandButtonTitle();
        StringResource stringResourceInvoke2 = companion2.invoke(tradeBarExpandButtonTitle != null ? tradeBarExpandButtonTitle : "");
        if (persistentList.isEmpty()) {
            z = false;
        } else {
            for (ExpandableButtonTrayState.ActionButton actionButton : persistentList) {
                if (actionButton instanceof ExpandableButtonTrayState.ActionButton.IdlButton) {
                    enabled = ((ExpandableButtonTrayState.ActionButton.IdlButton) actionButton).getButton().getState() != ButtonStateDto.BUTTON_STATE_DISABLED;
                } else if (actionButton instanceof ExpandableButtonTrayState.ActionButton.SduiButton) {
                    if (((ExpandableButtonTrayState.ActionButton.SduiButton) actionButton).getButton().getState() == ButtonState.DEFAULT) {
                    }
                } else {
                    if (!(actionButton instanceof ExpandableButtonTrayState.ActionButton.CustomButton)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enabled = ((ExpandableButtonTrayState.ActionButton.CustomButton) actionButton).getEnabled();
                }
                if (enabled) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new CryptoButtonBarViewState.ButtonBarType.Vertical(new ExpandableButtonTrayState(new ExpandableButtonTrayState.ExpandButton(stringResourceInvoke2, null, z, null, null, null, getCryptobilityLoading(), 58, null), persistentList, prefixContentState, false, false, 0 == true ? 1 : 0, null, 120, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CryptoButtonBarViewState.ButtonBarType.Vertical getButtonBarType(CryptoHomeCtaButtons cryptoHomeCtaButtons) {
        boolean z;
        ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector prefixAccountSelector = this.showAccountSelector ? getPrefixAccountSelector() : null;
        if (cryptoHomeCtaButtons.getButtons().isEmpty()) {
            return null;
        }
        if (cryptoHomeCtaButtons.getButtons().size() > 1) {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("CryptoHomeCtaButtons contains more than one button"), false, new EventMetadata(SentryTeam.CRYPTO, null, null, 6, null));
        }
        ImmutableList<ExpandableButtonTrayState.ActionButton.SduiButton<GenericAction>> actionButtons$lib_crypto_button_bar_externalDebug = getActionButtons$lib_crypto_button_bar_externalDebug(cryptoHomeCtaButtons);
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("");
        ImmutableList<Button<com.robinhood.models.serverdriven.experimental.api.GenericAction>> buttons = cryptoHomeCtaButtons.getButtons();
        if (buttons == null || !buttons.isEmpty()) {
            Iterator<Button<com.robinhood.models.serverdriven.experimental.api.GenericAction>> it = buttons.iterator();
            while (it.hasNext()) {
                if (it.next().getState() == ButtonState.DEFAULT) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return new CryptoButtonBarViewState.ButtonBarType.Vertical(new ExpandableButtonTrayState(new ExpandableButtonTrayState.ExpandButton(stringResourceInvoke, null, z, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), actionButtons$lib_crypto_button_bar_externalDebug, prefixAccountSelector, false, false, 0 == true ? 1 : 0, null, 120, 0 == true ? 1 : 0));
    }

    public final CryptoButtonBarViewState.ButtonBarType getButtonBarType$lib_crypto_button_bar_externalDebug(PerpetualButtons perpetualButtons) {
        Intrinsics.checkNotNullParameter(perpetualButtons, "<this>");
        GetButtonsResponseDto.DisplayTypeDto display_type = perpetualButtons.getProto().getDisplay_type();
        if (display_type instanceof GetButtonsResponseDto.DisplayTypeDto.ButtonBar) {
            return new CryptoButtonBarViewState.ButtonBarType.Horizontal(getActionButtons$lib_crypto_button_bar_externalDebug(perpetualButtons), getDisclosure$lib_crypto_button_bar_externalDebug(perpetualButtons));
        }
        if (!(display_type instanceof GetButtonsResponseDto.DisplayTypeDto.ExpandableButtons)) {
            if (display_type == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        GetButtonsResponseDto.DisplayTypeDto.ExpandableButtons expandableButtons = (GetButtonsResponseDto.DisplayTypeDto.ExpandableButtons) display_type;
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(expandableButtons.getValue().getExpand_button_title());
        ImmutableList<ExpandableButtonTrayState.ActionButton.IdlButton<GenericAction>> actionButtons$lib_crypto_button_bar_externalDebug = getActionButtons$lib_crypto_button_bar_externalDebug(perpetualButtons);
        boolean z = false;
        if (actionButtons$lib_crypto_button_bar_externalDebug == null || !actionButtons$lib_crypto_button_bar_externalDebug.isEmpty()) {
            Iterator<ExpandableButtonTrayState.ActionButton.IdlButton<GenericAction>> it = actionButtons$lib_crypto_button_bar_externalDebug.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getButton().getState() != ButtonStateDto.BUTTON_STATE_DISABLED) {
                    z = true;
                    break;
                }
            }
        }
        ExpandableButtonTrayState.ExpandButton expandButton = new ExpandableButtonTrayState.ExpandButton(stringResourceInvoke, null, z, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        return new CryptoButtonBarViewState.ButtonBarType.Vertical(new ExpandableButtonTrayState(expandButton, getActionButtons$lib_crypto_button_bar_externalDebug(perpetualButtons), new ExpandableButtonTrayState.PrefixContentState.TitleState(companion.invoke(expandableButtons.getValue().getLeft_title()), companion.invoke(expandableButtons.getValue().getLeft_subtitle())), false, false, null, null, 120, null));
    }

    public final ImmutableList<ExpandableButtonTrayState.ActionButton<GenericAction>> getActionButtons$lib_crypto_button_bar_externalDebug(Cryptobility cryptobility) {
        BentoButtons.Type type2;
        ColorDto colorDto;
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(cryptobility, "<this>");
        List<GenericButton> tradeButtons = cryptobility.getTradeButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tradeButtons, 10));
        for (GenericButton genericButton : tradeButtons) {
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(genericButton.getTitle());
            GenericAction typedAction = genericButton.getTypedAction();
            int i = WhenMappings.$EnumSwitchMapping$1[genericButton.getGenericButtonType().ordinal()];
            boolean z = true;
            if (i == 1 || i == 2) {
                type2 = BentoButtons.Type.Primary;
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                type2 = BentoButtons.Type.Secondary;
            }
            if (genericButton.isEnabled()) {
                colorDto = ColorDto.COLOR_ACCENT;
            } else {
                colorDto = ColorDto.COLOR_FG3;
            }
            ServerToBentoAssetMapper2 icon = genericButton.getIcon();
            boolean zIsEnabled = genericButton.isEnabled();
            if (!this.loadingButtonLabels.contains(genericButton.getTitle()) && !getCryptobilityLoading()) {
                z = false;
            }
            boolean z2 = z;
            String loggingIdentifier = genericButton.getLoggingIdentifier();
            if (Intrinsics.areEqual(loggingIdentifier, "buy")) {
                action = UserInteractionEventData.Action.BUY;
            } else {
                action = Intrinsics.areEqual(loggingIdentifier, "sell") ? UserInteractionEventData.Action.SELL : UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            UserInteractionEventData.Action action2 = action;
            ColorDto colorDto2 = null;
            arrayList.add(new ExpandableButtonTrayState.ActionButton.CustomButton(stringResourceInvoke, typedAction, type2, colorDto2, colorDto, icon, zIsEnabled, z2, new UserInteractionEventDescriptor(null, null, action2, null, new Component(Component.ComponentType.BUTTON, genericButton.getLoggingIdentifier(), null, 4, null), null, 43, null), 8, null));
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final ImmutableList<ExpandableButtonTrayState.ActionButton.SduiButton<GenericAction>> getActionButtons$lib_crypto_button_bar_externalDebug(CryptoHomeCtaButtons cryptoHomeCtaButtons) {
        Intrinsics.checkNotNullParameter(cryptoHomeCtaButtons, "<this>");
        ImmutableList<Button<com.robinhood.models.serverdriven.experimental.api.GenericAction>> buttons = cryptoHomeCtaButtons.getButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        Iterator<Button<com.robinhood.models.serverdriven.experimental.api.GenericAction>> it = buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExpandableButtonTrayState.ActionButton.SduiButton(it.next()));
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final ImmutableList<ExpandableButtonTrayState.ActionButton.IdlButton<GenericAction>> getActionButtons$lib_crypto_button_bar_externalDebug(PerpetualButtons perpetualButtons) {
        List<ButtonDto> listEmptyList;
        ButtonStateDto state;
        Intrinsics.checkNotNullParameter(perpetualButtons, "<this>");
        GetButtonsResponseDto.DisplayTypeDto display_type = perpetualButtons.getProto().getDisplay_type();
        if (display_type instanceof GetButtonsResponseDto.DisplayTypeDto.ButtonBar) {
            listEmptyList = ((GetButtonsResponseDto.DisplayTypeDto.ButtonBar) display_type).getValue().getButtons();
        } else if (display_type instanceof GetButtonsResponseDto.DisplayTypeDto.ExpandableButtons) {
            listEmptyList = ((GetButtonsResponseDto.DisplayTypeDto.ExpandableButtons) display_type).getValue().getButtons();
        } else {
            if (display_type != null) {
                throw new NoWhenBranchMatchedException();
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        List<ButtonDto> list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ButtonDto buttonDto : list) {
            if (this.loadingButtonLabels.contains(buttonDto.getLabel())) {
                state = ButtonStateDto.BUTTON_STATE_LOADING;
            } else {
                state = buttonDto.getState();
            }
            arrayList.add(new ExpandableButtonTrayState.ActionButton.IdlButton(ButtonDto.copy$default(buttonDto, null, null, null, null, null, null, null, state, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null)));
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction> getDisclosure$lib_crypto_button_bar_externalDebug(PerpetualButtons perpetualButtons) {
        Intrinsics.checkNotNullParameter(perpetualButtons, "<this>");
        GetButtonsResponseDto.DisplayTypeDto display_type = perpetualButtons.getProto().getDisplay_type();
        if (!(display_type instanceof GetButtonsResponseDto.DisplayTypeDto.ButtonBar)) {
            if ((display_type instanceof GetButtonsResponseDto.DisplayTypeDto.ExpandableButtons) || display_type == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String helper_text = ((GetButtonsResponseDto.DisplayTypeDto.ButtonBar) display_type).getValue().getHelper_text();
        if (helper_text == null) {
            return null;
        }
        TextStyle textStyle = TextStyle.TEXT_SMALL;
        TextAlignment textAlignment = TextAlignment.CENTER;
        Color color = Color.FG2;
        return new MarkdownText(helper_text, textStyle, textAlignment, new ThemedColor(color, color), new ThemedColor(color, color));
    }

    public final Screen getEventScreen$lib_crypto_button_bar_externalDebug() {
        CryptoButtonBarArgs cryptoButtonBarArgs = this.args;
        if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Home) {
            return new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null);
        }
        if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Crypto) {
            Screen.Name name = Screen.Name.CRYPTO_DETAIL_PAGE;
            String string2 = ((CryptoButtonBarArgs.Crypto) this.args).getCurrencyPairId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new Screen(name, null, string2, null, 10, null);
        }
        if (!(cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Perpetuals)) {
            throw new NoWhenBranchMatchedException();
        }
        Screen.Name name2 = Screen.Name.PERPETUALS_DETAIL_PAGE;
        UUID perpetualContractId = ((CryptoButtonBarArgs.Perpetuals) this.args).getPerpetualContractId();
        String string3 = perpetualContractId != null ? perpetualContractId.toString() : null;
        if (string3 == null) {
            string3 = "";
        }
        return new Screen(name2, null, string3, null, 10, null);
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        if (this.currencyPairAccountSwitcher != null && this.nonCurrencyPairAccountSwitcher != null) {
            throw new IllegalStateException("Both currency pair and non-currency pair account switchers are set in CryptoButtonBarDataState.");
        }
        CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher = this.nonCurrencyPairAccountSwitcher;
        if (cryptoNonCurrencyPairAccountSwitcher != null) {
            Screen eventScreen$lib_crypto_button_bar_externalDebug = getEventScreen$lib_crypto_button_bar_externalDebug();
            String str = this.selectedRhsAccountNumber;
            if (str == null) {
                str = "";
            }
            AccountSwitcherData accountSwitcherData = CryptoNonCurrencyPairAccountSwitchers.toAccountSwitcherData(cryptoNonCurrencyPairAccountSwitcher, str, eventScreen$lib_crypto_button_bar_externalDebug, CryptoNonCurrencyPairAccountSwitcher.Location.HOME);
            if (accountSwitcherData != null) {
                return accountSwitcherData;
            }
        }
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.currencyPairAccountSwitcher;
        if (cryptoCurrencyPairAccountSwitcher == null) {
            return null;
        }
        Screen eventScreen$lib_crypto_button_bar_externalDebug2 = getEventScreen$lib_crypto_button_bar_externalDebug();
        String str2 = this.selectedRhsAccountNumber;
        return CryptoCurrencyPairAccountSwitchers.toAccountSwitcherData(cryptoCurrencyPairAccountSwitcher, str2 != null ? str2 : "", eventScreen$lib_crypto_button_bar_externalDebug2, CryptoCurrencyPairAccountSwitcher.Location.TRADE_BAR);
    }
}
