package com.robinhood.android.assethomes;

import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeStateProvider3;
import com.robinhood.android.equities.contracts.ScreenerTableEntryIntentKey;
import com.robinhood.android.equities.contracts.ScreenerTableKeys2;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.retirement.contracts.RetirementUninvestedModal;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomeStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBar;", "", "action", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "getAction", "()Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "bottomBarText", "", "getBottomBarText", "()Ljava/lang/Integer;", "AssetHomeRetirementBottomBar", "AssetHomeIndividualBottomBar", "Lcom/robinhood/android/assethomes/AssetHomeBottomBar$AssetHomeIndividualBottomBar;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBar$AssetHomeRetirementBottomBar;", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBar, reason: use source file name */
/* loaded from: classes7.dex */
public interface AssetHomeStateProvider2 {
    AssetHomeStateProvider3 getAction();

    Integer getBottomBarText();

    /* compiled from: AssetHomeStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÂ\u0003J0\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBar$AssetHomeRetirementBottomBar;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBar;", "bottomBarText", "", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "retirementUninvestedViewModel", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "<init>", "(Ljava/lang/Integer;Lcom/robinhood/android/models/portfolio/api/AssetType;Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;)V", "getBottomBarText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "action", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "getAction", "()Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/robinhood/android/models/portfolio/api/AssetType;Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;)Lcom/robinhood/android/assethomes/AssetHomeBottomBar$AssetHomeRetirementBottomBar;", "equals", "", "other", "", "hashCode", "toString", "", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBar$AssetHomeRetirementBottomBar, reason: from toString */
    public static final /* data */ class AssetHomeRetirementBottomBar implements AssetHomeStateProvider2 {
        public static final int $stable = 8;
        private final AssetHomeStateProvider3 action;
        private final AssetType assetType;
        private final Integer bottomBarText;
        private final RetirementUninvestedViewModel retirementUninvestedViewModel;

        /* compiled from: AssetHomeStateProvider.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBar$AssetHomeRetirementBottomBar$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetType.values().length];
                try {
                    iArr[AssetType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetType.OPTIONS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetType.FUTURES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component2, reason: from getter */
        private final AssetType getAssetType() {
            return this.assetType;
        }

        /* renamed from: component3, reason: from getter */
        private final RetirementUninvestedViewModel getRetirementUninvestedViewModel() {
            return this.retirementUninvestedViewModel;
        }

        public static /* synthetic */ AssetHomeRetirementBottomBar copy$default(AssetHomeRetirementBottomBar assetHomeRetirementBottomBar, Integer num, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                num = assetHomeRetirementBottomBar.bottomBarText;
            }
            if ((i & 2) != 0) {
                assetType = assetHomeRetirementBottomBar.assetType;
            }
            if ((i & 4) != 0) {
                retirementUninvestedViewModel = assetHomeRetirementBottomBar.retirementUninvestedViewModel;
            }
            return assetHomeRetirementBottomBar.copy(num, assetType, retirementUninvestedViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getBottomBarText() {
            return this.bottomBarText;
        }

        public final AssetHomeRetirementBottomBar copy(Integer bottomBarText, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            return new AssetHomeRetirementBottomBar(bottomBarText, assetType, retirementUninvestedViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetHomeRetirementBottomBar)) {
                return false;
            }
            AssetHomeRetirementBottomBar assetHomeRetirementBottomBar = (AssetHomeRetirementBottomBar) other;
            return Intrinsics.areEqual(this.bottomBarText, assetHomeRetirementBottomBar.bottomBarText) && this.assetType == assetHomeRetirementBottomBar.assetType && Intrinsics.areEqual(this.retirementUninvestedViewModel, assetHomeRetirementBottomBar.retirementUninvestedViewModel);
        }

        public int hashCode() {
            Integer num = this.bottomBarText;
            int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.assetType.hashCode()) * 31;
            RetirementUninvestedViewModel retirementUninvestedViewModel = this.retirementUninvestedViewModel;
            return iHashCode + (retirementUninvestedViewModel != null ? retirementUninvestedViewModel.hashCode() : 0);
        }

        public String toString() {
            return "AssetHomeRetirementBottomBar(bottomBarText=" + this.bottomBarText + ", assetType=" + this.assetType + ", retirementUninvestedViewModel=" + this.retirementUninvestedViewModel + ")";
        }

        public AssetHomeRetirementBottomBar(Integer num, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel) {
            RetirementUninvestedViewModel.MobileCta mobileReorderCta;
            RetirementUninvestedViewModel.OptionsOnlyMobileContent optionsOnlyMobileContent;
            RetirementUninvestedViewModel.MobileContent mobileContent;
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.bottomBarText = num;
            this.assetType = assetType;
            this.retirementUninvestedViewModel = retirementUninvestedViewModel;
            int i = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
            AssetHomeStateProvider3 assetHomeBottomBarActionFragmentKey = null;
            if (i == 1) {
                if (retirementUninvestedViewModel == null || (mobileContent = retirementUninvestedViewModel.getMobileContent()) == null || (mobileReorderCta = mobileContent.getCta()) == null) {
                    if (retirementUninvestedViewModel == null || (optionsOnlyMobileContent = retirementUninvestedViewModel.getOptionsOnlyMobileContent()) == null) {
                        mobileReorderCta = retirementUninvestedViewModel != null ? retirementUninvestedViewModel.getMobileReorderCta() : null;
                    } else {
                        mobileReorderCta = optionsOnlyMobileContent.getCta();
                    }
                }
                if (mobileReorderCta instanceof RetirementUninvestedViewModel.MobileCta.Deeplink) {
                    assetHomeBottomBarActionFragmentKey = new AssetHomeStateProvider3.AssetHomeBottomBarActionUri(Uri.parse(((RetirementUninvestedViewModel.MobileCta.Deeplink) mobileReorderCta).getData()));
                } else if (mobileReorderCta instanceof RetirementUninvestedViewModel.MobileCta.Modal) {
                    assetHomeBottomBarActionFragmentKey = new AssetHomeStateProvider3.AssetHomeBottomBarActionFragmentKey(new RetirementUninvestedModal(((RetirementUninvestedViewModel.MobileCta.Modal) mobileReorderCta).getData(), new Screen(Screen.Name.ASSET_HOME, assetType.getServerValue(), null, null, 12, null), (RetirementUninvestedModal.UninvestedLoggingInfo) null));
                }
            } else if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.action = assetHomeBottomBarActionFragmentKey;
        }

        @Override // com.robinhood.android.assethomes.AssetHomeStateProvider2
        public Integer getBottomBarText() {
            return this.bottomBarText;
        }

        @Override // com.robinhood.android.assethomes.AssetHomeStateProvider2
        public AssetHomeStateProvider3 getAction() {
            return this.action;
        }
    }

    /* compiled from: AssetHomeStateProvider.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003J.\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeBottomBar$AssetHomeIndividualBottomBar;", "Lcom/robinhood/android/assethomes/AssetHomeBottomBar;", "bottomBarText", "", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "accountNumber", "", "<init>", "(Ljava/lang/Integer;Lcom/robinhood/android/models/portfolio/api/AssetType;Ljava/lang/String;)V", "getBottomBarText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "action", "Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "getAction", "()Lcom/robinhood/android/assethomes/AssetHomeBottomBarAction;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/robinhood/android/models/portfolio/api/AssetType;Ljava/lang/String;)Lcom/robinhood/android/assethomes/AssetHomeBottomBar$AssetHomeIndividualBottomBar;", "equals", "", "other", "", "hashCode", "toString", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBar$AssetHomeIndividualBottomBar, reason: from toString */
    public static final /* data */ class AssetHomeIndividualBottomBar implements AssetHomeStateProvider2 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final AssetHomeStateProvider3 action;
        private final AssetType assetType;
        private final Integer bottomBarText;

        /* compiled from: AssetHomeStateProvider.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBar$AssetHomeIndividualBottomBar$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetType.values().length];
                try {
                    iArr[AssetType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetType.OPTIONS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component2, reason: from getter */
        private final AssetType getAssetType() {
            return this.assetType;
        }

        /* renamed from: component3, reason: from getter */
        private final String getAccountNumber() {
            return this.accountNumber;
        }

        public static /* synthetic */ AssetHomeIndividualBottomBar copy$default(AssetHomeIndividualBottomBar assetHomeIndividualBottomBar, Integer num, AssetType assetType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = assetHomeIndividualBottomBar.bottomBarText;
            }
            if ((i & 2) != 0) {
                assetType = assetHomeIndividualBottomBar.assetType;
            }
            if ((i & 4) != 0) {
                str = assetHomeIndividualBottomBar.accountNumber;
            }
            return assetHomeIndividualBottomBar.copy(num, assetType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getBottomBarText() {
            return this.bottomBarText;
        }

        public final AssetHomeIndividualBottomBar copy(Integer bottomBarText, AssetType assetType, String accountNumber) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new AssetHomeIndividualBottomBar(bottomBarText, assetType, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetHomeIndividualBottomBar)) {
                return false;
            }
            AssetHomeIndividualBottomBar assetHomeIndividualBottomBar = (AssetHomeIndividualBottomBar) other;
            return Intrinsics.areEqual(this.bottomBarText, assetHomeIndividualBottomBar.bottomBarText) && this.assetType == assetHomeIndividualBottomBar.assetType && Intrinsics.areEqual(this.accountNumber, assetHomeIndividualBottomBar.accountNumber);
        }

        public int hashCode() {
            Integer num = this.bottomBarText;
            return ((((num == null ? 0 : num.hashCode()) * 31) + this.assetType.hashCode()) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "AssetHomeIndividualBottomBar(bottomBarText=" + this.bottomBarText + ", assetType=" + this.assetType + ", accountNumber=" + this.accountNumber + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AssetHomeIndividualBottomBar(Integer num, AssetType assetType, String accountNumber) {
            AssetHomeStateProvider3.AssetHomeBottomBarActionIntentKey assetHomeBottomBarActionIntentKey;
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.bottomBarText = num;
            this.assetType = assetType;
            this.accountNumber = accountNumber;
            int i = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
            if (i == 1) {
                assetHomeBottomBarActionIntentKey = new AssetHomeStateProvider3.AssetHomeBottomBarActionIntentKey(new ScreenerTableEntryIntentKey(null, ScreenerTableKeys2.AssetHome, accountNumber, 1, null));
            } else if (i != 2) {
                assetHomeBottomBarActionIntentKey = null;
            } else {
                UUID uuid = null;
                String str = null;
                SearchFragmentKey.TargetSection targetSection = null;
                boolean z = false;
                String str2 = null;
                Object[] objArr = 0 == true ? 1 : 0;
                assetHomeBottomBarActionIntentKey = new AssetHomeStateProvider3.AssetHomeBottomBarActionIntentKey(new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new SearchFragmentKey(uuid, str, accountNumber, objArr, new Screen(Screen.Name.ASSET_HOME, assetType.getServerValue(), null, null, 12, null), targetSection, z, str2, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, null), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null));
            }
            this.action = assetHomeBottomBarActionIntentKey;
        }

        @Override // com.robinhood.android.assethomes.AssetHomeStateProvider2
        public Integer getBottomBarText() {
            return this.bottomBarText;
        }

        @Override // com.robinhood.android.assethomes.AssetHomeStateProvider2
        public AssetHomeStateProvider3 getAction() {
            return this.action;
        }
    }
}
