package com.robinhood.android.assethomes.shared;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewSection5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PortfolioAccountContext;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AssetHistoryPreviewSection.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001aL\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u001b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"HistoryPreviewCount", "", "assetHistoryParams", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "assetHistoryType", "Lcom/robinhood/android/assethomes/shared/AssetHistoryType;", "futuresSubAccountId", "Ljava/util/UUID;", "assetHistoryPreviewSection", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "keyPrefix", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/assethomes/shared/AssetHistoryType;Ljava/util/UUID;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function1;", "observeAssetHistoryPreviewItemCount", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/assethomes/shared/AssetHistoryType;Ljava/util/UUID;Landroidx/compose/runtime/Composer;II)I", "HistoryPreviewShowAll", "transactionTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;Lcom/robinhood/models/api/BrokerageAccountType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShowMoreIdentifier", "lib-asset-homes-shared_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.shared.AssetHistoryPreviewSectionKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHistoryPreviewSection {
    public static final int HistoryPreviewCount = 4;
    public static final String ShowMoreIdentifier = "show-more";

    /* compiled from: AssetHistoryPreviewSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.shared.AssetHistoryPreviewSectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryPreviewShowAll$lambda$1(AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, BrokerageAccountType brokerageAccountType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HistoryPreviewShowAll(accountsHistoryTransactionTypeFilter, brokerageAccountType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ HistoryPreviewListParams assetHistoryParams$default(String str, BrokerageAccountType brokerageAccountType, AssetHistoryPreviewSection2 assetHistoryPreviewSection2, UUID uuid, int i, Object obj) {
        if ((i & 8) != 0) {
            uuid = null;
        }
        return assetHistoryParams(str, brokerageAccountType, assetHistoryPreviewSection2, uuid);
    }

    public static final HistoryPreviewListParams assetHistoryParams(String accountNumber, BrokerageAccountType brokerageAccountType, AssetHistoryPreviewSection2 assetHistoryType, UUID uuid) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(assetHistoryType, "assetHistoryType");
        return new HistoryPreviewListParams(new HistoryStaticFilter(null, null, null, uuid, null, null, null, null, false, extensions2.persistentSetOf(new HistoryStaticFilter.RhsAccountContext(accountNumber, brokerageAccountType)), null, 1527, null), HistoryEvent.State.SETTLED, extensions2.toImmutableSet(assetHistoryType.getTransactionTypeFilter().supportedHistoryTransactionTypes()), 4, true);
    }

    public static final Function1<LazyListScope, Unit> assetHistoryPreviewSection(String accountNumber, final BrokerageAccountType brokerageAccountType, final AssetHistoryPreviewSection2 assetHistoryType, UUID uuid, String str, Composer composer, int i, int i2) {
        String str2;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(assetHistoryType, "assetHistoryType");
        composer.startReplaceGroup(1215537468);
        UUID uuid2 = (i2 & 8) != 0 ? null : uuid;
        if ((i2 & 16) != 0) {
            str2 = assetHistoryType.name() + "_asset_history_preview";
        } else {
            str2 = str;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1215537468, i, -1, "com.robinhood.android.assethomes.shared.assetHistoryPreviewSection (AssetHistoryPreviewSection.kt:69)");
        }
        Function1<LazyListScope, Unit> function1HistoryPreviewSection = HistoryPreviewSection5.historyPreviewSection(assetHistoryParams(accountNumber, brokerageAccountType, assetHistoryType, uuid2), true, null, ComposableLambda3.rememberComposableLambda(-1028680520, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.shared.AssetHistoryPreviewSectionKt.assetHistoryPreviewSection.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                invoke(lazyItemScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope historyPreviewSection, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                if ((i3 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1028680520, i3, -1, "com.robinhood.android.assethomes.shared.assetHistoryPreviewSection.<anonymous> (AssetHistoryPreviewSection.kt:78)");
                }
                AssetHistoryPreviewSection.HistoryPreviewShowAll(assetHistoryType.getTransactionTypeFilter(), brokerageAccountType, null, composer2, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), null, str2, null, composer, HistoryPreviewListParams.$stable | 3120 | ((i << 3) & 458752), 84);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1HistoryPreviewSection;
    }

    public static final int observeAssetHistoryPreviewItemCount(String accountNumber, BrokerageAccountType brokerageAccountType, AssetHistoryPreviewSection2 assetHistoryType, UUID uuid, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(assetHistoryType, "assetHistoryType");
        composer.startReplaceGroup(-2107638068);
        if ((i2 & 8) != 0) {
            uuid = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2107638068, i, -1, "com.robinhood.android.assethomes.shared.observeAssetHistoryPreviewItemCount (AssetHistoryPreviewSection.kt:102)");
        }
        int iObserveHistoryPreviewItemCount = HistoryPreviewSection5.observeHistoryPreviewItemCount(assetHistoryParams(accountNumber, brokerageAccountType, assetHistoryType, uuid), null, composer, HistoryPreviewListParams.$stable, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iObserveHistoryPreviewItemCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryPreviewShowAll(final AccountsHistoryTransactionTypeFilter transactionTypeFilter, final BrokerageAccountType brokerageAccountType, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int[] iArr;
        AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter;
        PortfolioAccountType portfolioAccountType;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1626381018);
        int i4 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(transactionTypeFilter.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1626381018, i3, -1, "com.robinhood.android.assethomes.shared.HistoryPreviewShowAll (AssetHistoryPreviewSection.kt:131)");
                }
                String strStringResource = StringResources_androidKt.stringResource(C9614R.string.history_show_all_cta, composerStartRestartGroup, 0);
                iArr = WhenMappings.$EnumSwitchMapping$0;
                switch (iArr[brokerageAccountType.ordinal()]) {
                    case 1:
                    case 2:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL;
                        break;
                    case 3:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS;
                        break;
                    case 4:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH;
                        break;
                    case 5:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL;
                        break;
                    case 6:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS;
                        break;
                    case 7:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.ALL;
                        break;
                    case 8:
                        accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                AccountsHistoryContract.Key key = new AccountsHistoryContract.Key(accountsHistoryAccountTypeFilter, transactionTypeFilter, null, null, true, null, 44, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component component = new Component(Component.ComponentType.BUTTON, "show-more", null, 4, null);
                Context contextOrNew = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext());
                switch (iArr[brokerageAccountType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        portfolioAccountType = PortfolioAccountType.INDIVIDUAL;
                        break;
                    case 4:
                    case 5:
                        portfolioAccountType = PortfolioAccountType.RETIREMENT;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                composer2 = composerStartRestartGroup;
                HistoryRowsKt.DefaultHistoryFooter(ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, Context.copy$default(contextOrNew, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PortfolioAccountContext(portfolioAccountType, null, i4, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -131073, -1, 16383, null), component, null, 39, null), true, false, false, true, false, null, 108, null), strStringResource, key, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.shared.AssetHistoryPreviewSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetHistoryPreviewSection.HistoryPreviewShowAll$lambda$1(transactionTypeFilter, brokerageAccountType, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String strStringResource2 = StringResources_androidKt.stringResource(C9614R.string.history_show_all_cta, composerStartRestartGroup, 0);
            iArr = WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[brokerageAccountType.ordinal()]) {
            }
            AccountsHistoryContract.Key key2 = new AccountsHistoryContract.Key(accountsHistoryAccountTypeFilter, transactionTypeFilter, null, null, true, null, 44, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component2 = new Component(Component.ComponentType.BUTTON, "show-more", null, 4, null);
            Context contextOrNew2 = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor2.getContext());
            switch (iArr[brokerageAccountType.ordinal()]) {
            }
            composer2 = composerStartRestartGroup;
            HistoryRowsKt.DefaultHistoryFooter(ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, Context.copy$default(contextOrNew2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PortfolioAccountContext(portfolioAccountType, null, i4, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -131073, -1, 16383, null), component2, null, 39, null), true, false, false, true, false, null, 108, null), strStringResource2, key2, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
