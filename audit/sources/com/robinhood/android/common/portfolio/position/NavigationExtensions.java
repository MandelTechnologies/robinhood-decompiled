package com.robinhood.android.common.portfolio.position;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.futures.contracts.FuturesOrderDetailFragmentKey;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode4;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.crypto.perpetuals.contracts.PerpetualDetailsFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: NavigationExtensions.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"positionId", "Ljava/util/UUID;", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "getPositionId", "(Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;)Ljava/util/UUID;", "positionIds", "Lkotlinx/collections/immutable/ImmutableList;", "", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "getPositionIds", "(Ljava/util/List;)Lkotlinx/collections/immutable/ImmutableList;", "associatedCodes", "", "getAssociatedCodes", "navigateToPositionDetails", "", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "position", "customNavigator", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.NavigationExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class NavigationExtensions {

    /* compiled from: NavigationExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.position.NavigationExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PositionInstrumentType.values().length];
            try {
                iArr[PositionInstrumentType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS_PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PositionInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PositionInstrumentType.PSP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES_PENDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT_PENDING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PositionInstrumentType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PositionsLocation.values().length];
            try {
                iArr2[PositionsLocation.HOME_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PositionsLocation.RETIREMENT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[PositionsLocation.ISA_TAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[PositionsLocation.CRYPTO_TAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[PositionsLocation.ASSET_HOME.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[PositionsLocation.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final UUID getPositionId(PositionsV2.PositionListItemV2 positionListItemV2) {
        Intrinsics.checkNotNullParameter(positionListItemV2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[positionListItemV2.getInstrumentType().ordinal()]) {
            case 1:
            case 2:
                return positionListItemV2.getMetadataId();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return positionListItemV2.getInstrumentId();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ImmutableList<UUID> getPositionIds(List<DisplayPositionListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DisplayPositionListItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getPositionId(((DisplayPositionListItem) it.next()).getPosition()));
        }
        return extensions2.toPersistentList(arrayList);
    }

    public static final ImmutableList<String> getAssociatedCodes(List<DisplayPositionListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String code = ((DisplayPositionListItem) it.next()).getPosition().getCode();
            if (code != null) {
                arrayList.add(code);
            }
        }
        return extensions2.toPersistentList(arrayList);
    }

    public static /* synthetic */ void navigateToPositionDetails$default(Navigator navigator, Context context, PositionsLocation positionsLocation, PositionsV2.PositionListItemV2 positionListItemV2, List list, List list2, Function1 function1, int i, Object obj) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        navigateToPositionDetails(navigator, context, positionsLocation, positionListItemV2, list, list2, function1);
    }

    public static final void navigateToPositionDetails(Navigator navigator, Context context, PositionsLocation positionsLocation, PositionsV2.PositionListItemV2 position, List<UUID> positionIds, List<String> associatedCodes, Function1<? super LegacyFragmentKey.EquityInstrumentDetail, Unit> function1) {
        InstrumentDetailSource instrumentDetailSource;
        OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4;
        PerpetualDetailsFragmentKey.SourceScreen sourceScreen;
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(positionIds, "positionIds");
        Intrinsics.checkNotNullParameter(associatedCodes, "associatedCodes");
        Screen screen = null;
        switch (WhenMappings.$EnumSwitchMapping$0[position.getInstrumentType().ordinal()]) {
            case 1:
            case 2:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(getPositionId(position), positionIds, false, null, WhenMappings.$EnumSwitchMapping$1[positionsLocation.ordinal()] == 4 ? CryptoDetailSource.HOLDINGS : null, position.getAccountNumber(), 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 3:
            case 5:
                UUID positionId = getPositionId(position);
                switch (WhenMappings.$EnumSwitchMapping$1[positionsLocation.ordinal()]) {
                    case 1:
                        instrumentDetailSource = InstrumentDetailSource.HOME_TAB_POSITIONS;
                        break;
                    case 2:
                        instrumentDetailSource = InstrumentDetailSource.RETIREMENT_TAB_POSITIONS;
                        break;
                    case 3:
                        instrumentDetailSource = InstrumentDetailSource.ISA_TAB_POSITIONS;
                        break;
                    case 4:
                        instrumentDetailSource = InstrumentDetailSource.CRYPTO_HOME_POSITIONS;
                        break;
                    case 5:
                        instrumentDetailSource = InstrumentDetailSource.ASSET_HOME;
                        break;
                    case 6:
                        instrumentDetailSource = InstrumentDetailSource.NONE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                LegacyFragmentKey.EquityInstrumentDetail equityInstrumentDetail = new LegacyFragmentKey.EquityInstrumentDetail(positionId, positionIds, position.getAccountNumber(), instrumentDetailSource, false, 16, null);
                if (function1 != null) {
                    function1.invoke(equityInstrumentDetail);
                    return;
                } else {
                    Navigator.DefaultImpls.showFragment$default(navigator, context, equityInstrumentDetail, false, false, false, null, false, null, false, false, null, null, 4092, null);
                    return;
                }
            case 4:
            case 7:
            case 8:
            case 9:
            case 15:
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(position.getDeeplink()), null, null, false, null, 60, null);
                return;
            case 6:
                String code = position.getCode();
                if (code != null) {
                    String accountNumber = position.getAccountNumber();
                    if (WhenMappings.$EnumSwitchMapping$1[positionsLocation.ordinal()] == 1) {
                        optionsDetailPageLaunchMode4 = OptionsDetailPageLaunchMode4.HOME;
                    } else {
                        optionsDetailPageLaunchMode4 = OptionsDetailPageLaunchMode4.OTHER;
                    }
                    Navigator.DefaultImpls.showFragment$default(navigator, context, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(code, false, associatedCodes, accountNumber, optionsDetailPageLaunchMode4, 2, null)), false, false, false, null, false, null, false, false, null, null, 4092, null);
                    return;
                }
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(position.getDeeplink()), null, null, false, null, 60, null);
                return;
            case 10:
                UUID positionId2 = getPositionId(position);
                switch (WhenMappings.$EnumSwitchMapping$1[positionsLocation.ordinal()]) {
                    case 1:
                        screen = new Screen(Screen.Name.HOME, null, null, null, 14, null);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        break;
                    case 5:
                        screen = new Screen(Screen.Name.ASSET_HOME, null, null, null, 14, null);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Navigator.DefaultImpls.showFragment$default(navigator, context, new FuturesDetailFragmentKey.ByContractId(positionId2, screen, FuturesAnalyticsStrings.ENTRY_POINT_FUTURES_POSITION), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 11:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new FuturesOrderDetailFragmentKey(getPositionId(position)), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 12:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new EventDetailRoutingFragmentKey(position.getMetadataId(), EcUuidType.CONTRACT_ID, EventAnalyticsString.ENTRY_POINT_EC_POSITION, false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 13:
                Navigator.DefaultImpls.showFragment$default(navigator, context, new EventDetailRoutingFragmentKey(position.getMetadataId(), EcUuidType.CONTRACT_ID, EventAnalyticsString.ENTRY_POINT_EC_PENDING_ORDER, false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            case 14:
                UUID metadataId = position.getMetadataId();
                FragmentTab fragmentTab = FragmentTab.CURRENT_TAB;
                if (WhenMappings.$EnumSwitchMapping$1[positionsLocation.ordinal()] == 4) {
                    sourceScreen = PerpetualDetailsFragmentKey.SourceScreen.CHT_HOLDINGS_SECTION;
                } else {
                    sourceScreen = PerpetualDetailsFragmentKey.SourceScreen.UNKNOWN;
                }
                Navigator.DefaultImpls.showFragment$default(navigator, context, new PerpetualDetailsFragmentKey(metadataId, sourceScreen.name(), fragmentTab), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
