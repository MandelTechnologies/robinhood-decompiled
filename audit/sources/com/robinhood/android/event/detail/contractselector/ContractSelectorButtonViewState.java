package com.robinhood.android.event.detail.contractselector;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: ContractSelectorButton.kt */
@kotlin.Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bJ\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003JE\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u001cHÖ\u0001J\t\u00107\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0011\u0010)\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010+\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b,\u0010$¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "", "side", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;", "quoteText", "Lcom/robinhood/utils/resource/StringResource;", "positionState", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState;", "identifier", "", "shouldUseAchromaticTheme", "", "isTradeEnabled", "<init>", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState;Ljava/lang/String;ZZ)V", "getSide", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;", "getQuoteText", "()Lcom/robinhood/utils/resource/StringResource;", "getPositionState", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState;", "getIdentifier", "()Ljava/lang/String;", "getShouldUseAchromaticTheme", "()Z", "isEnabled", "getPositionLoggingInfo", "Lkotlin/Pair;", "", "", "quoteBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getQuoteBackgroundColor", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "quoteBorderColor", "getQuoteBorderColor", "(Landroidx/compose/runtime/Composer;I)J", "quoteTextColor", "getQuoteTextColor", "positionBorderColor", "getPositionBorderColor", "positionBackgroundColor", "getPositionBackgroundColor", "positionTextColor", "getPositionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "PositionState", "Metadata", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractSelectorButtonViewState {
    public static final int $stable = StringResource.$stable;
    private final String identifier;
    private final boolean isTradeEnabled;
    private final PositionState positionState;
    private final StringResource quoteText;
    private final boolean shouldUseAchromaticTheme;
    private final ContractSelectorButton2 side;

    /* compiled from: ContractSelectorButton.kt */
    @kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContractSelectorButton2.values().length];
            try {
                iArr[ContractSelectorButton2.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContractSelectorButton2.f4140NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ContractSelectorButtonViewState copy$default(ContractSelectorButtonViewState contractSelectorButtonViewState, ContractSelectorButton2 contractSelectorButton2, StringResource stringResource, PositionState positionState, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            contractSelectorButton2 = contractSelectorButtonViewState.side;
        }
        if ((i & 2) != 0) {
            stringResource = contractSelectorButtonViewState.quoteText;
        }
        if ((i & 4) != 0) {
            positionState = contractSelectorButtonViewState.positionState;
        }
        if ((i & 8) != 0) {
            str = contractSelectorButtonViewState.identifier;
        }
        if ((i & 16) != 0) {
            z = contractSelectorButtonViewState.shouldUseAchromaticTheme;
        }
        if ((i & 32) != 0) {
            z2 = contractSelectorButtonViewState.isTradeEnabled;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return contractSelectorButtonViewState.copy(contractSelectorButton2, stringResource, positionState, str, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractSelectorButton2 getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getQuoteText() {
        return this.quoteText;
    }

    /* renamed from: component3, reason: from getter */
    public final PositionState getPositionState() {
        return this.positionState;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldUseAchromaticTheme() {
        return this.shouldUseAchromaticTheme;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsTradeEnabled() {
        return this.isTradeEnabled;
    }

    public final ContractSelectorButtonViewState copy(ContractSelectorButton2 side, StringResource quoteText, PositionState positionState, String identifier, boolean shouldUseAchromaticTheme, boolean isTradeEnabled) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quoteText, "quoteText");
        Intrinsics.checkNotNullParameter(positionState, "positionState");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new ContractSelectorButtonViewState(side, quoteText, positionState, identifier, shouldUseAchromaticTheme, isTradeEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractSelectorButtonViewState)) {
            return false;
        }
        ContractSelectorButtonViewState contractSelectorButtonViewState = (ContractSelectorButtonViewState) other;
        return this.side == contractSelectorButtonViewState.side && Intrinsics.areEqual(this.quoteText, contractSelectorButtonViewState.quoteText) && Intrinsics.areEqual(this.positionState, contractSelectorButtonViewState.positionState) && Intrinsics.areEqual(this.identifier, contractSelectorButtonViewState.identifier) && this.shouldUseAchromaticTheme == contractSelectorButtonViewState.shouldUseAchromaticTheme && this.isTradeEnabled == contractSelectorButtonViewState.isTradeEnabled;
    }

    public int hashCode() {
        return (((((((((this.side.hashCode() * 31) + this.quoteText.hashCode()) * 31) + this.positionState.hashCode()) * 31) + this.identifier.hashCode()) * 31) + Boolean.hashCode(this.shouldUseAchromaticTheme)) * 31) + Boolean.hashCode(this.isTradeEnabled);
    }

    public String toString() {
        return "ContractSelectorButtonViewState(side=" + this.side + ", quoteText=" + this.quoteText + ", positionState=" + this.positionState + ", identifier=" + this.identifier + ", shouldUseAchromaticTheme=" + this.shouldUseAchromaticTheme + ", isTradeEnabled=" + this.isTradeEnabled + ")";
    }

    public ContractSelectorButtonViewState(ContractSelectorButton2 side, StringResource quoteText, PositionState positionState, String identifier, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quoteText, "quoteText");
        Intrinsics.checkNotNullParameter(positionState, "positionState");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.side = side;
        this.quoteText = quoteText;
        this.positionState = positionState;
        this.identifier = identifier;
        this.shouldUseAchromaticTheme = z;
        this.isTradeEnabled = z2;
    }

    public /* synthetic */ ContractSelectorButtonViewState(ContractSelectorButton2 contractSelectorButton2, StringResource stringResource, PositionState positionState, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contractSelectorButton2, stringResource, positionState, str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final ContractSelectorButton2 getSide() {
        return this.side;
    }

    public final StringResource getQuoteText() {
        return this.quoteText;
    }

    public final PositionState getPositionState() {
        return this.positionState;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final boolean getShouldUseAchromaticTheme() {
        return this.shouldUseAchromaticTheme;
    }

    public final boolean isTradeEnabled() {
        return this.isTradeEnabled;
    }

    public final boolean isEnabled() {
        if (!this.isTradeEnabled) {
            return false;
        }
        PositionState positionState = this.positionState;
        if (positionState instanceof PositionState.WithoutPosition) {
            return ((PositionState.WithoutPosition) positionState).getMetadata() != null;
        }
        if (positionState instanceof PositionState.WithPosition) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ContractSelectorButton.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState;", "", "<init>", "()V", "WithoutPosition", "WithPosition", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState$WithPosition;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState$WithoutPosition;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PositionState {
        public static final int $stable = 0;

        public /* synthetic */ PositionState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PositionState() {
        }

        /* compiled from: ContractSelectorButton.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState$WithoutPosition;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState;", "metadata", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "<init>", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;)V", "getMetadata", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WithoutPosition extends PositionState {
            public static final int $stable = 8;
            private final Metadata metadata;

            public static /* synthetic */ WithoutPosition copy$default(WithoutPosition withoutPosition, Metadata metadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    metadata = withoutPosition.metadata;
                }
                return withoutPosition.copy(metadata);
            }

            /* renamed from: component1, reason: from getter */
            public final Metadata getMetadata() {
                return this.metadata;
            }

            public final WithoutPosition copy(Metadata metadata) {
                return new WithoutPosition(metadata);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WithoutPosition) && Intrinsics.areEqual(this.metadata, ((WithoutPosition) other).metadata);
            }

            public int hashCode() {
                Metadata metadata = this.metadata;
                if (metadata == null) {
                    return 0;
                }
                return metadata.hashCode();
            }

            public String toString() {
                return "WithoutPosition(metadata=" + this.metadata + ")";
            }

            public final Metadata getMetadata() {
                return this.metadata;
            }

            public WithoutPosition(Metadata metadata) {
                super(null);
                this.metadata = metadata;
            }
        }

        /* compiled from: ContractSelectorButton.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState$WithPosition;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState;", "positionText", "Lcom/robinhood/utils/resource/StringResource;", "buyMoreText", "closeText", "buyMoreMetadata", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "closeMetadata", "signedQuantity", "", "averagePrice", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;Ljava/lang/Integer;Ljava/lang/Double;)V", "getPositionText", "()Lcom/robinhood/utils/resource/StringResource;", "getBuyMoreText", "getCloseText", "getBuyMoreMetadata", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "getCloseMetadata", "getSignedQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAveragePrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$PositionState$WithPosition;", "equals", "", "other", "", "hashCode", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WithPosition extends PositionState {
            public static final int $stable = 8;
            private final Double averagePrice;
            private final Metadata buyMoreMetadata;
            private final StringResource buyMoreText;
            private final Metadata closeMetadata;
            private final StringResource closeText;
            private final StringResource positionText;
            private final Integer signedQuantity;

            public static /* synthetic */ WithPosition copy$default(WithPosition withPosition, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Metadata metadata, Metadata metadata2, Integer num, Double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = withPosition.positionText;
                }
                if ((i & 2) != 0) {
                    stringResource2 = withPosition.buyMoreText;
                }
                if ((i & 4) != 0) {
                    stringResource3 = withPosition.closeText;
                }
                if ((i & 8) != 0) {
                    metadata = withPosition.buyMoreMetadata;
                }
                if ((i & 16) != 0) {
                    metadata2 = withPosition.closeMetadata;
                }
                if ((i & 32) != 0) {
                    num = withPosition.signedQuantity;
                }
                if ((i & 64) != 0) {
                    d = withPosition.averagePrice;
                }
                Integer num2 = num;
                Double d2 = d;
                Metadata metadata3 = metadata2;
                StringResource stringResource4 = stringResource3;
                return withPosition.copy(stringResource, stringResource2, stringResource4, metadata, metadata3, num2, d2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getPositionText() {
                return this.positionText;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getBuyMoreText() {
                return this.buyMoreText;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getCloseText() {
                return this.closeText;
            }

            /* renamed from: component4, reason: from getter */
            public final Metadata getBuyMoreMetadata() {
                return this.buyMoreMetadata;
            }

            /* renamed from: component5, reason: from getter */
            public final Metadata getCloseMetadata() {
                return this.closeMetadata;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getSignedQuantity() {
                return this.signedQuantity;
            }

            /* renamed from: component7, reason: from getter */
            public final Double getAveragePrice() {
                return this.averagePrice;
            }

            public final WithPosition copy(StringResource positionText, StringResource buyMoreText, StringResource closeText, Metadata buyMoreMetadata, Metadata closeMetadata, Integer signedQuantity, Double averagePrice) {
                Intrinsics.checkNotNullParameter(positionText, "positionText");
                Intrinsics.checkNotNullParameter(buyMoreText, "buyMoreText");
                Intrinsics.checkNotNullParameter(closeText, "closeText");
                Intrinsics.checkNotNullParameter(buyMoreMetadata, "buyMoreMetadata");
                return new WithPosition(positionText, buyMoreText, closeText, buyMoreMetadata, closeMetadata, signedQuantity, averagePrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithPosition)) {
                    return false;
                }
                WithPosition withPosition = (WithPosition) other;
                return Intrinsics.areEqual(this.positionText, withPosition.positionText) && Intrinsics.areEqual(this.buyMoreText, withPosition.buyMoreText) && Intrinsics.areEqual(this.closeText, withPosition.closeText) && Intrinsics.areEqual(this.buyMoreMetadata, withPosition.buyMoreMetadata) && Intrinsics.areEqual(this.closeMetadata, withPosition.closeMetadata) && Intrinsics.areEqual(this.signedQuantity, withPosition.signedQuantity) && Intrinsics.areEqual((Object) this.averagePrice, (Object) withPosition.averagePrice);
            }

            public int hashCode() {
                int iHashCode = ((((((this.positionText.hashCode() * 31) + this.buyMoreText.hashCode()) * 31) + this.closeText.hashCode()) * 31) + this.buyMoreMetadata.hashCode()) * 31;
                Metadata metadata = this.closeMetadata;
                int iHashCode2 = (iHashCode + (metadata == null ? 0 : metadata.hashCode())) * 31;
                Integer num = this.signedQuantity;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Double d = this.averagePrice;
                return iHashCode3 + (d != null ? d.hashCode() : 0);
            }

            public String toString() {
                return "WithPosition(positionText=" + this.positionText + ", buyMoreText=" + this.buyMoreText + ", closeText=" + this.closeText + ", buyMoreMetadata=" + this.buyMoreMetadata + ", closeMetadata=" + this.closeMetadata + ", signedQuantity=" + this.signedQuantity + ", averagePrice=" + this.averagePrice + ")";
            }

            public /* synthetic */ WithPosition(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Metadata metadata, Metadata metadata2, Integer num, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringResource, stringResource2, stringResource3, metadata, metadata2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : d);
            }

            public final StringResource getPositionText() {
                return this.positionText;
            }

            public final StringResource getBuyMoreText() {
                return this.buyMoreText;
            }

            public final StringResource getCloseText() {
                return this.closeText;
            }

            public final Metadata getBuyMoreMetadata() {
                return this.buyMoreMetadata;
            }

            public final Metadata getCloseMetadata() {
                return this.closeMetadata;
            }

            public final Integer getSignedQuantity() {
                return this.signedQuantity;
            }

            public final Double getAveragePrice() {
                return this.averagePrice;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithPosition(StringResource positionText, StringResource buyMoreText, StringResource closeText, Metadata buyMoreMetadata, Metadata metadata, Integer num, Double d) {
                super(null);
                Intrinsics.checkNotNullParameter(positionText, "positionText");
                Intrinsics.checkNotNullParameter(buyMoreText, "buyMoreText");
                Intrinsics.checkNotNullParameter(closeText, "closeText");
                Intrinsics.checkNotNullParameter(buyMoreMetadata, "buyMoreMetadata");
                this.positionText = positionText;
                this.buyMoreText = buyMoreText;
                this.closeText = closeText;
                this.buyMoreMetadata = buyMoreMetadata;
                this.closeMetadata = metadata;
                this.signedQuantity = num;
                this.averagePrice = d;
            }
        }
    }

    public final Tuples2<Integer, Double> getPositionLoggingInfo() {
        PositionState positionState = this.positionState;
        if (positionState instanceof PositionState.WithoutPosition) {
            return Tuples4.m3642to(0, Double.valueOf(0.0d));
        }
        if (!(positionState instanceof PositionState.WithPosition)) {
            throw new NoWhenBranchMatchedException();
        }
        Integer signedQuantity = ((PositionState.WithPosition) positionState).getSignedQuantity();
        Integer numValueOf = Integer.valueOf(signedQuantity != null ? signedQuantity.intValue() : 0);
        Double averagePrice = ((PositionState.WithPosition) this.positionState).getAveragePrice();
        return Tuples4.m3642to(numValueOf, Double.valueOf(averagePrice != null ? averagePrice.doubleValue() : 0.0d));
    }

    /* compiled from: ContractSelectorButton.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "", "contractId", "Ljava/util/UUID;", "orderSide", "Lrosetta/mainst/SideDto;", "positionEffect", "Lrosetta/mainst/PositionEffectDto;", "<init>", "(Ljava/util/UUID;Lrosetta/mainst/SideDto;Lrosetta/mainst/PositionEffectDto;)V", "getContractId", "()Ljava/util/UUID;", "getOrderSide", "()Lrosetta/mainst/SideDto;", "getPositionEffect", "()Lrosetta/mainst/PositionEffectDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 8;
        private final UUID contractId;
        private final SideDto orderSide;
        private final PositionEffectDto positionEffect;

        public static /* synthetic */ Metadata copy$default(Metadata metadata, UUID uuid, SideDto sideDto, PositionEffectDto positionEffectDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = metadata.contractId;
            }
            if ((i & 2) != 0) {
                sideDto = metadata.orderSide;
            }
            if ((i & 4) != 0) {
                positionEffectDto = metadata.positionEffect;
            }
            return metadata.copy(uuid, sideDto, positionEffectDto);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final SideDto getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component3, reason: from getter */
        public final PositionEffectDto getPositionEffect() {
            return this.positionEffect;
        }

        public final Metadata copy(UUID contractId, SideDto orderSide, PositionEffectDto positionEffect) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            return new Metadata(contractId, orderSide, positionEffect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.contractId, metadata.contractId) && this.orderSide == metadata.orderSide && this.positionEffect == metadata.positionEffect;
        }

        public int hashCode() {
            return (((this.contractId.hashCode() * 31) + this.orderSide.hashCode()) * 31) + this.positionEffect.hashCode();
        }

        public String toString() {
            return "Metadata(contractId=" + this.contractId + ", orderSide=" + this.orderSide + ", positionEffect=" + this.positionEffect + ")";
        }

        public Metadata(UUID contractId, SideDto orderSide, PositionEffectDto positionEffect) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            this.contractId = contractId;
            this.orderSide = orderSide;
            this.positionEffect = positionEffect;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final SideDto getOrderSide() {
            return this.orderSide;
        }

        public final PositionEffectDto getPositionEffect() {
            return this.positionEffect;
        }
    }

    @JvmName
    public final Color getQuoteBackgroundColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1792575950, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState.<get-quoteBackgroundColor> (ContractSelectorButton.kt:85)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-993110151);
            if (!isEnabled() && this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(-993055529);
                long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
                composer.endReplaceGroup();
                colorM6701boximpl = Color.m6701boximpl(jM21373getBg30d7_KjU);
            } else if (this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(-992959336);
                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
                colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
            } else {
                composer.startReplaceGroup(-992894360);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(383604404);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-992781272);
            colorM6701boximpl = this.shouldUseAchromaticTheme ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU()) : null;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorM6701boximpl;
    }

    @JvmName
    public final long getQuoteBorderColor(Composer composer, int i) {
        long jM6705copywmQWz5c$default;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1942210574, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState.<get-quoteBorderColor> (ContractSelectorButton.kt:107)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1404078544);
            if (!isEnabled() && this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(-1404025193);
                jM6705copywmQWz5c$default = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
                composer.endReplaceGroup();
            } else if (this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(-1403929000);
                jM6705copywmQWz5c$default = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1403862753);
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-1846409914);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1403708993);
            if (this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(-1403666120);
                jM6705copywmQWz5c$default = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1403599873);
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM6705copywmQWz5c$default;
    }

    @JvmName
    public final long getQuoteTextColor(Composer composer, int i) {
        long jM21456getPositive0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-814847058, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState.<get-quoteTextColor> (ContractSelectorButton.kt:129)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(46571218);
            if (this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(46614680);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(46680338);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-1383972783);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(46815250);
            if (this.shouldUseAchromaticTheme) {
                composer.startReplaceGroup(46858712);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(46924370);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21456getPositive0d7_KjU;
    }

    @JvmName
    public final Color getPositionBorderColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-324833026, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState.<get-positionBorderColor> (ContractSelectorButton.kt:149)");
        }
        Color colorM6701boximpl = this.shouldUseAchromaticTheme ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorM6701boximpl;
    }

    @JvmName
    public final long getPositionBackgroundColor(Composer composer, int i) {
        long jM21456getPositive0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1052459518, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState.<get-positionBackgroundColor> (ContractSelectorButton.kt:157)");
        }
        if (this.shouldUseAchromaticTheme) {
            composer.startReplaceGroup(-560160204);
            jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-560105334);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-2096274870);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else {
                if (i2 != 2) {
                    composer.startReplaceGroup(-2096277472);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2096272278);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21456getPositive0d7_KjU;
    }

    @JvmName
    public final long getPositionTextColor(Composer composer, int i) {
        long jM21371getBg0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1994446656, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState.<get-positionTextColor> (ContractSelectorButton.kt:168)");
        }
        if (this.shouldUseAchromaticTheme) {
            composer.startReplaceGroup(-17164234);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-17114634);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21371getBg0d7_KjU;
    }
}
