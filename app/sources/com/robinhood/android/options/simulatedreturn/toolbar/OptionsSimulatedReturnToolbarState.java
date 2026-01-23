package com.robinhood.android.options.simulatedreturn.toolbar;

import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.p320db.OptionChain;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnToolbarState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;", "", "title", "", "viewUnderlier", "Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState$ViewUnderlier;", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState$ViewUnderlier;)V", "getTitle", "()Ljava/lang/CharSequence;", "getViewUnderlier", "()Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState$ViewUnderlier;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ViewUnderlier", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnToolbarState {
    public static final int $stable = 8;
    private final CharSequence title;
    private final ViewUnderlier viewUnderlier;

    public static /* synthetic */ OptionsSimulatedReturnToolbarState copy$default(OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState, CharSequence charSequence, ViewUnderlier viewUnderlier, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = optionsSimulatedReturnToolbarState.title;
        }
        if ((i & 2) != 0) {
            viewUnderlier = optionsSimulatedReturnToolbarState.viewUnderlier;
        }
        return optionsSimulatedReturnToolbarState.copy(charSequence, viewUnderlier);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ViewUnderlier getViewUnderlier() {
        return this.viewUnderlier;
    }

    public final OptionsSimulatedReturnToolbarState copy(CharSequence title, ViewUnderlier viewUnderlier) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OptionsSimulatedReturnToolbarState(title, viewUnderlier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnToolbarState)) {
            return false;
        }
        OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState = (OptionsSimulatedReturnToolbarState) other;
        return Intrinsics.areEqual(this.title, optionsSimulatedReturnToolbarState.title) && Intrinsics.areEqual(this.viewUnderlier, optionsSimulatedReturnToolbarState.viewUnderlier);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ViewUnderlier viewUnderlier = this.viewUnderlier;
        return iHashCode + (viewUnderlier == null ? 0 : viewUnderlier.hashCode());
    }

    public String toString() {
        CharSequence charSequence = this.title;
        return "OptionsSimulatedReturnToolbarState(title=" + ((Object) charSequence) + ", viewUnderlier=" + this.viewUnderlier + ")";
    }

    public OptionsSimulatedReturnToolbarState(CharSequence title, ViewUnderlier viewUnderlier) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.viewUnderlier = viewUnderlier;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final ViewUnderlier getViewUnderlier() {
        return this.viewUnderlier;
    }

    /* compiled from: OptionsSimulatedReturnToolbarState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState$ViewUnderlier;", "", "fixedAccountNumber", "", "symbol", "underlierInstrumentId", "Ljava/util/UUID;", "shouldHideForNormalDevices", "", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getFixedAccountNumber", "()Ljava/lang/String;", "getSymbol", "getUnderlierInstrumentId", "()Ljava/util/UUID;", "getShouldHideForNormalDevices", "()Z", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingFragmentKey", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "getUnderlyingFragmentKey", "()Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewUnderlier {
        public static final int $stable = 8;
        private final String fixedAccountNumber;
        private final boolean shouldHideForNormalDevices;
        private final String symbol;
        private final UUID underlierInstrumentId;
        private final OptionChain.UnderlyingType underlyingType;

        /* compiled from: OptionsSimulatedReturnToolbarState.kt */
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

        public static /* synthetic */ ViewUnderlier copy$default(ViewUnderlier viewUnderlier, String str, String str2, UUID uuid, boolean z, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewUnderlier.fixedAccountNumber;
            }
            if ((i & 2) != 0) {
                str2 = viewUnderlier.symbol;
            }
            if ((i & 4) != 0) {
                uuid = viewUnderlier.underlierInstrumentId;
            }
            if ((i & 8) != 0) {
                z = viewUnderlier.shouldHideForNormalDevices;
            }
            if ((i & 16) != 0) {
                underlyingType = viewUnderlier.underlyingType;
            }
            OptionChain.UnderlyingType underlyingType2 = underlyingType;
            UUID uuid2 = uuid;
            return viewUnderlier.copy(str, str2, uuid2, z, underlyingType2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFixedAccountNumber() {
            return this.fixedAccountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getUnderlierInstrumentId() {
            return this.underlierInstrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldHideForNormalDevices() {
            return this.shouldHideForNormalDevices;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final ViewUnderlier copy(String fixedAccountNumber, String symbol, UUID underlierInstrumentId, boolean shouldHideForNormalDevices, OptionChain.UnderlyingType underlyingType) {
            Intrinsics.checkNotNullParameter(fixedAccountNumber, "fixedAccountNumber");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(underlierInstrumentId, "underlierInstrumentId");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            return new ViewUnderlier(fixedAccountNumber, symbol, underlierInstrumentId, shouldHideForNormalDevices, underlyingType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewUnderlier)) {
                return false;
            }
            ViewUnderlier viewUnderlier = (ViewUnderlier) other;
            return Intrinsics.areEqual(this.fixedAccountNumber, viewUnderlier.fixedAccountNumber) && Intrinsics.areEqual(this.symbol, viewUnderlier.symbol) && Intrinsics.areEqual(this.underlierInstrumentId, viewUnderlier.underlierInstrumentId) && this.shouldHideForNormalDevices == viewUnderlier.shouldHideForNormalDevices && this.underlyingType == viewUnderlier.underlyingType;
        }

        public int hashCode() {
            return (((((((this.fixedAccountNumber.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.underlierInstrumentId.hashCode()) * 31) + Boolean.hashCode(this.shouldHideForNormalDevices)) * 31) + this.underlyingType.hashCode();
        }

        public String toString() {
            return "ViewUnderlier(fixedAccountNumber=" + this.fixedAccountNumber + ", symbol=" + this.symbol + ", underlierInstrumentId=" + this.underlierInstrumentId + ", shouldHideForNormalDevices=" + this.shouldHideForNormalDevices + ", underlyingType=" + this.underlyingType + ")";
        }

        public ViewUnderlier(String fixedAccountNumber, String symbol, UUID underlierInstrumentId, boolean z, OptionChain.UnderlyingType underlyingType) {
            Intrinsics.checkNotNullParameter(fixedAccountNumber, "fixedAccountNumber");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(underlierInstrumentId, "underlierInstrumentId");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            this.fixedAccountNumber = fixedAccountNumber;
            this.symbol = symbol;
            this.underlierInstrumentId = underlierInstrumentId;
            this.shouldHideForNormalDevices = z;
            this.underlyingType = underlyingType;
        }

        public final String getFixedAccountNumber() {
            return this.fixedAccountNumber;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final UUID getUnderlierInstrumentId() {
            return this.underlierInstrumentId;
        }

        public final boolean getShouldHideForNormalDevices() {
            return this.shouldHideForNormalDevices;
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final TabFragmentKey getUnderlyingFragmentKey() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.underlyingType.ordinal()];
            if (i == 1) {
                return new LegacyFragmentKey.EquityInstrumentDetail(this.underlierInstrumentId, null, this.fixedAccountNumber, InstrumentDetailSource.OPTIONS_SIMULATED_RETURNS, false, 18, null);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new IndexDetailPageFragmentKey(this.underlierInstrumentId, this.fixedAccountNumber, IndexDetailPageFragmentKey2.SimulatedReturn.INSTANCE);
        }
    }
}
