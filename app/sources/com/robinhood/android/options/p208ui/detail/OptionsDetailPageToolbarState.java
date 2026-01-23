package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.models.p320db.OptionChain;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageToolbarState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "", "title", "", "subtitle", "menuItems", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;)V", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "getMenuItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MenuItemState", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageToolbarState {
    public static final int $stable = 8;
    private final List<MenuItemState> menuItems;
    private final CharSequence subtitle;
    private final CharSequence title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsDetailPageToolbarState copy$default(OptionsDetailPageToolbarState optionsDetailPageToolbarState, CharSequence charSequence, CharSequence charSequence2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = optionsDetailPageToolbarState.title;
        }
        if ((i & 2) != 0) {
            charSequence2 = optionsDetailPageToolbarState.subtitle;
        }
        if ((i & 4) != 0) {
            list = optionsDetailPageToolbarState.menuItems;
        }
        return optionsDetailPageToolbarState.copy(charSequence, charSequence2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final List<MenuItemState> component3() {
        return this.menuItems;
    }

    public final OptionsDetailPageToolbarState copy(CharSequence title, CharSequence subtitle, List<? extends MenuItemState> menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        return new OptionsDetailPageToolbarState(title, subtitle, menuItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageToolbarState)) {
            return false;
        }
        OptionsDetailPageToolbarState optionsDetailPageToolbarState = (OptionsDetailPageToolbarState) other;
        return Intrinsics.areEqual(this.title, optionsDetailPageToolbarState.title) && Intrinsics.areEqual(this.subtitle, optionsDetailPageToolbarState.subtitle) && Intrinsics.areEqual(this.menuItems, optionsDetailPageToolbarState.menuItems);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.menuItems.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.subtitle;
        return "OptionsDetailPageToolbarState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", menuItems=" + this.menuItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsDetailPageToolbarState(CharSequence title, CharSequence subtitle, List<? extends MenuItemState> menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.title = title;
        this.subtitle = subtitle;
        this.menuItems = menuItems;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final List<MenuItemState> getMenuItems() {
        return this.menuItems;
    }

    /* compiled from: OptionsDetailPageToolbarState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "", "<init>", "()V", "ViewUnderlier", "PictureInPicture", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState$PictureInPicture;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState$ViewUnderlier;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MenuItemState {
        public static final int $stable = 0;

        public /* synthetic */ MenuItemState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MenuItemState() {
        }

        /* compiled from: OptionsDetailPageToolbarState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState$ViewUnderlier;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "symbol", "", "underlierInstrumentId", "Ljava/util/UUID;", "accountNumber", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getSymbol", "()Ljava/lang/String;", "getUnderlierInstrumentId", "()Ljava/util/UUID;", "getAccountNumber", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getUnderlyingFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ViewUnderlier extends MenuItemState {
            public static final int $stable = 8;
            private final String accountNumber;
            private final String symbol;
            private final UUID underlierInstrumentId;
            private final OptionChain.UnderlyingType underlyingType;

            /* compiled from: OptionsDetailPageToolbarState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionChain.UnderlyingType.values().length];
                    try {
                        iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static /* synthetic */ ViewUnderlier copy$default(ViewUnderlier viewUnderlier, String str, UUID uuid, String str2, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = viewUnderlier.symbol;
                }
                if ((i & 2) != 0) {
                    uuid = viewUnderlier.underlierInstrumentId;
                }
                if ((i & 4) != 0) {
                    str2 = viewUnderlier.accountNumber;
                }
                if ((i & 8) != 0) {
                    underlyingType = viewUnderlier.underlyingType;
                }
                return viewUnderlier.copy(str, uuid, str2, underlyingType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component2, reason: from getter */
            public final UUID getUnderlierInstrumentId() {
                return this.underlierInstrumentId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component4, reason: from getter */
            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            public final ViewUnderlier copy(String symbol, UUID underlierInstrumentId, String accountNumber, OptionChain.UnderlyingType underlyingType) {
                Intrinsics.checkNotNullParameter(underlierInstrumentId, "underlierInstrumentId");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                return new ViewUnderlier(symbol, underlierInstrumentId, accountNumber, underlyingType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewUnderlier)) {
                    return false;
                }
                ViewUnderlier viewUnderlier = (ViewUnderlier) other;
                return Intrinsics.areEqual(this.symbol, viewUnderlier.symbol) && Intrinsics.areEqual(this.underlierInstrumentId, viewUnderlier.underlierInstrumentId) && Intrinsics.areEqual(this.accountNumber, viewUnderlier.accountNumber) && this.underlyingType == viewUnderlier.underlyingType;
            }

            public int hashCode() {
                String str = this.symbol;
                return ((((((str == null ? 0 : str.hashCode()) * 31) + this.underlierInstrumentId.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.underlyingType.hashCode();
            }

            public String toString() {
                return "ViewUnderlier(symbol=" + this.symbol + ", underlierInstrumentId=" + this.underlierInstrumentId + ", accountNumber=" + this.accountNumber + ", underlyingType=" + this.underlyingType + ")";
            }

            public final String getSymbol() {
                return this.symbol;
            }

            public final UUID getUnderlierInstrumentId() {
                return this.underlierInstrumentId;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewUnderlier(String str, UUID underlierInstrumentId, String accountNumber, OptionChain.UnderlyingType underlyingType) {
                super(null);
                Intrinsics.checkNotNullParameter(underlierInstrumentId, "underlierInstrumentId");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                this.symbol = str;
                this.underlierInstrumentId = underlierInstrumentId;
                this.accountNumber = accountNumber;
                this.underlyingType = underlyingType;
            }

            public final FragmentKey getUnderlyingFragmentKey() {
                int i = WhenMappings.$EnumSwitchMapping$0[this.underlyingType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new IndexDetailPageFragmentKey(this.underlierInstrumentId, this.accountNumber, IndexDetailPageFragmentKey2.OptionDetailPage.INSTANCE);
                }
                return new LegacyFragmentKey.EquityInstrumentDetail(this.underlierInstrumentId, null, this.accountNumber, InstrumentDetailSource.OPTIONS_DETAIL, false, 18, null);
            }
        }

        /* compiled from: OptionsDetailPageToolbarState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState$PictureInPicture;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "underlierInstrumentId", "Ljava/util/UUID;", "optionChainId", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "tickerSymbol", "", "strategyCode", "displayName", "accountNumber", "isLegContext", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getUnderlierInstrumentId", "()Ljava/util/UUID;", "getOptionChainId", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getTickerSymbol", "()Ljava/lang/String;", "getStrategyCode", "getDisplayName", "getAccountNumber", "()Z", "navigationKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getNavigationKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PictureInPicture extends MenuItemState {
            public static final int $stable = 8;
            private final String accountNumber;
            private final String displayName;
            private final boolean isLegContext;
            private final UUID optionChainId;
            private final String strategyCode;
            private final String tickerSymbol;
            private final UUID underlierInstrumentId;
            private final OptionChain.UnderlyingType underlyingType;

            public static /* synthetic */ PictureInPicture copy$default(PictureInPicture pictureInPicture, UUID uuid, UUID uuid2, OptionChain.UnderlyingType underlyingType, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = pictureInPicture.underlierInstrumentId;
                }
                if ((i & 2) != 0) {
                    uuid2 = pictureInPicture.optionChainId;
                }
                if ((i & 4) != 0) {
                    underlyingType = pictureInPicture.underlyingType;
                }
                if ((i & 8) != 0) {
                    str = pictureInPicture.tickerSymbol;
                }
                if ((i & 16) != 0) {
                    str2 = pictureInPicture.strategyCode;
                }
                if ((i & 32) != 0) {
                    str3 = pictureInPicture.displayName;
                }
                if ((i & 64) != 0) {
                    str4 = pictureInPicture.accountNumber;
                }
                if ((i & 128) != 0) {
                    z = pictureInPicture.isLegContext;
                }
                String str5 = str4;
                boolean z2 = z;
                String str6 = str2;
                String str7 = str3;
                return pictureInPicture.copy(uuid, uuid2, underlyingType, str, str6, str7, str5, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getUnderlierInstrumentId() {
                return this.underlierInstrumentId;
            }

            /* renamed from: component2, reason: from getter */
            public final UUID getOptionChainId() {
                return this.optionChainId;
            }

            /* renamed from: component3, reason: from getter */
            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTickerSymbol() {
                return this.tickerSymbol;
            }

            /* renamed from: component5, reason: from getter */
            public final String getStrategyCode() {
                return this.strategyCode;
            }

            /* renamed from: component6, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            /* renamed from: component7, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getIsLegContext() {
                return this.isLegContext;
            }

            public final PictureInPicture copy(UUID underlierInstrumentId, UUID optionChainId, OptionChain.UnderlyingType underlyingType, String tickerSymbol, String strategyCode, String displayName, String accountNumber, boolean isLegContext) {
                Intrinsics.checkNotNullParameter(underlierInstrumentId, "underlierInstrumentId");
                Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
                Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new PictureInPicture(underlierInstrumentId, optionChainId, underlyingType, tickerSymbol, strategyCode, displayName, accountNumber, isLegContext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PictureInPicture)) {
                    return false;
                }
                PictureInPicture pictureInPicture = (PictureInPicture) other;
                return Intrinsics.areEqual(this.underlierInstrumentId, pictureInPicture.underlierInstrumentId) && Intrinsics.areEqual(this.optionChainId, pictureInPicture.optionChainId) && this.underlyingType == pictureInPicture.underlyingType && Intrinsics.areEqual(this.tickerSymbol, pictureInPicture.tickerSymbol) && Intrinsics.areEqual(this.strategyCode, pictureInPicture.strategyCode) && Intrinsics.areEqual(this.displayName, pictureInPicture.displayName) && Intrinsics.areEqual(this.accountNumber, pictureInPicture.accountNumber) && this.isLegContext == pictureInPicture.isLegContext;
            }

            public int hashCode() {
                return (((((((((((((this.underlierInstrumentId.hashCode() * 31) + this.optionChainId.hashCode()) * 31) + this.underlyingType.hashCode()) * 31) + this.tickerSymbol.hashCode()) * 31) + this.strategyCode.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isLegContext);
            }

            public String toString() {
                return "PictureInPicture(underlierInstrumentId=" + this.underlierInstrumentId + ", optionChainId=" + this.optionChainId + ", underlyingType=" + this.underlyingType + ", tickerSymbol=" + this.tickerSymbol + ", strategyCode=" + this.strategyCode + ", displayName=" + this.displayName + ", accountNumber=" + this.accountNumber + ", isLegContext=" + this.isLegContext + ")";
            }

            public final UUID getUnderlierInstrumentId() {
                return this.underlierInstrumentId;
            }

            public final UUID getOptionChainId() {
                return this.optionChainId;
            }

            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            public final String getTickerSymbol() {
                return this.tickerSymbol;
            }

            public final String getStrategyCode() {
                return this.strategyCode;
            }

            public final String getDisplayName() {
                return this.displayName;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final boolean isLegContext() {
                return this.isLegContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PictureInPicture(UUID underlierInstrumentId, UUID optionChainId, OptionChain.UnderlyingType underlyingType, String tickerSymbol, String strategyCode, String displayName, String accountNumber, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(underlierInstrumentId, "underlierInstrumentId");
                Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
                Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.underlierInstrumentId = underlierInstrumentId;
                this.optionChainId = optionChainId;
                this.underlyingType = underlyingType;
                this.tickerSymbol = tickerSymbol;
                this.strategyCode = strategyCode;
                this.displayName = displayName;
                this.accountNumber = accountNumber;
                this.isLegContext = z;
            }

            public final IntentKey getNavigationKey() {
                return new PictureInPictureKey.Option(this.underlierInstrumentId, this.optionChainId, this.underlyingType, this.tickerSymbol, this.strategyCode, this.displayName, this.accountNumber, this.isLegContext);
            }
        }
    }
}
