package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsAdapter;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentPermissions;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanner;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferAccountsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 \u0082\u00012\u00020\u0001:\u0006\u0080\u0001\u0081\u0001\u0082\u0001Bï\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010m\u001a\u00020\u0010HÆ\u0003J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\t\u0010o\u001a\u00020\u0005HÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÆ\u0003J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÂ\u0003J\t\u0010w\u001a\u00020\u0005HÂ\u0003J\t\u0010x\u001a\u00020\u0005HÂ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010!HÂ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010#HÂ\u0003J÷\u0001\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#HÆ\u0001J\u0013\u0010|\u001a\u00020\u00052\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020XHÖ\u0001J\t\u0010\u007f\u001a\u00020BHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010@\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\r0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\r8F¢\u0006\u0006\u001a\u0004\bJ\u0010/R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010/R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020I0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010/R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020I0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010/R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020I0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010/R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020I0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010/R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020I0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010/R\u0016\u0010W\u001a\u00020X8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010[\u001a\u0004\u0018\u00010\\¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010_\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b_\u0010(R\u0013\u0010`\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010(¨\u0006\u0083\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "isSinkAccountFixed", "", "transactingAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "navigateBackWithTransferAccountResult", "isEditing", "transferBanners", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "accountDisplayDataList", "", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "hasReachedAchRelationshipLimit", "fromRetirementContributionsV2", "debitCardInstrumentStatusPermissionsOptional", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentPermissions;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "useUkAddAccountExperience", "inFirstPartyOutgoingWireMode", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "resetAccountSelectionOnBackPressed", "isInWireTransferRegionGate", "isInInterEntityMatchExperiment", "isOutgoingWire", "matchRateOverrideValues", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "guidedTransfersData", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;ZLcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;ZLcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;Ljava/util/List;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;ZZLcom/robinhood/utils/Optional;Lcom/robinhood/models/api/bonfire/IraContributionType;ZZLcom/robinhood/models/api/bonfire/wires/RecipientType;ZZZZLcom/robinhood/android/models/retirement/db/MatchRateBreakdown;Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey$GuidedTransfersData;)V", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "()Z", "getTransactingAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getNavigateBackWithTransferAccountResult", "getTransferBanners", "()Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "getAccountDisplayDataList", "()Ljava/util/List;", "getDirection", "()Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "getHasReachedAchRelationshipLimit", "getFromRetirementContributionsV2", "getDebitCardInstrumentStatusPermissionsOptional", "()Lcom/robinhood/utils/Optional;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getUseUkAddAccountExperience", "getInFirstPartyOutgoingWireMode", "getOutgoingWireRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "getResetAccountSelectionOnBackPressed", "transactingAccountIfFixed", "internalAccounts", "externalAccounts", "banners", "", "", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanner;", "menuState", "Lcom/robinhood/android/transfers/ui/max/accounts/MenuState;", "getMenuState", "()Lcom/robinhood/android/transfers/ui/max/accounts/MenuState;", "rowItems", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "getRowItems", "internalRows", "getInternalRows", "externalRows", "getExternalRows", "externalThenInternalRows", "getExternalThenInternalRows", "rowItemsContributionsSinkSelection", "getRowItemsContributionsSinkSelection", "rowItemsOutgoingWire", "getRowItemsOutgoingWire", "internalThenExternalRows", "getInternalThenExternalRows", "titleTextResId", "", "getTitleTextResId", "()I", "subtitleRichText", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getSubtitleRichText", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "isWiresUpsellVisible", "enokiText", "Lcom/robinhood/utils/resource/StringResource;", "getEnokiText", "()Lcom/robinhood/utils/resource/StringResource;", "showEnokiText", "getShowEnokiText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "toString", "AccountTransferDisplayData", "ServiceFeeDisplayText", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class TransferAccountsViewState {
    private final List<AccountTransferDisplayData> accountDisplayDataList;
    private final Map<String, List<ApiTransferBanner>> banners;
    private final Optional<ApiPaymentInstrumentPermissions> debitCardInstrumentStatusPermissionsOptional;
    private final TransferAccountDirection direction;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final List<AccountTransferDisplayData> externalAccounts;
    private final boolean fromRetirementContributionsV2;
    private final TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData;
    private final boolean hasReachedAchRelationshipLimit;
    private final boolean inFirstPartyOutgoingWireMode;
    private final List<AccountTransferDisplayData> internalAccounts;
    private final IraContributionType iraContributionType;
    private final boolean isEditing;
    private final boolean isInInterEntityMatchExperiment;
    private final boolean isInWireTransferRegionGate;
    private final boolean isOutgoingWire;
    private final boolean isSinkAccountFixed;
    private final MatchRateBreakdown matchRateOverrideValues;
    private final TransferAccount navigateBackWithTransferAccountResult;
    private final RecipientType outgoingWireRecipientType;
    private final boolean resetAccountSelectionOnBackPressed;
    private final RichText subtitleRichText;
    private final int titleTextResId;
    private final TransferAccount transactingAccount;
    private final TransferAccount transactingAccountIfFixed;
    private final ApiTransferBanners transferBanners;
    private final boolean useUkAddAccountExperience;
    public static final int $stable = 8;
    private static final int INTERNAL_ACCOUNT_HEADER = C30065R.string.transfer_account_header_internal;
    private static final int EXTERNAL_ACCOUNT_US_HEADER = C30065R.string.transfer_account_header_us_external;
    private static final int EXTERNAL_ACCOUNT_UK_HEADER = C30065R.string.transfer_account_header_uk_external;

    /* compiled from: TransferAccountsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferDirection.values().length];
            try {
                iArr2[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component17, reason: from getter */
    private final boolean getIsInWireTransferRegionGate() {
        return this.isInWireTransferRegionGate;
    }

    /* renamed from: component18, reason: from getter */
    private final boolean getIsInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    /* renamed from: component19, reason: from getter */
    private final boolean getIsOutgoingWire() {
        return this.isOutgoingWire;
    }

    /* renamed from: component20, reason: from getter */
    private final MatchRateBreakdown getMatchRateOverrideValues() {
        return this.matchRateOverrideValues;
    }

    /* renamed from: component21, reason: from getter */
    private final TransferAccountSelectionKey.GuidedTransfersData getGuidedTransfersData() {
        return this.guidedTransfersData;
    }

    public static /* synthetic */ TransferAccountsViewState copy$default(TransferAccountsViewState transferAccountsViewState, MAXTransferContext.EntryPoint entryPoint, boolean z, TransferAccount transferAccount, TransferAccount transferAccount2, boolean z2, ApiTransferBanners apiTransferBanners, List list, TransferAccountDirection transferAccountDirection, boolean z3, boolean z4, Optional optional, IraContributionType iraContributionType, boolean z5, boolean z6, RecipientType recipientType, boolean z7, boolean z8, boolean z9, boolean z10, MatchRateBreakdown matchRateBreakdown, TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData, int i, Object obj) {
        TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData2;
        MatchRateBreakdown matchRateBreakdown2;
        MAXTransferContext.EntryPoint entryPoint2 = (i & 1) != 0 ? transferAccountsViewState.entryPoint : entryPoint;
        boolean z11 = (i & 2) != 0 ? transferAccountsViewState.isSinkAccountFixed : z;
        TransferAccount transferAccount3 = (i & 4) != 0 ? transferAccountsViewState.transactingAccount : transferAccount;
        TransferAccount transferAccount4 = (i & 8) != 0 ? transferAccountsViewState.navigateBackWithTransferAccountResult : transferAccount2;
        boolean z12 = (i & 16) != 0 ? transferAccountsViewState.isEditing : z2;
        ApiTransferBanners apiTransferBanners2 = (i & 32) != 0 ? transferAccountsViewState.transferBanners : apiTransferBanners;
        List list2 = (i & 64) != 0 ? transferAccountsViewState.accountDisplayDataList : list;
        TransferAccountDirection transferAccountDirection2 = (i & 128) != 0 ? transferAccountsViewState.direction : transferAccountDirection;
        boolean z13 = (i & 256) != 0 ? transferAccountsViewState.hasReachedAchRelationshipLimit : z3;
        boolean z14 = (i & 512) != 0 ? transferAccountsViewState.fromRetirementContributionsV2 : z4;
        Optional optional2 = (i & 1024) != 0 ? transferAccountsViewState.debitCardInstrumentStatusPermissionsOptional : optional;
        IraContributionType iraContributionType2 = (i & 2048) != 0 ? transferAccountsViewState.iraContributionType : iraContributionType;
        boolean z15 = (i & 4096) != 0 ? transferAccountsViewState.useUkAddAccountExperience : z5;
        boolean z16 = (i & 8192) != 0 ? transferAccountsViewState.inFirstPartyOutgoingWireMode : z6;
        MAXTransferContext.EntryPoint entryPoint3 = entryPoint2;
        RecipientType recipientType2 = (i & 16384) != 0 ? transferAccountsViewState.outgoingWireRecipientType : recipientType;
        boolean z17 = (i & 32768) != 0 ? transferAccountsViewState.resetAccountSelectionOnBackPressed : z7;
        boolean z18 = (i & 65536) != 0 ? transferAccountsViewState.isInWireTransferRegionGate : z8;
        boolean z19 = (i & 131072) != 0 ? transferAccountsViewState.isInInterEntityMatchExperiment : z9;
        boolean z20 = (i & 262144) != 0 ? transferAccountsViewState.isOutgoingWire : z10;
        MatchRateBreakdown matchRateBreakdown3 = (i & 524288) != 0 ? transferAccountsViewState.matchRateOverrideValues : matchRateBreakdown;
        if ((i & 1048576) != 0) {
            matchRateBreakdown2 = matchRateBreakdown3;
            guidedTransfersData2 = transferAccountsViewState.guidedTransfersData;
        } else {
            guidedTransfersData2 = guidedTransfersData;
            matchRateBreakdown2 = matchRateBreakdown3;
        }
        return transferAccountsViewState.copy(entryPoint3, z11, transferAccount3, transferAccount4, z12, apiTransferBanners2, list2, transferAccountDirection2, z13, z14, optional2, iraContributionType2, z15, z16, recipientType2, z17, z18, z19, z20, matchRateBreakdown2, guidedTransfersData2);
    }

    /* renamed from: component1, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getFromRetirementContributionsV2() {
        return this.fromRetirementContributionsV2;
    }

    public final Optional<ApiPaymentInstrumentPermissions> component11() {
        return this.debitCardInstrumentStatusPermissionsOptional;
    }

    /* renamed from: component12, reason: from getter */
    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getUseUkAddAccountExperience() {
        return this.useUkAddAccountExperience;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getInFirstPartyOutgoingWireMode() {
        return this.inFirstPartyOutgoingWireMode;
    }

    /* renamed from: component15, reason: from getter */
    public final RecipientType getOutgoingWireRecipientType() {
        return this.outgoingWireRecipientType;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getResetAccountSelectionOnBackPressed() {
        return this.resetAccountSelectionOnBackPressed;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSinkAccountFixed() {
        return this.isSinkAccountFixed;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getTransactingAccount() {
        return this.transactingAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferAccount getNavigateBackWithTransferAccountResult() {
        return this.navigateBackWithTransferAccountResult;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiTransferBanners getTransferBanners() {
        return this.transferBanners;
    }

    public final List<AccountTransferDisplayData> component7() {
        return this.accountDisplayDataList;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasReachedAchRelationshipLimit() {
        return this.hasReachedAchRelationshipLimit;
    }

    public final TransferAccountsViewState copy(MAXTransferContext.EntryPoint entryPoint, boolean isSinkAccountFixed, TransferAccount transactingAccount, TransferAccount navigateBackWithTransferAccountResult, boolean isEditing, ApiTransferBanners transferBanners, List<AccountTransferDisplayData> accountDisplayDataList, TransferAccountDirection direction, boolean hasReachedAchRelationshipLimit, boolean fromRetirementContributionsV2, Optional<ApiPaymentInstrumentPermissions> debitCardInstrumentStatusPermissionsOptional, IraContributionType iraContributionType, boolean useUkAddAccountExperience, boolean inFirstPartyOutgoingWireMode, RecipientType outgoingWireRecipientType, boolean resetAccountSelectionOnBackPressed, boolean isInWireTransferRegionGate, boolean isInInterEntityMatchExperiment, boolean isOutgoingWire, MatchRateBreakdown matchRateOverrideValues, TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(accountDisplayDataList, "accountDisplayDataList");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new TransferAccountsViewState(entryPoint, isSinkAccountFixed, transactingAccount, navigateBackWithTransferAccountResult, isEditing, transferBanners, accountDisplayDataList, direction, hasReachedAchRelationshipLimit, fromRetirementContributionsV2, debitCardInstrumentStatusPermissionsOptional, iraContributionType, useUkAddAccountExperience, inFirstPartyOutgoingWireMode, outgoingWireRecipientType, resetAccountSelectionOnBackPressed, isInWireTransferRegionGate, isInInterEntityMatchExperiment, isOutgoingWire, matchRateOverrideValues, guidedTransfersData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferAccountsViewState)) {
            return false;
        }
        TransferAccountsViewState transferAccountsViewState = (TransferAccountsViewState) other;
        return this.entryPoint == transferAccountsViewState.entryPoint && this.isSinkAccountFixed == transferAccountsViewState.isSinkAccountFixed && Intrinsics.areEqual(this.transactingAccount, transferAccountsViewState.transactingAccount) && Intrinsics.areEqual(this.navigateBackWithTransferAccountResult, transferAccountsViewState.navigateBackWithTransferAccountResult) && this.isEditing == transferAccountsViewState.isEditing && Intrinsics.areEqual(this.transferBanners, transferAccountsViewState.transferBanners) && Intrinsics.areEqual(this.accountDisplayDataList, transferAccountsViewState.accountDisplayDataList) && this.direction == transferAccountsViewState.direction && this.hasReachedAchRelationshipLimit == transferAccountsViewState.hasReachedAchRelationshipLimit && this.fromRetirementContributionsV2 == transferAccountsViewState.fromRetirementContributionsV2 && Intrinsics.areEqual(this.debitCardInstrumentStatusPermissionsOptional, transferAccountsViewState.debitCardInstrumentStatusPermissionsOptional) && this.iraContributionType == transferAccountsViewState.iraContributionType && this.useUkAddAccountExperience == transferAccountsViewState.useUkAddAccountExperience && this.inFirstPartyOutgoingWireMode == transferAccountsViewState.inFirstPartyOutgoingWireMode && this.outgoingWireRecipientType == transferAccountsViewState.outgoingWireRecipientType && this.resetAccountSelectionOnBackPressed == transferAccountsViewState.resetAccountSelectionOnBackPressed && this.isInWireTransferRegionGate == transferAccountsViewState.isInWireTransferRegionGate && this.isInInterEntityMatchExperiment == transferAccountsViewState.isInInterEntityMatchExperiment && this.isOutgoingWire == transferAccountsViewState.isOutgoingWire && Intrinsics.areEqual(this.matchRateOverrideValues, transferAccountsViewState.matchRateOverrideValues) && Intrinsics.areEqual(this.guidedTransfersData, transferAccountsViewState.guidedTransfersData);
    }

    public int hashCode() {
        int iHashCode = ((this.entryPoint.hashCode() * 31) + Boolean.hashCode(this.isSinkAccountFixed)) * 31;
        TransferAccount transferAccount = this.transactingAccount;
        int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.navigateBackWithTransferAccountResult;
        int iHashCode3 = (((iHashCode2 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31;
        ApiTransferBanners apiTransferBanners = this.transferBanners;
        int iHashCode4 = (((((((((iHashCode3 + (apiTransferBanners == null ? 0 : apiTransferBanners.hashCode())) * 31) + this.accountDisplayDataList.hashCode()) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.hasReachedAchRelationshipLimit)) * 31) + Boolean.hashCode(this.fromRetirementContributionsV2)) * 31;
        Optional<ApiPaymentInstrumentPermissions> optional = this.debitCardInstrumentStatusPermissionsOptional;
        int iHashCode5 = (iHashCode4 + (optional == null ? 0 : optional.hashCode())) * 31;
        IraContributionType iraContributionType = this.iraContributionType;
        int iHashCode6 = (((((iHashCode5 + (iraContributionType == null ? 0 : iraContributionType.hashCode())) * 31) + Boolean.hashCode(this.useUkAddAccountExperience)) * 31) + Boolean.hashCode(this.inFirstPartyOutgoingWireMode)) * 31;
        RecipientType recipientType = this.outgoingWireRecipientType;
        int iHashCode7 = (((((((((iHashCode6 + (recipientType == null ? 0 : recipientType.hashCode())) * 31) + Boolean.hashCode(this.resetAccountSelectionOnBackPressed)) * 31) + Boolean.hashCode(this.isInWireTransferRegionGate)) * 31) + Boolean.hashCode(this.isInInterEntityMatchExperiment)) * 31) + Boolean.hashCode(this.isOutgoingWire)) * 31;
        MatchRateBreakdown matchRateBreakdown = this.matchRateOverrideValues;
        int iHashCode8 = (iHashCode7 + (matchRateBreakdown == null ? 0 : matchRateBreakdown.hashCode())) * 31;
        TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData = this.guidedTransfersData;
        return iHashCode8 + (guidedTransfersData != null ? guidedTransfersData.hashCode() : 0);
    }

    public String toString() {
        return "TransferAccountsViewState(entryPoint=" + this.entryPoint + ", isSinkAccountFixed=" + this.isSinkAccountFixed + ", transactingAccount=" + this.transactingAccount + ", navigateBackWithTransferAccountResult=" + this.navigateBackWithTransferAccountResult + ", isEditing=" + this.isEditing + ", transferBanners=" + this.transferBanners + ", accountDisplayDataList=" + this.accountDisplayDataList + ", direction=" + this.direction + ", hasReachedAchRelationshipLimit=" + this.hasReachedAchRelationshipLimit + ", fromRetirementContributionsV2=" + this.fromRetirementContributionsV2 + ", debitCardInstrumentStatusPermissionsOptional=" + this.debitCardInstrumentStatusPermissionsOptional + ", iraContributionType=" + this.iraContributionType + ", useUkAddAccountExperience=" + this.useUkAddAccountExperience + ", inFirstPartyOutgoingWireMode=" + this.inFirstPartyOutgoingWireMode + ", outgoingWireRecipientType=" + this.outgoingWireRecipientType + ", resetAccountSelectionOnBackPressed=" + this.resetAccountSelectionOnBackPressed + ", isInWireTransferRegionGate=" + this.isInWireTransferRegionGate + ", isInInterEntityMatchExperiment=" + this.isInInterEntityMatchExperiment + ", isOutgoingWire=" + this.isOutgoingWire + ", matchRateOverrideValues=" + this.matchRateOverrideValues + ", guidedTransfersData=" + this.guidedTransfersData + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransferAccountsViewState(MAXTransferContext.EntryPoint entryPoint, boolean z, TransferAccount transferAccount, TransferAccount transferAccount2, boolean z2, ApiTransferBanners apiTransferBanners, List<AccountTransferDisplayData> accountDisplayDataList, TransferAccountDirection direction, boolean z3, boolean z4, Optional<ApiPaymentInstrumentPermissions> optional, IraContributionType iraContributionType, boolean z5, boolean z6, RecipientType recipientType, boolean z7, boolean z8, boolean z9, boolean z10, MatchRateBreakdown matchRateBreakdown, TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData) {
        TransferAccount transferAccount3;
        int i;
        List<ApiTransferBanner> source_banners;
        int i2;
        int i3;
        TransferAccount transferAccount4;
        TransferAccount.EnokiInfo enokiInfo;
        boolean z11;
        TransferAccount transferAccount5;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(accountDisplayDataList, "accountDisplayDataList");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.entryPoint = entryPoint;
        this.isSinkAccountFixed = z;
        this.transactingAccount = transferAccount;
        this.navigateBackWithTransferAccountResult = transferAccount2;
        this.isEditing = z2;
        this.transferBanners = apiTransferBanners;
        this.accountDisplayDataList = accountDisplayDataList;
        this.direction = direction;
        this.hasReachedAchRelationshipLimit = z3;
        this.fromRetirementContributionsV2 = z4;
        this.debitCardInstrumentStatusPermissionsOptional = optional;
        this.iraContributionType = iraContributionType;
        this.useUkAddAccountExperience = z5;
        this.inFirstPartyOutgoingWireMode = z6;
        this.outgoingWireRecipientType = recipientType;
        this.resetAccountSelectionOnBackPressed = z7;
        this.isInWireTransferRegionGate = z8;
        this.isInInterEntityMatchExperiment = z9;
        this.isOutgoingWire = z10;
        this.matchRateOverrideValues = matchRateBreakdown;
        this.guidedTransfersData = guidedTransfersData;
        int i4 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        RichText transferFlowSubheader = null;
        if (i4 == 1) {
            if (!z) {
                transferAccount3 = null;
            }
            this.transactingAccountIfFixed = transferAccount3;
            ArrayList arrayList = new ArrayList();
            for (Object obj : accountDisplayDataList) {
                TransferAccount account = ((AccountTransferDisplayData) obj).getAccount();
                String id = account.getId();
                TransferAccount transferAccount6 = this.transactingAccountIfFixed;
                boolean zAreEqual = Intrinsics.areEqual(id, transferAccount6 != null ? transferAccount6.getId() : null);
                ApiTransferAccount.TransferAccountType type2 = account.getType();
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.DEBIT_CARD;
                boolean z12 = type2 == transferAccountType;
                boolean z13 = account.getType() != transferAccountType ? account.getStatus() == ApiTransferAccount.TransferAccountStatus.APPROVED : account.getStatus() == ApiTransferAccount.TransferAccountStatus.APPROVED || account.getStatus() == ApiTransferAccount.TransferAccountStatus.NEEDS_APPROVAL || account.getStatus() == ApiTransferAccount.TransferAccountStatus.NEEDS_VERIFICATION;
                if (account.isIra()) {
                    TransferAccount transferAccount7 = this.transactingAccountIfFixed;
                    if (transferAccount7 == null || !transferAccount7.isIra()) {
                        TransferAccount transferAccount8 = this.transactingAccount;
                        if ((transferAccount8 != null ? transferAccount8.getType() : null) != transferAccountType) {
                        }
                    }
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z14 = (z12 && (transferAccount5 = this.transactingAccount) != null && transferAccount5.isIra()) ? false : true;
                boolean z15 = account.getType() == ApiTransferAccount.TransferAccountType.RHY_BANKING;
                if (!zAreEqual && z13 && z11 && z14 && !z15) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Boolean boolValueOf = Boolean.valueOf(((AccountTransferDisplayData) obj2).getAccount().isExternal());
                Object arrayList2 = linkedHashMap.get(boolValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            List<AccountTransferDisplayData> list = (List) linkedHashMap.get(Boolean.FALSE);
            this.internalAccounts = list == null ? CollectionsKt.emptyList() : list;
            List<AccountTransferDisplayData> list2 = (List) linkedHashMap.get(Boolean.TRUE);
            this.externalAccounts = list2 == null ? CollectionsKt.emptyList() : list2;
            i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
            if (i != 1) {
                ApiTransferBanners apiTransferBanners2 = this.transferBanners;
                source_banners = apiTransferBanners2 != null ? apiTransferBanners2.getSource_banners() : null;
                if (source_banners == null) {
                    source_banners = CollectionsKt.emptyList();
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ApiTransferBanners apiTransferBanners3 = this.transferBanners;
                source_banners = apiTransferBanners3 != null ? apiTransferBanners3.getSink_banners() : null;
                if (source_banners == null) {
                    source_banners = CollectionsKt.emptyList();
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : source_banners) {
                String account_id = ((ApiTransferBanner) obj3).getAccount_id();
                Object arrayList3 = linkedHashMap2.get(account_id);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap2.put(account_id, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.banners = linkedHashMap2;
            i2 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
            if (i2 != 1) {
                TransferAccount transferAccount9 = this.transactingAccount;
                i3 = (transferAccount9 != null && transferAccount9.isIra() && this.fromRetirementContributionsV2) ? C30065R.string.transfer_account_source_selection_title_retirement : this.useUkAddAccountExperience ? C30065R.string.transfer_account_uk_source_selection_title : C30065R.string.transfer_account_source_selection_title;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = this.useUkAddAccountExperience ? C30065R.string.transfer_account_uk_sink_selection_title : C30065R.string.transfer_account_sink_selection_title;
            }
            this.titleTextResId = i3;
            if (this.direction == TransferAccountDirection.SOURCE && this.isInInterEntityMatchExperiment && (transferAccount4 = this.transactingAccount) != null && (enokiInfo = transferAccount4.getEnokiInfo()) != null) {
                transferFlowSubheader = enokiInfo.getTransferFlowSubheader();
            }
            this.subtitleRichText = transferFlowSubheader;
        }
        if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        transferAccount3 = transferAccount;
        this.transactingAccountIfFixed = transferAccount3;
        ArrayList arrayList4 = new ArrayList();
        while (r12.hasNext()) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        while (r13.hasNext()) {
        }
        List<AccountTransferDisplayData> list3 = (List) linkedHashMap3.get(Boolean.FALSE);
        this.internalAccounts = list3 == null ? CollectionsKt.emptyList() : list3;
        List<AccountTransferDisplayData> list22 = (List) linkedHashMap3.get(Boolean.TRUE);
        this.externalAccounts = list22 == null ? CollectionsKt.emptyList() : list22;
        i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i != 1) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        while (r12.hasNext()) {
        }
        this.banners = linkedHashMap22;
        i2 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i2 != 1) {
        }
        this.titleTextResId = i3;
        if (this.direction == TransferAccountDirection.SOURCE) {
            transferFlowSubheader = enokiInfo.getTransferFlowSubheader();
        }
        this.subtitleRichText = transferFlowSubheader;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferAccountsViewState(com.robinhood.rosetta.eventlogging.MAXTransferContext.EntryPoint r25, boolean r26, com.robinhood.models.p320db.bonfire.TransferAccount r27, com.robinhood.models.p320db.bonfire.TransferAccount r28, boolean r29, com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners r30, java.util.List r31, com.robinhood.android.transfers.contracts.TransferAccountDirection r32, boolean r33, boolean r34, com.robinhood.utils.Optional r35, com.robinhood.models.api.bonfire.IraContributionType r36, boolean r37, boolean r38, com.robinhood.models.api.bonfire.wires.RecipientType r39, boolean r40, boolean r41, boolean r42, boolean r43, com.robinhood.android.models.retirement.p194db.MatchRateBreakdown r44, com.robinhood.android.transfers.contracts.TransferAccountSelectionKey.GuidedTransfersData r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState.<init>(com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint, boolean, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.db.bonfire.TransferAccount, boolean, com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners, java.util.List, com.robinhood.android.transfers.contracts.TransferAccountDirection, boolean, boolean, com.robinhood.utils.Optional, com.robinhood.models.api.bonfire.IraContributionType, boolean, boolean, com.robinhood.models.api.bonfire.wires.RecipientType, boolean, boolean, boolean, boolean, com.robinhood.android.models.retirement.db.MatchRateBreakdown, com.robinhood.android.transfers.contracts.TransferAccountSelectionKey$GuidedTransfersData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean isSinkAccountFixed() {
        return this.isSinkAccountFixed;
    }

    public final TransferAccount getTransactingAccount() {
        return this.transactingAccount;
    }

    public final TransferAccount getNavigateBackWithTransferAccountResult() {
        return this.navigateBackWithTransferAccountResult;
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    public final ApiTransferBanners getTransferBanners() {
        return this.transferBanners;
    }

    public final List<AccountTransferDisplayData> getAccountDisplayDataList() {
        return this.accountDisplayDataList;
    }

    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    public final boolean getHasReachedAchRelationshipLimit() {
        return this.hasReachedAchRelationshipLimit;
    }

    public final boolean getFromRetirementContributionsV2() {
        return this.fromRetirementContributionsV2;
    }

    public final Optional<ApiPaymentInstrumentPermissions> getDebitCardInstrumentStatusPermissionsOptional() {
        return this.debitCardInstrumentStatusPermissionsOptional;
    }

    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    public final boolean getUseUkAddAccountExperience() {
        return this.useUkAddAccountExperience;
    }

    public final boolean getInFirstPartyOutgoingWireMode() {
        return this.inFirstPartyOutgoingWireMode;
    }

    public final RecipientType getOutgoingWireRecipientType() {
        return this.outgoingWireRecipientType;
    }

    public final boolean getResetAccountSelectionOnBackPressed() {
        return this.resetAccountSelectionOnBackPressed;
    }

    public final MenuState getMenuState() {
        if (!this.isOutgoingWire || this.outgoingWireRecipientType == null || this.direction != TransferAccountDirection.SINK || this.accountDisplayDataList.isEmpty()) {
            return null;
        }
        if (this.isEditing) {
            return MenuState.DONE;
        }
        return MenuState.EDIT;
    }

    public final List<TransferAccountsAdapter.RowItem> getRowItems() {
        TransferAccount transferAccount;
        IraContributionType iraContributionType;
        if (this.direction == TransferAccountDirection.SOURCE && (transferAccount = this.transactingAccount) != null && transferAccount.isIra() && (iraContributionType = this.iraContributionType) != null && iraContributionType.isMatchEligible()) {
            return getExternalThenInternalRows();
        }
        if (this.fromRetirementContributionsV2 && this.direction == TransferAccountDirection.SINK) {
            return getRowItemsContributionsSinkSelection();
        }
        if (this.isOutgoingWire) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
            if (i == 1) {
                return getInternalRows();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return getRowItemsOutgoingWire();
        }
        TransferAccountSelectionKey.GuidedTransfersData guidedTransfersData = this.guidedTransfersData;
        if (guidedTransfersData == null) {
            return getInternalThenExternalRows();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[guidedTransfersData.getTransferDirection().ordinal()];
        if (i2 == 1) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
            if (i3 == 1) {
                return getExternalRows();
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return getInternalRows();
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i4 == 1) {
            return getInternalRows();
        }
        if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getInternalThenExternalRows();
    }

    private final List<TransferAccountsAdapter.RowItem> getInternalRows() {
        if (this.useUkAddAccountExperience) {
            return CollectionsKt.emptyList();
        }
        List<TransferAccountsAdapter.RowItem> listMapToRowsWithBanners = MapToRowsWithBanners.mapToRowsWithBanners(this.internalAccounts, this.transactingAccount, this.banners, this.isEditing, false, this.iraContributionType, this.isInInterEntityMatchExperiment, this.matchRateOverrideValues, this.outgoingWireRecipientType);
        return (listMapToRowsWithBanners.size() > 1 || (this.fromRetirementContributionsV2 && listMapToRowsWithBanners.size() == 1)) ? CollectionsKt.plus((Collection) CollectionsKt.listOf(new TransferAccountsAdapter.RowItem.Header(INTERNAL_ACCOUNT_HEADER)), (Iterable) listMapToRowsWithBanners) : listMapToRowsWithBanners;
    }

    private final List<TransferAccountsAdapter.RowItem> getExternalRows() {
        List<AccountTransferDisplayData> listEmptyList;
        TransferAccountDirection transferAccountDirection;
        int i;
        ArrayList arrayList = new ArrayList();
        TransferAccount transferAccount = this.transactingAccountIfFixed;
        boolean z = false;
        if (transferAccount != null && transferAccount.isExternal()) {
            z = true;
        }
        if (z && this.guidedTransfersData == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = this.externalAccounts;
        }
        List<TransferAccountsAdapter.RowItem> listMapToRowsWithBanners = MapToRowsWithBanners.mapToRowsWithBanners(listEmptyList, this.transactingAccount, this.banners, this.isEditing, true, this.iraContributionType, this.isInInterEntityMatchExperiment, this.matchRateOverrideValues, this.outgoingWireRecipientType);
        if (!listMapToRowsWithBanners.isEmpty()) {
            if (this.useUkAddAccountExperience) {
                i = EXTERNAL_ACCOUNT_UK_HEADER;
            } else {
                i = EXTERNAL_ACCOUNT_US_HEADER;
            }
            arrayList.add(new TransferAccountsAdapter.RowItem.Header(i));
        }
        arrayList.addAll(listMapToRowsWithBanners);
        if ((!z && !this.useUkAddAccountExperience) || ((transferAccountDirection = this.direction) == TransferAccountDirection.SINK && (this.inFirstPartyOutgoingWireMode || this.outgoingWireRecipientType != null))) {
            arrayList.add(new TransferAccountsAdapter.RowItem.AddExternalAccount(this.outgoingWireRecipientType));
            return arrayList;
        }
        if (transferAccountDirection == TransferAccountDirection.SOURCE && this.useUkAddAccountExperience && this.externalAccounts.size() < 3) {
            arrayList.add(TransferAccountsAdapter.RowItem.AddUkAccount.INSTANCE);
        }
        return arrayList;
    }

    private final List<TransferAccountsAdapter.RowItem> getExternalThenInternalRows() {
        return CollectionsKt.plus((Collection) getExternalRows(), (Iterable) getInternalRows());
    }

    private final List<TransferAccountsAdapter.RowItem> getRowItemsContributionsSinkSelection() {
        List<AccountTransferDisplayData> list = this.accountDisplayDataList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountTransferDisplayData) obj).getAccount().isIra()) {
                arrayList.add(obj);
            }
        }
        return MapToRowsWithBanners.mapToRowsWithBanners(arrayList, this.transactingAccount, this.banners, this.isEditing, false, this.iraContributionType, this.isInInterEntityMatchExperiment, this.matchRateOverrideValues, this.outgoingWireRecipientType);
    }

    private final List<TransferAccountsAdapter.RowItem> getRowItemsOutgoingWire() {
        List<AccountTransferDisplayData> list = this.accountDisplayDataList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountTransferDisplayData) obj).getAccount().getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new TransferAccountsAdapter.RowItem.Account(this.isEditing, (AccountTransferDisplayData) it.next(), this.transactingAccount, null, false, true, this.outgoingWireRecipientType, null, null, 384, null));
        }
        List<TransferAccountsAdapter.RowItem> mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        if (this.direction == TransferAccountDirection.SINK && (this.inFirstPartyOutgoingWireMode || this.outgoingWireRecipientType != null)) {
            mutableList.add(new TransferAccountsAdapter.RowItem.AddExternalAccount(this.outgoingWireRecipientType));
        }
        return mutableList;
    }

    private final List<TransferAccountsAdapter.RowItem> getInternalThenExternalRows() {
        return CollectionsKt.plus((Collection) getInternalRows(), (Iterable) getExternalRows());
    }

    public final int getTitleTextResId() {
        return this.titleTextResId;
    }

    public final RichText getSubtitleRichText() {
        return this.subtitleRichText;
    }

    public final boolean isWiresUpsellVisible() {
        return !this.isOutgoingWire && this.isInWireTransferRegionGate && this.direction == TransferAccountDirection.SOURCE;
    }

    public final StringResource getEnokiText() {
        if (getShowEnokiText()) {
            return StringResource.INSTANCE.invoke(C30065R.string.enoki_footer_text, new Object[0]);
        }
        return null;
    }

    private final boolean getShowEnokiText() {
        IraContributionType iraContributionType = this.iraContributionType;
        Boolean boolValueOf = iraContributionType != null ? Boolean.valueOf(iraContributionType.isMatchEligible()) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            TransferAccount transferAccount = this.transactingAccount;
            return ((transferAccount != null && transferAccount.isIra() && this.transactingAccount.isEnokiEnabled()) || this.isInInterEntityMatchExperiment) && Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        TransferAccount transferAccount2 = this.transactingAccount;
        return ((transferAccount2 != null && transferAccount2.isExternal() && this.transactingAccount.isEnokiEnabled()) || this.isInInterEntityMatchExperiment) && !Intrinsics.areEqual(boolValueOf, Boolean.FALSE);
    }

    /* compiled from: TransferAccountsViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "serviceFeeDisplayText", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getServiceFeeDisplayText", "()Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountTransferDisplayData {
        public static final int $stable = 8;
        private final TransferAccount account;
        private final ServiceFeeDisplayText serviceFeeDisplayText;

        public static /* synthetic */ AccountTransferDisplayData copy$default(AccountTransferDisplayData accountTransferDisplayData, TransferAccount transferAccount, ServiceFeeDisplayText serviceFeeDisplayText, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = accountTransferDisplayData.account;
            }
            if ((i & 2) != 0) {
                serviceFeeDisplayText = accountTransferDisplayData.serviceFeeDisplayText;
            }
            return accountTransferDisplayData.copy(transferAccount, serviceFeeDisplayText);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final ServiceFeeDisplayText getServiceFeeDisplayText() {
            return this.serviceFeeDisplayText;
        }

        public final AccountTransferDisplayData copy(TransferAccount account, ServiceFeeDisplayText serviceFeeDisplayText) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new AccountTransferDisplayData(account, serviceFeeDisplayText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountTransferDisplayData)) {
                return false;
            }
            AccountTransferDisplayData accountTransferDisplayData = (AccountTransferDisplayData) other;
            return Intrinsics.areEqual(this.account, accountTransferDisplayData.account) && Intrinsics.areEqual(this.serviceFeeDisplayText, accountTransferDisplayData.serviceFeeDisplayText);
        }

        public int hashCode() {
            int iHashCode = this.account.hashCode() * 31;
            ServiceFeeDisplayText serviceFeeDisplayText = this.serviceFeeDisplayText;
            return iHashCode + (serviceFeeDisplayText == null ? 0 : serviceFeeDisplayText.hashCode());
        }

        public String toString() {
            return "AccountTransferDisplayData(account=" + this.account + ", serviceFeeDisplayText=" + this.serviceFeeDisplayText + ")";
        }

        public AccountTransferDisplayData(TransferAccount account, ServiceFeeDisplayText serviceFeeDisplayText) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.serviceFeeDisplayText = serviceFeeDisplayText;
        }

        public final TransferAccount getAccount() {
            return this.account;
        }

        public final ServiceFeeDisplayText getServiceFeeDisplayText() {
            return this.serviceFeeDisplayText;
        }
    }

    /* compiled from: TransferAccountsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;", "", "matchaPrimaryText", "", "matchaGrayResource", "grayFeeText", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getMatchaPrimaryText", "()I", "getMatchaGrayResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGrayFeeText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;", "equals", "", "other", "hashCode", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ServiceFeeDisplayText {
        public static final int $stable = 0;
        private final String grayFeeText;
        private final Integer matchaGrayResource;
        private final int matchaPrimaryText;

        public static /* synthetic */ ServiceFeeDisplayText copy$default(ServiceFeeDisplayText serviceFeeDisplayText, int i, Integer num, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = serviceFeeDisplayText.matchaPrimaryText;
            }
            if ((i2 & 2) != 0) {
                num = serviceFeeDisplayText.matchaGrayResource;
            }
            if ((i2 & 4) != 0) {
                str = serviceFeeDisplayText.grayFeeText;
            }
            return serviceFeeDisplayText.copy(i, num, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMatchaPrimaryText() {
            return this.matchaPrimaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMatchaGrayResource() {
            return this.matchaGrayResource;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGrayFeeText() {
            return this.grayFeeText;
        }

        public final ServiceFeeDisplayText copy(int matchaPrimaryText, Integer matchaGrayResource, String grayFeeText) {
            return new ServiceFeeDisplayText(matchaPrimaryText, matchaGrayResource, grayFeeText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceFeeDisplayText)) {
                return false;
            }
            ServiceFeeDisplayText serviceFeeDisplayText = (ServiceFeeDisplayText) other;
            return this.matchaPrimaryText == serviceFeeDisplayText.matchaPrimaryText && Intrinsics.areEqual(this.matchaGrayResource, serviceFeeDisplayText.matchaGrayResource) && Intrinsics.areEqual(this.grayFeeText, serviceFeeDisplayText.grayFeeText);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.matchaPrimaryText) * 31;
            Integer num = this.matchaGrayResource;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.grayFeeText;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ServiceFeeDisplayText(matchaPrimaryText=" + this.matchaPrimaryText + ", matchaGrayResource=" + this.matchaGrayResource + ", grayFeeText=" + this.grayFeeText + ")";
        }

        public ServiceFeeDisplayText(int i, Integer num, String str) {
            this.matchaPrimaryText = i;
            this.matchaGrayResource = num;
            this.grayFeeText = str;
        }

        public final int getMatchaPrimaryText() {
            return this.matchaPrimaryText;
        }

        public final Integer getMatchaGrayResource() {
            return this.matchaGrayResource;
        }

        public final String getGrayFeeText() {
            return this.grayFeeText;
        }
    }
}
